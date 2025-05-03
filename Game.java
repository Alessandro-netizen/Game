import java.util.Scanner;

public class Game {
    private Level levelOne;
    private Level levelTwo;
    private Level levelThree;
    private boolean bonus;

    public Game()
    {
        levelOne = new Level();
        levelTwo = new Level();
        levelThree = new Level();
    }


    public boolean isBonus() {
        return bonus;
    }

    public void makeBonus() {
        bonus = true;
    }

    public Level getLevel(int i) {
        if (i == 1) return levelOne;
        if (i == 2) return levelTwo;
        if (i == 3) return levelThree;
        return null;
    }

    public int getScore() {
        int points = 0;
        if (levelOne.goalReached()) {
            points += levelOne.getPoints();
            if (levelTwo.goalReached()) {
                points += levelTwo.getPoints();
                if (levelThree.goalReached()) {
                    points += levelThree.getPoints();
                }
            }
        }
        if (isBonus()) points *= 3;
        return points;
    }

    public void play() {
        System.out.println("Enter the number of points for level one:");
        Scanner s = new Scanner(System.in);
        levelOne.setPoints(s.nextInt());
        levelOne.reachGoal();
        levelTwo.setPoints(0);
        levelTwo.reachGoal();
        levelThree.setPoints(0);
        levelThree.reachGoal();
        bonus = false;
        s.close();
    }

    public int playManyTimes(int num) {
        int max = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < num; i++) {
            play();
            int score = getScore();
            if (score > max) max = score;
        }
        scanner.close();
        return max;
    }
}
