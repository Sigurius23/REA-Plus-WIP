.class public abstract Lor2/v1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u001a\u0015\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0004*\u00020\u0000\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "",
        "durationMillis",
        "a",
        "(J)J",
        "",
        "b",
        "(J)Ljava/lang/String;",
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
.method public static final a(J)J
    .locals 6

    const-wide/32 v0, 0xea60

    rem-long v2, p0, v0

    const-wide/16 v4, 0x7530

    cmp-long v4, v2, v4

    if-ltz v4, :cond_0

    sub-long/2addr v0, v2

    add-long/2addr v0, p0

    return-wide v0

    :cond_0
    sub-long/2addr p0, v2

    return-wide p0
.end method

.method public static final b(J)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    move-result-object p0

    sget-object p1, Ljava/time/ZoneOffset;->UTC:Ljava/time/ZoneOffset;

    invoke-static {p0, p1}, Ljava/time/OffsetDateTime;->ofInstant(Ljava/time/Instant;Ljava/time/ZoneId;)Ljava/time/OffsetDateTime;

    move-result-object p0

    const-string p1, "yyyy-MM-dd\'T\'HH:mm:ssZ"

    invoke-static {p1}, Ljava/time/format/DateTimeFormatter;->ofPattern(Ljava/lang/String;)Ljava/time/format/DateTimeFormatter;

    move-result-object p1

    invoke-virtual {p1, p0}, Ljava/time/format/DateTimeFormatter;->format(Ljava/time/temporal/TemporalAccessor;)Ljava/lang/String;

    move-result-object p0

    const-string p1, "format(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method
