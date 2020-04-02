# Spring Security Practice

A Sample project to show a spring-security-web issue.

If you run this application, you should see below error.

```
2020-04-02 22:53:09.405 ERROR 58116 --- [  restartedMain] o.s.boot.SpringApplication               : Application run failed

org.springframework.context.ApplicationContextException: Unable to start web server; nested exception is org.springframework.boot.web.server.WebServerException: Unable to start embedded Tomcat
	at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.onRefresh(ServletWebServerApplicationContext.java:156) ~[spring-boot-2.2.6.RELEASE.jar:2.2.6.RELEASE]
...
Caused by: java.lang.IllegalArgumentException: authenticationManager must be specified
	at org.springframework.util.Assert.notNull(Assert.java:198) ~[spring-core-5.2.5.RELEASE.jar:5.2.5.RELEASE]
	at org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter.afterPropertiesSet(AbstractAuthenticationProcessingFilter.java:164) ~[spring-security-web-5.2.2.RELEASE.jar:5.2.2.RELEASE]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.invokeInitMethods(AbstractAutowireCapableBeanFactory.java:1855) ~[spring-beans-5.2.5.RELEASE.jar:5.2.5.RELEASE]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1792) ~[spring-beans-5.2.5.RELEASE.jar:5.2.5.RELEASE]
	... 56 common frames omitted


Process finished with exit code 0
```

