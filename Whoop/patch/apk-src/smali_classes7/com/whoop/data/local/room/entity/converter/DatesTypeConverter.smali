.class public final Lcom/whoop/data/local/room/entity/converter/DatesTypeConverter;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007J\u0014\u0010\u0008\u001a\u0004\u0018\u00010\u00072\u0008\u0010\t\u001a\u0004\u0018\u00010\u0005H\u0007J\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007J\u0014\u0010\u000c\u001a\u0004\u0018\u00010\u00072\u0008\u0010\t\u001a\u0004\u0018\u00010\u000bH\u0007J\u0014\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007J\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00072\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000eH\u0007\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/whoop/data/local/room/entity/converter/DatesTypeConverter;",
        "",
        "<init>",
        "()V",
        "stringToLocalDateTime",
        "Lorg/joda/time/LocalDateTime;",
        "value",
        "",
        "localDateTimeToString",
        "date",
        "stringToDateTime",
        "Lorg/joda/time/DateTime;",
        "dateTimeToString",
        "stringToInstant",
        "Lorg/joda/time/Instant;",
        "instantToString",
        "instant",
        "app_prodStandardRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final dateTimeToString(Lorg/joda/time/DateTime;)Ljava/lang/String;
    .locals 0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lorg/joda/time/base/AbstractDateTime;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final instantToString(Lorg/joda/time/Instant;)Ljava/lang/String;
    .locals 0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lorg/joda/time/base/AbstractInstant;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final localDateTimeToString(Lorg/joda/time/LocalDateTime;)Ljava/lang/String;
    .locals 0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lorg/joda/time/LocalDateTime;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final stringToDateTime(Ljava/lang/String;)Lorg/joda/time/DateTime;
    .locals 0

    if-eqz p1, :cond_0

    invoke-static {p1}, Lorg/joda/time/DateTime;->parse(Ljava/lang/String;)Lorg/joda/time/DateTime;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final stringToInstant(Ljava/lang/String;)Lorg/joda/time/Instant;
    .locals 0

    if-eqz p1, :cond_0

    invoke-static {p1}, Lorg/joda/time/Instant;->parse(Ljava/lang/String;)Lorg/joda/time/Instant;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final stringToLocalDateTime(Ljava/lang/String;)Lorg/joda/time/LocalDateTime;
    .locals 0

    if-eqz p1, :cond_0

    invoke-static {p1}, Lorg/joda/time/LocalDateTime;->parse(Ljava/lang/String;)Lorg/joda/time/LocalDateTime;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method
