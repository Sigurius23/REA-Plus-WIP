.class public final synthetic Lci0/a;
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

    iput p2, p0, Lci0/a;->w:I

    iput-object p1, p0, Lci0/a;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lci0/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lci0/a;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/sms/setup/view/SmsSetupFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/sms/setup/view/SmsSetupFragment;->y(Lcom/whoop/sms/setup/view/SmsSetupFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lci0/a;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/settings/WakeUpAutopopHeightTesterFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/settings/WakeUpAutopopHeightTesterFragment;->z(Lcom/whoop/settings/WakeUpAutopopHeightTesterFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lci0/a;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/add/activity/view/AddActivityFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/add/activity/view/AddActivityFragment;->z(Lcom/whoop/add/activity/view/AddActivityFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lci0/a;->x:Ljava/lang/Object;

    check-cast v0, Le11/d;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Le11/c;->c(Le11/d;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lci0/a;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/changepassword/view/ChangePasswordV2Fragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/changepassword/view/ChangePasswordV2Fragment;->y(Lcom/whoop/changepassword/view/ChangePasswordV2Fragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lci0/a;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/ui/onboarding/dayzero/DayZeroSplashDialogFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/ui/onboarding/dayzero/DayZeroSplashDialogFragment;->C(Lcom/whoop/ui/onboarding/dayzero/DayZeroSplashDialogFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lci0/a;->x:Ljava/lang/Object;

    check-cast v0, Lxk1/c;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Ldl1/d;->e(Lxk1/c;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-object v0, p0, Lci0/a;->x:Ljava/lang/Object;

    check-cast v0, Lxf3/c;

    check-cast p1, Lfd2/a;

    check-cast p2, Lfd2/b;

    invoke-static {v0, p1, p2}, Ldd2/a;->h(Lxf3/c;Lfd2/a;Lfd2/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    iget-object v0, p0, Lci0/a;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/advancedlabs/edittestdetails/view/EditTestDetailsFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/advancedlabs/edittestdetails/view/EditTestDetailsFragment;->y(Lcom/whoop/advancedlabs/edittestdetails/view/EditTestDetailsFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    iget-object v0, p0, Lci0/a;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment;->y(Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    iget-object v0, p0, Lci0/a;->x:Ljava/lang/Object;

    check-cast v0, Ld91/e;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Ld91/e;->j(Ld91/e;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    iget-object v0, p0, Lci0/a;->x:Ljava/lang/Object;

    check-cast v0, Ld81/d;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Ld81/c;->c(Ld81/d;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    iget-object v0, p0, Lci0/a;->x:Ljava/lang/Object;

    check-cast v0, Ld62/h;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Ld62/g;->p(Ld62/h;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_c
    iget-object v0, p0, Lci0/a;->x:Ljava/lang/Object;

    check-cast v0, Lhy0/c2;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Ld62/g;->g(Lhy0/c2;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_d
    iget-object v0, p0, Lci0/a;->x:Ljava/lang/Object;

    check-cast v0, Ld01/f;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Ld01/e;->c(Ld01/f;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_e
    iget-object v0, p0, Lci0/a;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/membership/view/upcycle/UpcycleLandingFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/membership/view/upcycle/UpcycleLandingFragment;->C(Lcom/whoop/membership/view/upcycle/UpcycleLandingFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    iget-object v0, p0, Lci0/a;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/labrador/fragment/LabradorSubmitEligibilityFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/labrador/fragment/LabradorSubmitEligibilityFragment;->y(Lcom/whoop/labrador/fragment/LabradorSubmitEligibilityFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_10
    iget-object v0, p0, Lci0/a;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/labrador/fragment/LabradorRegistrationFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/labrador/fragment/LabradorRegistrationFragment;->y(Lcom/whoop/labrador/fragment/LabradorRegistrationFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_11
    iget-object v0, p0, Lci0/a;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/labrador/fragment/LabradorReadingFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/labrador/fragment/LabradorReadingFragment;->z(Lcom/whoop/labrador/fragment/LabradorReadingFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_12
    iget-object v0, p0, Lci0/a;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/labrador/fragment/LabradorEligibilityFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/labrador/fragment/LabradorEligibilityFragment;->y(Lcom/whoop/labrador/fragment/LabradorEligibilityFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_13
    iget-object v0, p0, Lci0/a;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/labrador/fragment/LabradorDeviceLocationFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/labrador/fragment/LabradorDeviceLocationFragment;->A(Lcom/whoop/labrador/fragment/LabradorDeviceLocationFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_14
    iget-object v0, p0, Lci0/a;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/labrador/fragment/LabradorDetailsFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/labrador/fragment/LabradorDetailsFragment;->L(Lcom/whoop/labrador/fragment/LabradorDetailsFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_15
    iget-object v0, p0, Lci0/a;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/labrador/fragment/LabradorAboutFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/labrador/fragment/LabradorAboutFragment;->z(Lcom/whoop/labrador/fragment/LabradorAboutFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_16
    iget-object v0, p0, Lci0/a;->x:Ljava/lang/Object;

    check-cast v0, Lcr2/c;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcr2/f;->a(Lcr2/c;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_17
    iget-object v0, p0, Lci0/a;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/profile/view/ProfileFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/profile/view/ProfileFragment;->y(Lcom/whoop/profile/view/ProfileFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_18
    iget-object v0, p0, Lci0/a;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/bot/settings/CoachSettingsFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/bot/settings/CoachSettingsFragment;->y(Lcom/whoop/bot/settings/CoachSettingsFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_19
    iget-object v0, p0, Lci0/a;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/helpcenter/view/fragment/HelpCenterFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/helpcenter/view/fragment/HelpCenterFragment;->B(Lcom/whoop/helpcenter/view/fragment/HelpCenterFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1a
    iget-object v0, p0, Lci0/a;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/healthmonitor/view/ComposableHealthReportFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/healthmonitor/view/ComposableHealthReportFragment;->z(Lcom/whoop/healthmonitor/view/ComposableHealthReportFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1b
    iget-object v0, p0, Lci0/a;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/healthmonitor/view/ComposableHealthMonitorFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/healthmonitor/view/ComposableHealthMonitorFragment;->C(Lcom/whoop/healthmonitor/view/ComposableHealthMonitorFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1c
    iget-object v0, p0, Lci0/a;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/amoeba/debug/view/AmoebaDebugFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/amoeba/debug/view/AmoebaDebugFragment;->z(Lcom/whoop/amoeba/debug/view/AmoebaDebugFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

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
