package tw.team5.Model;

/**
 * @author Chun-Kai Kao on 2018/6/21 01:15
 * @github http://github.com/cckaron
 */

public class StringManipulation {


    public static String expandUsername(String username){
        return username.replace("."," ");
    }

    public static String condenseUsername(String username){
        return username.replace(" ", ".");
    }

    public static String getTags(String string){
        if (string.indexOf("#") > 0){
            StringBuilder sb = new StringBuilder();
            char[] charArray = string.toCharArray();
            boolean foundWord = false;
            for (char c : charArray){
                if (c == '#'){
                    foundWord = true;
                    sb.append(c);
                }else{
                    if (foundWord){
                        sb.append(c);
                    }
                }
                if (c == ' '){
                    foundWord = false;
                }
            }
            String s = sb.toString().replace(" ", "").replace("#", ",#");
            return s.substring(1, s.length());
        }
        return string;
    }

    /*
    In -> some description #tag1 #tag2 #othertag

    Out -> #tag1,#tag2,#tag3
     */
}