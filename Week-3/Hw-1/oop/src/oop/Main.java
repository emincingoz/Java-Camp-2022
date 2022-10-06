package oop;

public class Main {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
        customer.setId(1);
        customer.setCity("Ankara");

        CustomerManager customerManager = new CustomerManager(customer, new TeacherCreditManager());
        customerManager.save();
        customerManager.delete();
        customerManager.giveCredit();

        Company company = new Company();
        company.setId(100);
        company.setCompanyName("Company");
        company.setTaxNumber("1111111111111");

        CustomerManager customerManager2 = new CustomerManager(company, new MilitaryCreditManager());
        customerManager2.giveCredit();

        Person person = new Person();
        person.setFirstName("Emin");
        person.setLastName("Cingöz");
        person.setNationalIdentity("1111111111");

        Customer customer1 = new Customer();
        Customer customer2 = new Person();
        Customer customer3 = new Company();
	}

}
