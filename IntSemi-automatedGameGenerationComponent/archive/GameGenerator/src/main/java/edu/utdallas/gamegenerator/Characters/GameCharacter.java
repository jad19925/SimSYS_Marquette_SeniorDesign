package edu.utdallas.gamegenerator.Characters;

import java.util.Map;

/**
 * User: clocke
 * Date: 2/17/13
 * Time: 6:08 PM
 */
public class GameCharacter {
    private String directory;
    private String prefix;
    private Map<String, String> characterAssets;
    private String name;

    public GameCharacter() {
        //Populate hash map
    }

    public String getCharacter(String characterAction) {
        return characterAssets.get(characterAction);
    }

    public String getDirectory() {
        return directory;
    }

    public void setDirectory(String directory) {
        this.directory = directory;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public Map<String, String> getCharacterAssets() {
        return characterAssets;
    }

    public void setCharacterAssets(Map<String, String> characterAssets) {
        this.characterAssets = characterAssets;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
