.class public final Lm32/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm32/f$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000cB\u001f\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0010\u0010\n\u001a\u00020\tH\u0086@\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u001a\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\rR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u000e\u00a8\u0006\u0010"
    }
    d2 = {
        "Lm32/f;",
        "",
        "La6/g;",
        "Lf6/f;",
        "dataStorePrefs",
        "Ljava/time/Clock;",
        "clock",
        "<init>",
        "(La6/g;Ljava/time/Clock;)V",
        "",
        "b",
        "(Lq83/d;)Ljava/lang/Object;",
        "a",
        "La6/g;",
        "Ljava/time/Clock;",
        "c",
        "essentials_release"
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
.field public static final c:Lm32/f$a;

.field private static final d:Lf6/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf6/d;"
        }
    .end annotation
.end field


# instance fields
.field private final a:La6/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La6/g;"
        }
    .end annotation
.end field

.field private final b:Ljava/time/Clock;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lm32/f$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lm32/f$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lm32/f;->c:Lm32/f$a;

    const-string v0, "last_check_push_notification_permission"

    invoke-static {v0}, Lge3/g;->I(Ljava/lang/String;)Lf6/d;

    move-result-object v0

    sput-object v0, Lm32/f;->d:Lf6/d;

    return-void
.end method

.method public constructor <init>(La6/g;Ljava/time/Clock;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La6/g;",
            "Ljava/time/Clock;",
            ")V"
        }
    .end annotation

    const-string v0, "dataStorePrefs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clock"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lm32/f;->a:La6/g;

    .line 3
    iput-object p2, p0, Lm32/f;->b:Ljava/time/Clock;

    return-void
.end method

.method public synthetic constructor <init>(La6/g;Ljava/time/Clock;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 4
    invoke-static {}, Ljava/time/Clock;->systemUTC()Ljava/time/Clock;

    move-result-object p2

    const-string p3, "systemUTC(...)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    :cond_0
    invoke-direct {p0, p1, p2}, Lm32/f;-><init>(La6/g;Ljava/time/Clock;)V

    return-void
.end method

.method public static final synthetic a()Lf6/d;
    .locals 1

    sget-object v0, Lm32/f;->d:Lf6/d;

    return-object v0
.end method


# virtual methods
.method public final b(Lq83/d;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lm32/f$b;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lm32/f$b;

    iget v1, v0, Lm32/f$b;->F:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lm32/f$b;->F:I

    goto :goto_0

    :cond_0
    new-instance v0, Lm32/f$b;

    invoke-direct {v0, p0, p1}, Lm32/f$b;-><init>(Lm32/f;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lm32/f$b;->z:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lm32/f$b;->F:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v0, v0, Lm32/f$b;->y:Ljava/lang/Object;

    check-cast v0, Ljava/time/Instant;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lm32/f;->a:La6/g;

    invoke-interface {p1}, La6/g;->getData()Lec3/l;

    move-result-object p1

    iput v4, v0, Lm32/f$b;->F:I

    invoke-static {p1, v0}, Lec3/v;->A(Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_3

    :cond_4
    :goto_1
    check-cast p1, Lf6/f;

    sget-object v2, Lm32/f;->d:Lf6/d;

    invoke-virtual {p1, v2}, Lf6/f;->b(Lf6/d;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    goto :goto_2

    :cond_5
    sget-object p1, Ljava/time/Instant;->EPOCH:Ljava/time/Instant;

    invoke-virtual {p1}, Ljava/time/Instant;->toEpochMilli()J

    move-result-wide v4

    :goto_2
    iget-object p1, p0, Lm32/f;->b:Ljava/time/Clock;

    invoke-static {p1}, Ljava/time/Instant;->now(Ljava/time/Clock;)Ljava/time/Instant;

    move-result-object p1

    invoke-static {v4, v5}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    move-result-object v2

    invoke-static {v2, p1}, Ljava/time/Duration;->between(Ljava/time/temporal/Temporal;Ljava/time/temporal/Temporal;)Ljava/time/Duration;

    move-result-object v2

    invoke-virtual {v2}, Ljava/time/Duration;->toHours()J

    move-result-wide v6

    const-wide/16 v8, 0x18

    cmp-long v2, v6, v8

    if-ltz v2, :cond_7

    iget-object v2, p0, Lm32/f;->a:La6/g;

    new-instance v8, Lm32/f$c;

    const/4 v9, 0x0

    invoke-direct {v8, p1, v9}, Lm32/f$c;-><init>(Ljava/time/Instant;Lq83/d;)V

    iput-object v9, v0, Lm32/f$b;->y:Ljava/lang/Object;

    iput-wide v4, v0, Lm32/f$b;->w:J

    iput-wide v6, v0, Lm32/f$b;->x:J

    iput v3, v0, Lm32/f$b;->F:I

    invoke-static {v2, v8, v0}, Lhg3/i;->G(La6/g;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    :goto_3
    return-object v1

    :cond_6
    :goto_4
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    :cond_7
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1
.end method
