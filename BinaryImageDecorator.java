package images;

public abstract class BinaryImageDecorator implements Image { // abstract class
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

	protected int maxWidth(Image base1, Image base2) { // gets two images and return width maximum
		return Math.max(base1.getWidth(), base2.getWidth());
	}

	protected int maxheight(Image base1, Image base2) {// gets two images and return height maximum
		return Math.max(base1.getHeight(), base2.getHeight());
	}

	protected int minWidth(Image base1, Image base2) {// gets two images and return width minimum
		return Math.min(base1.getWidth(), base2.getWidth());

	}

	protected int minHeight(Image base1, Image base2) {// gets two images and return height minimum
		return Math.min(base1.getHeight(), base2.getHeight());

	}
}
