/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.89
 * Generated at: 2023-07-07 09:04:42 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class upload_005fform_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1688537410871L));
    _jspx_dependants.put("jar:file:/C:/acorn_class/acornClass_spring/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Step05_project/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>/views/cafe/insertform.jsp</title>\r\n");
      out.write("<style>\r\n");
      out.write("	textarea{\r\n");
      out.write("		width: 768px;\r\n");
      out.write("		height: 300px;\r\n");
      out.write("	}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<div class=\"container\">\r\n");
      out.write("		<h3>새글 작성 폼입니다.</h3>\r\n");
      out.write("		<form action=\"upload\" method=\"post\">\r\n");
      out.write("			<div>\r\n");
      out.write("				<label for=\"title\">제목</label>\r\n");
      out.write("				<input type=\"text\" name=\"title\" id=\"title\"/>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div>\r\n");
      out.write("				<label for=\"content\">내용</label>\r\n");
      out.write("				<textarea name=\"content\" id=\"content\" rows=\"10\"></textarea>\r\n");
      out.write("			</div>\r\n");
      out.write("			 <div>\r\n");
      out.write("	         	<label for=\"image\">이미지</label>\r\n");
      out.write("	         	<input type=\"file\" name=\"image\" id=\"image\"\r\n");
      out.write("	            	accept=\".jpg, .jpeg, .png, .JPG, .JPEG\"/>\r\n");
      out.write("	      	</div>\r\n");
      out.write("			\r\n");
      out.write("			<button type=\"submit\" onclick=\"submitContents(this)\">저장</button>\r\n");
      out.write("		</form>\r\n");
      out.write("		 	<img alt=\"이미지 미리보기\" id=\"preview\"/>\r\n");
      out.write("	</div>\r\n");
      out.write("	\r\n");
      out.write("	<script>\r\n");
      out.write("	document.querySelector(\"#image\").addEventListener(\"change\", (e)=>{\r\n");
      out.write("		//선택된 파일 배열 객체를 얻어낸다.\r\n");
      out.write("		const files = e.target.files;\r\n");
      out.write("		//만일 파일 데이터가 존재한다면\r\n");
      out.write("		if(files.length > 0){\r\n");
      out.write("			//파일로 부터 데이터를 읽어들일 객체 생성\r\n");
      out.write("			const reader=new FileReader();\r\n");
      out.write("			//로딩이 완료(파일데이터를 모드 읽었을때) 되었을때 실행할 함수 등록\r\n");
      out.write("			reader.onload=(event)=>{\r\n");
      out.write("				//읽은 파일 데이터 얻어내기 \r\n");
      out.write("				const data=event.target.result;\r\n");
      out.write("				//console.log(data);\r\n");
      out.write("				//이미지 요소에 data 를 src 속성의 value 로 넣어 보세요.\r\n");
      out.write("				document.querySelector(\"#preview\").setAttribute(\"src\", data);\r\n");
      out.write("			};\r\n");
      out.write("			//파일을 DataURL 형식의 문자열로 읽어들이기\r\n");
      out.write("			reader.readAsDataURL(files[0]);\r\n");
      out.write("		}\r\n");
      out.write("	});\r\n");
      out.write("	</script>\r\n");
      out.write("	\r\n");
      out.write("	<!-- SmartEditor 에서 필요한 javascript 로딩  -->\r\n");
      out.write("	<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/SmartEditor/js/HuskyEZCreator.js\"></script>\r\n");
      out.write("	<script>\r\n");
      out.write("		var oEditors = [];\r\n");
      out.write("		\r\n");
      out.write("		//추가 글꼴 목록\r\n");
      out.write("		//var aAdditionalFontSet = [[\"MS UI Gothic\", \"MS UI Gothic\"], [\"Comic Sans MS\", \"Comic Sans MS\"],[\"TEST\",\"TEST\"]];\r\n");
      out.write("		\r\n");
      out.write("		nhn.husky.EZCreator.createInIFrame({\r\n");
      out.write("			oAppRef: oEditors,\r\n");
      out.write("			elPlaceHolder: \"content\",\r\n");
      out.write("			sSkinURI: \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/SmartEditor/SmartEditor2Skin.html\",	\r\n");
      out.write("			htParams : {\r\n");
      out.write("				bUseToolbar : true,				// 툴바 사용 여부 (true:사용/ false:사용하지 않음)\r\n");
      out.write("				bUseVerticalResizer : true,		// 입력창 크기 조절바 사용 여부 (true:사용/ false:사용하지 않음)\r\n");
      out.write("				bUseModeChanger : true,			// 모드 탭(Editor | HTML | TEXT) 사용 여부 (true:사용/ false:사용하지 않음)\r\n");
      out.write("				//aAdditionalFontList : aAdditionalFontSet,		// 추가 글꼴 목록\r\n");
      out.write("				fOnBeforeUnload : function(){\r\n");
      out.write("					//alert(\"완료!\");\r\n");
      out.write("				}\r\n");
      out.write("			}, //boolean\r\n");
      out.write("			fOnAppLoad : function(){\r\n");
      out.write("				//예제 코드\r\n");
      out.write("				//oEditors.getById[\"ir1\"].exec(\"PASTE_HTML\", [\"로딩이 완료된 후에 본문에 삽입되는 text입니다.\"]);\r\n");
      out.write("			},\r\n");
      out.write("			fCreator: \"createSEditor2\"\r\n");
      out.write("		});\r\n");
      out.write("		\r\n");
      out.write("		function pasteHTML() {\r\n");
      out.write("			var sHTML = \"<span style='color:#FF0000;'>이미지도 같은 방식으로 삽입합니다.<\\/span>\";\r\n");
      out.write("			oEditors.getById[\"content\"].exec(\"PASTE_HTML\", [sHTML]);\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		function showHTML() {\r\n");
      out.write("			var sHTML = oEditors.getById[\"content\"].getIR();\r\n");
      out.write("			alert(sHTML);\r\n");
      out.write("		}\r\n");
      out.write("			\r\n");
      out.write("		function submitContents(elClickedObj) {\r\n");
      out.write("			//SmartEditor 에 의해 만들어진(작성한글) 내용이 textarea 의 value 가 되도록 한다. \r\n");
      out.write("			oEditors.getById[\"content\"].exec(\"UPDATE_CONTENTS_FIELD\", []);	// 에디터의 내용이 textarea에 적용됩니다.\r\n");
      out.write("			\r\n");
      out.write("			// 에디터의 내용에 대한 값 검증은 이곳에서 document.getElementById(\"content\").value를 이용해서 처리하면 됩니다.\r\n");
      out.write("			\r\n");
      out.write("			try {\r\n");
      out.write("				//폼 제출하기 \r\n");
      out.write("				elClickedObj.form.submit();\r\n");
      out.write("			} catch(e) {}\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		function setDefaultFont() {\r\n");
      out.write("			var sDefaultFont = '궁서';\r\n");
      out.write("			var nFontSize = 24;\r\n");
      out.write("			oEditors.getById[\"content\"].setDefaultFont(sDefaultFont, nFontSize);\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		\r\n");
      out.write("	\r\n");
      out.write("	</script>		\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
