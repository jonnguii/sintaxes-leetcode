

# 📘 Streams em Java

---

## 🧠 Aula

### O Quê?
Streams são uma forma de processar coleções de dados de forma funcional.

### Por Quê?
Evita loops complexos e deixa o código mais limpo.

### Como?

```
List<String> nomes = List.of("ana", "joao");

nomes.stream()
     .map(String::toUpperCase)
     .forEach(System.out::println);
```

### Onde usar?

- Collections


## 🧪 Exercícios

### 🟢 Easy
- Ex01_Filter → Filtrar números pares
```

Dada uma lista de números:

List<Integer> nums = List.of(1, 2, 3, 4, 5, 6);

👉 Use Stream para:

Filtrar apenas números pares
Imprimir

```

- Ex02_Filter > Filtrar números maiores que 10

```

Dada uma lista de números:

List<Integer> nums = List.of(3, 7, 10, 15, 20);

👉 Use Stream para:

Filtrar números maiores que 10
Imprimir

```

- Ex3_Filter > Filtrar nomes que começam com B

```

Dada uma lista de nomes:

List<String> nomes = List.of("Ana", "Bruno", "Carlos", "Beatriz");
👉 Use Stream para:

Filtrar nomes que começam com B
Imprimir

```

---

### 🟡 Medium
- Exs02_Map → Converter lista para maiúsculo
```

List<String> nomes = List.of("joao", "ana", "carlos");

👉 Use Stream para:

Deixar tudo MAIÚSCULO
Retornar uma nova lista

```

- Ex03_Map_Multiply → Multiplicar valores da lista

```
  List<Integer> nums = List.of(1, 2, 3, 4, 5);

👉 Use Stream para:

Multiplicar todos por 3
Retornar uma nova lista

```


- Ex04_Filter_Map_Uppercase → Filtrar e transformar nomes

```
List<String> nomes = List.of("joao", "ana", "carlos", "maria");

👉 Faça:

Filtrar nomes com mais de 4 letras
Transformar para MAIÚSCULO
Retornar lista

```

---

### 🔴 Hard
- Exs03_MultiplyTransform.Exs01_MultiplyTransform → Validar condição em todos elementos
```

List<Integer> nums = List.of(10, 15, 20, 25, 30);

👉 Faça tudo em Stream:

Filtrar números > 20
Multiplicar por 2
Ordenar
Retornar lista final

```

- Ex02_Filter_Map_SortDesc → Transformar com ordenação decrescente

```
List<Integer> nums = List.of(5, 12, 18, 25, 30, 7);

👉 Faça tudo em Stream:

Filtrar números pares
Multiplicar por 2
Ordenar em ordem decrescente
Retornar lista

```

- Ex02_Filter_Map_Length → Transformar nomes em tamanhos

```
List<String> nomes = List.of("Ana", "Amanda", "Bruno", "Aline", "Carlos");

👉 Faça:

Filtrar nomes que começam com "A"
Pegar o tamanho de cada nome
Ordenar
Retornar lista de inteiros
```
---
