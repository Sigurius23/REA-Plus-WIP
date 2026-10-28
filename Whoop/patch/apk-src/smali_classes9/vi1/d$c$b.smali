.class final Lvi1/d$c$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvi1/d$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.whoop.health.monitor.medical.domain.HeartHealthInteractor$getOfflineState$2$shepherdOnboardingCompletedDeferred$1"
    f = "HeartHealthInteractor.kt"
    l = {
        0x97
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lvi1/d;


# direct methods
.method public constructor <init>(Lvi1/d;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvi1/d;",
            "Lq83/d<",
            "-",
            "Lvi1/d$c$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lvi1/d$c$b;->x:Lvi1/d;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 1
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

    new-instance p1, Lvi1/d$c$b;

    iget-object v0, p0, Lvi1/d$c$b;->x:Lvi1/d;

    invoke-direct {p1, v0, p2}, Lvi1/d$c$b;-><init>(Lvi1/d;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lvi1/d$c$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lvi1/d$c$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lvi1/d$c$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lvi1/d$c$b;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lvi1/d$c$b;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object p1, p0, Lvi1/d$c$b;->x:Lvi1/d;

    invoke-static {p1}, Lvi1/d;->f(Lvi1/d;)Lcom/whoop/data/onboarding/OnboardingStatusDao;

    move-result-object p1

    sget-object v1, Lcom/whoop/data/onboarding/FeatureEducationType;->ARRHYTHMIA_EDUCATION:Lcom/whoop/data/onboarding/FeatureEducationType;

    iput v2, p0, Lvi1/d$c$b;->w:I

    invoke-interface {p1, v1, p0}, Lcom/whoop/data/onboarding/OnboardingStatusDao;->isCompleted(Lcom/whoop/data/onboarding/FeatureEducationType;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :goto_1
    invoke-interface {p0}, Lq83/d;->getContext()Lq83/j;

    move-result-object v0

    invoke-static {v0}, Lbc3/f0;->o(Lq83/j;)V

    iget-object v0, p0, Lvi1/d$c$b;->x:Lvi1/d;

    invoke-static {v0}, Lvi1/d;->d(Lvi1/d;)Ltr2/n;

    move-result-object v0

    const-string v1, "failed to determine if education completed for 2nd offline state"

    const/4 v2, 0x0

    new-array v3, v2, [Lqr2/a$a;

    invoke-interface {v0, v1, p1, v3}, Ltr2/n;->i(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    move p1, v2

    :goto_2
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
