import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {

        String line = "АбВгААВВ";

        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);

            if (!map.containsKey(ch)) {
                System.out.print(ch);
                continue;
            }
            System.out.print(map.get(ch));
        }


        // В метод превратить
        java.time.LocalTime time = java.time.LocalTime.now();

        if (time.getHour() > 0 && time.getHour() < 6) {
            System.out.println("Доброй ночи, ");
        } else if (time.getHour() >= 6 && time.getHour() < 12) {
            System.out.println("Доброе утро, ");
        } else if (time.getHour() >= 12 && time.getHour() < 18) {
            System.out.println("Добрый день, ");
        } else {
            System.out.println("Добрый вечер, ");
        }



        DbConnectionImpl dbConnection = new DbConnectionImpl();

        //dbConnection.insert(new Product("Motorolla", 10524));
    }

    private static Map<Character, String> map = new HashMap<Character, String>() {
        {
            put('а', "a");
            put('б', "b");
            put('в', "v");
            put('г', "g");
            put('д', "d");
            put('е', "e");
            put('ж', "zh");
            put('з', "z");
            put('и', "i");
            put('й', "j");
            put('к', "k");
            put('л', "l");
            put('м', "m");
            put('н', "n");
            put('о', "o");
            put('п', "p");
            put('р', "r");
            put('с', "s");
            put('т', "t");
            put('у', "u");
            put('ф', "f");
            put('х', "x");
            put('ц', "c");
            put('ч', "ch");
            put('ш', "sh");
            put('щ', "shh");
            put('ы', "y");
            put('э', "e");
            put('ю', "yu");
            put('я', "ya");
        }
    };

}
