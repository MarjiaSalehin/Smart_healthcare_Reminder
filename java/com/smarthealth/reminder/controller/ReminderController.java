package com.smarthealth.reminder.controller;

import com.smarthealth.reminder.service.ReminderService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/reminder")
public class ReminderController {

    private final ReminderService reminderService;

    @Value("${reminder.message}")
    private String reminderMessage;

    public ReminderController(ReminderService reminderService) {
        this.reminderService = reminderService;
    }

    @GetMapping
    public String getReminder() {
        return reminderMessage;
    }
}