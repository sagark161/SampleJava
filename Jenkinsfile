pipeline {
    agent any 
    stages {
        stage('Test') {
            steps {
                // We use the full path that we know works on your Mac
                sh '/opt/homebrew/bin/mvn clean test' 
            }
        }
    }
    post {
        always {
            // This reads the XML files Maven creates
            junit '**/target/surefire-reports/*.xml'
        }
    }
}