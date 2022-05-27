package images;

import java.lang.String;

public class RGB { // Class for creating color
	private double[] color;
	public static final RGB BLACK = new RGB(0); // finals colors
	public static final RGB WHITE = new RGB(1);
	public static final RGB RED = new RGB(1, 0, 0);
	public static final RGB GREEN = new RGB(0, 1, 0);
	public static final RGB BLUE = new RGB(0, 0, 1);

	public RGB(double red, double green, double blue) { // for creating color with different coloring
		color = new double[3];
		color[0] = red;
		color[1] = green;
		color[2] = blue;
	}

	public RGB(double grey) {// for creating color with the same coloring
		color = new double[3];
		color[0] = grey;
		color[1] = grey;
		color[2] = grey;
	}

	public double getRed() {
		return color[0];
	}

	public double getBlue() {
		return color[2];
	}

	public double getGreen() {
		return color[1];
	}

	public RGB invert() { // return reverse color
		RGB rgb = new RGB((1 - getRed()), (1 - getGreen()), (1 - getBlue()));
		return rgb;
	}

	public RGB filter(RGB filter) {// every base color duplicate the value of filter coloring
		RGB rgb = new RGB((filter.getRed() * this.getRed()), (filter.getGreen() * this.getGreen()),
				(filter.getBlue() * this.getBlue()));
		return rgb;
	}

	public static RGB superpose(RGB rgb1, RGB rgb2) { //sum of rgb1 and rgb2 , maximum 1
		RGB rgb;
		double r, b, g;
		if ((r = rgb1.color[0] + rgb2.color[0]) > 1)
			r = 1;
		if ((g = rgb1.color[1] + rgb2.color[1]) > 1)
			g = 1;
		if ((b = rgb1.color[2] + rgb2.color[2]) > 1)
			b = 1;
		rgb = new RGB(r, g, b);
		return rgb;
	}

	public static RGB mix(RGB rgb1, RGB rgb2, double alpha) { //return avg of two colors
		RGB rgb = new RGB((alpha * rgb1.color[0] + (1 - alpha) * rgb2.color[0]),
				(alpha * rgb1.color[1] + (1 - alpha) * rgb2.color[1]),
				(alpha * rgb1.color[2] + (1 - alpha) * rgb2.color[2]));
		return rgb;
	}

	public String toString() { //string for this color by string format
		String s = String.format("<%.4f, %.4f, %.4f>", this.color[0], this.color[1], this.color[2]);
		return s;
	}

}
