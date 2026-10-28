.class final Lmp0/i0$f;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmp0/i0;->O(Ljava/lang/String;)V
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
    c = "com.whoop.coaching.sleepcoach.wizard.SleepCoachVowContainerViewModel$onLoad$1"
    f = "SleepCoachVowContainerViewModel.kt"
    l = {
        0x36
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field private synthetic x:Ljava/lang/Object;

.field final synthetic y:Lmp0/i0;

.field final synthetic z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lmp0/i0;Ljava/lang/String;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmp0/i0;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lmp0/i0$f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lmp0/i0$f;->y:Lmp0/i0;

    iput-object p2, p0, Lmp0/i0$f;->z:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

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

    new-instance v0, Lmp0/i0$f;

    iget-object v1, p0, Lmp0/i0$f;->y:Lmp0/i0;

    iget-object v2, p0, Lmp0/i0$f;->z:Ljava/lang/String;

    invoke-direct {v0, v1, v2, p2}, Lmp0/i0$f;-><init>(Lmp0/i0;Ljava/lang/String;Lq83/d;)V

    iput-object p1, v0, Lmp0/i0$f;->x:Ljava/lang/Object;

    return-object v0
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
    invoke-virtual {p0, p1, p2}, Lmp0/i0$f;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lmp0/i0$f;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lmp0/i0$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lmp0/i0$f;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lmp0/i0$f;->x:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lmp0/i0$f;->w:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v4, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lmp0/i0$f;->y:Lmp0/i0;

    invoke-virtual {p1}, Lmp0/i0;->M()Landroidx/lifecycle/p0;

    move-result-object v2

    new-instance v5, Lmp0/j0;

    invoke-direct {v5, v3, v4, v4, v3}, Lmp0/j0;-><init>(Lcom/whoop/design/util/TextResource;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {p1, v2, v5}, Lmp0/i0;->E(Lmp0/i0;Landroidx/lifecycle/p0;Ljava/lang/Object;)V

    iget-object p1, p0, Lmp0/i0$f;->y:Lmp0/i0;

    invoke-static {p1}, Lmp0/i0;->z(Lmp0/i0;)Ljp0/a;

    move-result-object p1

    iput-object v0, p0, Lmp0/i0$f;->x:Ljava/lang/Object;

    iput v4, p0, Lmp0/i0$f;->w:I

    invoke-interface {p1, p0}, Ljp0/a;->a(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_2

    return-object v1

    :cond_2
    :goto_0
    check-cast p1, Lcom/whoop/sleep/coach/data/network/model/HarvardSleepAdviceDto;

    if-eqz p1, :cond_3

    iget-object v1, p0, Lmp0/i0$f;->y:Lmp0/i0;

    invoke-static {v1, p1}, Lmp0/i0;->F(Lmp0/i0;Lcom/whoop/sleep/coach/data/network/model/HarvardSleepAdviceDto;)V

    iget-object v1, p0, Lmp0/i0$f;->y:Lmp0/i0;

    invoke-virtual {p1}, Lcom/whoop/sleep/coach/data/network/model/HarvardSleepAdviceDto;->getAlarmScheduleState()Lcom/whoop/sleep/coach/data/network/model/AlarmScheduleState;

    move-result-object v2

    invoke-virtual {p1}, Lcom/whoop/sleep/coach/data/network/model/HarvardSleepAdviceDto;->getChipLabelTextDisplay()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, v2, p1}, Lmp0/i0;->G(Lmp0/i0;Lcom/whoop/sleep/coach/data/network/model/AlarmScheduleState;Ljava/lang/String;)V

    goto :goto_1

    :cond_3
    iget-object p1, p0, Lmp0/i0$f;->y:Lmp0/i0;

    invoke-virtual {p1}, Lmp0/i0;->M()Landroidx/lifecycle/p0;

    move-result-object v1

    invoke-static {}, Lmp0/i0;->D()Lmp0/j0;

    move-result-object v2

    invoke-static {p1, v1, v2}, Lmp0/i0;->E(Lmp0/i0;Landroidx/lifecycle/p0;Ljava/lang/Object;)V

    :goto_1
    iget-object p1, p0, Lmp0/i0$f;->y:Lmp0/i0;

    invoke-static {p1}, Lmp0/i0;->B(Lmp0/i0;)Lcom/whoop/sleep/coach/data/network/model/HarvardSleepAdviceDto;

    move-result-object p1

    if-eqz p1, :cond_4

    iget-object v1, p0, Lmp0/i0$f;->y:Lmp0/i0;

    iget-object v2, p0, Lmp0/i0$f;->z:Ljava/lang/String;

    new-instance v4, Lmp0/i0$f$a;

    invoke-direct {v4, v1, p1, v2, v3}, Lmp0/i0$f$a;-><init>(Lmp0/i0;Lcom/whoop/sleep/coach/data/network/model/HarvardSleepAdviceDto;Ljava/lang/String;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v3, v3, v4, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_4
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
