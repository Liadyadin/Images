package images;

public class Mix extends BinaryImageDecorator {//extends
	private Image base1, base2;
	private double alpha;


	public Mix(Image base1, Image base2, double alpha) {
		super();
		this.alpha = alpha;
		this.base1 = base1;
		this.base2 = base2;
		this.height = maxheight(base1, base2);// using maxheight method for finding maximum height
		this.width = maxWidth(base1, base2);// using maxwidth method for finding maximum width
	}

	public RGB get(int x, int y) {
		if (minWidth(base1, base2) >= x && minHeight(base1, base2) >= y)// in case the images overlapping
			return RGB.mix(base1.get(x, y), base2.get(x, y), alpha);
		else if (minWidth(base1, base2) <= x && minHeight(base1, base2) >= y) {// in case the point inside one of them
			if (minWidth(base1, base2) == base1.getWidth())
				return base2.get(x, y);
			else
				return base1.get(x, y);
		} else if (minWidth(base1, base2) >= x && minHeight(base1, base2) <= y) {// in case the point inside one of them
			if (minHeight(base1, base2) == base2.getHeight())
				return base1.get(x, y);
			else
				return base2.get(x, y);
		} else if (minWidth(base1, base2) <= x && minHeight(base1, base2) <= y) {// in case one of the image contained
			// the other image
			if (x <= base1.getWidth() && y <= base1.getHeight())
				return base1.get(x, y);
			else if (x <= base2.getWidth() && y <= base2.getHeight())
				return base2.get(x, y);
		}
		return RGB.BLACK;// else - in case the images is not in the point
	}
}
