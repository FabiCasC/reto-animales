# 🦁 RetoAnimales 🐠🦅

Este proyecto es una implementación en Java que simula una clasificación de animales en diferentes tipos (terrestres, voladores y acuáticos) utilizando conceptos de Programación Orientada a Objetos (POO), Streams y Maven. Los animales son creados a partir de entradas proporcionadas por consola y luego se agrupan por su tipo. 🐾

## 🛠️ Tecnologías y Herramientas Usadas

- **Java 17** ☕: Lenguaje de programación utilizado para la implementación del proyecto.
- **Maven** 🏗️: Herramienta de construcción que se utiliza para gestionar dependencias y el ciclo de vida del proyecto.
- **Streams API** 🌊: Usada para procesar las colecciones de animales de manera eficiente.
- **JUnit** 🧪: Framework utilizado para realizar pruebas unitarias.

## 📝 Descripción del Proyecto

El proyecto consiste en una aplicación que recibe una lista de animales a través de la línea de comandos. Cada animal está definido por un nombre, un tipo (terrestre, volador o acuático) y una onomatopeya (el sonido que hace el animal). El programa agrupa los animales por su tipo y muestra cada grupo en consola. 🐕🦆🐟

### 📥 Ejemplo de Entrada

```shell
java -jar target/RetoAnimal-1.0-SNAPSHOT.jar "Perro|TERRESTRE|Guau" "Pato|VOLADOR|Cuac" "Pez|ACUATICO|Blub"

