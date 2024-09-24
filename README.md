localDataUse branch 
use in memory database user details in config file 

main branch
use mysql database for user details store 


curently register interface not working therfor use below curl request for register uses
curl --location 'localhost:8080/register/user' \
--header 'Content-Type: application/json' \
--header 'Cookie: JSESSIONID=A5E510CEE4F75E14EBAB11BC23919010' \
--data '{
    "username":"nuwan",
    "password":"5678",
    "role":"ADMIN"
}'
