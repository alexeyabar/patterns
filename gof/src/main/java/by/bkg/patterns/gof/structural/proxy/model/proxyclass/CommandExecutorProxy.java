package by.bkg.patterns.gof.structural.proxy.model.proxyclass;

import by.bkg.patterns.gof.structural.proxy.model.mainclass.CommandExecutor;
import by.bkg.patterns.gof.structural.proxy.model.mainclass.CommandExecutorImpl;

public class CommandExecutorProxy implements CommandExecutor {

    private boolean isAdmin;
    private CommandExecutor executor;

    public CommandExecutorProxy(String user, String pwd) {
        if ("Pankaj".equals(user) && "J@urnalD$v".equals(pwd)) {
            isAdmin = true;
        }
        executor = new CommandExecutorImpl();
    }

    @Override
    public void runCommand(String cmd) throws Exception {
        if (!isAdmin && cmd.trim().startsWith("rm")) {
            throw new Exception("rm command is not allowed for non-admin users.");
        } else {
            executor.runCommand(cmd);
        }
    }
}
