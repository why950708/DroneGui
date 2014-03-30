/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package reading;



import jssc.SerialPort;
import jssc.*;


public class SimpleUseOfJSSC {
    public static void main(String[] args) {
        
        SerialPort serialPort = new SerialPort("COM3");
        System.out.print(serialPort.isOpened());
       try{
       System.out.print( serialPort.openPort());
    for(int i=0;i<123;i++)
       System.out.println(serialPort.readHexString(123));
      
      
       }
       catch (SerialPortException ex)
       {
       System.out.print(ex);
       }
        /* try {
            System.out.println("Port opened: " + serialPort.openPort());
            System.out.println("Params setted: " + serialPort.setParams(9600, 8, 1, 0));
            System.out.println("\"Hello World!!!\" successfully writen to port: " + serialPort.writeBytes("Hello World!!!".getBytes()));
            System.out.println("Port closed: " + serialPort.closePort());
        }
        catch (SerialPortException ex){
         
               System.out.println(ex);
   
          
    }
            */
        }
    }



    

