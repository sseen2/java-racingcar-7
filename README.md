# java-racingcar-precourse

### 디렉토리 구조
```markdown
src
 └── main
     ├── java
     │    └── racinggame
     │         ├── Application.java
     │         ├── Car.java
     │         ├── ExceptionHandler.java
     │         ├── OutputView.java
     │         ├── Race.java
     │         ├── RaceGame.java
     │         └── UserInput.java
     └── test
          └── java
               └── racinggame
                    └── ApplicationTest.java
```
---
### 기능 목록

- [x] 자동차 이름 입력 받기
- [x] 각 자동차 이름 구분
- [x] 시도 횟수 입력 받기
- [x] 자동차 전진
- [x] 실행 결과 출력
- [x] 우승자 출력
- [x] 예외 처리
    - 사용자가 잘못된 값을 입력할 경우

      → 자동자 이름 6자 이상

      → 자동차 이름 중복 입력

      → 시도 횟수에 0을 입력

      → 시도 횟수에 숫자가 아닌 값을 입력

      → 아무 값도 입력하지 않을 경우
        