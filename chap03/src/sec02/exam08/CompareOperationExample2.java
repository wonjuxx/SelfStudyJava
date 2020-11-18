package sec02.exam08;       //비교 연산자

public class CompareOperationExample2 {
    public static void main(String[] args) {
        int v2 = 1;
        double v3 = 1.0;
        System.out.println(v2 == v3);

        double v4 = 0.1;
        float v5 = 0.1f;
        System.out.println(v4 == v5);       //0.1f는 0.1의 근사값으로 표현되기 때문에 같지 않다
        System.out.println((float) v4 == v5);
    }
}
