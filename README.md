# FormApp

Este proyecto es una aplicación de JavaFX que muestra un formulario con diferentes controles de usuario, incluyendo botones, casillas de verificación, enlaces, botones de toggle, botones de radio, etiquetas, campos de texto, campos de contraseña, áreas de texto, indicadores de progreso y barras de progreso.

## Funcionamiento

La aplicación se inicia con una ventana principal que contiene un formulario con los siguientes controles:

- **Botón:** Un botón estándar que puede ser presionado.
- **Casilla de verificación:** Una casilla de verificación que puede ser seleccionada o deseleccionada.
- **Enlace:** Un enlace que puede ser presionado para abrir una página web.
- **Botón de toggle:** Un botón que puede ser presionado para alternar entre dos estados.
- **Botón de radio:** Un botón de radio que puede ser seleccionado o deseleccionado.
- **Etiqueta:** Un texto estático que muestra información.
- **Campo de texto:** Un campo de texto donde el usuario puede ingresar texto.
- **Campo de contraseña:** Un campo de texto donde el usuario puede ingresar una contraseña.
- **Área de texto:** Un área de texto donde el usuario puede ingresar texto que se ajusta automáticamente al tamaño del área.
- **Indicador de progreso:** Un indicador de progreso que muestra el progreso de una tarea.
- **Barra de progreso:** Una barra de progreso que muestra el progreso de una tarea.

## Estructura del Código

El código se encuentra en el archivo `HelloFx.java` y se organiza de la siguiente manera:

- La clase `Main` extiende de `Application` y sobreescribe el método `start` para crear la ventana principal y agregar los controles.
- Se crean instancias de cada control y se agregan al formulario utilizando un `GridPane`.
- Se establecen las propiedades de cada control, como el texto y el valor inicial.
- Se crea una escena y se establece la ventana principal con la escena.

## Requisitos

- Java 8 o superior
- JavaFX 8 o superior
![Captura de funcionamiento de codigo](https://github.com/AndresDr71/FormApp/assets/104042777/5c45a8b6-f16a-4e8a-b65d-1f9791d6a7f1)


## Compilación y Ejecución

Para compilar y ejecutar el código, sigue los siguientes pasos:

1. Abre una terminal y navega al directorio donde se encuentra el archivo `Main.java`.
2. Compila el código con el comando `javac Main.java`.
3. Ejecuta el código con el comando `java Main`.

