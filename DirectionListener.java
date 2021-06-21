

				import java.awt.event.*;

				class DirectionListener implements KeyListener{
					
					
					// 37 39
					
					@Override
					
					public void keyPressed(KeyEvent event){
						
						////////////
						
						
						
										String text = new String( ""+event.getKeyCode() );
										
										
										
										if( text.equals("39") ){
										
										
													if( StartsInSky.rodeX <=600 ){
													
														StartsInSky.rodeX+=15;
														
													}
													
													else {}
										}
										
										else if( text.equals("37") ){
											
											
											if( StartsInSky.rodeX >=0 ){
												   StartsInSky.rodeX-=15;
											
													}
																		
											else{}
											
										}
						
						
						////////
						
						
						
					}
					
					@Override
					public void keyReleased(KeyEvent event){}
					
					@Override
					public void keyTyped(KeyEvent event){}
					
					
					
					
					
					
				}