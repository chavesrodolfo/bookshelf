# Book App
Angular app to find Books by part of its title or description.

### Demo
[http://books-app-books.a3c1.starter-us-west-1.openshiftapps.com](http://books-app-books.a3c1.starter-us-west-1.openshiftapps.com)

### Steps to setup: 
- Clone the repository, then navigate to the folder
- Run `npm install`
- Run `npm run build` to build the dist files to make it ready to run
- Run `npm run start` to start web server and start gulp watchers on `http://localhost:8080`
- Run `npm run dev` to build the dist files and start web server with gulp watchers on `http://localhost:3000`

### Build docker image

```
docker build -t chavesrodolfo/books-app .
```

### Run container

```
docker run -d -p 80:80 --name books-app chavesrodolfo/books-app
```

The app will be available on `http://localhost`