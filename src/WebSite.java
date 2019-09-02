public class WebSite {
    int[] cellsLocation;
    int numOfHits = 0;

    public void setCellsLocation(int[] locs) {
        cellsLocation = locs;
    }

    public String checkMove (String stringGuess) {
        int guess = Integer.parseInt(stringGuess);
        String result = "Miss!";
        for (int cell : cellsLocation) {
            if(guess == cell) {
                result = "Hit!";
                numOfHits++;
                break;
            }
        }

        if(numOfHits == cellsLocation.length) {
            result = "Sink!";
        }

        System.out.println(result);
        return result;
    }
}