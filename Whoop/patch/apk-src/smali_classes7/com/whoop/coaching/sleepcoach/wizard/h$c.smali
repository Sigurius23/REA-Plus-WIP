.class final Lcom/whoop/coaching/sleepcoach/wizard/h$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/coaching/sleepcoach/wizard/h;->m0()V
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
    c = "com.whoop.coaching.sleepcoach.wizard.TonightsSleepContainerViewModel$onCreate$1"
    f = "TonightsSleepContainerViewModel.kt"
    l = {
        0x70,
        0x78,
        0x86
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:Ljava/lang/Object;

.field x:I

.field final synthetic y:Lcom/whoop/coaching/sleepcoach/wizard/h;


# direct methods
.method public constructor <init>(Lcom/whoop/coaching/sleepcoach/wizard/h;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/coaching/sleepcoach/wizard/h;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/coaching/sleepcoach/wizard/h$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/coaching/sleepcoach/wizard/h$c;->y:Lcom/whoop/coaching/sleepcoach/wizard/h;

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

    new-instance p1, Lcom/whoop/coaching/sleepcoach/wizard/h$c;

    iget-object v0, p0, Lcom/whoop/coaching/sleepcoach/wizard/h$c;->y:Lcom/whoop/coaching/sleepcoach/wizard/h;

    invoke-direct {p1, v0, p2}, Lcom/whoop/coaching/sleepcoach/wizard/h$c;-><init>(Lcom/whoop/coaching/sleepcoach/wizard/h;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lcom/whoop/coaching/sleepcoach/wizard/h$c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/coaching/sleepcoach/wizard/h$c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/coaching/sleepcoach/wizard/h$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/coaching/sleepcoach/wizard/h$c;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcom/whoop/coaching/sleepcoach/wizard/h$c;->x:I

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    if-eqz v1, :cond_3

    if-eq v1, v4, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lcom/whoop/coaching/sleepcoach/wizard/h$c;->w:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/sleep/coach/data/network/model/HarvardSleepAdviceDto;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Lcom/whoop/coaching/sleepcoach/wizard/h$c;->w:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/sleep/coach/data/network/model/HarvardSleepAdviceDto;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/whoop/coaching/sleepcoach/wizard/h$c;->y:Lcom/whoop/coaching/sleepcoach/wizard/h;

    invoke-static {p1}, Lcom/whoop/coaching/sleepcoach/wizard/h;->D(Lcom/whoop/coaching/sleepcoach/wizard/h;)Ltr2/n;

    move-result-object p1

    const-string v1, "fetching sleep advice"

    new-array v7, v6, [Lqr2/a$a;

    invoke-interface {p1, v1, v7}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p1, p0, Lcom/whoop/coaching/sleepcoach/wizard/h$c;->y:Lcom/whoop/coaching/sleepcoach/wizard/h;

    invoke-static {p1}, Lcom/whoop/coaching/sleepcoach/wizard/h;->C(Lcom/whoop/coaching/sleepcoach/wizard/h;)Ljp0/a;

    move-result-object p1

    iput v4, p0, Lcom/whoop/coaching/sleepcoach/wizard/h$c;->x:I

    invoke-interface {p1, p0}, Ljp0/a;->a(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    goto/16 :goto_2

    :cond_4
    :goto_0
    check-cast p1, Lcom/whoop/sleep/coach/data/network/model/HarvardSleepAdviceDto;

    if-eqz p1, :cond_5

    iget-object v1, p0, Lcom/whoop/coaching/sleepcoach/wizard/h$c;->y:Lcom/whoop/coaching/sleepcoach/wizard/h;

    invoke-static {v1, p1}, Lcom/whoop/coaching/sleepcoach/wizard/h;->N(Lcom/whoop/coaching/sleepcoach/wizard/h;Lcom/whoop/sleep/coach/data/network/model/HarvardSleepAdviceDto;)V

    iget-object v1, p0, Lcom/whoop/coaching/sleepcoach/wizard/h$c;->y:Lcom/whoop/coaching/sleepcoach/wizard/h;

    invoke-static {v1}, Lcom/whoop/coaching/sleepcoach/wizard/h;->D(Lcom/whoop/coaching/sleepcoach/wizard/h;)Ltr2/n;

    move-result-object v1

    iget-object v4, p0, Lcom/whoop/coaching/sleepcoach/wizard/h$c;->y:Lcom/whoop/coaching/sleepcoach/wizard/h;

    invoke-static {v4}, Lcom/whoop/coaching/sleepcoach/wizard/h;->F(Lcom/whoop/coaching/sleepcoach/wizard/h;)Lcom/whoop/sleep/coach/data/network/model/HarvardSleepAdviceDto;

    move-result-object v4

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "fetched sleep advice response - "

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ", sleep advice global : "

    invoke-virtual {v7, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v4, v6, [Lqr2/a$a;

    invoke-interface {v1, p1, v4}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_5
    iget-object p1, p0, Lcom/whoop/coaching/sleepcoach/wizard/h$c;->y:Lcom/whoop/coaching/sleepcoach/wizard/h;

    invoke-static {p1}, Lcom/whoop/coaching/sleepcoach/wizard/h;->C(Lcom/whoop/coaching/sleepcoach/wizard/h;)Ljp0/a;

    move-result-object p1

    iput-object v5, p0, Lcom/whoop/coaching/sleepcoach/wizard/h$c;->w:Ljava/lang/Object;

    iput v3, p0, Lcom/whoop/coaching/sleepcoach/wizard/h$c;->x:I

    invoke-interface {p1, p0}, Ljp0/a;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    goto :goto_2

    :cond_6
    :goto_1
    check-cast p1, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;

    if-eqz p1, :cond_7

    iget-object v1, p0, Lcom/whoop/coaching/sleepcoach/wizard/h$c;->y:Lcom/whoop/coaching/sleepcoach/wizard/h;

    invoke-static {v1}, Lcom/whoop/coaching/sleepcoach/wizard/h;->F(Lcom/whoop/coaching/sleepcoach/wizard/h;)Lcom/whoop/sleep/coach/data/network/model/HarvardSleepAdviceDto;

    move-result-object v3

    if-eqz v3, :cond_7

    invoke-static {v1}, Lcom/whoop/coaching/sleepcoach/wizard/h;->D(Lcom/whoop/coaching/sleepcoach/wizard/h;)Ltr2/n;

    move-result-object v4

    invoke-static {v1}, Lcom/whoop/coaching/sleepcoach/wizard/h;->F(Lcom/whoop/coaching/sleepcoach/wizard/h;)Lcom/whoop/sleep/coach/data/network/model/HarvardSleepAdviceDto;

    move-result-object v7

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "attemptToUpdateAlarmInfoCacheOneShot "

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v9, " sleepAdvice : "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    new-array v8, v6, [Lqr2/a$a;

    invoke-interface {v4, v7, v8}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-static {v1, v3, p1}, Lcom/whoop/coaching/sleepcoach/wizard/h;->y(Lcom/whoop/coaching/sleepcoach/wizard/h;Lcom/whoop/sleep/coach/data/network/model/HarvardSleepAdviceDto;Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;)V

    invoke-static {v1, v6}, Lcom/whoop/coaching/sleepcoach/wizard/h;->M(Lcom/whoop/coaching/sleepcoach/wizard/h;Z)V

    :cond_7
    iget-object p1, p0, Lcom/whoop/coaching/sleepcoach/wizard/h$c;->y:Lcom/whoop/coaching/sleepcoach/wizard/h;

    invoke-static {p1}, Lcom/whoop/coaching/sleepcoach/wizard/h;->C(Lcom/whoop/coaching/sleepcoach/wizard/h;)Ljp0/a;

    move-result-object p1

    invoke-interface {p1}, Ljp0/a;->c()Lec3/l;

    move-result-object p1

    invoke-static {p1}, Lec3/v;->t(Lec3/l;)Lec3/l;

    move-result-object p1

    new-instance v1, Lcom/whoop/coaching/sleepcoach/wizard/h$c$a;

    iget-object v3, p0, Lcom/whoop/coaching/sleepcoach/wizard/h$c;->y:Lcom/whoop/coaching/sleepcoach/wizard/h;

    invoke-direct {v1, v3, v5}, Lcom/whoop/coaching/sleepcoach/wizard/h$c$a;-><init>(Lcom/whoop/coaching/sleepcoach/wizard/h;Lq83/d;)V

    new-instance v3, Lec3/j1;

    const/4 v4, 0x0

    invoke-direct {v3, p1, v1, v4}, Lec3/j1;-><init>(Ljava/lang/Object;Ll83/e;I)V

    iget-object p1, p0, Lcom/whoop/coaching/sleepcoach/wizard/h$c;->y:Lcom/whoop/coaching/sleepcoach/wizard/h;

    invoke-static {p1}, Lcom/whoop/coaching/sleepcoach/wizard/h;->A(Lcom/whoop/coaching/sleepcoach/wizard/h;)Lcom/whoop/coaching/sleepcoach/wizard/b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/coaching/sleepcoach/wizard/b;->s()Lec3/l;

    move-result-object p1

    new-instance v1, Lcom/whoop/coaching/sleepcoach/wizard/h$c$b;

    invoke-direct {v1, v5}, Lcom/whoop/coaching/sleepcoach/wizard/h$c$b;-><init>(Lq83/d;)V

    new-instance v4, Lec3/l1;

    const/4 v6, 0x1

    invoke-direct {v4, v3, p1, v1, v6}, Lec3/l1;-><init>(Lec3/l;Ljava/lang/Object;Ll83/e;I)V

    new-instance p1, Lcom/whoop/coaching/sleepcoach/wizard/h$c$c;

    iget-object v1, p0, Lcom/whoop/coaching/sleepcoach/wizard/h$c;->y:Lcom/whoop/coaching/sleepcoach/wizard/h;

    invoke-direct {p1, v1}, Lcom/whoop/coaching/sleepcoach/wizard/h$c$c;-><init>(Lcom/whoop/coaching/sleepcoach/wizard/h;)V

    iput-object v5, p0, Lcom/whoop/coaching/sleepcoach/wizard/h$c;->w:Ljava/lang/Object;

    iput v2, p0, Lcom/whoop/coaching/sleepcoach/wizard/h$c;->x:I

    invoke-virtual {v4, p1, p0}, Lec3/l1;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_8

    :goto_2
    return-object v0

    :cond_8
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
