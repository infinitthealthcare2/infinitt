package org.infinitt.service;

import java.util.ArrayList;

import org.infinitt.domain.AttachFileDTO;
import org.infinitt.domain.Criteria;
import org.infinitt.domain.NewsDTO;
import org.infinitt.domain.PrevNextDTO;
import org.infinitt.mapper.AttachMapper;
import org.infinitt.mapper.NewsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class NewsServiceImpl implements NewsService{
	
	@Autowired
	private NewsMapper nmapper;
	@Autowired
	private AttachMapper amapper;
	
	//占쌉쏙옙占쏙옙 占쌜억옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙 占쏙옙占쏙옙
	@Transactional
	public void newswrite(NewsDTO news) {
		
		
		nmapper.insertSelectKey(news);
		
		if(news.getAttachList() != null) {
			news.getAttachList().forEach(attach->{
				attach.setNbno(news.getNbno());
				amapper.insert1(attach);
			});
		}else {
			System.out.println("占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占싹쇽옙占쏙옙.");
		}
			
	}
	
	//占쌉쏙옙占쏙옙 占쏙옙玖占쏙옙占싣� 占쏙옙占쏙옙占� 占쏙옙 占쏙옙占쏙옙
	public ArrayList<NewsDTO> news(Criteria cri) {
		return nmapper.news(cri);
	}

	@Transactional
	//占쌉쏙옙占쏙옙 占쏙옙玖占쏙옙占싣�占쏙옙占쏙옙 占쏙옙占쏙옙占쏙옙 클占쏙옙占쏙옙占쏙옙 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙 占쏙옙占쏙옙
	public NewsDTO newsdetail(NewsDTO news) {
		//board占쏙옙占싱븝옙 占쏙옙회占쏙옙 占쌈쇽옙占쏙옙 +1
		nmapper.cntupdate(news);
		return nmapper.newsdetail(news);
	}
	
	/*public PrevNextDTO newsdetail2(PrevNextDTO pnBoard) {

		return nmapper.newsdetail2(pnBoard);
	}*/
	
	//占쌉쏙옙占쏙옙 占쌜쇽옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙 占쏙옙占쏙옙
	@Transactional
	public void newsmodify(NewsDTO news) {
		nmapper.newsmodify(news);
		/*news.getAttachList().forEach(attach->{
			// 占쏙옙占썅에 占쏙옙占싹억옙占싸듸옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占쏙옙
			System.out.println(news.getAttachList());
			if(news.getAttachList() != null) {
				
				System.out.println(news.getAttachList());
				attach.setNbno(news.getNbno());
				amapper.modify(attach);
			}
			
			
		});*/
	}
	
	//占쌉쏙옙占쏙옙 占쌜삼옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙 占쏙옙占쏙옙
	public void newsremove(NewsDTO news) {
		nmapper.newsremove(news);
	}
	
	//占쌉삼옙占쏙옙 占쏙옙占쏙옙징占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占싶건쇽옙
	public int getTotalCount(Criteria cri) {
		return nmapper.getTotalCount(cri);
	}
	
	//占쌉쏙옙占쏙옙 占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙占싹억옙占싸듸옙占� 占싱뱄옙占쏙옙 占쏙옙占쏙옙求占� 占쏙옙占쏙옙 占쏙옙占쏙옙
	public ArrayList<AttachFileDTO> fileList1(int nbno){
		return amapper.fileList1(nbno);
	}
	
	public ArrayList<AttachFileDTO> fileListPost1(int nbno){
		return amapper.fileListPost1(nbno);
	}
	
	public void delete(AttachFileDTO aboard) {
		 amapper.delete(aboard);
	}

	public boolean fileDelete(AttachFileDTO attach) {
		return amapper.fileDelete(attach);
	}
	
	public ArrayList<NewsDTO> getNews(NewsDTO news) {

		return nmapper.getNews(news);
	}
	
	
	
	
	
	
	
	
}
