package Boks_Oyunu;

public class main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Floyd",10,120,100,50);
        Fighter f2 = new Fighter("Ali",20,85,85,100);

        Match match = new Match(f1,f2,85,100);
        match.run();
    }
}
