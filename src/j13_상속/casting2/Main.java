package j13_상속.casting2;

public class Main {
	
	public static void main(String[] args) {
		Taxi taxi = new Taxi();
		Subway subway = new Subway();
		
//		Transportation transportation = new Transportation();
//		Taxi t1 = (Taxi) transportation;  //다운캐스팅 
//		
//		Transportation transportation1 = taxi; 
//		Subway s1 = (Subway)transportation1; //subway로 다운캐스팅 안된다.
//		
//		Transportation transportation2 = subway; //다운캐스팅 안된다.
		
		
		Transportation[] transportations = new Transportation[6];
		
		transportations[0] = taxi;
		transportations[1] = subway;
		transportations[2] = taxi;
		transportations[3] = subway;
		transportations[4] = taxi;
		transportations[5] = subway;
		
		for(int i = 0; i < transportations.length; i++) {
			
			if(transportations[i] instanceof Taxi) {   
				
			}else if(transportations[i] instanceof Subway) {
				Subway sw = (Subway)transportations[i];
				sw.checkRoute();
			}
//			Taxi tx = (Taxi)transportations[i];//taxi로 다운캐스팅. [1]이되면 subway를 꺼내서 캐스팅하면 오류남.
			transportations[i].go();	
			
		}
		
		for(Transportation t : transportations) {  //for each구문
			t.stop();
		}
	}
}
