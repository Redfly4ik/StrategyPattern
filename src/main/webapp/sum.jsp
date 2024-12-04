<jsp:useBean id="result" scope="request" type="com.example.pattern2.model.Result"/>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sum page</title>
    <link rel="stylesheet" type="text/css" href="style.css">

</head>
<body>
<p>Sum of elements bigger then: ${result.sumOfElementsBiggerThanE}</p>
<p>Common sum: ${result.sum}</p>
<p>Difference: ${result.difference}</p>
</body>
</html>
