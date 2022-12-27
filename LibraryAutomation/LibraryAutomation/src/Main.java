
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entities.Author;
import Entities.Book;
import business.concrete.AuthorManager;
import business.concrete.BookManager;
import business.concrete.LoginManager;
import business.concrete.RegisterManager;
import dataAccess.concrete.InMemoryAuthorDao;
import dataAccess.concrete.InMemoryBookDao;


public class Main {

	public static void main(String[] args) throws Exception {	
		RegisterManager registerManager = new RegisterManager();
		LoginManager loginManager = new LoginManager();
		InMemoryBookDao inMemoryBookDao = new InMemoryBookDao();
		BookManager bookManager = new BookManager(inMemoryBookDao);
		InMemoryAuthorDao inMemoryAuthorDao = new InMemoryAuthorDao();
		AuthorManager authorManager = new AuthorManager(inMemoryAuthorDao);
		List<Integer> list = new ArrayList<>();
		
		System.out.println("------------------------HOŞGELDİNİZ------------------------");
		
		
		
		while(true) {
			System.out.println("-----------------------------------------------------------");
			System.out.println("[1]-Kaydol");
			System.out.println("[2]-Giriş Yap");
			
			Scanner scan = new Scanner(System.in);
			int answer = scan.nextInt();
			
			if (answer == 1) {
				
				int id = registerManager.CreateRegisterId();
				registerManager.AddRegisteredIdToList(id);
				System.out.println("Kütüphane giriş id'niz. Lütfen unutmayınız!: " + id);
				continue;
			}
			
			if(answer==2) {
				list = registerManager.ShowTheRegisterIdList();
				if (!loginManager.Login(list)) {
					System.out.println("Hatalı id girdiniz! Tekrar deneyiniz.");
					continue;
				} 
			}
			while (true) {
				System.out.println("----------------------------------------------------");
				Scanner scn = new Scanner(System.in);
				System.out.println("[1]-Kitapları Listele");
				System.out.println("[2]-Yazarları Listele");
				System.out.println("[3]-Kitap Ara");
				System.out.println("[4]-Kitap Ödünç Al");
				System.out.println("[5]-Kitap Bağışla");
				System.out.println("[6]-Yazar biyografisi ara");
				System.out.println("[7]-Yazar biyografisi ekle");
				System.out.println("[0]-Çıkmak İçin 0'a Basınız");
				System.out.println("Lütfen Yapmak İstediğiniz İşlemi Seçiniz: ");
				int answer2 = scn.nextInt();
				if (answer2 == 1) {
					for (Book book : bookManager.getAll()) {
						System.out.println("Kitap İsmi: "+ book.getName());
						System.out.println("Kitap Yazarı: "+ book.getAuthor());
						System.out.println("Kitap Türü: " + book.getType());
						System.out.println("Kitabın Sayfa Sayısı: "+ book.getNumberOfPages());
						System.out.println("----------------------------------------------------");
					}
					continue;
				}
				if (answer2 == 2) {
					for (Author author : authorManager.getAll()) {
						System.out.println("Yazar Adı: "+ author.getFirstName() +" "+ author.getLastName());
						System.out.println("Yazarın Biyografisi: "+ author.getBiography());
						System.out.println("----------------------------------------------------");
					}
				}
				if (answer2 == 3) {
					System.out.println("Aramak istediğiniz kitap ismini yazınız: ");
					String name = scn.next();
					if (!bookManager.FindBook(name)) {
						System.out.println("Aradığınız kitap bulunmamaktadır!");
					} 
					continue;
				}
				if (answer2 == 4) {
					System.out.println("Aramak istediğiniz kitap ismini yazınız: ");
					String name = scn.next();
					bookManager.FindBook(name);
					bookManager.Barrow(name);
					continue;
				}
				if (answer2 == 5) {
				    Scanner scan3 = new Scanner(System.in);
				    String name;
					String author;
					String type;
					int numberOfPages;
					System.out.println("Kitap ismi giriniz: ");
					name = scan3.next();
					System.out.println("Kitabın yazarını giriniz: ");
					author = scan3.next();
					System.out.println("Kitap türü giriniz: ");
					type = scan3.next();
					System.out.println("Kitap sayfa giriniz: ");
					numberOfPages = scan3.nextInt();
		
					bookManager.add(new Book(name, author, type, numberOfPages));
					System.out.println("Kitabınız eklendi");
					continue;
				}
				if (answer2==6) {
					Scanner scan4 = new Scanner(System.in);
					System.out.println("Biyografisini aramak istediğiniz yazarın ismini giriniz: ");
					String firstName = scan4.next();
					System.out.println("Biyografisini aramak istediğiniz yazarın soyismini giriniz: ");
					String lastName = scan4.next();
					if (!authorManager.getAuthorsBiography(firstName, lastName)) {
						System.out.println("Aradığınız yazar bulunmamaktadır");
					}
					continue;
				}
				if (answer2==7) {
					Scanner scan5 = new Scanner(System.in);
					String firstName;
					String lastName;
					String biography;
					System.out.println("Biyografisini eklemek istediğiniz yazarın ismi: ");
					firstName = scan5.next();
					System.out.println("Biyografisini eklemek istediğiniz yazarın soyismi: ");
					lastName = scan5.next();
					System.out.println("Biyografisini eklemek istediğiniz yazarın biyografisi: ");
					biography = scan5.next();
					authorManager.add(new Author(firstName, lastName, biography));
					System.out.println("Yazar Biyografisi Eklendi.");
					continue;
				}
				if (answer2 == 0) {
					break;
				}
			}
		}	
	}
}
