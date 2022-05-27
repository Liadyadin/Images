package images;

public abstract class BaseImage implements Image { // implements Image
	protected int width;
	protected int height;

	public BaseImage(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public int getWidth() {
		return width;
	}

	@Override
	public int getHeight() {
		return height;
	}

	@Override
	public abstract RGB get(int x, int y); // implements will be in the sub-classes
}
