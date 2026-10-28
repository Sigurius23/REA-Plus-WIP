.class public final Lf70/y0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\t\u0010\u0008\u00a8\u0006\n"
    }
    d2 = {
        "Lf70/y0;",
        "",
        "<init>",
        "()V",
        "Lf70/e$b;",
        "prevDomainResult",
        "",
        "b",
        "(Lf70/e$b;)I",
        "a",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lf70/e$b;)I
    .locals 6

    const-string v0, "prevDomainResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lf70/e$b;->l()Ln70/e;

    move-result-object v0

    invoke-virtual {v0}, Ln70/e;->d()I

    move-result v0

    invoke-virtual {p1}, Lf70/e$b;->m()Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-static {v0, v1}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/activation/domain/models/ActivationFlowStepModel;

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    invoke-virtual {p1}, Lf70/e$b;->m()Ljava/util/List;

    move-result-object v3

    const/4 v4, 0x1

    if-eqz v3, :cond_1

    add-int/2addr v0, v4

    invoke-static {v0, v3}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/whoop/activation/domain/models/ActivationFlowStepModel;

    :cond_1
    invoke-virtual {p1}, Lf70/e$b;->h()Lf70/q0;

    move-result-object p1

    instance-of v0, v1, Lcom/whoop/activation/domain/models/steps/CountrySelectionStepModel;

    const/4 v3, 0x2

    if-eqz v0, :cond_2

    instance-of v0, v2, Lcom/whoop/activation/domain/models/steps/StateSelectionStepModel;

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lf70/q0;->i()Ljava/lang/String;

    move-result-object v0

    const-string v5, "US"

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    return v3

    :cond_2
    instance-of v0, v1, Lcom/whoop/activation/domain/models/steps/GiftStepModel;

    if-eqz v0, :cond_3

    instance-of v0, v2, Lcom/whoop/activation/domain/models/steps/ReferAFriendCodesModel;

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Lf70/q0;->y()I

    move-result v0

    if-nez v0, :cond_3

    return v3

    :cond_3
    instance-of v0, v1, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;

    if-eqz v0, :cond_4

    instance-of v0, v2, Lcom/whoop/activation/domain/models/steps/UpcyclePlanPickerModel;

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Lf70/q0;->x()Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_4

    const/4 p1, 0x3

    return p1

    :cond_4
    instance-of v0, v1, Lcom/whoop/activation/domain/models/steps/PaymentMethodStepModel;

    if-eqz v0, :cond_5

    instance-of v0, v2, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;

    if-eqz v0, :cond_5

    invoke-virtual {p1}, Lf70/q0;->x()Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_5

    return v3

    :cond_5
    instance-of v0, v2, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;

    if-eqz v0, :cond_6

    invoke-virtual {p1}, Lf70/q0;->f()Lcom/whoop/activation/domain/models/steps/CommitmentType;

    move-result-object v0

    sget-object v5, Lcom/whoop/activation/domain/models/steps/CommitmentType;->TRIAL:Lcom/whoop/activation/domain/models/steps/CommitmentType;

    if-ne v0, v5, :cond_6

    return v3

    :cond_6
    instance-of v0, v1, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;

    if-eqz v0, :cond_7

    instance-of v0, v2, Lcom/whoop/activation/domain/models/steps/PaymentMethodStepModel;

    if-eqz v0, :cond_7

    return v3

    :cond_7
    instance-of v0, v1, Lcom/whoop/activation/domain/models/steps/TrialPlanPickerModel;

    if-eqz v0, :cond_8

    check-cast v1, Lcom/whoop/activation/domain/models/steps/TrialPlanPickerModel;

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/TrialPlanPickerModel;->getPlanOptions()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1}, Lf70/q0;->f()Lcom/whoop/activation/domain/models/steps/CommitmentType;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/whoop/activation/domain/models/steps/PlanPickerOptionKt;->selectedFor(Ljava/util/List;Lcom/whoop/activation/domain/models/steps/CommitmentType;)Lcom/whoop/activation/domain/models/steps/PlanPickerOption;

    move-result-object p1

    check-cast p1, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;

    if-eqz p1, :cond_8

    invoke-virtual {p1}, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->getShouldSkipNextScreen()Z

    move-result p1

    if-ne p1, v4, :cond_8

    return v3

    :cond_8
    return v4
.end method

.method public final b(Lf70/e$b;)I
    .locals 4

    const-string v0, "prevDomainResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lf70/e$b;->l()Ln70/e;

    move-result-object v0

    invoke-virtual {v0}, Ln70/e;->d()I

    move-result v0

    invoke-virtual {p1}, Lf70/e$b;->m()Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-static {v0, v1}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/activation/domain/models/ActivationFlowStepModel;

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    invoke-virtual {p1}, Lf70/e$b;->m()Ljava/util/List;

    move-result-object v3

    if-eqz v3, :cond_1

    add-int/lit8 v0, v0, -0x1

    invoke-static {v0, v3}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/whoop/activation/domain/models/ActivationFlowStepModel;

    :cond_1
    invoke-virtual {p1}, Lf70/e$b;->h()Lf70/q0;

    move-result-object p1

    invoke-virtual {p1}, Lf70/q0;->i()Ljava/lang/String;

    move-result-object p1

    instance-of v0, v1, Lcom/whoop/activation/domain/models/steps/NotificationsStepModel;

    const/4 v3, -0x2

    if-eqz v0, :cond_2

    instance-of v0, v2, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;

    if-eqz v0, :cond_2

    return v3

    :cond_2
    instance-of v0, v1, Lcom/whoop/activation/domain/models/steps/PaymentMethodStepModel;

    if-eqz v0, :cond_3

    instance-of v0, v2, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;

    if-eqz v0, :cond_3

    return v3

    :cond_3
    instance-of v0, v2, Lcom/whoop/activation/domain/models/steps/StateSelectionStepModel;

    if-eqz v0, :cond_4

    const-string v0, "US"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v3

    :cond_4
    const/4 p1, -0x1

    return p1
.end method
