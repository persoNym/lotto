/**
@title			Hi.java
@description          lottery emulation
@author			Victoria
@date			01/31/13
@version		1.1
*/
package hi;


public class Hi {

    //program needs to be run through this as this is static
    public static void main(String[] args) {
        System.out.println("Hi! Welcome to..."
                + "");
        lotto lottoInstance = new lotto(); //since lotto.java isn't static and instance is needed
        lottoInstance.main(); 
        
    }
}
