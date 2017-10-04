package co.jim.java.java9;

import java.io.IOException;

public class Process {
  public static void main (String [] args){
      try {
          java.lang.Process p = new ProcessBuilder("notepad.exe").start();
          System.out.println("Your pid is " + p.pid());

          //New ProcessHangle interface which identifies and provides control of native processes.
          p.toHandle().destroy();
      }catch (IOException ioe){
          System.err.print(ioe);
      }
  }
}
