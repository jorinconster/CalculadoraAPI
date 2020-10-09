package com.devops.calculadoraAPI.issues;

import java.io.IOException;
import java.util.Hashtable;
import java.util.regex.Pattern;

import javax.naming.Context;
import javax.naming.directory.DirContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;


public class Issues extends HttpServlet {

	@RequestMapping
	private String greet(String greetee) {
		return null;
	}

	
	void LdapERROR() {
		// Set up the environment for creating the initial context
		Hashtable<String, Object> env = new Hashtable<String, Object>();
		env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
		env.put(Context.PROVIDER_URL, "ldap://localhost:389/o=JNDITutorial");

		// Use anonymous authentication
		env.put(Context.SECURITY_AUTHENTICATION, "none"); // Noncompliant

	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String referer = request.getHeader("referer"); // Noncompliant
		if (isTrustedReferer(referer)) {
			// ..
		}
		// ...
	}

	private boolean isTrustedReferer(String referer) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	 String regex; // a regular expression
	  String input; // a user input

	  void foo(CharSequence htmlString) {
	    input.matches(regex);  // Questionable
	    Pattern.compile(regex);  // Questionable
	    Pattern.compile(regex, Pattern.CASE_INSENSITIVE);  // Questionable

	    String replacement = "test";
	    input.replaceAll(regex, replacement);  // Questionable
	    input.replaceFirst(regex, replacement);  // Questionable

	    if (!Pattern.matches(".*<script>.*", htmlString)) { // Questionable, even if the pattern is hard-coded
	    }
	  }
	  
	  
	  @RequestMapping
		private String greet1(String greetee) {
		  int h =0;
			 if(h!=0) {}
			return null;
		}

		
		void LdapERROR1() {
			// Set up the environment for creating the initial context
			Hashtable<String, Object> env = new Hashtable<String, Object>();
			env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
			env.put(Context.PROVIDER_URL, "ldap://localhost:389/o=JNDITutorial");

			// Use anonymous authentication
			env.put(Context.SECURITY_AUTHENTICATION, "none"); // Noncompliant

	
		}
		
		protected void doPost1(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			String referer = request.getHeader("referer"); // Noncompliant
			if (isTrustedReferer(referer)) {
				// ..
			}
			// ...
		}

		private boolean isTrustedReferer1(String referer) {
			// TODO Auto-generated method stub
			int h =0;
			 if(h!=0) {}
			return false;
		}
		
		
		 String regex1; // a regular expression
		  String input1; // a user input

		  void foo1(CharSequence htmlString) {
		    input1.matches(regex1);  // Questionable
		    Pattern.compile(regex1);  // Questionable
		    Pattern.compile(regex1, Pattern.CASE_INSENSITIVE);  // Questionable

		    String replacement = "test";
		    input1.replaceAll(regex1, replacement);  // Questionable
		    input1.replaceFirst(regex1, replacement);  // Questionable

		    if (!Pattern.matches(".*<script>.*", htmlString)) { // Questionable, even if the pattern is hard-coded
		    }
		  }
		  
		  
		  @RequestMapping
			private String greet2(String greetee) {
			  String firstName = "h"; // String overrides equals
			  String lastName = "g";

			  if (firstName == lastName) { return "h"; }
			  return null;
			}

			
			void LdapERROR2() {
				// Set up the environment for creating the initial context
				Hashtable<String, Object> env = new Hashtable<String, Object>();
				env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
				env.put(Context.PROVIDER_URL, "ldap://localhost:389/o=JNDITutorial");

				// Use anonymous authentication
				env.put(Context.SECURITY_AUTHENTICATION, "none"); // Noncompliant

				int x=2;
				if (x == 0) {
					 greet2("g");
					} else if (x == 1) {
						greet2("g");
					}
			}
			
			protected void doPost2(HttpServletRequest request, HttpServletResponse response)
					throws ServletException, IOException {
				String referer = request.getHeader("referer"); // Noncompliant
				if (isTrustedReferer(referer)) {
					// ..
				}
				// ...
				int x=2;
				if (x == 0) {
					 greet2("g");
					} else if (x == 1) {
						greet2("g");
					}
			}

			private boolean isTrustedReferer2(String referer) {
				// TODO Auto-generated method stub
				int h =0;
				 if(h!=0) {}
				
				return false;
			}
			
			
			 String regex2; // a regular expression
			  String input2; // a user input

			  void foo2(CharSequence htmlString) {
			    input2.matches(regex2);  // Questionable
			    Pattern.compile(regex2);  // Questionable
			    Pattern.compile(regex2, Pattern.CASE_INSENSITIVE);  // Questionable

			    String replacement = "test";
			    input2.replaceAll(regex2, replacement);  // Questionable
			    input2.replaceFirst(regex2, replacement);  // Questionable

			    if (!Pattern.matches(".*<script>.*", htmlString)) { // Questionable, even if the pattern is hard-coded
			    }
			    int x=2;
				if (x == 0) {
					 greet2("g");
					} else if (x == 1) {
						greet2("g");
					}
			  }
			  
			  
			  @RequestMapping
				private String greet3(String greetee) {
				  int h=0;
				  if(h!=0) return null;
					return "";
				}

				
				void LdapERROR3() {
					// Set up the environment for creating the initial context
					Hashtable<String, Object> env = new Hashtable<String, Object>();
					env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
					env.put(Context.PROVIDER_URL, "ldap://localhost:389/o=JNDITutorial");

					// Use anonymous authentication
					env.put(Context.SECURITY_AUTHENTICATION, "none"); // Noncompliant

					int x=2;
					if (x == 0) {
						 greet2("g");
						} else if (x == 1) {
							greet2("g");
						}
				}
				
				protected void doPost3(HttpServletRequest request, HttpServletResponse response)
						throws ServletException, IOException {
					String referer = request.getHeader("referer"); // Noncompliant
					if (isTrustedReferer(referer)) {
						// ..
					}
					// ...
				}

				private boolean isTrustedReferer3(String referer) {
					// TODO Auto-generated method stub
					int x=2;
					if (x == 0) {
						 greet2("g");
						} else if (x == 1) {
							greet2("g");
						}
					return false;
				}
				
				
				 String regex3; // a regular expression
				  String input3; // a user input

				  void foo3(CharSequence htmlString) {
				    input3.matches(regex3);  // Questionable
				    Pattern.compile(regex3);  // Questionable
				    Pattern.compile(regex3, Pattern.CASE_INSENSITIVE);  // Questionable

				    String replacement = "test";
				    input3.replaceAll(regex3, replacement);  // Questionable
				    input3.replaceFirst(regex3, replacement);  // Questionable

				    if (!Pattern.matches(".*<script>.*", htmlString)) { // Questionable, even if the pattern is hard-coded
				    }
				  }

 private void sendHtmlTls() throws Exception {        
		//Desencriptar password
	String className = System.getProperty("messageClassName");
Class clazz = Class.forName(className);  // Noncompliant    
       
 }
}
