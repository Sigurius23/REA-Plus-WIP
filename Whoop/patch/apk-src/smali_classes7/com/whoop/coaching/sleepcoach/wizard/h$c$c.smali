.class final Lcom/whoop/coaching/sleepcoach/wizard/h$c$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/coaching/sleepcoach/wizard/h$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lec3/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic w:Lcom/whoop/coaching/sleepcoach/wizard/h;


# direct methods
.method public constructor <init>(Lcom/whoop/coaching/sleepcoach/wizard/h;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/coaching/sleepcoach/wizard/h$c$c;->w:Lcom/whoop/coaching/sleepcoach/wizard/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Ll83/k;Lq83/d;)Ljava/lang/Object;
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll83/k;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, Lcom/whoop/coaching/sleepcoach/wizard/h$c$c;->w:Lcom/whoop/coaching/sleepcoach/wizard/h;

    invoke-static {v2}, Lcom/whoop/coaching/sleepcoach/wizard/h;->B(Lcom/whoop/coaching/sleepcoach/wizard/h;)Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;

    move-result-object v2

    iget-object v3, v1, Ll83/k;->x:Ljava/lang/Object;

    iget-object v4, v1, Ll83/k;->x:Ljava/lang/Object;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    iget-object v2, v0, Lcom/whoop/coaching/sleepcoach/wizard/h$c$c;->w:Lcom/whoop/coaching/sleepcoach/wizard/h;

    move-object v3, v4

    check-cast v3, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;

    invoke-static {v2, v3}, Lcom/whoop/coaching/sleepcoach/wizard/h;->K(Lcom/whoop/coaching/sleepcoach/wizard/h;Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;)V

    iget-object v2, v0, Lcom/whoop/coaching/sleepcoach/wizard/h$c$c;->w:Lcom/whoop/coaching/sleepcoach/wizard/h;

    invoke-static {v2}, Lcom/whoop/coaching/sleepcoach/wizard/h;->F(Lcom/whoop/coaching/sleepcoach/wizard/h;)Lcom/whoop/sleep/coach/data/network/model/HarvardSleepAdviceDto;

    move-result-object v2

    if-eqz v2, :cond_7

    iget-object v3, v0, Lcom/whoop/coaching/sleepcoach/wizard/h$c$c;->w:Lcom/whoop/coaching/sleepcoach/wizard/h;

    move-object v5, v4

    check-cast v5, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;

    invoke-static {v3}, Lcom/whoop/coaching/sleepcoach/wizard/h;->E(Lcom/whoop/coaching/sleepcoach/wizard/h;)Z

    move-result v4

    const/4 v6, 0x0

    if-eqz v4, :cond_0

    move-object v5, v6

    goto/16 :goto_3

    :cond_0
    invoke-virtual {v5}, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->getCurrentAlarm()Lkp0/a;

    move-result-object v4

    instance-of v4, v4, Lkp0/n;

    if-eqz v4, :cond_3

    invoke-virtual {v5}, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->getCurrentAlarm()Lkp0/a;

    move-result-object v4

    instance-of v7, v4, Lkp0/n;

    if-eqz v7, :cond_1

    check-cast v4, Lkp0/n;

    goto :goto_0

    :cond_1
    move-object v4, v6

    :goto_0
    if-eqz v4, :cond_2

    invoke-virtual {v4}, Lkp0/n;->d()Lkp0/o;

    move-result-object v4

    goto :goto_1

    :cond_2
    move-object v4, v6

    :goto_1
    instance-of v4, v4, Lkp0/q;

    if-eqz v4, :cond_3

    sget-object v4, Lcom/whoop/coaching/sleepcoach/wizard/b;->q:Lcom/whoop/coaching/sleepcoach/wizard/b$a;

    invoke-virtual {v4}, Lcom/whoop/coaching/sleepcoach/wizard/b$a;->b()Lkp0/a;

    move-result-object v6

    const/16 v18, 0xffe

    const/16 v19, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v5 .. v19}, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->copy$default(Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;Lkp0/a;Lkp0/a;ZZIZZLkp0/q;Lkp0/r;ZZLkp0/k;ILjava/lang/Object;)Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;

    move-result-object v5

    goto :goto_3

    :cond_3
    invoke-virtual {v5}, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->getCurrentAlarm()Lkp0/a;

    move-result-object v4

    instance-of v4, v4, Lkp0/n;

    if-eqz v4, :cond_6

    invoke-virtual {v5}, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->getCurrentAlarm()Lkp0/a;

    move-result-object v4

    instance-of v7, v4, Lkp0/n;

    if-eqz v7, :cond_4

    check-cast v4, Lkp0/n;

    goto :goto_2

    :cond_4
    move-object v4, v6

    :goto_2
    if-eqz v4, :cond_5

    invoke-virtual {v4}, Lkp0/n;->d()Lkp0/o;

    move-result-object v6

    :cond_5
    instance-of v4, v6, Lkp0/r;

    if-eqz v4, :cond_6

    sget-object v4, Lcom/whoop/coaching/sleepcoach/wizard/b;->q:Lcom/whoop/coaching/sleepcoach/wizard/b$a;

    invoke-virtual {v4}, Lcom/whoop/coaching/sleepcoach/wizard/b$a;->b()Lkp0/a;

    move-result-object v6

    const/16 v18, 0xffe

    const/16 v19, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v5 .. v19}, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->copy$default(Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;Lkp0/a;Lkp0/a;ZZIZZLkp0/q;Lkp0/r;ZZLkp0/k;ILjava/lang/Object;)Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;

    move-result-object v5

    :cond_6
    :goto_3
    invoke-static {v3, v5}, Lcom/whoop/coaching/sleepcoach/wizard/h;->P(Lcom/whoop/coaching/sleepcoach/wizard/h;Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;)V

    iget-object v1, v1, Ll83/k;->w:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;

    invoke-static {v3}, Lcom/whoop/coaching/sleepcoach/wizard/h;->I(Lcom/whoop/coaching/sleepcoach/wizard/h;)Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;

    move-result-object v4

    invoke-static {v3, v2, v1, v4}, Lcom/whoop/coaching/sleepcoach/wizard/h;->w(Lcom/whoop/coaching/sleepcoach/wizard/h;Lcom/whoop/sleep/coach/data/network/model/HarvardSleepAdviceDto;Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;)V

    :cond_7
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll83/k;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/coaching/sleepcoach/wizard/h$c$c;->b(Ll83/k;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
