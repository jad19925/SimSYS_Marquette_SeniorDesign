package gamePlayEngine.view.util;

import gamePlayEngine.model.gameElement.ReadBehavior;
import gamePlayEngine.model.gameElement.graphic.Prop;
import gamePlayEngine.model.gameElement.player.reward.Reward;
import gamePlayEngine.model.gamemodel.GameModel;
import gamePlayEngine.util.Util;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class RoundedPanel extends JPanel{
	 /** Stroke size. it is recommended to set it to 1 for better view */
    protected int strokeSize = 1;
    /** Color of shadow */
    protected Color shadowColor = Color.black;
    /** Sets if it drops shadow */
    protected boolean shady = true;
    /** Sets if it has an High Quality view */
    protected boolean highQuality = true;
    /** Double values for Horizontal and Vertical radius of corner arcs */
    protected Dimension arcs = new Dimension(20, 20);
    /** Distance between shadow border and opaque panel border */
    protected int shadowGap = 5;
    /** The offset of shadow.  */
    protected int shadowOffset = 4;
    /** The transparency value of shadow. ( 0 - 255) */
    protected int shadowAlpha = 150;
    
    private String stringTextToDisplay;
    
    public RoundedPanel(Prop prop) {
        super();        
		//jPanelScene.setBackground(Util.StringToColor(currentProp.getColor().toString()));
        ReadBehavior readBehavior = new ReadBehavior(prop.getBehavior());

		String toDisplay = prop.getText();
		if (readBehavior.getModel().trim().equals("Reward")) {
			if (readBehavior.getAction().trim().equals("GetPoints")) {
				Reward reward = GameModel.getGameModelObject().getCharacter()
						.getReward();
				System.out.println("Points are" + reward.getPoints());
				toDisplay += reward.getPoints();

			}
		}
		System.out.println("To Display is" + toDisplay);
		//this.add(new JLabel(toDisplay));
		this.stringTextToDisplay = toDisplay;
        setOpaque(false);        
    }
    
    
    
    protected void paintComponent(Graphics g) {
        //super.paintComponent(g);
        int width = 200;
        int height = 100;
        int shadowGap = this.shadowGap;
        Color shadowColorA = new Color(shadowColor.getRed(), 
        shadowColor.getGreen(), shadowColor.getBlue(), shadowAlpha);
        //g.setColor(Color.BLACK);
              
        Graphics2D graphics = (Graphics2D) g;
        
        //Sets antialiasing if HQ.
        if (highQuality) {
            graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, 
			RenderingHints.VALUE_ANTIALIAS_ON);
        }

        //Draws shadow borders if any.
        if (shady) {
            /*graphics.setColor(shadowColorA);
            graphics.fillRoundRect(
                    shadowOffset,// X position
                    shadowOffset,// Y position
                    width - strokeSize - shadowOffset, // width
                    height - strokeSize - shadowOffset, // height
                    arcs.width, arcs.height);// arc Dimension*/
        } else {
            shadowGap = 1;
        }

        //Draws the rounded opaque panel with borders.
        //graphics.setColor(getBackground());
        /*graphics.fillRoundRect(0, 0, width - shadowGap, 
		height - shadowGap, arcs.width, arcs.height);*/
        //graphics.setColor(getForeground());
        //graphics.setStroke(new BasicStroke(strokeSize));
        graphics.drawRoundRect(0, 0, width - shadowGap, 
		height - shadowGap, arcs.width, arcs.height);

        //Sets strokes to default, is better.
        graphics.setStroke(new BasicStroke());  
        
        graphics.setColor(Color.YELLOW);        
        graphics.fillRoundRect(0, 0, width - shadowGap, 
        		height - shadowGap, arcs.width, arcs.height);
        g.setColor(Color.black);
        graphics.setFont(new Font("Arial",Font.PLAIN,10));
        graphics.drawString(stringTextToDisplay,5,45);     
        
    }
}
