.class public final Lf70/z;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0018\u0010\u000c\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0080@\u00a2\u0006\u0004\u0008\u000c\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lf70/z;",
        "",
        "Landroid/content/Context;",
        "context",
        "Ls82/a;",
        "seonManager",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "<init>",
        "(Landroid/content/Context;Ls82/a;Lcom/whoop/data/repositories/FeatureFlagChecker;)V",
        "Lf70/e;",
        "prevDomainResult",
        "b",
        "(Lf70/e;Lq83/d;)Ljava/lang/Object;",
        "a",
        "Landroid/content/Context;",
        "Ls82/a;",
        "c",
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
.field private final a:Landroid/content/Context;

.field private final b:Ls82/a;

.field private final c:Lcom/whoop/data/repositories/FeatureFlagChecker;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ls82/a;Lcom/whoop/data/repositories/FeatureFlagChecker;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "seonManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureFlagChecker"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf70/z;->a:Landroid/content/Context;

    iput-object p2, p0, Lf70/z;->b:Ls82/a;

    iput-object p3, p0, Lf70/z;->c:Lcom/whoop/data/repositories/FeatureFlagChecker;

    return-void
.end method

.method public static final synthetic a(Lf70/z;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lf70/z;->a:Landroid/content/Context;

    return-object p0
.end method


# virtual methods
.method public final b(Lf70/e;Lq83/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf70/e;",
            "Lq83/d<",
            "-",
            "Lf70/e;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lf70/z$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lf70/z$a;

    iget v1, v0, Lf70/z$a;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lf70/z$a;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lf70/z$a;

    invoke-direct {v0, p0, p2}, Lf70/z$a;-><init>(Lf70/z;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lf70/z$a;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lf70/z$a;->z:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lf70/z$a;->w:Ljava/lang/Object;

    check-cast p1, Lf70/e;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lf70/z$a;->w:Ljava/lang/Object;

    check-cast p1, Lf70/e;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lf70/z;->c:Lcom/whoop/data/repositories/FeatureFlagChecker;

    sget-object v2, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->ANDROID_SEON_PW_SCREEN:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    invoke-interface {p2, v2}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Lcom/whoop/data/repositories/OnboardingFeatureFlag;)Z

    move-result p2

    if-eqz p2, :cond_4

    iget-object p2, p0, Lf70/z;->b:Ls82/a;

    iput-object p1, v0, Lf70/z$a;->w:Ljava/lang/Object;

    iput v4, v0, Lf70/z$a;->z:I

    invoke-virtual {p2, v0}, Ls82/a;->m(Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    new-instance p2, Lf70/z$b;

    const/4 v2, 0x0

    invoke-direct {p2, p1, p0, v2}, Lf70/z$b;-><init>(Lf70/e;Lf70/z;Lq83/d;)V

    iput-object v2, v0, Lf70/z$a;->w:Ljava/lang/Object;

    iput v3, v0, Lf70/z$a;->z:I

    const-wide/16 v2, 0x3e8

    invoke-static {v2, v3, p2, v0}, Lor2/p0;->a(JLc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    return-object p1
.end method
