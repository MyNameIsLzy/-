/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-03-25 01:23:21 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class remark_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"widget dashboard-container my-adslist\">\r\n");
      out.write("    <table class=\"table table-responsive product-dashboard-table\">\r\n");
      out.write("        <thead>\r\n");
      out.write("        <tr>\r\n");
      out.write("            <th class=\"text-center\">课程图片</th>\r\n");
      out.write("            <th >课程评价</th>\r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("            <th class=\"text-center\"></th>\r\n");
      out.write("        </tr>\r\n");
      out.write("        </thead>\r\n");
      out.write("        <tbody>\r\n");
      out.write("        ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        </tbody>\r\n");
      out.write("    </table>\r\n");
      out.write("</div>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    (function(){\r\n");
      out.write("        var inputs = document.getElementsByName(\"remarkinput\");\r\n");
      out.write("        var spans = document.getElementsByName(\"remarkspan\");\r\n");
      out.write("        var stardiv0s = document.getElementsByName(\"stardiv0\");\r\n");
      out.write("        var stardivs = document.getElementsByName(\"stardiv\");\r\n");
      out.write("        var starnums = document.getElementsByName(\"starNum\");\r\n");
      out.write("        $(\"a[name=remark]\").click(function(){\r\n");
      out.write("                var as = document.getElementsByName(\"remark\");\r\n");
      out.write("                var position = $(\"a[name=remark]\").index(this);\r\n");
      out.write("                alert(position);\r\n");
      out.write("                inputs[position].style.display=\"\";\r\n");
      out.write("                spans[position].style.display=\"none\";\r\n");
      out.write("                stardiv0s[position].style.display=\"none\";\r\n");
      out.write("                stardivs[position].style.display=\"\";\r\n");
      out.write("            });\r\n");
      out.write("        //$(\"a[name=confirm]\").click(function(){\r\n");
      out.write("                // var as = document.getElementsByName(\"confirm\");\r\n");
      out.write("                // var position = $(\"a[name=confirm]\").index(this);\r\n");
      out.write("                // alert(position);\r\n");
      out.write("                // inputs[position].style.display=\"none\";\r\n");
      out.write("                // spans[position].style.display=\"\";\r\n");
      out.write("                // stardiv0s[position].style.display=\"\";\r\n");
      out.write("                // stardivs[position].style.display=\"none\";\r\n");
      out.write("                //  // 获取评分，显示在页面\r\n");
      out.write("                // var score = $(\"div[name=stardiv]\").eq(position).find('.starNum').html();\r\n");
      out.write("                // var remark = inputs[position].value;\r\n");
      out.write("                // alert(\"remark\"+remark);\r\n");
      out.write("                // alert(\"score\"+score);\r\n");
      out.write("                // for(var i=0;i<score;i++)\r\n");
      out.write("                //     $(\"div[name=stardiv0]\").eq(position).find('.high').eq(i).css('z-index',1);\r\n");
      out.write("                // for(var i=score;i<5;i++)\r\n");
      out.write("                //     $(\"div[name=stardiv0]\").eq(position).find('.high').eq(i).css('z-index',0);\r\n");
      out.write("                // $(\"div[name=stardiv0]\").eq(position).find('.starNum').html(score);\r\n");
      out.write("                // spans[position].innerHTML=remark;\r\n");
      out.write("       // });\r\n");
      out.write("    })()\r\n");
      out.write("</script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    var inputs = document.getElementsByName(\"remarkinput\");\r\n");
      out.write("    var spans = document.getElementsByName(\"remarkspan\");\r\n");
      out.write("    var stardiv0s = document.getElementsByName(\"stardiv0\");\r\n");
      out.write("    var stardivs = document.getElementsByName(\"stardiv\");\r\n");
      out.write("    var starnums = document.getElementsByName(\"starNum\");\r\n");
      out.write("    function userComment(index,courId) {\r\n");
      out.write("        alert(\"评价\");\r\n");
      out.write("        alert(index);\r\n");
      out.write("        var ticket = $.cookie(\"token\");\r\n");
      out.write("        var as = document.getElementsByName(\"confirm\");\r\n");
      out.write("        inputs[index].style.display=\"none\";\r\n");
      out.write("        spans[index].style.display=\"\";\r\n");
      out.write("        stardiv0s[index].style.display=\"\";\r\n");
      out.write("        stardivs[index].style.display=\"none\";\r\n");
      out.write("        // 获取评分，显示在页面\r\n");
      out.write("        var score = $(\"div[name=stardiv]\").eq(index).find('.starNum').html();\r\n");
      out.write("        var remark = inputs[index].value;\r\n");
      out.write("        alert(\"remark\"+remark);\r\n");
      out.write("        alert(\"score\"+score);\r\n");
      out.write("        for(var i=0;i<score;i++)\r\n");
      out.write("            $(\"div[name=stardiv0]\").eq(index).find('.high').eq(i).css('z-index',1);\r\n");
      out.write("        for(var i=score;i<5;i++)\r\n");
      out.write("            $(\"div[name=stardiv0]\").eq(index).find('.high').eq(i).css('z-index',0);\r\n");
      out.write("        $(\"div[name=stardiv0]\").eq(index).find('.starNum').html(score);\r\n");
      out.write("        spans[index].innerHTML=remark;\r\n");
      out.write("        score = Number(score);\r\n");
      out.write("        alert(score);\r\n");
      out.write("        $.get(\"/center/changeComment\",\r\n");
      out.write("            {\r\n");
      out.write("                star:score,\r\n");
      out.write("                remark:remark,\r\n");
      out.write("                courId:courId,\r\n");
      out.write("                token:ticket,\r\n");
      out.write("            },\r\n");
      out.write("            function(data){\r\n");
      out.write("                if(data.status == 200){\r\n");
      out.write("                    alert(\"评价成功\");\r\n");
      out.write("\r\n");
      out.write("                }else{\r\n");
      out.write("                    alert(\"评价失败\");\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");
      out.write("<script src=\"js/jquery-star.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("    $(function () {\r\n");
      out.write("        //评分\r\n");
      out.write("        var starRating = 0;\r\n");
      out.write("        var row;//鼠标停在第几行\r\n");
      out.write("        $(\"tr[name=remark]\").on('mouseenter',function () {\r\n");
      out.write("            row = $(\"tr[name=remark]\").index(this);\r\n");
      out.write("            // alert(\"tr:\"+row);\r\n");
      out.write("        })\r\n");
      out.write("        $('.photo span').on('mouseenter',function () {\r\n");
      out.write("            var index = $(this).index()+1;\r\n");
      out.write("            $(this).prevAll().find('.high').css('z-index',1)\r\n");
      out.write("            $(this).find('.high').css('z-index',1)\r\n");
      out.write("            $(this).nextAll().find('.high').css('z-index',0)\r\n");
      out.write("            $(\"span[name=starNum]\").eq(row).html((index).toFixed(1))\r\n");
      out.write("        })\r\n");
      out.write("        $('.photo span').on('click',function () {\r\n");
      out.write("            var index = $(this).index()+1;\r\n");
      out.write("            // alert(\"confirm\"+index)\r\n");
      out.write("            for(var i=0;i<index;i++)\r\n");
      out.write("                $(\"div[name=stardiv]\").eq(row).find('.high').eq(i).css('z-index',1);\r\n");
      out.write("            $(\"div[name=stardiv]\").eq(row).find('.starNum').html(index.toFixed(1));\r\n");
      out.write("        })\r\n");
      out.write("    })\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/jsp/remark.jsp(22,8) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/remark.jsp(22,8) '${union}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${union}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/jsp/remark.jsp(22,8) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("union");
    // /WEB-INF/jsp/remark.jsp(22,8) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVarStatus("status");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("            <tr  name=\"remark\">\r\n");
          out.write("                <td class=\"product-thumb\">\r\n");
          out.write("                    <img width=\"100px\" height=\"80px\" src=\"images/a4.jpg\" alt=\"image description\"></td>\r\n");
          out.write("                <td class=\"product-details\">\r\n");
          out.write("                    <span name=\"remarkid\" style=\"display:none\"></span>\r\n");
          out.write("                    <div class=\"remarktitle\">\r\n");
          out.write("                        <a href=\"/courseInfo/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${union.courId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\"><h3 class=\"title remarkh3\"><strong>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${union.courName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("<br><br></strong><h6 class=\"remarkh6\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${union.courInfo}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</h6></h3></a>\r\n");
          out.write("                    </div>\r\n");
          out.write("                    <label style=\"font-size:16px;font-weight:normal;float:left;padding-top: 3px;\" >星级：</label>\r\n");
          out.write("                    ");
          out.write("\r\n");
          out.write("                    <div class=\"starRating\" name=\"stardiv0\" >\r\n");
          out.write("                        <span name=\"starrate0\" class=\"photo0\" style=\"display:inline-block;\">\r\n");
          out.write("                            <span style=\"display:inline-block;\"><i class=\"high\"></i><i class=\"nohigh\"></i></span>\r\n");
          out.write("                            <span style=\"display:inline-block;\"><i class=\"high\"></i><i class=\"nohigh\"></i></span>\r\n");
          out.write("                            <span style=\"display:inline-block;\"><i class=\"high\"></i><i class=\"nohigh\"></i></span>\r\n");
          out.write("                            <span style=\"display:inline-block;\"><i class=\"high\"></i><i class=\"nohigh\"></i></span>\r\n");
          out.write("                            <span style=\"display:inline-block;\"><i class=\"high\"></i><i class=\"nohigh\"></i></span>\r\n");
          out.write("                        </span>\r\n");
          out.write("                        <span name=\"starNum0\" class=\"starNum\" style=\"display:inline-block;font-size: 18px;\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${starCount}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</span>\r\n");
          out.write("                    </div>\r\n");
          out.write("                    ");
          out.write("\r\n");
          out.write("                    <div class=\"starRating\" name=\"stardiv\" style=\"display:none\">\r\n");
          out.write("                        <span name=\"starrate\" class=\"photo\" style=\"display:inline-block;\">\r\n");
          out.write("                            <span class=\"star\" style=\"display:inline-block;\"><i class=\"high\"></i><i class=\"nohigh\"></i></span>\r\n");
          out.write("                            <span class=\"star\" style=\"display:inline-block;\"><i class=\"high\"></i><i class=\"nohigh\"></i></span>\r\n");
          out.write("                            <span class=\"star\" style=\"display:inline-block;\"><i class=\"high\"></i><i class=\"nohigh\"></i></span>\r\n");
          out.write("                            <span class=\"star\" style=\"display:inline-block;\"><i class=\"high\"></i><i class=\"nohigh\"></i></span>\r\n");
          out.write("                            <span class=\"star\" style=\"display:inline-block;\"><i class=\"high\"></i><i class=\"nohigh\"></i></span>\r\n");
          out.write("                        </span>\r\n");
          out.write("                        <span name=\"starNum\" class=\"starNum\" style=\"display:inline-block;font-size: 18px;\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${union.courStar}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</span>\r\n");
          out.write("                    </div>\r\n");
          out.write("                    <label style=\"font-size:16px;font-weight:normal;\">评价：</label><span id=\"remarkspan\" name=\"remarkspan\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${union.courComment}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</span>\r\n");
          out.write("                    <input class=\"remark\" name=\"remarkinput\" type=\"text\" style=\"display:none\"/>\r\n");
          out.write("                    ");
          out.write("\r\n");
          out.write("                </td>\r\n");
          out.write("                ");
          out.write("\r\n");
          out.write("                <td class=\"action\" data-title=\"Action\">\r\n");
          out.write("                    <div class=\"\">\r\n");
          out.write("                        <ul class=\"list-inline justify-content-center\">\r\n");
          out.write("                            <li class=\"list-inline-item\">\r\n");
          out.write("                                <!-- 评价 -->\r\n");
          out.write("                                <a class=\"edit\" name=\"remark\" href=\"#\">\r\n");
          out.write("                                    <img name=\"remarkicon\" src=\"images/remark.png\">\r\n");
          out.write("                                    <i class=\"fa fa-pencil\"></i>\r\n");
          out.write("                                </a>\r\n");
          out.write("                                <a class=\"edit\" name=\"confirm\" href=\"#\" onclick=\"userComment(");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${status.index}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write(',');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${union.courId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write(")\">\r\n");
          out.write("                                    <img name=\"remarkicon\" src=\"images/remark-confirm.png\">\r\n");
          out.write("                                    <i class=\"fa fa-pencil\"></i>\r\n");
          out.write("                                </a>\r\n");
          out.write("                            </li>\r\n");
          out.write("                        </ul>\r\n");
          out.write("                    </div>\r\n");
          out.write("                </td>\r\n");
          out.write("            </tr>\r\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}
