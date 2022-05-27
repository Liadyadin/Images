package images;

public class Transpose extends ImageDecorator {//extends ImageDecorator

	private Image base;

	public Transpose(Image base) {
		super();
		this.base = base;
		this.height = base.getWidth(); //height get the size of width
		this.width = base.getHeight();//width get the size of height
	}

	public RGB get(int x, int y) {
		return (base.get(y, x));
	}

}
