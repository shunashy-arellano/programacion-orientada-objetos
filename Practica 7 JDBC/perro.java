import java.sql.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;
import java.io.*;

public class perro extends JApplet implements ActionListener{
		JLabel etiqnombre;
		JLabel etiqraza;
		JLabel etiqedad;
		JLabel etiqgenero;
		JTextField campnom;
		JTextField campraza;
		JTextField campedad;
		JTextField campgen;
		JButton botConecta;
		JButton botInsert;

		Container c;

		//String url = "jdbc:mysql://localhost:3306/perros";
		String url = "jdbc:mysql://localhost:3306/perros?serverTimezone=UTC";
		//Sting url="jdbc:mysql://localhost/db?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC:3306/perros";
		//String dbName="perros";
	  	String userName = "root"; 
	  	String password = "nirvana";
	  	String driver = "com.mysql.cj.jdbc.Driver";

		Connection con=null;

		public perro(){}

		public void init(){
			etiqnombre= new JLabel("Nombre");
			etiqraza=new JLabel("Raza");
			etiqgenero=new JLabel("Genero");
			etiqedad=new JLabel("Edad");
			campnom=new JTextField(30);
			campraza=new JTextField(30);
			campedad=new JTextField(30);
			campgen=new JTextField(30);
			botConecta=new JButton ("CONECTA");
			botInsert=new JButton ("INSERTA");

			botConecta.addActionListener(this);
			botInsert.addActionListener(this);

			c=getContentPane();
			c.setLayout (new GridLayout (5,8));
			c.add(etiqnombre);
			c.add(campnom);
			c.add(etiqraza);
			c.add(campraza);
			c.add(etiqedad);
			c.add(campedad);
			c.add(etiqgenero);
			c.add(campgen);
			c.add(botConecta);
			c.add(botInsert);
		}

		public void actionPerformed(ActionEvent ae){
		JButton source = (JButton)ae.getSource();
		if(source==botConecta){

			try{
				Class.forName(driver);
				//con=DriverManager.getConnection(url+dbName,"root","nirvana");
				con=DriverManager.getConnection(url,userName,password);
				System.out.println("Conexion realizada con exito");
			} catch(Exception ex){
				System.err.println(ex);
			}
		}

		if(source==botInsert){
			try{
			String nombre = campnom.getText();
            String raza = campraza.getText();
            int edad = Integer.parseInt(campedad.getText());
            String genero = campgen.getText();

            String sql = "INSERT into perro values('"+nombre+"','"+raza+"',"+edad+",'"+genero+"')";

            Statement stmt = con.createStatement(); 
           // ResultSet result=stmt.executeUpdate("INSERT into perro values('"+nombre+"','"+raza+"',"+edad+",'"+genero+"')");
            int a= stmt.executeUpdate(sql);

            if (a == 1) {
                System.out.println("inserted successfully : "+sql); 
                con.close();
            }
            else{
                System.out.println("insertion failed"); 
                con.close();
            }
           /* while(result.next()){
            	System.out.println("inserted successfully : "+sql);
            }

            con.close();
            stmt.close();*/
        }
            catch (Exception ex){
                System.err.println(ex);
            }
		}

		}

	public static void main(String s[]){
		perro result=new perro ();
		result.init(); 
		result.start();
		Frame f=new Frame("JDBC Perros"); 
		f.add("Center", result);
        f.setSize(500, 200);
		f.setVisible(true);
	}

}