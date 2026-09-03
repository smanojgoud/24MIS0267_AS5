pipeline {
    agent any

    tools {
        maven 'M3' 
        // We removed the 'Java 17' download block to let Jenkins fall back to its system execution environment.
    }

    stages {
        stage('Clone Repository') {
            steps {
                echo 'Repository checked out successfully.'
            }
        }

        stage('Clean & Compile') {
            steps {
                // Changed 'sh' to 'bat' for Windows compatibility
                bat 'mvn clean compile'
            }
        }

        stage('Run Unit Tests') {
            steps {
                // Changed 'sh' to 'bat' for Windows compatibility
                bat 'mvn test'
            }
        }

        stage('Package Application') {
            steps {
                // Changed 'sh' to 'bat' for Windows compatibility
                bat 'mvn package'
            }
        }
    }

    post {
        success {
            echo 'CI/CD Pipeline finished successfully!'
        }
        failure {
            echo 'Pipeline failed. Check build logs.'
        }
    }
}
