package deneme;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DosyaOrnek {
	
	public static void main(String[] args) throws IOException{
        String str = "Write this file.";

        File file = new File("C:\\Users\\BurhanKaan\\Desktop\\dosya.txt");
        if (!file.exists()) {
            file.createNewFile();
        }

        FileWriter fileWriter = new FileWriter(file, false);
        BufferedWriter bWriter = new BufferedWriter(fileWriter);
        bWriter.write(str);
        bWriter.close();
	}
}
