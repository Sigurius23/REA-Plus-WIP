.class public final Lj92/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lud3/c;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0006\u0012\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u0006\u00a2\u0006\u0004\u0008\r\u0010\u000eJ#\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u001a\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u001a\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001bR\u001a\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001b\u00a8\u0006\u001e"
    }
    d2 = {
        "Lj92/r;",
        "Lud3/c;",
        "Lz92/a;",
        "userInfoAccessor",
        "Lod1/j;",
        "pendingUserSessionRepository",
        "Ll83/h;",
        "Lj92/k;",
        "oauthTokenRefresher",
        "Ll92/a;",
        "onboardingAuthTokenRefresher",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "<init>",
        "(Lz92/a;Lod1/j;Ll83/h;Ll83/h;Ll83/h;)V",
        "Lud3/b1;",
        "route",
        "Lud3/x0;",
        "response",
        "Lud3/o0;",
        "a",
        "(Lud3/b1;Lud3/x0;)Lud3/o0;",
        "b",
        "Lz92/a;",
        "c",
        "Lod1/j;",
        "d",
        "Ll83/h;",
        "e",
        "f",
        "core_release"
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
.field private final b:Lz92/a;

.field private final c:Lod1/j;

.field private final d:Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll83/h;"
        }
    .end annotation
.end field

.field private final e:Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll83/h;"
        }
    .end annotation
.end field

.field private final f:Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll83/h;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lz92/a;Lod1/j;Ll83/h;Ll83/h;Ll83/h;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lz92/a;",
            "Lod1/j;",
            "Ll83/h;",
            "Ll83/h;",
            "Ll83/h;",
            ")V"
        }
    .end annotation

    const-string v0, "userInfoAccessor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pendingUserSessionRepository"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "oauthTokenRefresher"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onboardingAuthTokenRefresher"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureFlagChecker"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj92/r;->b:Lz92/a;

    iput-object p2, p0, Lj92/r;->c:Lod1/j;

    iput-object p3, p0, Lj92/r;->d:Ll83/h;

    iput-object p4, p0, Lj92/r;->e:Ll83/h;

    iput-object p5, p0, Lj92/r;->f:Ll83/h;

    return-void
.end method

.method public static final synthetic b(Lj92/r;)Lz92/a;
    .locals 0

    iget-object p0, p0, Lj92/r;->b:Lz92/a;

    return-object p0
.end method


# virtual methods
.method public a(Lud3/b1;Lud3/x0;)Lud3/o0;
    .locals 2

    const-string v0, "response"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lj92/r$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lj92/r$a;-><init>(Lj92/r;Lq83/d;)V

    sget-object v1, Lq83/k;->w:Lq83/k;

    invoke-static {v1, v0}, Lbc3/f0;->E(Lq83/j;Lc93/m;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lj92/r;->d:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj92/k;

    invoke-virtual {v0, p1, p2}, Lj92/k;->a(Lud3/b1;Lud3/x0;)Lud3/o0;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, Lj92/r;->c:Lod1/j;

    invoke-virtual {v0}, Lod1/j;->b()Lcom/whoop/domain/model/AuthMaterial;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lj92/r;->f:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/data/repositories/FeatureFlagChecker;

    sget-object v1, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->ONBOARDING_TOKEN_RECOVERY:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    invoke-interface {v0, v1}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Lcom/whoop/data/repositories/OnboardingFeatureFlag;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lj92/r;->e:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll92/a;

    invoke-virtual {v0, p1, p2}, Ll92/a;->a(Lud3/b1;Lud3/x0;)Lud3/o0;

    move-result-object p1

    return-object p1

    :cond_1
    iget-object v0, p0, Lj92/r;->d:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj92/k;

    invoke-virtual {v0, p1, p2}, Lj92/k;->a(Lud3/b1;Lud3/x0;)Lud3/o0;

    move-result-object p1

    return-object p1
.end method
