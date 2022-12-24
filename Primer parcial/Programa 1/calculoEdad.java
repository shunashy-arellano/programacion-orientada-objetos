import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class calculoEdad extends Applet implements ActionListener{
	TextField anioNac;
	Button botCalc;
	Label etiqResul;
	//TextField resultado;

	public void init(){
	botCalc = new Button("Calcular");
	anioNac = new TextField (4);
	etiqResul = new Label("Edad actual: ");
	//resultado = new TextField(5);
	add(anioNac); add(botCalc); add(etiqResul);
	botCalc.addActionListener(this);
	}

	public void actionPerformed(ActionEvent ae){
	//Button source = (Button)e.getSource();
	if(ae.getSource()==botCalc){
		int anio= Integer.parseInt(anioNac.getText());
		int calculando = 2019-anio;
		etiqResul.setText("Edad actual:   " + calculando);
	} 
	}
	
	public static void main(String S[]){
		new calculoEdad();
	}
}
