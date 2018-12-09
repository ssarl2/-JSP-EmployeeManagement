package dongseo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import table.*;

public class ESDao {
Connection connection;
	
	public void setConnection(Connection connection) {
		this.connection = connection;
	}
	
	
	//DB에서 배열의 객체에 info데이터를 담아 객체를 반환 ------------- info
	public List<ESInfo> selectListInfo() throws Exception {
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			stmt = connection.createStatement();
			rs = stmt.executeQuery("select * from info");
			
			ArrayList<ESInfo> esInfos = new ArrayList<ESInfo>();
			
			while (rs.next()){
				esInfos.add(new ESInfo()
						.setEno(rs.getInt("eno"))
						.setEname(rs.getString("ename"))
						.setPower(rs.getInt("power"))
						.setSex(rs.getString("sex"))
						.setDeptNo(rs.getInt("deptno"))
						.setPhone(rs.getString("phone"))
						.setAddress(rs.getString("address"))
						.setJoinDate(rs.getString("joindate"))
						);
			}
			return esInfos;
		} catch (Exception e) {
			throw e;
		} finally {
			try {if (rs != null) rs.close();} catch(Exception e) {}
			try {if (stmt != null) rs.close();} catch(Exception e) {}
		}
	}
	//DB에서 info데이터를 선택 번호에 맞추어 꺼내고 객체에 담아(저장X) 반환 ------------- info
	public ESInfo selectInfo(int eno) throws Exception {
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = connection.createStatement();
			rs = stmt.executeQuery("select * from info where eno="+eno);
			if(rs.next()) {
				return new ESInfo()
						.setEno(rs.getInt("eno"))
						.setEname(rs.getString("ename"))
						.setPower(rs.getInt("power"))
						.setSex(rs.getString("sex"))
						.setDeptNo(rs.getInt("deptno"))
						.setPhone(rs.getString("phone"))
						.setAddress(rs.getString("address"))
						.setJoinDate(rs.getString("joindate"));
			} else {
				throw new Exception("해당 번호의 회원을 찾을 수 없습니다.");
			}
		} catch (Exception e) {
			throw e;
	    } finally {
	      try {if (rs != null) rs.close();} catch(Exception e) {}
	      try {if (stmt != null) stmt.close();} catch(Exception e) {}
	    }
	  }
	
	
	//DB에서 배열의 객체에 dept데이터를 담아 객체를 반환 ------------- dept
	public List<ESDept> selectListDept() throws Exception {
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			stmt = connection.createStatement();
			rs = stmt.executeQuery(
					"select * from dept");
			
			ArrayList<ESDept> esDepts = new ArrayList<ESDept>();
			
			while (rs.next()){
				esDepts.add(new ESDept()
						.setDeptNo(rs.getInt("deptno"))
						.setDeptName(rs.getString("deptname"))
						.setManager(rs.getString("manager"))
						);
			}
			return esDepts;
		} catch (Exception e) {
			throw e;
		} finally {
			try {if (rs != null) rs.close();} catch(Exception e) {}
			try {if (stmt != null) rs.close();} catch(Exception e) {}
		}
	}
	//DB에서 dept데이터를 선택 번호에 맞추어 꺼내고 객체에 담아(저장X) 반환 ------------- dept
	public ESDept selectDept(int deptno) throws Exception {
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = connection.createStatement();
			rs = stmt.executeQuery(
					"select * from dept where deptno="+deptno);
			if(rs.next()) {
				return new ESDept()
						.setDeptNo(rs.getInt("deptno"))
						.setDeptName(rs.getString("deptname"))
						.setManager(rs.getString("manager"));
			} else {
				throw new Exception("해당 번호의 회원을 찾을 수 없습니다.");
			}
		} catch (Exception e) {
			throw e;
	    } finally {
	      try {if (rs != null) rs.close();} catch(Exception e) {}
	      try {if (stmt != null) stmt.close();} catch(Exception e) {}
	    }
	  }
	
	
	//DB에서 배열의 객체에 commute데이터를 담아 객체를 반환  ------------- commute
	public List<ESCommute> selectListCommute() throws Exception {
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			stmt = connection.createStatement();
			rs = stmt.executeQuery(
					"select * from commute");
			
			ArrayList<ESCommute> esCommutes = new ArrayList<ESCommute>();
			
			while (rs.next()){
				esCommutes.add(new ESCommute()
						.setEno(rs.getInt("eno"))
						.setCin(rs.getString("cin"))
						.setCout(rs.getString("cout"))
						);
			}
			return esCommutes;
		} catch (Exception e) {
			throw e;
		} finally {
			try {if (rs != null) rs.close();} catch(Exception e) {}
			try {if (stmt != null) rs.close();} catch(Exception e) {}
		}
	}
	//DB에서 commute데이터를 선택 번호에 맞추어 꺼내고 객체에 담아(저장X) 반환 ------------- commute
	public ESCommute selectCommute(int eno) throws Exception {
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = connection.createStatement();
			rs = stmt.executeQuery(
					"select * from commute where eno="+eno);
			if(rs.next()) {
				return new ESCommute()
						.setEno(rs.getInt("eno"))
						.setCin(rs.getString("cin"))
						.setCout(rs.getString("cout"));
			} else {
				throw new Exception("해당 번호의 회원을 찾을 수 없습니다.");
			}
		} catch (Exception e) {
			throw e;
	    } finally {
	      try {if (rs != null) rs.close();} catch(Exception e) {}
	      try {if (stmt != null) stmt.close();} catch(Exception e) {}
	    }
	  }
	
	
	//DB에서 배열의 객체에 data데이터를 담아 객체를 반환 ------------- data
	public List<ESData> selectListData() throws Exception {
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			stmt = connection.createStatement();
			rs = stmt.executeQuery(
					"select * from edata");
			
			ArrayList<ESData> esDatas = new ArrayList<ESData>();
			
			while (rs.next()){
				esDatas.add(new ESData()
						.setFno(rs.getInt("fno"))
						.setPower(rs.getInt("power"))
						.setData(rs.getString("data"))
						);
			}
			return esDatas;
		} catch (Exception e) {
			throw e;
		} finally {
			try {if (rs != null) rs.close();} catch(Exception e) {}
			try {if (stmt != null) rs.close();} catch(Exception e) {}
		}
	}
	//DB에서 data데이터를 선택 번호에 맞추어 꺼내고 객체에 담아(저장X) 반환 ------------- data
	public ESData selectData(int fno) throws Exception {
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = connection.createStatement();
			rs = stmt.executeQuery(
					"select * from edata where fno="+fno);
			if(rs.next()) {
				return new ESData()
						.setFno(rs.getInt("fno"))
						.setPower(rs.getInt("power"))
						.setData(rs.getString("data"));
			} else {
				throw new Exception("해당 번호의 회원을 찾을 수 없습니다.");
			}
		} catch (Exception e) {
			throw e;
	    } finally {
	      try {if (rs != null) rs.close();} catch(Exception e) {}
	      try {if (stmt != null) stmt.close();} catch(Exception e) {}
	    }
	  }
	
	
	
	//info 추가
	public int insert(ESInfo esInfo) throws Exception {
		PreparedStatement stmt = null;
		
		try {
			stmt = connection.prepareStatement(
					"insert into info(eno,ename,sex,deptno,phone,address,joindate) values(Sno.nextval,?,?,?,?,?,TO_CHAR(sysdate,'yy/mm/dd'))");
			stmt.setString(1, esInfo.getEname());
			stmt.setString(2, esInfo.getSex());
			stmt.setInt(3, esInfo.getDeptNo());
			stmt.setString(4, esInfo.getPhone());
			stmt.setString(5, esInfo.getAddress());
			return stmt.executeUpdate();
		} catch (Exception e) {
			throw e;
	    } finally {
	      try {if (stmt != null) stmt.close();} catch(Exception e) {}
	    }
	}
	//dept 추가
	public int insert(ESDept esDept) throws Exception {
		PreparedStatement stmt = null;
		
		try {
			stmt = connection.prepareStatement(
					"insert into dept(deptno,deptname,manager) values(?,?,?)");
			stmt.setInt(1, esDept.getDeptNo());
			stmt.setString(2, esDept.getDeptName());
			stmt.setString(3, esDept.getManager());
			return stmt.executeUpdate();
		} catch (Exception e) {
			throw e;
	    } finally {
	      try {if (stmt != null) stmt.close();} catch(Exception e) {}
	    }
	}
	//data 추가
	public int insert(ESData esData) throws Exception {
		PreparedStatement stmt = null;
		
		try {
			stmt = connection.prepareStatement(
					"insert into edata(fno,power,data) values(Dno.nextval,?,?)");
			stmt.setInt(1, esData.getPower());
			stmt.setString(2, esData.getData());
			return stmt.executeUpdate();
		} catch (Exception e) {
			throw e;
	    } finally {
	      try {if (stmt != null) stmt.close();} catch(Exception e) {}
	    }
	}
	//commute 추가
	public int insert(ESCommute esCommute) throws Exception {
		PreparedStatement stmt = null;
		
		try {
			stmt = connection.prepareStatement(
					"insert into commute(eno,cin) values(?,TO_CHAR(sysdate,'yyyy-mm-dd hh24:mi:ss'))");
			stmt.setInt(1, esCommute.getEno());
			return stmt.executeUpdate();
		} catch (Exception e) {
			throw e;
	    } finally {
	      try {if (stmt != null) stmt.close();} catch(Exception e) {}
	    }
	}
	
	
	
	//info 업데이트
	public int update(ESInfo esInfo) throws Exception {
		PreparedStatement stmt = null;
		try {
			stmt = connection.prepareStatement(
					"update info set power=?,deptno=?,phone=?,address=? where eno=?");
			stmt.setInt(1, esInfo.getPower());
			stmt.setInt(2, esInfo.getDeptNo());
			stmt.setString(3, esInfo.getPhone());
			stmt.setString(4, esInfo.getAddress());
			stmt.setInt(5, esInfo.getEno());
			return stmt.executeUpdate();
		} catch (Exception e) {
			throw e;

	    } finally {
	      try {if (stmt != null) stmt.close();} catch(Exception e) {}
	    }
	  }
	//dept 업데이트
	public int update(ESDept esDept) throws Exception {
		PreparedStatement stmt = null;
		try {
			stmt = connection.prepareStatement(
					"update dept set deptname=?,manager=? where deptno=?");
			stmt.setString(1, esDept.getDeptName());
			stmt.setString(2, esDept.getManager());
			stmt.setInt(3, esDept.getDeptNo());
			return stmt.executeUpdate();
		} catch (Exception e) {
			throw e;

	    } finally {
	      try {if (stmt != null) stmt.close();} catch(Exception e) {}
	    }
	  }
	//data 업데이트
		public int update(ESData esData) throws Exception {
			PreparedStatement stmt = null;
			try {
				stmt = connection.prepareStatement(
						"update edata set power=?,data=? where fno=?");
				stmt.setInt(1, esData.getPower());
				stmt.setString(2, esData.getData());
				stmt.setInt(3, esData.getFno());
				return stmt.executeUpdate();
			} catch (Exception e) {
				throw e;

		    } finally {
		      try {if (stmt != null) stmt.close();} catch(Exception e) {}
		    }
		  }
		//commute 업데이트
				public int update(ESCommute esCommute) throws Exception {
					PreparedStatement stmt = null;
					ResultSet rs = null;
					try {
						int eno;
						eno = esCommute.getEno();

						stmt = connection.prepareStatement(
						"select * from commute where cin in (select max(cin) from commute where eno ="+eno+")");
						rs = stmt.executeQuery();
						
						while (rs.next()){
							if(rs.getString("cout")==null)
								{
									stmt = connection.prepareStatement(
											"UPDATE commute SET cout = TO_CHAR(sysdate,'yyyy-mm-dd hh24:mi:ss') where cin in (select max(cin) from commute where eno = ?)");
									stmt.setInt(1, esCommute.getEno());
									break;
								}

							stmt = connection.prepareStatement(
									"insert into commute values (?,TO_CHAR(sysdate,'yyyy-mm-dd hh24:mi:ss'),'')");
							stmt.setInt(1, esCommute.getEno());
							break;
						}
						return stmt.executeUpdate();
					} catch (Exception e) {
						throw e;

				    } finally {
				    	try {if (rs != null) rs.close();} catch(Exception e) {}
				      try {if (stmt != null) stmt.close();} catch(Exception e) {}
				    }
				  }
		
		
		
	//info 삭제
		public int deleteInfo(int eno) throws Exception {
			Statement stmt = null;
			
			try {
				stmt = connection.createStatement();
				return stmt.executeUpdate("delete from info where eno="+eno);
			} catch (Exception e) {
				throw e;
			} finally {
				try {if (stmt != null) stmt.close();} catch (Exception e) {}
			}
		}
		//dept 삭제
		public int deleteDept(int deptno) throws Exception {
			Statement stmt = null;
			
			try {
				stmt = connection.createStatement();
				return stmt.executeUpdate("delete from dept where deptno="+deptno);
			} catch (Exception e) {
				throw e;
			} finally {
				try {if (stmt != null) stmt.close();} catch (Exception e) {}
			}
		}
		//data 삭제
		public int deleteData(int fno) throws Exception {
			Statement stmt = null;
			
			try {
				stmt = connection.createStatement();
				return stmt.executeUpdate("delete from edata where fno="+fno);
			} catch (Exception e) {
				throw e;
			} finally {
				try {if (stmt != null) stmt.close();} catch (Exception e) {}
			}
		}
		//data 삭제
		public int deleteCommute(int eno,String cin) throws Exception {
			Statement stmt = null;
			
			try {
				stmt = connection.createStatement();
				return stmt.executeUpdate("delete from commute where eno="+eno+" and cin='"+cin+"'");
			} catch (Exception e) {
				throw e;
			} finally {
				try {if (stmt != null) stmt.close();} catch (Exception e) {}
			}
		}
				
		//data 검색		
		public List<ESData> searchData(int eno) throws Exception {
			PreparedStatement stmt = null;
			ResultSet rs = null;
			PreparedStatement stmt2 = null;
			ResultSet rs2 = null;
			String power;
			 
			try {
				System.out.println("try진입");
				stmt = connection.prepareStatement("select power from info where eno="+eno);
				System.out.println("stmt와 쿼리사이");
				rs = stmt.executeQuery();
				rs.next();
				power = rs.getString("power");
				System.out.println("파워등급은요="+power);
			
				stmt2 = connection.prepareStatement("select * from edata where power<="+power);
				rs2 = stmt2.executeQuery();
				
				ArrayList<ESData> esDatas = new ArrayList<ESData>();
				
				while(rs2.next()) {
					System.out.println(rs2.getInt("fno"));
					System.out.println(rs2.getInt("power"));
					System.out.println(rs2.getString("data"));
				esDatas.add(new ESData()
						.setFno(rs2.getInt("fno"))
						.setPower(rs2.getInt("power"))
						.setData(rs2.getString("data")));
				}

				return esDatas;

			} catch (Exception e) {
				throw e;
			} finally {
				try {if (rs2 != null) rs2.close();} catch(Exception e) {}
				try {if (stmt2 != null) stmt2.close();} catch(Exception e) {}
				try {if (rs != null) rs2.close();} catch(Exception e) {}
				try {if (stmt != null) stmt2.close();} catch(Exception e) {}
			}
		}
}
