.class public final synthetic Lq11/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lq11/c;->w:I

    iput-object p2, p0, Lq11/c;->x:Ljava/lang/Object;

    iput-object p3, p0, Lq11/c;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    .line 2
    iput p3, p0, Lq11/c;->w:I

    iput-object p1, p0, Lq11/c;->y:Ljava/lang/Object;

    iput-object p2, p0, Lq11/c;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 45

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    iget v2, v1, Lq11/c;->w:I

    const/4 v3, 0x1

    const-string v4, "_connection"

    const/4 v5, 0x0

    sget-object v6, Ll83/a0;->a:Ll83/a0;

    iget-object v7, v1, Lq11/c;->y:Ljava/lang/Object;

    iget-object v8, v1, Lq11/c;->x:Ljava/lang/Object;

    packed-switch v2, :pswitch_data_0

    check-cast v8, Lkotlin/jvm/functions/Function1;

    check-cast v7, Lqc0/c$c;

    check-cast v0, Lc31/c;

    invoke-static {v8, v7, v0}, Lsc0/g;->i(Lkotlin/jvm/functions/Function1;Lqc0/c$c;Lc31/c;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    check-cast v8, Lpa0/a;

    check-cast v7, Lcom/whoop/advancedlabs/actionplan/view/ActionPlanFragment;

    check-cast v0, Lqa0/a;

    invoke-static {v8, v7, v0}, Lcom/whoop/advancedlabs/actionplan/view/ActionPlanFragment;->y(Lpa0/a;Lcom/whoop/advancedlabs/actionplan/view/ActionPlanFragment;Lqa0/a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    check-cast v8, Lcom/stripe/android/view/CountryTextInputLayout;

    check-cast v7, Ljava/lang/String;

    check-cast v0, Lcom/stripe/android/core/model/Country;

    sget-object v2, Lcom/stripe/android/view/CountryTextInputLayout;->k1:[Lj93/z;

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/stripe/android/core/model/Country;->getCode()Lcom/stripe/android/core/model/CountryCode;

    move-result-object v4

    goto :goto_0

    :cond_0
    move-object v4, v2

    :goto_0
    invoke-virtual {v8, v4}, Lcom/stripe/android/view/CountryTextInputLayout;->setSelectedCountryCode$payments_core_release(Lcom/stripe/android/core/model/CountryCode;)V

    if-eqz v0, :cond_1

    invoke-virtual {v8, v2}, Lcom/google/android/material/textfield/TextInputLayout;->setError(Ljava/lang/CharSequence;)V

    invoke-virtual {v8, v5}, Lcom/google/android/material/textfield/TextInputLayout;->setErrorEnabled(Z)V

    goto :goto_1

    :cond_1
    invoke-virtual {v8, v7}, Lcom/google/android/material/textfield/TextInputLayout;->setError(Ljava/lang/CharSequence;)V

    invoke-virtual {v8, v3}, Lcom/google/android/material/textfield/TextInputLayout;->setErrorEnabled(Z)V

    :goto_1
    return-object v6

    :pswitch_2
    check-cast v8, Landroid/content/Context;

    check-cast v7, Lcom/stripe/android/view/CountryTextInputLayout;

    check-cast v0, Landroid/view/ViewGroup;

    sget-object v2, Lcom/stripe/android/view/CountryTextInputLayout;->k1:[Lj93/z;

    const-string v2, "it"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v8}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    iget v3, v7, Lcom/stripe/android/view/CountryTextInputLayout;->e1:I

    invoke-virtual {v2, v3, v0, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    const-string v2, "null cannot be cast to non-null type android.widget.TextView"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/widget/TextView;

    return-object v0

    :pswitch_3
    check-cast v8, Lkotlin/jvm/functions/Function1;

    check-cast v7, Lq32/d$b;

    invoke-static {v8, v7, v0}, Ls32/c;->g(Lkotlin/jvm/functions/Function1;Lq32/d$b;Ljava/lang/Object;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_4
    check-cast v7, Ls31/e;

    check-cast v8, Lkotlin/jvm/functions/Function1;

    check-cast v0, Landroidx/compose/ui/Modifier;

    invoke-static {v7, v8, v0}, Ls31/c;->b(Ls31/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    return-object v0

    :pswitch_5
    check-cast v8, Lt0/i;

    check-cast v7, Li2/t;

    check-cast v0, Lf2/d;

    invoke-static {v8, v7, v0}, Lrz0/e;->i(Lt0/i;Li2/t;Lf2/d;)Lf2/g;

    move-result-object v0

    return-object v0

    :pswitch_6
    check-cast v8, Landroidx/lifecycle/g0;

    check-cast v7, Lp1/c1;

    check-cast v0, Lp1/i0;

    invoke-static {v8, v7, v0}, Lry2/f;->e(Landroidx/lifecycle/g0;Lp1/c1;Lp1/i0;)Lp1/h0;

    move-result-object v0

    return-object v0

    :pswitch_7
    check-cast v8, Lbc3/c0;

    check-cast v7, Ldp0/g;

    invoke-static {v8, v7, v0}, Lrs2/c;->m(Lbc3/c0;Ldp0/g;Ljava/lang/Object;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_8
    check-cast v8, Lrq0/t0;

    check-cast v7, Leq0/x1;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v8, v7, v0}, Lrq0/t0;->P(Lrq0/t0;Leq0/x1;I)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_9
    check-cast v8, Lkotlin/jvm/functions/Function1;

    check-cast v7, Lrp2/b;

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-static {v8, v7, v0}, Lrp2/d;->b(Lkotlin/jvm/functions/Function1;Lrp2/b;Z)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_a
    check-cast v8, Lrk2/d;

    check-cast v7, Lrk2/e;

    check-cast v0, Ltb/a;

    invoke-static {v8, v7, v0}, Lrk2/d;->d(Lrk2/d;Lrk2/e;Ltb/a;)Ljava/lang/Long;

    move-result-object v0

    return-object v0

    :pswitch_b
    check-cast v8, Lrf2/c;

    check-cast v7, Lsf2/a;

    check-cast v0, Ltb/a;

    invoke-static {v8, v7, v0}, Lrf2/c;->n(Lrf2/c;Lsf2/a;Ltb/a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_c
    check-cast v8, Lrf/l;

    check-cast v7, Lud3/x0;

    check-cast v0, Ljava/lang/Throwable;

    if-eqz v0, :cond_2

    invoke-virtual {v8}, Lrf/l;->a()V

    :cond_2
    iget-object v0, v7, Lud3/x0;->G:Lud3/a1;

    invoke-virtual {v0}, Lud3/a1;->close()V

    return-object v6

    :pswitch_d
    check-cast v7, Lr71/c;

    check-cast v8, Lkotlin/jvm/functions/Function1;

    check-cast v0, Ln0/q;

    invoke-static {v7, v8, v0}, Lr71/b;->b(Lr71/c;Lkotlin/jvm/functions/Function1;Ln0/q;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_e
    check-cast v8, Lqx0/h$c;

    check-cast v7, Lqx0/i;

    check-cast v0, Ln0/q;

    invoke-static {v8, v7, v0}, Lqx0/g;->g(Lqx0/h$c;Lqx0/i;Ln0/q;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_f
    check-cast v7, Lpu2/a;

    check-cast v8, Lkotlin/jvm/functions/Function1;

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-static {v7, v8, v0}, Lqu2/h;->F(Lpu2/a;Lkotlin/jvm/functions/Function1;Z)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_10
    check-cast v8, Lkotlin/jvm/functions/Function1;

    check-cast v7, Lqt2/r;

    invoke-static {v8, v7, v0}, Lqt2/s;->d(Lkotlin/jvm/functions/Function1;Lqt2/r;Ljava/lang/Object;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_11
    check-cast v8, Ljava/util/List;

    check-cast v7, Lc93/a;

    check-cast v0, Ln0/q;

    invoke-static {v8, v7, v0}, Lqs1/a;->m(Ljava/util/List;Lc93/a;Ln0/q;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_12
    check-cast v8, Lkotlin/jvm/functions/Function1;

    check-cast v7, Lcom/whoop/domain/model/teams/share/SelectTeam;

    check-cast v0, Landroid/view/View;

    invoke-static {v8, v7, v0}, Lqq0/c;->a(Lkotlin/jvm/functions/Function1;Lcom/whoop/domain/model/teams/share/SelectTeam;Landroid/view/View;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_13
    check-cast v8, Lkotlin/jvm/functions/Function1;

    check-cast v7, Lnh1/d;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v8, v7, v0}, Lqh1/c;->a(Lkotlin/jvm/functions/Function1;Lnh1/d;I)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_14
    check-cast v7, Log0/c$d;

    check-cast v8, Lkotlin/jvm/functions/Function1;

    check-cast v0, Ln0/q;

    invoke-static {v7, v8, v0}, Lqg0/d;->g(Log0/c$d;Lkotlin/jvm/functions/Function1;Ln0/q;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_15
    check-cast v7, Loe0/e$c;

    check-cast v8, Lkotlin/jvm/functions/Function1;

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-static {v7, v8, v0}, Lqe0/c;->f(Loe0/e$c;Lkotlin/jvm/functions/Function1;Z)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_16
    check-cast v8, Ljava/lang/String;

    check-cast v7, Lqc/u;

    check-cast v0, Ltb/a;

    const-string v2, "getValue(...)"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)"

    invoke-interface {v0, v4}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v4

    :try_start_0
    invoke-interface {v4, v3, v8}, Ltb/c;->L(ILjava/lang/String;)V

    new-instance v6, La0/g;

    invoke-direct {v6, v5}, La0/f1;-><init>(I)V

    new-instance v8, La0/g;

    invoke-direct {v8, v5}, La0/f1;-><init>(I)V

    :cond_3
    :goto_2
    invoke-interface {v4}, Ltb/c;->e1()Z

    move-result v9

    if-eqz v9, :cond_5

    invoke-interface {v4, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v6, v9}, La0/f1;->containsKey(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_4

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v6, v9, v10}, La0/f1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    :catchall_0
    move-exception v0

    goto/16 :goto_9

    :cond_4
    :goto_3
    invoke-interface {v4, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, La0/f1;->containsKey(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_3

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v8, v9, v10}, La0/f1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_5
    invoke-interface {v4}, Ltb/c;->reset()V

    invoke-virtual {v7, v0, v6}, Lqc/u;->b(Ltb/a;La0/g;)V

    invoke-virtual {v7, v0, v8}, Lqc/u;->a(Ltb/a;La0/g;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :goto_4
    invoke-interface {v4}, Ltb/c;->e1()Z

    move-result v7

    if-eqz v7, :cond_a

    invoke-interface {v4, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v10

    invoke-interface {v4, v3}, Ltb/c;->getLong(I)J

    move-result-wide v11

    long-to-int v7, v11

    invoke-static {v7}, Lj93/l0;->M(I)Lic/m0;

    move-result-object v11

    const/4 v7, 0x2

    invoke-interface {v4, v7}, Ltb/c;->getBlob(I)[B

    move-result-object v7

    sget-object v9, Lic/g;->b:Lic/g;

    invoke-static {v7}, Lpf/c;->t([B)Lic/g;

    move-result-object v12

    const/4 v7, 0x3

    invoke-interface {v4, v7}, Ltb/c;->getLong(I)J

    move-result-wide v13

    long-to-int v7, v13

    const/4 v9, 0x4

    invoke-interface {v4, v9}, Ltb/c;->getLong(I)J

    move-result-wide v13

    long-to-int v9, v13

    const/16 v13, 0xe

    invoke-interface {v4, v13}, Ltb/c;->getLong(I)J

    move-result-wide v13

    const/16 v15, 0xf

    invoke-interface {v4, v15}, Ltb/c;->getLong(I)J

    move-result-wide v15

    const/16 v3, 0x10

    invoke-interface {v4, v3}, Ltb/c;->getLong(I)J

    move-result-wide v17

    const/16 v3, 0x11

    move-object/from16 p1, v6

    invoke-interface {v4, v3}, Ltb/c;->getLong(I)J

    move-result-wide v5

    long-to-int v3, v5

    invoke-static {v3}, Lj93/l0;->J(I)Lic/a;

    move-result-object v21

    const/16 v3, 0x12

    invoke-interface {v4, v3}, Ltb/c;->getLong(I)J

    move-result-wide v22

    const/16 v3, 0x13

    invoke-interface {v4, v3}, Ltb/c;->getLong(I)J

    move-result-wide v24

    const/16 v3, 0x14

    invoke-interface {v4, v3}, Ltb/c;->getLong(I)J

    move-result-wide v5

    long-to-int v3, v5

    const/16 v5, 0x15

    invoke-interface {v4, v5}, Ltb/c;->getLong(I)J

    move-result-wide v28

    const/16 v5, 0x16

    invoke-interface {v4, v5}, Ltb/c;->getLong(I)J

    move-result-wide v5

    long-to-int v5, v5

    const/4 v6, 0x5

    move/from16 v30, v5

    invoke-interface {v4, v6}, Ltb/c;->getLong(I)J

    move-result-wide v5

    long-to-int v5, v5

    invoke-static {v5}, Lj93/l0;->K(I)Lic/x;

    move-result-object v35

    const/4 v5, 0x6

    invoke-interface {v4, v5}, Ltb/c;->getBlob(I)[B

    move-result-object v5

    invoke-static {v5}, Lj93/l0;->g0([B)Lrc/e;

    move-result-object v34

    const/4 v5, 0x7

    invoke-interface {v4, v5}, Ltb/c;->getLong(I)J

    move-result-wide v5

    long-to-int v5, v5

    if-eqz v5, :cond_6

    const/16 v36, 0x1

    goto :goto_5

    :cond_6
    const/16 v36, 0x0

    :goto_5
    const/16 v5, 0x8

    invoke-interface {v4, v5}, Ltb/c;->getLong(I)J

    move-result-wide v5

    long-to-int v5, v5

    if-eqz v5, :cond_7

    const/16 v37, 0x1

    goto :goto_6

    :cond_7
    const/16 v37, 0x0

    :goto_6
    const/16 v5, 0x9

    invoke-interface {v4, v5}, Ltb/c;->getLong(I)J

    move-result-wide v5

    long-to-int v5, v5

    if-eqz v5, :cond_8

    const/16 v38, 0x1

    goto :goto_7

    :cond_8
    const/16 v38, 0x0

    :goto_7
    const/16 v5, 0xa

    invoke-interface {v4, v5}, Ltb/c;->getLong(I)J

    move-result-wide v5

    long-to-int v5, v5

    if-eqz v5, :cond_9

    const/16 v39, 0x1

    goto :goto_8

    :cond_9
    const/16 v39, 0x0

    :goto_8
    const/16 v5, 0xb

    invoke-interface {v4, v5}, Ltb/c;->getLong(I)J

    move-result-wide v40

    const/16 v5, 0xc

    invoke-interface {v4, v5}, Ltb/c;->getLong(I)J

    move-result-wide v42

    const/16 v5, 0xd

    invoke-interface {v4, v5}, Ltb/c;->getBlob(I)[B

    move-result-object v5

    invoke-static {v5}, Lj93/l0;->m([B)Ljava/util/LinkedHashSet;

    move-result-object v44

    new-instance v33, Lic/e;

    invoke-direct/range {v33 .. v44}, Lic/e;-><init>(Lrc/e;Lic/x;ZZZZJJLjava/util/Set;)V

    const/4 v5, 0x0

    invoke-interface {v4, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v6

    move-object/from16 v5, p1

    invoke-static {v6, v5}, Lm83/g0;->U(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v6

    invoke-static {v6, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v31, v6

    check-cast v31, Ljava/util/List;

    const/4 v6, 0x0

    invoke-interface {v4, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v8}, Lm83/g0;->U(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v32, v1

    check-cast v32, Ljava/util/List;

    move/from16 v27, v9

    new-instance v9, Lqc/p;

    move/from16 v26, v3

    move/from16 v20, v7

    move-object/from16 v19, v33

    invoke-direct/range {v9 .. v32}, Lqc/p;-><init>(Ljava/lang/String;Lic/m0;Lic/g;JJJLic/e;ILic/a;JJIIJILjava/util/List;Ljava/util/List;)V

    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move v1, v6

    move-object v6, v5

    move v5, v1

    move-object/from16 v1, p0

    const/4 v3, 0x1

    goto/16 :goto_4

    :cond_a
    invoke-interface {v4}, Ljava/lang/AutoCloseable;->close()V

    return-object v0

    :goto_9
    invoke-interface {v4}, Ljava/lang/AutoCloseable;->close()V

    throw v0

    :pswitch_17
    check-cast v8, Lqc/n;

    check-cast v7, Lqc/m;

    check-cast v0, Ltb/a;

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v8, Lqc/n;->b:Lqc/b;

    invoke-virtual {v1, v0, v7}, Landroidx/room/k;->insert(Ltb/a;Ljava/lang/Object;)V

    return-object v6

    :pswitch_18
    check-cast v8, Lqc/c;

    check-cast v7, Lqc/a;

    check-cast v0, Ltb/a;

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v8, Lqc/c;->b:Lqc/b;

    invoke-virtual {v1, v0, v7}, Landroidx/room/k;->insert(Ltb/a;Ljava/lang/Object;)V

    return-object v6

    :pswitch_19
    check-cast v8, Lkotlin/jvm/functions/Function1;

    check-cast v7, Lpb0/b;

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-static {v8, v7, v0}, Lqb0/b;->i(Lkotlin/jvm/functions/Function1;Lpb0/b;Z)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1a
    check-cast v8, Lq81/h;

    check-cast v7, Lp1/c1;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v8, v7, v0}, Lq81/g;->c(Lq81/h;Lp1/c1;I)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1b
    check-cast v8, Lq3/h;

    check-cast v7, Lq3/i;

    check-cast v0, Lq3/h;

    if-ne v8, v0, :cond_b

    const-string v1, " > "

    goto :goto_a

    :cond_b
    const-string v1, "   "

    :goto_a
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    instance-of v1, v0, Lq3/a;

    const/16 v3, 0x29

    const-string v4, ", newCursorPosition="

    if-eqz v1, :cond_c

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v5, "CommitTextCommand(text.length="

    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    check-cast v0, Lq3/a;

    iget-object v5, v0, Lq3/a;->a:Ll3/g;

    iget-object v5, v5, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, v0, Lq3/a;->b:I

    :goto_b
    invoke-static {v1, v0, v3}, Ldc/b;->r(Ljava/lang/StringBuilder;IC)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_c

    :cond_c
    instance-of v1, v0, Lq3/w;

    if-eqz v1, :cond_d

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v5, "SetComposingTextCommand(text.length="

    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    check-cast v0, Lq3/w;

    iget-object v5, v0, Lq3/w;->a:Ll3/g;

    iget-object v5, v5, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, v0, Lq3/w;->b:I

    goto :goto_b

    :cond_d
    instance-of v1, v0, Lq3/v;

    if-eqz v1, :cond_e

    check-cast v0, Lq3/v;

    invoke-virtual {v0}, Lq3/v;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_c

    :cond_e
    instance-of v1, v0, Lq3/f;

    if-eqz v1, :cond_f

    check-cast v0, Lq3/f;

    invoke-virtual {v0}, Lq3/f;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_c

    :cond_f
    instance-of v1, v0, Lq3/g;

    if-eqz v1, :cond_10

    check-cast v0, Lq3/g;

    invoke-virtual {v0}, Lq3/g;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_c

    :cond_10
    instance-of v1, v0, Lq3/x;

    if-eqz v1, :cond_11

    check-cast v0, Lq3/x;

    invoke-virtual {v0}, Lq3/x;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_c

    :cond_11
    instance-of v1, v0, Lq3/j;

    if-eqz v1, :cond_12

    const-string v0, "FinishComposingTextCommand()"

    goto :goto_c

    :cond_12
    instance-of v1, v0, Lq3/e;

    if-eqz v1, :cond_13

    const-string v0, "DeleteAllCommand()"

    goto :goto_c

    :cond_13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-interface {v0}, Lj93/d;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_14

    const-string v0, "{anonymous EditCommand}"

    :cond_14
    const-string v1, "Unknown EditCommand: "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_c
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_1c
    check-cast v8, Lkotlin/jvm/functions/Function1;

    check-cast v7, Lq11/e;

    invoke-static {v8, v7, v0}, Lq11/d;->e(Lkotlin/jvm/functions/Function1;Lq11/e;Ljava/lang/Object;)Ll83/a0;

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
