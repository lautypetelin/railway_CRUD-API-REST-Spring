# Proyecto API REST con Spring Boot

Este proyecto es una aplicación de demostración que implementa un API REST utilizando Spring Boot y una base de datos PostgreSQL.

## Requisitos

- Java 17 o superior
- Maven 3.0 o superior
- PostgreSQL
- Visual Studio Code u otro editor de código

## Configuración del entorno de desarrollo

1. Clona este repositorio en tu máquina local.
2. Asegúrate de tener Java y Maven instalados correctamente.
3. Configura una base de datos PostgreSQL con las siguientes credenciales:
   - Usuario: `postgres`
   - Contraseña: `postgres`
   - Puerto: `5432`
4. Crea una base de datos llamada `apirest`.

## Configuración de la aplicación

1. Abre el archivo `application.properties`.
2. Ajusta la configuración de la base de datos según sea necesario, especialmente la URL, el nombre de usuario y la contraseña.
3. Asegúrate de tener las dependencias de Spring Boot y PostgreSQL correctamente configuradas en tu archivo `pom.xml`.

## Ejecución del proyecto

1. Desde Visual Studio Code, abre la terminal integrada.
2. Navega hasta el directorio raíz del proyecto.
3. Ejecuta el comando `mvn spring-boot:run` para iniciar la aplicación.
4. La aplicación estará disponible en `http://localhost:8080`.

## Estructura del proyecto

- **`src/main/java/com/lautaropetelin/apirest/apirest/Controllers`**: Contiene los controladores de la aplicación.
- **`src/main/java/com/lautaropetelin/apirest/apirest/Entities`**: Contiene las entidades de la aplicación.
- **`src/main/java/com/lautaropetelin/apirest/apirest/Repositories`**: Contiene los repositorios JPA de la aplicación.

## Funcionalidades

- **Listar todos los productos**: `GET /productos`
- **Obtener un producto por su ID**: `GET /productos/{id}`
- **Crear un nuevo producto**: `POST /productos`
- **Actualizar un producto existente**: `PUT /productos/{id}`
- **Eliminar un producto**: `DELETE /productos/{id}`

## Contribuciones

Si deseas contribuir a este proyecto, no dudes en enviar un pull request.
