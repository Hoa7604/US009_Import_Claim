
 $(document).ready(function(){
	    	$('#search').click(function () {
	    	    $.ajax({
	    	    	type: 'GET',
	    	    	//contentType : "application/json; charset=utf-8",
					headers: {
						Accept : "application/json; charset=utf-8", 
						"Content-Type" : "application/json; charset=utf-8"
					},

	    	    	url: 'http://localhost:8080/import_claim/handleAjax/importclaim1',
	    	    	success: function(data) {
						var result = "";
						for (var i = 0; i < data.length; i++) {
							result += "</br>"+"<p>"+data[i].claim_no+' - '+ data[i].policy_no+"</p>";
						} 
						$('#tit-cnt1').html(result);
					},
					
					error : function(e) {
						alert("Error");
					}
	    	    });
	    	});
			
			$('#search2').click(function () {
	    	    $.ajax({
	    	    	type: 'GET',
	    	    	contentType : "application/json; charset=utf-8",
	    	    	url: '/import_claim/handleAjax/importclaim2',
	    	    	success: function(data) {
						var result = "";
						for (var i = 0; i < data.length; i++) {
							result += "</br>"+"<p>"+data[i].claim_no+' - '+ data[i].policy_no+"</p>";
						} 
						$('#tit-cnt1').html(data);
					},
					error : function(e) {
						alert("Error");
					}
	    	    });
	    	});
			
			$( "#claimimport" ).submit(function( event ) {
			  event.preventDefault();
			});
	    });