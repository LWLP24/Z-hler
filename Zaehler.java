import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.applet.*;
import javax.swing.*;


public class zaehlen extends Applet implements ActionListener {
TextField Zahl = new TextField();
Button plus = new Button("+");
Label Zahl2 = new Label("Zahl");
Label ausgabe = new Label("mach!");

int count;

public void init() {
	count = 0;
	setSize(500, 500);
	add(Zahl2);
	add(Zahl);
	add(plus);
	add(ausgabe);
	setLayout(new GridLayout(0, 3));
	
	plus.addActionListener(this);
}


public void actionPerformed(ActionEvent e) {
	
	
	if(e.getSource() == plus) {
		if(Zahl.getText().equals("")){
			count++;
			Zahl.setText(String.valueOf(count));
		}else{
			try{
				count = Integer.parseInt(Zahl.getText()); //Setzt den Inhalt von (test) in den Integer (count) und wandelt diesen dabei in einen Integer um.
				count++;
				Zahl.setText(String.valueOf(count)); //Nimmt den Wert aus "count" und wandelt diesen in einen String um.
			} catch(NumberFormatException d) {				
				ausgabe.setText("Das geht net!");
				Zahl.setText("");
			}

			
			
			
		}
		
				 
			
		
	
		}
	}
}

