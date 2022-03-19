# SpringBoot

## Hello World 찍어보기!

<hr>

### 1. SpringBoot 프로젝트 생성! >> 자동설정을 이용해서 만들어 줍니다.


<img width="801" alt="스크린샷 2022-03-06 00 03 14" src="https://user-images.githubusercontent.com/78843098/156889367-a18b58e2-7e5b-4894-a94f-b8054467f53c.png">

<img width="801" alt="스크린샷 2022-03-06 00 03 18" src="https://user-images.githubusercontent.com/78843098/156889404-25a57631-643a-4f85-a304-ff0953178f08.png">


### 2. 프로젝트를 만들면, 모든 설정이 다 자동으로 돼있습니다...! 굉장...


<img width="1440" alt="스크린샷 2022-03-06 00 05 06" src="https://user-images.githubusercontent.com/78843098/156889491-b145edd1-bad8-4c34-bfe6-c1b47e72bc3e.png">


### 3. 하지만 실행을 바로 하면 실행이 안됩니다! >> MySQL Driver연동을 하지 않아서 그런답니다...


<img width="1440" alt="스크린샷 2022-03-06 00 09 31" src="https://user-images.githubusercontent.com/78843098/156890091-12e4352f-ea01-49ae-bce6-3d3269abd3b5.png">

### 4. application.properties에 MySQL 연동을 해주면 됩니다.


<img width="1440" alt="스크린샷 2022-03-06 00 09 41" src="https://user-images.githubusercontent.com/78843098/156890226-da5ad64a-6500-4819-ad9c-bb65d5e8bff6.png">


### 5. 이후에 서버를 실행하고 localhost:8080으로 접속하면 서버가 정상 작동함을 볼 수 있습니다.


<img width="1440" alt="스크린샷 2022-03-06 00 10 45" src="https://user-images.githubusercontent.com/78843098/156891045-7a478008-decc-4939-9c1a-aa22ca0d64c5.png">


### 6. 다만, Hello World를 찍기위해선 html도 작성을 해주어야합니다.


<img width="1440" alt="스크린샷 2022-03-06 00 11 17" src="https://user-images.githubusercontent.com/78843098/156891091-e704278c-db49-4371-b1fb-416e94007ae3.png">

<img width="1440" alt="스크린샷 2022-03-06 00 12 00" src="https://user-images.githubusercontent.com/78843098/156891093-983b3461-00f2-480e-b2bb-291325ec016d.png">


### 7. 이제 localhost:8080/hello.html 로 접근을 하면 Hello World가 정삭적으로 출력되는 것을 볼 수 있습니다!


<img width="1440" alt="스크린샷 2022-03-06 00 12 09" src="https://user-images.githubusercontent.com/78843098/156891128-4ecb5238-af0c-464c-8a72-05cba009e270.png">


<hr>

# 🔥앞으로는 SpringBoot를 활용한 CRUD 구현을 시행할 예정입니다!🔥


<hr>

## DB 연동 후, C 구현!

### 1. 우선 DB를 먼저 준비해줘야 합니다.


<img width="1440" alt="스크린샷 2022-03-19 16 12 39" src="https://user-images.githubusercontent.com/78843098/159111547-5ead0d8c-33b7-45d7-8d7c-2c073ab6d471.png">


### 2. 이후 Entity 생성을 위한 Article 클래스 생성


<img width="1440" alt="스크린샷 2022-03-19 16 08 48" src="https://user-images.githubusercontent.com/78843098/159111633-b30436f0-41f9-4b70-b502-5fa923c1301c.png">


### 3. Article 클래스로부터 ArticleForm 클래스를 활용해 toEntity 메소드 구현


<img width="1440" alt="스크린샷 2022-03-19 16 08 36" src="https://user-images.githubusercontent.com/78843098/159111714-58b422f3-e69a-47b2-8d13-1369af18afed.png">


### 4. SpringBoot 의 CRUD 구현을 도와줄 Reopository interface를 만들고, CrudRepository 를 상속받아 saved 메소드를 사용할 수 있게 함!


<img width="1440" alt="스크린샷 2022-03-19 16 08 55" src="https://user-images.githubusercontent.com/78843098/159111794-957aea10-919a-4c22-8e64-91d4ca8e20f6.png">


### 5. ArticleController 에 @Autowired 를 이용해 ArticleRepository 의존성 주입을 해주고 사용할 준비를 합시다!


<img width="1440" alt="스크린샷 2022-03-19 16 08 19" src="https://user-images.githubusercontent.com/78843098/159111832-cc59b648-4b1d-4b5e-9afa-c007f7770d0e.png">


### 6. 간단하게 form태그를 활용한 View를 활용해 데이터를 받아봅시다!


<img width="1440" alt="스크린샷 2022-03-19 16 09 10" src="https://user-images.githubusercontent.com/78843098/159111875-40652a71-2838-4b1b-b477-2078b129e1aa.png">

<img width="1440" alt="스크린샷 2022-03-19 16 09 41" src="https://user-images.githubusercontent.com/78843098/159111890-873d85a2-2166-43f6-82e3-9203bb8fe81d.png">


### 7. submit을 눌러 제출하면, 성공적으로 log가 찍히는것을 볼 수 있습니다


<img width="1440" alt="스크린샷 2022-03-19 16 09 49" src="https://user-images.githubusercontent.com/78843098/159111914-307f20a0-7a62-43c7-987f-e06fccca1b06.png">


### 8. DB에 성공적으로 들어온 것을 확인할 수 있습니다!!


<img width="1440" alt="스크린샷 2022-03-19 16 27 02" src="https://user-images.githubusercontent.com/78843098/159111972-4a0c7011-62f4-472c-9370-62b86fc8fa02.png">


<hr>





