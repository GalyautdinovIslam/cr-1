<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>All products</title>
</head>
<body>
<h1>All products:</h1>
<table border="2">
    <tbody>
    <tr>
        <th>Id</th>
        <th>Title</th>
        <th>Amount</th>
        <th>Price</th>
    </tr>
    <#list products as product>
        <tr>
            <td>${product.id}</td>
            <td>${product.title}</td>
            <td>${product.amount}</td>
            <td>${product.price}</td>
        </tr>
    </#list>
    </tbody>
</table>
</body>
</html>
