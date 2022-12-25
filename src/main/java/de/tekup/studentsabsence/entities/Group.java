paquet  de . tekup . absence des étudiants . entités ;

        importer  de . tekup . absence des étudiants . énumérations . LevelEnum ;
        importer  de . tekup . absence des étudiants . énumérations . SpecialityEnum ;
        importer  lombok . AllArgsConstructor ;
        importer  lombok . Données ;
        importer  lombok . NoArgsConstructor ;
        importer  lombok . ToString ;

        importer  javax . persistance .*;
        importer  javax . validation . contraintes . NonVide ;
        importer  javax . validation . contraintes . NonNull ;
        importer  java . util . ArrayList ;
        importer  java . util . Liste ;

@ Entité
@ Données
@ ToString ( exclure = "étudiants" )
@ AllArgsConstructor
@ NoArgsConstructor
@ Table ( nom = "_group" )
 Groupe de classe  publique {
@ identifiant
@ GeneratedValue ( stratégie = GenerationType . IDENTITY )
     ID long  privé ;
@ NotBlank ( message = "Le nom est requis" )
     nom de chaîne  privé ;
@ NotBlank ( message = "Le libellé est requis" )
     étiquette de chaîne  privée ;
@ Énuméré ( EnumType . STRING )
     niveau LevelEnum  privé ;
@ NotNull ( message = "La spécialité est requise" )
@ Énuméré ( EnumType . STRING )
     spécialité privée SpecialityEnum  ;
//TODO Terminer les relations avec d'autres entités

@ OneToMany ( mappedBy = "group" , fetch = FetchType . LAZY , cascade = CascadeType . MERGE )
public  List < Étudiant > étudiants = new  ArrayList <>();

@ OneToMany ( mappedBy = "group" , fetch = FetchType . LAZY , cascade = CascadeType . MERGE )
public  List < GroupSubject > groupSubjects = new  ArrayList <>();


        }