package com.example.demo;


import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;
import org.hibernate.jdbc.Work;

public class AimlSequence implements IdentifierGenerator{
	
	String prefix = "aiml";
	String suffix = "";
	
	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) {
		
		session.doWork(new Work() {

			@Override
			public void execute(Connection conn) throws SQLException {
				try {
					Statement st = conn.createStatement();
					ResultSet rs = st.executeQuery("select count(id) from cse_id_gen");
					
					if(rs.next()) {
						Integer id = rs.getInt(1) + 1;
						suffix = id.toString();
					}
				}
				catch(Exception e) {
					e.printStackTrace();
				}
				
			}
			
			
		});
		return prefix + suffix;
	}
	
	
}
