.class final Lj12/b$i;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lj12/b;->k(ILcom/whoop/onboarding/overlay/model/FeatureOnboardingOverlayModel;)Lk12/b;
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
    c = "com.whoop.onboarding.overlay.OnboardingOverlayInteractor$markCompleted$1"
    f = "OnboardingOverlayInteractor.kt"
    l = {
        0x77
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lcom/whoop/onboarding/overlay/model/FeatureOnboardingOverlayModel;

.field final synthetic y:Lj12/b;


# direct methods
.method public constructor <init>(Lcom/whoop/onboarding/overlay/model/FeatureOnboardingOverlayModel;Lj12/b;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/onboarding/overlay/model/FeatureOnboardingOverlayModel;",
            "Lj12/b;",
            "Lq83/d<",
            "-",
            "Lj12/b$i;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lj12/b$i;->x:Lcom/whoop/onboarding/overlay/model/FeatureOnboardingOverlayModel;

    iput-object p2, p0, Lj12/b$i;->y:Lj12/b;

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

    new-instance p1, Lj12/b$i;

    iget-object v0, p0, Lj12/b$i;->x:Lcom/whoop/onboarding/overlay/model/FeatureOnboardingOverlayModel;

    iget-object v1, p0, Lj12/b$i;->y:Lj12/b;

    invoke-direct {p1, v0, v1, p2}, Lj12/b$i;-><init>(Lcom/whoop/onboarding/overlay/model/FeatureOnboardingOverlayModel;Lj12/b;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lj12/b$i;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lj12/b$i;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lj12/b$i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lj12/b$i;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lj12/b$i;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lj12/b$i;->x:Lcom/whoop/onboarding/overlay/model/FeatureOnboardingOverlayModel;

    invoke-static {p1}, Lcom/whoop/onboarding/overlay/model/FeatureOnboardingOverlayModelKt;->getFeatureEducationType(Lcom/whoop/onboarding/overlay/model/FeatureOnboardingOverlayModel;)Lcom/whoop/data/onboarding/FeatureEducationType;

    move-result-object p1

    sget-object v1, Lcom/whoop/data/onboarding/FeatureEducationType;->INTRADAY_JOURNAL_ONBOARDING:Lcom/whoop/data/onboarding/FeatureEducationType;

    if-eq p1, v1, :cond_2

    iget-object p1, p0, Lj12/b$i;->x:Lcom/whoop/onboarding/overlay/model/FeatureOnboardingOverlayModel;

    invoke-static {p1}, Lcom/whoop/onboarding/overlay/model/FeatureOnboardingOverlayModelKt;->getFeatureEducationType(Lcom/whoop/onboarding/overlay/model/FeatureOnboardingOverlayModel;)Lcom/whoop/data/onboarding/FeatureEducationType;

    move-result-object p1

    sget-object v1, Lcom/whoop/data/onboarding/FeatureEducationType;->INTRADAY_JOURNAL_ONBOARDING_WITH_YESTERDAY:Lcom/whoop/data/onboarding/FeatureEducationType;

    if-ne p1, v1, :cond_3

    :cond_2
    iget-object p1, p0, Lj12/b$i;->y:Lj12/b;

    invoke-static {p1}, Lj12/b;->b(Lj12/b;)Lfi0/a;

    move-result-object p1

    const/4 v1, 0x0

    const-string v3, "Journal - Intraday Onboarding"

    const-string v4, "Recording Data"

    const-string v5, "Complete"

    invoke-interface {p1, v4, v5, v1, v3}, Lfi0/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    iget-object p1, p0, Lj12/b$i;->y:Lj12/b;

    iget-object v1, p0, Lj12/b$i;->x:Lcom/whoop/onboarding/overlay/model/FeatureOnboardingOverlayModel;

    invoke-static {p1, v1}, Lj12/b;->g(Lj12/b;Lcom/whoop/onboarding/overlay/model/FeatureOnboardingOverlayModel;)V

    iget-object p1, p0, Lj12/b$i;->y:Lj12/b;

    invoke-static {p1}, Lj12/b;->f(Lj12/b;)Lcom/whoop/onboarding/story/domain/network/a;

    move-result-object p1

    iget-object v1, p0, Lj12/b$i;->x:Lcom/whoop/onboarding/overlay/model/FeatureOnboardingOverlayModel;

    invoke-virtual {v1}, Lcom/whoop/onboarding/overlay/model/FeatureOnboardingOverlayModel;->getFeatureId()J

    move-result-wide v3

    long-to-int v1, v3

    iput v2, p0, Lj12/b$i;->w:I

    invoke-virtual {p1, v1, p0}, Lcom/whoop/onboarding/story/domain/network/a;->f(ILq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
