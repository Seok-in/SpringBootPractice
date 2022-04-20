$(document).ready(function(){
	$("#loginBtn").click(function(){		
	});
	
	
	$("#memberInsertBtn").click(function(){
		const id = $("#id").val();
		const pw = $("#pw").val();
		const name = $("#name").val();
		
		$.post('memberInsert', {id, pw, name}, function(data){
			if(data == "ok"){
				alert("회원가입 완료!");
				location.href="/";
			}
				
			else{
				alert("회원가입 실패..");
			}
		});
	});
	
});