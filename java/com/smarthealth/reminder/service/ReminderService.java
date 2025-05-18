package com.smarthealth.reminder.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ReminderService {

    @Scheduled(fixedRate = 3600000)
    public void sendReminder() {
        System.out.println("Reminder: Time to take your medicine!");
    }
}