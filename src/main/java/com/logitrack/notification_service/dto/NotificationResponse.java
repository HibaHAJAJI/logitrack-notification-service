package com.logitrack.notification_service.dto;


import com.logitrack.notification_service.enums.NotificationType;
import lombok.Data;
import lombok.Getter;

import java.time.LocalDateTime;


@Data
public class NotificationResponse {

    private Long id;

    private String message;

    private NotificationType type;

    private LocalDateTime dateCreation;

    private boolean read;

    private Long orderId;
}
