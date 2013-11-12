
package celebrity;

import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Main
{
    JFrame frame;
    JPanel panel;
    ArrayList<JLabel> imageList;
    ArrayList<String> nameList;
    JLabel imageLabel;
    // 3.  Get celebrity photos from the internet (google images/celebrity faces), save them on your disk, and fill in their locations here...
    String firstImage = "/Users/VicMini/NetBeansProjects/Celebrity/src/celebrity/face1.jpeg";
    String secondImage = "/pathtofile/example2.jpg";
    String thirdImage = "/pathtofile/example3.jpg";
    String playerGuess;
    int score = 0;
    JLabel j;

    public static void main(String[] args)
    {
        Main main = new Main();
        main.getGoing();
    }

    public void getGoing()
    {
    	frame = new  JFrame();
    	frame.setSize(100,100);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setVisible(true);
    	imageLabel = loadImage("/Users/ethanhyde/Desktop/6a00d834515edc69e200e54f29c8e38834-800wi-1.jpg");
    	
    	
    	
    	imageList = new ArrayList<JLabel>();
    	nameList = new ArrayList<String>();
        //4.  Instantiate ArrayLists for celebrity names and celebrity images...use JLabels for                            images
        imageList = new ArrayList<JLabel>();
        nameList = new ArrayList<String>();
        //5.  Fill the celebrity name ArrayList with String names of the celebrities
        nameList.add("Obama");
        nameList.add("walrus");
        //6.  Fill the celebrity image ArrayList with String names of the image files
        imageLabel = loadImage("/Users/ethanhyde/Desktop/obama_epic_failure_xlarge_xlarge.png");
        imageList.add(imageLabel);
        imageLabel = loadImage("/Users/ethanhyde/Desktop/6a00d834515edc69e200e54f29c8e38834-800wi-1.jpg");
        imageList.add(imageLabel);
        
        //7. Go through the ArrayLists and check to see if the user matches the celebrity name with the celebrity image
        for (int i = 0; i < imageList.size(); i++)
        {
        	frame.add(imageList.get(i));
        	frame.pack();
        	String who = JOptionPane.showInputDialog("Who is this?");
        	if (who.equals(nameList.get(i))) {
				JOptionPane.showMessageDialog(null, "You got it");
			}
        	else {
				JOptionPane.showMessageDialog(null, "You're dumb. You don't even know who " + nameList.get(i) + " is.");
			}
        	//frame.removeAll();
         }
	// 8.  Use a JOptionPane.showMessageDialog() to show the percentage of right answers the player got.
  
        System.exit(0);
    }

    private JLabel loadImage(String fileName)// This method gets an image if you send it the image file name.
    {
        Icon icon = new ImageIcon(fileName);
        JLabel image = new JLabel(icon);
        return image;
    }
}


