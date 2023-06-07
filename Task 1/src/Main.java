public class Main {
    public static void main(String[] args) {
        Phone.fromPhone = "Китай";
//        Phone iphone = new Phone(380313134,"11 тый айфон", 200);
//        iphone.reviceCall("Вася пупкин", 380914145);
//        iphone.stringInfoPhone();
        Phone xiaomi = new Phone(38050511, "Poco x3nfc", 400);
        xiaomi.stringInfoPhone();
        xiaomi.reviceCall("Сяомибой", 380213992);
    }
}
