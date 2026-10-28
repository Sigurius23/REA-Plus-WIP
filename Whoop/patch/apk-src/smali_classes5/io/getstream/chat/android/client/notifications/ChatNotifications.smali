.class public interface abstract Lio/getstream/chat/android/client/notifications/ChatNotifications;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0005\u0008`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J!\u0010\t\u001a\u00020\u00042\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0008\u001a\u00020\u0007H&\u00a2\u0006\u0004\u0008\t\u0010\nJ\u001a\u0010\u000b\u001a\u00020\u00042\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u00a6@\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ!\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000fH&\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H&\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004H\u00a6@\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019H&\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u001f\u0010 \u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001dH&\u00a2\u0006\u0004\u0008 \u0010!\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\"\u00c0\u0006\u0001"
    }
    d2 = {
        "Lio/getstream/chat/android/client/notifications/ChatNotifications;",
        "",
        "Lio/getstream/chat/android/models/User;",
        "user",
        "Ll83/a0;",
        "onSetUser",
        "(Lio/getstream/chat/android/models/User;)V",
        "Lio/getstream/chat/android/models/Device;",
        "device",
        "setDevice",
        "(Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Device;)V",
        "deleteDevice",
        "(Lio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;",
        "Lio/getstream/chat/android/models/PushMessage;",
        "pushMessage",
        "Lio/getstream/chat/android/client/notifications/PushNotificationReceivedListener;",
        "pushNotificationReceivedListener",
        "onPushMessage",
        "(Lio/getstream/chat/android/models/PushMessage;Lio/getstream/chat/android/client/notifications/PushNotificationReceivedListener;)V",
        "Lio/getstream/chat/android/client/events/ChatEvent;",
        "event",
        "onChatEvent",
        "(Lio/getstream/chat/android/client/events/ChatEvent;)V",
        "onLogout",
        "(Lq83/d;)Ljava/lang/Object;",
        "Lio/getstream/chat/android/client/notifications/handler/ChatNotification;",
        "notification",
        "displayNotification",
        "(Lio/getstream/chat/android/client/notifications/handler/ChatNotification;)V",
        "",
        "channelType",
        "channelId",
        "dismissChannelNotifications",
        "(Ljava/lang/String;Ljava/lang/String;)V",
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


# direct methods
.method public static synthetic a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/notifications/ChatNotifications;->onPushMessage$lambda$0(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic onPushMessage$default(Lio/getstream/chat/android/client/notifications/ChatNotifications;Lio/getstream/chat/android/models/PushMessage;Lio/getstream/chat/android/client/notifications/PushNotificationReceivedListener;ILjava/lang/Object;)V
    .locals 0

    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    new-instance p2, Li7/g;

    const/16 p3, 0x9

    invoke-direct {p2, p3}, Li7/g;-><init>(I)V

    :cond_0
    invoke-interface {p0, p1, p2}, Lio/getstream/chat/android/client/notifications/ChatNotifications;->onPushMessage(Lio/getstream/chat/android/models/PushMessage;Lio/getstream/chat/android/client/notifications/PushNotificationReceivedListener;)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: onPushMessage"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static onPushMessage$lambda$0(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "<unused var>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public abstract deleteDevice(Lio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/User;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract dismissChannelNotifications(Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public abstract displayNotification(Lio/getstream/chat/android/client/notifications/handler/ChatNotification;)V
.end method

.method public abstract onChatEvent(Lio/getstream/chat/android/client/events/ChatEvent;)V
.end method

.method public abstract onLogout(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract onPushMessage(Lio/getstream/chat/android/models/PushMessage;Lio/getstream/chat/android/client/notifications/PushNotificationReceivedListener;)V
.end method

.method public abstract onSetUser(Lio/getstream/chat/android/models/User;)V
.end method

.method public abstract setDevice(Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Device;)V
.end method
