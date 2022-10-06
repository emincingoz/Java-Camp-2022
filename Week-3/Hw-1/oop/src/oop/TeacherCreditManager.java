package oop;

public class TeacherCreditManager extends BaseCreditManager implements ICreditManager{
	
    @Override
    public void calculate() {
        System.out.println("Öðretmen kredisi hesaplandý");
    }
}
