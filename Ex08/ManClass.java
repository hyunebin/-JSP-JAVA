package Ex08;

public class ManClass {
    private int age;
    private int height;
    private int weight;
    private String phoneNum;
    // 생성자는 파라미터가 있는것 없는것 변형한것 다양하게 만들수 있다.
    public ManClass(int age, int height,int weight, String phoneNum ){
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.phoneNum = phoneNum;
    }

    public ManClass(){

    }

    public double calculateBMI(){
        double result = weight / (height * weight);
        return result;
    }

// 필드의 데이터가 private이기 때문에 다른 클래스에서 사용하기 위해 get set메소드 사용
//

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }


}
