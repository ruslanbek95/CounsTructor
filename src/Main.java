public class Main {
    public static void main(String[] args) {

        Group group = new Group(312, "words", new int[]{12, 3, 12, 45, 5, 323, 4});

        for (int i = 0; i < group.getMas().length; i++) {
            System.out.print(group.getMas()[i]+" ");
            }
        System.out.println("\n"+group.getNumber()+"\n"+group.getWords());
    }
}


















