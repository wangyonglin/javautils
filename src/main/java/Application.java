


import javautils.wangyonglin.element.Collection;
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

        Collection.put("wx729134dca293ffab","7a8b07e557ca7556587389516e3fce3e");
        Collection.put("wxa054e8196d3492e3","6c49f40f3e3dc5cef017b4a190b5f51a");
        Collection token= Collection.get("wx729134dca293ffab");
        System.out.println(token.key+"?"+token.value);

    }
}
