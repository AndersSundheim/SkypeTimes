import javax.swing.JFrame;

public class Frame {
	private static void initGui(){
		JFrame frame = new JFrame("Skype Time");
		//frame.setDefaultCloseOperation(exiting());
		frame.setSize(300,150);
		//Frame m = new Frame();
		final Main f = new Main();
		frame.add(f);
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                initGui();
            }
        });	
	}
}
