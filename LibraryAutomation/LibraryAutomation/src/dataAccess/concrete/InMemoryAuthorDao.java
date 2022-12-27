package dataAccess.concrete;

import java.util.ArrayList;
import java.util.List;

import javax.xml.xpath.XPathEvaluationResult.XPathResultType;

import Entities.Author;
import dataAccess.abstracts.AuthorDao;

public class InMemoryAuthorDao implements AuthorDao {

	List<Author> authors;
	
	public InMemoryAuthorDao() {
		authors = new ArrayList<Author>();
		authors.add(new Author("Stefan", "Zweig","Stefan Zweig (28 Kasım 1881 - 22 Şubat 1942), Avusturya-Macaristanlı roman, oyun, biyografi yazarı ve gazeteciydi. 1920'ler ile 1930'lar arasında edebiyat kariyerinin zirvesinde olmuş Zweig, dönemin dünyasının en çok tercüme edilen ve en popüler yazarlarından biriydi"));
		authors.add(new Author("George", "Orwell","Eric Arthur Blair veya daha bilinen takma adıyla George Orwell (25 Haziran 1903; Bihar - 21 Ocak 1950; Londra)[1] 20. yüzyıl İngiliz edebiyatının önde gelen kalemleri arasında yer alan İngiliz romancı, gazeteci ve eleştirmen"));
		authors.add(new Author("Franz", "Kafka", "Franz Kafka[a] (3 Temmuz 1883 - 3 Haziran 1924), Almanca konuşan Bohemyalı roman ve hikâye yazarı. 20. yüzyıl edebiyatının en önemli figürlerinden biri olarak kabul edilmektedir. Gerçekçilik unsurlarını ve fantastik unsurları birleştiren[3] eserleri tipik olarak tuhaf veya sürrealist önyargılarla ve anlaşılmaz sosyal-bürokratik güçlerle karşı karşıya kalan izole kahramanlara sahiptir ve yabancılaşma, varoluşsal kaygı, suçluluk ve saçmalık temalarını keşfetme olarak yorumlanmıştır"));
	}

	@Override
	public List<Author> getAll() {
		return authors;
	}

	@Override
	public void add(Author author) {
		authors.add(author);
		
	}


}
