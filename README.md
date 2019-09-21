# RefriAPi
Aplicação que realiza um CRUD de refrigerantes utilizando API Rest SpringBoot, Java 8, Angular 7, PrimeNG, MySQL.

Front-End: Angular 7, utilizando PrimeNG como biblioteca para estilizar as páginas;
Back-End: Java 8, API Rest com Spring Boot;
Persistência: Database e Tables geradas dinamicamente com Flyway (SpringBoot), MysqlServer utilizando Mysql Workbench como SGDB.

Para acessar a api externa (heroku), altere a linha 9 do arquivo refigerante.service.ts que está no projeto Angular "RefriUI" para 
apiUrl = 'https://aw-refri-api.herokuapp.com/refrigerantes';
