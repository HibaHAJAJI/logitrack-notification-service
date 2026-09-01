package com.logitrack.notification_service.service;


import com.logitrack.notification_service.dto.NotificationRequest;
import com.logitrack.notification_service.dto.NotificationResponse;
import com.logitrack.notification_service.entity.Notification;
import com.logitrack.notification_service.repository.NotificationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class NotificationService {

    private final NotificationRepository notificationRepository;

    public NotificationResponse createNotification(NotificationRequest request) {

        Notification notification = Notification.builder()
                .message(request.getMessage())
                .type(request.getType())
                .orderId(request.getOrderId())
                .dateCreation(LocalDateTime.now())
                .isRead(false)
                .build();

        Notification saved = notificationRepository.save(notification);

        return NotificationResponse.builder()
                .id(saved.getId())
                .message(saved.getMessage())
                .type(saved.getType())
                .dateCreation(saved.getDateCreation())
                .read(saved.isRead())
                .orderId(saved.getOrderId())
                .build();
    }

    public List<NotificationResponse> getAllNotifications() {

        return notificationRepository.findAll()
                .stream()
                .map(notification -> NotificationResponse.builder()
                        .id(notification.getId())
                        .message(notification.getMessage())
                        .type(notification.getType())
                        .dateCreation(notification.getDateCreation())
                        .read(notification.isRead())
                        .orderId(notification.getOrderId())
                        .build())
                .toList();
    }

}
