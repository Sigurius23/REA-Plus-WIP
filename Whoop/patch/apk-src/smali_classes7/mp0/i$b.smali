.class final Lmp0/i$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmp0/i;->w()V
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
    c = "com.whoop.coaching.sleepcoach.wizard.CollapsedConductorViewModel$getModalText$1"
    f = "CollapsedConductorViewModel.kt"
    l = {
        0x51
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lmp0/i;


# direct methods
.method public constructor <init>(Lmp0/i;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmp0/i;",
            "Lq83/d<",
            "-",
            "Lmp0/i$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lmp0/i$b;->x:Lmp0/i;

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

    new-instance p1, Lmp0/i$b;

    iget-object v0, p0, Lmp0/i$b;->x:Lmp0/i;

    invoke-direct {p1, v0, p2}, Lmp0/i$b;-><init>(Lmp0/i;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lmp0/i$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lmp0/i$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lmp0/i$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lmp0/i$b;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lmp0/i$b;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lmp0/i$b;->x:Lmp0/i;

    invoke-static {p1}, Lmp0/i;->g(Lmp0/i;)Ljp0/a;

    move-result-object p1

    iput v2, p0, Lmp0/i$b;->w:I

    invoke-interface {p1, p0}, Ljp0/a;->a(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, Lcom/whoop/sleep/coach/data/network/model/HarvardSleepAdviceDto;

    if-eqz p1, :cond_4

    iget-object v0, p0, Lmp0/i$b;->x:Lmp0/i;

    invoke-virtual {p1}, Lcom/whoop/sleep/coach/data/network/model/HarvardSleepAdviceDto;->getTurnOffAllModal()Lcom/whoop/sleep/coach/data/network/model/SleepCoachInteractionModal;

    move-result-object v1

    invoke-static {v0, v1}, Lmp0/i;->l(Lmp0/i;Lcom/whoop/sleep/coach/data/network/model/SleepCoachInteractionModal;)V

    invoke-virtual {p1}, Lcom/whoop/sleep/coach/data/network/model/HarvardSleepAdviceDto;->getTurnOffScheduleModal()Lcom/whoop/sleep/coach/data/network/model/SleepCoachInteractionModal;

    move-result-object v1

    invoke-static {v0, v1}, Lmp0/i;->n(Lmp0/i;Lcom/whoop/sleep/coach/data/network/model/SleepCoachInteractionModal;)V

    invoke-static {v0}, Lmp0/i;->j(Lmp0/i;)Lcom/whoop/coaching/sleepcoach/wizard/a;

    move-result-object v2

    invoke-virtual {p1}, Lcom/whoop/sleep/coach/data/network/model/HarvardSleepAdviceDto;->getNextScheduleDayLabel()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_3

    const-string p1, ""

    :cond_3
    move-object v6, p1

    const/16 v8, 0x17

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    invoke-static/range {v2 .. v9}, Lcom/whoop/coaching/sleepcoach/wizard/a;->b(Lcom/whoop/coaching/sleepcoach/wizard/a;Lkp0/a;ZZLjava/lang/String;ZILjava/lang/Object;)Lcom/whoop/coaching/sleepcoach/wizard/a;

    move-result-object p1

    invoke-static {v0, p1}, Lmp0/i;->o(Lmp0/i;Lcom/whoop/coaching/sleepcoach/wizard/a;)V

    :cond_4
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
