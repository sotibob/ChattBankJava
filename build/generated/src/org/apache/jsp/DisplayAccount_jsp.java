package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Business.Account;

public final class DisplayAccount_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <style>\n");
      out.write("            h1  {text-align: center;\n");
      out.write("                margin-top: 0px;}\n");
      out.write("            body {background-color: #eaeaea;}\n");
      out.write("            .center { text-decoration: none;\n");
      out.write("\t\tdisplay: block;\n");
      out.write("                text-align: center;\n");
      out.write("                background-color: #FFFFFF;\n");
      out.write("                padding: 20px;\n");
      out.write("                margin-left: 450px;\n");
      out.write("                margin-right: 450px;\n");
      out.write("                margin-top: 20px;}\n");
      out.write("            a:link { color: #0000FF;}\n");
      out.write("            a:visited{color: #800080;}\n");
      out.write("            a:hover {color: #000000;}\n");
      out.write("            table {margin-left: 80px;}\n");
      out.write("        </style>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Account Look-up</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"center\">\n");
      out.write("            \n");
      out.write("                ");

                    Account a1;
                    a1 = (Account)session.getAttribute("a1");
                    a1.Display();
                
      out.write("\n");
      out.write("                <h1>Account Lookup</h1><br>\n");
      out.write("                <table>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>AcctNo:</td>  <td><input type=\"text\" name=\"acctNo\" value=\"");
      out.print(a1.getAcctNo());
      out.write("\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>CustomerID:</td>  <td><input type=\"text\" name=\"customerID\" value=\"");
      out.print(a1.getCid());
      out.write("\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Type:</td>  <td><input type=\"text\" name=\"type\" value=\"");
      out.print(a1.getType());
      out.write("\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Balance:</td>  <td><input type=\"text\" name=\"balance\" value=\"");
      out.print(a1.getBalance());
      out.write("\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><input type=\"submit\" value=\"Lookup\"></td>\n");
      out.write("                        <td><input type=\"reset\" value=\"Clear\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
