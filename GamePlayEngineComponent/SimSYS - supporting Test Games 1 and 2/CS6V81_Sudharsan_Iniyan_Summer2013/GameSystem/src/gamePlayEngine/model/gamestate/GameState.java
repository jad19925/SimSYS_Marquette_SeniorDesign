package gamePlayEngine.model.gamestate;

import gamePlayEngine.controller.Message;
import gamePlayEngine.model.act.Act;
import gamePlayEngine.model.scene.Scene;
import gamePlayEngine.model.screen.Screen;

public class GameState {

	private Message msg;
	private Act currentAct;
	private Screen currentScreen;
	private Scene currentScene;
	
	GameState()
	{
		
	}

	public Message getMsg() {
		return msg;
	}

	public void setMsg(Message msg) {
		this.msg = msg;
	}

	public Act getCurrentAct() {
		return currentAct;
	}

	public void setCurrentAct(Act currentAct) {
		this.currentAct = currentAct;
	}

	public Screen getCurrentScreen() {
		return currentScreen;
	}

	public void setCurrentScreen(Screen currentScreen) {
		this.currentScreen = currentScreen;
	}

	public Scene getCurrentScene() {
		return currentScene;
	}

	public void setCurrentScene(Scene currentScene) {
		this.currentScene = currentScene;
	}
	
	
}
