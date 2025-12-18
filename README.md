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
en paquetes, cuya columna vertebral es su **menú** interactivo y segundo menú gráfico independiente para 
la simulación de ingreso de personal y proveedores.

Este proyecto combina el uso de **Programación Orientada a Objetos (POO)**, manipulación de archivos, validación de 
datos, filtrado de colecciones y, además, una **nueva estructura jerárquica de clases incorporada** como parte de la
actividad de esta semana. El programa permite:

- ✔️ Registrar y consultar centros de cultivo de salmón.
- ✔️ Cargar datos desde archivos de texto (```centros.txt```).
- ✔️ Buscar/filtrar centros por ID, tipo de salmón o producción (>= 1000 toneladas).
- ✔️ Gestionar un inventario de productos (salmón, trucha, etc.) y filtrarlo por nombre de producto.
- ✔️ Guardar el inventario en un archivo ```inventario.txt```
### Nuevo
- ✔️ Registrar y consultar ```Empleados``` y ```CentroCultivo``` mediante una GUI independiente.
  * Se utilizan ventanas JOptionPane para solicitar datos de manera interactiva. 
  * La clase MenuGUI permite crear y almacenar las entidades en GestorEntidades.
- ✔️ Validación de inputs mediante la clase Validador:
  * Se controla que los campos sean del tipo adecuado (String, int, double) y no estén vacíos. 
  * Si el usuario ingresa un valor incorrecto, se repite la solicitud hasta obtener un dato válido.
- ✔️ Mejora en la visualización de registros:

## ✔️ Nueva funcionalidad incorporada en paquetes:
utils → `Validador`
- Métodos pedirInt() y pedirDouble() que validan que el input ingresado sea del tipo correcto. 
- Método pedirDireccion() que crea un objeto Direccion solo si todos los campos son válidos.

data → `GestorEntidades`
- Administra la creación y almacenamiento de Empleados y Proveedores. 
- Recorre la lista de entidades con for-each y valida tipos usando instanceof. 
- Permite mostrar la información correctamente mediante toString().

model → `Persona` y `Direccion`
- Se crea la superclase abstracta `Persona` para una eficiencia y respetar estructura jerárquica en las entidades humanas.
- Se crea la clase `Direccion` que representará un domicilio para las entidades humanas que se creen.

---
## 🧱 Estructura general del proyecto

```
salmonttApp/
📁 src/
├── app/                    # Paquete `ui` para la clase principal
  └── Main.java             # Clase principal que orquesta la aplicación y muestra el menu interactivo
  └── MenuGUI.java          # GUI independiente para registrar Empleados y Proveedores
  
└── model/                  # Paquete `model` que guarda las clases de dominio  
  └── CentroCultivo.java    # Subclase que representa centros de cultivo
  └── Direccion.java        # Nuevo: Clase que representa una direccion
  └── Persona.java          # Nueva: Superclase abstracta para entidades humanas
  └── Producto.java         # Clase para inventario de productos
  └── PlantaProceso.java    # Subclase que representa plantas de procesamiento
  └── UnidadOperativa.java  # Superclase abstracta para unidades operativas
  └── Empleado.java         # Representa un empleado de la empresa
  └── Proveedor.java        # Representa un proveedor de la empresa
  └── Registrable.java      # Interfaz común para entidades registrables
  
└── data/                   # Paquete `data` donde manipulamos y vinculamos los archivos
  └── GestorDatos.java      # Clase que gestiona la lectura de archivos y carga/guarda inventario
  └── GestorUnidades.java   # Clase que crea instancias de prueba de unidades operativas
  └── GestorEntidades.java  # Gestiona las entidades registrables (empleados, proveedores)
  
└── utils/                  # Paquete `service` que guarda validaciones y filtros
  └── Buscador.java         # Clase con métodos de búsqueda y filtrado de centros y productos
  └── Validador.java        # Clase con validaciones de inputs de usuario
  
├── resources/              # Carpeta `resources` donde se guardan los datos externos
  └── centros.txt           # Archivo externo con datos de centros de cultivo
  
```
### 📦 Paquete: `app`
- **`Main`**: Clase que contiene el menpú principal que orquesta el programa. Muestra primero una visualización de las
plantas de producción heredando atributos de la clase padre, muestra los resultados buscados por consola y con las opciones
del menú es posible crear y descargar una lista con las existencias actuales de los productos.
- **`MenuGUI`**: Menú independiente con GUI para registrar `Empleados` y `Proveedores` mediante ventanas emergentes.

### 📦 Paquete: `model`

- **`CentroCultivo`**: Subclase que representa un centro de cultivo de la empresa. Aqui se guardan sus datos operacionales
y extiende atributos desde `UnidadOperativa`.
- **`Producto`**: Clase que encapsula los datos de los productos y representa inventario.
- **`PlantaProceso`**: Subclase que representa plantas de procesamiento de salmón y extiende atributos de `UnidadOperativa`
- **`UnidadOperativa`**: Superclase abstracta que entrega nombre y comuna y extiende sus atributos a las 
clases hijas.
- **`Empleado`**: Clase que representa un empleado y extiende la interfaz `Registrable`.
- **`Proveedor`**: Clase que representa un proveedor y extiende la interfaz `Registrable`.
- **`Registrable`**: Interfaz que define un contrato común para entidades registrables.
- **`Persona`**: Superclase abstracta para entidades humanas
- **`Direccion`**: Clase que representa una dirección

### 📦 Paquete: `data`

- **`GestorDatos`**: Clase que lee los archivos del centro de cultivo y crea objetos con los datos cargados. Tambien 
carga y guarda el inventario desde la clase.
- **`GestorUnidades`**: Clase la cual crea instancias de prueba de la jerarquía Padre > hijo a través de un arreglo.
- **`GestorEntidades`**: Gestiona la creación y almacenamiento de Empleados y Proveedores.

### 🧠 Carpeta: `utils`
- **`Buscador`**: La clase 'Buscador' permitirá hacer la búsqueda por ID, tipo de salmón, producción o todos los centros
Así mismo, almacena el metodo para buscar productos por nombre.
- **`Validador`**: Clase que se encarga de validar los inputs ingresados por consola. Valida numeros enteros, decimales
o textos que no estén vacíos.

### 🧠 Carpeta: `resources`
- **`centros`**: Archivo externo con los datos reales de la empresa (usado por GestorDatos).

---
## 📄 Ejemplos en tiempo real
**Ejemplo 1: GUI de Caso 3 – Mostrar registros:**

Al elegir la opción “3. Mostrar registros” del MenuGUI, los registros se muestran de forma clara.
Resultado esperado:

```
Empleado: Mercedes Malandrino
RUT: 12.345.678-9
Cargo: Analista Programador
Dirección: Av. Austral 123, Casa, Puerto Montt, Los Lagos
---------------------------
Centro de Cultivo: Centro A
Comuna: Puerto Montt
Producción: 1200 t.
Profundidad del Agua: 35.5 mts.
Salinidad: 30.2 PSU
Tipo de salmón: Atlantico
---------------------------
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
    * `model` → `CentroCultivo`, `Producto`, `PlantaProceso`, `UnidadOperativa`, `Proveedor`, `Empleado`,
`Registrable`.
    * `ui` → `Main`, `MenuGUI`.
    * `data` → `GestorDatos`, `GestorUnidades`, `GestorEntidades`.
    * `service` → `Buscador`, `Validador`.
    * `resources` → `centros.txt`.
4. Para el menú por consola, ejecuta la clase `Main`.
   4.1. La compilación del programa arrojará:
      * Una sección inicial con las unidades operativas.
      * Un menú interactivo para que puedas empezar a usar el programa hasta que
      decidas salir de él con la opcion `0`.
5. Para registrar `Empleados` o `Proveedores` mediante GUI, ejecuta `MenuGUI.main().`
   5.1.  El programa mostrará el menú interactivo por GUI para que puedas ingresar la información segun los
numero 1, 2, 3 o 0 para salir del menú GUI.