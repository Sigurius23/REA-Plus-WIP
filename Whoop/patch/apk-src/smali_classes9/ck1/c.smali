.class public final synthetic Lck1/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lck1/c;->w:I

    iput-object p1, p0, Lck1/c;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    move-object/from16 v0, p0

    iget v1, v0, Lck1/c;->w:I

    const-string v2, "host"

    const/4 v3, 0x1

    sget-object v4, Ll83/a0;->a:Ll83/a0;

    iget-object v5, v0, Lck1/c;->x:Ljava/lang/Object;

    packed-switch v1, :pswitch_data_0

    check-cast v5, Lcom/whoop/settings/WakeUpAutopopHeightTesterFragment;

    move-object/from16 v1, p1

    check-cast v1, Lcom/whoop/navigation/DrawerPresentation;

    invoke-static {v5, v1}, Lcom/whoop/settings/WakeUpAutopopHeightTesterFragment;->A(Lcom/whoop/settings/WakeUpAutopopHeightTesterFragment;Lcom/whoop/navigation/DrawerPresentation;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_0
    check-cast v5, Lcom/whoop/settings/OnboardingStatusDebugFragment;

    move-object/from16 v1, p1

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v5, v1}, Lcom/whoop/settings/OnboardingStatusDebugFragment;->A(Lcom/whoop/settings/OnboardingStatusDebugFragment;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_1
    check-cast v5, Lca0/b;

    move-object/from16 v1, p1

    check-cast v1, Lca0/a;

    invoke-static {v5, v1}, Lcom/whoop/add/activity/view/AddActivityFragment;->G(Lca0/b;Lca0/a;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_2
    check-cast v5, Lf0/t;

    move-object/from16 v1, p1

    check-cast v1, Lk2/e;

    invoke-static {v5, v1}, Le41/g;->i(Lf0/t;Lk2/e;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_3
    check-cast v5, Lu03/a;

    move-object/from16 v1, p1

    check-cast v1, Ls40/a;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v5}, Lu03/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc20/a;

    iget-object v2, v2, Lc20/a;->e:Lj/d;

    if-eqz v2, :cond_0

    new-instance v1, Lux/e0;

    invoke-direct {v1, v2}, Lux/e0;-><init>(Lj/d;)V

    goto :goto_0

    :cond_0
    new-instance v2, Lux/e0;

    invoke-direct {v2, v1}, Lux/e0;-><init>(Ls40/a;)V

    move-object v1, v2

    :goto_0
    return-object v1

    :pswitch_4
    check-cast v5, Ldq1/d;

    move-object/from16 v1, p1

    check-cast v1, Ltb/a;

    invoke-static {v5, v1}, Ldq1/d;->i(Ldq1/d;Ltb/a;)Ljava/util/List;

    move-result-object v1

    return-object v1

    :pswitch_5
    check-cast v5, Lcom/whoop/ui/onboarding/dayzero/DayZeroSplashDialogFragment;

    move-object/from16 v1, p1

    check-cast v1, Lcom/whoop/navigation/e;

    invoke-static {v5, v1}, Lcom/whoop/ui/onboarding/dayzero/DayZeroSplashDialogFragment;->B(Lcom/whoop/ui/onboarding/dayzero/DayZeroSplashDialogFragment;Lcom/whoop/navigation/e;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_6
    check-cast v5, Ldj0/w$b;

    move-object/from16 v1, p1

    check-cast v1, Lre/a;

    invoke-static {v5, v1}, Ldj0/b;->c(Ldj0/w$b;Lre/a;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_7
    check-cast v5, Ldj0/w$a;

    move-object/from16 v1, p1

    check-cast v1, Lre/a;

    invoke-static {v5, v1}, Ldj0/b;->a(Ldj0/w$a;Lre/a;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_8
    check-cast v5, Lac0/b;

    move-object/from16 v1, p1

    check-cast v1, Lac0/a;

    invoke-static {v5, v1}, Lcom/whoop/advancedlabs/edittestdetails/view/EditTestDetailsFragment;->D(Lac0/b;Lac0/a;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_9
    check-cast v5, Lab0/b;

    move-object/from16 v1, p1

    check-cast v1, Lab0/a;

    invoke-static {v5, v1}, Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment;->z(Lab0/b;Lab0/a;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_a
    check-cast v5, Landroidx/compose/ui/Modifier;

    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/ui/Modifier;

    invoke-static {v5, v1}, Ld80/e;->l(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    return-object v1

    :pswitch_b
    check-cast v5, Ld30/v;

    move-object/from16 v1, p1

    check-cast v1, Lo20/b;

    new-instance v2, Ld30/i1;

    invoke-direct {v2, v1}, Ld30/i1;-><init>(Lo20/b;)V

    invoke-virtual {v5, v2}, Ld30/v;->a(Ld30/j1;)V

    return-object v4

    :pswitch_c
    check-cast v5, Ld20/i;

    move-object/from16 v1, p1

    check-cast v1, Ls40/a;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v5, Ld20/i;->e:Lj/d;

    if-eqz v2, :cond_1

    new-instance v1, Lay/y;

    invoke-direct {v1, v2, v3}, Lay/y;-><init>(Lj/d;I)V

    goto :goto_1

    :cond_1
    new-instance v2, Lay/x;

    invoke-direct {v2, v1, v3}, Lay/x;-><init>(Ls40/a;I)V

    move-object v1, v2

    :goto_1
    return-object v1

    :pswitch_d
    check-cast v5, Ld1/p;

    move-object/from16 v1, p1

    check-cast v1, Lq3/h;

    invoke-virtual {v5, v1}, Ld1/p;->a(Lq3/h;)V

    return-object v4

    :pswitch_e
    check-cast v5, Lcz/n0;

    move-object/from16 v1, p1

    check-cast v1, Ly00/i;

    const-string v2, "brand"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v5, Lcz/n0;->E:La33/d;

    sget-object v3, Ldz/j;->w:[Ldz/j;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v3, Ldz/b;

    sget-object v5, Ldz/a;->x:Ldz/a;

    invoke-direct {v3, v5, v1}, Ldz/b;-><init>(Ldz/a;Ly00/i;)V

    invoke-virtual {v2, v3}, La33/d;->m(Ldz/i;)V

    return-object v4

    :pswitch_f
    check-cast v5, Lcom/stripe/android/customersheet/CustomerSheetActivity;

    move-object/from16 v1, p1

    check-cast v1, Lg1/z3;

    const-string v2, "it"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lg1/z3;->w:Lg1/z3;

    if-ne v1, v2, :cond_7

    sget v1, Lcom/stripe/android/customersheet/CustomerSheetActivity;->z:I

    invoke-virtual {v5}, Lcom/stripe/android/customersheet/CustomerSheetActivity;->p()Lcz/n0;

    move-result-object v1

    iget-object v2, v1, Lcz/n0;->M:Ln53/e;

    iget-object v2, v2, Ln53/e;->y:Ll83/e;

    check-cast v2, Lc93/a;

    invoke-interface {v2}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcz/t0;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    instance-of v4, v2, Lcz/q0;

    if-nez v4, :cond_7

    instance-of v4, v2, Lcz/s0;

    if-nez v4, :cond_7

    instance-of v4, v2, Lcz/r0;

    if-eqz v4, :cond_2

    goto :goto_3

    :cond_2
    instance-of v4, v2, Lcz/p0;

    if-eqz v4, :cond_6

    check-cast v2, Lcz/p0;

    iget-object v4, v2, Lcz/p0;->c:Ljava/lang/String;

    sget-object v5, Ly00/f4;->G:Lt9/c0;

    const-string v5, "us_bank_account"

    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_7

    iget-object v2, v2, Lcz/p0;->u:Lq20/s;

    if-eqz v2, :cond_7

    iget-object v1, v1, Lcz/n0;->L:Lec3/h2;

    :cond_3
    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/util/List;

    check-cast v3, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v3, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcz/t0;

    instance-of v6, v5, Lcz/p0;

    if-eqz v6, :cond_4

    move-object v7, v5

    check-cast v7, Lcz/p0;

    const/16 v22, 0x0

    const v23, 0xdffff

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x1

    invoke-static/range {v7 .. v23}, Lcz/p0;->c(Lcz/p0;Ljava/lang/String;Lo20/b;Ljava/util/List;Ls20/a;Lq20/y;ZZLzy/c;Lzy/b;ZLb30/p3;Lzy/c;ZZLq20/s;I)Lcz/p0;

    move-result-object v5

    :cond_4
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_5
    invoke-virtual {v1, v2, v4}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    const/4 v3, 0x0

    goto :goto_3

    :cond_6
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_7
    :goto_3
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    return-object v1

    :pswitch_10
    check-cast v5, Lcom/whoop/weightlifting/StrengthTrainerDestination;

    move-object/from16 v1, p1

    check-cast v1, Leb/y0;

    invoke-static {v5, v1}, Lcom/whoop/weightlifting/StrengthTrainerDestination$d;->a(Lcom/whoop/weightlifting/StrengthTrainerDestination;Leb/y0;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_11
    check-cast v5, Lcom/whoop/labrador/fragment/LabradorDeviceLocationFragment;

    move-object/from16 v1, p1

    check-cast v1, Lit1/a$f;

    invoke-static {v5, v1}, Lcom/whoop/labrador/fragment/LabradorDeviceLocationFragment;->z(Lcom/whoop/labrador/fragment/LabradorDeviceLocationFragment;Lit1/a$f;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_12
    check-cast v5, Let1/b;

    move-object/from16 v1, p1

    check-cast v1, Let1/a;

    invoke-static {v5, v1}, Lcom/whoop/labrador/fragment/LabradorDetailsFragment;->G(Let1/b;Let1/a;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_13
    check-cast v5, Lat1/a;

    move-object/from16 v1, p1

    check-cast v1, Lbt1/b$c;

    invoke-static {v5, v1}, Lcom/whoop/labrador/fragment/LabradorAboutFragment;->A(Lat1/a;Lbt1/b$c;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_14
    check-cast v5, Lcom/whoop/recommendationtile/domain/f;

    move-object/from16 v1, p1

    check-cast v1, Lcom/whoop/recommendationtile/domain/d;

    invoke-static {v5, v1}, Lcom/whoop/recommendationtile/domain/f;->c(Lcom/whoop/recommendationtile/domain/f;Lcom/whoop/recommendationtile/domain/d;)Lec3/l;

    move-result-object v1

    return-object v1

    :pswitch_15
    check-cast v5, Li2/u0;

    move-object/from16 v1, p1

    check-cast v1, Lk2/c;

    invoke-static {v5, v1}, Lcom/whoop/profile/view/ProfileHeaderKt;->d(Li2/u0;Lk2/c;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_16
    check-cast v5, Lcom/whoop/profile/presentation/reducers/ProfileViewStateReducer;

    move-object/from16 v1, p1

    check-cast v1, Ljb1/b;

    invoke-static {v5, v1}, Lcom/whoop/profile/presentation/reducers/ProfileViewStateReducer;->a(Lcom/whoop/profile/presentation/reducers/ProfileViewStateReducer;Ljb1/b;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_17
    check-cast v5, Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;

    move-object/from16 v1, p1

    check-cast v1, Ltb/a;

    invoke-static {v5, v1}, Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;->e(Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;Ltb/a;)Lcom/whoop/service/network/model/DefaultImages;

    move-result-object v1

    return-object v1

    :pswitch_18
    check-cast v5, Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao_Impl;

    move-object/from16 v1, p1

    check-cast v1, Ltb/a;

    invoke-static {v5, v1}, Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao_Impl;->b(Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao_Impl;Ltb/a;)Ljava/util/List;

    move-result-object v1

    return-object v1

    :pswitch_19
    check-cast v5, Lcom/whoop/bot/settings/CoachSettingsFragment;

    move-object/from16 v1, p1

    check-cast v1, Lcom/whoop/bot/settings/CoachSettingsViewEvent;

    invoke-static {v5, v1}, Lcom/whoop/bot/settings/CoachSettingsFragment;->z(Lcom/whoop/bot/settings/CoachSettingsFragment;Lcom/whoop/bot/settings/CoachSettingsViewEvent;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_1a
    check-cast v5, Lcn0/a;

    move-object/from16 v1, p1

    check-cast v1, Lkb1/e;

    invoke-static {v5, v1}, Lcn0/b;->a(Lcn0/a;Lkb1/e;)Lqy0/a;

    move-result-object v1

    return-object v1

    :pswitch_1b
    check-cast v5, Lcom/whoop/healthmonitor/view/ComposableHealthReportFragment;

    move-object/from16 v1, p1

    check-cast v1, Ljava/io/File;

    invoke-static {v5, v1}, Lcom/whoop/healthmonitor/view/ComposableHealthReportFragment;->B(Lcom/whoop/healthmonitor/view/ComposableHealthReportFragment;Ljava/io/File;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_1c
    check-cast v5, Lzj1/b;

    move-object/from16 v1, p1

    check-cast v1, Lzj1/a;

    invoke-static {v5, v1}, Lcom/whoop/healthmonitor/view/ComposableHealthMonitorFragment;->y(Lzj1/b;Lzj1/a;)Ll83/a0;

    move-result-object v1

    return-object v1

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
