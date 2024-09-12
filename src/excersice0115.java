public class excersice0115 {
    public static void main(String[] args) {
        String sentence = "the string with five words";
        
        String word = "dog";
        int place = sentence.indexOf(word);
        
        if(place>=0)
        {
            System.out.println("The word " +word +" was found at index: " +place );
        }
        else
        {
            System.out.println("the word " +word + " was not in the sentence");
        }

        System.out.println(sentence.replace("five", "dog"));



    }
}
