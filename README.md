# Bookshelf
Locate a book by part of its title or description

> Published in the Cloud Red Hat OpenShift
* [Demo](http://books-app-books.a3c1.starter-us-west-1.openshiftapps.com)
* [Docs](https://chavesrodolfo.github.io/bookshelf/index.html)

## Stack

### Bookshelf RESTful API

- Java 8
- Dropwizard
- JOOQ
- H2 database
- Swagger
- Docker

### Bookshelf Single-Page Application (SPA)

- AngularJS 1.6
- Gulp
- Bootstrap
- Docker

### Sample Data Model

```
{
    "bookshelf": [
        {
            "isbn": "978-1617291999",
            "title": "Java 8 in Action",
            "subtitle": "Lambdas, Streams, and functional-style programming",
            "authors": [
                "Raoul-Gabriel Urma",
                "Mario Fusco",
                "Alan Mycroft"
            ],
            "published": "2014-08-28T00:00:00.000Z",
            "publisher": "Manning Publications",
            "pages": 424,
            "description": "Java 8 in Action is a clearly written guide to the new features of Java 8. The book covers lambdas, streams, and functional-style programming. With Java 8's functional features you can now write more concise code in less time, and also automatically benefit from multicore architectures. It's time to dig in!",
            "instock": true
        },
        {
            "isbn": "978-0134494166",
            "title": "Clean Architecture",
            "subtitle": "A Craftsman's Guide to Software Structure and Design",
            "authors": [ 
                "Robert C. Martin"
            ],
            "published": "2017-09-20T00:00:00.000Z",
            "publisher": "Prentice Hall;",
            "pages": 432,
            "description": "By applying universal rules of software architecture, you can dramatically improve developer productivity throughout the life of any software system. Now, building upon the success of his best-selling books Clean Code and The Clean Coder, legendary software craftsman Robert C. Martin (\"Uncle Bob\") reveals those rules and helps you apply them.",
            "instock": true
        },
        {
            "isbn": "978-1617292231",
            "title": "Grokking Algorithms",
            "subtitle": "An illustrated guide for programmers and other curious people",
            "authors": [
                "Aditya Bhargava"
            ],
            "published": "2016-05-01T00:00:00.000Z",
            "publisher": "Manning Publications",
            "pages": 256,
            "description": "Grokking Algorithms is a fully illustrated, friendly guide that teaches you how to apply common algorithms to the practical problems you face every day as a programmer. You'll start with sorting and searching and, as you build up your skills in thinking algorithmically, you'll tackle more complex concerns such as data compression and artificial intelligence. Each carefully presented example includes helpful diagrams and fully annotated code samples in Python.",
            "instock": true
        }
    ]
}
```
