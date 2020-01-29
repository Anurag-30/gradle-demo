library identifier: 'mylibraryname@master', 
    //'master' refers to a valid git-ref
    //'mylibraryname' can be any name
    retriever: modernSCM([
      $class: 'GitSCMSource',
      //credentialsId: 'your-credentials-id',
      remote: 'https://github.com/Anurag-30/jenkins.git'
    ])
withEnv(['VAR1=VALUE ONE',
             "VAR2=${someGroovyVar}"
            ]) {
demo({SERVICE_NAME="test"})

