# Examen Práctico – Métodos de Ordenamiento

## Descripción

En esta evaluación práctica deberás implementar algoritmos de ordenamiento para gestionar listas de personas. El ordenamiento es una operación fundamental en la programación que permite organizar datos de manera eficiente para su posterior búsqueda, análisis y presentación. 

Tu tarea es implementar métodos de ordenamiento que puedan manejar diferentes casos: nombres simples, nombres con mayúsculas y minúsculas mezcladas, y nombres con caracteres especiales como espacios, guiones y acentos.

## Objetivo

Implementar la clase `PersonController` con métodos de ordenamiento que funcionen correctamente con objetos de tipo `Person`, manejando casos especiales y optimizando el rendimiento del algoritmo.

---

## Modelo: `Person`

Cada objeto `Person` posee los siguientes atributos:

- `name`: nombre de la persona (String)
- `age`: edad de la persona (int)

La clase debe incluir:
- Constructor: `Person(String name, int age)`
- Métodos getter: `getName()`, `getAge()`
- Método `toString()` para representación en texto

---

## Clase a implementar: `PersonController`

### Método principal – `sortByName(Person[] people)`

**Especificaciones:**
- Ordena el arreglo de personas por nombre de forma **ascendente**
- Debe modificar el arreglo original (ordenamiento in-place)
- Debe manejar correctamente:
  - Nombres con diferentes combinaciones de mayúsculas y minúsculas
  - Nombres con espacios y caracteres especiales (guiones, acentos)
  - Comparación case-insensitive pero preservando el formato original
  - Casos edge: arreglos vacíos, un solo elemento, elementos nulos

**Algoritmos sugeridos:**
Puedes implementar cualquiera de estos algoritmos:
- Bubble Sort
- Selection Sort  
- Insertion Sort


**Criterios de ordenamiento:**
1. Comparación alfabética case-insensitive
2. Si los nombres son iguales (ignorando caso), mantener el orden original
3. Caracteres especiales y espacios deben ser considerados en la comparación---

## Casos de prueba

Las pruebas unitarias validarán:

1. **Ordenamiento básico**: Lista de 20 personas con nombres variados
2. **Case sensitivity**: Nombres con diferentes combinaciones de mayúsculas/minúsculas  
3. **Caracteres especiales**: Nombres con espacios, guiones y acentos



---

## Rúbrica de evaluación (9 puntos)

| Componente Evaluado | Descripción | Puntos |
| --- | --- | ---: |
| **Ordenamiento correcto** | El algoritmo ordena correctamente por nombre (ascendente) | 10.0 |
| **Total** | | **10.0** |

---

## Instrucciones para estudiantes (pasos obligatorios)

1. Forkear el repositorio a tu cuenta de GitHub (botón "Fork").
2. Ir a la pestaña "Actions" en tu fork y, si es necesario, activar los workflows (si GitHub muestra un botón para habilitar workflows, haz click en "Enable workflows" o sigue la guía de GitHub). Esto permite que las pruebas automáticas se ejecuten cuando hagas push.
3. Clonar tu fork localmente:

```bash
git clone git@github.com:<TU_USUARIO>/<REPO>.git
cd <REPO>
```



4. Implementar la clase `PersonController` con el método `sortByName(Person[] people)` según la especificación.

5. Ejecutar pruebas localmente antes del push (opcional pero recomendado):

```bash
mkdir -p bin
javac -cp "lib/*" -d bin $(find src -name "*.java")
# Ejecuta las pruebas con JUnit
java -jar lib/junit-platform-console-standalone-1.7.0.jar --class-path "bin:lib/*:lib/validadores-evaluacion.jar" --select-class test.PersonaControllerTest
```

6. Hacer commit y push de tus cambios a tu rama en tu fork:

```bash
git add .
git commit -m "Implementar métodos de ordenamiento PersonController"
git push -u origin main
```

7. Crear un Pull Request (si se solicita) o esperar la evaluación automática de la rama.

---

## Consejos y buenas prácticas

- **Algoritmo recomendado**: Para este nivel, Insertion Sort o Selection Sort son suficientes y fáciles de implementar
- **Comparación de strings**: Usa `String.compareToIgnoreCase()` para comparaciones case-insensitive
- **Manejo de nulos**: Siempre verifica que los objetos no sean nulos antes de acceder a sus propiedades
- **Testing**: Ejecuta las pruebas frecuentemente durante el desarrollo
- **Documentación**: Comenta tu código explicando la lógica del algoritmo elegido

### Ejemplo de implementación (estructura básica):

```java
public class PersonController {
    
    public void sortByName(Person[] people) {
        // Tu implementación del algoritmo de ordenamiento aquí
        // Recuerda manejar casos especiales como arreglos vacíos o nulos
    }
}
```

