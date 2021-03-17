# Tp1-LabV

Maven : es una herramienta de automatización de compilación que se utiliza principalmente para proyectos Java, aunque también se puede utilizar para crear y administrar proyectos escritos en C # , Ruby , Scala y otros lenguajes. Maven viene con objetivos predefinidos para realizar ciertas tareas bien definidas, como la compilación de código y su empaque.

Pom(Modelo de objeto de proyecto), Es un archivo XML que contiene información sobre el proyecto y los detalles de configuración utilizados por Maven para construir el proyecto. Contiene valores predeterminados para la mayoría de los proyectos. Al ejecutar una tarea u objetivo, Maven busca el POM en el directorio actual. Lee el POM, obtiene la información de configuración necesaria y luego ejecuta el objetivo.

Goals Maven:
Clean :la fase clean se ejecutará primero (lo que significa que ejecutará todas las fases anteriores del ciclo de vida limpio
Package :compila el codigo fuente en el formato distribuible(jar, war, …)
Instanll :instala el paquete en un repositorio local
Compile :compila el codigo fuente

Scopes Maven:
Compile:Este es el alcance predeterminado cuando no se proporciona ningún otro alcance. Las dependencias con este alcance están disponibles en la ruta de clases del proyecto en todas las tareas de compilación y se propagan a los proyectos dependientes.
Provide: ste alcance se utiliza para marcar las dependencias que JDK o un contenedor deben proporcionar en tiempo de ejecución , de ahí el nombre.
Un buen caso de uso para este alcance sería una aplicación web implementada en algún contenedor, donde el contenedor ya proporciona algunas bibliotecas
RunTime: Las dependencias con este alcance son necesarias en tiempo de ejecución , pero no son necesarias para la compilación del código del proyecto. Debido a eso, las dependencias marcadas con el alcance del tiempo de ejecución estarán presentes en el tiempo de ejecución y en la ruta de clases de prueba, pero faltarán en la ruta de clases de compilación.
Test: Este alcance se usa para indicar que la dependencia no es necesaria en el tiempo de ejecución estándar de la aplicación, sino que se usa solo con fines de prueba. Las dependencias de prueba no son transitivas y solo están presentes para las rutas de clases de prueba y ejecución.
System: El alcance del sistema es muy similar al alcance proporcionado . La principal diferencia entre esos dos ámbitos es que el sistema requiere que apuntemos directamente a un jar específico en el sistema.
Lo importante a recordar es que la construcción del proyecto con dependencias del alcance del sistema puede fallar en diferentes máquinas si las dependencias no están presentes o están ubicadas en un lugar diferente al que apunta systemPath
Test:Este alcance indica que la dependencia no es necesaria para el uso normal de la aplicación y solo está disponible para las fases de compilación y ejecución de la prueba. Este alcance no es transitivo. Normalmente, este alcance se utiliza para bibliotecas de prueba como JUnit y Mockito. También se usa para bibliotecas que no son de prueba, como Apache Commons IO, si esas bibliotecas se usan en pruebas unitarias (src / test / java) pero no en el código del modelo (src / main / java).

