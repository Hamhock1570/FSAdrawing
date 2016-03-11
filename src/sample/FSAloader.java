package sample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

/** Loads and FSA object full of the information from the file
 * Created by Michael
 */
public class FSAloader
{
    /**This is an internal class to help keep track and reference parts of FSA
     * Helps parse the string into more intuitive parts to play with.
     */
    public class FSAstring
    {
        public String numStatesStr;
        public String alphabet;
        public String stateTransitionsStr;
        public String startStateStr;
        public String acceptStateStr;
        // take in a string and split the string into its respective parts
        public FSAstring(String str){
            String[] parts = str.split(";");
            this.numStatesStr        = parts[0];
            this.alphabet            = parts[1];
            this.stateTransitionsStr = parts[2];
            this.startStateStr       = parts[3];
            this.acceptStateStr      = parts[4];
        }
        //might need to add getters and setters
        // might break down the strings further in her, but might just do that in the outer class
    }

    private File file;
    private FSA fsa;
    private LinkedList<String> stateNames; // just collecting states as they are found in the string
    private FSAstring fsaString;
    public FSAloader(File file){
        this.file = file;
        this.fsa = new FSA();
        this.stateNames = null;
        this.fsaString = new FSAstring(readStrFromFile());
    }

    /**
     * Reads the file passed to FSAloader and returns the string from it.
     * @return the String from the file
     */
    public String readStrFromFile(){
        String str = null;
        try {
            FileReader fileReader = new FileReader(this.file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            StringBuffer stringBuffer = new StringBuffer();
            String line;
            if ((line = bufferedReader.readLine()) != null){
                stringBuffer.append(line);
                stringBuffer.append("\n");
            }
            fileReader.close();
            System.out.println("Contents of file:");
            System.out.println(stringBuffer.toString());
            str = line;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }

    /**
     * Gets the loaded FSA
     * @return a reference to the loaded FSA
     */
    public FSA getFSA(){
        return  this.fsa;
    }

}
