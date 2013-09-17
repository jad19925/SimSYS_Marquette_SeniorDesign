package gamePlayEngine.view;

import gamePlayEngine.controller.GameController;
import gamePlayEngine.controller.GameState;
import gamePlayEngine.controller.Message;
import gamePlayEngine.model.act.Act;
import gamePlayEngine.model.gameElement.GameElement;
import gamePlayEngine.model.gameElement.graphic.Backdrop;
import gamePlayEngine.model.gameElement.graphic.Event;
import gamePlayEngine.model.gameElement.graphic.Identifier;
import gamePlayEngine.model.gameElement.graphic.Prop;
import gamePlayEngine.model.gameElement.graphic.Type;
import gamePlayEngine.model.gameElement.player.reward.Reward;
import gamePlayEngine.model.gamemodel.GameModel;
import gamePlayEngine.model.scene.Scene;
import gamePlayEngine.model.screen.Screen;

import javax.swing.*;
import javax.xml.bind.annotation.XmlRootElement;

import java.util.Observable;
import java.util.Observer;

public class GameView implements Observer {
	int count;
	GameViewFrame gameViewFrame;
	private String displayInfo;
	public static final String Button1 = "Button1";
	public static final String Button2 = "Button2";
	
	public GameView() {
		gameViewFrame = new GameViewFrame();
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		count++;
		GameState gameState = (GameState) arg1;
		Message msg = gameState.getMessage();
		// System.out.println("update recevied from  "+
		// arg0.getClass()+"  message is: "+msg+" calls to view: "+count);
		// Look it into the update msg.
		// based upon the message we have to create view
		// System.out.println("View: Message " + ((Message)arg1) +
		// " received from " + arg0.getClass());

		if (GameModel.class.isInstance(arg0)) {
			if (msg == Message.Start) {
				// Do something for GameModel Start
				// TODO Find why it is called in the second time.
				System.out.println("View: Message GameModelStartComplete sent");
				gameState.setMessage(Message.StartComplete);
				GameController.viewListener(arg0, gameState);

			}
			if (msg == Message.Play) {
				// Do something for GameModel Play
				System.out.println("View: Message GameModelPlayComplete sent");
				gameViewFrame.viewStartAct();
				gameState.setMessage(Message.PlayComplete);
				GameController.viewListener(arg0, gameState);
			}
		}

		else if (Act.class.isInstance(arg0)) {
			if (msg == Message.Start) {
				// Do something for Act Start.

				System.out.println("View: Message ActStartComplete sent");
				gameState.setMessage(Message.StartComplete);
				GameController.viewListener(arg0, gameState);

			}
			if (msg == Message.Play) {
				// Do something for Act Play.
				System.out.println("View: Message ActPlayComplete sent");
				gameState.setMessage(Message.PlayComplete);
				GameController.viewListener(arg0, gameState);

			}
			if (msg == Message.End) {
				// Do something for Act Play.
				System.out.println("View: Message ActEndComplete sent");
				gameState.setMessage(Message.EndComplete);
				GameController.viewListener(arg0, gameState);

			}
		}

		else if (Scene.class.isInstance(arg0)) {
			if (msg == Message.Start) {
				System.out.println("View: Message SceneStartComplete sent");
				gameState.setMessage(Message.StartComplete);
				GameController.viewListener(arg0, gameState);
			} else if (msg == Message.Play) {
				System.out.println("View: Message ScenePlayComplete sent");
				gameState.setMessage(Message.PlayComplete);
				GameController.viewListener(arg0, gameState);
			} else if (msg == Message.End) {
				System.out.println("View: Message SceneEndComplete sent");
				gameState.setMessage(Message.EndComplete);
				GameController.viewListener(arg0, gameState);
			}
		}

		else if (Screen.class.isInstance(arg0)) {
			if (msg == Message.Start) {
				System.out.println("View: Message ScreenStartComplete sent");
				gameState.setMessage(Message.StartComplete);
				GameController.viewListener(arg0, gameState);
			} else if (msg == Message.Play) {
				System.out.println("View: Message ScreenPlayComplete sent");
				gameState.setMessage(Message.PlayComplete);				
				GameController.viewListener(arg0, gameState);
			} else if (msg == Message.End) {
				System.out.println("View: Message ScreenEndComplete sent");
				gameState.setMessage(Message.EndComplete);
				GameController.viewListener(arg0, gameState);
			}
		}
		if (GameElement.class.isInstance(arg0)) {
			if (msg == Message.Start) {
				System.out
						.println("View: Message GameElementStartComplete sent");
				gameState.setMessage(Message.StartComplete);
				GameController.viewListener(arg0, gameState);
			} else if (msg == Message.Play) {
				System.out
						.println("View: Message GameElementPlayComplete sent");
				gameState.setMessage(Message.PlayComplete);
				if (Prop.class.isInstance(arg0)) {
					Prop currentProp = (Prop) (gameState.getGameElement());
					System.out.println(currentProp.getType().getTypeName());
					if (currentProp.getType().getTypeName().trim()
							.equals(Button1)) {
						gameViewFrame.addButton(gameState);
					}
					if (currentProp.getType().getTypeName()
							.equals("InformationBox1")) {
						System.out
								.println("Calling method to add information box!!");
						gameViewFrame.addinformationBox(currentProp,gameState);
					}
					if (currentProp.getType().getTypeName().trim()
							.equals(Button2)) {
						gameViewFrame.addButton(gameState);
					}
				}
				GameController.viewListener(arg0, gameState);
			} else if (msg == Message.End) {
				
				/**
				 * Write code for removing the game elements in the current screen.
				 */
				System.out.println("View: Message GameElementEndComplete sent");
				gameState.setMessage(Message.EndComplete);
				GameController.viewListener(arg0, gameState);
			}
		}
	}
	
}