.class public final synthetic Lnr0/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lnr0/e;->w:I

    iput-object p1, p0, Lnr0/e;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    iget v0, p0, Lnr0/e;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lnr0/e;->x:Ljava/lang/Object;

    check-cast v0, Ln90/d$a;

    invoke-static {v0}, Lq80/i;->c(Ln90/d$a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lnr0/e;->x:Ljava/lang/Object;

    check-cast v0, Lec3/f2;

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lnr0/e;->x:Ljava/lang/Object;

    check-cast v0, Lq31/f;

    invoke-static {v0}, Lq31/d;->b(Lq31/f;)Lp1/a1;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lnr0/e;->x:Ljava/lang/Object;

    check-cast v0, Lpl0/d;

    invoke-static {v0}, Lpl0/d;->a(Lpl0/d;)Ll83/k;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, p0, Lnr0/e;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/settings/regulatorylabels/SettingsRegulatoryLabelsFragment;

    invoke-static {v0}, Lcom/whoop/settings/regulatorylabels/SettingsRegulatoryLabelsFragment;->z(Lcom/whoop/settings/regulatorylabels/SettingsRegulatoryLabelsFragment;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_4
    iget-object v0, p0, Lnr0/e;->x:Ljava/lang/Object;

    check-cast v0, Lp6/l;

    iget-object v0, v0, Lp6/l;->j:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_5
    iget-object v0, p0, Lnr0/e;->x:Ljava/lang/Object;

    check-cast v0, Landroidx/compose/foundation/lazy/layout/b;

    iget-object v0, v0, Landroidx/compose/foundation/lazy/layout/b;->j:Lp0/v;

    if-eqz v0, :cond_0

    invoke-static {v0}, La3/g;->h(La3/r;)V

    :cond_0
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_6
    iget-object v0, p0, Lnr0/e;->x:Ljava/lang/Object;

    check-cast v0, Loy2/e;

    invoke-static {v0}, Loy2/e;->j(Loy2/e;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_7
    iget-object v0, p0, Lnr0/e;->x:Ljava/lang/Object;

    check-cast v0, Lf0/r1;

    iget-object v0, v0, Lf0/r1;->a:Lp1/h1;

    invoke-virtual {v0}, Lp1/h1;->x()I

    move-result v0

    if-lez v0, :cond_1

    const/16 v0, 0x8

    :goto_0
    int-to-float v0, v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    new-instance v1, Ly3/f;

    invoke-direct {v1, v0}, Ly3/f;-><init>(F)V

    return-object v1

    :pswitch_8
    iget-object v0, p0, Lnr0/e;->x:Ljava/lang/Object;

    check-cast v0, Lox0/e;

    invoke-static {v0}, Lox0/c;->f(Lox0/e;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_9
    iget-object v0, p0, Lnr0/e;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/debug/battery/BatteryDebugFragment;

    invoke-static {v0}, Lcom/whoop/debug/battery/BatteryDebugFragment;->z(Lcom/whoop/debug/battery/BatteryDebugFragment;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_a
    iget-object v0, p0, Lnr0/e;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/core/details/view/CoreDetailsFragment;

    invoke-static {v0}, Lcom/whoop/core/details/view/CoreDetailsFragment;->B(Lcom/whoop/core/details/view/CoreDetailsFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_b
    iget-object v0, p0, Lnr0/e;->x:Ljava/lang/Object;

    check-cast v0, Landroidx/compose/ui/platform/ComposeView;

    invoke-static {v0}, Los0/c;->b(Landroidx/compose/ui/platform/ComposeView;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_c
    iget-object v0, p0, Lnr0/e;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/shepherd/fragment/ShepherdToggleSettingsFragment;

    invoke-static {v0}, Lcom/whoop/shepherd/fragment/ShepherdToggleSettingsFragment;->B(Lcom/whoop/shepherd/fragment/ShepherdToggleSettingsFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_d
    iget-object v0, p0, Lnr0/e;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/shepherd/fragment/ShepherdSubmitTermsOfUseFragment;

    invoke-static {v0}, Lcom/whoop/shepherd/fragment/ShepherdSubmitTermsOfUseFragment;->y(Lcom/whoop/shepherd/fragment/ShepherdSubmitTermsOfUseFragment;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_e
    iget-object v0, p0, Lnr0/e;->x:Ljava/lang/Object;

    check-cast v0, Lfe2/a;

    invoke-static {v0}, Lcom/whoop/shepherd/fragment/ShepherdSubmitTermsOfUseFragment;->A(Lfe2/a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_f
    iget-object v0, p0, Lnr0/e;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/shepherd/fragment/ShepherdNotificationHistoryFragment;

    invoke-static {v0}, Lcom/whoop/shepherd/fragment/ShepherdNotificationHistoryFragment;->y(Lcom/whoop/shepherd/fragment/ShepherdNotificationHistoryFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_10
    iget-object v0, p0, Lnr0/e;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/shepherd/fragment/ShepherdAboutFragment;

    invoke-static {v0}, Lcom/whoop/shepherd/fragment/ShepherdAboutFragment;->y(Lcom/whoop/shepherd/fragment/ShepherdAboutFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_11
    iget-object v0, p0, Lnr0/e;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/realtime/presentation/StartActivityActivity;

    invoke-static {v0}, Lcom/whoop/realtime/presentation/StartActivityActivity;->a0(Lcom/whoop/realtime/presentation/StartActivityActivity;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_12
    iget-object v0, p0, Lnr0/e;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/realtime/presentation/RealTimeRecordActivity;

    invoke-static {v0}, Lcom/whoop/realtime/presentation/RealTimeRecordActivity;->I(Lcom/whoop/realtime/presentation/RealTimeRecordActivity;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_13
    iget-object v0, p0, Lnr0/e;->x:Ljava/lang/Object;

    check-cast v0, Lo23/d;

    return-object v0

    :pswitch_14
    iget-object v0, p0, Lnr0/e;->x:Ljava/lang/Object;

    check-cast v0, Lo11/m$c;

    invoke-static {v0}, Lo11/m$c;->z(Lo11/m$c;)Lkd1/o$c;

    move-result-object v0

    return-object v0

    :pswitch_15
    iget-object v0, p0, Lnr0/e;->x:Ljava/lang/Object;

    check-cast v0, Lo11/m;

    invoke-static {v0}, Lo11/m;->b(Lo11/m;)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0

    :pswitch_16
    iget-object v0, p0, Lnr0/e;->x:Ljava/lang/Object;

    check-cast v0, Lo11/h$b;

    invoke-static {v0}, Lo11/h$b;->a(Lo11/h$b;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_17
    iget-object v0, p0, Lnr0/e;->x:Ljava/lang/Object;

    check-cast v0, Lny/g;

    iget-object v0, v0, Lny/g;->c:Lb30/m;

    iget-object v1, v0, Lb30/m;->x:Ljava/lang/Object;

    check-cast v1, Lbc3/c0;

    new-instance v2, Lkd/f;

    const/16 v3, 0xf

    const/4 v4, 0x0

    invoke-direct {v2, v0, v4, v3}, Lkd/f;-><init>(Ljava/lang/Object;Lq83/d;I)V

    const/4 v0, 0x3

    invoke-static {v1, v4, v4, v2, v0}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_18
    iget-object v0, p0, Lnr0/e;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/whattoexpect/view/WhatToExpectFragment;

    invoke-static {v0}, Lcom/whoop/whattoexpect/view/WhatToExpectFragment;->B(Lcom/whoop/whattoexpect/view/WhatToExpectFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_19
    iget-object v0, p0, Lnr0/e;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/memberdataexport/ui/SubmissionCompleteFragment;

    invoke-static {v0}, Lcom/whoop/memberdataexport/ui/SubmissionCompleteFragment;->H(Lcom/whoop/memberdataexport/ui/SubmissionCompleteFragment;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1a
    iget-object v0, p0, Lnr0/e;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/memberdataexport/ui/MemberDataExportFragment;

    invoke-static {v0}, Lcom/whoop/memberdataexport/ui/MemberDataExportFragment;->z(Lcom/whoop/memberdataexport/ui/MemberDataExportFragment;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1b
    iget-object v0, p0, Lnr0/e;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/user/journey/yearinreviewraf/YirRafFragment;

    invoke-static {v0}, Lcom/whoop/user/journey/yearinreviewraf/YirRafFragment;->A(Lcom/whoop/user/journey/yearinreviewraf/YirRafFragment;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1c
    iget-object v0, p0, Lnr0/e;->x:Ljava/lang/Object;

    check-cast v0, Lnr0/g;

    invoke-static {v0}, Lnr0/f;->m(Lnr0/g;)Luf3/a;

    move-result-object v0

    return-object v0

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
