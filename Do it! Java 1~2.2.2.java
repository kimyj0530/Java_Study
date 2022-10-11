package abc;
/* Ctrl+Shift+'/'
   처음 만든 클래스
   (여러 줄 주석)
*/
 
public class lol {
    
    public static void main(String[] args) {
        // 1줄 주석: 화면 출력 코드 Ctrl+'/'
        System.out.println("콘솔 화면 출력");
    }
}
 
 
/* 생성 프로젝트의 기본 구조 */
package abc;
/*
 처음 만든 클래스
 (여러 줄 주석)
*/
 
public class lol {
    
    public static void main(String[] ar) {
        // 화면 출력 코드(1줄 주석)
        System.out.println("콘솔 화면 출력");
    }
}
 
/* 컴파일 ㅜ 생성되는 바이트 코드(.class) */
package sec01;
 
class A { // A.class
}
class B { // B.class
    class C { // B$C.class
    }
}
 
public class JBS {
    public static void main(String[] args) {
    }
}
 
 
/* 기본적인 콘솔 출력 방법 */
package sec01;
    
public class JBS {
    public static void main(String[] args){
        // 1. System.out.println()
        System.out.println("안녕하세요");
        System.out.println("안녕" + "하세요");
        System.out.println(2 + 4);
        System.out.println(4.6);
        System.out.println("문자" + 1);
        System.out.println("문자" + 1 + 2);
        System.out.println(1 + 2 + "문자");
        System.out.println();
        int a = 5;
        String b = "하세요";
        System.out.println(a);
        System.out.println(b);
        System.out.println("안녕" + b);
        System.out.println(a + "안녕" + b);
        System.out.println();
        // 2. System.out.print();
        System.out.print("반갑");
        System.out.print("습니다");
        System.out.print("7");
        System.out.print("\n");
        System.out.print("\n");
        // 3. System.out.printf();
        System.out.printf("%d\n", 10);
        System.out.printf("%o\n", 10);
        System.out.printf("%x\n", 10);
        System.out.printf("%s\n", "문자열 출력");
        System.out.printf("%f\n", 3.2582);
        System.out.printf("%4.2f\n", 3.2582);
        System.out.printf("%d와 %4.2f\n", 10, 3.2582);
    }
}
 
 
/* 변수 선언과 값을 대입하는 2가지 방법 */
package sec01;
    
public class JBS {
    public static void main(String[] args) {
        // 변수 선언과 함께 값 대입
        int a = 3;
        // 변수 선언과 값 대입 분리
        int b;
        b = 4;
        System.out.println(a);
        System.out.println(b);
    }
}
 
 
/* 변수와 상수명 짓기 */
package sec01;
    
public class JBS {
    public static void main(String[] args) {
        // 변수
        boolean aBcD;        // 대문자는 새로운 단어의 앞 글자에 사용 권장
        byte 가나다;            // 한글로 작성 가능(권장하지 않음)
        short _abcd;
        char $ab_cd;
        // int 3abcd;        // 숫자는 이름 맨 앞에 올 수 없음.
        long abcd3;
        // float int;        // 자바 예약어는 사용할 수 없음.
        double main;
        // int my Work;        // 스페이스, 특수 키는 사용할 수 없음.
        String myClassName;
        int ABC;            // 전부 대문자로 작성(권장하지 않음)
        
        
        // 상수
        final double PI;
        final int MY_DATA;
        final float myData;    // 소문자 사용(권장하지 않음)
    }
}
