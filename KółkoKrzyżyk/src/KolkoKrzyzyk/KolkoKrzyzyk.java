package KolkoKrzyzyk;

import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class KolkoKrzyzyk extends JFrame{

	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
       KolkoKrzyzyk kik = new KolkoKrzyzyk();
       kik.setMinimumSize(new Dimension(400, 400));
       kik.setDefaultCloseOperation(EXIT_ON_CLOSE);
       kik.setResizable(false);
       kik.setTitle("Gra w Kó³ko i Krzyzyk");
       JPanel plansza = new JPanel();
       plansza.setLayout(new GridLayout(3,3));
       Element a[][]= new Element[3][3];
       int wyniki[][]= new int[3][3];
       for(int i=0;i<3;i++)
       {
           for(int j=0;j<3;j++)
           {
               a[i][j]= new Element();
               wyniki[i][j]=0;
           }
       }
       for(int i=0;i<3;i++)
       {
           for(int j=0;j<3;j++)
           {
               a[i][j].addActionListener(new ElementsListener(a, wyniki, plansza));
               plansza.add(a[i][j]);
           }
       }       
       kik.add(plansza);
       kik.setVisible(true);
    }
}