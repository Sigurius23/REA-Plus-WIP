.class public final Lxu1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lxu1/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001:\u0001\u0010B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u001aR\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u001d\u00a8\u0006\u001f"
    }
    d2 = {
        "Lxu1/a;",
        "",
        "Lfi0/a;",
        "analytics",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "<init>",
        "(Lfi0/a;Lcom/whoop/data/repositories/FeatureFlagChecker;)V",
        "Lcv1/a$f;",
        "event",
        "Ll83/a0;",
        "c",
        "(Lcv1/a$f;)V",
        "Lcom/whoop/navigation/e;",
        "navAction",
        "",
        "a",
        "(Lcom/whoop/navigation/e;)Ljava/lang/String;",
        "source",
        "offerId",
        "d",
        "(Ljava/lang/String;Ljava/lang/String;)V",
        "Lcv1/a$a;",
        "b",
        "(Lcv1/a$a;)V",
        "Lfi0/a;",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "Ljava/util/concurrent/atomic/AtomicReference;",
        "Lxu1/a$a;",
        "Ljava/util/concurrent/atomic/AtomicReference;",
        "screenContext",
        "limited-time-offer_release"
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
.field private final a:Lfi0/a;

.field private final b:Lcom/whoop/data/repositories/FeatureFlagChecker;

.field private final c:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lxu1/a$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lfi0/a;Lcom/whoop/data/repositories/FeatureFlagChecker;)V
    .locals 1

    const-string v0, "analytics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureFlagChecker"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxu1/a;->a:Lfi0/a;

    iput-object p2, p0, Lxu1/a;->b:Lcom/whoop/data/repositories/FeatureFlagChecker;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lxu1/a;->c:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method

.method private final a(Lcom/whoop/navigation/e;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p1}, Lcom/whoop/navigation/e;->d()Lcom/whoop/navigation/AppScreen;

    move-result-object p1

    sget-object v0, Lcom/whoop/navigation/AppScreen$g1;->w:Lcom/whoop/navigation/AppScreen$g1;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    sget-object v0, Lcom/whoop/navigation/AppScreen$d6;->w:Lcom/whoop/navigation/AppScreen$d6;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/whoop/navigation/AppScreen$e2;->w:Lcom/whoop/navigation/AppScreen$e2;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const-string p1, "pay_later"

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1

    :cond_2
    :goto_0
    const-string p1, "pay_today"

    return-object p1
.end method

.method private final c(Lcv1/a$f;)V
    .locals 3

    iget-object v0, p0, Lxu1/a;->b:Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v1, "lto-plan-picker-ui-and-analytics-android"

    invoke-interface {v0, v1}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lxu1/a;->c:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lxu1/a$a;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Lcv1/a$f;->a()Ljava/lang/Object;

    move-result-object v1

    instance-of v1, v1, Lny0/h;

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Lcv1/a$f;->a()Ljava/lang/Object;

    move-result-object p1

    instance-of v1, p1, Lcom/whoop/navigation/e;

    if-eqz v1, :cond_3

    check-cast p1, Lcom/whoop/navigation/e;

    invoke-direct {p0, p1}, Lxu1/a;->a(Lcom/whoop/navigation/e;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_3
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_4

    iget-object v1, p0, Lxu1/a;->a:Lfi0/a;

    invoke-virtual {v0}, Lxu1/a$a;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lxu1/a$a;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v2, v0, p1}, Lxu1/b;->a(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_4
    :goto_1
    return-void
.end method


# virtual methods
.method public final b(Lcv1/a$a;)V
    .locals 3

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcv1/a$h;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lxu1/a;->a:Lfi0/a;

    check-cast p1, Lcv1/a$h;

    invoke-virtual {p1}, Lcv1/a$h;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcv1/a$h;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcv1/a$h;->c()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, v1, v2, p1}, Lxu1/b;->c(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    instance-of v0, p1, Lcv1/a$g;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lxu1/a;->b:Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v1, "lto-plan-picker-ui-and-analytics-android"

    invoke-interface {v0, v1}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lxu1/a;->a:Lfi0/a;

    check-cast p1, Lcv1/a$g;

    invoke-virtual {p1}, Lcv1/a$g;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcv1/a$g;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcv1/a$g;->a()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, v1, v2, p1}, Lxu1/b;->a(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    return-void

    :cond_2
    instance-of v0, p1, Lcv1/a$f;

    if-eqz v0, :cond_3

    check-cast p1, Lcv1/a$f;

    invoke-direct {p0, p1}, Lxu1/a;->c(Lcv1/a$f;)V

    return-void

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final d(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "offerId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lxu1/a;->c:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v1, Lxu1/a$a;

    invoke-direct {v1, p1, p2}, Lxu1/a$a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    return-void
.end method
