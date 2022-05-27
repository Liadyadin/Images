package images;

public class Filter extends ImageDecorator { //extends ImageDecorator
	private RGB filter;
	private Image base;

	public Filter(Image base, RGB filter) { //constructor filter
		super();
		this.filter = filter;
		this.base = base;
		this.height = base.getHeight();
		this.width = base.getWidth();
	}

	public RGB get(int x, int y) {
		return (base.get(x, y)).filter(filter);
	}

}
