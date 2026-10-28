.class public final Lg52/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg52/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\u0018\u0000 \u001b2\u00020\u0001:\u0001\u0010B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u0012\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0018R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001a\u00a8\u0006\u001c"
    }
    d2 = {
        "Lg52/a;",
        "",
        "Ljs0/c;",
        "configurationRepository",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "Lic/p0;",
        "workManager",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Ljs0/c;Lcom/whoop/data/repositories/FeatureFlagChecker;Lic/p0;Ltr2/n;)V",
        "",
        "b",
        "()J",
        "Ll83/a0;",
        "a",
        "()V",
        "Lkotlin/time/Duration;",
        "initialDelay",
        "c",
        "(J)V",
        "Ljs0/c;",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "Lic/p0;",
        "d",
        "Ltr2/n;",
        "e",
        "puffin_release"
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
.field public static final e:Lg52/a$a;


# instance fields
.field private final a:Ljs0/c;

.field private final b:Lcom/whoop/data/repositories/FeatureFlagChecker;

.field private final c:Lic/p0;

.field private final d:Ltr2/n;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lg52/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lg52/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lg52/a;->e:Lg52/a$a;

    return-void
.end method

.method public constructor <init>(Ljs0/c;Lcom/whoop/data/repositories/FeatureFlagChecker;Lic/p0;Ltr2/n;)V
    .locals 1

    const-string v0, "configurationRepository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureFlagChecker"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workManager"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg52/a;->a:Ljs0/c;

    iput-object p2, p0, Lg52/a;->b:Lcom/whoop/data/repositories/FeatureFlagChecker;

    iput-object p3, p0, Lg52/a;->c:Lic/p0;

    iput-object p4, p0, Lg52/a;->d:Ltr2/n;

    return-void
.end method

.method private final b()J
    .locals 7

    iget-object v0, p0, Lg52/a;->a:Ljs0/c;

    sget-object v1, Lg52/a$a$a;->a:Lg52/a$a$a;

    invoke-virtual {v0}, Ljs0/c;->getConfigurations()Ljs0/b;

    move-result-object v0

    invoke-virtual {v1}, Ljs0/a;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Ljs0/a;->getDefaultValue()Ljava/lang/Object;

    move-result-object v1

    sget-object v3, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v4, Ljava/lang/Long;

    invoke-virtual {v3, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-virtual {v3, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    const/4 v6, 0x0

    if-eqz v5, :cond_0

    invoke-virtual {v0, v2}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_6

    invoke-static {v0}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v6

    goto/16 :goto_0

    :cond_0
    sget-object v5, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    invoke-virtual {v3, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-virtual {v0, v2}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_6

    invoke-static {v0}, Lyb3/y;->R(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v6

    goto :goto_0

    :cond_1
    sget-object v5, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    invoke-virtual {v3, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-virtual {v0, v2}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_6

    invoke-static {v0}, Lyb3/x;->y(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v6

    goto :goto_0

    :cond_2
    sget-object v5, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    invoke-virtual {v3, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-virtual {v0, v2}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_6

    invoke-static {v0}, Lyb3/x;->x(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v6

    goto :goto_0

    :cond_3
    sget-object v5, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-virtual {v3, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-virtual {v0, v2}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_6

    invoke-static {v0}, Lyb3/r;->N0(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v6

    goto :goto_0

    :cond_4
    const-class v5, Ljava/lang/String;

    invoke-virtual {v3, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-virtual {v0, v2}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    goto :goto_0

    :cond_5
    move-object v6, v1

    :cond_6
    :goto_0
    if-nez v6, :cond_7

    goto :goto_1

    :cond_7
    move-object v1, v6

    :goto_1
    if-eqz v1, :cond_8

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    return-wide v0

    :cond_8
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "null cannot be cast to non-null type kotlin.Long"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final a()V
    .locals 7

    iget-object v0, p0, Lg52/a;->d:Ltr2/n;

    const/4 v1, 0x0

    new-array v2, v1, [Lqr2/a$a;

    const-string v3, "Enqueuing periodic Puffin!"

    invoke-interface {v0, v3, v2}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    sget-object v2, Lus0/d$c;->PERIODIC_SCAN:Lus0/d$c;

    invoke-virtual {v2}, Lus0/d$c;->getValue()Ljava/lang/String;

    move-result-object v2

    const-string v3, "key_source"

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lic/g;

    invoke-direct {v2, v0}, Lic/g;-><init>(Ljava/util/LinkedHashMap;)V

    invoke-static {v2}, Lpf/c;->X(Lic/g;)[B

    invoke-direct {p0}, Lg52/a;->b()J

    move-result-wide v3

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v5, Lic/j0;

    const-class v6, Lcom/whoop/puffin/workManager/PuffinScanWorker;

    invoke-direct {v5, v6, v3, v4, v0}, Lic/j0;-><init>(Ljava/lang/Class;JLjava/util/concurrent/TimeUnit;)V

    invoke-virtual {v5, v2}, Lic/q0;->h(Lic/g;)Lic/q0;

    move-result-object v2

    check-cast v2, Lic/j0;

    sget-object v3, Lic/a;->x:Lic/a;

    const-wide/16 v4, 0x2710

    invoke-virtual {v2, v3, v4, v5, v0}, Lic/q0;->e(Lic/a;JLjava/util/concurrent/TimeUnit;)Lic/q0;

    move-result-object v0

    check-cast v0, Lic/j0;

    invoke-virtual {v0}, Lic/q0;->b()Lic/r0;

    move-result-object v0

    check-cast v0, Lic/k0;

    iget-object v2, p0, Lg52/a;->c:Lic/p0;

    const-string v3, "PeriodicPuffinScanWorker"

    sget-object v4, Lic/k;->x:Lic/k;

    invoke-virtual {v2, v3, v4, v0}, Lic/p0;->d(Ljava/lang/String;Lic/k;Lic/k0;)Lic/e0;

    iget-object v0, p0, Lg52/a;->d:Ltr2/n;

    invoke-direct {p0}, Lg52/a;->b()J

    move-result-wide v2

    const-string v4, "Enqueuing periodic Puffin scan work with cadence: "

    const-string v5, " ms"

    invoke-static {v2, v3, v4, v5}, Lr80/c;->l(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {v0, v2, v1}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    return-void
.end method

.method public final c(J)V
    .locals 4

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    sget-object v1, Lus0/d$c;->DISCONNECT_RETRY:Lus0/d$c;

    invoke-virtual {v1}, Lus0/d$c;->getValue()Ljava/lang/String;

    move-result-object v1

    const-string v2, "key_source"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lic/g;

    invoke-direct {v1, v0}, Lic/g;-><init>(Ljava/util/LinkedHashMap;)V

    invoke-static {v1}, Lpf/c;->X(Lic/g;)[B

    new-instance v0, Lic/z;

    const-class v2, Lcom/whoop/puffin/workManager/PuffinScanWorker;

    invoke-direct {v0, v2}, Lic/q0;-><init>(Ljava/lang/Class;)V

    invoke-static {p1, p2}, Lkotlin/time/Duration;->getInWholeSeconds-impl(J)J

    move-result-wide v2

    invoke-static {p1, p2}, Lkotlin/time/Duration;->getNanosecondsComponent-impl(J)I

    move-result p1

    int-to-long p1, p1

    invoke-static {v2, v3, p1, p2}, Ljava/time/Duration;->ofSeconds(JJ)Ljava/time/Duration;

    move-result-object p1

    const-string p2, "toComponents-impl(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, v0, Lic/q0;->c:Lqc/q;

    invoke-virtual {p1}, Ljava/time/Duration;->toMillis()J

    move-result-wide v2

    iput-wide v2, p2, Lqc/q;->g:J

    const-wide p1, 0x7fffffffffffffffL

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr p1, v2

    iget-object v2, v0, Lic/q0;->c:Lqc/q;

    iget-wide v2, v2, Lqc/q;->g:J

    cmp-long p1, p1, v2

    if-lez p1, :cond_0

    invoke-virtual {v0, v1}, Lic/q0;->h(Lic/g;)Lic/q0;

    move-result-object p1

    check-cast p1, Lic/z;

    const-string p2, "OneTimePuffinScanWorker"

    invoke-virtual {p1, p2}, Lic/q0;->a(Ljava/lang/String;)Lic/q0;

    move-result-object p1

    check-cast p1, Lic/z;

    invoke-virtual {p1}, Lic/q0;->b()Lic/r0;

    move-result-object p1

    check-cast p1, Lic/a0;

    iget-object v0, p0, Lg52/a;->c:Lic/p0;

    sget-object v1, Lic/l;->x:Lic/l;

    invoke-virtual {v0, p2, v1, p1}, Lic/p0;->e(Ljava/lang/String;Lic/l;Lic/a0;)Lic/e0;

    iget-object p1, p0, Lg52/a;->d:Ltr2/n;

    const/4 p2, 0x0

    new-array p2, p2, [Lqr2/a$a;

    const-string v0, "Enqueuing one-time Puffin scan work"

    invoke-interface {p1, v0, p2}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The given initial delay is too large and will cause an overflow!"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
