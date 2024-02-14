public class Main {
    public static void main(String[] args) {
        for (int i = 100; i > 7; i -= 7) {
            if (i % 2 == 0)//если делится на 2 без остатка то пропуск этого действия и идем далее
                continue;
            System.out.println("Hello!" +i);
        }
        for ( int r = 5; r < 30; r += 2) {
            if (r % 4 == 0)
                continue;//пропускает итерацию - кусок цикла
            if (r >= 17)
                break;//полностью выходим из цикла
            System.out.println("Element!" +r );
        }
    }
}