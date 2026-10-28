.class final Loo1/b$k;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Loo1/b;->j(Loo1/b$b;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.hormonalinsights.menstrualcycleinsights.domain.LogCalendarInteractor$logPeriod$2"
    f = "LogCalendarInteractor.kt"
    l = {
        0xa5,
        0xbc,
        0xc2,
        0xcb
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field private synthetic E:Ljava/lang/Object;

.field final synthetic F:Loo1/b$b;

.field final synthetic G:Loo1/b;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:I


# direct methods
.method public constructor <init>(Loo1/b$b;Loo1/b;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Loo1/b$b;",
            "Loo1/b;",
            "Lq83/d<",
            "-",
            "Loo1/b$k;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Loo1/b$k;->F:Loo1/b$b;

    iput-object p2, p0, Loo1/b$k;->G:Loo1/b;

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

    new-instance v0, Loo1/b$k;

    iget-object v1, p0, Loo1/b$k;->F:Loo1/b$b;

    iget-object v2, p0, Loo1/b$k;->G:Loo1/b;

    invoke-direct {v0, v1, v2, p2}, Loo1/b$k;-><init>(Loo1/b$b;Loo1/b;Lq83/d;)V

    iput-object p1, v0, Loo1/b$k;->E:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Loo1/b$k;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Loo1/b$k;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Loo1/b$k;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Loo1/b$k;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 15

    iget-object v0, p0, Loo1/b$k;->E:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Lec3/m;

    sget-object v9, Lr83/a;->w:Lr83/a;

    iget v0, p0, Loo1/b$k;->z:I

    const/4 v10, 0x4

    const/4 v11, 0x3

    const/4 v1, 0x2

    const/4 v12, 0x1

    const/4 v13, 0x0

    if-eqz v0, :cond_4

    if-eq v0, v12, :cond_3

    if-eq v0, v1, :cond_2

    if-eq v0, v11, :cond_1

    if-ne v0, v10, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    iget-object v0, p0, Loo1/b$k;->y:Ljava/lang/Object;

    check-cast v0, Lu02/a;

    iget-object v0, p0, Loo1/b$k;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodRequest;

    iget-object v0, p0, Loo1/b$k;->w:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_2
    iget-object v0, p0, Loo1/b$k;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodRequest;

    iget-object v0, p0, Loo1/b$k;->w:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    goto/16 :goto_3

    :cond_3
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance v0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarDomainState;

    iget-object v2, p0, Loo1/b$k;->F:Loo1/b$b;

    invoke-virtual {v2}, Loo1/b$b;->e()Ljava/util/Map;

    move-result-object v2

    sget-object v3, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState$Saving;->INSTANCE:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState$Saving;

    iget-object v4, p0, Loo1/b$k;->F:Loo1/b$b;

    invoke-virtual {v4}, Loo1/b$b;->e()Ljava/util/Map;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Map;->isEmpty()Z

    move-result v4

    xor-int/2addr v4, v12

    invoke-direct {v0, v2, v3, v4}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarDomainState;-><init>(Ljava/util/Map;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState;Z)V

    iput-object v8, p0, Loo1/b$k;->E:Ljava/lang/Object;

    iput v12, p0, Loo1/b$k;->z:I

    invoke-interface {v8, v0, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_5

    goto/16 :goto_4

    :cond_5
    :goto_1
    iget-object v0, p0, Loo1/b$k;->F:Loo1/b$b;

    invoke-virtual {v0}, Loo1/b$b;->e()Ljava/util/Map;

    move-result-object v0

    new-instance v2, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    new-instance v4, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PeriodLog;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    new-instance v7, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MenstrualLevelAnswer;

    invoke-direct {v7, v13, v3}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MenstrualLevelAnswer;-><init>(Ljava/lang/Float;Z)V

    new-instance v3, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MenstrualLevelAnswer;

    const/4 v14, 0x0

    invoke-direct {v3, v13, v14}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MenstrualLevelAnswer;-><init>(Ljava/lang/Float;Z)V

    invoke-direct {v4, v6, v7, v3}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PeriodLog;-><init>(Ljava/lang/String;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MenstrualLevelAnswer;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MenstrualLevelAnswer;)V

    invoke-interface {v2, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_6
    new-instance v0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodRequest;

    invoke-direct {v0, v2}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodRequest;-><init>(Ljava/util/List;)V

    sget-object v2, Lu02/a;->a:Lu02/a$a;

    iget-object v3, p0, Loo1/b$k;->G:Loo1/b;

    invoke-static {v3}, Loo1/b;->e(Loo1/b;)Ltr2/n;

    move-result-object v3

    new-instance v4, Loo1/b$k$a;

    iget-object v6, p0, Loo1/b$k;->G:Loo1/b;

    invoke-direct {v4, v6, v0, v13}, Loo1/b$k$a;-><init>(Loo1/b;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodRequest;Lq83/d;)V

    iput-object v8, p0, Loo1/b$k;->E:Ljava/lang/Object;

    iput-object v13, p0, Loo1/b$k;->w:Ljava/lang/Object;

    iput-object v13, p0, Loo1/b$k;->x:Ljava/lang/Object;

    iput v1, p0, Loo1/b$k;->z:I

    move-object v0, v2

    const/4 v2, 0x0

    move-object v1, v3

    const/4 v3, 0x0

    const/4 v6, 0x6

    const/4 v7, 0x0

    move-object v5, p0

    invoke-static/range {v0 .. v7}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_7

    goto :goto_4

    :cond_7
    :goto_3
    check-cast v0, Lu02/a;

    instance-of v1, v0, Lu02/a$c;

    if-eqz v1, :cond_8

    new-instance v0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarDomainState;

    iget-object v1, p0, Loo1/b$k;->F:Loo1/b$b;

    invoke-virtual {v1}, Loo1/b$b;->e()Ljava/util/Map;

    move-result-object v1

    sget-object v2, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState$SaveSuccess;->INSTANCE:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState$SaveSuccess;

    iget-object v3, p0, Loo1/b$k;->F:Loo1/b$b;

    invoke-virtual {v3}, Loo1/b$b;->e()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Map;->isEmpty()Z

    move-result v3

    xor-int/2addr v3, v12

    invoke-direct {v0, v1, v2, v3}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarDomainState;-><init>(Ljava/util/Map;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState;Z)V

    iput-object v13, p0, Loo1/b$k;->E:Ljava/lang/Object;

    iput-object v13, p0, Loo1/b$k;->w:Ljava/lang/Object;

    iput-object v13, p0, Loo1/b$k;->x:Ljava/lang/Object;

    iput-object v13, p0, Loo1/b$k;->y:Ljava/lang/Object;

    iput v11, p0, Loo1/b$k;->z:I

    invoke-interface {v8, v0, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_9

    goto :goto_4

    :cond_8
    instance-of v0, v0, Lu02/a$b;

    if-eqz v0, :cond_a

    new-instance v0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarDomainState;

    iget-object v1, p0, Loo1/b$k;->F:Loo1/b$b;

    invoke-virtual {v1}, Loo1/b$b;->e()Ljava/util/Map;

    move-result-object v1

    sget-object v2, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState$SaveError;->INSTANCE:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState$SaveError;

    iget-object v3, p0, Loo1/b$k;->F:Loo1/b$b;

    invoke-virtual {v3}, Loo1/b$b;->e()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Map;->isEmpty()Z

    move-result v3

    xor-int/2addr v3, v12

    invoke-direct {v0, v1, v2, v3}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarDomainState;-><init>(Ljava/util/Map;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState;Z)V

    iput-object v13, p0, Loo1/b$k;->E:Ljava/lang/Object;

    iput-object v13, p0, Loo1/b$k;->w:Ljava/lang/Object;

    iput-object v13, p0, Loo1/b$k;->x:Ljava/lang/Object;

    iput-object v13, p0, Loo1/b$k;->y:Ljava/lang/Object;

    iput v10, p0, Loo1/b$k;->z:I

    invoke-interface {v8, v0, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_9

    :goto_4
    return-object v9

    :cond_9
    :goto_5
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :cond_a
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method
