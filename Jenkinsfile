pipeline {
    agent any
    stages {
        stage('Debug Info') {
            steps {
                echo "Printing Path Settings:"
                sh 'echo $PATH'
                sh 'which docker'
            }
        }
    }
}