import java.nio.charset.Charset;

public class Main {
    public static void main(String[] args)  {
        //----1----
        char univInfo[] = {'U','k','r','a','i','n','i','a','n',' ','N','a','t','i','o','n','a','l',' ','F','o','r','e','s','t','r','y'
                ,' ','U','n','i','v','e','r','s','i','t','y',' ', 'E', 'd', 'u', 'c', 'a', 't', 'i', 'o', 'n', 'a', 'l', ' ', 'a', 'n',
                'd', ' ', 's', 'c', 'i', 'e', 'n', 't', 'i', 'f', 'i', 'c', ' ', 'i', 'n', 's', 't', 'i', 't', 'u', 't', 'e', ' ', 'o',
                'f', ' ', 'w', 'o', 'o', 'd', 'w', 'o', 'r', 'k', 'i', 'n', 'g', ' ', 'a', 'n', 'd', ' ', 'c', 'o', 'm', 'p', 'u', 't',
                'e', 'r', ' ', 't', 'e', 'c', 'h', 'n', 'o', 'l', 'o', 'g', 'i', 'e', 's', ' ', 'a', 'n', 'd', ' ', 'd', 'e', 's', 'i',
                'g', 'n',' ','c', 'o', 'm', 'p', 'u', 't', 'e', 'r', ' ', 's','c','i', 'e','n', 'c', 'e','-','2','2',' ','c', 'o', 'm',
                'p', 'u', 't', 'e', 'r', ' ', 's','c','i', 'e','n', 'c'};
        //----2----
        String strUnivInfo1 = new String(univInfo,0,univInfo.length - 16);
        System.out.println(strUnivInfo1 + '\n');
        //----3----
        String strUnivInfo2 = new StringBuffer(strUnivInfo1).reverse().toString();
        System.out.println(strUnivInfo2 + '\n');
        //----4----
        String strUnivInfo3 = new String(strUnivInfo1.toUpperCase());
        System.out.println(strUnivInfo3);
        System.out.println(strUnivInfo3.equals(strUnivInfo1) + "\n");
        //----5----
        System.out.println(strUnivInfo1.substring(39,127) + "\n");
        //----6----
        String strUnivInfo4 = new String();
        strUnivInfo4 = strUnivInfo1 + strUnivInfo3;
        System.out.println(strUnivInfo4 + "\n");
        //----7----
        System.out.println("First entry index: " + strUnivInfo1.indexOf('n') + " Last entry index: " + strUnivInfo1.lastIndexOf('n') + "\n");
        //----8----
        StringBuffer personInfo = new StringBuffer("Mytsko Dmytro Andriyovich 31/11/2003");
        System.out.println(personInfo);
        //----9----
        personInfo.delete(personInfo.length() - 10,personInfo.length() - 4);
        System.out.println(personInfo + "\n");
        //----10----
        personInfo.append(" Gumnyska");
        System.out.println(personInfo + "\n");
        //----11----
        personInfo.insert(personInfo.length() - 9," Male");
        System.out.println(personInfo + "\n");
        //----12----
        System.out.println("Length in symbols: " + personInfo.length() + "\n");
        String personInfo_1 = new String(personInfo);
        System.out.println("Length in bytes: " + personInfo_1.getBytes(Charset.forName("UTF-16LE")).length + "\n");
        //----13----
        personInfo.delete(25,personInfo.length());
        System.out.println(personInfo + "\n");
        //----14----
        personInfo.setLength(6);
        personInfo.reverse();
        System.out.println(personInfo);
    }
}