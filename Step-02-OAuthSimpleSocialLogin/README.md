## Step-02-OAuthSimpleSocialLogin
[ [Previous](../Step-01-InitialSpringSecurityApp) | [Next](../Step-03-OpenIDConnectLogin) ]

This project builds on top of `Step-01-InitialSpringSecurityApp`
to add simple social login to Facebook and GitHub using spring
security OAuth code and components. Please see section
[5.7. OAuth 2.0 Login](https://docs.spring.io/spring-security/site/docs/current/reference/htmlsingle/#jc-oauth2login)
from [Spring Security Reference](https://docs.spring.io/spring-security/site/docs/current/reference/htmlsingle/)
for more detials.


### When you run
Once you run the project (`GbOauthDemoApp`), since spring security
OAuth is included and configured, when you access protected
path `/home`, instead of form login, default spring security
OAuth page is displayed which allows you to choose one of the
registered OAuth client in the application.


#### Client Registration Details
You will need Facebook and GitHub developer account where by
you need to register an OAuth client and get your own
`client-id` and `client-secret` .
* Facebook developer account -
    [App Development](https://developers.facebook.com/docs/apps/)
* GitHub developer account -
    [OAuth Apps](https://github.com/settings/developers)

    ![GitHub OAuth registration](../../../src/main/site/images/github-apps.png)

### Changes on top of `Step-01-InitialSpringSecurityApp`
Following changes have been made on top
of `Step-01-InitialSpringSecurityApp`
* Added following two dependencies
  * spring-security-oauth2-client
* In `WebSecurity` we have replaced `formLogin()` with `oauthLogin()`.
* Added OAuth client registration config to `application.yml`


