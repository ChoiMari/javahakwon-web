<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true" 
    %>
    
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
 <meta name="viewport" content="width=device-width, initial-scale=1"><!--initial-scale=1는 브라우저 기본 비율 이용 -->
<title>Insert title here</title>
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" 
 rel="stylesheet" 
 integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" 
 crossorigin="anonymous">
 
 <!-- integrity 보안 -->
 
</head>

<body>
    <div class="container-fluid">
        <main>
            <div class="card mt-2">
                <div class="card-header">
                    <h2>로그인</h2>
                </div>
                <div class="card-body">
                    <c:url var="signInPage" value="/user/signin" />
                    <form method="post" action="${signInPage}"><!--method="post" 요청방식 설정.아이디비밀번호 노출 안되게하려고 action="" 요청주소  -->
                        <div class="mt-2">
                            <input type="text" name="userid" placeholder="아이디" 
                                class="form-control" required autofocus /> <!-- name속성있어야 리퀘스트파라미터 전달이 됨 -->
                        </div>
                        <div class="mt-2">
                            <input type="password" name="password" placeholder="비밀번호" 
                                class="form-control" required autofocus /> <!-- name속성(리퀘스트파라미터이름)있어야 전달이 됨 -->
                        </div>
                        <div class="mt-2">
                            <input class="form-control btn btn-outline-success" 
                                type="submit" value="로그인" />
                            <!-- class="form-control"은 브라우저의 가로화면 다 차지하게 -->
                        </div>
                    </form>
                </div>
            </div>
        </main>
    </div>
    
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" 
    integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" 
    crossorigin="anonymous">
    </script>
</body>
</html>