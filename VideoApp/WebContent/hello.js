		var app = angular.module('app', []);
		app.constant('chunkSize', 50);
		app.controller(
			'VideoCtrl', 
			function($scope, $http, chunkSize) {
			$scope.videos = [];
			$http.get('http://localhost:8080/FetchDataRestAPI/data/jsonservice/1').
			success(function(data) {
				for (var i = 0; i < 6; i++) {
				$scope.videos.push(data[i]);
				}
			});
			
			$scope.sortField = 'title';
			$scope.reverse = true;
			var pageNum = 1;
	    	$scope.loadMoreRecords = function() {
	    	pageNum = pageNum + 1;
	    	$http.get('http://localhost:8080/FetchDataRestAPI/data/jsonservice/' + pageNum).
			success(function(data) {
				if (pageNum <= 4 && pageNum >=1 ) {
					for (var i = 0; i < 6; i++) {
						$scope.videos.push(data[i]);
					}
				}
	        });
	    };
	});

	app.directive('whenScrollEnds', function() {
	    return {
	        restrict: "A",
	        link: function(scope, element, attrs) {
	            var visibleHeight = element.height();
	            var threshold = 100;
	            console.log("9======9" + element.prop('scrollHeight'));
	            
	            console.log("=======" + visibleHeight);
	            element.scroll(function() {
	            console.log("-33333333333-----");
	            
	            
	                var scrollableHeight = element.prop('scrollHeight');
	                var hiddenContentHeight = scrollableHeight - visibleHeight;
	                if (hiddenContentHeight - element.scrollTop() <= threshold) {
	                    // Scroll is almost at the bottom. Loading more rows
	                    scope.$apply(attrs.whenScrollEnds);
	                    console.log("------------------");
	                }
	            });
	        }
	    };
	});

