package by.bkg.patterns.gof.structural.proxy;

import by.bkg.patterns.gof.structural.proxy.model.mainclass.CommandExecutor;
import by.bkg.patterns.gof.structural.proxy.model.proxyclass.CommandExecutorProxy;

// https://www.digitalocean.com/community/tutorials/proxy-design-pattern
public class ProxyPatternTest {

    public static void main(String[] args) {
        CommandExecutor executor = new CommandExecutorProxy("Pankaj", "wrong_pwd");
        try {
            executor.runCommand("ls -ltr");
            executor.runCommand("rm -rf abc.pdf");
        } catch (Exception e) {
            System.out.println("Exception Message::" + e.getMessage());
        }
    }
}
