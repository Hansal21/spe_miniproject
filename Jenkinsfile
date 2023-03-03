pipeline {
    agent any
    stages {
        stage('Clone Git') {
            steps {
                git 'https://github.com/Hansal21/spe_miniproject.git'
            }
        }
        stage('Maven Build') {
            steps {
                sh 'mvn clean install'
            }
        }
    }
}