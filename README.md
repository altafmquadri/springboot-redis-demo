# Redis Demo
To run this demo on Windows machine go to this link https://github.com/microsoftarchive/redis/releases/tag/win-3.2.100
and download the zip file.

Double click on `redis-server.exe` file which will open the server on port 6379.

Next clone the repo and run the SpringBootRedisDemoApplicationin your Eclipse IDE.

You can use POSTMAN or the Advanced REST Client for Google Chrome.  The following endpoints are available(use JSON format):

1. http://localhost:8080/users  (Add User)
* POST
*  {
        "id": 1,
        "firstName": "First",
        "lastName": "Last",
        "email": "eamil@gmail.com"
    }

2. http://localhost:8080/users (Retrieve Users)
* GET

3.  http://localhost:8080/users/1 (Retrieve User by ID)
* GET

4. http://localhost:8080/users/1 (Edit User)
* PUT
*  {
        "id": 1,
        "firstName": "first",
        "lastName": "last",
        "email": "eamil@gmail.com"
    }

5. http://localhost:8080/users/1 (Delete User)
* Delete

Code is modified by this YouTube tutorial
https://www.youtube.com/watch?v=PpkPTviLTLs
