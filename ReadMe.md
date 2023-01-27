# Spring Framework(IOC, DI) 학습하기

---

## IOC(Inversion Of Control)?
// 참조 https://biggwang.github.io/2019/08/31/Spring/IoC,%20DI%EB%9E%80%20%EB%AC%B4%EC%97%87%EC%9D%BC%EA%B9%8C/

객체의 흐름, 생명주기 관리등 독립적인 제 3자에게 역할과 책임을 위임하는 방식이다.

즉, 개발자가 직접 생성하여 사용하던 것을 Spring Framework에서 자체적으로 생성 주입을 해준다. (제어의 역전)

--> 개발자에게 편의성을 제공

---

## DI(Dependency Injection)?
// 참조 https://velog.io/@gillog/Spring-DIDependency-Injection

의존 관계 주입 기능으로 객체를 직접 생성하는게 아닌 외부에서 생성한 후 주입 시킨다.

--> DI를 통해서 모듈 간의 결합도가 낮아지고 유연성이 높아짐.

![](../../AppData/Local/Temp/images_gillog_post_08489bda-549e-4dae-851b-8ae1734bf85e_21373937580AEF9B37.jpg)

첫 번째 방법은 A 객체가 B와 C객체를 New 생성자를 통해서 직접 생성하는 방법이다.

두 번째 방법은 외부에서 생성 된 객체를 setter()를 통해 사용하는 방법이다.

A 객체에서 B, C 객체를 사용(의존)할 때 A객체 에서 직접 생성 하는 것이 아니라 외부에서 생성된
B, C 객체를 주입시켜 setter 혹은 생성자를 통해 사용한다.