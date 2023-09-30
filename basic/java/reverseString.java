class Solution {
    public void reverseString(char[] s) {
        
        int len=s. length;
        char[] rev=new char[len];
        for(int i=0;i<len;i++){
            rev[i]=s[len-i-1];
        }
        for(int i=0;i<len;i++){
            s[i]=rev[i];
        }
    }
}