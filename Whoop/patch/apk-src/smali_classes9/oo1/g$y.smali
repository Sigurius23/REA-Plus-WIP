.class final Loo1/g$y;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Loo1/g;->A(Lso1/r;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lpg3/v0;",
        "Ll83/a0;",
        "<anonymous>",
        "()Lpg3/v0;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.hormonalinsights.menstrualcycleinsights.domain.MciOverviewInteractor$logPeriod$response$1"
    f = "MciOverviewInteractor.kt"
    l = {
        0x1a7
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Loo1/g;

.field final synthetic y:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodRequest;


# direct methods
.method public constructor <init>(Loo1/g;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodRequest;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Loo1/g;",
            "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodRequest;",
            "Lq83/d<",
            "-",
            "Loo1/g$y;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Loo1/g$y;->x:Loo1/g;

    iput-object p2, p0, Loo1/g$y;->y:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodRequest;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lq83/d;)Lq83/d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Loo1/g$y;

    iget-object v1, p0, Loo1/g$y;->x:Loo1/g;

    iget-object v2, p0, Loo1/g$y;->y:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodRequest;

    invoke-direct {v0, v1, v2, p1}, Loo1/g$y;-><init>(Loo1/g;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodRequest;Lq83/d;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Loo1/g$y;->invoke(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1}, Loo1/g$y;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Loo1/g$y;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Loo1/g$y;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Loo1/g$y;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Loo1/g$y;->x:Loo1/g;

    invoke-static {p1}, Loo1/g;->e(Loo1/g;)Lcom/whoop/hormonalinsights/api/HormonalInsightsApi;

    move-result-object p1

    iget-object v1, p0, Loo1/g$y;->y:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodRequest;

    iput v2, p0, Loo1/g$y;->w:I

    invoke-interface {p1, v1, p0}, Lcom/whoop/hormonalinsights/api/HormonalInsightsApi;->logPeriod(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    return-object p1
.end method
