<%@page import="Hepsi.RanUtilities"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<HTML>
<HEAD>
<TITLE>Random Numbers</TITLE>
<LINK REL=STYLESHEET
HREF="JSP-Styles.css"
TYPE="text/css">
</HEAD>
<BODY>
<H1>Random Numbers</H1>
<UL>
<LI><%= Hepsi.RanUtilities.randomInt(10) %>
<LI><%= Hepsi.RanUtilities.randomInt(10) %>
<LI><%= Hepsi.RanUtilities.randomInt(10) %>
<LI><%= Hepsi.RanUtilities.randomInt(10) %>
<LI><%= Hepsi.RanUtilities.randomInt(10) %>
</UL>
</BODY></HTML>