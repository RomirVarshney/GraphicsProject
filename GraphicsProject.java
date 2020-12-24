 
/*
 * Output:
 *  
 */
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.lang.Object;
import java.awt.Color;
import java.util.*;
import java.awt.*;
public class GraphicsProject extends JPanel {
  public void paint(Graphics g) {
  	// Background color
  	Color sky = new Color(188,216,244);
  	// Color for the second building
  	Color two = new Color(200,200,200);
  	// The window tint in the second building
  	Color tint = new Color(240,240,240);
  	// Color for the third building
  	Color three = new Color(148,148,148);
  	// Color for the fourth building
  	Color four = new Color(192,184,140);
  	// Color for the door of the fourth building
  	Color door = new Color(172,44,0);
  	// Color for the fifth building
  	Color five = new Color(132,140,100);
  	
  	
  	//Background
  	g.setColor(sky);
  	g.fillRect(0,0,630,480);
  	// Rectangle for the Road
  	g.setColor(Color.black);
    g.fillRect(15, 411, 600, 60);
    // The Sun
    g.setColor(Color.yellow);
    g.fillOval(140,55,60,60);
    // The white rectangles that serve as the middle of the road
    g.setColor(Color.white);
    g.fillRect(15,436,10,10);
    g.fillRect(65,436, 30,10);
    g.fillRect(150,436, 30,10);
    g.fillRect(235,436, 30,10);
    g.fillRect(320,436, 30,10);
    g.fillRect(405,436, 30,10);
    g.fillRect(490,436, 30,10);
    g.fillRect(575,436, 30,10);
    
    // Leftmost building, bottom to top
    // Main rectangle of first building
    g.setColor(Color.white);
    g.fillRect(81,270, 76,127);
    g.setColor(Color.black);
    g.drawRect(81,270, 76,127);
    //The top rectangle above it
    g.setColor(Color.lightGray);
    g.fillRect(81,261, 76,10);
    g.setColor(Color.black);
    g.drawRect(81,260, 76,10);
    // Extra Rectangles
    g.setColor(Color.lightGray);
    g.fillRect(60,407, 107,3);
    g.fillRect(68,402, 99,5);
    g.fillRect(72,397, 95,5);
    g.setColor(Color.black);
    g.drawRect(60,407, 107,3);
    g.drawRect(68,402, 99,5);
    g.drawRect(72,397, 95,5);
    // Main lines of the building, going across the building
    int y = 283;
    for(int i = 0; i < 19; i++)
    {
    	g.drawLine(81,y, 157,y);
    	y = y + 6;
    }
    // The top retangle parts of the building
    g.setColor(Color.lightGray);
    g.fillRect(78,270, 82,7);
    g.setColor(Color.black);
    g.drawRect(78,270, 82,7);
    // This is the top of the building, antenna, and the box under it
    g.setColor(Color.lightGray);
    g.fillRect(108,251, 38,10);
    g.setColor(Color.black);
    g.drawRect(108,251, 38,10);
    // Antenna of the building
    g.setColor(Color.lightGray);
    g.fillRect(120,218,3,32);
    g.setColor(Color.black);
    g.drawRect(120,218,3,32);
    // Main lines of the building, going along the building
    int length1 = 86;
    for(int i2 = 0; i2 < 9; i2++)
    {
    	g.drawLine(length1,278,length1,397);
    	length1 = length1 + 8;
    }
    // The two rectangle things sticking out the sides
    g.setColor(Color.lightGray);
    g.fillRect(75,372,6,25);
    g.fillRect(157,372,6,25);
    g.setColor(Color.black);
    g.drawRect(75,372,6,25);
    g.drawRect(157,372,6,25);
    
    // Second building, one of the main rectangles
    g.setColor(two);
    g.fillRect(170,247,77,130);
    g.setColor(Color.black);
    g.drawRect(170,247,77,130);
    // Second Building, bottom rectangle, which is the entrance
    g.setColor(two);
    g.fillRect(167,378,83,33);
    g.setColor(Color.black);
    g.drawRect(167,378,83,33); 
    // The doors
    g.setColor(Color.white);
    g.fillRect(170,382,78,25);
    g.setColor(Color.black);
    g.drawRect(170,382,78,25);
    // The lines that run along the doors
    int line1 = 181;
    for(int i3 = 0; i3 < 5; i3++)
    {
    	g.setColor(Color.black);
    	g.drawLine(line1,407,line1,382);
    	line1 = line1 + 13;
    }
    // The overhead thing over the door of the building
    g.setColor(Color.red);
    g.fillRect(187,378,43,8);
    g.setColor(Color.black);
    g.drawRect(187,378,43,8);
    // The rectangles for the building
    int rect1 = 176;
    for(int i4 = 0; i4 < 5; i4++)
    {
    	g.setColor(Color.white);
    	g.fillRect(rect1,256,5,118);
    	g.setColor(Color.black);
    	g.drawRect(rect1,256,5,118);
    	rect1 = rect1 + 15;
    }
    // The lines that go along the windows, seperating the floor
    int windowline = 267;
    int windowline2 = 176;
   	for(int i5 = 0; i5 < 9; i5++)
   	{
   		g.drawLine(windowline2,windowline,windowline2 + 5,windowline);
   		windowline = windowline + 11;
   	}
   	windowline2 = windowline2 + 15;
    windowline = 267;
   	for(int i5 = 0; i5 < 9; i5++)
   	{
   		g.drawLine(windowline2,windowline,windowline2 + 5,windowline);
   		windowline = windowline + 11;
   	}
   	windowline2 = windowline2 + 15;
    windowline = 267;
   	for(int i5 = 0; i5 < 9; i5++)
   	{
   		g.drawLine(windowline2,windowline,windowline2 + 5,windowline);
   		windowline = windowline + 11;
   	}
   	windowline2 = windowline2 + 15;
    windowline = 267;
   	for(int i5 = 0; i5 < 9; i5++)
   	{
   		g.drawLine(windowline2,windowline,windowline2 + 5,windowline);
   		windowline = windowline + 11;
   	}
   	windowline2 = windowline2 + 15;
    windowline = 267;
   	for(int i5 = 0; i5 < 9; i5++)
   	{
   		g.drawLine(windowline2,windowline,windowline2 + 5,windowline);
   		windowline = windowline + 11;
   	}
   	// The next rectangle up
   	g.setColor(two);
   	g.fillRect(167,230,83,20);
   	g.setColor(Color.black);
   	g.drawRect(167,230,83,20);
   	// Windows for the rectangle;
   int windowsForRectangle = 176;
   for(int i7 = 0; i7 < 5; i7++)
   {
   		g.setColor(Color.white);
  	 	g.fillRect(windowsForRectangle,234,5,12);
  	 	g.setColor(Color.black);
  	 	g.drawRect(windowsForRectangle,234,5,12);
  	 	windowsForRectangle = windowsForRectangle + 15;
   }
	// The next rectangle up
	g.setColor(two);
	g.fillRect(177,207,63,23);
	g.setColor(Color.black);
	g.drawRect(177,207,63,23);
	// The next rectangle up
	g.setColor(two);
	g.fillRect(174,187,69,20);
	g.setColor(Color.black);
	g.drawRect(174,187,69,20);
	// The next rectangle up, the highest one
	g.setColor(two);
	g.fillRect(190,173,37,14);
	g.setColor(Color.black);
	g.drawRect(190,173,37,14);
	// Lastly, the lines on the third rectangle from the top
	g.setColor(Color.black);
	g.drawLine(193,207,193,230);
	g.drawLine(209,207,209,230);
	g.drawLine(224,207,224,230);
	g.drawLine(240,207,240,230);
	
	// The start of the third building, the one in the middle
	// The bottom rectangle of the third building, the entrance rectangle
	g.setColor(three);
	g.fillRect(260,290,90,121);
	g.setColor(Color.black);
	g.drawRect(260,290,90,121);
	// Making a line to seperate the entrance and the windowed part (There are 2 lines)
	g.setColor(Color.black);
	g.drawLine(260,380,350,380);
	g.drawLine(260,383,350,383);
	// Making the entrance
	// The dashed line runing across the entrance
	g.setColor(Color.darkGray);
	g.fillRect(260,390,90,8);
	g.setColor(Color.black);
	g.drawRect(260,390,90,8);
	// Making the door/windows
	int doorThree = 274;
	for(int i8 = 0; i8 < 5; i8++)
	{
		g.setColor(Color.white);
		g.fillRect(doorThree,387,7,15);
		g.setColor(Color.black);
		g.drawRect(doorThree,387,7,15);
		doorThree = doorThree + 14;
	}
	// Making the little rectangle as the steps for the entrance
	g.setColor(three);
	g.fillRect(270,402,71,9);
	g.setColor(Color.black);
	g.drawRect(270,402,71,9);
	// Making the windows for the second rectangle up
	int threeAcross = 267;
	int threeDown = 318;
	for (int i9 = 0; i9 < 8; i9++)
	{
		g.setColor(Color.white);
		g.fillRect(threeAcross,threeDown,6,8);
		g.setColor(Color.black);
		g.drawRect(threeAcross,threeDown,6,8);
		threeAcross = threeAcross + 10;
	}
	threeAcross = 267;
	threeDown = threeDown + 14;
	for (int i9 = 0; i9 < 8; i9++)
	{
		g.setColor(Color.white);
		g.fillRect(threeAcross,threeDown,6,8);
		g.setColor(Color.black);
		g.drawRect(threeAcross,threeDown,6,8);
		threeAcross = threeAcross + 10;
	}
	threeAcross = 267;
	threeDown = threeDown + 14;
	for (int i9 = 0; i9 < 8; i9++)
	{
		g.setColor(Color.white);
		g.fillRect(threeAcross,threeDown,6,8);
		g.setColor(Color.black);
		g.drawRect(threeAcross,threeDown,6,8);
		threeAcross = threeAcross + 10;
	}
	threeAcross = 267;
	threeDown = threeDown + 14;
	for (int i9 = 0; i9 < 8; i9++)
	{
		g.setColor(Color.white);
		g.fillRect(threeAcross,threeDown,6,8);
		g.setColor(Color.black);
		g.drawRect(threeAcross,threeDown,6,8);
		threeAcross = threeAcross + 10;
	}
	threeAcross = 267;
	threeDown = threeDown + 14;
	// The thin rectangle that juts through the bottom building
	g.setColor(three);
	g.fillRect(253,308,104,4);
	g.setColor(Color.black);
	g.drawRect(253,308,104,4);
	// The lines that run along the top part of the rectangle
	int lineThree = 265;
	for(int i10 = 0; i10 < 11; i10++)
	{
		g.setColor(Color.black);
		g.drawLine(lineThree, 290, lineThree, 308);
		lineThree = lineThree + 8;
	}
	// The second rectangle up, filled completely with windows
	g.setColor(three);
	g.fillRect(268,228,74,62);
	g.setColor(Color.black);
	g.drawRect(268,228,74,62);
	// The windows in the rectangle
	int windowsAcross = 276;
	int windowsDown = 237;
	for (int i11 = 0; i11 < 6; i11++)
	{
		g.setColor(Color.white);
		g.fillRect(windowsAcross,windowsDown,7,9);
		g.setColor(Color.black);
		g.drawRect(windowsAcross,windowsDown,7,9);
		windowsAcross = windowsAcross + 10;
	}
	windowsDown = windowsDown + 13;
	windowsAcross = 276;
	for (int i11 = 0; i11 < 6; i11++)
	{
		g.setColor(Color.white);
		g.fillRect(windowsAcross,windowsDown,7,9);
		g.setColor(Color.black);
		g.drawRect(windowsAcross,windowsDown,7,9);
		windowsAcross = windowsAcross + 10;
	}
	windowsDown = windowsDown + 13;
	windowsAcross = 276;
	for (int i11 = 0; i11 < 6; i11++)
	{
		g.setColor(Color.white);
		g.fillRect(windowsAcross,windowsDown,7,9);
		g.setColor(Color.black);
		g.drawRect(windowsAcross,windowsDown,7,9);
		windowsAcross = windowsAcross + 10;
	}
	windowsDown = windowsDown + 13;
	windowsAcross = 276;
	for (int i11 = 0; i11 < 6; i11++)
	{
		g.setColor(Color.white);
		g.fillRect(windowsAcross,windowsDown,7,9);
		g.setColor(Color.black);
		g.drawRect(windowsAcross,windowsDown,7,9);
		windowsAcross = windowsAcross + 10;
	}
	windowsDown = windowsDown + 13;
	windowsAcross = 276;
	// The line that makes the building top kinda seperated a little
	g.drawLine(268,231,342,231);
	// The next rectangle up, the ones that have more windows
	g.setColor(three);
	g.fillRect(280,166,50,62);
	g.setColor(Color.black);
	g.drawRect(280,166,50,62);
	// The windows for that building
	int threeWindowsAcross = 287;
	int threeWindowsDown = 172;
	for(int i12 = 0; i12 < 4; i12++)
	{
		g.setColor(Color.white);
		g.fillRect(threeWindowsAcross,threeWindowsDown,7,9);
		g.setColor(Color.black);
		g.drawRect(threeWindowsAcross,threeWindowsDown,7,9);
		threeWindowsAcross = threeWindowsAcross + 10;
	}
	threeWindowsDown = threeWindowsDown + 13;
	threeWindowsAcross = 287;
	for(int i12 = 0; i12 < 4; i12++)
	{
		g.setColor(Color.white);
		g.fillRect(threeWindowsAcross,threeWindowsDown,7,9);
		g.setColor(Color.black);
		g.drawRect(threeWindowsAcross,threeWindowsDown,7,9);
		threeWindowsAcross = threeWindowsAcross + 10;
	}
	threeWindowsDown = threeWindowsDown + 13;
	threeWindowsAcross = 287;
	for(int i12 = 0; i12 < 4; i12++)
	{
		g.setColor(Color.white);
		g.fillRect(threeWindowsAcross,threeWindowsDown,7,9);
		g.setColor(Color.black);
		g.drawRect(threeWindowsAcross,threeWindowsDown,7,9);
		threeWindowsAcross = threeWindowsAcross + 10;
	}
	threeWindowsDown = threeWindowsDown + 13;
	threeWindowsAcross = 287;
	for(int i12 = 0; i12 < 4; i12++)
	{
		g.setColor(Color.white);
		g.fillRect(threeWindowsAcross,threeWindowsDown,7,9);
		g.setColor(Color.black);
		g.drawRect(threeWindowsAcross,threeWindowsDown,7,9);
		threeWindowsAcross = threeWindowsAcross + 10;
	}
	threeWindowsDown = threeWindowsDown + 13;
	threeWindowsAcross = 287;
	// The random rectangle above it, the block with no rectangles
	g.setColor(three);
	g.fillRect(279,143, 52, 23);
	g.setColor(Color.black);
	g.drawRect(279,143, 52, 23);
	// The next rectangle above it, the one that has a little bit of windows
	g.setColor(three);
	g.fillRect(283, 130, 44,13);
	g.setColor(Color.black);
	g.drawRect(283, 130, 44,13);
	// The windows for it
	int moreWindows = 287;
	for (int i13 = 0; i13 < 5; i13++)
	{
		g.setColor(Color.white);
		g.fillRect(moreWindows,133,4,7);
		g.setColor(Color.black);
		g.drawRect(moreWindows,133,4,7);
		moreWindows = moreWindows + 8;
	}
	// The block above it
	g.setColor(three);
	g.fillRect(286, 122, 38,8);
	g.setColor(Color.black);
	g.drawRect(286, 122, 38,8);
	// The next block above that
	g.setColor(three);
	g.fillRect(291, 103, 28,19);
	g.setColor(Color.black);
	g.drawRect(291, 103, 28,19);
	// The next block above THAT, the highest block before the antenna
	g.setColor(three);
	g.fillRect(296,74,18,29);
	g.setColor(Color.black);
	g.drawRect(296,74,18,29);
	// Lastly, the antenna
	g.drawLine(304,74,305,29);
	g.drawLine(305,29,306,74);
	g.fillRect(304,49,2,25);
	
	// The start of the fourth building from the left
	// The bottom block of the building
	// This block will be the entrance of the building
	g.setColor(four);
	g.fillRect(360,374,80, 37);
	g.setColor(Color.black);
	g.drawRect(360,374,80, 37);
	// Actually making the entrance, with the doors, etc.
	g.setColor(Color.white);
	g.fillRect(365, 381, 19, 30);
	g.setColor(Color.black);
	g.drawRect(365, 381, 19, 30);
	g.setColor(Color.white);
	g.fillRect(416,381, 19, 30);
	g.setColor(Color.black);
	g.drawRect(416, 381, 19, 30);
	//Door
	g.setColor(door);
	g.fillRect(394, 389, 12, 22);
	g.setColor(Color.black);
	g.drawRect(394, 389, 12, 22);
	// The little shaded part of the side windows on the side of the entrance
	g.setColor(Color.darkGray);
	g.fillRect(365,386, 19,4);
	g.setColor(Color.black);
	g.drawRect(365,386, 19,4);
	g.setColor(Color.darkGray);
	g.fillRect(416,386, 19,4);
	g.setColor(Color.black);
	g.drawRect(416,386, 19,4);
	// The little blocky thing that seperates the bottom block and the one on top
	g.setColor(four);
	g.fillRect(357,368,86,6);
	g.setColor(Color.black);
	g.drawRect(357,368,86,6);
	// The main block, the one containing most of the windows
	g.setColor(four);
	g.fillRect(361,236,78,132);
	g.setColor(Color.black);
	g.drawRect(361,236,78,132);
	// Making the main long rectangles for the windows, later to be seperated by lines
	int fourBlock = 368;
	for(int i13 = 0; i13 < 5; i13++)
	{
		g.setColor(Color.white);
		g.fillRect(fourBlock, 242, 7, 120);
		g.setColor(Color.black);
		g.drawRect(fourBlock, 242, 7, 120);
		fourBlock = fourBlock + 14;
	}
	// Making the line statements for all the lines seperating all the windows
	int fourDown = 248;
	int fourAcross = 368;
	for(int i14 = 0; i14 < 19; i14++)
	{
		g.drawLine(fourAcross, fourDown, fourAcross + 7, fourDown);
		fourDown = fourDown + 6;
	}
	fourDown = 248;
	fourAcross = fourAcross + 14;
	for(int i14 = 0; i14 < 19; i14++)
	{
		g.drawLine(fourAcross, fourDown, fourAcross + 7, fourDown);
		fourDown = fourDown + 6;
	}
	fourDown = 248;
	fourAcross = fourAcross + 14;
	for(int i14 = 0; i14 < 19; i14++)
	{
		g.drawLine(fourAcross, fourDown, fourAcross + 7, fourDown);
		fourDown = fourDown + 6;
	}
	fourDown = 248;
	fourAcross = fourAcross + 14;
	for(int i14 = 0; i14 < 19; i14++)
	{
		g.drawLine(fourAcross, fourDown, fourAcross + 7, fourDown);
		fourDown = fourDown + 6;
	}
	fourDown = 248;
	fourAcross = fourAcross + 14;
	for(int i14 = 0; i14 < 19; i14++)
	{
		g.drawLine(fourAcross, fourDown, fourAcross + 7, fourDown);
		fourDown = fourDown + 6;
	}
	fourDown = 248;
	fourAcross = fourAcross + 14;
	// The little block above the windowed one
	g.setColor(four);
	g.fillRect(359,221,82,15);
	g.setColor(Color.black);
	g.drawRect(359,221,82,15);
	//The rectangle that acts as the main building for the windows
	g.setColor(Color.white);
	g.fillRect(363, 225,74,7);
	g.setColor(Color.black);
	g.drawRect(363, 225,74,7);
	// The lines that seperate the windows
	g.drawLine(378,225,378,232);
	g.drawLine(393,225,393,232);
	g.drawLine(408,225,408,232);
	g.drawLine(423,225,423,232);
	// The block above it, the highest rectangle that also has four windows
	g.setColor(four);
	g.fillRect(364, 210,72,11);
	g.setColor(Color.black);
	g.drawRect(364, 210,72,11);
	// The windows for that building
	g.setColor(Color.white);
	g.fillRect(370, 213,11,5);
	g.setColor(Color.black);
	g.drawRect(370, 213,11,5);
	g.setColor(Color.white);
	g.fillRect(386, 213,11,5);
	g.setColor(Color.black);
	g.drawRect(386, 213,11,5);
	g.setColor(Color.white);
	g.fillRect(402, 213,11,5);
	g.setColor(Color.black);
	g.drawRect(402, 213,11,5);
	g.setColor(Color.white);
	g.fillRect(418, 213,11,5);
	g.setColor(Color.black);
	g.drawRect(418, 213,11,5);
	// The trapezoid of the building
	int[]yee = {369,431,431,369,369};
	int[]yuh = {210,210,201,173,210};
	g.setColor(four);
	g.fillPolygon(yee,yuh,5);
	g.setColor(Color.black);
	g.drawPolygon(yee,yuh,5);
	// The antenna of the building
	int[]who = {379,380,384,380};
	int[]dat = {177,120,180,170};
	g.setColor(Color.black);
	g.fillPolygon(who,dat,4);

	// The start of the fifth and final building
	// The bottom block, the one with the entrance
	g.setColor(five);
	g.fillRect(456,369,93,42);
	g.setColor(Color.black);
	g.drawRect(456,369,93,42);
	// The random line at the top of the bottom line
	g.drawLine(456,372,549,372);
	// The entrance doors (main block)
	g.setColor(Color.white);
	g.fillRect(461,380,83,31);
	g.setColor(Color.black);
	g.drawRect(461,380,83,31);
	g.drawRect(460,379,85,33);
	// The entrance doors
	g.drawLine(475,411,475,380);
	g.drawLine(489,411,489,380);
	g.drawLine(503,411,503,380);
	g.drawLine(517,411,517,380);
	g.drawLine(531,411,531,380);
	// The next block, the one that has most of the windows
	g.setColor(five);
	g.fillRect(460,266,85,103);
	g.setColor(Color.black);
	g.drawRect(460,266,85,103);
	// The windows for the block
	int fiveAcross = 474;
	int fiveDown = 359;
	for(int i15 = 0; i15 < 12; i15++)
	{
		g.setColor(Color.white);
		g.fillRect(fiveAcross, fiveDown, 5,5);
		g.setColor(Color.black);
		g.drawRect(fiveAcross, fiveDown, 5,5);
		fiveDown = fiveDown - 8;
	}
	fiveDown = 359;
	fiveAcross = fiveAcross + 13;
	for(int i15 = 0; i15 < 12; i15++)
	{
		g.setColor(Color.white);
		g.fillRect(fiveAcross, fiveDown, 5,5);
		g.setColor(Color.black);
		g.drawRect(fiveAcross, fiveDown, 5,5);
		fiveDown = fiveDown - 8;
	}
	fiveDown = 359;
	fiveAcross = fiveAcross + 13;
	for(int i15 = 0; i15 < 12; i15++)
	{
		g.setColor(Color.white);
		g.fillRect(fiveAcross, fiveDown, 5,5);
		g.setColor(Color.black);
		g.drawRect(fiveAcross, fiveDown, 5,5);
		fiveDown = fiveDown - 8;
	}
	fiveDown = 359;
	fiveAcross = fiveAcross + 13;
	for(int i15 = 0; i15 < 12; i15++)
	{
		g.setColor(Color.white);
		g.fillRect(fiveAcross, fiveDown, 5,5);
		g.setColor(Color.black);
		g.drawRect(fiveAcross, fiveDown, 5,5);
		fiveDown = fiveDown - 8;
	}
	fiveDown = 359;
	fiveAcross = fiveAcross + 13;
	for(int i15 = 0; i15 < 12; i15++)
	{
		g.setColor(Color.white);
		g.fillRect(fiveAcross, fiveDown, 5,5);
		g.setColor(Color.black);
		g.drawRect(fiveAcross, fiveDown, 5,5);
		fiveDown = fiveDown - 8;
	}
	fiveDown = 359;
	fiveAcross = fiveAcross + 13;
	// The next block, the one above consisting of only four windows
	g.setColor(five);
	g.fillRect(463,251,79,15);
	g.setColor(Color.black);
	g.drawRect(463,251,79,15);
	// The windows for that building
	g.setColor(Color.white);
	g.fillRect(476,257,7,3);
	g.setColor(Color.black);
	g.drawRect(476,257,7,3);
	g.setColor(Color.white);
	g.fillRect(491,257,7,3);
	g.setColor(Color.black);
	g.drawRect(491,257,7,3);
	g.setColor(Color.white);
	g.fillRect(506,257,7,3);
	g.setColor(Color.black);
	g.drawRect(506,257,7,3);
	g.setColor(Color.white);
	g.fillRect(521,257,7,3);
	g.setColor(Color.black);
	g.drawRect(521,257,7,3);
	// The block above that, the third from the top
	g.setColor(five);
	g.fillRect(467,239,71,12);
	g.setColor(Color.black);
	g.drawRect(467,239,71,12);
	// The line that is at the top
	g.drawLine(467,242,538,242);
	// The block above that, the one that is like a thin slab, the second one from the top
	g.setColor(five);
	g.fillRect(464,231,77,11);
	g.setColor(Color.black);
	g.drawRect(464,231,77,11);
	// The block above that, the highest block in the fifth building
	g.setColor(five);
	g.fillRect(476,220,53,11);
	g.setColor(Color.black);
	g.drawRect(476,220,53,11);
	// The lines that run across the top block of the building
	g.drawLine(478,220,486,231);
	g.drawLine(486,220,494,231);
	g.drawLine(494,220,502,231);
	// The clouds for the sky
	g.setColor(Color.white);
	g.fillOval(380,20,40,40);
	g.fillOval(400,40,40,40);
	g.fillOval(385,50,40,40);
	g.fillOval(370,50,40,40);
	g.fillOval(360,30,40,40);
	
	g.fillOval(20,100,40,40);
	g.fillOval(30,90,40,40);
	g.fillOval(40,110,40,40);
	g.fillOval(19,125,40,40);
	
	g.fillOval(500,80,40,40);
	g.fillOval(520,100,40,40);
	g.fillOval(515,110,40,40);
	g.fillOval(500,110,40,40);
	g.fillOval(490,90,40,40);	
	
	//A bird
	g.setColor(Color.black);
	g.drawArc(0,35,100,25,0,70);
	g.drawArc(96,42,50,25,30,120);
	//Text of Java Project
	g.drawString("Graphics Project", 520, 11);
	g.drawString("by Romir Varshney", 514, 22);
  
  }
  
  public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.getContentPane().add(new GraphicsProject());
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(630,480);
    frame.setVisible(true);
  }
}
           
         
  