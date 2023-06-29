## A Simple Spring Data & MongoDB example

When running the [Application](src/main/java/com/example/springmongoinheritance/Application.java) the 
[Customer](src/main/java/com/example/springmongoinheritance/models/Customer.java) models are created with specific instances of 
[PayerReturn](src/main/java/com/example/springmongoinheritance/models/PayerReturn.java) and they are hydrated as expected.


Example output:

```shell
> Task :Application.main()

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v3.1.1)

...

Customers found with findAll():
-------------------------------
Customer{id='649d95a19eb7d73cca794d70', firstName='Alice', lastName='Smith', payerReturn=ReturnStd{stdTypeIndicator=true, transactionDt='1', payerReturnType='1', transactionCd='1'}}
Customer{id='649d95a19eb7d73cca794d71', firstName='Bob', lastName='Smith', payerReturn=ReturnIra{iraTypeIndicator=true, transactionDt='2', payerReturnType='2', transactionCd='2'}}

Customer found with findByFirstName('Alice'):
--------------------------------
Customer{id='649d95a19eb7d73cca794d70', firstName='Alice', lastName='Smith', payerReturn=ReturnStd{stdTypeIndicator=true, transactionDt='1', payerReturnType='1', transactionCd='1'}}

Customers found with findByLastName('Smith'):
--------------------------------
Customer{id='649d95a19eb7d73cca794d70', firstName='Alice', lastName='Smith', payerReturn=ReturnStd{stdTypeIndicator=true, transactionDt='1', payerReturnType='1', transactionCd='1'}}
Customer{id='649d95a19eb7d73cca794d71', firstName='Bob', lastName='Smith', payerReturn=ReturnIra{iraTypeIndicator=true, transactionDt='2', payerReturnType='2', transactionCd='2'}}

BUILD SUCCESSFUL in 1s
3 actionable tasks: 3 executed
15:30:58: Execution finished ':Application.main()'.
```