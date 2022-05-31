<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>


    <script type="text/javascript">
        function add(){
            var formm = new FormData();
            formm.append("fecha","1950-01-01");

            var resP=document.getElementById("resultado");

            fetch("/",{
                method: "POST",
                body: formm,
                headers: {
                    "Content-Type": "application/x-www-form-urlencoded"
                }
            }).then(
                    function(response){
                        return response.json();
                    }
                ).then(
                    function (data){
                        array_sus = data;
                        console.log(array_sus);
                        let texto=data.Dias+" dias vividos";
                        resP.innerHTML=texto;
                    }
            );
        }
</script>



</head>
<body>
    <form action="#" method="post">
        <input type='date' id='fecha' name='fecha' value='${dia}' min='1950-01-01' max='2021-12-31'>
        <input type="submit" value="verificar">
    </form>
    <button onclick="add()">verificarFetch</button>
    <p id="resultado">${dias} dias vividos</p>

    <p id="">${selectRest}</p>
</body>
</html>