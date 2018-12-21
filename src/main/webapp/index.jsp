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
				<textarea class="form-control" id="word1" rows="3" placeholder="signal text"></textarea>

			</div>
			<div class="col">
				<textarea class="form-control" id="word2" rows="3"></textarea>
			</div>

		</div>
		<div class="d-flex flex-row-reverse bd-highlight">

			<button type="button" class="btn btn-danger  float-right mt-4"
				id="similarty">Submit</button>
		</div>
		<div class="row mt-5">
			
			
			<table class="table table-bordered ">
  <thead>
    <tr>
      <th scope="col" class="text-center">Word</th>
<!--       <th scope="col" class="text-center">Synonyms</th>
 -->       <th scope="col" class="text-center">ConversationBlock</th>
      <th scope="col" class="text-center">Status</th>
      <th scope="col" class="text-center">Value</th>
    </tr>
  </thead>
  <tbody id="tablebody">
   
  </tbody>
</table>
			<!-- <div class="col-6">
				<div id="synonym" class="text-center"></div>
			</div>
			<div class="col-6">
				<div id="output" class="text-center"></div>
			</div> -->
		</div>
	</div>




</body>
<script>
var word;
var conversationBlock;
	$(document).ready(
			function() {

				$("#similarty").on(
						"click",
						function() {
							word = $('#word1').val();
							conversationBlock = $('#word2').val();
							console.log("word1 " + word + "   word2" + conversationBlock);
							$.get("wordsimilarity?signal=" + word
									+ "&conversationblock=" + conversationBlock, function(
									data) {
								// alert("data "+data);
								
								$('#tablebody').append('<tr> <th  class="text-center" scope="row">'+word+'</th><td  class="text-center">'+conversationBlock+'</td> <td  class="text-center">'+data.status+'</td> <td  class="text-center">'+data.value+'</td> </tr>');
							

							});
						});

			});
</script>

</html>