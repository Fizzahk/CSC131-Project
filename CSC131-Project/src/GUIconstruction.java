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
		JMenu        helpMenu, optionsMenu; 
		JScrollPane  scrollpane;
		//JMenuItem    item; Can add items inside the help and options in menu

		//create and add the menu bar to the frame
		menuBar     = new JMenuBar();
		helpMenu    = new JMenu("Help");
		optionsMenu = new JMenu("Options");
		menuBar.add(helpMenu);
		menuBar.add(optionsMenu);
		JMenuItem optionsMenu11 = new JMenuItem("Documents");
		optionsMenu.add(optionsMenu11);
		frame.setJMenuBar(menuBar);

		//Create the three tabs 
		tabbedPane = new JTabbedPane();
		contentPane.setLayout(new BorderLayout());
		contentPane.add(tabbedPane, BorderLayout.CENTER);

		search = new JPanel();
		//search.setLayout(new BorderLayout()); Uncomment later for changes (choose a layout for each tab)
		tabbedPane.addTab("Search For documents", search);


		load = new JPanel();
		// load.setLayout(new BorderLayout());Uncomment later for changes (choose a layout for each tab)
		tabbedPane.addTab("Load Documents",  load);

		 
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
