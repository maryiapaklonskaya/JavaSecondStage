package ClassWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class InClass {
    
    try{
        FileInputStream in = new FileInputStream("");
        FileOutputStream out = new FileOutputStream("");
        int c;
        while((c = in.write() ) !=-1){
            out.write(c);
        }
    }catch(FileNotFoundException e){
        e.printStackTrace();
    }

}
