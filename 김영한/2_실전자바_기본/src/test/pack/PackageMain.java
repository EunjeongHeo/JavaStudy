package test.pack;

public class PackageMain {
    public static void main(String[] args) {

        Integer wrapper_value1 = 123; //자동 박싱
        Integer wrapper_value2 = new Integer(123); //새로운 객체 생성
        Integer wrapper_value3 = Integer.valueOf(123); //존재하는 인스턴스면 재활용


// ==
        System.out.println(wrapper_value2 == wrapper_value1); //flase (주소값비교)
        System.out.println(wrapper_value3 == wrapper_value1); //true (주소값비교)
        System.out.println(wrapper_value2 == 123); //true (내부값비교) - 자동언박싱


// .equals()
        System.out.println(wrapper_value2.equals(wrapper_value3)); //true (내부값비교)
        System.out.println(wrapper_value2.equals(123)); //true (내부값비교)


// .compareTo()
// 같으면 0, 오른쪽이 더 크면 -1, 왼쪽이 더 크면 1
        System.out.println(wrapper_value2.compareTo(wrapper_value3));  //0 (내부값비교)

    }
}
