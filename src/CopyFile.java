import java.io.*;

public class CopyFile {
    public static void main(String[] args)  {
        File file=null;
        FileReader fileReader=null;
        FileWriter fileWriter=null;
        BufferedReader bufferedReader = null;
        try {
          file=new File("champ.txt");
            if(!file.exists()){
                throw new FileNotFoundException();
            }
            fileReader=new FileReader(file);
            fileWriter=new FileWriter("copyChamp.txt");
            bufferedReader=new BufferedReader(fileReader);
            int ch;
            while((ch=bufferedReader.read())!=-1){
                fileWriter.write(ch);
            }
        } catch (Exception e) {
            System.err.println("error");
        }finally {
            if(bufferedReader!=null){
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fileWriter!=null){
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
