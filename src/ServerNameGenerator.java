public class ServerNameGenerator {

    private static String[] adjective = {"ugly", "blue", "pretty", "goofy", "dirty", "golden", "amazing", "awesome", "new", "old"};

    private static String[] noun = {"dog", "cat", "lion", "fish", "whale", "car", "truck", "computer", "phone", "river"};

    private static String randomizer(String[] strings){
        int randomNumber = (int) (Math.random() * strings.length);
        return strings[randomNumber];
    }

    public static String genServerName (String[] arr1, String[] arr2){
        String adjective = randomizer(arr1);
        String noun = randomizer(arr2);
        return adjective + "-" + noun;
    }


    public static void main(String[] args) {
        System.out.println("Your server name is:");
        System.out.println(genServerName(adjective,noun));
    }

}
