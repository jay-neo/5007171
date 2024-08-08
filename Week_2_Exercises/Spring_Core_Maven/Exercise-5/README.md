<h2 align="center">Exercise 5: Configuring the Spring IoC Container</h2>

### Scenario: 
The library management application requires a central configuration for beans and dependencies.

### Steps:
1. Create Spring Configuration File:
    - Create an XML configuration file named `applicationContext.xml` in the `src/main/resources` directory.
    - Define beans for BookService and BookRepository in the XML file.
2. Update the BookService Class:
    - Ensure that the BookService class has a setter method for BookRepository.
3. Run the Application:
    - Create a main class to load the Spring context and test the configuration.
