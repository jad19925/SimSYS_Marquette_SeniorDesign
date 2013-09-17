package gamePlayEngine.controller;

import gamePlayEngine.model.act.Act;
import gamePlayEngine.model.gameElement.GameElement;
import gamePlayEngine.model.scene.Scene;
import gamePlayEngine.model.screen.Screen;

public class GameState {

	Act act;
	Screen screen;
	Scene scene;
	GameElement gameElement;
	public GameElement getGameElement() {
		return gameElement;
	}

	public void setGameElement(GameElement gameElement) {
		this.gameElement = gameElement;
	}

	Message message;
	
	public Act getAct() {
		return act;
	}

	public void setAct(Act act) {
		this.act = act;
	}

	public Screen getScreen() {
		return screen;
	}

	public void setScreen(Screen screen) {
		this.screen = screen;
	}

	public Scene getScene() {
		return scene;
	}

	public void setScene(Scene scene) {
		this.scene = scene;
	}

	public Message getMessage() {
		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}

	public GameState() {
		// TODO Auto-generated constructor stub
		this.act = null;
		this.scene = null;
		this.screen = null;
		this.message = null;
	}

}
