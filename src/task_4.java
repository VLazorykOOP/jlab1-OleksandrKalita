import java.util.ArrayList;

public class task_4 {
    public static void main(String[] args) {
        String str = "Lorem ipsum: sads ,dolor. Dignissimos corporis!Axcepturi, accusamus quds";

        String[] array = str.split("[\s.,:!?-]+");

        // getWordList(array);
        getWordList_2(array);
    }
    public static void getWordList(String[] arr) {
        ArrayList<String> list = new ArrayList<>();

        for(String word : arr) {
            if(word.contains("a") || word.contains("A")) {
                list.add(word);
            }
        }
        for(String word : list) {
            System.out.println(word);
        }
    }
    public static void getWordList_2(String[] arr) {
        int lengthOfNewArray = 0;

        for(String word : arr) {
            if(word.contains("a") || word.contains("A")) {
                lengthOfNewArray++;
            }
        }

        String[] newArray = new String[lengthOfNewArray];

        for(int i = 0; i < lengthOfNewArray;) {
            for(String word : arr) {
                if(word.contains("a") || word.contains("A")) {
                    newArray[i] = word;
                    i++;
                }
            }
        }

        removeSmallWords(newArray);

        // for(String word : newArray) {
        //     System.out.println(word);
        // }
    }
    public static void removeSmallWords(String[] arr) {
        int smallestWordCount = 1;
        int biggestWordCount = 1;

        for(int i = 0; i < arr.length; i++) {
            String word = arr[i];
            char[] letters = word.toCharArray();

            int countOfLetters = 0;
            for(int f = 0; f < letters.length; f++) {
                if(letters[f] == 'a' || letters[f] == 'A') {
                    countOfLetters++;
                }
            }
            
            if(countOfLetters <= smallestWordCount) {
                smallestWordCount = countOfLetters;
            }else if(countOfLetters >= biggestWordCount) {
                biggestWordCount = countOfLetters;
            }else { }   
        }
        int lengthArray = 0;
        for(int i = 0; i < arr.length; i++) {
            String word = arr[i];
            char[] letters = word.toCharArray();

            int countOfLetters = 0;
            for(int f = 0; f < letters.length; f++) {
                if(letters[f] == 'a' || letters[f] == 'A') {
                    countOfLetters++;
                }
            } 
            if(countOfLetters != smallestWordCount) {
                lengthArray++;
            }
        }

        String[] newArray = new String[lengthArray];
        int index = 0;
        for(int i = 0; i < arr.length; i++) {
            String word = arr[i];
            char[] letters = word.toCharArray();

            int countOfLetters = 0;
            for(int f = 0; f < letters.length; f++) {
                if(letters[f] == 'a' || letters[f] == 'A') {
                    countOfLetters++;
                }
            }

            if(countOfLetters != smallestWordCount) {
                newArray[index] = word;
                index++;
            }
        }
        for(String word : newArray) {
            System.out.println(word);
        }

    }
}