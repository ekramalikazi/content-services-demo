content Services Demo
===================================

This is a parent project consists of following:

1. content-services
2. spring-boot-mvc-legacy
3. spring-boot-mvc-modern

1. content-services
	This is the host service responsible for managing content for different applications. This services talks to couchbase for persistence using spring jpa data. Service can emit data in 2 forms, example.json and example.properties
	
	This application runs on port 8082
	
2. spring-boot-mvc-legacy
	This is a sample MVC JSP project which uses example.properties to render all messages. Internally this uses ReloadableResourceBundleMessageSource bean to load messages from content-services.
	
	This application runs on port 8081
	
	http://localhost:8081/user_list.html?language=en
	http://localhost:8081/user_list.html?language=es
	
	
3. spring-boot-mvc-modern
	This is a sample JHipster AngularJS project which uses example.json to render all messages. Internally this uses angular-translate to load messages from content-services.
	
	This application runs on port 8080
	
	http://localhost:8080/
	
