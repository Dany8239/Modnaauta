// Made with Blockbench 3.9.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelcustom_model extends EntityModel<Entity> {
	private final ModelRenderer bone;

	public Modelcustom_model() {
		textureWidth = 16;
		textureHeight = 16;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone.setTextureOffset(0, -39).addBox(-1.0F, -24.0F, -30.0F, 51.0F, 24.0F, 31.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(42.0F, -8.0F, -36.0F, 8.0F, 8.0F, 6.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(41.0F, -8.0F, 0.0F, 8.0F, 8.0F, 6.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(-70, -30).addBox(-1.0F, -24.0F, -52.0F, 21.0F, 24.0F, 22.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(-1.0F, -24.0F, 1.0F, 20.0F, 24.0F, 23.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(-1.0F, -47.0F, 0.0F, 49.0F, 25.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(-2.0F, -48.0F, -31.0F, 52.0F, 25.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(0.0F, -47.0F, -30.0F, 1.0F, 23.0F, 30.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(-1.0F, -6.0F, -20.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(50.0F, -46.0F, -29.0F, 1.0F, 21.0F, 29.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		bone.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
	}
}