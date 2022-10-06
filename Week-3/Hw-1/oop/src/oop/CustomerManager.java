package oop;

public class CustomerManager {
	
	private Customer _customer;
    private ICreditManager _creditManager;
    public CustomerManager(Customer customer, ICreditManager creditManager){
        _customer = customer;
        _creditManager = creditManager;
    }
    public void save(){
        System.out.println("M��teri kaydedildi");
    }

    public void delete(){
        System.out.println("M��teri silindi");
    }

    public void giveCredit(){
        _creditManager.calculate();
        System.out.println("Kredi verildi");
    }
}
