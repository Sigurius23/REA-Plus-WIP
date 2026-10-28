.class final Loo1/b$h;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


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
        "Lkotlin/jvm/functions/Function3;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Loo1/b$b;",
        "prev",
        "Loo1/b$c;",
        "action",
        "<anonymous>",
        "(Loo1/b$b;Loo1/b$c;)Loo1/b$b;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.hormonalinsights.menstrualcycleinsights.domain.LogCalendarInteractor$interact$2"
    f = "LogCalendarInteractor.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Loo1/b;


# direct methods
.method public constructor <init>(Loo1/b;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Loo1/b;",
            "Lq83/d<",
            "-",
            "Loo1/b$h;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Loo1/b$h;->z:Loo1/b;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Loo1/b$b;Loo1/b$c;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Loo1/b$b;",
            "Loo1/b$c;",
            "Lq83/d<",
            "-",
            "Loo1/b$b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Loo1/b$h;

    iget-object v1, p0, Loo1/b$h;->z:Loo1/b;

    invoke-direct {v0, v1, p3}, Loo1/b$h;-><init>(Loo1/b;Lq83/d;)V

    iput-object p1, v0, Loo1/b$h;->x:Ljava/lang/Object;

    iput-object p2, v0, Loo1/b$h;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Loo1/b$h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Loo1/b$b;

    check-cast p2, Loo1/b$c;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Loo1/b$h;->f(Loo1/b$b;Loo1/b$c;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget-object v0, p0, Loo1/b$h;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Loo1/b$b;

    iget-object v0, p0, Loo1/b$h;->y:Ljava/lang/Object;

    check-cast v0, Loo1/b$c;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v2, p0, Loo1/b$h;->w:I

    if-nez v2, :cond_9

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p1, v0, Loo1/b$c$c;

    if-eqz p1, :cond_0

    check-cast v0, Loo1/b$c$c;

    invoke-virtual {v0}, Loo1/b$c$c;->a()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState;

    move-result-object v2

    const/16 v7, 0x1e

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v1 .. v8}, Loo1/b$b;->b(Loo1/b$b;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState;Ljava/util/Map;Ljava/util/Map;IZILjava/lang/Object;)Loo1/b$b;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of p1, v0, Loo1/b$c$d;

    if-eqz p1, :cond_1

    iget-object p1, p0, Loo1/b$h;->z:Loo1/b;

    check-cast v0, Loo1/b$c$d;

    invoke-virtual {v0}, Loo1/b$c$d;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Loo1/b$c$d;->a()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;

    move-result-object v0

    invoke-static {p1, v1, v2, v0}, Loo1/b;->h(Loo1/b;Loo1/b$b;Ljava/lang/String;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;)Loo1/b$b;

    move-result-object p1

    return-object p1

    :cond_1
    instance-of p1, v0, Loo1/b$c$b;

    if-eqz p1, :cond_7

    invoke-virtual {v1}, Loo1/b$b;->e()Ljava/util/Map;

    move-result-object p1

    check-cast v0, Loo1/b$c$b;

    invoke-virtual {v0}, Loo1/b$c$b;->a()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    iget-object v2, p0, Loo1/b$h;->z:Loo1/b;

    invoke-static {v2}, Loo1/b;->d(Loo1/b;)Lzr2/a;

    move-result-object v2

    invoke-interface {v2}, Lzr2/a;->d()Lorg/joda/time/LocalDate;

    move-result-object v2

    const-string v3, "yyyy-MM-dd"

    invoke-virtual {v2, v3}, Lorg/joda/time/LocalDate;->toString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Loo1/b$b;->e()Ljava/util/Map;

    move-result-object v3

    invoke-static {v3}, Lm83/g0;->l0(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v4

    if-eqz p1, :cond_2

    invoke-virtual {v0}, Loo1/b$c$b;->a()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v4, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Loo1/b$b;->e()Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result v3

    const/4 v5, 0x0

    if-eqz v3, :cond_3

    goto :goto_1

    :cond_3
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_4
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_4

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_5
    :goto_1
    const/16 p1, 0x1e

    if-lt v5, p1, :cond_6

    move-object p1, v2

    new-instance v2, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState$Error;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarErrorType;->SELECTION_LIMIT:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarErrorType;

    const-string v3, "You can only select up to 30 days."

    invoke-direct {v2, v3, p1, v0}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState$Error;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarErrorType;)V

    const/16 v7, 0x1e

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v1 .. v8}, Loo1/b$b;->b(Loo1/b$b;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState;Ljava/util/Map;Ljava/util/Map;IZILjava/lang/Object;)Loo1/b$b;

    move-result-object p1

    return-object p1

    :cond_6
    invoke-virtual {v0}, Loo1/b$c$b;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0}, Loo1/b$c$b;->b()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-interface {v4, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_2
    const/16 v7, 0x1b

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v1 .. v8}, Loo1/b$b;->b(Loo1/b$b;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState;Ljava/util/Map;Ljava/util/Map;IZILjava/lang/Object;)Loo1/b$b;

    move-result-object p1

    return-object p1

    :cond_7
    instance-of p1, v0, Loo1/b$c$a;

    if-eqz p1, :cond_8

    sget-object v2, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState$Saving;->INSTANCE:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState$Saving;

    const/16 v7, 0xe

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x1

    invoke-static/range {v1 .. v8}, Loo1/b$b;->b(Loo1/b$b;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState;Ljava/util/Map;Ljava/util/Map;IZILjava/lang/Object;)Loo1/b$b;

    move-result-object p1

    return-object p1

    :cond_8
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
