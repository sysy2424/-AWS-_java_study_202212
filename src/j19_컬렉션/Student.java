package j19_컬렉션;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//@NoArgsConstructor  //기본생성자. 생성자의 매개변수가 없다.
//@RequiredArgsConstructor
//@Getter
//@Setter
//@EqualsAndHashCode
//@ToString

@AllArgsConstructor  //전체생성자.
@Data
 //정보를 담는 entity객체
public class Student {
	
	private String name;	
	private int year;
//	private	final String address;

}
