.class public final synthetic Lq80/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lq80/f;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 82

    move-object/from16 v1, p0

    iget v0, v1, Lq80/f;->w:I

    const/4 v2, 0x1

    const-string v3, "z"

    const-string v4, "Z"

    const-string v5, "_connection"

    const/16 v6, 0x3a

    const/4 v7, 0x0

    const-string v8, ""

    const-string v9, "$this$optional"

    const-string v10, "$this$alternativeParsing"

    sget-object v11, Ll83/a0;->a:Ll83/a0;

    packed-switch v0, :pswitch_data_0

    move-object/from16 v0, p1

    check-cast v0, Lqc3/y0;

    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lqc3/y0;->k(Lqc3/y0;)V

    new-instance v2, Lq80/f;

    const/16 v3, 0x16

    invoke-direct {v2, v3}, Lq80/f;-><init>(I)V

    invoke-static {v0, v8, v2}, Lds/p;->O(Lqc3/o;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-object v11

    :pswitch_0
    move-object/from16 v0, p1

    check-cast v0, Lqc3/y0;

    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lqc3/y0;->j(Lqc3/y0;)V

    new-instance v2, Lq80/f;

    const/16 v3, 0x1d

    invoke-direct {v2, v3}, Lq80/f;-><init>(I)V

    invoke-static {v0, v8, v2}, Lds/p;->O(Lqc3/o;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-object v11

    :pswitch_1
    move-object/from16 v0, p1

    check-cast v0, Lqc3/y0;

    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lqc3/y0;->j(Lqc3/y0;)V

    invoke-static {v0, v6}, Lds/p;->v(Lqc3/o;C)V

    invoke-static {v0}, Lqc3/y0;->k(Lqc3/y0;)V

    new-instance v2, Lq80/f;

    const/16 v3, 0x15

    invoke-direct {v2, v3}, Lq80/f;-><init>(I)V

    invoke-static {v0, v8, v2}, Lds/p;->O(Lqc3/o;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-object v11

    :pswitch_2
    move-object/from16 v0, p1

    check-cast v0, Lqc3/y0;

    invoke-static {v0, v10}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lq80/f;

    const/16 v3, 0x1c

    invoke-direct {v2, v3}, Lq80/f;-><init>(I)V

    invoke-static {v0, v4, v2}, Lds/p;->O(Lqc3/o;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-object v11

    :pswitch_3
    move-object/from16 v0, p1

    check-cast v0, Lqc3/y0;

    invoke-static {v0, v10}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v3}, Lqc3/o;->a(Ljava/lang/String;)V

    return-object v11

    :pswitch_4
    move-object/from16 v0, p1

    check-cast v0, Lqc3/y0;

    invoke-static {v0, v10}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lq80/f;

    const/16 v3, 0x1b

    invoke-direct {v2, v3}, Lq80/f;-><init>(I)V

    invoke-static {v0, v4, v2}, Lds/p;->O(Lqc3/o;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-object v11

    :pswitch_5
    move-object/from16 v0, p1

    check-cast v0, Lqc3/y0;

    invoke-static {v0, v10}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v3}, Lqc3/o;->a(Ljava/lang/String;)V

    return-object v11

    :pswitch_6
    move-object/from16 v0, p1

    check-cast v0, Lqc3/y0;

    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lqc3/y0;->l(Lqc3/y0;)V

    return-object v11

    :pswitch_7
    move-object/from16 v0, p1

    check-cast v0, Lqc3/y0;

    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v6}, Lds/p;->v(Lqc3/o;C)V

    invoke-static {v0}, Lqc3/y0;->l(Lqc3/y0;)V

    return-object v11

    :pswitch_8
    move-object/from16 v0, p1

    check-cast v0, Lqc3/m;

    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v2, 0x2e

    invoke-static {v0, v2}, Lds/p;->v(Lqc3/o;C)V

    check-cast v0, Lqc3/d;

    new-instance v2, Lsc3/c;

    new-instance v3, Lqc3/q;

    invoke-direct {v3}, Lqc3/q;-><init>()V

    invoke-direct {v2, v3}, Lsc3/c;-><init>(Lsc3/j;)V

    invoke-interface {v0, v2}, Lqc3/d;->d(Lsc3/k;)V

    return-object v11

    :pswitch_9
    move-object/from16 v0, p1

    check-cast v0, Lqc3/m;

    invoke-static {v0, v10}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v6}, Lds/p;->v(Lqc3/o;C)V

    sget-object v2, Lqc3/o0;->w:Lqc3/o0;

    move-object v3, v0

    check-cast v3, Lqc3/d;

    new-instance v4, Lsc3/c;

    new-instance v5, Lqc3/p0;

    invoke-direct {v5, v2}, Lqc3/p0;-><init>(Lqc3/o0;)V

    invoke-direct {v4, v5}, Lsc3/c;-><init>(Lsc3/j;)V

    invoke-interface {v3, v4}, Lqc3/d;->d(Lsc3/k;)V

    new-instance v2, Lq80/f;

    const/16 v3, 0x14

    invoke-direct {v2, v3}, Lq80/f;-><init>(I)V

    invoke-static {v0, v8, v2}, Lds/p;->O(Lqc3/o;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-object v11

    :pswitch_a
    move-object/from16 v0, p1

    check-cast v0, Lqc3/m;

    invoke-static {v0, v10}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v11

    :pswitch_b
    move-object/from16 v0, p1

    check-cast v0, Lqc3/a0;

    invoke-static {v0, v10}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v2, 0x54

    invoke-static {v0, v2}, Lds/p;->v(Lqc3/o;C)V

    return-object v11

    :pswitch_c
    move-object/from16 v0, p1

    check-cast v0, Lqc3/a0;

    invoke-static {v0, v10}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v2, 0x74

    invoke-static {v0, v2}, Lds/p;->v(Lqc3/o;C)V

    return-object v11

    :pswitch_d
    move-object/from16 v0, p1

    check-cast v0, Lqc3/a0;

    const-string v3, "$this$build"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, Lqc3/z;->a:Ll83/p;

    invoke-virtual {v3}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lqc3/a;

    move-object v4, v0

    check-cast v4, Lqc3/c;

    const-string v5, "format"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v6, v3, Lqc3/y;

    if-eqz v6, :cond_0

    check-cast v3, Lqc3/y;

    iget-object v3, v3, Lqc3/y;->a:Lsc3/d;

    invoke-interface {v4, v3}, Lqc3/c;->i(Lsc3/k;)V

    :cond_0
    new-instance v3, Lq80/f;

    const/16 v4, 0x10

    invoke-direct {v3, v4}, Lq80/f;-><init>(I)V

    new-array v2, v2, [Lkotlin/jvm/functions/Function1;

    aput-object v3, v2, v7

    new-instance v3, Lq80/f;

    const/16 v4, 0x11

    invoke-direct {v3, v4}, Lq80/f;-><init>(I)V

    invoke-static {v0, v2, v3}, Lds/p;->q(Lqc3/o;[Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    sget-object v2, Lqc3/f0;->a:Ll83/p;

    invoke-virtual {v2}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lqc3/e0;

    check-cast v0, Lqc3/d;

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v2, Lqc3/e0;->a:Lsc3/d;

    invoke-interface {v0, v2}, Lqc3/d;->d(Lsc3/k;)V

    return-object v11

    :pswitch_e
    move-object/from16 v0, p1

    check-cast v0, Ltb/a;

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)"

    invoke-interface {v0, v2}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v2

    :try_start_0
    invoke-interface {v2}, Ltb/c;->e1()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2, v7}, Ltb/c;->getLong(I)J

    move-result-wide v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    long-to-int v7, v3

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/lang/AutoCloseable;->close()V

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :goto_1
    invoke-interface {v2}, Ljava/lang/AutoCloseable;->close()V

    throw v0

    :pswitch_f
    move-object/from16 v0, p1

    check-cast v0, Ltb/a;

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)"

    invoke-interface {v0, v2}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v2

    :try_start_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :goto_2
    invoke-interface {v2}, Ltb/c;->e1()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    goto :goto_3

    :cond_2
    invoke-interface {v2}, Ljava/lang/AutoCloseable;->close()V

    return-object v0

    :goto_3
    invoke-interface {v2}, Ljava/lang/AutoCloseable;->close()V

    throw v0

    :pswitch_10
    move-object/from16 v0, p1

    check-cast v0, Ltb/a;

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1"

    invoke-interface {v0, v3}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v3

    :try_start_2
    const-string v0, "id"

    invoke-static {v3, v0}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v0

    const-string v4, "state"

    invoke-static {v3, v4}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v4

    const-string v5, "worker_class_name"

    invoke-static {v3, v5}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v5

    const-string v6, "input_merger_class_name"

    invoke-static {v3, v6}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v6

    const-string v8, "input"

    invoke-static {v3, v8}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v8

    const-string v9, "output"

    invoke-static {v3, v9}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v9

    const-string v10, "initial_delay"

    invoke-static {v3, v10}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v10

    const-string v11, "interval_duration"

    invoke-static {v3, v11}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v11

    const-string v12, "flex_duration"

    invoke-static {v3, v12}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v12

    const-string v13, "run_attempt_count"

    invoke-static {v3, v13}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v13

    const-string v14, "backoff_policy"

    invoke-static {v3, v14}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v14

    const-string v15, "backoff_delay_duration"

    invoke-static {v3, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    const-string v2, "last_enqueue_time"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    const-string v7, "minimum_retention_duration"

    invoke-static {v3, v7}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v7

    const-string v1, "schedule_requested_at"

    invoke-static {v3, v1}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v1

    move/from16 p1, v1

    const-string v1, "run_in_foreground"

    invoke-static {v3, v1}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v1

    move/from16 v16, v1

    const-string v1, "out_of_quota_policy"

    invoke-static {v3, v1}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v1

    move/from16 v17, v1

    const-string v1, "period_count"

    invoke-static {v3, v1}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v1

    move/from16 v18, v1

    const-string v1, "generation"

    invoke-static {v3, v1}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v1

    move/from16 v19, v1

    const-string v1, "next_schedule_time_override"

    invoke-static {v3, v1}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v1

    move/from16 v20, v1

    const-string v1, "next_schedule_time_override_generation"

    invoke-static {v3, v1}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v1

    move/from16 v21, v1

    const-string v1, "stop_reason"

    invoke-static {v3, v1}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v1

    move/from16 v22, v1

    const-string v1, "trace_tag"

    invoke-static {v3, v1}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v1

    move/from16 v23, v1

    const-string v1, "backoff_on_system_interruptions"

    invoke-static {v3, v1}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v1

    move/from16 v24, v1

    const-string v1, "required_network_type"

    invoke-static {v3, v1}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v1

    move/from16 v25, v1

    const-string v1, "required_network_request"

    invoke-static {v3, v1}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v1

    move/from16 v26, v1

    const-string v1, "requires_charging"

    invoke-static {v3, v1}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v1

    move/from16 v27, v1

    const-string v1, "requires_device_idle"

    invoke-static {v3, v1}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v1

    move/from16 v28, v1

    const-string v1, "requires_battery_not_low"

    invoke-static {v3, v1}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v1

    move/from16 v29, v1

    const-string v1, "requires_storage_not_low"

    invoke-static {v3, v1}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v1

    move/from16 v30, v1

    const-string v1, "trigger_content_update_delay"

    invoke-static {v3, v1}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v1

    move/from16 v31, v1

    const-string v1, "trigger_max_content_delay"

    invoke-static {v3, v1}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v1

    move/from16 v32, v1

    const-string v1, "content_uri_triggers"

    invoke-static {v3, v1}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v1

    move/from16 v33, v1

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    :goto_4
    invoke-interface {v3}, Ltb/c;->e1()Z

    move-result v34

    if-eqz v34, :cond_c

    invoke-interface {v3, v0}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v36

    move/from16 v34, v0

    move-object/from16 v69, v1

    invoke-interface {v3, v4}, Ltb/c;->getLong(I)J

    move-result-wide v0

    long-to-int v0, v0

    invoke-static {v0}, Lj93/l0;->M(I)Lic/m0;

    move-result-object v37

    invoke-interface {v3, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v38

    invoke-interface {v3, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v39

    invoke-interface {v3, v8}, Ltb/c;->getBlob(I)[B

    move-result-object v0

    sget-object v1, Lic/g;->b:Lic/g;

    invoke-static {v0}, Lpf/c;->t([B)Lic/g;

    move-result-object v40

    invoke-interface {v3, v9}, Ltb/c;->getBlob(I)[B

    move-result-object v0

    invoke-static {v0}, Lpf/c;->t([B)Lic/g;

    move-result-object v41

    invoke-interface {v3, v10}, Ltb/c;->getLong(I)J

    move-result-wide v42

    invoke-interface {v3, v11}, Ltb/c;->getLong(I)J

    move-result-wide v44

    invoke-interface {v3, v12}, Ltb/c;->getLong(I)J

    move-result-wide v46

    invoke-interface {v3, v13}, Ltb/c;->getLong(I)J

    move-result-wide v0

    long-to-int v0, v0

    move/from16 v49, v0

    invoke-interface {v3, v14}, Ltb/c;->getLong(I)J

    move-result-wide v0

    long-to-int v0, v0

    invoke-static {v0}, Lj93/l0;->J(I)Lic/a;

    move-result-object v50

    invoke-interface {v3, v15}, Ltb/c;->getLong(I)J

    move-result-wide v51

    invoke-interface {v3, v2}, Ltb/c;->getLong(I)J

    move-result-wide v53

    invoke-interface {v3, v7}, Ltb/c;->getLong(I)J

    move-result-wide v55

    move/from16 v0, p1

    invoke-interface {v3, v0}, Ltb/c;->getLong(I)J

    move-result-wide v57

    move/from16 p1, v4

    move/from16 v1, v16

    move/from16 v16, v5

    invoke-interface {v3, v1}, Ltb/c;->getLong(I)J

    move-result-wide v4

    long-to-int v4, v4

    if-eqz v4, :cond_3

    const/16 v59, 0x1

    :goto_5
    move v5, v0

    move/from16 v4, v17

    move/from16 v17, v1

    goto :goto_6

    :cond_3
    const/16 v59, 0x0

    goto :goto_5

    :goto_6
    invoke-interface {v3, v4}, Ltb/c;->getLong(I)J

    move-result-wide v0

    long-to-int v0, v0

    invoke-static {v0}, Lj93/l0;->L(I)Lic/i0;

    move-result-object v60

    move/from16 v0, v18

    move/from16 v18, v2

    invoke-interface {v3, v0}, Ltb/c;->getLong(I)J

    move-result-wide v1

    long-to-int v1, v1

    move/from16 v61, v1

    move/from16 v2, v19

    move/from16 v19, v0

    invoke-interface {v3, v2}, Ltb/c;->getLong(I)J

    move-result-wide v0

    long-to-int v0, v0

    move/from16 v1, v20

    invoke-interface {v3, v1}, Ltb/c;->getLong(I)J

    move-result-wide v63

    move/from16 v62, v0

    move/from16 v20, v2

    move/from16 v0, v21

    move/from16 v21, v1

    invoke-interface {v3, v0}, Ltb/c;->getLong(I)J

    move-result-wide v1

    long-to-int v1, v1

    move/from16 v65, v1

    move/from16 v2, v22

    move/from16 v22, v0

    invoke-interface {v3, v2}, Ltb/c;->getLong(I)J

    move-result-wide v0

    long-to-int v0, v0

    move/from16 v1, v23

    invoke-interface {v3, v1}, Ltb/c;->isNull(I)Z

    move-result v23

    const/16 v35, 0x0

    if-eqz v23, :cond_4

    move-object/from16 v67, v35

    :goto_7
    move/from16 v66, v0

    move/from16 v0, v24

    goto :goto_8

    :cond_4
    invoke-interface {v3, v1}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v23

    move-object/from16 v67, v23

    goto :goto_7

    :goto_8
    invoke-interface {v3, v0}, Ltb/c;->isNull(I)Z

    move-result v23

    if-eqz v23, :cond_5

    move/from16 v24, v1

    move/from16 v23, v2

    move-object/from16 v1, v35

    goto :goto_9

    :cond_5
    move/from16 v24, v1

    move/from16 v23, v2

    invoke-interface {v3, v0}, Ltb/c;->getLong(I)J

    move-result-wide v1

    long-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    :goto_9
    if-eqz v1, :cond_7

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    if-eqz v1, :cond_6

    const/4 v1, 0x1

    goto :goto_a

    :cond_6
    const/4 v1, 0x0

    :goto_a
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v35

    :cond_7
    move v2, v4

    move/from16 v1, v25

    move-object/from16 v68, v35

    move/from16 v25, v5

    goto :goto_b

    :catchall_2
    move-exception v0

    goto/16 :goto_14

    :goto_b
    invoke-interface {v3, v1}, Ltb/c;->getLong(I)J

    move-result-wide v4

    long-to-int v4, v4

    invoke-static {v4}, Lj93/l0;->K(I)Lic/x;

    move-result-object v72

    move/from16 v4, v26

    invoke-interface {v3, v4}, Ltb/c;->getBlob(I)[B

    move-result-object v5

    invoke-static {v5}, Lj93/l0;->g0([B)Lrc/e;

    move-result-object v71

    move/from16 v26, v0

    move/from16 v5, v27

    move/from16 v27, v1

    invoke-interface {v3, v5}, Ltb/c;->getLong(I)J

    move-result-wide v0

    long-to-int v0, v0

    if-eqz v0, :cond_8

    const/16 v73, 0x1

    :goto_c
    move/from16 v0, v28

    move/from16 v28, v2

    goto :goto_d

    :cond_8
    const/16 v73, 0x0

    goto :goto_c

    :goto_d
    invoke-interface {v3, v0}, Ltb/c;->getLong(I)J

    move-result-wide v1

    long-to-int v1, v1

    if-eqz v1, :cond_9

    const/16 v74, 0x1

    :goto_e
    move v2, v4

    move/from16 v1, v29

    move/from16 v29, v5

    goto :goto_f

    :cond_9
    const/16 v74, 0x0

    goto :goto_e

    :goto_f
    invoke-interface {v3, v1}, Ltb/c;->getLong(I)J

    move-result-wide v4

    long-to-int v4, v4

    if-eqz v4, :cond_a

    const/16 v75, 0x1

    :goto_10
    move v5, v0

    move/from16 v4, v30

    move/from16 v30, v1

    goto :goto_11

    :cond_a
    const/16 v75, 0x0

    goto :goto_10

    :goto_11
    invoke-interface {v3, v4}, Ltb/c;->getLong(I)J

    move-result-wide v0

    long-to-int v0, v0

    if-eqz v0, :cond_b

    const/16 v76, 0x1

    :goto_12
    move/from16 v0, v31

    goto :goto_13

    :cond_b
    const/16 v76, 0x0

    goto :goto_12

    :goto_13
    invoke-interface {v3, v0}, Ltb/c;->getLong(I)J

    move-result-wide v77

    move/from16 v1, v32

    invoke-interface {v3, v1}, Ltb/c;->getLong(I)J

    move-result-wide v79

    move/from16 v31, v0

    move/from16 v0, v33

    invoke-interface {v3, v0}, Ltb/c;->getBlob(I)[B

    move-result-object v32

    invoke-static/range {v32 .. v32}, Lj93/l0;->m([B)Ljava/util/LinkedHashSet;

    move-result-object v81

    new-instance v48, Lic/e;

    move-object/from16 v70, v48

    invoke-direct/range {v70 .. v81}, Lic/e;-><init>(Lrc/e;Lic/x;ZZZZJJLjava/util/Set;)V

    move-object/from16 v48, v70

    new-instance v35, Lqc/q;

    invoke-direct/range {v35 .. v68}, Lqc/q;-><init>(Ljava/lang/String;Lic/m0;Ljava/lang/String;Ljava/lang/String;Lic/g;Lic/g;JJJLic/e;ILic/a;JJJJZLic/i0;IIJIILjava/lang/String;Ljava/lang/Boolean;)V

    move/from16 v33, v0

    move-object/from16 v0, v35

    move/from16 v32, v1

    move-object/from16 v1, v69

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    move v0, v4

    move/from16 v4, p1

    move/from16 p1, v25

    move/from16 v25, v27

    move/from16 v27, v29

    move/from16 v29, v30

    move/from16 v30, v0

    move/from16 v0, v26

    move/from16 v26, v2

    move/from16 v2, v18

    move/from16 v18, v19

    move/from16 v19, v20

    move/from16 v20, v21

    move/from16 v21, v22

    move/from16 v22, v23

    move/from16 v23, v24

    move/from16 v24, v0

    move/from16 v0, v28

    move/from16 v28, v5

    move/from16 v5, v16

    move/from16 v16, v17

    move/from16 v17, v0

    move/from16 v0, v34

    goto/16 :goto_4

    :cond_c
    invoke-interface {v3}, Ljava/lang/AutoCloseable;->close()V

    return-object v1

    :goto_14
    invoke-interface {v3}, Ljava/lang/AutoCloseable;->close()V

    throw v0

    :pswitch_11
    move-object/from16 v0, p1

    check-cast v0, Lcom/whoop/design/models/items/circularprogressindicator/CircularProgressIndicatorModel;

    invoke-static {v0}, Lqb1/a;->a(Lcom/whoop/design/models/items/circularprogressindicator/CircularProgressIndicatorModel;)Lp01/b;

    move-result-object v0

    return-object v0

    :pswitch_12
    move-object/from16 v0, p1

    check-cast v0, Llb1/z0;

    invoke-static {v0}, Lqb1/a;->b(Llb1/z0;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_13
    move-object/from16 v0, p1

    check-cast v0, Lpb0/c;

    invoke-static {v0}, Lqb0/b;->e(Lpb0/c;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_14
    move-object/from16 v0, p1

    check-cast v0, Lob0/a;

    invoke-static {v0}, Lqb0/b;->f(Lob0/a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_15
    move-object/from16 v0, p1

    check-cast v0, Lpb0/c;

    invoke-static {v0}, Lqb0/b;->d(Lpb0/c;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_16
    move-object/from16 v0, p1

    check-cast v0, Lob0/a;

    invoke-static {v0}, Lqb0/b;->a(Lob0/a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_17
    move-object/from16 v0, p1

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lq81/b;->a(I)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_18
    move-object/from16 v0, p1

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lq80/l;->a(Ljava/lang/String;)Lj80/a;

    move-result-object v0

    return-object v0

    :pswitch_19
    move-object/from16 v0, p1

    check-cast v0, Lh80/b;

    invoke-static {v0}, Lq80/i;->l(Lh80/b;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1a
    move-object/from16 v0, p1

    check-cast v0, Lc93/a;

    invoke-static {v0}, Lq80/i;->i(Lc93/a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1b
    move-object/from16 v0, p1

    check-cast v0, Ll80/o;

    invoke-static {v0}, Lq80/i;->k(Ll80/o;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1c
    move-object/from16 v0, p1

    check-cast v0, Lj80/b;

    invoke-static {v0}, Lq80/i;->j(Lj80/b;)Ll83/a0;

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
