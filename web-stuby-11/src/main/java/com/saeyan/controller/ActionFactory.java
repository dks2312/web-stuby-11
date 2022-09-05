package com.saeyan.controller;

import com.saeyan.controller.action.Action;
import com.saeyan.controller.action.BoardCheckPassAction;
import com.saeyan.controller.action.BoardCheckPassFormAction;
import com.saeyan.controller.action.BoardDeleteAction;
import com.saeyan.controller.action.BoardListAction;
import com.saeyan.controller.action.BoardUpdateAction;
import com.saeyan.controller.action.BoardUpdateFormAction;
import com.saeyan.controller.action.BoardViewAction;
import com.saeyan.controller.action.BoardWriteAction;
import com.saeyan.controller.action.BoardWriteFormAction;

public class ActionFactory {
	private static ActionFactory instance = new ActionFactory();

	private ActionFactory() {
		super();
	}

	public static ActionFactory getInstance() {
		return instance;
	}

	public Action getAction(String command) {
		Action action = null;
		System.out.println("ActionFactory : " + command);

		switch (command) {
		case "board_list": 
			action = new BoardListAction(); 
			break;
		case "board_write_form":
			action = new BoardWriteFormAction(); 
			break;
		case "board_write":
			action = new BoardWriteAction(); 
			break;
		case "board_view":
			action = new BoardViewAction(); 
			break;
		case "board_check_pass":
			action = new BoardCheckPassAction(); 
			break;
		case "board_check_pass_form":
			action = new BoardCheckPassFormAction(); 
			break;
		case "board_update_form":
			action = new BoardUpdateFormAction(); 
			break;
		case "board_update":
			action = new BoardUpdateAction(); 
			break;
		case "board_delete":
			action = new BoardDeleteAction(); 
			break;
		}
		
		return action;
	}
}
