
public class Robot {

    private int hitPoints;
    private int armor;
    private int damage;


    public int getHitPoints(){
        return hitPoints;
    }

    public void setHitPoints(int HitPoints){
        hitPoints = HitPoints;
    }

    public int getArmor(){
        return armor;
    }

    public void setArmor(int Armor){
        armor = Armor;
    }

    public int getDamage(){
        return damage;
    }

    public void setDamage(int Damage){
        damage = Damage;
    }

    public void hitEnemy(int HitPoints){
        hitPoints += HitPoints;
    }

    public void takeHit(int Armor, int Damage){
        armor -= Armor;
        damage -= Damage;
    }

    public void powerUp(int Armor, int Damage){
        armor += Armor;
        damage += Damage;
    }


}
