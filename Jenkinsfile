pipeline {
    agent any 
    
    stages {
        stage('Build') { 
           steps {
               sh '/opt/apache-ant-1.10.12/bin/ant all'
            }
        }
        
        stage ('Deploy') {
            steps {
             
          deploy adapters: [tomcat9(credentialsId: 'tomcatJJ', path: '', url: 'http://3.208.87.0:8080/')], contextPath: 'HelloWorld', onFailure: false, war: '**/*.war' 
            echo "deploy ok";
            cleanWs()
      }
    }
        
 //       stage('Scan') { 
 //           steps {
 //               withSonarQubeEnv('sonarqube'){
 //                   sh '/opt/apache-ant-1.10.12/bin/ant sonar -Dsonar.login=squ_6261fda8d05bf88d063eb9417d64386d08d9494e' 
   //             }
     //       }
   //     }
 //       stage('Test') { 
  //          steps {
  //              echo "Este es el test"
   //         }
   //     }
      } 
    }
