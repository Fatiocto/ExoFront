# C'est le moment de manipuler quelques concepts basiques de SSH


## 1. Préambule
Assurez-vous que vous soyez dans le répertoire du HandsOn 1
```
$ pwd
[...]/les-bases-ops-formation/HandsOn_01
```
Connectez-vous en ssh sur votre machine cible: 10.0.181.4
> `ssh ubuntu@10.0.181.4`

En réalité, le service ssh a été configuré pour abstraire quelques configurations et fait la commande suivante
> `ssh ubuntu@10.0.181.4 -p 20022 -i .ssh/id_rsa`

Analysons-là :
>- `ssh` : la commande ssh. Elle vous permet de vous connecter à une machine distante. N'hésitez pas à consulter son manuel si le coeur vous en dit.
>- `ubuntu` : c'est le nom de l'**user** avec lequel vous souhaitez vous conssh-necter sur la machine.
>- `10.0.181.4` : c'est l'**hostname** ou l'**ip** de la machine sur laquelle vous souhaitez vous connecter.
>- `-p 20022` : -p vous permet de spécifier le port sur lequel vous allez vous connecter. **NB: Ici c'est un cas particulier, mais sachez que le port par défault pour ssh est le 22.**
>- `-i .ssh/id_rsa` : -i vous permet de spécifier l'emplacement d^e la clé (privée) avec laquelle on va s'identifier sur la machine distante. 

C'est une commande qui fait beaucoup de choses, dont un certain nombre ont été préparées pour vous !
Nous vous proposons maintenant de vous amuser à vous connecter avec une paire de clés que nous avons nous-même généré pour comprendre le mechanisme de ssh.

## 2. Générer sa propre paire de clés
Commençons par générer notre paire de clés. Utilisons la commande : 
>`ssh-keygen -f ma-clé-ssh -t rsa -b 4096 -C monadressemail@octo.com`

Analysons-là :
>- `ssh-keygen` : la commande ssh-keygen. Elle vous permet de générer des paires de clés privées/publiques.
>- `-f ma-clé-ssh` : -f vous permet de choisir le nom du fichier qui contiendra les clés.
>- `-t rsa` : -t vous permet de choisir l'algorithme de chiffrement de la clé. Ici nous avons choisi "rsa", il en existent d'autres : dsa, ecdsa, ed25519
>- `-b 4096` : -b vous permet de choisir la taille en bits de la clé. Pour RSA, en général, le plus gros, le mieux.
>- `-C monadressemail@octo.com` : C'est une bonne pratique de toujours mettre son adresse mail en commentaire, comme ça on sait à qui appartient la clé

Vous devriez obtenir un resultat qui devrait être celui-ci :
```
$ ssh-keygen -f ma-clé-ssh -t rsa -b 4096
Generating public/private rsa key pair.
Enter passphrase (empty for no passphrase): 
Enter same passphrase again: 
Your identification has been saved in ma-clé-ssh.
Your public key has been saved in ma-clé-ssh.pub.
The key fingerprint is:
SHA256:TOB/e8A1i2Qu2gRr+aUY
vo4JQQTLIIg+f6DIJux2HJo roberto.duarte@AMAC02ZV10EMD6V
The key's randomart image is:
+---[RSA 4096]----+
|*..   .          |
|*o   . .         |
|o..   o . o o    |
| + .   B = o o   |
|+ = . = S B .    |
|o= + + B = o     |
|+ = o + + . .    |
| E + o .   .     |
|. . o.o          |
+----[SHA256]-----+
```

Nous avons donc deux fichiers. 
>- ma-clé-ssh : Notre clé privée, à garder précieusement
>- ma-clé-ssh.pub : Notre clé publique

## 3. Configuration de la VM et de l'host

Retour à notre VM vagrant !<br>

Nous devons maintenant configurer la VM afin qu'elle nous autorise à y acceder.
Connectons-nous y ! (`ssh ubuntu@10.0.181.4 -p 20022 -i .ssh/id_rsa`).<br>
Une fois connecté, lancez la commande `cat ~/.ssh/authorized_keys`
```
ubuntu@10-0-181-4:$ cat ~/.ssh/authorized_keys
ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAACAQDDBD+dMZgcVUAQx06G18NctSnvETGdWykrP6Fg0ZZF2Fg/b4cYfnZJ9EBf58E0+knFhVwzgegQg2hMSwI+xdekIGhbyQ9xTfz4RYp4DQu0DfRjmCK/mRZsuSEhuIrtIrl0/vi6KRDzg3uYIdt1UYhqgkmbHv/vc+tpqpnXqNidrfMEP7FP4ddq0S6nG0IPZqKDgPof/jSeAcAGTm2sVPovZInT7+yUIthsyyNjcAuuqQJ7eOGhgZIODJ66xuK5auHJtYeBMqIyHV4L0n3oPoLcTQNpWAFOEkR+sgjrFKJpe+DNd7QDW+KqJ7837FndsAy4mR8MyBMJOGSBwNzruOEO2giZTcJuKG55EX3tcnytZ5Pm7AvKukDbHTXZ0lHcUUGZX5IGCeyhb5t9qPEPED2tREY84EmT2CxKLO5ay61adfC1TdJzZuvZvqUM5bycX4YppWWvrXlT7kd/RoeJqzlt+aDqK96V1y28zi4wacKlT4k5Q3n2PpP8a2vSrc0BM4aYyaJwqhWMVP5mj/bIm2qxmrhyDfFQ8xmdNscT7wQ9A6O1cGJ9My+ExwS88bRFqS7nFTHeVQLLjeIZ3LSCI1Jtqi3I1lFGQeJQEczHZmpWYNzt2m0kq/nFWI3gRjw6Y1XrUrRnsHUENIq2UQNcG+DF4hec54v11g7SqeWsvZ8UNQ== 
```

Vous l'aurez compris, c'est la clé publique associée à la clé privée que nous avions tout à l'heure `.ssh/id_rsa.pub`.
<br>Ajoutons notre propre clé dans le fichier `~/.ssh/authorized_keys` de la VM ! 
Faites attention à ne pbras supprimer celle du voisin ;) 
 ```
< la clé du voisin >
[ ... ] 
ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAACAQDcxXw6gnpIrg0NYXwf4CTBInN8IVRu7ZJlBZFxXrY0r6mZQxpJ4oxLVIdhV/4OSIycOBMx1sPTQIcVfp0+zZeCTuyXfyYjzThWCLGl6IAL377Jc6ZmcMgROa3AkKl0Q6GDvj2XjsV4YxWKu8/ZInrlhD7aU9z7kGJSg0LcawRmdFqV2wJWczCxPGiNonZoouyjZgfKYI/egbrPHOW7BKfh6K3RHU7saDsUBKyuFY66lfMJNlvNBJIcZJoLJyg4IQBkOWthyzUjWmj/Xczt2I7BXpIzrH08ZCDk5NV9O9QqWpW4ZVa0gkUaWvS7qw4C4J91pDm670Wobdimg7TJAGZXKIufsezw4acFRjk7sDypN7EFKjkbxNzLEpbqCqG2V3LOlG6e115J9yHNb8r2h2/HfpRdk1TJk80/a8iMoyBnGM/UhnmRrYnrrf2znnECAjNJ8n6YaTd01bfUevR5xQtXinCCfTd66G2I6UX2d6OVAlCuHnBTtNa0+aSuDAL/BexydSZIvT34qWaw0bRDSibpbmvn4FI5tdcbdTESC3KDVbjv+kjweiKXvnKqqLA6dhhvsgYkw9/po/2DbWsZsK0Xvm/R1h9S5Wrkm7Rgl7SvaR+1S2mHyndrqEgs9ryNzRc2X4qAdJ9n+93NWZy0Zusa61CrxvPnb6hjhIV95TD/3Q== roberto.duarte@AMAC02ZV10EMD6V
```

Retournons sur notre hôte. Et lançons la commande 
```
$ ssh ubuntu@10.0.181.4 -p 20022 -i ma-clé-ssh
ubuntu@10-0-181-4:~$
```
Vous devriez être connecté à votre vm ! Yeeey \o/

## SSH config
BONUS:
Créez ou éditez le fichier ~/.ssh/config de façon à vous connecter à votre vm en entrant la commande simple:
```
$ ssh ma-vm-de-formation
```

