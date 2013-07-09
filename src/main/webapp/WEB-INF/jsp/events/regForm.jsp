<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<c:url var="submitRegistrationUrl" value="/events.html" />

<spring:message var="pageTitle" code="newUserRegistration.pageTitle" />
<spring:message var="msgAllFieldsRequired" code="newUserRegistration.message.allFieldsRequired" />
<spring:message var="register" code="newUserRegistration.label.register" />

<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title><c:out value="${pageTitle}" /></title>
	</head>
	<body>
		<h1><c:out value="${pageTitle}" /></h1>
		
		<form:form cssClass="main" action="${submitRegistrationUrl}" modelAttribute="registration">
			<form:errors path="*">
				<div class="warning alert"><spring:message code="error.global" /></div>
			</form:errors>
			
			<p><spring:message code="newUserRegistration.message.allFieldsRequired" /></p>
			
			<div class="panel grid">
				<div class="gridRow yui-gf">
					<div class="fieldLabel yui-u first"><spring:message code="newUserRegistration.label.username" /></div>
					<div class="yui-u">
						<div><form:input path="username" cssClass="short" cssErrorClass="short error" /></div>
						<form:errors path="username">
							<div class="errorMessage"><form:errors path="username" htmlEscape="false" /></div>
						</form:errors>
					</div>
				</div>

				<div class="gridRow yui-gf">
					<div class="fieldLabel yui-u first"><spring:message code="newUserRegistration.label.firstName" /></div>
					<div class="yui-u">
						<div><form:input path="firstName" cssClass="short" cssErrorClass="short error" /></div>
						<form:errors path="firstName">
							<div class="errorMessage"><form:errors path="firstName" htmlEscape="false" /></div>
						</form:errors>
					</div>
				</div>
			    <div class="gridRow yui-gf">
					<div class="fieldLabel yui-u first"><spring:message code="newUserRegistration.label.lastName" /></div>
					<div class="yui-u">
						<div><form:input path="lastName" cssClass="short" cssErrorClass="short error" /></div>
						<form:errors path="lastName">
							<div class="errorMessage"><form:errors path="lastName" htmlEscape="false" /></div>
						</form:errors>
					</div>
				</div>
				<div class="gridRow yui-gf">
					<div class="fieldLabel yui-u first"><spring:message code="newUserRegistration.label.email" /></div>
					<div class="yui-u">
						<div><form:input path="email" cssClass="medium" cssErrorClass="medium error" /></div>
						<form:errors path="email">
							<div class="errorMessage"><form:errors path="email" htmlEscape="false" /></div>
						</form:errors>
					</div>
				</div>
				<div class="gridRow yui-gf">
					<div class="fieldLabel yui-u first"><spring:message code="newUserRegistration.label.city" /></div>
					<div class="yui-u">
						<div><form:input path="city" cssClass="short" cssErrorClass="short error" /></div>
						<form:errors path="city">
							<div class="errorMessage"><form:errors path="city" htmlEscape="false" /></div>
						</form:errors>
					</div>
				</div>
				<div class="gridRow yui-gf">
					<div class="fieldLabel yui-u first"><spring:message code="newUserRegistration.label.company" /></div>
					<div class="yui-u">
						<div><form:input path="company" cssClass="short" cssErrorClass="short error" /></div>
						<form:errors path="company">
							<div class="errorMessage"><form:errors path="company" htmlEscape="false" /></div>
						</form:errors>
					</div>
				</div>
				<div class="gridRow yui-gf">
					<div class="fieldLabel yui-u first"><spring:message code="newUserRegistration.label.travelArranger" /></div>
					<div class="yui-u">
						<div><form:input path="travelArranger" cssClass="short" cssErrorClass="short error" /></div>
						<form:errors path="travelArranger">
							<div class="errorMessage"><form:errors path="travelArranger" htmlEscape="false" /></div>
						</form:errors>
					</div>
				</div>				
				<div class="gridRow yui-gf">
					<div class="fieldLabel yui-u first"><spring:message code="newUserRegistration.label.ada" /></div>
					<div class="yui-u">
						<div><form:input path="ada" cssClass="short" cssErrorClass="short error" /></div>
						<form:errors path="ada">
							<div class="errorMessage"><form:errors path="ada" htmlEscape="false" /></div>
						</form:errors>
					</div>
				</div>				
				<div class="gridRow yui-gf">
					<div class="fieldLabel yui-u first"><spring:message code="newUserRegistration.label.contactName" /></div>
					<div class="yui-u">
						<div><form:input path="contactName" cssClass="short" cssErrorClass="short error" /></div>
						<form:errors path="contactName">
							<div class="errorMessage"><form:errors path="contactName" htmlEscape="false" /></div>
						</form:errors>
					</div>
				</div>					
				<div class="gridRow yui-gf">
					<div class="fieldLabel yui-u first"><spring:message code="newUserRegistration.label.contactPhone" /></div>
					<div class="yui-u">
						<div><form:input path="contactPhone" cssClass="short" cssErrorClass="short error" /></div>
						<form:errors path="contactPhone">
							<div class="errorMessage"><form:errors path="contactPhone" htmlEscape="false" /></div>
						</form:errors>
					</div>
				</div>				
				
				
				
				
				
				
				
				
				
				
				
				
					
				<div class="gridRow yui-gf">
					<div class="yui-u first"></div>
					<div class="yui-u">
						<div>
							<form:checkbox id="brSession1" path="brSession1" cssErrorClass="error" />
							<label for="brSession1"><spring:message code="newUserRegistration.label.brSession1" /></label>
						</div>
						<form:errors path="brSession1">
							<div class="errorMessage"><form:errors path="brSession1" htmlEscape="false" /></div>
						</form:errors>
					</div>
				</div>
				<div class="gridRow yui-gf">
					<div class="yui-u first"></div>
					<div class="yui-u">
						<div>
							<form:checkbox id="brSession2" path="brSession2" cssErrorClass="error" />
							<label for="brSession2"><spring:message code="newUserRegistration.label.brSession2" /></label>
						</div>
						<form:errors path="brSession2">
							<div class="errorMessage"><form:errors path="brSession2" htmlEscape="false" /></div>
						</form:errors>
					</div>
				</div>				
				<div class="gridRow yui-gf">
					<div class="yui-u first"></div>
					<div class="yui-u">
						<div>
							<form:checkbox id="brSession3" path="brSession3" cssErrorClass="error" />
							<label for="brSession3"><spring:message code="newUserRegistration.label.brSession3" /></label>
						</div>
						<form:errors path="brSession3">
							<div class="errorMessage"><form:errors path="brSession3" htmlEscape="false" /></div>
						</form:errors>
					</div>
				</div>
				<div class="gridRow yui-gf">
					<div class="yui-u first"></div>
					<div class="yui-u">
						<div>
							<form:checkbox id="brSession4" path="brSession4" cssErrorClass="error" />
							<label for="brSession4"><spring:message code="newUserRegistration.label.brSession4" /></label>
						</div>
						<form:errors path="brSession4">
							<div class="errorMessage"><form:errors path="brSession4" htmlEscape="false" /></div>
						</form:errors>
					</div>
				</div>
				<div class="gridRow yui-gf">
					<div class="yui-u first"></div>
					<div class="yui-u">
						<div>
							<form:checkbox id="brSession5" path="brSession5" cssErrorClass="error" />
							<label for="brSession5"><spring:message code="newUserRegistration.label.brSession5" /></label>
						</div>
						<form:errors path="brSession5">
							<div class="errorMessage"><form:errors path="brSession5" htmlEscape="false" /></div>
						</form:errors>
					</div>
				</div>
				<div class="gridRow yui-gf">
					<div class="yui-u first"></div>
					<div class="yui-u">
						<div>
							<form:checkbox id="brSession6" path="brSession6" cssErrorClass="error" />
							<label for="brSession6"><spring:message code="newUserRegistration.label.brSession6" /></label>
						</div>
						<form:errors path="brSession6">
							<div class="errorMessage"><form:errors path="brSession6" htmlEscape="false" /></div>
						</form:errors>
					</div>
				</div>				
				<div class="gridRow yui-gf">
					<div class="yui-u first"></div>
					<div class="yui-u">
						<div>
							<form:checkbox id="brSession7" path="brSession7" cssErrorClass="error" />
							<label for="brSession7"><spring:message code="newUserRegistration.label.brSession7" /></label>
						</div>
						<form:errors path="brSession7">
							<div class="errorMessage"><form:errors path="brSession7" htmlEscape="false" /></div>
						</form:errors>
					</div>
				</div>				
				<div class="gridRow yui-gf">
					<div class="yui-u first"></div>
					<div class="yui-u">
						<div>
							<form:checkbox id="brSession8" path="brSession8" cssErrorClass="error" />
							<label for="brSession8"><spring:message code="newUserRegistration.label.brSession8" /></label>
						</div>
						<form:errors path="brSession8">
							<div class="errorMessage"><form:errors path="brSession8" htmlEscape="false" /></div>
						</form:errors>
					</div>
				</div>
				<div class="gridRow yui-gf">
					<div class="yui-u first"></div>
					<div class="yui-u">
						<div>
							<form:checkbox id="brSession9" path="brSession9" cssErrorClass="error" />
							<label for="brSession9"><spring:message code="newUserRegistration.label.brSession9" /></label>
						</div>
						<form:errors path="brSession9">
							<div class="errorMessage"><form:errors path="brSession9" htmlEscape="false" /></div>
						</form:errors>
					</div>
				</div>				
				<div class="gridRow yui-gf">
					<div class="yui-u first"></div>
					<div class="yui-u">
						<div>
							<form:checkbox id="brSession10" path="brSession10" cssErrorClass="error" />
							<label for="brSession10"><spring:message code="newUserRegistration.label.brSession10" /></label>
						</div>
						<form:errors path="brSession10">
							<div class="errorMessage"><form:errors path="brSession10" htmlEscape="false" /></div>
						</form:errors>
					</div>
				</div>				

				
				
				
				
				<div class="gridRow yui-gf">
					<div class="yui-u first"></div>
					<div class="yui-u"><input type="submit" value="${register}"></input></div>
				</div>
			</div>
		</form:form>
	</body>
</html>
