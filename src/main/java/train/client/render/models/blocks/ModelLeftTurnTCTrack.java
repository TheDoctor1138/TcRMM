package train.client.render.models.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;
import org.lwjgl.opengl.GL11;
import train.common.library.Info;
import train.common.tile.TileTCRail;

@SideOnly(Side.CLIENT)
public class ModelLeftTurnTCTrack extends ModelBase {

	private IModelCustom model1XLeftTurn;
	private IModelCustom modelMediumLeftTurn;
	private IModelCustom modelLargeLeftTurn;
	private IModelCustom modelVeryLargeLeftTurn;
	private IModelCustom modelSuperLargeLeftTurn;
	private IModelCustom model29XLeftTurn;
	private IModelCustom model32XLeftTurn;

	public ModelLeftTurnTCTrack() {
		model1XLeftTurn = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track_curve_1x.obj"));
		modelMediumLeftTurn = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track_curve_medium.obj"));
		modelLargeLeftTurn = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track_curve_big.obj"));
		modelVeryLargeLeftTurn = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track_curve_very_big.obj"));
		modelSuperLargeLeftTurn = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track_curve_super_big.obj"));
		model29XLeftTurn = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track_curve_29x.obj"));
		model32XLeftTurn = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track_curve_32x.obj"));
	}

	public void render1X() {model1XLeftTurn.renderAll();}
	public void renderMedium() {
		modelMediumLeftTurn.renderAll();
	}
	public void renderLarge() {
		modelLargeLeftTurn.renderAll();
	}
	public void renderVeryLarge() {
		modelVeryLargeLeftTurn.renderAll();
	}
	public void renderSuperLarge() { modelSuperLargeLeftTurn.renderAll();}

	public void render29X() {model29XLeftTurn.renderAll();}
	public void render32X() {model32XLeftTurn.renderAll();}

	public void render(String type, TileTCRail tcRail, double x, double y, double z) {
		render( type, tcRail.getWorldObj().getBlockMetadata(tcRail.xCoord, tcRail.yCoord, tcRail.zCoord), x, y, z, 1, 1, 1, 1);
	}

	public void render(String type, int facing, double x, double y, double z, float r, float g, float b, float a) {
		// Bind the texture, so that OpenGL properly textures our block.
		if (type.contains("embedded"))
			fexcraft.tmt.slim.Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "track_embedded.png"));
		else fexcraft.tmt.slim.Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "track_normal.png"));
		// Push a blank matrix onto the stack
		GL11.glPushMatrix();

		// Move the object into the correct position on the block (because the OBJ's origin is the center of the object)
		GL11.glTranslatef((float) x + 1.5f, (float) y, (float) z + 5.5f);

		GL11.glColor4f(r, g, b, a);
		//GL11.glScalef(0.5f, 0.5f, 0.5f);

		if (facing == 3) {
			GL11.glRotatef(-90, 0, 1, 0);
			if(type.equals("very_large") || type.equals("embedded_very_large"))
				GL11.glTranslatef(-5.5f, 0.0f, 1.5f);
			if(type.equals("large") || type.equals("embedded_large"))
				GL11.glTranslatef(-10.0f, 0.0f, 2.0f);
			if(type.equals("medium") || type.equals("embedded_medium"))
				GL11.glTranslatef(-5.5f, 0.0f, 1.5f);
			if(type.equals("super_large") || type.equals("embedded_super_large"))
				GL11.glTranslatef(-5.5f,0f,1.5f);
			if (type.equals("1x") || type.equals("embedded_1x"))
				GL11.glTranslatef(-5.5f,0,1.5f);
			if (type.equals("29x") || type.equals("embedded_29x"))
				GL11.glTranslatef(-5.5f,0,1.5f);
			if (type.equals("32x") || type.equals("embedded_32x"))
				GL11.glTranslatef(-5.5f,0,1.5f);
		}
		if (facing == 1) {
			GL11.glRotatef(90, 0, 1, 0);
			if(type.equals("very_large") || type.equals("embedded_very_large"))
				GL11.glTranslatef(4.5f, 0.0f, -0.5f);
			if(type.equals("large") || type.equals("embedded_large"))
				GL11.glTranslatef(0.0f, 0.0f, 0.0f);
			if(type.equals("medium") || type.equals("embedded_medium"))
				GL11.glTranslatef(4.50f, 0.0f, -0.5f);
			if(type.equals("super_large") || type.equals("embedded_super_large"))
				GL11.glTranslatef(4.5f,0f,-0.5f);
			if (type.equals("1x") || type.equals("embedded_1x"))
				GL11.glTranslatef(4.5f,0,-0.5f);
			if (type.equals("29x") || type.equals("embedded_29x"))
				GL11.glTranslatef(4.5f,0,-0.5f);
			if (type.equals("32x") || type.equals("embedded_32x"))
				GL11.glTranslatef(4.5f,0,-0.5f);
		}
		if(facing == 2){
			if(type.equals("very_large") || type.equals("embedded_very_large"))
				GL11.glTranslatef(-1.5f, 0.0f, -4.5f);
			if(type.equals("large") || type.equals("embedded_large"))
				GL11.glTranslatef(-6.0f, 0.0f, -4.0f);
			if(type.equals("medium") || type.equals("embedded_medium"))
				GL11.glTranslatef(-1.5f, 0.0f, -4.50f);
			if(type.equals("super_large") || type.equals("embedded_super_large"))
				GL11.glTranslatef(-1.5f,0f,-4.5f);
			if (type.equals("1x") || type.equals("embedded_1x"))
				GL11.glTranslatef(-1.5f,0,-4.5f);
			if (type.equals("29x") || type.equals("embedded_29x"))
				GL11.glTranslatef(-1.5f,0,-4.5f);
			if (type.equals("32x") || type.equals("embedded_32x"))
				GL11.glTranslatef(-1.5f,0,-4.5f);
		}
		if(facing == 0){
			GL11.glRotatef(180, 0, 1, 0);
			if(type.equals("very_large") || type.equals("embedded_very_large"))
				GL11.glTranslatef(0.5f, 0.0f, 5.5f);
			if(type.equals("large") || type.equals("embedded_large"))
				GL11.glTranslatef(-4.0f, 0.0f, 6.0f);
			if(type.equals("medium") || type.equals("embedded_medium"))
				GL11.glTranslatef(0.5f, 0.0f, 5.5f);
			if(type.equals("super_large") || type.equals("embedded_super_large"))
				GL11.glTranslatef(0.5f,0f,5.5f);
			if (type.equals("1x") || type.equals("embedded_1x"))
				GL11.glTranslatef(0.5f,0,5.5f);
			if (type.equals("29x") || type.equals("embedded_29x"))
				GL11.glTranslatef(0.5f,0,5.5f);
			if (type.equals("32x") || type.equals("embedded_32x"))
				GL11.glTranslatef(0.5f,0,5.5f);
		}
		if(type.equals("1x") || type.equals("embedded_1x"))this.render1X();
		if(type.equals("medium") || type.equals("embedded_medium") )this.renderMedium();
		if(type.equals("large") || type.equals("embedded_large"))this.renderLarge();
		if(type.equals("very_large") || type.equals("embedded_very_large"))this.renderVeryLarge();
		if(type.equals("super_large") || type.equals("embedded_super_large"))this.renderSuperLarge();
		if(type.equals("29x") || type.equals("embedded_29x"))this.render29X();
		if(type.equals("32x") || type.equals("embedded_32x"))this.render32X();



		// Pop this matrix from the stack.
		GL11.glPopMatrix();
	}

}
