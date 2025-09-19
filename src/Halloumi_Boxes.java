import java.util.*;
public class Halloumi_Boxes  {
    public static void main(String[] args) {
  String s = "##hufd##";
            int cnt = 0;
            StringBuilder sb = new StringBuilder();
            for (char c : s.toCharArray()) {
                if (c == '#') cnt++;
                else sb.append(c);
            }

        System.out.println("#".repeat(cnt) + sb);


    }
}

