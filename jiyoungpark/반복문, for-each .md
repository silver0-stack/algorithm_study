# 반복문, for-each

Date: March 22, 2023

# 1. continue

- 해당 조건문을 만족할 때 즉시 중단하되, 다시 나머지 조건들을 이어간다

```java
public class ContinueDemo {

	public static void main(String[] args){

		for(int i=0; i<10; i++) {

			if(i==5)
				**continue;**

			System.out.println("Coding Everybody" + i );

		}
	}
}
```

- 출력 결과

# 2. 배열

- 배열.length 는배열이 처음 선언되었을 때 원소를 담을 수 있는 크기를 말함

![스크린샷 2023-03-22 오후 4.29.50.png](%E1%84%87%E1%85%A1%E1%86%AB%E1%84%87%E1%85%A9%E1%86%A8%E1%84%86%E1%85%AE%E1%86%AB,%20for-each%203333b45626c345c08a73bdc42cbb231d/%25E1%2584%2589%25E1%2585%25B3%25E1%2584%258F%25E1%2585%25B3%25E1%2584%2585%25E1%2585%25B5%25E1%2586%25AB%25E1%2584%2589%25E1%2585%25A3%25E1%2586%25BA_2023-03-22_%25E1%2584%258B%25E1%2585%25A9%25E1%2584%2592%25E1%2585%25AE_4.29.50.png)

- 배열이 담을 수 있는 원소의 개수를 length라고 한다. 위의 그림에 따르면 classGroup의 길이는 4가 된다. **length는 배열에 담긴 원소의 숫자가 아니라 배열을 선언할 때 지정한 배열이 담을 수 있는 값의 크기를 의미한다.**

# 3. ****for-each****

```java
package org.opentutorials.javatutorials.array;
 
public class ForeachDemo {
 
    public static void main(String[] args) {
        String[] members = { "최진혁", "최유빈", "한이람" };
        **for (String e : members)** {
            **System.out.println(e + "이 상담을 받았습니다");**
        }
    }
 
}
```

- **위의 구문은 배열 members의 값을 변수 e에 담아서 중괄호 구간 안으로 전달해준다.**
- 반복문의 종료조건이나 종료조건을 위해서 기준값을 증가시키는 등의 반복적인 작업을 내부적으로 감춘 것이라고 할 수 있다. 자바 5.0부터 도입된 기능이다.
