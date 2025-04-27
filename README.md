# Project Pages<br>
- Front: [cloneProjectFront](https://github.com/laeongmulti/cloneProjectFront)<br>
- Back: [cloneProjectBackBoot](https://github.com/laeongmulti/cloneProjectBackBoot)<br>
- DB: [cloneProjectDB](https://github.com/laeongmulti/cloneProjectDB)<br>


# 백엔드

**소개**<br>
- Spring Boot + JPA 로 이루어짐
- 초기엔 서버 이해를 위해 비교적 쉬운 Boot랑 JPA를 간단하게만 사용하고 강의를 진행하면서 Spring Legacy 와 MyBatis를 사용한 새로운 백엔드 구축 예정

**설치방법**<br>
인터넷에서 Docker Desktop 필수 설치<br>
아래 주의사항 먼저 읽는것도 추천<br>
cloneProjectDB 에서 먼저 도커에 올려야함!<br>

도커에 Spring Boot 업로드<br>
````bash
docker-compose up --build
````

이미 DB 설정시 my-network를 생성하였다면 별도의 추가 작업이 필요 없음<br>

나중에 백엔드 실행시 DB서버가 없는경우 서버가 죽으니 먼저 실행해두는것을 권장함 (스프링은 원래 이런 것 같음)<br>

**로컬 실행 방법**<br>
Spring Boot에서 로컬 실행은 아래 파일로 이동한 뒤 f5 누르면 됨<br>
src/main/java/come/cloneproject/demo/DemoApplication.java<br>

**주의 사항**
1. 개발 환경 세팅 <br>
기본적으로 자바는 JVM에서 실행됨. 우리가 Hello.java를 만들고, IDE에서 f5를 눌러 편히 실행해도 결과값이 나오는건 IDE가 그것까지 고려해서 우리에게 출력해주기 때문<br>

해당 프로젝트도 변경사항 반영을 설정해 놓긴 했지만 어찌 되었든든 서버를 재시작 해야해서 도커에서 개발하는건 매우 비효율적임.<br>
도커는 호환성과 작동 잘 되는지정도만 확인하고 로컬에서 개발하는것을 추천<br>
도커 목적이 서버 틀어놓고 개발하라는것도 아니라서 어쩔 수 없음<br>

2. 백엔드 실행시 설정 변경<br>
백엔드 실행시 어디서 실행되느냐에 따라 DB에 접속하는 방식이 달라짐. 따라서 맞춰서 설정해야함<br>

src/main/resources/application.properties<br>

위 파일에서 도커로 실행했을때와 로컬 IDE에서 f5로 실행했을때 주석부분이 다르니 필요한걸로 둘중 하나 선택해서 주석 풀고 사용하면 됨<br>

application.properties를 수정하면 도커의 기존 컨테이너를 삭제하고 재업로드 해야함
```bash
  docker-compose down
```
위 명령어로 컨테이너에서 삭제하고
```bash
  docker-compose up --build
```
다시 업로드하면 됨