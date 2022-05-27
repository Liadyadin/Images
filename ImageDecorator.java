package images;

public abstract class ImageDecorator implements Image { //abstract class implements Image class
	protected int width;
	protected int height;
	
	@Override
	public int getWidth() {
		return width;
	}

	@Override
	public int getHeight() {
		return height;
	}

	@Override
	public abstract RGB get(int x, int y);

}
