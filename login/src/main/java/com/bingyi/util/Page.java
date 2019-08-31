package com.bingyi.util;

import java.util.List;

import com.bingyi.pojo.User;

public class Page {
	//��ǰҳ��
	private int pageNum;
	//ÿһҳ����������
	private int pageSize;
	//����
	private List<User> dataList;
	//��ҳ��
	private int totalNum;
	//�ܹ�����������
	private int totalSize;
	
	public Page(int pageNum,int pageSize) {
		if (pageNum<=0) {
			pageNum=1;
		}
		if (pageSize<=0) {
			pageSize=3;
		}
		this.pageNum=pageNum;
		this.pageSize=pageSize;
	}
	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public List<User> getDataList() {
		return dataList;
	}
	public void setDataList(List<User> dataList) {
		this.dataList = dataList;
	}
	public int getTotalNum() {
		return totalNum;
	}
	private void setTotalNum(int totalNum) {
		this.totalNum = totalNum;
	}
	public int getTotalSize() {
		return totalSize;
	}
	public void setTotalSize(int totalSize) {
		this.totalSize = totalSize;
		this.totalNum=(totalSize%pageSize)==0?(totalSize/pageSize):(totalSize/pageSize+1);
	}
	
	public int getStartIndex() {
		return this.pageSize*(this.pageNum-1);
	}
}
