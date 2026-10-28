.class public final Llj2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj02/k0;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u00002\u00020\u0001B!\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0019\u0010\r\u001a\u00020\u000c2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u0019"
    }
    d2 = {
        "Llj2/b;",
        "Lj02/k0;",
        "Lj02/i0;",
        "navDeepLinkRequestHelper",
        "Lwe1/a;",
        "entitlementChecker",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "<init>",
        "(Lj02/i0;Lwe1/a;Lcom/whoop/data/repositories/FeatureFlagChecker;)V",
        "Leb/x0;",
        "navOptions",
        "Lj02/j0$c;",
        "a",
        "(Leb/x0;)Lj02/j0$c;",
        "Lj02/m0;",
        "navigationScreen",
        "Lj02/j0;",
        "provideNavigationData",
        "(Lj02/m0;)Lj02/j0;",
        "Lj02/i0;",
        "b",
        "Lwe1/a;",
        "c",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "stress_release"
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
.field private final a:Lj02/i0;

.field private final b:Lwe1/a;

.field private final c:Lcom/whoop/data/repositories/FeatureFlagChecker;


# direct methods
.method public constructor <init>(Lj02/i0;Lwe1/a;Lcom/whoop/data/repositories/FeatureFlagChecker;)V
    .locals 1

    const-string v0, "navDeepLinkRequestHelper"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "entitlementChecker"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureFlagChecker"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Llj2/b;->a:Lj02/i0;

    .line 3
    iput-object p2, p0, Llj2/b;->b:Lwe1/a;

    .line 4
    iput-object p3, p0, Llj2/b;->c:Lcom/whoop/data/repositories/FeatureFlagChecker;

    return-void
.end method

.method public synthetic constructor <init>(Lj02/i0;Lwe1/a;Lcom/whoop/data/repositories/FeatureFlagChecker;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x1

    if-eqz p4, :cond_0

    .line 5
    new-instance p1, Lj02/i0;

    invoke-direct {p1}, Lj02/i0;-><init>()V

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Llj2/b;-><init>(Lj02/i0;Lwe1/a;Lcom/whoop/data/repositories/FeatureFlagChecker;)V

    return-void
.end method

.method private final a(Leb/x0;)Lj02/j0$c;
    .locals 6

    new-instance v0, Lj02/j0$c;

    iget-object v1, p0, Llj2/b;->a:Lj02/i0;

    sget-object v2, Lcom/whoop/entitlements/Entitlement;->STRESS_MONITOR:Lcom/whoop/entitlements/Entitlement;

    invoke-virtual {v2}, Lcom/whoop/entitlements/Entitlement;->getValue()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "android-app://com.whoop/notfound?id="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object v1

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v2, p1

    invoke-direct/range {v0 .. v5}, Lj02/j0$c;-><init>(Leb/k0;Leb/x0;Lj02/p0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method


# virtual methods
.method public provideNavigationData(Lj02/m0;)Lj02/j0;
    .locals 7

    const-string v0, "navigationScreen"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llj2/b;->c:Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v1, "android-health-push-navigation"

    invoke-interface {v0, v1}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v0

    invoke-static {v0}, Lor2/c1;->c(Z)Leb/x0;

    move-result-object v3

    instance-of v0, p1, Lj02/m0$a5;

    if-eqz v0, :cond_4

    iget-object v0, p0, Llj2/b;->b:Lwe1/a;

    sget-object v1, Lcom/whoop/entitlements/Entitlement;->STRESS_MONITOR:Lcom/whoop/entitlements/Entitlement;

    invoke-interface {v0, v1}, Lwe1/a;->b(Lcom/whoop/entitlements/Entitlement;)Z

    move-result v0

    if-eqz v0, :cond_3

    check-cast p1, Lj02/m0$a5;

    invoke-virtual {p1}, Lj02/m0$a5;->e()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, "Unknown"

    :cond_0
    invoke-virtual {p1}, Lj02/m0$a5;->d()Ljava/lang/String;

    move-result-object p1

    const-string v1, "android-app://com.whoop/stress-monitor/"

    if-eqz p1, :cond_1

    const-string v2, "?date="

    invoke-static {v1, v0, v2, p1}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_2

    :cond_1
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :cond_2
    new-instance v1, Lj02/j0$c;

    iget-object v0, p0, Llj2/b;->a:Lj02/i0;

    invoke-virtual {v0, p1}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object v2

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lj02/j0$c;-><init>(Leb/k0;Leb/x0;Lj02/p0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_3
    invoke-direct {p0, v3}, Llj2/b;->a(Leb/x0;)Lj02/j0$c;

    move-result-object p1

    return-object p1

    :cond_4
    instance-of v0, p1, Lj02/m0$z4;

    if-eqz v0, :cond_6

    iget-object v0, p0, Llj2/b;->b:Lwe1/a;

    sget-object v1, Lcom/whoop/entitlements/Entitlement;->STRESS_MONITOR:Lcom/whoop/entitlements/Entitlement;

    invoke-interface {v0, v1}, Lwe1/a;->b(Lcom/whoop/entitlements/Entitlement;)Z

    move-result v0

    if-eqz v0, :cond_5

    check-cast p1, Lj02/m0$z4;

    invoke-virtual {p1}, Lj02/m0$z4;->b()Ljava/lang/String;

    move-result-object p1

    const-string v0, "android-app://com.whoop/stress-session?sessionType="

    invoke-static {v0, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance v1, Lj02/j0$c;

    iget-object v0, p0, Llj2/b;->a:Lj02/i0;

    invoke-virtual {v0, p1}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object v2

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lj02/j0$c;-><init>(Leb/k0;Leb/x0;Lj02/p0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_5
    invoke-direct {p0, v3}, Llj2/b;->a(Leb/x0;)Lj02/j0$c;

    move-result-object p1

    return-object p1

    :cond_6
    sget-object p1, Lj02/j0$d;->a:Lj02/j0$d;

    return-object p1
.end method
