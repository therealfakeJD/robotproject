/**
 * Created by coden on 3/7/2016.
 */
public class Story extends Robot{

    public void printStart(){
        System.out.println("The Robots are ready to fight!!!");
    }

    public void crusherAttack(Robot rambot1){
        System.out.println("The Crusher has the Rambot in it's jaws");
        rambot1.takeHit(10, 10);
    }

    public void rambotAttack(Robot crusher1){
        System.out.println("The Rambot almost flipped over the Crusher!!!");
        crusher1.takeHit(10, 10);
    }

    public void crusherPowerUp(Robot crusher1){
        System.out.println("The Crusher has found a power up");
        crusher1.powerUp(25, 25);
    }

    public void rambotPowerUp(Robot rambot1){
        System.out.println("The Rambot has found a power up");
        rambot1.powerUp(25, 25);
    }

    public void space(){
        System.out.println("");
    }
}
