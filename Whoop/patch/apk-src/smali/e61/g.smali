.class public final synthetic Le61/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;I)V
    .locals 0

    iput p2, p0, Le61/g;->w:I

    iput-object p1, p0, Le61/g;->x:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 80

    move-object/from16 v1, p0

    iget v0, v1, Le61/g;->w:I

    const-string v2, "id"

    const/4 v3, 0x5

    const/4 v5, 0x0

    sget-object v6, Ll83/a0;->a:Ll83/a0;

    const/4 v7, 0x1

    const-string v8, "_connection"

    iget-object v9, v1, Le61/g;->x:Ljava/lang/String;

    packed-switch v0, :pswitch_data_0

    move-object/from16 v0, p1

    check-cast v0, Li3/z;

    invoke-static {v9, v0}, Lw61/a;->a(Ljava/lang/String;Li3/z;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    move-object/from16 v0, p1

    check-cast v0, Ltb/a;

    invoke-static {v9, v0}, Ltr2/g;->j(Ljava/lang/String;Ltb/a;)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_1
    move-object/from16 v0, p1

    check-cast v0, Li3/z;

    invoke-static {v9, v0}, Lt61/c;->b(Ljava/lang/String;Li3/z;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_2
    move-object/from16 v0, p1

    check-cast v0, Ltb/a;

    invoke-static {v0, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "DELETE FROM worktag WHERE work_spec_id=?"

    invoke-interface {v0, v2}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v2

    :try_start_0
    invoke-interface {v2, v7, v9}, Ltb/c;->L(ILjava/lang/String;)V

    invoke-interface {v2}, Ltb/c;->e1()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v2}, Ljava/lang/AutoCloseable;->close()V

    return-object v6

    :catchall_0
    move-exception v0

    invoke-interface {v2}, Ljava/lang/AutoCloseable;->close()V

    throw v0

    :pswitch_3
    move-object/from16 v0, p1

    check-cast v0, Ltb/a;

    invoke-static {v0, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?"

    invoke-interface {v0, v2}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v2

    :try_start_1
    invoke-interface {v2, v7, v9}, Ltb/c;->L(ILjava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    invoke-interface {v2}, Ltb/c;->e1()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    goto :goto_1

    :cond_0
    invoke-interface {v2}, Ljava/lang/AutoCloseable;->close()V

    return-object v0

    :goto_1
    invoke-interface {v2}, Ljava/lang/AutoCloseable;->close()V

    throw v0

    :pswitch_4
    move-object/from16 v0, p1

    check-cast v0, Ltb/a;

    invoke-static {v0, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)"

    invoke-interface {v0, v3}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v3

    :try_start_2
    invoke-interface {v3, v7, v9}, Ltb/c;->L(ILjava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :goto_2
    invoke-interface {v3}, Ltb/c;->e1()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v7}, Ltb/c;->getLong(I)J

    move-result-wide v8

    long-to-int v6, v8

    invoke-static {v6}, Lj93/l0;->M(I)Lic/m0;

    move-result-object v6

    new-instance v8, Lqc/o;

    invoke-static {v4, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    iput-object v4, v8, Lqc/o;->a:Ljava/lang/String;

    iput-object v6, v8, Lqc/o;->b:Lic/m0;

    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_2

    :catchall_2
    move-exception v0

    goto :goto_3

    :cond_1
    invoke-interface {v3}, Ljava/lang/AutoCloseable;->close()V

    return-object v0

    :goto_3
    invoke-interface {v3}, Ljava/lang/AutoCloseable;->close()V

    throw v0

    :pswitch_5
    move-object/from16 v0, p1

    check-cast v0, Ltb/a;

    invoke-static {v0, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "DELETE FROM workspec WHERE id=?"

    invoke-interface {v0, v2}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v2

    :try_start_3
    invoke-interface {v2, v7, v9}, Ltb/c;->L(ILjava/lang/String;)V

    invoke-interface {v2}, Ltb/c;->e1()Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    invoke-interface {v2}, Ljava/lang/AutoCloseable;->close()V

    return-object v6

    :catchall_3
    move-exception v0

    invoke-interface {v2}, Ljava/lang/AutoCloseable;->close()V

    throw v0

    :pswitch_6
    move-object/from16 v0, p1

    check-cast v0, Ltb/a;

    invoke-static {v0, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?"

    invoke-interface {v0, v2}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v2

    :try_start_4
    invoke-interface {v2, v7, v9}, Ltb/c;->L(ILjava/lang/String;)V

    invoke-interface {v2}, Ltb/c;->e1()Z

    invoke-static {v0}, Lj93/l0;->H(Ltb/a;)I

    move-result v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    invoke-interface {v2}, Ljava/lang/AutoCloseable;->close()V

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :catchall_4
    move-exception v0

    invoke-interface {v2}, Ljava/lang/AutoCloseable;->close()V

    throw v0

    :pswitch_7
    move-object/from16 v0, p1

    check-cast v0, Ltb/a;

    invoke-static {v0, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)"

    invoke-interface {v0, v2}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v2

    :try_start_5
    invoke-interface {v2, v7, v9}, Ltb/c;->L(ILjava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :goto_4
    invoke-interface {v2}, Ltb/c;->e1()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2, v5}, Ltb/c;->getBlob(I)[B

    move-result-object v3

    sget-object v4, Lic/g;->b:Lic/g;

    invoke-static {v3}, Lpf/c;->t([B)Lic/g;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    goto :goto_4

    :catchall_5
    move-exception v0

    goto :goto_5

    :cond_2
    invoke-interface {v2}, Ljava/lang/AutoCloseable;->close()V

    return-object v0

    :goto_5
    invoke-interface {v2}, Ljava/lang/AutoCloseable;->close()V

    throw v0

    :pswitch_8
    move-object/from16 v0, p1

    check-cast v0, Ltb/a;

    invoke-static {v0, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "UPDATE workspec SET period_count=period_count+1 WHERE id=?"

    invoke-interface {v0, v2}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v2

    :try_start_6
    invoke-interface {v2, v7, v9}, Ltb/c;->L(ILjava/lang/String;)V

    invoke-interface {v2}, Ltb/c;->e1()Z
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    invoke-interface {v2}, Ljava/lang/AutoCloseable;->close()V

    return-object v6

    :catchall_6
    move-exception v0

    invoke-interface {v2}, Ljava/lang/AutoCloseable;->close()V

    throw v0

    :pswitch_9
    move-object/from16 v0, p1

    check-cast v0, Ltb/a;

    invoke-static {v0, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "UPDATE workspec SET run_attempt_count=0 WHERE id=?"

    invoke-interface {v0, v2}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v2

    :try_start_7
    invoke-interface {v2, v7, v9}, Ltb/c;->L(ILjava/lang/String;)V

    invoke-interface {v2}, Ltb/c;->e1()Z

    invoke-static {v0}, Lj93/l0;->H(Ltb/a;)I

    move-result v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    invoke-interface {v2}, Ljava/lang/AutoCloseable;->close()V

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :catchall_7
    move-exception v0

    invoke-interface {v2}, Ljava/lang/AutoCloseable;->close()V

    throw v0

    :pswitch_a
    move-object/from16 v0, p1

    check-cast v0, Ltb/a;

    invoke-static {v0, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)"

    invoke-interface {v0, v2}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v2

    :try_start_8
    invoke-interface {v2, v7, v9}, Ltb/c;->L(ILjava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :goto_6
    invoke-interface {v2}, Ltb/c;->e1()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v2, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_8

    goto :goto_6

    :catchall_8
    move-exception v0

    goto :goto_7

    :cond_3
    invoke-interface {v2}, Ljava/lang/AutoCloseable;->close()V

    return-object v0

    :goto_7
    invoke-interface {v2}, Ljava/lang/AutoCloseable;->close()V

    throw v0

    :pswitch_b
    move-object/from16 v0, p1

    check-cast v0, Ltb/a;

    invoke-static {v0, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "SELECT state FROM workspec WHERE id=?"

    invoke-interface {v0, v2}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v2

    :try_start_9
    invoke-interface {v2, v7, v9}, Ltb/c;->L(ILjava/lang/String;)V

    invoke-interface {v2}, Ltb/c;->e1()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v2, v5}, Ltb/c;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v0, 0x0

    goto :goto_8

    :cond_4
    invoke-interface {v2, v5}, Ltb/c;->getLong(I)J

    move-result-wide v5

    long-to-int v0, v5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    :goto_8
    if-nez v0, :cond_6

    :cond_5
    const/4 v4, 0x0

    goto :goto_9

    :cond_6
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lj93/l0;->M(I)Lic/m0;

    move-result-object v4
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_9

    goto :goto_9

    :catchall_9
    move-exception v0

    goto :goto_a

    :goto_9
    invoke-interface {v2}, Ljava/lang/AutoCloseable;->close()V

    return-object v4

    :goto_a
    invoke-interface {v2}, Ljava/lang/AutoCloseable;->close()V

    throw v0

    :pswitch_c
    move-object/from16 v0, p1

    check-cast v0, Ltb/a;

    invoke-static {v0, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "SELECT * FROM workspec WHERE id=?"

    invoke-interface {v0, v3}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v3

    :try_start_a
    invoke-interface {v3, v7, v9}, Ltb/c;->L(ILjava/lang/String;)V

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v0

    const-string v2, "state"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    const-string v6, "worker_class_name"

    invoke-static {v3, v6}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v6

    const-string v8, "input_merger_class_name"

    invoke-static {v3, v8}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v8

    const-string v9, "input"

    invoke-static {v3, v9}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v9

    const-string v10, "output"

    invoke-static {v3, v10}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v10

    const-string v11, "initial_delay"

    invoke-static {v3, v11}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v11

    const-string v12, "interval_duration"

    invoke-static {v3, v12}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v12

    const-string v13, "flex_duration"

    invoke-static {v3, v13}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v13

    const-string v14, "run_attempt_count"

    invoke-static {v3, v14}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v14

    const-string v15, "backoff_policy"

    invoke-static {v3, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    const-string v4, "backoff_delay_duration"

    invoke-static {v3, v4}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v4

    const-string v5, "last_enqueue_time"

    invoke-static {v3, v5}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v5

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

    invoke-interface {v3}, Ltb/c;->e1()Z

    move-result v33

    if-eqz v33, :cond_10

    invoke-interface {v3, v0}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v35

    move/from16 v33, v1

    invoke-interface {v3, v2}, Ltb/c;->getLong(I)J

    move-result-wide v0

    long-to-int v0, v0

    invoke-static {v0}, Lj93/l0;->M(I)Lic/m0;

    move-result-object v36

    invoke-interface {v3, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v37

    invoke-interface {v3, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v38

    invoke-interface {v3, v9}, Ltb/c;->getBlob(I)[B

    move-result-object v0

    sget-object v1, Lic/g;->b:Lic/g;

    invoke-static {v0}, Lpf/c;->t([B)Lic/g;

    move-result-object v39

    invoke-interface {v3, v10}, Ltb/c;->getBlob(I)[B

    move-result-object v0

    invoke-static {v0}, Lpf/c;->t([B)Lic/g;

    move-result-object v40

    invoke-interface {v3, v11}, Ltb/c;->getLong(I)J

    move-result-wide v41

    invoke-interface {v3, v12}, Ltb/c;->getLong(I)J

    move-result-wide v43

    invoke-interface {v3, v13}, Ltb/c;->getLong(I)J

    move-result-wide v45

    invoke-interface {v3, v14}, Ltb/c;->getLong(I)J

    move-result-wide v0

    long-to-int v0, v0

    invoke-interface {v3, v15}, Ltb/c;->getLong(I)J

    move-result-wide v1

    long-to-int v1, v1

    invoke-static {v1}, Lj93/l0;->J(I)Lic/a;

    move-result-object v49

    invoke-interface {v3, v4}, Ltb/c;->getLong(I)J

    move-result-wide v50

    invoke-interface {v3, v5}, Ltb/c;->getLong(I)J

    move-result-wide v52

    invoke-interface {v3, v7}, Ltb/c;->getLong(I)J

    move-result-wide v54

    move/from16 v1, p1

    invoke-interface {v3, v1}, Ltb/c;->getLong(I)J

    move-result-wide v56

    move/from16 v1, v16

    invoke-interface {v3, v1}, Ltb/c;->getLong(I)J

    move-result-wide v1

    long-to-int v1, v1

    if-eqz v1, :cond_7

    const/16 v58, 0x1

    :goto_b
    move/from16 v1, v17

    goto :goto_c

    :cond_7
    const/16 v58, 0x0

    goto :goto_b

    :goto_c
    invoke-interface {v3, v1}, Ltb/c;->getLong(I)J

    move-result-wide v1

    long-to-int v1, v1

    invoke-static {v1}, Lj93/l0;->L(I)Lic/i0;

    move-result-object v59

    move/from16 v1, v18

    invoke-interface {v3, v1}, Ltb/c;->getLong(I)J

    move-result-wide v1

    long-to-int v1, v1

    move/from16 v2, v19

    invoke-interface {v3, v2}, Ltb/c;->getLong(I)J

    move-result-wide v4

    long-to-int v2, v4

    move/from16 v4, v20

    invoke-interface {v3, v4}, Ltb/c;->getLong(I)J

    move-result-wide v62

    move/from16 v4, v21

    invoke-interface {v3, v4}, Ltb/c;->getLong(I)J

    move-result-wide v4

    long-to-int v4, v4

    move/from16 v5, v22

    invoke-interface {v3, v5}, Ltb/c;->getLong(I)J

    move-result-wide v5

    long-to-int v5, v5

    move/from16 v6, v23

    invoke-interface {v3, v6}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_8

    const/16 v66, 0x0

    :goto_d
    move/from16 v6, v24

    goto :goto_e

    :cond_8
    invoke-interface {v3, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v6

    move-object/from16 v66, v6

    goto :goto_d

    :goto_e
    invoke-interface {v3, v6}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_9

    const/4 v6, 0x0

    goto :goto_f

    :cond_9
    invoke-interface {v3, v6}, Ltb/c;->getLong(I)J

    move-result-wide v6

    long-to-int v6, v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    :goto_f
    if-eqz v6, :cond_b

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    move-result v6

    if-eqz v6, :cond_a

    const/4 v6, 0x1

    goto :goto_10

    :cond_a
    const/4 v6, 0x0

    :goto_10
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    move-object/from16 v67, v6

    :goto_11
    move/from16 v6, v25

    goto :goto_12

    :catchall_a
    move-exception v0

    goto/16 :goto_1c

    :cond_b
    const/16 v67, 0x0

    goto :goto_11

    :goto_12
    invoke-interface {v3, v6}, Ltb/c;->getLong(I)J

    move-result-wide v6

    long-to-int v6, v6

    invoke-static {v6}, Lj93/l0;->K(I)Lic/x;

    move-result-object v70

    move/from16 v6, v26

    invoke-interface {v3, v6}, Ltb/c;->getBlob(I)[B

    move-result-object v6

    invoke-static {v6}, Lj93/l0;->g0([B)Lrc/e;

    move-result-object v69

    move/from16 v6, v27

    invoke-interface {v3, v6}, Ltb/c;->getLong(I)J

    move-result-wide v6

    long-to-int v6, v6

    if-eqz v6, :cond_c

    const/16 v71, 0x1

    :goto_13
    move/from16 v6, v28

    goto :goto_14

    :cond_c
    const/16 v71, 0x0

    goto :goto_13

    :goto_14
    invoke-interface {v3, v6}, Ltb/c;->getLong(I)J

    move-result-wide v6

    long-to-int v6, v6

    if-eqz v6, :cond_d

    const/16 v72, 0x1

    :goto_15
    move/from16 v6, v29

    goto :goto_16

    :cond_d
    const/16 v72, 0x0

    goto :goto_15

    :goto_16
    invoke-interface {v3, v6}, Ltb/c;->getLong(I)J

    move-result-wide v6

    long-to-int v6, v6

    if-eqz v6, :cond_e

    const/16 v73, 0x1

    :goto_17
    move/from16 v6, v30

    goto :goto_18

    :cond_e
    const/16 v73, 0x0

    goto :goto_17

    :goto_18
    invoke-interface {v3, v6}, Ltb/c;->getLong(I)J

    move-result-wide v6

    long-to-int v6, v6

    if-eqz v6, :cond_f

    const/16 v74, 0x1

    :goto_19
    move/from16 v6, v31

    goto :goto_1a

    :cond_f
    const/16 v74, 0x0

    goto :goto_19

    :goto_1a
    invoke-interface {v3, v6}, Ltb/c;->getLong(I)J

    move-result-wide v75

    move/from16 v6, v32

    invoke-interface {v3, v6}, Ltb/c;->getLong(I)J

    move-result-wide v77

    move/from16 v6, v33

    invoke-interface {v3, v6}, Ltb/c;->getBlob(I)[B

    move-result-object v6

    invoke-static {v6}, Lj93/l0;->m([B)Ljava/util/LinkedHashSet;

    move-result-object v79

    new-instance v47, Lic/e;

    move-object/from16 v68, v47

    invoke-direct/range {v68 .. v79}, Lic/e;-><init>(Lrc/e;Lic/x;ZZZZJJLjava/util/Set;)V

    move-object/from16 v47, v68

    new-instance v34, Lqc/q;

    move/from16 v48, v0

    move/from16 v60, v1

    move/from16 v61, v2

    move/from16 v64, v4

    move/from16 v65, v5

    invoke-direct/range {v34 .. v67}, Lqc/q;-><init>(Ljava/lang/String;Lic/m0;Ljava/lang/String;Ljava/lang/String;Lic/g;Lic/g;JJJLic/e;ILic/a;JJJJZLic/i0;IIJIILjava/lang/String;Ljava/lang/Boolean;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_a

    move-object/from16 v4, v34

    goto :goto_1b

    :cond_10
    const/4 v4, 0x0

    :goto_1b
    invoke-interface {v3}, Ljava/lang/AutoCloseable;->close()V

    return-object v4

    :goto_1c
    invoke-interface {v3}, Ljava/lang/AutoCloseable;->close()V

    throw v0

    :pswitch_d
    move-object/from16 v0, p1

    check-cast v0, Ltb/a;

    invoke-static {v0, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "DELETE from WorkProgress where work_spec_id=?"

    invoke-interface {v0, v1}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v1

    const/4 v0, 0x1

    :try_start_b
    invoke-interface {v1, v0, v9}, Ltb/c;->L(ILjava/lang/String;)V

    invoke-interface {v1}, Ltb/c;->e1()Z
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_b

    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    return-object v6

    :catchall_b
    move-exception v0

    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    throw v0

    :pswitch_e
    move-object/from16 v0, p1

    check-cast v0, Ltb/a;

    invoke-static {v0, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "DELETE FROM SystemIdInfo where work_spec_id=?"

    invoke-interface {v0, v1}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v1

    const/4 v0, 0x1

    :try_start_c
    invoke-interface {v1, v0, v9}, Ltb/c;->L(ILjava/lang/String;)V

    invoke-interface {v1}, Ltb/c;->e1()Z
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_c

    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    return-object v6

    :catchall_c
    move-exception v0

    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    throw v0

    :pswitch_f
    move-object/from16 v0, p1

    check-cast v0, Ltb/a;

    invoke-static {v0, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "SELECT long_value FROM Preference where `key`=?"

    invoke-interface {v0, v1}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v1

    const/4 v0, 0x1

    :try_start_d
    invoke-interface {v1, v0, v9}, Ltb/c;->L(ILjava/lang/String;)V

    invoke-interface {v1}, Ltb/c;->e1()Z

    move-result v0

    if-eqz v0, :cond_11

    const/4 v0, 0x0

    invoke-interface {v1, v0}, Ltb/c;->isNull(I)Z

    move-result v2

    if-eqz v2, :cond_12

    :cond_11
    const/4 v4, 0x0

    goto :goto_1d

    :cond_12
    invoke-interface {v1, v0}, Ltb/c;->getLong(I)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_d

    goto :goto_1d

    :catchall_d
    move-exception v0

    goto :goto_1e

    :goto_1d
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    return-object v4

    :goto_1e
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    throw v0

    :pswitch_10
    move-object/from16 v0, p1

    check-cast v0, Ltb/a;

    invoke-static {v0, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?"

    invoke-interface {v0, v1}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v1

    const/4 v0, 0x1

    :try_start_e
    invoke-interface {v1, v0, v9}, Ltb/c;->L(ILjava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :goto_1f
    invoke-interface {v1}, Ltb/c;->e1()Z

    move-result v2

    if-eqz v2, :cond_13

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_e

    goto :goto_1f

    :catchall_e
    move-exception v0

    goto :goto_20

    :cond_13
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    return-object v0

    :goto_20
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    throw v0

    :pswitch_11
    move-object/from16 v0, p1

    check-cast v0, Li3/z;

    invoke-static {v9, v0}, Li3/w;->e(Ljava/lang/String;Li3/z;)V

    invoke-static {v0, v3}, Li3/w;->i(Li3/z;I)V

    return-object v6

    :pswitch_12
    move-object/from16 v0, p1

    check-cast v0, Ltb/a;

    invoke-static {v9, v0}, Ljx0/e;->h(Ljava/lang/String;Ltb/a;)Ljx0/a;

    move-result-object v0

    return-object v0

    :pswitch_13
    move-object/from16 v0, p1

    check-cast v0, Li3/z;

    invoke-static {v9, v0}, Li3/w;->e(Ljava/lang/String;Li3/z;)V

    invoke-static {v0, v3}, Li3/w;->i(Li3/z;I)V

    return-object v6

    :pswitch_14
    move-object/from16 v0, p1

    check-cast v0, Li3/z;

    invoke-static {v9, v0}, Li3/w;->e(Ljava/lang/String;Li3/z;)V

    invoke-static {v0, v3}, Li3/w;->i(Li3/z;I)V

    return-object v6

    :pswitch_15
    move-object/from16 v0, p1

    check-cast v0, Li3/z;

    invoke-static {v9, v0}, Le61/h;->d(Ljava/lang/String;Li3/z;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
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
