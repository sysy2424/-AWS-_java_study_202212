package j12_배열;

//저장소 /비즈니스로직과 entity를 같이 담고있다.(비즈니스로직에 가까움) entity는 정보만 담은 객체.
public class J12_UserRepository {
	
	private J12_User[] userTable;
	
	//전체 생성자 alt+shift+s > constructor using fields
	public J12_UserRepository(J12_User[] userTable) {
		this.userTable = userTable;
	}
	
	public J12_User[] getUserTable() { 
		return userTable;          //배열객체를 리턴.
	}
	
	public void saveUser(J12_User user) {
		extendArrayOne();
		userTable[userTable.length - 1] = user;		
	}
	
	private void extendArray(int length) { //매개변수로 어떤값을 주느냐에 따라 여러개를 한꺼번에 늘일수있다.
		J12_User[] newArray = new J12_User[userTable.length + length];
		transferDataToNewArray(userTable, newArray); //userTable에 있는 것을 newArray로 다 옮겨라.
		userTable = newArray;
		
	}
	
	private void extendArrayOne() {  //하나씩 늘림.
		J12_User[] newArray = new J12_User[userTable.length + 1];
		transferDataToNewArray(userTable, newArray); //userTable에 있는 것을 newArray로 다 옮겨라.
		userTable = newArray;
		
	}
	//기존의 배열에 있는것들을 새배열에 옮긴다.
	private void transferDataToNewArray(J12_User[] oldArray, J12_User[] newArray) {
		for(int i = 0; i < oldArray.length; i++) {
			newArray[i] = oldArray[i];
		}
		
	}
	
	public J12_User findUserByUsername(String username) {      // 입력받은 값을 메소드로 넘김.
		
		J12_User user = null;
		
		for (J12_User u : userTable) {
			if(u == null) {					//객체는 항상 null체크 
				continue;
			}
			if(u.getUsername().equals(username)) {		
				user = u;
				break;
			}
		}
		
		return user;
	}
	
	
	
}
