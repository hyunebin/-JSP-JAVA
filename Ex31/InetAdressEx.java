package Ex31;

import java.net.InetAddress;
import java.util.Scanner;

public class InetAdressEx{

    Scanner scanner;

    public InetAdressEx(){
        System.out.println("호스트의 이름을 입력하세요");
        scanner = new Scanner(System.in);

        try{
            InetAddress inetAddress = InetAddress.getByName(scanner.next());
            System.out.println("Name : " + inetAddress);
            System.out.println("IP : " + inetAddress.getHostAddress());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}
