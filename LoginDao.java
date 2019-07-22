/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import sesiones.dataconect;

public class LoginDao {

	public static boolean validate(String user, String password) {
		Connection con = null;
		PreparedStatement ps = null;

		try {
			con = dataconect.getConnection();
			ps = con.prepareStatement("select nombre_usuario from usuario u ,perfil p where u.id_tipo = p.id_tipo  and u.estado = 1 and nombre_usuario= ? and clave_usuario= ? ");
			ps.setString(1, user);
                        
			ps.setString(2, password);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				return true;
			}
		} catch (SQLException ex) {
			System.out.println("Login error -->" + ex.getMessage());
			return false;
		} finally {
			dataconect.close(con);
		}
		return false;
	}
}
