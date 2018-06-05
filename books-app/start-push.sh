rm -rf dist
npm run build
docker rm books-app -f
docker build -t chavesrodolfo/books-app .
docker run -d -p 80:80 -p 8080:8080 --name books-app chavesrodolfo/books-app
docker push chavesrodolfo/books-app