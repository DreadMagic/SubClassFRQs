package Poem;

public class Poem {
    private int lines;

    public Poem() {
        lines = 0;
    }

    public Poem(int l) {
        lines = l;
    }

    public void printRhythm() {
        System.out.println("Free Verse!");
    }

    public void printTa(int s) {
        for (int i = 0; i < s; i++)
            System.out.print("ta-");
        System.out.println("ta");
    }


    public int getNumlines() {
        return lines;
    }
}
