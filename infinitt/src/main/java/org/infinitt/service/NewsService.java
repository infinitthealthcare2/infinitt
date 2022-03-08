package org.infinitt.service;

import java.util.ArrayList;

import org.infinitt.domain.AttachFileDTO;
import org.infinitt.domain.Criteria;
import org.infinitt.domain.NewsDTO;
import org.infinitt.domain.PrevNextDTO;

public interface NewsService {
	//占쌉쏙옙占쏙옙 占쌜억옙占쏙옙
		public void newswrite(NewsDTO news);
		
		//占쌉쏙옙占쏙옙 占쏙옙玖占쏙옙占싣�
		public ArrayList<NewsDTO> news(Criteria cri);

		//占쌉쏙옙占쏙옙 占쏙옙玖占쏙옙占싣�占쏙옙占쏙옙 占쏙옙占쏙옙占쏙옙 클占쏙옙占쏙옙占쏙옙 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占쏙옙占쏙옙
		public NewsDTO newsdetail(NewsDTO news);
		
		/*public PrevNextDTO newsdetail2(PrevNextDTO pnBoard);*/
		
		//占쌉쏙옙占쏙옙 占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙
		public void newsmodify(NewsDTO news);
		
		//占쌉쏙옙占쏙옙 占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙
		public void newsremove(NewsDTO news);
		
		//占쌉삼옙占쏙옙 占쏙옙占쏙옙징占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占싶건쇽옙
		public int getTotalCount(Criteria cri);
		
		//占쌉쏙옙占쏙옙 占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙占싹억옙占싸듸옙占� 占싱뱄옙占쏙옙 占쏙옙占�
		public ArrayList<AttachFileDTO> fileList1(int nbno);
		
		public ArrayList<AttachFileDTO> fileListPost1(int nbno);
		
		public void delete(AttachFileDTO aboard);
		
		public boolean fileDelete(AttachFileDTO attach);
		
		public ArrayList<NewsDTO> getNews(NewsDTO news);
		
		

}
