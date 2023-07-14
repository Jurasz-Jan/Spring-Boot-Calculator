# Spring-Boot-Calculator
Simple web application that provides basic mathematical calculations


## API Endpoints:

- Addition: Send a POST request to /add with the request parameters num1 and num2.
- Subtraction: POST request to /subtract with the  parameters num1 and num2.
- Multiplication:  /multiply with  parameters num1 and num2.
- Division: /divide with the parameters num1 and num2.


Example usage:
curl -X POST -d "num1=2&num2=3" http://localhost:8080/calculator/add

