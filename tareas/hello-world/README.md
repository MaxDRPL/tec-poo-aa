Hello Java
==========

Markdown

## Compilar

```
javac <archivo .java>
java HelloWorld.java

javac <ruta paquetes + archivo .java>
javac src/tec/poo/hello/HelloWorld.java

javac -d <folder de salida para .class> <folder con fuentes>
javac -d bin/ src/tec/poo/hello/HelloWorld.java
```

## Ejecutar
```
java <archivo .class> 
java HelloWorld.class
java HelloWorld

java <full qualified name>
java tec.poo.hello.HelloWorld

java -cp bin tec.poo.hello.HelloWorld
```

## JAR: Crear un paquete de Java
```
jar -cvf hello-world.jar hello-world
```

## JAR: Extraer contenidos
```
jar -xvf hello-world.jar
```

## JAR: listar contenidos
```
jar -tvf jarFile hello-world.jar
```

## JAR Manifest
Bajo el directory META-INF/
Contiene información sobre el paquete

Se puede crear el propio Manifest

```
Organization: tec.poo
Name: Hello-World
Version: 1.0.0
Dev: Martin
```

`jar -cvmf HelloWorld-Manifest.mf hello-world.jar bin/`

## JAR correr la app

Correr la app especificando el punto de entrada.
```
java -cp ./bin/hello-world.jar tec.poo.hello.HelloWorld
```

Correr el JAR como si fuera "ejecutable"

```
java -jar ./bin/hello-world.jar
```



