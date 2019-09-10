/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nuevo;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JLabel;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Hora extends Thread { //hilo esto hace que se ejucute cosas al simulteano y no por separado
    private JLabel hora; //creamos unas variables label
    private JLabel fecha;
    
public void Hora(JLabel horas){
        this.hora=horas; //creamos dos metodos set
}
public void Fecha(JLabel fechas){
this.fecha=fechas;


} 




public void run(){ 
 while (true){ // si es verdadero seguir
   Date hoy =new Date(); //variable fecha
   SimpleDateFormat s=new SimpleDateFormat("hh:mm:ss"); //cambiamos el formato por hora minutos y segundos
   SimpleDateFormat actual=new SimpleDateFormat("dd/MM/YYYY"); //cambiamos por dia mes y año
    hora.setText(s.format(hoy)); //y le damos el nuevo formato a la hora actual
    fecha.setText(actual.format(hoy)); //y tambien la fecha
   try {sleep(1000); // esto aun no lo tengo claro //i am sorry
                
    }catch(Exception ex){
            
        }
    }
}
        
   }






