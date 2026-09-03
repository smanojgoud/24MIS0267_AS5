pipeline {
    agent any

    tools {
        maven 'M3' 
    }

    environment {
        // Points Jenkins directly to your system's Java home
        JAVA_HOME = "C:\\Program Files\\Java\\jdk-17"
    }

    stages {
        stage('Clone Repository') {
            steps {
                echo 'Repository checked out successfully.'
            }
        }

        stage('Clean & Compile') {
            steps {
                // Incorporate the environment variable directly into the build
                withEnv(["PATH+JAVA=${env.JAVA_HOME}\\bin"]) {
                    sh 'mvn clean compile'
                }
            }
        }

        stage('Run Unit Tests') {
            steps {
                withEnv(["PATH+JAVA=${env.JAVA_HOME}\\bin"]) {
                    sh 'mvn test'
                }
            }
        }

        stage('Package Application') {
            steps {
                withEnv(["PATH+JAVA=${env.JAVA_HOME}\\bin"]) {
                    sh 'mvn package'
                }
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
