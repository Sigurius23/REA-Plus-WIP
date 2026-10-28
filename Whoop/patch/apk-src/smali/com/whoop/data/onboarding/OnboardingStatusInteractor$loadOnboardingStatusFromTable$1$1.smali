.class final Lcom/whoop/data/onboarding/OnboardingStatusInteractor$loadOnboardingStatusFromTable$1$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/data/onboarding/OnboardingStatusInteractor$loadOnboardingStatusFromTable$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.data.onboarding.OnboardingStatusInteractor$loadOnboardingStatusFromTable$1$1"
    f = "OnboardingStatusInteractor.kt"
    l = {
        0x5b
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field label:I

.field final synthetic this$0:Lcom/whoop/data/onboarding/OnboardingStatusInteractor;


# direct methods
.method public constructor <init>(Lcom/whoop/data/onboarding/OnboardingStatusInteractor;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/data/onboarding/OnboardingStatusInteractor;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/data/onboarding/OnboardingStatusInteractor$loadOnboardingStatusFromTable$1$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$loadOnboardingStatusFromTable$1$1;->this$0:Lcom/whoop/data/onboarding/OnboardingStatusInteractor;

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

    new-instance p1, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$loadOnboardingStatusFromTable$1$1;

    iget-object v0, p0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$loadOnboardingStatusFromTable$1$1;->this$0:Lcom/whoop/data/onboarding/OnboardingStatusInteractor;

    invoke-direct {p1, v0, p2}, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$loadOnboardingStatusFromTable$1$1;-><init>(Lcom/whoop/data/onboarding/OnboardingStatusInteractor;Lq83/d;)V

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
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$loadOnboardingStatusFromTable$1$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$loadOnboardingStatusFromTable$1$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$loadOnboardingStatusFromTable$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$loadOnboardingStatusFromTable$1$1;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$loadOnboardingStatusFromTable$1$1;->label:I

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

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object p1, p0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$loadOnboardingStatusFromTable$1$1;->this$0:Lcom/whoop/data/onboarding/OnboardingStatusInteractor;

    invoke-static {p1}, Lcom/whoop/data/onboarding/OnboardingStatusInteractor;->access$getOnboardingStatusDao$p(Lcom/whoop/data/onboarding/OnboardingStatusInteractor;)Lcom/whoop/data/onboarding/OnboardingStatusDao;

    move-result-object p1

    iput v2, p0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$loadOnboardingStatusFromTable$1$1;->label:I

    invoke-interface {p1, p0}, Lcom/whoop/data/onboarding/OnboardingStatusDao;->getOnboardingStatus(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, Ljava/util/List;

    check-cast p1, Ljava/lang/Iterable;

    iget-object v0, p0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$loadOnboardingStatusFromTable$1$1;->this$0:Lcom/whoop/data/onboarding/OnboardingStatusInteractor;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/data/onboarding/OnboardingStatus;

    invoke-static {v0}, Lcom/whoop/data/onboarding/OnboardingStatusInteractor;->access$getOnboardingStatus$p(Lcom/whoop/data/onboarding/OnboardingStatusInteractor;)Ljava/util/Map;

    move-result-object v2

    invoke-virtual {v1}, Lcom/whoop/data/onboarding/OnboardingStatus;->getType()Lcom/whoop/data/onboarding/FeatureEducationType;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/data/onboarding/OnboardingStatus;->isCompleted()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :goto_2
    iget-object v0, p0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$loadOnboardingStatusFromTable$1$1;->this$0:Lcom/whoop/data/onboarding/OnboardingStatusInteractor;

    invoke-virtual {v0}, Lcom/whoop/data/onboarding/OnboardingStatusInteractor;->getLogger()Ltr2/n;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    const-string v2, "Failed to retrieve cached onboarding status from DB"

    invoke-interface {v0, v2, p1, v1}, Ltr2/n;->c(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    :cond_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
