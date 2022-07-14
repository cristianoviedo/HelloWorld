pipeline {
    agent any 
    tools{
        maven 'maven'
    }
    stages {
        
         stage ('Build') {
             steps {
                sh 'mvn clean package'
                 }
             }
        
        stage ('Deploy') {
            steps {
                script {
                     deploy adapters: [tomcat9(credentialsId: 'tomcat_credential', path: '', url: 'http://dayal-test.letspractice.tk:8081')], contextPath: '/pipeline', onFailure: false, war: 'webapp/target/*.war' 
                 }
                }
             }
       
        
        //stage('Scan') { 
           // steps {
           //     withSonarQubeEnv('sonarqube'){
          //          sh '/opt/apache-ant-1.10.12/bin/ant sonar -Dsonar.login=squ_6261fda8d05bf88d063eb9417d64386d08d9494e' 
          //      }
         //   }
        //}
       // stage('Test') { 
          //  steps {
         //       echo "Este es el test"
          //  }
        //} 
      } 
    }
