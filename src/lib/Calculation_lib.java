package lib;

public class Calculation_lib {
	private int m,n; //�����ł����A�N�Z�X�ł��Ȃ�

	public Calculation_lib(int m, int n) {
		this.m = m;
		this.n = n;
	}
	
	public int getPlus() {//main�ł�getPlus�ɃA�N�Z�X�\
		return this.m + this.n;
	}
	public int getMinus() {
		return this.m - this.n;
	}
	public int getTime() {
		return this.m * this.n;
	}
	public int getDivide() {
		return this.m / this.n;
	}
	public int getMod() {
		return this.m % this.n;
	}

}
