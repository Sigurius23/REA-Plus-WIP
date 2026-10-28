.class public final synthetic La6/z0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    iput p4, p0, La6/z0;->w:I

    iput-object p1, p0, La6/z0;->x:Ljava/lang/Object;

    iput-object p2, p0, La6/z0;->y:Ljava/lang/Object;

    iput-object p3, p0, La6/z0;->z:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 64

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    iget v2, v1, La6/z0;->w:I

    const/4 v4, 0x1

    iget-object v5, v1, La6/z0;->z:Ljava/lang/Object;

    iget-object v6, v1, La6/z0;->y:Ljava/lang/Object;

    iget-object v7, v1, La6/z0;->x:Ljava/lang/Object;

    packed-switch v2, :pswitch_data_0

    check-cast v7, Ly1/d;

    check-cast v5, Ly1/i;

    check-cast v0, Lp1/i0;

    iget-object v0, v7, Ly1/d;->x:La0/v0;

    invoke-virtual {v0, v6}, La0/v0;->b(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    iget-object v2, v7, Ly1/d;->w:Ljava/util/Map;

    invoke-interface {v2, v6}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0, v6, v5}, La0/v0;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Lc0/g;

    invoke-direct {v0, v7, v6, v5, v4}, Lc0/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    return-object v0

    :cond_0
    const-string v0, "Key "

    const-string v2, " was used multiple times "

    invoke-static {v6, v0, v2}, Lih0/d0;->j(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    :pswitch_0
    check-cast v7, Lkotlin/jvm/functions/Function1;

    check-cast v6, Lld1/c;

    check-cast v5, Lp1/t2;

    invoke-static {v7, v6, v5, v0}, Lum1/d;->g(Lkotlin/jvm/functions/Function1;Lld1/c;Lp1/t2;Ljava/lang/Object;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    check-cast v7, Ljava/lang/String;

    check-cast v6, Landroidx/room/l1;

    check-cast v5, Lqc/g;

    check-cast v0, Ltb/a;

    const-string v2, "getValue(...)"

    const-string v8, "_connection"

    invoke-static {v0, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v7}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v7

    :try_start_0
    iget-object v6, v6, Landroidx/room/l1;->a:La6/i;

    invoke-virtual {v6, v7}, La6/i;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v6, "id"

    invoke-static {v7, v6}, Ljc/x;->M(Ltb/c;Ljava/lang/String;)I

    move-result v6

    const-string v8, "state"

    invoke-static {v7, v8}, Ljc/x;->s(Ltb/c;Ljava/lang/String;)I

    move-result v8

    const-string v9, "output"

    invoke-static {v7, v9}, Ljc/x;->s(Ltb/c;Ljava/lang/String;)I

    move-result v9

    const-string v10, "initial_delay"

    invoke-static {v7, v10}, Ljc/x;->s(Ltb/c;Ljava/lang/String;)I

    move-result v10

    const-string v11, "interval_duration"

    invoke-static {v7, v11}, Ljc/x;->s(Ltb/c;Ljava/lang/String;)I

    move-result v11

    const-string v12, "flex_duration"

    invoke-static {v7, v12}, Ljc/x;->s(Ltb/c;Ljava/lang/String;)I

    move-result v12

    const-string v13, "run_attempt_count"

    invoke-static {v7, v13}, Ljc/x;->s(Ltb/c;Ljava/lang/String;)I

    move-result v13

    const-string v14, "backoff_policy"

    invoke-static {v7, v14}, Ljc/x;->s(Ltb/c;Ljava/lang/String;)I

    move-result v14

    const-string v15, "backoff_delay_duration"

    invoke-static {v7, v15}, Ljc/x;->s(Ltb/c;Ljava/lang/String;)I

    move-result v15

    const-string v4, "last_enqueue_time"

    invoke-static {v7, v4}, Ljc/x;->s(Ltb/c;Ljava/lang/String;)I

    move-result v4

    const-string v3, "period_count"

    invoke-static {v7, v3}, Ljc/x;->s(Ltb/c;Ljava/lang/String;)I

    move-result v3

    const-string v1, "generation"

    invoke-static {v7, v1}, Ljc/x;->s(Ltb/c;Ljava/lang/String;)I

    move-result v1

    move-object/from16 p1, v2

    const-string v2, "next_schedule_time_override"

    invoke-static {v7, v2}, Ljc/x;->s(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v16, v2

    const-string v2, "stop_reason"

    invoke-static {v7, v2}, Ljc/x;->s(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v17, v2

    const-string v2, "required_network_type"

    invoke-static {v7, v2}, Ljc/x;->s(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v18, v2

    const-string v2, "required_network_request"

    invoke-static {v7, v2}, Ljc/x;->s(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v19, v2

    const-string v2, "requires_charging"

    invoke-static {v7, v2}, Ljc/x;->s(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v20, v2

    const-string v2, "requires_device_idle"

    invoke-static {v7, v2}, Ljc/x;->s(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v21, v2

    const-string v2, "requires_battery_not_low"

    invoke-static {v7, v2}, Ljc/x;->s(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v22, v2

    const-string v2, "requires_storage_not_low"

    invoke-static {v7, v2}, Ljc/x;->s(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v23, v2

    const-string v2, "trigger_content_update_delay"

    invoke-static {v7, v2}, Ljc/x;->s(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v24, v2

    const-string v2, "trigger_max_content_delay"

    invoke-static {v7, v2}, Ljc/x;->s(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v25, v2

    const-string v2, "content_uri_triggers"

    invoke-static {v7, v2}, Ljc/x;->s(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v26, v2

    new-instance v2, La0/g;

    move/from16 v27, v1

    const/4 v1, 0x0

    invoke-direct {v2, v1}, La0/f1;-><init>(I)V

    move/from16 v28, v3

    new-instance v3, La0/g;

    invoke-direct {v3, v1}, La0/f1;-><init>(I)V

    :goto_0
    invoke-interface {v7}, Ltb/c;->e1()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v7, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, La0/f1;->containsKey(Ljava/lang/Object;)Z

    move-result v29

    if-nez v29, :cond_1

    move/from16 v29, v4

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v2, v1, v4}, La0/f1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :catchall_0
    move-exception v0

    goto/16 :goto_23

    :cond_1
    move/from16 v29, v4

    :goto_1
    invoke-interface {v7, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, La0/f1;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v3, v1, v4}, La0/f1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    move/from16 v4, v29

    goto :goto_0

    :cond_3
    move/from16 v29, v4

    invoke-interface {v7}, Ltb/c;->reset()V

    invoke-virtual {v5, v0, v2}, Lqc/g;->b(Ltb/a;La0/g;)V

    invoke-virtual {v5, v0, v3}, Lqc/g;->a(Ltb/a;La0/g;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :goto_2
    invoke-interface {v7}, Ltb/c;->e1()Z

    move-result v1

    if-eqz v1, :cond_1f

    const/4 v1, -0x1

    if-eq v6, v1, :cond_1e

    invoke-interface {v7, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v31

    if-eq v8, v1, :cond_1d

    invoke-interface {v7, v8}, Ltb/c;->getLong(I)J

    move-result-wide v4

    long-to-int v4, v4

    invoke-static {v4}, Lj93/l0;->M(I)Lic/m0;

    move-result-object v32

    if-eq v9, v1, :cond_1c

    invoke-interface {v7, v9}, Ltb/c;->getBlob(I)[B

    move-result-object v4

    sget-object v5, Lic/g;->b:Lic/g;

    invoke-static {v4}, Lpf/c;->t([B)Lic/g;

    move-result-object v33

    if-ne v10, v1, :cond_4

    const-wide/16 v34, 0x0

    goto :goto_3

    :cond_4
    invoke-interface {v7, v10}, Ltb/c;->getLong(I)J

    move-result-wide v34

    :goto_3
    if-ne v11, v1, :cond_5

    const-wide/16 v36, 0x0

    goto :goto_4

    :cond_5
    invoke-interface {v7, v11}, Ltb/c;->getLong(I)J

    move-result-wide v36

    :goto_4
    if-ne v12, v1, :cond_6

    const-wide/16 v38, 0x0

    goto :goto_5

    :cond_6
    invoke-interface {v7, v12}, Ltb/c;->getLong(I)J

    move-result-wide v38

    :goto_5
    if-ne v13, v1, :cond_7

    const/4 v4, 0x0

    goto :goto_6

    :cond_7
    invoke-interface {v7, v13}, Ltb/c;->getLong(I)J

    move-result-wide v4

    long-to-int v4, v4

    :goto_6
    if-eq v14, v1, :cond_1b

    move-object v5, v2

    invoke-interface {v7, v14}, Ltb/c;->getLong(I)J

    move-result-wide v1

    long-to-int v1, v1

    invoke-static {v1}, Lj93/l0;->J(I)Lic/a;

    move-result-object v42

    const/4 v1, -0x1

    if-ne v15, v1, :cond_8

    const-wide/16 v43, 0x0

    :goto_7
    move/from16 v2, v29

    goto :goto_8

    :cond_8
    invoke-interface {v7, v15}, Ltb/c;->getLong(I)J

    move-result-wide v43

    goto :goto_7

    :goto_8
    if-ne v2, v1, :cond_9

    const-wide/16 v45, 0x0

    :goto_9
    move/from16 v29, v2

    move/from16 v2, v28

    goto :goto_a

    :cond_9
    invoke-interface {v7, v2}, Ltb/c;->getLong(I)J

    move-result-wide v29

    move-wide/from16 v45, v29

    goto :goto_9

    :goto_a
    if-ne v2, v1, :cond_a

    move/from16 v28, v4

    move-object/from16 v30, v5

    const/16 v47, 0x0

    :goto_b
    move/from16 v4, v27

    goto :goto_c

    :cond_a
    move/from16 v28, v4

    move-object/from16 v30, v5

    invoke-interface {v7, v2}, Ltb/c;->getLong(I)J

    move-result-wide v4

    long-to-int v4, v4

    move/from16 v47, v4

    goto :goto_b

    :goto_c
    if-ne v4, v1, :cond_b

    move v5, v1

    move/from16 v27, v2

    const/16 v48, 0x0

    :goto_d
    move/from16 v1, v16

    goto :goto_e

    :cond_b
    move/from16 v27, v2

    invoke-interface {v7, v4}, Ltb/c;->getLong(I)J

    move-result-wide v1

    long-to-int v1, v1

    move/from16 v48, v1

    const/4 v5, -0x1

    goto :goto_d

    :goto_e
    if-ne v1, v5, :cond_c

    const-wide/16 v49, 0x0

    :goto_f
    move/from16 v2, v17

    goto :goto_10

    :cond_c
    invoke-interface {v7, v1}, Ltb/c;->getLong(I)J

    move-result-wide v49

    goto :goto_f

    :goto_10
    if-ne v2, v5, :cond_d

    move/from16 v16, v6

    const/16 v51, 0x0

    move v6, v5

    :goto_11
    move/from16 v5, v18

    goto :goto_12

    :cond_d
    move/from16 v16, v6

    invoke-interface {v7, v2}, Ltb/c;->getLong(I)J

    move-result-wide v5

    long-to-int v5, v5

    move/from16 v51, v5

    const/4 v6, -0x1

    goto :goto_11

    :goto_12
    if-eq v5, v6, :cond_1a

    move/from16 v17, v1

    move/from16 v18, v2

    invoke-interface {v7, v5}, Ltb/c;->getLong(I)J

    move-result-wide v1

    long-to-int v1, v1

    invoke-static {v1}, Lj93/l0;->K(I)Lic/x;

    move-result-object v54

    move/from16 v1, v19

    if-eq v1, v6, :cond_19

    invoke-interface {v7, v1}, Ltb/c;->getBlob(I)[B

    move-result-object v2

    invoke-static {v2}, Lj93/l0;->g0([B)Lrc/e;

    move-result-object v53

    move/from16 v2, v20

    if-ne v2, v6, :cond_e

    move/from16 v19, v4

    move/from16 v20, v5

    const/16 v55, 0x0

    :goto_13
    move/from16 v4, v21

    goto :goto_15

    :cond_e
    move/from16 v19, v4

    move/from16 v20, v5

    invoke-interface {v7, v2}, Ltb/c;->getLong(I)J

    move-result-wide v4

    long-to-int v4, v4

    if-eqz v4, :cond_f

    const/4 v4, 0x1

    goto :goto_14

    :cond_f
    const/4 v4, 0x0

    :goto_14
    move/from16 v55, v4

    goto :goto_13

    :goto_15
    if-ne v4, v6, :cond_10

    move v5, v1

    move/from16 v21, v2

    const/16 v56, 0x0

    :goto_16
    move/from16 v1, v22

    goto :goto_18

    :cond_10
    move v5, v1

    move/from16 v21, v2

    invoke-interface {v7, v4}, Ltb/c;->getLong(I)J

    move-result-wide v1

    long-to-int v1, v1

    if-eqz v1, :cond_11

    const/4 v1, 0x1

    goto :goto_17

    :cond_11
    const/4 v1, 0x0

    :goto_17
    move/from16 v56, v1

    goto :goto_16

    :goto_18
    if-ne v1, v6, :cond_12

    move v2, v4

    move/from16 v22, v5

    const/16 v57, 0x0

    :goto_19
    move/from16 v4, v23

    goto :goto_1b

    :cond_12
    move v2, v4

    move/from16 v22, v5

    invoke-interface {v7, v1}, Ltb/c;->getLong(I)J

    move-result-wide v4

    long-to-int v4, v4

    if-eqz v4, :cond_13

    const/4 v4, 0x1

    goto :goto_1a

    :cond_13
    const/4 v4, 0x0

    :goto_1a
    move/from16 v57, v4

    goto :goto_19

    :goto_1b
    if-ne v4, v6, :cond_14

    move v5, v1

    move/from16 v23, v2

    const/16 v58, 0x0

    :goto_1c
    move/from16 v1, v24

    goto :goto_1e

    :cond_14
    move v5, v1

    move/from16 v23, v2

    invoke-interface {v7, v4}, Ltb/c;->getLong(I)J

    move-result-wide v1

    long-to-int v1, v1

    if-eqz v1, :cond_15

    const/4 v1, 0x1

    goto :goto_1d

    :cond_15
    const/4 v1, 0x0

    :goto_1d
    move/from16 v58, v1

    goto :goto_1c

    :goto_1e
    if-ne v1, v6, :cond_16

    const-wide/16 v59, 0x0

    :goto_1f
    move/from16 v2, v25

    goto :goto_20

    :cond_16
    invoke-interface {v7, v1}, Ltb/c;->getLong(I)J

    move-result-wide v59

    goto :goto_1f

    :goto_20
    if-ne v2, v6, :cond_17

    const-wide/16 v61, 0x0

    :goto_21
    move/from16 v24, v1

    move/from16 v1, v26

    goto :goto_22

    :cond_17
    invoke-interface {v7, v2}, Ltb/c;->getLong(I)J

    move-result-wide v24

    move-wide/from16 v61, v24

    goto :goto_21

    :goto_22
    if-eq v1, v6, :cond_18

    invoke-interface {v7, v1}, Ltb/c;->getBlob(I)[B

    move-result-object v6

    invoke-static {v6}, Lj93/l0;->m([B)Ljava/util/LinkedHashSet;

    move-result-object v63

    new-instance v52, Lic/e;

    invoke-direct/range {v52 .. v63}, Lic/e;-><init>(Lrc/e;Lic/x;ZZZZJJLjava/util/Set;)V

    move/from16 v26, v1

    move/from16 v6, v16

    invoke-interface {v7, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v1

    move/from16 v25, v2

    move-object/from16 v2, v30

    invoke-static {v1, v2}, Lm83/g0;->U(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v16, v2

    move-object/from16 v2, p1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/util/List;

    move-object/from16 p1, v1

    invoke-interface {v7, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v3}, Lm83/g0;->U(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v53, v1

    check-cast v53, Ljava/util/List;

    new-instance v30, Lqc/p;

    move/from16 v41, v28

    move-object/from16 v40, v52

    move-object/from16 v52, p1

    invoke-direct/range {v30 .. v53}, Lqc/p;-><init>(Ljava/lang/String;Lic/m0;Lic/g;JJJLic/e;ILic/a;JJIIJILjava/util/List;Ljava/util/List;)V

    move-object/from16 v1, v30

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 p1, v2

    move-object/from16 v2, v16

    move/from16 v16, v17

    move/from16 v17, v18

    move/from16 v18, v20

    move/from16 v20, v21

    move/from16 v21, v23

    move/from16 v28, v27

    move/from16 v23, v4

    move/from16 v27, v19

    move/from16 v19, v22

    move/from16 v22, v5

    goto/16 :goto_2

    :cond_18
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Missing value for a NON-NULL column \'content_uri_triggers\', found NULL value instead."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_19
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Missing value for a NON-NULL column \'required_network_request\', found NULL value instead."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1a
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Missing value for a NON-NULL column \'required_network_type\', found NULL value instead."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1b
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Missing value for a NON-NULL column \'backoff_policy\', found NULL value instead."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1c
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Missing value for a NON-NULL column \'output\', found NULL value instead."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1d
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Missing value for a NON-NULL column \'state\', found NULL value instead."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1e
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Missing value for a NON-NULL column \'id\', found NULL value instead."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1f
    invoke-interface {v7}, Ljava/lang/AutoCloseable;->close()V

    return-object v0

    :goto_23
    invoke-interface {v7}, Ljava/lang/AutoCloseable;->close()V

    throw v0

    :pswitch_2
    check-cast v7, Lcom/whoop/home/view/HomeFragment;

    check-cast v6, Lfm1/g;

    check-cast v5, Lp1/c1;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v7, v6, v5, v0}, Lcom/whoop/home/view/HomeFragment;->z(Lcom/whoop/home/view/HomeFragment;Lfm1/g;Lp1/c1;I)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_3
    check-cast v7, Lim1/d0;

    check-cast v6, Lfm1/a;

    check-cast v5, Lfm1/d;

    invoke-static {v7, v6, v5, v0}, Lim1/b;->a(Lim1/d0;Lfm1/a;Lfm1/d;Ljava/lang/Object;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_4
    check-cast v7, Lcd3/d;

    check-cast v6, Lcd3/d;

    check-cast v5, Lcd3/d;

    check-cast v0, Lad3/g;

    invoke-static {v7, v6, v5, v0}, Lcom/whoop/design/json/b;->a(Lcd3/d;Lcd3/d;Lcd3/d;Lad3/g;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_5
    check-cast v7, Lbp0/a;

    check-cast v6, Lep0/j;

    check-cast v5, Ldp0/g;

    check-cast v0, Ljava/lang/String;

    invoke-static {v7, v6, v5, v0}, Lbp0/s;->o(Lbp0/a;Lep0/j;Ldp0/g;Ljava/lang/String;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_6
    check-cast v7, La6/i;

    check-cast v6, Lzt/q;

    check-cast v5, La6/j;

    check-cast v0, Ljava/lang/Throwable;

    invoke-virtual {v7, v0}, La6/i;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, v6, Lzt/q;->z:Ljava/lang/Object;

    check-cast v1, Ldc3/h;

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Ldc3/h;->h(Ljava/lang/Throwable;Z)Z

    :goto_24
    invoke-virtual {v1}, Ldc3/h;->f()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Ldc3/o;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_20

    invoke-virtual {v5, v2, v0}, La6/j;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_24

    :cond_20
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
