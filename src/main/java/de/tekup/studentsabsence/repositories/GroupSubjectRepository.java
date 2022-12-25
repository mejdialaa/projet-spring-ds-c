paquet  de . tekup . absence des étudiants . dépôts ;

        importer  de . tekup . absence des étudiants . entités . Groupe ;
        importer  de . tekup . absence des étudiants . entités . GroupSubject ;
        importer  de . tekup . absence des étudiants . entités . GroupSubjectKey ;
        importer  de . tekup . absence des étudiants . entités . Sujet ;
        org d'importation . cadre de ressort . données . référentiel . CrudRepository ;

        importer  java . util . Liste ;
        importer  java . util . Facultatif ;

interface  publique GroupSubjectRepository  étend  CrudRepository < GroupSubject , GroupSubjectKey > {
        List < GroupSubject > findAllByGroup ( ID de groupe  );
        ///TODO créer une méthode pour trouver un groupSubject par Group Id et Subject Id

        List < GroupSubject > findGroupSubjectByGroupIdAndSubjectId ( Group  id , Subject  sid );
        }