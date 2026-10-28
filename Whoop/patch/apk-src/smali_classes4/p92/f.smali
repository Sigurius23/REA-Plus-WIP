.class public Lp92/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lu92/d;

.field private b:Lcom/google/gson/Gson;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    iput-object v0, p0, Lp92/f;->b:Lcom/google/gson/Gson;

    new-instance v0, Lu92/d;

    const-string v1, "RealTimeRecording"

    invoke-direct {v0, p1, v1}, Lu92/d;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iput-object v0, p0, Lp92/f;->a:Lu92/d;

    return-void
.end method

.method private a(Ljava/lang/String;)Lp92/e;
    .locals 18

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    iget-object v0, v1, Lp92/f;->a:Lu92/d;

    const-string v3, "activityType"

    invoke-direct {v1, v2, v3}, Lp92/f;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lu92/d;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v3, v1, Lp92/f;->a:Lu92/d;

    const-string v4, "sport"

    invoke-direct {v1, v2, v4}, Lp92/f;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lu92/d;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iget-object v4, v1, Lp92/f;->a:Lu92/d;

    const-string v5, "startTime"

    invoke-direct {v1, v2, v5}, Lp92/f;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-wide/16 v6, 0x0

    invoke-virtual {v4, v5, v6, v7}, Lu92/d;->i(Ljava/lang/String;J)J

    move-result-wide v9

    iget-object v4, v1, Lp92/f;->a:Lu92/d;

    const-string v5, "strainGoal"

    invoke-direct {v1, v2, v5}, Lp92/f;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-wide/16 v11, 0x0

    invoke-virtual {v4, v5, v11, v12}, Lu92/d;->f(Ljava/lang/String;D)D

    move-result-wide v13

    iget-object v4, v1, Lp92/f;->a:Lu92/d;

    const-string v5, "strainMapping"

    invoke-direct {v1, v2, v5}, Lp92/f;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v8, ""

    invoke-virtual {v4, v5, v8}, Lu92/d;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iget-object v5, v1, Lp92/f;->a:Lu92/d;

    const-string v11, "useGps"

    invoke-direct {v1, v2, v11}, Lp92/f;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    const/4 v12, 0x0

    invoke-virtual {v5, v11, v12}, Lu92/d;->e(Ljava/lang/String;Z)Z

    move-result v15

    new-instance v5, Lcom/whoop/data/repositories/RestingHeartRate;

    iget-object v11, v1, Lp92/f;->a:Lu92/d;

    move-wide/from16 v16, v6

    const-string v6, "restingHr"

    invoke-direct {v1, v2, v6}, Lp92/f;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    invoke-virtual {v11, v6, v7}, Lu92/d;->g(Ljava/lang/String;F)F

    move-result v6

    invoke-direct {v5, v6}, Lcom/whoop/data/repositories/RestingHeartRate;-><init>(F)V

    cmp-long v6, v9, v16

    const/4 v7, 0x0

    if-eqz v6, :cond_6

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_0

    goto/16 :goto_3

    :cond_0
    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1

    iget-object v6, v1, Lp92/f;->b:Lcom/google/gson/Gson;

    const-class v8, Lcom/whoop/domain/model/StrainRecoveryMapping;

    invoke-virtual {v6, v4, v8}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/domain/model/StrainRecoveryMapping;

    goto :goto_0

    :cond_1
    move-object v4, v7

    :goto_0
    const-string v6, "nap"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    const-string v8, "RealTimeRecording"

    if-eqz v6, :cond_3

    new-instance v7, Llm2/c;

    const/4 v0, 0x1

    invoke-direct {v7, v0}, Llm2/c;-><init>(Z)V

    :cond_2
    :goto_1
    move-object v11, v7

    goto :goto_2

    :cond_3
    const-string v6, "sleep"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    new-instance v7, Llm2/c;

    invoke-direct {v7, v12}, Llm2/c;-><init>(Z)V

    goto :goto_1

    :cond_4
    const-string v6, "workout"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    const/4 v0, 0x2

    :try_start_0
    invoke-static {v3, v0}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v0

    sget-object v3, Lcom/whoop/service/network/model/Sport;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v0, v3}, Lor2/i1;->a([BLandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/whoop/service/network/model/Sport;

    new-instance v3, Llm2/d;

    invoke-direct {v3, v0}, Llm2/d;-><init>(Lcom/whoop/service/network/model/Sport;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v11, v3

    goto :goto_2

    :catch_0
    move-exception v0

    invoke-static {}, Le50/b;->a()Le50/b;

    move-result-object v3

    invoke-virtual {v3}, Le50/b;->d()Ltr2/n;

    move-result-object v3

    const-string v6, "Failed to read workout info"

    new-array v11, v12, [Lqr2/a$a;

    invoke-interface {v3, v8, v6, v0, v11}, Ltr2/n;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    invoke-direct {v1, v7, v2}, Lp92/f;->l(Lp92/e;Ljava/lang/String;)V

    goto :goto_1

    :goto_2
    if-nez v11, :cond_5

    invoke-static {}, Le50/b;->a()Le50/b;

    move-result-object v0

    invoke-virtual {v0}, Le50/b;->d()Ltr2/n;

    move-result-object v0

    const-string v2, "Failed to read activity info"

    new-array v3, v12, [Lqr2/a$a;

    invoke-interface {v0, v8, v2, v3}, Ltr2/n;->p(Ljava/lang/String;Ljava/lang/String;[Lqr2/a$a;)V

    :cond_5
    new-instance v8, Lp92/e;

    move-object v12, v4

    move-object/from16 v16, v5

    invoke-direct/range {v8 .. v16}, Lp92/e;-><init>(JLlm2/b;Lcom/whoop/domain/model/StrainRecoveryMapping;DZLcom/whoop/data/repositories/RestingHeartRate;)V

    return-object v8

    :cond_6
    :goto_3
    return-object v7
.end method

.method private e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, ":"

    invoke-static {p1, v0, p2}, Lih0/d0;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private l(Lp92/e;Ljava/lang/String;)V
    .locals 18

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    const-string v2, "isUsingStrainCoachInRealTime"

    const-string v3, "restingHr"

    const-string v4, "useGps"

    const-string v5, "strainMapping"

    const-string v6, "strainGoal"

    const-string v7, "startTime"

    const-string v8, "sport"

    const-string v9, "activityType"

    if-eqz p1, :cond_4

    invoke-virtual/range {p1 .. p1}, Lp92/e;->c()J

    move-result-wide v10

    invoke-virtual/range {p1 .. p1}, Lp92/e;->d()D

    move-result-wide v12

    invoke-virtual/range {p1 .. p1}, Lp92/e;->e()Lcom/whoop/domain/model/StrainRecoveryMapping;

    move-result-object v14

    if-eqz v14, :cond_0

    iget-object v14, v1, Lp92/f;->b:Lcom/google/gson/Gson;

    invoke-virtual/range {p1 .. p1}, Lp92/e;->e()Lcom/whoop/domain/model/StrainRecoveryMapping;

    move-result-object v15

    invoke-virtual {v14, v15}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v14

    goto :goto_0

    :cond_0
    const-string v14, ""

    :goto_0
    invoke-virtual/range {p1 .. p1}, Lp92/e;->a()Llm2/b;

    move-result-object v15

    move-object/from16 v16, v2

    instance-of v2, v15, Llm2/c;

    move/from16 v17, v2

    if-eqz v17, :cond_2

    check-cast v15, Llm2/c;

    invoke-virtual {v15}, Llm2/c;->s()Z

    move-result v15

    if-eqz v15, :cond_1

    const-string v15, "nap"

    :goto_1
    move-object/from16 v17, v3

    move-object v2, v15

    const/4 v15, 0x0

    goto :goto_3

    :cond_1
    const-string v15, "sleep"

    goto :goto_1

    :cond_2
    instance-of v2, v15, Llm2/d;

    if-eqz v2, :cond_3

    :try_start_0
    check-cast v15, Llm2/d;

    invoke-virtual {v15}, Llm2/d;->k()Lcom/whoop/service/network/model/Sport;

    move-result-object v2

    invoke-static {v2}, Lor2/i1;->b(Landroid/os/Parcelable;)[B

    move-result-object v2

    const/4 v15, 0x2

    invoke-static {v2, v15}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-string v15, "workout"

    move-object/from16 v17, v15

    move-object v15, v2

    move-object/from16 v2, v17

    :goto_2
    move-object/from16 v17, v3

    goto :goto_3

    :catch_0
    move-exception v0

    invoke-static {}, Le50/b;->a()Le50/b;

    move-result-object v2

    invoke-virtual {v2}, Le50/b;->d()Ltr2/n;

    move-result-object v2

    const/4 v3, 0x0

    new-array v3, v3, [Lqr2/a$a;

    const-string v4, "RealTimeRecording"

    const-string v5, "Failed to store Real Time Activity sport"

    invoke-interface {v2, v4, v5, v0, v3}, Ltr2/n;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lp92/f;->k(Lp92/e;)V

    return-void

    :cond_3
    const/4 v2, 0x0

    move-object v15, v2

    goto :goto_2

    :goto_3
    iget-object v3, v1, Lp92/f;->a:Lu92/d;

    invoke-direct {v1, v0, v9}, Lp92/f;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v3, v9, v2}, Lu92/d;->v(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v2, v1, Lp92/f;->a:Lu92/d;

    invoke-direct {v1, v0, v8}, Lp92/f;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3, v15}, Lu92/d;->v(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v2, v1, Lp92/f;->a:Lu92/d;

    invoke-direct {v1, v0, v7}, Lp92/f;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3, v10, v11}, Lu92/d;->u(Ljava/lang/String;J)V

    iget-object v2, v1, Lp92/f;->a:Lu92/d;

    invoke-direct {v1, v0, v6}, Lp92/f;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3, v12, v13}, Lu92/d;->r(Ljava/lang/String;D)V

    iget-object v2, v1, Lp92/f;->a:Lu92/d;

    invoke-direct {v1, v0, v5}, Lp92/f;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3, v14}, Lu92/d;->v(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v2, v1, Lp92/f;->a:Lu92/d;

    invoke-direct {v1, v0, v4}, Lp92/f;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {p1 .. p1}, Lp92/e;->f()Z

    move-result v4

    invoke-virtual {v2, v3, v4}, Lu92/d;->q(Ljava/lang/String;Z)V

    iget-object v2, v1, Lp92/f;->a:Lu92/d;

    move-object/from16 v3, v17

    invoke-direct {v1, v0, v3}, Lp92/f;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, Lp92/e;->b()Lcom/whoop/data/repositories/RestingHeartRate;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/data/repositories/RestingHeartRate;->getValue()F

    move-result v3

    invoke-virtual {v2, v0, v3}, Lu92/d;->s(Ljava/lang/String;F)V

    iget-object v0, v1, Lp92/f;->a:Lu92/d;

    const/4 v2, 0x1

    move-object/from16 v10, v16

    invoke-virtual {v0, v10, v2}, Lu92/d;->q(Ljava/lang/String;Z)V

    return-void

    :cond_4
    move-object v10, v2

    iget-object v2, v1, Lp92/f;->a:Lu92/d;

    invoke-direct {v1, v0, v9}, Lp92/f;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    filled-new-array {v9}, [Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v2, v9}, Lu92/d;->p([Ljava/lang/String;)V

    iget-object v2, v1, Lp92/f;->a:Lu92/d;

    invoke-direct {v1, v0, v8}, Lp92/f;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    filled-new-array {v8}, [Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v2, v8}, Lu92/d;->p([Ljava/lang/String;)V

    iget-object v2, v1, Lp92/f;->a:Lu92/d;

    invoke-direct {v1, v0, v7}, Lp92/f;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    filled-new-array {v7}, [Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2, v7}, Lu92/d;->p([Ljava/lang/String;)V

    iget-object v2, v1, Lp92/f;->a:Lu92/d;

    invoke-direct {v1, v0, v6}, Lp92/f;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    filled-new-array {v6}, [Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v6}, Lu92/d;->p([Ljava/lang/String;)V

    iget-object v2, v1, Lp92/f;->a:Lu92/d;

    invoke-direct {v1, v0, v5}, Lp92/f;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    filled-new-array {v5}, [Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Lu92/d;->p([Ljava/lang/String;)V

    iget-object v2, v1, Lp92/f;->a:Lu92/d;

    invoke-direct {v1, v0, v4}, Lp92/f;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    filled-new-array {v4}, [Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Lu92/d;->p([Ljava/lang/String;)V

    iget-object v2, v1, Lp92/f;->a:Lu92/d;

    invoke-direct {v1, v0, v3}, Lp92/f;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lu92/d;->p([Ljava/lang/String;)V

    iget-object v0, v1, Lp92/f;->a:Lu92/d;

    filled-new-array {v10}, [Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lu92/d;->p([Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public b()Lp92/e;
    .locals 1

    const-string v0, "CURRENT"

    invoke-direct {p0, v0}, Lp92/f;->a(Ljava/lang/String;)Lp92/e;

    move-result-object v0

    return-object v0
.end method

.method public declared-synchronized c()Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lp92/a;",
            ">;"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lp92/f;->a:Lu92/d;

    const-string v1, "storedIds"

    invoke-virtual {v0, v1}, Lu92/d;->l(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    new-instance v1, Ljava/util/LinkedList;

    invoke-direct {v1}, Ljava/util/LinkedList;-><init>()V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    invoke-direct {p0, v2}, Lp92/f;->a(Ljava/lang/String;)Lp92/e;

    move-result-object v4

    iget-object v5, p0, Lp92/f;->a:Lu92/d;

    const-string v6, "endTime"

    invoke-direct {p0, v2, v6}, Lp92/f;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-wide/16 v6, -0x1

    invoke-virtual {v5, v2, v6, v7}, Lu92/d;->i(Ljava/lang/String;J)J

    move-result-wide v5

    new-instance v2, Lp92/a;

    invoke-direct {v2, v4, v5, v6, v3}, Lp92/a;-><init>(Lp92/e;JI)V

    invoke-virtual {v1, v2}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    monitor-exit p0

    return-object v1

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public declared-synchronized d()I
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lp92/f;->a:Lu92/d;

    const-string v1, "storedIds"

    invoke-virtual {v0, v1}, Lu92/d;->l(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public declared-synchronized f(Lp92/e;J)I
    .locals 4

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lp92/f;->a:Lu92/d;

    const-string v1, "lastId"

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Lu92/d;->h(Ljava/lang/String;I)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lp92/f;->a:Lu92/d;

    const-string v3, "lastId"

    invoke-virtual {v2, v3, v0}, Lu92/d;->t(Ljava/lang/String;I)V

    invoke-direct {p0, p1, v1}, Lp92/f;->l(Lp92/e;Ljava/lang/String;)V

    iget-object p1, p0, Lp92/f;->a:Lu92/d;

    const-string v2, "endTime"

    invoke-direct {p0, v1, v2}, Lp92/f;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2, p2, p3}, Lu92/d;->u(Ljava/lang/String;J)V

    iget-object p1, p0, Lp92/f;->a:Lu92/d;

    const-string p2, "storedIds"

    invoke-virtual {p1, p2}, Lu92/d;->l(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p2, p0, Lp92/f;->a:Lu92/d;

    const-string p3, "storedIds"

    invoke-virtual {p2, p3, p1}, Lu92/d;->w(Ljava/lang/String;Ljava/util/List;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized g(I)V
    .locals 2

    monitor-enter p0

    :try_start_0
    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    invoke-direct {p0, v0, p1}, Lp92/f;->l(Lp92/e;Ljava/lang/String;)V

    iget-object v0, p0, Lp92/f;->a:Lu92/d;

    const-string v1, "endTime"

    invoke-direct {p0, p1, v1}, Lp92/f;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lu92/d;->p([Ljava/lang/String;)V

    iget-object v0, p0, Lp92/f;->a:Lu92/d;

    const-string v1, "storedIds"

    invoke-virtual {v0, v1}, Lu92/d;->l(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    iget-object p1, p0, Lp92/f;->a:Lu92/d;

    const-string v1, "storedIds"

    invoke-virtual {p1, v1, v0}, Lu92/d;->w(Ljava/lang/String;Ljava/util/List;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public h(Lp92/a;)V
    .locals 0

    invoke-virtual {p1}, Lp92/a;->b()I

    move-result p1

    invoke-virtual {p0, p1}, Lp92/f;->g(I)V

    return-void
.end method

.method public i()V
    .locals 2

    iget-object v0, p0, Lp92/f;->a:Lu92/d;

    const-string v1, "realTimeCalories"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lu92/d;->p([Ljava/lang/String;)V

    return-void
.end method

.method public j(D)V
    .locals 2

    iget-object v0, p0, Lp92/f;->a:Lu92/d;

    const-string v1, "realTimeCalories"

    invoke-virtual {v0, v1, p1, p2}, Lu92/d;->r(Ljava/lang/String;D)V

    return-void
.end method

.method public k(Lp92/e;)V
    .locals 1

    const-string v0, "CURRENT"

    invoke-direct {p0, p1, v0}, Lp92/f;->l(Lp92/e;Ljava/lang/String;)V

    return-void
.end method
