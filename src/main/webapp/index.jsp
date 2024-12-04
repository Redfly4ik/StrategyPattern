<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <link rel="stylesheet" type="text/css" href="style.css">

</head>
<body>
<div class="main">
    <div class="container">
        <form action="calculate" method="post">
            <label for="x">Start:</label>
            <input type="number" id="x" name="x" required step="0.1" value="0.5"><br>
            <label for="n">End:</label>
            <input type="number" id="n" name="n" required step="0.1" value="5"><br>
            <label for="e">Step:</label>
            <input type="number" id="e" name="e" required step="0.001" value="0.01"><br>

            <button type="submit" class="button">Calculate</button>
        </form>
    </div>

    <div class="container">
        <form action="tabulate" method="post">
            <label for="x">Start:</label>
            <label for="a"></label><input type="number" id="a" name="a" required step="0.1" value="0.5"><br>
            <label for="n">End:</label>
            <label for="b"></label><input type="number" id="b" name="b" required step="0.1" value="5"><br>
            <label for="e">Step:</label>
            <label for="h"></label><input type="number" id="h" name="h" required step="0.001" value="0.01"><br>

            <button type="submit" class="button">Calculate</button>
        </form>
    </div>
</div>
</body>
</html>