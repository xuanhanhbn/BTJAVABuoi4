package ss4;

public class RunPhoneList {
    public static void main(String[] args) {
        PhoneBook pl = new PhoneBook();
        pl.insertPhone("Duong","098888");
        pl.insertPhone("Hanh","098788");
        pl.insertPhone("Duong","09888809");
        for (String i : pl.PhoneList){
            System.out.println(i);
        }
        pl.updatePhone("Duong","09877","012345");
        for (String i : pl.PhoneList){
            System.out.println(i);
        }
    }
}
