/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nuevo;
import Conectar.Conectar;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.util.Date;
import java.sql.Statement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.data.*;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.*;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JRViewer;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */

public class Ventas extends javax.swing.JFrame implements Runnable {
 Conectar con=new Conectar();
float total_kilos=0;
float total_unidad=0;
float total_final=0;
Connection conexion;
Hora h=new Hora();
ImageIcon icono = new ImageIcon("src/imagenes/logoprograma(final).png");
Statement st;
ResultSet re;
DefaultTableModel modelo;
Object[][]datos={};
Object[]columnas={"CLIENTE","PRODUCTO","UNIDADES","KILOS","TOTALXKILO","TOTALXUNIDAD"};
String precioxkilo;
String pxuni;
float pxunidad;
float kilo;
float pre;
int cantidad;
float to;//totalxkiklo
float tu;//totalxunidad
float acumulador_precio=0;
int id_clientes;
int id_producto;
 public Ventas() {
 initComponents();
 h.Fecha(fech);
 h.Hora(hora);
 h.start();
 this.setIconImage(icono.getImage());
 this.setLocationRelativeTo(null);
 modelo=new DefaultTableModel(datos,columnas);
 tablaTicket.setModel(modelo);
 Productos();
 Clientes();
 
 }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        finalizar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        can = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ki = new javax.swing.JTextField();
        otroProducto = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaTicket = new javax.swing.JTable();
        clientes = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        productos1 = new javax.swing.JComboBox<>();
        total = new javax.swing.JLabel();
        pxk = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        noFijo = new javax.swing.JTextField();
        atras = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        hora = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        fech = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        pxu = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        totalxu = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        fi = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImages(null);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        finalizar.setText("finalizar venta");
        finalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalizarActionPerformed(evt);
            }
        });
        getContentPane().add(finalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 361, -1, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("cliente");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 12, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("productos");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 12, -1, -1));

        can.setForeground(new java.awt.Color(0, 0, 0));
        can.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                canActionPerformed(evt);
            }
        });
        getContentPane().add(can, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 41, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("cantidad");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 78, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("precio finalxkilo");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, -1, 30));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("kilos");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(411, 78, 48, -1));

        ki.setForeground(new java.awt.Color(0, 0, 0));
        ki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kiActionPerformed(evt);
            }
        });
        getContentPane().add(ki, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 48, -1));

        otroProducto.setText("Agregar nuevo producto a la venta");
        otroProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otroProductoActionPerformed(evt);
            }
        });
        getContentPane().add(otroProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 325, -1, -1));

        jButton3.setText("Imprimir boleta");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 391, -1, -1));

        tablaTicket.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaTicket);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 173, 910, 81));

        clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clientesMouseClicked(evt);
            }
        });
        clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientesActionPerformed(evt);
            }
        });
        getContentPane().add(clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 36, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("precio por kilo");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 78, -1, -1));

        productos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productos1ActionPerformed(evt);
            }
        });
        getContentPane().add(productos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 36, -1, -1));

        total.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 100, 63, 20));
        total.setText(String.valueOf(0.0));

        pxk.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(pxk, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 96, 67, 19));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("cliente no fijo");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 78, -1, -1));
        getContentPane().add(noFijo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 96, 89, -1));

        atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-go-back-24 (1).png"))); // NOI18N
        atras.setContentAreaFilled(false);
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });
        getContentPane().add(atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(752, 382, -1, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Hora actual");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 272, -1, -1));

        hora.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 293, 282, 26));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("$");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 100, 20, 20));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("fecha");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 272, -1, -1));

        fech.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(fech, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 293, 103, 26));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("precio por unidad");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 78, -1, -1));

        pxu.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(pxu, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 84, 19));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("precio final por unidad");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 70, -1, 30));

        totalxu.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(totalxu, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 100, 70, 20));
        totalxu.setText(String.valueOf(0.0));

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("$");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 100, 20, 20));

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("total");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 270, 30, -1));

        fi.setForeground(new java.awt.Color(255, 255, 255));
        fi.setText("0.0");
        getContentPane().add(fi, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 270, 50, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/wallpaper_azul_oscuro_1920x1200_124.jpeg"))); // NOI18N
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 910, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kiActionPerformed
 //esto esta configurado para cuando se ingrese los kilos no tenga simbolos o datos erroneos
 //cuando un producto requierakilos con esto se hace el total sin la cantidad
try{
pre=(float) Double.parseDouble(pxk.getText());
kilo=(float)Double.parseDouble(ki.getText()); // precio por kilo y total  es un label
to=pre*kilo;
total.setText(""+to);//to=total precio x kilo ,tu=precio unidad por cantidad
// total es un label no una caja de texto por lo tanto no se le pueden cargar texto

 }catch(Exception e){
 JOptionPane.showMessageDialog(null, "caracteres invalidos,solo se permite caracteres 0.0");
 }
 
    }//GEN-LAST:event_kiActionPerformed

    private void productos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productos1ActionPerformed
  // esto esta configurado para cuando se eliga un producto se traiga el precio de este en un jlable(pxk)
   String sql="SELECT id_prod,precioxkilo,precioxunidad FROM productos WHERE nombre_producto= '"+productos1.getSelectedItem()+"' ";
try{
conexion=con.getConnection();
st=conexion.createStatement();
re=st.executeQuery(sql);
while(re.next()){ //resulset este whilesirve para cuando hay un dato en la tabla pase al siguente 
precioxkilo=re.getString("precioxkilo");
pxuni=re.getString("precioxunidad");
id_producto=Integer.parseInt(re.getString("id_prod"));//guarda el id para luego cargarlo en la tanla de ventas de la base de datos
 }
pxk.setText(precioxkilo);
pxu.setText(pxuni);
//este if sirve por si el precio por cantidad es 0 no es necesario ingresar los kilos ya que el precio influye por la cantidad de  un producto
if (precioxkilo.equals("0.0")){
ki.setEnabled(false); //bloquea la caja de texto cuando el producto requiera cantidad y no kilos
ki.setText(String.valueOf(0));
total.setText(String.valueOf(0.0));
 }
  else {
    ki.setEnabled(true);
  }
  //este if sirve por si el precio por cantidad es 0 no es necesario ingresar cantidad ya que el precio influye por los kilos de  un producto
  if(pxuni.equals("0.0")){
  can.setEnabled(false);
  can.setText(String.valueOf(1)); //establece la cantidad en 1 por que unicamente si es por kilos se vende por 1 gancho
  totalxu.setText(String.valueOf(0.0));//esto sirve por si se calcula un producto por kilo a la hora de elegir un nuevo producto se re establece el valor
  }
  else{
  can.setEnabled(true);
  }
  
 }catch(Exception e){
   }
    }//GEN-LAST:event_productos1ActionPerformed

    private void otroProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otroProductoActionPerformed
  //boton que esta configurado para cuando se pida ingresar otro producto a la boleta o registro los campos sean validos
   try {
 Object [] ticket=new Object[6];
 String nom=(String) clientes.getSelectedItem();
 String pro=(String) productos1.getSelectedItem();  
 String kilos=ki.getText();    
 String cant=can.getText();
 String precioFinal=total.getText(); //total por kilos
 String precioFinal1=totalxu.getText();//total por unidad

 if(pro.equals("Seleccione una opción")||nom.equals("cliente no fijo") ||kilos.equals("")||cant.equals(1)){ //arreglar por que no agrega cuando se ingresa un usuario no fijo
 JOptionPane.showMessageDialog(null, "campos vacios,por favor revise los campos");
   }
 else { //este else es cuando los campos que no son clientes estan llenos
 if (nom.equals("cliente no fijo")){
 if(noFijo.equals("")){
JOptionPane.showMessageDialog(null,"no hay ningun nombre de cliente,por favor ingrese uno");
  }else{ //este else es por si en el combobox no hay ningun ciente puesto significa que tiene que haber uno en cliente no fijo
 nom=noFijo.getText();
 ticket[0]=nom;
 ticket[1]=pro;
 ticket[2]=cant;
 ticket[3]=kilos;
 ticket[4]=precioFinal;
 ticket[5]=precioFinal1;
  float total_f= Float.parseFloat(total.getText());
  float totalxun_f=Float.parseFloat(totalxu.getText());
  acumulador_precio+=total_f; //acumula los precio
  acumulador_precio+=totalxun_f;
  fi.setText(String.valueOf(acumulador_precio));
 modelo.addRow(ticket);
clientes.setEnabled(false); //esto sirve para que una vez elegido el cliente no se modifique hasta finalizar la venta
noFijo.setEnabled(false);
ki.setText("");
can.setText(String.valueOf(1)); //establece la cantidad en 1 por que unicamente si es por kilos se vende por 1 gancho
 }
  } else { //este else es cuando hay un cliente selecionado en el combo box
ticket[0]=nom;
ticket[1]=pro;
ticket[2]=cant;
ticket[3]=kilos;
ticket[4]=precioFinal;//precio final por kilo
ticket[5]=precioFinal1;//precio final por unidad
modelo.addRow(ticket);
float total_f= Float.parseFloat(total.getText()); //cambia el valor de text a flotante
float totalxun_f=Float.parseFloat(totalxu.getText());
acumulador_precio+=total_f;
acumulador_precio+=totalxun_f; //acumula los totales
fi.setText(String.valueOf(acumulador_precio)); //se pasa de flotante a string y se muestra en un label
total.setText(String.valueOf(0.0));
totalxu.setText(String.valueOf(0.0)); //establece los totales en 0.0 para que no surga el error de string vacio
clientes.setEnabled(false); //esto sirve para que una vez elegido el cliente no se modifique hasta finalizar la venta
noFijo.setEnabled(false);
ki.setText("");
can.setText(String.valueOf(1)); //establece la cantidad en 1 por que unicamente si es por kilos se vende por 1 gancho
 }
   }
/*recomendacion nunca poner ningun dato que sea modificado al final de los if,
 por que si hay un campo vacio y ponemos que se reestablesca las cajas de texto al final
estas se borraran*/
tablaTicket.setModel(modelo);

}catch(NumberFormatException e){
System.out.println(e);
}
    }//GEN-LAST:event_otroProductoActionPerformed

    private void clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientesActionPerformed
String sql="SELECT clientes FROM id_clientes WHERE nombre='"+clientes.getSelectedItem()+"'";
try {
conexion=con.getConnection();
st=conexion.createStatement();
re=st.executeQuery(sql);
while(re.next()){
id_clientes=Integer.parseInt("id_clientes");
}
}
catch(Exception e){
}
    }//GEN-LAST:event_clientesActionPerformed

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        // TODO add your handling code here:
 Menu m=new Menu();
 m.setVisible(true);
 dispose();
    }//GEN-LAST:event_atrasActionPerformed

    private void clientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientesMouseClicked

    }//GEN-LAST:event_clientesMouseClicked

    private void canActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_canActionPerformed
 
 try{
 pxunidad=(float)Double.parseDouble(pxu.getText()); 
 /*cuando un producto requiera cantidad con esto 
 se hace el total sin los kilos*/
 cantidad=Integer.parseInt(can.getText()); 
 tu=pxunidad*cantidad;

 totalxu.setText(""+tu);// total es un label no una caja de texto por lo tanto no se le pueden cargar texto 
  }catch(Exception e){
 JOptionPane.showMessageDialog(null, "caracteres invalidos,solo se permite caracteres 0.0");
        }
    }//GEN-LAST:event_canActionPerformed

    private void finalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalizarActionPerformed
 String cliente=(String) clientes.getSelectedItem();
String nofijo=noFijo.getText();
 String producto=(String)productos1.getSelectedItem();
  int cantidad=Integer.parseInt(can.getText());
 float kilos=Float.parseFloat(ki.getText());
 float total_cantidad=Float.parseFloat(totalxu.getText()); //total de precio x unidad
  float total_kilos=Float.parseFloat(total.getText()); //total de precio x kilo
  String sql="INSERT INTO ventas(id_clientes,clienteFijo,clienteNofijo,id_producto,producto,cantidad,kilos,precio_cantidad,precio_kilo,total)"
  + "VALUES ('"+id_clientes+"','"+cliente+"',"+nofijo+"','"+id_producto+"','"+producto+"','"+cantidad+"'.'"+kilos+"','"+total_cantidad+"','"+total_kilos+"')";
   try{
   conexion=con.getConnection();
   st=conexion.createStatement();
   st.execute(sql);
   JOptionPane.showMessageDialog(null,"venta guardada");
   
   
   }
   catch (Exception e){}
    }//GEN-LAST:event_finalizarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
 JOptionPane.showMessageDialog(null, "espere,generando boleta");
  ArrayList<Reportes> lista = new ArrayList<>(); 
  Reportes datos1;
 String path = "src\\nuevo\\Boleta.jasper"; //Ponemos la localizacion del reporte creado
  JasperReport Boleta; // Instaciamos el objeto reporte y creamos el reporte.jasper
 lista.clear();
 try {
    for(int fila=0;fila<tablaTicket.getRowCount();fila++){ //recorremos los datos de la tabla
datos1=new Reportes(
 tablaTicket.getValueAt(fila,0).toString(), //y lo guardamos en el constructor de la clase Reportes
tablaTicket.getValueAt(fila,1).toString(),
tablaTicket.getValueAt(fila,2).toString(),
tablaTicket.getValueAt(fila,3).toString(),
tablaTicket.getValueAt(fila,5).toString(),
 tablaTicket.getValueAt(fila,4).toString());
 lista.add(datos1); //agregamos la variable datos al arrayList
}
Boleta= (JasperReport) JRLoader.loadObjectFromFile(path); //Se carga el reporte de su localizacion
 JasperPrint jprint = JasperFillManager.fillReport(Boleta, null, new JRBeanCollectionDataSource(lista)); //Agregamos los parametros para llenar el reporte
 JRViewer jv=new JRViewer(jprint);
 JDialog reporte=new JDialog();
 reporte.setSize(900, 700);
 reporte.setLocationRelativeTo(null);
 reporte.setTitle("BOLETA");
 reporte.getContentPane().add(jv);
 reporte.setDefaultCloseOperation(DISPOSE_ON_CLOSE); // Se declara con dispose_on_close para que no se cierre el programa cuando se cierre el reporte
 reporte.setVisible(true);
 /*JasperViewer vista= new JasperViewer(jprint, false); //Se crea la vista del reportes
vista.setDefaultCloseOperation(DISPOSE_ON_CLOSE); // Se declara con dispose_on_close para que no se cierre el programa cuando se cierre el reporte
vista.setVisible(true); //Se vizualiza el reporte */

        } catch (Exception e) {
                System.out.print(e) ; 
       
        }

       
       
       
       
       
       
       
    }//GEN-LAST:event_jButton3ActionPerformed
public void Productos(){ //metodo que trae los productos de la tabla de la db y los guarda en un combobox(productos1)
String sql="SELECT nombre_producto FROM productos";

try{
   productos1.addItem("Seleccione una opción");
 conexion=con.getConnection();
 st=conexion.createStatement();
 re=st.executeQuery(sql);

 while (re.next()){
 productos1.addItem(re.getString("nombre_producto"));
   }

}
catch(Exception e){
    System.out.println(""+e);
}

  con.Cerrar();
  }
public void Clientes(){ //metodo que trae los clientes de la tabla de la db y los guarda en un combobox(clientes)
String sql="SELECT nombre FROM clientes";
try{
 clientes.addItem("cliente no fijo");
 conexion=con.getConnection();
 st=conexion.createStatement();
 re=st.executeQuery(sql);
 while (re.next()){
  clientes.addItem(re.getString("nombre"));
   }

}
catch(Exception e){
    System.out.println(""+e);
}
 
}
void Bloqueo(){ /*metodo para cuando en el combobox no hay un cliente selecionado se habilite 
la caja de texto para ingresar cliente,caso contrario se desabilita*/
  String nom=(String) clientes.getSelectedItem();
 if(nom.equals("cliente no fijo"))
  {
   noFijo.setEnabled(true); 
 
 }
  else {
   
  noFijo.setEnabled(false);
  }

}

        
  public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
       
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atras;
    private javax.swing.JTextField can;
    private javax.swing.JComboBox<String> clientes;
    private javax.swing.JLabel fech;
    private javax.swing.JLabel fi;
    private javax.swing.JButton finalizar;
    private javax.swing.JLabel hora;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField ki;
    private javax.swing.JTextField noFijo;
    private javax.swing.JButton otroProducto;
    private javax.swing.JComboBox<String> productos1;
    private javax.swing.JLabel pxk;
    private javax.swing.JLabel pxu;
    private javax.swing.JTable tablaTicket;
    private javax.swing.JLabel total;
    private javax.swing.JLabel totalxu;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
}
