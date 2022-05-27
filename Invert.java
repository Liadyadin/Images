package images;

public class Invert extends ImageDecorator {//extends ImageDecorator

	private Image base;

	public Invert(Image base) {//constructor for reverse coloring
		super();
		this.base = base;
		this.height = base.getHeight();
		this.width = base.getWidth();
	}

	public RGB get(int x, int y) {
		return (base.get(x, y)).invert();
	}

}
