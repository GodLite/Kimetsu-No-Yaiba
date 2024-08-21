package net.asteria.kimetsunoyaiba.client.util;

import com.mojang.blaze3d.platform.GlStateManager;
import net.asteria.kimetsunoyaiba.KimetsunoyaibaMod;
import net.minecraft.client.MinecraftClient;
import net.minecraft.util.Identifier;
import org.lwjgl.opengl.GL11;

import java.util.ArrayList;

public class TextureUtility {
    public static final Identifier BLACK_PENCIL = new Identifier(KimetsunoyaibaMod.MODID, "textures/gui/black_pencil.png");

    public static ArrayList<Integer> getTextureSize(Identifier textureRL) {
        MinecraftClient.getInstance().getTextureManager().bindTexture(textureRL);
        ArrayList<Integer> size = new ArrayList<Integer>();
        size.add(0, GlStateManager._getTexLevelParameter(GL11.GL_TEXTURE_2D,
                0, GL11.GL_TEXTURE_WIDTH));
        size.add(0, GlStateManager._getTexLevelParameter(GL11.GL_TEXTURE_2D, 0, GL11.GL_TEXTURE_HEIGHT));

        return size;
    }
}
