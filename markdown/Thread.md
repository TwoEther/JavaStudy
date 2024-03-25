# Thread 의 동작과 제어

### Process 와 Thread
* process 란 ?
  * 어떠한 주체에 의해 작성된 프로그램이 메모리를 할당받아 실행 중인 것
* thread 란 ?
  * process가 실행되는 주체
  * 하나의 process는 한 개 이상의 thread가 존재함 (Multi thread)
---
### thread 생성 및 호출 방법
Thread 클래스로부터 구현 객체를 갖는 생성자를 호출하면 됨.

1. Thread Class로 부터 Runnable 구현 객체를 매개값으로 하는 생성자 호출

```java
// 생성자를 통한 호출
Thread thread = new Thread(Runnable target);

// 익명 구현 객체를 통한 생성 방법
Thread thread = new Thread(new Runnable() {
  @Override
  public void run() {
    // 실행 코드
  }
});
```

2. Thread 자식 클래스로 생성
```java
public class WorkerThread extends Thread {
    @Override
    public void run(){
        // 실행 코드
    }
    Thread thread = new WorkerThread();
}
```
---
### thread 상태
* Thread 를 생성하고 start() 메소드를 호출했을때 바로 실행되는 것이 아닌 _실행 대기 상태(RUNNABLE)_가 된다
* RUNNABLE 상태의 Thread는 CPU 스케쥴링에 따라 CPU를 점유하고 run() 메소드를 실행하여 실행 상태(RUNNING)가 된다. 
* run() 메소드가 종료되면 Thread는 실행을 멈추고 종료 상태(TERMINATED)가 된다.