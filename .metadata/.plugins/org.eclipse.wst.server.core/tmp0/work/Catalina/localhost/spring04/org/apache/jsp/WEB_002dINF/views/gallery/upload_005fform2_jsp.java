/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.89
 * Generated at: 2023-07-07 08:24:53 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.gallery;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class upload_005fform2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/C:/acorn_class/acornClass_spring/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Step04_Final/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1688537410871L));
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
      out.write("   \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>/views/gallery/upload_form.jsp</title>\r\n");
      out.write("<style>\r\n");
      out.write("	#dropZone{\r\n");
      out.write("		width: 400px;\r\n");
      out.write("		height: 400px;\r\n");
      out.write("		border: 2px dashed red;\r\n");
      out.write("		border-radius: 20px;\r\n");
      out.write("		/* 아래는 자식 contents 를 상하 좌우로 가운데 정렬 하기 위한 css */\r\n");
      out.write("		display: flex;\r\n");
      out.write("		justify-content: center;\r\n");
      out.write("        align-items: center;\r\n");
      out.write("	}\r\n");
      out.write("	/* img 요소에 적용할 css */\r\n");
      out.write("	#preview{\r\n");
      out.write("		display: none;\r\n");
      out.write("		object-fit: cover;\r\n");
      out.write("		width: 100%;\r\n");
      out.write("		height: 100%;\r\n");
      out.write("		border-radius:20px;\r\n");
      out.write("	}	\r\n");
      out.write("	#image{\r\n");
      out.write("		display: none;\r\n");
      out.write("	}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<div class=\"container\">\r\n");
      out.write("		<h1>이미지 업로드 폼</h1>\r\n");
      out.write("	   	<form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/gallery/upload\" method=\"post\" \r\n");
      out.write("	   						enctype=\"multipart/form-data\">\r\n");
      out.write("	      	<div>\r\n");
      out.write("	         	<label for=\"caption\">설명</label>\r\n");
      out.write("	         	<input type=\"text\" name=\"caption\" id=\"caption\"/>\r\n");
      out.write("	      	</div>\r\n");
      out.write("	      	\r\n");
      out.write("	        <input type=\"file\" name=\"image\" id=\"image\"\r\n");
      out.write("	            	accept=\".jpg, .jpeg, .png, .JPG, .JPEG\"/>\r\n");
      out.write("	   	</form>\r\n");
      out.write("	   	<!-- drag and drop 을 할 div -->\r\n");
      out.write("	   	<a href=\"javascript:\" id=\"dropZoneLink\" title=\"업로드 할 이미지 선택\">\r\n");
      out.write("		   	<div id=\"dropZone\">\r\n");
      out.write("		   		<p>이미지를 drag drop 또는 여기를 클릭하세요</p>\r\n");
      out.write("		   		<img src=\"\" id=\"preview\"/>\r\n");
      out.write("		   	</div>\r\n");
      out.write("	   	</a>\r\n");
      out.write("	   	<button id=\"submitBtn\">업로드</button>\r\n");
      out.write("	</div>\r\n");
      out.write("	<script>\r\n");
      out.write("		document.querySelector(\"#submitBtn\").addEventListener(\"click\", ()=>{\r\n");
      out.write("			document.querySelector(\"form\").submit();\r\n");
      out.write("		});\r\n");
      out.write("	\r\n");
      out.write("		//dropZone 을 클릭해도 파일 선택창을 띄우도록 한다.\r\n");
      out.write("		document.querySelector(\"#dropZoneLink\").addEventListener(\"click\", ()=>{\r\n");
      out.write("			// input type=\"file\" 을 강제 클릭 시킨다.\r\n");
      out.write("			document.querySelector(\"#image\").click();\r\n");
      out.write("		});	\r\n");
      out.write("	\r\n");
      out.write("		// dropZone div 의 참조값 얻어오기\r\n");
      out.write("		const dropZone=document.querySelector(\"#dropZone\");\r\n");
      out.write("		//이벤트 리스너 함수 등록하기\r\n");
      out.write("		dropZone.addEventListener(\"dragover\", (e)=>{\r\n");
      out.write("			e.preventDefault();\r\n");
      out.write("		});\r\n");
      out.write("		dropZone.addEventListener(\"drop\", (e)=>{\r\n");
      out.write("			e.preventDefault();\r\n");
      out.write("			// drop 된 파일의 정보를 얻어오기\r\n");
      out.write("			const files=e.dataTransfer.files;\r\n");
      out.write("			console.log(files[0]);\r\n");
      out.write("			// drop 된 파일의 정보를 조사해서 이미지 파일이 아니라면 함수를 여기서 종료 시키기 \r\n");
      out.write("			const type=files[0].type;\r\n");
      out.write("			console.log(type);\r\n");
      out.write("			if( type != \"image/png\" && type != \"image/jpg\" && type != \"image/gif\"){\r\n");
      out.write("				alert(\"이미지 파일을 drop 하세요!\");\r\n");
      out.write("				return;\r\n");
      out.write("			}\r\n");
      out.write("			\r\n");
      out.write("			//만일 파일 데이터가 존재한다면\r\n");
      out.write("			if(files.length > 0){\r\n");
      out.write("				//파일로 부터 데이터를 읽어들일 객체 생성\r\n");
      out.write("				const reader=new FileReader();\r\n");
      out.write("				//로딩이 완료(파일데이터를 모드 읽었을때) 되었을때 실행할 함수 등록\r\n");
      out.write("				reader.onload=(event)=>{\r\n");
      out.write("					//읽은 파일 데이터 얻어내기 \r\n");
      out.write("					const data=event.target.result;\r\n");
      out.write("					// img 요소에 이미지를 출력하고 보이게하고 p 요소를 숨긴다.\r\n");
      out.write("					document.querySelector(\"#preview\").setAttribute(\"src\", data);\r\n");
      out.write("					document.querySelector(\"#preview\").style.display=\"block\";\r\n");
      out.write("					document.querySelector(\"#dropZone p\").style.display=\"none\";\r\n");
      out.write("				};\r\n");
      out.write("				//파일을 DataURL 형식의 문자열로 읽어들이기\r\n");
      out.write("				reader.readAsDataURL(files[0]);\r\n");
      out.write("				//선택된 파일의 정보를 input type=\"file\" 요소에 넣어주기\r\n");
      out.write("				document.querySelector(\"#image\").files=files;\r\n");
      out.write("			}\r\n");
      out.write("		});\r\n");
      out.write("	\r\n");
      out.write("		document.querySelector(\"#image\").addEventListener(\"change\", (e)=>{\r\n");
      out.write("			//선택된 파일 배열 객체를 얻어낸다.\r\n");
      out.write("			const files = e.target.files;\r\n");
      out.write("			//만일 파일 데이터가 존재한다면\r\n");
      out.write("			if(files.length > 0){\r\n");
      out.write("				//파일로 부터 데이터를 읽어들일 객체 생성\r\n");
      out.write("				const reader=new FileReader();\r\n");
      out.write("				//로딩이 완료(파일데이터를 모드 읽었을때) 되었을때 실행할 함수 등록\r\n");
      out.write("				reader.onload=(event)=>{\r\n");
      out.write("					//읽은 파일 데이터 얻어내기 \r\n");
      out.write("					const data=event.target.result;\r\n");
      out.write("					//console.log(data);\r\n");
      out.write("					//이미지 요소에 data 를 src 속성의 value 로 넣어 보세요.\r\n");
      out.write("					document.querySelector(\"#preview\").setAttribute(\"src\", data);\r\n");
      out.write("					document.querySelector(\"#preview\").style.display=\"block\";\r\n");
      out.write("					document.querySelector(\"#dropZone p\").style.display=\"none\";\r\n");
      out.write("				};\r\n");
      out.write("				//파일을 DataURL 형식의 문자열로 읽어들이기\r\n");
      out.write("				reader.readAsDataURL(files[0]);\r\n");
      out.write("			}\r\n");
      out.write("		});\r\n");
      out.write("	</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
