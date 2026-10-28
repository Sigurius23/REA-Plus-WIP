.class final Lf70/g$a$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf70/g$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "",
        "<anonymous>",
        "(Lbc3/c0;)Z"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.activation.domain.interactors.activation.ActivationFeatureFlagFetcher$fetchOnboardingFeatureFlagStatus$1$2$deferred$1"
    f = "ActivationFeatureFlagFetcher.kt"
    l = {
        0x25
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lf70/g;

.field final synthetic y:Lcom/whoop/data/repositories/OnboardingFeatureFlag;


# direct methods
.method public constructor <init>(Lf70/g;Lcom/whoop/data/repositories/OnboardingFeatureFlag;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf70/g;",
            "Lcom/whoop/data/repositories/OnboardingFeatureFlag;",
            "Lq83/d<",
            "-",
            "Lf70/g$a$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lf70/g$a$a;->x:Lf70/g;

    iput-object p2, p0, Lf70/g$a$a;->y:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance p1, Lf70/g$a$a;

    iget-object v0, p0, Lf70/g$a$a;->x:Lf70/g;

    iget-object v1, p0, Lf70/g$a$a;->y:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    invoke-direct {p1, v0, v1, p2}, Lf70/g$a$a;-><init>(Lf70/g;Lcom/whoop/data/repositories/OnboardingFeatureFlag;Lq83/d;)V

    return-object p1
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lf70/g$a$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lf70/g$a$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lf70/g$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lf70/g$a$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lf70/g$a$a;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lf70/g$a$a;->x:Lf70/g;

    invoke-static {p1}, Lf70/g;->b(Lf70/g;)Ltr2/n;

    move-result-object p1

    iget-object v1, p0, Lf70/g$a$a;->y:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    invoke-virtual {v1}, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->getFlagName()Ljava/lang/String;

    move-result-object v1

    const-string v3, "fetching activation feature flag: "

    invoke-static {v3, v1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x0

    new-array v3, v3, [Lqr2/a$a;

    invoke-interface {p1, v1, v3}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p1, p0, Lf70/g$a$a;->x:Lf70/g;

    invoke-static {p1}, Lf70/g;->a(Lf70/g;)Lcom/whoop/data/repositories/FeatureFlagRepository;

    move-result-object p1

    iget-object v1, p0, Lf70/g$a$a;->y:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    iput v2, p0, Lf70/g$a$a;->w:I

    invoke-interface {p1, v1, p0}, Lcom/whoop/data/repositories/FeatureFlagRepository;->isOnboardingFeatureFlagTurnedOn(Lcom/whoop/data/repositories/OnboardingFeatureFlag;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    return-object p1
.end method
