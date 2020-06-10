package noobchain;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.xml.bind.annotation.XmlElementDecl.GLOBAL;

import com.google.gson.Gson;



import java.awt.Dimension;
import java.awt.Font;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

import com.google.gson.Gson;


public class gui {
	
	public static void main(String args[]) throws Exception {
		
		//NoobChain.createwallet();
		//zip2();
		gettingstart();
	//disp.display();
		//getamt();
	}
	
	

	public static void gettingstart() {	
	 	JFrame frame = new JFrame("screen1");	 
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
	    ImageIcon gif1 = new ImageIcon("C:\\Users\\Tanmay Kadam\\Desktop\\2RNb.gif");
	    int width = 800;int height = 550;        
	    gif1.setImage(gif1.getImage().getScaledInstance(width, height,10));    
	    JLabel first_label;    
	    first_label= new JLabel("",gif1, SwingConstants.CENTER);   
	    JButton button1=new JButton("GETTING STARTED");
	    button1.setBackground(Color.black);
	    button1.setFont(new Font("Arial Black",Font.PLAIN,80));
		button1.setVisible(true);		
		button1.setBorderPainted(false);
		button1.setOpaque(true);
	    JPanel panel = new JPanel();
	    panel.setLayout(new FlowLayout());
	    panel.setBackground(Color.black);
	    panel.setPreferredSize(new Dimension(3780,3500));
	    panel.add(first_label);  
	    panel.add(button1);       
	    frame.getContentPane().add(panel);
	    frame.pack();
	    frame.setVisible(true);		
	    button1.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			JFrame frame1 = new JFrame("screen1");	 
		    frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
		    ImageIcon gif1 = new ImageIcon("C:\\Users\\Tanmay Kadam\\Desktop\\2RNb.gif");
		    int width = 800;int height = 550;        
		    gif1.setImage(gif1.getImage().getScaledInstance(width, height,10));    
		    JLabel first_label;    
		    first_label= new JLabel("",gif1, SwingConstants.CENTER);   
		    JButton button2=new JButton("ETHEREUM");
		    button2.setBackground(Color.black);
		    button2.setFont(new Font("Arial Black",Font.PLAIN,80));
			button2.setVisible(true);		
			button2.setBorderPainted(false);
			button2.setForeground(Color.yellow);
			
			JButton button3=new JButton("DPAY");
		    button3.setBackground(Color.black);
		    button3.setFont(new Font("Arial Black",Font.PLAIN,80));
			button3.setVisible(true);		
			button3.setBorderPainted(false);
			button3.setForeground(Color.yellow);
			String twoLines = "BITCOIN\nVALUE";
			button3.setOpaque(true);
			JButton button4=new JButton("<html>" + twoLines.replaceAll("\\n", "<br>") + "</html>");
		    button4.setBackground(Color.black);
		    button4.setFont(new Font("Arial Black",Font.PLAIN,80));
			button4.setVisible(true);		
			button4.setBorderPainted(false);
			button4.setForeground(Color.yellow);

			button3.setOpaque(true);
			JLabel label=new JLabel("MODE OF TRANSACTION");
			  label.setBackground(Color.black);
			    label.setFont(new Font("Arial Black",Font.PLAIN,80));
				label.setVisible(true);		
				label.setForeground(Color.yellow);

		    JPanel panel = new JPanel();
		    panel.setLayout(new FlowLayout());
		    panel.setBackground(Color.black);
		    panel.setPreferredSize(new Dimension(4780,3500));
		    panel.add(first_label);  
		    panel.add(label);
		    panel.add(button2);   
		    
		    panel.add(button3);
		    panel.add(button4); 
		    frame1.getContentPane().add(panel);
		    frame1.pack();
		    frame1.setVisible(true);
		    button4.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					try {
						zip2();
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				}});
		    button2.addActionListener(new ActionListener() {
		    
				@Override
				public void actionPerformed(ActionEvent e) {
					try {
					    Desktop.getDesktop().browse(new URL("https://focused-shannon-7daa78.netlify.com").toURI());
					} catch (Exception e1) {}
					
				}
		    	
		    });
		    button3.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					

					JFrame frame3 = new JFrame("screen1");	 
				    frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
				    ImageIcon gif1 = new ImageIcon("C:\\Users\\Tanmay Kadam\\Desktop\\2RNb.gif");
				   	int width = 650;int height = 760;        
				    gif1.setImage(gif1.getImage().getScaledInstance(width, height,10));    
				    JLabel page4;    
				    page4= new JLabel("",gif1, SwingConstants.CENTER);   
				   
				    
				    
				    JPanel panel3 = new JPanel();
				    frame3.setContentPane(panel3);
				    panel3.setLayout(new BoxLayout(panel3, BoxLayout.X_AXIS));
				   // panel3.setLayout(new FlowLayout(FlowLayout.LEFT,50,50));
				    
				    panel3.setBackground(Color.black);
				    panel3.setPreferredSize(new Dimension(4780,3500));
				 /*   JTextField textField = new JTextField(8);
			        textField.setBounds(5, 5, 20, 50); // to get height, set large font
			        textField.setFont(textField.getFont().deriveFont(25f));
			        JTextField textField1 = new JTextField(8);
			        textField1.setBounds(5, 5, 20, 50); // to get height, set large font
			        textField1.setFont(textField.getFont().deriveFont(25f));*/
				    JLabel createwa=new JLabel("GENISIS BLOCK");
				    createwa.setBackground(Color.black);
				    createwa.setFont(new Font("Arial Black",Font.PLAIN,20));
					createwa.setVisible(true);		
					createwa.setForeground(Color.yellow);
				   
				  
					
					
			      JPanel panel3a=new JPanel();
			      panel3a.setLayout(new BoxLayout(panel3a, BoxLayout.Y_AXIS));
			      JPanel panel3b=new JPanel();
			      JLabel temp=new JLabel("   For Wallet click Genisis Block");
			      temp.setFont(new Font("Serif Orange",Font.ITALIC,28));
			      temp.setForeground(Color.yellow);
			 //     temp.setFont(new Font("Arial Black",Font.PLAIN,20));
			      JLabel temp1=new JLabel("For details click Genisis details");
			      JLabel temp2=new JLabel("  SET DIFFICULTY");
			      JLabel temp3=new JLabel("b");
			      JLabel temp4=new JLabel("c");
			      JLabel temp5=new JLabel("LEVEL");
			      JLabel temp6=new JLabel("   TRANSFER");
			      JLabel temp7=new JLabel("  MONEY");
			      JLabel temp8=new JLabel(" USING");
			      JLabel temp9=new JLabel("DPAY   ");
			      JLabel temp10=new JLabel("  From WALLET A");
			      JLabel temp55=new JLabel("     TO WALLET B");			   
			      JLabel temp88=new JLabel("l");
			      JLabel temp99=new JLabel("m");
			      JLabel temp77=new JLabel("n");
			      JLabel temp111=new JLabel("o");
			     JPanel panel3a1=new JPanel();
			     JPanel panel3a2=new JPanel();
			     panel3a2.setLayout(new GridLayout(4,4));
			     panel3a2.setBackground(Color.blue);		    
			     temp6.setFont(new Font("Serif Orange",Font.ITALIC,28));
			      temp6.setForeground(Color.yellow);
			      temp2.setFont(new Font("Serif Orange",Font.ITALIC,28));
			      temp2.setForeground(Color.yellow);
			      temp5.setFont(new Font("Serif Orange",Font.BOLD,26));
			      temp5.setForeground(Color.yellow);
			      temp7.setFont(new Font("Serif Orange",Font.ITALIC,28));
			      temp7.setForeground(Color.yellow);
			      temp8.setFont(new Font("Serif Orange",Font.ITALIC,28));
			      temp8.setForeground(Color.yellow);
			      temp9.setFont(new Font("Serif Orange",Font.ITALIC,28));
			      temp9.setForeground(Color.yellow);
			      temp10.setFont(new Font("Serif Orange",Font.ITALIC,28));
				  temp10.setForeground(Color.yellow);
				  temp55.setFont(new Font("Serif Orange",Font.ITALIC,28));
				  temp55.setForeground(Color.yellow);
			      temp1.setFont(new Font("Arial Orange",Font.ITALIC,28));
			      temp1.setForeground(Color.yellow);
			      temp2.setFont(new Font("Arial Black",Font.PLAIN,20));
			      temp3.setFont(new Font("Arial Black",Font.PLAIN,20));
			      temp4.setFont(new Font("Arial Black",Font.PLAIN,20));
			      panel3a.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);	
			      JTextField diff = new JTextField(8);
				    diff.setFont(diff.getFont().deriveFont(50f));
			      JButton set=new JButton("diff");
				    set.setBackground(Color.black);
				    set.setFont(new Font("Arial ",Font.ITALIC,32));
					set.setVisible(true);		
					set.setBorderPainted(false);
					set.setForeground(Color.yellow);
					set.setOpaque(true);
					set.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							try {
							      int dif=Integer.parseInt(diff.getText());
							     setlevel(dif);
							      
							    }
							    catch (NumberFormatException ex) {
							      System.out.println("Not a number");
							      //do you want
							   }
						}

									});
					 JTextField from = new JTextField(8);
					    from.setFont(from.getFont().deriveFont(50f));
					   
					    JTextField to = new JTextField(8);
					    to.setFont(to.getFont().deriveFont(50f));
					 JButton submitbtn=new JButton("pay");
					 submitbtn.setBackground(Color.BLUE);
					 submitbtn.setFont(new Font("Arial ",Font.ITALIC,32));
					 submitbtn.setVisible(true);		
					 submitbtn.setBorderPainted(false);
					 submitbtn.setForeground(Color.yellow);
					 submitbtn.setOpaque(true);
					 submitbtn.addActionListener(new ActionListener() {

						 

						

						@Override
						public void actionPerformed(ActionEvent e) {
							try {
							     int walletamon=Integer.parseInt(from.getText());
							//    int walletbmon=Integer.parseInt(to.getText());
							      NoobChain.startservice(walletamon);
							     
							   //   System.out.println("Integer is: "+walletamon);
							 //     System.out.println("Integer is: "+walletbmon);
							     
							    }
							    catch (NumberFormatException ex) {
							      System.out.println("Not a number");
							      //do you want
							   }
						
						} });
					 BufferedImage myPicture = null;
					try {
						myPicture = ImageIO.read(new File("D:\\wbc.png"));
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					 JLabel picLabel = new JLabel(new ImageIcon(myPicture));
					 panel3a1.add(picLabel);
			  
			    
			  
			   panel3a1.setBackground(Color.black);
			   panel3a2.setBackground(Color.black);
			    panel3a2.add(temp2);
			      panel3a2.add(temp5);
			      panel3a2.add(diff);
			      panel3a2.add(set);
			      panel3a2.add(temp6);
			      panel3a2.add(temp7);
			      panel3a2.add(temp8);
			      panel3a2.add(temp9); 
			      panel3a2.add(temp10);	      
			      panel3a2.add(temp55);
			      panel3a2.add(from);
			    //  panel3a2.add(to);			      
			      panel3a2.add(submitbtn);
			  
			      panel3a2.add(temp77);
			      
			      panel3a2.add(temp99);
			      panel3a2.add(temp111);			      
			      panel3.add(panel3b);
			      panel3a.add(panel3a1);
			      panel3a.add(panel3a2);
					panel3b.setBackground(Color.black);
					panel3b.add(page4);
					panel3.add(panel3a);
					frame3.pack();
					frame3.setVisible(true);		     
				}
		    	
		    });
		   
		    }

		    
			
		
			
			
			
			
		
		
		
	});




	     
	}
	public static int difficulti;
	public static void setlevel(int a) {
	difficulti=a;
	System.out.print(difficulti);
		
}

	static int level;
	
	
	
	 public static void zip2() throws Exception {

         URL url = new URL("https://api.coindesk.com/v1/bpi/historical/close.json");
         InputStreamReader reader = new InputStreamReader(url.openStream());
         MyDto dto = new Gson().fromJson(reader, MyDto.class);

         // using the deserialized object
         Map<String, String> as=dto.bpi;
         Collection<String> values = as.values();
         String[] targetArray = values.toArray(new String[values.size()]);
     	Object[] objectArray = as.entrySet().toArray();

 		String show=(Arrays.toString(objectArray));
     //   System.out.println(result);
         System.out.println(dto.time);
         String[] key = as.keySet().toArray(new String[0]);
         as.size();
 		// get an array of values of the HashMap
 		String[] value = as.values().toArray(new String[0]);
 		Map<String, String> map1 = new TreeMap<String, String>();
 		String map3;
 		
 		
 		for (int i = 0; i < as.size(); i++) {
 			map1.put(key[i], value[i]);	}
 		
 		map3=map1.toString().replace(",", "\n\t[");
         
         StringBuffer sb=new StringBuffer();
         for (int i = 0; i < 1; i++) {
              sb.append(as);
         }
        
         UIManager.put("OptionPane.minimumSize",new Dimension(500,500)); 
         UIManager.put("OptionPane.maximumsize",new Dimension(500,800));
         UIManager.put("OptionPane.messageFont", new Font("Arial", Font.BOLD, 18));
        
         
        JOptionPane.showMessageDialog(null,""+map3);
     }

     private class MyDto {
         Map<String, String> bpi;
         Map<String, String> time;
       
     
 }
     
     
}

