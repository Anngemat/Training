package LearningTim;

public class ComplexNumber {

	private double imaginary;
	private double real;
	public ComplexNumber(double imaginary, double real) {
		super();
		this.imaginary = imaginary;
		this.real = real;
	}
	public double getImaginary() {
		return imaginary;
	}
	public double getReal() {
		return real;
	}
	public void add(double imaginary,double real) {
		this.imaginary += imaginary;
		this.real += real;
	}
	public void add(ComplexNumber a) {
		this.imaginary += a.imaginary;
		this.real += a.real;
		add(a.imaginary, a.real);
	}
	public void substract(double imaginary,double real) {
		this.imaginary -= imaginary;
		this.real -= real;
	}
	public void substract(ComplexNumber a) {
		this.imaginary -= a.imaginary;
		this.real -= a.real;
	}
}
