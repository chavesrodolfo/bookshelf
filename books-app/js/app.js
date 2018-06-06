var BASE_URL = 'http://books-api-books.a3c1.starter-us-west-1.openshiftapps.com';

var booksApp = angular.module('booksApp', [
  "ngRoute",
  "dashboard"
]);

booksApp.config(['$locationProvider', '$routeProvider',
  function config($locationProvider, $routeProvider) {
    $locationProvider.hashPrefix('!');

    if (window.location.href.includes('localhost')) {
      BASE_URL = 'http://localhost:8080';
    }

    $routeProvider.
      when('/dashboard', {
        template: '<dashboard></dashboard>'
      }).
      otherwise('/dashboard');
  }
]);
