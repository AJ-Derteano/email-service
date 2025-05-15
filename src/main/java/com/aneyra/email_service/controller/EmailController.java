package com.aneyra.email_service.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aneyra.email_service.messaging.MessagePublisher;
import com.aneyra.email_service.model.EmailNotification;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/v1/messaging")
public class EmailController {
  private final MessagePublisher messagePublisher;

  public EmailController(MessagePublisher messagePublisher) {
    this.messagePublisher = messagePublisher;
  }

  @PostMapping("/send-email")
  public void sendEmail(@RequestBody EmailNotification emailRequest) {
    messagePublisher.publishNewNotification(emailRequest);
  }

}