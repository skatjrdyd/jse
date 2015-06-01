package api02.util.hashmap;

import java.util.HashMap;
import java.util.Map;

/*
 * 객체지향의 4대 특징인 은닉화, 상속, 추상화, 다양성 중
 * 추상화 + 다양성을 구현하는 implements 입니다.
 * 인터페이스 구현 방식은 클래스 옆 다음에 implements를 코딩후
 * 인터페이스를 입력하시고 나면, 클래스명에 빨간줄에 에러가 표시되는데
 * 마우스를 대시면 add unimplement를 클릭하세요
 * */

public class MemberServiceImpl implements MemberService {
	Map<String,Object> map = new HashMap<String, Object>();
	MemberVO vo = new MemberVO();
	public void join(String id, String password, String name, int age,
			String addr) {
		// 1. vo 객체 생성
		
		vo.setAddr(addr);
		vo.setId(id);
		vo.setPassword(password);
		vo.setAge(age);
		vo.setName(name);
		// DB에 값이 저장되는 형상을 표현한 것이다. 컬렉션은 객체들을 담아서 배낭같은 역할을 한다.
		/*
		 * 2. 인스턴스 변수값을 통합하여 운반하고 검색할 컬렉션을 준비
		 * 
		 * */
		
		/*
		 * vo.getId()가 가능한 이유는
		 * 위 메소드인 vo.setId()에서 저장한 인스턴스 변수 String id를 같이 공유하며
		 * 바라보고 있기 때문이다.
		 * vo.getId()를 "id"라는 literal 
		 * */
		map.put("id", vo.getId());
		map.put("password", vo.getPassword());
		/*
		 * 1. 첫번째 에러 유형
		 * map.put(vo.getId(),vo.getPassword());
		 * 개발자가 많이 하는 착각
		 * */
		map.put("name", vo.getName());
		/*
		 * 2. 두번째 에러유형
		 * map.put("age", vo.getAge);
		 * valueOf() 는 api.lang.String.ValueOfDemo 참조
		 * */
		map.put("age", vo.getAge());
		map.put("address", vo.getAddr());
	}

	
	public void login(String id, String password) {
		/*
		 * join 메서드에 지역변수로 map을 선언했더니
		 * join 메서드만 그 값을 참조할 수 있고, login 메서드는 그 값을 볼 수 없어서
		 * 아래 map.get("id")에서 사용할 수 없었다.
		 * 그래서, 이 클래스의 메소드라면 그 값을 바라볼 수 있도록
		 * 필드에 선언해준다.
		 * */
		System.out.println("맵에 담긴 ID : " + map.get("id"));
		if(!map.containsKey("id")){
			System.out.println("입력하신 ID는 존재하지 않습니다." + "다시 입력하세요.");
		}else{
			/*
			 * 3. 세번째 에러유형 - NullPoingException
			 * map.get(KEY)에서 KEY는 맵을 선언한 타입과 일치해야하는데
			 * 현재 필드에 선언된 맵은 앞에는 String이고 뒤에는 object이므로
			 * password는 String 값이 되어야 합니다. 따라서, "password"가 되어야 합니다. 
			 * */
			if(!(map.get("password").equals(password))){
				System.out.println("비밀번호가 다릅니다." + "다시 입력하세요.");
			}else{
				System.out.println("환영합니다." + vo.getAddr() + "에 사시는"
						+ vo.getAge() + "세 되시는" 
						+ vo.getName() + "님 환영합니다.");
			}
		}
	}

		
}
