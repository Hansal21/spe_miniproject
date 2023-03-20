pipeline {
    environment{
        dockerimage=""
    }
    agent any
    stages {
        stage('Clone Git') {
            steps {
                git branch: 'main', url: 'https://github.com/Hansal21/spe_miniproject.git'
            }
        }

        stage('Maven Build') {
            steps {
                sh 'mvn clean install'
            }
        }

        stage('Docker Build Image') {
            steps {
                script{
                    dockerimage=docker.build "hansal21/miniproject:latest"
                }
            }
        }
        stage('Push Docker Image') {
            steps {
                script{
                    docker.withRegistry('','dockerhub'){
                    dockerimage.push()
                    }
                }
            }
        }

        stage('Delete Docker Image') {
            steps {
                script{
                    sh 'docker image rm -f hansal21/miniproject'
                    }
                }
            }

         stage('Ansible pull Docker Image') {
            steps {
              ansiblePlaybook becomeUser: null, colorized: true, disableHostKeyChecking: true, inventory: 'inventory', playbook: 'ansible-deploy.yml', sudoUser: null
            }
        }

    }

}