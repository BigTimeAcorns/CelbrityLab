public class Celebrity {
    private String name;
    private String guess;
    private String type;

    public Celebrity(String n, String g, String t) {
        this.name = n;
        this.guess = g;
        this.type = t;
    }

    public String getName() {
        return name;
    }

    public String getGuess(){
        return guess;
    }

    public String getType(){
        return type;
    }
}