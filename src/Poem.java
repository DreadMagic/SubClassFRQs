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

    public int getNumlines() {
        return lines;
    }
}
