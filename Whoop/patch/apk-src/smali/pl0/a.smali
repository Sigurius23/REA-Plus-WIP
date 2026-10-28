.class public final synthetic Lpl0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lpl0/a;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 84

    move-object/from16 v1, p0

    iget v2, v1, Lpl0/a;->w:I

    const-string v3, "period_count"

    const-string v4, "out_of_quota_policy"

    const-string v5, "run_in_foreground"

    const-string v6, "schedule_requested_at"

    const-string v7, "minimum_retention_duration"

    const-string v8, "last_enqueue_time"

    const-string v9, "backoff_delay_duration"

    const-string v10, "backoff_policy"

    const-string v11, "run_attempt_count"

    const-string v12, "flex_duration"

    const-string v13, "interval_duration"

    const-string v14, "initial_delay"

    const-string v15, "output"

    const-string v1, "input"

    move/from16 v16, v2

    const-string v2, "input_merger_class_name"

    const-string v0, "worker_class_name"

    move-object/from16 v17, v3

    const-string v3, "state"

    move-object/from16 v18, v4

    const-string v4, "id"

    move-object/from16 v19, v5

    const-string v5, "_connection"

    packed-switch v16, :pswitch_data_0

    move-object/from16 v0, p1

    check-cast v0, Ltb/a;

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)"

    invoke-interface {v0, v1}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v1

    :try_start_0
    invoke-interface {v1}, Ltb/c;->e1()Z

    invoke-static {v0}, Lj93/l0;->H(Ltb/a;)I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :catchall_0
    move-exception v0

    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    throw v0

    :pswitch_0
    move-object/from16 v16, v6

    move-object/from16 v6, p1

    check-cast v6, Ltb/a;

    invoke-static {v6, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?"

    invoke-interface {v6, v5}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v5

    const/16 v6, 0xc8

    move-object/from16 v20, v7

    int-to-long v6, v6

    move-object/from16 v21, v8

    const/4 v8, 0x1

    :try_start_1
    invoke-interface {v5, v8, v6, v7}, Ltb/c;->p(IJ)V

    invoke-static {v5, v4}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v4

    invoke-static {v5, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    invoke-static {v5, v0}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v0

    invoke-static {v5, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    invoke-static {v5, v1}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v1

    invoke-static {v5, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v6

    invoke-static {v5, v14}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v7

    invoke-static {v5, v13}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v8

    invoke-static {v5, v12}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v12

    invoke-static {v5, v11}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v11

    invoke-static {v5, v10}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v10

    invoke-static {v5, v9}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v9

    move-object/from16 v13, v21

    invoke-static {v5, v13}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v13

    move-object/from16 v14, v20

    invoke-static {v5, v14}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v14

    move-object/from16 v15, v16

    invoke-static {v5, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 p1, v15

    move-object/from16 v15, v19

    invoke-static {v5, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 v16, v15

    move-object/from16 v15, v18

    invoke-static {v5, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 v18, v15

    move-object/from16 v15, v17

    invoke-static {v5, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 v17, v15

    const-string v15, "generation"

    invoke-static {v5, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 v19, v15

    const-string v15, "next_schedule_time_override"

    invoke-static {v5, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 v20, v15

    const-string v15, "next_schedule_time_override_generation"

    invoke-static {v5, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 v21, v15

    const-string v15, "stop_reason"

    invoke-static {v5, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 v22, v15

    const-string v15, "trace_tag"

    invoke-static {v5, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 v23, v15

    const-string v15, "backoff_on_system_interruptions"

    invoke-static {v5, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 v24, v15

    const-string v15, "required_network_type"

    invoke-static {v5, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 v25, v15

    const-string v15, "required_network_request"

    invoke-static {v5, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 v26, v15

    const-string v15, "requires_charging"

    invoke-static {v5, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 v27, v15

    const-string v15, "requires_device_idle"

    invoke-static {v5, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 v28, v15

    const-string v15, "requires_battery_not_low"

    invoke-static {v5, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 v29, v15

    const-string v15, "requires_storage_not_low"

    invoke-static {v5, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 v30, v15

    const-string v15, "trigger_content_update_delay"

    invoke-static {v5, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 v31, v15

    const-string v15, "trigger_max_content_delay"

    invoke-static {v5, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 v32, v15

    const-string v15, "content_uri_triggers"

    invoke-static {v5, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 v33, v15

    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    invoke-interface {v5}, Ltb/c;->e1()Z

    move-result v34

    if-eqz v34, :cond_9

    invoke-interface {v5, v4}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v36

    move/from16 v34, v14

    move-object/from16 v69, v15

    invoke-interface {v5, v3}, Ltb/c;->getLong(I)J

    move-result-wide v14

    long-to-int v14, v14

    invoke-static {v14}, Lj93/l0;->M(I)Lic/m0;

    move-result-object v37

    invoke-interface {v5, v0}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v38

    invoke-interface {v5, v2}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v39

    invoke-interface {v5, v1}, Ltb/c;->getBlob(I)[B

    move-result-object v14

    sget-object v15, Lic/g;->b:Lic/g;

    invoke-static {v14}, Lpf/c;->t([B)Lic/g;

    move-result-object v40

    invoke-interface {v5, v6}, Ltb/c;->getBlob(I)[B

    move-result-object v14

    invoke-static {v14}, Lpf/c;->t([B)Lic/g;

    move-result-object v41

    invoke-interface {v5, v7}, Ltb/c;->getLong(I)J

    move-result-wide v42

    invoke-interface {v5, v8}, Ltb/c;->getLong(I)J

    move-result-wide v44

    invoke-interface {v5, v12}, Ltb/c;->getLong(I)J

    move-result-wide v46

    invoke-interface {v5, v11}, Ltb/c;->getLong(I)J

    move-result-wide v14

    long-to-int v14, v14

    move/from16 v70, v0

    move/from16 v71, v1

    invoke-interface {v5, v10}, Ltb/c;->getLong(I)J

    move-result-wide v0

    long-to-int v0, v0

    invoke-static {v0}, Lj93/l0;->J(I)Lic/a;

    move-result-object v50

    invoke-interface {v5, v9}, Ltb/c;->getLong(I)J

    move-result-wide v51

    invoke-interface {v5, v13}, Ltb/c;->getLong(I)J

    move-result-wide v53

    move/from16 v0, v34

    invoke-interface {v5, v0}, Ltb/c;->getLong(I)J

    move-result-wide v55

    move/from16 v1, p1

    invoke-interface {v5, v1}, Ltb/c;->getLong(I)J

    move-result-wide v57

    move/from16 v34, v0

    move/from16 p1, v1

    move/from16 v15, v16

    invoke-interface {v5, v15}, Ltb/c;->getLong(I)J

    move-result-wide v0

    long-to-int v0, v0

    if-eqz v0, :cond_0

    const/16 v59, 0x1

    :goto_1
    move/from16 v16, v2

    move/from16 v0, v18

    goto :goto_2

    :cond_0
    const/16 v59, 0x0

    goto :goto_1

    :goto_2
    invoke-interface {v5, v0}, Ltb/c;->getLong(I)J

    move-result-wide v1

    long-to-int v1, v1

    invoke-static {v1}, Lj93/l0;->L(I)Lic/i0;

    move-result-object v60

    move/from16 v1, v17

    move/from16 v17, v3

    invoke-interface {v5, v1}, Ltb/c;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    move/from16 v18, v0

    move/from16 v3, v19

    move/from16 v19, v1

    invoke-interface {v5, v3}, Ltb/c;->getLong(I)J

    move-result-wide v0

    long-to-int v0, v0

    move/from16 v1, v20

    invoke-interface {v5, v1}, Ltb/c;->getLong(I)J

    move-result-wide v63

    move/from16 v62, v0

    move/from16 v61, v2

    move/from16 v0, v21

    invoke-interface {v5, v0}, Ltb/c;->getLong(I)J

    move-result-wide v1

    long-to-int v1, v1

    move/from16 v21, v0

    move/from16 v65, v1

    move/from16 v2, v22

    invoke-interface {v5, v2}, Ltb/c;->getLong(I)J

    move-result-wide v0

    long-to-int v0, v0

    move/from16 v1, v23

    invoke-interface {v5, v1}, Ltb/c;->isNull(I)Z

    move-result v22

    if-eqz v22, :cond_1

    const/16 v67, 0x0

    :goto_3
    move/from16 v66, v0

    move/from16 v0, v24

    goto :goto_4

    :cond_1
    invoke-interface {v5, v1}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v22

    move-object/from16 v67, v22

    goto :goto_3

    :goto_4
    invoke-interface {v5, v0}, Ltb/c;->isNull(I)Z

    move-result v22

    if-eqz v22, :cond_2

    move/from16 v23, v1

    move/from16 v22, v2

    const/4 v1, 0x0

    goto :goto_5

    :cond_2
    move/from16 v23, v1

    move/from16 v22, v2

    invoke-interface {v5, v0}, Ltb/c;->getLong(I)J

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

    move-result-object v1

    move-object/from16 v68, v1

    :goto_7
    move/from16 v24, v3

    move/from16 v1, v25

    goto :goto_8

    :catchall_1
    move-exception v0

    goto/16 :goto_11

    :cond_4
    const/16 v68, 0x0

    goto :goto_7

    :goto_8
    invoke-interface {v5, v1}, Ltb/c;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    invoke-static {v2}, Lj93/l0;->K(I)Lic/x;

    move-result-object v74

    move/from16 v2, v26

    invoke-interface {v5, v2}, Ltb/c;->getBlob(I)[B

    move-result-object v3

    invoke-static {v3}, Lj93/l0;->g0([B)Lrc/e;

    move-result-object v73

    move/from16 v25, v0

    move/from16 v26, v1

    move/from16 v3, v27

    invoke-interface {v5, v3}, Ltb/c;->getLong(I)J

    move-result-wide v0

    long-to-int v0, v0

    if-eqz v0, :cond_5

    const/16 v75, 0x1

    :goto_9
    move/from16 v27, v2

    move/from16 v0, v28

    goto :goto_a

    :cond_5
    const/16 v75, 0x0

    goto :goto_9

    :goto_a
    invoke-interface {v5, v0}, Ltb/c;->getLong(I)J

    move-result-wide v1

    long-to-int v1, v1

    if-eqz v1, :cond_6

    const/16 v76, 0x1

    :goto_b
    move/from16 v28, v3

    move/from16 v1, v29

    goto :goto_c

    :cond_6
    const/16 v76, 0x0

    goto :goto_b

    :goto_c
    invoke-interface {v5, v1}, Ltb/c;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    if-eqz v2, :cond_7

    const/16 v77, 0x1

    :goto_d
    move v3, v0

    move/from16 v29, v1

    move/from16 v2, v30

    goto :goto_e

    :cond_7
    const/16 v77, 0x0

    goto :goto_d

    :goto_e
    invoke-interface {v5, v2}, Ltb/c;->getLong(I)J

    move-result-wide v0

    long-to-int v0, v0

    if-eqz v0, :cond_8

    const/16 v78, 0x1

    :goto_f
    move/from16 v0, v31

    goto :goto_10

    :cond_8
    const/16 v78, 0x0

    goto :goto_f

    :goto_10
    invoke-interface {v5, v0}, Ltb/c;->getLong(I)J

    move-result-wide v79

    move/from16 v1, v32

    invoke-interface {v5, v1}, Ltb/c;->getLong(I)J

    move-result-wide v81

    move/from16 v31, v0

    move/from16 v0, v33

    invoke-interface {v5, v0}, Ltb/c;->getBlob(I)[B

    move-result-object v30

    invoke-static/range {v30 .. v30}, Lj93/l0;->m([B)Ljava/util/LinkedHashSet;

    move-result-object v83

    new-instance v48, Lic/e;

    move-object/from16 v72, v48

    invoke-direct/range {v72 .. v83}, Lic/e;-><init>(Lrc/e;Lic/x;ZZZZJJLjava/util/Set;)V

    move-object/from16 v48, v72

    new-instance v35, Lqc/q;

    move/from16 v49, v14

    invoke-direct/range {v35 .. v68}, Lqc/q;-><init>(Ljava/lang/String;Lic/m0;Ljava/lang/String;Ljava/lang/String;Lic/g;Lic/g;JJJLic/e;ILic/a;JJJJZLic/i0;IIJIILjava/lang/String;Ljava/lang/Boolean;)V

    move-object/from16 v14, v35

    move/from16 v33, v0

    move-object/from16 v0, v69

    invoke-virtual {v0, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move/from16 v14, v28

    move/from16 v28, v3

    move/from16 v3, v17

    move/from16 v17, v19

    move/from16 v19, v24

    move/from16 v24, v25

    move/from16 v25, v26

    move/from16 v26, v27

    move/from16 v27, v14

    move/from16 v32, v1

    move/from16 v30, v2

    move/from16 v2, v16

    move/from16 v14, v34

    move/from16 v1, v71

    move/from16 v16, v15

    move-object v15, v0

    move/from16 v0, v70

    goto/16 :goto_0

    :cond_9
    move-object v0, v15

    invoke-interface {v5}, Ljava/lang/AutoCloseable;->close()V

    return-object v0

    :goto_11
    invoke-interface {v5}, Ljava/lang/AutoCloseable;->close()V

    throw v0

    :pswitch_1
    move-object/from16 v0, p1

    check-cast v0, Ltb/a;

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1"

    invoke-interface {v0, v1}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v1

    :try_start_2
    invoke-interface {v1}, Ltb/c;->e1()Z

    move-result v0

    if-eqz v0, :cond_a

    const/4 v0, 0x0

    invoke-interface {v1, v0}, Ltb/c;->getLong(I)J

    move-result-wide v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    long-to-int v0, v2

    if-eqz v0, :cond_a

    const/4 v5, 0x1

    goto :goto_12

    :catchall_2
    move-exception v0

    goto :goto_13

    :cond_a
    const/4 v5, 0x0

    :goto_12
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :goto_13
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    throw v0

    :pswitch_2
    move-object/from16 v16, v15

    move-object v15, v7

    move-object/from16 v7, v16

    move-object/from16 v16, v6

    move-object v6, v8

    move-object/from16 v8, p1

    check-cast v8, Ltb/a;

    invoke-static {v8, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time"

    invoke-interface {v8, v5}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v5

    :try_start_3
    invoke-static {v5, v4}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v4

    invoke-static {v5, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    invoke-static {v5, v0}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v0

    invoke-static {v5, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    invoke-static {v5, v1}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v1

    invoke-static {v5, v7}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v7

    invoke-static {v5, v14}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v8

    invoke-static {v5, v13}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v13

    invoke-static {v5, v12}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v12

    invoke-static {v5, v11}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v11

    invoke-static {v5, v10}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v10

    invoke-static {v5, v9}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v9

    invoke-static {v5, v6}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v6

    invoke-static {v5, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v14

    move-object/from16 v15, v16

    invoke-static {v5, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 p1, v15

    move-object/from16 v15, v19

    invoke-static {v5, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 v16, v15

    move-object/from16 v15, v18

    invoke-static {v5, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 v18, v15

    move-object/from16 v15, v17

    invoke-static {v5, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 v17, v15

    const-string v15, "generation"

    invoke-static {v5, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 v19, v15

    const-string v15, "next_schedule_time_override"

    invoke-static {v5, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 v20, v15

    const-string v15, "next_schedule_time_override_generation"

    invoke-static {v5, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 v21, v15

    const-string v15, "stop_reason"

    invoke-static {v5, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 v22, v15

    const-string v15, "trace_tag"

    invoke-static {v5, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 v23, v15

    const-string v15, "backoff_on_system_interruptions"

    invoke-static {v5, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 v24, v15

    const-string v15, "required_network_type"

    invoke-static {v5, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 v25, v15

    const-string v15, "required_network_request"

    invoke-static {v5, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 v26, v15

    const-string v15, "requires_charging"

    invoke-static {v5, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 v27, v15

    const-string v15, "requires_device_idle"

    invoke-static {v5, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 v28, v15

    const-string v15, "requires_battery_not_low"

    invoke-static {v5, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 v29, v15

    const-string v15, "requires_storage_not_low"

    invoke-static {v5, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 v30, v15

    const-string v15, "trigger_content_update_delay"

    invoke-static {v5, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 v31, v15

    const-string v15, "trigger_max_content_delay"

    invoke-static {v5, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 v32, v15

    const-string v15, "content_uri_triggers"

    invoke-static {v5, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 v33, v15

    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    :goto_14
    invoke-interface {v5}, Ltb/c;->e1()Z

    move-result v34

    if-eqz v34, :cond_14

    invoke-interface {v5, v4}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v36

    move/from16 v34, v14

    move-object/from16 v69, v15

    invoke-interface {v5, v3}, Ltb/c;->getLong(I)J

    move-result-wide v14

    long-to-int v14, v14

    invoke-static {v14}, Lj93/l0;->M(I)Lic/m0;

    move-result-object v37

    invoke-interface {v5, v0}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v38

    invoke-interface {v5, v2}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v39

    invoke-interface {v5, v1}, Ltb/c;->getBlob(I)[B

    move-result-object v14

    sget-object v15, Lic/g;->b:Lic/g;

    invoke-static {v14}, Lpf/c;->t([B)Lic/g;

    move-result-object v40

    invoke-interface {v5, v7}, Ltb/c;->getBlob(I)[B

    move-result-object v14

    invoke-static {v14}, Lpf/c;->t([B)Lic/g;

    move-result-object v41

    invoke-interface {v5, v8}, Ltb/c;->getLong(I)J

    move-result-wide v42

    invoke-interface {v5, v13}, Ltb/c;->getLong(I)J

    move-result-wide v44

    invoke-interface {v5, v12}, Ltb/c;->getLong(I)J

    move-result-wide v46

    invoke-interface {v5, v11}, Ltb/c;->getLong(I)J

    move-result-wide v14

    long-to-int v14, v14

    move/from16 v70, v0

    move/from16 v71, v1

    invoke-interface {v5, v10}, Ltb/c;->getLong(I)J

    move-result-wide v0

    long-to-int v0, v0

    invoke-static {v0}, Lj93/l0;->J(I)Lic/a;

    move-result-object v50

    invoke-interface {v5, v9}, Ltb/c;->getLong(I)J

    move-result-wide v51

    invoke-interface {v5, v6}, Ltb/c;->getLong(I)J

    move-result-wide v53

    move/from16 v0, v34

    invoke-interface {v5, v0}, Ltb/c;->getLong(I)J

    move-result-wide v55

    move/from16 v1, p1

    invoke-interface {v5, v1}, Ltb/c;->getLong(I)J

    move-result-wide v57

    move/from16 v34, v0

    move/from16 p1, v1

    move/from16 v15, v16

    invoke-interface {v5, v15}, Ltb/c;->getLong(I)J

    move-result-wide v0

    long-to-int v0, v0

    if-eqz v0, :cond_b

    const/16 v59, 0x1

    :goto_15
    move/from16 v16, v2

    move/from16 v0, v18

    goto :goto_16

    :cond_b
    const/16 v59, 0x0

    goto :goto_15

    :goto_16
    invoke-interface {v5, v0}, Ltb/c;->getLong(I)J

    move-result-wide v1

    long-to-int v1, v1

    invoke-static {v1}, Lj93/l0;->L(I)Lic/i0;

    move-result-object v60

    move/from16 v1, v17

    move/from16 v17, v3

    invoke-interface {v5, v1}, Ltb/c;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    move/from16 v18, v0

    move/from16 v3, v19

    move/from16 v19, v1

    invoke-interface {v5, v3}, Ltb/c;->getLong(I)J

    move-result-wide v0

    long-to-int v0, v0

    move/from16 v1, v20

    invoke-interface {v5, v1}, Ltb/c;->getLong(I)J

    move-result-wide v63

    move/from16 v62, v0

    move/from16 v61, v2

    move/from16 v0, v21

    invoke-interface {v5, v0}, Ltb/c;->getLong(I)J

    move-result-wide v1

    long-to-int v1, v1

    move/from16 v21, v0

    move/from16 v65, v1

    move/from16 v2, v22

    invoke-interface {v5, v2}, Ltb/c;->getLong(I)J

    move-result-wide v0

    long-to-int v0, v0

    move/from16 v1, v23

    invoke-interface {v5, v1}, Ltb/c;->isNull(I)Z

    move-result v22

    if-eqz v22, :cond_c

    const/16 v67, 0x0

    :goto_17
    move/from16 v66, v0

    move/from16 v0, v24

    goto :goto_18

    :cond_c
    invoke-interface {v5, v1}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v22

    move-object/from16 v67, v22

    goto :goto_17

    :goto_18
    invoke-interface {v5, v0}, Ltb/c;->isNull(I)Z

    move-result v22

    if-eqz v22, :cond_d

    move/from16 v23, v1

    move/from16 v22, v2

    const/4 v1, 0x0

    goto :goto_19

    :cond_d
    move/from16 v23, v1

    move/from16 v22, v2

    invoke-interface {v5, v0}, Ltb/c;->getLong(I)J

    move-result-wide v1

    long-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    :goto_19
    if-eqz v1, :cond_f

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    if-eqz v1, :cond_e

    const/4 v1, 0x1

    goto :goto_1a

    :cond_e
    const/4 v1, 0x0

    :goto_1a
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    move-object/from16 v68, v1

    :goto_1b
    move/from16 v24, v3

    move/from16 v1, v25

    goto :goto_1c

    :catchall_3
    move-exception v0

    goto/16 :goto_25

    :cond_f
    const/16 v68, 0x0

    goto :goto_1b

    :goto_1c
    invoke-interface {v5, v1}, Ltb/c;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    invoke-static {v2}, Lj93/l0;->K(I)Lic/x;

    move-result-object v74

    move/from16 v2, v26

    invoke-interface {v5, v2}, Ltb/c;->getBlob(I)[B

    move-result-object v3

    invoke-static {v3}, Lj93/l0;->g0([B)Lrc/e;

    move-result-object v73

    move/from16 v25, v0

    move/from16 v26, v1

    move/from16 v3, v27

    invoke-interface {v5, v3}, Ltb/c;->getLong(I)J

    move-result-wide v0

    long-to-int v0, v0

    if-eqz v0, :cond_10

    const/16 v75, 0x1

    :goto_1d
    move/from16 v27, v2

    move/from16 v0, v28

    goto :goto_1e

    :cond_10
    const/16 v75, 0x0

    goto :goto_1d

    :goto_1e
    invoke-interface {v5, v0}, Ltb/c;->getLong(I)J

    move-result-wide v1

    long-to-int v1, v1

    if-eqz v1, :cond_11

    const/16 v76, 0x1

    :goto_1f
    move/from16 v28, v3

    move/from16 v1, v29

    goto :goto_20

    :cond_11
    const/16 v76, 0x0

    goto :goto_1f

    :goto_20
    invoke-interface {v5, v1}, Ltb/c;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    if-eqz v2, :cond_12

    const/16 v77, 0x1

    :goto_21
    move v3, v0

    move/from16 v29, v1

    move/from16 v2, v30

    goto :goto_22

    :cond_12
    const/16 v77, 0x0

    goto :goto_21

    :goto_22
    invoke-interface {v5, v2}, Ltb/c;->getLong(I)J

    move-result-wide v0

    long-to-int v0, v0

    if-eqz v0, :cond_13

    const/16 v78, 0x1

    :goto_23
    move/from16 v0, v31

    goto :goto_24

    :cond_13
    const/16 v78, 0x0

    goto :goto_23

    :goto_24
    invoke-interface {v5, v0}, Ltb/c;->getLong(I)J

    move-result-wide v79

    move/from16 v1, v32

    invoke-interface {v5, v1}, Ltb/c;->getLong(I)J

    move-result-wide v81

    move/from16 v31, v0

    move/from16 v0, v33

    invoke-interface {v5, v0}, Ltb/c;->getBlob(I)[B

    move-result-object v30

    invoke-static/range {v30 .. v30}, Lj93/l0;->m([B)Ljava/util/LinkedHashSet;

    move-result-object v83

    new-instance v48, Lic/e;

    move-object/from16 v72, v48

    invoke-direct/range {v72 .. v83}, Lic/e;-><init>(Lrc/e;Lic/x;ZZZZJJLjava/util/Set;)V

    move-object/from16 v48, v72

    new-instance v35, Lqc/q;

    move/from16 v49, v14

    invoke-direct/range {v35 .. v68}, Lqc/q;-><init>(Ljava/lang/String;Lic/m0;Ljava/lang/String;Ljava/lang/String;Lic/g;Lic/g;JJJLic/e;ILic/a;JJJJZLic/i0;IIJIILjava/lang/String;Ljava/lang/Boolean;)V

    move-object/from16 v14, v35

    move/from16 v33, v0

    move-object/from16 v0, v69

    invoke-virtual {v0, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    move/from16 v14, v28

    move/from16 v28, v3

    move/from16 v3, v17

    move/from16 v17, v19

    move/from16 v19, v24

    move/from16 v24, v25

    move/from16 v25, v26

    move/from16 v26, v27

    move/from16 v27, v14

    move/from16 v32, v1

    move/from16 v30, v2

    move/from16 v2, v16

    move/from16 v14, v34

    move/from16 v1, v71

    move/from16 v16, v15

    move-object v15, v0

    move/from16 v0, v70

    goto/16 :goto_14

    :cond_14
    move-object v0, v15

    invoke-interface {v5}, Ljava/lang/AutoCloseable;->close()V

    return-object v0

    :goto_25
    invoke-interface {v5}, Ljava/lang/AutoCloseable;->close()V

    throw v0

    :pswitch_3
    move-object/from16 v16, v15

    move-object v15, v7

    move-object/from16 v7, v16

    move-object/from16 v16, v6

    move-object v6, v8

    move-object/from16 v8, p1

    check-cast v8, Ltb/a;

    invoke-static {v8, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "SELECT * FROM workspec WHERE state=1"

    invoke-interface {v8, v5}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v5

    :try_start_4
    invoke-static {v5, v4}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v4

    invoke-static {v5, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    invoke-static {v5, v0}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v0

    invoke-static {v5, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    invoke-static {v5, v1}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v1

    invoke-static {v5, v7}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v7

    invoke-static {v5, v14}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v8

    invoke-static {v5, v13}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v13

    invoke-static {v5, v12}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v12

    invoke-static {v5, v11}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v11

    invoke-static {v5, v10}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v10

    invoke-static {v5, v9}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v9

    invoke-static {v5, v6}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v6

    invoke-static {v5, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v14

    move-object/from16 v15, v16

    invoke-static {v5, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 p1, v15

    move-object/from16 v15, v19

    invoke-static {v5, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 v16, v15

    move-object/from16 v15, v18

    invoke-static {v5, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 v18, v15

    move-object/from16 v15, v17

    invoke-static {v5, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 v17, v15

    const-string v15, "generation"

    invoke-static {v5, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 v19, v15

    const-string v15, "next_schedule_time_override"

    invoke-static {v5, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 v20, v15

    const-string v15, "next_schedule_time_override_generation"

    invoke-static {v5, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 v21, v15

    const-string v15, "stop_reason"

    invoke-static {v5, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 v22, v15

    const-string v15, "trace_tag"

    invoke-static {v5, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 v23, v15

    const-string v15, "backoff_on_system_interruptions"

    invoke-static {v5, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 v24, v15

    const-string v15, "required_network_type"

    invoke-static {v5, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 v25, v15

    const-string v15, "required_network_request"

    invoke-static {v5, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 v26, v15

    const-string v15, "requires_charging"

    invoke-static {v5, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 v27, v15

    const-string v15, "requires_device_idle"

    invoke-static {v5, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 v28, v15

    const-string v15, "requires_battery_not_low"

    invoke-static {v5, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 v29, v15

    const-string v15, "requires_storage_not_low"

    invoke-static {v5, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 v30, v15

    const-string v15, "trigger_content_update_delay"

    invoke-static {v5, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 v31, v15

    const-string v15, "trigger_max_content_delay"

    invoke-static {v5, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 v32, v15

    const-string v15, "content_uri_triggers"

    invoke-static {v5, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 v33, v15

    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    :goto_26
    invoke-interface {v5}, Ltb/c;->e1()Z

    move-result v34

    if-eqz v34, :cond_1e

    invoke-interface {v5, v4}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v36

    move/from16 v34, v14

    move-object/from16 v69, v15

    invoke-interface {v5, v3}, Ltb/c;->getLong(I)J

    move-result-wide v14

    long-to-int v14, v14

    invoke-static {v14}, Lj93/l0;->M(I)Lic/m0;

    move-result-object v37

    invoke-interface {v5, v0}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v38

    invoke-interface {v5, v2}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v39

    invoke-interface {v5, v1}, Ltb/c;->getBlob(I)[B

    move-result-object v14

    sget-object v15, Lic/g;->b:Lic/g;

    invoke-static {v14}, Lpf/c;->t([B)Lic/g;

    move-result-object v40

    invoke-interface {v5, v7}, Ltb/c;->getBlob(I)[B

    move-result-object v14

    invoke-static {v14}, Lpf/c;->t([B)Lic/g;

    move-result-object v41

    invoke-interface {v5, v8}, Ltb/c;->getLong(I)J

    move-result-wide v42

    invoke-interface {v5, v13}, Ltb/c;->getLong(I)J

    move-result-wide v44

    invoke-interface {v5, v12}, Ltb/c;->getLong(I)J

    move-result-wide v46

    invoke-interface {v5, v11}, Ltb/c;->getLong(I)J

    move-result-wide v14

    long-to-int v14, v14

    move v15, v0

    move/from16 v70, v1

    invoke-interface {v5, v10}, Ltb/c;->getLong(I)J

    move-result-wide v0

    long-to-int v0, v0

    invoke-static {v0}, Lj93/l0;->J(I)Lic/a;

    move-result-object v50

    invoke-interface {v5, v9}, Ltb/c;->getLong(I)J

    move-result-wide v51

    invoke-interface {v5, v6}, Ltb/c;->getLong(I)J

    move-result-wide v53

    move/from16 v0, v34

    invoke-interface {v5, v0}, Ltb/c;->getLong(I)J

    move-result-wide v55

    move/from16 v1, p1

    invoke-interface {v5, v1}, Ltb/c;->getLong(I)J

    move-result-wide v57

    move/from16 v34, v0

    move/from16 p1, v2

    move/from16 v0, v16

    move/from16 v16, v1

    invoke-interface {v5, v0}, Ltb/c;->getLong(I)J

    move-result-wide v1

    long-to-int v1, v1

    if-eqz v1, :cond_15

    const/16 v59, 0x1

    :goto_27
    move/from16 v1, v18

    move/from16 v18, v3

    goto :goto_28

    :cond_15
    const/16 v59, 0x0

    goto :goto_27

    :goto_28
    invoke-interface {v5, v1}, Ltb/c;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    invoke-static {v2}, Lj93/l0;->L(I)Lic/i0;

    move-result-object v60

    move v3, v0

    move/from16 v2, v17

    move/from16 v17, v1

    invoke-interface {v5, v2}, Ltb/c;->getLong(I)J

    move-result-wide v0

    long-to-int v0, v0

    move/from16 v71, v3

    move/from16 v1, v19

    move/from16 v19, v2

    invoke-interface {v5, v1}, Ltb/c;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    move/from16 v3, v20

    invoke-interface {v5, v3}, Ltb/c;->getLong(I)J

    move-result-wide v63

    move/from16 v61, v0

    move/from16 v20, v1

    move/from16 v62, v2

    move/from16 v0, v21

    invoke-interface {v5, v0}, Ltb/c;->getLong(I)J

    move-result-wide v1

    long-to-int v1, v1

    move/from16 v21, v0

    move/from16 v65, v1

    move/from16 v2, v22

    invoke-interface {v5, v2}, Ltb/c;->getLong(I)J

    move-result-wide v0

    long-to-int v0, v0

    move/from16 v1, v23

    invoke-interface {v5, v1}, Ltb/c;->isNull(I)Z

    move-result v22

    if-eqz v22, :cond_16

    const/16 v67, 0x0

    :goto_29
    move/from16 v66, v0

    move/from16 v0, v24

    goto :goto_2a

    :cond_16
    invoke-interface {v5, v1}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v22

    move-object/from16 v67, v22

    goto :goto_29

    :goto_2a
    invoke-interface {v5, v0}, Ltb/c;->isNull(I)Z

    move-result v22

    if-eqz v22, :cond_17

    move/from16 v23, v1

    move/from16 v22, v2

    const/4 v1, 0x0

    goto :goto_2b

    :cond_17
    move/from16 v23, v1

    move/from16 v22, v2

    invoke-interface {v5, v0}, Ltb/c;->getLong(I)J

    move-result-wide v1

    long-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    :goto_2b
    if-eqz v1, :cond_19

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    if-eqz v1, :cond_18

    const/4 v1, 0x1

    goto :goto_2c

    :cond_18
    const/4 v1, 0x0

    :goto_2c
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    move-object/from16 v68, v1

    :goto_2d
    move/from16 v24, v3

    move/from16 v1, v25

    goto :goto_2e

    :catchall_4
    move-exception v0

    goto/16 :goto_37

    :cond_19
    const/16 v68, 0x0

    goto :goto_2d

    :goto_2e
    invoke-interface {v5, v1}, Ltb/c;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    invoke-static {v2}, Lj93/l0;->K(I)Lic/x;

    move-result-object v74

    move/from16 v2, v26

    invoke-interface {v5, v2}, Ltb/c;->getBlob(I)[B

    move-result-object v3

    invoke-static {v3}, Lj93/l0;->g0([B)Lrc/e;

    move-result-object v73

    move/from16 v25, v0

    move/from16 v26, v1

    move/from16 v3, v27

    invoke-interface {v5, v3}, Ltb/c;->getLong(I)J

    move-result-wide v0

    long-to-int v0, v0

    if-eqz v0, :cond_1a

    const/16 v75, 0x1

    :goto_2f
    move/from16 v27, v2

    move/from16 v0, v28

    goto :goto_30

    :cond_1a
    const/16 v75, 0x0

    goto :goto_2f

    :goto_30
    invoke-interface {v5, v0}, Ltb/c;->getLong(I)J

    move-result-wide v1

    long-to-int v1, v1

    if-eqz v1, :cond_1b

    const/16 v76, 0x1

    :goto_31
    move/from16 v28, v3

    move/from16 v1, v29

    goto :goto_32

    :cond_1b
    const/16 v76, 0x0

    goto :goto_31

    :goto_32
    invoke-interface {v5, v1}, Ltb/c;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    if-eqz v2, :cond_1c

    const/16 v77, 0x1

    :goto_33
    move v3, v0

    move/from16 v29, v1

    move/from16 v2, v30

    goto :goto_34

    :cond_1c
    const/16 v77, 0x0

    goto :goto_33

    :goto_34
    invoke-interface {v5, v2}, Ltb/c;->getLong(I)J

    move-result-wide v0

    long-to-int v0, v0

    if-eqz v0, :cond_1d

    const/16 v78, 0x1

    :goto_35
    move/from16 v0, v31

    goto :goto_36

    :cond_1d
    const/16 v78, 0x0

    goto :goto_35

    :goto_36
    invoke-interface {v5, v0}, Ltb/c;->getLong(I)J

    move-result-wide v79

    move/from16 v1, v32

    invoke-interface {v5, v1}, Ltb/c;->getLong(I)J

    move-result-wide v81

    move/from16 v31, v0

    move/from16 v0, v33

    invoke-interface {v5, v0}, Ltb/c;->getBlob(I)[B

    move-result-object v30

    invoke-static/range {v30 .. v30}, Lj93/l0;->m([B)Ljava/util/LinkedHashSet;

    move-result-object v83

    new-instance v48, Lic/e;

    move-object/from16 v72, v48

    invoke-direct/range {v72 .. v83}, Lic/e;-><init>(Lrc/e;Lic/x;ZZZZJJLjava/util/Set;)V

    move-object/from16 v48, v72

    new-instance v35, Lqc/q;

    move/from16 v49, v14

    invoke-direct/range {v35 .. v68}, Lqc/q;-><init>(Ljava/lang/String;Lic/m0;Ljava/lang/String;Ljava/lang/String;Lic/g;Lic/g;JJJLic/e;ILic/a;JJJJZLic/i0;IIJIILjava/lang/String;Ljava/lang/Boolean;)V

    move-object/from16 v14, v35

    move/from16 v33, v0

    move-object/from16 v0, v69

    invoke-virtual {v0, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    move v14, v15

    move-object v15, v0

    move v0, v14

    move/from16 v14, v28

    move/from16 v28, v3

    move/from16 v3, v18

    move/from16 v18, v17

    move/from16 v17, v19

    move/from16 v19, v20

    move/from16 v20, v24

    move/from16 v24, v25

    move/from16 v25, v26

    move/from16 v26, v27

    move/from16 v27, v14

    move/from16 v32, v1

    move/from16 v30, v2

    move/from16 v14, v34

    move/from16 v1, v70

    move/from16 v2, p1

    move/from16 p1, v16

    move/from16 v16, v71

    goto/16 :goto_26

    :cond_1e
    move-object v0, v15

    invoke-interface {v5}, Ljava/lang/AutoCloseable;->close()V

    return-object v0

    :goto_37
    invoke-interface {v5}, Ljava/lang/AutoCloseable;->close()V

    throw v0

    :pswitch_4
    move-object/from16 v0, p1

    check-cast v0, Ltb/a;

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "DELETE FROM WorkProgress"

    invoke-interface {v0, v1}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v1

    :try_start_5
    invoke-interface {v1}, Ltb/c;->e1()Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :catchall_5
    move-exception v0

    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    throw v0

    :pswitch_5
    move-object/from16 v0, p1

    check-cast v0, Ltb/a;

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "SELECT DISTINCT work_spec_id FROM SystemIdInfo"

    invoke-interface {v0, v1}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v1

    :try_start_6
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :goto_38
    invoke-interface {v1}, Ltb/c;->e1()Z

    move-result v2

    if-eqz v2, :cond_1f

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    goto :goto_38

    :catchall_6
    move-exception v0

    goto :goto_39

    :cond_1f
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    return-object v0

    :goto_39
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    throw v0

    :pswitch_6
    move-object/from16 v0, p1

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lq80/n;->a(Ljava/lang/String;)Lj80/a;

    move-result-object v0

    return-object v0

    :pswitch_7
    move-object/from16 v0, p1

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lq80/n;->b(Ljava/lang/String;)Lj80/a;

    move-result-object v0

    return-object v0

    :pswitch_8
    move-object/from16 v0, p1

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lq80/m;->a(Ljava/lang/String;)Lj80/a;

    move-result-object v0

    return-object v0

    :pswitch_9
    move-object/from16 v0, p1

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lq80/m;->c(Ljava/lang/String;)Lj80/a;

    move-result-object v0

    return-object v0

    :pswitch_a
    move-object/from16 v0, p1

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lq80/m;->b(Ljava/lang/String;)Lj80/a;

    move-result-object v0

    return-object v0

    :pswitch_b
    move-object/from16 v0, p1

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lq80/a;->a(Ljava/lang/String;)Lj80/a;

    move-result-object v0

    return-object v0

    :pswitch_c
    const-string v0, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, v1

    check-cast v0, Ljava/util/List;

    new-instance v1, Lq3/y;

    const/4 v2, 0x0

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    sget-object v3, Ll3/l0;->a:Lp0/n0;

    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_21

    :cond_20
    const/4 v2, 0x0

    goto :goto_3a

    :cond_21
    if-eqz v2, :cond_20

    iget-object v3, v3, Lp0/n0;->y:Ljava/lang/Object;

    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-interface {v3, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll3/g;

    :goto_3a
    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const/4 v8, 0x1

    invoke-interface {v0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    sget v3, Ll3/u0;->c:I

    sget-object v3, Ll3/l0;->p:Lp0/n0;

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_23

    :cond_22
    const/4 v0, 0x0

    goto :goto_3b

    :cond_23
    if-eqz v0, :cond_22

    iget-object v3, v3, Lp0/n0;->y:Ljava/lang/Object;

    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-interface {v3, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll3/u0;

    :goto_3b
    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-wide v3, v0, Ll3/u0;->a:J

    const/4 v0, 0x0

    invoke-direct {v1, v2, v3, v4, v0}, Lq3/y;-><init>(Ll3/g;JLl3/u0;)V

    return-object v1

    :pswitch_d
    move-object/from16 v1, p1

    move-object v0, v1

    check-cast v0, Lcom/whoop/bot/models/conversation/FormWidgetModel;

    invoke-static {v0}, Lpl0/c;->p(Lcom/whoop/bot/models/conversation/FormWidgetModel;)Lih0/h0;

    move-result-object v0

    return-object v0

    :pswitch_e
    move-object/from16 v1, p1

    move-object v0, v1

    check-cast v0, Lcom/whoop/bot/models/conversation/ChatMiniArchWidgetModel;

    invoke-static {v0}, Lpl0/c;->q(Lcom/whoop/bot/models/conversation/ChatMiniArchWidgetModel;)Lvl0/e;

    move-result-object v0

    return-object v0

    :pswitch_f
    move-object/from16 v1, p1

    move-object v0, v1

    check-cast v0, Lcom/whoop/design/models/items/StartTurnButtonModel;

    invoke-static {v0}, Lpl0/c;->j(Lcom/whoop/design/models/items/StartTurnButtonModel;)Lmh0/h;

    move-result-object v0

    return-object v0

    :pswitch_10
    move-object/from16 v1, p1

    move-object v0, v1

    check-cast v0, Lcom/whoop/ai/chat/models/ContextStatusToggleModel;

    invoke-static {v0}, Lpl0/c;->v(Lcom/whoop/ai/chat/models/ContextStatusToggleModel;)Lfh0/h;

    move-result-object v0

    return-object v0

    :pswitch_11
    move-object/from16 v1, p1

    move-object v0, v1

    check-cast v0, Lcom/whoop/ai/chat/models/HealthSnapshotTileModel;

    invoke-static {v0}, Lpl0/c;->u(Lcom/whoop/ai/chat/models/HealthSnapshotTileModel;)Ljh0/c;

    move-result-object v0

    return-object v0

    :pswitch_12
    move-object/from16 v1, p1

    move-object v0, v1

    check-cast v0, Lcom/whoop/ai/chat/models/ContextDetailsHeaderModel;

    invoke-static {v0}, Lpl0/c;->a(Lcom/whoop/ai/chat/models/ContextDetailsHeaderModel;)Leh0/d;

    move-result-object v0

    return-object v0

    :pswitch_13
    move-object/from16 v1, p1

    move-object v0, v1

    check-cast v0, Lcom/whoop/bot/models/conversation/HpmlBrowserWidgetModel;

    invoke-static {v0}, Lpl0/c;->d(Lcom/whoop/bot/models/conversation/HpmlBrowserWidgetModel;)Lxl0/d;

    move-result-object v0

    return-object v0

    :pswitch_14
    move-object/from16 v1, p1

    move-object v0, v1

    check-cast v0, Lcom/whoop/design/models/items/IconMarkdownCalloutModel;

    invoke-static {v0}, Lpl0/c;->o(Lcom/whoop/design/models/items/IconMarkdownCalloutModel;)Lf21/d;

    move-result-object v0

    return-object v0

    :pswitch_15
    move-object/from16 v1, p1

    move-object v0, v1

    check-cast v0, Lcom/whoop/bot/models/conversation/MxmCreateCaseTileModel;

    invoke-static {v0}, Lpl0/c;->i(Lcom/whoop/bot/models/conversation/MxmCreateCaseTileModel;)Lm91/u;

    move-result-object v0

    return-object v0

    :pswitch_16
    move-object/from16 v1, p1

    move-object v0, v1

    check-cast v0, Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModel;

    invoke-static {v0}, Lpl0/c;->g(Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModel;)Lcm0/e;

    move-result-object v0

    return-object v0

    :pswitch_17
    move-object/from16 v1, p1

    move-object v0, v1

    check-cast v0, Lcom/whoop/bot/models/conversation/RecommendationCarouselModel;

    invoke-static {v0}, Lpl0/c;->b(Lcom/whoop/bot/models/conversation/RecommendationCarouselModel;)Lbm0/m;

    move-result-object v0

    return-object v0

    :pswitch_18
    move-object/from16 v1, p1

    move-object v0, v1

    check-cast v0, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;

    invoke-static {v0}, Lpl0/c;->w(Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;)Lbm0/s;

    move-result-object v0

    return-object v0

    :pswitch_19
    move-object/from16 v1, p1

    move-object v0, v1

    check-cast v0, Lcom/whoop/bot/models/conversation/AdditionalContextModel;

    invoke-static {v0}, Lpl0/c;->f(Lcom/whoop/bot/models/conversation/AdditionalContextModel;)Ltl0/c;

    move-result-object v0

    return-object v0

    :pswitch_1a
    move-object/from16 v1, p1

    move-object v0, v1

    check-cast v0, Lcom/whoop/bot/models/conversation/StrengthTrainerWidgetModel;

    invoke-static {v0}, Lpl0/c;->m(Lcom/whoop/bot/models/conversation/StrengthTrainerWidgetModel;)Lam0/e;

    move-result-object v0

    return-object v0

    :pswitch_1b
    move-object/from16 v1, p1

    move-object v0, v1

    check-cast v0, Lcom/whoop/bot/models/conversation/SummaryConfirmationWidgetModel;

    invoke-static {v0}, Lpl0/c;->l(Lcom/whoop/bot/models/conversation/SummaryConfirmationWidgetModel;)Lnh0/c;

    move-result-object v0

    return-object v0

    :pswitch_1c
    move-object/from16 v1, p1

    move-object v0, v1

    check-cast v0, Lcom/whoop/ai/chat/models/MarkdownTextWidget;

    invoke-static {v0}, Lpl0/c;->h(Lcom/whoop/ai/chat/models/MarkdownTextWidget;)Loh0/c;

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
