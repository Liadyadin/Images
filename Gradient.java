package images;

public class Gradient extends BaseImage { //creating image order by column x
	private RGB rgbstart;
	private RGB rgbend;

	public Gradient(int width, int height, RGB start, RGB end) {
		super(width,height);
		rgbstart= start;
		rgbend = end;
	}

	public RGB get(int x, int y) { 
		double ratio;
		ratio = ((double) x / getWidth());
		return RGB.mix(rgbend, rgbstart, ratio);
	}

}
