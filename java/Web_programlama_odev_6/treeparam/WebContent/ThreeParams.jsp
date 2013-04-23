<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//utf-8">
<HTML>
<HEAD>
<TITLE>Bilgi ler</TITLE>
<LINK REL=STYLESHEET
HREF="JSP-Styles.css"
TYPE="text/css">
</HEAD>
<BODY>
<H1>Bilgiler</H1>
<UL>
<LI><B>ADi</B>: <%= request.getParameter("adi")  %>
<LI><B>SOYADi</B>:<%= request.getParameter("soyadi")  %>
<LI><B>TC</B>: <%= request.getParameter("tc")  %>
<LI><B>iL</B>: <%= request.getParameter("İL") %>
<LI><B>ilCE</B>: <%= request.getParameter("ilCE")  %>
<LI><B>TEL</B>: <%= request.getParameter("Tel")  %>
<LI><B>Email</B>: <%= request.getParameter("Email") %>
</UL>
</BODY> </HTML>