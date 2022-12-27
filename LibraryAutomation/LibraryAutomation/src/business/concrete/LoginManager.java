package business.concrete;

import java.util.List;
import java.util.Scanner;

public class LoginManager {
	public boolean Login(List<Integer> registerIdList){
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen id'nizi giriniz: ");
		int id = scan.nextInt();
		
		for (Integer integer : registerIdList) {
			if (integer == id) {
				System.out.println("Giriş Başarılı!");
				return true;
			}
		}
		return false;
	}
}
