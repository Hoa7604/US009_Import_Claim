<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  

<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <title>Claim import</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!--   <link rel="manifest" href="site.webmanifest"> -->
    <link rel="shortcut icon" type="image/x-icon" href="assets/img/favicon.ico">
	
    <!-- CSS here -->
    <link rel="stylesheet" href="resources/assets/css/bootstrap.min.css">
    <link rel="stylesheet" href="resources/assets/css/fontawesome-all.min.css">
    <link rel="stylesheet" href="resources/assets/css/style.css">
    <link rel="stylesheet" href="resources/assets/css/custom.css">
	<%@ page isELIgnored="false" %>
</head>
<body>
    <header style="border-bottom: 1px solid #ddd;">
        <!-- Header Start -->
        <div class="container">
            <div class="main-header ">
                <div class="header-bottom">
                    <div class="row align-items-center">
                        <!-- Logo -->
                        <div class="col-xl-2 col-lg-2">
                            <div class="logo">
                                <a href="/import_claim/importclaim">
                                    <svg xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" version="1.1" id="Layer_1" x="0px" y="0px" viewBox="0 0 376.5 99.86" style="enable-background:new 0 0 376.5 99.86;" xml:space="preserve" height="77px" width="300px">
                                        <path d="M49.87,46.72c0-4.64-3.69-8.3-8.28-8.3h-3.6V55h3.6C46.17,55,49.87,51.34,49.87,46.72 M56.34,49.41l-5.87,10.13h11.7  L56.34,49.41z M56.34,44.02l5.83-10.13h-11.7L56.34,44.02z M62.79,46.72c0,4.62,3.69,8.28,8.28,8.28h3.6V38.41h-3.6  C66.48,38.41,62.79,42.07,62.79,46.72 M330.64,60.21c-1.34,3.39-3.02,5.01-6.84,5.01c-0.9,0-1.62-0.06-2.21-0.16V60.8  c0.53,0.09,1.28,0.19,1.68,0.19c1.28,0,2.08-0.5,2.74-2.08l0.4-1l-6.9-16.14h5.54l4.01,9.92l3.7-9.89h5.23L330.64,60.21   M308.87,53.9c-2.24,0-3.79-1.87-3.79-4.07s1.56-4.11,3.79-4.11c2.33,0,3.89,1.9,3.89,4.11S311.2,53.9,308.87,53.9 M317.86,58.16  V41.77h-5.01v2.36c-0.93-1.71-3.02-2.77-5.07-2.77c-4.7,0-7.81,3.64-7.81,8.46c0,4.79,3.23,8.18,7.87,8.18  c2.08,0,4.07-1.03,4.95-2.49v2.77c0,2.3-1.21,3.58-3.64,3.58c-2.15,0-3.33-1-3.55-2.46h-5.04c0.28,3.58,3.11,6.13,8.46,6.13  C314.96,65.53,317.86,62.85,317.86,58.16 M289.43,53.9c-2.3,0-3.79-1.84-3.79-4.07c0-2.24,1.49-4.11,3.79-4.11  c2.3,0,3.83,1.87,3.83,4.11C293.26,52.06,291.73,53.9,289.43,53.9 M289.43,58.28c5.6,0,8.93-3.89,8.93-8.46  c0-4.6-3.33-8.49-8.93-8.49c-5.54,0-8.9,3.89-8.9,8.49C280.53,54.39,283.89,58.28,289.43,58.28 M273.01,57.85h5.07V34.52h-5.07  V57.85z M261.62,53.9c-2.3,0-3.79-1.84-3.79-4.07c0-2.24,1.49-4.11,3.79-4.11c2.3,0,3.83,1.87,3.83,4.11  C265.45,52.06,263.93,53.9,261.62,53.9 M261.62,58.28c5.6,0,8.93-3.89,8.93-8.46c0-4.6-3.33-8.49-8.93-8.49  c-5.54,0-8.9,3.89-8.9,8.49C252.73,54.39,256.09,58.28,261.62,58.28 M234.25,57.85h5.07v-8.4c0-2.27,1.06-3.73,3.11-3.73  c2.18,0,2.86,1.34,2.86,3.27v8.86h5.07v-9.24c0-4.54-1.99-7.25-6.06-7.25c-2.39,0-4.14,1.06-5.04,2.74v-2.33h-5.01V57.85z   M214.94,57.85h5.07v-8.4c0-2.27,1.06-3.73,3.11-3.73c2.18,0,2.86,1.34,2.86,3.27v8.86h5.07v-9.24c0-4.54-1.99-7.25-6.06-7.25  c-2.36,0-4.07,1.06-4.98,2.74v-9.58h-5.07V57.85z M212.67,47.96c-0.62-3.73-3.39-6.62-8.24-6.62c-5.44,0-8.74,3.89-8.74,8.49  c0,4.57,3.3,8.46,8.74,8.46c4.85,0,7.62-2.89,8.24-6.62h-5.1c-0.44,1.4-1.52,2.33-3.11,2.33c-2.24,0-3.67-1.9-3.67-4.17  s1.43-4.2,3.67-4.2c1.59,0,2.64,0.93,3.08,2.33H212.67z M185.73,44.94c1.93,0,3.17,1.21,3.36,3.11h-6.81  C182.47,46.09,183.84,44.94,185.73,44.94 M193.67,52.96h-4.82c-0.53,0.96-1.46,1.65-3.05,1.65c-2.3,0-3.45-1.46-3.55-3.48h11.69  c0.09-0.75,0.12-1.31,0.12-1.9c0-4.26-2.95-7.9-8.27-7.9c-5.47,0-8.46,3.83-8.46,8.49c0,4.63,3.02,8.46,8.52,8.46  C190.24,58.28,192.86,55.95,193.67,52.96 M164.21,41.77v3.98h2.52v6.53c0,4.42,2.11,5.82,5.94,5.82c1.4,0,2.46-0.12,3.17-0.25v-4.07  c-0.62,0.09-1.56,0.19-2.02,0.19c-1.31,0-2.02-0.44-2.02-2.05v-6.16h3.67v-3.98h-3.67v-4.76h-5.07v4.76H164.21z M157.34,54.89  c0,1.77,1.43,3.23,3.23,3.23c1.84,0,3.23-1.46,3.23-3.23c0-1.77-1.4-3.23-3.23-3.23C158.77,51.66,157.34,53.12,157.34,54.89   M144.93,58.25c6.44,0,9.95-3.86,10.64-8.77h-5.32c-0.5,2.33-2.43,4.07-5.19,4.07c-4.01,0-6.1-3.2-6.1-6.9c0-3.7,2.08-6.9,6.1-6.9  c2.77,0,4.7,1.74,5.19,4.07h5.32c-0.68-4.91-4.2-8.77-10.64-8.77c-7.18,0-11.35,5.47-11.35,11.6S137.75,58.25,144.93,58.25   M127.48,57.85h6.16l-7.25-11.26l7.18-11.13h-6.03l-4.45,7.37l-4.51-7.37h-6.13l7.22,11.13l-7.28,11.26h6l4.57-7.46L127.48,57.85z   M100.77,39.99c4.14,0,6.5,3.23,6.5,6.66c0,3.39-2.36,6.66-6.5,6.66h-2.71V39.99H100.77z M92.8,57.85h8.21  c7.46,0,11.63-5.47,11.63-11.2s-4.2-11.2-11.63-11.2H92.8V57.85z"></path>
                                    </svg>
                                    <!-- <img src="assets/img/logo/logo.png" alt=""> -->
                                </a>
                            </div>
                        </div>
                        <div class="col-xl-10 col-lg-10">
                            <div class="menu-wrapper d-flex align-items-center justify-content-end">
                                <!-- Main-menu -->
                                <div class="main-menu d-none d-lg-block">
                                    <nav>
                                        <ul id="navigation">
                                            <li class="active"><a href="index.html">Home</a></li>
                                            <!-- <li><a href="courses.html">Courses</a></li> -->
                                            <li><a href="about.html">About</a></li>
                                            <li><a href="contact.html">Contact</a></li>
                                        </ul>
                                    </nav>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- Header End -->
    </header>
    <main>
        <!-- Courses area start -->
        <div class="courses-area section-padding40 fix">
            <div class="container">
                <!-- Single -->
                <div class="row align-items-center">
                    <div class="col-xl-12 col-lg-12">
                        <h2 class="tit-cnt">Import Claim</h2>
                    </div>
                    <div class="col-xl-2 col-lg-2">
                        <form action = "findclaim" method = "POST" id="claimimport">
                            <div class="form-group">
                              <label for="formGroupExampleInput">Claim No</label>
                              <input type="text" name="id_claimno" class="form-control" id="id_claimno" placeholder="Claim No">
                            </div>
                            <div class="form-group">
                              <label for="formGroupExampleInput2">Policy No</label>
                              <input type="text" name="id_policyno" class="form-control" id="policyno" placeholder="Policy No">
                            </div>
                            <div class="form-group">
                                <label for="formGroupExampleInput2">Policy Owner</label>
                                <input type="text" name="id_policyowner" class="form-control" id="policyowner" placeholder="Policy Owner">
                              </div>
                            <button type="submit" class="btn btn-primary" class="search">Search</button>
                          </form>
                    </div>
                    <div class="col-xl-10 col-lg-10 display-cnt">
                        <table class="table table-bordered">
                            <thead>
                                <tr>
                                    <th scope="col">Claim No</th>
                                    <th scope="col">Policy No</th>
                                    <th scope="col">Date Occurred</th>
                                    <th scope="col">Policy Owner</th>
                                    <th scope="col">Engine No</th>
                                    <th scope="col">Chassis No</th>
                                    <th scope="col">Vehicle Register No</th>
                                    <th scope="col">Reserve Currency</th>
                                    <th scope="col">Reserve Amount</th>
                                </tr>
                            </thead>
                            <tbody id="row">
                            
                            <c:forEach var="claimList" items="${ClaimList}">
                            	 <tr>
                                    <th scope="row">${claimList.claim_no}</th>
                                    <td>${claimList.policy_no}</td>
                                    <td>${claimList.date_occurred}</td>
                                    <td>${claimList.policy_owner}</td>
                                    <td>${claimList.engine_no}</td>
                                    <td>${claimList.chassis_no}</td>
                                    <td>${claimList.vehicle_registration_no}</td>
                                    <td>${claimList.reserve_currency}</td>
                                    <td>${claimList.reserve_amount}</td>
                                </tr>
                            </c:forEach>
                            <c:set var = "sign" scope = "session" value = "${sym}"/>
                            <c:choose>
         
					         <c:when test = "${sign == 1}">
					            <tr>
                                    <th scope="row">${ClaimNo.claim_no}</th>
                                    <td>${ClaimNo.policy_no}</td>
                                    <td>${ClaimNo.date_occurred}</td>
                                    <td>${ClaimNo.policy_owner}</td>
                                    <td>${ClaimNo.engine_no}</td>
                                    <td>${ClaimNo.chassis_no}</td>
                                    <td>${ClaimNo.vehicle_registration_no}</td>
                                    <td>${ClaimNo.reserve_currency}</td>
                                    <td>${ClaimNo.reserve_amount}</td>
                                </tr>
					         </c:when>
					         
					         <c:when test = "${sign == 2}">
					            <c:forEach var="policyno" items="${PolicyNoClaim}">
	                            	 <tr>
	                                    <th scope="row">${policyno.claim_no}</th>
	                                    <td>${policyno.policy_no}</td>
	                                    <td>${policyno.date_occurred}</td>
	                                    <td>${policyno.policy_owner}</td>
	                                    <td>${policyno.engine_no}</td>
	                                    <td>${policyno.chassis_no}</td>
	                                    <td>${policyno.vehicle_registration_no}</td>
	                                    <td>${policyno.reserve_currency}</td>
	                                    <td>${policyno.reserve_amount}</td>
	                                </tr>
                            	</c:forEach>
					         </c:when>
					         
					          <c:when test = "${sign == 3}">
					            <c:forEach var="policyowner" items="${PolicyOwnerClaim}">
	                            	 <tr>
	                                    <th scope="row">${policyowner.claim_no}</th>
	                                    <td>${policyowner.policy_no}</td>
	                                    <td>${policyowner.date_occurred}</td>
	                                    <td>${policyowner.policy_owner}</td>
	                                    <td>${policyowner.engine_no}</td>
	                                    <td>${policyowner.chassis_no}</td>
	                                    <td>${policyowner.vehicle_registration_no}</td>
	                                    <td>${policyowner.reserve_currency}</td>
	                                    <td>${policyowner.reserve_amount}</td>
	                                </tr>
                            	</c:forEach>
					         </c:when>
					         
					          <c:when test = "${sign == 4}">
					            <c:forEach var="claimall" items="${ClaimAll}">
	                            	 <tr>
	                                    <th scope="row">${claimall.claim_no}</th>
	                                    <td>${claimall.policy_no}</td>
	                                    <td>${claimall.date_occurred}</td>
	                                    <td>${claimall.policy_owner}</td>
	                                    <td>${claimall.engine_no}</td>
	                                    <td>${claimall.chassis_no}</td>
	                                    <td>${claimall.vehicle_registration_no}</td>
	                                    <td>${claimall.reserve_currency}</td>
	                                    <td>${claimall.reserve_amount}</td>
	                                </tr>
                            	</c:forEach>
					         </c:when>
					         
					         <c:when test = "${sign == 5}">
					            <c:forEach var="importfile" items="${DataImportFile}">
	                            	 <tr>
	                                    <th scope="row">${importfile.claim_no}</th>
	                                    <td>${importfile.policy_no}</td>
	                                    <td>${importfile.date_occurred}</td>
	                                    <td>${importfile.policy_owner}</td>
	                                    <td>${importfile.engine_no}</td>
	                                    <td>${importfile.chassis_no}</td>
	                                    <td>${importfile.vehicle_registration_no}</td>
	                                    <td>${importfile.reserve_currency}</td>
	                                    <td>${importfile.reserve_amount}</td>
	                                </tr>
                            	</c:forEach>
					         </c:when>
					         
					      </c:choose>
                            </tbody>
                        </table>
                        <form action="uploadFile" method="post" enctype=???multipart/form-data???>
                            <input type="file" name="file" accept=".xls,.xlsx"/>
                            <input type="submit" value="Upload File" class="submit-upload"/>
                        </form>
                    </div>

                </div>
               
            </div>
        </div>
        <!-- Courses area End -->

    </main>
    <footer>
        <div class="footer-wrappper footer-bg">
            <!-- Footer Start-->
            <div class="footer-bottom-area">
                <div class="container">
                    <div class="footer-border">
                        <div class="row d-flex align-items-center">
                            <div class="col-xl-12 ">
                                <div class="footer-copy-right text-center">
                                    <p>
                                        <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
                                        Copyright &copy;
                                        <script>document.write(new Date().getFullYear());</script> All rights reserved
                                        by <a href="https://colorlib.com" target="_blank">Colorlib</a>
                                        <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
                                    </p>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- Footer End-->
        </div>
    </footer>
<!--     <script type="text/javascript">
    $(document).ready(function(){
    	 $('.search').click(function () {
    	    	var name = $("#claimno").val();
    	    	alert("hello");
    	    });
    });
   
    </script> -->
</body>

</html>