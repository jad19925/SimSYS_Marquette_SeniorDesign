package edu.utdallas.gamegenerator.Theme;

import edu.utdallas.gamegenerator.Asset;
import edu.utdallas.gamegenerator.Characters.NPCCharacter;
import edu.utdallas.gamegenerator.Characters.PlayerCharacter;
import edu.utdallas.gamegenerator.ScreenNode;
import edu.utdallas.gamegenerator.Shared.SharedButton;
import edu.utdallas.gamegenerator.Shared.SharedCharacter;
import edu.utdallas.gamegenerator.Shared.GameObject;
import edu.utdallas.gamegenerator.Subject.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * User: clocke
 * Date: 2/17/13
 * Time: 6:04 PM
 */
public class Theme {
    private Subject subject;
    private PlayerCharacter playerCharacter;
    private NPCCharacter npcCharacters;
    private List<ThemeScreen> screens;

    public static final String BACKGROUND_INTRO1 = "intro1";

    public List<ScreenNode> getIntro() {
        List<ScreenNode> screenNodes = new ArrayList<ScreenNode>();
        for(ThemeScreen screen : screens) {
            ScreenNode screenNode = new ScreenNode();
            screenNode.setBackground(screen.getBackground());
            List<Asset> assets = new ArrayList<Asset>();
            for(GameObject object : screen.getGameObjects()) {
                assets.add(new Asset(object));
            }
            for(SharedCharacter character : screen.getThemeCharacters().values()) {
                assets.add(new Asset(character));
            }
            for(SharedButton button : screen.getButtons().values()) {
                assets.add(new Asset(button));
            }
            screenNode.setAssets(assets);
            screenNodes.add(screenNode);
        }
        return screenNodes;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public PlayerCharacter getPlayerCharacter() {
        return playerCharacter;
    }

    public void setPlayerCharacter(PlayerCharacter playerCharacter) {
        this.playerCharacter = playerCharacter;
    }

    public NPCCharacter getNpcCharacters() {
        return npcCharacters;
    }

    public void setNpcCharacters(NPCCharacter npcCharacters) {
        this.npcCharacters = npcCharacters;
    }

    public List<ThemeScreen> getScreens() {
        return screens;
    }

    public void setScreens(List<ThemeScreen> screens) {
        this.screens = screens;
    }
}
