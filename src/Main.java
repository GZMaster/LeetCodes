public class Main {
    public static void main(String[] args) {
        String input1 = "abbzzca";
        String input2 = "babzzcz";

        boolean findCloseStrings = new TwoStringsClose().closeStrings(input1, input2);

        System.out.println(findCloseStrings);
    }
}