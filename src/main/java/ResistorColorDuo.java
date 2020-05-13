
import java.util.List;

class ResistorColorDuo {

    int value(String[] colors) {

        List<String> colorCodesList = List.of(new String[]{

                "black",
                "brown",
                "red",
                "orange",
                "yellow",
                "green",
                "blue",
                "violet",
                "grey",
                "white"

        });

        return colorCodesList.indexOf(colors[0]) * 10 + colorCodesList.indexOf(colors[1]);


    }

}
