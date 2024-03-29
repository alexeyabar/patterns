# patterns
Sample repo for design patterns examples and some additional notes

Includes:
* GoF patterns


# Gof Patterns
## Source
[Main ref](https://www.digitalocean.com/community/tutorials/gangs-of-four-gof-design-patterns)

[UML diagrams](https://circle.visual-paradigm.com/category/uml-diagrams/gof-design/)

Better examples (w/UML diagrams):
* [Creational](https://refactoring.guru/design-patterns/creational-patterns)
* [Structural](https://refactoring.guru/design-patterns/structural-patterns)
* [Behavioral](https://refactoring.guru/design-patterns/behavioral-patterns)

## Categories
GoF Design Patterns are divided into three categories:

* **Creational**: The design patterns that deal with the creation of an object.
* **Structural**: The design patterns in this category deals with the class structure such as Inheritance and Composition.
* **Behavioral**: This type of design patterns provide solution for the better interaction between objects, how to provide lose coupling, and flexibility to extend easily in future.

## Creational
* **Singleton**: The singleton pattern restricts the initialization of a class to ensure that only one instance of the class can be created. [UML](https://circle.visual-paradigm.com/singleton/)
* **Factory**: The factory pattern takes out the responsibility of instantiating a object from the class to a Factory class. Also known as **Factory Method Design Pattern**. [UML](https://circle.visual-paradigm.com/factory-method/)
* **Abstract Factory**: Allows us to create a Factory for factory classes. [UML](https://circle.visual-paradigm.com/abstract-factory/)
* **Builder**: Creating an object step by step and a method to finally get the object instance. [UML](https://circle.visual-paradigm.com/builder/)
* **Prototype**: Creating a new object instance from another similar instance and then modify according to our requirements. [UML](https://circle.visual-paradigm.com/prototype/)

## Structural
* **Adapter**: Provides an interface between two unrelated entities so that they can work together. [UML](https://circle.visual-paradigm.com/adapter/)
* **Composite**: Used when we have to implement a part-whole hierarchy. For example, a diagram made of other pieces such as circle, square, triangle, etc. [UML](https://circle.visual-paradigm.com/composite/)
* **Proxy**: Provide a surrogate or placeholder for another object to control access to it. [UML](https://circle.visual-paradigm.com/proxy/)
* **Flyweight**: Caching and reusing object instances, used with immutable objects. For example, string pool. [UML](https://circle.visual-paradigm.com/flyweight/)
* **Facade**: Creating a wrapper interfaces on top of existing interfaces to help client applications. [UML](https://circle.visual-paradigm.com/facade/)
* **Bridge**: The bridge design pattern is used to decouple the interfaces from implementation and hiding the implementation details from the client program. [UML](https://circle.visual-paradigm.com/bridge/)
* **Decorator**: The decorator design pattern is used to modify the functionality of an object at runtime. [UML](https://circle.visual-paradigm.com/decorator/)

## Behavioral
* **Template Method**: used to create a template method stub and defer some of the steps of implementation to the subclasses. [UML](https://circle.visual-paradigm.com/template-method/)
* **Mediator**: used to provide a centralized communication medium between different objects in a system.
* **Chain of Responsibility**: used to achieve loose coupling in software design where a request from the client is passed to a chain of objects to process them.
* **Observer**: useful when you are interested in the state of an object and want to get notified whenever there is any change.
* **Strategy**: Strategy pattern is used when we have multiple algorithm for a specific task and client decides the actual implementation to be used at runtime.
* **Command**: Command Pattern is used to implement lose coupling in a request-response model.
* **State**: State design pattern is used when an Object change it’s behavior based on it’s internal state.
* **Visitor**: Visitor pattern is used when we have to perform an operation on a group of similar kind of Objects.
* **Interpreter**: defines a grammatical representation for a language and provides an interpreter to deal with this grammar.
* **Iterator**: used to provide a standard way to traverse through a group of Objects.
* **Memento**: The memento design pattern is used when we want to save the state of an object so that we can restore later on.