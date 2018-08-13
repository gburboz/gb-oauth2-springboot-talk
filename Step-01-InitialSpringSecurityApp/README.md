## Step-01-InitialSpringSecurityApp

This project has none of the OAuth code/component, it just sets up
initial Spring Security.

Most of the code here is self explanatory and has been annotated with additional
comments where necessary. If you want to explore further, I'd recommend you to take a look at
[Spring Security Architecture](https://spring.io/guides/topicals/spring-security-architecture/)
and [Spring Security Reference](https://docs.spring.io/spring-security/site/docs/current/reference/htmlsingle/)


### When you run
Once you run the project (`GbOauthDemoApp`), since spring security is
included, this will wire up default auto config of spring security.
App can be accessed at url `http://localhost:8080/` with username as
`user` and password that is printed in console log with line similar
to shown below.
```
Using generated security password: e89fhdc3-5da5-4gc1-83b1-a2g7bd77416a
``` 


### Display logged in user
The `HomeController` exposes path `/home` which returns spring
security `Authentication` as a JSON object containing details of
underlying logged in user.


### Customizing web security
By default custom Security config is not enabled in this project
as `WebSecurity` is commented out to demonstrate default spring
security. Uncomment `WebSecurity` and run the project again.
This time initial index page is displayed without authentication,
and logout link is functional.


#### Logout
Spring security logout by default is POST method to prevent
against CSRF attack. Only for demo purpose we have simplified
it using `logoutRequestMatcher(...)` to support HTTP `GET` method


### spring security logging
For demo purpose, we also set spring security logging to DEBUG so we can observe the logs if we want to.
