clone all projects as below
git clone https://github.com/ravigaru/springboot.git
saml project steps are provided below from line 4 to line 12
import saml maven project in to your work space
login to portal.azure.com with your credentials
click on microsoft entra id
click on enterprize applications -> select your respective enterprize application 
go to basic SAML configuration section set entiy id  techie 
set reply url http://localhost:9090/saml/SSO
go to SAML certificates section copy the value in App Federation Metadata Url to metadata-uri: in your application.yml file
run the spring boot application.
http://localhost:9090
you will be prompted to enter login details if not logged in. you will see welcome message once you login



