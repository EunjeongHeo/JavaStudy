package section5.pack;


import section5.pack.b.User;

public class PackageMain {
    public static void main(String[] args) {

        section5.pack.a.User user1 = new section5.pack.a.User(); //User user1 = new User(); ( X )
        User user2 = new User();

    }
}


/*패키지 규칙
* 패키지의 이름과 위치는 폴더(디렉토리) 위치와 같아야 한다. (필수)
  그냥 디렉토리 경로명과 패키지 경로명이 같아야 한다는 것.
* 패키지 이름은 모두 소문자로 사용한다. (관례)
* 패키지 이름의 앞 부분에는 일반적으로 회사의 도메인 이름을 거꾸로 사용한다.
  예를 들어, com.company.myapp 과 같이 사용한다. (관례)
* */

/*주의사항
* 같은 이름의 클래스가 있다면 import는 하나만 선택해야 한다.
  (같은 클래스에 대해서는 import를 하나만 해줄 수 있다는 뜻)
* improt pack.* => pack 패키지 바로 하위 모든 클래스를 포함. (바로 하위 클래스들만!!)
                => pack 패키지 내부에 있는 a,b패키지 또는 a,b패키지 내 클래스까지 포함한다는 의미는 아님.
* import 해준 것은 풀경로네임으로 쓰지 않아도 되고, import해주지 않은 것은 풀경로네임으로 적어줘야 한다.
* 자주 사용하는 클래스를 import 하고, 자주 사용하지 않는 크래스는 풀경로로 적어주면 된다.
  둘 다 전체 경로로 적어줘도 된다. 이 때는, import를 사용하지 않아도 된다.
* pack패키지와 pack.a 패키지와 pack.b 패키지는 서로 완전히 다른 패키지다.
* 즉, pack 패키지에서 pack.a패키지의 클래스가 필요하다면 pack.a 패키지를 import해서 사용해주어야 한다. (반대의 경우도 마찬가지)
* */