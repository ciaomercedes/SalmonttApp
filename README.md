# SalmonttApp

**SalmonttCentre** es un programa desarrollado en **Java** que modela las entidades fundamentales de la empresa
salmonera **Salmontt**, ubicada en Puerto Montt, Chile.

---

👤 **Autor del proyecto**
* **Nombre completo:** Mercedes Malandrino
* **Materia:** DESARROLLO ORIENTADO A OBJETOS I_002A
* **Carrera:** Analista Programador Computacional
* **Sede:** Campus En Línea

---

## 📘 Descripción General

Este proyecto corresponde a la primera fase del proceso de digitalización de los procesos internos de la compañía,
buscando mejorar la gestión y organización que llega desde sus centros de cultivo y la carga del inventario.
Se trata de un **sistema orientado a objetos (POO)** que representa de forma estructural su stock y la informacion
de donde llega sus productos.

Se utilizan clases definidas que están ordenadas por paquetes, manipulación de archivos **internos** y **externos**, 
además de colecciones como **ArrayList** y operaciones básicas tipo **recorrido* y **filtrado*

---

## 🧱 Estructura general del proyecto

```
salmonttApp/
📁 src/
├── ui/                     # Paquete `ui` donde guardamos la clase Main.java
  └── Main.java             # Clase principal `Main`
└── model/                  # Paquete `model` donde guardamos las clases de dominio  
  └── CentroCultivo.java    # Clase `CentroCultivo` crea los atributos de los centros de pezca
  └── Producto.java         # Clase `Producto` crea los atributos de los productos 
└── data/                   # Paquete `data` donde manipulamos y vinculamos los archivos
  └── GestorDatos.java      # Clase `GestorDatos` donde gestionamos los datos externos o internos
├── resources/              # Carpeta `resources` donde se guardan los datos externos
  └── centros.txt           # Archivo externo `centros`
```
### 📦 Paquete: `ui`
- **`Main`**: Clase que orquesta y crea instancias de las clases del programa. Muestra los datos en consola utilizando
  el método `toString()` y, paralelamente, nos crea y descarga una lista con las existencias actuales de los productos.

### 📦 Paquete: `model`

- **`CentroCultivo`**: Clase que representa un centro de cultivo de la empresa. Aqui se guardan sus datos operacionales
- **`Producto`**: Clase que encapsula los datos de los productos.
- 
### 📦 Paquete: `data`

- **`GestorDatos`**: Clase que lee los archivos del centro de cultivo y crea objetos con los datos cargados. Tambien 
carga y guarda el inventario desde la clase.

### 🧠 Carpeta: `resources`
- **`centros`**: Archivo externo cargado al IDE para ejecutar el programa.


---
## ⚙️ Instrucciones para compilar y ejecutar la clase Main.
1. Abre IntelliJ.
2. Crea un nuevo **Proyecto Java** y ponle el nombre `SalmonttApp`.
3. Copia los archivos del proyecto en las carpetas correspondientes:
    * `model` → para las clases `CentroCultivo` y `Producto`.
    * `ui` → para la clase `Main`.
    * `data` → para la clase `GestorDatos`.
4. Haz click derecho sobre la clase `Main` y busca la opcion: **Run 'Main.main()'**. También puedes ir directamente
   a la pestaña Main.java y en la parte superior derecha dale click al botón verde similar a darle "play" en una radio.
5. Observa como compila el programa a través de la consola en la parte inferior del IDE.
6. Paralelamente, se creará automaticamente un archivo de tipo .txt con el inventario de productos. La misma consolsa
te mostrará la ruta de acceso, que debe ser la misma en donde tienes guardado el proyecto.
