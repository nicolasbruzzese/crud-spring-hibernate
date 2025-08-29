# CRUD Clientes con Spring MVC + Hibernate + JSP 📦

Este proyecto es una aplicación web CRUD (Crear, Leer, Actualizar, Eliminar) de clientes desarrollada usando **Spring MVC**, **Hibernate**, **JSP**, **MySQL** y **Bootstrap 5**. Su objetivo es demostrar conocimientos en desarrollo web full-stack utilizando el stack de Java y tecnologías relacionadas.

---

## 🚀 Características

- Gestión de clientes (nombre, apellido, email).
- Validaciones de campos con Spring y Hibernate Validator.
- Persistencia de datos en **MySQL** mediante Hibernate.
- Formularios dinámicos con JSP y Spring Form Tag Library.
- Interfaz responsiva con **Bootstrap 5**.
- Uso de conexión con pool **C3P0**.

---

## 🛠️ Tecnologías utilizadas

- Java 11+
- Spring Framework (MVC, Core, ORM, Transaction)
- Hibernate 5
- JSP, JSTL
- Bootstrap 5
- Apache Tomcat 9
- XAMPP (MySQL + Apache)
- Eclipse IDE
- Git (control de versiones)

---

## 📁 Organización de carpetas

```
crud-spring-hibernate/
│
├─ src/main/java/com/nicolas/
│   ├─ controladores/
│   │   ├─ ControladorInicio.java
│   │   └─ ControladorCliente.java
│   ├─ dao/
│   │   ├─ ClienteDAO.java
│   │   └─ ClienteDAOImpl.java
│   └─ entidades/
│       └─ Cliente.java
│
├─ src/main/webapp/
│   ├─ resources/
│   │   ├─ css/
│   │   │   ├─ bootstrap.min.css
│   │   │   └─ style.css
│   │   └─ js/
│   │       ├─ bootstrap.bundle.min.js
│   │       └─ clientes.js
│   ├─ WEB-INF/
│   │   ├─ view/
│   │   │   ├─ index.jsp
│   │   │   ├─ listarClientes.jsp
│   │   │   ├─ nuevoCliente.jsp
│   │   │   └─ editarCliente.jsp
│   │   ├─ spring-crud-servlet.xml
│   │   └─ web.xml
│
└─ README.md
```

---

## 💾 Configuración de base de datos (MySQL + XAMPP)

1. Asegurate de tener **XAMPP** corriendo con el servicio de **MySQL** activo.  
2. Abrí **phpMyAdmin** y ejecutá el siguiente script SQL:

```sql
-- Crear la base de datos
CREATE DATABASE IF NOT EXISTS gestionclientes
  DEFAULT CHARACTER SET latin1
  DEFAULT COLLATE latin1_swedish_ci;

-- Usar la base de datos
USE gestionclientes;

-- Crear la tabla cliente
CREATE TABLE cliente (
  id INT(10) NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(35) DEFAULT NULL,
  apellido VARCHAR(35) DEFAULT NULL,
  email VARCHAR(45) DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;

-- Insertar datos de ejemplo
INSERT INTO cliente (nombre, apellido, email) VALUES
('Juan', 'Pérez', 'juan.perez@example.com'),
('María', 'González', 'maria.gonzalez@example.com'),
('Carlos', 'Rodríguez', 'carlos.rodriguez@example.com'),
('Ana', 'Martínez', 'ana.martinez@example.com'),
('Luis', 'Fernández', 'luis.fernandez@example.com'),
('Laura', 'Sánchez', 'laura.sanchez@example.com'),
('Pedro', 'Ramírez', 'pedro.ramirez@example.com'),
('Sofía', 'Torres', 'sofia.torres@example.com'),
('Martín', 'López', 'martin.lopez@example.com'),
('Valentina', 'Díaz', 'valentina.diaz@example.com');
```

3. Configurá usuario y contraseña en `spring-crud-servlet.xml` según tu instalación de MySQL.

---

## 🔧 Configuración de codificación

Se utilizó `CharacterEncodingFilter` en `web.xml` para forzar UTF-8 y evitar problemas con tildes y caracteres especiales:

```xml
<filter>
    <filter-name>encodingFilter</filter-name>
    <filter-class>org.springframework.web.filter.CharacterEncodingFilter</filter-class>
    <init-param>
        <param-name>encoding</param-name>
        <param-value>UTF-8</param-value>
    </init-param>
    <init-param>
        <param-name>forceEncoding</param-name>
        <param-value>true</param-value>
    </init-param>
</filter>
<filter-mapping>
    <filter-name>encodingFilter</filter-name>
    <url-pattern>/*</url-pattern>
</filter-mapping>
```

---

## ▶️ Cómo ejecutar

1. Clonar el repositorio:

   ```bash
   git clone https://github.com/nicolasbruzzese/crud-spring-hibernate.git
   ```

2. Importar el proyecto en Eclipse como proyecto dinámico (Dynamic Web Project).  

3. Configurar Apache Tomcat v9.0.  

4. Asegurate de que la base de datos esté creada y funcional.  

5. Ejecutar el proyecto y acceder desde el navegador:

   ```
   http://localhost:8080/CRUD_Spring_Hibernate/
   ```

---

## 📌 Notas

- El proyecto utiliza **Spring MVC** para la capa de presentación, **Hibernate** para la persistencia y **MySQL** como base de datos.
- Se aplican validaciones de campos y mensajes de error visuales en los formularios.
- Se puede extender para incluir más entidades y relaciones complejas.

---

## 👤 Autor

**Nicolás Bruzzese**  
Ingeniero en Computación  
🇺🇾 Uruguay  
