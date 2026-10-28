.class public final Lea2/d0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lea2/d0;",
        "",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "Lwe1/a;",
        "entitlementChecker",
        "<init>",
        "(Lcom/whoop/data/repositories/FeatureFlagChecker;Lwe1/a;)V",
        "Lgc2/a;",
        "tile",
        "",
        "a",
        "(Lgc2/a;)Z",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "b",
        "Lwe1/a;",
        "settings_release"
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
.field private final a:Lcom/whoop/data/repositories/FeatureFlagChecker;

.field private final b:Lwe1/a;


# direct methods
.method public constructor <init>(Lcom/whoop/data/repositories/FeatureFlagChecker;Lwe1/a;)V
    .locals 1

    const-string v0, "featureFlagChecker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "entitlementChecker"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lea2/d0;->a:Lcom/whoop/data/repositories/FeatureFlagChecker;

    iput-object p2, p0, Lea2/d0;->b:Lwe1/a;

    return-void
.end method


# virtual methods
.method public final a(Lgc2/a;)Z
    .locals 2

    const-string v0, "tile"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lea2/d0;->a:Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v1, "advanced-labs-standalone"

    invoke-interface {v0, v1}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p1}, Lgc2/a;->getEntitlementKey()Lcom/whoop/entitlements/Entitlement;

    move-result-object p1

    if-nez p1, :cond_1

    return v1

    :cond_1
    iget-object v0, p0, Lea2/d0;->b:Lwe1/a;

    invoke-interface {v0, p1}, Lwe1/a;->b(Lcom/whoop/entitlements/Entitlement;)Z

    move-result p1

    return p1
.end method
