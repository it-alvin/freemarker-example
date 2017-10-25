<#assign base=request.contextPath />
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>helloworld</title>
    <base id="base" href="${base}">
    <link rel="stylesheet" type="text/css" href="${base}/static/css/css.css">
    <script type="text/javascript" src="${base}/static/scripts/a.js"></script>
</head>

<body>
<ul>
<#list userList as user>
    <li><h3>用户基本信息</h3></li>
    <li>真实姓名：${user.realname}</li>
    <li>昵称：${user.nickname?cap_first}</li>
    <li>性别：
        <#if user.gender == 1>男
        <#else>女
        </#if>
    </li>
    <li>性别：${user.sex!''}</li>
</#list>
</ul>

<ul>
    <li><h3>水果种类：</h3></li>
    <li>
    <#list fruitList as fruit>
    ${fruit}<#sep>,<#else>暂无水果
    </#list>
    </li>
    <li>${fruitList?join(" | ", "None")}</li>
</ul>

<#list fruitList>
<p>Fruits:
<ul>
    <#items as fruit>
        <li>${fruit}<#sep> and</#sep></li>
    </#items>
</ul>
<#else>
<p>We have no fruits.
</#list>

<#-- 此处可以用宏实现 -->
<#include "../html/copyright_footer.html">
</body>
</html>