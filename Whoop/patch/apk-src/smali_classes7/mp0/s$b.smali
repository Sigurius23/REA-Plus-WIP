.class final Lmp0/s$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmp0/s;->b0(Z)V
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
    c = "com.whoop.coaching.sleepcoach.wizard.SleepCoachAlarmLoadingStateViewModel$startLoadingSetAlarm$1"
    f = "SleepCoachAlarmLoadingStateViewModel.kt"
    l = {
        0x4e
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Z

.field w:Ljava/lang/Object;

.field x:I

.field final synthetic y:Lmp0/s;

.field final synthetic z:Z


# direct methods
.method public constructor <init>(Lmp0/s;ZZLq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmp0/s;",
            "ZZ",
            "Lq83/d<",
            "-",
            "Lmp0/s$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lmp0/s$b;->y:Lmp0/s;

    iput-boolean p2, p0, Lmp0/s$b;->z:Z

    iput-boolean p3, p0, Lmp0/s$b;->E:Z

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

    new-instance p1, Lmp0/s$b;

    iget-object v0, p0, Lmp0/s$b;->y:Lmp0/s;

    iget-boolean v1, p0, Lmp0/s$b;->z:Z

    iget-boolean v2, p0, Lmp0/s$b;->E:Z

    invoke-direct {p1, v0, v1, v2, p2}, Lmp0/s$b;-><init>(Lmp0/s;ZZLq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lmp0/s$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lmp0/s$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lmp0/s$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lmp0/s$b;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lmp0/s$b;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lmp0/s$b;->w:Ljava/lang/Object;

    check-cast v0, Lorg/joda/time/DateTime;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lmp0/s$b;->y:Lmp0/s;

    invoke-static {p1}, Lmp0/s;->w(Lmp0/s;)Lcom/whoop/coaching/sleepcoach/wizard/b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/coaching/sleepcoach/wizard/b;->r()Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->getCurrentAlarm()Lkp0/a;

    move-result-object p1

    invoke-virtual {p1}, Lkp0/a;->b()Lorg/joda/time/LocalTime;

    move-result-object p1

    const/4 v1, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v3, v1, v3}, Ltf2/a;->b(Lorg/joda/time/LocalTime;Lorg/joda/time/DateTime;ILjava/lang/Object;)Lorg/joda/time/DateTime;

    move-result-object v6

    iget-object v4, p0, Lmp0/s$b;->y:Lmp0/s;

    iget-boolean v5, p0, Lmp0/s$b;->z:Z

    iget-boolean v7, p0, Lmp0/s$b;->E:Z

    invoke-static {v4}, Lmp0/s;->w(Lmp0/s;)Lcom/whoop/coaching/sleepcoach/wizard/b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/coaching/sleepcoach/wizard/b;->r()Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->getScheduleEnabled()Z

    move-result v8

    iget-object p1, p0, Lmp0/s$b;->y:Lmp0/s;

    invoke-static {p1}, Lmp0/s;->w(Lmp0/s;)Lcom/whoop/coaching/sleepcoach/wizard/b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/coaching/sleepcoach/wizard/b;->r()Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->getDisableSchedule()Z

    move-result v9

    iput-object v3, p0, Lmp0/s$b;->w:Ljava/lang/Object;

    iput v2, p0, Lmp0/s$b;->x:I

    move-object v10, p0

    invoke-static/range {v4 .. v10}, Lmp0/s;->z(Lmp0/s;ZLorg/joda/time/DateTime;ZZZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
