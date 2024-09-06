public class Main {
    public static void main(String[] args) {

       IndividualCustomer engin = new IndividualCustomer();
       engin.setCustomerNumber("12345");

       CorporateCustomer hepsiBurada = new CorporateCustomer();
       hepsiBurada.setCustomerNumber("78910");

       SendikaCustomer sendika = new SendikaCustomer();
       sendika.setCustomerNumber("99999");

       CustomerManager customerManager = new CustomerManager();

       Customer[] customers = {engin, sendika, hepsiBurada};

       customerManager.addMultiple(customers);


    }
}