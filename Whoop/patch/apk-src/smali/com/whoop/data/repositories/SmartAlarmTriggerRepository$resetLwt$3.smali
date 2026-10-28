.class final Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->resetLwt(Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function3;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0018\u0010\u0005\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\u0004H\n\u00a2\u0006\u0004\u0008\u0007\u0010\u0008"
    }
    d2 = {
        "Lqf2/d;",
        "lwtState",
        "Lkotlin/Function1;",
        "Ll83/a0;",
        "Lcom/whoop/smart/alarm/data/repository/SetLwtTo;",
        "setLwtTo",
        "",
        "<anonymous>",
        "(Lqf2/d;Lkotlin/jvm/functions/Function1;)Z"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.data.repositories.SmartAlarmTriggerRepository$resetLwt$3"
    f = "SmartAlarmTriggerRepository.kt"
    l = {
        0x11f,
        0x129,
        0x13a,
        0x145,
        0x14f,
        0x159,
        0x166,
        0x17e,
        0x18a,
        0x18d,
        0x19b
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic $checkWakeWindow:Z

.field final synthetic $smartAlarmInfo:Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;

.field I$0:I

.field synthetic L$0:Ljava/lang/Object;

.field synthetic L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field L$5:Ljava/lang/Object;

.field L$6:Ljava/lang/Object;

.field L$7:Ljava/lang/Object;

.field Z$0:Z

.field label:I

.field final synthetic this$0:Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;


# direct methods
.method public constructor <init>(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;ZLq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;",
            "Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;",
            "Z",
            "Lq83/d<",
            "-",
            "Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->this$0:Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;

    iput-object p2, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->$smartAlarmInfo:Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;

    iput-boolean p3, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->$checkWakeWindow:Z

    const/4 p1, 0x3

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lqf2/d;

    check-cast p2, Lkotlin/jvm/functions/Function1;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->invoke(Lqf2/d;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lqf2/d;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lqf2/d;",
            "Lkotlin/jvm/functions/Function1;",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    new-instance v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;

    iget-object v1, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->this$0:Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;

    iget-object v2, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->$smartAlarmInfo:Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;

    iget-boolean v3, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->$checkWakeWindow:Z

    invoke-direct {v0, v1, v2, v3, p3}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;-><init>(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;ZLq83/d;)V

    iput-object p1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->L$1:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 26

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->L$0:Ljava/lang/Object;

    check-cast v1, Lqf2/d;

    iget-object v2, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->L$1:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->label:I

    const/4 v5, 0x1

    const-string v6, "Event:"

    const-string v7, "WakeWindow"

    const/4 v8, 0x0

    const/4 v9, 0x0

    packed-switch v4, :pswitch_data_0

    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_0
    iget-object v1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->L$7:Ljava/lang/Object;

    check-cast v1, Lorg/joda/time/Instant;

    iget-object v1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->L$6:Ljava/lang/Object;

    check-cast v1, Lorg/joda/time/DateTimeZone;

    iget-object v1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->L$5:Ljava/lang/Object;

    check-cast v1, Lorg/joda/time/DateTime;

    iget-object v1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->L$4:Ljava/lang/Object;

    check-cast v1, Lorg/joda/time/DateTime;

    iget-object v1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->L$3:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Boolean;

    iget-object v1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->L$2:Ljava/lang/Object;

    check-cast v1, Lorg/joda/time/Instant;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_e

    :pswitch_1
    iget-object v1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->L$7:Ljava/lang/Object;

    check-cast v1, Lorg/joda/time/Instant;

    iget-object v1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->L$6:Ljava/lang/Object;

    check-cast v1, Lorg/joda/time/DateTimeZone;

    iget-object v1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->L$5:Ljava/lang/Object;

    check-cast v1, Lorg/joda/time/DateTime;

    iget-object v1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->L$4:Ljava/lang/Object;

    check-cast v1, Lorg/joda/time/DateTime;

    iget-object v1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->L$3:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Boolean;

    iget-object v1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->L$2:Ljava/lang/Object;

    check-cast v1, Lorg/joda/time/Instant;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_c

    :pswitch_2
    iget v1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->I$0:I

    iget-object v4, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->L$7:Ljava/lang/Object;

    check-cast v4, Lorg/joda/time/Instant;

    iget-object v5, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->L$6:Ljava/lang/Object;

    check-cast v5, Lorg/joda/time/DateTimeZone;

    iget-object v5, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->L$5:Ljava/lang/Object;

    check-cast v5, Lorg/joda/time/DateTime;

    iget-object v5, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->L$4:Ljava/lang/Object;

    check-cast v5, Lorg/joda/time/DateTime;

    iget-object v5, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->L$3:Ljava/lang/Object;

    check-cast v5, Ljava/lang/Boolean;

    iget-object v5, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->L$2:Ljava/lang/Object;

    check-cast v5, Lorg/joda/time/Instant;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move v12, v1

    move-object/from16 v1, p1

    goto/16 :goto_b

    :pswitch_3
    iget-object v1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->L$7:Ljava/lang/Object;

    check-cast v1, Lorg/joda/time/Instant;

    iget-object v1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->L$6:Ljava/lang/Object;

    check-cast v1, Lorg/joda/time/DateTimeZone;

    iget-object v1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->L$5:Ljava/lang/Object;

    check-cast v1, Lorg/joda/time/DateTime;

    iget-object v1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->L$4:Ljava/lang/Object;

    check-cast v1, Lorg/joda/time/DateTime;

    iget-object v1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->L$3:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Boolean;

    iget-object v1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->L$2:Ljava/lang/Object;

    check-cast v1, Lorg/joda/time/Instant;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_a

    :pswitch_4
    iget-object v1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->L$5:Ljava/lang/Object;

    check-cast v1, Lorg/joda/time/DateTime;

    iget-object v1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->L$4:Ljava/lang/Object;

    check-cast v1, Lorg/joda/time/DateTime;

    iget-object v1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->L$3:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Boolean;

    iget-object v1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->L$2:Ljava/lang/Object;

    check-cast v1, Lorg/joda/time/Instant;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_9

    :pswitch_5
    iget-object v1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->L$5:Ljava/lang/Object;

    check-cast v1, Lorg/joda/time/DateTime;

    iget-object v2, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->L$4:Ljava/lang/Object;

    check-cast v2, Lorg/joda/time/DateTime;

    iget-object v2, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->L$3:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Boolean;

    iget-object v2, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->L$2:Ljava/lang/Object;

    check-cast v2, Lorg/joda/time/Instant;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_8

    :pswitch_6
    iget-object v1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->L$3:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Boolean;

    iget-object v1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->L$2:Ljava/lang/Object;

    check-cast v1, Lorg/joda/time/Instant;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_7

    :pswitch_7
    iget-object v1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->L$3:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Boolean;

    iget-object v1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->L$2:Ljava/lang/Object;

    check-cast v1, Lorg/joda/time/Instant;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_6

    :pswitch_8
    iget-object v1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->L$3:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Boolean;

    iget-object v1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->L$2:Ljava/lang/Object;

    check-cast v1, Lorg/joda/time/Instant;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :pswitch_9
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_a
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :pswitch_b
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v4, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->this$0:Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;

    invoke-static {v4}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->access$getWhoopStrap$p(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;)Ltd1/b;

    move-result-object v4

    invoke-interface {v4}, Ltd1/b;->A()Ltd1/e;

    move-result-object v4

    sget-object v10, Ltd1/e;->READY:Ltd1/e;

    if-eq v4, v10, :cond_1

    iget-object v1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->this$0:Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;

    invoke-static {v1}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->access$getMetricWriter$p(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;)Liy1/c;

    move-result-object v1

    new-instance v10, Ljy1/a;

    sget-object v2, Ley1/g;->RESET_LWT:Ley1/g;

    invoke-virtual {v2}, Ley1/g;->getValue()Ljava/lang/String;

    move-result-object v12

    sget-object v2, Ley1/f;->STRAP_NOT_READY:Ley1/f;

    invoke-virtual {v2}, Ley1/f;->getValue()Ljava/lang/String;

    move-result-object v2

    invoke-static {v6, v2}, Lr80/c;->t(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v14

    const/16 v16, 0x11

    const/16 v17, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v10 .. v17}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v9, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->L$0:Ljava/lang/Object;

    iput-object v9, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->L$1:Ljava/lang/Object;

    iput v5, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->label:I

    invoke-interface {v1, v10, v0}, Liy1/c;->a(Ljy1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_0

    goto/16 :goto_d

    :cond_0
    :goto_0
    iget-object v1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->this$0:Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;

    invoke-static {v1}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->access$getLogger(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;)Ltr2/n;

    move-result-object v1

    const-string v2, "reset lwt early exit: no strap connection"

    new-array v3, v8, [Lqr2/a$a;

    invoke-interface {v1, v7, v2, v3}, Ltr2/n;->x(Ljava/lang/String;Ljava/lang/String;[Lqr2/a$a;)V

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object v1

    :cond_1
    iget-object v4, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->this$0:Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;

    iget-object v10, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->$smartAlarmInfo:Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;

    iput-object v1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->L$0:Ljava/lang/Object;

    iput-object v2, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->L$1:Ljava/lang/Object;

    const/4 v11, 0x2

    iput v11, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->label:I

    invoke-static {v4, v10, v0}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->access$updateTimeZoneWhenOutOfSync(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;Lq83/d;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_2

    goto/16 :goto_d

    :cond_2
    :goto_1
    if-nez v1, :cond_3

    :goto_2
    move-object v4, v9

    goto :goto_3

    :cond_3
    instance-of v4, v1, Lqf2/b;

    if-eqz v4, :cond_4

    move-object v4, v1

    check-cast v4, Lqf2/b;

    invoke-virtual {v4}, Lqf2/b;->a()Lorg/joda/time/Instant;

    move-result-object v4

    goto :goto_3

    :cond_4
    sget-object v4, Lqf2/a;->a:Lqf2/a;

    invoke-virtual {v1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_16

    goto :goto_2

    :goto_3
    if-nez v1, :cond_5

    move-object v1, v9

    goto :goto_4

    :cond_5
    instance-of v1, v1, Lqf2/b;

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    :goto_4
    iget-object v10, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->this$0:Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;

    invoke-static {v10}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->access$getLogger(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;)Ltr2/n;

    move-result-object v10

    new-instance v11, Ljava/lang/StringBuilder;

    const-string v12, "LWT repository enabled: "

    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v12, ", lwt: "

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    new-array v12, v8, [Lqr2/a$a;

    invoke-interface {v10, v7, v11, v12}, Ltr2/n;->x(Ljava/lang/String;Ljava/lang/String;[Lqr2/a$a;)V

    sget-object v10, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v1, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    iget-object v1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->this$0:Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;

    invoke-static {v1}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->access$getMetricWriter$p(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;)Liy1/c;

    move-result-object v1

    new-instance v10, Ljy1/a;

    sget-object v2, Ley1/g;->RESET_LWT:Ley1/g;

    invoke-virtual {v2}, Ley1/g;->getValue()Ljava/lang/String;

    move-result-object v12

    sget-object v2, Ley1/f;->ALARM_DISABLED:Ley1/f;

    invoke-virtual {v2}, Ley1/f;->getValue()Ljava/lang/String;

    move-result-object v2

    invoke-static {v6, v2}, Lr80/c;->t(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v14

    const/16 v16, 0x11

    const/16 v17, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v10 .. v17}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v9, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->L$0:Ljava/lang/Object;

    iput-object v9, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->L$1:Ljava/lang/Object;

    iput-object v9, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->L$2:Ljava/lang/Object;

    iput-object v9, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->L$3:Ljava/lang/Object;

    const/4 v2, 0x3

    iput v2, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->label:I

    invoke-interface {v1, v10, v0}, Liy1/c;->a(Ljy1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_6

    goto/16 :goto_d

    :cond_6
    :goto_5
    iget-object v1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->this$0:Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;

    invoke-static {v1}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->access$getLogger(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;)Ltr2/n;

    move-result-object v1

    const-string v2, "LWT repository is reporting the alarm is disabled"

    new-array v3, v8, [Lqr2/a$a;

    invoke-interface {v1, v7, v2, v3}, Ltr2/n;->x(Ljava/lang/String;Ljava/lang/String;[Lqr2/a$a;)V

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v1

    :cond_7
    iget-object v1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->$smartAlarmInfo:Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;

    invoke-virtual {v1}, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->getSmartAlarmEnabled()Z

    move-result v1

    if-nez v1, :cond_a

    iget-object v1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->this$0:Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;

    invoke-static {v1}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->access$getMetricWriter$p(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;)Liy1/c;

    move-result-object v1

    new-instance v10, Ljy1/a;

    sget-object v2, Ley1/g;->RESET_LWT:Ley1/g;

    invoke-virtual {v2}, Ley1/g;->getValue()Ljava/lang/String;

    move-result-object v12

    sget-object v2, Ley1/f;->ALARM_DISABLED:Ley1/f;

    invoke-virtual {v2}, Ley1/f;->getValue()Ljava/lang/String;

    move-result-object v2

    invoke-static {v6, v2}, Lr80/c;->t(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v14

    const/16 v16, 0x11

    const/16 v17, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v10 .. v17}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v9, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->L$0:Ljava/lang/Object;

    iput-object v9, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->L$1:Ljava/lang/Object;

    iput-object v9, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->L$2:Ljava/lang/Object;

    iput-object v9, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->L$3:Ljava/lang/Object;

    const/4 v2, 0x4

    iput v2, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->label:I

    invoke-interface {v1, v10, v0}, Liy1/c;->a(Ljy1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_8

    goto/16 :goto_d

    :cond_8
    :goto_6
    iget-object v1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->this$0:Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;

    invoke-static {v1}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->access$getLogger(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;)Ltr2/n;

    move-result-object v1

    const-string v2, "the alarm is disabled, so we don\'t need to reset anything. Alarm should already be disabled on strap."

    new-array v4, v8, [Lqr2/a$a;

    invoke-interface {v1, v7, v2, v4}, Ltr2/n;->x(Ljava/lang/String;Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->$smartAlarmInfo:Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;

    invoke-virtual {v1}, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->getScheduleEnabled()Z

    move-result v1

    if-eqz v1, :cond_9

    iget-object v1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->this$0:Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;

    iput-object v9, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->L$0:Ljava/lang/Object;

    iput-object v9, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->L$1:Ljava/lang/Object;

    iput-object v9, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->L$2:Ljava/lang/Object;

    iput-object v9, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->L$3:Ljava/lang/Object;

    const/4 v2, 0x5

    iput v2, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->label:I

    invoke-static {v1, v0}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->access$disableAlarmOnStrapWhenAlarmWasDisabled(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_9

    goto/16 :goto_d

    :cond_9
    :goto_7
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v1

    :cond_a
    invoke-static {}, Lorg/joda/time/DateTime;->now()Lorg/joda/time/DateTime;

    move-result-object v1

    iget-object v10, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->this$0:Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;

    iget-object v11, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->$smartAlarmInfo:Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v10, v11, v1}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->getCalculatedLatestWakeTime(Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;Lorg/joda/time/DateTime;)Lorg/joda/time/DateTime;

    move-result-object v10

    sget-object v11, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->Companion:Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$Companion;

    invoke-virtual {v11}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$Companion;->getWAKE_WINDOW_SLOP_TIME()Lorg/joda/time/Duration;

    move-result-object v12

    invoke-virtual {v12}, Lorg/joda/time/Duration;->getStandardMinutes()J

    move-result-wide v12

    long-to-int v12, v12

    invoke-virtual {v10, v12}, Lorg/joda/time/DateTime;->plusMinutes(I)Lorg/joda/time/DateTime;

    move-result-object v12

    invoke-virtual {v12}, Lorg/joda/time/base/AbstractInstant;->isBeforeNow()Z

    move-result v12

    if-eqz v12, :cond_c

    iget-object v1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->this$0:Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;

    invoke-static {v1}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->access$getMetricWriter$p(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;)Liy1/c;

    move-result-object v1

    new-instance v11, Ljy1/a;

    sget-object v2, Ley1/g;->RESET_LWT:Ley1/g;

    invoke-virtual {v2}, Ley1/g;->getValue()Ljava/lang/String;

    move-result-object v13

    sget-object v2, Ley1/f;->SLEEP_SCHEDULE_OUT_OF_SYNC:Ley1/f;

    invoke-virtual {v2}, Ley1/f;->getValue()Ljava/lang/String;

    move-result-object v2

    invoke-static {v6, v2}, Lr80/c;->t(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v15

    const/16 v17, 0x11

    const/16 v18, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v11 .. v18}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v9, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->L$0:Ljava/lang/Object;

    iput-object v9, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->L$1:Ljava/lang/Object;

    iput-object v9, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->L$2:Ljava/lang/Object;

    iput-object v9, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->L$3:Ljava/lang/Object;

    iput-object v9, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->L$4:Ljava/lang/Object;

    iput-object v10, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->L$5:Ljava/lang/Object;

    const/4 v2, 0x6

    iput v2, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->label:I

    invoke-interface {v1, v11, v0}, Liy1/c;->a(Ljy1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_b

    goto/16 :goto_d

    :cond_b
    move-object v1, v10

    :goto_8
    iget-object v2, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->this$0:Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;

    invoke-static {v2}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->access$getLogger(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;)Ltr2/n;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "disable smart alarm as alarm is out of sync "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-array v3, v8, [Lqr2/a$a;

    invoke-interface {v2, v7, v1, v3}, Ltr2/n;->e(Ljava/lang/String;Ljava/lang/String;[Lqr2/a$a;)V

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v1

    :cond_c
    invoke-static {v1, v10}, Lorg/joda/time/Minutes;->minutesBetween(Lorg/joda/time/ReadableInstant;Lorg/joda/time/ReadableInstant;)Lorg/joda/time/Minutes;

    move-result-object v12

    invoke-virtual {v12}, Lorg/joda/time/Minutes;->getMinutes()I

    move-result v12

    iget-object v13, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->this$0:Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;

    invoke-static {v13}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->access$getLogger(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;)Ltr2/n;

    move-result-object v13

    iget-object v14, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->$smartAlarmInfo:Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;

    invoke-virtual {v14}, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->getUpperTimeBound()Ljava/lang/String;

    move-result-object v14

    const-string v15, ", which is in "

    const-string v5, " minutes"

    const-string v9, "Alarm record lwt is "

    invoke-static {v12, v9, v14, v15, v5}, Ldc/b;->l(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    new-array v9, v8, [Lqr2/a$a;

    invoke-interface {v13, v5, v9}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-boolean v5, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->$checkWakeWindow:Z

    if-eqz v5, :cond_e

    iget-object v5, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->$smartAlarmInfo:Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;

    const/4 v9, 0x1

    const/4 v13, 0x0

    invoke-static {v5, v13, v9, v13}, Lkp0/p;->d(Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;Lorg/joda/time/DateTime;ILjava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_e

    iget-object v1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->this$0:Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;

    invoke-static {v1}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->access$getMetricWriter$p(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;)Liy1/c;

    move-result-object v1

    new-instance v18, Ljy1/a;

    sget-object v2, Ley1/g;->RESET_LWT:Ley1/g;

    invoke-virtual {v2}, Ley1/g;->getValue()Ljava/lang/String;

    move-result-object v20

    sget-object v2, Ley1/f;->INSIDE_WAKE_WINDOW:Ley1/f;

    invoke-virtual {v2}, Ley1/f;->getValue()Ljava/lang/String;

    move-result-object v2

    invoke-static {v6, v2}, Lr80/c;->t(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v22

    const/16 v24, 0x11

    const/16 v25, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    invoke-direct/range {v18 .. v25}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v2, v18

    const/4 v13, 0x0

    iput-object v13, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->L$0:Ljava/lang/Object;

    iput-object v13, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->L$1:Ljava/lang/Object;

    iput-object v13, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->L$2:Ljava/lang/Object;

    iput-object v13, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->L$3:Ljava/lang/Object;

    iput-object v13, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->L$4:Ljava/lang/Object;

    iput-object v13, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->L$5:Ljava/lang/Object;

    iput v12, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->I$0:I

    const/4 v4, 0x7

    iput v4, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->label:I

    invoke-interface {v1, v2, v0}, Liy1/c;->a(Ljy1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_d

    goto/16 :goto_d

    :cond_d
    :goto_9
    iget-object v1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->this$0:Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;

    invoke-static {v1}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->access$getLogger(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;)Ltr2/n;

    move-result-object v1

    const-string v2, "Today\'s alarm wake window still open. Skipping."

    new-array v3, v8, [Lqr2/a$a;

    invoke-interface {v1, v7, v2, v3}, Ltr2/n;->x(Ljava/lang/String;Ljava/lang/String;[Lqr2/a$a;)V

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v1

    :cond_e
    invoke-static {}, Lorg/joda/time/DateTimeZone;->getDefault()Lorg/joda/time/DateTimeZone;

    move-result-object v5

    invoke-virtual {v10}, Lorg/joda/time/base/AbstractInstant;->toInstant()Lorg/joda/time/Instant;

    move-result-object v9

    iget-object v13, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->$smartAlarmInfo:Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;

    const/4 v14, 0x1

    const/4 v15, 0x0

    invoke-static {v13, v15, v14, v15}, Lkp0/p;->b(Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;Lorg/joda/time/DateTime;ILjava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_f

    invoke-virtual {v11}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$Companion;->getWAKE_WINDOW_SLOP_TIME()Lorg/joda/time/Duration;

    move-result-object v1

    invoke-virtual {v1}, Lorg/joda/time/Duration;->getStandardMinutes()J

    move-result-wide v1

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "\n                    Within "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, " minutes of last LWT.\n                    Skipping just in case the strap has clock drift\n                "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lyb3/s;->s(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->this$0:Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;

    invoke-static {v2}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->access$getLogger(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;)Ltr2/n;

    move-result-object v2

    new-array v3, v8, [Lqr2/a$a;

    invoke-interface {v2, v7, v1, v3}, Ltr2/n;->x(Ljava/lang/String;Ljava/lang/String;[Lqr2/a$a;)V

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v1

    :cond_f
    invoke-static {v9, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_11

    iget-object v1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->this$0:Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;

    invoke-static {v1}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->access$getMetricWriter$p(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;)Liy1/c;

    move-result-object v1

    new-instance v18, Ljy1/a;

    sget-object v2, Ley1/g;->RESET_LWT:Ley1/g;

    invoke-virtual {v2}, Ley1/g;->getValue()Ljava/lang/String;

    move-result-object v20

    sget-object v2, Ley1/f;->LWT_ALREADY_SET_ON_STRAP:Ley1/f;

    invoke-virtual {v2}, Ley1/f;->getValue()Ljava/lang/String;

    move-result-object v2

    invoke-static {v6, v2}, Lr80/c;->t(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v22

    const/16 v24, 0x11

    const/16 v25, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    invoke-direct/range {v18 .. v25}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v2, v18

    const/4 v13, 0x0

    iput-object v13, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->L$0:Ljava/lang/Object;

    iput-object v13, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->L$1:Ljava/lang/Object;

    iput-object v13, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->L$2:Ljava/lang/Object;

    iput-object v13, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->L$3:Ljava/lang/Object;

    iput-object v13, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->L$4:Ljava/lang/Object;

    iput-object v13, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->L$5:Ljava/lang/Object;

    iput-object v13, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->L$6:Ljava/lang/Object;

    iput-object v13, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->L$7:Ljava/lang/Object;

    iput v12, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->I$0:I

    const/16 v4, 0x8

    iput v4, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->label:I

    invoke-interface {v1, v2, v0}, Liy1/c;->a(Ljy1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_10

    goto/16 :goto_d

    :cond_10
    :goto_a
    iget-object v1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->this$0:Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;

    invoke-static {v1}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->access$getLogger(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;)Ltr2/n;

    move-result-object v1

    const-string v2, "LWT repo alarm time already reset for today"

    new-array v3, v8, [Lqr2/a$a;

    invoke-interface {v1, v7, v2, v3}, Ltr2/n;->x(Ljava/lang/String;Ljava/lang/String;[Lqr2/a$a;)V

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v1

    :cond_11
    iget-object v4, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->this$0:Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;

    invoke-static {v4}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->access$getLogger(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;)Ltr2/n;

    move-result-object v4

    new-instance v11, Ljava/lang/StringBuilder;

    const-string v13, "current time is "

    invoke-direct {v11, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " in zone "

    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ". calculatedLwt="

    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-array v5, v8, [Lqr2/a$a;

    invoke-interface {v4, v7, v1, v5}, Ltr2/n;->x(Ljava/lang/String;Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->this$0:Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;

    invoke-static {v1}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->access$getSmartAlarmHapticsWrapper$p(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;)Lmi1/e;

    move-result-object v1

    invoke-virtual {v9}, Lorg/joda/time/Instant;->getMillis()J

    move-result-wide v4

    const/4 v13, 0x0

    iput-object v13, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->L$0:Ljava/lang/Object;

    iput-object v2, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->L$1:Ljava/lang/Object;

    iput-object v13, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->L$2:Ljava/lang/Object;

    iput-object v13, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->L$3:Ljava/lang/Object;

    iput-object v13, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->L$4:Ljava/lang/Object;

    iput-object v13, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->L$5:Ljava/lang/Object;

    iput-object v13, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->L$6:Ljava/lang/Object;

    iput-object v9, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->L$7:Ljava/lang/Object;

    iput v12, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->I$0:I

    const/16 v10, 0x9

    iput v10, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->label:I

    invoke-interface {v1, v4, v5, v0}, Lmi1/e;->e(JLq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_12

    goto/16 :goto_d

    :cond_12
    move-object v4, v9

    :goto_b
    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-nez v1, :cond_14

    iget-object v2, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->this$0:Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;

    invoke-static {v2}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->access$getMetricWriter$p(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;)Liy1/c;

    move-result-object v2

    new-instance v18, Ljy1/a;

    sget-object v4, Ley1/g;->RESET_LWT:Ley1/g;

    invoke-virtual {v4}, Ley1/g;->getValue()Ljava/lang/String;

    move-result-object v20

    sget-object v4, Ley1/e$c;->x:Ley1/e$c;

    invoke-virtual {v4}, Ley1/e;->a()Ljava/lang/String;

    move-result-object v4

    const-string v5, "Error:"

    invoke-static {v5, v4}, Lr80/c;->t(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v22

    const/16 v24, 0x11

    const/16 v25, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    invoke-direct/range {v18 .. v25}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v4, v18

    const/4 v13, 0x0

    iput-object v13, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->L$0:Ljava/lang/Object;

    iput-object v13, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->L$1:Ljava/lang/Object;

    iput-object v13, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->L$2:Ljava/lang/Object;

    iput-object v13, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->L$3:Ljava/lang/Object;

    iput-object v13, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->L$4:Ljava/lang/Object;

    iput-object v13, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->L$5:Ljava/lang/Object;

    iput-object v13, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->L$6:Ljava/lang/Object;

    iput-object v13, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->L$7:Ljava/lang/Object;

    iput v12, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->I$0:I

    iput-boolean v1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->Z$0:Z

    const/16 v1, 0xa

    iput v1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->label:I

    invoke-interface {v2, v4, v0}, Liy1/c;->a(Ljy1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_13

    goto :goto_d

    :cond_13
    :goto_c
    iget-object v1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->this$0:Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;

    invoke-static {v1}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->access$getLogger(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;)Ltr2/n;

    move-result-object v1

    const-string v2, "Failed to push new LWT to the strap"

    new-array v3, v8, [Lqr2/a$a;

    invoke-interface {v1, v7, v2, v3}, Ltr2/n;->e(Ljava/lang/String;Ljava/lang/String;[Lqr2/a$a;)V

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object v1

    :cond_14
    iget-object v5, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->this$0:Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;

    invoke-static {v5}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->access$getLogger(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;)Ltr2/n;

    move-result-object v5

    const-string v9, "Updated LWT on strap and lwt repo"

    new-array v8, v8, [Lqr2/a$a;

    invoke-interface {v5, v7, v9, v8}, Ltr2/n;->x(Ljava/lang/String;Ljava/lang/String;[Lqr2/a$a;)V

    new-instance v5, Lqf2/b;

    invoke-direct {v5, v4}, Lqf2/b;-><init>(Lorg/joda/time/Instant;)V

    invoke-interface {v2, v5}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->this$0:Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;

    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v2, v4}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->access$reportLwtReset(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;Lorg/joda/time/Instant;)V

    iget-object v2, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->this$0:Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;

    invoke-static {v2}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->access$getMetricWriter$p(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;)Liy1/c;

    move-result-object v2

    new-instance v18, Ljy1/a;

    sget-object v4, Ley1/g;->RESET_LWT:Ley1/g;

    invoke-virtual {v4}, Ley1/g;->getValue()Ljava/lang/String;

    move-result-object v20

    sget-object v4, Ley1/f;->SUCCESSFULLY_UPDATED_STRAP:Ley1/f;

    invoke-virtual {v4}, Ley1/f;->getValue()Ljava/lang/String;

    move-result-object v4

    invoke-static {v6, v4}, Lr80/c;->t(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v22

    const/16 v24, 0x11

    const/16 v25, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    invoke-direct/range {v18 .. v25}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v4, v18

    const/4 v13, 0x0

    iput-object v13, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->L$0:Ljava/lang/Object;

    iput-object v13, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->L$1:Ljava/lang/Object;

    iput-object v13, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->L$2:Ljava/lang/Object;

    iput-object v13, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->L$3:Ljava/lang/Object;

    iput-object v13, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->L$4:Ljava/lang/Object;

    iput-object v13, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->L$5:Ljava/lang/Object;

    iput-object v13, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->L$6:Ljava/lang/Object;

    iput-object v13, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->L$7:Ljava/lang/Object;

    iput v12, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->I$0:I

    iput-boolean v1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->Z$0:Z

    const/16 v1, 0xb

    iput v1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;->label:I

    invoke-interface {v2, v4, v0}, Liy1/c;->a(Ljy1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_15

    :goto_d
    return-object v3

    :cond_15
    :goto_e
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v1

    :cond_16
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :pswitch_data_0
    .packed-switch 0x0
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
