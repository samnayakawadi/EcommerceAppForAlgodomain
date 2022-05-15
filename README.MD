Follow the steps to run the application:

1. Download and extract the ZIP from github.
2. Open Spring Tool Suit (I have used v4)
3. Import the project from file tab.
4. Use Exiting Maven Project
5. Choose your extracted file location.
6. Click on import.
7. Wait for some time (Downloading dependecies)
8. Create Database with name "ecommerce" in mySQL.
9. Configure Database Username & Password in application.properties (Present in src/main/resources)
10. Run as Spring Boot app
11. Application will be running at this URL:PORT ~ http://localhost:8080/ ()
12. Open Any Web Browser and Add This URL for all exiting APIS (SwaggerUI) : http://localhost:8080/swagger-ui.html#/

Sample data to add the product:
{
  "productName":"AVITA Libre Intel i7",
  "productType":"Laptop",
  "productPrice":51000,
  "productCategory":"Computers",
  "sellerName":"AVITA Internation"
}

Note: All APIS List is add as SwaggerAPIScreenshot in main directory