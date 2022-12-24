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
		

		boton[0] = new JButton(new ImageIcon(bimas[0]));
		boton[1] = new JButton(new ImageIcon(bimas[1]));
		boton[2] = new JButton(new ImageIcon(bimas[2]));
		boton[3] = new JButton(new ImageIcon(bimas[3]));
		boton[4] = new JButton(new ImageIcon(bimas[4]));
		boton[5] = new JButton(new ImageIcon(bimas[5]));
		boton[6] = new JButton(new ImageIcon(bimas[6]));
		boton[7] = new JButton(new ImageIcon(bimas[7]));
		boton[8] = new JButton(new ImageIcon(bimas[8]));
		boton[9] = new JButton(new ImageIcon(bimas[9]));
		boton[10] = new JButton(new ImageIcon(bimas[10]));
		boton[11] = new JButton(new ImageIcon(bimas[11]));
		boton[12] = new JButton(new ImageIcon(bimas[12]));
		boton[13] = new JButton(new ImageIcon(bimas[13]));
		boton[14] = new JButton(new ImageIcon(bimas[14]));
		boton[15] = new JButton(new ImageIcon(bimas[15]));
		boton[16] = new JButton(new ImageIcon(bimas[16]));
		boton[17] = new JButton(new ImageIcon(bimas[17]));
		boton[18] = new JButton(new ImageIcon(bimas[18]));
		boton[19] = new JButton(new ImageIcon(bimas[19]));
		boton[20] = new JButton(new ImageIcon(bimas[20]));
		boton[21] = new JButton(new ImageIcon(bimas[21]));
		boton[22] = new JButton(new ImageIcon(bimas[22]));
		boton[23] = new JButton(new ImageIcon(bimas[23]));
		boton[24] = new JButton(new ImageIcon(bimas[24]));
		boton[25] = new JButton(new ImageIcon(bimas[25]));
		boton[26] = new JButton(new ImageIcon(bimas[26]));
		boton[27] = new JButton(new ImageIcon(bimas[27]));
		boton[28] = new JButton(new ImageIcon(bimas[28]));
		boton[29] = new JButton(new ImageIcon(bimas[29]));
		boton[30] = new JButton(new ImageIcon(bimas[30]));
		boton[31] = new JButton(new ImageIcon(bimas[31]));
		boton[32] = new JButton(new ImageIcon(bimas[32]));
		boton[33] = new JButton(new ImageIcon(bimas[33]));
		boton[34] = new JButton(new ImageIcon(bimas[34]));
		boton[35] = new JButton(new ImageIcon(bimas[35]));
		boton[36] = new JButton(new ImageIcon(bimas[36]));
		boton[37] = new JButton(new ImageIcon(bimas[37]));
		boton[38] = new JButton(new ImageIcon(bimas[38]));
		boton[39] = new JButton(new ImageIcon(bimas[39]));


                mensaje = new JLabel("           ");
		boton[0].addActionListener( this );
		boton[1].addActionListener( this );
		boton[2].addActionListener( this );
		boton[3].addActionListener( this );
		boton[4].addActionListener( this );
		boton[5].addActionListener( this );
		boton[6].addActionListener( this );
		boton[7].addActionListener( this );
		boton[8].addActionListener( this );
		boton[9].addActionListener( this );
		boton[10].addActionListener( this );
		boton[11].addActionListener( this );
		boton[12].addActionListener( this );
		boton[13].addActionListener( this );
		boton[14].addActionListener( this );
		boton[15].addActionListener( this );
		boton[16].addActionListener( this );
		boton[17].addActionListener( this );
		boton[18].addActionListener( this );
		boton[19].addActionListener( this );
		boton[20].addActionListener( this );
		boton[21].addActionListener( this );
		boton[22].addActionListener( this );
		boton[23].addActionListener( this );
		boton[24].addActionListener( this );
		boton[25].addActionListener( this );
		boton[26].addActionListener( this );
		boton[27].addActionListener( this );
		boton[28].addActionListener( this );
		boton[29].addActionListener( this );
		boton[30].addActionListener( this );
		boton[31].addActionListener( this );
		boton[32].addActionListener( this );
		boton[33].addActionListener( this );
		boton[34].addActionListener( this );
		boton[35].addActionListener( this );
		boton[36].addActionListener( this );
		boton[37].addActionListener( this );
		boton[38].addActionListener( this );
		boton[39].addActionListener( this );
		
		int i=0;
		//Colocación en el contenedor
		c.setLayout (new GridLayout (5,8));
		for (i=0;i<40;i++){
		c.add (boton[i]);
		setSize(1000,1000);
		c.add("South", mensaje);
		}

		
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

