package com.logitrack.notification_service.dto;


import com.logitrack.notification_service.enums.NotificationType;
import lombok.Getter;

import java.time.LocalDateTime;


@Getter
public class NotificationResponse {

    private Long id;

    private String message;

    private NotificationType type;

    private LocalDateTime dateCreation;

    private boolean read;

    private Long orderId;
}
