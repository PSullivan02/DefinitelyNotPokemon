package totallynotpokemon;

public class Moves {
    private String type;
    private String category;
    private int power;
    private int accuracy;
    private int uses;
    private boolean canUse;
    public absorb{
        this.type = "grass";
        this.category = "special";
        this.power = 20;
        this.accuracy = 100;
        this.uses = 25 + (int)Math.random() * 15;
    }
    String[] moves = new String[1];
        moves[0] = getAbsorb;
    public int getAbsorb(){
        return absorb;
    }    
}
