CREATE TABLE notifications (
                               id BIGINT AUTO_INCREMENT PRIMARY KEY,
                               message VARCHAR(255) NOT NULL,
                               type VARCHAR(50) NOT NULL,
                               date_creation DATETIME NOT NULL,
                               is_read BOOLEAN DEFAULT FALSE,
                               order_id BIGINT NOT NULL
);