<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <body>
        <form action="/user/insert" name="fm" method="post">
            name:<input type="text" name="name"/>
            workMes:<input type="text" name="workMes"/>
            age:<input type="number" name="age" />
            <br>
            <input type="submit" name="submit" value="提交"/>
        </form>
    </body>
</html>
