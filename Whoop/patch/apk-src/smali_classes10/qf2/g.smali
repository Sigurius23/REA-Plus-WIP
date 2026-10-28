.class public abstract Lqf2/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a6\u0010\n\u001a\u0004\u0018\u00010\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0007H\u0086@\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/whoop/smart/alarm/data/network/api/SmartAlarmApi;",
        "Ltr2/n;",
        "log",
        "Lrf2/a;",
        "dao",
        "Liy1/c;",
        "metricWriter",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;",
        "a",
        "(Lcom/whoop/smart/alarm/data/network/api/SmartAlarmApi;Ltr2/n;Lrf2/a;Liy1/c;Lcom/whoop/data/repositories/FeatureFlagChecker;Lq83/d;)Ljava/lang/Object;",
        "smart-alarm_release"
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
.method public static final a(Lcom/whoop/smart/alarm/data/network/api/SmartAlarmApi;Ltr2/n;Lrf2/a;Liy1/c;Lcom/whoop/data/repositories/FeatureFlagChecker;Lq83/d;)Ljava/lang/Object;
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/smart/alarm/data/network/api/SmartAlarmApi;",
            "Ltr2/n;",
            "Lrf2/a;",
            "Liy1/c;",
            "Lcom/whoop/data/repositories/FeatureFlagChecker;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p1

    move-object/from16 v1, p5

    const-string v2, "Event:"

    instance-of v3, v1, Lqf2/g$a;

    if-eqz v3, :cond_0

    move-object v3, v1

    check-cast v3, Lqf2/g$a;

    iget v4, v3, Lqf2/g$a;->H:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lqf2/g$a;->H:I

    goto :goto_0

    :cond_0
    new-instance v3, Lqf2/g$a;

    invoke-direct {v3, v1}, Lqf2/g$a;-><init>(Lq83/d;)V

    :goto_0
    iget-object v1, v3, Lqf2/g$a;->G:Ljava/lang/Object;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v5, v3, Lqf2/g$a;->H:I

    const/4 v6, 0x3

    const/4 v7, 0x2

    const/4 v8, 0x1

    const/4 v9, 0x0

    const-string v10, "WakeWindow"

    const/4 v11, 0x0

    if-eqz v5, :cond_4

    if-eq v5, v8, :cond_3

    if-eq v5, v7, :cond_2

    if-ne v5, v6, :cond_1

    iget-object v0, v3, Lqf2/g$a;->F:Ljava/lang/Object;

    check-cast v0, Lpg3/v0;

    iget-object v0, v3, Lqf2/g$a;->E:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/data/repositories/FeatureFlagChecker;

    iget-object v0, v3, Lqf2/g$a;->z:Ljava/lang/Object;

    check-cast v0, Liy1/c;

    iget-object v0, v3, Lqf2/g$a;->y:Ljava/lang/Object;

    check-cast v0, Lrf2/a;

    iget-object v0, v3, Lqf2/g$a;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ltr2/n;

    iget-object v0, v3, Lqf2/g$a;->w:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/smart/alarm/data/network/api/SmartAlarmApi;

    :try_start_0
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_5

    :catch_0
    move-exception v0

    goto/16 :goto_4

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v0, v3, Lqf2/g$a;->F:Ljava/lang/Object;

    check-cast v0, Lpg3/v0;

    iget-object v0, v3, Lqf2/g$a;->E:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/data/repositories/FeatureFlagChecker;

    iget-object v0, v3, Lqf2/g$a;->z:Ljava/lang/Object;

    check-cast v0, Liy1/c;

    iget-object v5, v3, Lqf2/g$a;->y:Ljava/lang/Object;

    check-cast v5, Lrf2/a;

    iget-object v5, v3, Lqf2/g$a;->x:Ljava/lang/Object;

    check-cast v5, Ltr2/n;

    iget-object v7, v3, Lqf2/g$a;->w:Ljava/lang/Object;

    check-cast v7, Lcom/whoop/smart/alarm/data/network/api/SmartAlarmApi;

    :try_start_1
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto/16 :goto_2

    :catch_1
    move-exception v0

    move-object v2, v5

    goto/16 :goto_4

    :cond_3
    iget-object v0, v3, Lqf2/g$a;->E:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/data/repositories/FeatureFlagChecker;

    iget-object v0, v3, Lqf2/g$a;->z:Ljava/lang/Object;

    check-cast v0, Liy1/c;

    iget-object v5, v3, Lqf2/g$a;->y:Ljava/lang/Object;

    check-cast v5, Lrf2/a;

    iget-object v8, v3, Lqf2/g$a;->x:Ljava/lang/Object;

    check-cast v8, Ltr2/n;

    iget-object v12, v3, Lqf2/g$a;->w:Ljava/lang/Object;

    check-cast v12, Lcom/whoop/smart/alarm/data/network/api/SmartAlarmApi;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v20, v5

    move-object v5, v1

    move-object/from16 v1, v20

    goto :goto_1

    :cond_4
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    const-string v1, "GET /smart-alarm-service/v1/smartalarm/preferences"

    new-array v5, v9, [Lqr2/a$a;

    invoke-interface {v0, v10, v1, v5}, Ltr2/n;->x(Ljava/lang/String;Ljava/lang/String;[Lqr2/a$a;)V

    iput-object v11, v3, Lqf2/g$a;->w:Ljava/lang/Object;

    iput-object v0, v3, Lqf2/g$a;->x:Ljava/lang/Object;

    move-object/from16 v1, p2

    iput-object v1, v3, Lqf2/g$a;->y:Ljava/lang/Object;

    move-object/from16 v5, p3

    iput-object v5, v3, Lqf2/g$a;->z:Ljava/lang/Object;

    iput-object v11, v3, Lqf2/g$a;->E:Ljava/lang/Object;

    iput v8, v3, Lqf2/g$a;->H:I

    move-object/from16 v8, p0

    invoke-interface {v8, v3}, Lcom/whoop/smart/alarm/data/network/api/SmartAlarmApi;->getSmartAlarmUserInfoResponseAlarmService(Lq83/d;)Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v4, :cond_5

    goto/16 :goto_3

    :cond_5
    move-object/from16 v20, v8

    move-object v8, v0

    move-object v0, v5

    move-object/from16 v5, v20

    :goto_1
    check-cast v5, Lpg3/v0;

    iget-object v12, v5, Lpg3/v0;->a:Lud3/x0;

    iget v12, v12, Lud3/x0;->z:I

    const-string v13, "/smart-alarm-service/v1/smartalarm/preferences returned response code "

    invoke-static {v12, v13}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v12

    new-array v13, v9, [Lqr2/a$a;

    invoke-interface {v8, v10, v12, v13}, Ltr2/n;->x(Ljava/lang/String;Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v12, v5, Lpg3/v0;->a:Lud3/x0;

    iget-boolean v13, v12, Lud3/x0;->Q:Z

    if-eqz v13, :cond_7

    iget-object v0, v5, Lpg3/v0;->b:Ljava/lang/Object;

    if-eqz v0, :cond_6

    check-cast v0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;

    invoke-virtual {v0}, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->toSmartAlarmUserInfo()Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;

    move-result-object v0

    return-object v0

    :cond_6
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Required value was null."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    iget v5, v12, Lud3/x0;->z:I

    const/16 v12, 0x194

    if-ne v5, v12, :cond_a

    :try_start_2
    iput-object v11, v3, Lqf2/g$a;->w:Ljava/lang/Object;

    iput-object v8, v3, Lqf2/g$a;->x:Ljava/lang/Object;

    iput-object v11, v3, Lqf2/g$a;->y:Ljava/lang/Object;

    iput-object v0, v3, Lqf2/g$a;->z:Ljava/lang/Object;

    iput-object v11, v3, Lqf2/g$a;->E:Ljava/lang/Object;

    iput-object v11, v3, Lqf2/g$a;->F:Ljava/lang/Object;

    iput v7, v3, Lqf2/g$a;->H:I

    invoke-interface {v1, v3}, Lrf2/a;->deleteAll(Lq83/d;)Ljava/lang/Object;

    move-result-object v1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    if-ne v1, v4, :cond_8

    goto :goto_3

    :cond_8
    move-object v5, v8

    :goto_2
    :try_start_3
    new-instance v12, Ljy1/a;

    sget-object v1, Ley1/g;->ALARM_CACHE_PURGE:Ley1/g;

    invoke-virtual {v1}, Ley1/g;->getValue()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v1}, Ley1/g;->getValue()Ljava/lang/String;

    move-result-object v1

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v16

    const/16 v18, 0x11

    const/16 v19, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v12 .. v19}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v11, v3, Lqf2/g$a;->w:Ljava/lang/Object;

    iput-object v5, v3, Lqf2/g$a;->x:Ljava/lang/Object;

    iput-object v11, v3, Lqf2/g$a;->y:Ljava/lang/Object;

    iput-object v11, v3, Lqf2/g$a;->z:Ljava/lang/Object;

    iput-object v11, v3, Lqf2/g$a;->E:Ljava/lang/Object;

    iput-object v11, v3, Lqf2/g$a;->F:Ljava/lang/Object;

    iput v6, v3, Lqf2/g$a;->H:I

    invoke-interface {v0, v12, v3}, Liy1/c;->a(Ljy1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object v0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    if-ne v0, v4, :cond_9

    :goto_3
    return-object v4

    :catch_2
    move-exception v0

    move-object v2, v8

    :goto_4
    const-string v1, "Failed to delete after 404"

    new-array v3, v9, [Lqr2/a$a;

    invoke-interface {v2, v10, v1, v0, v3}, Ltr2/n;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    :cond_9
    :goto_5
    return-object v11

    :cond_a
    const-string v0, "Failed to etch user info record with code "

    invoke-static {v5, v0}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-array v1, v9, [Lqr2/a$a;

    invoke-interface {v8, v10, v0, v1}, Ltr2/n;->e(Ljava/lang/String;Ljava/lang/String;[Lqr2/a$a;)V

    return-object v11
.end method
