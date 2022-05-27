package images;

public class Circle extends BaseImage { //creating image with circle inside
	private int radius;
	private int centerX;
	private int centerY;
	private RGB center;
	private RGB outside;

	public Circle(int width, int height, int centerX, int centerY, int radius, RGB center, RGB outside) {
		super(width,height);
		this.radius = radius;
		this.centerX = centerX;
		this.centerY = centerY;
		this.center = center;
		this.outside = outside;

	}

	public Circle(int size, int radius, RGB center, RGB outside) { //constructor with the same sizes
		super(size,size);
		this.radius = radius;
		this.centerX = width / 2;
		this.centerY = height / 2;
		this.center = center;
		this.outside = outside;
	}

	public RGB get(int x, int y) {
		double ratio;
		if (x == centerX && y == centerY)
			return center;

		if (x >= centerX - radius && x <= centerX + radius && y >= centerY - radius && y <= centerY + radius) {

			ratio = Math.sqrt(Math.pow(x - centerX, 2) + Math.pow(y - centerY, 2)) / radius; //for distance
			if(ratio>1)
				return outside;
			return RGB.mix(outside, center, ratio);
		}
		return outside;
	}

}
