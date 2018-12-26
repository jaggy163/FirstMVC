package command;

import resource.ConfigurationManager;

import javax.servlet.http.HttpServletRequest;

public class EmptyCommand implements ActionCommand {
    @Override
    public String execute(HttpServletRequest request) {
        // В случае ошибки или прямого обращения к контроллеру переадресация на страницу ввода
        String page = ConfigurationManager.getProperty("path.page.login");
        return page;
    }
}
