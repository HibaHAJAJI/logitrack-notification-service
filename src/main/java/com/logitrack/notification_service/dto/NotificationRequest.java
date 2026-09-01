package com.logitrack.notification_service.dto;


import com.logitrack.notification_service.enums.NotificationType;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class NotificationRequest {

    private String message;

    private NotificationType type;

    private Long orderId;
}
