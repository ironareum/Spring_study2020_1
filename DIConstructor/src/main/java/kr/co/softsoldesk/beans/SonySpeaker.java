package kr.co.softsoldesk.beans;

public class SonySpeaker {
	
	public SonySpeaker() {
		System.out.println("===> SonySpeaker의 생성자.");
	}
	
	public void volumeUp() {
		System.out.println("SonySpeaker 볼륨 업!");
	}
		
	public void volumeDown() {
		System.out.println("SonySpeaker 볼륨 다운!");
	}
	
//	public void powerOn() {
//		System.out.println("SonySpeaker 전원 켜기 !");
//	}
//	
//	public void powerOff() {
//		System.out.println("SonySpeaker 전원 끄기 !");
//	}
	
}
