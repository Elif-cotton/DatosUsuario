# Ejercicio 3 Datos de Usuario

En este ejercicio te toca simular el ingreso de datos de un nuevo Usuario. Lo importante es que tengas en cuenta que un par de datos __pueden ser o no nulos__, y eso cambiará totalmente la respuesta de la aplicación.

1. Debes crear una clase que reciba los datos del usuario __(nombre, edad, trabajo, referencia)__.
    - Utiliza un __constructor primario__.
    - Trabajo y referencia pueden ser datos __nulos__ _(Recuerda Null Safety)_.
    - Ten en cuenta que la referencia debe ser otro Usuario.

2. Si la clase está correctamente creada, solo te queda ingresar mínimo dos usuarios y mostrar sus datos por consola. Esto último hazlo a través de una función de clase que tenga el nombre de __mostrarDatos()__.

3. Para la entrega del proyecto súbelo a tu __GitHub__, agrega el enlace a un .txt y ese archivo lo cargas en la plataforma.

----------
__Se adjunta imagen de referencia de la consola__

![](https://i.imgur.com/gRxnwnw.png)

# Ejercicio 4 Lista de Usuarios

Ya tienes preparado el ingreso de datos de Usuarios, ahora es necesario almacenarlos en una lista para poder disponer de ellos de manera ordenada. __Este ejercicio es la continuación del anterior__.

1. Crea una nueva clase que contenga una __lista de Usuarios__.

2. Desde esta nueva clase vas a manejar la lista de Usuarios, por eso es necesario crear tres funciones.
    - _agregarUsuario()_
    - _eliminarUsuario()_
    - _mostrarLista()_
    - _Los nombres solamente son referenciales_, lo importante es que exista una función para agregar un usuario a la lista, otra para eliminarlo y una general que muestre todos los usuarios listados.

3. Ten en cuenta que no todos los usuarios tienen la misma cantidad de datos, por eso a la hora de mostrarlos tendrán una extensión diferente. _Te recomiendo apoyarte de la imagen de referencia como una forma de mostrar los datos._ __(No mostrar NULL)__

4. Una vez tengas creada las nuevas funcionalidades:
    - Agrega cinco usuarios a la lista.
    - Muestra la lista por consola.
    - Elimina uno de los usuarios y vuelve a mostrar la lista.

5. Actualiza tu proyecto en __GitHub__ con los nuevos cambios y exactamente igual al procedimiento anterior, sube a la plataforma un archivo .txt con el enlace al repositorio.

----------
__Se adjunta imagen de referencia de la consola__

![](https://i.imgur.com/Tz5IReJ.png)

# Ejercicio 5 Nueva Lista de Usuarios Filtrada

Estoy seguro de que tu lista de usuarios ya funciona correctamente, por eso estas aquí. Ahora, vamos a continuar con el mismo ejercicio anterior y crearemos una nueva funcionalidad para generar una lista que solo almacene los Usuarios que nosotros le indiquemos por medio de su edad.

__¡Manos al código!__

1. Dentro de la misma clase que contiene tu _lista de usuarios_, crea una nueva función que reciba como parámetro un __número__ y retorne una __lista__.

2. Vas a crear la _lógica necesaria_ para retornar una lista de usuarios __mayores al número ingresado__ a la hora de llamar a la función.

3. Una vez tengas los datos, analiza la forma óptima de mostrar por consola el __Nombre__ y la __Edad__ de cada _Usuario_ que fue almacenado en esa nueva lista.
    - Recuerda lo que vimos relacionado a la __programación funcional__, eso te puede ayudar.
    - Para mostrar los datos también te puedes ayudar de la imagen referencial.

4. Una vez tengas terminadas las nuevas funcionalidades, actualiza tu proyecto en __GitHub__ y por medio de un archivo .txt sube el enlace de tu repositorio al nodo.

----------
__Se adjunta imagen de referencia de la consola__

![](https://i.imgur.com/zYKkZO7.png)

_(Se creó una nueva lista para los Usuarios mayores de 40 años)_
