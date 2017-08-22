# Pagination of Oracle PL/SQL
Paginaion is important function for most database related websiteS. This project is using PL/SQL to create pagination procedure in database. The advantage of creating pagination in database is seperate the modal and controller better. So java programmer and database programmer can work more efficient.

## Platform 
- Windows 10
- Java 1.8

## Tool
- MyEclipse
- Oracle 11g

## Highlight
- PL/SQL
- Ojdbc
- Oracle

## Before the Start
1. In Order to connect to oracle database, the ojdbc.jar package is required. You can download from here [ojdbc.jar](https://github.com/zhenyu0519/Pagination/blob/master/ojdbc6.jar)then import the package to your project.
2. In Order to use PL/SQL. You need to download Oracled database. Here I am using [11g](http://www.oracle.com/technetwork/database/database-technologies/express-edition/downloads/index.html) version. 10g version also works. I have not tried version 12. Install the oracle 11g may be somehow tricky, follow this [vidwo](https://www.youtube.com/watch?v=v6aAZ9n6Iyw) to make sure install the Oracle properly.

## Processing
1.You need to create PL/SQL procedure and excute the procedure in database. Check the [PL/SQL](https://github.com/zhenyu0519/Pagination/blob/master/pagination.pdc)
2. Import the ojdbc.jar package and connect your program to the Oracle database.

    Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection ct = DriverManager.getConnection;("jdbc:oracle:thin:@localhost:1521:test1","scott","362908227");

3. Create sql statement

``` 
    CallableStatement cs = ct.prepareCall("{call pagination(?,?,?,?,?,?)}");
```


## Installation
1. Install egit [EGit](http://www.eclipse.org/egit/download/) into Eclipse. I found a [video](https://www.youtube.com/watch?v=cdsMIX9gB94&t=530s) may help you.
2. Clone the repository by using URL to Eclipes ``https://github.com/zhenyu0519/Pagination.git``
3. Make some changes on the query to get different result and have fun. 
