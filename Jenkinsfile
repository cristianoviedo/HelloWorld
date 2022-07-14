pipeline {
    agent any 
    stages {
        stage('Build') { 
            steps {
                echo "Esto es el build"
                echo "agrego otra linea"
                echo "Nueva linea"
               // sh '/opt/apache-ant-1.10.12/bin/ant all'
            }
        }
        
         stage('Compile-Package-create-war-file'){
            // Get maven home path
             steps{
            def mvnHome =  tool name: 'maven', type: 'maven'   
            sh "${mvnHome}/bin/mvn package"
            }
          }
        
        stage('Deploy') { 
            steps{
                sh "copy target//HelloWorld.war /"/opt/tomcat/apache-tomcat/webapps//HelloWorld.war/""
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
    }
