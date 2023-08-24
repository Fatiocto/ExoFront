```sh
$ pwd
[...]/les-bases-ops-formation/HandsOn_01
```

# Objectif :
Manipuler des commandes de base de linux en mettant en place un serveur Nginx basique.

# TP
Commençons par installer un serveur bien connu, Nginx.

## Installer et démarrer un serveur Nginx
L'installation de programmes sur linux se fait via des gestionnaires de paquets. À chaque distribution son propre gestionnaire.
>Installez Nginx grâce au gestionaire de paquet d'ubuntu : `apt`

Si Nginx est installé, vous devriez avoir :
```sh
$ which nginx
/usr/sbin/nginx
```
>Maintenant l'installation faite, utilisez la commande `systemctl` pour lancer le deamon Nginx.

Si votre serveur web a correctement démarré, vous devriez pouvoir consulter sa page d'accueil via l'url `http://localhost`
grâce à la commande **curl** :
``q`sh
$ curl http://localhost
<!DOCTYPE html>
<html>
<head>
<title>Welcome to nginx!</title>
<style>
    body {
        width: 35em;
        margin: 0 auto;
        font-family: Tahoma, Verdana, Arial, sans-serif;
    }
</style>
</head>
<body>
<h1>Welcome to nginx!</h1>
<p>If you see this page, the nginx web server is successfully installed and
working. Further configuration is required.</p>

<p>For online documentation and support please refer to
<a href="http://nginx.org/">nginx.org</a>.<br/>
Commercial support is available at
<a href="http://nginx.com/">nginx.com</a>.</p>

<p><em>Thank you for using nginx.</em></p>
</body>
</html>
```
Ou directement sur votre navigateur web http://localhost:8080

Votre serveur web est *up and running* !

## Faisons joujou avec d'autres commandes linux !

Vous savez comment récupérer la page d'accueil de votre serveur grâce à la commande **curl**.

> Utilisez la commande `wc` sur la sortie standard de la commande curl précédente afin de compter le nombre de lignes de la page d’accueil du serveur.

> Retrouvez maintenant la variable d'environnement `ENV_VARIABLE_SUPER_SECRETE` grâce à la commande `env`. (Profitez de l'occasion pour découvrir la commande `grep`)

Revenons un peu à notre serveur Nginx. Dans les standards d'organisation de fichiers dans Linux, bien que ce ne soit pas forcement le cas tout le temps, le premier réflexe pour retrouver les fichiers de configuration, c'est d'aller voir dans /etc.

> Retrouvez le fichier de configuration de nginx. Prenez le temps d'y jeter un oeil

Note : Les commandes suivantes peuvent peut-être vous aider si vous n'y parvenez pas :
```sh
$ sudo apt install locate && sudo updatedbls
$ locate nginx
```
> Retrouvez le dossier racine des pages HTML affichées par nginx. Le fichier
> `/etc/nginx/sites-enabled` pourrait vous aider.

> Modifiez-y le fichier index.html pour afficher votre trigramme/quadrigramme (notez qu'il faut avoir les droits de modification). Découvez au passage l'éditeur favori des barbus VIM.

> Comptez le nombre d’appels à NGINX à partir des logs. Vous pouvez, entre autre, retrouver l'emplacement des fichiers de logs dans le fichier de conf.

> Bonus : Essayez de retrouver les PID des processus de ngnix

Commandes utiles :
>apt, cat, curl, grep, |, env, vi, ps, wc

Note : Gardez votre vm pour le prochain HandsOn
