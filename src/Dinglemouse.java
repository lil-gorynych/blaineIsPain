import java.util.ArrayList;

public class Dinglemouse {

    // =======================================
    // Blaine is a pain, and that is the truth
    // =======================================

    public static int trainCrash(final String track, final String aTrain,
                                 final int aTrainPos, final String bTrain,
                                 final int bTrainPos, final int limit) {



        return 0;
    }

    public static class Track {
        public ArrayList<ArrayList<Character>> track = new ArrayList<>();

        public Track (String string) {
            this.track = parseString(string);
        }

        private ArrayList<ArrayList<Character>> parseString (String string) {
            ArrayList<ArrayList<Character>> result = new ArrayList<>();
            ArrayList<Character> temp = new ArrayList<>();

            for (Character i : string.toCharArray()) {
                if (i == '\n') {
                    result.add(temp); temp.clear();
                    continue;
                }
                temp.add(i);
            }
            result.add(temp);
            return result;
        }



    }

}