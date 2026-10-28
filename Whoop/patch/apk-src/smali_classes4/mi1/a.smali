.class public interface abstract Lmi1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008f\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u00a6@\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u001e\u0010\n\u001a\u00020\u00042\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007H\u00a6@\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000cH\u00a6@\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0018\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u00a6@\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0014\u00c0\u0006\u0003"
    }
    d2 = {
        "Lmi1/a;",
        "",
        "Lcom/whoop/domain/model/haptics/NotificationHapticsPattern;",
        "notificationHapticsPattern",
        "Lmi1/b;",
        "d",
        "(Lcom/whoop/domain/model/haptics/NotificationHapticsPattern;Lq83/d;)Ljava/lang/Object;",
        "",
        "Lcom/whoop/domain/model/haptics/StoredAlarm;",
        "storedAlarmList",
        "a",
        "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;",
        "",
        "alarmId",
        "c",
        "(ILq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/domain/model/haptics/StrapAlarmIdentifiable;",
        "strapAlarmIdentifiable",
        "b",
        "(Lcom/whoop/domain/model/haptics/StrapAlarmIdentifiable;Lq83/d;)Ljava/lang/Object;",
        "hapticsStrapService_release"
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
.method public abstract a(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/domain/model/haptics/StoredAlarm;",
            ">;",
            "Lq83/d<",
            "-",
            "Lmi1/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract b(Lcom/whoop/domain/model/haptics/StrapAlarmIdentifiable;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/domain/model/haptics/StrapAlarmIdentifiable;",
            "Lq83/d<",
            "-",
            "Lmi1/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract c(ILq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lq83/d<",
            "-",
            "Lmi1/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract d(Lcom/whoop/domain/model/haptics/NotificationHapticsPattern;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/domain/model/haptics/NotificationHapticsPattern;",
            "Lq83/d<",
            "-",
            "Lmi1/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method
