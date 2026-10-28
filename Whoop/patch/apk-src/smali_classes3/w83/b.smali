.class public final Lw83/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/time/Clock;


# virtual methods
.method public final now()Lkotlin/time/Instant;
    .locals 3

    sget-object v0, Lkotlin/time/Instant;->Companion:Lkotlin/time/Instant$Companion;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lkotlin/time/Instant$Companion;->fromEpochMilliseconds(J)Lkotlin/time/Instant;

    move-result-object v0

    return-object v0
.end method
