.class final Lj12/b$j;
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
    c = "com.whoop.onboarding.overlay.OnboardingOverlayInteractor$markCompleted$2"
    f = "OnboardingOverlayInteractor.kt"
    l = {
        0x81
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lj12/b;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:I

.field final synthetic z:Lcom/whoop/onboarding/overlay/model/FeatureOnboardingOverlayModel;


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
            "Lj12/b$j;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lj12/b$j;->z:Lcom/whoop/onboarding/overlay/model/FeatureOnboardingOverlayModel;

    iput-object p2, p0, Lj12/b$j;->E:Lj12/b;

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

    new-instance p1, Lj12/b$j;

    iget-object v0, p0, Lj12/b$j;->z:Lcom/whoop/onboarding/overlay/model/FeatureOnboardingOverlayModel;

    iget-object v1, p0, Lj12/b$j;->E:Lj12/b;

    invoke-direct {p1, v0, v1, p2}, Lj12/b$j;-><init>(Lcom/whoop/onboarding/overlay/model/FeatureOnboardingOverlayModel;Lj12/b;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lj12/b$j;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lj12/b$j;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lj12/b$j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lj12/b$j;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lj12/b$j;->y:I

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v4, :cond_0

    iget-object v0, p0, Lj12/b$j;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/data/onboarding/OnboardingStatus;

    iget-object v0, p0, Lj12/b$j;->w:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/data/onboarding/FeatureEducationType;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lj12/b$j;->z:Lcom/whoop/onboarding/overlay/model/FeatureOnboardingOverlayModel;

    invoke-static {p1}, Lcom/whoop/onboarding/overlay/model/FeatureOnboardingOverlayModelKt;->getFeatureEducationType(Lcom/whoop/onboarding/overlay/model/FeatureOnboardingOverlayModel;)Lcom/whoop/data/onboarding/FeatureEducationType;

    move-result-object p1

    if-nez p1, :cond_2

    iget-object p1, p0, Lj12/b$j;->E:Lj12/b;

    invoke-static {p1}, Lj12/b;->d(Lj12/b;)Ltr2/n;

    move-result-object p1

    iget-object v0, p0, Lj12/b$j;->z:Lcom/whoop/onboarding/overlay/model/FeatureOnboardingOverlayModel;

    invoke-virtual {v0}, Lcom/whoop/onboarding/overlay/model/FeatureOnboardingOverlayModel;->getFeatureEducationName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "completed unknown feature education "

    invoke-static {v1, v0}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-array v1, v3, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    return-object v2

    :cond_2
    new-instance v1, Lcom/whoop/data/onboarding/OnboardingStatus;

    invoke-direct {v1, p1, v4}, Lcom/whoop/data/onboarding/OnboardingStatus;-><init>(Lcom/whoop/data/onboarding/FeatureEducationType;Z)V

    :try_start_1
    iget-object v5, p0, Lj12/b$j;->E:Lj12/b;

    invoke-static {v5}, Lj12/b;->e(Lj12/b;)Lcom/whoop/data/onboarding/OnboardingStatusDao;

    move-result-object v5

    iput-object p1, p0, Lj12/b$j;->w:Ljava/lang/Object;

    const/4 v6, 0x0

    iput-object v6, p0, Lj12/b$j;->x:Ljava/lang/Object;

    iput v4, p0, Lj12/b$j;->y:I

    invoke-interface {v5, v1, p0}, Lcom/whoop/data/onboarding/OnboardingStatusDao;->updateTable(Lcom/whoop/data/onboarding/OnboardingStatus;Lq83/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    if-ne p1, v0, :cond_3

    return-object v0

    :catch_1
    move-exception v0

    move-object v7, v0

    move-object v0, p1

    move-object p1, v7

    :goto_0
    iget-object v1, p0, Lj12/b$j;->E:Lj12/b;

    invoke-static {v1}, Lj12/b;->d(Lj12/b;)Ltr2/n;

    move-result-object v1

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Failed to insert new value for "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v3, v3, [Lqr2/a$a;

    invoke-interface {v1, v0, p1, v3}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    :cond_3
    :goto_1
    return-object v2
.end method
