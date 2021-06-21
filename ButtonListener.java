					 
					 import javax.swing.*;
					 import java.awt.*;
					 import java.awt.event.*;
					 
					class ButtonListener implements ActionListener{
						
						
						
									@Override	
									public void actionPerformed(ActionEvent event){
										
										
										
										JButton theClickedButton = (JButton) event.getSource();
										String text = theClickedButton.getText();
										
										
										
										if( text.equals("->") ){
										
										
													if( StartsInSky.rodeX <=600 ){
													
														StartsInSky.rodeX+=15;
														
													}
													
													else {}
										}
										
										else if( text.equals("<-") ){
											
											
											if( StartsInSky.rodeX >=0 ){
												   StartsInSky.rodeX-=15;
											
													}
																		
											else{}
											
										}
										
									
									} //  method 
						
					} //class
					
					