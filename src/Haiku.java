import java.sql.SQLOutput;

public class Haiku extends Poem{
    public Haiku(){
        super(3);
    }
    public int getSyllables(int l){
        switch(l){
            case(1):
            case(3):
                return 5;
            case(2):
                return 7;
            default:
                return 0;
        }
    }
    public void printRhythm(){
        for(int i = 1; i <= 3; i++) {
            for (int j = 1; j < getSyllables(i); j++)
                System.out.print("ta-");
            System.out.println("ta");
        }
    }
}
