library identifier: 'mylibraryname@master', 
    //'master' refers to a valid git-ref
    //'mylibraryname' can be any name
    retriever: modernSCM([
      $class: 'GitSCMSource',
      //credentialsId: 'your-credentials-id',
      remote: 'https://github.com/Anurag-30/jenkins.git'
    ])



demo {
    service = 'master'
    scmUrl = 'ssh://git@myScmServer.com/repos/myRepo.git'
    email = 'team@example.com'
    serverPort = '8080'
    developmentServer = 'dev-myproject.mycompany.com'
    stagingServer = 'staging-myproject.mycompany.com'
    productionServer = 'production-myproject.mycompany.com'
}