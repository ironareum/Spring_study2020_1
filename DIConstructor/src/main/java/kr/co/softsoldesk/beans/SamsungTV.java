package kr.co.softsoldesk.beans;

public class SamsungTV implements TV{
	
	private SonySpeaker speaker;
	private int price;
	
	//소니 스피커를 받는 생성자 
	public SamsungTV(SonySpeaker speaker, int price) {
		System.out.println("SamsungTV의 생성자.");
		this.speaker = speaker;
		this.price = price;
	}

	@Override
	public void powerOn() {
		System.out.println("SamsungTV 전원 켜기");
		System.out.printf("SamsungTV 가격은 %d\n", price);
	}

	@Override
	public void powerOff() {
		System.out.println("SamsungTV 전원 끄기");
	}

	@Override
	public void volumeUp() {
//		System.out.println("SamsungTV 볼륨 업 ");
		speaker.volumeUp();
	}

	@Override
	public void volumeDown() {
//		System.out.println("SamsungTV 볼륨 다운 ");
		speaker.volumeUp();
	}
	
	
	
}
