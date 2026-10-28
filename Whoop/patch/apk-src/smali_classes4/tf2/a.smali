.class public abstract Ltf2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a\u001f\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u001a\u001f\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0005\u00a8\u0006\u0007"
    }
    d2 = {
        "Lorg/joda/time/LocalTime;",
        "time",
        "Lorg/joda/time/DateTime;",
        "now",
        "a",
        "(Lorg/joda/time/LocalTime;Lorg/joda/time/DateTime;)Lorg/joda/time/DateTime;",
        "c",
        "smart-alarm_release"
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
.method public static final a(Lorg/joda/time/LocalTime;Lorg/joda/time/DateTime;)Lorg/joda/time/DateTime;
    .locals 1

    const-string v0, "time"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "now"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lorg/joda/time/DateTime;->toLocalTime()Lorg/joda/time/LocalTime;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/joda/time/base/AbstractPartial;->isBefore(Lorg/joda/time/ReadablePartial;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lorg/joda/time/DateTime;->plusDays(I)Lorg/joda/time/DateTime;

    move-result-object p1

    invoke-virtual {p1, p0}, Lorg/joda/time/DateTime;->withTime(Lorg/joda/time/LocalTime;)Lorg/joda/time/DateTime;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object p0

    :cond_0
    invoke-virtual {p1, p0}, Lorg/joda/time/DateTime;->withTime(Lorg/joda/time/LocalTime;)Lorg/joda/time/DateTime;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object p0
.end method

.method public static synthetic b(Lorg/joda/time/LocalTime;Lorg/joda/time/DateTime;ILjava/lang/Object;)Lorg/joda/time/DateTime;
    .locals 0

    and-int/lit8 p2, p2, 0x2

    if-eqz p2, :cond_0

    invoke-static {}, Lorg/joda/time/DateTime;->now()Lorg/joda/time/DateTime;

    move-result-object p1

    const-string p2, "now(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    invoke-static {p0, p1}, Ltf2/a;->a(Lorg/joda/time/LocalTime;Lorg/joda/time/DateTime;)Lorg/joda/time/DateTime;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lorg/joda/time/LocalTime;Lorg/joda/time/DateTime;)Lorg/joda/time/DateTime;
    .locals 1

    const-string v0, "time"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "now"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lorg/joda/time/DateTime;->toLocalTime()Lorg/joda/time/LocalTime;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/joda/time/base/AbstractPartial;->isAfter(Lorg/joda/time/ReadablePartial;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lorg/joda/time/DateTime;->minusDays(I)Lorg/joda/time/DateTime;

    move-result-object p1

    invoke-virtual {p1, p0}, Lorg/joda/time/DateTime;->withTime(Lorg/joda/time/LocalTime;)Lorg/joda/time/DateTime;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object p0

    :cond_0
    invoke-virtual {p1, p0}, Lorg/joda/time/DateTime;->withTime(Lorg/joda/time/LocalTime;)Lorg/joda/time/DateTime;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object p0
.end method
