import model.Contact;
import model.MobilePhone;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("*********************************");
        Contact mehmet =new Contact("mehmet","21313212313");
        Contact ahmet =new Contact("ahmet","55435345433");
        Contact ayse =new Contact("ayse","9708907087");
        Contact fatma =new Contact("fatma","1111111111");
        MobilePhone mobilePhone=new MobilePhone("5534494315");
        mobilePhone.addNewContact(mehmet);
        mobilePhone.addNewContact(ahmet);
        mobilePhone.addNewContact(ayse);
        mobilePhone.addNewContact(fatma);
        System.out.println("--initial contacts started");
        mobilePhone.printContacts();
        System.out.println("--initial contacts ended");
        System.out.println("--initial contacts started");
        boolean updateResult=mobilePhone.updateContact(ahmet,new Contact("ahmet","1298491894891"));
        mobilePhone.printContacts();
        System.out.println("update contacts ended: "+updateResult);
        System.out.println("remove contact started");
        boolean removeResult=mobilePhone.removeContact(ayse);

    }
}