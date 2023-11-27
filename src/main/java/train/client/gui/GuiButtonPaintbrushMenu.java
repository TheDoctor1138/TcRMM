package train.client.gui;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import train.common.library.Info;

/**
 * @author 02skaplan
 * <p>Class for buttons used for buttons in paintbrush menu.</p>
 */
@SideOnly(Side.CLIENT)
class GuiButtonPaintbrushMenu extends GuiButton {
    enum Type {
        SELECTIONBOX,
        ARROWLEFT,
        ARROWRIGHT,
        CLOSE,
        PLAY,
        PAUSE,
        STOPRENDER,
        RANDOM,
        APPLY
    }
    enum Texture {
        ACTIVE,
        INACTIVE
    }
    /**
     * if the button has to be drawn drawButton is more than just draw, it makes the button exists or not too
     */
    public boolean showButton;
    private Type type;
    /**
     * Starting x-value on texture.
     */
    private int u;
    /**
     * Starting y-value on texture.
     */
    private int v = 0;
    private int TEXTURE_WIDTH;
    private int TEXTURE_HEIGHT;
    private Texture texture;

    public GuiButtonPaintbrushMenu(int buttonID, int x, int y, int xSize, int ySize, Type type) {
        super(buttonID, x, y, xSize, ySize, "");
        this.setType(type, Texture.INACTIVE);
    }

    /**
     * Draws this button to the screen.
     */
    @Override
    public void drawButton(Minecraft mc, int par2, int par3) {
        if (this.visible && showButton) {
            if (type != Type.SELECTIONBOX) {
                if (par2 >= this.xPosition && par3 >= this.yPosition && par2 < this.xPosition + this.width && par3 < this.yPosition + this.height) { // If mouse is hovering over...
                    this.setType(this.type, Texture.ACTIVE);
                    GuiPaintbrushMenu.setActiveButtonID(this.id);
                } else {
                    this.setType(this.type, Texture.INACTIVE);
                    if (GuiPaintbrushMenu.getActiveButtonID() != null && GuiPaintbrushMenu.getActiveButtonID() == this.id) {
                        GuiPaintbrushMenu.setActiveButtonID(null);
                    }
                }
            }
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            RenderHelper.enableGUIStandardItemLighting();
            GL11.glPushMatrix();
            mc.renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation, Info.guiPrefix + "gui_paintbrush_menu_buttons.png"));
            this.drawTexturedModalRect(this.xPosition, this.yPosition, u, v, TEXTURE_WIDTH, TEXTURE_HEIGHT);
            RenderHelper.disableStandardItemLighting();
            GL11.glPopMatrix();
        }
    }
    public void setType(Type type, Texture texture) {
        if (type != this.type || texture != this.texture) {
            this.type = type;
            this.texture = texture;
            switch (type) {
                case SELECTIONBOX:
                    TEXTURE_WIDTH = 85;
                    TEXTURE_HEIGHT = 85;
                    if (texture == Texture.ACTIVE) {
                        this.u = 85;
                    } else {
                        this.u = 0;
                    }
                    break;
                case ARROWLEFT:
                case ARROWRIGHT:
                    if (type == Type.ARROWLEFT)
                        this.u = 170;
                    else
                        this.u = 208;
                    TEXTURE_WIDTH = 38;
                    TEXTURE_HEIGHT = 12;
                    if (texture == Texture.ACTIVE) {
                        this.v = 12;
                    } else {
                        this.v = 0;
                    }
                    break;
                case CLOSE:
                case PLAY:
                case PAUSE:
                case STOPRENDER:
                case RANDOM:
                case APPLY:
                    TEXTURE_WIDTH = 22;
                    TEXTURE_HEIGHT = 22;
                    if (texture == Texture.INACTIVE)
                        this.v = 85;
                    else
                        this.v = 107;
                    if (type == Type.CLOSE)
                        this.u = 0;
                    else if (type == Type.PLAY)
                        this.u = 22;
                    else if (type == Type.PAUSE)
                        this.u = 44;
                    else if (type == Type.STOPRENDER)
                        this.u = 66;
                    else if (type == Type.RANDOM)
                        this.u = 88;
                    else
                        this.u = 110;
                    break;
            }
        }
    }
    public Texture getTexture() { return this.texture; }
}