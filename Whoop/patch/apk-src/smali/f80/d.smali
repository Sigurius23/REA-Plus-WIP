.class public final Lf80/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf80/d$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u000f\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u001d\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u001d\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\r\u00a2\u0006\u0004\u0008\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010!\u00a8\u0006\""
    }
    d2 = {
        "Lf80/d;",
        "",
        "Lh80/c;",
        "analyticsHelper",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "<init>",
        "(Lh80/c;Lcom/whoop/data/repositories/FeatureFlagChecker;)V",
        "Lh80/d;",
        "event",
        "Ll83/a0;",
        "a",
        "(Lh80/d;)V",
        "",
        "b",
        "()Z",
        "Lf80/b;",
        "outcome",
        "d",
        "(Lf80/b;)V",
        "Lh80/g;",
        "screen",
        "Lf80/c;",
        "e",
        "(Lh80/g;Lf80/c;)V",
        "Lh80/e;",
        "mode",
        "f",
        "(Lh80/e;)V",
        "success",
        "c",
        "(Lh80/e;Z)V",
        "Lh80/c;",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "activation_release"
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
.field private final a:Lh80/c;

.field private final b:Lcom/whoop/data/repositories/FeatureFlagChecker;


# direct methods
.method public constructor <init>(Lh80/c;Lcom/whoop/data/repositories/FeatureFlagChecker;)V
    .locals 1

    const-string v0, "analyticsHelper"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureFlagChecker"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf80/d;->a:Lh80/c;

    iput-object p2, p0, Lf80/d;->b:Lcom/whoop/data/repositories/FeatureFlagChecker;

    return-void
.end method

.method private final a(Lh80/d;)V
    .locals 2

    iget-object v0, p0, Lf80/d;->a:Lh80/c;

    new-instance v1, Lh80/b$e;

    invoke-direct {v1, p1}, Lh80/b$e;-><init>(Lh80/d;)V

    invoke-virtual {v0, v1}, Lh80/c;->p(Lh80/b;)V

    return-void
.end method

.method private final b()Z
    .locals 2

    iget-object v0, p0, Lf80/d;->b:Lcom/whoop/data/repositories/FeatureFlagChecker;

    sget-object v1, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->CREDENTIAL_MANAGER_ANDROID:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    invoke-interface {v0, v1}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Lcom/whoop/data/repositories/OnboardingFeatureFlag;)Z

    move-result v0

    return v0
.end method


# virtual methods
.method public final c(Lh80/e;Z)V
    .locals 1

    const-string v0, "mode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lf80/d;->b()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Lh80/d$a;

    invoke-direct {v0, p1, p2}, Lh80/d$a;-><init>(Lh80/e;Z)V

    invoke-direct {p0, v0}, Lf80/d;->a(Lh80/d;)V

    return-void
.end method

.method public final d(Lf80/b;)V
    .locals 3

    const-string v0, "outcome"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lf80/d;->b()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    instance-of v0, p1, Lf80/b$b;

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    new-instance p1, Lh80/d$b;

    sget-object v0, Lh80/f;->Success:Lh80/f;

    invoke-direct {p1, v0, v2, v1, v2}, Lh80/d$b;-><init>(Lh80/f;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_0

    :cond_1
    sget-object v0, Lf80/b$c;->a:Lf80/b$c;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance p1, Lh80/d$b;

    sget-object v0, Lh80/f;->Cancel:Lh80/f;

    invoke-direct {p1, v0, v2, v1, v2}, Lh80/d$b;-><init>(Lh80/f;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_0

    :cond_2
    instance-of v0, p1, Lf80/b$a;

    if-eqz v0, :cond_3

    new-instance v0, Lh80/d$b;

    sget-object v1, Lh80/f;->Failure:Lh80/f;

    check-cast p1, Lf80/b$a;

    invoke-virtual {p1}, Lf80/b$a;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lh80/d$b;-><init>(Lh80/f;Ljava/lang/String;)V

    move-object p1, v0

    :goto_0
    invoke-direct {p0, p1}, Lf80/d;->a(Lh80/d;)V

    return-void

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final e(Lh80/g;Lf80/c;)V
    .locals 1

    const-string v0, "screen"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "outcome"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lf80/d;->b()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lf80/d$a;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p2, v0, p2

    const/4 v0, 0x1

    if-eq p2, v0, :cond_4

    const/4 v0, 0x2

    if-eq p2, v0, :cond_3

    const/4 v0, 0x3

    if-eq p2, v0, :cond_2

    const/4 p1, 0x4

    if-ne p2, p1, :cond_1

    :goto_0
    return-void

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_2
    sget-object p2, Lh80/f;->Failure:Lh80/f;

    goto :goto_1

    :cond_3
    sget-object p2, Lh80/f;->Cancel:Lh80/f;

    goto :goto_1

    :cond_4
    sget-object p2, Lh80/f;->Success:Lh80/f;

    :goto_1
    new-instance v0, Lh80/d$c;

    invoke-direct {v0, p1, p2}, Lh80/d$c;-><init>(Lh80/g;Lh80/f;)V

    invoke-direct {p0, v0}, Lf80/d;->a(Lh80/d;)V

    return-void
.end method

.method public final f(Lh80/e;)V
    .locals 1

    const-string v0, "mode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lf80/d;->b()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Lh80/d$d;

    invoke-direct {v0, p1}, Lh80/d$d;-><init>(Lh80/e;)V

    invoke-direct {p0, v0}, Lf80/d;->a(Lh80/d;)V

    return-void
.end method
