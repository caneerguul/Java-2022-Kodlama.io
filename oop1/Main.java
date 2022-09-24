package oop1;

public class Main {

	public static void main(String[] args) {
		Product product1 = new Product();
		product1.setName("Delonghi Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitInStock(3);
		product1.setImageUrl("x.jpg");
		
		Product product2 = new Product();
		product2.setName("Smeg Kahve Makinesi");
		product2.setDiscount(7);
		product2.setUnitPrice(7500);
		product2.setUnitInStock(3);
		product2.setImageUrl("y.jpg");
		
		Product product3 = new Product();
		product3.setName("Kitchen Aid Kahve Makinesi");
		product3.setDiscount(7);
		product3.setUnitPrice(7500);
		product3.setUnitInStock(3);
		product3.setImageUrl("z.jpg");

		
		//HTML
		
		System.out.println("<ul>");
		
		Product[] products = {product1, product2, product3};
		for (Product product : products) {
			System.out.println("<li>"+product.getName()+"</li>");
		}
		
		System.out.println("</ul>");
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("435435");
		individualCustomer.setCustomerNumber("23423");
		individualCustomer.setFirstName("Caner");
		individualCustomer.setLastName("Gül");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("Kodlama.io");
		corporateCustomer.setPhone("2323");
		corporateCustomer.setTaxNumber("111111111");
		corporateCustomer.setCustomerNumber("34215");
		
		customer[] customers = {individualCustomer, corporateCustomer};
		
		
	}

}
