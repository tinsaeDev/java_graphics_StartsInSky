
				// Stars in the Sky
				// Author: Tinsae Belay
				
				
				import javax.swing.*;
				import java.awt.*;
				import java.awt.event.*;
				import java.util.Random;


				public class StartsInSky extends JTextArea implements ActionListener {
				
					JFrame frame;
					JFrame controlFrame;
					
						JPanel superPane;
						JPanel animaPane;
						
						JPanel controlPane;
						
						JButton leftMove;
						JButton rightMove;
						
						Random random;
					
					int Xincrement;
					
					
					public static int rodeX = 50;
					public static boolean reachedRight;
					
					public static int Yloc = 270;
					public static int Xloc = 50;
					int mistakes;
					
					public static boolean YReachedMax = false;
					public static boolean XReachedMax = false;
					public static boolean losst;
					

					
					public StartsInSky(){
					
					
					
					
						this.setSize(500,500);
					
						this.addKeyListener( new DirectionListener() );
					
						frame = new JFrame(); 
					
						JPanel panel = new JPanel();
						
						panel.add(this);
						
						frame.add(this);
						frame.setSize(700,500);
						frame.setVisible(true);
						frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						
						controlPane.add(this);
						controlPane.setSize(700,500);
						controlPane.setVisible(true);
						
						
						
					}
					
					
					
					@Override
					public void paintComponent(Graphics f){
						
						System.out.println("Inside paintComponent");
						
					}
					
					
					@Override
					public void actionPerformed(ActionEvent event){
						
						
						Graphics2D g = (Graphics2D) getGraphics();
						paintComponent(g);
						
						g.setStroke( new BasicStroke(10) );
						
						
						g.setColor( Color.BLACK );
						g.fillRect(0,0,600,400);
						
						
						if( Yloc <= 0 || Yloc >= 310 ){ // if Y is at extrems change the 
							
							
							
							random = new Random( System.nanoTime()  );
							Xincrement = random.nextInt( 10 );
							
												
						}
						
						
						if( Yloc >= 310 ){
							
							
											
							
						if( Xloc >= rodeX && Xloc <= rodeX+150 ){
							
							
						}
						
						else{
							
							mistakes++;
							losst =  true;
							
						}
							
							
						}
									
						// g.drawLine( rodeX,310,rodeX+150,310 );
						// g.fillOval( Xloc,Yloc,25,25 );
						

					
						
						
						
						
							
						g.setColor( Color.RED );
						g.drawString("Mistakes :"+mistakes,400,30);
						g.drawLine( rodeX,325,rodeX+150,325 );
						g.setColor( Color.YELLOW );
						g.fillOval( 550,150,50,50);
					
				// Y Managment
					
						if(YReachedMax){
								
								Yloc+=5;
								
								if (losst){
								
								if(Yloc>=600){
									
									YReachedMax = false;
									Yloc = 0;
									losst =false;
								}
									
									
								}
								
								else{
									
								if(Yloc>=310){
									
									YReachedMax = false;
									
								}	
									
								}
								
								
							
						}
						
						else{
							
							Yloc-=5;
							if(Yloc<=0){
								
								YReachedMax = true;
							}
						
						}
						
				// X Managment
				
				
						if(XReachedMax){
							
							Xloc = Xloc-Xincrement;
							if( Xloc <= 0 ){
								
								XReachedMax = false;
							}							
							
							
						}
						
						else{
							
							
							Xloc = Xloc+Xincrement;
							if( Xloc >= 600 ){
								
								XReachedMax = true;
							}
							
							
						}
						
						
						g.setColor(Color.RED);
						g.fillOval(Xloc,Yloc,25,25 );
						
					}
									
							
					public static void main(String[] ff){
					
					StartsInSky sky = new StartsInSky();
								sky.setBackground( Color.BLUE );
					
						Timer t = new Timer(20,sky);
							  t.start();
						
				
					
					}
				
					}
					