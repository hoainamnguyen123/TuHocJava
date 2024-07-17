package lab4;

public class mainLab4 {
	public static void main(String[] args) {
		Product p1 = new Product("Tivi", 40000.5, 3.4);
		Product p2 = new Product("Fan", 500.5, 0.8);
		Product p3 = new Product();
		p3.nhapThongTin();
		p3.xuatThongTin();
		p1.xuatThongTin();
		p2.xuatThongTin();
	}
}