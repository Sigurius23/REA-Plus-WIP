.class public final Lio/getstream/chat/android/client/notifications/NoOpChatNotifications;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/notifications/ChatNotifications;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0005\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J!\u0010\u000b\u001a\u00020\u00062\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001a\u0010\r\u001a\u00020\u00062\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096@\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015H\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0006H\u0096@\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001bH\u0016\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u001f\u0010\"\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001fH\u0016\u00a2\u0006\u0004\u0008\"\u0010#\u00a8\u0006$"
    }
    d2 = {
        "Lio/getstream/chat/android/client/notifications/NoOpChatNotifications;",
        "Lio/getstream/chat/android/client/notifications/ChatNotifications;",
        "<init>",
        "()V",
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


# static fields
.field public static final INSTANCE:Lio/getstream/chat/android/client/notifications/NoOpChatNotifications;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/notifications/NoOpChatNotifications;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/client/notifications/NoOpChatNotifications;->INSTANCE:Lio/getstream/chat/android/client/notifications/NoOpChatNotifications;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final deleteDevice(Lio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;
    .locals 0
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

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final dismissChannelNotifications(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "channelType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "channelId"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final displayNotification(Lio/getstream/chat/android/client/notifications/handler/ChatNotification;)V
    .locals 1

    const-string v0, "notification"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final onChatEvent(Lio/getstream/chat/android/client/events/ChatEvent;)V
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final onLogout(Lq83/d;)Ljava/lang/Object;
    .locals 0
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

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final onPushMessage(Lio/getstream/chat/android/models/PushMessage;Lio/getstream/chat/android/client/notifications/PushNotificationReceivedListener;)V
    .locals 1

    const-string v0, "pushMessage"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "pushNotificationReceivedListener"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final onSetUser(Lio/getstream/chat/android/models/User;)V
    .locals 1

    const-string v0, "user"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final setDevice(Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Device;)V
    .locals 0

    const-string p1, "device"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
