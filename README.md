# Spacecraft

Este proyecto se raliza basado en la **POO**, el cual su funcionalidad es hacer la creacion de tipos de naves, la cual por cada tipo tendra una funcionalidad diferente, se realiza una barra de busqueda y un listando de las naves espaciales creadas en un archivo indes.html.

## Diagrama entidad relacion
![diagramaEntidadRelacion](https://user-images.githubusercontent.com/111714309/216983168-f2950cc1-fc8e-4960-bbf2-d74dd0d699dd.png)

## Creacion de la base de datos
![database](https://user-images.githubusercontent.com/111714309/216985713-d220b00a-a682-4681-b374-24aa58cfcfcd.PNG)
![database2](https://user-images.githubusercontent.com/111714309/216985736-c0b46540-79d2-496e-9d5f-ed4c14af0016.PNG)

## Configuración IDE recomendada

- MySQL
- Java Spring Boot
- Thymeleaf
- Bootstrap

### Configuración

El proyecto se lanza de manera local en el puerto localhost:8080, y se crean sus respectivos path para el despliegue de este, las cuales son:
- ("/") pagina de inicio
- ("/select") seleccionador de tipos de nave a crear
- ("/addLanzadera") creacion del tipo de nave lanzadera con sus especificaciones
- ("/addNoTripulada") creacion del tipo de nave no tripulada con sus especificaciones
- ("/addTripulada") creacion del tipo de nave tripulada con sus especificaciones
- ("/guardar") guardado en la base de datos con un redireccionamiento a la pagina de inicio

![pagina](https://user-images.githubusercontent.com/111714309/216990437-ecbc8c85-bc46-4d59-ab23-0fb8570a9715.PNG)
