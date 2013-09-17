package edu.utdallas.gamegenerator.Characters;

/**
 * User: clocke
 * Date: 2/17/13
 * Time: 6:04 PM
 */
public class NPCCharacter {
    private GameCharacter hero;
    private GameCharacter villan;
    private GameCharacter alt;

    public GameCharacter getHero() {
        return hero;
    }

    public void setHero(GameCharacter hero) {
        this.hero = hero;
    }

    public GameCharacter getVillan() {
        return villan;
    }

    public void setVillan(GameCharacter villan) {
        this.villan = villan;
    }

    public GameCharacter getAlt() {
        return alt;
    }

    public void setAlt(GameCharacter alt) {
        this.alt = alt;
    }
}
