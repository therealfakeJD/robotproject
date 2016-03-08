
public class Director {

    public Robot constructRobot(RobotBuilder builder){
        builder.buildHitPoints();
        builder.buildArmor();
        builder.buildDamage();
        return builder.getRobot();
    }
}
