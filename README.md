# unpaz-poo-tp-RegistroDeFlota


Enunciado general
Sistema de Gestión de Flota de Transporte

Una empresa que realiza viajes de corta y media distancia necesita digitalizar el registro de su flota de vehículos. Para ello, se desarrolla un sistema orientado a objetos que debe contemplar distintos tipos de vehículos: Autos, Colectivos, Combis y Trafics. Cada tipo de vehículo posee atributos generales (patente, marca, modelo, año de fabricación y kilometraje) y atributos específicos (cantidad de puertas, cantidad de pasajeros, aire acondicionado, espacio para equipaje, según corresponda).

Los datos iniciales de los vehículos se almacenan en un archivo de texto, separados por comas. Cada línea indica el tipo de vehículo seguido de sus datos.

El sistema debe ser capaz de:

Representar la jerarquía de clases correctamente usando herencia y polimorfismo.

Leer los datos del archivo, instanciar los objetos adecuados y almacenarlos en una lista.

Utilizar streams para realizar operaciones como filtrar vehículos, mapear información o agrupar datos.

Poder expandirse fácilmente a nuevos tipos de vehículos o nuevas características.

Con base en esta situación, respondé las siguientes preguntas:

PREGUNTAS
¿Qué ventajas aporta la herencia en la construcción de sistemas orientados a objetos?
¿Qué diferencia hay entre una clase abstracta y una interfaz? ¿En qué caso usarías cada una?
¿Por qué en el caso del sistema de transporte es importante distinguir el tipo de vehículo? ¿Qué problemas tendríamos si no lo hiciéramos?
Explicá qué es el polimorfismo y cómo lo aplicamos en el método mostrarInfo() de los vehículos.
¿Qué errores podrían surgir si no validamos correctamente los datos leídos desde el archivo de texto? Proponé una estrategia para manejarlo.
Si quisieras agregar un nuevo tipo de vehículo (por ejemplo, "Minibus"), ¿qué cambios deberías hacer en tu código?
¿Qué pasos seguirías para leer un archivo .txt en Java y transformar cada línea en un objeto de la clase correspondiente?
¿Qué es un Stream en Java y qué beneficios tiene al trabajar con listas de objetos?
Proponé un ejemplo de uso de filter() y map() con la lista de vehículos leída desde el archivo.
Imaginá que el sistema crece y ahora querés guardar también la información de "servicios realizados" a cada vehículo (fecha y tipo de servicio). ¿Cómo lo modelarías usando composición entre clases?
