# Session Tracking – Cookies and HTTP Session

## Experiment
**Title:** Maintaining the transactional history of any user using session tracking mechanisms (Cookies, HTTP Session).

## Aim
To implement session tracking using Cookies and HTTP Session in a Java Servlet web application.

## Software Requirements
- JDK 17 or newer
- Apache Maven 3.9.x
- Apache Tomcat 11
- Eclipse / IntelliJ IDEA / VS Code (optional)
- Web browser

> This project uses `jakarta.servlet.*` and is intended for Tomcat 11.

## Project Structure
```text
SessionTracking/
├── pom.xml
├── README.md
└── src/main/
    ├── java/com/sessiontracking/
    │   ├── CookieLoginServlet.java
    │   ├── CookieHistoryServlet.java
    │   ├── SessionLoginServlet.java
    │   ├── SessionHistoryServlet.java
    │   └── LogoutServlet.java
    └── webapp/index.html
```

## Execution Steps

### 1. Verify Java
```bash
java -version
javac -version
```
JDK 17 or newer is recommended.

### 2. Verify Maven
```bash
mvn -version
```

### 3. Build the project
Open Command Prompt/Terminal inside the `SessionTracking` folder:
```bash
mvn clean package
```
Successful build creates:
```text
target/SessionTracking.war
```

### 4. Deploy to Tomcat 11
Copy `target/SessionTracking.war` into:
```text
<TOMCAT_HOME>/webapps/
```
Start Tomcat:
```text
<TOMCAT_HOME>/bin/startup.bat
```

### 5. Open the application
```text
http://localhost:8080/SessionTracking/
```

## Part A – Cookie Session Tracking
1. Enter a username such as `Student1`.
2. Click **Login Using Cookie**.
3. Click **View Transaction History**.
4. The username is read from the browser cookie.

Cookie creation:
```java
Cookie userCookie = new Cookie("username", username);
userCookie.setMaxAge(60 * 60);
response.addCookie(userCookie);
```
Cookie retrieval:
```java
Cookie[] cookies = request.getCookies();
```

## Part B – HTTP Session Tracking
1. Return to the home page.
2. Enter a username.
3. Click **Login Using HTTP Session**.
4. Click **View Transaction History**.
5. Click **Logout** to invalidate the session.

Create/store session data:
```java
HttpSession session = request.getSession();
session.setAttribute("username", username);
```
Retrieve session data:
```java
String username = (String) session.getAttribute("username");
```
Invalidate session:
```java
session.invalidate();
```

## Expected Output
### Cookie Tracking
```text
Cookie Session Tracking
Welcome, Student1
Transaction History
TXN001  Laptop    ₹55,000
TXN002  Keyboard  ₹1,500
```

### HTTP Session Tracking
```text
HTTP Session Tracking
Welcome, Student1
Transaction History
TXN001  Laptop    ₹55,000
TXN002  Keyboard  ₹1,500
```

After logout:
```text
You have been logged out successfully.
```

## Cookie vs HTTP Session
| Feature | Cookies | HTTP Session |
|---|---|---|
| Main storage | Browser/client | Server |
| Java API | `Cookie` | `HttpSession` |
| Retrieval | `request.getCookies()` | `session.getAttribute()` |
| Typical use | Small client-side data/identifiers | Login and server-side user state |
| Termination | Expiry/max-age | `session.invalidate()` |

## Important Note
The transaction records in this demonstration are hard-coded. They are used to demonstrate session tracking and are not permanently stored in a database. A future version can connect the servlet to MySQL and retrieve transaction records for each logged-in user.

## Viva Questions
1. What is session tracking?
2. Why is session tracking required in HTTP?
3. What is a cookie?
4. Where is a cookie stored?
5. What is `HttpSession`?
6. Where is session information maintained?
7. How do you create a session?
8. How do you store data in a session?
9. How do you retrieve data from a session?
10. How do you invalidate a session?
11. What is the difference between Cookies and HTTP Session?
12. What happens when a session expires?

## Result
The Cookies and HTTP Session session-tracking mechanisms were successfully implemented using Java Servlets, and the user's transaction history was displayed across requests.
