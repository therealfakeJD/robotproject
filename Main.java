public class Main {

    public static void main(String[] args){
        Story story = new Story();
        RobotBuilder builder = new CrusherBuilder();
        Director director = new Director();
        Robot crusher1 = director.constructRobot(builder);
        System.out.println(crusher1);

        story.space();

        RobotBuilder builder2 = new RambotBuilder();
        Director director2 = new Director();
        Robot rambot1 = director2.constructRobot(builder2);
        System.out.println(rambot1);
        story.space();





        story.printStart();
        story.space();
        story.crusherAttack(rambot1);
        story.space();


        System.out.println(rambot1);
        story.space();
        story.rambotAttack(crusher1);

        story.space();
        System.out.println(crusher1);

        story.space();
        story.crusherPowerUp(crusher1);

        story.space();
        System.out.println(crusher1);

        story.space();
        story.rambotPowerUp(rambot1);

        story.space();
        System.out.println(rambot1);






    }
}
