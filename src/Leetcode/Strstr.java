package Leetcode;

public class Strstr {
    public int[] nextArr(char[] pattern) {
        int[] next = new int[pattern.length];
        int index = 0;
        for (int i = 1; i < pattern.length; ){
            if (pattern[i] == pattern[index]) {
                next[i] = index + 1;
                index++;
                i++;
            }
            else {
                if(index!=0) {
                    index = next[index - 1];

                }
                else {
                    next[i] = 0;
                    i++;
                }
            }
        }
        return next;
    }

    public boolean solution(String text, String pattern){
        char[] txt = text.toCharArray();
        char[] pat = pattern.toCharArray();
        int[] next = nextArr(pat);
        int i=0,j=0;
        while(i < txt.length && j < pat.length) {
            if(txt[i] == pat[j]){
                i++;
                j++;
            }
            else {
                if(j!=0){
                    j=next[j-1];
                }
                else{
                    i++;
                }
            }
        }
        if(j==pat.length){
            return true;
        }
        return false;
    }




}
