# π¨βπ»genetic algorithm implemented with JAVAπ§¬  
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


# π¨βπ»JAVAλ‘ (λ€μ) κ΅¬νν΄λ³Έ genetic algorithmπ§¬  
(21.03.26 - )
##  μ€λͺ
- κ° κ°μ²΄λ κΈΈμ΄ 8μ String νμμ μ μ μλ₯Ό κ°μ§λ€.
- μ μ μλ 0κ³Ό 1λ‘ μ΄λ£¨μ΄μ Έ μλ€.
- Gene.getFitness λ₯Ό ν΅ν΄ μ ν©λλ₯Ό μ€μ νλ€. μ¬κΈ°μλ 1μ κ°μλ‘ μ€μ νλ€.
- λ£°λ  λ°©μμ ν΅ν΄ λΆλͺ¨ κ°μ²΄λ₯Ό μ λ³νλ€.
- mate()λ₯Ό ν΅ν΄ μ§μ§κΈ° ν λκ°μ κ°μ²΄ μλ§νΌμ μμμ΄ λ§λ€μ΄μ§λ€.
- λμ°λ³μ΄ λ°μ μ μμ μλ‘μ΄ κ°μ²΄κ° μμ±λλ€.
- μ§μ§κΈ°κ° λλλ©΄ μΈλ μ μ²΄μ νκ·  μ ν©λμ μ΅λ μ ν©λλ₯Ό μ°μΆνλ€.
##  μ€ννλ©΄ μμ
---------
>κ°μ²΄ μ μλ ₯: 16  
>μΈλ μ μλ ₯: 30  
>λμ°λ³μ΄μ¨ μλ ₯(%): 1

---
  
> μΈλ μ: 1  
> νκ·  μ ν©λ: 65%  
> μ΅λ μ ν©λ: 80%

> μΈλ μ: 2  
> νκ·  μ ν©λ: 68%  
> μ΅λ μ ν©λ: 88%

> μΈλ μ: 3  
> νκ·  μ ν©λ: 70%  
> μ΅λ μ ν©λ: 87%

...
