package images;

public class TwoColorImage extends BaseImage { //extends BaseImage
	private RGB zero;
	private RGB one;
	private TwoDFunc func;

	public TwoColorImage(int width, int height, RGB zero, RGB one, TwoDFunc func) {
		super(width,height);
		this.zero = zero;
		this.one = one;
		this.func = func;
	}

	public RGB get(int x, int y) { //abstract method- we must implements
		double ret;
		ret = func.f((double) x / this.getWidth(), (double) y / getHeight()); //calling f method
		if(ret<=0)
			return zero;
		else if(ret>=1)
			return one;
		else return RGB.mix(one, zero, ret);
	}
}
