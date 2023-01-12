package Chapter06.ch08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowException {
    //throws로
    public Class loadClass(String fileName, String className) throws ClassNotFoundException, FileNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);
        Class c = Class.forName(className);
        return c;
    }

    public static void main(String[] args) {
        ThrowException test = new ThrowException();
        try {
            test.loadClass("a.txt","abc");
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (Exception e){
            //default 처리 exception
            //excpetion의 최상위
            //exception이 가장 위에 들어가면 안된다. 모든 것을 포괄하는 exception이기 때문에
            //먼저 쓰게되면 catch문에 먼저 걸리게 된다.
            // 명시적인 exception이 존재하면 가장 아래에 작성한다.
            // 명시적인 exception을 모르겠으면 exception e를 만든다
        }
        System.out.println("end");
    }
}
