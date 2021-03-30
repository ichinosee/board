package la.servlet;

import java.util.List;

import la.bean.Board;
import la.dao.FindCommentDAO;

public class FindCommentLogic {
	public List<Board> executeFindComment() {
        FindCommentDAO fcdao = new FindCommentDAO();
        List<Board> list = fcdao.findcomment();
        return list;
	}

}
