package design.duck;

public class FlyNoWay implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("날개꺽음");
	}

}
