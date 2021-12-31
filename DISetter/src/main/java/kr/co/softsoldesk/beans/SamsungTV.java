package kr.co.softsoldesk.beans;

public class SamsungTV implements TV{
	
	private AppleSpeaker speaker;
	private int price;
	
	public SamsungTV() {
		System.out.println("====> SamsungTV의 생성자.");
	}

	public SamsungTV(AppleSpeaker speaker, int price) {
		System.out.println("====> SamsungTV의 생성자.");
		this.speaker = speaker;
		this.price = price;
	}

	@Override
	public void powerOn() {
		System.out.println("SamsungTV 켜기 ");
		
	}

	@Override
	public void powerOff() {
		System.out.println("SamsungTV 끄기 ");
		
	}

	@Override
	public void volumeUp() {
//		System.out.println("SamsungTV 볼륨 업! ");
		speaker.volumeUp();
		
	}

	@Override
	public void volumeDown() {
//		System.out.println("SamsungTV 볼륨 다운! ");
		speaker.volumeDown();
	}
	
	// get/set 메서드로 bean에서 프로퍼티 잡음 
	public AppleSpeaker getSpeaker() {
		return speaker;
	}

	public void setSpeaker(AppleSpeaker speaker) {
		this.speaker = speaker;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	

}
