.class public abstract Lkp0/p;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u001a\u001b\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0004\u0008\u0006\u0010\u0005\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;",
        "Lorg/joda/time/DateTime;",
        "now",
        "",
        "c",
        "(Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;Lorg/joda/time/DateTime;)Z",
        "a",
        "sleep-coach_release"
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
.method public static final a(Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;Lorg/joda/time/DateTime;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "now"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->getUpperBoundLocalTime()Lorg/joda/time/LocalTime;

    move-result-object p0

    invoke-static {p0, p1}, Ltf2/a;->c(Lorg/joda/time/LocalTime;Lorg/joda/time/DateTime;)Lorg/joda/time/DateTime;

    move-result-object p0

    sget-object v0, Lorg/joda/time/Minutes;->TWO:Lorg/joda/time/Minutes;

    invoke-virtual {v0}, Lorg/joda/time/Minutes;->toStandardDuration()Lorg/joda/time/Duration;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/joda/time/DateTime;->plus(Lorg/joda/time/ReadableDuration;)Lorg/joda/time/DateTime;

    move-result-object p0

    invoke-virtual {p0, p1}, Lorg/joda/time/base/AbstractInstant;->isAfter(Lorg/joda/time/ReadableInstant;)Z

    move-result p0

    return p0
.end method

.method public static synthetic b(Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;Lorg/joda/time/DateTime;ILjava/lang/Object;)Z
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    invoke-static {}, Lorg/joda/time/DateTime;->now()Lorg/joda/time/DateTime;

    move-result-object p1

    const-string p2, "now(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    invoke-static {p0, p1}, Lkp0/p;->a(Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;Lorg/joda/time/DateTime;)Z

    move-result p0

    return p0
.end method

.method public static final c(Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;Lorg/joda/time/DateTime;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "now"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->getUpperBoundLocalTime()Lorg/joda/time/LocalTime;

    move-result-object v0

    invoke-static {v0, p1}, Ltf2/a;->a(Lorg/joda/time/LocalTime;Lorg/joda/time/DateTime;)Lorg/joda/time/DateTime;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->getWindowMinutes()I

    move-result p0

    invoke-virtual {v0, p0}, Lorg/joda/time/DateTime;->minusMinutes(I)Lorg/joda/time/DateTime;

    move-result-object p0

    invoke-virtual {p0, p1}, Lorg/joda/time/base/AbstractInstant;->isBefore(Lorg/joda/time/ReadableInstant;)Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-virtual {v0, p1}, Lorg/joda/time/base/AbstractInstant;->isAfter(Lorg/joda/time/ReadableInstant;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static synthetic d(Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;Lorg/joda/time/DateTime;ILjava/lang/Object;)Z
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    invoke-static {}, Lorg/joda/time/DateTime;->now()Lorg/joda/time/DateTime;

    move-result-object p1

    const-string p2, "now(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    invoke-static {p0, p1}, Lkp0/p;->c(Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;Lorg/joda/time/DateTime;)Z

    move-result p0

    return p0
.end method
