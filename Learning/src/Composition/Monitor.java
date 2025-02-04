package Composition;

public class Monitor extends Product {
	private int size;
	private String resolution;
	
	public Monitor(String model, String manufacturer, int size, String resolution) {
		super(model, manufacturer);
		this.size = size;
		this.resolution = resolution;
	}

	public Monitor(String model, String manufacturer) {
		super(model, manufacturer);
		// TODO Auto-generated constructor stub
	}

	public void drawPixelAt(int x, int y, String color) {
		System.out.printf("Drawing the pixels in %d and %d with the color of %s",x,y,color);
	}
}
