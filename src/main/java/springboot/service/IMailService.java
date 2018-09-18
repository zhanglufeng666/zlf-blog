package springboot.service;

import java.util.List;

/**
 * @author june
 * @date 2018/5/3 22:06
 */
public interface IMailService {
    /**
     * 发送简单邮件
     *
     * @param to
     * @param subject
     * @param content
     */
    void sendSimpleEmail(List<String> to, String subject, String content);

    /**
     * 发送html邮件
     *
     * @param to
     * @param subject
     * @param content
     */
    void sendHtmlMail(String to, String subject, String content);

    /**
     * 发送带附件的邮件
     *
     * @param to
     * @param subject
     * @param content
     * @param filepath
     */
    void sendFileMail(String to, String subject, String content, String filepath);

}
