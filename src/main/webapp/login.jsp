<%@page contentType="text/html; charset = EUC-KR" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transirional//EN"
                        "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset = EUC - KR">
    <title>로그인</title>
</head>
<body>
    <h1>로그인</h1>
    <hr>
    <form action="login_proc.jsp" method="post">
        <table border="1" cellpadding="0" cellspacing="0">
        <tr>
            <td bgcolor="orange">아이디</td>
            <td><input type="text" name="id"/> </td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <input type="password" name="password"/>
            </td>
        </tr>
        </table>
    <hr>
    </form>
</body>
</html>