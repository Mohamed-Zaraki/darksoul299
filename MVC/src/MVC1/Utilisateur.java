package MVC1;

import java.awt.BorderLayout;import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Utilisateur extends JFrame{

	private List<Personnne> Personnes = new ArrayList<>();
	JTextField  Name, Numero ;
	JLabel label_Nom , label_Num  , label_type;
	JButton button_Add , button_Edit , button_remove;
	JTable Text;
	JPanel InfoPanel  , TextPanel , ButtonPanel;
	JComboBox<String> Type;
	public Utilisateur()
	{
		
		this.setTitle("Contact");
		this.setSize(600, 600);
		this.setLayout(new BorderLayout());
		this.setResizable(false);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		ButtonPanel = new JPanel();
		TextPanel = new JPanel();
		InfoPanel = new JPanel();
		
		
		InfoPanel.setLayout(new GridLayout(1,1));
		Text = new JTable();
		
		InfoPanel.add(Text);
		TextPanel.setLayout(new GridLayout(1, 6));
		
		
		button_Add = new JButton("Add");
		button_Edit = new JButton("Edit");
		button_remove = new JButton("Remove");
		label_Nom = new JLabel("Le Nom:");
		label_Num = new JLabel("Le Numero:");
		Name = new JTextField();
		Numero = new JTextField();
		TextPanel.add(label_Nom);
		TextPanel.add(Name);
		TextPanel.add(label_Num);
		TextPanel.add(Numero);
		ButtonPanel.add(button_Add);
		ButtonPanel.add(button_Edit);
		ButtonPanel.add(button_remove);
		Type = new JComboBox<>(new String[]{"Travail" ,"Famille" , "Amis"});
		label_type = new JLabel("Type :");
		TextPanel.add(label_type);
		TextPanel.add(Type );
		
		this.add(ButtonPanel , BorderLayout.SOUTH);
		this.add(TextPanel , BorderLayout.NORTH);
		this.add(InfoPanel , BorderLayout.CENTER);
		this.setVisible(true);
	
	}
	
	 
	 
	
	
}
