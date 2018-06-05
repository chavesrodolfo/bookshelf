angular.module('bookService', [])
.service('books', ['$http', function ($http) {
    
	this.sorted_programs = [];

    /*
     * Get list of all books
     * @return Promise object  
     */
    this.getBooks = function(q){ 

    	return $http.post(BASE_URL + '/books?q=' + q).then(function(res){
    		return res.data;
    	});
    }

}]);