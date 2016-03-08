
public class CrusherBuilder implements RobotBuilder {

    private Robot crusher;

    public CrusherBuilder() {
        crusher = new Crusher();
    }

    @Override
    public void buildHitPoints() {
        crusher.setHitPoints(100);
    }

    @Override
    public void buildArmor() {
        crusher.setArmor(100);
    }

    @Override
    public void buildDamage() {
        crusher.setDamage(0);
    }

    @Override
    public Robot getRobot() {
        return crusher;
    }


}
