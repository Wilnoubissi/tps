# Création de la base de données
CREATE DATABASE IF NOT EXISTS aerien;

#Sélection de la base de données
USE aerien;

# Création de la table pilotes
CREATE TABLE IF NOT EXISTS pilotes
(
pilote_id INT NOT NULL AUTO_INCREMENT,
nom VARCHAR(50),
prenom VARCHAR(50),
adresse VARCHAR(100),
PRIMARY KEY(pilote_id)
);

#Création de la table avion
CREATE TABLE IF NOT EXISTS avion (
id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
fabricant VARCHAR(50),
modele VARCHAR(50),
localite VARCHAR(50),
capacite INT
);

CREATE TABLE IF NOT EXISTS vol ( 
numeroVol INT not null PRIMARY KEY, 
idPilote INT NOT NULL, 
idAvion INT NOT NULL , 
typeAvion VARCHAR(50), 
villeDepart VARCHAR(50), 
villeDestination VARCHAR(50), 
heureDepart TIME, 
heureArrivee TIME, 
foreign key(idAvion) REFERENCES avion(id), 
foreign key(idPilote) REFERENCES pilotes(pilote_id) 
);

#Insérer les avions dans la table Avion
INSERT INTO avion (id, fabricant, modele, capacite, localite) VALUES 
(111,"BOEING", "787", 300, "NAIROBI"), 
(112,"BOEING","737",250,"SIDNEY"), 
(113,"AIRBUS", "320",220,"MILAN"), 
(114,"AVIC", "250",150,"PEKIN")

#Afficher tous les avions
SELECT * FROM AVION

#Afficher avions par ordre croissant
SELECT * FROM avion ORDER BY fabricant ASC

#Afficher les capacités des avions
SELECT capacite FROM avion

#Afficher les localités des avions sans redondance
select DISTINCT(localite) from avion;

#Afficher les avions dans la localité et NAIROBI ou MILAN
select * from avion where localite ="NAIROBI" or localite="MILAN";

#Modifier la capacité de l’avion numéro 113, la nouvelle capacité et 400
update avion set capacite=400 where id=113;

#Supprimer les avions dans la capacité et inférieure à 200
delete from avion where capacite < 200;

#Afficher la capacité maximale, minimale, moyenne des avions
select max(capacite), min(capacite), avg(capacite) from avion;

#Afficher les données des avions dont la capacité et la plus basse
SELECT * FROM avion WHERE capacite = (SELECT MIN(capacite) FROM avion);

#Afficher les données des avions dont la capacité et supérieure à la capacité moyenne
SELECT * FROM avion WHERE capacite > (SELECT avg(capacite) FROM avion);

#Afficher le nom et l’adresse des pilotes assurant les vols IT100 et IT104
SELECT pilotes.lname, pilotes.fname, pilotes.adresse
    FROM pilotes INNER JOIN vols ON pilotes.id_pilote = vols.id_pilote 
    WHERE vols.numero_vol = "IT100" OR vols.numero_vol = "IT104";

#Afficher les numéros des pilotes qui sont en service
SELECT pilotes.lname, pilotes.fname, pilotes.adresse
    FROM pilotes 
        INNER JOIN vols ON pilotes.id_pilote = vols.id_pilote 
        WHERE ISNULL(vols.heure_arrivee) AND NOT ISNULL(vols.heure_depart);

#Afficher les numéros des pilotes qui ne sont pas en service
SELECT pilotes.lname, pilotes.fname, pilotes.adresse
    FROM pilotes 
        INNER JOIN vols ON pilotes.id_pilote = vols.id_pilote 
        WHERE (NOT ISNULL(vols.heure_arrivee) AND NOT ISNULL(vols.heure_depart)) 
        OR (ISNULL(vols.heure_arrivee) AND ISNULL(vols.heure_depart));

#Afficher les noms des pilotes qui conduisent un AIRBUS
SELECT pilotes.lname, pilotes.fname 
    FROM vols 
        INNER JOIN avions ON vols.id_avion = avions.id_avion 
        INNER JOIN pilotes ON vols.id_pilote = pilotes.id_pilote 
        WHERE fabricant = 'AIRBUS';