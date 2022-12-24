import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;


public class MarcoDig extends JFrame implements Runnable, ActionListener{
	
	private Thread MarcoThread;
	private ImageIcon imas[];
	private JLabel mensaje, Digital;
	private Container c;
	private JComboBox<Integer> combo;
	private int nume;
	
	
	public MarcoDig() {

		this.setTitle("Marco Digital");
		c=getContentPane();

		imas=new ImageIcon[10];
		imas[0]=new ImageIcon("nirvana.jpg");
		imas[1]=new ImageIcon("oasis.jpg");
		imas[2]=new ImageIcon("ozzy.jpg");
		imas[3]=new ImageIcon("pearljam.jpg");
		imas[4]=new ImageIcon("pink.jpg");
		imas[5]=new ImageIcon("poison.jpg");
		imas[6]=new ImageIcon("queen.jpg");
		imas[7]=new ImageIcon("radiohead.jpg");
		imas[8]=new ImageIcon("ramones.jpg");
		imas[9]=new ImageIcon("rhcp.jpg");
		
		mensaje=new JLabel();
		Digital=new JLabel();

	combo = new JComboBox<Integer>();
	combo.setBounds(0,0,148,20);
	combo.addItem(300);
	combo.addItem(500);
	combo.addItem(1000);
	combo.addItem(2000);
	add(combo);
	combo.setSelectedIndex(0);
	combo.addActionListener(this);
	nume = (Integer)combo.getSelectedItem();

	c.add(mensaje);
	c.add(Digital, BorderLayout.CENTER);
	setSize(400, 300);
	setVisible(true);

	//hilo=new Thread(this);
	//hilo.start();

	MarcoThread = new Thread(this);
	MarcoThread.start();
	
	}

	public void actionPerformed(ActionEvent e){
		nume = (Integer)combo.getSelectedItem();
	}

	public void run(){
       int i=0;
        while(true){
            Digital.setIcon(imas[i]);
            try{
            	 Thread.sleep(nume);
            }
            catch(Exception e){
            	 return;
            }
            i++;
            if(i>9) i=0; 
        }
	}
	

	public static void main(String[] args) {
		MarcoDig marco = new MarcoDig();
		marco.setVisible(true);
	}

}