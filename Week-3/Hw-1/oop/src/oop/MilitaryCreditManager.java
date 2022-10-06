package oop;

public class MilitaryCreditManager extends BaseCreditManager implements ICreditManager{
	
    @Override
    public void calculate() {
        System.out.println("Asker kredisi hesaplandý");
    }
}
