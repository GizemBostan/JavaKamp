package intro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String internetSubeButonu="internet �ubeye gir";
		double dolarDun=8.20;
		double dolarBugun=8.20;
		int vade=36;
		boolean dustuMu=true;
		
		System.out.println("hello");
		System.out.println(internetSubeButonu);

		
		if(dolarBugun<dolarDun) {
			System.out.println("dolar d��m��t�r");
		}else if(dolarBugun>dolarDun) {
			System.out.println("dolar y�kseldi");
		}
		else {
			System.out.println("dolar de�i�medi");
		}
		
		String kredi1="h�zl� kredi";
		String kredi2="mutlu emekli kredi";
		String kredi3="konut kredi";
		String kredi4="�ift�i kredi";
		String kredi5="msb kredi";
		
		System.out.println(kredi1);
		System.out.println(kredi2);
		System.out.println(kredi3);
		System.out.println(kredi4);
		System.out.println(kredi5);
		
		System.out.println("***************");
		
		String[] krediler= {"h�zl� kredi",
				"mutlu emekli kredi","konut kredi",
				"�ift�i kredi","msb kredi"};
		//foreach
		for(String kredi:krediler) {
			System.out.println(kredi);
			
		}
		
		
				
	}

}


















