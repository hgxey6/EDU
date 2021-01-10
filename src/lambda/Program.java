package lambda;

import java.util.Arrays;

/*
Создайте лямбду isIllegalString, принимающую множество символов и строку,
проверяющую, содержит ли строка символы не из множества.
Примеры:
isIllegalString.test(Set.of('a', 'b'), "abc") == true
isIllegalString.test(Set.of('a', 'b'), "ab") == false
*/
public class Program {
    public static void main(String[] args) {
        IsIllegalString isIllegalString = (str, chars) -> !Arrays.equals(str.toCharArray(), chars);

        System.out.println(isIllegalString.solution("abc", 'a', 'b'));
        System.out.println(isIllegalString.solution("ab", 'a', 'b'));
    }

    @FunctionalInterface
    public interface IsIllegalString{
        boolean solution(String str, char... chars);
    }

}
