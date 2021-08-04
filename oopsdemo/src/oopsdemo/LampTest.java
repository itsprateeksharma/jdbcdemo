package oopsdemo;

class Lamp{
	// stores the value for light
	// true if light is on
	// false if light is offboolean isOn;
	
	
	
	boolean isOn;
	//method to turn on the light
	
	void turnOn()
	{
		isOn=true;
		System.out.println("Light on? "+isOn);
	}
	
	//method to turn off
	void turnOff()
	{
		isOn=false;
		System.out.println("Light on? "+isOn);
	}
}

public class LampTest {

	public static void main(String[] args) {
		
		// create object led and halogen
		Lamp led=new Lamp();
		Lamp halogen=new Lamp();
		
		//switch on 
		led.turnOn();
		halogen.turnOn();
		
		//switch off 
		led.turnOff();
		halogen.turnOff();
		
		
	}

}
