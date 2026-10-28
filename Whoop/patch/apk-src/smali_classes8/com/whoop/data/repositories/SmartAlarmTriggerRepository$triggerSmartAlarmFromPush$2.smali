.class final Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$triggerSmartAlarmFromPush$2;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->triggerSmartAlarmFromPush(Lorg/joda/time/DateTime;Lq83/d;)Ljava/lang/Object;
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "",
        "<anonymous>",
        "(Lbc3/c0;)Z"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.data.repositories.SmartAlarmTriggerRepository$triggerSmartAlarmFromPush$2"
    f = "SmartAlarmTriggerRepository.kt"
    l = {
        0x21e,
        0x221,
        0x226,
        0x229,
        0x22a,
        0x236
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic $alarmPushTriggered:Lorg/joda/time/DateTime;

.field I$0:I

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;


# direct methods
.method public constructor <init>(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;Lorg/joda/time/DateTime;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;",
            "Lorg/joda/time/DateTime;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$triggerSmartAlarmFromPush$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$triggerSmartAlarmFromPush$2;->this$0:Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;

    iput-object p2, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$triggerSmartAlarmFromPush$2;->$alarmPushTriggered:Lorg/joda/time/DateTime;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2
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

    new-instance p1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$triggerSmartAlarmFromPush$2;

    iget-object v0, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$triggerSmartAlarmFromPush$2;->this$0:Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;

    iget-object v1, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$triggerSmartAlarmFromPush$2;->$alarmPushTriggered:Lorg/joda/time/DateTime;

    invoke-direct {p1, v0, v1, p2}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$triggerSmartAlarmFromPush$2;-><init>(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;Lorg/joda/time/DateTime;Lq83/d;)V

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
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$triggerSmartAlarmFromPush$2;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$triggerSmartAlarmFromPush$2;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$triggerSmartAlarmFromPush$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$triggerSmartAlarmFromPush$2;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$triggerSmartAlarmFromPush$2;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    packed-switch v2, :pswitch_data_0

    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_0
    iget-object v1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$triggerSmartAlarmFromPush$2;->L$1:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;

    iget-object v2, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$triggerSmartAlarmFromPush$2;->L$0:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_b

    :pswitch_1
    iget-object v1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$triggerSmartAlarmFromPush$2;->L$2:Ljava/lang/Object;

    check-cast v1, Lsf2/a;

    iget-object v1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$triggerSmartAlarmFromPush$2;->L$1:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;

    iget-object v1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$triggerSmartAlarmFromPush$2;->L$0:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_8

    :pswitch_2
    iget v2, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$triggerSmartAlarmFromPush$2;->I$0:I

    iget-object v3, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$triggerSmartAlarmFromPush$2;->L$3:Ljava/lang/Object;

    check-cast v3, Lsf2/a;

    iget-object v3, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$triggerSmartAlarmFromPush$2;->L$2:Ljava/lang/Object;

    check-cast v3, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;

    iget-object v3, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$triggerSmartAlarmFromPush$2;->L$1:Ljava/lang/Object;

    check-cast v3, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;

    iget-object v4, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$triggerSmartAlarmFromPush$2;->L$0:Ljava/lang/Object;

    check-cast v4, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v4, p1

    goto/16 :goto_7

    :pswitch_3
    iget-object v1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$triggerSmartAlarmFromPush$2;->L$2:Ljava/lang/Object;

    check-cast v1, Lsf2/a;

    iget-object v1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$triggerSmartAlarmFromPush$2;->L$1:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;

    iget-object v1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$triggerSmartAlarmFromPush$2;->L$0:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_9

    :pswitch_4
    iget v2, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$triggerSmartAlarmFromPush$2;->I$0:I

    iget-object v3, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$triggerSmartAlarmFromPush$2;->L$4:Ljava/lang/Object;

    check-cast v3, Lsf2/a;

    iget-object v7, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$triggerSmartAlarmFromPush$2;->L$3:Ljava/lang/Object;

    check-cast v7, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;

    iget-object v7, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$triggerSmartAlarmFromPush$2;->L$2:Ljava/lang/Object;

    check-cast v7, Lorg/joda/time/DateTime;

    iget-object v8, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$triggerSmartAlarmFromPush$2;->L$1:Ljava/lang/Object;

    check-cast v8, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;

    iget-object v9, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$triggerSmartAlarmFromPush$2;->L$0:Ljava/lang/Object;

    check-cast v9, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v9, v3

    move v3, v2

    move-object/from16 v2, p1

    :goto_0
    move-object v10, v8

    goto :goto_2

    :pswitch_5
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v2, p1

    goto :goto_1

    :pswitch_6
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$triggerSmartAlarmFromPush$2;->this$0:Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;

    iput v4, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$triggerSmartAlarmFromPush$2;->label:I

    invoke-static {v2, v0}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->access$getSmartAlarmUserInfo(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_0

    goto/16 :goto_a

    :cond_0
    :goto_1
    check-cast v2, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;

    if-eqz v2, :cond_9

    iget-object v8, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$triggerSmartAlarmFromPush$2;->this$0:Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;

    iget-object v7, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$triggerSmartAlarmFromPush$2;->$alarmPushTriggered:Lorg/joda/time/DateTime;

    invoke-static {v2}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepositoryKt;->generateCompositeId(Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;)Lsf2/a;

    move-result-object v9

    invoke-static {v2, v6, v4, v6}, Lkp0/p;->d(Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;Lorg/joda/time/DateTime;ILjava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-static {v8}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->access$getSmartAlarmUserInfoDao$p(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;)Lrf2/a;

    move-result-object v2

    invoke-virtual {v9}, Lsf2/a;->a()Ljava/lang/String;

    move-result-object v10

    iput-object v6, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$triggerSmartAlarmFromPush$2;->L$0:Ljava/lang/Object;

    iput-object v8, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$triggerSmartAlarmFromPush$2;->L$1:Ljava/lang/Object;

    iput-object v7, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$triggerSmartAlarmFromPush$2;->L$2:Ljava/lang/Object;

    iput-object v6, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$triggerSmartAlarmFromPush$2;->L$3:Ljava/lang/Object;

    iput-object v9, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$triggerSmartAlarmFromPush$2;->L$4:Ljava/lang/Object;

    iput v5, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$triggerSmartAlarmFromPush$2;->I$0:I

    iput v3, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$triggerSmartAlarmFromPush$2;->label:I

    invoke-interface {v2, v10, v0}, Lrf2/a;->e(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_1

    goto/16 :goto_a

    :cond_1
    move v3, v5

    goto :goto_0

    :goto_2
    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-nez v2, :cond_4

    sget-object v12, Lf82/b;->SMART_ALARM_PUSH:Lf82/b;

    if-eqz v7, :cond_3

    invoke-virtual {v7}, Lorg/joda/time/base/BaseDateTime;->getMillis()J

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_2

    goto :goto_4

    :cond_2
    :goto_3
    move-object v13, v2

    goto :goto_5

    :cond_3
    :goto_4
    new-instance v2, Lorg/joda/time/Instant;

    invoke-direct {v2}, Lorg/joda/time/Instant;-><init>()V

    invoke-virtual {v2}, Lorg/joda/time/Instant;->getMillis()J

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    goto :goto_3

    :goto_5
    const/16 v15, 0x9

    const/16 v16, 0x0

    const/4 v11, 0x0

    const/4 v14, 0x0

    invoke-static/range {v10 .. v16}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->saveSmartAlarmDiagnosticEvents$default(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;Lf82/a;Lf82/b;Ljava/lang/String;Lzj0/h;ILjava/lang/Object;)V

    sget-object v2, Ley1/g;->TRIGGER_ALARM_PUSH:Ley1/g;

    iput-object v6, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$triggerSmartAlarmFromPush$2;->L$0:Ljava/lang/Object;

    iput-object v6, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$triggerSmartAlarmFromPush$2;->L$1:Ljava/lang/Object;

    iput-object v6, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$triggerSmartAlarmFromPush$2;->L$2:Ljava/lang/Object;

    iput-object v6, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$triggerSmartAlarmFromPush$2;->L$3:Ljava/lang/Object;

    iput-object v6, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$triggerSmartAlarmFromPush$2;->L$4:Ljava/lang/Object;

    iput v3, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$triggerSmartAlarmFromPush$2;->I$0:I

    const/4 v3, 0x3

    iput v3, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$triggerSmartAlarmFromPush$2;->label:I

    invoke-static {v10, v9, v12, v2, v0}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->access$runAlarm(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;Lsf2/a;Lf82/b;Ley1/g;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_8

    goto/16 :goto_a

    :cond_4
    move v2, v3

    move-object v3, v10

    goto :goto_6

    :cond_5
    move v2, v5

    move-object v3, v8

    :goto_6
    invoke-static {v3}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->access$getSmartAlarmUserInfoDao$p(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;)Lrf2/a;

    move-result-object v4

    invoke-virtual {v9}, Lsf2/a;->a()Ljava/lang/String;

    move-result-object v7

    iput-object v6, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$triggerSmartAlarmFromPush$2;->L$0:Ljava/lang/Object;

    iput-object v3, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$triggerSmartAlarmFromPush$2;->L$1:Ljava/lang/Object;

    iput-object v6, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$triggerSmartAlarmFromPush$2;->L$2:Ljava/lang/Object;

    iput-object v6, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$triggerSmartAlarmFromPush$2;->L$3:Ljava/lang/Object;

    iput-object v6, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$triggerSmartAlarmFromPush$2;->L$4:Ljava/lang/Object;

    iput v2, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$triggerSmartAlarmFromPush$2;->I$0:I

    const/4 v8, 0x4

    iput v8, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$triggerSmartAlarmFromPush$2;->label:I

    invoke-interface {v4, v7, v0}, Lrf2/a;->e(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v1, :cond_6

    goto/16 :goto_a

    :cond_6
    :goto_7
    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-eqz v4, :cond_7

    invoke-static {v3}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->access$getMetricWriter$p(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;)Liy1/c;

    move-result-object v3

    new-instance v7, Ljy1/a;

    sget-object v4, Ley1/g;->TRIGGER_ALARM_PUSH:Ley1/g;

    invoke-virtual {v4}, Ley1/g;->getValue()Ljava/lang/String;

    move-result-object v9

    sget-object v4, Ley1/j$d;->x:Ley1/j$d;

    invoke-virtual {v4}, Ley1/j;->a()Ljava/lang/String;

    move-result-object v4

    const-string v8, "Error:"

    invoke-static {v8, v4}, Lr80/c;->t(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v11

    const/16 v13, 0x11

    const/4 v14, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v7 .. v14}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v6, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$triggerSmartAlarmFromPush$2;->L$0:Ljava/lang/Object;

    iput-object v6, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$triggerSmartAlarmFromPush$2;->L$1:Ljava/lang/Object;

    iput-object v6, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$triggerSmartAlarmFromPush$2;->L$2:Ljava/lang/Object;

    iput-object v6, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$triggerSmartAlarmFromPush$2;->L$3:Ljava/lang/Object;

    iput v2, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$triggerSmartAlarmFromPush$2;->I$0:I

    const/4 v2, 0x5

    iput v2, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$triggerSmartAlarmFromPush$2;->label:I

    invoke-interface {v3, v7, v0}, Liy1/c;->a(Ljy1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_7

    goto :goto_a

    :cond_7
    :goto_8
    move v4, v5

    :cond_8
    :goto_9
    move v5, v4

    goto :goto_c

    :cond_9
    iget-object v2, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$triggerSmartAlarmFromPush$2;->this$0:Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;

    invoke-static {v2}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->access$getMetricWriter$p(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;)Liy1/c;

    move-result-object v4

    new-instance v7, Ljy1/a;

    sget-object v8, Ley1/g;->TRIGGER_ALARM_PUSH:Ley1/g;

    invoke-virtual {v8}, Ley1/g;->getValue()Ljava/lang/String;

    move-result-object v9

    sget-object v8, Ley1/f;->EMPTY_READ_FROM_CACHE:Ley1/f;

    invoke-virtual {v8}, Ley1/f;->getValue()Ljava/lang/String;

    move-result-object v8

    const-string v10, "Event:"

    invoke-static {v10, v8}, Lr80/c;->t(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v11

    const/16 v13, 0x11

    const/4 v14, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v7 .. v14}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v6, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$triggerSmartAlarmFromPush$2;->L$0:Ljava/lang/Object;

    iput-object v2, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$triggerSmartAlarmFromPush$2;->L$1:Ljava/lang/Object;

    iput v5, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$triggerSmartAlarmFromPush$2;->I$0:I

    const/4 v8, 0x6

    iput v8, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$triggerSmartAlarmFromPush$2;->label:I

    invoke-interface {v4, v7, v0}, Liy1/c;->a(Ljy1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v1, :cond_a

    :goto_a
    return-object v1

    :cond_a
    move-object v1, v2

    :goto_b
    const-string v2, "Attempted to trigger alarm from push, but failed to retrieve user info record"

    invoke-static {v1, v2, v6, v3, v6}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->handledException$default(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;Ljava/lang/String;Ljava/lang/Exception;ILjava/lang/Object;)V

    :goto_c
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    return-object v1

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
