/*
 * 
 */
package percentage;
import java.io.*;
import java.text.*;






/**
 *
 * @author pavel
 */


public class themain {
    
    
    
    public static void main (String [] args) throws IOException {
        
        one();
        int[] result = GetCounts2();
        double[] s = {0, 0, 0, 0, 0, 0};
        double[] r = new double[6];
        
        
        for (int i = 0; i <= 99; i++) {
            one();
            result = GetCounts2();
            for (int j = 0; j < 6; j++) {
                s[j] += result[j];
            }
        } //end of for loop
        for (int i = 0; i < 6; i++) {
            r[i] = ((s[i]/100000) * 100);
        }
        DecimalFormat pavel = new DecimalFormat("#.###"); // 3 digits after .
        PrintWriter utstrom = new PrintWriter(new FileWriter ("Pavels.txt"));
        
        utstrom.println("Percentage of 1s: " + pavel.format(r[0]) + "%");
        utstrom.println("Percentage of 2s: " + pavel.format(r[1]) + "%");
        utstrom.println("Percentage of 3s: " + pavel.format(r[2]) + "%");
        utstrom.println("Percentage of 4s: " + pavel.format(r[3]) + "%");
        utstrom.println("Percentage of 5s: " + pavel.format(r[4]) + "%");
        utstrom.println("Percentage of 6s: " + pavel.format(r[5]) + "%");
        utstrom.close();
    } // end of main method
    public static void one() throws IOException {
        PrintWriter utstrom = new PrintWriter(new FileWriter ("Pavels.txt"));
        String tal = "";
        double me;
        int a = 1000;
        for (int i=1; i<=a; i=i+1) {
            me = ((Math.random())*6)+1; 
            int t = (int) me;
            tal = tal + t; 
            
        } // end of for loop
        
        utstrom.println(tal);
        utstrom.close();
    } // end of method
    static int[] GetCounts2() throws IOException {
        BufferedReader inström = new BufferedReader(new FileReader("Pavels.txt"));  
        int[] count = new int[1000];
        int[] counts = {0, 0, 0, 0, 0, 0};  // int[] counts = new int[6];
        String p;
        
        p=inström.readLine();
        for (int i=0; i<(p.length()); i++) {
            count[i] = Character.getNumericValue(p.charAt(i));
        } // from txt to array with 1000 slots/spaces
        int u = 0;
        for (int y = 0; y < (count.length); y++) {
            u=count[y];
            counts[u-1]++; // increase specific variable by +1 when going through array of 1000 slots
            
            
        }
        // counts[2] = count.length;
        return counts; // returning array (int)
    }   // end of 2nd method
} // class

/*
for (int i = 0; i < (p.length()) ; i++) {
             counts[(p.charAt(i))-1]++;
            
        } // counting frequency of specific numbers
*/
