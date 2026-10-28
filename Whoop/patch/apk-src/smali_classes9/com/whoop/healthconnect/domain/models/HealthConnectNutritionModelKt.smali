.class public final Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModelKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "Lm7/m0;",
        "Lrj1/a;",
        "healthConnectIntentActivityMatcher",
        "Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;",
        "toModel",
        "(Lm7/m0;Lrj1/a;)Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;",
        "health-connect_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final toModel(Lm7/m0;Lrj1/a;)Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;
    .locals 54

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "<this>"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "healthConnectIntentActivityMatcher"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;

    new-instance v2, Lorg/joda/time/DateTime;

    iget-object v4, v0, Lm7/m0;->a:Ljava/time/Instant;

    invoke-virtual {v4}, Ljava/time/Instant;->toEpochMilli()J

    move-result-wide v4

    sget-object v6, Lorg/joda/time/DateTimeZone;->UTC:Lorg/joda/time/DateTimeZone;

    invoke-direct {v2, v4, v5, v6}, Lorg/joda/time/DateTime;-><init>(JLorg/joda/time/DateTimeZone;)V

    const-string v4, "yyyy-MM-dd\'T\'HH:mm:ss.SSS\'Z\'"

    invoke-virtual {v2, v4}, Lorg/joda/time/base/AbstractDateTime;->toString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v5, "toString(...)"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v7, v0, Lm7/m0;->b:Ljava/time/ZoneOffset;

    if-eqz v7, :cond_0

    invoke-virtual {v7}, Ljava/time/ZoneOffset;->getId()Ljava/lang/String;

    move-result-object v7

    goto :goto_0

    :cond_0
    const/4 v7, 0x0

    :goto_0
    new-instance v9, Lorg/joda/time/DateTime;

    iget-object v10, v0, Lm7/m0;->c:Ljava/time/Instant;

    invoke-virtual {v10}, Ljava/time/Instant;->toEpochMilli()J

    move-result-wide v10

    invoke-direct {v9, v10, v11, v6}, Lorg/joda/time/DateTime;-><init>(JLorg/joda/time/DateTimeZone;)V

    invoke-virtual {v9, v4}, Lorg/joda/time/base/AbstractDateTime;->toString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, v0, Lm7/m0;->d:Ljava/time/ZoneOffset;

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Ljava/time/ZoneOffset;->getId()Ljava/lang/String;

    move-result-object v4

    goto :goto_1

    :cond_1
    const/4 v4, 0x0

    :goto_1
    iget-object v5, v0, Lm7/m0;->e:Lr7/b0;

    sget-object v9, Lr7/a0;->y:Lr7/x;

    if-eqz v5, :cond_2

    invoke-virtual {v5, v9}, Lr7/b0;->a(Lr7/a0;)D

    move-result-wide v10

    invoke-static {v10, v11}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v5

    goto :goto_2

    :cond_2
    const/4 v5, 0x0

    :goto_2
    iget-object v10, v0, Lm7/m0;->f:Lr7/b0;

    if-eqz v10, :cond_3

    invoke-virtual {v10, v9}, Lr7/b0;->a(Lr7/a0;)D

    move-result-wide v10

    invoke-static {v10, v11}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v10

    goto :goto_3

    :cond_3
    const/4 v10, 0x0

    :goto_3
    iget-object v11, v0, Lm7/m0;->g:Lr7/b0;

    if-eqz v11, :cond_4

    invoke-virtual {v11, v9}, Lr7/b0;->a(Lr7/a0;)D

    move-result-wide v11

    invoke-static {v11, v12}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v11

    goto :goto_4

    :cond_4
    const/4 v11, 0x0

    :goto_4
    iget-object v12, v0, Lm7/m0;->h:Lr7/k;

    sget-object v13, Lr7/j;->y:Lr7/i;

    if-eqz v12, :cond_5

    invoke-virtual {v12, v13}, Lr7/k;->a(Lr7/j;)D

    move-result-wide v14

    invoke-static {v14, v15}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v12

    goto :goto_5

    :cond_5
    const/4 v12, 0x0

    :goto_5
    iget-object v14, v0, Lm7/m0;->i:Lr7/k;

    if-eqz v14, :cond_6

    invoke-virtual {v14, v13}, Lr7/k;->a(Lr7/j;)D

    move-result-wide v13

    invoke-static {v13, v14}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v13

    goto :goto_6

    :cond_6
    const/4 v13, 0x0

    :goto_6
    iget-object v14, v0, Lm7/m0;->j:Lr7/b0;

    if-eqz v14, :cond_7

    invoke-virtual {v14, v9}, Lr7/b0;->a(Lr7/a0;)D

    move-result-wide v14

    invoke-static {v14, v15}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v14

    goto :goto_7

    :cond_7
    const/4 v14, 0x0

    :goto_7
    iget-object v15, v0, Lm7/m0;->k:Lr7/b0;

    if-eqz v15, :cond_8

    invoke-virtual {v15, v9}, Lr7/b0;->a(Lr7/a0;)D

    move-result-wide v15

    invoke-static/range {v15 .. v16}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v15

    goto :goto_8

    :cond_8
    const/4 v15, 0x0

    :goto_8
    iget-object v8, v0, Lm7/m0;->l:Lr7/b0;

    if-eqz v8, :cond_9

    invoke-virtual {v8, v9}, Lr7/b0;->a(Lr7/a0;)D

    move-result-wide v17

    invoke-static/range {v17 .. v18}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v8

    :goto_9
    move-object/from16 v17, v2

    goto :goto_a

    :cond_9
    const/4 v8, 0x0

    goto :goto_9

    :goto_a
    iget-object v2, v0, Lm7/m0;->m:Lr7/b0;

    if-eqz v2, :cond_a

    invoke-virtual {v2, v9}, Lr7/b0;->a(Lr7/a0;)D

    move-result-wide v18

    invoke-static/range {v18 .. v19}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    move-object/from16 v18, v2

    goto :goto_b

    :cond_a
    const/16 v18, 0x0

    :goto_b
    iget-object v2, v0, Lm7/m0;->n:Lr7/b0;

    if-eqz v2, :cond_b

    invoke-virtual {v2, v9}, Lr7/b0;->a(Lr7/a0;)D

    move-result-wide v19

    invoke-static/range {v19 .. v20}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    move-object/from16 v19, v2

    goto :goto_c

    :cond_b
    const/16 v19, 0x0

    :goto_c
    iget-object v2, v0, Lm7/m0;->o:Lr7/b0;

    if-eqz v2, :cond_c

    invoke-virtual {v2, v9}, Lr7/b0;->a(Lr7/a0;)D

    move-result-wide v20

    invoke-static/range {v20 .. v21}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    move-object/from16 v20, v2

    goto :goto_d

    :cond_c
    const/16 v20, 0x0

    :goto_d
    iget-object v2, v0, Lm7/m0;->p:Lr7/b0;

    if-eqz v2, :cond_d

    invoke-virtual {v2, v9}, Lr7/b0;->a(Lr7/a0;)D

    move-result-wide v21

    invoke-static/range {v21 .. v22}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    move-object/from16 v21, v2

    goto :goto_e

    :cond_d
    const/16 v21, 0x0

    :goto_e
    iget-object v2, v0, Lm7/m0;->q:Lr7/b0;

    if-eqz v2, :cond_e

    invoke-virtual {v2, v9}, Lr7/b0;->a(Lr7/a0;)D

    move-result-wide v22

    invoke-static/range {v22 .. v23}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    move-object/from16 v22, v2

    goto :goto_f

    :cond_e
    const/16 v22, 0x0

    :goto_f
    iget-object v2, v0, Lm7/m0;->r:Lr7/b0;

    if-eqz v2, :cond_f

    invoke-virtual {v2, v9}, Lr7/b0;->a(Lr7/a0;)D

    move-result-wide v23

    invoke-static/range {v23 .. v24}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    move-object/from16 v23, v2

    goto :goto_10

    :cond_f
    const/16 v23, 0x0

    :goto_10
    iget-object v2, v0, Lm7/m0;->s:Lr7/b0;

    if-eqz v2, :cond_10

    invoke-virtual {v2, v9}, Lr7/b0;->a(Lr7/a0;)D

    move-result-wide v24

    invoke-static/range {v24 .. v25}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    move-object/from16 v24, v2

    goto :goto_11

    :cond_10
    const/16 v24, 0x0

    :goto_11
    iget-object v2, v0, Lm7/m0;->t:Lr7/b0;

    if-eqz v2, :cond_11

    invoke-virtual {v2, v9}, Lr7/b0;->a(Lr7/a0;)D

    move-result-wide v25

    invoke-static/range {v25 .. v26}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    move-object/from16 v25, v2

    goto :goto_12

    :cond_11
    const/16 v25, 0x0

    :goto_12
    iget-object v2, v0, Lm7/m0;->u:Lr7/b0;

    if-eqz v2, :cond_12

    invoke-virtual {v2, v9}, Lr7/b0;->a(Lr7/a0;)D

    move-result-wide v26

    invoke-static/range {v26 .. v27}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    move-object/from16 v26, v2

    goto :goto_13

    :cond_12
    const/16 v26, 0x0

    :goto_13
    iget-object v2, v0, Lm7/m0;->v:Lr7/b0;

    if-eqz v2, :cond_13

    invoke-virtual {v2, v9}, Lr7/b0;->a(Lr7/a0;)D

    move-result-wide v27

    invoke-static/range {v27 .. v28}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    move-object/from16 v27, v2

    goto :goto_14

    :cond_13
    const/16 v27, 0x0

    :goto_14
    iget-object v2, v0, Lm7/m0;->w:Lr7/b0;

    if-eqz v2, :cond_14

    invoke-virtual {v2, v9}, Lr7/b0;->a(Lr7/a0;)D

    move-result-wide v28

    invoke-static/range {v28 .. v29}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    move-object/from16 v28, v2

    goto :goto_15

    :cond_14
    const/16 v28, 0x0

    :goto_15
    iget-object v2, v0, Lm7/m0;->x:Lr7/b0;

    if-eqz v2, :cond_15

    invoke-virtual {v2, v9}, Lr7/b0;->a(Lr7/a0;)D

    move-result-wide v29

    invoke-static/range {v29 .. v30}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    move-object/from16 v29, v2

    goto :goto_16

    :cond_15
    const/16 v29, 0x0

    :goto_16
    iget-object v2, v0, Lm7/m0;->y:Lr7/b0;

    if-eqz v2, :cond_16

    invoke-virtual {v2, v9}, Lr7/b0;->a(Lr7/a0;)D

    move-result-wide v30

    invoke-static/range {v30 .. v31}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    move-object/from16 v30, v2

    goto :goto_17

    :cond_16
    const/16 v30, 0x0

    :goto_17
    iget-object v2, v0, Lm7/m0;->z:Lr7/b0;

    if-eqz v2, :cond_17

    invoke-virtual {v2, v9}, Lr7/b0;->a(Lr7/a0;)D

    move-result-wide v31

    invoke-static/range {v31 .. v32}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    move-object/from16 v31, v2

    goto :goto_18

    :cond_17
    const/16 v31, 0x0

    :goto_18
    iget-object v2, v0, Lm7/m0;->A:Lr7/b0;

    if-eqz v2, :cond_18

    invoke-virtual {v2, v9}, Lr7/b0;->a(Lr7/a0;)D

    move-result-wide v32

    invoke-static/range {v32 .. v33}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    move-object/from16 v32, v2

    goto :goto_19

    :cond_18
    const/16 v32, 0x0

    :goto_19
    iget-object v2, v0, Lm7/m0;->B:Lr7/b0;

    if-eqz v2, :cond_19

    invoke-virtual {v2, v9}, Lr7/b0;->a(Lr7/a0;)D

    move-result-wide v33

    invoke-static/range {v33 .. v34}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    move-object/from16 v33, v2

    goto :goto_1a

    :cond_19
    const/16 v33, 0x0

    :goto_1a
    iget-object v2, v0, Lm7/m0;->C:Lr7/b0;

    if-eqz v2, :cond_1a

    invoke-virtual {v2, v9}, Lr7/b0;->a(Lr7/a0;)D

    move-result-wide v34

    invoke-static/range {v34 .. v35}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    move-object/from16 v34, v2

    goto :goto_1b

    :cond_1a
    const/16 v34, 0x0

    :goto_1b
    iget-object v2, v0, Lm7/m0;->D:Lr7/b0;

    if-eqz v2, :cond_1b

    invoke-virtual {v2, v9}, Lr7/b0;->a(Lr7/a0;)D

    move-result-wide v35

    invoke-static/range {v35 .. v36}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    move-object/from16 v35, v2

    goto :goto_1c

    :cond_1b
    const/16 v35, 0x0

    :goto_1c
    iget-object v2, v0, Lm7/m0;->E:Lr7/b0;

    if-eqz v2, :cond_1c

    invoke-virtual {v2, v9}, Lr7/b0;->a(Lr7/a0;)D

    move-result-wide v36

    invoke-static/range {v36 .. v37}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    move-object/from16 v36, v2

    goto :goto_1d

    :cond_1c
    const/16 v36, 0x0

    :goto_1d
    iget-object v2, v0, Lm7/m0;->F:Lr7/b0;

    if-eqz v2, :cond_1d

    invoke-virtual {v2, v9}, Lr7/b0;->a(Lr7/a0;)D

    move-result-wide v37

    invoke-static/range {v37 .. v38}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    move-object/from16 v37, v2

    goto :goto_1e

    :cond_1d
    const/16 v37, 0x0

    :goto_1e
    iget-object v2, v0, Lm7/m0;->G:Lr7/b0;

    if-eqz v2, :cond_1e

    invoke-virtual {v2, v9}, Lr7/b0;->a(Lr7/a0;)D

    move-result-wide v38

    invoke-static/range {v38 .. v39}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    move-object/from16 v38, v2

    goto :goto_1f

    :cond_1e
    const/16 v38, 0x0

    :goto_1f
    iget-object v2, v0, Lm7/m0;->H:Lr7/b0;

    if-eqz v2, :cond_1f

    invoke-virtual {v2, v9}, Lr7/b0;->a(Lr7/a0;)D

    move-result-wide v39

    invoke-static/range {v39 .. v40}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    move-object/from16 v39, v2

    goto :goto_20

    :cond_1f
    const/16 v39, 0x0

    :goto_20
    iget-object v2, v0, Lm7/m0;->I:Lr7/b0;

    if-eqz v2, :cond_20

    invoke-virtual {v2, v9}, Lr7/b0;->a(Lr7/a0;)D

    move-result-wide v40

    invoke-static/range {v40 .. v41}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    move-object/from16 v40, v2

    goto :goto_21

    :cond_20
    const/16 v40, 0x0

    :goto_21
    iget-object v2, v0, Lm7/m0;->J:Lr7/b0;

    if-eqz v2, :cond_21

    invoke-virtual {v2, v9}, Lr7/b0;->a(Lr7/a0;)D

    move-result-wide v41

    invoke-static/range {v41 .. v42}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    move-object/from16 v41, v2

    goto :goto_22

    :cond_21
    const/16 v41, 0x0

    :goto_22
    iget-object v2, v0, Lm7/m0;->K:Lr7/b0;

    if-eqz v2, :cond_22

    invoke-virtual {v2, v9}, Lr7/b0;->a(Lr7/a0;)D

    move-result-wide v42

    invoke-static/range {v42 .. v43}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    move-object/from16 v42, v2

    goto :goto_23

    :cond_22
    const/16 v42, 0x0

    :goto_23
    iget-object v2, v0, Lm7/m0;->L:Lr7/b0;

    if-eqz v2, :cond_23

    invoke-virtual {v2, v9}, Lr7/b0;->a(Lr7/a0;)D

    move-result-wide v43

    invoke-static/range {v43 .. v44}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    move-object/from16 v43, v2

    goto :goto_24

    :cond_23
    const/16 v43, 0x0

    :goto_24
    iget-object v2, v0, Lm7/m0;->M:Lr7/b0;

    if-eqz v2, :cond_24

    invoke-virtual {v2, v9}, Lr7/b0;->a(Lr7/a0;)D

    move-result-wide v44

    invoke-static/range {v44 .. v45}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    move-object/from16 v44, v2

    goto :goto_25

    :cond_24
    const/16 v44, 0x0

    :goto_25
    iget-object v2, v0, Lm7/m0;->N:Lr7/b0;

    if-eqz v2, :cond_25

    invoke-virtual {v2, v9}, Lr7/b0;->a(Lr7/a0;)D

    move-result-wide v45

    invoke-static/range {v45 .. v46}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    move-object/from16 v45, v2

    goto :goto_26

    :cond_25
    const/16 v45, 0x0

    :goto_26
    iget-object v2, v0, Lm7/m0;->O:Lr7/b0;

    if-eqz v2, :cond_26

    invoke-virtual {v2, v9}, Lr7/b0;->a(Lr7/a0;)D

    move-result-wide v46

    invoke-static/range {v46 .. v47}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    move-object/from16 v46, v2

    goto :goto_27

    :cond_26
    const/16 v46, 0x0

    :goto_27
    iget-object v2, v0, Lm7/m0;->P:Lr7/b0;

    if-eqz v2, :cond_27

    invoke-virtual {v2, v9}, Lr7/b0;->a(Lr7/a0;)D

    move-result-wide v47

    invoke-static/range {v47 .. v48}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    move-object/from16 v47, v2

    goto :goto_28

    :cond_27
    const/16 v47, 0x0

    :goto_28
    iget-object v2, v0, Lm7/m0;->Q:Lr7/b0;

    if-eqz v2, :cond_28

    invoke-virtual {v2, v9}, Lr7/b0;->a(Lr7/a0;)D

    move-result-wide v48

    invoke-static/range {v48 .. v49}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    move-object/from16 v48, v2

    goto :goto_29

    :cond_28
    const/16 v48, 0x0

    :goto_29
    iget-object v2, v0, Lm7/m0;->R:Lr7/b0;

    if-eqz v2, :cond_29

    invoke-virtual {v2, v9}, Lr7/b0;->a(Lr7/a0;)D

    move-result-wide v49

    invoke-static/range {v49 .. v50}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    move-object/from16 v49, v2

    goto :goto_2a

    :cond_29
    const/16 v49, 0x0

    :goto_2a
    iget-object v2, v0, Lm7/m0;->S:Lr7/b0;

    if-eqz v2, :cond_2a

    invoke-virtual {v2, v9}, Lr7/b0;->a(Lr7/a0;)D

    move-result-wide v50

    invoke-static/range {v50 .. v51}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    move-object/from16 v50, v2

    goto :goto_2b

    :cond_2a
    const/16 v50, 0x0

    :goto_2b
    iget-object v2, v0, Lm7/m0;->T:Lr7/b0;

    if-eqz v2, :cond_2b

    invoke-virtual {v2, v9}, Lr7/b0;->a(Lr7/a0;)D

    move-result-wide v51

    invoke-static/range {v51 .. v52}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    move-object/from16 v16, v2

    goto :goto_2c

    :cond_2b
    const/16 v16, 0x0

    :goto_2c
    iget-object v2, v0, Lm7/m0;->U:Ljava/lang/String;

    iget v9, v0, Lm7/m0;->V:I

    iget-object v0, v0, Lm7/m0;->W:Ln7/c;

    invoke-static {v0, v1}, Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModelKt;->toModel(Ln7/c;Lrj1/a;)Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;

    move-result-object v52

    invoke-static {}, Lorg/joda/time/DateTimeZone;->getDefault()Lorg/joda/time/DateTimeZone;

    move-result-object v0

    invoke-virtual {v0}, Lorg/joda/time/DateTimeZone;->getID()Ljava/lang/String;

    move-result-object v0

    const-string v1, "getID(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v53, v0

    move/from16 v51, v9

    move-object v9, v10

    move-object v10, v11

    move-object v11, v12

    move-object v12, v13

    move-object v13, v14

    move-object v14, v15

    move-object v15, v8

    move-object v8, v5

    move-object v5, v7

    move-object v7, v4

    move-object/from16 v4, v17

    move-object/from16 v17, v19

    move-object/from16 v19, v21

    move-object/from16 v21, v23

    move-object/from16 v23, v25

    move-object/from16 v25, v27

    move-object/from16 v27, v29

    move-object/from16 v29, v31

    move-object/from16 v31, v33

    move-object/from16 v33, v35

    move-object/from16 v35, v37

    move-object/from16 v37, v39

    move-object/from16 v39, v41

    move-object/from16 v41, v43

    move-object/from16 v43, v45

    move-object/from16 v45, v47

    move-object/from16 v47, v49

    move-object/from16 v49, v16

    move-object/from16 v16, v18

    move-object/from16 v18, v20

    move-object/from16 v20, v22

    move-object/from16 v22, v24

    move-object/from16 v24, v26

    move-object/from16 v26, v28

    move-object/from16 v28, v30

    move-object/from16 v30, v32

    move-object/from16 v32, v34

    move-object/from16 v34, v36

    move-object/from16 v36, v38

    move-object/from16 v38, v40

    move-object/from16 v40, v42

    move-object/from16 v42, v44

    move-object/from16 v44, v46

    move-object/from16 v46, v48

    move-object/from16 v48, v50

    move-object/from16 v50, v2

    invoke-direct/range {v3 .. v53}, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;ILcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;Ljava/lang/String;)V

    return-object v3
.end method
