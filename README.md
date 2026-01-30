Gestión de Usuarios - Backend con Frontend Integrado
Este proyecto es una aplicación web simple para gestionar usuarios utilizando Spring Boot como backend REST y un frontend integrado en HTML/JavaScript. Permite crear, leer, actualizar y eliminar (CRUD) usuarios, con una interfaz visual en colores pasteles que se actualiza en tiempo real.

Características
Backend REST: Endpoints para operaciones CRUD en usuarios.
Frontend Integrado: Interfaz web embebida en el backend, sin necesidad de servidores separados.
Tiempo Real: La lista de usuarios se actualiza automáticamente cada 5 segundos.
Edición Elegante: Modal para editar usuarios sin alertas intrusivas.
Colores Pasteles: Diseño visual suave con gradientes y diferenciación de secciones.
Tecnologías Utilizadas
Backend: Java, Spring Boot (con Spring Web para REST).
Frontend: HTML, CSS, JavaScript (vanilla, sin frameworks).
Almacenamiento: En memoria (ArrayList), ideal para pruebas. Fácil de cambiar a base de datos (ej. H2 o MySQL).
Herramientas: Maven para dependencias, ngrok para exposición pública (opcional).
Instalación y Ejecución
Requisitos:

Java 17 o superior.
Maven instalado.
IDE como IntelliJ IDEA o Eclipse (opcional, pero recomendado).
Clonar o Descargar el Proyecto:

Descarga los archivos del proyecto y colócalos en una carpeta (ej. ProyectoPrueba).
Estructura del Proyecto:

src/main/java/com/AppWeb/Example/: Código Java (AppApplication, UserController, UserService, UsersModel).
src/main/resources/static/index.html: Frontend integrado.
Ejecutar:

Abre el proyecto en tu IDE.
Ejecuta la clase AppApplication.java (clic derecho > Run).
O desde terminal: mvn spring-boot:run.
El servidor se iniciará en http://localhost:8080.
Acceder:

Abre http://localhost:8080 en tu navegador para ver el frontend.
El backend expone endpoints en /users.
Uso
Crear Usuario: Usa el formulario en la página para ingresar nombres, apellidos y email. Haz clic en "Crear Usuario".
Ver Lista: La lista se carga automáticamente y se actualiza cada 5 segundos.
Editar Usuario: Haz clic en "Editar" en un usuario. Aparecerá un modal para modificar los datos.
Eliminar Usuario: Haz clic en "Eliminar" para borrar un usuario.
Errores: Se muestran mensajes de error en rojo si algo falla (ej. usuario no encontrado).
API Endpoints
El backend expone los siguientes endpoints REST (todos bajo /users):

GET /users: Lista todos los usuarios.
Respuesta: [{"id":1,"names":"Juan","lastNames":"Perez","mail":"juan@example.com"}]
POST /users: Crea un nuevo usuario.
Body (JSON): {"names":"Juan","lastNames":"Perez","mail":"juan@example.com"}
Respuesta: El usuario creado con ID asignado.
PUT /users/{id}: Actualiza un usuario por ID.
Body (JSON): {"names":"NuevoNombre","lastNames":"NuevoApellido","mail":"nuevo@email.com"}
Respuesta: El usuario actualizado.
DELETE /users/{id}: Elimina un usuario por ID.
Respuesta: Mensaje de confirmación (ej. "Usuario eliminado").
Usa herramientas como Postman para probar los endpoints directamente.

Hacer el Backend "Visible" Públicamente
Para compartir la app fuera de localhost:

Instala ngrok (npm install -g ngrok o descarga de ngrok.com).
Ejecuta ngrok http 8080.
Copia la URL generada (ej. https://abc123.ngrok.io) y compártela. Cualquiera puede acceder al frontend y backend.
