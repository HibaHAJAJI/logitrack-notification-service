package com.logitrack.notification_service.dto;


import com.logitrack.notification_service.enums.NotificationType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NotificationRequest {

    @NotBlank(message = "Le message est obligatoire")
    private String message;

    @NotNull(message = "Le type est obligatoire")
    private NotificationType type;

    @NotNull(message = "L'orderId est obligatoire")
    private Long orderId;
}
