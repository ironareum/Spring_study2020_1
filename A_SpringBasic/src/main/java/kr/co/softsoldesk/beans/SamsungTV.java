package kr.co.softsoldesk.beans;

public class SamsungTV implements TV{
	
	public SamsungTV(){
		System.out.println("===>Samsung tv 객체생성");
	}
	
	@Override
	public void powerOn() {
		System.out.println("===>Samsung tv를 켠다.");
	}

	@Override
	public void powerOff() {
		System.out.println("===>Samsung tv를 끈다.");
	}

	@Override
	public void powerUp() {
		System.out.println("===>Samsung tv 볼륨을 높인다.");
	}

	@Override
	public void powerDown() {
		System.out.println("===>Samsung tv 볼륨을 낮춘다.");
	}
	

}
