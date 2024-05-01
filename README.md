
# Parcial 2, parte 3.

Microservicios Eureka y Estudiante. 

## Eureka
```bash
  http://localhost:8761

```

## SpringGateway
```bash
  http://localhost:8090

```

## Usuarios
```bash
  http://localhost:65409

```
## (fetch = FetchType.LAZY)

El argumento fetch = FetchType.LAZY dentro de la relación @OneToMany en la clase Curso indica que la carga de los objetos relacionados (Alumno en este caso) se realizará de forma perezosa o "lazy". Esto significa que los objetos de Alumno no se cargarán de la base de datos hasta que se acceda explícitamente a ellos.

Al utilizar FetchType.LAZY, la carga de los alumnos se pospone hasta que realmente necesites acceder a ellos, lo que puede ayudar a optimizar el rendimiento de la aplicación al reducir la cantidad de datos que se recuperan de la base de datos en una sola operación.
