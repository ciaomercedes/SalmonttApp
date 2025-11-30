# SalmonttApp

**SalmonttApp** es una aplicación desarrollada en **Java** que modela y gestiona información operativa de la empresa
salmonera **Salmontt**, ubicada en la Región de Los Lagos, Chile.

---

👤 **Autor del proyecto**
* **Nombre completo:** Mercedes Malandrino
* **Materia:** DESARROLLO ORIENTADO A OBJETOS I_002A
* **Carrera:** Analista Programador Computacional
* **Sede:** Campus En Línea

---

## 📘 Descripción General

El diseño de esta aplicación está enfocado para la gestión de información de la empresa, buscando mejorar la 
organización que llega desde sus centros de cultivo y la carga del inventario. Se utilizan clases definidas ordenadas 
en paquetes, cuya columna vertebral es su **menú** interactivo.

Este proyecto combina el uso de **Programación Orientada a Objetos (POO)**, manipulación de archivos, validación de 
datos, filtrado de colecciones y, además, una **nueva estructura jerárquica de clases incorporada** como parte de la
actividad de esta semana. El programa permite:

- ✔️ Registrar y consultar centros de cultivo de salmón.
- ✔️ Cargar datos desde archivos de texto (```centros.txt```).
- ✔️ Buscar/filtrar centros por ID, tipo de salmón o producción (>= 1000 toneladas).
- ✔️ Gestionar un inventario de productos (salmón, trucha, etc.) y filtrarlo por nombre de producto.
- ✔️ Guardar el inventario en un archivo ```inventario.txt```

## ✔️ Nueva funcionalidad incorporada (actividad)
Se agregó una jerarquía de clases, para modelar unidades operativas generales de la empresa:

* Superclase `UnidadOperativa` (nombre y comuna).
    * Subclases:
      * `CentroCultivo`
      * `PlantaProceso` (nueva subclase).

* Un nuevo gestor: `GestorUnidades`, que crea instancias de prueba para ambas subclases.
* La clase Main ahora imprime estas unidades operativas como parte de la actividad sin afectar la lógica original del 
programa.

---
## 🧱 Estructura general del proyecto

```
salmonttApp/
📁 src/
├── ui/                     # Paquete `ui` donde guardamos la clase principal
  └── Main.java             # Clase `Main` que orquesta la aplicación y donde está el menu interactivo
  
└── model/                  # Paquete `model` donde guardamos las clases de dominio  
  └── CentroCultivo.java    # Clase `CentroCultivo` crea los atributos de los centros de pezca
  └── Producto.java         # Clase `Producto` crea los atributos de los productos
  └── PlantaProceso.java    # Clase `PlantaProceso` subclase de la jerarquia
  └── UnidadOperativa.java  # Clase `UnidadOperativa` superclase de la jerarquia
  
└── data/                   # Paquete `data` donde manipulamos y vinculamos los archivos
  └── GestorDatos.java      # Clase `GestorDatos` donde gestionamos los datos externos o internos
  └── GestorUnidades.java   # Clase `GestorUnidades` crea instancias de prueba de la jerarquía
  
└── service/                # Paquete `data` donde manipulamos y vinculamos los archivos
  └── Buscador.java         # Clase `Buscador` donde gestionamos métodos de búsqueda y filtrado
  └── Validador.java        # Clase `Validador` donde gestionamos validaciones de inputs de usuario
  
├── resources/              # Carpeta `resources` donde se guardan los datos externos
  └── centros.txt           # Archivo externo `centros`
  
```
### 📦 Paquete: `ui`
- **`Main`**: Clase que contiene el menpú principal que orquesta el programa. Muestra primero una visualización de las
plantas de producción heredando atributos de la clase padre, muestra los resultados buscados por consola y con las opciones
del menú es posible crear y descargar una lista con las existencias actuales de los productos.

### 📦 Paquete: `model`

- **`CentroCultivo`**: Clase hija que representa un centro de cultivo de la empresa. Aqui se guardan sus datos operacionales
- **`Producto`**: Clase que encapsula los datos de los productos y representa inventario.
- **`PlantaProceso`**: Clase hija que representa plantas de procesamiento de salmón
- **`UnidadOperativa`**: Superclase/clase padre que entrega nombre y comuna y extiende sus atributos a las clases hijas.
Contiene atributos comunes (nombre, comuna).

### 📦 Paquete: `data`

- **`GestorDatos`**: Clase que lee los archivos del centro de cultivo y crea objetos con los datos cargados. Tambien 
carga y guarda el inventario desde la clase.
- **`GestorUnidades`**: Clase la cual crea instancias de prueba de la jerarquía Padre > hijo a través de un arreglo.

### 🧠 Carpeta: `service`
- **`Buscador`**: La clase 'Buscador' permitirá hacer la búsqueda por ID, tipo de salmón, producción o todos los centros
Así mismo, almacena el metodo para buscar productos por nombre.
- **`Validador`**: Clase que se encarga de validar los inputs ingresados por consola. Valida numeros enteros, decimales
o textos que no estén vacíos.

### 🧠 Carpeta: `resources`
- **`centros`**: Archivo externo con los datos reales de la empresa (usado por GestorDatos).

---
## 📄 Ejemplos en tiempo real
**Ejemplo 1: Jerarquía UnidadOperativa (Actividad de esta semana)**

Al iniciar el programa, antes del menú, se mostrarán objetos creados desde GestorUnidades:

```
===== UNIDADES OPERATIVAS DE PRUEBA =====

>>> CENTRO DE CULTIVO <<<

ID Centro: C001
Nombre: Centro Trucha Azul
Comuna: Puerto Varas
Producción: 1200 t.
Profundidad del Agua: 35.0 mts.
Salinidad: 28.5 PSU
Tipo de salmón: Coho
--------------------------------------------

>>> CENTRO DE CULTIVO <<<
ID Centro: C002
Nombre: Centro Bahía Serena
Comuna: Puerto Montt
Producción: 980 t
Profundidad Agua: 42.0 mts.
Salinidad: 30.2 PSU
Tipo de Salmón: Atlántico
--------------------------------------------

>>> PLANTA DE PROCESO <<<
Nombre: Planta Sur
Comuna: Calbuco
Capacidad de Proceso: 350 t/día
Exporta?: Sí
--------------------------------------------
>>> PLANTA DE PROCESO <<<

Nombre: Planta Norte
Comuna: Aysén
Capacidad de Proceso: 220 t/día
Exporta?: No
--------------------------------------------
```

**Ejemplo 2: Archivo `centros.txt`**

El archivo incluido en resources/centros.txt contiene datos operativos de los centros de cultivo, cada uno con:

`ID;Nombre;Comuna;Toneladas;Profundidad;Salinidad;TipoSalmon`

### → ENTRADA
```
C001;Centro A;Puerto Montt;1200;35.5;30.2;Atlantico
C002;Centro B;Chonchi;1023;42.0;29.8;Coho
C003;Centro C;Aysén;850;50.3;31.1;Atlantico
```
### → SALIDA
Al usar la opción “1. Buscar todos los centros” del menú, su salida esperada es la siguiente:

```
>>>>>>> LISTADO DE CENTROS 'SALMONTT' <<<<<<<<

ID Centro: C001
Nombre: Centro A
Comuna: Puerto Montt
Producción: 1200 t.
Profundidad del Agua: 35.5 mts.
Salinidad: 30.2 PSU
Tipo de salmón: Atlantico
------------------------------------------------------------

ID Centro: C002
Nombre: Centro B
Comuna: Chonchi
Producción: 1023 t.
Profundidad del Agua: 42.0 mts.
Salinidad: 29.8 PSU
Tipo de salmón: Coho
------------------------------------------------------------

ID Centro: C003
Nombre: Centro C
Comuna: Aysén
Producción: 850 t.
Profundidad del Agua: 50.3 mts.
Salinidad: 31.1 PSU
Tipo de salmón: Atlantico
------------------------------------------------------------
```

---
## ⚙️ Instrucciones para compilar y ejecutar el programa
1. Abre IntelliJ.
2. Crea un nuevo **Proyecto Java** y ponle el nombre `SalmonttApp`.
3. Copia los archivos del proyecto en las carpetas correspondientes:
    * `model` → para las clases `CentroCultivo`, `Producto`, `PlantaProceso` y `UnidadOperativa`.
    * `ui` → para la clase `Main`.
    * `data` → para la clase `GestorDatos` y `GestorUnidades`.
    * `service` → para las clases `Buscador` y `Validador`.
    * `resources` → para dejar disponible el archivo `centros.txt`.
4. Haz click derecho sobre la clase `Main` y busca la opcion: **Run 'Main.main()'**. También puedes ir directamente
   a la pestaña Main.java y en la parte superior derecha dale click al botón verde similar a darle "play" en una radio.
5. La compilación del programa arrojará:
   * Una sección inicial con las unidades operativas.
   * Un menú interactivo para que puedas empezar a usar el programa hasta que
   decidas salir de él con la opcion `0`.