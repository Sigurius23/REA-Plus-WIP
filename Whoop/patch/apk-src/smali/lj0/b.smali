.class public final Llj0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lus0/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llj0/b$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000e\u0008\u0000\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u001aR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u001bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u0014\u0010\r\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001f\u00a8\u0006 "
    }
    d2 = {
        "Llj0/b;",
        "Lus0/e;",
        "Liy1/c;",
        "metricsInteractor",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "Lbc3/c0;",
        "coroutineScope",
        "Lfi0/c;",
        "amplitudeAnalytics",
        "Lfi0/a;",
        "baseAnalytics",
        "Lst0/r;",
        "strapLockStateTracker",
        "<init>",
        "(Liy1/c;Lcom/whoop/data/repositories/FeatureFlagChecker;Lbc3/c0;Lfi0/c;Lfi0/a;Lst0/r;)V",
        "Lus0/d;",
        "connectionMetric",
        "Ll83/a0;",
        "d",
        "(Lus0/d;)V",
        "c",
        "a",
        "Liy1/c;",
        "b",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "Lbc3/c0;",
        "Lfi0/c;",
        "e",
        "Lfi0/a;",
        "f",
        "Lst0/r;",
        "connectivity_release"
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
.field private final a:Liy1/c;

.field private final b:Lcom/whoop/data/repositories/FeatureFlagChecker;

.field private final c:Lbc3/c0;

.field private final d:Lfi0/c;

.field private final e:Lfi0/a;

.field private final f:Lst0/r;


# direct methods
.method public constructor <init>(Liy1/c;Lcom/whoop/data/repositories/FeatureFlagChecker;Lbc3/c0;Lfi0/c;Lfi0/a;Lst0/r;)V
    .locals 1

    const-string v0, "metricsInteractor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureFlagChecker"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "amplitudeAnalytics"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "baseAnalytics"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "strapLockStateTracker"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llj0/b;->a:Liy1/c;

    iput-object p2, p0, Llj0/b;->b:Lcom/whoop/data/repositories/FeatureFlagChecker;

    iput-object p3, p0, Llj0/b;->c:Lbc3/c0;

    iput-object p4, p0, Llj0/b;->d:Lfi0/c;

    iput-object p5, p0, Llj0/b;->e:Lfi0/a;

    iput-object p6, p0, Llj0/b;->f:Lst0/r;

    return-void
.end method

.method public static final synthetic b(Llj0/b;)Liy1/c;
    .locals 0

    iget-object p0, p0, Llj0/b;->a:Liy1/c;

    return-object p0
.end method

.method private final c(Lus0/d;)V
    .locals 4

    invoke-interface {p1}, Lus0/d;->c()Lst0/v;

    move-result-object v0

    invoke-virtual {v0}, Lst0/v;->isMaverickOrGoose()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Llj0/b;->f:Lst0/r;

    invoke-static {v0}, Lst0/s;->a(Lst0/r;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "strap_lock_state:"

    invoke-static {v1, v0}, Lr80/c;->t(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    goto :goto_0

    :cond_0
    sget-object v0, Lm83/y;->w:Lm83/y;

    :goto_0
    iget-object v1, p0, Llj0/b;->c:Lbc3/c0;

    new-instance v2, Llj0/b$b;

    const/4 v3, 0x0

    invoke-direct {v2, p1, v0, p0, v3}, Llj0/b$b;-><init>(Lus0/d;Ljava/util/List;Llj0/b;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v1, v3, v3, v2, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method private final d(Lus0/d;)V
    .locals 10

    invoke-interface {p1}, Lus0/d;->c()Lst0/v;

    move-result-object v0

    sget-object v1, Lst0/v;->PUFFIN:Lst0/v;

    if-eq v0, v1, :cond_0

    return-void

    :cond_0
    invoke-interface {p1}, Lus0/d;->c()Lst0/v;

    move-result-object v0

    invoke-virtual {v0}, Lst0/v;->getCodeName()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ll83/k;

    const-string v2, "Whoop Device"

    invoke-direct {v1, v2, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v1}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->b0([Ll83/k;)Ljava/util/LinkedHashMap;

    move-result-object v7

    instance-of v0, p1, Lus0/d$a;

    if-eqz v0, :cond_2

    check-cast p1, Lus0/d$a;

    invoke-virtual {p1}, Lus0/d$a;->a()Lus0/d$c;

    move-result-object p1

    if-eqz p1, :cond_1

    const-string v0, "source"

    invoke-virtual {p1}, Lus0/d$c;->getValue()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v7, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    iget-object v1, p0, Llj0/b;->e:Lfi0/a;

    const/4 v8, 0x7

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const-string v5, "Pairing - Connection Attempt"

    const-string v6, "Attempt"

    invoke-static/range {v1 .. v9}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void

    :cond_2
    instance-of v0, p1, Lus0/d$d;

    if-eqz v0, :cond_3

    iget-object v1, p0, Llj0/b;->e:Lfi0/a;

    check-cast p1, Lus0/d$d;

    invoke-virtual {p1}, Lus0/d$d;->b()Lus0/d$b;

    move-result-object v0

    invoke-virtual {v0}, Lus0/d$b;->getValue()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1}, Lus0/d$d;->a()Ljava/lang/String;

    move-result-object v4

    const/4 v8, 0x3

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const-string v5, "Pairing - Connection Attempt"

    invoke-static/range {v1 .. v9}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void

    :cond_3
    instance-of p1, p1, Lus0/d$e;

    if-eqz p1, :cond_4

    iget-object v1, p0, Llj0/b;->e:Lfi0/a;

    const/4 v8, 0x7

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const-string v5, "Pairing - Connection Attempt"

    const-string v6, "Disconnected"

    invoke-static/range {v1 .. v9}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method


# virtual methods
.method public a(Lus0/d;)V
    .locals 9

    const-string v0, "connectionMetric"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Llj0/b;->c(Lus0/d;)V

    invoke-direct {p0, p1}, Llj0/b;->d(Lus0/d;)V

    iget-object v0, p0, Llj0/b;->b:Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v1, "droid-track-attempts-connects-disconnects"

    invoke-interface {v0, v1}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    instance-of v0, p1, Lus0/d$a;

    if-eqz v0, :cond_0

    iget-object p1, p0, Llj0/b;->d:Lfi0/c;

    move-object v0, p1

    check-cast v0, Lfi0/a;

    const/16 v7, 0x26

    const/4 v8, 0x0

    const-string v1, "Connectivity"

    const/4 v2, 0x0

    const/4 v3, 0x0

    const-string v4, "BLE Connectivity"

    const-string v5, "Attempt"

    const/4 v6, 0x0

    invoke-static/range {v0 .. v8}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void

    :cond_0
    instance-of v0, p1, Lus0/d$d;

    if-eqz v0, :cond_3

    check-cast p1, Lus0/d$d;

    invoke-virtual {p1}, Lus0/d$d;->b()Lus0/d$b;

    move-result-object p1

    sget-object v0, Llj0/b$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Llj0/b;->d:Lfi0/c;

    move-object v0, p1

    check-cast v0, Lfi0/a;

    const/16 v7, 0x26

    const/4 v8, 0x0

    const-string v1, "Connectivity"

    const/4 v2, 0x0

    const/4 v3, 0x0

    const-string v4, "BLE Connectivity"

    const-string v5, "Success"

    const/4 v6, 0x0

    invoke-static/range {v0 .. v8}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_2
    iget-object p1, p0, Llj0/b;->d:Lfi0/c;

    move-object v0, p1

    check-cast v0, Lfi0/a;

    const/16 v7, 0x26

    const/4 v8, 0x0

    const-string v1, "Connectivity"

    const/4 v2, 0x0

    const/4 v3, 0x0

    const-string v4, "BLE Connectivity"

    const-string v5, "Fail"

    const/4 v6, 0x0

    invoke-static/range {v0 .. v8}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void

    :cond_3
    instance-of p1, p1, Lus0/d$e;

    if-eqz p1, :cond_4

    iget-object p1, p0, Llj0/b;->d:Lfi0/c;

    move-object v0, p1

    check-cast v0, Lfi0/a;

    const/16 v7, 0x26

    const/4 v8, 0x0

    const-string v1, "Connectivity"

    const/4 v2, 0x0

    const/4 v3, 0x0

    const-string v4, "BLE Connectivity"

    const-string v5, "Disconnected"

    const/4 v6, 0x0

    invoke-static/range {v0 .. v8}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_5
    return-void
.end method
