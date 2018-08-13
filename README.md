# gb-oauth2-springboot-talk
Under the hood of social login w/ Springboot and OAuth/OIDC takes
step by step approach to help understand OAuth/OIDC
authorization code flow and demonstrates it with example
using Spring Boot 2.x and Spring Security 5. Code demos are based off
[OAuth 2.0 Login Sample](https://github.com/spring-projects/spring-security/blob/5.0.7.RELEASE/samples/boot/oauth2login/README.adoc)
from Spring Security


## Abstract:
You may have used your Google or Facebook account to login
into some third-party website (e.g. Stack Overflow) and such
social login happens without user having to expose their
credentials to third-party. Music app on mobile device is able
to post updates to your Facebook account, third-party can use
Twitter API to add certifications to user profile.

Modern application development is composed of micro-services
and APIs that needs to be secured while we want folks from
different department or even third-party to develop web
or mobile applications to consume them.

Most of such use cases are mostly enabled by
technology called OAuth and Open ID Connect (OIDC).

## Presentation

* Presentation PDF [OAuth Social Login](src/main/site/OAuthSocialLogin.pdf)


## Demo Prerequisite:
* Java Web Development
* Springboot and Spring Security
* HTML/CSS/JavaScript

## Demo Steps

* [Step-01 Initial Spring Security App](Step-01-InitialSpringSecurityApp)

* [Step-02 OAuth Simple Social Login](Step-02-OAuthSimpleSocialLogin)

* [Step-03 OAuth Custom Provider](Step-03-OAuthCustomProvider)


### Each Demo File Structure
![File List](src/main/site/images/file-list.png)


## About the session:
* What is the problem we are trying to solve?

* Demo Java Spring boot web app that logs user in the
application using one of social login which will baffle
you with its implementation simplicity.

* We will go under the hood of social login to understand
underlying OAuth/OIDC technology by using an
analogy [Key part of this talk].

* We will map this analogy to OAuth Authorization Code flow

* Based off which we will further explain other flows like
Implicit flow, Resource Owner Credentials flow and
Client Credentials flow.

* We will discuss for which modern application scenario
what kind of OAuth flow can be used.

* Brief intro to JWT

* Next we will talk about what Open ID Connect and why
it is important to use it for authentication rather than
just plain OAuth.

* We will revisit the demo application we had created to
understand various configuration elements used in it.

* If time permits, we will extend our code demo with
additional features.
