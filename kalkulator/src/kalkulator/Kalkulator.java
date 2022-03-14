package kalkulator;

import java.awt.BorderLayout;
import java.math.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.MenuKeyEvent;

import org.w3c.dom.events.Event;

import javax.swing.*;

import java.awt.*;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Panel;
import java.awt.Color;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Kalkulator extends JFrame {
	private JTextField wartosc_K;
	private JTextField wartosc_P1;
	private JTextField wartosc_P2;
	private JTextField podstawa;
	private JTextField wysokosc;
	private JTextField wartosc_Rw1;
	private JTextField wysokosc_Rw;
	private JTextField wartosc_Tr1;
	private JTextField wartosc_Tr2;
	private JTextField wysokosc_Tr;
	private JTextField wartosc_R;
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Kalkulator frame = new Kalkulator();
					frame.setVisible(true);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Kalkulator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 int szer = Toolkit.getDefaultToolkit().getScreenSize().width; 
	        int wys = Toolkit.getDefaultToolkit().getScreenSize().height; 
	        setTitle("Obliczanie pola figur");
	        this.setSize(603, 540);
	       
	        int szerRamki = this.getSize().width;
	        int wysRamki = this.getSize().height;
	        
	        this.setLocation((szer-szerRamki)/2, (wys-wysRamki)/2);
		getContentPane().setLayout(null);
		
		JPanel g�rny_panel = new JPanel();
		g�rny_panel.setBackground(Color.GRAY);
		g�rny_panel.setBounds(0, 0, szerRamki, 44);
		getContentPane().add(g�rny_panel);
		g�rny_panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnKwadrat = new JButton("Kwadrat");
		g�rny_panel.add(btnKwadrat);
		
		JButton btnProstok�t = new JButton("Prostok\u0105t");
		g�rny_panel.add(btnProstok�t);
		
		JButton btnTr�jk�t = new JButton("Tr\u00F3jk\u0105t");
		g�rny_panel.add(btnTr�jk�t);
		
		JButton btnR�wnoleg�obok = new JButton("R\u00F3wnoleg\u0142obok");
		g�rny_panel.add(btnR�wnoleg�obok);
		
		JButton btnTrapez = new JButton("Trapez");
		g�rny_panel.add(btnTrapez);
		
		JButton btnKo�o = new JButton("Ko\u0142o");
		g�rny_panel.add(btnKo�o);
		
		JPanel dolny_panel = new JPanel();
		dolny_panel.setBounds(0, 44, szerRamki, wysRamki);
		getContentPane().add(dolny_panel);
		dolny_panel.setLayout(new CardLayout(0, 0));
		
		JPanel kwadrat = new JPanel();
		kwadrat.setBackground(Color.LIGHT_GRAY);
		dolny_panel.add(kwadrat, "name_1498440820799000");
		GridBagLayout gbl_kwadrat = new GridBagLayout();
		gbl_kwadrat.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_kwadrat.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_kwadrat.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_kwadrat.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		kwadrat.setLayout(gbl_kwadrat);
		
		JLabel lblWarto��_K = new JLabel("Bok A");
		lblWarto��_K.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblWarto��_K = new GridBagConstraints();
		gbc_lblWarto��_K.insets = new Insets(0, 0, 5, 5);
		gbc_lblWarto��_K.gridx = 1;
		gbc_lblWarto��_K.gridy = 1;
		kwadrat.add(lblWarto��_K, gbc_lblWarto��_K);
		
		wartosc_K = new JTextField();
		wartosc_K.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				 if (!Liczba(e.getKeyChar()))
				        e.consume();
			}
		});
		wartosc_K.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_wartosc_K = new GridBagConstraints();
		gbc_wartosc_K.insets = new Insets(0, 0, 5, 0);
		gbc_wartosc_K.fill = GridBagConstraints.HORIZONTAL;
		gbc_wartosc_K.gridx = 5;
		gbc_wartosc_K.gridy = 1;
		kwadrat.add(wartosc_K, gbc_wartosc_K);
		wartosc_K.setColumns(10);
				
		JButton btnOblicz_K = new JButton("Oblicz");
		
		btnOblicz_K.setFont(new Font("Tahoma", Font.BOLD, 30));
		GridBagConstraints gbc_btnOblicz_K = new GridBagConstraints();
		gbc_btnOblicz_K.insets = new Insets(0, 0, 0, 5);
		gbc_btnOblicz_K.gridx = 1;
		gbc_btnOblicz_K.gridy = 9;
		kwadrat.add(btnOblicz_K, gbc_btnOblicz_K);
		
		JLabel lblSuma_K = new JLabel("0");
		lblSuma_K.setHorizontalAlignment(SwingConstants.CENTER);
		lblSuma_K.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblSuma_K = new GridBagConstraints();
		gbc_lblSuma_K.gridx = 5;
		gbc_lblSuma_K.gridy = 9;
		kwadrat.add(lblSuma_K, gbc_lblSuma_K);
		btnOblicz_K.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int Bok_Kw = Integer.parseInt(wartosc_K.getText());
				
				int wynik_K = Bok_Kw*Bok_Kw;
				
				lblSuma_K.setText(Integer.toString(wynik_K));
				if (wynik_K<=0) {
					lblSuma_K.setText("Wprowadzono b��dne liczby");
				}
			}
		});
		
		JPanel prostok�t = new JPanel();
		prostok�t.setBackground(Color.LIGHT_GRAY);
		dolny_panel.add(prostok�t, "name_1498446393214600");
		GridBagLayout gbl_prostok�t = new GridBagLayout();
		gbl_prostok�t.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_prostok�t.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_prostok�t.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_prostok�t.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		prostok�t.setLayout(gbl_prostok�t);
		
		JLabel lblWarto��_P1 = new JLabel("Bok A");
		lblWarto��_P1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblWarto��_P1 = new GridBagConstraints();
		gbc_lblWarto��_P1.insets = new Insets(0, 0, 5, 5);
		gbc_lblWarto��_P1.gridx = 1;
		gbc_lblWarto��_P1.gridy = 1;
		prostok�t.add(lblWarto��_P1, gbc_lblWarto��_P1);
		
		wartosc_P1 = new JTextField();
		wartosc_P1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				 if (!Liczba(e.getKeyChar()))
				        e.consume();
			}
		});
		wartosc_P1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		wartosc_P1.setColumns(10);
		GridBagConstraints gbc_wartosc_P1 = new GridBagConstraints();
		gbc_wartosc_P1.insets = new Insets(0, 0, 5, 0);
		gbc_wartosc_P1.fill = GridBagConstraints.HORIZONTAL;
		gbc_wartosc_P1.gridx = 5;
		gbc_wartosc_P1.gridy = 1;
		prostok�t.add(wartosc_P1, gbc_wartosc_P1);
		
		JLabel lblWarto��_P2 = new JLabel("Bok B");
		lblWarto��_P2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblWarto��_P2 = new GridBagConstraints();
		gbc_lblWarto��_P2.insets = new Insets(0, 0, 5, 5);
		gbc_lblWarto��_P2.gridx = 1;
		gbc_lblWarto��_P2.gridy = 3;
		prostok�t.add(lblWarto��_P2, gbc_lblWarto��_P2);
		
		wartosc_P2 = new JTextField();
		wartosc_P2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				 if (!Liczba(e.getKeyChar()))
				        e.consume();
			}
		});
		wartosc_P2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		wartosc_P2.setColumns(10);
		GridBagConstraints gbc_wartosc_P2 = new GridBagConstraints();
		gbc_wartosc_P2.insets = new Insets(0, 0, 5, 0);
		gbc_wartosc_P2.fill = GridBagConstraints.HORIZONTAL;
		gbc_wartosc_P2.gridx = 5;
		gbc_wartosc_P2.gridy = 3;
		prostok�t.add(wartosc_P2, gbc_wartosc_P2);
		
		JButton btnOblicz_P = new JButton("Oblicz");
		
		btnOblicz_P.setFont(new Font("Tahoma", Font.BOLD, 30));
		GridBagConstraints gbc_btnOblicz_P = new GridBagConstraints();
		gbc_btnOblicz_P.insets = new Insets(0, 0, 5, 5);
		gbc_btnOblicz_P.gridx = 1;
		gbc_btnOblicz_P.gridy = 9;
		prostok�t.add(btnOblicz_P, gbc_btnOblicz_P);
		
		JLabel lblSuma_P = new JLabel("0");
		lblSuma_P.setHorizontalAlignment(SwingConstants.CENTER);
		lblSuma_P.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblSuma_P = new GridBagConstraints();
		gbc_lblSuma_P.insets = new Insets(0, 0, 5, 0);
		gbc_lblSuma_P.gridx = 5;
		gbc_lblSuma_P.gridy = 9;
		prostok�t.add(lblSuma_P, gbc_lblSuma_P);
		btnOblicz_P.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					int Bok_P1 = Integer.parseInt(wartosc_P1.getText());
					int Bok_P2 = Integer.parseInt(wartosc_P2.getText());
										
					int wynik_P = Bok_P1*Bok_P2;
					
					lblSuma_P.setText(Integer.toString(wynik_P));
					if (wynik_P<=0) {
						lblSuma_P.setText("Wprowadzono b��dne liczby");
					}
				}
			});
		
		JPanel tr�jk�t = new JPanel();
		tr�jk�t.setBackground(Color.LIGHT_GRAY);
		dolny_panel.add(tr�jk�t, "name_1498448356926100");
		GridBagLayout gbl_tr�jk�t = new GridBagLayout();
		gbl_tr�jk�t.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_tr�jk�t.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_tr�jk�t.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_tr�jk�t.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		tr�jk�t.setLayout(gbl_tr�jk�t);
		
		JLabel lblPodstawa = new JLabel("Podstawa");
		lblPodstawa.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblPodstawa = new GridBagConstraints();
		gbc_lblPodstawa.insets = new Insets(0, 0, 5, 5);
		gbc_lblPodstawa.gridx = 1;
		gbc_lblPodstawa.gridy = 1;
		tr�jk�t.add(lblPodstawa, gbc_lblPodstawa);
		
		podstawa = new JTextField();
		podstawa.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
					 if (!Liczba(e.getKeyChar()))
					        e.consume();
			}
		});
		podstawa.setFont(new Font("Tahoma", Font.PLAIN, 30));
		podstawa.setColumns(10);
		GridBagConstraints gbc_podstawa = new GridBagConstraints();
		gbc_podstawa.insets = new Insets(0, 0, 5, 0);
		gbc_podstawa.fill = GridBagConstraints.HORIZONTAL;
		gbc_podstawa.gridx = 5;
		gbc_podstawa.gridy = 1;
		tr�jk�t.add(podstawa, gbc_podstawa);
		
		JLabel lblWysoko�� = new JLabel("Wysoko\u015B\u0107");
		lblWysoko��.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblWysoko�� = new GridBagConstraints();
		gbc_lblWysoko��.insets = new Insets(0, 0, 5, 5);
		gbc_lblWysoko��.gridx = 1;
		gbc_lblWysoko��.gridy = 3;
		tr�jk�t.add(lblWysoko��, gbc_lblWysoko��);
		
		wysokosc = new JTextField();
		wysokosc.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				 if (!Liczba(e.getKeyChar()))
				        e.consume();
			}
		});
		wysokosc.setFont(new Font("Tahoma", Font.PLAIN, 30));
		wysokosc.setColumns(10);
		GridBagConstraints gbc_wysokosc = new GridBagConstraints();
		gbc_wysokosc.insets = new Insets(0, 0, 5, 0);
		gbc_wysokosc.fill = GridBagConstraints.HORIZONTAL;
		gbc_wysokosc.gridx = 5;
		gbc_wysokosc.gridy = 3;
		tr�jk�t.add(wysokosc, gbc_wysokosc);
		
		JButton btnOblicz_T = new JButton("Oblicz");
		
		btnOblicz_T.setFont(new Font("Tahoma", Font.BOLD, 30));
		GridBagConstraints gbc_btnOblicz_T = new GridBagConstraints();
		gbc_btnOblicz_T.insets = new Insets(0, 0, 5, 5);
		gbc_btnOblicz_T.gridx = 1;
		gbc_btnOblicz_T.gridy = 9;
		tr�jk�t.add(btnOblicz_T, gbc_btnOblicz_T);
		
		JLabel lblSuma_T = new JLabel("0");
		lblSuma_T.setHorizontalAlignment(SwingConstants.CENTER);
		lblSuma_T.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblSuma_T = new GridBagConstraints();
		gbc_lblSuma_T.insets = new Insets(0, 0, 5, 0);
		gbc_lblSuma_T.gridx = 5;
		gbc_lblSuma_T.gridy = 9;
		tr�jk�t.add(lblSuma_T, gbc_lblSuma_T);
		btnOblicz_T.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int Podstawa = Integer.parseInt(podstawa.getText());
				int Wysoko�� = Integer.parseInt(wysokosc.getText());
				
				int wynik_T = (Podstawa*Wysoko��)/2;
				
				lblSuma_T.setText(Integer.toString(wynik_T));
				if (wynik_T<=0) {
					lblSuma_P.setText("Wprowadzono b��dne liczby");
				}
			}
		});
		
		JPanel r�wnoleg�obok = new JPanel();
		r�wnoleg�obok.setBackground(Color.LIGHT_GRAY);
		dolny_panel.add(r�wnoleg�obok, "name_1505096275314200");
		GridBagLayout gbl_r�wnoleg�obok = new GridBagLayout();
		gbl_r�wnoleg�obok.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_r�wnoleg�obok.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_r�wnoleg�obok.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_r�wnoleg�obok.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		r�wnoleg�obok.setLayout(gbl_r�wnoleg�obok);
		
		JLabel lblWarto��_Rw1 = new JLabel("Bok A");
		lblWarto��_Rw1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblWarto��_Rw1 = new GridBagConstraints();
		gbc_lblWarto��_Rw1.insets = new Insets(0, 0, 5, 5);
		gbc_lblWarto��_Rw1.gridx = 1;
		gbc_lblWarto��_Rw1.gridy = 1;
		r�wnoleg�obok.add(lblWarto��_Rw1, gbc_lblWarto��_Rw1);
		
		wartosc_Rw1 = new JTextField();
		wartosc_Rw1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				 if (!Liczba(e.getKeyChar()))
				        e.consume();
			}
		});
		wartosc_Rw1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		wartosc_Rw1.setColumns(10);
		GridBagConstraints gbc_wartosc_Rw1 = new GridBagConstraints();
		gbc_wartosc_Rw1.insets = new Insets(0, 0, 5, 0);
		gbc_wartosc_Rw1.fill = GridBagConstraints.HORIZONTAL;
		gbc_wartosc_Rw1.gridx = 5;
		gbc_wartosc_Rw1.gridy = 1;
		r�wnoleg�obok.add(wartosc_Rw1, gbc_wartosc_Rw1);
		
		JLabel lblWysoko��_Rw = new JLabel("Wysoko\u015B\u0107");
		lblWysoko��_Rw.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblWysoko��_Rw = new GridBagConstraints();
		gbc_lblWysoko��_Rw.insets = new Insets(0, 0, 5, 5);
		gbc_lblWysoko��_Rw.gridx = 1;
		gbc_lblWysoko��_Rw.gridy = 3;
		r�wnoleg�obok.add(lblWysoko��_Rw, gbc_lblWysoko��_Rw);
		
		wysokosc_Rw = new JTextField();
		wysokosc_Rw.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				 if (!Liczba(e.getKeyChar()))
				        e.consume();
			}
		});
		wysokosc_Rw.setFont(new Font("Tahoma", Font.PLAIN, 30));
		wysokosc_Rw.setColumns(10);
		GridBagConstraints gbc_wysokosc_Rw = new GridBagConstraints();
		gbc_wysokosc_Rw.insets = new Insets(0, 0, 5, 0);
		gbc_wysokosc_Rw.fill = GridBagConstraints.HORIZONTAL;
		gbc_wysokosc_Rw.gridx = 5;
		gbc_wysokosc_Rw.gridy = 3;
		r�wnoleg�obok.add(wysokosc_Rw, gbc_wysokosc_Rw);
		
		JButton btnOblicz_Rw = new JButton("Oblicz");
		
		btnOblicz_Rw.setFont(new Font("Tahoma", Font.BOLD, 30));
		GridBagConstraints gbc_btnOblicz_Rw = new GridBagConstraints();
		gbc_btnOblicz_Rw.insets = new Insets(0, 0, 5, 5);
		gbc_btnOblicz_Rw.gridx = 1;
		gbc_btnOblicz_Rw.gridy = 9;
		r�wnoleg�obok.add(btnOblicz_Rw, gbc_btnOblicz_Rw);
		
		JLabel lblSuma_Rw = new JLabel("0");
		lblSuma_Rw.setHorizontalAlignment(SwingConstants.CENTER);
		lblSuma_Rw.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblSuma_Rw = new GridBagConstraints();
		gbc_lblSuma_Rw.insets = new Insets(0, 0, 5, 0);
		gbc_lblSuma_Rw.gridx = 5;
		gbc_lblSuma_Rw.gridy = 9;
		r�wnoleg�obok.add(lblSuma_Rw, gbc_lblSuma_Rw);
		btnOblicz_Rw.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int Bok_Rw1 = Integer.parseInt(wartosc_Rw1.getText());
				int Wysoko��_Rw = Integer.parseInt(wysokosc_Rw.getText());
				
				int wynik_Rw = Bok_Rw1*Wysoko��_Rw;
				
				lblSuma_Rw.setText(Integer.toString(wynik_Rw));
				if (wynik_Rw<=0) {
					lblSuma_P.setText("Wprowadzono b��dne liczby");
				}
			}
		});
		
		JPanel trapez = new JPanel();
		trapez.setBackground(Color.LIGHT_GRAY);
		dolny_panel.add(trapez, "name_1505167745848800");
		GridBagLayout gbl_trapez = new GridBagLayout();
		gbl_trapez.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_trapez.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_trapez.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_trapez.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		trapez.setLayout(gbl_trapez);
		
		JLabel lblWarto��_Tr1 = new JLabel("Bok A");
		lblWarto��_Tr1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblWarto��_Tr1 = new GridBagConstraints();
		gbc_lblWarto��_Tr1.insets = new Insets(0, 0, 5, 5);
		gbc_lblWarto��_Tr1.gridx = 1;
		gbc_lblWarto��_Tr1.gridy = 1;
		trapez.add(lblWarto��_Tr1, gbc_lblWarto��_Tr1);
		
		wartosc_Tr1 = new JTextField();
		wartosc_Tr1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				 if (!Liczba(e.getKeyChar()))
				        e.consume();
			}
		});
		wartosc_Tr1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		wartosc_Tr1.setColumns(10);
		GridBagConstraints gbc_wartosc_Tr1 = new GridBagConstraints();
		gbc_wartosc_Tr1.insets = new Insets(0, 0, 5, 0);
		gbc_wartosc_Tr1.fill = GridBagConstraints.HORIZONTAL;
		gbc_wartosc_Tr1.gridx = 5;
		gbc_wartosc_Tr1.gridy = 1;
		trapez.add(wartosc_Tr1, gbc_wartosc_Tr1);
		
		JLabel lblWarto��_Tr2 = new JLabel("Bok B");
		lblWarto��_Tr2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblWarto��_Tr2 = new GridBagConstraints();
		gbc_lblWarto��_Tr2.insets = new Insets(0, 0, 5, 5);
		gbc_lblWarto��_Tr2.gridx = 1;
		gbc_lblWarto��_Tr2.gridy = 3;
		trapez.add(lblWarto��_Tr2, gbc_lblWarto��_Tr2);
		
		wartosc_Tr2 = new JTextField();
		wartosc_Tr2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				 if (!Liczba(e.getKeyChar()))
				        e.consume();
			}
		});
		wartosc_Tr2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		wartosc_Tr2.setColumns(10);
		GridBagConstraints gbc_wartosc_Tr2 = new GridBagConstraints();
		gbc_wartosc_Tr2.insets = new Insets(0, 0, 5, 0);
		gbc_wartosc_Tr2.fill = GridBagConstraints.HORIZONTAL;
		gbc_wartosc_Tr2.gridx = 5;
		gbc_wartosc_Tr2.gridy = 3;
		trapez.add(wartosc_Tr2, gbc_wartosc_Tr2);
		
		JLabel lblWysoko��_Tr = new JLabel("Wysoko\u015B\u0107");
		lblWysoko��_Tr.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblWysoko��_Tr = new GridBagConstraints();
		gbc_lblWysoko��_Tr.insets = new Insets(0, 0, 5, 5);
		gbc_lblWysoko��_Tr.gridx = 1;
		gbc_lblWysoko��_Tr.gridy = 5;
		trapez.add(lblWysoko��_Tr, gbc_lblWysoko��_Tr);
		
		wysokosc_Tr = new JTextField();
		wysokosc_Tr.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				 if (!Liczba(e.getKeyChar()))
				        e.consume();
			}
		});
		wysokosc_Tr.setFont(new Font("Tahoma", Font.PLAIN, 30));
		wysokosc_Tr.setColumns(10);
		GridBagConstraints gbc_wysokosc_Tr = new GridBagConstraints();
		gbc_wysokosc_Tr.insets = new Insets(0, 0, 5, 0);
		gbc_wysokosc_Tr.fill = GridBagConstraints.HORIZONTAL;
		gbc_wysokosc_Tr.gridx = 5;
		gbc_wysokosc_Tr.gridy = 5;
		trapez.add(wysokosc_Tr, gbc_wysokosc_Tr);
		
		JButton btnOblicz_Tr = new JButton("Oblicz");
		
		btnOblicz_Tr.setFont(new Font("Tahoma", Font.BOLD, 30));
		GridBagConstraints gbc_btnOblicz_Tr = new GridBagConstraints();
		gbc_btnOblicz_Tr.insets = new Insets(0, 0, 0, 5);
		gbc_btnOblicz_Tr.gridx = 1;
		gbc_btnOblicz_Tr.gridy = 8;
		trapez.add(btnOblicz_Tr, gbc_btnOblicz_Tr);
		
		JLabel lblSuma_Tr = new JLabel("0");
		lblSuma_Tr.setHorizontalAlignment(SwingConstants.CENTER);
		lblSuma_Tr.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblSuma_Tr = new GridBagConstraints();
		gbc_lblSuma_Tr.gridx = 5;
		gbc_lblSuma_Tr.gridy = 8;
		trapez.add(lblSuma_Tr, gbc_lblSuma_Tr);
		
		JPanel ko�o = new JPanel();
		ko�o.setBackground(Color.LIGHT_GRAY);
		dolny_panel.add(ko�o, "name_1059417665260799");
		GridBagLayout gbl_ko�o = new GridBagLayout();
		gbl_ko�o.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_ko�o.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_ko�o.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_ko�o.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		ko�o.setLayout(gbl_ko�o);
		
		JLabel lblWarto��_R = new JLabel("Warto\u015B\u0107 R");
		lblWarto��_R.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblWarto��_R = new GridBagConstraints();
		gbc_lblWarto��_R.insets = new Insets(0, 0, 5, 5);
		gbc_lblWarto��_R.gridx = 1;
		gbc_lblWarto��_R.gridy = 1;
		ko�o.add(lblWarto��_R, gbc_lblWarto��_R);
		
		wartosc_R = new JTextField();
		wartosc_R.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(!Liczba(e.getKeyChar()))
					e.consume();
			}
		});
		wartosc_R.setFont(new Font("Tahoma", Font.PLAIN, 30));
		wartosc_R.setColumns(10);
		GridBagConstraints gbc_wartosc_R = new GridBagConstraints();
		gbc_wartosc_R.insets = new Insets(0, 0, 5, 0);
		gbc_wartosc_R.fill = GridBagConstraints.HORIZONTAL;
		gbc_wartosc_R.gridx = 5;
		gbc_wartosc_R.gridy = 1;
		ko�o.add(wartosc_R, gbc_wartosc_R);
		
		JButton btnOblicz_Ko = new JButton("Oblicz");
		btnOblicz_Ko.setFont(new Font("Tahoma", Font.BOLD, 30));
		GridBagConstraints gbc_btnOblicz_Ko = new GridBagConstraints();
		gbc_btnOblicz_Ko.insets = new Insets(0, 0, 0, 5);
		gbc_btnOblicz_Ko.gridx = 1;
		gbc_btnOblicz_Ko.gridy = 10;
		ko�o.add(btnOblicz_Ko, gbc_btnOblicz_Ko);
		
		JLabel lblSuma_Ko = new JLabel("0");
		lblSuma_Ko.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblSuma_Ko.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblSuma_Ko = new GridBagConstraints();
		gbc_lblSuma_Ko.gridx = 5;
		gbc_lblSuma_Ko.gridy = 10;
		ko�o.add(lblSuma_Ko, gbc_lblSuma_Ko);
		btnOblicz_Ko.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {		
				double Wartosc_R = Double.parseDouble(wartosc_R.getText());
								
				double wynik_Ko = Math.PI*(Wartosc_R*Wartosc_R);
				
				lblSuma_Ko.setText(Double.toString(wynik_Ko));
				if (wynik_Ko<=0) {
					lblSuma_Ko.setText("Wprowadzono b��dne liczby");
				}
			}
		});
		
		
		btnKwadrat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				kwadrat.setVisible(true);
				prostok�t.setVisible(false);
				tr�jk�t.setVisible(false);
				r�wnoleg�obok.setVisible(false);
				trapez.setVisible(false);
				ko�o.setVisible(false);
			}
		});
		
		btnProstok�t.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			kwadrat.setVisible(false);
			prostok�t.setVisible(true);
			tr�jk�t.setVisible(false);
			r�wnoleg�obok.setVisible(false);
			trapez.setVisible(false);
			ko�o.setVisible(false);
			}
		});
		
		btnTr�jk�t.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			kwadrat.setVisible(false);
			prostok�t.setVisible(false);
			tr�jk�t.setVisible(true);
			r�wnoleg�obok.setVisible(false);
			trapez.setVisible(false);
			ko�o.setVisible(false);
			}
		});
		
		btnR�wnoleg�obok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			kwadrat.setVisible(false);
			prostok�t.setVisible(false);
			tr�jk�t.setVisible(false);
			r�wnoleg�obok.setVisible(true);
			trapez.setVisible(false);
			ko�o.setVisible(false);
			}
		});
				
		btnTrapez.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			kwadrat.setVisible(false);
			prostok�t.setVisible(false);
			tr�jk�t.setVisible(false);
			r�wnoleg�obok.setVisible(false);
			trapez.setVisible(true);
			ko�o.setVisible(false);
			}
		});
		
		btnKo�o.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			kwadrat.setVisible(false);
			prostok�t.setVisible(false);
			tr�jk�t.setVisible(false);
			r�wnoleg�obok.setVisible(false);
			trapez.setVisible(false);
			ko�o.setVisible(true);
			}
		});
	}
	private boolean Liczba(char zn)
	{
	    if (zn >= '0' && zn <= '9')
	     return true;
	    
	    return false;
	}
}