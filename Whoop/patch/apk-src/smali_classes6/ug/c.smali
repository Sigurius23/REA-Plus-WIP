.class public abstract Lug/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lt9/p;J)Lug/b;
    .locals 4

    const/16 p0, 0x3e8

    int-to-long v0, p0

    div-long v2, p1, v0

    mul-long/2addr v0, v2

    sub-long/2addr p1, v0

    const p0, 0xf4240

    int-to-long v0, p0

    mul-long/2addr p1, v0

    long-to-int p0, p1

    invoke-static {p0, v2, v3}, Lt9/p;->n(IJ)Lug/b;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lug/b;)J
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lug/b;->w:Ljava/time/Instant;

    invoke-virtual {p0}, Ljava/time/Instant;->getEpochSecond()J

    move-result-wide v0

    const/16 v2, 0x3e8

    int-to-long v2, v2

    mul-long/2addr v0, v2

    invoke-virtual {p0}, Ljava/time/Instant;->getNano()I

    move-result p0

    const v2, 0xf4240

    div-int/2addr p0, v2

    int-to-long v2, p0

    add-long/2addr v0, v2

    return-wide v0
.end method

.method public static final c(Lug/b;Lug/b;)J
    .locals 2

    sget-object v0, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    invoke-static {p1}, Lug/c;->b(Lug/b;)J

    move-result-wide v0

    invoke-static {p0}, Lug/c;->b(Lug/b;)J

    move-result-wide p0

    sub-long/2addr v0, p0

    sget-object p0, Lkotlin/time/DurationUnit;->MILLISECONDS:Lkotlin/time/DurationUnit;

    invoke-static {v0, v1, p0}, Lkotlin/time/DurationKt;->toDuration(JLkotlin/time/DurationUnit;)J

    move-result-wide p0

    return-wide p0
.end method
