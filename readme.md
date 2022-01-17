# 👨‍💻genetic algorithm implemented with JAVA🧬  
(21.03.26 - )
##  description
- Each entity has gene in string type gene length of 8.
- Gene is consisted of 0s and 1s.
- Set fitness with Gene.getFitness. In this project, number of 1's.
- Select parent entities by roulette mechanisms.
- Same amount of children are create through mate();
- A whole new entity is created when mutation occurs.
- After mating, get average fitness and maximum fitness.
##  Execution example
---------
>input population: 16  
>input generation(s): 30  
>input mutation rate(%): 1

---
  
> generation: 1  
> average fitness: 65%  
> max fitness: 80%

> generation: 2
> average fitness: 68%  
> max fitness: 88%

> generation: 3
> average fitness: 70%  
> max fitness: 87%

...


# 👨‍💻JAVA로 (다시) 구현해본 genetic algorithm🧬  
(21.03.26 - )
##  설명
- 각 개체는 길이 8의 String 형식의 유전자를 가진다.
- 유전자는 0과 1로 이루어져 있다.
- Gene.getFitness 를 통해 적합도를 설정한다. 여기서는 1의 개수로 설정한다.
- 룰렛 방식을 통해 부모 개체를 선별한다.
- mate()를 통해 짝짓기 후 똑같은 개체 수만큼의 자식이 만들어진다.
- 돌연변이 발생 시 아예 새로운 개체가 생성된다.
- 짝짓기가 끝나면 세대 전체의 평균 적합도와 최대 적합도를 산출한다.
##  실행화면 예시
---------
>개체 수 입력: 16  
>세대 수 입력: 30  
>돌연변이율 입력(%): 1

---
  
> 세대 수: 1  
> 평균 적합도: 65%  
> 최대 적합도: 80%

> 세대 수: 2  
> 평균 적합도: 68%  
> 최대 적합도: 88%

> 세대 수: 3  
> 평균 적합도: 70%  
> 최대 적합도: 87%

...
