.class public abstract Lyr1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a\u0015\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "",
        "requestDate",
        "",
        "a",
        "(Ljava/lang/String;)I",
        "",
        "dateTimeInMills",
        "Lorg/joda/time/DateTime;",
        "b",
        "(J)Lorg/joda/time/DateTime;",
        "journal_release"
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
.method public static final a(Ljava/lang/String;)I
    .locals 1

    const-string v0, "requestDate"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lorg/joda/time/DateTime;->now()Lorg/joda/time/DateTime;

    move-result-object v0

    invoke-virtual {v0}, Lorg/joda/time/DateTime;->toLocalDate()Lorg/joda/time/LocalDate;

    move-result-object v0

    invoke-static {p0}, Lorg/joda/time/LocalDate;->parse(Ljava/lang/String;)Lorg/joda/time/LocalDate;

    move-result-object p0

    invoke-static {p0, v0}, Lorg/joda/time/Days;->daysBetween(Lorg/joda/time/ReadablePartial;Lorg/joda/time/ReadablePartial;)Lorg/joda/time/Days;

    move-result-object p0

    invoke-virtual {p0}, Lorg/joda/time/Days;->getDays()I

    move-result p0

    return p0
.end method

.method public static final b(J)Lorg/joda/time/DateTime;
    .locals 2

    new-instance v0, Lorg/joda/time/DateTime;

    invoke-direct {v0, p0, p1}, Lorg/joda/time/DateTime;-><init>(J)V

    invoke-virtual {v0}, Lorg/joda/time/base/AbstractDateTime;->getMinuteOfHour()I

    move-result v0

    new-instance v1, Lorg/joda/time/DateTime;

    invoke-direct {v1, p0, p1}, Lorg/joda/time/DateTime;-><init>(J)V

    div-int/lit8 v0, v0, 0x1e

    mul-int/lit8 v0, v0, 0x1e

    invoke-virtual {v1, v0}, Lorg/joda/time/DateTime;->withMinuteOfHour(I)Lorg/joda/time/DateTime;

    move-result-object p0

    invoke-virtual {p0}, Lorg/joda/time/DateTime;->minuteOfDay()Lorg/joda/time/DateTime$Property;

    move-result-object p0

    invoke-virtual {p0}, Lorg/joda/time/DateTime$Property;->roundFloorCopy()Lorg/joda/time/DateTime;

    move-result-object p0

    const-string p1, "roundFloorCopy(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method
