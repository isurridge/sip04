<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<c:url var="submitRegistrationUrl" value="/events.html" />

<spring:message var="pageTitle" code="newUserRegistration.pageTitle" />
<spring:message var="msgAllFieldsRequired"
	code="newUserRegistration.message.allFieldsRequired" />
<spring:message var="register" code="newUserRegistration.label.register" />

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title><c:out value="${pageTitle}" /></title>
<style>
ol.myList li.myList {
	list-style-type: none;
}
</style>
</head>
<body>
	<h1>
		<c:out value="${pageTitle}" />
	</h1>

	<form:form cssClass="main" action="${submitRegistrationUrl}"
		modelAttribute="registration">
		<form:errors path="*">
			<div class="warning alert">
				<spring:message code="error.global" />
			</div>
		</form:errors>

		<p>
			<spring:message code="newUserRegistration.message.allFieldsRequired" />
		</p>

		<div class="panel grid">
			<div class="gridRow yui-gf">
				<div class="fieldLabel yui-u first">
					<spring:message code="newUserRegistration.label.username" />
				</div>
				<div class="yui-u">
					<div>
						<form:input path="username" cssClass="short"
							cssErrorClass="short error" />
					</div>
					<form:errors path="username">
						<div class="errorMessage">
							<form:errors path="username" htmlEscape="false" />
						</div>
					</form:errors>
				</div>
			</div>

			<div class="gridRow yui-gf">
				<div class="fieldLabel yui-u first">
					<spring:message code="newUserRegistration.label.firstName" />
				</div>
				<div class="yui-u">
					<div>
						<form:input path="firstName" cssClass="short"
							cssErrorClass="short error" />
					</div>
					<form:errors path="firstName">
						<div class="errorMessage">
							<form:errors path="firstName" htmlEscape="false" />
						</div>
					</form:errors>
				</div>
			</div>
			<div class="gridRow yui-gf">
				<div class="fieldLabel yui-u first">
					<spring:message code="newUserRegistration.label.lastName" />
				</div>
				<div class="yui-u">
					<div>
						<form:input path="lastName" cssClass="short"
							cssErrorClass="short error" />
					</div>
					<form:errors path="lastName">
						<div class="errorMessage">
							<form:errors path="lastName" htmlEscape="false" />
						</div>
					</form:errors>
				</div>
			</div>
			<div class="gridRow yui-gf">
				<div class="fieldLabel yui-u first">
					<spring:message code="newUserRegistration.label.email" />
				</div>
				<div class="yui-u">
					<div>
						<form:input path="email" cssClass="medium"
							cssErrorClass="medium error" />
					</div>
					<form:errors path="email">
						<div class="errorMessage">
							<form:errors path="email" htmlEscape="false" />
						</div>
					</form:errors>
				</div>
			</div>
			<div class="gridRow yui-gf">
				<div class="fieldLabel yui-u first">
					<spring:message code="newUserRegistration.label.city" />
				</div>
				<div class="yui-u">
					<div>
						<form:input path="city" cssClass="short"
							cssErrorClass="short error" />
					</div>
					<form:errors path="city">
						<div class="errorMessage">
							<form:errors path="city" htmlEscape="false" />
						</div>
					</form:errors>
				</div>
			</div>
			<div class="gridRow yui-gf">
				<div class="fieldLabel yui-u first">
					<spring:message code="newUserRegistration.label.company" />
				</div>
				<div class="yui-u">
					<div>
						<form:input path="company" cssClass="short"
							cssErrorClass="short error" />
					</div>
					<form:errors path="company">
						<div class="errorMessage">
							<form:errors path="company" htmlEscape="false" />
						</div>
					</form:errors>
				</div>
			</div>
			<div class="gridRow yui-gf">
				<div class="fieldLabel yui-u first">
					<spring:message code="newUserRegistration.label.travelArranger" />
				</div>
				<div class="yui-u">
					<div>
						<form:input path="travelArranger" cssClass="short"
							cssErrorClass="short error" />
					</div>
					<form:errors path="travelArranger">
						<div class="errorMessage">
							<form:errors path="travelArranger" htmlEscape="false" />
						</div>
					</form:errors>
				</div>
			</div>
			<div class="gridRow yui-gf">
				<div class="fieldLabel yui-u first">
					<spring:message code="newUserRegistration.label.ada" />
				</div>
				<div class="yui-u">
					<div>
						<form:input path="ada" cssClass="short"
							cssErrorClass="short error" />
					</div>
					<form:errors path="ada">
						<div class="errorMessage">
							<form:errors path="ada" htmlEscape="false" />
						</div>
					</form:errors>
				</div>
			</div>
			<div class="gridRow yui-gf">
				<div class="fieldLabel yui-u first">
					<spring:message code="newUserRegistration.label.contactName" />
				</div>
				<div class="yui-u">
					<div>
						<form:input path="contactName" cssClass="short"
							cssErrorClass="short error" />
					</div>
					<form:errors path="contactName">
						<div class="errorMessage">
							<form:errors path="contactName" htmlEscape="false" />
						</div>
					</form:errors>
				</div>
			</div>
			<div class="gridRow yui-gf">
				<div class="fieldLabel yui-u first">
					<spring:message code="newUserRegistration.label.contactPhone" />
				</div>
				<div class="yui-u">
					<div>
						<form:input path="contactPhone" cssClass="short"
							cssErrorClass="short error" />
					</div>
					<form:errors path="contactPhone">
						<div class="errorMessage">
							<form:errors path="contactPhone" htmlEscape="false" />
						</div>
					</form:errors>
				</div>
			</div>













			<div class="gridRow yui-gf">
				<div class="fieldLabel yui-u first">
					<spring:message code="newUserRegistration.label.breakout1" />
				</div>
				<div class="yui-u">
					<div>
						<ol class="myList">
							<form:radiobuttons items="${breakout1Map}" path="breakout1"
								cssClass="myList" element="li" cssErrorClass="error" />
						</ol>
					</div>
					<form:errors path="breakout1">
						<div class="errorMessage">
							<form:errors path="breakout1" htmlEscape="false" />
						</div>
					</form:errors>
				</div>
			</div>



			<div class="gridRow yui-gf">
				<div class="fieldLabel yui-u first">
					<spring:message code="newUserRegistration.label.breakout2" />
				</div>
				<div class="yui-u">
					<div>
						<ol class="myList">
							<form:radiobuttons items="${breakout2Map}" path="breakout2"
								cssClass="myList" element="li" cssErrorClass="error" />
						</ol>
					</div>
					<form:errors path="breakout2">
						<div class="errorMessage">
							<form:errors path="breakout2" htmlEscape="false" />
						</div>
					</form:errors>
				</div>
			</div>



			<div class="gridRow yui-gf">
				<div class="fieldLabel yui-u first">
					<spring:message code="newUserRegistration.label.breakout3" />
				</div>
				<div class="yui-u">
					<div>
						<ol class="myList">
							<form:radiobuttons items="${breakout3Map}" path="breakout3"
								cssClass="myList" element="li" cssErrorClass="error" />
						</ol>
					</div>
					<form:errors path="breakout3">
						<div class="errorMessage">
							<form:errors path="breakout3" htmlEscape="false" />
						</div>
					</form:errors>
				</div>
			</div>



			<div class="gridRow yui-gf">
				<div class="fieldLabel yui-u first">
					<spring:message code="newUserRegistration.label.breakout4" />
				</div>
				<div class="yui-u">
					<div>
						<ol class="myList">
							<form:radiobuttons items="${breakout4Map}" path="breakout4"
								cssClass="myList" element="li" cssErrorClass="error" />
						</ol>
					</div>
					<form:errors path="breakout4">
						<div class="errorMessage">
							<form:errors path="breakout4" htmlEscape="false" />
						</div>
					</form:errors>
				</div>
			</div>





			<div class="gridRow yui-gf">
				<div class="fieldLabel yui-u first">
					<spring:message code="newUserRegistration.label.breakout5" />
				</div>
				<div class="yui-u">
					<div>
						<ol class="myList">
							<form:radiobuttons items="${breakout5Map}" path="breakout5"
								cssClass="myList" element="li" cssErrorClass="error" />
						</ol>
					</div>
					<form:errors path="breakout5">
						<div class="errorMessage">
							<form:errors path="breakout5" htmlEscape="false" />
						</div>
					</form:errors>
				</div>
			</div>





			<div class="gridRow yui-gf">
				<div class="fieldLabel yui-u first">
					<spring:message code="newUserRegistration.label.breakout6" />
				</div>
				<div class="yui-u">
					<div>
						<ol class="myList">
							<form:radiobuttons items="${breakout6Map}" path="breakout6"
								cssClass="myList" element="li" cssErrorClass="error" />
						</ol>
					</div>
					<form:errors path="breakout6">
						<div class="errorMessage">
							<form:errors path="breakout6" htmlEscape="false" />
						</div>
					</form:errors>
				</div>
			</div>




			<div class="gridRow yui-gf">
				<div class="fieldLabel yui-u first">
					<spring:message code="newUserRegistration.label.breakout7" />
				</div>
				<div class="yui-u">
					<div>
						<ol class="myList">
							<form:radiobuttons items="${breakout7Map}" path="breakout7"
								cssClass="myList" element="li" cssErrorClass="error" />
						</ol>
					</div>
					<form:errors path="breakout7">
						<div class="errorMessage">
							<form:errors path="breakout7" htmlEscape="false" />
						</div>
					</form:errors>
				</div>
			</div>




			<div class="gridRow yui-gf">
				<div class="fieldLabel yui-u first">
					<spring:message code="newUserRegistration.label.breakout8" />
				</div>
				<div class="yui-u">
					<div>
						<ol class="myList">
							<form:radiobuttons items="${breakout8Map}" path="breakout8"
								cssClass="myList" element="li" cssErrorClass="error" />
						</ol>
					</div>
					<form:errors path="breakout8">
						<div class="errorMessage">
							<form:errors path="breakout8" htmlEscape="false" />
						</div>
					</form:errors>
				</div>
			</div>





			<div class="gridRow yui-gf">
				<div class="fieldLabel yui-u first">
					<spring:message code="newUserRegistration.label.breakout9" />
				</div>
				<div class="yui-u">
					<div>
						<ol class="myList">
							<form:radiobuttons items="${breakout9Map}" path="breakout9"
								cssClass="myList" element="li" cssErrorClass="error" />
						</ol>
					</div>
					<form:errors path="breakout9">
						<div class="errorMessage">
							<form:errors path="breakout9" htmlEscape="false" />
						</div>
					</form:errors>
				</div>
			</div>



			<div class="gridRow yui-gf">
				<div class="fieldLabel yui-u first">
					<spring:message code="newUserRegistration.label.breakout10" />
				</div>
				<div class="yui-u">
					<div>
						<ol class="myList">
							<form:radiobuttons items="${breakout10Map}" path="breakout10"
								cssClass="myList" element="li" cssErrorClass="error" />
						</ol>
					</div>
					<form:errors path="breakout10">
						<div class="errorMessage">
							<form:errors path="breakout10" htmlEscape="false" />
						</div>
					</form:errors>
				</div>
			</div>











			<div class="gridRow yui-gf">
				<div class="yui-u first"></div>
				<div class="yui-u">
					<input type="submit" value="${register}"></input>
				</div>
			</div>
		</div>
	</form:form>
</body>
</html>