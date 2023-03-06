<html>
<head>
    <link href="/webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
    <script src="/webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
    <script src="/webjars/jquery/3.6.0/jquery.min.js"></script>
</head>
<body>
<div class="container">
    Login Page ${name}

    <p>${errorMessage}</p>

    <form method="post">
        Name : <input type="text" name="name">
        Password : <input type="password" name="password">
        <input type="submit">
    </form>
</div>
</body>
</html>