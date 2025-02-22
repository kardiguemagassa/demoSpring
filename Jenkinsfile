pipeline {
    agent {
        docker {
            image 'maven:3.9.9-jdk-21'  // Utilisation de l'image Maven avec JDK 21
            args '-v /root/.m2:/root/.m2'  // Optionnel : pour monter le cache Maven
        }
    }

    stages {
        stage('Checkout') {
            steps {
                // Étape pour récupérer le code source du projet depuis le dépôt Git
                checkout scm
            }
        }

        stage('Build') {
            steps {
                // Commande pour construire ton projet avec Maven
                sh 'mvn clean install'  // Pas besoin de spécifier MAVEN_HOME
            }
        }

        stage('Test') {
            steps {
                // Étape pour exécuter des tests unitaires
                sh 'mvn test'  // Exécution des tests avec Maven
            }
        }

        stage('Deploy') {
            steps {
                // Étape de déploiement (à personnaliser selon tes besoins)
                echo 'Deploy stage (à personnaliser selon ton besoin)'
            }
        }
    }

    post {
        success {
            // Action à effectuer si le pipeline réussit
            echo 'Le pipeline a réussi !'
        }
        failure {
            // Action à effectuer en cas d'échec du pipeline
            echo 'Le pipeline a échoué.'
        }
    }
}
