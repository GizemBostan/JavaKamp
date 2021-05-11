package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.jLoggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;
import nLayeredDemo.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {

		ProductService productService=new ProductManager(new AbcProductDao(),
				new jLoggerManagerAdapter());
		
		Product product=new Product(1,2,12,50,"elma");
		productService.add(product);

	}

}