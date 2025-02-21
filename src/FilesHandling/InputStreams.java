package FilesHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class InputStreams {

	public static void main(String[] args) throws IOException {
		File file = new File("./TestFiles/Supriya.txt");
		
		if(file.exists());
		FileInputStream fis = new FileInputStream(file);
		
//		String s= new String();
		int asciCode;
		while((asciCode=fis.read())!=-1) {
			System.out.print((char) asciCode);

		}
			
		
		
		
		fis.close();
		
	}

}
