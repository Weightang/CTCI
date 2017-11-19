

/**
 * 实现一个算法，确定一个字符串的所有字符是否全都不同。假使不允许使用额外的数据结构，
 */
public class Question1{
  
    public static boolean isUniqueChars(String str){
            if(str.length()>256) {
                return false;
            }
            boolean[] char_set=new boolean[256];
            for(int i =0; i<str.length();i++){
                int val=str.charAt(i);
                if(char_set[val]){
                    return false;
                }
                char_set[val]=true;
            }
            return true;
    }

  
public static void main(String[] args) {
    // System.out.println("ccc");
    boolean b= isUniqueChars("hello");
    System.out.println(b);
}

}