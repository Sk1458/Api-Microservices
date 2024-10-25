package com.example.demo;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;
import org.hibernate.jdbc.Work;
import org.springframework.stereotype.Component;

@Component
public class CseSequence implements IdentifierGenerator{
	String finalPrefix = "cse";
	String suffix = "";
	
	
	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		
		session.doWork(new Work() {
			@Override
			public void execute(Connection conn) throws SQLException {
				try {
					Statement st =  conn.createStatement(); //the statement object allows to send SQl queries to the DB.
					ResultSet rs = st.executeQuery("select count(id) from cse_id_gen"); //Resultset is a datatype which store the info retrieved from the DB.
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
		return finalPrefix + suffix;
	}
	
}
