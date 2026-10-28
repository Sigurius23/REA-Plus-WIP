.class public final synthetic Lai1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:J


# direct methods
.method public synthetic constructor <init>(JI)V
    .locals 0

    iput p3, p0, Lai1/b;->w:I

    iput-wide p1, p0, Lai1/b;->x:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 84

    move-object/from16 v1, p0

    iget v0, v1, Lai1/b;->w:I

    iget-wide v2, v1, Lai1/b;->x:J

    packed-switch v0, :pswitch_data_0

    move-object/from16 v0, p1

    check-cast v0, Ltb/a;

    invoke-static {v2, v3, v0}, Lrk2/d;->e(JLtb/a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    move-object/from16 v0, p1

    check-cast v0, Lk2/e;

    invoke-static {v2, v3, v0}, Lqy0/f;->d(JLk2/e;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    move-object/from16 v0, p1

    check-cast v0, Lk2/e;

    invoke-static {v2, v3, v0}, Lqy0/f;->e(JLk2/e;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_2
    move-object/from16 v0, p1

    check-cast v0, Ltb/a;

    const-string v4, "_connection"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC"

    invoke-interface {v0, v4}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v4

    const/4 v0, 0x1

    :try_start_0
    invoke-interface {v4, v0, v2, v3}, Ltb/c;->p(IJ)V

    const-string v2, "id"

    invoke-static {v4, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    const-string v3, "state"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    const-string v5, "worker_class_name"

    invoke-static {v4, v5}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v5

    const-string v6, "input_merger_class_name"

    invoke-static {v4, v6}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v6

    const-string v7, "input"

    invoke-static {v4, v7}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v7

    const-string v8, "output"

    invoke-static {v4, v8}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v8

    const-string v9, "initial_delay"

    invoke-static {v4, v9}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v9

    const-string v10, "interval_duration"

    invoke-static {v4, v10}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v10

    const-string v11, "flex_duration"

    invoke-static {v4, v11}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v11

    const-string v12, "run_attempt_count"

    invoke-static {v4, v12}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v12

    const-string v13, "backoff_policy"

    invoke-static {v4, v13}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v13

    const-string v14, "backoff_delay_duration"

    invoke-static {v4, v14}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v14

    const-string v15, "last_enqueue_time"

    invoke-static {v4, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    const-string v0, "minimum_retention_duration"

    invoke-static {v4, v0}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v0

    const-string v1, "schedule_requested_at"

    invoke-static {v4, v1}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v1

    move/from16 v16, v1

    const-string v1, "run_in_foreground"

    invoke-static {v4, v1}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v1

    move/from16 v17, v1

    const-string v1, "out_of_quota_policy"

    invoke-static {v4, v1}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v1

    move/from16 v18, v1

    const-string v1, "period_count"

    invoke-static {v4, v1}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v1

    move/from16 v19, v1

    const-string v1, "generation"

    invoke-static {v4, v1}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v1

    move/from16 v20, v1

    const-string v1, "next_schedule_time_override"

    invoke-static {v4, v1}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v1

    move/from16 v21, v1

    const-string v1, "next_schedule_time_override_generation"

    invoke-static {v4, v1}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v1

    move/from16 v22, v1

    const-string v1, "stop_reason"

    invoke-static {v4, v1}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v1

    move/from16 v23, v1

    const-string v1, "trace_tag"

    invoke-static {v4, v1}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v1

    move/from16 v24, v1

    const-string v1, "backoff_on_system_interruptions"

    invoke-static {v4, v1}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v1

    move/from16 v25, v1

    const-string v1, "required_network_type"

    invoke-static {v4, v1}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v1

    move/from16 v26, v1

    const-string v1, "required_network_request"

    invoke-static {v4, v1}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v1

    move/from16 v27, v1

    const-string v1, "requires_charging"

    invoke-static {v4, v1}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v1

    move/from16 v28, v1

    const-string v1, "requires_device_idle"

    invoke-static {v4, v1}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v1

    move/from16 v29, v1

    const-string v1, "requires_battery_not_low"

    invoke-static {v4, v1}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v1

    move/from16 v30, v1

    const-string v1, "requires_storage_not_low"

    invoke-static {v4, v1}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v1

    move/from16 v31, v1

    const-string v1, "trigger_content_update_delay"

    invoke-static {v4, v1}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v1

    move/from16 v32, v1

    const-string v1, "trigger_max_content_delay"

    invoke-static {v4, v1}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v1

    move/from16 v33, v1

    const-string v1, "content_uri_triggers"

    invoke-static {v4, v1}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v1

    move/from16 v34, v1

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    invoke-interface {v4}, Ltb/c;->e1()Z

    move-result v35

    if-eqz v35, :cond_9

    invoke-interface {v4, v2}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v37

    move-object/from16 v70, v1

    move/from16 v35, v2

    invoke-interface {v4, v3}, Ltb/c;->getLong(I)J

    move-result-wide v1

    long-to-int v1, v1

    invoke-static {v1}, Lj93/l0;->M(I)Lic/m0;

    move-result-object v38

    invoke-interface {v4, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v39

    invoke-interface {v4, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v40

    invoke-interface {v4, v7}, Ltb/c;->getBlob(I)[B

    move-result-object v1

    sget-object v2, Lic/g;->b:Lic/g;

    invoke-static {v1}, Lpf/c;->t([B)Lic/g;

    move-result-object v41

    invoke-interface {v4, v8}, Ltb/c;->getBlob(I)[B

    move-result-object v1

    invoke-static {v1}, Lpf/c;->t([B)Lic/g;

    move-result-object v42

    invoke-interface {v4, v9}, Ltb/c;->getLong(I)J

    move-result-wide v43

    invoke-interface {v4, v10}, Ltb/c;->getLong(I)J

    move-result-wide v45

    invoke-interface {v4, v11}, Ltb/c;->getLong(I)J

    move-result-wide v47

    invoke-interface {v4, v12}, Ltb/c;->getLong(I)J

    move-result-wide v1

    long-to-int v1, v1

    move/from16 v50, v1

    invoke-interface {v4, v13}, Ltb/c;->getLong(I)J

    move-result-wide v1

    long-to-int v1, v1

    invoke-static {v1}, Lj93/l0;->J(I)Lic/a;

    move-result-object v51

    invoke-interface {v4, v14}, Ltb/c;->getLong(I)J

    move-result-wide v52

    invoke-interface {v4, v15}, Ltb/c;->getLong(I)J

    move-result-wide v54

    invoke-interface {v4, v0}, Ltb/c;->getLong(I)J

    move-result-wide v56

    move/from16 v1, v16

    invoke-interface {v4, v1}, Ltb/c;->getLong(I)J

    move-result-wide v58

    move/from16 v16, v0

    move/from16 v2, v17

    move/from16 v17, v1

    invoke-interface {v4, v2}, Ltb/c;->getLong(I)J

    move-result-wide v0

    long-to-int v0, v0

    if-eqz v0, :cond_0

    const/16 v60, 0x1

    :goto_1
    move/from16 v0, v18

    move/from16 v18, v2

    goto :goto_2

    :cond_0
    const/16 v60, 0x0

    goto :goto_1

    :goto_2
    invoke-interface {v4, v0}, Ltb/c;->getLong(I)J

    move-result-wide v1

    long-to-int v1, v1

    invoke-static {v1}, Lj93/l0;->L(I)Lic/i0;

    move-result-object v61

    move/from16 v1, v19

    move/from16 v19, v3

    invoke-interface {v4, v1}, Ltb/c;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    move/from16 v71, v1

    move/from16 v3, v20

    move/from16 v20, v0

    invoke-interface {v4, v3}, Ltb/c;->getLong(I)J

    move-result-wide v0

    long-to-int v0, v0

    move/from16 v1, v21

    invoke-interface {v4, v1}, Ltb/c;->getLong(I)J

    move-result-wide v64

    move/from16 v63, v0

    move/from16 v62, v2

    move/from16 v0, v22

    invoke-interface {v4, v0}, Ltb/c;->getLong(I)J

    move-result-wide v1

    long-to-int v1, v1

    move/from16 v22, v0

    move/from16 v66, v1

    move/from16 v2, v23

    invoke-interface {v4, v2}, Ltb/c;->getLong(I)J

    move-result-wide v0

    long-to-int v0, v0

    move/from16 v1, v24

    invoke-interface {v4, v1}, Ltb/c;->isNull(I)Z

    move-result v23

    const/16 v24, 0x0

    if-eqz v23, :cond_1

    move-object/from16 v68, v24

    :goto_3
    move/from16 v67, v0

    move/from16 v0, v25

    goto :goto_4

    :cond_1
    invoke-interface {v4, v1}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v23

    move-object/from16 v68, v23

    goto :goto_3

    :goto_4
    invoke-interface {v4, v0}, Ltb/c;->isNull(I)Z

    move-result v23

    if-eqz v23, :cond_2

    move/from16 v25, v1

    move/from16 v23, v2

    move-object/from16 v1, v24

    goto :goto_5

    :cond_2
    move/from16 v25, v1

    move/from16 v23, v2

    invoke-interface {v4, v0}, Ltb/c;->getLong(I)J

    move-result-wide v1

    long-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    :goto_5
    if-eqz v1, :cond_4

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    if-eqz v1, :cond_3

    const/4 v1, 0x1

    goto :goto_6

    :cond_3
    const/4 v1, 0x0

    :goto_6
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v24

    :cond_4
    move-object/from16 v69, v24

    move/from16 v1, v26

    move/from16 v24, v3

    goto :goto_7

    :catchall_0
    move-exception v0

    goto/16 :goto_10

    :goto_7
    invoke-interface {v4, v1}, Ltb/c;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    invoke-static {v2}, Lj93/l0;->K(I)Lic/x;

    move-result-object v74

    move/from16 v2, v27

    invoke-interface {v4, v2}, Ltb/c;->getBlob(I)[B

    move-result-object v3

    invoke-static {v3}, Lj93/l0;->g0([B)Lrc/e;

    move-result-object v73

    move/from16 v26, v0

    move/from16 v27, v1

    move/from16 v3, v28

    invoke-interface {v4, v3}, Ltb/c;->getLong(I)J

    move-result-wide v0

    long-to-int v0, v0

    if-eqz v0, :cond_5

    const/16 v75, 0x1

    :goto_8
    move/from16 v28, v2

    move/from16 v0, v29

    goto :goto_9

    :cond_5
    const/16 v75, 0x0

    goto :goto_8

    :goto_9
    invoke-interface {v4, v0}, Ltb/c;->getLong(I)J

    move-result-wide v1

    long-to-int v1, v1

    if-eqz v1, :cond_6

    const/16 v76, 0x1

    :goto_a
    move/from16 v29, v3

    move/from16 v1, v30

    goto :goto_b

    :cond_6
    const/16 v76, 0x0

    goto :goto_a

    :goto_b
    invoke-interface {v4, v1}, Ltb/c;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    if-eqz v2, :cond_7

    const/16 v77, 0x1

    :goto_c
    move v3, v0

    move/from16 v30, v1

    move/from16 v2, v31

    goto :goto_d

    :cond_7
    const/16 v77, 0x0

    goto :goto_c

    :goto_d
    invoke-interface {v4, v2}, Ltb/c;->getLong(I)J

    move-result-wide v0

    long-to-int v0, v0

    if-eqz v0, :cond_8

    const/16 v78, 0x1

    :goto_e
    move/from16 v0, v32

    goto :goto_f

    :cond_8
    const/16 v78, 0x0

    goto :goto_e

    :goto_f
    invoke-interface {v4, v0}, Ltb/c;->getLong(I)J

    move-result-wide v79

    move/from16 v1, v33

    invoke-interface {v4, v1}, Ltb/c;->getLong(I)J

    move-result-wide v81

    move/from16 v32, v0

    move/from16 v0, v34

    invoke-interface {v4, v0}, Ltb/c;->getBlob(I)[B

    move-result-object v31

    invoke-static/range {v31 .. v31}, Lj93/l0;->m([B)Ljava/util/LinkedHashSet;

    move-result-object v83

    new-instance v49, Lic/e;

    move-object/from16 v72, v49

    invoke-direct/range {v72 .. v83}, Lic/e;-><init>(Lrc/e;Lic/x;ZZZZJJLjava/util/Set;)V

    move-object/from16 v49, v72

    new-instance v36, Lqc/q;

    invoke-direct/range {v36 .. v69}, Lqc/q;-><init>(Ljava/lang/String;Lic/m0;Ljava/lang/String;Ljava/lang/String;Lic/g;Lic/g;JJJLic/e;ILic/a;JJJJZLic/i0;IIJIILjava/lang/String;Ljava/lang/Boolean;)V

    move/from16 v34, v0

    move-object/from16 v0, v36

    move/from16 v33, v1

    move-object/from16 v1, v70

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move/from16 v31, v2

    move/from16 v0, v16

    move/from16 v16, v17

    move/from16 v17, v18

    move/from16 v18, v20

    move/from16 v20, v24

    move/from16 v24, v25

    move/from16 v25, v26

    move/from16 v26, v27

    move/from16 v27, v28

    move/from16 v28, v29

    move/from16 v2, v35

    move/from16 v29, v3

    move/from16 v3, v19

    move/from16 v19, v71

    goto/16 :goto_0

    :cond_9
    invoke-interface {v4}, Ljava/lang/AutoCloseable;->close()V

    return-object v1

    :goto_10
    invoke-interface {v4}, Ljava/lang/AutoCloseable;->close()V

    throw v0

    :pswitch_3
    move-object/from16 v0, p1

    check-cast v0, Lk2/e;

    invoke-static {v2, v3, v0}, Lno0/s;->h(JLk2/e;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_4
    move-object/from16 v0, p1

    check-cast v0, Lk2/e;

    invoke-static {v2, v3, v0}, Ln21/h;->d(JLk2/e;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_5
    move-object/from16 v0, p1

    check-cast v0, Lk2/e;

    invoke-static {v2, v3, v0}, Ln21/h;->g(JLk2/e;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_6
    move-object/from16 v0, p1

    check-cast v0, Lk2/c;

    invoke-static {v2, v3, v0}, Ll11/c;->j(JLk2/c;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_7
    move-object/from16 v0, p1

    check-cast v0, Lk2/c;

    invoke-static {v2, v3, v0}, Ll11/c;->l(JLk2/c;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_8
    move-object/from16 v0, p1

    check-cast v0, Lk2/c;

    invoke-static {v2, v3, v0}, Ll11/c;->b(JLk2/c;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_9
    move-object/from16 v0, p1

    check-cast v0, Lk2/c;

    invoke-static {v2, v3, v0}, Lkk1/g;->E(JLk2/c;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_a
    move-object/from16 v0, p1

    check-cast v0, Lk2/c;

    invoke-static {v2, v3, v0}, Lio2/s;->m(JLk2/c;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_b
    move-object/from16 v0, p1

    check-cast v0, Lk2/e;

    invoke-static {v2, v3, v0}, Lid2/i;->b(JLk2/e;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_c
    move-object/from16 v0, p1

    check-cast v0, Landroidx/compose/ui/Modifier;

    invoke-static {v2, v3, v0}, Lh02/b0;->h(JLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    return-object v0

    :pswitch_d
    move-object/from16 v0, p1

    check-cast v0, Lk2/e;

    invoke-static {v2, v3, v0}, Lgb1/b0;->k(JLk2/e;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_e
    move-object/from16 v0, p1

    check-cast v0, Lk2/e;

    invoke-static {v2, v3, v0}, Lfg2/n;->h(JLk2/e;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_f
    move-object/from16 v0, p1

    check-cast v0, Landroidx/compose/ui/Modifier;

    invoke-static {v2, v3, v0}, Le81/k;->s(JLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    return-object v0

    :pswitch_10
    move-object/from16 v0, p1

    check-cast v0, Lk2/e;

    invoke-static {v2, v3, v0}, Ldn0/h;->e(JLk2/e;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_11
    move-object/from16 v0, p1

    check-cast v0, Lk2/e;

    invoke-static {v2, v3, v0}, Ldn0/h;->a(JLk2/e;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_12
    move-object/from16 v0, p1

    check-cast v0, Lk2/e;

    invoke-static {v2, v3, v0}, Ld71/d;->f(JLk2/e;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_13
    move-object/from16 v0, p1

    check-cast v0, Lk2/e;

    invoke-static {v2, v3, v0}, Ld71/d;->d(JLk2/e;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_14
    move-object/from16 v0, p1

    check-cast v0, Landroidx/compose/ui/Modifier;

    invoke-static {v2, v3, v0}, Ld71/d;->g(JLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    return-object v0

    :pswitch_15
    move-object/from16 v0, p1

    check-cast v0, Landroidx/compose/ui/Modifier;

    invoke-static {v2, v3, v0}, Ld71/d;->a(JLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    return-object v0

    :pswitch_16
    move-object/from16 v0, p1

    check-cast v0, Ltb/a;

    invoke-static {v2, v3, v0}, Lcom/whoop/data/local/room/dao/wipeable/JournalDao_Impl;->a(JLtb/a;)Lcom/whoop/data/local/room/entity/JournalAnsweredDto;

    move-result-object v0

    return-object v0

    :pswitch_17
    move-object/from16 v0, p1

    check-cast v0, Ltb/a;

    invoke-static {v2, v3, v0}, Lcom/whoop/data/local/room/dao/wipeable/JournalDao_Impl;->b(JLtb/a;)Lcom/whoop/data/local/room/entity/JournalAnsweredDto;

    move-result-object v0

    return-object v0

    :pswitch_18
    move-object/from16 v0, p1

    check-cast v0, Ltb/a;

    invoke-static {v2, v3, v0}, Lcom/whoop/data/local/room/dao/wipeable/GpsDao_Impl;->i(JLtb/a;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_19
    move-object/from16 v0, p1

    check-cast v0, Ltb/a;

    invoke-static {v2, v3, v0}, Lcom/whoop/data/local/room/dao/persistent/RawDataDao_Impl;->h(JLtb/a;)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_1a
    move-object/from16 v0, p1

    check-cast v0, Lk2/e;

    invoke-static {v2, v3, v0}, Lc31/j;->b(JLk2/e;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1b
    move-object/from16 v0, p1

    check-cast v0, Ltb/a;

    invoke-static {v2, v3, v0}, Lai1/d;->f(JLtb/a;)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_1c
    move-object/from16 v0, p1

    check-cast v0, Ltb/a;

    invoke-static {v2, v3, v0}, Lai1/d;->g(JLtb/a;)Ljava/util/List;

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
