.class public final synthetic Lq80/h;
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

    iput p2, p0, Lq80/h;->w:I

    iput-object p1, p0, Lq80/h;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    iget v0, p0, Lq80/h;->w:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    iget-object v4, p0, Lq80/h;->x:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v4, Lcom/whoop/advancedlabs/actionplan/view/ActionPlanFragment;

    invoke-static {v4}, Lcom/whoop/advancedlabs/actionplan/view/ActionPlanFragment;->z(Lcom/whoop/advancedlabs/actionplan/view/ActionPlanFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_0
    check-cast v4, Ls40/t0;

    new-instance v0, Ln83/f;

    invoke-direct {v0}, Ln83/f;-><init>()V

    iget-object v1, v4, Ls40/t0;->w:Lyx/b;

    iget-object v1, v1, Lyx/b;->N:Ljava/lang/String;

    if-eqz v1, :cond_0

    const-string v3, "Referer"

    invoke-virtual {v0, v3, v1}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    invoke-virtual {v0}, Ln83/f;->b()Ln83/f;

    move-result-object v0

    new-instance v1, Lyy/i0;

    invoke-direct {v1}, Lyy/i0;-><init>()V

    sget-object v3, Lux/j0;->c:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lyy/i0;->a(Lqy/c;)Ljava/util/Map;

    move-result-object v1

    invoke-static {v1, v0}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v0

    return-object v0

    :pswitch_1
    check-cast v4, Ls40/u0;

    sget v0, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->E:I

    iput-boolean v1, v4, Ls40/u0;->g:Z

    return-object v3

    :pswitch_2
    check-cast v4, La20/h;

    iget-object v0, v4, La20/h;->b:Ljava/lang/Object;

    check-cast v0, Landroid/content/Context;

    const-string v1, "context"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lux/y;->y:Lux/y;

    if-nez v1, :cond_3

    new-instance v1, Lux/x;

    invoke-direct {v1, v0}, Lux/x;-><init>(Landroid/content/Context;)V

    const-string v0, "key_publishable_key"

    iget-object v1, v1, Lux/x;->a:Landroid/content/SharedPreferences;

    invoke-interface {v1, v0, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    new-instance v3, Lux/y;

    const-string v4, "key_account_id"

    invoke-interface {v1, v4, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v3, v0, v1}, Lux/y;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    move-object v2, v3

    :cond_1
    if-eqz v2, :cond_2

    sput-object v2, Lux/y;->y:Lux/y;

    move-object v1, v2

    goto :goto_0

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "PaymentConfiguration was not initialized. Call PaymentConfiguration.init()."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_0
    iget-object v0, v1, Lux/y;->w:Ljava/lang/String;

    return-object v0

    :pswitch_3
    check-cast v4, Ls23/d;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-ge v0, v1, :cond_4

    new-instance v0, Landroid/media/MediaRecorder;

    invoke-direct {v0}, Landroid/media/MediaRecorder;-><init>()V

    goto :goto_1

    :cond_4
    new-instance v0, Landroid/media/MediaRecorder;

    iget-object v0, v4, Ls23/d;->a:Landroid/content/Context;

    invoke-static {v0}, Lh3/h;->a(Landroid/content/Context;)Landroid/media/MediaRecorder;

    move-result-object v0

    :goto_1
    return-object v0

    :pswitch_4
    check-cast v4, Ls20/a;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iget-object v1, v4, Ls20/a;->i:Lh20/l1;

    iget-boolean v1, v1, Lh20/l1;->E:Z

    if-eqz v1, :cond_d

    iget-object v1, v4, Ls20/a;->e:Lh20/i1;

    if-eqz v1, :cond_d

    iget-object v2, v1, Lh20/i1;->w:Lh20/x0;

    iget-object v3, v1, Lh20/i1;->y:Ljava/lang/String;

    if-eqz v3, :cond_5

    sget-object v4, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getName$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v4

    invoke-interface {v0, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    iget-object v3, v1, Lh20/i1;->x:Ljava/lang/String;

    if-eqz v3, :cond_6

    sget-object v4, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getEmail$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v4

    invoke-interface {v0, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_6
    iget-object v1, v1, Lh20/i1;->z:Ljava/lang/String;

    if-eqz v1, :cond_7

    sget-object v3, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getPhone$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v3

    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_7
    if-eqz v2, :cond_8

    iget-object v1, v2, Lh20/x0;->y:Ljava/lang/String;

    if-eqz v1, :cond_8

    sget-object v3, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getLine1$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v3

    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_8
    if-eqz v2, :cond_9

    iget-object v1, v2, Lh20/x0;->z:Ljava/lang/String;

    if-eqz v1, :cond_9

    sget-object v3, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getLine2$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v3

    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_9
    if-eqz v2, :cond_a

    iget-object v1, v2, Lh20/x0;->w:Ljava/lang/String;

    if-eqz v1, :cond_a

    sget-object v3, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getCity$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v3

    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_a
    if-eqz v2, :cond_b

    iget-object v1, v2, Lh20/x0;->F:Ljava/lang/String;

    if-eqz v1, :cond_b

    sget-object v3, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getState$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v3

    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_b
    if-eqz v2, :cond_c

    iget-object v1, v2, Lh20/x0;->E:Ljava/lang/String;

    if-eqz v1, :cond_c

    sget-object v3, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getPostalCode$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v3

    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_c
    if-eqz v2, :cond_d

    iget-object v1, v2, Lh20/x0;->x:Ljava/lang/String;

    if-eqz v1, :cond_d

    sget-object v2, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getCountry$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v2

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_d
    invoke-static {v0}, Lm83/g0;->j0(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0

    :pswitch_5
    check-cast v4, Ls10/e;

    iget-object v0, v4, Ls10/e;->b:Ls10/f;

    iget-object v0, v0, Ls10/f;->b:Lec3/r1;

    iget-object v0, v0, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq20/y;

    instance-of v1, v0, Lq20/i;

    if-eqz v1, :cond_e

    new-instance v2, Lh20/b0;

    check-cast v0, Lq20/i;

    invoke-direct {v2, v0}, Lh20/b0;-><init>(Lq20/i;)V

    goto :goto_2

    :cond_e
    instance-of v1, v0, Lq20/g;

    if-eqz v1, :cond_f

    new-instance v2, Lh20/a0;

    check-cast v0, Lq20/g;

    invoke-direct {v2, v0}, Lh20/a0;-><init>(Lq20/g;)V

    goto :goto_2

    :cond_f
    instance-of v1, v0, Lq20/t;

    if-eqz v1, :cond_10

    new-instance v2, Lh20/c0;

    check-cast v0, Lq20/t;

    invoke-direct {v2, v0}, Lh20/c0;-><init>(Lq20/t;)V

    :cond_10
    :goto_2
    return-object v2

    :pswitch_6
    check-cast v4, Ls0/c;

    iget-object v0, v4, Ls0/c;->m0:Lkotlin/jvm/functions/Function1;

    iget-boolean v2, v4, Ls0/c;->l0:Z

    xor-int/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v3

    :pswitch_7
    check-cast v4, Lcom/whoop/debug/jsonplayground/JsonPlaygroundResultFragment;

    invoke-static {v4}, Lcom/whoop/debug/jsonplayground/JsonPlaygroundResultFragment;->y(Lcom/whoop/debug/jsonplayground/JsonPlaygroundResultFragment;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_8
    check-cast v4, Lcom/whoop/debug/jsonplayground/JsonPlaygroundFragment;

    invoke-static {v4}, Lcom/whoop/debug/jsonplayground/JsonPlaygroundFragment;->A(Lcom/whoop/debug/jsonplayground/JsonPlaygroundFragment;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_9
    check-cast v4, Lcom/whoop/contentsearch/view/ContentSearchFragment;

    invoke-static {v4}, Lcom/whoop/contentsearch/view/ContentSearchFragment;->y(Lcom/whoop/contentsearch/view/ContentSearchFragment;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_a
    check-cast v4, Lcom/whoop/journal/model/CurrentCycle;

    invoke-static {v4}, Lrr1/b;->d(Lcom/whoop/journal/model/CurrentCycle;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_b
    check-cast v4, Lrq0/o;

    invoke-static {v4}, Lrq0/o;->F(Lrq0/o;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_c
    check-cast v4, Lcom/whoop/community/presentation/teams/TeamCreateActivity;

    invoke-static {v4}, Lcom/whoop/community/presentation/teams/TeamCreateActivity;->B(Lcom/whoop/community/presentation/teams/TeamCreateActivity;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_d
    check-cast v4, Lrh/m;

    new-instance v0, Lro/i;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lro/i;-><init>(I)V

    iget-object v1, v4, Lrh/m;->a:Landroid/content/Context;

    const-wide v2, 0x3fc999999999999aL    # 0.2

    :try_start_0
    const-class v4, Landroid/app/ActivityManager;

    invoke-static {v1, v4}, Ls4/c;->getSystemService(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast v4, Landroid/app/ActivityManager;

    invoke-virtual {v4}, Landroid/app/ActivityManager;->isLowRamDevice()Z

    move-result v4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v4, :cond_11

    const-wide v2, 0x3fc3333333333333L    # 0.15

    :catch_0
    :cond_11
    invoke-virtual {v0, v1, v2, v3}, Lro/i;->w(Landroid/content/Context;D)V

    invoke-virtual {v0}, Lro/i;->p()Lai/f;

    move-result-object v0

    return-object v0

    :pswitch_e
    check-cast v4, Ll83/k;

    invoke-static {v4}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :pswitch_f
    check-cast v4, Lcom/whoop/education/view/EducationFragment;

    invoke-static {v4}, Lcom/whoop/education/view/EducationFragment;->z(Lcom/whoop/education/view/EducationFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_10
    check-cast v4, Ljc/v;

    iget-object v0, v4, Ljc/v;->c:Landroidx/work/impl/WorkDatabase;

    const-string v1, "getWorkDatabase(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lr5/b;

    const/4 v2, 0x6

    invoke-direct {v1, v2, v0, v4}, Lr5/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Landroidx/room/z0;->runInTransaction(Ljava/lang/Runnable;)V

    return-object v3

    :pswitch_11
    check-cast v4, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;

    invoke-static {v4}, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->f(Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_12
    check-cast v4, Lr20/o;

    iget-object v0, v4, Lr20/o;->w:Lb30/q0;

    sget-object v1, Lb30/t5;->b:Lb30/t5;

    invoke-virtual {v0, v1}, Lb30/q0;->b(Lse/b;)V

    return-object v3

    :pswitch_13
    check-cast v4, Lr20/d;

    invoke-virtual {v4}, Lr20/d;->c()V

    return-object v3

    :pswitch_14
    check-cast v4, Lh2/c;

    return-object v4

    :pswitch_15
    check-cast v4, Lcom/whoop/debug/experiments/ExperimentsDebugFragment;

    invoke-static {v4}, Lcom/whoop/debug/experiments/ExperimentsDebugFragment;->z(Lcom/whoop/debug/experiments/ExperimentsDebugFragment;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_16
    check-cast v4, Lqm2/f;

    invoke-static {v4}, Lqm2/f;->z(Lqm2/f;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_17
    check-cast v4, Lcom/whoop/training/locationsettings/view/LocationSettingsFragment;

    invoke-static {v4}, Lcom/whoop/training/locationsettings/view/LocationSettingsFragment;->y(Lcom/whoop/training/locationsettings/view/LocationSettingsFragment;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_18
    check-cast v4, Lcom/whoop/advancedlabsmanagement/view/AdvancedLabsManagementFragment;

    invoke-static {v4}, Lcom/whoop/advancedlabsmanagement/view/AdvancedLabsManagementFragment;->y(Lcom/whoop/advancedlabsmanagement/view/AdvancedLabsManagementFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_19
    check-cast v4, Lcom/whoop/advancedlabs/testhistory/view/TestHistoryFragment;

    invoke-static {v4}, Lcom/whoop/advancedlabs/testhistory/view/TestHistoryFragment;->z(Lcom/whoop/advancedlabs/testhistory/view/TestHistoryFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_1a
    check-cast v4, Lqa2/b;

    invoke-static {v4}, Lqa2/b;->z(Lqa2/b;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_1b
    check-cast v4, Lq81/b;

    invoke-static {v4}, Lq81/a;->a(Lq81/b;)Lp1/c1;

    move-result-object v0

    return-object v0

    :pswitch_1c
    check-cast v4, Lq80/k;

    invoke-static {v4}, Lq80/i;->b(Lq80/k;)Ll83/a0;

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
