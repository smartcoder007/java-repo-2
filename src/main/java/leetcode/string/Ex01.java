package leetcode.string;

//Java Program to Get a Character From the Given String
//Input: str = "Geeks", index = 2
//Output: e
public class Ex01 {
    public static void main(String[] args) {
        String s ="Geeks";
        System.out.println(getCharLetter(s, 4));

    }
    static char getCharLetter(String input, int index){
        return input.charAt(index);

    }
}
