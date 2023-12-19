package lesson1_2.levelA.a2;

/*
Неявное преобразование
 */
public class Run {
    public static void main(String[] args) {
        byte varByte = 10;
        short varShort = varByte;
        System.out.println(varByte);
        System.out.println(varShort);
    }
}
