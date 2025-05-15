package com.aneyra.email_service.model;

import java.io.Serializable;
import java.util.Objects;

public class EmailNotification implements Serializable {
  private String to;
  private String subject;
  private String body;

  public EmailNotification() {
  }

  public EmailNotification(String to, String subject, String body) {
    this.to = to;
    this.subject = subject;
    this.body = body;
  }

  public static EmailNotification newMessage(Email email) {
    String subject = email.getSubject();

    String body = email.getBody();

    return new EmailNotification(email.getTo(), subject, body);
  }

  public String getTo() {
    return to;
  }

  public void setTo(String to) {
    this.to = to;
  }

  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    EmailNotification that = (EmailNotification) o;
    return Objects.equals(to, that.to) &&
        Objects.equals(subject, that.subject) &&
        Objects.equals(body, that.body);
  }

  @Override
  public int hashCode() {
    return Objects.hash(to, subject, body);
  }

  @Override
  public String toString() {
    return "EmailNotification{" +
        "to='" + to + '\'' +
        ", subject='" + subject + '\'' +
        ", body='" + body + '\'' +
        '}';
  }
}
