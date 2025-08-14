# Подсказка

- Используйте ThreadLocal.withInitial() для инициализации переменной.
- Каждый поток работает со своей копией значения.
  - После выполнения цикла выведите значение с помощью Thread.currentThread().getName() и threadCounter.get().
  a