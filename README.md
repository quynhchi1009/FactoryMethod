# FactoryMethod
Factory Method is a creational design pattern that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created.

1. Replace direct object construction calls (using the new operator) with calls to a special factory method. 
2. Limitation: subclasses may return different types of products <=> these products have a common base class or interface.
3. Use when:
  - don’t know beforehand the exact types and dependencies of the objects your code should work with
  - want to provide users of your library or framework with a way to extend its internal components.
  - want to save system resources by reusing existing objects instead of rebuilding them each time.
 
 
Source: https://refactoring.guru/design-patterns/factory-method
