package com.zhangguo.springmvc71.Services;

import java.util.ArrayList;
import java.util.List;
import com.zhangguo.springmvc71.entities.Article;

/**
 * 文章业务类（模拟）
 *
 */
public class ArticleService {
	private static List<Article> articles;

	static {
		articles = new ArrayList<Article>();
		articles.add(new Article(20160701, "不明真相的美国人被UFO惊呆了 其实是长征7号","据美国《洛杉矶时报》报道，当地时间周三晚(北京时间周四)，在美国中西部的犹他州、内华达州、加利福利亚州，数千人被划过夜空的神秘火球吓到"));
		articles.add(new Article(20160702, "法国巴黎圣母院为教堂恐袭案遇害神父举行大弥撒", "而据美国战略司令部证实，其实这是中国长征七号火箭重新进入大气层，刚好经过加利福利亚附近。"));
		articles.add(new Article(20160703, "日东京知事候选人小池百合子回击石原：浓妆可以", "然而昨晚的美国人民可不明真相，有些人甚至怀疑这些火球是飞机解体，还有些人猜测是流星雨。"));
		articles.add(new Article(20160704, "日资慰安妇基金在首尔成立 韩国示威者闯入抗议","美国战略司令部发言人表示，到目前为止还没有任何受损报告，他说类似物体通常在大气中就会消失，这也解释了为何出现一道道光痕，这一切都并未造成什么威胁。"));
		articles.add(new Article(20160705, "中日关系正处十字路口日应寻求减少与华冲突","中国长征七号火箭6月25日在海南文昌航天发射中心首次发射，并成功升空进入轨道。有学者指出长征七号第二级火箭一直在地球低轨运行，一个月后重新进入大气层。"));
	}

	/**
	 * 所有的文章
	 */
	public List<Article> getArticles() {
		return articles;
	}
	
	/*
	 * 获得文章通过文章编号
	 */
	public Article getArticle(int id) {
		for (Article article : articles) {
			if (article.getId() == id) {
				return article;
			}
		}
		return null;
	}
}
