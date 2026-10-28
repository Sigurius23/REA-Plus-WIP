.class public final Lcom/whoop/data/repositories/SmartAlarmTriggerRepositoryKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;",
        "Lsf2/a;",
        "generateCompositeId",
        "(Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;)Lsf2/a;",
        "app_prodStandardRelease"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final generateCompositeId(Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;)Lsf2/a;
    .locals 5

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lsf2/a;

    invoke-virtual {p0}, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->getWindowMinutes()I

    move-result v1

    invoke-static {}, Lorg/joda/time/format/ISODateTimeFormat;->dateTime()Lorg/joda/time/format/DateTimeFormatter;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->getUpperTimeBoundLocalDateTime()Lorg/joda/time/LocalDateTime;

    move-result-object v3

    invoke-virtual {v2, v3}, Lorg/joda/time/format/DateTimeFormatter;->print(Lorg/joda/time/ReadablePartial;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->getSleepScoreGoal()Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->getRecoveryScoreGoal()Ljava/lang/Integer;

    move-result-object p0

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "_"

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lsf2/a;-><init>(Ljava/lang/String;)V

    return-object v0
.end method
