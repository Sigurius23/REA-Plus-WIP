.class final Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$pollSmartAlarmTrigger$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->pollSmartAlarmTrigger(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.data.repositories.SmartAlarmTriggerRepository$pollSmartAlarmTrigger$1"
    f = "SmartAlarmTriggerRepository.kt"
    l = {
        0x2b0,
        0x2b9,
        0x2bc,
        0x2c1,
        0x2cb,
        0x2d8,
        0x2dd,
        0x2de
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field Z$0:Z

.field label:I

.field final synthetic this$0:Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;


# direct methods
.method public constructor <init>(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$pollSmartAlarmTrigger$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$pollSmartAlarmTrigger$1;->this$0:Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance p1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$pollSmartAlarmTrigger$1;

    iget-object v0, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$pollSmartAlarmTrigger$1;->this$0:Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;

    invoke-direct {p1, v0, p2}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$pollSmartAlarmTrigger$1;-><init>(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;Lq83/d;)V

    return-object p1
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$pollSmartAlarmTrigger$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$pollSmartAlarmTrigger$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$pollSmartAlarmTrigger$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$pollSmartAlarmTrigger$1;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    move-object/from16 v1, p0

    const-string v0, "GET /smart-alarm-service/v1/smartalarm/poll returned response code "

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$pollSmartAlarmTrigger$1;->label:I

    const/4 v4, 0x1

    sget-object v5, Ll83/a0;->a:Ll83/a0;

    const/4 v6, 0x0

    const-string v7, "WakeWindow"

    const/4 v8, 0x0

    const-string v9, "Error:"

    packed-switch v3, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    iget-object v0, v1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$pollSmartAlarmTrigger$1;->L$1:Ljava/lang/Object;

    check-cast v0, Lsf2/a;

    iget-object v0, v1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$pollSmartAlarmTrigger$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_b

    :pswitch_1
    iget-boolean v0, v1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$pollSmartAlarmTrigger$1;->Z$0:Z

    iget-object v3, v1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$pollSmartAlarmTrigger$1;->L$1:Ljava/lang/Object;

    check-cast v3, Lsf2/a;

    iget-object v3, v1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$pollSmartAlarmTrigger$1;->L$0:Ljava/lang/Object;

    check-cast v3, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v3, p1

    goto/16 :goto_9

    :pswitch_2
    iget-object v0, v1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$pollSmartAlarmTrigger$1;->L$2:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/data/remote/domain/dto/PollingSmartAlarmTrigger;

    iget-object v0, v1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$pollSmartAlarmTrigger$1;->L$1:Ljava/lang/Object;

    check-cast v0, Lsf2/a;

    iget-object v0, v1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$pollSmartAlarmTrigger$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_c

    :pswitch_3
    iget-boolean v0, v1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$pollSmartAlarmTrigger$1;->Z$0:Z

    iget-object v3, v1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$pollSmartAlarmTrigger$1;->L$2:Ljava/lang/Object;

    check-cast v3, Ljava/lang/Exception;

    iget-object v4, v1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$pollSmartAlarmTrigger$1;->L$1:Ljava/lang/Object;

    check-cast v4, Lsf2/a;

    iget-object v9, v1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$pollSmartAlarmTrigger$1;->L$0:Ljava/lang/Object;

    check-cast v9, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_6

    :pswitch_4
    iget-boolean v3, v1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$pollSmartAlarmTrigger$1;->Z$0:Z

    iget-object v0, v1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$pollSmartAlarmTrigger$1;->L$2:Ljava/lang/Object;

    check-cast v0, Lpg3/v0;

    iget-object v0, v1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$pollSmartAlarmTrigger$1;->L$1:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lsf2/a;

    iget-object v0, v1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$pollSmartAlarmTrigger$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;

    :try_start_0
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_4

    :catch_0
    move-exception v0

    move/from16 v19, v3

    move-object v3, v0

    move/from16 v0, v19

    goto/16 :goto_5

    :pswitch_5
    iget-boolean v3, v1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$pollSmartAlarmTrigger$1;->Z$0:Z

    iget-object v4, v1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$pollSmartAlarmTrigger$1;->L$1:Ljava/lang/Object;

    check-cast v4, Lsf2/a;

    iget-object v10, v1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$pollSmartAlarmTrigger$1;->L$0:Ljava/lang/Object;

    check-cast v10, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;

    :try_start_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move v10, v3

    move-object/from16 v3, p1

    goto/16 :goto_3

    :pswitch_6
    iget-boolean v3, v1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$pollSmartAlarmTrigger$1;->Z$0:Z

    iget-object v4, v1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$pollSmartAlarmTrigger$1;->L$1:Ljava/lang/Object;

    check-cast v4, Lsf2/a;

    iget-object v10, v1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$pollSmartAlarmTrigger$1;->L$0:Ljava/lang/Object;

    check-cast v10, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move v10, v3

    move-object/from16 v3, p1

    goto :goto_2

    :pswitch_7
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v3, p1

    goto :goto_0

    :pswitch_8
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v3, v1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$pollSmartAlarmTrigger$1;->this$0:Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;

    iput v4, v1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$pollSmartAlarmTrigger$1;->label:I

    invoke-static {v3, v1}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->access$getSmartAlarmUserInfo(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;Lq83/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_0

    goto/16 :goto_a

    :cond_0
    :goto_0
    check-cast v3, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;

    if-nez v3, :cond_1

    return-object v5

    :cond_1
    iget-object v10, v1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$pollSmartAlarmTrigger$1;->this$0:Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;

    invoke-static {v10, v3}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->access$alarmTypeRequiresPolling(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;)Z

    move-result v10

    iget-object v11, v1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$pollSmartAlarmTrigger$1;->this$0:Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;

    invoke-static {v11, v3, v10}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->access$checkHighFrequencyMode(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;Z)V

    if-nez v10, :cond_3

    invoke-virtual {v3}, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->getSmartAlarmEnabled()Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "exact time alarm"

    goto :goto_1

    :cond_2
    const-string v0, "disabled"

    :goto_1
    iget-object v2, v1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$pollSmartAlarmTrigger$1;->this$0:Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;

    invoke-static {v2}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->access$getLogger(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;)Ltr2/n;

    move-result-object v2

    const-string v3, "Skipping polling because alarm is "

    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-array v3, v6, [Lqr2/a$a;

    invoke-interface {v2, v7, v0, v3}, Ltr2/n;->x(Ljava/lang/String;Ljava/lang/String;[Lqr2/a$a;)V

    return-object v5

    :cond_3
    invoke-static {v3}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepositoryKt;->generateCompositeId(Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;)Lsf2/a;

    move-result-object v11

    invoke-static {v3, v8, v4, v8}, Lkp0/p;->d(Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;Lorg/joda/time/DateTime;ILjava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_d

    iget-object v3, v1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$pollSmartAlarmTrigger$1;->this$0:Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;

    invoke-static {v3}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->access$getSmartAlarmUserInfoDao$p(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;)Lrf2/a;

    move-result-object v3

    invoke-virtual {v11}, Lsf2/a;->a()Ljava/lang/String;

    move-result-object v4

    iput-object v8, v1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$pollSmartAlarmTrigger$1;->L$0:Ljava/lang/Object;

    iput-object v11, v1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$pollSmartAlarmTrigger$1;->L$1:Ljava/lang/Object;

    iput-boolean v10, v1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$pollSmartAlarmTrigger$1;->Z$0:Z

    const/4 v12, 0x2

    iput v12, v1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$pollSmartAlarmTrigger$1;->label:I

    invoke-interface {v3, v4, v1}, Lrf2/a;->e(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_4

    goto/16 :goto_a

    :cond_4
    move-object v4, v11

    :goto_2
    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-nez v3, :cond_c

    :try_start_2
    iget-object v3, v1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$pollSmartAlarmTrigger$1;->this$0:Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;

    invoke-static {v3}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->access$getLogger(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;)Ltr2/n;

    move-result-object v3

    const-string v11, "GET /smart-alarm-service/v1/smartalarm/poll"

    new-array v12, v6, [Lqr2/a$a;

    invoke-interface {v3, v7, v11, v12}, Ltr2/n;->x(Ljava/lang/String;Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v3, v1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$pollSmartAlarmTrigger$1;->this$0:Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;

    invoke-static {v3}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->access$getSmartAlarmApi$p(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;)Lcom/whoop/smart/alarm/data/network/api/SmartAlarmApi;

    move-result-object v3

    iput-object v8, v1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$pollSmartAlarmTrigger$1;->L$0:Ljava/lang/Object;

    iput-object v4, v1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$pollSmartAlarmTrigger$1;->L$1:Ljava/lang/Object;

    iput-boolean v10, v1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$pollSmartAlarmTrigger$1;->Z$0:Z

    const/4 v11, 0x3

    iput v11, v1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$pollSmartAlarmTrigger$1;->label:I

    invoke-interface {v3, v1}, Lcom/whoop/smart/alarm/data/network/api/SmartAlarmApi;->pollSmartAlarmTriggerAlarmService(Lq83/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_5

    goto/16 :goto_a

    :cond_5
    :goto_3
    check-cast v3, Lpg3/v0;

    iget-object v11, v1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$pollSmartAlarmTrigger$1;->this$0:Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;

    invoke-static {v11}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->access$getLogger(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;)Ltr2/n;

    move-result-object v11

    iget-object v12, v3, Lpg3/v0;->a:Lud3/x0;

    iget v12, v12, Lud3/x0;->z:I

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v12, v6, [Lqr2/a$a;

    invoke-interface {v11, v7, v0, v12}, Ltr2/n;->x(Ljava/lang/String;Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v0, v3, Lpg3/v0;->a:Lud3/x0;

    iget-boolean v0, v0, Lud3/x0;->Q:Z

    if-eqz v0, :cond_7

    iget-object v0, v3, Lpg3/v0;->b:Ljava/lang/Object;

    if-eqz v0, :cond_6

    check-cast v0, Lcom/whoop/data/remote/domain/dto/PollingSmartAlarmTriggerDto;

    invoke-virtual {v0}, Lcom/whoop/data/remote/domain/dto/PollingSmartAlarmTriggerDto;->toPollingSmartAlarmTrigger()Lcom/whoop/data/remote/domain/dto/PollingSmartAlarmTrigger;

    move-result-object v0

    goto/16 :goto_8

    :catch_1
    move-exception v0

    move-object v3, v0

    move v0, v10

    goto :goto_5

    :cond_6
    const-string v0, "Required value was null."

    new-instance v3, Ljava/lang/IllegalArgumentException;

    invoke-direct {v3, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v3

    :cond_7
    iget-object v0, v1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$pollSmartAlarmTrigger$1;->this$0:Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;

    invoke-static {v0}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->access$getMetricWriter$p(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;)Liy1/c;

    move-result-object v0

    new-instance v11, Ljy1/a;

    sget-object v3, Ley1/g;->TRIGGER_ALARM_POLL:Ley1/g;

    invoke-virtual {v3}, Ley1/g;->getValue()Ljava/lang/String;

    move-result-object v13

    sget-object v3, Ley1/j$c;->x:Ley1/j$c;

    invoke-virtual {v3}, Ley1/j;->a()Ljava/lang/String;

    move-result-object v3

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    const/16 v17, 0x11

    const/16 v18, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v11 .. v18}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v8, v1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$pollSmartAlarmTrigger$1;->L$0:Ljava/lang/Object;

    iput-object v4, v1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$pollSmartAlarmTrigger$1;->L$1:Ljava/lang/Object;

    iput-object v8, v1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$pollSmartAlarmTrigger$1;->L$2:Ljava/lang/Object;

    iput-boolean v10, v1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$pollSmartAlarmTrigger$1;->Z$0:Z

    const/4 v3, 0x4

    iput v3, v1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$pollSmartAlarmTrigger$1;->label:I

    invoke-interface {v0, v11, v1}, Liy1/c;->a(Ljy1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    if-ne v0, v2, :cond_8

    goto/16 :goto_a

    :cond_8
    move v3, v10

    :goto_4
    move v10, v3

    goto :goto_7

    :goto_5
    iget-object v10, v1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$pollSmartAlarmTrigger$1;->this$0:Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;

    invoke-static {v10}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->access$getMetricWriter$p(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;)Liy1/c;

    move-result-object v10

    new-instance v11, Ljy1/a;

    sget-object v12, Ley1/g;->TRIGGER_ALARM_POLL:Ley1/g;

    invoke-virtual {v12}, Ley1/g;->getValue()Ljava/lang/String;

    move-result-object v13

    sget-object v12, Ley1/j$c;->x:Ley1/j$c;

    invoke-virtual {v12}, Ley1/j;->a()Ljava/lang/String;

    move-result-object v12

    invoke-static {v9, v12}, Lr80/c;->t(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v15

    const/16 v17, 0x11

    const/16 v18, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v11 .. v18}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v8, v1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$pollSmartAlarmTrigger$1;->L$0:Ljava/lang/Object;

    iput-object v4, v1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$pollSmartAlarmTrigger$1;->L$1:Ljava/lang/Object;

    iput-object v3, v1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$pollSmartAlarmTrigger$1;->L$2:Ljava/lang/Object;

    iput-boolean v0, v1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$pollSmartAlarmTrigger$1;->Z$0:Z

    const/4 v9, 0x5

    iput v9, v1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$pollSmartAlarmTrigger$1;->label:I

    invoke-interface {v10, v11, v1}, Liy1/c;->a(Ljy1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v2, :cond_9

    goto/16 :goto_a

    :cond_9
    :goto_6
    iget-object v9, v1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$pollSmartAlarmTrigger$1;->this$0:Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;

    invoke-static {v9}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->access$getLogger(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;)Ltr2/n;

    move-result-object v9

    iget-object v10, v1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$pollSmartAlarmTrigger$1;->this$0:Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;

    invoke-static {v10}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->access$getCrashReporter(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;)Lrr2/c;

    move-result-object v10

    const-string v11, "WakeWindow Failed to poll smart alarm trigger"

    invoke-static {v3, v11, v9, v10}, Lw02/b;->a(Ljava/lang/Throwable;Ljava/lang/String;Ltr2/n;Lrr2/c;)Ljava/lang/String;

    move v10, v0

    :goto_7
    move-object v0, v8

    :goto_8
    if-nez v0, :cond_a

    return-object v5

    :cond_a
    invoke-virtual {v0}, Lcom/whoop/data/remote/domain/dto/PollingSmartAlarmTrigger;->getAlarmTriggered()Z

    move-result v0

    if-eqz v0, :cond_b

    iget-object v0, v1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$pollSmartAlarmTrigger$1;->this$0:Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;

    invoke-static {v0}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->access$getLogger(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;)Ltr2/n;

    move-result-object v0

    const-string v3, "PollSmartAlarmTrigger: alarmTriggered = true"

    new-array v6, v6, [Lqr2/a$a;

    invoke-interface {v0, v7, v3, v6}, Ltr2/n;->k(Ljava/lang/String;Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v11, v1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$pollSmartAlarmTrigger$1;->this$0:Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;

    sget-object v13, Lf82/b;->LONG_REQUEST_POLL:Lf82/b;

    const/16 v16, 0xd

    const/16 v17, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v11 .. v17}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->saveSmartAlarmDiagnosticEvents$default(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;Lf82/a;Lf82/b;Ljava/lang/String;Lzj0/h;ILjava/lang/Object;)V

    iget-object v0, v1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$pollSmartAlarmTrigger$1;->this$0:Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;

    sget-object v3, Ley1/g;->TRIGGER_ALARM_POLL:Ley1/g;

    iput-object v8, v1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$pollSmartAlarmTrigger$1;->L$0:Ljava/lang/Object;

    iput-object v8, v1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$pollSmartAlarmTrigger$1;->L$1:Ljava/lang/Object;

    iput-object v8, v1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$pollSmartAlarmTrigger$1;->L$2:Ljava/lang/Object;

    iput-boolean v10, v1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$pollSmartAlarmTrigger$1;->Z$0:Z

    const/4 v6, 0x6

    iput v6, v1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$pollSmartAlarmTrigger$1;->label:I

    invoke-static {v0, v4, v13, v3, v1}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->access$runAlarm(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;Lsf2/a;Lf82/b;Ley1/g;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v2, :cond_10

    goto :goto_a

    :cond_b
    iget-object v0, v1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$pollSmartAlarmTrigger$1;->this$0:Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;

    invoke-static {v0}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->access$getLogger(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;)Ltr2/n;

    move-result-object v0

    const-string v2, "PollSmartAlarmTrigger: alarmTriggered = false"

    new-array v3, v6, [Lqr2/a$a;

    invoke-interface {v0, v7, v2, v3}, Ltr2/n;->k(Ljava/lang/String;Ljava/lang/String;[Lqr2/a$a;)V

    goto :goto_c

    :cond_c
    move-object v11, v4

    :cond_d
    move v0, v10

    iget-object v3, v1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$pollSmartAlarmTrigger$1;->this$0:Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;

    invoke-static {v3}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->access$getSmartAlarmUserInfoDao$p(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;)Lrf2/a;

    move-result-object v3

    invoke-virtual {v11}, Lsf2/a;->a()Ljava/lang/String;

    move-result-object v4

    iput-object v8, v1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$pollSmartAlarmTrigger$1;->L$0:Ljava/lang/Object;

    iput-object v8, v1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$pollSmartAlarmTrigger$1;->L$1:Ljava/lang/Object;

    iput-boolean v0, v1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$pollSmartAlarmTrigger$1;->Z$0:Z

    const/4 v10, 0x7

    iput v10, v1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$pollSmartAlarmTrigger$1;->label:I

    invoke-interface {v3, v4, v1}, Lrf2/a;->e(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_e

    goto :goto_a

    :cond_e
    :goto_9
    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_f

    iget-object v3, v1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$pollSmartAlarmTrigger$1;->this$0:Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;

    invoke-static {v3}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->access$getMetricWriter$p(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;)Liy1/c;

    move-result-object v3

    new-instance v10, Ljy1/a;

    sget-object v4, Ley1/g;->TRIGGER_ALARM_POLL:Ley1/g;

    invoke-virtual {v4}, Ley1/g;->getValue()Ljava/lang/String;

    move-result-object v12

    sget-object v4, Ley1/j$d;->x:Ley1/j$d;

    invoke-virtual {v4}, Ley1/j;->a()Ljava/lang/String;

    move-result-object v4

    invoke-static {v9, v4}, Lr80/c;->t(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v14

    const/16 v16, 0x11

    const/16 v17, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v10 .. v17}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v8, v1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$pollSmartAlarmTrigger$1;->L$0:Ljava/lang/Object;

    iput-object v8, v1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$pollSmartAlarmTrigger$1;->L$1:Ljava/lang/Object;

    iput-boolean v0, v1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$pollSmartAlarmTrigger$1;->Z$0:Z

    const/16 v0, 0x8

    iput v0, v1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$pollSmartAlarmTrigger$1;->label:I

    invoke-interface {v3, v10, v1}, Liy1/c;->a(Ljy1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v2, :cond_f

    :goto_a
    return-object v2

    :cond_f
    :goto_b
    iget-object v0, v1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$pollSmartAlarmTrigger$1;->this$0:Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;

    invoke-static {v0}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->access$getLogger(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;)Ltr2/n;

    move-result-object v0

    const-string v2, "Not in polling window or alarmTriggered already"

    new-array v3, v6, [Lqr2/a$a;

    invoke-interface {v0, v7, v2, v3}, Ltr2/n;->x(Ljava/lang/String;Ljava/lang/String;[Lqr2/a$a;)V

    :cond_10
    :goto_c
    return-object v5

    nop

    :pswitch_data_0
    .packed-switch 0x0
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
