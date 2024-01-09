class Common {
    public String longestCommonPrefix(String[] strs) {
        int min_length=strs[0].length()-1;

        for(String string: strs){
            if(string.length() == 0){
                return string;
            }
            min_length = Math.min(min_length, string.length()-1);
        }
        
        String s=strs[0];
        while(true){
            for(String string: strs){
                if (s.charAt(min_length) == string.charAt(min_length)) {
                    return string.substring(0, min_length);
                }
            }
            min_length--;
        }
    }

    public static void main(String[] args) {
        String[] strs = {"flower","flower","flower","flower"};
        Common com = new Common();
        System.out.println(com.longestCommonPrefix(strs));
    }
}