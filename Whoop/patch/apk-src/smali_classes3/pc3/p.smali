.class public final Lpc3/p;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Ljava/lang/String;)Lkotlinx/datetime/TimeZone;
    .locals 1

    const-string v0, "zoneId"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    const-string v0, "z"

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p0, "Z"

    :cond_0
    invoke-static {p0}, Ljava/time/ZoneId;->of(Ljava/lang/String;)Ljava/time/ZoneId;

    move-result-object p0

    const-string v0, "of(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lpc3/p;->b(Ljava/time/ZoneId;)Lkotlinx/datetime/TimeZone;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    instance-of v0, p0, Ljava/time/DateTimeException;

    if-eqz v0, :cond_1

    new-instance v0, Lkotlinx/datetime/IllegalTimeZoneException;

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :cond_1
    throw p0
.end method

.method public static b(Ljava/time/ZoneId;)Lkotlinx/datetime/TimeZone;
    .locals 4

    instance-of v0, p0, Ljava/time/ZoneOffset;

    if-eqz v0, :cond_0

    new-instance v0, Lkotlinx/datetime/FixedOffsetTimeZone;

    new-instance v1, Lkotlinx/datetime/UtcOffset;

    check-cast p0, Ljava/time/ZoneOffset;

    invoke-direct {v1, p0}, Lkotlinx/datetime/UtcOffset;-><init>(Ljava/time/ZoneOffset;)V

    invoke-direct {v0, v1}, Lkotlinx/datetime/FixedOffsetTimeZone;-><init>(Lkotlinx/datetime/UtcOffset;)V

    return-object v0

    :cond_0
    :try_start_0
    invoke-virtual {p0}, Ljava/time/ZoneId;->getRules()Ljava/time/zone/ZoneRules;

    move-result-object v0

    invoke-virtual {v0}, Ljava/time/zone/ZoneRules;->isFixedOffset()Z

    move-result v0
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    new-instance v0, Lkotlinx/datetime/FixedOffsetTimeZone;

    new-instance v1, Lkotlinx/datetime/UtcOffset;

    invoke-virtual {p0}, Ljava/time/ZoneId;->normalized()Ljava/time/ZoneId;

    move-result-object v2

    const-string v3, "null cannot be cast to non-null type java.time.ZoneOffset"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/time/ZoneOffset;

    invoke-direct {v1, v2}, Lkotlinx/datetime/UtcOffset;-><init>(Ljava/time/ZoneOffset;)V

    invoke-direct {v0, v1, p0}, Lkotlinx/datetime/FixedOffsetTimeZone;-><init>(Lkotlinx/datetime/UtcOffset;Ljava/time/ZoneId;)V

    goto :goto_1

    :cond_1
    new-instance v0, Lkotlinx/datetime/TimeZone;

    invoke-direct {v0, p0}, Lkotlinx/datetime/TimeZone;-><init>(Ljava/time/ZoneId;)V

    :goto_1
    return-object v0
.end method


# virtual methods
.method public final serializer()Lwc3/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lwc3/c;"
        }
    .end annotation

    sget-object v0, Lvc3/n;->a:Lvc3/n;

    return-object v0
.end method
