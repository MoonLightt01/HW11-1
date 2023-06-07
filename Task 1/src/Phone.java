public class Phone {
    static String fromPhone;

    long nomber;
    String model;
    double weightPhone;
    String callerName;
    long nomberCaller;

    public Phone() {
    }

    public Phone(long nomber, String model, double weightPhone) {
        this.nomber = nomber;
        this.model = model;
        this.weightPhone = weightPhone;
    }

    public void stringInfoPhone() {
        System.out.println("Номер: " + nomber + "\nМодель: " + model + "\nВес: " + weightPhone + "\nСтрана производства: " + fromPhone + "\n");
    }

    public void reviceCall(String callerName) {
        this.callerName = callerName;
        reviceCall(callerName, 0);
    }

    public void reviceCall(String callerName, long nomberCaller) {
        System.out.println("Звонит абонент по имени: " + callerName + (nomberCaller == 0 ? "" : "\nномер: " + nomberCaller));
    }
}
