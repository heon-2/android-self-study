/*
Data class
: 데이터를 담기 위한 클래스
: toString(), hashCode(), equals(), copy()를 자동으로 생성
1개 이상의 프로퍼티가 있어야 함.
데이터 클래스는 abstract open sealed inner를 붙일 수 없음
상속이 불가능
 */

/*
Sealed class : 추상 클래스로, 상속받은 자식 클래스의 종류를 제한
- 컴파일러가 sealed 클래스의 자식 클래스가 어떤 것인지 앎
- when과 함께 쓰일 때, 장점을 느낄 수 있음.

 */