.class final Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$checkHighFrequencyMode$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->checkHighFrequencyMode(Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;Z)V
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
    c = "com.whoop.data.repositories.SmartAlarmTriggerRepository$checkHighFrequencyMode$1"
    f = "SmartAlarmTriggerRepository.kt"
    l = {
        0x35a,
        0x35e,
        0x35f,
        0x362,
        0x364,
        0x368,
        0x369
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic $alarmTypeRequiresPolling:Z

.field final synthetic $smartAlarmUserInfo:Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;

.field I$0:I

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field Z$0:Z

.field Z$1:Z

.field label:I

.field final synthetic this$0:Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;


# direct methods
.method public constructor <init>(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;ZLcom/whoop/data/local/room/entity/SmartAlarmUserInfo;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;",
            "Z",
            "Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$checkHighFrequencyMode$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$checkHighFrequencyMode$1;->this$0:Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;

    iput-boolean p2, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$checkHighFrequencyMode$1;->$alarmTypeRequiresPolling:Z

    iput-object p3, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$checkHighFrequencyMode$1;->$smartAlarmUserInfo:Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3
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

    new-instance p1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$checkHighFrequencyMode$1;

    iget-object v0, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$checkHighFrequencyMode$1;->this$0:Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;

    iget-boolean v1, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$checkHighFrequencyMode$1;->$alarmTypeRequiresPolling:Z

    iget-object v2, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$checkHighFrequencyMode$1;->$smartAlarmUserInfo:Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;

    invoke-direct {p1, v0, v1, v2, p2}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$checkHighFrequencyMode$1;-><init>(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;ZLcom/whoop/data/local/room/entity/SmartAlarmUserInfo;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$checkHighFrequencyMode$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$checkHighFrequencyMode$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$checkHighFrequencyMode$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$checkHighFrequencyMode$1;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$checkHighFrequencyMode$1;->label:I

    const-string v2, "EPOCH"

    const/4 v3, 0x0

    packed-switch v1, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    iget-object v1, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$checkHighFrequencyMode$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lorg/joda/time/Instant;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :pswitch_1
    iget-boolean v1, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$checkHighFrequencyMode$1;->Z$0:Z

    iget-object v4, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$checkHighFrequencyMode$1;->L$0:Ljava/lang/Object;

    check-cast v4, Lorg/joda/time/Instant;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :pswitch_2
    iget-object v0, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$checkHighFrequencyMode$1;->L$2:Ljava/lang/Object;

    check-cast v0, Lorg/joda/time/Instant;

    :pswitch_3
    iget-object v0, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$checkHighFrequencyMode$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lorg/joda/time/Instant;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :pswitch_4
    iget-boolean v1, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$checkHighFrequencyMode$1;->Z$0:Z

    iget-object v2, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$checkHighFrequencyMode$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lorg/joda/time/Instant;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_5
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :pswitch_6
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$checkHighFrequencyMode$1;->this$0:Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;

    invoke-static {p1}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->access$getHighFrequencySyncModeStateHolder$p(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;)Lkp0/e;

    move-result-object p1

    const/4 v1, 0x1

    iput v1, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$checkHighFrequencyMode$1;->label:I

    invoke-virtual {p1, p0}, Lkp0/e;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_0

    goto/16 :goto_4

    :cond_0
    :goto_0
    check-cast p1, Lorg/joda/time/Instant;

    iget-boolean v1, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$checkHighFrequencyMode$1;->$alarmTypeRequiresPolling:Z

    if-eqz v1, :cond_4

    iget-object v1, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$checkHighFrequencyMode$1;->this$0:Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;

    iget-object v4, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$checkHighFrequencyMode$1;->$smartAlarmUserInfo:Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;

    invoke-virtual {v1, v4}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->isHighFrequencySyncModeWindowOpen(Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p1}, Lorg/joda/time/base/AbstractInstant;->isBeforeNow()Z

    move-result v4

    if-eqz v4, :cond_2

    iget-object p1, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$checkHighFrequencyMode$1;->this$0:Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;

    iput-object v3, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$checkHighFrequencyMode$1;->L$0:Ljava/lang/Object;

    iput-boolean v1, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$checkHighFrequencyMode$1;->Z$0:Z

    const/4 v2, 0x2

    iput v2, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$checkHighFrequencyMode$1;->label:I

    invoke-static {p1, p0}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->access$enterHighFrequencySyncModeOnStrap(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_1

    goto/16 :goto_4

    :cond_1
    :goto_1
    iget-object v2, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$checkHighFrequencyMode$1;->this$0:Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;

    move-object v4, p1

    check-cast v4, Lorg/joda/time/Instant;

    invoke-static {v2}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->access$getHighFrequencySyncModeStateHolder$p(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;)Lkp0/e;

    move-result-object v2

    iput-object v3, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$checkHighFrequencyMode$1;->L$0:Ljava/lang/Object;

    iput-object p1, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$checkHighFrequencyMode$1;->L$1:Ljava/lang/Object;

    iput-object v3, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$checkHighFrequencyMode$1;->L$2:Ljava/lang/Object;

    iput-boolean v1, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$checkHighFrequencyMode$1;->Z$0:Z

    const/4 p1, 0x0

    iput p1, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$checkHighFrequencyMode$1;->I$0:I

    const/4 p1, 0x3

    iput p1, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$checkHighFrequencyMode$1;->label:I

    invoke-virtual {v2, v4, p0}, Lkp0/e;->c(Lorg/joda/time/Instant;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    goto :goto_4

    :cond_2
    if-nez v1, :cond_6

    invoke-virtual {p1}, Lorg/joda/time/base/AbstractInstant;->isAfterNow()Z

    move-result p1

    if-eqz p1, :cond_6

    iget-object p1, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$checkHighFrequencyMode$1;->this$0:Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;

    iput-object v3, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$checkHighFrequencyMode$1;->L$0:Ljava/lang/Object;

    iput-boolean v1, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$checkHighFrequencyMode$1;->Z$0:Z

    const/4 v4, 0x4

    iput v4, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$checkHighFrequencyMode$1;->label:I

    invoke-static {p1, p0}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->access$exitHighFrequencySyncModeOnStrap(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_4

    :cond_3
    :goto_2
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_6

    iget-object v4, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$checkHighFrequencyMode$1;->this$0:Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;

    invoke-static {v4}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->access$getHighFrequencySyncModeStateHolder$p(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;)Lkp0/e;

    move-result-object v4

    sget-object v5, Lorg/joda/time/Instant;->EPOCH:Lorg/joda/time/Instant;

    invoke-static {v5, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v3, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$checkHighFrequencyMode$1;->L$0:Ljava/lang/Object;

    iput-boolean v1, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$checkHighFrequencyMode$1;->Z$0:Z

    iput-boolean p1, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$checkHighFrequencyMode$1;->Z$1:Z

    const/4 p1, 0x5

    iput p1, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$checkHighFrequencyMode$1;->label:I

    invoke-virtual {v4, v5, p0}, Lkp0/e;->c(Lorg/joda/time/Instant;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    goto :goto_4

    :cond_4
    invoke-virtual {p1}, Lorg/joda/time/base/AbstractInstant;->isAfterNow()Z

    move-result p1

    if-eqz p1, :cond_6

    iget-object p1, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$checkHighFrequencyMode$1;->this$0:Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;

    iput-object v3, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$checkHighFrequencyMode$1;->L$0:Ljava/lang/Object;

    const/4 v1, 0x6

    iput v1, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$checkHighFrequencyMode$1;->label:I

    invoke-static {p1, p0}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->access$exitHighFrequencySyncModeOnStrap(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    goto :goto_4

    :cond_5
    :goto_3
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_6

    iget-object p1, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$checkHighFrequencyMode$1;->this$0:Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;

    invoke-static {p1}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->access$getHighFrequencySyncModeStateHolder$p(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;)Lkp0/e;

    move-result-object p1

    sget-object v1, Lorg/joda/time/Instant;->EPOCH:Lorg/joda/time/Instant;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v3, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$checkHighFrequencyMode$1;->L$0:Ljava/lang/Object;

    const/4 v2, 0x7

    iput v2, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$checkHighFrequencyMode$1;->label:I

    invoke-virtual {p1, v1, p0}, Lkp0/e;->c(Lorg/joda/time/Instant;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    :goto_4
    return-object v0

    :cond_6
    :goto_5
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_2
        :pswitch_1
        :pswitch_3
        :pswitch_0
        :pswitch_3
    .end packed-switch
.end method
