
package za.ac.cput.assignmentthree;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author Sinalo
 */
public class RunFile {
    
    public static void main(String[] args) {
    CreateStakeholderSer myReadObj = new CreateStakeholderSer();
    myReadObj.populateArray();
    myReadObj.openFile();
    myReadObj.writeToFile();
    myReadObj.closeFile();
    
    FileWriter fw = new FileWriter("testout.txt");
    BufferedWriter bw = new BufferedWriter(fw);
    bw.write(String.format("%-10s\t%-10s\t%-10s\t%-15s\t%-10s\tR%-10.2f\t%-10s", super.toString());
    bw.close();
    }
}
