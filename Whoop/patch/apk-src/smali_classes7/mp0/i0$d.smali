.class final Lmp0/i0$d;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmp0/i0;->L(Lcom/whoop/sleep/coach/data/network/model/HarvardSleepAdviceDto;Ljava/lang/String;)V
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
    c = "com.whoop.coaching.sleepcoach.wizard.SleepCoachVowContainerViewModel$getVow$1"
    f = "SleepCoachVowContainerViewModel.kt"
    l = {
        0x67
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lmp0/i0;

.field final synthetic y:Lcom/whoop/sleep/coach/data/network/model/HarvardSleepAdviceDto;

.field final synthetic z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lmp0/i0;Lcom/whoop/sleep/coach/data/network/model/HarvardSleepAdviceDto;Ljava/lang/String;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmp0/i0;",
            "Lcom/whoop/sleep/coach/data/network/model/HarvardSleepAdviceDto;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lmp0/i0$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lmp0/i0$d;->x:Lmp0/i0;

    iput-object p2, p0, Lmp0/i0$d;->y:Lcom/whoop/sleep/coach/data/network/model/HarvardSleepAdviceDto;

    iput-object p3, p0, Lmp0/i0$d;->z:Ljava/lang/String;

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

    new-instance p1, Lmp0/i0$d;

    iget-object v0, p0, Lmp0/i0$d;->x:Lmp0/i0;

    iget-object v1, p0, Lmp0/i0$d;->y:Lcom/whoop/sleep/coach/data/network/model/HarvardSleepAdviceDto;

    iget-object v2, p0, Lmp0/i0$d;->z:Ljava/lang/String;

    invoke-direct {p1, v0, v1, v2, p2}, Lmp0/i0$d;-><init>(Lmp0/i0;Lcom/whoop/sleep/coach/data/network/model/HarvardSleepAdviceDto;Ljava/lang/String;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lmp0/i0$d;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lmp0/i0$d;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lmp0/i0$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lmp0/i0$d;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lmp0/i0$d;->w:I

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

    iget-object p1, p0, Lmp0/i0$d;->x:Lmp0/i0;

    invoke-static {p1}, Lmp0/i0;->z(Lmp0/i0;)Ljp0/a;

    move-result-object p1

    iget-object v1, p0, Lmp0/i0$d;->y:Lcom/whoop/sleep/coach/data/network/model/HarvardSleepAdviceDto;

    iget-object v3, p0, Lmp0/i0$d;->z:Ljava/lang/String;

    iput v2, p0, Lmp0/i0$d;->w:I

    invoke-interface {p1, v1, v3, p0}, Ljp0/a;->d(Lcom/whoop/sleep/coach/data/network/model/HarvardSleepAdviceDto;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, Lcom/whoop/data/remote/commons/Resource;

    invoke-virtual {p1}, Lcom/whoop/data/remote/commons/Resource;->getSuccess()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Lcom/whoop/data/remote/commons/Resource;->getData()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_3

    new-instance v0, Lmp0/j0;

    new-instance v1, Lcom/whoop/design/util/TextResource$e;

    invoke-virtual {p1}, Lcom/whoop/data/remote/commons/Resource;->getData()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast p1, Lcom/whoop/sleep/coach/data/network/model/Vow;

    invoke-virtual {p1}, Lcom/whoop/sleep/coach/data/network/model/Vow;->getText()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    const/4 p1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, p1, v2}, Lmp0/j0;-><init>(Lcom/whoop/design/util/TextResource;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_1

    :cond_3
    invoke-static {}, Lmp0/i0;->D()Lmp0/j0;

    move-result-object v0

    :goto_1
    iget-object p1, p0, Lmp0/i0$d;->x:Lmp0/i0;

    invoke-virtual {p1}, Lmp0/i0;->M()Landroidx/lifecycle/p0;

    move-result-object v1

    invoke-static {p1, v1, v0}, Lmp0/i0;->E(Lmp0/i0;Landroidx/lifecycle/p0;Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
