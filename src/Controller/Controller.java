package Controller;

import Main.R;
import Main.ViewContainer;
import model.PhoneDao;
import java.io.File;
import java.io.IOException;

public class Controller {
	private ViewContainer vc = new ViewContainer();
	private PhoneDao dao = new PhoneDao();
	public void action() throws IOException {
		if(R.no == 0) {
			vc.run(R.menuView);
		}
		
		switch(R.no) {
		case 1 :
			vc.run(R.insertView);
			dao.insert(R.PhoneVo);
			model.File.OutputBufferedStream(dao.getListView());
			break;
		case 2 : 
			R.PhoneArr = dao.selectAll();
			
			vc.run(R.ListView); 
			model.File.InputStream(dao.getListView());
			break;
		case 3 : 
			R.type = R.SEARCH;
			vc.run(R.DetailView); 
			R.type = R.DEDAIL;
			R.PhoneVo = dao.selectOne(R.PhoneVo);
			vc.run(R.DetailView);
			break;
		case 4 : 
			R.type = R.SEARCH;
			vc.run(R.DetailView);
			R.PhoneVo = dao.selectOne(R.PhoneVo);
			R.type = R.DEDAIL;
			dao.update(R.PhoneVo);
			vc.run(R.EditView);
			break;
		case 5 : 
			R.type = R.SEARCH;
			vc.run(R.DeleteView); 
			R.PhoneVo = dao.selectOne(R.PhoneVo);
			R.type = R.DEDAIL;
			dao.delete(R.PhoneVo);
			dao.update(R.PhoneVo);
			
			break;
		case 6 :
			System.out.println("프로그램 종료");
			System.exit(0);
			break;
		default :
			System.out.println("해당 기능이 없습니다!");
		
		}
		R.no = 0;
		action();
	}
}
