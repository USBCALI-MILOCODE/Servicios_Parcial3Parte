
# Parcial 2, parte 1.

Microservicios Eureka y Estudiante. 

```bash
  http://localhost:8761

```
## Ejercicios de teoria:

### 1. Debe investigar y colocar en este documento el significado de cada uno de  los decoradores que se encuentra en esta clase (Entidad Alumno).

| Decorador             | Significado                                                                |
| ----------------- | ------------------------------------------------------------------ |
| @Entity |  Este decorador , indica que la clase representa una tabla en una base de datos relacional. Cada instancia de esta clase representa una fila en esa tabla. |
| @Table | Este decorador se utiliza en combinación con @Entity para especificar el nombre de la tabla en la base de datos que está asociada con la entidad.|
| @ToString | Este decorador, también parte de Lombok, genera automáticamente un método toString() para la clase que incluye la representación de cadena de todos los campos de la clase. |
| @NoArgsConstructor | Este decorador, nuevamente de Lombok, genera automáticamente un constructor sin argumentos para la clase. Este constructor vacío puede ser útil en situaciones donde necesitas crear instancias de la clase sin proporcionar argumentos. |


