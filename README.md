# Taller de Introducción a Programación Orientada a Objetos (POO)

This workshop was a part of BootCamp (FemCoders from Factoria F5) learning. It's objective was to learn the basic concepts of Object-Oriented Programming (OOP)  through the development of a Java project based on a chosen theme and my choice was "Steven Universe" series.

The tasks were:

    - apply concepts of abstraction to design classes with their respective attributes and methods.
    - apply concepts of encapsulation, inheritance, and polymorphism.
    - consider the characteristics of the paradigm, such as the visibility of classes, attributes, and methods, as well as the types of classes and methods.

## Table of Contents

1. [Description](#description)
2. [Installation](#installation)
3. [Contributing](#contributing)
4. [Contact Information](#contact-information)
5. [Aknowledge](#aknowledge)

## Description

Character class is the  main constructor with its attributes and methods, common for all characters: all characters have name, eye color, hair color and weapon, and all characters can make friends.

 From Character inherit two classes: Gem and Human, each with it's specific attributes and methods:
    - Gem have their gemstone, gem type and a state of being broken o no. Only Gems can make fusions and break.
    - Human have gender and age, their can eat or get older.

Boths classes share interfaces. Although they are using those interfaces completely, I didn't put the methods into Character class, because there are characters who don't need methods from the interfaces.
    Interfaces methods are following:
        Regular Actions: 
            - Greet,
            - Talk.
        Battle: 
            - Have weapon,
            - Fight.

From Gem inherit another class, MainCharacter. There are only one main character, Steven Universe, and he is half Gem, half Human. Because it is impossible to inherit from two classes in Java, I had to put manually atrributes and methods from Human. Also, Steven has his unique method - 
    - Heal Gem.


## Installation

### Prerequisites

- Java 17 

### Getting Started

1. Clone this repository to your local machine.
2. Open it with your preferred code editor.
3. Run Java and read terminal.
4. Add more characters (Character, Gem, Human) in App.Java.
5. Add more data to Data Provider according to created characters.
6. Call methods on created characters in App.Java.
7. Run application again to read what are doing new characters.


## Contributing

You can fork this repo for make any changes you'd like to

## Contact Information

Name: Ekaterina Buinovskaia
GitGub: @BSN-Asumiko

## Aknowledge

All information abour characters was taken from https://steven-universe.fandom.com/wiki/Steven_Universe_Wiki



<!-- # Taller de Introducción a Programación Orientada a Objetos (POO)

¡Bienvenidas al taller de programación orientada a objetos! Este taller está diseñado para ayudarles a aprender los conceptos básicos de POO a través del desarrollo de un proyecto basado en un tema a escoger. A continuación se describen las opciones de temas.
Debemos aplicar conceptos de abstración para diseñar las clases con sus respectivos atributos y métodos. Debemos aplicar conceptos de encapsulación, herencia y polimorfismo, ademas de tener en cuenta las caracteristicas del padigma, como la visibilidad de las clases, atributos y métodos, los tipos de clases y métodos.

## Te proponemos algunas series, pero tu puedes proponer la que más te guste ;)

### 1. Romeo y julieta (los montesco y los capuleto),
### 2. El señor de los anillos,
### 3. Universo,
### 4. Harry Potter,
### 5. La divina comedia,
### 6. GOT,
### 7. Adán y Eva,
### 8. Héroes de DC,
### 9. Héroes de Marvel,
### 10. Dragon ball,
### 11. Naruto,
### 12. Shingeki no Kyojin (Attack on Titan).

## Instrucciones de Uso
1. Clona este repositorio en tu máquina local
2. Ábrelo desde el editor de código que prefieras.
 -->