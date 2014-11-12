package sumModel.block;

public class ManBlockDto {
	private int m_block_num; // 남자철벽번호
	private String m_id, m_block_id; // 남자ID, 남자가 철벽한 아이디

	public int getM_block_num() {
		return m_block_num;
	}

	public void setM_block_num(int m_block_num) {
		this.m_block_num = m_block_num;
	}

	public String getM_id() {
		return m_id;
	}

	public void setM_id(String m_id) {
		this.m_id = m_id;
	}

	public String getM_block_id() {
		return m_block_id;
	}

	public void setM_block_id(String m_block_id) {
		this.m_block_id = m_block_id;
	}
}
