package Leetcode;

public class RotateString {
    public boolean solution(String s, String goal){
        for(int i=0;i<s.length();i++){
            String temp=s.substring(i,s.length()+1)+s.substring(0,i);
            if(temp.equals(goal)){
                return true;
            }
        }
        return false;
    }
}
