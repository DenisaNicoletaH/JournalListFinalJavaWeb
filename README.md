## Journal List.

**Frontend**:
https://github.com/DenisaNicoletaH/Journal-List_Frontend_JavaWebProject/tree/master

Explanation:

The BackEnd on my application consists of FriendController(GET,DELETE,PUT) MessageController(GET,POST,DELETE) who contain the function for the HTTP requests. In addition to that, there is an entity package that contains Friend, Image and Message. It contains the Table name, the Columns name 
and the Relationships for the SQL data file. In Messages,there is a Many to One relationship and a One to One relationship. In the BackEnd there is also a a repository package containning FriendRepository, ImageRepository and MessageRepository that helps to find the HTTP request by a specific class/data type.
In this case it is findbyId().There is also FriendRequest, ImageRequest and MessageRequest that helps specify that a specific class/object is allowed or not allowed to be null/blank.
Afterwards,there is the response package that has FriendResponse,ImageResponse and MessageResponse that gives you back the HTTP response.
Finally there is a service package that contains FriendService and MessageService in which it will tell if the specific thing that you wish to search/do(GET,PUT,POST,DELETE) is available or the Ressource is not found. There is also the SQL data file if needded but for
my project it was not useful.

Response Example for:
[GET] localhost:8080/api/friends

```
[
    {
        "id": 1,
        "userName": "Denisa",
        "favourite": false
    },
    {
        "id": 2,
        "userName": "Tawfiq",
        "favourite": true
    },
    {
        "id": 3,
        "userName": "Popcorn",
        "favourite": true
    }
]
POST

[
    {
        "id": 1,
        "description": "hello",
        "image": null,
        "friend": null
    }
]

```

![image](https://user-images.githubusercontent.com/91993350/209454354-5b7e53b9-c290-4d4c-a7bc-f4e757f1dd35.png)


**FEATURES**:

The features of this app is that the user is able to POST messages that can include their friends name.Also the user has the
possibility to DELETE the messages in the form as well as a friend. In addtion to that, the PUT request is for the favourte friends
by clicking on their names.For GET we are able to get the messages that were inputed to the form.


**ENTITY RELATIONSHIP DIAGRAM**:
Between the Image and the Messages there is a OnetoOne relationship. There is also a ManyToOne relationship between Friend_id and Message

![image](https://user-images.githubusercontent.com/91993350/209455472-726d4878-92af-4a08-8939-98fa255d6ffd.png)
