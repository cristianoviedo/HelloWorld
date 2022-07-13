pipeline {
    agent any 
    stages {
        stage('Build') { 
            steps {
                echo "Esto es el build"
                echo "agrego otra linea"
                echo "Nueva linea"
            }
        }
        stage('Scan') { 
            steps {
                withSonarQubeEnv('sonarqube'){
                    sh 'mvn sonar:sonar' 
                }
            }
        }
        stage('Test') { 
            steps {
                echo "Este es el test"
            }
        }
        stage('Deploy') { 
            steps {
                echo "Este es el deploy"
            }
        }
    }
}
