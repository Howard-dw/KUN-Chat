module com.practice.practice {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    exports com.practice.chat.client;
    exports com.practice.chat.server;
    exports com.practice.chat.dbconnector;
    exports com.practice.chat.requestmessage;
    exports com.practice.chat.chatlog;
    exports com.practice.chat.user;
    exports com.practice.chat.dao;
    exports com.practice.chat.client.controllers;
    exports com.practice.chat.friendcircle;

    opens com.practice.chat.client to javafx.fxml;
    opens com.practice.chat.client.controllers to javafx.fxml;
}