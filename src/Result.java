import java.io.FileWriter;
import java.io.IOException;

public class Result {
    
    /**
     * method notes the name of toys in txt file
     * @param item
     * @throws IOException
     */
    public void saveResultToFile(Toy item) throws IOException{
        try(FileWriter fw = new FileWriter("Result.txt", true)){
            fw.write(item.getName());
            fw.append("\n");
            fw.flush();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    /**
     * method cleans file txt after lottery
     * @throws IOException
     */
    public void clearFile() throws IOException{
        new FileWriter("Result.txt", true).close();
    }   
}
