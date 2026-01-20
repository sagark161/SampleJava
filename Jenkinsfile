pipeline {
    agent any 
    stages {
        stage('Test') {
            steps {
                script {
                    // 1. Load the "docker-local" tool we just configured
                    docker.withTool('docker-local') {
                        // 2. Now run the container using that tool
                        docker.image('maven:3.9-eclipse-temurin-17').inside {
                            // 3. Run the test inside the container
                            sh 'mvn clean test'
                        }
                    }
                }
            }
        }
    }
}