pipeline {
    agent {
        docker { 
            image 'maven:3.9-eclipse-temurin-17-alpine' 
        }
    }
    stages {
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
    }
}