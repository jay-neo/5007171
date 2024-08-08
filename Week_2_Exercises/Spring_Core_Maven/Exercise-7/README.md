<h2 align="center">Exercise 7: Implementing Constructor and Setter Injection</h2>

### Scenario: 
The library management application requires both constructor and setter injection for better control over bean initialization.


### Steps:
1. Configure Constructor Injection:
    - Update applicationContext.xml to configure constructor injection for BookService.
2. Configure Setter Injection:
    - Ensure that the BookService class has a setter method for BookRepository and configure it in applicationContext.xml.
3. Test the Injection:
    - Run the LibraryManagementApplication main class to verify both constructor and setter injection.
