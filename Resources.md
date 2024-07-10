# Programación Orientada a Objetos

## Principios

### Abstracción
Definición de una clase en el contexto que necesitemos, representación de los objetos de la vida real. 
- Atributos: definición de propiedades que contendrán los objetos instanciados.
- Métodos: acciones que puede realizar el objeto.

### Encapsulación
Es la restricción del acceso directo a componentes de un objeto y que sus valores solo se puedan acceder o cambiar dentro de los métodos. Por cuestiones de seguridad, a veces es importante que otras clases no puedan cambiar los atribiutos de otras clases directamente.
Para poder encapsular usamos la visibilidad de las clases, atributos o métodos.

### Herencia
Una subclase hereda métodos y atributos de una clase, se ha de pasar el constructor a la subclase cuando la clase heredable es abstracta.

### Polimorfismo
El término "polimorfismo" proviene del griego y significa "muchas formas". En el contexto de la programación, se refiere a la capacidad de una única interfaz para representar diferentes tipos de objetos. Permite a objetos de diferentes clases ser tratados como objetos de una clase común.
La clase abstracta define los métodos pero la implementación será obligatoria en la clase que hereda. Puede haber polimorfismo por herencia o por interfaces.


## Características del Paradigma

### Visibilidad de las clases, atributos o métodos
- Public: puede ser llamada desde donde sea, son accesibles para todas las clases
- Protected: solo pueden acceder a ellas las clases que las heredan y la clase misma
- Private: puede ser usado solo dentro de la clase que la define. No puede ser llamada directamente ni por la misma clase, ni por las que heredan.  

### Tipos de clases 
En la programación orientada a objetos se puede definir distintos tipos de clases que tienen diferentes propósitos. Los más comunes son:

- clase concreta: puede ser instanciada directamente. Contiene implementaciones completas de todos sus métodos. Se utiliza para crear objetos directamente. Proporciona implementaciones completas y puede ser utilizada por otras clases. Se declara normalmente sin palabras claves.

- clase abstracta: no puede ser instanciada directamente y puede contener métodos abstractos (sin implementación) así como métodos concretos (con implementación). Se utiliza para definir una base común para otras clases. Se declara con la palabra clave abstract.

- clase estática: clase anidada dentro de otra clase que puede ser instanciada sin una instancia de la clase externa. No puede acceder directamente a los miembros de la clase externa. Se utiliza para agrupar clases que solo tienen métodos estáticos o para encapsular una funcionalidad auxiliar relacionada con la clase externa. Se declara con la palabra clave static. Normalmente contiene métodos estáticos, aunque puede contener métodos no estáticos también. 

- clase final: no puede ser extendida (heredada) por otras clases. Se utiliza para evitar que una clase sea extendida. Esto puede ser útil por razones de seguridad, para asegurar la invariabilidad de una clase, o para mejorar el rendimiento. Se declara con la palabra clave final.

### Tipos de métodos
En la programación orientada a objetos se puede definir distintos tipos de métodos que tienen diferentes propósitos. Los más comunes son:

- métodos concretos: funciones con implementación completa.

- métodos abstractos: funciones que no tienen implementación en la clase abstracta y deben ser implementados por las subclases.

- métodos estáticos: es una función que pertenece a la clase en sí misma, en lugar de a una instancia específica de la clase. Esto significa que puedes llamar a un método estático sin tener que crear un objeto de la clase.

- métodos finales: funciones que no pueden ser sobrescritas por las subclases.

