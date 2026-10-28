.class public final Lkotlin/time/InstantJvmKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\u001a\n\u0010\u0002\u001a\u00020\u0003H\u0080\u0080\u0004\u001a\u0012\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H\u0080\u0080\u0004\"\u000f\u0010\u0000\u001a\u00020\u0001X\u0082\u0084\u0008\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"
    }
    d2 = {
        "systemClock",
        "Lkotlin/time/Clock;",
        "systemClockNow",
        "Lkotlin/time/Instant;",
        "serializedInstant",
        "",
        "instant",
        "kotlin-stdlib"
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
.field private static final systemClock:Lkotlin/time/Clock;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Lw83/a;->a:Ljava/lang/Integer;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lw83/b;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    goto :goto_1

    :cond_1
    :goto_0
    new-instance v0, Lt9/p;

    const/16 v1, 0xc

    invoke-direct {v0, v1}, Lt9/p;-><init>(I)V

    :goto_1
    sput-object v0, Lkotlin/time/InstantJvmKt;->systemClock:Lkotlin/time/Clock;

    return-void
.end method

.method public static final serializedInstant(Lkotlin/time/Instant;)Ljava/lang/Object;
    .locals 3

    const-string v0, "instant"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lkotlin/time/InstantSerialized;

    invoke-virtual {p0}, Lkotlin/time/Instant;->getEpochSeconds()J

    move-result-wide v1

    invoke-virtual {p0}, Lkotlin/time/Instant;->getNanosecondsOfSecond()I

    move-result p0

    invoke-direct {v0, v1, v2, p0}, Lkotlin/time/InstantSerialized;-><init>(JI)V

    return-object v0
.end method

.method public static final systemClockNow()Lkotlin/time/Instant;
    .locals 1

    sget-object v0, Lkotlin/time/InstantJvmKt;->systemClock:Lkotlin/time/Clock;

    invoke-interface {v0}, Lkotlin/time/Clock;->now()Lkotlin/time/Instant;

    move-result-object v0

    return-object v0
.end method
