 public interface ElementsFactory{
 	JFrame createJFrame();
 	JLabel createJLabel();
 	JText createJText();
 	JButton createJButton();
 }

 public class AuthenticationWindow implements ElementsFactory{
 	public JFrame createJFrame(){
 		return new AuthenticationFrame();
 	}
 

 	public JLabel createJLabel(){
 		return new AuthenticationLabel();
	}
 
 
 	public JText createJText(){
 		return new AuthenticationText();
	}
 
 
 	public JFrame createJButton(){
 		return new AuthenticationButton();

 	}
 }

  public class MainWindow implements ElementsFactory{
 	public JFrame createJFrame(){
 		return new MainFrame();
 	}
 

 	public JLabel createJLabel(){
 		return new MainLabel();
	}
 
 
 	public JText createJText(){
 		return new MainText();
	}
 
 
 	public JFrame createJButton(){
 		return new MainButton();

 	}
 }