import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class writefile{
  public static void main(String args[]){
    try{
      File file = new File("No_one.txt");
      FileWriter filewriter = new FileWriter(file);

      filewriter.write("x:10 y:20");

      filewriter.close();
    }catch(IOException e){
      System.out.println(e);
    }
  }
}
