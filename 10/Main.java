3. В каждой строке найти слова, начинающиеся с гласной буквы.
*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String[] lines = {
                "На улице было тепло",
                "Кто сказал что решает масса",
        };
        String text = "АОИЕЁЭЫУЮЯаеёиоуыэюя";
        for (String line : lines) {
            String[] words = line.split("\\s+");
            List<String> Words = new ArrayList<>();
            for (String word : words) {
                if (word.length() > 0 && text.indexOf(word.charAt(0)) != -1) {
                    Words.add(word);
                }
            }
            System.out.println("Слово, начинающиеся с гласной в строке \"" + line + "\": " + Words);
        }
    }
}
