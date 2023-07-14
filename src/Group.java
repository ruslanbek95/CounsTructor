public class Group {
    private  int number;
    private String words;
    private int mas[];

    public Group() {
    }

    public Group(int number, String words, int[] mas) {
        this.number = number;
        this.words = words;
        this.mas = mas;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getWords() {
        return words;
    }

    public void setWords(String words) {
        this.words = words;
    }

    public int[] getMas() {
        return mas;
    }

    public void setMas(int[] mas) {
        this.mas = mas;
    }
}
