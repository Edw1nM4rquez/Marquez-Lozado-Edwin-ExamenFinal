<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<title>Insert title here</title>
<head>
    <title>Liquor Store - Free Bootstrap 4 Template by Colorlib</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    
    <link href="https://fonts.googleapis.com/css2?family=Spectral:ital,wght@0,200;0,300;0,400;0,500;0,700;0,800;1,200;1,300;1,400;1,500;1,700&display=swap" rel="stylesheet">

    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">

	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <link rel="stylesheet" href="css/animate.css">
    
    <link rel="stylesheet" href="css/owl.carousel.min.css">
    <link rel="stylesheet" href="css/owl.theme.default.min.css">
    <link rel="stylesheet" href="css/magnific-popup.css">
    
    <link rel="stylesheet" href="css/flaticon.css">
    <link rel="stylesheet" href="css/style.css">
  </head>
  <body>
<c:if test="${not empty Message}">
   <c:out value="${Message}"/>
</c:if>
  	<div class="wrap">
			<div class="container">
				<div class="row">
					<div class="col-md-6 d-flex align-items-center">
						<p class="mb-0 phone pl-md-2">
							<a href="#" class="mr-2"><span class="fa fa-phone mr-1"></span> +00 1234 567</a> 
							
							<a href="#"><span class="fa fa-paper-plane mr-1"></span>emarquezl@est.ups.edu.ec</a>
						</p>
					</div>
					<div class="col-md-6 d-flex justify-content-md-end">
						
		        
					</div>
				</div>
			</div>
		</div>
    
	  <nav class="navbar navbar-expand-lg navbar-dark ftco_navbar bg-dark ftco-navbar-light" id="ftco-navbar">
	    <div class="container">
	      <a class="navbar-brand" href="index.html">Ped  <span>idos </span></a>
	      <div class="order-lg-last btn-group">
         
        </div>

	      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#ftco-nav" aria-controls="ftco-nav" aria-expanded="false" aria-label="Toggle navigation">
	        <span class="oi oi-menu"></span> Inicio
	      </button>

	      <div class="collapse navbar-collapse" id="ftco-nav">
	        <ul class="navbar-nav ml-auto">
			  <li class="nav-item active"><a href="/ExamenCoreccion/index.html" class="nav-link">Inicio</a></li>
	          <li class="nav-item active"><a href="/ExamenCoreccion/CrearTarjeta?tarjetas=all" class="nav-link">Crear/Listar Tarjeta de credito</a></li>
	          <li class="nav-item active"><a href="/ExamenCoreccion/Publica/crear_pedido.jsp">Crear Pedido</a></li>
	          <li class="nav-item active"><a  href="/ExamenCoreccion/ListarPedidos?pedidos=all" class="nav-link">Buscar/Listar Precios</a></li>
	          
	        </ul>
	      </div>
	    </div>
	  </nav>
    <!-- END nav -->
    
    <div class="hero-wrap" style="background-image: url('images/flores.jpg');" data-stellar-background-ratio="0.5">
      <div class="overlay"></div>
      <div class="container">
        <div class="row no-gutters slider-text align-items-center justify-content-center">
          <div class="col-md-8 ftco-animate d-flex align-items-end">
          	<div class="text w-100 text-center">
	            <h1 class="mb-4">Tarjeta<span>Pedidos</span> Comida <span> (JPA)</span>.</h1>
	           <!-- <p><a href="#" class="btn btn-primary py-2 px-4">Shop Now</a> <a href="#" class="btn btn-white btn-outline-white py-2 px-4">Read more</a></p>
				-->
			</div>
          </div>
        </div>
      </div>
    </div>
<!-- ---------------------------------------------------------------------- -->
 
 <div class="container3"> 
    <h3 align="center">CREAR PEDIDO</h3>
                    <form action="/ExamenCoreccion/CrearPedido" method="POST" >
                       
                        <div class="form-row">
                            <div class="form-group">
                                <label for="nombres">Cliente</label>
                                <input type="text" class="form-input" name="cliente"  placeholder="Juan Esteban"   required />
                            </div>
                            <div class="form-group">
                                <label for="apellidos">Observaciones</label>
                                <input type="text" class="form-input" name="observaciones" placeholder="Observaciones" required />
                            </div>
                            <div class="form-group">
                                <label for="apellidos"># Tarjeta Credito</label>
                                <input type="text" class="form-input" name="tarjetaCredito"  required="" placeholder="5346798798546" minlength="14" maxlength="16" pattern="[0-9]+" />
                            </div>
                        </div>
						<h3 align="center">Agregar Comidas</h3>

                        <div class="form-row">
                            <div class="form-group">
                                <label for="nombres">Nombre</label>
                                <input type="text" class="form-input" name="nombre1"  placeholder="chaulafan"   required />
                            </div>
                            <div class="form-group">
                                <label for="apellidos">Precio</label>
                                <input type="text" class="form-input" name="precio1" placeholder="10.99" required />
                            </div>
                        </div>
                                                <div class="form-row">
                            <div class="form-group">
                                <label for="nombres">Nombre</label>
                                <input type="text" class="form-input" name="nombre2"  placeholder="chaulafan"    />
                            </div>
                            <div class="form-group">
                                <label for="apellidos">Precio</label>
                                <input type="text" class="form-input" name="precio2" placeholder="10.99"  />
                            </div>
                        </div>
                                                <div class="form-row">
                            <div class="form-group">
                                <label for="nombres">Nombre</label>
                                <input type="text" class="form-input" name="nombre3"  placeholder="chaulafan"    />
                            </div>
                            <div class="form-group">
                                <label for="apellidos">Precio</label>
                                <input type="text" class="form-input" name="precio3" placeholder="10.99"  />
                            </div>
                        </div>
                        

                        <div class="form-group">
                            <input type="submit" name="crearPedido" id="submit" class="form-submit" value="Crear Pedido"/>
                        </div>
                    </form>
 </div>        
                                                  
 
<!-- ---------------------------------------------------------------------- -->

		<section class="ftco-section ftco-no-pb">
			<div class="container">
				<div class="row">
					<div class="col-lg-2 col-md-4 ">
						<div class="sort w-100 text-center ftco-animate">
							<div class="img" style="background-image: url(images/kind-1.jpg);"></div>
							<h3>Bandera</h3>
						</div>
					</div>
					<div class="col-lg-2 col-md-4 ">
						<div class="sort w-100 text-center ftco-animate">
							<div class="img" style="background-image: url(images/kind-2.jpg);"></div>
							<h3>Chaulafan</h3>
						</div>
					</div>
					<div class="col-lg-2 col-md-4 ">
						<div class="sort w-100 text-center ftco-animate">
							<div class="img" style="background-image: url(images/kind-3.jpg);"></div>
							<h3>Arroz con pollo</h3>
						</div>
					</div>
					<div class="col-lg-2 col-md-4 ">
						<div class="sort w-100 text-center ftco-animate">
							<div class="img" style="background-image: url(images/kind-4.jpg);"></div>
							<h3>Cuy</h3>
						</div>
					</div>
					<div class="col-lg-2 col-md-4 ">
						<div class="sort w-100 text-center ftco-animate">
							<div class="img" style="background-image: url(images/kind-5.jpg);"></div>
							<h3>Menestra</h3>
						</div>
					</div>
					<div class="col-lg-2 col-md-4 ">
						<div class="sort w-100 text-center ftco-animate">
							<div class="img" style="background-image: url(images/kind-6.jpg);"></div>
							<h3>Salchipapa</h3>
						</div>  
					</div>

				</div>
			</div>
		</section>

		
  


    <footer class="ftco-footer">
      <div class="container">
        <div class="row mb-5">
          <div class="col-sm-12 col-md">
            <div class="ftco-footer-widget mb-4">
              <h2 class="ftco-heading-2 logo"><a href="#">Ped <span>idos </span></a></h2>
              <p>Comida!</p>
              <ul class="ftco-footer-social list-unstyled mt-2">
                <li class="ftco-animate"><a href="#"><span class="fa fa-twitter"></span></a></li>
                <li class="ftco-animate"><a href="#"><span class="fa fa-facebook"></span></a></li>
                <li class="ftco-animate"><a href="#"><span class="fa fa-instagram"></span></a></li>
              </ul>
            </div>
          </div>
          
          
         
          <div class="col-sm-12 col-md">
            <div class="ftco-footer-widget mb-4">
            	<h2 class="ftco-heading-2">Any questions ?</h2>
            	<div class="block-23 mb-3">
	              <ul>
	                <li><span class="icon fa fa-map marker"></span><span class="text">Cuenca - Ecuador</span></li>
	                <li><a href="#"><span class="icon fa fa-phone"></span><span class="text">+2 392 3929 210</span></a></li>
					
					<li><a href="#"><span class="icon fa fa-paper-plane pr-4"></span><span class="text">emarquez@est.ups.edu.ec </span></a></li>
	              </ul>
	            </div>
            </div>
          </div>
        </div>
      </div>
	  
	  
	  <div class="container-fluid px-0 py-5 bg-black">
		<div class="container">
			<div class="row">
			<div class="col-md-12">
	  
			  <p class="mb-0" style="color: rgba(255,255,255,.5);"><!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
	Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This is a design made by : <a href="https://colorlib.com" target="_blank"> Edwin Marquez</a>
	<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. --></p>
			</div>
		  </div>
		</div>
	</div>

    </footer>
    
  

  <!-- loader -->
  <div id="ftco-loader" class="show fullscreen"><svg class="circular" width="48px" height="48px"><circle class="path-bg" cx="24" cy="24" r="22" fill="none" stroke-width="4" stroke="#eeeeee"/><circle class="path" cx="24" cy="24" r="22" fill="none" stroke-width="4" stroke-miterlimit="10" stroke="#F96D00"/></svg></div>


  <script src="js/jquery.min.js"></script>
  <script src="js/jquery-migrate-3.0.1.min.js"></script>
  <script src="js/popper.min.js"></script>
  <script src="js/bootstrap.min.js"></script>
  <script src="js/jquery.easing.1.3.js"></script>
  <script src="js/jquery.waypoints.min.js"></script>
  <script src="js/jquery.stellar.min.js"></script>
  <script src="js/owl.carousel.min.js"></script>
  <script src="js/jquery.magnific-popup.min.js"></script>
  <script src="js/jquery.animateNumber.min.js"></script>
  <script src="js/scrollax.min.js"></script>
  <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBVWaKrjvy3MaE7SQ74_uJiULgl1JY0H2s&sensor=false"></script>
  <script src="js/google-map.js"></script>
  <script src="js/main.js"></script>
    
  </body>
</html>