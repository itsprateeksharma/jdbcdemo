package oopddemo2;
class Honda extends Car
{
	public void hondastart()
	{
		Engine heng=new Engine(); //composition- Honda class fully dependent on engine
		heng.StartEngine();
	}


}


public class CompositionDemo {

	public static void main(String[] args) {
		
		Honda hondaCity= new Honda();
		hondaCity.setColor("Black");
		hondaCity.setMax_speed(180);
		
		System.out.println("-----------car details------------");
		System.out.println("car color: "+hondaCity.getColor());
		System.out.println("maximum speed: "+hondaCity.getMax_speed());
		
		hondaCity.hondastart();

		
		
		
	}

}
