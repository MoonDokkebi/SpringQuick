package polymorphism;

public class SamsungTV implements TV {

    public void powerOn(){
        System.out.println("polymorphism.SamsungTV --- 전원 켠다.");
    }
    public void powerOff(){
        System.out.println("polymorphism.SamsungTV -- 전원 끈다.");
    }
    public void volumeUp(){
        System.out.println("polymorphism.SamsungTV --- 소리 올린다");
    }
    public void volumeDown(){
        System.out.println("polymorphism.SamsungTV --- 소리 내린다.");
    }
}