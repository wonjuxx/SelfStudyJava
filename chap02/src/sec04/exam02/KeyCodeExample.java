package sec04.exam02;

/*
"process is not allowed to run in parallel" 오류가 일어난다면
Run/Edit Configurations 경로에서 "Allow parallel run"을 체크해줘야 키코드 입력 가능
*/
public class KeyCodeExample {
    public static void main(String[] args) throws Exception {
        int keyCode;

        keyCode = System.in.read();
        System.out.println("keyCode: " + keyCode);  //a의 키코드 97

        keyCode = System.in.read();
        System.out.println("keyCode: " + keyCode);  //여기서 왜 enter 키의 캐리지 리턴(CR:13)이 출력이 안될까?

        keyCode = System.in.read();
        System.out.println("keyCode: " + keyCode);  //enter 키의 라인 피드(LF:10)
    }
}