# java_multithreading

- The code demonstrates the use of multithreading using the Thread and Runnable classes.
- Multithreading is an important part of modern programming, allowing you to perform multiple operations simultaneously

## JAVA on Manjaro Linux
- **`sudo pacman -S jdk-openjdk`**

- Команда javac Main.java компилирует ваш файл Main.java и создает файл Main.class, который содержит байт-код Java.
- **`javac Main.java`**

- Команда java Main загружает и выполняет класс Main.
- **`java Main`**
  

## Main1.java
- В коде создается два потока, каждый из которых выполняет цикл пять раз, выводя имя потока и номер итерации на каждом шаге.
- Между итерациями потоки "спят" в течение 100 миллисекунд, что позволяет увидеть их параллельное выполнение.
- В методе main() вызывается start() для каждого потока, запуская их выполнение. Затем join() вызывается для каждого потока, заставляя главный поток ожидать завершения этих потоков перед тем, как продолжить.

## Ограничение JAVA
- Java не предоставляет встроенных средств для получения системной информации, таких как загрузка процессора или использование памяти, так как это специфично для операционной системы и не вписывается в концепцию "Write Once, Run Anywhere" языка Java
- Код Main2 будет работать только на Linux и других Unix-подобных системах, так как uname -a не является действительной командой на Windows.
