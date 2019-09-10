/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Sonidos;
import java.applet.AudioClip;
/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Sonidos {
       AudioClip sound;
       AudioClip exit;
       AudioClip error;
       AudioClip correcto;
 public Sonidos( ){
 sound=null;
 exit=null;
 
 }
    
    
    public void Inicio(){
 
    sound=java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/Sonido de entrada de Windows XP.wav"));
    sound.play();
    
    }
    public void Salir(){
    exit=java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/Sonido de apagado de Windows XP.wav"));
    exit.play();
    }

 public void Error(){
   error=java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/WINDOWS XP ERROR SOUND.wmv.wav"));
    error.play();

}
 public void Correcto(){
  correcto=java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/Efecto de sonido respuesta correcta.wav"));
  correcto.play();
 }
}