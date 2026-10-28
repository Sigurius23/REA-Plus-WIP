.class public interface abstract Lcom/whoop/service/network/NotificationApi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008f\u0018\u00002\u00020\u0001J4\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u0006H\u00a7@\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u000cH\u00a7@\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\t2\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u000fH\u00a7@\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\t2\u0008\u0008\u0001\u0010\u0012\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J9\u0010\u001a\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00190\u00080\u00182\u0008\u0008\u0001\u0010\u0015\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0016\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0017\u001a\u00020\u0002H\'\u00a2\u0006\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001c\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/service/network/NotificationApi;",
        "",
        "",
        "sourceId",
        "Lcom/whoop/data/remote/domain/dto/PushNotificationMetricBody;",
        "body",
        "",
        "userId",
        "Lpg3/v0;",
        "Ll83/a0;",
        "sendNotificationMetricsUpdate",
        "(Ljava/lang/String;Lcom/whoop/data/remote/domain/dto/PushNotificationMetricBody;ILq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/domain/model/UserNotificationSettingsDto;",
        "getUserNotificationSettings",
        "(Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/domain/model/NotificationNamespaceBody;",
        "disableNotification",
        "(Lcom/whoop/domain/model/NotificationNamespaceBody;Lq83/d;)Ljava/lang/Object;",
        "namespace",
        "enableNotification",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "deviceId",
        "type",
        "application",
        "Lxg3/g;",
        "Ljava/lang/Void;",
        "registerPush",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lxg3/g;",
        "core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract disableNotification(Lcom/whoop/domain/model/NotificationNamespaceBody;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lcom/whoop/domain/model/NotificationNamespaceBody;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/domain/model/NotificationNamespaceBody;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/p;
        value = "notification-service/v1/notifications/user-settings/block/namespace"
    .end annotation
.end method

.method public abstract enableNotification(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "namespace"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/b;
        value = "notification-service/v1/notifications/user-settings/block/namespace/{namespace}"
    .end annotation
.end method

.method public abstract getUserNotificationSettings(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/domain/model/UserNotificationSettingsDto;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "notification-service/v1/notifications/user-settings/bff"
    .end annotation
.end method

.method public abstract registerPush(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lxg3/g;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "deviceId"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "type"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "application"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lxg3/g<",
            "Lpg3/v0<",
            "Ljava/lang/Void;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lwg3/p;
        value = "notification-service/v0/push/{deviceId}"
    .end annotation
.end method

.method public abstract sendNotificationMetricsUpdate(Ljava/lang/String;Lcom/whoop/data/remote/domain/dto/PushNotificationMetricBody;ILq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "sourceId"
        .end annotation
    .end param
    .param p2    # Lcom/whoop/data/remote/domain/dto/PushNotificationMetricBody;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .param p3    # I
        .annotation runtime Lwg3/t;
            value = "userId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/data/remote/domain/dto/PushNotificationMetricBody;",
            "I",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "notification-service/v1/notifications/{sourceId}/events"
    .end annotation
.end method
