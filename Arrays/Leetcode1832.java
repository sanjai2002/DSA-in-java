

public class Leetcode1832 {
    public static void main(String[] args) {
    String sentence = "thequickbrownfoxjumpsoverthelazydog";
      boolean ans=checkIfPangram(sentence);
      System.out.println(ans);
  
}

    public static  boolean checkIfPangram(String sentence) {
        boolean[] ch = new boolean[26];
        for(int i=0;i<sentence.length();i++) {
            ch[sentence.charAt(i)-97] = true;
        }
        int count=0;
        for(int i=0;i<ch.length;i++){
            if(ch[i]==true){
                count++;
            }
        }
        return count==26;
        
    }

    

    
}
