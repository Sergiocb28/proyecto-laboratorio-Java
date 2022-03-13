[![Open in Visual Studio Code](https://classroom.github.com/assets/open-in-vscode-f059dc9a6f8d3a56e377f745f24479a46679e63a5d9fe6f495e02850cd0d8118.svg)](https://classroom.github.com/online_ide?assignment_repo_id=7250281&assignment_repo_type=AssignmentRepo)
# Proyecto del Segundo Cuatrimestre Fundamentos de Programación (Curso  \XX\/\YY\)
Autor/a: Sergio Cañamero Begines   uvus: sercanbeg@alum.us.es

Aquí debes añadir la descripción del dataset y un enunciado del dominio del proyecto.


## Estructura de las carpetas del proyecto

* **/src**: Contiene los diferentes archivos que forman parte del proyecto. Debe estar estructurado en los siguentes paquetes
  * **fp.utiles.Sneaker**: Paquete que contiene los tipos del proyecto.
  * **fp.utiles.Sneakers.test**: Paquete que contiene las clases de test del proyecto.
  * **fp.utiles.TipoTalla**: Paquete que contiene los tipos auxiliares del proyecto
  * **fp.utiles.Checkers**:  Paquete que contiene las clases de utilidad. 
* **/data**: Contiene el dataset del proyecto
    * **data/StockX-Data-Contest-2019-3.csv**: El dataset contiene el csv que trata sobre la app Stock-X
    
    
## Estructura del *dataset*

El dataset contiene el csv que trata sobre la app Stock-X, que a su vez trata sobre sneakers.
C:\Users\seery\OneDrive\Escritorio\proyecto laboratorio Java\data
El dataset está compuesto por 8 columnas, con la siguiente descripción:

**columna OrderDate**: de tipo LocalDate, representa la fecha de venta del Sneaker.
**columna Brand**: de tipo String, representa la marca del Sneaker.
**columna Sneaker Name**: de tipo String, representa el nombre del Sneaker.
**columna Sale Price** : de tipo Integer, representa el precio de venta del Sneaker.
**columna Retail Price**: de tipo Integer, representa el precio de retail del Sneaker.
**columna Release Date**: de tipo LocalDate, representa la fecha de salida al mercado del Sneaker.
**columna Shoe Size**: de tipo Double, representa la talla del Sneaker.
**columna Buyer Region**: de tipo String, representa la region del comprador.

....

## Tipos implementados

Describe aquí los tipos que usas en tu proyecto.

### Tipo Base
Descripción breve del tipo base.

**Propiedades**:

- _propiedad1_, de tipo XXX, consultable. 
- _propiedad2_, de tipo XXX, consultable y modificable. 
- ...
- 
**Constructores**: 

- C1: Descripción del constructor 1.
- C2: Descripción del constructor 2.
- ...

**Restricciones**:
 
- R1: La fecha de reventa  debe ser posterior a 2019.
- R2: El precio de retail no puede ser 0.
- ...
- 
**Criterio de igualdad**: Describir el criterio de igualdad

**Criterio de ordenación**: Describir el criterio de ordenación (si lo hay).

**Otras operaciones**:
 
-	_método 1_: Descripción del método 1.
- ...

#### Tipos auxiliares
Descripción de los tipos auxiliares que sean necesarios añadir al proyecto.

### Factoría
Descripción breve de la factoría.

- _método 1_: Descripción del método 1.
-	_método 2_: Descripción del método 2.


### Tipo Contenedor

Descripción breve del tipo contenedor.

**Propiedades**:

- _propiedad1_, de tipo XXX, consultable. 
- _propiedad2_, de tipo XXX, consultable y modificable. 
- ...
- 
**Constructores**: 

- C1: Descripción del constructor 1.
- C2: Descripción del constructor 2.
- ...

**Restricciones**:
 
- R1: Descripción de la restricción 1.
- R2: Descripción de la restricción 2.
- ...
- 
**Criterio de igualdad**: Describir el criterio de igualdad.

**Criterio de ordenación**: Describir el criterio de ordenación natural (si lo hay).

**Otras operaciones**:
 
-	_método 1_: Descripción del método 1.
- ...
