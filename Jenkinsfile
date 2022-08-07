pipeline {
    agent {
        docker { image 'dipjyotimetia/hybridtestframework:2.0' }
    }
    stages {
        stage('Test') {
            steps {
                sh 'node --version'
            }
        }
    }
}
