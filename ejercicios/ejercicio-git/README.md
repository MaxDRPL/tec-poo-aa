Ejercicio Git
=============
> Clase del 14 de Febrero, 2014

## Crear un repositorio local
```
git init <ruta>
git init .
```

## Annadir archivo
```
git add <ruta | expression regular>
git add README.md
git add README.md archivo.txt
git add *.md
git add .
```

## Confirmar los cambios
```
git commit -m <comentario>
git commit -m "Initial commit"
```

## Ver el estado del repositorio
```
git status
git log
git show
```

## Crear ramas (branches)
```
git branch # Nos dice en que branch estamos posicionados
git branch <nombre-branch> # No se pasa
git checkout -b <nombre-branch> # Crea el branch y se pasa
```


## Ver diferencias
```
git diff
git diff <nombre-de-branch> --name-only
```

## Fusionar (merge) de ramas
```
git merge [opciones]
git merge <nombre-de-branch>
```

## Publicar a repositorio remoto
…or create a new repository on the command line
```
echo "# ejercicio-git-poo" >> README.md
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin git@github.com:martinicr/ejercicio-git-poo.git
git push -u origin main
```

…or push an existing repository from the command line
```
git remote add origin git@github.com:martinicr/ejercicio-git-poo.git
git branch -M main
git push -u origin main
```
## Traer codigo del remoto 
```
git pull
git fetch <nombre-del-remoto>
```

## Hacer clone de un repositorio remoto
```
git clone <url-del-repo>
```
## Crear un Tag
```
git tag -a v1.0.0 -m "Mi primer tag. Version 1.0.0"
``
