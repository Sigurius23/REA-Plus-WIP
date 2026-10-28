.class public interface abstract Lio/getstream/chat/android/client/notifications/handler/NotificationHandler;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008f\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0017\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\u000c\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH&\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H&\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0010H&\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001aH&\u00a2\u0006\u0004\u0008\u001c\u0010\u001d\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\u001e\u00c0\u0006\u0001"
    }
    d2 = {
        "Lio/getstream/chat/android/client/notifications/handler/NotificationHandler;",
        "",
        "Lio/getstream/chat/android/client/events/NewMessageEvent;",
        "event",
        "",
        "onChatEvent",
        "(Lio/getstream/chat/android/client/events/NewMessageEvent;)Z",
        "Lio/getstream/chat/android/client/events/NotificationReminderDueEvent;",
        "onNotificationReminderDueEvent",
        "(Lio/getstream/chat/android/client/events/NotificationReminderDueEvent;)Z",
        "Lio/getstream/chat/android/models/PushMessage;",
        "message",
        "onPushMessage",
        "(Lio/getstream/chat/android/models/PushMessage;)Z",
        "Lio/getstream/chat/android/client/notifications/handler/ChatNotification;",
        "notification",
        "Ll83/a0;",
        "showNotification",
        "(Lio/getstream/chat/android/client/notifications/handler/ChatNotification;)V",
        "",
        "channelType",
        "channelId",
        "dismissChannelNotifications",
        "(Ljava/lang/String;Ljava/lang/String;)V",
        "dismissAllNotifications",
        "()V",
        "La13/e;",
        "status",
        "onNotificationPermissionStatus",
        "(La13/e;)V",
        "stream-chat-android-client_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract dismissAllNotifications()V
.end method

.method public abstract dismissChannelNotifications(Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public onChatEvent(Lio/getstream/chat/android/client/events/NewMessageEvent;)Z
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x1

    return p1
.end method

.method public abstract onNotificationPermissionStatus(La13/e;)V
.end method

.method public onNotificationReminderDueEvent(Lio/getstream/chat/android/client/events/NotificationReminderDueEvent;)Z
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x1

    return p1
.end method

.method public onPushMessage(Lio/getstream/chat/android/models/PushMessage;)Z
    .locals 1

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return p1
.end method

.method public abstract showNotification(Lio/getstream/chat/android/client/notifications/handler/ChatNotification;)V
.end method
