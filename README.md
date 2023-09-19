# Sample Java Code Repository

* This is a sample Java code repository. 

* check basic explanation of details of file hierarchy structure [File-hierachy](https://github.com/mano444/java_sample/wiki/File-_hierachy)  in this sample java project 

* Please clone it and follow the deployment process mentioned in the [Local-3Tier-Deployment](https://github.com/mano444/Local-3Tier-Deployment)




* You can also explore the [wiki pages](https://github.com/mano444/Local-3Tier-Deployment/wiki) in the repository for more details of the installations with snapshots.


  ## JAVA Files Summary

1. **HomeController.java**:
   - A Spring MVC controller class.
   - Contains two request mapping methods: `home()` and `Default()`.
   - Handles requests to "/home" and "/" URLs.
   - Returns a ModelAndView with view names "home" for both URL mappings.


2. **login.java**:
  - Another Spring MVC controller class for user login functionality.
  - Uses `@Value` annotations to inject database connection properties.
  - Contains two request mapping methods: `registerform()` and `login(String userName, String password)`.
  - The `registerform()` method handles GET requests to "/login" and returns the "login" view.
  - The `login(String userName, String password)` method handles POST requests to "/login," validates user credentials in a database, and returns either the "user" view (on successful login) or the "login" view (on failed login).

3. **register.java**:
  - A Spring MVC controller class for user registration functionality.
  - Also uses `@Value` annotations to inject database connection properties.
  - Contains two request mapping methods: `registerform()` and `register(...)`.
  - The `registerform()` method handles GET requests to "/register" and returns the "register" view for displaying the registration form.
  - The `register(...)` method handles POST requests to "/register," inserts user data into a database table, and returns the "register" view with a success message.

4. **MyWebAppApplication.java**:
- The main class for your Spring Boot application.
- Uses the `@SpringBootApplication` annotation to configure and bootstrap the application.
- Contains the `main` method that initiates the application and runs it.

5. **ServletInitializer.java**: 
- A class used for configuring your Spring Boot application when deploying it as a WAR file in a Servlet container.
- Extends `SpringBootServletInitializer`.
- Overrides the `configure` method to specify the primary configuration class (`MyWebAppApplication.class`) for the application context.


  ## JSP File Summary

1. **index.jsp**:
   - Main homepage displaying a welcome message with the username.
   - Includes buttons linking to different sections of the website.

2. **login.jsp**:
   - Page for user login.
   - Features a form for entering a username and password.
   - Users can submit the form to log in or register as a new user.

3. **register.jsp**:
   - Page for user registration.
   - Contains a form for entering user details (first name, last name, email, username, password).
   - Users can submit the form to create a new account or return to the login page.

4. **home.jsp**:
   - Sample home page.
   - Displays a welcome message with the username.
   - Offers buttons to access various sections of the website, including galleries, videos, articles, and more.



