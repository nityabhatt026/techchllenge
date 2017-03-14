Created By : Nitya Bhatt 
Product's Name : TechPro
 
--This Project is all about Integrating API's  with web13 which works on freemysqlhosting and ngrok.

--There are 2 servlets i.e. CancelSubscriptionRead and CreateSubscriptionRead in TechChallenge.Controller

--Then there is a service package i.e TechChallenge.Service, contains 2 classes : 

               CreateSubscription
               CancelSubscription
               
          Also, contains 2 interfaces:
               CancelSubscriptionInterface
               CreateSubscriptionInterface
               
--Domain Package: which contains getter setter of table contents 
              
              Classes:
               
               Company_Domain
               Creator_Domain
               Marketplace_Domain
               
              Interfaces:
              
               Company_Domain_Interface
               Creator_Domain_Interface
               Marketplace_Domain_Interface
               
--Beans Package: which contains parent class to map the JSON 

               Classes:
                
                Account
                Company
                Configuration
                Creator
                Items
                Marketplace
                Order
                ParentBeans
                Payload
                
 --TechChallenge.DAO: which contains classes helps in saving values to Database
 
               Classes:
               
                CancelSubscriptionDAO
                CreateSubscriptionDAO
             
               Interfaces:
               
                CancelDAOInterface
                CreateDAOInterface
                
 -- There is a util package which contains DBConnectionManager. 
 
 --In Database , there are 3 tables i.e. 
                
                Marketplace
                Creator
                Company          
                
                
