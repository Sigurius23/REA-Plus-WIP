.class public final Lj$/time/DesugarDuration;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static toMinutesPart(Ljava/time/Duration;)I
    .locals 4

    .line 193
    invoke-virtual {p0}, Ljava/time/Duration;->toMinutes()J

    move-result-wide v0

    const-wide/16 v2, 0x3c

    rem-long/2addr v0, v2

    long-to-int p0, v0

    return p0
.end method

.method public static toSecondsPart(Ljava/time/Duration;)I
    .locals 4

    .line 209
    invoke-virtual {p0}, Ljava/time/Duration;->getSeconds()J

    move-result-wide v0

    const-wide/16 v2, 0x3c

    .line 210
    rem-long/2addr v0, v2

    long-to-int p0, v0

    return p0
.end method
