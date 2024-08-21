package net.asteria.kimetsunoyaiba.client.gui.screen;

import com.mojang.blaze3d.systems.RenderSystem;
import net.asteria.kimetsunoyaiba.KimetsunoyaibaMod;
import net.asteria.kimetsunoyaiba.api.ModSkillNetworkStates;
import net.asteria.kimetsunoyaiba.api.breathing.Breathing;
import net.asteria.kimetsunoyaiba.api.breathing.BreathingManager;
import net.asteria.kimetsunoyaiba.client.KimetsunoyaibaClient;
import net.asteria.kimetsunoyaiba.client.gui.widget.SkillWidget;
import net.asteria.kimetsunoyaiba.client.network.ModClientNetworking;
import net.asteria.kimetsunoyaiba.client.util.TextureUtility;
import net.asteria.kimetsunoyaiba.network.packet.ModGuiPacket;
import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.Mouse;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.toast.SystemToast;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.joml.Matrix4f;
import org.joml.Vector2d;
import org.joml.Vector3f;
import org.lwjgl.opengl.GL11;

import java.util.ArrayList;

public class SkillSelectionScreen extends Screen {


    public SkillSelectionScreen() {
        super(Text.translatable("gui.kimetsunoyaiba.skill_selection"));
    }

    public String getName() {
        return "skill_selection";
    }

    private ArrayList<Vector2d> getVectors() {
        ArrayList<Vector2d> vectors = new ArrayList<Vector2d>();
        int x = MinecraftClient.getInstance().getWindow().getScaledWidth()/2;
        int y = MinecraftClient.getInstance().getWindow().getScaledHeight() / 2 - MinecraftClient.getInstance().getWindow().getScaledHeight()/4;
        vectors.add(new Vector2d(x, y));
        vectors.add(new Vector2d(x*2, 0));
        vectors.add(new Vector2d(x*3, -y));
        vectors.add(new Vector2d(x*2, -y - y));
        vectors.add(new Vector2d(x, -y - y - y));
        vectors.add(new Vector2d(x-x*2, 0));
        vectors.add(new Vector2d(x-x*3, -y));
        vectors.add(new Vector2d(x-x*2, -y - y));

        return vectors;
    }

    @Override
    protected void init() {
        Breathing breathing = BreathingManager.getBreathing(BreathingManager.getPlayerBreathing((PlayerEntity) MinecraftClient.getInstance().player));

        ArrayList<Vector2d> vectors = getVectors();

        for (int i = 0; i < breathing.getSkillsCount(); i++) {
            Breathing.Skill skill = breathing.getSkill(i);

            SkillWidget skillWidget = new SkillWidget((int) Math.round(vectors.get(i).x),(int) Math.round(vectors.get(i).y),120,20,
                    skill);

            this.addDrawableChild(skillWidget);
        }

    }

    @Override
    public boolean mouseReleased(double mouseX, double mouseY, int button) {
        this.close();
        this.setDragging(false);
        return this.hoveredElement(mouseX, mouseY).filter((element) -> {
            if (element instanceof SkillWidget) {
                PacketByteBuf buf = PacketByteBufs.create();
                buf.writeString(ModSkillNetworkStates.USE_SKILL);

                Breathing.Skill skill = ((SkillWidget) element).getSkill();
                buf.writeString(skill.getName());

                ModClientNetworking.send(new ModGuiPacket(buf));
            };
            return element.mouseReleased(mouseX, mouseY, button);
        }).isPresent();

    }

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        super.render(context, mouseX, mouseY, delta);

        int height = MinecraftClient.getInstance().getWindow().getScaledHeight();
        int width = MinecraftClient.getInstance().getWindow().getScaledWidth();

        ArrayList<Integer> sizeBlackPencil = TextureUtility.getTextureSize(TextureUtility.BLACK_PENCIL);

        context.drawTexture(TextureUtility.BLACK_PENCIL,
                width / 2 - sizeBlackPencil.get(0) / 4, height / 2 - sizeBlackPencil.get(1) / 4,
        0,0,sizeBlackPencil.get(0)/2,sizeBlackPencil.get(1)/2
        );


    }
}
