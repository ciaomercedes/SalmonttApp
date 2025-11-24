# SalmonttApp

**SalmonttApp** es una aplicación diseñada en **Java** que modela las entidades fundamentales de la empresa
salmonera **Salmontt**, ubicada en Puerto Montt, Chile.

---

👤 **Autor del proyecto**
* **Nombre completo:** Mercedes Malandrino
* **Materia:** DESARROLLO ORIENTADO A OBJETOS I_002A
* **Carrera:** Analista Programador Computacional
* **Sede:** Campus En Línea

---

## 📘 Descripción General

El diseño de esta aplicación está enfocado para la gestión de información de la empresa, buscando mejorar la 
organización que llega desde sus centros de cultivo y la carga del inventario.
Se trata de un **sistema orientado a objetos (POO)** utilizando paquetes funcionales que representan de forma 
estructural la disponibilidad de sus productos y cómo acceder a ellos. El programa permite:

- ✔️ Registrar y consultar centros de cultivo de salmón.
- ✔️ Cargar datos desde archivos de texto (```centros.txt```).
- ✔️ Buscar/filtrar centros por ID, tipo de salmón o producción (>= 1000 toneladas).
- ✔️ Gestionar un inventario de productos (salmón, trucha, etc.) y filtrarlo por nombre de producto.
- ✔️ Guardar el inventario en un archivo ```inventario.txt```

Se utilizan clases definidas ordenadas en paquetes, manipulación de archivos **internos**, **externos** con un **menú**
para la interacción con el usuario; además de colecciones como **ArrayList** y operaciones básicas tipo **recorrido**,
**filtrado** y **validacion**

---

## 🧱 Estructura general del proyecto

```
salmonttApp/
📁 src/
├── app/                    # Paquete `app` donde guardamos la clase Main.java
  └── Main.java             # Clase principal con menu interactivo
└── model/                  # Paquete `model` donde guardamos las clases de dominio  
  └── CentroCultivo.java    # Clase `CentroCultivo` crea los atributos de los centros de pezca
  └── Producto.java         # Clase `Producto` crea los atributos de los productos 
└── data/                   # Paquete `data` donde manipulamos y vinculamos los archivos
  └── GestorDatos.java      # Clase `GestorDatos` donde gestionamos los datos externos o internos
└── service/                # Paquete `data` donde manipulamos y vinculamos los archivos
  └── Buscador.java         # Clase `Buscador` donde gestionamos métodos de búsqueda y filtrado
  └── Validador.java        # Clase `Validador` donde gestionamos validaciones de inputs de usuario
├── resources/              # Carpeta `resources` donde se guardan los datos externos
  └── centros.txt           # Archivo externo `centros`
  
```
### 📦 Paquete: `app`
- **`Main`**: Clase que contiene el menpú principal que orquesta el programa. Muestra los resultados buscados por consola y,
paralelamente, nos crea y descarga una lista con las existencias actuales de los productos.

### 📦 Paquete: `model`

- **`CentroCultivo`**: Clase que representa un centro de cultivo de la empresa. Aqui se guardan sus datos operacionales
- **`Producto`**: Clase que encapsula los datos de los productos.

### 📦 Paquete: `data`

- **`GestorDatos`**: Clase que lee los archivos del centro de cultivo y crea objetos con los datos cargados. Tambien 
carga y guarda el inventario desde la clase.

### 🧠 Carpeta: `service`
- **`Buscador`**: La clase 'Buscador' permitirá hacer la búsqueda por ID, tipo de salmón, producción o todos los centros
Así mismo, almacena el metodo para buscar productos por nombre.
- **`Validador`**: Clase que se encarga de validar los inputs ingresados por consola. Valida numeros enteros, decimales
o textos que no estén vacíos.

### 🧠 Carpeta: `resources`
- **`centros`**: Archivo externo cargado al IDE para ejecutar el programa.


---
## ⚙️ Instrucciones para compilar y ejecutar el programa
1. Abre IntelliJ.
2. Crea un nuevo **Proyecto Java** y ponle el nombre `SalmonttApp`.
3. Copia los archivos del proyecto en las carpetas correspondientes:
    * `model` → para las clases `CentroCultivo` y `Producto`.
    * `app` → para la clase `Main`.
    * `data` → para la clase `GestorDatos`.
    * `service` → para las clases `Buscador` y `Validador`.
    * `resources` → para dejar disponible el archivo `centros.txt`.
4. Haz click derecho sobre la clase `Main` y busca la opcion: **Run 'Main.main()'**. También puedes ir directamente
   a la pestaña Main.java y en la parte superior derecha dale click al botón verde similar a darle "play" en una radio.
5. La compilación del programa arrojará un menú interactivo para que puedas empezar a usar el programa hasta que
decidas salir de él con la opcion `0`.