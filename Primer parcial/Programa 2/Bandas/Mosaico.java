import java.awt.event.*;
import javax.swing.*;
import java.applet.*;
import java.awt.*;
import javax.imageio.*;
import java.io.*;
import java.awt.image.*;

public class Mosaico extends JApplet implements ActionListener {
	JButton boton[]= new JButton[40];
	JLabel mensaje;
        BufferedImage bimas[];
	Container c;
	public Mosaico(){}
	public void init(){
                c=getContentPane();
                bimas= new BufferedImage [40];
                bimas[0]=leeImagen("acdc.jpg");
                bimas[1]=leeImagen("aerosmith.jpg");
                bimas[2]=leeImagen("alicecooper.jpg");
                bimas[3]=leeImagen("arcticmonkeys.jpg");
                bimas[4]=leeImagen("beatles.jpg");
                bimas[5]=leeImagen("blacksabbath.jpg");
                bimas[6]=leeImagen("blur.jpg");
                bimas[7]=leeImagen("bowie.jpg");
                bimas[8]=leeImagen("doors.jpg");
                bimas[9]=leeImagen("foof.jpg");
                bimas[10]=leeImagen("gorillaz.jpg");
                bimas[11]=leeImagen("guns.jpg");
                bimas[12]=leeImagen("ironmaiden.jpg");
                bimas[13]=leeImagen("judas.jpg");
                bimas[14]=leeImagen("kiss.jpg");
                bimas[15]=leeImagen("led.jpg");
                bimas[16]=leeImagen("lynyrd.jpg");
                bimas[17]=leeImagen("metallica.jpg");
                bimas[18]=leeImagen("misfits.jpg");
                bimas[19]=leeImagen("motorhead.jpg");
                bimas[20]=leeImagen("nirvana.jpg");
                bimas[21]=leeImagen("oasis.jpg");
                bimas[22]=leeImagen("ozzy.jpg");
                bimas[23]=leeImagen("pearljam.jpg");
                bimas[24]=leeImagen("pink.jpg");
                bimas[25]=leeImagen("poison.jpg");
                bimas[26]=leeImagen("queen.jpg");
                bimas[27]=leeImagen("radiohead.jpg");
                bimas[28]=leeImagen("ramones.jpg");
                bimas[29]=leeImagen("rhcp.jpg");
                bimas[30]=leeImagen("rush.jpg");
		bimas[31]=leeImagen("scorpions.jpg");
		bimas[32]=leeImagen("sexpistols.jpg");
		bimas[33]=leeImagen("slayer.jpg");
		bimas[34]=leeImagen("strokes.jpg");
		bimas[35]=leeImagen("vanhalen.jpg");
		bimas[36]=leeImagen("ween.jpg");
		bimas[37]=leeImagen("whitesnake.jpg");
		bimas[38]=leeImagen("whitezombie.jpg");
		bimas[39]=leeImagen("who.jpg");
		
		for (int i=0; i<40; i++){
		boton[i] = new JButton(new ImageIcon(bimas[i]));
		}


                mensaje = new JLabel("           ");
		for(int i=0; i<40; i++){
		boton[i].addActionListener( this );
		}

		
		c.setLayout (new GridLayout (5,8));
		for (int i=0;i<40;i++){
		c.add (boton[i]);
		}

		c.add("South", mensaje);
		setSize(1000,1000);

		
	}
	public void actionPerformed ( ActionEvent e ){
		JButton b=(JButton)e.getSource();
		mensaje.setIcon( b.getIcon() );
	}
	public static void main(String s[]){
		Mosaico m=new Mosaico();
		m.init(); m.start();
		Frame f=new Frame("Mosaico"); 
		f.add("Center", m);
                f.setSize(1000, 1000);
		f.setVisible(true);
	}
        public BufferedImage leeImagen(String nombre){
  		BufferedImage imagen;
   		try {
      			imagen = ImageIO.read(new File(nombre));     
   		} catch (IOException e){
        		System.err.println(e+" "+nombre);
        		return null;
   		}
   		return imagen;
   	}
}

