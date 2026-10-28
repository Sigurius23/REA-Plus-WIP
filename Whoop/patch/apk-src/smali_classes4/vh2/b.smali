.class public final Lvh2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lst0/r;
.implements Lvh2/a;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J%\u0010\u000c\u001a\u00020\u000b2\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0015R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00178VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0018\u0010\u001b\u00a8\u0006\u001d"
    }
    d2 = {
        "Lvh2/b;",
        "Lst0/r;",
        "Lvh2/a;",
        "Ljava/time/Clock;",
        "clock",
        "<init>",
        "(Ljava/time/Clock;)V",
        "Lst0/q;",
        "state",
        "",
        "counterSeconds",
        "Ll83/a0;",
        "e",
        "(Lst0/q;Ljava/lang/Long;)V",
        "Lst0/p;",
        "lockInfo",
        "c",
        "(Lst0/p;)V",
        "a",
        "()V",
        "d",
        "Ljava/time/Clock;",
        "Lec3/p1;",
        "Lst0/t;",
        "b",
        "Lec3/p1;",
        "recordedStatus",
        "()Lst0/t;",
        "lockStatus",
        "strap-auth_release"
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

.field private final b:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/time/Clock;)V
    .locals 1

    const-string v0, "clock"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvh2/b;->a:Ljava/time/Clock;

    const/4 p1, 0x0

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Lvh2/b;->b:Lec3/p1;

    return-void
.end method

.method private final e(Lst0/q;Ljava/lang/Long;)V
    .locals 5

    iget-object v0, p0, Lvh2/b;->b:Lec3/p1;

    new-instance v1, Lst0/t;

    const/4 v2, 0x0

    if-eqz p2, :cond_0

    sget-object v3, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    sget-object p2, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    invoke-static {v3, v4, p2}, Lkotlin/time/DurationKt;->toDuration(JLkotlin/time/DurationUnit;)J

    move-result-wide v3

    invoke-static {v3, v4}, Lkotlin/time/Duration;->box-impl(J)Lkotlin/time/Duration;

    move-result-object p2

    goto :goto_0

    :cond_0
    move-object p2, v2

    :goto_0
    iget-object v3, p0, Lvh2/b;->a:Ljava/time/Clock;

    invoke-virtual {v3}, Ljava/time/Clock;->millis()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    move-result-object v3

    const-string v4, "ofEpochMilli(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, p1, p2, v3, v2}, Lst0/t;-><init>(Lst0/q;Lkotlin/time/Duration;Ljava/time/Instant;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0, v2, v1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method

.method public static synthetic f(Lvh2/b;Lst0/q;Ljava/lang/Long;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-direct {p0, p1, p2}, Lvh2/b;->e(Lst0/q;Ljava/lang/Long;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    sget-object v0, Lst0/q;->UNLOCKED:Lst0/q;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {p0, v0, v1, v2, v1}, Lvh2/b;->f(Lvh2/b;Lst0/q;Ljava/lang/Long;ILjava/lang/Object;)V

    return-void
.end method

.method public b()Lst0/t;
    .locals 8

    iget-object v0, p0, Lvh2/b;->b:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lst0/t;

    const/4 v0, 0x0

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lst0/t;->c()Lkotlin/time/Duration;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lkotlin/time/Duration;->unbox-impl()J

    move-result-wide v2

    sget-object v0, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    iget-object v0, p0, Lvh2/b;->a:Ljava/time/Clock;

    invoke-virtual {v0}, Ljava/time/Clock;->millis()J

    move-result-wide v4

    invoke-virtual {v1}, Lst0/t;->d()Ljava/time/Instant;

    move-result-object v0

    invoke-virtual {v0}, Ljava/time/Instant;->toEpochMilli()J

    move-result-wide v6

    sub-long/2addr v4, v6

    sget-object v0, Lkotlin/time/DurationUnit;->MILLISECONDS:Lkotlin/time/DurationUnit;

    invoke-static {v4, v5, v0}, Lkotlin/time/DurationKt;->toDuration(JLkotlin/time/DurationUnit;)J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lkotlin/time/Duration;->minus-LRDsOJo(JJ)J

    move-result-wide v4

    invoke-static {v4, v5}, Lkotlin/time/Duration;->box-impl(J)Lkotlin/time/Duration;

    move-result-object v0

    sget-object v4, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    invoke-virtual {v4}, Lkotlin/time/Duration$Companion;->getZERO-UwyO8pc()J

    move-result-wide v4

    invoke-static {v4, v5}, Lkotlin/time/Duration;->box-impl(J)Lkotlin/time/Duration;

    move-result-object v4

    invoke-static {v2, v3}, Lkotlin/time/Duration;->box-impl(J)Lkotlin/time/Duration;

    move-result-object v2

    invoke-static {v0, v4, v2}, Le93/b;->s(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;

    move-result-object v0

    check-cast v0, Lkotlin/time/Duration;

    invoke-virtual {v0}, Lkotlin/time/Duration;->unbox-impl()J

    move-result-wide v2

    invoke-static {v2, v3}, Lkotlin/time/Duration;->box-impl(J)Lkotlin/time/Duration;

    move-result-object v0

    :cond_0
    move-object v3, v0

    const/4 v5, 0x5

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lst0/t;->b(Lst0/t;Lst0/q;Lkotlin/time/Duration;Ljava/time/Instant;ILjava/lang/Object;)Lst0/t;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method public c(Lst0/p;)V
    .locals 3

    const-string v0, "lockInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lst0/p$b;

    if-eqz v0, :cond_0

    check-cast p1, Lst0/p$b;

    invoke-virtual {p1}, Lst0/p$b;->b()Lst0/q;

    move-result-object v0

    invoke-virtual {p1}, Lst0/p$b;->a()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lvh2/b;->e(Lst0/q;Ljava/lang/Long;)V

    return-void

    :cond_0
    sget-object v0, Lst0/p$a;->a:Lst0/p$a;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x2

    const/4 v0, 0x0

    invoke-static {p0, v0, v0, p1, v0}, Lvh2/b;->f(Lvh2/b;Lst0/q;Ljava/lang/Long;ILjava/lang/Object;)V

    return-void

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public d()V
    .locals 3

    sget-object v0, Lst0/q;->LOCKED:Lst0/q;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {p0, v0, v1, v2, v1}, Lvh2/b;->f(Lvh2/b;Lst0/q;Ljava/lang/Long;ILjava/lang/Object;)V

    return-void
.end method
