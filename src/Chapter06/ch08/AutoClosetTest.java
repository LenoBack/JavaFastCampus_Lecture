package Chapter06.ch08;

public class AutoClosetTest {
    public static void main(String[] args) {
        //finally 문을 없애고 깔끔하게 작성하는 방법
        AutoCloseable obj = new AutoCloseableObj();

        try(obj){
            //exception 강제 발생
            throw  new Exception();
    } catch (Exception e){
            System.out.println("exception");

        }
        System.out.println("end");
    }

}
