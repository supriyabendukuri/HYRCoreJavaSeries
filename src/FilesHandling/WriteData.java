package FilesHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class WriteData {

	public static void main(String[] args) throws IOException {

		File file = new File("./TestFiles/write.txt");
		if(file.exists());
		file.delete();
		file.createNewFile();
		
		String s= "Supriya buffered";
//		FileOutputStream fo=new FileOutputStream(file);
//		for(char ch: s.toCharArray()) {
//			fo.write(ch);
//
//		}
//		FileWriter fw=new FileWriter(file);
//		
//		fw.write(s);
		
		BufferedWriter bw= new BufferedWriter(new FileWriter(file));
		bw.write(s);
		
		bw.flush();
		bw.close();
				
		
		
		
	}

}
