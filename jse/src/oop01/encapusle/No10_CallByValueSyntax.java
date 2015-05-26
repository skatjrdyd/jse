package oop01.encapusle;
/*
 Date :
 Author :
 Desc : Call by value에 관한 개념이해 
 * */
/*
 메소드에 값을 전달하는 방법
  - call by value
  - 메소드로 한 문자, 상수 문자열, 순자를 전달하면 전부 값에 의한 전달
    즉, call by value 라고 한다.
  - C 언어의 경우 숫자, 문자 계열만 Call By Value 이고, 문자열은 char * 형
  - call by value인 경우 값을 전달하면 값을 전송한 원본 변수는 변형이 안된다.
    단지, stack 간의 값이 복사된다.
  - call by reference 의 경우 참조값(hash code)을 전달한 객체는 자신의 참조값이 전달 됨으로써 값이 변화가 발생할 수 있다. 
 /* 
  - call by reference : 참조값에 의한 호출
  - 원본 객체의 데이터가 변경된다.
    변경을 목적으로 하는 경우 이용된다
  */
/*
 String 객체의 데이터 전달 유형
 - String 객체는 객체이므로 내부적으로 Call by Reference 를 사용하나
 - 문자열 할당 등의 조작시 무조건 call by value 기능으로 작동한다.
 - 문자열이 같으면 멤버변수나 지역변수는 같은 hash  code값을 가지고 있다 
 - 그리고 둘의 구분은 영영 없어진다.
 - 그러나 새로운 문자열이 지역변수에 대입되면
 - 또 다른 hash code가 발생되면서 멤버변수가 구분되어 지게 된다
  * */
public class No10_CallByValueSyntax {

}
