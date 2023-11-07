import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CandidateDao implements AutoCloseable {
	private Connection con;
	private PreparedStatement ps_saveCandidate;
	private PreparedStatement ps_updateCandidate;
	private PreparedStatement ps_deleteCandidate;
	private PreparedStatement ps_findCandidate;
	private PreparedStatement ps_displayAll;
	private PreparedStatement ps_displayCandidatesByParty;
	public CandidateDao() throws SQLException {
		con = DButil.getConnection();
		ps_saveCandidate = con.prepareStatement("INSERT INTO candidates VALUES(default, ?, ?, ?)");
		ps_updateCandidate = con.prepareStatement("UPDATE candidates SET name = ?, party = ?, votes = ? WHERE id = ?");
		ps_deleteCandidate = con.prepareStatement("DELETE FROM candidates WHERE id = ?");
		ps_findCandidate = con.prepareStatement("SELECT * FROM candidates WHERE id = ?");
		ps_displayAll  = con.prepareStatement("SELECT * FROM candidates");
		ps_displayCandidatesByParty = con.prepareStatement("SELECT * FROM candidates WHERE party = ?");
	}
	@Override
	public void close() throws Exception {
		if(con != null)
			con.close();
		ps_saveCandidate.close();
		ps_deleteCandidate.close();
		ps_findCandidate.close();
		ps_displayAll.close();
		ps_displayCandidatesByParty.close();
	}
	public int insertCandidate(Candidate C) throws SQLException
	{
		ps_saveCandidate.setString(1, C.getName());
		ps_saveCandidate.setString(2, C.getParty());
		ps_saveCandidate.setInt(3, C.getVotes());
		int count = ps_saveCandidate.executeUpdate();
		return count;
	}
	public int updateCandidate(Candidate C) throws SQLException
	{
		
		ps_updateCandidate.setString(1, C.getName());
		ps_updateCandidate.setString(2, C.getParty());
		ps_updateCandidate.setInt(3, C.getVotes());
		ps_updateCandidate.setInt(4, C.getId());
		return ps_updateCandidate.executeUpdate();
	}
	public int deleteCandidate(int id) throws SQLException
	{
		ps_deleteCandidate.setInt(1, id);
		return ps_deleteCandidate.executeUpdate();
	}
	public Candidate findCandidate(int id) throws SQLException
	{
		Candidate C = null;
		ps_findCandidate.setInt(1, id);
		try(ResultSet rs = ps_findCandidate.executeQuery())
		{
			if(rs.next())
			{
				C = new Candidate(rs.getInt("id"), rs.getString("name"), rs.getString("party"), rs.getInt("votes"));
			}
		}
		return C;
	}
	public List<Candidate> displayAll() throws SQLException
	{
		List<Candidate>list = new ArrayList<Candidate>();
		try(ResultSet rs = ps_displayAll.executeQuery())
		{
			while(rs.next())
			{
				list.add(new Candidate(rs.getInt("id"), rs.getString("name"), rs.getString("party"), rs.getInt("votes")));
			}
		}
		return list;
	}
	public List<Candidate> displayCandidatesByParty(String party) throws SQLException
	{
		List<Candidate>list = new ArrayList<Candidate>();
		ps_displayCandidatesByParty.setString(1, party);
		try(ResultSet rs = ps_displayCandidatesByParty.executeQuery())
		{
			while(rs.next())
			{
				list.add(new Candidate(rs.getInt("id"), rs.getString("name"), rs.getString("party"), rs.getInt("votes")));
			}
		}
		return list;
	}
}
