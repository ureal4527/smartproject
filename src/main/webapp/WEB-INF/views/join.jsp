
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="ko">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    
    <!-- Bootstrap CSS -->
    
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <link rel="stylesheet" href="/css/login.css">
    <title>회원가입</title>

  </head>

  <body cellpadding="0" cellspacing="0" marginleft="0" margintop="0" width="100%" height="100%" align="center">

	<div class="card align-middle" style="width:20rem; border-radius:20px;">
		<div class="card-title" style="margin-top:30px;">
			<h2 class="card-title text-center" style="color:#113366;">회원가입</h2>
		</div>
		<div class="card-body">
      <form class="form-signin" action="joinok.do">
        <h6 class="form-signin-heading">아이디</h6>
        <label for="inputEmail" class="sr-only"> *영문자, 숫자 조합 8~15자 사용</label>
        <input type="text" id="user_id" name="user_id" class="form-control" placeholder="*영문자, 숫자 조합 8~15자 사용" required autofocus><BR>
        <h6 class="form-signin-heading">패스워드</h6>
        <label for="inputPassword" class="sr-only"> *영문자, 숫자 조합 8~15자 사용</label>
        <input type="password" id="user_pw" name="user_pw" class="form-control" placeholder="*영문자, 숫자 조합 8~15자 사용" required><br>
        <h6 class="form-signin-heading">패스워드 재확인</h6>
       <label for="inputPassword" class="sr-only"> *영문자, 숫자 조합 8~15자 사용</label>
        <input type="password" id="re_user_pw" class="form-control" placeholder="*영문자, 숫자 조합 8~15자 사용" required><br>
        <h6 class="form-signin-heading">이름</h6>
        <label for="inputPassword" class="sr-only">name</label>
        <input type="text" id="user_name" name="user_name" class="form-control" placeholder="Name" required><br>
          <h6 class="form-signin-heading">주소</h6>
        <label class="sr-only">Address</label>
        <input type="text" id="farm_name" name="farm_name" class="form-control" placeholder="Address" required><br>
        <button id="btn-Yes" class="btn btn-lg btn-primary btn-block" type="submit">회원가입</button><br>
        <p>이미 계정이 있으시면 <a class="text-blue" href="/">LOGIN</a> </p>
      </form>
      
		</div>
	</div>

	<div class="modal">
	</div>
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script> 
  </body>
</html>