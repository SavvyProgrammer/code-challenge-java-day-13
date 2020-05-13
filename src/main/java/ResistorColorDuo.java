import java.util.HashMap;
import java.util.Map;

class ResistorColorDuo {

    int value(String[] colors) {

        Map<String, Integer> COLOURS = new HashMap<>();
        COLOURS.put("black", 0);
        COLOURS.put("brown", 1);
        COLOURS.put("red", 2);
        COLOURS.put("orange", 3);
        COLOURS.put("yellow", 4);
        COLOURS.put("green", 5);
        COLOURS.put("blue", 6);
        COLOURS.put("violet", 7);
        COLOURS.put("grey", 8);
        COLOURS.put("white", 9);

        StringBuilder resistanceValue = new StringBuilder();
        for (int i = 0; i < 2; i++) {

            String colour = colors[i];

            if (COLOURS.containsKey(colour))
                resistanceValue.append(COLOURS.get(colour).toString());

        }

        return Integer.valueOf(resistanceValue.toString());
    }

}
