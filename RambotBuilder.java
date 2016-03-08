
public class RambotBuilder implements RobotBuilder{


        private Robot rambot;

        public RambotBuilder() {
            rambot = new Rambot();
        }

        @Override
        public void buildHitPoints() {
            rambot.setHitPoints(100);
        }

        @Override
        public void buildArmor() {
            rambot.setArmor(100);
        }

        @Override
        public void buildDamage() {
            rambot.setDamage(0);
        }

        @Override
        public Robot getRobot() {
            return rambot;
        }


    }


