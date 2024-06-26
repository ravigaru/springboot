1)clone all projects as below
2)git clone https://github.com/ravigaru/springboot.git
3)saml project steps are provided below from line 4 to line 12
4)import saml maven project in to your work space
5)login to portal.azure.com with your credentials
6)click on microsoft entra id
7)click on enterprize applications -> select your respective enterprize application 
8)go to basic SAML configuration section set entiy id  techie 
9)set reply url http://localhost:9090/saml/SSO
10)go to SAML certificates section copy the value in App Federation Metadata Url to metadata-uri: in your application.yml file
11)run the spring boot application.
12)http://localhost:9090
13)you will be prompted to enter login details if not logged in. you will see welcome message once you login



