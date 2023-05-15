package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class dao {

	public int insertBoard(Board board) {

		int result = 0;

		String query = "INSERT INTO BOARD VALUES(SEQ_BNO.NEXTVAL, ?, ?, DEFAULT,DEFAULT, ?)";

		
		try {
			
		
		Connection con =DriverManager.getConnection(query);
		PreparedStatement pstmt = con.prepareStatement(query);
		pstmt.setInt(1, board.getMemberNo());
		pstmt.setString(2, board.getBoardTitle());
		pstmt.setString(3, board.getBoardContent());
		pstmt.executeUpdate();

		} catch (SQLException e) {

		e.printStackTrace();

		} finally {

		try{

		pstmt.close(); con.close();

		} catch (Exception e) {

		e.printStackTrace();

		}

		}

		return result;

		}
			
}
