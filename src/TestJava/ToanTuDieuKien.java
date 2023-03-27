package TestJava;

import java.util.Scanner;

public class ToanTuDieuKien {
	public static void main(String[] args) {
		float dtb;
		Scanner save = new Scanner (System.in);
		System.out.println("Mời nhập điểm trung bình: ");
		dtb = save.nextFloat();
		
		if (dtb <0 || dtb >10)
			System.out.println("Điểm vừa nhập không hợp lệ!");
		else {
			String xepLoai = "";
			xepLoai = (dtb<5 ? "Yếu" : (dtb<7 ? "Trung Bình" : (dtb <8.5 ? "Khá" : "Giỏi")));
		
		System.out.println("Với điểm trung bình = "+dtb+ " bạn dươc xếp loại "+ xepLoai);
		}
		save.close();
	}

}
