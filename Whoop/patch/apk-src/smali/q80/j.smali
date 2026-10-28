.class public Lq80/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0011\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0015\u0010\u0008\u001a\u00020\u0007*\u0004\u0018\u00010\u0006H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJg\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000e\u001a\u00020\u000c2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00132\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00150\u00132\u0008\u0008\u0002\u0010\u001a\u001a\u00020\u0019\u00a2\u0006\u0004\u0008\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001d\u00a8\u0006\u001e"
    }
    d2 = {
        "Lq80/j;",
        "",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "<init>",
        "(Lcom/whoop/data/repositories/FeatureFlagChecker;)V",
        "Lcom/whoop/activation/view/navigation/ActivationFlowDestination;",
        "",
        "b",
        "(Lcom/whoop/activation/view/navigation/ActivationFlowDestination;)Z",
        "Lm91/u;",
        "currentScreen",
        "Lp90/e;",
        "card",
        "newCard",
        "Lc31/k;",
        "localProgressButtonState",
        "Lg80/g;",
        "viewState",
        "Lkotlin/Function1;",
        "Lj80/b;",
        "Ll83/a0;",
        "onViewEvent",
        "Lh80/b;",
        "onAnalyticsEvent",
        "Lcom/whoop/activation/iajf/domain/SignUpSource;",
        "signUpSource",
        "a",
        "(Lm91/u;Lp90/e;Lp90/e;Lc31/k;Lg80/g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/whoop/activation/iajf/domain/SignUpSource;)V",
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
.field private final a:Lcom/whoop/data/repositories/FeatureFlagChecker;


# direct methods
.method public constructor <init>(Lcom/whoop/data/repositories/FeatureFlagChecker;)V
    .locals 1

    const-string v0, "featureFlagChecker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq80/j;->a:Lcom/whoop/data/repositories/FeatureFlagChecker;

    return-void
.end method

.method private final b(Lcom/whoop/activation/view/navigation/ActivationFlowDestination;)Z
    .locals 1

    sget-object v0, Lcom/whoop/activation/view/navigation/ActivationFlowDestination;->AL_PERMISSIONS:Lcom/whoop/activation/view/navigation/ActivationFlowDestination;

    if-eq p1, v0, :cond_1

    sget-object v0, Lcom/whoop/activation/view/navigation/ActivationFlowDestination;->MEDICARE_PERMISSIONS:Lcom/whoop/activation/view/navigation/ActivationFlowDestination;

    if-eq p1, v0, :cond_1

    sget-object v0, Lcom/whoop/activation/view/navigation/ActivationFlowDestination;->HW_ONLY_PERMISSIONS:Lcom/whoop/activation/view/navigation/ActivationFlowDestination;

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lq80/j;->a:Lcom/whoop/data/repositories/FeatureFlagChecker;

    sget-object v0, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->HW_ONLY_PERMISSION_SUBMISSION_ANDROID:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    invoke-interface {p1, v0}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Lcom/whoop/data/repositories/OnboardingFeatureFlag;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method


# virtual methods
.method public final a(Lm91/u;Lp90/e;Lp90/e;Lc31/k;Lg80/g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/whoop/activation/iajf/domain/SignUpSource;)V
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm91/u;",
            "Lp90/e;",
            "Lp90/e;",
            "Lc31/k;",
            "Lg80/g;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Lcom/whoop/activation/iajf/domain/SignUpSource;",
            ")V"
        }
    .end annotation

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move-object/from16 v6, p6

    move-object/from16 v2, p7

    const-string v3, "currentScreen"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "card"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "newCard"

    move-object/from16 v4, p3

    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "localProgressButtonState"

    move-object/from16 v5, p4

    invoke-static {v5, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "viewState"

    move-object/from16 v7, p5

    invoke-static {v7, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "onViewEvent"

    invoke-static {v6, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "onAnalyticsEvent"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "signUpSource"

    move-object/from16 v10, p8

    invoke-static {v10, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v3, v0, Lp90/j;

    const/4 v13, 0x0

    if-eqz v3, :cond_1

    new-instance v2, Lj80/a$r0;

    invoke-direct {v2, v1}, Lj80/a$r0;-><init>(Lp90/e;)V

    invoke-interface {v6, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lj80/c$a;

    check-cast v0, Lp90/j;

    invoke-virtual {v0}, Lp90/j;->s()Lcom/whoop/activation/domain/models/steps/UpcycleCreditCardVariant;

    move-result-object v3

    invoke-virtual {v0}, Lp90/j;->u()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v1, v3, v0}, Lj80/c$a;-><init>(Lp90/e;Lcom/whoop/activation/domain/models/steps/UpcycleCreditCardVariant;Ljava/lang/String;)V

    invoke-interface {v6, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    :goto_0
    move-object/from16 v14, p0

    goto/16 :goto_5

    :cond_1
    instance-of v3, v0, Lv90/v;

    const-string v8, "membership"

    if-eqz v3, :cond_3

    check-cast v0, Lv90/v;

    invoke-virtual {v0}, Lv90/v;->f()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v7}, Lg80/g;->e()Lf70/q0;

    move-result-object v1

    invoke-virtual {v1}, Lf70/q0;->f()Lcom/whoop/activation/domain/models/steps/CommitmentType;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/whoop/activation/domain/models/steps/PlanPickerOptionKt;->selectedFor(Ljava/util/List;Lcom/whoop/activation/domain/models/steps/CommitmentType;)Lcom/whoop/activation/domain/models/steps/PlanPickerOption;

    move-result-object v0

    check-cast v0, Lv90/s;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lv90/s;->m()Ljava/lang/String;

    move-result-object v18

    invoke-virtual {v0}, Lv90/s;->f()Ljava/lang/String;

    move-result-object v0

    invoke-static {v8, v0}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v20

    new-instance v14, Lh80/b$i;

    const/16 v21, 0x4

    const/16 v22, 0x0

    const-string v15, "upcycle_plan_picker"

    const-string v16, "advance"

    const/16 v17, 0x0

    const-string v19, "upcycle"

    invoke-direct/range {v14 .. v22}, Lh80/b$i;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v2, v14}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    new-instance v7, Lj80/a$c0;

    const/4 v11, 0x3

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v7 .. v12}, Lj80/a$c0;-><init>(ZLcom/whoop/activation/view/navigation/ActivationFlowDestination;Lcom/whoop/activation/iajf/domain/SignUpSource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v6, v7}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_3
    instance-of v3, v0, Lv90/r;

    const/4 v9, 0x1

    if-eqz v3, :cond_6

    new-instance v14, Lj80/c$c;

    check-cast v0, Lv90/r;

    invoke-virtual {v0}, Lv90/r;->o()Lv90/c;

    move-result-object v3

    invoke-virtual {v3}, Lv90/c;->c()I

    move-result v3

    if-nez v3, :cond_4

    move-object v15, v1

    goto :goto_1

    :cond_4
    move-object v15, v4

    :goto_1
    invoke-virtual {v0}, Lv90/r;->s()Ljava/lang/String;

    move-result-object v16

    invoke-virtual {v0}, Lv90/r;->p()Ljava/lang/String;

    move-result-object v17

    invoke-virtual {v0}, Lv90/r;->l()Z

    move-result v18

    invoke-virtual {v0}, Lv90/r;->o()Lv90/c;

    move-result-object v1

    invoke-virtual {v1}, Lv90/c;->c()I

    move-result v1

    if-nez v1, :cond_5

    move/from16 v19, v9

    goto :goto_2

    :cond_5
    move/from16 v19, v13

    :goto_2
    invoke-virtual {v0}, Lv90/r;->v()Ljava/lang/String;

    move-result-object v20

    invoke-direct/range {v14 .. v20}, Lj80/c$c;-><init>(Lp90/e;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;)V

    invoke-interface {v6, v14}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Lv90/r;->j()Ljava/lang/String;

    move-result-object v0

    invoke-static {v8, v0}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v20

    new-instance v14, Lh80/b$i;

    const/16 v21, 0x6

    const/16 v22, 0x0

    const-string v15, "upcycle_checkout"

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-string v18, "join"

    const-string v19, "upcycle"

    invoke-direct/range {v14 .. v22}, Lh80/b$i;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v2, v14}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    :cond_6
    instance-of v3, v0, Lv90/o;

    if-eqz v3, :cond_8

    check-cast v0, Lv90/o;

    invoke-virtual {v0}, Lv90/o;->e()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v7}, Lg80/g;->e()Lf70/q0;

    move-result-object v3

    invoke-virtual {v3}, Lf70/q0;->f()Lcom/whoop/activation/domain/models/steps/CommitmentType;

    move-result-object v3

    invoke-static {v1, v3}, Lcom/whoop/activation/domain/models/steps/PlanPickerOptionKt;->selectedFor(Ljava/util/List;Lcom/whoop/activation/domain/models/steps/CommitmentType;)Lcom/whoop/activation/domain/models/steps/PlanPickerOption;

    move-result-object v1

    check-cast v1, Lv90/k;

    if-eqz v1, :cond_7

    new-instance v14, Lh80/b$i;

    invoke-virtual {v0}, Lv90/o;->a()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v1}, Lv90/k;->k()Ljava/lang/String;

    move-result-object v17

    const/16 v21, 0x28

    const/16 v22, 0x0

    const-string v16, "close"

    const/16 v18, 0x0

    const-string v19, "20_dollar_discount"

    const/16 v20, 0x0

    invoke-direct/range {v14 .. v22}, Lh80/b$i;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v2, v14}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_7
    new-instance v7, Lj80/a$c0;

    const/4 v11, 0x3

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object/from16 v10, p8

    invoke-direct/range {v7 .. v12}, Lj80/a$c0;-><init>(ZLcom/whoop/activation/view/navigation/ActivationFlowDestination;Lcom/whoop/activation/iajf/domain/SignUpSource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v6, v7}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    :cond_8
    instance-of v3, v0, Lv90/g;

    if-eqz v3, :cond_b

    new-instance v14, Lj80/c$b;

    check-cast v0, Lv90/g;

    invoke-virtual {v0}, Lv90/g;->o()Lv90/j;

    move-result-object v3

    invoke-virtual {v3}, Lv90/j;->c()I

    move-result v3

    if-nez v3, :cond_9

    move-object v15, v1

    goto :goto_3

    :cond_9
    move-object v15, v4

    :goto_3
    invoke-virtual {v0}, Lv90/g;->s()Ljava/lang/String;

    move-result-object v16

    invoke-virtual {v0}, Lv90/g;->p()Ljava/lang/String;

    move-result-object v17

    invoke-virtual {v0}, Lv90/g;->l()Z

    move-result v18

    invoke-virtual {v0}, Lv90/g;->o()Lv90/j;

    move-result-object v1

    invoke-virtual {v1}, Lv90/j;->c()I

    move-result v1

    if-nez v1, :cond_a

    move/from16 v19, v9

    goto :goto_4

    :cond_a
    move/from16 v19, v13

    :goto_4
    invoke-virtual {v0}, Lv90/g;->u()Ljava/lang/String;

    move-result-object v20

    invoke-direct/range {v14 .. v20}, Lj80/c$b;-><init>(Lp90/e;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;)V

    invoke-interface {v6, v14}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Lv90/g;->j()Ljava/lang/String;

    move-result-object v0

    invoke-static {v8, v0}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v20

    new-instance v14, Lh80/b$i;

    const/16 v21, 0x6

    const/16 v22, 0x0

    const-string v15, "trial_offer_checkout"

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-string v18, "join"

    const-string v19, "20_dollar_discount"

    invoke-direct/range {v14 .. v22}, Lh80/b$i;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v2, v14}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    :cond_b
    instance-of v3, v0, Ln90/e;

    if-eqz v3, :cond_c

    sget-object v0, Lj80/a$a;->a:Lj80/a$a;

    invoke-interface {v6, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    :cond_c
    instance-of v3, v0, Ld90/c;

    if-eqz v3, :cond_e

    invoke-virtual {v7}, Lg80/g;->a()Lcom/whoop/activation/view/navigation/ActivationFlowDestination;

    move-result-object v1

    sget-object v3, Lcom/whoop/activation/view/navigation/ActivationFlowDestination;->ACCOUNT_TRANSITION_LEGACY_AFTER_ACTIVATION:Lcom/whoop/activation/view/navigation/ActivationFlowDestination;

    if-ne v1, v3, :cond_d

    new-instance v7, Lj80/a$c0;

    const/4 v11, 0x3

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object/from16 v10, p8

    invoke-direct/range {v7 .. v12}, Lj80/a$c0;-><init>(ZLcom/whoop/activation/view/navigation/ActivationFlowDestination;Lcom/whoop/activation/iajf/domain/SignUpSource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v6, v7}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    :cond_d
    check-cast v0, Ld90/c;

    invoke-virtual {v0}, Ld90/c;->a()Ljava/lang/String;

    move-result-object v15

    new-instance v14, Lh80/b$i;

    const/16 v21, 0x26

    const/16 v22, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-string v18, "reenter_email"

    const-string v19, "account_creation"

    const/16 v20, 0x0

    invoke-direct/range {v14 .. v22}, Lh80/b$i;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v2, v14}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v7}, Lg80/g;->a()Lcom/whoop/activation/view/navigation/ActivationFlowDestination;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Lj80/a$m0;

    invoke-direct {v1, v0}, Lj80/a$m0;-><init>(Lcom/whoop/activation/view/navigation/ActivationFlowDestination;)V

    invoke-interface {v6, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    :cond_e
    instance-of v2, v0, Lr90/g;

    if-eqz v2, :cond_11

    invoke-virtual {v5}, Lc31/k;->p()Lc31/d;

    move-result-object v2

    sget-object v3, Lc31/d;->ERROR:Lc31/d;

    if-ne v2, v3, :cond_f

    invoke-virtual {v7}, Lg80/g;->a()Lcom/whoop/activation/view/navigation/ActivationFlowDestination;

    move-result-object v2

    move-object/from16 v14, p0

    invoke-direct {v14, v2}, Lq80/j;->b(Lcom/whoop/activation/view/navigation/ActivationFlowDestination;)Z

    move-result v2

    if-nez v2, :cond_10

    new-instance v0, Lj80/c$a;

    move-object/from16 v2, p1

    check-cast v2, Lr90/g;

    invoke-virtual {v2}, Lr90/g;->q()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-direct/range {v0 .. v5}, Lj80/c$a;-><init>(Lp90/e;Lcom/whoop/activation/domain/models/steps/UpcycleCreditCardVariant;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v6, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_5

    :cond_f
    move-object/from16 v14, p0

    :cond_10
    new-instance v7, Lj80/a$c0;

    const/4 v11, 0x3

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object/from16 v10, p8

    invoke-direct/range {v7 .. v12}, Lj80/a$c0;-><init>(ZLcom/whoop/activation/view/navigation/ActivationFlowDestination;Lcom/whoop/activation/iajf/domain/SignUpSource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v6, v7}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_5

    :cond_11
    move-object/from16 v14, p0

    new-instance v7, Lj80/a$c0;

    const/4 v11, 0x3

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object/from16 v10, p8

    invoke-direct/range {v7 .. v12}, Lj80/a$c0;-><init>(ZLcom/whoop/activation/view/navigation/ActivationFlowDestination;Lcom/whoop/activation/iajf/domain/SignUpSource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v6, v7}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_5
    new-instance v0, Lj80/a$o0;

    invoke-direct {v0, v13}, Lj80/a$o0;-><init>(Z)V

    invoke-interface {v6, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
