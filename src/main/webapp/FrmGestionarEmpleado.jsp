
<%@page import="java.util.*" %>
<%@page import="model.*" %>

<html>
<body bgcolor = "#C5DEC9">
	<h2 align="Center">Registrar Empleado</h2>

	<form method = "post" action="ControladorServletEmpleado">
		<table border="2" align = "center">
			<tr>
				<td>Nombre</td>
				<td><input type="text" name="nombre"></td>
			</tr>
			<tr>
				<td>Apellido</td>
				<td><input type="text" name="apellido"></td>
			</tr>
			<tr>
				<td colspan="2"><select name="sexo">
						<option>Seleccione Sexo</option>
						<option>M</option>
						<option>F</option>
				</select></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="text" name="email"></td>
			</tr>
			<tr>
				<td>Fecha Nacimiento</td>
				<td><input type="text" name="fecha"></td>
			</tr>
			<tr>
				<td>Telefono</td>
				<td><input type="text" name="telefono"></td>
			</tr>
			<tr>
				<td>DNI</td>
				<td><input type="text" name="dni"></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
				<input type="submit" value="Registrar">
				</td>
			</tr>
		</table>
	</form>
<h1 align="center"> Listado de Empleados </h1>
<table align="center" border="2">
<tr>
<th>Código</th>
<th>Nombre</th>
<th>Apellido</th>
<th>Sexo</th>
<th>Email</th>
<th>Fecha</th>
<th>Telefono</th>
<th>DNI</th>
</tr>

<%
//Recuperamos lo que vuelve del controlador
List<TblEmpleado> listado = (List<TblEmpleado>)request.getAttribute("listado");

if (listado!= null)
{
	for(TblEmpleado tbemp:listado)
	{
		
%>
<tr>
<td><%=tbemp.getIdempleado() %></td>
<td><%=tbemp.getNombre() %></td>
<td><%=tbemp.getApellido() %></td>
<td><%=tbemp.getSexo() %></td>
<td><%=tbemp.getEmail() %></td>
<td><%=tbemp.getFechanac() %></td>
<td><%=tbemp.getTel() %></td>
<td><%=tbemp.getDni() %></td>
</tr>
<%
	}
}
%>

</table>
</body>
</html>
