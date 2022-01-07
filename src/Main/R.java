package Main;

import Controller.Controller;
import PhoneView.DeleteView;
import PhoneView.DetailView;
import PhoneView.EditView;
import PhoneView.InsertView;
import PhoneView.ListView;
import PhoneView.MenuView;
import PhoneView.View;
import model.PhoneVo;


public class R {
	public static int no;
	public static PhoneVo PhoneVo;
	public static PhoneVo[] PhoneArr;
	public static PhoneVo PhoneVos;
		
	public static final int SEARCH=0, DEDAIL=1;
	public static int type = 0;
		
	public static final View menuView = new MenuView();
	public static final View insertView = new InsertView();
	public static final View DeleteView = new DeleteView();
	public static final View DetailView = new DetailView();
	public static final View EditView = new EditView();
	public static final View ListView = new ListView();
	public static final Controller Conteroller = new Controller();
	
}

