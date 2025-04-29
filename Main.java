
public class Main {
    public static void main(String[] args) {
        Game one = new Game();
        one.getLevel(1).reachGoal();
        one.getLevel(1).setPoints(200);
        one.getLevel(2).reachGoal();
        one.getLevel(2).setPoints(100);
        one.getLevel(3).reachGoal();
        one.getLevel(3).setPoints(500);
        one.makeBonus();
        System.out.println(one.getScore());

        Game two = new Game();
        two.getLevel(1).reachGoal();
        two.getLevel(1).setPoints(200);
        two.getLevel(2).reachGoal();
        two.getLevel(2).setPoints(100);
        two.getLevel(3).reachGoal();
        two.getLevel(3).setPoints(500);
        System.out.println(two.getScore());

        Game three = new Game();
        System.out.println("Maximum score for game three: " + three.playManyTimes(3));

        Game five = new Game();
        System.out.println("Maximum score for game five: " + five.playManyTimes(4));
    }
}
