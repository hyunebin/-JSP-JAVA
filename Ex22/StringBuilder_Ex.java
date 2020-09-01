package Ex22;

public class StringBuilder_Ex {
    public static void main(String[] args){
        StringBuilder strB = new StringBuilder("11111");

        strB.append("AAAAA"); // 문자열추가
        System.out.println(strB);
        strB.insert(3, "4444");//특정 지정에 문자열 추가
        System.out.println(strB);
        strB.delete(3,5);//문자열 삭제
        System.out.println(strB);
        strB.deleteCharAt(1);//특정 문자 하나 삭제
        System.out.println(strB);
    }
}
