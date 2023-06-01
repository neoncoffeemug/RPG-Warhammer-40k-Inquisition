import java.util.concurrent.TimeUnit;

public interface slowPrint1 {
	
	 static void slowPrint1(String output) {
		for (int i = 0; i<output.length(); i++) {
			char c = output.charAt(i);
			System.out.print(c);
			try {
				TimeUnit.MILLISECONDS.sleep(0);
			}
			catch (Exception e) {				
			}
		}
	}

}
