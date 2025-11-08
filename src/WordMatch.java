public class WordMatch{
    private String secret;
    public WordMatch(String word){secret = word.toLowerCase();}
    public int scoreGuess(String guess){
        guess = guess.toLowerCase();
        int numOccurrences = 0;
        for (int i = 0; i <= (secret.length() - guess.length()); i++) {
            if(guess.equals(secret.substring(i, (i + guess.length()))) ) numOccurrences ++;
        }
        return numOccurrences * ((int) Math.pow(guess.length(), 2));
    }
//    public String findBetterGuess(String guess1, String guess2){
//
//    }
}