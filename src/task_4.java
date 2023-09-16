import java.util.ArrayList;

public class task_4 {
    public static void main(String[] args) {
        String str = "Lorem ipsum: sads ,dolaaaor. Dignissimos coraAaporis!Axcepturi, accusamus quds";

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
        int biggestLettersCount = 1;
        
        for(String word : arr) {
            int count = 0;
            char[] letters = word.toCharArray();
            for(int f = 0; f < letters.length; f++) {
                if(letters[f] == 'a' || letters[f] == 'A') {
                    count++;
                }
            }
            if(count > biggestLettersCount) {
                biggestLettersCount = count;
            }
        }

        int lengthOfNewArray = 0;
        for(String word : arr) {
            int count = 0;
            char[] letters = word.toCharArray();
            for(int f = 0; f < letters.length; f++) {
                if(letters[f] == 'a' || letters[f] == 'A') {
                    count++;
                }
            }
            if(count == biggestLettersCount) {
                lengthOfNewArray++;
            }
        }


        String[] newArray = new String[lengthOfNewArray];
        int newArrayIndex = 0;
        for(String word : arr) {
            int count = 0;
            char[] letters = word.toCharArray();
            for(int f = 0; f < letters.length; f++) {
                if(letters[f] == 'a' || letters[f] == 'A') {
                    count++;
                }
            }
            if(count == biggestLettersCount) {
                newArray[newArrayIndex] = word;
                newArrayIndex++;
            }
        }


        for(String word : newArray) {
            System.out.println(word);
        }
    }
}