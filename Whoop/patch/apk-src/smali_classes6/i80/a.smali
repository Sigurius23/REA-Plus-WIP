.class public final synthetic Li80/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Li80/a;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Li80/a;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lfb0/a;

    invoke-static {p1}, Lib0/d;->e(Lfb0/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lkd0/a$c;

    invoke-static {p1}, Lib0/d;->i(Lkd0/a$c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-static {p1}, Lib0/d;->h(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Lkd0/a$c;

    invoke-static {p1}, Lib0/d;->m(Lkd0/a$c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;

    invoke-static {p1}, Li80/b;->k(Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;)Lh90/c;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Lcom/whoop/activation/domain/models/steps/StateSelectionStepModel;

    invoke-static {p1}, Li80/b;->b(Lcom/whoop/activation/domain/models/steps/StateSelectionStepModel;)Lu80/d;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Lcom/whoop/activation/domain/models/steps/CountrySelectionStepModel;

    invoke-static {p1}, Li80/b;->a(Lcom/whoop/activation/domain/models/steps/CountrySelectionStepModel;)Lu80/d;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Lcom/whoop/activation/domain/models/steps/GiftStepModel;

    invoke-static {p1}, Li80/b;->s(Lcom/whoop/activation/domain/models/steps/GiftStepModel;)Lf90/c;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast p1, Lcom/whoop/activation/domain/models/steps/TrialOfferCheckoutModel;

    invoke-static {p1}, Li80/b;->c(Lcom/whoop/activation/domain/models/steps/TrialOfferCheckoutModel;)Lv90/g;

    move-result-object p1

    return-object p1

    :pswitch_8
    check-cast p1, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;

    invoke-static {p1}, Li80/b;->D(Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;)Lv90/r;

    move-result-object p1

    return-object p1

    :pswitch_9
    check-cast p1, Lcom/whoop/activation/domain/models/steps/CreateYourAccountStepModel;

    invoke-static {p1}, Li80/b;->n(Lcom/whoop/activation/domain/models/steps/CreateYourAccountStepModel;)Lw80/c;

    move-result-object p1

    return-object p1

    :pswitch_a
    check-cast p1, Ljb1/b;

    invoke-static {p1}, Li80/b;->q(Ljb1/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    check-cast p1, Lcom/whoop/activation/domain/models/steps/TrialPlanPickerModel;

    invoke-static {p1}, Li80/b;->u(Lcom/whoop/activation/domain/models/steps/TrialPlanPickerModel;)Lv90/o;

    move-result-object p1

    return-object p1

    :pswitch_c
    check-cast p1, Lcom/whoop/activation/domain/models/steps/UpcyclePlanPickerModel;

    invoke-static {p1}, Li80/b;->e(Lcom/whoop/activation/domain/models/steps/UpcyclePlanPickerModel;)Lv90/v;

    move-result-object p1

    return-object p1

    :pswitch_d
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Li80/b;->m(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_e
    check-cast p1, Lcom/whoop/activation/domain/models/steps/ReferAFriendCodesModel;

    invoke-static {p1}, Li80/b;->B(Lcom/whoop/activation/domain/models/steps/ReferAFriendCodesModel;)Ls90/h;

    move-result-object p1

    return-object p1

    :pswitch_f
    check-cast p1, Lcom/whoop/activation/domain/models/steps/PaymentMethodStepModel;

    invoke-static {p1}, Li80/b;->f(Lcom/whoop/activation/domain/models/steps/PaymentMethodStepModel;)Lp90/j;

    move-result-object p1

    return-object p1

    :pswitch_10
    check-cast p1, Lcom/whoop/activation/domain/models/steps/NotificationsStepModel;

    invoke-static {p1}, Li80/b;->p(Lcom/whoop/activation/domain/models/steps/NotificationsStepModel;)Ln90/e;

    move-result-object p1

    return-object p1

    :pswitch_11
    check-cast p1, Lcom/whoop/activation/domain/models/steps/BirthdayStepModel;

    invoke-static {p1}, Li80/b;->y(Lcom/whoop/activation/domain/models/steps/BirthdayStepModel;)Ls80/d;

    move-result-object p1

    return-object p1

    :pswitch_12
    check-cast p1, Lcom/whoop/activation/domain/models/steps/NameInformationStepModel;

    invoke-static {p1}, Li80/b;->l(Lcom/whoop/activation/domain/models/steps/NameInformationStepModel;)Lm90/c;

    move-result-object p1

    return-object p1

    :pswitch_13
    check-cast p1, Lcom/whoop/activation/domain/models/steps/HealthConnectStepModel;

    invoke-static {p1}, Li80/b;->F(Lcom/whoop/activation/domain/models/steps/HealthConnectStepModel;)Lg90/g;

    move-result-object p1

    return-object p1

    :pswitch_14
    check-cast p1, Lcom/whoop/activation/domain/models/steps/UniversalPaymentMethodStepModel;

    invoke-static {p1}, Li80/b;->g(Lcom/whoop/activation/domain/models/steps/UniversalPaymentMethodStepModel;)Lu90/c;

    move-result-object p1

    return-object p1

    :pswitch_15
    check-cast p1, Lcom/whoop/activation/domain/models/steps/HeroWithFooterCtaStepModel;

    invoke-static {p1}, Li80/b;->v(Lcom/whoop/activation/domain/models/steps/HeroWithFooterCtaStepModel;)Lc90/b;

    move-result-object p1

    return-object p1

    :pswitch_16
    check-cast p1, Lcom/whoop/activation/domain/models/steps/FamilyPlanBlockStepModel;

    invoke-static {p1}, Li80/b;->A(Lcom/whoop/activation/domain/models/steps/FamilyPlanBlockStepModel;)Ld90/c;

    move-result-object p1

    return-object p1

    :pswitch_17
    check-cast p1, Lcom/whoop/activation/domain/models/steps/CheckYourEmailStepModel;

    invoke-static {p1}, Li80/b;->d(Lcom/whoop/activation/domain/models/steps/CheckYourEmailStepModel;)Lt80/d;

    move-result-object p1

    return-object p1

    :pswitch_18
    check-cast p1, Ljb1/b;

    invoke-static {p1}, Li80/b;->w(Ljb1/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_19
    check-cast p1, Lcom/whoop/activation/domain/models/steps/CreatePasswordStepModel;

    invoke-static {p1}, Li80/b;->t(Lcom/whoop/activation/domain/models/steps/CreatePasswordStepModel;)Lv80/c;

    move-result-object p1

    return-object p1

    :pswitch_1a
    check-cast p1, Lcom/whoop/activation/domain/models/steps/EnterYourPasswordStepModel;

    invoke-static {p1}, Li80/b;->o(Lcom/whoop/activation/domain/models/steps/EnterYourPasswordStepModel;)Lb90/g;

    move-result-object p1

    return-object p1

    :pswitch_1b
    check-cast p1, Lcom/whoop/activation/domain/models/steps/EnterEmailStepModel;

    invoke-static {p1}, Li80/b;->j(Lcom/whoop/activation/domain/models/steps/EnterEmailStepModel;)Lm80/e;

    move-result-object p1

    return-object p1

    :pswitch_1c
    check-cast p1, Lcom/whoop/activation/domain/models/steps/WelcomeTransitionStepModel;

    invoke-static {p1}, Li80/b;->r(Lcom/whoop/activation/domain/models/steps/WelcomeTransitionStepModel;)Lw90/c;

    move-result-object p1

    return-object p1

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
