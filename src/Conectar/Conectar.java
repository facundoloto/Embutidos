/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Conectar;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.time.LocalTime;
/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Conectar {
Connection con;
public Conectar() {

}
public Connection getConnection() {
  try {
 Class.forName("com.mysql.cj.jdbc.Driver");
 con=DriverManager.getConnection("jdbc:mysql://LocalHost:3306/personal?useTimezone=true&serverTimezone=UTC","root", "root");
}catch(Exception e){
    System.out.println(e.getMessage());
JOptionPane.showMessageDialog(null, "la base de datos se conecto mal ");
JOptionPane.showMessageDialog(null, " "+e);
}
    return con; //retorna la conexion;
}
public void Cerrar(){ //cierra las conexion para no limitar el uso de las conexiones que permite la base de datos
try {
    con.close();
    
}catch (SQLException e) {
JOptionPane.showMessageDialog(null,""+e);
}
}
}