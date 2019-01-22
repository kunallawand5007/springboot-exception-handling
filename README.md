Spring Boot Centralized Exception Handling:




It is always a good advise to create exceptions that are meaningful and describe the problem well enough.

I have Created UserNotFoundException

Spring’s exception abstraction frees you from writing those bulky catch blocks and improve the readability of your code with the help of annotations.

Spring provides a better way of handling exceptions, which is Controller Advice. 
This is a centralized place to handle all the application level exceptions.


This is just sample POC for explaining how we can used centralized exception handing in spring boot application
now you can used this based on your requirement. 


Application Run :8090

Open URL:http://localhost:8090/students
Response:[{"name":"Akshay","city":"Pune","rollNo":2},{"name":"Akshay","city":"Pune","rollNo":3},{"name":"Akshay","city":"Pune","rollNo":1}]

Open URL:http://localhost:8090/student/10
Response:User Not Found
In above case if we observe response as user not found ,that come from exception handler if we not used that 
then response we get 500 internal server error 

