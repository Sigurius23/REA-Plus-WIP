.class public abstract Lpp0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0000*\u00020\u0001\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\"\u0014\u0010\u0008\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\u0007\"\u001c\u0010\u000c\u001a\n \n*\u0004\u0018\u00010\t0\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0002\u0010\u000b\"\u001c\u0010\u000e\u001a\n \n*\u0004\u0018\u00010\t0\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000b\u00a8\u0006\u000f"
    }
    d2 = {
        "",
        "Lorg/joda/time/LocalDateTime;",
        "b",
        "(Ljava/lang/String;)Lorg/joda/time/LocalDateTime;",
        "a",
        "(Lorg/joda/time/LocalDateTime;)Ljava/lang/String;",
        "Lyb3/p;",
        "Lyb3/p;",
        "OFFSET_SUFFIX_REGEX",
        "Lorg/joda/time/format/DateTimeFormatter;",
        "kotlin.jvm.PlatformType",
        "Lorg/joda/time/format/DateTimeFormatter;",
        "LOCAL_FMT_WITH_MILLIS",
        "c",
        "LOCAL_FMT_NO_MILLIS",
        "add-activity_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final a:Lyb3/p;

.field private static final b:Lorg/joda/time/format/DateTimeFormatter;

.field private static final c:Lorg/joda/time/format/DateTimeFormatter;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lyb3/p;

    const-string v1, "([Zz]|[+-]\\d{2}:?\\d{2})$"

    invoke-direct {v0, v1}, Lyb3/p;-><init>(Ljava/lang/String;)V

    sput-object v0, Lpp0/b;->a:Lyb3/p;

    const-string v0, "yyyy-MM-dd\'T\'HH:mm:ss.SSS"

    invoke-static {v0}, Lorg/joda/time/format/DateTimeFormat;->forPattern(Ljava/lang/String;)Lorg/joda/time/format/DateTimeFormatter;

    move-result-object v0

    sput-object v0, Lpp0/b;->b:Lorg/joda/time/format/DateTimeFormatter;

    const-string v0, "yyyy-MM-dd\'T\'HH:mm:ss"

    invoke-static {v0}, Lorg/joda/time/format/DateTimeFormat;->forPattern(Ljava/lang/String;)Lorg/joda/time/format/DateTimeFormatter;

    move-result-object v0

    sput-object v0, Lpp0/b;->c:Lorg/joda/time/format/DateTimeFormatter;

    return-void
.end method

.method public static final a(Lorg/joda/time/LocalDateTime;)Ljava/lang/String;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lorg/joda/time/DateTimeZone;->getDefault()Lorg/joda/time/DateTimeZone;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/joda/time/LocalDateTime;->toDateTime(Lorg/joda/time/DateTimeZone;)Lorg/joda/time/DateTime;

    move-result-object p0

    sget-object v0, Lcom/whoop/data/remote/domain/dto/DateTimeRange;->Companion:Lcom/whoop/data/remote/domain/dto/DateTimeRange$Companion;

    invoke-virtual {v0}, Lcom/whoop/data/remote/domain/dto/DateTimeRange$Companion;->getDateTimeFormatter()Lorg/joda/time/format/DateTimeFormatter;

    move-result-object v0

    invoke-virtual {v0}, Lorg/joda/time/format/DateTimeFormatter;->withZoneUTC()Lorg/joda/time/format/DateTimeFormatter;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/joda/time/base/AbstractInstant;->toString(Lorg/joda/time/format/DateTimeFormatter;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "toString(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final b(Ljava/lang/String;)Lorg/joda/time/LocalDateTime;
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lorg/joda/time/DateTimeZone;->getDefault()Lorg/joda/time/DateTimeZone;

    move-result-object v0

    sget-object v1, Lpp0/b;->a:Lyb3/p;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, v1, Lyb3/p;->w:Ljava/util/regex/Pattern;

    invoke-virtual {v1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/regex/Matcher;->find()Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Lcom/whoop/data/remote/domain/dto/DateTimeRange;->Companion:Lcom/whoop/data/remote/domain/dto/DateTimeRange$Companion;

    invoke-virtual {v1}, Lcom/whoop/data/remote/domain/dto/DateTimeRange$Companion;->getDateTimeFormatter()Lorg/joda/time/format/DateTimeFormatter;

    move-result-object v1

    invoke-virtual {v1}, Lorg/joda/time/format/DateTimeFormatter;->withOffsetParsed()Lorg/joda/time/format/DateTimeFormatter;

    move-result-object v1

    invoke-virtual {v1, p0}, Lorg/joda/time/format/DateTimeFormatter;->parseDateTime(Ljava/lang/String;)Lorg/joda/time/DateTime;

    move-result-object p0

    invoke-virtual {p0}, Lorg/joda/time/base/AbstractInstant;->toInstant()Lorg/joda/time/Instant;

    move-result-object p0

    new-instance v1, Lorg/joda/time/LocalDateTime;

    invoke-virtual {p0}, Lorg/joda/time/Instant;->getMillis()J

    move-result-wide v2

    invoke-direct {v1, v2, v3, v0}, Lorg/joda/time/LocalDateTime;-><init>(JLorg/joda/time/DateTimeZone;)V

    return-object v1

    :cond_0
    const/16 v1, 0x2e

    const/4 v2, 0x6

    const/4 v3, 0x0

    invoke-static {p0, v1, v3, v3, v2}, Lyb3/r;->f0(Ljava/lang/CharSequence;CIZI)I

    move-result v1

    if-ltz v1, :cond_1

    sget-object v1, Lpp0/b;->b:Lorg/joda/time/format/DateTimeFormatter;

    goto :goto_0

    :cond_1
    sget-object v1, Lpp0/b;->c:Lorg/joda/time/format/DateTimeFormatter;

    :goto_0
    invoke-static {p0, v1}, Lorg/joda/time/LocalDateTime;->parse(Ljava/lang/String;Lorg/joda/time/format/DateTimeFormatter;)Lorg/joda/time/LocalDateTime;

    move-result-object p0

    invoke-virtual {v0, p0}, Lorg/joda/time/DateTimeZone;->isLocalDateTimeGap(Lorg/joda/time/LocalDateTime;)Z

    move-result v1

    if-eqz v1, :cond_3

    :goto_1
    invoke-virtual {v0, p0}, Lorg/joda/time/DateTimeZone;->isLocalDateTimeGap(Lorg/joda/time/LocalDateTime;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, 0x1

    invoke-virtual {p0, v1}, Lorg/joda/time/LocalDateTime;->minusMinutes(I)Lorg/joda/time/LocalDateTime;

    move-result-object p0

    goto :goto_1

    :cond_2
    invoke-virtual {p0, v0}, Lorg/joda/time/LocalDateTime;->toDateTime(Lorg/joda/time/DateTimeZone;)Lorg/joda/time/DateTime;

    move-result-object p0

    invoke-virtual {p0}, Lorg/joda/time/base/BaseDateTime;->getMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lorg/joda/time/DateTimeZone;->nextTransition(J)J

    move-result-wide v1

    new-instance p0, Lorg/joda/time/LocalDateTime;

    invoke-direct {p0, v1, v2, v0}, Lorg/joda/time/LocalDateTime;-><init>(JLorg/joda/time/DateTimeZone;)V

    return-object p0

    :cond_3
    invoke-virtual {p0, v0}, Lorg/joda/time/LocalDateTime;->toDateTime(Lorg/joda/time/DateTimeZone;)Lorg/joda/time/DateTime;

    move-result-object p0

    invoke-virtual {p0}, Lorg/joda/time/DateTime;->withLaterOffsetAtOverlap()Lorg/joda/time/DateTime;

    move-result-object p0

    invoke-virtual {p0}, Lorg/joda/time/DateTime;->toLocalDateTime()Lorg/joda/time/LocalDateTime;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object p0
.end method
