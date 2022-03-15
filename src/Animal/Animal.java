package Animal;

public class Animal {
    private String diet;
    private String species;
    private String name;

    public Animal(){}
    public Animal(String d, String s, String n){
        diet = d;
        species = s;
        name = n;
    }

    public String toString(){
        return name + " the " + species + " is a " + diet;
    }


}
