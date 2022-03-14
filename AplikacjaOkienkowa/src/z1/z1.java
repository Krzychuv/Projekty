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
 
public class z1 {
 
 private JFrame frmZadanie;
 private JTextField tPaliwo;
 private JTextField tKilometry;
 private JButton bOblicz;
 private ButtonGroup bgWybor;
 float zpaliwo,zkilometry,zspalanie,zolej,zbenzyna,zkwotaoleju,zkwotabenzyny;
 private JTextField tOlej;
 private JTextField tBenzyna;
 
 /**
  * Launch the application.
  */
 public static void NewScreen() {
 EventQueue.invokeLater(new Runnable() {
 public void run() {
 try {
 z1 window = new z1();
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
 public z1() {
 initialize();
 }
 
 /**
  * Initialize the contents of the frame.
  */
 private void initialize() {
 frmZadanie = new JFrame();
 frmZadanie.setTitle("Zad1 Spalanie Paliwa");
 frmZadanie.setBounds(100, 100, 500, 300);
 frmZadanie.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
 
 
 
 JLabel lblOlejNapdowy = new JLabel("Olej napêdowy (ON)");
 lblOlejNapdowy.setFont(new Font("Calibri Black", Font.PLAIN, 20));
 
 JLabel lblBzyna = new JLabel("Benzyna (PB)");
 lblBzyna.setFont(new Font("Calibri Black", Font.PLAIN, 20));
 bgWybor = new ButtonGroup();
 
 JLabel lblWybierzPaliwo = new JLabel("Wybierz paliwo");
 lblWybierzPaliwo.setFont(new Font("Calibri Black", Font.PLAIN, 20));
 
 JLabel lblIloZatankowanegoPaliwa = new JLabel("Iloœc zatankowanego paliwa ( w L )");
 lblIloZatankowanegoPaliwa.setFont(new Font("Calibri Black", Font.PLAIN, 20));
 
 tPaliwo = new JTextField();
 tPaliwo.addActionListener(new ActionListener() {
 public void actionPerformed(ActionEvent e) {
 
 
 }
 });
 tPaliwo.setColumns(10);
 
 JLabel lblLiczbaPrzejechanychKilometrw = new JLabel("Liczba przejechanych kilometrów");
 lblLiczbaPrzejechanychKilometrw.setFont(new Font("Calibri Black", Font.PLAIN, 20));
 
 tKilometry = new JTextField();
 tKilometry.addActionListener(new ActionListener() {
 public void actionPerformed(ActionEvent e) {
 
 
 }
 });
 tKilometry.setColumns(10);
 
 bOblicz = new JButton("Oblicz");
 bOblicz.setFont(new Font("Calibri Black", Font.PLAIN, 20));
 bOblicz.addActionListener(new ActionListener() {
 public void actionPerformed(ActionEvent e) {
 
 
 zpaliwo =(float) Double.parseDouble(tPaliwo.getText());
 zkilometry = (float)Double.parseDouble(tKilometry.getText());
 
 zspalanie = (zpaliwo/zkilometry) * 100;
 
 zolej=(float) Double.parseDouble(tOlej.getText());
 zbenzyna=(float)Double.parseDouble(tBenzyna.getText());
 
 zkwotaoleju = zolej * zpaliwo;
 zkwotabenzyny = zbenzyna * zpaliwo;
 
 
 JOptionPane.showMessageDialog(null, "Tankuj¹c"+" "+ zpaliwo +" "+"litrów" + " "+"i przeje¿d¿aj¹c"+" "+ zkilometry+" "+"kilometrów\n"+ "twój samochód spali³ œrednio"+" "+zspalanie+" "+"litrów\n"+"Za olej napêdowy zap³acisz: "+zkwotaoleju+" "+"z³"+" "+"\n"+"Za benzynê zap³acisz: "+zkwotabenzyny+"z³");
 
 
 }
 });
 
 tOlej = new JTextField();
 tOlej.addActionListener(new ActionListener() {
 public void actionPerformed(ActionEvent e) {
 
 
 }
 });
 tOlej.setColumns(10);
 
 tBenzyna = new JTextField();
 tBenzyna.addActionListener(new ActionListener() {
 public void actionPerformed(ActionEvent e) {
 
 }
 });
 tBenzyna.setColumns(10);
 GroupLayout groupLayout = new GroupLayout(frmZadanie.getContentPane());
 groupLayout.setHorizontalGroup(
 	groupLayout.createParallelGroup(Alignment.TRAILING)
 		.addGroup(groupLayout.createSequentialGroup()
 			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
 				.addGroup(groupLayout.createSequentialGroup()
 					.addGap(45)
 					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
 						.addComponent(lblOlejNapdowy)
 						.addComponent(tOlej, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
 						.addComponent(lblLiczbaPrzejechanychKilometrw)
 						.addComponent(lblIloZatankowanegoPaliwa))
 					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
 						.addGroup(groupLayout.createSequentialGroup()
 							.addGap(18)
 							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
 								.addComponent(tPaliwo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
 								.addComponent(tKilometry, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
 								.addComponent(bOblicz, Alignment.TRAILING)))
 						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
 							.addPreferredGap(ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
 							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
 								.addComponent(tBenzyna, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
 								.addComponent(lblBzyna))
 							.addGap(91))))
 				.addGroup(groupLayout.createSequentialGroup()
 					.addGap(179)
 					.addComponent(lblWybierzPaliwo)))
 			.addContainerGap())
 );
 groupLayout.setVerticalGroup(
 	groupLayout.createParallelGroup(Alignment.LEADING)
 		.addGroup(groupLayout.createSequentialGroup()
 			.addGap(10)
 			.addComponent(lblWybierzPaliwo)
 			.addPreferredGap(ComponentPlacement.RELATED)
 			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
 				.addComponent(lblOlejNapdowy)
 				.addComponent(lblBzyna))
 			.addPreferredGap(ComponentPlacement.RELATED)
 			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
 				.addComponent(tOlej, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
 				.addComponent(tBenzyna, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
 			.addGap(31)
 			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
 				.addComponent(lblLiczbaPrzejechanychKilometrw)
 				.addComponent(tKilometry, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
 			.addPreferredGap(ComponentPlacement.UNRELATED)
 			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
 				.addComponent(lblIloZatankowanegoPaliwa)
 				.addComponent(tPaliwo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
 			.addGap(18)
 			.addComponent(bOblicz)
 			.addContainerGap(41, Short.MAX_VALUE))
 );
 frmZadanie.getContentPane().setLayout(groupLayout);
 }
 }