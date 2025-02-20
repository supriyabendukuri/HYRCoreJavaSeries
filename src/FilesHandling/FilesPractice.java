package FilesHandling;

import java.io.File;
import java.io.IOException;

public class FilesPractice {

	public static void main(String[] args) throws IOException {

		File file = new File("./TestFiles/Supriya.txt");
		//file.mkdir();
//		if(file.exists())
//		file.delete();
//		file.createNewFile();
//		System.out.println(file.isHidden());
	System.out.println(file.canWrite());
	System.out.println(file.canRead());
	System.out.println(file.setWritable(true));
		
		
		
		
	}

}
