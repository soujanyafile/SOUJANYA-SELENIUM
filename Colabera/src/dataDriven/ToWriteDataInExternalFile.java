package dataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ToWriteDataInExternalFile {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("./testResources/Doc.txt");
fos.write('S');
fos.write('O');
fos.write('U');
fos.write('J');
fos.write('A');
fos.write('N');
fos.write('Y');
fos.write('A');
	}

}
