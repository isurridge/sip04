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
			<!-- <div class="gridRow yui-gf">
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
				</div>-->
				<div class="gridRow yui-gf">
					<div class="yui-u first"></div>
					<div class="yui-u"><input type="submit" value="${register}"></input></div>
				</div>
			</div>
		</form:form>
	</body>
</html>
