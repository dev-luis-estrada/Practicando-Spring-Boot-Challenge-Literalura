# Proyecto Literatura
Una aplicación Java basada en Spring Boot que te permite gestionar libros y autores de manera eficiente y fácil.

## Descripción del Proyecto
El proyecto literAlura está diseñado para ayudar a los amantes de la literatura a buscar, registrar y listar libros y autores.

### Funcionamiento del Programa

1. **Obtención de Datos**: El programa toma libros de la API GutenDex (https://gutendex.com/).
2. **Conversión a Objetos Java**: Los datos obtenidos de la API se convierten en objetos Java utilizando la clase JsonParser.
3. **Procesamiento**: Los datos se procesan para asegurarse de que los libros y autores no se dupliquen en la base de datos.
4. **Almacenamiento**: Los libros y autores procesados se guardan en PostgreSQL.

## Características

- **Buscar libro por título**: Encuentra libros por su título.
- **Listar libros registrados**: Muestra todos los libros registrados en la base de datos.
- **Listar autores registrados**: Muestra todos los autores registrados en la base de datos.
- **Listar autores vivos en un determinado año**: Encuentra autores que estaban vivos en un año específico.
- **Listar libros por idioma**: Filtra libros por su idioma.

## Tecnologías Utilizadas
- **Java 17+**
- **Spring Boot 3.5.4**
- **Spring Data JPA**
- **PostgreSQL**
- **Maven**

## Instalación y Ejecución

Sigue estos pasos para configurar y ejecutar el proyecto en tu máquina local.

### Prerrequisitos
- Java 17 o superior
- PostgreSQL

### Configurar tu base de datos en el archivo application.properties
```
spring.datasource.url=jdbc:postgresql://localhost:5432/nombre_de_tu_base_de_datos
spring.datasource.username=tu_usuario
spring.datasource.password=tu_contraseña
spring.jpa.hibernate.ddl-auto=update
```
### Ejecuta LiteraturaApplication en tu IDE
Al ejecutar la aplicación, se mostrará un menú en la consola con las siguientes opciones:
```
Bienvenidos a literAlura
Elija una opción:
1 - Buscar libro por título
2 - Listar libros registrados
3 - Listar autores registrados
4 - Listar autores vivos en un determinado año
5 - Listar libros por idioma
0 - Salir
```
## Desarrollado por
- Luis Estrada
