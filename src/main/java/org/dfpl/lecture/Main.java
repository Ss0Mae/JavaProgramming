package org.dfpl.lecture;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        short a = (short) 0x55ff;
        short b = (short) 0x00ff;

        System.out.println("[비트 연산 결과]:"); //16진수 형태로 출력
        System.out.printf("%04x\n", (short)(a & b)); // AND
        System.out.printf("%04x\n", (short)(a | b)); // OR
        System.out.printf("%04x\n", (short)(a ^ b)); // XOR
        System.out.printf("%04x\n", (short)(-a)); // NOT

        byte c = 20; // 00010100
        byte d = -8; // 11111000
        System.out.println("[시프트 연산 결과]:");
        System.out.println(c<<2); // c를 왼쪽으로 2비트 시프트
        System.out.println(c>>2); // c를 오른쪽으로 시프트 0 삽입
        System.out.println(d>>2); // d를 오른쪽으로 시프트 1 삽입
        System.out.printf("%x\n",(d>>>2)); // d를 오른쪽으로 시프트 0 삽입
    }
}