package com.logitrack.notification_service.mapper;

import com.logitrack.notification_service.dto.NotificationRequest;
import com.logitrack.notification_service.dto.NotificationResponse;
import com.logitrack.notification_service.entity.Notification;
import org.mapstruct.Mapper;




@Mapper(componentModel = "spring")
public interface NotificationMapper {

    Notification toEntity(NotificationRequest request);

    NotificationResponse toResponse(Notification notification);
}
