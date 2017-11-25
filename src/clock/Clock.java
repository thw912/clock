/*
package clock;


public class Clock {

	private Display hour = new Display(24);
	private Display minute = new Display(60);
	private Display second = new Display(60);
	
	public void tick(){
			second.increase();
			if(second.getValue()==0){
				minute.increase();
				if(minute.getValue()==0){
					hour.increase();
				}
			}
//			System.out.printf("%02d:%02d\n", hour.getValue(),minute.getValue());
	}
	
	public Clock(int hour, int minute, int second){//初始化时间
		this.hour.value = hour;
		this.minute.value = minute;
		this.second.value = second;
	}
	
	public String toString(){
		return String.format("%02d:%02d:%02d\n", hour.getValue(),minute.getValue(),second.getValue());
	}
	
	public static void main(String[] args) {

		
		java.util.Scanner in = new java.util.Scanner(System.in);
		Clock clock = new Clock(in.nextInt(), in.nextInt(), in.nextInt());
		clock.tick();
		System.out.println(clock.toString());
		
	}

}


*/