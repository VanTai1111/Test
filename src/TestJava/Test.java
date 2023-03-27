package TestJava;
import java.util.*;
import java.util.Scanner;
public class Test {
	// nhập ba số bất kì tìm số lớn nhất
	public static void main(String[] args) {
		Scanner save = new Scanner(System.in);
		int soThuNhat, soThuHai, soThuBa;
		System.out.println("Mời nhập số thứ nhất");
		soThuNhat = save.nextInt();
		System.out.println("Mời nhập số thứ hai");
		soThuHai = save.nextInt();
		System.out.println("Mời nhập số thứ ba");
		soThuBa = save.nextInt();
		int soLonNhat = soThuNhat;
		if (soLonNhat < soThuHai)
			soLonNhat = soThuHai;
		if (soLonNhat < soThuBa)
			soLonNhat = soThuBa;
		System.out.println("Số lớn nhất trong ba số ta nhập vào là "+soLonNhat);
		save.close();
	}
	

}
