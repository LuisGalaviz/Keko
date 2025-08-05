Keko Lavandería – Sistema de Administración

Descripción

Este proyecto consiste en el desarrollo de un sistema operativo personalizado (entorno o software de sistema) que facilite la administración interna de la empresa Keko Lavandería, permitiendo gestionar eficientemente las órdenes de servicio, los pagos, el control de usuarios, inventarios de insumos y la operación diaria

Problema identificado

Actualmente, Keko Lavandería realiza gran parte de su administración de forma manual o con herramientas aisladas, lo que genera errores, duplicidad de información y pérdida de tiempo en la operación

Solución

La solución propuesta es un sistema centralizado que automatiza los procesos internos, mejora el seguimiento de pedidos y controla los recursos disponibles desde una única plataforma accesible tanto en sucursales como en la nube

Arquitectura

•	Frontend: HTML5, CSS3, JavaScript, Bootstrap

•	Backend: Java con Servlets y JSP

•	Base de datos: MySQL

•	Servidor de aplicación: Apache Tomcat

•	Modelo de desarrollo: MVC (Modelo-Vista-Controlador)

•	Internacionalización: JSTL con archivos .properties

•	Despliegue: Heroku o ambiente local

Tabla de contenidos

•	Descripción

•	Problema identificado

•	Solución

•	Arquitectura

•	Requerimientos

•	Instalación

•	Configuración

•	Uso

•	Contribución

•	Roadmap



Requerimientos

•	Servidor de aplicación: Apache Tomcat 10

•	Servidor de base de datos: MySQL

•	Lenguaje: Java 17

•	Paquetes adicionales:

o	JSTL 1.2

o	JDBC Driver MySQL

o	Bootstrap 5.3

•	Sistema operativo recomendado: Windows 10/11 o Linux Ubuntu 22+



Instalación

1\. Instalar ambiente de desarrollo

•	Instalar Java JDK 17

•	Instalar Apache Tomcat 10

•	Instalar MySQL Server

•	Instalar IDE (Eclipse, IntelliJ o VSCode con soporte para Java)

2\. Ejecutar pruebas manualmente

•	Clonar el repositorio

•	Configurar archivo application.properties con datos de conexión

•	Desplegar en Tomcat

•	Probar manualmente los formularios en localhost

3\. Implementación en producción (Heroku o local)

•	Crear cuenta en Heroku

•	Subir el WAR generado desde el IDE

•	Configurar variables de entorno en Heroku

•	En entorno local, copiar el WAR al directorio webapps/ de Tomcat y reiniciar

Uso

Para usuarios finales

•	Acceder al sistema vía navegador web

•	Crear nueva orden de lavado

•	Consultar estado de pedido

•	Realizar pagos

Para administradores

•	Iniciar sesión como administrador

•	Revisar inventario y generar reportes

•	Administrar usuarios y empleados

•	Realizar respaldos de la base de datos

Contribución

1\.	Para clonar el repositorio:

En bash

Copiar

git remote add origin https://github.com/LuisGalaviz/Keko.git

2\.	Crea una nueva rama:

En bash

Copiar

git checkout -b feature-nombre

3\.	Realiza tus cambios y súbelos:

En bash

Copiar

git commit -m "Agregado nueva función"

git push origin feature-nombre

4\.	Abre un Pull Request y espera revisión para hacer el merge

Roadmap

•	Integrar módulo de facturación electrónica

•	Agregar panel estadístico con gráficos

•	Versión móvil responsiva

•	Soporte para pagos en línea

•	Integración con WhatsApp Business

