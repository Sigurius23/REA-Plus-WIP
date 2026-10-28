.class public abstract Lzr2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u001a5\u0010\u0008\u001a\u00020\u0007*\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a\u0019\u0010\u000c\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\n\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u000c\u0010\r\u001a\u0011\u0010\u000f\u001a\u00020\u000e*\u00020\u0000\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lzr2/a;",
        "Lorg/joda/time/LocalDate;",
        "localDate",
        "Lorg/joda/time/LocalTime;",
        "localTime",
        "Lorg/joda/time/DateTimeZone;",
        "timeZone",
        "Lorg/joda/time/DateTime;",
        "b",
        "(Lzr2/a;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalTime;Lorg/joda/time/DateTimeZone;)Lorg/joda/time/DateTime;",
        "dateTime",
        "Lorg/joda/time/LocalDateTime;",
        "d",
        "(Lzr2/a;Lorg/joda/time/DateTime;)Lorg/joda/time/LocalDateTime;",
        "",
        "a",
        "(Lzr2/a;)I",
        "essentials_release"
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
.method public static final a(Lzr2/a;)I
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lzr2/a;->b()J

    move-result-wide v0

    long-to-double v0, v0

    const-wide v2, 0x408f400000000000L    # 1000.0

    div-double/2addr v0, v2

    invoke-static {v0, v1}, Le93/b;->W(D)I

    move-result p0

    return p0
.end method

.method public static final b(Lzr2/a;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalTime;Lorg/joda/time/DateTimeZone;)Lorg/joda/time/DateTime;
    .locals 10

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lzr2/a;->c()Lorg/joda/time/DateTime;

    move-result-object v0

    new-instance v1, Lorg/joda/time/DateTime;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lorg/joda/time/LocalDate;->getYear()I

    move-result v2

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lorg/joda/time/base/AbstractDateTime;->getYear()I

    move-result v2

    :goto_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lorg/joda/time/LocalDate;->getMonthOfYear()I

    move-result v3

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Lorg/joda/time/base/AbstractDateTime;->getMonthOfYear()I

    move-result v3

    :goto_1
    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lorg/joda/time/LocalDate;->getDayOfMonth()I

    move-result p1

    :goto_2
    move v4, p1

    goto :goto_3

    :cond_2
    invoke-virtual {v0}, Lorg/joda/time/base/AbstractDateTime;->getDayOfMonth()I

    move-result p1

    goto :goto_2

    :goto_3
    if-eqz p2, :cond_3

    invoke-virtual {p2}, Lorg/joda/time/LocalTime;->getHourOfDay()I

    move-result p1

    :goto_4
    move v5, p1

    goto :goto_5

    :cond_3
    invoke-virtual {v0}, Lorg/joda/time/base/AbstractDateTime;->getHourOfDay()I

    move-result p1

    goto :goto_4

    :goto_5
    if-eqz p2, :cond_4

    invoke-virtual {p2}, Lorg/joda/time/LocalTime;->getMinuteOfHour()I

    move-result p1

    :goto_6
    move v6, p1

    goto :goto_7

    :cond_4
    invoke-virtual {v0}, Lorg/joda/time/base/AbstractDateTime;->getMinuteOfHour()I

    move-result p1

    goto :goto_6

    :goto_7
    if-eqz p2, :cond_5

    invoke-virtual {p2}, Lorg/joda/time/LocalTime;->getSecondOfMinute()I

    move-result p1

    :goto_8
    move v7, p1

    goto :goto_9

    :cond_5
    invoke-virtual {v0}, Lorg/joda/time/base/AbstractDateTime;->getSecondOfMinute()I

    move-result p1

    goto :goto_8

    :goto_9
    if-eqz p2, :cond_6

    invoke-virtual {p2}, Lorg/joda/time/LocalTime;->getMillisOfSecond()I

    move-result p1

    :goto_a
    move v8, p1

    goto :goto_b

    :cond_6
    invoke-virtual {v0}, Lorg/joda/time/base/AbstractDateTime;->getMillisOfSecond()I

    move-result p1

    goto :goto_a

    :goto_b
    if-nez p3, :cond_7

    invoke-interface {p0}, Lzr2/a;->e()Lorg/joda/time/DateTimeZone;

    move-result-object p3

    :cond_7
    move-object v9, p3

    invoke-direct/range {v1 .. v9}, Lorg/joda/time/DateTime;-><init>(IIIIIIILorg/joda/time/DateTimeZone;)V

    return-object v1
.end method

.method public static synthetic c(Lzr2/a;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalTime;Lorg/joda/time/DateTimeZone;ILjava/lang/Object;)Lorg/joda/time/DateTime;
    .locals 1

    and-int/lit8 p5, p4, 0x1

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    move-object p3, v0

    :cond_2
    invoke-static {p0, p1, p2, p3}, Lzr2/b;->b(Lzr2/a;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalTime;Lorg/joda/time/DateTimeZone;)Lorg/joda/time/DateTime;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lzr2/a;Lorg/joda/time/DateTime;)Lorg/joda/time/LocalDateTime;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dateTime"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lzr2/a;->e()Lorg/joda/time/DateTimeZone;

    move-result-object p0

    invoke-virtual {p1, p0}, Lorg/joda/time/DateTime;->withZone(Lorg/joda/time/DateTimeZone;)Lorg/joda/time/DateTime;

    move-result-object p0

    invoke-virtual {p0}, Lorg/joda/time/DateTime;->toLocalDateTime()Lorg/joda/time/LocalDateTime;

    move-result-object p0

    const-string p1, "toLocalDateTime(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method
