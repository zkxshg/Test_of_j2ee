package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Hero;
import dao.HeroDAO;

public class HeroEditServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int id = Integer.parseInt(request.getParameter("id"));

		Hero hero = new HeroDAO().get(id);

		StringBuffer format = new StringBuffer();
		response.setContentType("text/html; charset=UTF-8");

		format.append("<!DOCTYPE html>");

		format.append("<form action='updateHero' method='post'>");
		format.append("���� �� <input type='text' name='name' value='%s' > <br>");
		format.append("Ѫ�� �� <input type='text' name='hp'  value='%f' > <br>");
		format.append("�˺��� <input type='text' name='damage'  value='%d' > <br>");
		format.append("<input type='hidden' name='id' value='%d'>");
		format.append("<input type='submit' value='����'>");
		format.append("</form>");

		String html = String.format(format.toString(), hero.getName(), hero.getHp(), hero.getDamage(), hero.getId());

		response.getWriter().write(html);

	}
}
