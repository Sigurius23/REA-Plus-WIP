.class final Lcom/whoop/coaching/sleepcoach/wizard/h$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/coaching/sleepcoach/wizard/h;->k0()V
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
    c = "com.whoop.coaching.sleepcoach.wizard.TonightsSleepContainerViewModel$initSmartAlarmSettingsData$1"
    f = "TonightsSleepContainerViewModel.kt"
    l = {
        0x25b,
        0x25e
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:Ljava/lang/Object;

.field x:I

.field y:I

.field final synthetic z:Lcom/whoop/coaching/sleepcoach/wizard/h;


# direct methods
.method public constructor <init>(Lcom/whoop/coaching/sleepcoach/wizard/h;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/coaching/sleepcoach/wizard/h;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/coaching/sleepcoach/wizard/h$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/coaching/sleepcoach/wizard/h$b;->z:Lcom/whoop/coaching/sleepcoach/wizard/h;

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

    new-instance p1, Lcom/whoop/coaching/sleepcoach/wizard/h$b;

    iget-object v0, p0, Lcom/whoop/coaching/sleepcoach/wizard/h$b;->z:Lcom/whoop/coaching/sleepcoach/wizard/h;

    invoke-direct {p1, v0, p2}, Lcom/whoop/coaching/sleepcoach/wizard/h$b;-><init>(Lcom/whoop/coaching/sleepcoach/wizard/h;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lcom/whoop/coaching/sleepcoach/wizard/h$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/coaching/sleepcoach/wizard/h$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/coaching/sleepcoach/wizard/h$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/coaching/sleepcoach/wizard/h$b;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    move-object/from16 v0, p0

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/coaching/sleepcoach/wizard/h$b;->y:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    iget v1, v0, Lcom/whoop/coaching/sleepcoach/wizard/h$b;->x:I

    iget-object v2, v0, Lcom/whoop/coaching/sleepcoach/wizard/h$b;->w:Ljava/lang/Object;

    check-cast v2, Lkp0/a;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v3, p1

    goto/16 :goto_3

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    iget-object v2, v0, Lcom/whoop/coaching/sleepcoach/wizard/h$b;->w:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/coaching/sleepcoach/wizard/h;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v6, p1

    goto :goto_0

    :cond_2
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v0, Lcom/whoop/coaching/sleepcoach/wizard/h$b;->z:Lcom/whoop/coaching/sleepcoach/wizard/h;

    invoke-static {v2}, Lcom/whoop/coaching/sleepcoach/wizard/h;->G(Lcom/whoop/coaching/sleepcoach/wizard/h;)Lqf2/f;

    move-result-object v6

    iput-object v2, v0, Lcom/whoop/coaching/sleepcoach/wizard/h$b;->w:Ljava/lang/Object;

    iput v4, v0, Lcom/whoop/coaching/sleepcoach/wizard/h$b;->y:I

    invoke-virtual {v6, v0}, Lqf2/f;->l(Lq83/d;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v1, :cond_3

    goto :goto_2

    :cond_3
    :goto_0
    check-cast v6, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;

    invoke-static {v2, v6}, Lcom/whoop/coaching/sleepcoach/wizard/h;->O(Lcom/whoop/coaching/sleepcoach/wizard/h;Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;)V

    iget-object v2, v0, Lcom/whoop/coaching/sleepcoach/wizard/h$b;->z:Lcom/whoop/coaching/sleepcoach/wizard/h;

    invoke-static {v2}, Lcom/whoop/coaching/sleepcoach/wizard/h;->H(Lcom/whoop/coaching/sleepcoach/wizard/h;)Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;

    move-result-object v2

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->getSmartAlarmEnabled()Z

    move-result v2

    goto :goto_1

    :cond_4
    move v2, v5

    :goto_1
    iget-object v6, v0, Lcom/whoop/coaching/sleepcoach/wizard/h$b;->z:Lcom/whoop/coaching/sleepcoach/wizard/h;

    invoke-static {v6}, Lcom/whoop/coaching/sleepcoach/wizard/h;->H(Lcom/whoop/coaching/sleepcoach/wizard/h;)Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;

    move-result-object v7

    invoke-static {v6, v7}, Lcom/whoop/coaching/sleepcoach/wizard/h;->z(Lcom/whoop/coaching/sleepcoach/wizard/h;Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;)Lkp0/a;

    move-result-object v6

    iget-object v7, v0, Lcom/whoop/coaching/sleepcoach/wizard/h$b;->z:Lcom/whoop/coaching/sleepcoach/wizard/h;

    invoke-static {v7}, Lcom/whoop/coaching/sleepcoach/wizard/h;->H(Lcom/whoop/coaching/sleepcoach/wizard/h;)Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;

    move-result-object v7

    if-eqz v7, :cond_5

    invoke-virtual {v7}, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->getWindowMinutes()I

    move-result v1

    move v8, v1

    move-object v7, v6

    goto :goto_4

    :cond_5
    iget-object v7, v0, Lcom/whoop/coaching/sleepcoach/wizard/h$b;->z:Lcom/whoop/coaching/sleepcoach/wizard/h;

    invoke-static {v7}, Lcom/whoop/coaching/sleepcoach/wizard/h;->G(Lcom/whoop/coaching/sleepcoach/wizard/h;)Lqf2/f;

    move-result-object v7

    iput-object v6, v0, Lcom/whoop/coaching/sleepcoach/wizard/h$b;->w:Ljava/lang/Object;

    iput v2, v0, Lcom/whoop/coaching/sleepcoach/wizard/h$b;->x:I

    iput v3, v0, Lcom/whoop/coaching/sleepcoach/wizard/h$b;->y:I

    invoke-virtual {v7, v0}, Lqf2/f;->j(Lq83/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v1, :cond_6

    :goto_2
    return-object v1

    :cond_6
    move v1, v2

    move-object v2, v6

    :goto_3
    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    move-object v7, v2

    move v8, v3

    move v2, v1

    :goto_4
    iget-object v1, v0, Lcom/whoop/coaching/sleepcoach/wizard/h$b;->z:Lcom/whoop/coaching/sleepcoach/wizard/h;

    invoke-static {v1}, Lcom/whoop/coaching/sleepcoach/wizard/h;->H(Lcom/whoop/coaching/sleepcoach/wizard/h;)Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;

    move-result-object v1

    if-eqz v1, :cond_7

    invoke-virtual {v1}, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->getScheduleEnabled()Z

    move-result v1

    goto :goto_5

    :cond_7
    move v1, v5

    :goto_5
    instance-of v3, v7, Lkp0/c;

    if-eqz v3, :cond_a

    iget-object v3, v0, Lcom/whoop/coaching/sleepcoach/wizard/h$b;->z:Lcom/whoop/coaching/sleepcoach/wizard/h;

    new-instance v9, Lcom/whoop/coaching/sleepcoach/wizard/g;

    if-eqz v2, :cond_8

    move v12, v4

    goto :goto_6

    :cond_8
    move v12, v5

    :goto_6
    invoke-static {v3}, Lcom/whoop/coaching/sleepcoach/wizard/h;->H(Lcom/whoop/coaching/sleepcoach/wizard/h;)Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;

    move-result-object v6

    if-eqz v6, :cond_9

    invoke-virtual {v6}, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->getScheduleEnabled()Z

    move-result v6

    move/from16 v20, v6

    goto :goto_7

    :cond_9
    move/from16 v20, v5

    :goto_7
    const/16 v21, 0x3fa

    const/16 v22, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object v10, v7

    invoke-direct/range {v9 .. v22}, Lcom/whoop/coaching/sleepcoach/wizard/g;-><init>(Lkp0/a;IZLorg/joda/time/LocalTime;Lorg/joda/time/LocalTime;Ljava/lang/String;Lkp0/g;Llp0/l;Llp0/l;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v3, v9}, Lcom/whoop/coaching/sleepcoach/wizard/h;->Q(Lcom/whoop/coaching/sleepcoach/wizard/h;Lcom/whoop/coaching/sleepcoach/wizard/g;)V

    goto :goto_b

    :cond_a
    instance-of v3, v7, Lkp0/n;

    if-nez v3, :cond_c

    instance-of v3, v7, Lkp0/f;

    if-eqz v3, :cond_b

    goto :goto_8

    :cond_b
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_c
    :goto_8
    iget-object v3, v0, Lcom/whoop/coaching/sleepcoach/wizard/h$b;->z:Lcom/whoop/coaching/sleepcoach/wizard/h;

    invoke-static {v3}, Lcom/whoop/coaching/sleepcoach/wizard/h;->H(Lcom/whoop/coaching/sleepcoach/wizard/h;)Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;

    move-result-object v6

    if-eqz v6, :cond_d

    invoke-virtual {v6}, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->getScheduleEnabled()Z

    move-result v6

    move/from16 v17, v6

    goto :goto_9

    :cond_d
    move/from16 v17, v5

    :goto_9
    new-instance v6, Lcom/whoop/coaching/sleepcoach/wizard/g;

    if-eqz v2, :cond_e

    move v9, v4

    goto :goto_a

    :cond_e
    move v9, v5

    :goto_a
    const/16 v18, 0x3f8

    const/16 v19, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v6 .. v19}, Lcom/whoop/coaching/sleepcoach/wizard/g;-><init>(Lkp0/a;IZLorg/joda/time/LocalTime;Lorg/joda/time/LocalTime;Ljava/lang/String;Lkp0/g;Llp0/l;Llp0/l;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v3, v6}, Lcom/whoop/coaching/sleepcoach/wizard/h;->Q(Lcom/whoop/coaching/sleepcoach/wizard/h;Lcom/whoop/coaching/sleepcoach/wizard/g;)V

    :goto_b
    iget-object v3, v0, Lcom/whoop/coaching/sleepcoach/wizard/h$b;->z:Lcom/whoop/coaching/sleepcoach/wizard/h;

    invoke-static {v3}, Lcom/whoop/coaching/sleepcoach/wizard/h;->A(Lcom/whoop/coaching/sleepcoach/wizard/h;)Lcom/whoop/coaching/sleepcoach/wizard/b;

    move-result-object v3

    iget-object v6, v0, Lcom/whoop/coaching/sleepcoach/wizard/h$b;->z:Lcom/whoop/coaching/sleepcoach/wizard/h;

    invoke-static {v6}, Lcom/whoop/coaching/sleepcoach/wizard/h;->A(Lcom/whoop/coaching/sleepcoach/wizard/h;)Lcom/whoop/coaching/sleepcoach/wizard/b;

    move-result-object v6

    invoke-virtual {v6}, Lcom/whoop/coaching/sleepcoach/wizard/b;->r()Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;

    move-result-object v6

    if-eqz v2, :cond_f

    move v9, v4

    goto :goto_c

    :cond_f
    move v9, v5

    :goto_c
    if-eqz v2, :cond_10

    move v10, v4

    goto :goto_d

    :cond_10
    move v10, v5

    :goto_d
    iget-object v2, v0, Lcom/whoop/coaching/sleepcoach/wizard/h$b;->z:Lcom/whoop/coaching/sleepcoach/wizard/h;

    invoke-static {v2}, Lcom/whoop/coaching/sleepcoach/wizard/h;->F(Lcom/whoop/coaching/sleepcoach/wizard/h;)Lcom/whoop/sleep/coach/data/network/model/HarvardSleepAdviceDto;

    move-result-object v2

    if-eqz v2, :cond_11

    invoke-virtual {v2}, Lcom/whoop/sleep/coach/data/network/model/HarvardSleepAdviceDto;->getEligibleForSmartAlarms()Z

    move-result v5

    :cond_11
    move/from16 v17, v5

    const/16 v19, 0xbc0

    const/16 v20, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    move v11, v8

    move-object v8, v7

    move v12, v1

    invoke-static/range {v6 .. v20}, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->copy$default(Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;Lkp0/a;Lkp0/a;ZZIZZLkp0/q;Lkp0/r;ZZLkp0/k;ILjava/lang/Object;)Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;

    move-result-object v1

    invoke-virtual {v3, v1}, Lcom/whoop/coaching/sleepcoach/wizard/b;->B(Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;)V

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
