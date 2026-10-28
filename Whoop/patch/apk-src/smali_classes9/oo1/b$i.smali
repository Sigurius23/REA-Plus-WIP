.class final Loo1/b$i;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Loo1/b;->interact(Lec3/l;)Lec3/l;
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
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lec3/m;",
        "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarDomainState;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lec3/m;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.hormonalinsights.menstrualcycleinsights.domain.LogCalendarInteractor$interact$3$1"
    f = "LogCalendarInteractor.kt"
    l = {
        0x68,
        0x70
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field private synthetic x:Ljava/lang/Object;

.field final synthetic y:Loo1/b$b;


# direct methods
.method public constructor <init>(Loo1/b$b;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Loo1/b$b;",
            "Lq83/d<",
            "-",
            "Loo1/b$i;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Loo1/b$i;->y:Loo1/b$b;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2
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

    new-instance v0, Loo1/b$i;

    iget-object v1, p0, Loo1/b$i;->y:Loo1/b$b;

    invoke-direct {v0, v1, p2}, Loo1/b$i;-><init>(Loo1/b$b;Lq83/d;)V

    iput-object p1, v0, Loo1/b$i;->x:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Loo1/b$i;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Loo1/b$i;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Loo1/b$i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Loo1/b$i;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Loo1/b$i;->x:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Loo1/b$i;->w:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarDomainState;

    iget-object v2, p0, Loo1/b$i;->y:Loo1/b$b;

    invoke-virtual {v2}, Loo1/b$b;->e()Ljava/util/Map;

    move-result-object v2

    sget-object v5, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState$Loading;->INSTANCE:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState$Loading;

    iget-object v6, p0, Loo1/b$i;->y:Loo1/b$b;

    invoke-virtual {v6}, Loo1/b$b;->e()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Map;->isEmpty()Z

    move-result v6

    xor-int/2addr v6, v4

    invoke-direct {p1, v2, v5, v6}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarDomainState;-><init>(Ljava/util/Map;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState;Z)V

    iput-object v0, p0, Loo1/b$i;->x:Ljava/lang/Object;

    iput v4, p0, Loo1/b$i;->w:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    new-instance p1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarDomainState;

    iget-object v2, p0, Loo1/b$i;->y:Loo1/b$b;

    invoke-virtual {v2}, Loo1/b$b;->e()Ljava/util/Map;

    move-result-object v2

    iget-object v5, p0, Loo1/b$i;->y:Loo1/b$b;

    invoke-virtual {v5}, Loo1/b$b;->d()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState;

    move-result-object v5

    iget-object v6, p0, Loo1/b$i;->y:Loo1/b$b;

    invoke-virtual {v6}, Loo1/b$b;->e()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Map;->isEmpty()Z

    move-result v6

    xor-int/2addr v4, v6

    invoke-direct {p1, v2, v5, v4}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarDomainState;-><init>(Ljava/util/Map;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState;Z)V

    const/4 v2, 0x0

    iput-object v2, p0, Loo1/b$i;->x:Ljava/lang/Object;

    iput v3, p0, Loo1/b$i;->w:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    :goto_1
    return-object v1

    :cond_4
    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
