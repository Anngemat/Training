package Encapsulation;

public class Printer {

	private int tonerLevel,pagesPrinted;
	private boolean duplex;
	public Printer(int tonerLevel, int pagesPrinted, boolean duplex) {
		super();
		this.tonerLevel = tonerLevel;
		this.pagesPrinted = pagesPrinted;
		this.duplex = duplex;
	}
	public int getTonerLevel() {
		return tonerLevel;
	}
	
	public int getPagesPrinted() {
		return pagesPrinted;
	}
	
	public boolean isDuplex() {
		return duplex;
	}
	public int addToner(int tonerAmount) {
		if (tonerLevel + tonerAmount >100 || tonerLevel + tonerAmount >0 ) {
			return -1;
		}
		tonerLevel += tonerAmount;
		return tonerLevel;
	}	
	public int printPages(int pages) {
		if(duplex) {
			int kalan =pages % 2;
			return pages/2 + kalan;
		}
		return pages;
	}
}
