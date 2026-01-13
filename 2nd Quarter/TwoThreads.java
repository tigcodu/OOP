import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
    
public class TwoThreads {
         
    public static void main(String[] args) throws InterruptedException {
                
        Thread objFirstThread = new UserInteraction();
        objFirstThread.start();
        Thread objSecondThread = new ComputeLog();
        objSecondThread.start();
        objFirstThread.join();
        	    
        ((ComputeLog) objSecondThread).end();
        	            	    
}  // public static void main(String[] args) throws Interrupted Exception
          
}  // public class TwoThreads

  
class UserInteraction extends Thread {
	     
    public void run() {
        try {
            BufferedReader objUserInput = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Hello, how are you? ");
            String strUserInput = objUserInput.readLine();
            System.out.print("What are you doing today? ");
            strUserInput = objUserInput.readLine();
            System.out.println(strUserInput + " sounds like fun.");
        } catch (IOException objIOException) {
            System.out.println("An I/O exception has occurred");
        }  // catch (IOException objIOException)
    }  // public void run()
	     
}  // class UserInteraction extends Thread

  
class ComputeLog extends Thread {
	    
    private static boolean boolStop = false;
	    
    public void run() {	   
        try {
            int intCount = 1;
            double dblVal = 0;
            
            while (! boolStop) {
                dblVal = Math.log(intCount++);
                sleep(1);
            }  // while (! boolStop)
            System.out.println("The log of " + intCount + " is " + dblVal);	   
        } catch (InterruptedException objException) {
            System.out.println("Thread execution was interrupted.");
        }  // catch (InterruptedExceptioin objException)	    	   
    }  // public void run()

    public void end() {
        boolStop = true;
    }  // public void end()
}  // class ComputeLog extends Thread