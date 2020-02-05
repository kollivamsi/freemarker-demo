# freemarker-demo
Spring Boot sandbox for Freemarker Templates (.ftl/.ftlh)

### To Run:
I prefer Eclipse, so these instructions may need tweaking to work in IDEA, NetBeans, or any other IDE you may choose. You will need to install the Spring Tools 4 add-on from the Eclipse Marketplace and restart before attempting to run the application.

1) After cloning the repository to your machine, import the project into Eclipse:
    * Select File > Import > Gradle > Existing Gradle Project.
    * click Next.
    * select the root directory for the project repository.
    * Click Finish.
2. Right click the project name in the Package Explorer, and select "Run As" > "Spring Boot App"
3. In the Console, watch for the line ending with "Completed initialization in # ms".
4. After the app has started, open a web browser, and navigate to localhost:8080/hello/name (replacing name with the name of your choice)


### Database Use:
This project has been configured to create, build, and populate an in-memory H2 database at runtime, which can be manipulated in 3 ways:
* Programatically, through code in the application itself.
* Manually, through the use of the H2 Dashboard, which can be accessed at localhost:8080/h2-console. 
   * **JDBC URL:** jdbc:h2:mem:testdb 
   * **Username:** sa 
   * **Password:** password
* Automatically, by modifying the contents of src/main/resources/data.sql to drop and create the table(s), and populate them with any test data you wish to include at runtime.

It's important to note that as this is an in-memory DB, any changes made to the data will NOT persist after the application is stopped and re-launched.


### Freemarker Templates:
Template files must be placed in src/main/resources/templates, or the compiler will not 'find' them.
