/**
 * Dummy View class implementation - Will be replaced by actual view classes 
 */
package gamePlayEngine.view;

import gamePlayEngine.controller.GameController;
import gamePlayEngine.controller.GameState;
import gamePlayEngine.controller.Message;
import gamePlayEngine.controller.MessageType;
import gamePlayEngine.model.gameElement.GameElement;
import gamePlayEngine.model.gameElement.ReadBehavior;
import gamePlayEngine.model.gameElement.graphic.Backdrop;
import gamePlayEngine.model.gameElement.graphic.Prop;
import gamePlayEngine.model.gameElement.player.reward.Reward;
import gamePlayEngine.model.gamemodel.GameModel;
import gamePlayEngine.util.Util;
import gamePlayEngine.view.util.CustomDialog;
import gamePlayEngine.view.util.JPanelWithBackground;

import javax.imageio.ImageIO;
import javax.swing.*;

import org.jdesktop.swingx.JXImagePanel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import java.lang.reflect.Field;

public class GameViewFrame extends javax.swing.JFrame {

	private GameController controller;
	JFrame jFrame;
	JPanel jPanelScene;
	JLayeredPane layeredPane;
	private BufferedImage myPicture;

	public GameViewFrame() {
		System.out.println("view has been initialized");
	}

	public GameController getController() {
		return controller;
	}

	public void setController(GameController controller) {
		this.controller = controller;
	}

	public void viewStartAct() {

		jFrame = new JFrame("Background Example");

		// jFrame.getContentPane().add(jxImagePanel,0);

		// JLabel picLabel = new JLabel(new ImageIcon(myPicture));
		JLabel picLabel = new JLabel();

		picLabel.setSize(this.getWidth(), this.getHeight());
		picLabel.setLayout(new FlowLayout());

		// picLabel.setSize(1000, 800);
		// jFrame.getContentPane().add(picLabel, 0);

		// jFrame.getContentPane().setBackground(new Color(0, 255, 255));
		jFrame.setLocationRelativeTo(null);
		jFrame.pack();
		jFrame.setVisible(true);
		jFrame.setSize(1000, 800);
		jFrame.setLayout(new BorderLayout());

		// Display frame in center of the screen
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		jFrame.setLocation(dim.width / 2 - jFrame.getSize().width / 2,
				dim.height / 2 - jFrame.getSize().height / 2);
		
		setBackgroundImage();

	}

	public void setBackgroundImage() {
		// TODO Read image name from the backdrop and check whether it is
		// present in resources folder.
		try {
			myPicture = ImageIO.read((this.getClass()
					.getResource("BlueSky.png")));
		} catch (IOException e) {
			e.printStackTrace();
		}

		JXImagePanel jxImagePanel = new JXImagePanel();
		jxImagePanel.setImage(myPicture);
		jxImagePanel.setBounds(0, 0, 1000, 800);
		jxImagePanel.setLayout(null);
		layeredPane = new JLayeredPane();
		layeredPane.add(jxImagePanel, JLayeredPane.DEFAULT_LAYER);
		jFrame.add(layeredPane, BorderLayout.CENTER);
		layeredPane.setBounds(0, 0, 1000, 800);

	}

	public void displayNext(Prop prop, GameState gameState) {
		if (prop != null) {
			String next = prop.getNext();
			System.out.println("Next to display is" + prop.getNext());

			// Start the nextscreen

			if (next.contains("screen")) {
				GameController.startNextScreen(next, gameState);
			}

			setVisible(false);
		}
	}

	public void addinformationBox(Prop currentProp, GameState gameState) {
		resetLayeredPane();
		setBackgroundImage();
		jPanelScene = Util.panelPosition(currentProp.getLocation(), true,
				currentProp);

		layeredPane.add(jPanelScene, 100);
		displayNext(currentProp, gameState);

	}

	public JFrame createNewFrame(String name) {
		JFrame jFrame = new JFrame(name);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 3. Create components and put them in the frame.
		// ...create emptyLabel...
		jFrame.setSize(1000, 800);
		jFrame.setLayout(new BorderLayout());

		// 4. Size the frame.
		jFrame.pack();

		// 5. Show it.
		jFrame.setVisible(false);
		return jFrame;

	}

	public void resetLayeredPane() {
		layeredPane.removeAll();
		layeredPane.revalidate();
		layeredPane.repaint();
	}

	public void addButton(final GameState gameState) {

		
		// resetLayeredPane();
		final Prop prop = (Prop) gameState.getGameElement();

		JButton btn = new JButton();

		System.out.println(prop.getColor());

		if (prop.getColor() == null)
			btn.setBackground(new Color(255, 255, 255));
		else
			btn.setBackground(Util.StringToColor(prop.getColor().toString()));

		btn.setText(prop.getText());
		btn.setFont(new Font(prop.getFont().toString(), Font.PLAIN, Integer
				.parseInt(prop.getTextSize())));
		btn.setPreferredSize(Util.panelDimension(prop.getSize()));

		/**
		 * Create panel with Act+Scene+Screen name. and populate with game
		 * elements. Once we create all the panels, link the panels with user
		 * interaction.
		 */

		// Retrieve Actname, Scenename, Screen name.

		String panelName = gameState.getAct().getActGameElement().getActId()
				+ gameState.getScene().getIdentifier().getId()
				+ gameState.getGameElement();

		jPanelScene = Util.panelPosition(prop.getLocation(), false, prop);
		layeredPane.add(jPanelScene, new Integer(0), 0);
		jPanelScene.add(btn);
		final String btnText = prop.getText();
		final JFrame jFrameFinal = jFrame;
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				// EndGame => End the current game.

				if (btnText.trim().equals("End Game")) {
					System.exit(0);
				}

				// Read the Behavior tag of the game element and do accordingly.
				else {
					ReadBehavior readBehavior = new ReadBehavior(prop
							.getBehavior());

					// Code if we get the behavior like this.
					// Reward.AddPoints.5000

					if (readBehavior.getModel().trim().equals("Reward")) {
						// 2 Actions.
						// getPoints and AddPoints

						if (readBehavior.getAction().trim().equals("AddPoints")) {
							if (readBehavior.getParameter() != null) {
								int pointsToAdd = Integer.parseInt(readBehavior
										.getParameter().trim());

								// Get the Reward object and add the points.
								Reward reward = GameModel.getGameModelObject()
										.getCharacter().getReward();
								reward.addPoints(pointsToAdd);
								// Set the reward back to the game character.
								GameModel.getGameModelObject().getCharacter()
										.setReward(reward);
								System.out.println("Reward Points are"
										+ reward.getPoints());
							}
						}
						if (readBehavior.getAction().equals("getPoints")) {

						}
					}

					String next = prop.getNext();
					System.out.println("Next to display is" + prop.getNext());

					// Start the nextscreen

					if (next.contains("screen")) {
						GameController.startNextScreen(next, gameState);
					}

				}
			}
		});
	}
}