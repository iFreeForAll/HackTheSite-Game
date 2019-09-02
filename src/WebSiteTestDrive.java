public class WebSiteTestDrive {
    public static void main(String[] args) {
        int numOfGuesses = 0;

        GameHelper helper = new GameHelper();
        WebSite site = new WebSite();

        int randomNum = (int)(Math.random() * 5);
        int[] locations = {randomNum, randomNum + 1, randomNum + 2};
        site.setCellsLocation(locations);

        boolean isAlive = true;

        while(isAlive = true) {
            String guess = helper.getUserInput("Enter your guess: ");
            String result = site.checkMove(guess);
            numOfGuesses++;

            if(result.equals("Sink!")) {
                isAlive = false;
                System.out.println("You needed " + numOfGuesses + " tries to sink the ship!");
            }
        }
    }
}