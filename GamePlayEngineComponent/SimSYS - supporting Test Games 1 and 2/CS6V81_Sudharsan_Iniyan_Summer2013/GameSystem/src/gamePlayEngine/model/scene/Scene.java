/**
 * Scene model class. Scene contains one or more screens and Backdrop and is contained in Act
 * This file defines Scene Model class
 */
package gamePlayEngine.model.scene;

import gamePlayEngine.controller.GameState;
import gamePlayEngine.controller.Message;
import gamePlayEngine.model.gameConstants.Timer;
import gamePlayEngine.model.gameElement.GameElement;
import gamePlayEngine.model.gameElement.graphic.Backdrop;
import gamePlayEngine.model.gameElement.graphic.Graphic;
import gamePlayEngine.model.gameElement.graphic.Identifier;
import gamePlayEngine.model.screen.Screen;

import java.util.List;
import java.util.Observable;
import java.util.Observer;

import javax.xml.bind.annotation.XmlElement;

/**
 * Scene Model class. This class is observed by the view for any updates.
 * 
 */
public class Scene extends Observable {
	private List<Screen> screens;
	private Identifier identifier;
	private Backdrop backdrop;
	private String timer;

	@XmlElement(name = "screenStructure")
	public List<Screen> getScreens() {
		return screens;
	}

	public void setScreens(List<Screen> screens) {
		this.screens = screens;
	}

	@XmlElement(name = "Backdrop")
	public Backdrop getBackdrop() {
		return backdrop;
	}

	public void setBackdrop(Backdrop backdrop) {
		this.backdrop = backdrop;
	}
	@XmlElement(name = "Identifier")
	public Identifier getIdentifier() {
		return identifier;
	}

	public void setIdentifier(Identifier identifier) {
		this.identifier = identifier;
	}

	@XmlElement(name = "timer")
	public String getTimer() {
		return timer;
	}

	public void setTimer(String timer) {
		this.timer = timer;
	}

	@Override
	public synchronized void addObserver(Observer o) {
		super.addObserver(o);
		for (Screen screen : screens) {
			screen.addObserver(o);
		}
		backdrop.addObserver(o);
	}

	public void sceneStart(GameState gameState) {
		setChanged();
		gameState.setScene(this);
		gameState.setMessage(Message.Start);
		notifyObservers(gameState);
		// backdrop.gameElementStart();
		// Thread.sleep(5000);
	}

	/**
	 * Go through each Screen and start, play and end it If the process was to
	 * become any complex it can be moved to SceneControl similar to GameControl
	 */
	public void scenePlay(GameState gameState) {
		setChanged();
		gameState.setMessage(Message.Play);
		notifyObservers(gameState);
		// backdrop.gameElementPlay();
		/*
		 * currentScreenToPlay = screens.get(currentScreen); while
		 * (currentScreen < screens.size()) { currentScreenToPlay.screenStart();
		 * currentScreenToPlay.screenPlay(); currentScreenToPlay.screenEnd();
		 * currentScreen += 1; }
		 */
	}

	public void sceneEnd(GameState gameState) {
		//backdrop.gameElementEnd();
		setChanged();
		gameState.setMessage(Message.End);		
		gameState.setScreen(null);
		gameState.setGameElement(null);
		notifyObservers(gameState);
	}

	public void scenePause() {
		throw new UnsupportedOperationException();
	}

	public void sceneResume() {
		throw new UnsupportedOperationException();
	}

	public void sceneSave() {
		throw new UnsupportedOperationException();
	}

}
