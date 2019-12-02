
import javautils.wangyonglin.utils.MailUtil;
import javautils.wangyonglin.utils.RandomUtil;

import javax.mail.MessagingException;

public class Application {
    public static void main(String args[]) {
        String subject = "测试邮件";
        String content = "test test test。。。测试内容。。。这是从MailUtil.java发来的。";
        String to = "admin@eeob.com";
        try {
            MailUtil.sendMail(to, subject, content);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
        System.out.println(RandomUtil.Generator());
        System.out.println("Hello World!");
    }
}
