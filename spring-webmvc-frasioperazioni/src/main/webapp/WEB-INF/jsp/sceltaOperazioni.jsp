<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form  action="sceltaAzioneOperazione" method="post">

    Scegli Operazione:
    <select name='sceltaOperazione'>
        <option value='trovaVocali'>trovaVocali</option>
        <option value='trovaConsonanti'>trovaConsonanti</option>
        <option value='trovaNumeroFrasi'>trovaNumeroFrasi</option>      
    </select>
     
    <input type='submit' value='Invio'>
    <input type="hidden" name="testo" value = "${testo}" />
  

</form>
</body>
</html>