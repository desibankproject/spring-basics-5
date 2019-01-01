package com.spring.dao;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * 
 * @author Nagendra
 *
 */
public class BizDao implements IBizDao {
	private String email;
	
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public int deleteProductByPid(String pid){
		String sql="delete from products_tbl where pid=?";
		int rows=jdbcTemplate.update(sql,new Object[]{pid});
		return rows;
	}
	
	@Override
	public List<Product> findProducts(){
		String sql="select pid,name,category,price,doe from products_tbl";
		List<Product> products=jdbcTemplate.query(sql,new BeanPropertyRowMapper(Product.class));
		return products;
	}

	@Override
	public void addProduct(Product product){
			//it;s constructor
			Timestamp timestamp=new Timestamp(new Date().getTime());
			String sql="insert into products_tbl(pid,name,category,price,doe) values(?,?,?,?,?)";
			Object[] data=new Object[]{product.getPid(),product.getName(),product.getCategory(),product.getPrice(),timestamp};
			jdbcTemplate.update(sql,data);
			/*//here we have to write logic to save data into the database!
			PreparedStatement pstmt=null;
			Connection conn=null;
			try {
				//Transaction management code is missing here
				Class.forName("com.mysql.jdbc.Driver");
				conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/springbootdb","root","mysql@1234");
				String sql="insert into products_tbl(pid,name,category,price,doe) values(?,?,?,?,?)";
				pstmt=conn.prepareStatement(sql);
				pstmt.setString(1,product.getPid());
				pstmt.setString(2,product.getName());
				pstmt.setString(3,product.getCategory());
				pstmt.setFloat(4,product.getPrice());
				Timestamp timestamp=new Timestamp(new Date().getTime());
				pstmt.setTimestamp(5,timestamp);
				int rows=pstmt.executeUpdate();
			}catch(Exception e){
				e.printStackTrace();
			}finally{
					if(pstmt!=null){
						try {
							pstmt.close();
							conn.close();
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
			}*/
			
			System.out.println("Hey! product has been saved successfully into the database!");
	}
}
