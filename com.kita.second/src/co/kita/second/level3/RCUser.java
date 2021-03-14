package co.kita.second.level3;

public class RCUser {
	RemoteControl rc = new Tv();
	
	RCUser(){}
	RCUser(RemoteControl rc){
		this.rc = rc;
		rc.turnOn();
		rc.setVolume(0);
		rc.turnOff();
	}
	void useRC() {
		RemoteControl rc = new Audio();
//		rc.turnOn();
	}
	void useRC(RemoteControl rc) {
		rc.turnOn();
	}
		
}
