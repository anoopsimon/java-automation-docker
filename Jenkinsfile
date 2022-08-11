pipeline {
    agent {
        docker { image 'nodejs' }
    }
    stages {
        stage('Test') {
            steps {
                sh 'node --version'
            }
        }
    }
}
