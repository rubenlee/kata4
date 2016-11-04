package kata4;

import java.io.File;

public class Kata4 {
    public static void main(String[] args) {
        File file = new File ("C:\\");
        String[] names = file.list();
        print(file.listFiles(),"");
    }

    private static void print(File[] files,String indent) {
        if(files == null) return;
        for (File file : files) {
            System.out.println(indent + (file.isDirectory()? "+" : "-" ) + file.getName());
            if(!file.isDirectory() || file.isHidden()) continue;
            print(file.listFiles(), " ");
        }
    }
}
