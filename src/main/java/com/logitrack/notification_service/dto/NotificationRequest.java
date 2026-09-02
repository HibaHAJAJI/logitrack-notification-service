package com.logitrack.notification_service.dto;


import com.logitrack.notification_service.enums.NotificationType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NotificationRequest {

    private String message;

    private NotificationType type;

    private Long orderId;
}
