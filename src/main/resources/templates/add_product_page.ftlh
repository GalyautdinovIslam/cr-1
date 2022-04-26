<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Add product</title>
</head>
<body>
<div class="add">
    <h1>Add product:</h1>
    <form action="/products/add" method="post">
        <label for="title">
            Title:
        </label>
        <input type="text" id="title" name="title" placeholder="Title of product"/>
        <br><br>
        <label for="amount">
            Amount:
        </label>
        <input type="text" id="amount" name="amount" placeholder="Amount of product"/>
        <br><br>
        <label for="price">
            Price:
        </label>
        <input type="text" id="price" name="price" placeholder="Price of product"/>
        <br><br>
        <input type="submit" value="Add"/>
    </form>
</div>
<div class="added"></div>
</body>
</html>
