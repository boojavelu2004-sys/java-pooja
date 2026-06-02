class length {

    public int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        String lastword = words[words.length - 1];
        return lastword.length();
    }

    public static void main(String[] args) {

        length obj = new length();

        System.out.println(
            obj.lengthOfLastWord("Hello World")
        );
    }
}