package Hepsi;



public class RanUtilities {

public static int randomInt(int range) {
return(1 + ((int)(Math.random() * range)));
}
/** Test routine. Invoke from the command line with
* the desired range. Will print 100 values.
* Verify that you see values from 1 to range (inclusive)
* and no values outside that interval.
*/
public static void main(String[] args) {
int range = 10;
try {
range = Integer.parseInt(args[0]);
} catch(Exception e) { 

}
for(int i=0; i<100; i++) {
System.out.println(randomInt(range));
}
}
}