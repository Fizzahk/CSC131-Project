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
		JMenu        helpMenu, optionsMenu, fileMenu, editMenu, historyMenu, viewMenu;
		JScrollPane  scrollpane;
		JMenuItem    menuItem; //Can add items inside the file, help, and options in menu bar
		JTextField   textField;
		JTextArea    textOfLongFormDisplay;
		JLabel       titleLabel;
		JButton      clearButton;

		//Creates and Adds a menu bar to the Pirex Frame
		menuBar     = new JMenuBar();
		fileMenu 	= new JMenu("File"); //Creates file Menu to the Menu Bar - Pawan (PK) Khatri
		helpMenu    = new JMenu("Help");
		optionsMenu = new JMenu("Options");
		editMenu    = new JMenu("Edit"); 
		historyMenu = new JMenu("History");
		viewMenu    = new JMenu("View");
		
		menuBar.add(fileMenu); //Adds file Menu to the Menu Bar - Pawan (PK) Khatri
		menuBar.add(viewMenu);
		menuBar.add(optionsMenu);
		menuBar.add(editMenu);
		menuBar.add(historyMenu);
		menuBar.add(helpMenu);

		//Creates File Menu Item (Exit) - Pawan (PK) Khatri
		JMenuItem exit = new JMenuItem("Exit", KeyEvent.VK_T);
		fileMenu.add(exit);
		
		//Creates Option Menu Item (Documents)
		JMenuItem optionsMenu11 = new JMenuItem("Documents");
		optionsMenu.add(optionsMenu11);
		
		frame.setJMenuBar(menuBar);
		
		//Creates Help Menu Item
	    menuItem = new JMenuItem("About",KeyEvent.VK_T);
	    helpMenu.add(menuItem);
	    
	    //Creates History Menu Item  
	  	JMenuItem historymenu1 = new JMenuItem("Recent Searches", KeyEvent.VK_T);
	  	historyMenu.add(historymenu1);
	  	
	    //Creates View Menu Item 
	  	JMenuItem viewmenu1= new JMenuItem("Zoom", KeyEvent.VK_T);
	  	viewMenu.add(viewmenu1);

	    //Adds Sub Item into View Menu Item
	    JMenuItem viewmenu2= new JMenuItem("Toggle Fullscreen", KeyEvent.VK_T);
        viewMenu.add(viewmenu2);
	    
  	    //Adds an action listener to the Options Menu Bar Item (Documents) - Pawan (PK) Khatri
  	    optionsMenu11.addActionListener(new ActionListener(){  
  	    public void actionPerformed(ActionEvent e){ 
  	    	JOptionPane.showMessageDialog(null,"This feature is currently unavailable.", "Documents",JOptionPane.WARNING_MESSAGE);
  	    }}); 
 	    
         //Adds an action listener to the View Menu Bar Item (Zoom) - Pawan (PK) Khatri
 	    viewmenu1.addActionListener(new ActionListener(){  
 	    public void actionPerformed(ActionEvent e){ 
 	    	JOptionPane.showMessageDialog(null,"This feature is currently unavailable.", "Zoom",JOptionPane.WARNING_MESSAGE);
 	    }});   
 	    
 	    //Adds an action listener to the View Menu Bar Item (Toggle Fullscreen) - Pawan (PK) Khatri
 	    viewmenu2.addActionListener(new ActionListener(){  
 	    public void actionPerformed(ActionEvent e){ 
 	    	JOptionPane.showMessageDialog(null,"This feature is currently unavailable.", "Toggle Fullscreen",JOptionPane.WARNING_MESSAGE);
 	    }}); 
 	    
 	    //Adds an action listener to the History Menu Bar Item (Recent Searches) - Pawan (PK) Khatri
 	    historymenu1.addActionListener(new ActionListener(){  
 	    public void actionPerformed(ActionEvent e){ 
 	    	JOptionPane.showMessageDialog(null,"This feature is currently unavailable.", "Recent Searches",JOptionPane.WARNING_MESSAGE);
 	    }}); 
         
         //Adds an action listener to the File Menu Bar Item (Exit) - Pawan (PK) Khatri
	    exit.addActionListener(new ActionListener(){  
	    public void actionPerformed(ActionEvent e){ 
	    	JOptionPane.showMessageDialog(null,"Press ALT-F4 (Windows) or ⌘Q (Mac) to EXIT this application.", "Close Application",JOptionPane.WARNING_MESSAGE);
	    }});   
	    
	    //Adds an action listener to the Help Menu Item
	    menuItem.addActionListener(new ActionListener(){  
	    public void actionPerformed(ActionEvent e){ 
	    	JOptionPane.showMessageDialog(null,"Pirex - (Personal Information Retrieval Experimental System) is an information \n retrieval system that individuals can use to investigate their own texts.",
	    			"About",JOptionPane.INFORMATION_MESSAGE);
	    }});    
 
		//Create the three tabs 
		tabbedPane = new JTabbedPane();
		contentPane.setLayout(new BorderLayout());
		contentPane.add(tabbedPane, BorderLayout.CENTER);

		//Creates Search Tab
		search = new JPanel();
		//search.setLayout(new BorderLayout()); Uncomment later for changes (choose a layout for each tab)
		tabbedPane.addTab("Search For Documents", search);
		
		//Title "Query"............................
	    titleLabel = new JLabel();
	    titleLabel.setText("Query:");
	    search.add(titleLabel);
	       
	    //Text area
	    textField = new JTextField(55);
	    search.add(textField);
	       
	    //clear button 
	    clearButton = new JButton();
		clearButton.setText("Clear");
		search.add(clearButton);
		//end clear button 
	       
	    //Text Short Form Dysplay
	    JTextArea ta = new JTextArea(10, 65);
	    ta.setLineWrap(true);
	    search.add(new JScrollPane(ta));
	      
	    //Text Long Form Dysplay
	    textOfLongFormDisplay = new JTextArea(10, 64);
	    JScrollPane  textOfLongFormDisplaySP = new JScrollPane(textOfLongFormDisplay,
	    JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
	    JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	    search.add(textOfLongFormDisplaySP,"South");
	     
	    clearButton.addActionListener(new ActionListener(){  
	    public void actionPerformed(ActionEvent e){ 
	    	textField.setText("");
	    	textOfLongFormDisplay.setText("");
	    	ta.setText("");
	    }});
	    
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
