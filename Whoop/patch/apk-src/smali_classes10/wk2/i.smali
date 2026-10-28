.class public final Lwk2/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lwk2/i;",
        "",
        "Ljava/time/Clock;",
        "clock",
        "<init>",
        "(Ljava/time/Clock;)V",
        "Lwk2/k;",
        "previous",
        "Lyg2/d;",
        "liveHrState",
        "a",
        "(Lwk2/k;Lyg2/d;)Lwk2/k;",
        "Ljava/time/Clock;",
        "track-activity_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Ljava/time/Clock;


# direct methods
.method public constructor <init>(Ljava/time/Clock;)V
    .locals 1

    const-string v0, "clock"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwk2/i;->a:Ljava/time/Clock;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/time/Clock;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 2
    invoke-static {}, Ljava/time/Clock;->systemDefaultZone()Ljava/time/Clock;

    move-result-object p1

    const-string p2, "systemDefaultZone(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    invoke-direct {p0, p1}, Lwk2/i;-><init>(Ljava/time/Clock;)V

    return-void
.end method


# virtual methods
.method public final a(Lwk2/k;Lyg2/d;)Lwk2/k;
    .locals 7

    const-string v0, "previous"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "liveHrState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lwk2/i;->a:Ljava/time/Clock;

    invoke-virtual {v0}, Ljava/time/Clock;->instant()Ljava/time/Instant;

    move-result-object v0

    invoke-virtual {p1}, Lwk2/k;->b()Lcom/whoop/hrZones/network/ZoneID;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Lwk2/k;->a()Ljava/time/Instant;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Lwk2/k;->a()Ljava/time/Instant;

    move-result-object v1

    invoke-static {v1, v0}, Ljava/time/Duration;->between(Ljava/time/temporal/Temporal;Ljava/time/temporal/Temporal;)Ljava/time/Duration;

    move-result-object v1

    invoke-virtual {p1}, Lwk2/k;->c()Ljava/util/Map;

    move-result-object v2

    invoke-virtual {p1}, Lwk2/k;->b()Lcom/whoop/hrZones/network/ZoneID;

    move-result-object v3

    invoke-virtual {p1}, Lwk2/k;->c()Ljava/util/Map;

    move-result-object v4

    invoke-virtual {p1}, Lwk2/k;->b()Lcom/whoop/hrZones/network/ZoneID;

    move-result-object p1

    sget-object v5, Ljava/time/Duration;->ZERO:Ljava/time/Duration;

    const-string v6, "ZERO"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v4, p1, v5}, Ljava/util/Map;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/time/Duration;

    invoke-virtual {p1, v1}, Ljava/time/Duration;->plus(Ljava/time/Duration;)Ljava/time/Duration;

    move-result-object p1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v3, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v2, v1}, Lm83/g0;->e0(Ljava/util/Map;Ll83/k;)Ljava/util/Map;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lwk2/k;->c()Ljava/util/Map;

    move-result-object p1

    :goto_0
    new-instance v1, Lwk2/k;

    instance-of v2, p2, Lyg2/d$a;

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    check-cast p2, Lyg2/d$a;

    goto :goto_1

    :cond_1
    move-object p2, v3

    :goto_1
    if-eqz p2, :cond_2

    invoke-virtual {p2}, Lyg2/d$a;->b()Lcom/whoop/hrZones/network/ZoneID;

    move-result-object v3

    :cond_2
    invoke-direct {v1, p1, v3, v0}, Lwk2/k;-><init>(Ljava/util/Map;Lcom/whoop/hrZones/network/ZoneID;Ljava/time/Instant;)V

    return-object v1
.end method
