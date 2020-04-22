<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <head>
  <meta charset="UTF-8" />
  <meta http-equiv="X-UA-Compatible" content="IE=edge" />
  <meta name="viewport" content="width=device-width, initial-scale=1" />

  <title></title>

  <!-- GOOGLE FONTS -->
  <link href="https://fonts.googleapis.com/css?family=Montserrat:400,500|Poppins:400,500,600,700|Roboto:400,500" rel="stylesheet"/>
  <link href="https://cdn.materialdesignicons.com/3.0.39/css/materialdesignicons.min.css" rel="stylesheet" />

  <!-- PLUGINS CSS STYLE -->
  <link href="/assets/plugins/toaster/toastr.min.css" rel="stylesheet" />
  <link href="/assets/plugins/nprogress/nprogress.css" rel="stylesheet" />
  <link href="/assets/plugins/flag-icons/css/flag-icon.min.css" rel="stylesheet"/>
  <link href="/assets/plugins/jvectormap/jquery-jvectormap-2.0.3.css" rel="stylesheet" />
  <link href="/assets/plugins/ladda/ladda.min.css" rel="stylesheet" />
  <link href="/assets/plugins/select2/css/select2.min.css" rel="stylesheet" />
  <link href="/assets/plugins/daterangepicker/daterangepicker.css" rel="stylesheet" />

  <!-- SLEEK CSS -->
  <link id="sleek-css" rel="stylesheet" href="/assets/css/sleek.css" />

  <!-- FAVICON -->
  <link href="/assets/img/favicon.png" rel="shortcut icon" />

</head>

</head>
  <body class="bg-light-gray" id="body">
      <div class="container d-flex flex-column justify-content-between vh-100">
      <div class="row justify-content-center mt-5">
        <div class="col-xl-5 col-lg-6 col-md-10">
          <div class="card">
            <div class="card-header bg-primary">
              <div class="app-brand" style="margin: 20px;">
                <!-- <img src="/assets/img/sg_logo.png" alt="Logo" height="30" width="33"> -->
                 <span class="brand-name">PLC Smart Platform</span>
              </div>
            </div>
            <div class="card-body p-5">

              <form action="loginok.do">
                <div class="row">
                  <div class="form-group col-md-12 mb-4">
                    <input type="text" autocomplete="off"  class="form-control input-lg" id="user_id" name="user_id"  placeholder="아이디를 입력하세요.">
                  </div>
                  <div class="form-group col-md-12 ">
                    <input type="password" class="form-control input-lg" id="user_pw" name="user_pw" placeholder="비밀번호를 입력하세요.">
                  </div>
                  <div class="col-md-12">
                    <div class="d-flex my-2 justify-content-between">
                      <div class="d-inline-block mr-3">
<!--                         <label class="control control-checkbox">Remember me
                          <input type="checkbox" />
                          <div class="control-indicator"></div>
                        </label> -->
                      </div>
                     
                    </div>
                    <button type="submit" class="btn btn-primary btn-block mb-4">LOGIN</button>
                  </div>
                </div>
              </form>
              	<a href="join.do"><button type="button" class="btn btn-primary btn-block mb-4">계정생성</button></a>
            </div>
          </div>
        </div>
      </div>
      <div class="copyright pl-0">
        <p class="text-center">&copy;Copyright 
          <a class="text-primary" href="http://www.skmdct.com/" target="_blank">LoginSeoGwang</a>.
        </p>
      </div>
    </div>
    
    
    
    
    
    
    <script src="/js/jquery-3.4.1.min.js"></script>
	<script src="/js/jquery-ui.js"></script>
	<script src="/js/jquery-ui.min.js"></script>
    
</body>
</html>