import java.io.FileInputStream;

import java.io.IOException;

public class class1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException  {
		
		FileInputStream file;
		
			file = new  FileInputStream("C:\\Users\\Dhia\\Downloads\\dhia.txt");
			 int k;
				while(( k=file.read())!=-1) {
					System.out.print((char)k);
					
					
				}
			
	
			
		
	

	}

}
