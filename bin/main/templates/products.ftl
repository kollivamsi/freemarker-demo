<#import "/spring.ftl" as spring/>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Task List</title>
    <link href="/css/main.css" rel="stylesheet">
</head>
<body>
	<#list products as product>
		<li>
			<h4>${product.name}</h4>
			<p>${product.description}</p>
			<strong>${product.price?string.currency}</strong>
		</li>
	</#list>
</body>
</html>