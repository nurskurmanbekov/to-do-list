# API Documentation

This document outlines the RESTful endpoints provided by our service. Each endpoint serves a specific function within the application and is part of the overall API suite that enables client-server communication.

## Servers

- Base URL: `http://localhost:8088`

## User Controller

### POST /users/add

- Description: Adds a new user to the system.
- Request body: Expects a JSON object containing the new user's details.

## List Controller

### POST /to-do-list/update/{taskId}

- Description: Updates an existing task in the to-do list.
- Path variable: `taskId` is the unique identifier for the task to be updated.
- Request body: Expects a JSON object with the updated task details.

### POST /to-do-list/setStatus/{taskId}

- Description: Sets the status of a specified task.
- Path variable: `taskId` is the unique identifier for the task whose status needs updating.
- Request body: Expects a JSON object with the status update.

### POST /to-do-list/add/{userId}

- Description: Adds a new task to the to-do list for a specific user.
- Path variable: `userId` is the unique identifier for the user for whom the task is being added.
- Request body: Expects a JSON object with the task details.

### GET /to-do-list/userTasks/{userId}

- Description: Retrieves all tasks associated with a specified user.
- Path variable: `userId` is the unique identifier for the user whose tasks are being requested.

### DELETE /to-do-list/{taskId}

- Description: Deletes a task from the to-do list.
- Path variable: `taskId` is the unique identifier for the task to be deleted.

## Response and Error Codes

Each endpoint returns standard HTTP status codes to indicate the success or failure of an API request. For example:

- `200 OK`: The request has succeeded.
- `400 Bad Request`: The server could not understand the request due to invalid syntax.
- `401 Unauthorized`: The client must authenticate itself to get the requested response.
- `404 Not Found`: The server can not find the requested resource.
- `500 Internal Server Error`: The server has encountered a situation it doesn't know how to handle.
- Language: Java
- Framework: Spring
- Database: Postgresql
<img width="1453" alt="Screen Shot 2024-03-25 at 14 54 49" src="https://github.com/nurskurmanbekov/to-do-list/assets/107362507/dca5cba6-bdbe-40aa-93d3-0888d1455a65">

