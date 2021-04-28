package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		Product product1= new Product(1,"lenovo v14",15000,"16Gb ram",10);//referans oluþturma, instance
		/*product1.id=1;
		product1.name="Lenovo v14";
		product1.unitPrice=15000;
		product1.detail="16 GB ram";*/
		
		Product product2= new Product();
		product2.setId(2);
		product2.setName("Lenovo v15");
		product2.setDetail("16 gb ram");
		product2.setDiscount(10);
		product2.setUnitPrice(16000);
		
		System.out.println(product2.getUnitPriceAfterDiscount());
		
		Category category1=new Category();
		category1.setId(1);
		category1.setName("içeçek");
		
		Category category2=new Category();
		category2.setId(2);
		category2.setName("yiyecek");
		
		System.out.println(category1.getName());
		System.out.println(category2.getName());
	}
}