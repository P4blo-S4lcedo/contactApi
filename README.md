📌 **ContactApi (Spring Boot + Maven)**

Esto proyecto es una API RESTful desarrollada con Spring Boot y Spring Data JPA. El tema elegido fue una Agenda de Contactos, donde puedes crear, leer, actualiza, eliminar y listar contactos.

- **Tecnologías utilizadas**
  * Java 17
  * Spring Boot
  * Spring Data JPA
  * Maven
  * MySQL
  * Postman

- **Endpoints disponibles**
  * Crear un contacto:
      * POST/contacts
      * Descripción: Crea un nuevo contacto en la base de datos.
      * Body (Json):
      ```json
      [
        {
          "firstName": "juan",
          "lastName": "perez",
          "email": "juanperez@example.com",
          "phoneNumber": "3001234567"
        }
      ]
    
  * Listar todos los contactos:
      * GET/contacts/{id}
      * Descripción: Devuelve la lista completa de contactos.
      * Respuesta:
      ```json

      [
        {
          "firstName": "Juan",
          "lastName": "Pérez",
          "email": "juanperez@email.com",
          "phoneNumber": "3001234567"
        },
        {
          "firstName": "Ana",
          "lastName": "Gómez",
          "email": "ana@email.com",
          "phoneNumber": "3119876543"
        }
      ]
  
  * Obtener un contcto por Id
      * GET/contacts/{id}
      * Ejemplo /api/contacts/1
      * Respuesta:
      ```json
      [
        {
          "firstName": "Juan",
          "lastName": "Pérez",
          "email": "juanperez@email.com",
          "phoneNumber": "3001234567"
        }
      ]
    
    
  * Eliminar un contacto
    * DELETE/api/contacts{id}
    * Ejemplo: /api/contacts/1
    * Respuesta (204 No Content):
    (No devuelve contenido)



- **Cómo ejecutar el proyecto**
  1. Clonar el repositorio
     ```bash
     git clone https://github.com/tuusuario/contact-api.git
     
  2. Imporar el proyecto en Eclipse como Maven Project
     
  4. Ejecutar la aplicación desde la clase principal (ContactApiApplication.java)
     
  6. Probar los endpoints en Postman usanro la URL base:
    ``` arduino
    http://localhost:8080
