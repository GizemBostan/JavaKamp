package inheritance2;

public class LogManager {
	public void log(int logType) {
		if(logType==1) {
			System.out.println("veritaban� logland�");
		}else if(logType==2) {
			System.out.println("dosyaya logland�");
		}else {
			System.out.println("emaile logland�");
		}
		
	}
}


//1 database
//2 file
//3 email