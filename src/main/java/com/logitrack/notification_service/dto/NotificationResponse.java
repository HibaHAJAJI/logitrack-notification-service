package com.logitrack.notification_service.dto;


import com.logitrack.notification_service.enums.NotificationType;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;


@Getter
@Builder
public class NotificationResponse {

    private Long id;

    private String message;

    private NotificationType type;

    private LocalDateTime dateCreation;

    private boolean read;

    private Long orderId;
}
