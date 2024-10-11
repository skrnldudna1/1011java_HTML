package t1011.exam2;

public class Korean {

    String nation = "대한민국";
    String name;
    String ssn;

    public Korean(String name, String ssn) {
        this.name = name;
        this.ssn = ssn;
    }

    //옵션 추가
    public Korean(String name) {
        this.name = name;
    }
}
