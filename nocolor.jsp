
<html>
<head>

<title></title>
</head>
<body>
<%
Integer ar[]=(Integer[])request.getAttribute("ar");

%>
<h1 style="color: red">
<%
out.println(ar[0]);
%>
</h1>
<h1 style="color: green">
<%
out.println(ar[1]);
%>
</h1>
</body>
</html>