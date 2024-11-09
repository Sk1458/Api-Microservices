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

public class RegSeqGenerator implements IdentifierGenerator {
	String prefix="REG";
	String suffix="";
	
	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException{
		// TODO Auto-generated method stub
		
		session.doWork(new Work() {
			public void execute(Connection conn) throws SQLException {
				try {
					 Statement st=conn.createStatement();
					 ResultSet rs=st.executeQuery("select count(id) from security_reg");
					 if(rs.next()) {
						 Integer id = rs.getInt(1) + 1;
						 suffix=id.toString();
					 }
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
			
		});
		
		return prefix+suffix;
	}

}
