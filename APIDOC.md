# Project: Ticket gestionnaire

# Table des matières

- [Discussions](#-collection-discussions)

- [Tags](#-collection-tags)

- [Tickets](#-collection-tickets)

- [Utilisateurs](#-collection-users)

- [Remplissage préalable des données](#end-point-fill-database-with-data)


# 📁 Collection: discussions 


## End-point: Liste des discussions
### Method: GET
>```
>{{baseUrl}}/discussions
>```
### Headers

|Content-Type|Value|
|---|---|
|Accept|application/json|


### Query Params

|Param|value|
|---|---|
||null|


### Response: 200
```json
[
    {
        "id": 15,
        "content": "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).",
        "author": {
            "name": "Kemi",
            "id": 8
        },
        "ticket": {
            "id": 13,
            "title": "Bonjour je rencontre un très très gros problème",
            "authorId": 7,
            "content": "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."
        },
        "createdAt": "01-05-2023 à 01:53 AM"
    },
    {
        "id": 16,
        "content": "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).",
        "author": {
            "name": "Momo",
            "id": 10
        },
        "ticket": {
            "id": 13,
            "title": "Bonjour je rencontre un très très gros problème",
            "authorId": 7,
            "content": "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."
        },
        "createdAt": "01-05-2023 à 01:53 AM"
    },
    {
        "id": 17,
        "content": "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).",
        "author": {
            "name": "Madi",
            "id": 11
        },
        "ticket": {
            "id": 13,
            "title": "Bonjour je rencontre un très très gros problème",
            "authorId": 7,
            "content": "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."
        },
        "createdAt": "01-05-2023 à 01:53 AM"
    },
    {
        "id": 18,
        "content": "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).",
        "author": {
            "name": "Nanou",
            "id": 12
        },
        "ticket": {
            "id": 14,
            "title": "Why do we use it?",
            "authorId": 9,
            "content": "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."
        },
        "createdAt": "01-05-2023 à 01:53 AM"
    },
    {
        "id": 19,
        "content": "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).",
        "author": {
            "name": "Kemi",
            "id": 8
        },
        "ticket": {
            "id": 14,
            "title": "Why do we use it?",
            "authorId": 9,
            "content": "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."
        },
        "createdAt": "01-05-2023 à 01:53 AM"
    },
    {
        "id": 20,
        "content": "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).",
        "author": {
            "name": "Baké",
            "id": 9
        },
        "ticket": {
            "id": 14,
            "title": "Why do we use it?",
            "authorId": 9,
            "content": "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."
        },
        "createdAt": "01-05-2023 à 01:53 AM"
    },
    {
        "id": 35,
        "content": "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).",
        "author": {
            "name": "Kemi",
            "id": 28
        },
        "ticket": {
            "id": 33,
            "title": "Bonjour je rencontre un très très gros problème",
            "authorId": 27,
            "content": "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."
        },
        "createdAt": "01-05-2023 à 01:53 AM"
    },
    {
        "id": 36,
        "content": "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).",
        "author": {
            "name": "Momo",
            "id": 30
        },
        "ticket": {
            "id": 33,
            "title": "Bonjour je rencontre un très très gros problème",
            "authorId": 27,
            "content": "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."
        },
        "createdAt": "01-05-2023 à 01:53 AM"
    },
    {
        "id": 37,
        "content": "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).",
        "author": {
            "name": "Madi",
            "id": 31
        },
        "ticket": {
            "id": 33,
            "title": "Bonjour je rencontre un très très gros problème",
            "authorId": 27,
            "content": "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."
        },
        "createdAt": "01-05-2023 à 01:53 AM"
    },
    {
        "id": 38,
        "content": "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).",
        "author": {
            "name": "Nanou",
            "id": 32
        },
        "ticket": {
            "id": 34,
            "title": "Why do we use it?",
            "authorId": 29,
            "content": "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."
        },
        "createdAt": "01-05-2023 à 01:53 AM"
    },
    {
        "id": 39,
        "content": "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).",
        "author": {
            "name": "Kemi",
            "id": 28
        },
        "ticket": {
            "id": 34,
            "title": "Why do we use it?",
            "authorId": 29,
            "content": "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."
        },
        "createdAt": "01-05-2023 à 01:53 AM"
    },
    {
        "id": 40,
        "content": "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).",
        "author": {
            "name": "Baké",
            "id": 29
        },
        "ticket": {
            "id": 34,
            "title": "Why do we use it?",
            "authorId": 29,
            "content": "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."
        },
        "createdAt": "01-05-2023 à 01:53 AM"
    },
    {
        "id": 42,
        "content": "Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of \"de Finibus Bonorum et Malorum\" (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance. The first line of Lorem Ipsum, \"Lorem ipsum dolor sit amet..\", comes from a line in section 1.10.32.",
        "author": {
            "name": "Madi",
            "id": 31
        },
        "ticket": {
            "id": 13,
            "title": "Bonjour je rencontre un très très gros problème",
            "authorId": 7,
            "content": "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."
        },
        "createdAt": "01-05-2023 à 01:59 AM"
    },
    {
        "id": 43,
        "content": "\"At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis praesentium voluptatum deleniti atque corrupti quos dolores et quas molestias excepturi sint occaecati cupiditate non provident, similique sunt in culpa qui officia deserunt mollitia animi, id est laborum et dolorum fuga. Et harum quidem rerum facilis est et expedita distinctio. Nam libero tempore, cum soluta nobis est eligendi optio cumque nihil impedit quo minus id quod maxime placeat facere possimus, omnis voluptas assumenda est, omnis dolor repellendus. Temporibus autem quibusdam et aut officiis debitis aut rerum necessitatibus saepe eveniet ut et voluptates repudiandae sint et molestiae non recusandae. Itaque earum rerum hic tenetur a sapiente delectus, ut aut reiciendis voluptatibus maiores alias consequatur aut perferendis doloribus asperiores repellat.\"",
        "author": {
            "name": "Momo",
            "id": 30
        },
        "ticket": {
            "id": 13,
            "title": "Bonjour je rencontre un très très gros problème",
            "authorId": 7,
            "content": "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."
        },
        "createdAt": "01-05-2023 à 02:01 AM"
    },
    {
        "id": 58,
        "content": "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).",
        "author": {
            "name": "Kemi",
            "id": 51
        },
        "ticket": {
            "id": 56,
            "title": "Bonjour je rencontre un très très gros problème",
            "authorId": 50,
            "content": "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."
        },
        "createdAt": "04-05-2023 à 09:41 AM"
    },
    {
        "id": 59,
        "content": "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).",
        "author": {
            "name": "Momo",
            "id": 53
        },
        "ticket": {
            "id": 56,
            "title": "Bonjour je rencontre un très très gros problème",
            "authorId": 50,
            "content": "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."
        },
        "createdAt": "04-05-2023 à 09:41 AM"
    },
    {
        "id": 60,
        "content": "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).",
        "author": {
            "name": "Madi",
            "id": 54
        },
        "ticket": {
            "id": 56,
            "title": "Bonjour je rencontre un très très gros problème",
            "authorId": 50,
            "content": "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."
        },
        "createdAt": "04-05-2023 à 09:41 AM"
    },
    {
        "id": 61,
        "content": "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).",
        "author": {
            "name": "Nanou",
            "id": 55
        },
        "ticket": {
            "id": 57,
            "title": "Why do we use it?",
            "authorId": 52,
            "content": "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."
        },
        "createdAt": "04-05-2023 à 09:41 AM"
    },
    {
        "id": 62,
        "content": "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).",
        "author": {
            "name": "Kemi",
            "id": 51
        },
        "ticket": {
            "id": 57,
            "title": "Why do we use it?",
            "authorId": 52,
            "content": "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."
        },
        "createdAt": "04-05-2023 à 09:41 AM"
    },
    {
        "id": 63,
        "content": "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).",
        "author": {
            "name": "Baké",
            "id": 52
        },
        "ticket": {
            "id": 57,
            "title": "Why do we use it?",
            "authorId": 52,
            "content": "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."
        },
        "createdAt": "04-05-2023 à 09:41 AM"
    }
]
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: Récupérer une discussion via son id
### Method: GET
>```
>{{baseUrl}}/discussions/:id
>```
### Headers

|Content-Type|Value|
|---|---|
|Accept|application/json|


### Query Params

|Param|value|
|---|---|
||null|


### Response: 200
```json
{
    "id": 36,
    "content": "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).",
    "author": {
        "name": "Momo",
        "id": 30
    },
    "ticket": {
        "id": 33,
        "title": "Bonjour je rencontre un très très gros problème",
        "authorId": 27,
        "content": "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."
    },
    "createdAt": "01-05-2023 à 01:53 AM"
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: Créer une nouvelle discussion
### Method: POST
>```
>{{baseUrl}}/discussions
>```
### Headers

|Content-Type|Value|
|---|---|
|Accept|application/json|


### Body (**raw**)

```json
{
    "content": "C'est une blaque ou quoi",
    "authorId": 7,
    "ticketId": 13
}
```

### Query Params

|Param|value|
|---|---|
||null|


### Response: 404
```json
{
    "message": "Ticket ou Auteur  inexistant."
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: Modifier une discussion
### Method: PUT
>```
>{{baseUrl}}/discussions/:id
>```
### Headers

|Content-Type|Value|
|---|---|
|Accept|application/json|


### Body (**raw**)

```json
{
    "content":"essaie ceci pour voir sans blague"
}
```

### Query Params

|Param|value|
|---|---|
||null|


### Response: 200
```json
{
    "id": 38,
    "content": "essaie ceci pour voir sans blague",
    "author": {
        "name": "Nanou",
        "id": 32
    },
    "ticket": {
        "id": 34,
        "title": "Why do we use it?",
        "authorId": 29,
        "content": "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."
    },
    "createdAt": "01-05-2023 à 01:53 AM"
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: Supprimer une discussion
### Method: DELETE
>```
>{{baseUrl}}/discussions/:id
>```
### Headers

|Content-Type|Value|
|---|---|
|Accept|application/json|


### Query Params

|Param|value|
|---|---|
||null|


### Response: 404
```json
{
    "message": "Discussion ayant pour 1 inexistant."
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃
# 📁 Collection: tags 


## End-point: Liste des tags
### Method: GET
>```
>{{baseUrl}}/tags
>```
### Headers

|Content-Type|Value|
|---|---|
|Accept|application/json|


### Query Params

|Param|value|
|---|---|
||null|


### Response: 200
```json
[
    {
        "id": 1,
        "label": "Informatique",
        "nbTicket": 1
    },
    {
        "id": 2,
        "label": "Mecanique",
        "nbTicket": 3
    },
    {
        "id": 3,
        "label": "Developpement",
        "nbTicket": 2
    },
    {
        "id": 4,
        "label": "Chimie",
        "nbTicket": 1
    },
    {
        "id": 5,
        "label": "Bug",
        "nbTicket": 1
    },
    {
        "id": 6,
        "label": "Difficile",
        "nbTicket": 1
    },
    {
        "id": 21,
        "label": "Informatique",
        "nbTicket": 1
    },
    {
        "id": 22,
        "label": "Mecanique",
        "nbTicket": 2
    },
    {
        "id": 23,
        "label": "Developpement",
        "nbTicket": 1
    },
    {
        "id": 24,
        "label": "Chimie",
        "nbTicket": 1
    },
    {
        "id": 25,
        "label": "Bug",
        "nbTicket": 1
    },
    {
        "id": 26,
        "label": "Difficile",
        "nbTicket": 1
    },
    {
        "id": 44,
        "label": "Informatique",
        "nbTicket": 1
    },
    {
        "id": 45,
        "label": "Mecanique",
        "nbTicket": 2
    },
    {
        "id": 46,
        "label": "Developpement",
        "nbTicket": 1
    },
    {
        "id": 47,
        "label": "Chimie",
        "nbTicket": 1
    },
    {
        "id": 48,
        "label": "Bug",
        "nbTicket": 1
    },
    {
        "id": 49,
        "label": "Difficile",
        "nbTicket": 1
    }
]
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: Récupérer un tag via son id
### Method: GET
>```
>{{baseUrl}}/tags/:id
>```
### Headers

|Content-Type|Value|
|---|---|
|Accept|application/json|


### Query Params

|Param|value|
|---|---|
||null|


### Response: 200
```json
{
    "id": 2,
    "label": "Mecanique",
    "tickets": [
        {
            "id": 13,
            "title": "Bonjour je rencontre un très très gros problème",
            "content": "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.",
            "createdAt": "01-05-2023 à 01:53 AM",
            "closedAt": null,
            "author": {
                "name": "Toni",
                "id": 7
            },
            "resolvers": [],
            "tags": [
                {
                    "id": 4,
                    "label": "Chimie"
                },
                {
                    "id": 1,
                    "label": "Informatique"
                },
                {
                    "id": 2,
                    "label": "Mecanique"
                },
                {
                    "id": 5,
                    "label": "Bug"
                }
            ],
            "discussions": []
        },
        {
            "id": 14,
            "title": "Why do we use it?",
            "content": "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.",
            "createdAt": "01-05-2023 à 01:53 AM",
            "closedAt": null,
            "author": {
                "name": "Baké",
                "id": 9
            },
            "resolvers": [],
            "tags": [
                {
                    "id": 3,
                    "label": "Developpement"
                },
                {
                    "id": 2,
                    "label": "Mecanique"
                },
                {
                    "id": 6,
                    "label": "Difficile"
                }
            ],
            "discussions": []
        },
        {
            "id": 41,
            "title": "dzdzd dzd ",
            "content": "mvn compiler:compile mvn compiler:compile mvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compile mvn compiler:compile mvn compiler:compile mvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compile mvn compiler:compile mvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compile",
            "createdAt": "01-05-2023 à 01:55 AM",
            "closedAt": null,
            "author": {
                "name": "Toni",
                "id": 7
            },
            "resolvers": [],
            "tags": [
                {
                    "id": 3,
                    "label": "Developpement"
                },
                {
                    "id": 2,
                    "label": "Mecanique"
                }
            ],
            "discussions": []
        }
    ]
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: Récupérer les tickets liés à un tag via son id
### Method: GET
>```
>{{baseUrl}}/tags/:id/tickets
>```
### Headers

|Content-Type|Value|
|---|---|
|Accept|application/json|


### Query Params

|Param|value|
|---|---|
||null|


### Response: 200
```json
[
    {
        "id": 14,
        "title": "Why do we use it?",
        "content": "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.",
        "createdAt": "01-05-2023 à 01:53 AM",
        "closedAt": null,
        "author": {
            "name": "Baké",
            "id": 9
        },
        "resolvers": [],
        "tags": [
            {
                "id": 2,
                "label": "Mecanique"
            },
            {
                "id": 6,
                "label": "Difficile"
            },
            {
                "id": 3,
                "label": "Developpement"
            }
        ],
        "discussions": []
    },
    {
        "id": 41,
        "title": "dzdzd dzd ",
        "content": "mvn compiler:compile mvn compiler:compile mvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compile mvn compiler:compile mvn compiler:compile mvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compile mvn compiler:compile mvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compile",
        "createdAt": "01-05-2023 à 01:55 AM",
        "closedAt": null,
        "author": {
            "name": "Toni",
            "id": 7
        },
        "resolvers": [],
        "tags": [
            {
                "id": 2,
                "label": "Mecanique"
            },
            {
                "id": 3,
                "label": "Developpement"
            }
        ],
        "discussions": []
    },
    {
        "id": 13,
        "title": "Bonjour je rencontre un très très gros problème",
        "content": "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.",
        "createdAt": "01-05-2023 à 01:53 AM",
        "closedAt": null,
        "author": {
            "name": "Toni",
            "id": 7
        },
        "resolvers": [],
        "tags": [
            {
                "id": 2,
                "label": "Mecanique"
            },
            {
                "id": 5,
                "label": "Bug"
            },
            {
                "id": 1,
                "label": "Informatique"
            },
            {
                "id": 4,
                "label": "Chimie"
            }
        ],
        "discussions": []
    }
]
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: Créer un nouveau tag
### Method: POST
>```
>{{baseUrl}}/tags
>```
### Headers

|Content-Type|Value|
|---|---|
|Accept|application/json|


### Body (**raw**)

```json
{
    "label":"Mécanique"
}
```

### Query Params

|Param|value|
|---|---|
||null|


### Response: 204
```json
null
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: Modifier un tag
### Method: PUT
>```
>{{baseUrl}}/tags/:id
>```
### Headers

|Content-Type|Value|
|---|---|
|Accept|application/json|


### Body (**raw**)

```json
{
    "label":"Informatiques"
}
```

### Query Params

|Param|value|
|---|---|
||null|


### Response: 404
```json
{
    "message": "Tag ayant pour 11 inexistant."
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: Supprimer un tag
### Method: DELETE
>```
>{{baseUrl}}/tags/:id
>```
### Headers

|Content-Type|Value|
|---|---|
|Accept|application/json|


### Query Params

|Param|value|
|---|---|
||null|


### Response: 404
```json
{
    "message": "Tag ayant pour 0 inexistant."
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃
# 📁 Collection: tickets 


## End-point: Récupérer les tags d'un ticket par son id
### Method: GET
>```
>{{baseUrl}}/tickets/:id/tags
>```
### Headers

|Content-Type|Value|
|---|---|
|Accept|application/json|


### Query Params

|Param|value|
|---|---|
||null|


### Response: 404
```json
{
    "message": "Ticket ayant pour id5 inexistant."
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: Supprimer un tag d'un ticket
### Method: DELETE
>```
>{{baseUrl}}/tickets/:idTicket/tags/:idTag
>```
### Headers

|Content-Type|Value|
|---|---|
|Accept|application/json|


### Query Params

|Param|value|
|---|---|
||null|



⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: Ajouter un ou plusieurs tags à un ticket
### Method: POST
>```
>{{baseUrl}}/tickets
>```
### Headers

|Content-Type|Value|
|---|---|
|Accept|application/json|


### Body (**raw**)

```json
{
    "title":"Hello",
    "content":"J'ai un problème. Je vous l'explique ...",
    "authorId":7,
    "tagIds":[2,3]
}
```

### Query Params

|Param|value|
|---|---|
||null|


### Response: 200
```json
null
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: Récupérer les discussions d'un tickets
### Method: GET
>```
>{{baseUrl}}/tickets/:id/tags
>```
### Headers

|Content-Type|Value|
|---|---|
|Accept|application/json|


### Query Params

|Param|value|
|---|---|
||null|


### Response: 200
```json
[
    {
        "createdAt": {
            "nano": 563399000,
            "year": 2023,
            "monthValue": 5,
            "dayOfMonth": 1,
            "hour": 1,
            "minute": 53,
            "second": 44,
            "dayOfWeek": "MONDAY",
            "dayOfYear": 121,
            "month": "MAY",
            "chronology": {
                "calendarType": "iso8601",
                "id": "ISO"
            }
        },
        "author": {
            "id": 11,
            "name": "baba",
            "nbDiscussion": 0,
            "nbAffectedTicket": 0,
            "nbCreatedTicket": 0
        },
        "id": 17,
        "content": "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like)."
    },
    {
        "createdAt": {
            "nano": 765082000,
            "year": 2023,
            "monthValue": 5,
            "dayOfMonth": 1,
            "hour": 1,
            "minute": 59,
            "second": 5,
            "dayOfWeek": "MONDAY",
            "dayOfYear": 121,
            "month": "MAY",
            "chronology": {
                "calendarType": "iso8601",
                "id": "ISO"
            }
        },
        "author": {
            "id": 31,
            "name": "Madi",
            "nbDiscussion": 0,
            "nbAffectedTicket": 0,
            "nbCreatedTicket": 0
        },
        "id": 42,
        "content": "Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of \"de Finibus Bonorum et Malorum\" (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance. The first line of Lorem Ipsum, \"Lorem ipsum dolor sit amet..\", comes from a line in section 1.10.32."
    },
    {
        "createdAt": {
            "nano": 548878000,
            "year": 2023,
            "monthValue": 5,
            "dayOfMonth": 4,
            "hour": 9,
            "minute": 52,
            "second": 18,
            "dayOfWeek": "THURSDAY",
            "dayOfYear": 124,
            "month": "MAY",
            "chronology": {
                "calendarType": "iso8601",
                "id": "ISO"
            }
        },
        "author": {
            "id": 7,
            "name": "Toni",
            "nbDiscussion": 0,
            "nbAffectedTicket": 0,
            "nbCreatedTicket": 0
        },
        "id": 64,
        "content": "C'est une blaque ou quoi"
    },
    {
        "createdAt": {
            "nano": 546385000,
            "year": 2023,
            "monthValue": 5,
            "dayOfMonth": 1,
            "hour": 1,
            "minute": 53,
            "second": 44,
            "dayOfWeek": "MONDAY",
            "dayOfYear": 121,
            "month": "MAY",
            "chronology": {
                "calendarType": "iso8601",
                "id": "ISO"
            }
        },
        "author": {
            "id": 10,
            "name": "Momo",
            "nbDiscussion": 0,
            "nbAffectedTicket": 0,
            "nbCreatedTicket": 0
        },
        "id": 16,
        "content": "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like)."
    },
    {
        "createdAt": {
            "nano": 854361000,
            "year": 2023,
            "monthValue": 5,
            "dayOfMonth": 1,
            "hour": 2,
            "minute": 1,
            "second": 28,
            "dayOfWeek": "MONDAY",
            "dayOfYear": 121,
            "month": "MAY",
            "chronology": {
                "calendarType": "iso8601",
                "id": "ISO"
            }
        },
        "author": {
            "id": 30,
            "name": "Momo",
            "nbDiscussion": 0,
            "nbAffectedTicket": 0,
            "nbCreatedTicket": 0
        },
        "id": 43,
        "content": "\"At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis praesentium voluptatum deleniti atque corrupti quos dolores et quas molestias excepturi sint occaecati cupiditate non provident, similique sunt in culpa qui officia deserunt mollitia animi, id est laborum et dolorum fuga. Et harum quidem rerum facilis est et expedita distinctio. Nam libero tempore, cum soluta nobis est eligendi optio cumque nihil impedit quo minus id quod maxime placeat facere possimus, omnis voluptas assumenda est, omnis dolor repellendus. Temporibus autem quibusdam et aut officiis debitis aut rerum necessitatibus saepe eveniet ut et voluptates repudiandae sint et molestiae non recusandae. Itaque earum rerum hic tenetur a sapiente delectus, ut aut reiciendis voluptatibus maiores alias consequatur aut perferendis doloribus asperiores repellat.\""
    },
    {
        "createdAt": {
            "nano": 526465000,
            "year": 2023,
            "monthValue": 5,
            "dayOfMonth": 1,
            "hour": 1,
            "minute": 53,
            "second": 44,
            "dayOfWeek": "MONDAY",
            "dayOfYear": 121,
            "month": "MAY",
            "chronology": {
                "calendarType": "iso8601",
                "id": "ISO"
            }
        },
        "author": {
            "id": 8,
            "name": "Kemi",
            "nbDiscussion": 0,
            "nbAffectedTicket": 0,
            "nbCreatedTicket": 0
        },
        "id": 15,
        "content": "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like)."
    }
]
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: Récupérer les personnes à qui le ticket a été assigné
### Method: GET
>```
>{{baseUrl}}/tickets/:id/resolvers
>```
### Headers

|Content-Type|Value|
|---|---|
|Accept|application/json|


### Query Params

|Param|value|
|---|---|
||null|



⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: Supprimer un resolver d'un ticket (personne à qui le ticket est assigné)
### Method: DELETE
>```
>{{baseUrl}}/tickets/:idTicket/resolvers/:idUser
>```
### Headers

|Content-Type|Value|
|---|---|
|Accept|application/json|


### Query Params

|Param|value|
|---|---|
||null|



⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: Ajouter un ou plusieurs resolvers à un ticket
### Method: POST
>```
>{{baseUrl}}/tickets/:id/resolvers
>```
### Headers

|Content-Type|Value|
|---|---|
|Accept|application/json|


### Body (**raw**)

```json
{
    "ids":[7,8,13,14]
}
```

### Query Params

|Param|value|
|---|---|
||null|


### Response: 200
```json
null
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: Liste des tickets
### Method: GET
>```
>{{baseUrl}}/tickets
>```
### Headers

|Content-Type|Value|
|---|---|
|Accept|application/json|


### Query Params

|Param|value|
|---|---|
||null|


### Response: 200
```json
[
    {
        "id": 13,
        "title": "Bonjour je rencontre un très très gros problème",
        "content": "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.",
        "createdAt": "01-05-2023 à 01:53 AM",
        "closedAt": null,
        "nbDiscussion": 5,
        "author": {
            "name": "Toni",
            "id": 7
        },
        "resolvers": [],
        "tags": [
            {
                "id": 4,
                "label": "Chimie"
            },
            {
                "id": 5,
                "label": "Bug"
            },
            {
                "id": 2,
                "label": "Mecanique"
            },
            {
                "id": 1,
                "label": "Informatique"
            }
        ]
    },
    {
        "id": 14,
        "title": "Why do we use it?",
        "content": "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.",
        "createdAt": "01-05-2023 à 01:53 AM",
        "closedAt": null,
        "nbDiscussion": 3,
        "author": {
            "name": "Baké",
            "id": 9
        },
        "resolvers": [],
        "tags": [
            {
                "id": 2,
                "label": "Mecanique"
            },
            {
                "id": 3,
                "label": "Developpement"
            },
            {
                "id": 6,
                "label": "Difficile"
            }
        ]
    },
    {
        "id": 33,
        "title": "Bonjour je rencontre un très très gros problème",
        "content": "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.",
        "createdAt": "01-05-2023 à 01:53 AM",
        "closedAt": null,
        "nbDiscussion": 3,
        "author": {
            "name": "Toni",
            "id": 27
        },
        "resolvers": [],
        "tags": [
            {
                "id": 24,
                "label": "Chimie"
            },
            {
                "id": 21,
                "label": "Informatique"
            },
            {
                "id": 22,
                "label": "Mecanique"
            },
            {
                "id": 25,
                "label": "Bug"
            }
        ]
    },
    {
        "id": 34,
        "title": "Why do we use it?",
        "content": "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.",
        "createdAt": "01-05-2023 à 01:53 AM",
        "closedAt": null,
        "nbDiscussion": 3,
        "author": {
            "name": "Baké",
            "id": 29
        },
        "resolvers": [],
        "tags": [
            {
                "id": 23,
                "label": "Developpement"
            },
            {
                "id": 22,
                "label": "Mecanique"
            },
            {
                "id": 26,
                "label": "Difficile"
            }
        ]
    },
    {
        "id": 41,
        "title": "dzdzd dzd ",
        "content": "mvn compiler:compile mvn compiler:compile mvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compile mvn compiler:compile mvn compiler:compile mvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compile mvn compiler:compile mvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compile",
        "createdAt": "01-05-2023 à 01:55 AM",
        "closedAt": null,
        "nbDiscussion": 0,
        "author": {
            "name": "Toni",
            "id": 7
        },
        "resolvers": [],
        "tags": [
            {
                "id": 2,
                "label": "Mecanique"
            },
            {
                "id": 3,
                "label": "Developpement"
            }
        ]
    },
    {
        "id": 56,
        "title": "Bonjour je rencontre un très très gros problème",
        "content": "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.",
        "createdAt": "04-05-2023 à 09:41 AM",
        "closedAt": null,
        "nbDiscussion": 3,
        "author": {
            "name": "Toni",
            "id": 50
        },
        "resolvers": [],
        "tags": [
            {
                "id": 44,
                "label": "Informatique"
            },
            {
                "id": 48,
                "label": "Bug"
            },
            {
                "id": 45,
                "label": "Mecanique"
            },
            {
                "id": 47,
                "label": "Chimie"
            }
        ]
    },
    {
        "id": 57,
        "title": "Why do we use it?",
        "content": "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.",
        "createdAt": "04-05-2023 à 09:41 AM",
        "closedAt": null,
        "nbDiscussion": 3,
        "author": {
            "name": "Baké",
            "id": 52
        },
        "resolvers": [],
        "tags": [
            {
                "id": 46,
                "label": "Developpement"
            },
            {
                "id": 45,
                "label": "Mecanique"
            },
            {
                "id": 49,
                "label": "Difficile"
            }
        ]
    }
]
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: Récupérer les informations d'un ticket
### Method: GET
>```
>{{baseUrl}}/tickets/:id
>```
### Headers

|Content-Type|Value|
|---|---|
|Accept|application/json|


### Query Params

|Param|value|
|---|---|
||null|


### Response: 404
```json
{
    "message": "Ticket ayant pour id 5 inexistant."
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: Créer un nouveau ticket
### Method: POST
>```
>{{baseUrl}}/tickets
>```
### Headers

|Content-Type|Value|
|---|---|
|Accept|application/json|


### Body (**raw**)

```json
{
    "title":"Hello",
    "content":"J'ai un problème. Je vous l'explique ...",
    "authorId":7,
    "tagIds":[2,3]
}
```

### Query Params

|Param|value|
|---|---|
||null|


### Response: 404
```json
{
    "message": "Utilisateur ayant pour id 1 inexistant."
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: Modifier un  ticket
### Method: PUT
>```
>{{baseUrl}}/tickets/:id
>```
### Headers

|Content-Type|Value|
|---|---|
|Accept|application/json|


### Body (**raw**)

```json
{
    "title":"zds",
    "content":"zsd",
    "closedAt":0
}
```

### Query Params

|Param|value|
|---|---|
||null|


### Response: 200
```json
{
    "id": 67,
    "title": "zds",
    "content": "zsd",
    "createdAt": "04-05-2023 à 11:19 AM",
    "closedAt": "04-05-2023 à 11:48 AM",
    "author": {
        "name": "Toni",
        "id": 7
    },
    "resolvers": [],
    "tags": [
        {
            "id": 3,
            "label": "Developpement"
        }
    ],
    "discussions": []
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: Supprimer un ticket
### Method: DELETE
>```
>{{baseUrl}}/tickets/:id
>```
### Headers

|Content-Type|Value|
|---|---|
|Accept|application/json|


### Query Params

|Param|value|
|---|---|
||null|


### Response: 404
```json
{
    "message": "Ticket ayant pour id5 inexistant."
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃
# 📁 Collection: users 


## End-point: Récupérer les tickets affectés à un utilisateur
### Method: GET
>```
>{{baseUrl}}/users/:id/tickets/affected
>```
### Headers

|Content-Type|Value|
|---|---|
|Accept|application/json|


### Query Params

|Param|value|
|---|---|
||null|


### Response: 200
```json
[
    {
        "id": 69,
        "title": "Hello",
        "content": "J'ai un problème. Je vous l'explique ...",
        "createdAt": "04-05-2023 à 12:09 PM",
        "closedAt": null,
        "author": {
            "name": "Toni",
            "id": 7
        },
        "resolvers": [],
        "tags": [],
        "discussions": []
    },
    {
        "id": 68,
        "title": "Hello",
        "content": "J'ai un problème. Je vous l'explique ...",
        "createdAt": "04-05-2023 à 12:08 PM",
        "closedAt": null,
        "author": {
            "name": "Toni",
            "id": 7
        },
        "resolvers": [],
        "tags": [
            {
                "id": 3,
                "label": "Developpement"
            }
        ],
        "discussions": []
    },
    {
        "id": 41,
        "title": "dzdzd dzd ",
        "content": "mvn compiler:compile mvn compiler:compile mvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compile mvn compiler:compile mvn compiler:compile mvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compile mvn compiler:compile mvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compile",
        "createdAt": "01-05-2023 à 01:55 AM",
        "closedAt": null,
        "author": {
            "name": "Toni",
            "id": 7
        },
        "resolvers": [],
        "tags": [
            {
                "id": 3,
                "label": "Developpement"
            }
        ],
        "discussions": []
    },
    {
        "id": 13,
        "title": "Bonjour je rencontre un très très gros problème",
        "content": "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.",
        "createdAt": "01-05-2023 à 01:53 AM",
        "closedAt": null,
        "author": {
            "name": "Toni",
            "id": 7
        },
        "resolvers": [
            {
                "name": "Kemi",
                "id": 8
            }
        ],
        "tags": [
            {
                "id": 1,
                "label": "Informatiques"
            },
            {
                "id": 5,
                "label": "Bug"
            },
            {
                "id": 3,
                "label": "Developpement"
            },
            {
                "id": 4,
                "label": "Chimie"
            }
        ],
        "discussions": []
    }
]
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: Récupérer les tickets crées par un utilisateur
### Method: GET
>```
>{{baseUrl}}/users/:id/tickets/created
>```
### Headers

|Content-Type|Value|
|---|---|
|Accept|application/json|


### Query Params

|Param|value|
|---|---|
||null|


### Response: 200
```json
[
    {
        "id": 68,
        "title": "Hello",
        "content": "J'ai un problème. Je vous l'explique ...",
        "createdAt": "04-05-2023 à 12:08 PM",
        "closedAt": null,
        "author": {
            "name": "Toni",
            "id": 7
        },
        "resolvers": [],
        "tags": [
            {
                "id": 3,
                "label": "Developpement"
            }
        ],
        "discussions": []
    },
    {
        "id": 41,
        "title": "dzdzd dzd ",
        "content": "mvn compiler:compile mvn compiler:compile mvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compile mvn compiler:compile mvn compiler:compile mvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compile mvn compiler:compile mvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compilemvn compiler:compile",
        "createdAt": "01-05-2023 à 01:55 AM",
        "closedAt": null,
        "author": {
            "name": "Toni",
            "id": 7
        },
        "resolvers": [],
        "tags": [
            {
                "id": 3,
                "label": "Developpement"
            }
        ],
        "discussions": []
    },
    {
        "id": 69,
        "title": "Hello",
        "content": "J'ai un problème. Je vous l'explique ...",
        "createdAt": "04-05-2023 à 12:09 PM",
        "closedAt": null,
        "author": {
            "name": "Toni",
            "id": 7
        },
        "resolvers": [],
        "tags": [],
        "discussions": []
    },
    {
        "id": 13,
        "title": "Bonjour je rencontre un très très gros problème",
        "content": "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.",
        "createdAt": "01-05-2023 à 01:53 AM",
        "closedAt": null,
        "author": {
            "name": "Toni",
            "id": 7
        },
        "resolvers": [
            {
                "name": "Kemi",
                "id": 8
            }
        ],
        "tags": [
            {
                "id": 1,
                "label": "Informatiques"
            },
            {
                "id": 4,
                "label": "Chimie"
            },
            {
                "id": 3,
                "label": "Developpement"
            },
            {
                "id": 5,
                "label": "Bug"
            }
        ],
        "discussions": []
    }
]
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: Liste des utilisateurs
### Method: GET
>```
>{{baseUrl}}/users
>```
### Headers

|Content-Type|Value|
|---|---|
|Accept|application/json|


### Query Params

|Param|value|
|---|---|
||null|


### Response: 200
```json
[
    {
        "id": 7,
        "name": "Toni",
        "nbDiscussion": 0,
        "nbAffectedTicket": 0,
        "nbCreatedTicket": 2
    },
    {
        "id": 8,
        "name": "Kemi",
        "nbDiscussion": 2,
        "nbAffectedTicket": 0,
        "nbCreatedTicket": 0
    },
    {
        "id": 9,
        "name": "Baké",
        "nbDiscussion": 1,
        "nbAffectedTicket": 0,
        "nbCreatedTicket": 1
    },
    {
        "id": 10,
        "name": "Momo",
        "nbDiscussion": 1,
        "nbAffectedTicket": 0,
        "nbCreatedTicket": 0
    },
    {
        "id": 11,
        "name": "Madi",
        "nbDiscussion": 1,
        "nbAffectedTicket": 0,
        "nbCreatedTicket": 0
    },
    {
        "id": 12,
        "name": "Nanou",
        "nbDiscussion": 1,
        "nbAffectedTicket": 0,
        "nbCreatedTicket": 0
    },
    {
        "id": 27,
        "name": "Toni",
        "nbDiscussion": 0,
        "nbAffectedTicket": 0,
        "nbCreatedTicket": 1
    },
    {
        "id": 28,
        "name": "Kemi",
        "nbDiscussion": 2,
        "nbAffectedTicket": 0,
        "nbCreatedTicket": 0
    },
    {
        "id": 29,
        "name": "Baké",
        "nbDiscussion": 1,
        "nbAffectedTicket": 0,
        "nbCreatedTicket": 1
    },
    {
        "id": 30,
        "name": "Momo",
        "nbDiscussion": 2,
        "nbAffectedTicket": 0,
        "nbCreatedTicket": 0
    },
    {
        "id": 31,
        "name": "Madi",
        "nbDiscussion": 2,
        "nbAffectedTicket": 0,
        "nbCreatedTicket": 0
    },
    {
        "id": 32,
        "name": "Nanou",
        "nbDiscussion": 1,
        "nbAffectedTicket": 0,
        "nbCreatedTicket": 0
    },
    {
        "id": 50,
        "name": "Toni",
        "nbDiscussion": 0,
        "nbAffectedTicket": 0,
        "nbCreatedTicket": 1
    },
    {
        "id": 51,
        "name": "Kemi",
        "nbDiscussion": 2,
        "nbAffectedTicket": 0,
        "nbCreatedTicket": 0
    },
    {
        "id": 52,
        "name": "Baké",
        "nbDiscussion": 1,
        "nbAffectedTicket": 0,
        "nbCreatedTicket": 1
    },
    {
        "id": 53,
        "name": "Momo",
        "nbDiscussion": 1,
        "nbAffectedTicket": 0,
        "nbCreatedTicket": 0
    },
    {
        "id": 54,
        "name": "Madi",
        "nbDiscussion": 1,
        "nbAffectedTicket": 0,
        "nbCreatedTicket": 0
    },
    {
        "id": 55,
        "name": "Nanou",
        "nbDiscussion": 1,
        "nbAffectedTicket": 0,
        "nbCreatedTicket": 0
    }
]
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: Récupérer un utilisateur via son id
### Method: GET
>```
>{{baseUrl}}/users/:id
>```
### Headers

|Content-Type|Value|
|---|---|
|Accept|application/json|


### Query Params

|Param|value|
|---|---|
||null|


### Response: 404
```json
{
    "message": "Utilisateur ayant pour 13 inexistant."
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: Créer un nouveau utilisateur
### Method: POST
>```
>{{baseUrl}}/users
>```
### Headers

|Content-Type|Value|
|---|---|
|Accept|application/json|


### Body (**raw**)

```json
{
    "name":"Kemi"
}
```

### Query Params

|Param|value|
|---|---|
||null|


### Response: 204
```json
null
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: Modifier un utilisateur
### Method: PUT
>```
>{{baseUrl}}/users/:id
>```
### Headers

|Content-Type|Value|
|---|---|
|Accept|application/json|


### Body (**raw**)

```json
{
    "name":"baba"
}
```

### Query Params

|Param|value|
|---|---|
||null|


### Response: 200
```json
{
    "id": 11,
    "name": "baba",
    "nbDiscussion": 1,
    "nbAffectedTicket": 0,
    "nbCreatedTicket": 0
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: Supprimer un utilisateur
### Method: DELETE
>```
>{{baseUrl}}/users/:id
>```
### Headers

|Content-Type|Value|
|---|---|
|Accept|application/json|


### Query Params

|Param|value|
|---|---|
||null|


### Response: 404
```json
{
    "message": "Utilisateur ayant pour 13 inexistant."
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: fill database with data
### Method: GET
>```
>{{baseUrl}}/fill/database
>```
### Response: 200
```json
null
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃
_________________________________________________
Powered By: [postman-to-markdown](https://github.com/bautistaj/postman-to-markdown/)
