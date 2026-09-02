package com.logitrack.notification_service.service;


import com.logitrack.notification_service.dto.NotificationRequest;
import com.logitrack.notification_service.dto.NotificationResponse;
import com.logitrack.notification_service.entity.Notification;
import com.logitrack.notification_service.mapper.NotificationMapper;
import com.logitrack.notification_service.repository.NotificationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NotificationService {

    private final NotificationRepository  repository;
    private final NotificationMapper mapper;

    public NotificationResponse createNotification(NotificationRequest request) {

        Notification notification =mapper.toEntity(request);
        Notification saved = repository.save(notification);
        return mapper.toResponse(saved);
    }

    public List<NotificationResponse> getAllNotifications() {
        return repository.findAll()
                .stream()
                .map(mapper::toResponse)
                .toList();
    }

    public NotificationResponse getNotificationById(Long id) {
        Notification notification = repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "Notification introuvable !"));

        return mapper.toResponse(notification);
    }

    public NotificationResponse markAsRead(Long id) {
        Notification notification = repository.findById(id).orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND, "Notification introuvable !"));

        notification.setRead(true);
        Notification saved = repository.save(notification);
        return mapper.toResponse(saved);
    }

}
