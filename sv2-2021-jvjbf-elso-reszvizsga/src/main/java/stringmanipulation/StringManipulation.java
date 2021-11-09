package stringmanipulation;

public class StringManipulation {

    public String everyEvenCharacter(String s) {
        String everyEvenCharacter = "";
        for (int i = 0; i < s.length(); i += 2) {
            everyEvenCharacter += s.charAt(i);
        }
        return everyEvenCharacter;
    }
}
