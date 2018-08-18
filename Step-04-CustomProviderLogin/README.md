## Step-04-OAuthCustomProviderLogin
[ [Previous](../Step-03-OpenIDConnectLogin) | [Home](../../../) ]

In all the earlier demos we used pre-configured OAuth providers
like Google, Facebook and GitHub. Now we extend our
example to update
[application.yml](src/main/resources/application.yml)
with custom OAuth provider Okta.


### When we run
Once we run the project (
`Step-04-OAuthCustomProviderLogin > GbOauthDemoApp`),
we get an additional OAuth `Custom Provider Okta`
on login page.


#### Client Registration Details
You will need [Okta developer account](https://developer.okta.com/signup/)
and you will be assigned a custom Okta domain-name
(e.g `dev-147231.oktapreview.com`).
You will then need to login as admin and register an OAuth
client application on **Applications** tab to get your own
`client-id` and `client-secret`.


#### Client Provider Details
To configure client provider, we need to know endpoints
exposed by the provider. Please review detailed
information about
[endpoints that Okta exposes](https://developer.okta.com/docs/api/resources/oidc)

You can also add more users on your Okta developer account
who can then login to your application.
