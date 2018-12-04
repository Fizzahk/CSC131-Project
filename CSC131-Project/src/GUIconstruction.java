import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUIconstruction {
	
	public static void main(String[]args) {
		
		JFrame       frame = new JFrame("Pirex");
		Container    contentPane = frame.getContentPane();
		JPanel       search, load, summarize;
		JTabbedPane  tabbedPane;
		JMenuBar     menuBar;
		JMenu        helpMenu, optionsMenu, fileMenu;
		JScrollPane  scrollpane;
		JMenuItem    menuItem;; //Can add items inside the help and options in menu

		//Creates and Adds a menu bar to the Pirex Frame
		menuBar     = new JMenuBar();
		fileMenu 	= new JMenu("File"); //Creates file Menu to the Menu Bar - Pawan (PK) Khatri
		helpMenu    = new JMenu("Help");
		optionsMenu = new JMenu("Options");
		
		menuBar.add(fileMenu); //Adds file Menu to the Menu Bar - Pawan (PK) Khatri
		menuBar.add(helpMenu);
		menuBar.add(optionsMenu);
		JMenuItem optionsMenu11 = new JMenuItem("Documents");
		optionsMenu.add(optionsMenu11);
		frame.setJMenuBar(menuBar);
		
		//Creates Help Menu Item
	    menuItem = new JMenuItem("About",KeyEvent.VK_T);
	    helpMenu.add(menuItem);
	      
	    //Adds an action listener to the Help Menu Item
	    menuItem.addActionListener(new ActionListener(){  
	    public void actionPerformed(ActionEvent e){ 
	    JLabel label = new JLabel("Pirex - (Personal Information Retrieval Experimental System) is an information retrieval system that individuals can use to investigate their own texts..");
	    JOptionPane.showMessageDialog(null,label,"About",JOptionPane.INFORMATION_MESSAGE);
	    }});    
 
		//Create the three tabs 
		tabbedPane = new JTabbedPane();
		contentPane.setLayout(new BorderLayout());
		contentPane.add(tabbedPane, BorderLayout.CENTER);

		//Creates Search Tab
		search = new JPanel();
		//search.setLayout(new BorderLayout()); Uncomment later for changes (choose a layout for each tab)
		tabbedPane.addTab("Search For Documents", search);
		
	    
		//Creates Load Tab
		load = new JPanel();
		// load.setLayout(new BorderLayout());Uncomment later for changes (choose a layout for each tab)
		tabbedPane.addTab("Load Documents",  load);
		
		//Creates Summary Tab
		summarize = new JPanel();
		summarize.setLayout(new BorderLayout());
		tabbedPane.addTab("Summarize Documents",  summarize);
		scrollpane = new JScrollPane();
	    summarize.add(scrollpane, BorderLayout.CENTER);

		//The current frame is set to these 
	    frame.setSize(800,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setResizable(true); 
	
	}
}
