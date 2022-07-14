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
        
        stage('Deploy') { 
            bat "copy target//HelloWorld.war /"/opt/tomcat/apache-tomcat/webapps//HelloWorld.war/""
        }
            steps {
                echo "Este es el deploy"
            }
        } 
        
        stage('Scan') { 
            steps {
                withSonarQubeEnv('sonarqube'){
                    sh '/opt/apache-ant-1.10.12/bin/ant sonar -Dsonar.login=squ_6261fda8d05bf88d063eb9417d64386d08d9494e' 
                }
            }
        }
        stage('Test') { 
            steps {
                echo "Este es el test"
            }
        }

    }
