package images;

public interface Image { //interface Image
	public int getWidth();
	public int getHeight();
	public abstract RGB get(int x, int y); //abstract method
}
