package z1;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import java.awt.Cursor;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import javax.swing.SwingConstants;

import z1.z1;
//import z1.z2;
//import z1.z4;
//import z1.z5;
import z1.z6;

import javax.swing.LayoutStyle.ComponentPlacement;

public class Main {
	JMenuBar menuBar;
	JMenu menuPlik, menuPomoc, menuInfo,menuOpcje;
	JMenuItem mz1,mz2,mz3,mz4,mz5,mz6,mTwor,mZast;
	private JFrame frame;
	private JMenuItem mntmHelp;
	private JMenuItem mntmAutor;
	private JMenuItem mntmZadanie;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem mntmNewMenuItem_1;
	private JMenuItem mntmNewMenuItem_2;
	private JMenuItem mntmNewMenuItem_3;
	private JMenuItem mntmNewMenuItem_4;
	private JLabel lblNewLabel;
	
		public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		initComponents();
		createEvents();
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Plik");
		mnNewMenu.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
		menuBar.add(mnNewMenu);
		
		mntmZadanie = new JMenuItem("Zad1");
		mntmZadanie.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, 0));
		mntmZadanie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				z1 nw = new z1();
				nw.NewScreen();
				
					
				}
			}
		);
		mnNewMenu.add(mntmZadanie);
		mnNewMenu.addSeparator();
		mntmNewMenuItem = new JMenuItem("Zad2");
		mntmNewMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_2, 0));
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				z2 nw = new z2();
				nw.NewScreen();

			}
		
			});
		mnNewMenu.add(mntmNewMenuItem);
		mnNewMenu.addSeparator();
		mntmNewMenuItem_1 = new JMenuItem("Zad3");
		mntmNewMenuItem_1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_3, 0));
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	//			z3 nw = new z3();
		//		nw.NewScreen();
			}}
		);
		mnNewMenu.add(mntmNewMenuItem_1);
		mnNewMenu.addSeparator();
		mntmNewMenuItem_2 = new JMenuItem("Zad4");
		mntmNewMenuItem_2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_4, 0));
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				z4 nw = new z4();
				z4.NewScreen();
			}
		});
		mnNewMenu.add(mntmNewMenuItem_2);
		mnNewMenu.addSeparator();
		mntmNewMenuItem_3 = new JMenuItem("Zad5");
		mntmNewMenuItem_3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_5, 0));
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				z5 nw = new z5();
				nw.NewScreen();
			}
		});
		mnNewMenu.add(mntmNewMenuItem_3);
		mnNewMenu.addSeparator();
		mntmNewMenuItem_4 = new JMenuItem("Zad6");
		mntmNewMenuItem_4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_6, 0));
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				z6 nw = new z6();
				nw.NewScreen();
			}
		});
		mnNewMenu.add(mntmNewMenuItem_4);
		
		JMenu mnNewMenu_1 = new JMenu("Pomoc");
		menuBar.add(mnNewMenu_1);
		
		mntmHelp = new JMenuItem("Help");
		mntmHelp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Wybierz zadanie");
				}
			
		});
		mntmHelp.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_WINDOWS, 0));
		mnNewMenu_1.add(mntmHelp);
		
		
		JMenu mnNewMenu_2 = new JMenu("Informacje");
		menuBar.add(mnNewMenu_2);
		
		mntmAutor = new JMenuItem("Autor");
		mntmAutor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Krzysztof Starzak 249856");
			}
		});
		mnNewMenu_2.add(mntmAutor);
		
		lblNewLabel = new JLabel("APK GUI 9");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Calibri Black", Font.PLAIN, 34));
		
		JLabel lblWitamWszystkichDo = new JLabel("Aplikacja z listy 9");
		lblWitamWszystkichDo.setHorizontalAlignment(SwingConstants.CENTER);
		lblWitamWszystkichDo.setFont(new Font("Calibri Black", Font.PLAIN, 12));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(92)
							.addComponent(lblNewLabel))
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblWitamWszystkichDo, GroupLayout.PREFERRED_SIZE, 566, Short.MAX_VALUE)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(237, Short.MAX_VALUE)
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblWitamWszystkichDo, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
					.addGap(66))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
	private void createEvents() {
		// TODO Auto-generated method stub
		
	}

	private void initComponents() {
		// TODO Auto-generated method stub
		
	}
	private class SwingAction extends AbstractAction {
		
		private static final long serialVersionUID = 1L;
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	}


