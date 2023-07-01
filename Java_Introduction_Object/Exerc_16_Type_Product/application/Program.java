package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;


public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Product> list = new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		int quant = sc.nextInt();
		
		for (int i=0; i<quant; i++) {
			System.out.println("Product #"+(i+1)+" data: ");
			System.out.print("Common, used, imported (c/u/i)? ");
			char opt = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String pName = sc.nextLine();
			System.out.print("Price: ");
			double pPrice = sc.nextDouble();
			
			if (opt == 'i') {
				System.out.print("Customs fee: ");
				double cf = sc.nextDouble();
				list.add(new ImportedProduct(pName, pPrice, cf));
			}
			
			else if (opt == 'u'){ 
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date md = sdf.parse(sc.next());
				list.add(new UsedProduct(pName, pPrice, md));
			}
			
			else if (opt == 'c') {
				list.add(new Product(pName, pPrice));
			}
			
		}
		
		System.out.println();
		System.out.println("PRICE TAG: ");
		for (Product prod : list) {
			System.out.println(prod.priceTag());
		}
		sc.close();

	}

}
