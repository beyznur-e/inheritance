public class CustomerManager { // müşteriyle ilgili operasyonlar burada sağlanır.Ekleme,silme gibi. Kısaca Managerda "CRUD" işlemleri yapıyoruz.
    public void add(Customer customer){
        System.out.println(customer.getCustomerNumber() + " kaydedildi");
    }

    //bulk insert
    public void addMultiple(Customer[] customers){
        for(Customer customer : customers){
            add(customer);
        }
    }
}
