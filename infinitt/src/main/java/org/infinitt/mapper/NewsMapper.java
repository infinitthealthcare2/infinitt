package org.infinitt.mapper;

import java.util.ArrayList;

import org.infinitt.domain.Criteria;
import org.infinitt.domain.NewsDTO;
import org.infinitt.domain.PrevNextDTO;

public interface NewsMapper {
	//占쌉쏙옙占쏙옙 占쌜억옙占쏙옙占� 占쏙옙占시되억옙占쌍댐옙 DB占쌜억옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙
		public void newswrite(NewsDTO news);
		
		//占쌉쏙옙占쏙옙 占쏙옙占싹울옙 占쏙옙占시되억옙占쌍댐옙 DB占쌜억옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙
		public void insertSelectKey(NewsDTO news);
		
		//占쌉쏙옙占쏙옙 占쏙옙玖占쏙옙占싣�占쏙옙 占쏙옙占시되억옙占쌍댐옙 DB占쌜억옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙
		public ArrayList<NewsDTO> news(Criteria cri);


		//占쌉쏙옙占쏙옙 占쏙옙玖占쏙옙占싣�占쏙옙占쏙옙 占쏙옙占쏙옙占쏙옙 클占쏙옙占쏙옙占쏙옙 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙占시되억옙占쌍댐옙 DB占쌜억옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙
		public NewsDTO newsdetail(NewsDTO news);
		
		/*public PrevNextDTO newsdetail2(PrevNextDTO pnBoard);*/
		
		//占쌉쏙옙占쏙옙 占쏙옙玖占쏙옙占싣�占쏙옙占쏙옙 占쏙옙占쏙옙占쏙옙 클占쏙옙占쏙옙占쏙옙 占쏙옙 占쏙옙회占쏙옙 +1 占쏙옙 占쏙옙 占쏙옙 占쌍댐옙 DB占쌜억옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙
		public void cntupdate(NewsDTO news);
		
		//占쌉쏙옙占쏙옙 占쌜쇽옙占쏙옙占쏙옙 占쏙옙占시되억옙占쌍댐옙 DB占쌜억옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙
		public void newsmodify(NewsDTO news);
		
		//占쌉쏙옙占쏙옙 占쌜삼옙占쏙옙占쏙옙 占쏙옙占시되억옙占쌍댐옙 DB占쌜억옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙
		public void newsremove(NewsDTO news);
		
		//占쌉쏙옙占쏙옙 占쏙옙占쏙옙징占쏙옙 占쏙옙占쏙옙 占쏙옙체 占실쇽옙占쏙옙 占쏙옙占시되억옙占쌍댐옙 DB占쌜억옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙
		public int getTotalCount(Criteria cri);
		
		public ArrayList<NewsDTO> getNews(NewsDTO news);
}
