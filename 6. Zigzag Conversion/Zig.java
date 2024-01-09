public class Zig {
    public String convert(String s, int numRows) {
        int ind=0;
        int flag=1;
        int arr[] = new int[s.length()];

        if (numRows==1) {
            return s;
        }
        
        for (int i = 0; i < s.length(); i++) {
            if (ind==0) {
                flag=1;
            } else if (ind==numRows-1) {
                flag=-1;
            }
            arr[i] = ind;
            ind+=flag;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < s.length(); j++) {
                if (arr[j] == i) {
                    stringBuilder.append(s.charAt(j));
                }
            }
        }
        return stringBuilder.toString();
    }
    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int numRows = 4;
        Zig zig = new Zig();
        System.out.println(zig.convert(s,numRows));
    }
}
