.class public final synthetic Lr70/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lr70/b;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lr70/b;->w:I

    packed-switch v0, :pswitch_data_0

    sget v0, Lrf/x;->c:I

    const-string v0, "request cancelled"

    return-object v0

    :pswitch_0
    invoke-static {}, Lrb1/a;->c()Ljb1/a;

    move-result-object v0

    return-object v0

    :pswitch_1
    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->a()Lad3/c;

    move-result-object v0

    return-object v0

    :pswitch_2
    invoke-static {}, Lcom/whoop/design/models/binding/AggregateBinding;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_3
    invoke-static {}, Lr90/h;->e()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_4
    invoke-static {}, Lr90/h;->i()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_5
    invoke-static {}, Lr90/h;->h()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_6
    invoke-static {}, Lr71/b;->e()Ly3/f;

    move-result-object v0

    return-object v0

    :pswitch_7
    invoke-static {}, Lr71/b;->i()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_8
    invoke-static {}, Lcom/whoop/design/atomic/organism/horizontalscrollcontainer/HorizontalScrollBehavior;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_9
    invoke-static {}, Lcom/whoop/activation/domain/models/steps/WelcomeTransitionStepModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_a
    invoke-static {}, Lcom/whoop/activation/domain/models/steps/UpcyclePlanPickerModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_b
    invoke-static {}, Lcom/whoop/activation/domain/models/steps/UpcyclePlanPickerModel;->b()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_c
    invoke-static {}, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_d
    invoke-static {}, Lcom/whoop/activation/domain/models/steps/UniversalPaymentMethodStepModel;->b()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_e
    invoke-static {}, Lcom/whoop/activation/domain/models/steps/UniversalPaymentMethodStepModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_f
    invoke-static {}, Lcom/whoop/activation/domain/models/steps/TrialPlanPickerModel;->b()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_10
    invoke-static {}, Lcom/whoop/activation/domain/models/steps/TrialPlanPickerModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_11
    invoke-static {}, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_12
    invoke-static {}, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->b()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_13
    invoke-static {}, Lcom/whoop/activation/domain/models/steps/TrialOfferCheckoutModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_14
    invoke-static {}, Lcom/whoop/activation/domain/models/steps/StateSelectionStepModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_15
    invoke-static {}, Lcom/whoop/activation/domain/models/steps/ReferAFriendCodesModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_16
    invoke-static {}, Lcom/whoop/activation/domain/models/steps/ReferAFriendCodesModel;->b()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_17
    invoke-static {}, Lcom/whoop/activation/domain/models/steps/RafHowItWorksModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_18
    invoke-static {}, Lcom/whoop/activation/domain/models/steps/RafHowItWorksInstructionModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_19
    invoke-static {}, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_1a
    invoke-static {}, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->c()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_1b
    invoke-static {}, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->b()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_1c
    invoke-static {}, Lcom/whoop/activation/domain/models/steps/PlanOption;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
