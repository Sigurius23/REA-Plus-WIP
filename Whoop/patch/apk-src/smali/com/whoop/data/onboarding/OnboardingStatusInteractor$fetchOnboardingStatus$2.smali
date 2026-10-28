.class final Lcom/whoop/data/onboarding/OnboardingStatusInteractor$fetchOnboardingStatus$2;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/data/onboarding/OnboardingStatusInteractor;->fetchOnboardingStatus(Lq83/d;)Ljava/lang/Object;
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
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lbc3/c0;",
        "",
        "",
        "",
        "<anonymous>",
        "(Lbc3/c0;)Ljava/util/Map;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.data.onboarding.OnboardingStatusInteractor$fetchOnboardingStatus$2"
    f = "OnboardingStatusInteractor.kt"
    l = {
        0x80,
        0x84
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field I$0:I

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
            "Lcom/whoop/data/onboarding/OnboardingStatusInteractor$fetchOnboardingStatus$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$fetchOnboardingStatus$2;->this$0:Lcom/whoop/data/onboarding/OnboardingStatusInteractor;

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

    new-instance p1, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$fetchOnboardingStatus$2;

    iget-object v0, p0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$fetchOnboardingStatus$2;->this$0:Lcom/whoop/data/onboarding/OnboardingStatusInteractor;

    invoke-direct {p1, v0, p2}, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$fetchOnboardingStatus$2;-><init>(Lcom/whoop/data/onboarding/OnboardingStatusInteractor;Lq83/d;)V

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
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$fetchOnboardingStatus$2;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$fetchOnboardingStatus$2;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$fetchOnboardingStatus$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$fetchOnboardingStatus$2;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$fetchOnboardingStatus$2;->label:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

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

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$fetchOnboardingStatus$2;->this$0:Lcom/whoop/data/onboarding/OnboardingStatusInteractor;

    invoke-static {p1}, Lcom/whoop/data/onboarding/OnboardingStatusInteractor;->access$getFeatureFlagChecker$p(Lcom/whoop/data/onboarding/OnboardingStatusInteractor;)Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-result-object p1

    const-string v1, "new-auth-user-storage-android"

    invoke-interface {p1, v1}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_5

    iget-object p1, p0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$fetchOnboardingStatus$2;->this$0:Lcom/whoop/data/onboarding/OnboardingStatusInteractor;

    invoke-static {p1}, Lcom/whoop/data/onboarding/OnboardingStatusInteractor;->access$getAuthManager$p(Lcom/whoop/data/onboarding/OnboardingStatusInteractor;)Ly92/a;

    move-result-object p1

    iput v3, p0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$fetchOnboardingStatus$2;->label:I

    invoke-virtual {p1, p0}, Ly92/a;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_2

    :cond_3
    :goto_0
    check-cast p1, Lcom/whoop/domain/model/User;

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lcom/whoop/domain/model/User;->getId()I

    move-result p1

    goto :goto_1

    :cond_4
    const/4 p1, 0x0

    goto :goto_1

    :cond_5
    iget-object p1, p0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$fetchOnboardingStatus$2;->this$0:Lcom/whoop/data/onboarding/OnboardingStatusInteractor;

    invoke-static {p1}, Lcom/whoop/data/onboarding/OnboardingStatusInteractor;->access$getUserContext$p(Lcom/whoop/data/onboarding/OnboardingStatusInteractor;)Lod1/u;

    move-result-object p1

    invoke-virtual {p1}, Lod1/u;->g()I

    move-result p1

    :goto_1
    iget-object v1, p0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$fetchOnboardingStatus$2;->this$0:Lcom/whoop/data/onboarding/OnboardingStatusInteractor;

    invoke-static {v1}, Lcom/whoop/data/onboarding/OnboardingStatusInteractor;->access$getApi$p(Lcom/whoop/data/onboarding/OnboardingStatusInteractor;)Lcom/whoop/data/onboarding/OnboardingStatusApi;

    move-result-object v1

    iput p1, p0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$fetchOnboardingStatus$2;->I$0:I

    iput v2, p0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor$fetchOnboardingStatus$2;->label:I

    invoke-interface {v1, p1, p0}, Lcom/whoop/data/onboarding/OnboardingStatusApi;->getOnboardingStatus(ILq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    :goto_2
    return-object v0

    :cond_6
    return-object p1
.end method
