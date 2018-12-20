<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Talentify</title>


<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
</head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">



<body>


	<div class="container">


		<div class="head">
			<div>
				<h1 style="color: rgb(98, 96, 96); font-weight: normal;">Word
					Similarity</h1>
			</div>
		</div>

		<div class="row">
			<div class="col">
				<textarea class="form-control" id="word1" rows="3"></textarea>

			</div>
			<div class="col">
				<textarea class="form-control" id="word2" rows="3"></textarea>
			</div>

		</div>
		<div class="d-flex flex-row-reverse bd-highlight">

			<button type="button" class="btn btn-danger  float-right mt-4"
				id="similarty">Submit</button>
		</div>
		<div id="output" class="text-center">
			 
			 	
		</div>

	</div>




</body>
<script>
	$(document).ready(function() {
	
		$( "#similarty" ).on( "click", function() {
			var word1 = $('#word1').val();
			var word2 = $('#word2').val();
			  console.log("word1 "+word1 +"   word2"+word2);
			  $.get("wordsimilarity?signal=" +word1+"&conversationblock="+word2,
                  function(data) {
                	 // alert("data "+data);
                	  $('#output').text(data);
                	  
                  });
			});

	});
</script>

</html>