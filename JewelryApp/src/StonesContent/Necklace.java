
package StonesContent;
import StonesContent.Stonetypes.Stone;

public class Necklace{
    String NecklaceName;
    Stone neckStones;

    public Necklace(){
        NecklaceName = "";
        this.neckStones = new Stone();
    }

    public Necklace(String necklaceName){
        NecklaceName = necklaceName;
        this.neckStones = new Stone();
    }

    public String getNecklaceName(){ return NecklaceName;}
    public void setNecklaceName(String necklaceName){
        NecklaceName = necklaceName;
    }
    public Stone getNeckStones(){
        return this.neckStones;
    }
}