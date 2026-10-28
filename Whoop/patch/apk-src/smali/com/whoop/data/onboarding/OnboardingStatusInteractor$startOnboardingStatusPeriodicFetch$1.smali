.class final Lcom/whoop/data/onboarding/OnboardingStatusInteractor$startOnboardingStatusPeriodicFetch$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/data/onboarding/OnboardingStatusInteractor;->startOnboardingStatusPeriodicFetch()V
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
    c = "com.whoop.data.onboarding.OnboardingStatusInteractor$startOnboardingStatusPeriodicFetch$1"
    f = "OnboardingStatusInteractor.kt"
    l = {
        0xae,
        0xb4,
        0xb6
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic $periodicFetchCadence:J

.field I$0:I

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/whoop/data/onboarding/OnboardingStatusInteractor;


# direct methods
.method public constructor <init>(Lcom/whoop/data/onboarding/OnboardingStatusInteractor;JLq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/data/onboarding/OnboardingStatusInteractor;",
            "J",
            "Lq83/d<",
            "-",
            "Lcom/whoop/data/onboarding/OnboardingStatusInteractor$startOnboardingStatusPeriodicFetch$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$startOnboardingStatusPeriodicFetch$1;->this$0:Lcom/whoop/data/onboarding/OnboardingStatusInteractor;

    iput-wide p2, p0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$startOnboardingStatusPeriodicFetch$1;->$periodicFetchCadence:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 4
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

    new-instance v0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$startOnboardingStatusPeriodicFetch$1;

    iget-object v1, p0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$startOnboardingStatusPeriodicFetch$1;->this$0:Lcom/whoop/data/onboarding/OnboardingStatusInteractor;

    iget-wide v2, p0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$startOnboardingStatusPeriodicFetch$1;->$periodicFetchCadence:J

    invoke-direct {v0, v1, v2, v3, p2}, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$startOnboardingStatusPeriodicFetch$1;-><init>(Lcom/whoop/data/onboarding/OnboardingStatusInteractor;JLq83/d;)V

    iput-object p1, v0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$startOnboardingStatusPeriodicFetch$1;->L$0:Ljava/lang/Object;

    return-object v0
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
    invoke-virtual {p0, p1, p2}, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$startOnboardingStatusPeriodicFetch$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$startOnboardingStatusPeriodicFetch$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$startOnboardingStatusPeriodicFetch$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$startOnboardingStatusPeriodicFetch$1;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget-object v0, p0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$startOnboardingStatusPeriodicFetch$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$startOnboardingStatusPeriodicFetch$1;->label:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v6, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget v2, p0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$startOnboardingStatusPeriodicFetch$1;->I$0:I

    iget-object v7, p0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$startOnboardingStatusPeriodicFetch$1;->L$1:Ljava/lang/Object;

    check-cast v7, Lbc3/i0;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    :goto_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :cond_4
    iget-object p1, p0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$startOnboardingStatusPeriodicFetch$1;->this$0:Lcom/whoop/data/onboarding/OnboardingStatusInteractor;

    invoke-static {p1}, Lcom/whoop/data/onboarding/OnboardingStatusInteractor;->access$getFeatureFlagChecker$p(Lcom/whoop/data/onboarding/OnboardingStatusInteractor;)Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-result-object p1

    const-string v2, "new-auth-user-storage-android"

    invoke-interface {p1, v2}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_7

    iget-object p1, p0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$startOnboardingStatusPeriodicFetch$1;->this$0:Lcom/whoop/data/onboarding/OnboardingStatusInteractor;

    invoke-static {p1}, Lcom/whoop/data/onboarding/OnboardingStatusInteractor;->access$getAuthManager$p(Lcom/whoop/data/onboarding/OnboardingStatusInteractor;)Ly92/a;

    move-result-object p1

    iput-object v0, p0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$startOnboardingStatusPeriodicFetch$1;->L$0:Ljava/lang/Object;

    iput v6, p0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$startOnboardingStatusPeriodicFetch$1;->label:I

    invoke-virtual {p1, p0}, Ly92/a;->a(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    goto :goto_5

    :cond_5
    :goto_1
    if-eqz p1, :cond_6

    move v2, v6

    goto :goto_3

    :cond_6
    const/4 p1, 0x0

    :goto_2
    move v2, p1

    goto :goto_3

    :cond_7
    iget-object p1, p0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$startOnboardingStatusPeriodicFetch$1;->this$0:Lcom/whoop/data/onboarding/OnboardingStatusInteractor;

    invoke-static {p1}, Lcom/whoop/data/onboarding/OnboardingStatusInteractor;->access$getUserContext$p(Lcom/whoop/data/onboarding/OnboardingStatusInteractor;)Lod1/u;

    move-result-object p1

    invoke-virtual {p1}, Lod1/u;->i()Z

    move-result p1

    goto :goto_2

    :goto_3
    if-eqz v2, :cond_8

    new-instance p1, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$startOnboardingStatusPeriodicFetch$1$fetched$1;

    iget-object v7, p0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$startOnboardingStatusPeriodicFetch$1;->this$0:Lcom/whoop/data/onboarding/OnboardingStatusInteractor;

    invoke-direct {p1, v7, v5}, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$startOnboardingStatusPeriodicFetch$1$fetched$1;-><init>(Lcom/whoop/data/onboarding/OnboardingStatusInteractor;Lq83/d;)V

    invoke-static {v0, v5, p1, v3}, Lbc3/f0;->e(Lbc3/c0;Lq83/j;Lc93/m;I)Lbc3/j0;

    move-result-object p1

    iput-object v0, p0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$startOnboardingStatusPeriodicFetch$1;->L$0:Ljava/lang/Object;

    iput-object v5, p0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$startOnboardingStatusPeriodicFetch$1;->L$1:Ljava/lang/Object;

    iput v2, p0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$startOnboardingStatusPeriodicFetch$1;->I$0:I

    iput v4, p0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$startOnboardingStatusPeriodicFetch$1;->label:I

    invoke-virtual {p1, p0}, Lbc3/t1;->m(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object v7, Lr83/a;->w:Lr83/a;

    if-ne p1, v1, :cond_8

    goto :goto_5

    :cond_8
    :goto_4
    iget-wide v7, p0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$startOnboardingStatusPeriodicFetch$1;->$periodicFetchCadence:J

    iput-object v0, p0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$startOnboardingStatusPeriodicFetch$1;->L$0:Ljava/lang/Object;

    iput-object v5, p0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$startOnboardingStatusPeriodicFetch$1;->L$1:Ljava/lang/Object;

    iput v2, p0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$startOnboardingStatusPeriodicFetch$1;->I$0:I

    iput v3, p0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$startOnboardingStatusPeriodicFetch$1;->label:I

    invoke-static {v7, v8, p0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    :goto_5
    return-object v1
.end method
