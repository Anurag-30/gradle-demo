library identifier: 'mylibraryname@master', 
    //'master' refers to a valid git-ref
    //'mylibraryname' can be any name
    retriever: modernSCM([
      $class: 'GitSCMSource',
      credentialsId: 'your-credentials-id',
      remote: 'https://github.com/monodot/private-jenkins-library.git'
    ])
buildpipeline()