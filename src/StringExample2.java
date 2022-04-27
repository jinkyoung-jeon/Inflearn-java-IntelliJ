package src;

public class StringExample2 {
    public static void main(String[] args) {
        String chicken = "치킨은 살 안 쪄요.";
        System.out.println(chicken);

        String me = "살은 내가 쪄요.";
        String chickenAndMe = chicken + me;
        System.out.println(chickenAndMe);


        int length = me.length();
        System.out.println(length);


        System.out.println(me.replaceAll("내가", "치킨이"));

        String replaced = me.replaceAll("내가", "치킨이");
        System.out.println(replaced);


        String birthday = "1970/01/02";
        String year = birthday.substring(0, 4);
        String day = birthday.substring(8);
        System.out.println(year);
        System.out.println(day);
        System.out.println(year + day);
    }
}
