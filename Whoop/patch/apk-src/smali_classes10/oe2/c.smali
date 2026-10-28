.class public final synthetic Loe2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Loe2/c;->w:I

    iput-object p1, p0, Loe2/c;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;II)V
    .locals 0

    .line 2
    iput p3, p0, Loe2/c;->w:I

    iput-object p1, p0, Loe2/c;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Loe2/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Loe2/c;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/debug/experiments/ExperimentsDebugFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/debug/experiments/ExperimentsDebugFragment;->y(Lcom/whoop/debug/experiments/ExperimentsDebugFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Loe2/c;->x:Ljava/lang/Object;

    check-cast v0, Lqt2/c0;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lqt2/d0;->a(Lqt2/c0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Loe2/c;->x:Ljava/lang/Object;

    check-cast v0, Lqt2/h;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lqt2/i;->b(Lqt2/h;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Loe2/c;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/training/locationsettings/view/LocationSettingsFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/training/locationsettings/view/LocationSettingsFragment;->z(Lcom/whoop/training/locationsettings/view/LocationSettingsFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Loe2/c;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/advancedlabsmanagement/view/AdvancedLabsManagementFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/advancedlabsmanagement/view/AdvancedLabsManagementFragment;->z(Lcom/whoop/advancedlabsmanagement/view/AdvancedLabsManagementFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Loe2/c;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/advancedlabs/testhistory/view/TestHistoryFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/advancedlabs/testhistory/view/TestHistoryFragment;->y(Lcom/whoop/advancedlabs/testhistory/view/TestHistoryFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Loe2/c;->x:Ljava/lang/Object;

    check-cast v0, Lqa2/b;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lqa2/b;->y(Lqa2/b;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-object v0, p0, Loe2/c;->x:Ljava/lang/Object;

    check-cast v0, Lm72/j;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lq72/c;->b(Lm72/j;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    iget-object v0, p0, Loe2/c;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/debug/dismissalplayground/DismissalPlaygroundFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/debug/dismissalplayground/DismissalPlaygroundFragment;->y(Lcom/whoop/debug/dismissalplayground/DismissalPlaygroundFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    iget-object v0, p0, Loe2/c;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/hormonalinsights/pregnancyinsights/view/PregnancyInsightsFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/hormonalinsights/pregnancyinsights/view/PregnancyInsightsFragment;->z(Lcom/whoop/hormonalinsights/pregnancyinsights/view/PregnancyInsightsFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    iget-object v0, p0, Loe2/c;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/universalcheckout/features/UniversalCheckoutFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/universalcheckout/features/UniversalCheckoutFragment;->E(Lcom/whoop/universalcheckout/features/UniversalCheckoutFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    iget-object v0, p0, Loe2/c;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/challengedetails/view/ChallengeDetailsFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/challengedetails/view/ChallengeDetailsFragment;->z(Lcom/whoop/challengedetails/view/ChallengeDetailsFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    iget-object v0, p0, Loe2/c;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/stress/view/StressSessionFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/stress/view/StressSessionFragment;->C(Lcom/whoop/stress/view/StressSessionFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_c
    iget-object v0, p0, Loe2/c;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/stress/view/StressMonitorFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/stress/view/StressMonitorFragment;->K(Lcom/whoop/stress/view/StressMonitorFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_d
    iget-object v0, p0, Loe2/c;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/aiinsights/AiInsightsFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/aiinsights/AiInsightsFragment;->F(Lcom/whoop/aiinsights/AiInsightsFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_e
    iget-object v0, p0, Loe2/c;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/settings/regulatorylabels/SettingsRegulatoryLabelsFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/settings/regulatorylabels/SettingsRegulatoryLabelsFragment;->y(Lcom/whoop/settings/regulatorylabels/SettingsRegulatoryLabelsFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    iget-object v0, p0, Loe2/c;->x:Ljava/lang/Object;

    check-cast v0, Lp90/j;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lp90/d;->l(Lp90/j;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_10
    iget-object v0, p0, Loe2/c;->x:Ljava/lang/Object;

    check-cast v0, Lp00/o;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {v0, p1, p2}, Ls2/e;->h(Lp00/o;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_11
    iget-object v0, p0, Loe2/c;->x:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/model/ConsentUi$ConsentSection;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {v0, p1, p2}, Lp00/h;->b(Lcom/stripe/android/model/ConsentUi$ConsentSection;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_12
    iget-object v0, p0, Loe2/c;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/debug/battery/BatteryDebugFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/debug/battery/BatteryDebugFragment;->y(Lcom/whoop/debug/battery/BatteryDebugFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_13
    iget-object v0, p0, Loe2/c;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/core/details/view/CoreDetailsFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/core/details/view/CoreDetailsFragment;->A(Lcom/whoop/core/details/view/CoreDetailsFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_14
    iget-object v0, p0, Loe2/c;->x:Ljava/lang/Object;

    check-cast v0, Lnt1/i;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lot1/d;->e(Lnt1/i;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_15
    iget-object v0, p0, Loe2/c;->x:Ljava/lang/Object;

    check-cast v0, Landroidx/compose/ui/platform/ComposeView;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Los0/c;->e(Landroidx/compose/ui/platform/ComposeView;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_16
    iget-object v0, p0, Loe2/c;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/impacts/details/view/BehaviorDetailsFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/impacts/details/view/BehaviorDetailsFragment;->y(Lcom/whoop/impacts/details/view/BehaviorDetailsFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_17
    iget-object v0, p0, Loe2/c;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/shepherd/fragment/ShepherdToggleSettingsFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/shepherd/fragment/ShepherdToggleSettingsFragment;->z(Lcom/whoop/shepherd/fragment/ShepherdToggleSettingsFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_18
    iget-object v0, p0, Loe2/c;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/shepherd/fragment/ShepherdTermsOfUseFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/shepherd/fragment/ShepherdTermsOfUseFragment;->z(Lcom/whoop/shepherd/fragment/ShepherdTermsOfUseFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_19
    iget-object v0, p0, Loe2/c;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/shepherd/fragment/ShepherdSubmitTermsOfUseFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/shepherd/fragment/ShepherdSubmitTermsOfUseFragment;->z(Lcom/whoop/shepherd/fragment/ShepherdSubmitTermsOfUseFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1a
    iget-object v0, p0, Loe2/c;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/shepherd/fragment/ShepherdRegistrationFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/shepherd/fragment/ShepherdRegistrationFragment;->z(Lcom/whoop/shepherd/fragment/ShepherdRegistrationFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1b
    iget-object v0, p0, Loe2/c;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/shepherd/fragment/ShepherdOnboardingFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/shepherd/fragment/ShepherdOnboardingFragment;->B(Lcom/whoop/shepherd/fragment/ShepherdOnboardingFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1c
    iget-object v0, p0, Loe2/c;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/shepherd/fragment/ShepherdNotificationHistoryFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/shepherd/fragment/ShepherdNotificationHistoryFragment;->z(Lcom/whoop/shepherd/fragment/ShepherdNotificationHistoryFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

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
