

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

### 🟡 Medium
- Ex02_Map_Uppercase → Converter lista para maiúsculo
```

List<String> nomes = List.of("joao", "ana", "carlos");

👉 Faça:

Deixar tudo MAIÚSCULO
Retornar uma nova lista

```

### 🔴 Hard
- Ex03_AllMatch → Validar condição em todos elementos
```

List<Integer> nums = List.of(10, 15, 20, 25, 30);

👉 Faça tudo em Stream:

Filtrar números > 20
Multiplicar por 2
Ordenar
Retornar lista final

```

---
