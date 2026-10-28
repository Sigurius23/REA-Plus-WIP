.class public final synthetic Lpf/b;
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

    .line 1
    iput p2, p0, Lpf/b;->w:I

    iput-object p1, p0, Lpf/b;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lq0/e0;Lh0/k2;)V
    .locals 0

    .line 2
    const/16 p2, 0x8

    iput p2, p0, Lpf/b;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpf/b;->x:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 47

    move-object/from16 v1, p0

    iget v0, v1, Lpf/b;->w:I

    const/4 v2, 0x7

    const/16 v3, 0xa

    const-string v4, "state"

    const/4 v5, 0x1

    const/4 v6, 0x0

    sget-object v7, Ll83/a0;->a:Ll83/a0;

    iget-object v8, v1, Lpf/b;->x:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v8, Lrq0/o;

    move-object/from16 v0, p1

    check-cast v0, Lrq0/z;

    invoke-static {v8, v0}, Lrq0/o;->E(Lrq0/o;Lrq0/z;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    check-cast v8, Lcom/whoop/community/presentation/teams/TeamCreateActivity;

    move-object/from16 v0, p1

    check-cast v0, Lrq0/z;

    invoke-static {v8, v0}, Lcom/whoop/community/presentation/teams/TeamCreateActivity;->z(Lcom/whoop/community/presentation/teams/TeamCreateActivity;Lrq0/z;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    check-cast v8, Lii0/a;

    move-object/from16 v0, p1

    check-cast v0, Landroid/content/Context;

    invoke-static {v8, v0}, Lrm2/e;->k(Lii0/a;Landroid/content/Context;)Landroid/view/View;

    move-result-object v0

    return-object v0

    :pswitch_2
    check-cast v8, Lvn1/i;

    move-object/from16 v0, p1

    check-cast v0, Lc0/q;

    invoke-static {v8, v0}, Lrm1/f;->g(Lvn1/i;Lc0/q;)Lc0/l0;

    move-result-object v0

    return-object v0

    :pswitch_3
    check-cast v8, Lrk2/d;

    move-object/from16 v0, p1

    check-cast v0, Ltb/a;

    invoke-static {v8, v0}, Lrk2/d;->f(Lrk2/d;Ltb/a;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :pswitch_4
    check-cast v8, Lrf2/c;

    move-object/from16 v0, p1

    check-cast v0, Ltb/a;

    invoke-static {v8, v0}, Lrf2/c;->i(Lrf2/c;Ltb/a;)Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;

    move-result-object v0

    return-object v0

    :pswitch_5
    check-cast v8, Lr71/c;

    move-object/from16 v0, p1

    check-cast v0, Li3/z;

    invoke-static {v8, v0}, Lr71/b;->f(Lr71/c;Li3/z;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_6
    check-cast v8, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;

    move-object/from16 v0, p1

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    invoke-static {v8, v0}, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->p(Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;F)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_7
    check-cast v8, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;

    move-object/from16 v0, p1

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    invoke-static {v8, v0}, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;->e(Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;F)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_8
    check-cast v8, Lr20/o;

    move-object/from16 v0, p1

    check-cast v0, Lb30/p5;

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v8, Lr20/o;->w:Lb30/q0;

    iget-boolean v2, v2, Lb30/q0;->m:Z

    iget-boolean v4, v0, Lb30/p5;->c:Z

    iget-boolean v0, v0, Lb30/p5;->e:Z

    new-instance v7, Lq80/h;

    invoke-direct {v7, v8, v3}, Lq80/h;-><init>(Ljava/lang/Object;I)V

    new-instance v3, Lb30/j3;

    xor-int/2addr v2, v5

    if-ne v0, v5, :cond_0

    move v0, v5

    goto :goto_0

    :cond_0
    move v0, v6

    :goto_0
    if-ne v4, v5, :cond_1

    goto :goto_1

    :cond_1
    move v5, v6

    :goto_1
    invoke-direct {v3, v2, v0, v5, v7}, Lb30/j3;-><init>(ZZZLc93/a;)V

    return-object v3

    :pswitch_9
    check-cast v8, Lr20/k;

    move-object/from16 v0, p1

    check-cast v0, Ld30/x;

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v8, Lr20/k;->w:Ld30/h;

    invoke-virtual {v0, v2}, Ld30/x;->b(Ld30/h;)Lb30/j3;

    move-result-object v0

    return-object v0

    :pswitch_a
    check-cast v8, Lr20/i;

    move-object/from16 v0, p1

    check-cast v0, Lw20/f;

    const-string v3, "complete"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, v8, Lr20/i;->w:Lw20/b0;

    iget-object v3, v3, Lw20/b0;->c:Lec3/r1;

    iget-object v3, v3, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v3}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lw20/y;

    iget-boolean v3, v3, Lw20/y;->b:Z

    instance-of v0, v0, Lw20/e;

    new-instance v4, Lou1/a;

    invoke-direct {v4, v2}, Lou1/a;-><init>(I)V

    new-instance v2, Lb30/j3;

    if-ne v0, v5, :cond_2

    goto :goto_2

    :cond_2
    move v5, v6

    :goto_2
    invoke-direct {v2, v3, v6, v5, v4}, Lb30/j3;-><init>(ZZZLc93/a;)V

    return-object v2

    :pswitch_b
    check-cast v8, Lqx0/i;

    move-object/from16 v0, p1

    check-cast v0, Ln0/q;

    invoke-static {v8, v0}, Lqx0/g;->h(Lqx0/i;Ln0/q;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_c
    check-cast v8, Lf41/a;

    move-object/from16 v0, p1

    check-cast v0, Ln0/q;

    invoke-static {v8, v0}, Lqt2/b;->c(Lf41/a;Ln0/q;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_d
    check-cast v8, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;

    move-object/from16 v0, p1

    check-cast v0, Lqm2/l;

    invoke-static {v8, v0}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;->g(Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;Lqm2/l;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_e
    check-cast v8, Lqm2/f;

    move-object/from16 v0, p1

    check-cast v0, Lqm2/s;

    invoke-static {v8, v0}, Lqm2/f;->y(Lqm2/f;Lqm2/s;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_f
    check-cast v8, Lqj0/h;

    move-object/from16 v0, p1

    check-cast v0, Lmj0/b;

    invoke-static {v8, v0}, Lqj0/a;->b(Lqj0/h;Lmj0/b;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_10
    check-cast v8, Lne0/b;

    move-object/from16 v0, p1

    check-cast v0, Lne0/a;

    invoke-static {v8, v0}, Lcom/whoop/advancedlabs/testhistory/view/TestHistoryFragment;->C(Lne0/b;Lne0/a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_11
    const-string v0, "SavingWorkoutInBackgroundWorker"

    check-cast v8, Lqc/u;

    move-object/from16 v4, p1

    check-cast v4, Ltb/a;

    const-string v7, "getValue(...)"

    const-string v9, "_connection"

    invoke-static {v4, v9}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=?)"

    invoke-interface {v4, v9}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v9

    :try_start_0
    invoke-interface {v9, v5, v0}, Ltb/c;->L(ILjava/lang/String;)V

    new-instance v0, La0/g;

    invoke-direct {v0, v6}, La0/f1;-><init>(I)V

    new-instance v10, La0/g;

    invoke-direct {v10, v6}, La0/f1;-><init>(I)V

    :cond_3
    :goto_3
    invoke-interface {v9}, Ltb/c;->e1()Z

    move-result v11

    if-eqz v11, :cond_5

    invoke-interface {v9, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v0, v11}, La0/f1;->containsKey(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_4

    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0, v11, v12}, La0/f1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    :catchall_0
    move-exception v0

    goto/16 :goto_b

    :cond_4
    :goto_4
    invoke-interface {v9, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, La0/f1;->containsKey(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_3

    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v10, v11, v12}, La0/f1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    :cond_5
    invoke-interface {v9}, Ltb/c;->reset()V

    invoke-virtual {v8, v4, v0}, Lqc/u;->b(Ltb/a;La0/g;)V

    invoke-virtual {v8, v4, v10}, Lqc/u;->a(Ltb/a;La0/g;)V

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    :goto_5
    invoke-interface {v9}, Ltb/c;->e1()Z

    move-result v8

    if-eqz v8, :cond_a

    invoke-interface {v9, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v12

    invoke-interface {v9, v5}, Ltb/c;->getLong(I)J

    move-result-wide v13

    long-to-int v8, v13

    invoke-static {v8}, Lj93/l0;->M(I)Lic/m0;

    move-result-object v13

    const/4 v8, 0x2

    invoke-interface {v9, v8}, Ltb/c;->getBlob(I)[B

    move-result-object v8

    sget-object v11, Lic/g;->b:Lic/g;

    invoke-static {v8}, Lpf/c;->t([B)Lic/g;

    move-result-object v14

    const/4 v8, 0x3

    invoke-interface {v9, v8}, Ltb/c;->getLong(I)J

    move-result-wide v5

    long-to-int v5, v5

    const/4 v6, 0x4

    move-object/from16 p1, v4

    invoke-interface {v9, v6}, Ltb/c;->getLong(I)J

    move-result-wide v3

    long-to-int v3, v3

    const/16 v4, 0xe

    invoke-interface {v9, v4}, Ltb/c;->getLong(I)J

    move-result-wide v15

    const/16 v4, 0xf

    invoke-interface {v9, v4}, Ltb/c;->getLong(I)J

    move-result-wide v17

    const/16 v4, 0x10

    invoke-interface {v9, v4}, Ltb/c;->getLong(I)J

    move-result-wide v19

    const/16 v4, 0x11

    move/from16 v29, v3

    invoke-interface {v9, v4}, Ltb/c;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    invoke-static {v2}, Lj93/l0;->J(I)Lic/a;

    move-result-object v23

    const/16 v2, 0x12

    invoke-interface {v9, v2}, Ltb/c;->getLong(I)J

    move-result-wide v24

    const/16 v2, 0x13

    invoke-interface {v9, v2}, Ltb/c;->getLong(I)J

    move-result-wide v26

    const/16 v2, 0x14

    invoke-interface {v9, v2}, Ltb/c;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    const/16 v3, 0x15

    invoke-interface {v9, v3}, Ltb/c;->getLong(I)J

    move-result-wide v30

    const/16 v3, 0x16

    invoke-interface {v9, v3}, Ltb/c;->getLong(I)J

    move-result-wide v3

    long-to-int v3, v3

    const/4 v4, 0x5

    move-object v8, v7

    invoke-interface {v9, v4}, Ltb/c;->getLong(I)J

    move-result-wide v6

    long-to-int v4, v6

    invoke-static {v4}, Lj93/l0;->K(I)Lic/x;

    move-result-object v37

    const/4 v4, 0x6

    invoke-interface {v9, v4}, Ltb/c;->getBlob(I)[B

    move-result-object v4

    invoke-static {v4}, Lj93/l0;->g0([B)Lrc/e;

    move-result-object v36

    move/from16 v28, v2

    const/4 v6, 0x7

    invoke-interface {v9, v6}, Ltb/c;->getLong(I)J

    move-result-wide v1

    long-to-int v1, v1

    if-eqz v1, :cond_6

    const/16 v38, 0x1

    goto :goto_6

    :cond_6
    const/16 v38, 0x0

    :goto_6
    const/16 v1, 0x8

    invoke-interface {v9, v1}, Ltb/c;->getLong(I)J

    move-result-wide v1

    long-to-int v1, v1

    if-eqz v1, :cond_7

    const/16 v39, 0x1

    goto :goto_7

    :cond_7
    const/16 v39, 0x0

    :goto_7
    const/16 v1, 0x9

    invoke-interface {v9, v1}, Ltb/c;->getLong(I)J

    move-result-wide v1

    long-to-int v1, v1

    if-eqz v1, :cond_8

    const/16 v40, 0x1

    :goto_8
    const/16 v1, 0xa

    goto :goto_9

    :cond_8
    const/16 v40, 0x0

    goto :goto_8

    :goto_9
    invoke-interface {v9, v1}, Ltb/c;->getLong(I)J

    move-result-wide v6

    long-to-int v4, v6

    if-eqz v4, :cond_9

    const/16 v41, 0x1

    goto :goto_a

    :cond_9
    const/16 v41, 0x0

    :goto_a
    const/16 v4, 0xb

    invoke-interface {v9, v4}, Ltb/c;->getLong(I)J

    move-result-wide v42

    const/16 v4, 0xc

    invoke-interface {v9, v4}, Ltb/c;->getLong(I)J

    move-result-wide v44

    const/16 v4, 0xd

    invoke-interface {v9, v4}, Ltb/c;->getBlob(I)[B

    move-result-object v4

    invoke-static {v4}, Lj93/l0;->m([B)Ljava/util/LinkedHashSet;

    move-result-object v46

    new-instance v21, Lic/e;

    move-object/from16 v35, v21

    invoke-direct/range {v35 .. v46}, Lic/e;-><init>(Lrc/e;Lic/x;ZZZZJJLjava/util/Set;)V

    move-object/from16 v21, v35

    const/4 v4, 0x0

    invoke-interface {v9, v4}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v0}, Lm83/g0;->U(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v6

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v33, v6

    check-cast v33, Ljava/util/List;

    invoke-interface {v9, v4}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v10}, Lm83/g0;->U(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v6

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v34, v6

    check-cast v34, Ljava/util/List;

    new-instance v11, Lqc/p;

    move/from16 v32, v3

    move/from16 v22, v5

    invoke-direct/range {v11 .. v34}, Lqc/p;-><init>(Ljava/lang/String;Lic/m0;Lic/g;JJJLic/e;ILic/a;JJIIJILjava/util/List;Ljava/util/List;)V

    move-object/from16 v3, p1

    invoke-virtual {v3, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move v6, v4

    move-object v7, v8

    const/4 v2, 0x7

    const/4 v5, 0x1

    move-object v4, v3

    move v3, v1

    move-object/from16 v1, p0

    goto/16 :goto_5

    :cond_a
    move-object v3, v4

    invoke-interface {v9}, Ljava/lang/AutoCloseable;->close()V

    return-object v3

    :goto_b
    invoke-interface {v9}, Ljava/lang/AutoCloseable;->close()V

    throw v0

    :pswitch_12
    check-cast v8, Lnk0/a$a;

    move-object/from16 v0, p1

    check-cast v0, Ljava/lang/Byte;

    invoke-virtual {v0}, Ljava/lang/Byte;->byteValue()B

    move-result v0

    invoke-static {v8, v0}, Lq92/d;->t(Lnk0/a$a;B)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_13
    check-cast v8, Li2/q0;

    move-object/from16 v0, p1

    check-cast v0, Lk2/e;

    invoke-static {v8, v0}, Lq81/g;->m(Li2/q0;Lk2/e;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_14
    check-cast v8, Lq0/e0;

    move-object/from16 v0, p1

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    iget-object v1, v8, Lq0/e0;->b:Lq0/y;

    invoke-virtual {v1}, Lq0/y;->o()I

    move-result v2

    if-eqz v2, :cond_b

    invoke-virtual {v1}, Lq0/y;->o()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v0, v2

    goto :goto_c

    :cond_b
    const/4 v0, 0x0

    :goto_c
    invoke-static {v0}, Le93/b;->X(F)I

    move-result v0

    invoke-virtual {v1}, Lq0/y;->k()I

    move-result v2

    add-int/2addr v2, v0

    invoke-virtual {v1, v2}, Lq0/y;->j(I)I

    move-result v0

    iget-object v1, v1, Lq0/y;->s:Lp1/h1;

    invoke-virtual {v1, v0}, Lp1/h1;->y(I)V

    return-object v7

    :pswitch_15
    check-cast v8, Lmq1/a;

    move-object/from16 v0, p1

    check-cast v0, Liq1/c;

    invoke-static {v8, v0}, Lpq1/f;->b(Lmq1/a;Liq1/c;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_16
    check-cast v8, Lln0/a;

    move-object/from16 v0, p1

    check-cast v0, Lln0/b;

    invoke-static {v8, v0}, Lcom/whoop/challengedetails/view/ChallengeDetailsFragment;->y(Lln0/a;Lln0/b;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_17
    check-cast v8, Lcom/whoop/challengedetails/view/ChallengeDetailsFragment;

    move-object/from16 v0, p1

    check-cast v0, Lmn0/a;

    invoke-static {v8, v0}, Lcom/whoop/challengedetails/view/ChallengeDetailsFragment;->A(Lcom/whoop/challengedetails/view/ChallengeDetailsFragment;Lmn0/a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_18
    check-cast v8, Lcom/whoop/stress/view/StressMonitorFragment;

    move-object/from16 v0, p1

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v8, v0}, Lcom/whoop/stress/view/StressMonitorFragment;->L(Lcom/whoop/stress/view/StressMonitorFragment;I)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_19
    check-cast v8, Luh0/b;

    move-object/from16 v0, p1

    check-cast v0, Luh0/a;

    invoke-static {v8, v0}, Lcom/whoop/aiinsights/AiInsightsFragment;->B(Luh0/b;Luh0/a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1a
    check-cast v8, Lpf/i;

    move-object/from16 v0, p1

    check-cast v0, Lpf/g;

    const-string v1, "<this>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-wide v1, v8, Lpf/i;->a:J

    move-object v3, v0

    check-cast v3, Lpf/h;

    iput-wide v1, v3, Lpf/h;->a:J

    iget-wide v1, v8, Lpf/i;->b:J

    iput-wide v1, v3, Lpf/h;->b:J

    iget-wide v1, v8, Lpf/i;->c:J

    iput-wide v1, v3, Lpf/h;->c:J

    iget-wide v1, v8, Lpf/i;->d:J

    iput-wide v1, v3, Lpf/h;->d:J

    iget-wide v1, v8, Lpf/i;->e:J

    iput-wide v1, v3, Lpf/h;->e:J

    iget v1, v8, Lpf/i;->f:I

    iput v1, v3, Lpf/h;->f:I

    iget-object v1, v8, Lpf/i;->g:Lpf/t;

    const-string v2, "<set-?>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, v3, Lpf/h;->g:Lpf/t;

    iget-object v1, v8, Lpf/i;->h:Lbg/g;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, v3, Lpf/h;->h:Lbg/g;

    iget-object v1, v8, Lpf/i;->i:Lpf/v;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, v3, Lpf/h;->i:Lpf/v;

    iget-object v1, v8, Lpf/i;->j:Lmg/h;

    check-cast v0, Lrf/q;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, v0, Lrf/q;->k:Lmg/h;

    return-object v7

    :pswitch_1b
    check-cast v8, Lpf/f;

    move-object/from16 v0, p1

    check-cast v0, Ljava/lang/Throwable;

    invoke-virtual {v8}, Lpf/f;->shutdown()V

    return-object v7

    :pswitch_1c
    check-cast v8, Lbc3/s0;

    move-object/from16 v0, p1

    check-cast v0, Ljava/lang/Throwable;

    invoke-interface {v8}, Lbc3/s0;->dispose()V

    return-object v7

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
