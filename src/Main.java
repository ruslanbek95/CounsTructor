public class Main {
    public static void main(String[] args) {

        Group group = new Group(312, "words", new int[]{12, 3, 12, 45, 5, 323, 4});
        Group san = group;
        int san1 = group.getNumber();
        for (int i = 0; i < group.getMas().length; i++) {
            if (san == group && san1 == group.getNumber() &&) {
                san = group;
                san1 = group.getNumber();
                System.out.println(san.getMas()[i]);
            }
        }
        System.out.println(group.getWords() + "\n" + group.getNumber());
    }
}

















