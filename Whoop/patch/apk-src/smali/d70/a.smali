.class public final Ld70/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lud3/c;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ#\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u0017"
    }
    d2 = {
        "Ld70/a;",
        "Lud3/c;",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "Lj92/r;",
        "sessionAwareAuthenticator",
        "Ll92/a;",
        "onboardingAuthTokenRefresher",
        "<init>",
        "(Lcom/whoop/data/repositories/FeatureFlagChecker;Lj92/r;Ll92/a;)V",
        "Lud3/b1;",
        "route",
        "Lud3/x0;",
        "response",
        "Lud3/o0;",
        "a",
        "(Lud3/b1;Lud3/x0;)Lud3/o0;",
        "b",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "c",
        "Lj92/r;",
        "d",
        "Ll92/a;",
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
.field private final b:Lcom/whoop/data/repositories/FeatureFlagChecker;

.field private final c:Lj92/r;

.field private final d:Ll92/a;


# direct methods
.method public constructor <init>(Lcom/whoop/data/repositories/FeatureFlagChecker;Lj92/r;Ll92/a;)V
    .locals 1

    const-string v0, "featureFlagChecker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sessionAwareAuthenticator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onboardingAuthTokenRefresher"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld70/a;->b:Lcom/whoop/data/repositories/FeatureFlagChecker;

    iput-object p2, p0, Ld70/a;->c:Lj92/r;

    iput-object p3, p0, Ld70/a;->d:Ll92/a;

    return-void
.end method


# virtual methods
.method public a(Lud3/b1;Lud3/x0;)Lud3/o0;
    .locals 2

    const-string v0, "response"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ld70/a;->b:Lcom/whoop/data/repositories/FeatureFlagChecker;

    sget-object v1, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->ACCOUNT_TRANSITION_SESSION_AWARE_AUTH:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    invoke-interface {v0, v1}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Lcom/whoop/data/repositories/OnboardingFeatureFlag;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ld70/a;->c:Lj92/r;

    invoke-virtual {v0, p1, p2}, Lj92/r;->a(Lud3/b1;Lud3/x0;)Lud3/o0;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, Ld70/a;->d:Ll92/a;

    invoke-virtual {v0, p1, p2}, Ll92/a;->a(Lud3/b1;Lud3/x0;)Lud3/o0;

    move-result-object p1

    return-object p1
.end method
