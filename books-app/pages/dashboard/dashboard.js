angular.module('dashboard', ['bookService'])
	.component('dashboard', {
		templateUrl: "pages/dashboard/dashboard.html",
		controller: ['$scope', 'books', '$log', function ($scope, books, $log) {

			var self = this;
			$scope.message = 'Locate a book by part of its title or description.';
			$scope.q = '';
			
			$scope.search = function (){
				$scope.books = '';
				$scope.isLoading = true;
				books.getBooks($scope.q).then(function success(response) {
					$scope.isLoading = false;
					$scope.books = response.bookShelf;
					console.log($scope.books);
				}, function error(response) {
					console.log('Problem on request /books', response);
					$scope.isLoading = false;
					$scope.message = 'Sorry! Application is not available :(';
				});

			};
			
			$scope.search();
		}]
	}); 
