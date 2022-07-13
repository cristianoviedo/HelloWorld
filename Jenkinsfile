pipeline {
    agent any 
    stages {
        stage('Build') { 
            steps {
                echo "Esto es el build"
                echo "agrego otra linea"
                echo "Nueva linea"
                sh '/opt/apache-ant-1.10.12/bin/ant all'
            }
        }
        stage('Scan') { 
            steps {
                withSonarQubeEnv('sonarqube'){
                    sh '/opt/apache-ant-1.10.12/bin/ant sonar' 
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
