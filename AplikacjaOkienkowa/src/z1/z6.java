package z1;

import java.awt.EventQueue;
import java.awt.Frame;
 
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
 
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.WindowConstants;
import javax.swing.JRadioButton;
import java.awt.TextField;
import java.awt.Window;
 
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
 
public class z6 {
 
 private JFrame frmZadanie;
 private JButton bOblicz;
 private ButtonGroup bgWybor;
 float tempDrugi,tempPierwsz , tempWynik;
 private JTextField tDrugi;
 private JTextField tPierwsz;
 
 /**
  * Launch the application.
  */
 public static void NewScreen() {
 EventQueue.invokeLater(new Runnable() {
 public void run() {
 try {
 z6 window = new z6();
 window.frmZadanie.setVisible(true);
 
 } catch (Exception e) {
 e.printStackTrace();
 }
 }
 });
 }
 
 
 /**
  * Create the application.
  */
 public z6() {
 initialize();
 }
 
 /**
  * Initialize the contents of the frame.
  */
 private void initialize() {
 frmZadanie = new JFrame();
 frmZadanie.setTitle("Zad6 Egzamin");
 frmZadanie.setBounds(100, 100, 500, 300);
 frmZadanie.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
 
 
 
 JLabel lblOlejNapdowy = new JLabel("Pierwszy Egzamin");
 lblOlejNapdowy.setFont(new Font("Calibri Black", Font.PLAIN, 20));
 
 JLabel lblBzyna = new JLabel("Drugi Egzamin");
 lblBzyna.setFont(new Font("Calibri Black", Font.PLAIN, 20));
 bgWybor = new ButtonGroup();
 
 JLabel lblWybierzPaliwo = new JLabel("Wpisz Wyniki");
 lblWybierzPaliwo.setFont(new Font("Calibri Black", Font.PLAIN, 20));
 
 bOblicz = new JButton("Oblicz");
 bOblicz.setFont(new Font("Calibri Black", Font.PLAIN, 20));
 bOblicz.addActionListener(new ActionListener() {
 public void actionPerformed(ActionEvent e) {
 
 

 
 tempDrugi=(float) Double.parseDouble(tDrugi.getText());
 tempPierwsz=(float)Double.parseDouble(tPierwsz.getText());
 
 tempWynik = tempDrugi + tempPierwsz;
 if(tempWynik>39 || tempWynik == 79) {
	 JOptionPane.showMessageDialog(null, "Zda³eœ! Twój wynik to : "+" "+ tempWynik );}
 else if(tempWynik<39) {
 JOptionPane.showMessageDialog(null, "Niestety, tym razem siê nie uda³o: "+" "+ tempWynik   );
	 
	 }
	 else if(tempWynik>79) {
	 JOptionPane.showMessageDialog(null, "Wynik egzaminu: "+" "+ tempWynik+ "+Gratuluje, ocena bardzo dobra!" );
 }
	 else if(tempWynik>59) {
	 JOptionPane.showMessageDialog(null, "Wynik egzaminu:"+" "+ tempWynik+ "+Gratuluje, ocena dobra!" );
	 
	 }
 
 }
 }
 
 );

 tDrugi = new JTextField();
 tDrugi.addActionListener(new ActionListener() {
 public void actionPerformed(ActionEvent e) {
 
 
 }
 });
 tDrugi.setColumns(10);
 
 tPierwsz = new JTextField();
 tPierwsz.addActionListener(new ActionListener() {
 public void actionPerformed(ActionEvent e) {
 
 }
 });
 tPierwsz.setColumns(10);
 GroupLayout groupLayout = new GroupLayout(frmZadanie.getContentPane());
 groupLayout.setHorizontalGroup(
 	groupLayout.createParallelGroup(Alignment.TRAILING)
 		.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
 			.addGap(45)
 			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
 				.addComponent(tPierwsz, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
 				.addComponent(lblBzyna)
 				.addComponent(lblWybierzPaliwo)
 				.addGroup(groupLayout.createSequentialGroup()
 					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
 						.addComponent(lblOlejNapdowy)
 						.addComponent(tDrugi, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
 					.addPreferredGap(ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
 					.addComponent(bOblicz)))
 			.addContainerGap())
 );
 groupLayout.setVerticalGroup(
 	groupLayout.createParallelGroup(Alignment.LEADING)
 		.addGroup(groupLayout.createSequentialGroup()
 			.addContainerGap()
 			.addComponent(lblWybierzPaliwo)
 			.addGap(5)
 			.addComponent(lblOlejNapdowy)
 			.addPreferredGap(ComponentPlacement.RELATED)
 			.addComponent(tDrugi, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
 			.addPreferredGap(ComponentPlacement.UNRELATED)
 			.addComponent(lblBzyna)
 			.addGap(18)
 			.addComponent(tPierwsz, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
 			.addGap(31)
 			.addComponent(bOblicz)
 			.addContainerGap(39, Short.MAX_VALUE))
 );
 frmZadanie.getContentPane().setLayout(groupLayout);
 }
 }

