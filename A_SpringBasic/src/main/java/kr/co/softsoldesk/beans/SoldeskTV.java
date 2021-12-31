package kr.co.softsoldesk.beans;

public class SoldeskTV implements TV{
	
	public SoldeskTV(){
		System.out.println("===>Soldesk TV 객체생성");
	}
	
	@Override
	public void powerOn() {
		System.out.println("===>Soldesk TV를 켠다.");
	}

	@Override
	public void powerOff() {
		System.out.println("===>Soldesk TV를 끈다. ");
	}

	@Override
	public void powerUp() {
		System.out.println("===>Soldesk TV 볼륨을 높인다.");
	}

	@Override
	public void powerDown() {
		System.out.println("===>Soldesk TV 볼륨을 낮춘다. ");
	}
	
}
