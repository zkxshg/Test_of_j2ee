<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*,bean.*,java.sql.*"%>
 
<form action='updateHero' method='post'>
    ���� �� <input type='text' name='name' value='${hero.name}'> <br>
    Ѫ�� ��<input type='text' name='hp' value='${hero.hp}'> <br>
    �˺��� <input type='text' name='damage' value='${hero.damage}'> <br>
    <input type='hidden' name='id' value='${hero.id}'>
    <input type='submit' value='����'>
</form>