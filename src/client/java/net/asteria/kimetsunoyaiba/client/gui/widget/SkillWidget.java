package net.asteria.kimetsunoyaiba.client.gui.widget;

import net.asteria.kimetsunoyaiba.KimetsunoyaibaMod;
import net.asteria.kimetsunoyaiba.api.breathing.Breathing;
import net.asteria.kimetsunoyaiba.client.util.TextureUtility;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.narration.NarrationMessageBuilder;
import net.minecraft.client.gui.widget.ClickableWidget;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.ArrayList;

public class SkillWidget extends ClickableWidget {
    private final ArrayList<Runnable> runnables = new ArrayList<Runnable>();
    private Breathing.Skill skill;

    public SkillWidget(int x, int y, int width, int height,
                       Breathing.Skill skill) {
        super(x, y, width, height, skill.getVisibleName());
        this.skill = skill;

    }

    @Override
    protected void renderWidget(DrawContext context, int mouseX, int mouseY, float delta) {
        context.drawText(MinecraftClient.getInstance().textRenderer,
                this.getMessage(), this.getX(), this.getY(), 3, false);

        ArrayList<Integer> size = TextureUtility.getTextureSize(new Identifier(KimetsunoyaibaMod.MODID, skill.getIconTextureRL()));
        context.drawTexture(new Identifier(KimetsunoyaibaMod.MODID, skill.getIconTextureRL()),
                width, height,
                0,0,size.get(0)/2, size.get(1)/2
        );


        for (Runnable runnable : runnables) runnable.run();
    }

    public Breathing.Skill getSkill() { return skill; }

    public void executeWhenRendered(Runnable runnable) {
        runnables.add(runnable);
    }

    @Override
    protected void appendClickableNarrations(NarrationMessageBuilder builder) {

    }
}
