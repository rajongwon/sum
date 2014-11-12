package sumModel.block;

public class WomanBlockDto {
	private int w_block_num; // 여자철벽번호
	private String w_id, w_block_id; // 여자ID, 여자가 철벽한 아이디

	public int getW_block_num() {
		return w_block_num;
	}

	public void setW_block_num(int w_block_num) {
		this.w_block_num = w_block_num;
	}

	public String getW_id() {
		return w_id;
	}

	public void setW_id(String w_id) {
		this.w_id = w_id;
	}

	public String getW_block_id() {
		return w_block_id;
	}

	public void setW_block_id(String w_block_id) {
		this.w_block_id = w_block_id;
	}
}
