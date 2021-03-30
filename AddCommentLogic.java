package la.servlet;

import la.bean.Board;

public class AddCommentLogic {
	public void executeAddComment(Board bo) {
        AddCommentDAO acdao = new AddCommentDAO(bo);
    }

}
