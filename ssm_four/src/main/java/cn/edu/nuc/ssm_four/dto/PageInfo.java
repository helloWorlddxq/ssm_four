package cn.edu.nuc.ssm_four.dto;

import java.util.List;

/**
 * @date 2016年11月3日下午4:54:32
 */
public class PageInfo {

	private int current=1;
	private int count;
	private int offset=7;
	private int start;
	
	

	private List<?> list;
	private int total;

	public PageInfo(int current) {
		this.current = current;
	}
	public PageInfo() {
		super();
	}
	public int getStart() {
		this.start = (this.current - 1)*this.offset;
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}
	public int getCurrent() {
		return current;
	}

	public void setCurrent(int current) {
		this.current = current;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
		
		
		
		this.setTotal(this.total = this.count / this.offset + (this.count % this.offset) >0 ? 1 :0 );
	}

	public int getOffset() {
		return offset;
	}


	public void setOffset(int offset) {
		if (offset > 0 ) 
			
		
		this.offset = offset;
	}

	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public List<?> getList() {
		return list;
	}

	public void setList(List<?> list) {
		this.list = list;
	}
	@Override
	public String toString() {
		return "PageInfo [current=" + current + ", count=" + count + ", offset=" + offset + ", start=" + start
				+ ", list=" + list + ", total=" + total + "]";
	}
}
