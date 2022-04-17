package com.plife.web.dao;

import java.util.List;

import com.plife.web.entity.Notice;
import com.plife.web.entity.NoticeView;

public interface NoticeDao {

	List<NoticeView> getViewList(int offset, int size, String field, String query, boolean pub);
	
	int getCount(String field, String query, boolean pub);
	
	NoticeView getView(int id);
	
	Notice getNext(int id);
	
	Notice getPrev(int id);
	
	int update(Notice notice);
	
	int insert(Notice notice);
	
	int delete(int id);

	int deleteAll(int[] ids);

	int updatePubAll(int[] ids, boolean pub);
}
