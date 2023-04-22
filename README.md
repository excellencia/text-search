# About the project
This is a simple REST API that allows users to search for documents based on keywords or phrases. The application stores all documents in a database and allows users to add new documents via a UI with whatever properties they want.
The application is built using Java with the Spring Boot framework and the H2 database.

## Technology Used
- Java 17
- Spring Boot
- Spring Data JPA
- H2
- Maven

## Getting started
To run the textsearch-api application, you will need to have Java 17 or higher installed on your machine. Once Java is installed, you can follow these steps:

1. Clone the repository using the following command:

2. git clone [public repository]

3. Navigate to the project directory using the following command:
```sh
cd textsearch-api
```
4. Add following sample values in `application.properties` file
```sh
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.jpa.hibernate.ddl-auto=update
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console
```
5. Run the application using the following command:
```sh
./mvnw spring-boot:run
```
## Endpoints
The following endpoints are available for the API:

### Add a document
```bash
POST /documents

{
  "title": "Document title",
  "author": "Document author",
  "date": "2022-04-23T10:20:30Z",
  "content": "Document content"
}
```
### Search for documents
```bash
GET /documents/search?query=keyword
```
## Future Enhancements
- __Full-text search:__ Instead of using JPA Specifications for search, we can integrate a full-text search engine like Elasticsearch or Apache Lucene. These search engines provide better performance, relevancy scoring, and support advanced search features like fuzzy matching, n-grams, and language-specific text analysis.
- __Pagination:__ When dealing with a large number of documents, it's essential to implement pagination to limit the number of results returned per request. This will improve performance by reducing the amount of data transferred and processed by the client.
- __Implement advanced search filters:__ Allow users to narrow down their search results by adding filters such as date range, author, or custom tags. This will make it easier for users to find the exact documents they are looking for.
## Author
Ravi Shankar Pandey

## License
The textsearch-api application is open source software released under the [Apache License].


[//]: # (These are reference links used in the body of this note and get stripped out when the markdown processor does its job. There is no need to format nicely because it shouldn't be seen. Thanks SO - http://stackoverflow.com/questions/4823468/store-comments-in-markdown-syntax)

[localhost]:<http://localhost:8080>
[swagger]:<http://localhost:8080/swagger-ui.html>
[Apache License]:<https://www.apache.org/licenses/LICENSE-2.0>
[public repository]:<https://github.com/excellencia/text-search>