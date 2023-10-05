
/**
 * Homerun derby simulator
 *
 * Gabriel Flores
 * 12/14/18
 */
import java.util.Random;
import java.util.Scanner;

public class HomerunDerby {
    public enum Coin {
        Heads, Tails
    };

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean youFirst = true;
        boolean youSecond = true;
        Random randomNum = new Random();
        int result;
        int heads = 0;
        boolean h = (heads == 0);
        int tails = 1;
        boolean t = (tails == 1);
        // converted int to boolean
        Coin coinFlip;
        result = randomNum.nextInt(2);
        // coin flip info
        int l = 31;
        boolean a = (l != 0);
        int m = 32;
        boolean b = (m != 0);
        int n = 33;
        boolean c = (n != 0);
        // bat operators
        int yourScore = 0;
        int ronScore = 0;
        // score variables
        System.out.println("  ***!Welcome to the Show's annual HomeRun Derby!***     ");
        System.out.println("Enter name:");
        String player = input.nextLine();
        System.out.println(player + ",your opponent for today is Handsom Ron.");
        System.out.println("Choose your bat size," + "Options: 31inch 32inch 33inch");
        double batSize = input.nextDouble();
        System.out.println("Do a coin toss! " + "Heads go first.");
        entCont();
        if (result == 0) {
            coinFlip = Coin.Heads;
            youFirst = true;
            System.out.println("You flipped Heads!");
            System.out.println("You are first.Batter up!");
        } else {
            coinFlip = Coin.Tails;
            youSecond = true;
            System.out.println("You flipped Tails!");
            System.out.println("Handsom Ron is first.You're in the hole!");
        }
        // coin toss
        if (result == 0) {
            System.out.println("Check your swing one last time!");
            entCont();
        } else {
            System.out.println("Time the pitcher meanwhile");
            entCont();
        }
        // tells user if to go first or second
        if (result == 0) {
            if (youFirst == h) {
                if (batSize == l == youFirst) {
                    System.out.println(batSize + " inches is smaller than usual");
                    entCont();
                    for (int i = 1; i <= 10; i++) {
                        double x = Math.random();
                        int xNew = (int) (x * 1000);
                        xNew = Math.max(xNew, 55);
                        xNew = Math.min(xNew, 475);
                        System.out.println("Hit number " + i + " is " + xNew + " ft.");
                        if (xNew <= 30) {
                            System.out.println("Foul!");
                        } else if (xNew <= 449) {
                            System.out.println("Sorry:( Not a Home Run");
                        } else if (xNew >= 450) {
                            System.out.println("Home Run!!!");
                        }
                        if (xNew >= 450) {
                            yourScore++;
                        }
                    }
                } else if (batSize == m == youFirst) {
                    System.out.println(batSize + " inches is the perfect size");
                    entCont();
                    for (int i = 1; i <= 10; i++) {
                        double x = Math.random();
                        int xNew = (int) (x * 1000);
                        xNew = Math.max(xNew, 155);
                        xNew = Math.min(xNew, 555);
                        System.out.println("Hit number " + i + " is " + xNew + " ft.");
                        if (xNew <= 30) {
                            System.out.println("Foul!");
                        } else if (xNew <= 449) {
                            System.out.println("Sorry:( Not a Home Run");
                        } else if (xNew >= 450) {
                            System.out.println("Home Run!!!");
                        }
                        if (xNew >= 450) {
                            yourScore++;
                        }
                    }
                } else if (batSize == n == youFirst) {
                    System.out.println(batSize + " inches might be a little heavy");
                    entCont();
                    for (int i = 1; i <= 10; i++) {
                        double x = Math.random();
                        int xNew = (int) (x * 1000);
                        xNew = Math.max(xNew, 145);
                        xNew = Math.min(xNew, 525);
                        System.out.println("Hit number " + i + " is " + xNew + " ft.");
                        if (xNew <= 30) {
                            System.out.println("Foul!");
                        } else if (xNew <= 449) {
                            System.out.println("Sorry:( Not a Home Run");
                        } else if (xNew >= 450) {
                            System.out.println("Home Run!!!");
                        }
                        if (xNew >= 450) {
                            yourScore++;
                        }
                    }
                }
            } else// else for opponent
            {
                System.out.println("HANDSOME RON IS UP TO BAT THE CROWD GOES WILD!!!");
                entCont();
                for (int i = 1; i <= 10; i++) {
                    double x = Math.random();
                    int xNew = (int) (x * 1000);
                    xNew = Math.max(xNew, 305);
                    xNew = Math.min(xNew, 505);
                    System.out.println("Hit number " + i + " is " + xNew + " ft.");
                    if (xNew <= 30) {
                        System.out.println("Foul!");
                    } else if (xNew <= 449) {
                        System.out.println("Sorry:( Not a Home Run");
                    } else if (xNew >= 450) {
                        System.out.println("Home Run!!!");
                    }
                    if (xNew >= 450) {
                        ronScore++;
                    }
                }
            } // opponent goes second
        } // final code for if user flips heads
        if (result == 0)// opponent flips heads goes first
        {
            if (youSecond == h) {
                System.out.println("HANDSOME RON IS UP TO BAT THE CROWD GOES WILD!!!");
                entCont();
                for (int i = 1; i <= 10; i++) {
                    double x = Math.random();
                    int xNew = (int) (x * 1000);
                    xNew = Math.max(xNew, 305);
                    xNew = Math.min(xNew, 505);
                    System.out.println("Hit number " + i + " is " + xNew + " ft.");
                    if (xNew <= 30) {
                        System.out.println("Foul!");
                    } else if (xNew <= 450) {
                        System.out.println("Sorry:( Not a Home Run");
                    } else if (xNew >= 450) {
                        System.out.println("Home Run!!!");
                    }
                    if (xNew >= 450) {
                        ronScore++;
                    }
                }
            }
            // opponent flips heads goes first
            else {
                System.out.println("you are up to bat!");
                entCont();
                if (batSize == l == youFirst) {
                    System.out.println(batSize + "is smaller than usual");
                    entCont();
                    for (int i = 1; i <= 10; i++) {
                        double x = Math.random();
                        int xNew = (int) (x * 1000);
                        xNew = Math.max(xNew, 55);
                        xNew = Math.min(xNew, 475);
                        System.out.println("Hit number " + i + " is " + xNew + " ft.");
                        if (xNew <= 30) {
                            System.out.println("Foul!");
                        } else if (xNew <= 449) {
                            System.out.println("Sorry:( Not a Home Run");
                        } else if (xNew >= 450) {
                            System.out.println("Home Run!!!");
                        }
                        if (xNew >= 450) {
                            yourScore++;
                        }
                    }
                } else if (batSize == m == youFirst) {
                    System.out.println(batSize + " is the perfect size");
                    entCont();
                    for (int i = 1; i <= 10; i++) {
                        double x = Math.random();
                        int xNew = (int) (x * 1000);
                        xNew = Math.max(xNew, 155);
                        xNew = Math.min(xNew, 555);
                        System.out.println("Hit number " + i + " is " + xNew + " ft.");
                        if (xNew <= 30) {
                            System.out.println("Foul!");
                        } else if (xNew <= 449) {
                            System.out.println("Sorry:( Not a Home Run");
                        } else if (xNew >= 450) {
                            System.out.println("Home Run!!!");
                        }
                        if (xNew >= 450) {
                            yourScore++;
                        }
                    }
                } else if (batSize == n == youFirst) {
                    System.out.println(batSize + "might be a little heavy");
                    entCont();
                    for (int i = 1; i <= 10; i++) {
                        double x = Math.random();
                        int xNew = (int) (x * 1000);
                        xNew = Math.max(xNew, 145);
                        xNew = Math.min(xNew, 525);
                        System.out.println("Hit number " + i + " is " + xNew + " ft.");
                        if (xNew <= 30) {
                            System.out.println("Foul!");
                        } else if (xNew <= 449) {
                            System.out.println("Sorry:( Not a Home Run");
                        } else if (xNew >= 450) {
                            System.out.println("Home Run!!!");
                        }
                        if (xNew >= 450) {
                            yourScore++;
                        }
                    }
                }
            }
            System.out.println("Final score: " + player + ": " + yourScore + " Handsome Ron: " + ronScore);
            if (ronScore > yourScore) {
                System.out.println("Handsome Ron says, sorry pal maybe next time.");
            } else {
                System.out.println("You are a winner! Come back next year to defend your title.");
            }
        } // final code for if opponent flips heads
        if (result == 1)// code for both users if tails is flipped
        {
            if (youFirst == t)// opponent goes first
            {
                System.out.println("HANDSOME RON IS UP TO BAT THE CROWD GOES WILD!!!");
                entCont();
                for (int i = 1; i <= 10; i++) {
                    double x = Math.random();
                    int xNew = (int) (x * 1000);
                    xNew = Math.max(xNew, 305);
                    xNew = Math.min(xNew, 505);
                    System.out.println("Hit number " + i + " is " + xNew + " ft.");
                    if (xNew <= 30) {
                        System.out.println("Foul!");
                    } else if (xNew <= 449) {
                        System.out.println("Sorry:( Not a Home Run");
                    } else if (xNew >= 450) {
                        System.out.println("Home Run!!!");
                    }
                    if (xNew >= 450) {
                        ronScore++;
                    }
                }
            } else// user goes second
            {
                System.out.println("you are up to bat!");
                entCont();
                if (batSize == l == youFirst) {
                    System.out.println(batSize + "is smaller than usual");
                    entCont();
                    for (int i = 1; i <= 10; i++) {
                        double x = Math.random();
                        int xNew = (int) (x * 1000);
                        xNew = Math.max(xNew, 55);
                        xNew = Math.min(xNew, 475);
                        System.out.println("Hit number " + i + " is " + xNew + " ft.");
                        if (xNew <= 30) {
                            System.out.println("Foul!");
                        } else if (xNew <= 449) {
                            System.out.println("Sorry:( Not a Home Run");
                        } else if (xNew >= 450) {
                            System.out.println("Home Run!!!");
                        }
                        if (xNew >= 450) {
                            yourScore++;
                        }
                    }
                } else if (batSize == m == youFirst) {
                    System.out.println(batSize + " inches is the perfect size");
                    entCont();
                    for (int i = 1; i <= 10; i++) {
                        double x = Math.random();
                        int xNew = (int) (x * 1000);
                        xNew = Math.max(xNew, 155);
                        xNew = Math.min(xNew, 555);
                        System.out.println("Hit number " + i + " is " + xNew + " ft.");
                        if (xNew <= 30) {
                            System.out.println("Foul!");
                        } else if (xNew <= 449) {
                            System.out.println("Sorry:( Not a Home Run");
                        } else if (xNew >= 450) {
                            System.out.println("Home Run!!!");
                        }
                        if (xNew >= 450) {
                            yourScore++;
                        }
                    }
                } else if (batSize == n == youFirst) {
                    System.out.println(batSize + " inches might be a little heavy");
                    entCont();
                    for (int i = 1; i <= 10; i++) {
                        double x = Math.random();
                        int xNew = (int) (x * 1000);
                        xNew = Math.max(xNew, 145);
                        xNew = Math.min(xNew, 525);
                        System.out.println("Hit number " + i + " is " + xNew + " ft.");
                        if (xNew <= 30) {
                            System.out.println("Foul!");
                        } else if (xNew <= 449) {
                            System.out.println("Sorry:( Not a Home Run");
                        } else if (xNew >= 450) {
                            System.out.println("Home Run!!!");
                        }
                        if (xNew >= 450) {
                            yourScore++;
                        }
                    }
                }
            }
        } // final code for if user flips tails
        if (result == 1)// code for tails if opponent flips tails, user goes second
        {
            if (youSecond == t)// user goes first since opponent flipped tails
            {
                System.out.println("you are up to bat!");
                entCont();
                if (batSize == l == youFirst) {
                    System.out.println(batSize + " inches is smaller then usual");
                    entCont();
                    for (int i = 1; i <= 10; i++) {
                        double x = Math.random();
                        int xNew = (int) (x * 1000);
                        xNew = Math.max(xNew, 55);
                        xNew = Math.min(xNew, 475);
                        System.out.println("Hit number " + i + " is " + xNew + " ft.");
                        if (xNew <= 30) {
                            System.out.println("Foul!");
                        } else if (xNew <= 449) {
                            System.out.println("Sorry:( Not a Home Run");
                        } else if (xNew >= 450) {
                            System.out.println("Home Run!!!");
                        }
                        if (xNew >= 450) {
                            yourScore++;
                        }
                    }
                } else if (batSize == m == youFirst) {
                    System.out.println(batSize + " inches is the perfect size");
                    entCont();
                    for (int i = 1; i <= 10; i++) {
                        double x = Math.random();
                        int xNew = (int) (x * 1000);
                        xNew = Math.max(xNew, 155);
                        xNew = Math.min(xNew, 555);
                        System.out.println("Hit number " + i + " is " + xNew + " ft.");
                        if (xNew <= 30) {
                            System.out.println("Foul!");
                        } else if (xNew <= 449) {
                            System.out.println("Sorry:( Not a Home Run");
                        } else if (xNew >= 450) {
                            System.out.println("Home Run!!!");
                        }
                        if (xNew >= 450) {
                            yourScore++;
                        }
                    }
                } else if (batSize == n == youFirst) {
                    System.out.println(batSize + " inches might be a litle heavy");
                    entCont();
                    for (int i = 1; i <= 10; i++) {
                        double x = Math.random();
                        int xNew = (int) (x * 1000);
                        xNew = Math.max(xNew, 145);
                        xNew = Math.min(xNew, 525);
                        System.out.println("Hit number " + i + " is " + xNew + " ft.");
                        if (xNew <= 30) {
                            System.out.println("Foul!");
                        } else if (xNew <= 449) {
                            System.out.println("Sorry:( Not a Home Run");
                        } else if (xNew >= 450) {
                            System.out.println("Home Run!!!");
                        }
                        if (xNew >= 450) {
                            yourScore++;
                        }
                    }
                } else// opponent is up to bat
                {
                    System.out.println("HANDSOME RON IS UP TO BAT THE CROWD GOES WILD!!!");
                    entCont();
                    for (int i = 1; i <= 10; i++) {
                        double x = Math.random();
                        int xNew = (int) (x * 1000);
                        xNew = Math.max(xNew, 305);
                        xNew = Math.min(xNew, 505);
                        System.out.println("Hit number " + i + " is " + xNew + " ft.");
                        if (xNew <= 30) {
                            System.out.println("Foul!");
                        } else if (xNew <= 449) {
                            System.out.println("Sorry:( Not a Home Run");
                        } else if (xNew >= 450) {
                            System.out.println("Home Run!!!");
                        }
                        if (xNew >= 450) {
                            ronScore++;
                        }
                    }
                }
            }
            System.out.println("Final score: " + player + ": " + yourScore + " Handsome Ron: " + ronScore);
            if (ronScore > yourScore) {
                System.out.println("Handsome Ron says, sorry pal maybe next time.");
            } else {
                System.out.println("You are a winner! Come back next year to defend your title.");
            }
        } // final instructions for if tails is flipped
    }

    public static void entCont() {
        Scanner s = new Scanner(System.in);
        System.out.println("Press Enter to Continue");
        s.nextLine();
    }
}
