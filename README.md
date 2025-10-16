# FW_ClientSideRender

## 📝 Descripción del Proyecto

Este proyecto es una ejemplo de implementación de un **Renderizado en el Lado del Cliente (Client-Side Rendering - CSR)**. La aplicación permite las opciones CRUD (Create, Read, Update, Delete) sobre la entidad Mensaje. El *frontend* (HTML/JavaScript) se comunica con el *backend* de Java a través de una **API REST que maneja JSON**.
***

## 🛠️ Tecnologías Utilizadas

Este proyecto utiliza una combinación de tecnologías de servidor y cliente:

| Tecnología | Rol | Porcentaje en el Código |
| :--- | :--- | :--- |
| **HTML** | Estructura de la interfaz de usuario (Front-end). | 73.4% |
| **Java** | Lógica de servidor y gestión de recursos (API REST). | 26.6% |
| **Apache Maven** | Gestión de dependencias y ciclo de vida de la construcción. | (Configuración) |
| **CSS / JavaScript** | (Asumido) Estilado y lógica dinámica del lado del cliente. | (No visible en la estructura principal) |

***

## 🚀 Instalación y Ejecución

Sigue estos pasos para configurar y ejecutar el proyecto en tu entorno local.

### Prerrequisitos

Asegúrate de tener instalado lo siguiente:

* **Java Development Kit (JDK)** (Versión 8 o superior).
* **Git** (Para clonar el repositorio).
* Un IDE con soporte para Maven (e.g., IntelliJ IDEA).

### Pasos de Instalación

1.  **Clona el repositorio desde IntelliJ:**

2.  **Ejecuta la aplicación desde IntelliJ:**

3.  **Accede a la aplicación:**
    Una vez que el servidor inicie, la aplicación web estará disponible en la URL:
    `http://localhost:8080/` También puedes abrir el archivo index.html directamente en un navegador desde el explorador de archivos accediendo a la carpeta `resources/static/`

***

## 🔄 Endpoints de la API REST (JSON)

La lógica del lado del cliente (JavaScript) consume los siguientes *endpoints* del *backend* de Java, enviando y recibiendo datos en formato **JSON**.

| Método HTTP | Ruta Base | Propósito | Envía (Body) | Recibe (Response) | Operación CRUD |
| :--- | :--- | :--- | :--- | :--- | :--- |
| **GET** | `/api/mensajes` | Obtiene la lista completa de mensajes. | N/A | Lista de objetos JSON (Mensaje[]) | **Read** (Listar) |
| **GET** | `/api/mensajes/{id}` | Obtiene los detalles de un mensaje específico. | N/A | Objeto JSON (Mensaje) | **Read** (Individual) |
| **POST** | `/api/mensajes` | Crea un nuevo mensaje. | Objeto JSON (Mensaje) sin ID | Objeto JSON (Mensaje) creado | **Create** |
| **PUT** | `/api/mensajes/{id}` | Actualiza un mensaje existente. | Objeto JSON (Mensaje) con ID | Objeto JSON (Mensaje) actualizado | **Update** |
| **DELETE** | `/api/mensajes/{id}` | Elimina el mensaje con el ID especificado. | N/A | HTTP 204 No Content / Mensaje de éxito | **Delete** |

***

## 💡 Uso y Estructura

La estructura del proyecto sigue un patrón común para aplicaciones web basadas en Maven, con un enfoque en la parte cliente:

* **`src/main/java/`**: Contiene el código fuente de **Java**, que puede incluir **Controladores REST** que exponen la API que se consume desde el cliente.
* **`src/main/resources/`**: Contiene archivos de configuración, propiedades y recursos estáticos. Aquí se encuentran los archivos  **HTML** y **JavaScript** que componen la **interfaz del cliente (Frontend)**.
* **`pom.xml`**: Define el proyecto, las dependencias de Maven y los plugins de construcción y ejecución.

## 📄 Licencia

Este proyecto está distribuido bajo la licencia **Creative Commons Atribución-No Comercial 4.0 Internacional (CC BY-NC 4.0)**.

**Esto significa que puedes:**
* Compartir y adaptar el código.

**Pero debes:**
1.  **Dar atribución** al autor original.
2.  **No usar** el material con fines **comerciales**.
***

## 👤 Autor

* **[Samuel Garcia](https://github.com/samuprofe)** - *Trabajo Inicial*