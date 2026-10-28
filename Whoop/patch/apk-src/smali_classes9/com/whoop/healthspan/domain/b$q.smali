.class final Lcom/whoop/healthspan/domain/b$q;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/healthspan/domain/b;->interact(Lec3/l;)Lec3/l;
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
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"
    }
    d2 = {
        "<anonymous>",
        "Lcom/whoop/healthspan/domain/HealthspanDomainResult;",
        "previousState",
        "currentAction",
        ""
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.healthspan.domain.HealthspanInteractor$interact$2"
    f = "HealthspanInteractor.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lq83/d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/healthspan/domain/b$q;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x3

    invoke-direct {p0, v0, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lcom/whoop/healthspan/domain/HealthspanDomainResult;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/healthspan/domain/HealthspanDomainResult;",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/healthspan/domain/HealthspanDomainResult;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lcom/whoop/healthspan/domain/b$q;

    invoke-direct {v0, p3}, Lcom/whoop/healthspan/domain/b$q;-><init>(Lq83/d;)V

    iput-object p1, v0, Lcom/whoop/healthspan/domain/b$q;->x:Ljava/lang/Object;

    iput-object p2, v0, Lcom/whoop/healthspan/domain/b$q;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lcom/whoop/healthspan/domain/b$q;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/whoop/healthspan/domain/HealthspanDomainResult;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/healthspan/domain/b$q;->f(Lcom/whoop/healthspan/domain/HealthspanDomainResult;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    iget-object v0, p0, Lcom/whoop/healthspan/domain/b$q;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/healthspan/domain/HealthspanDomainResult;

    iget-object v1, p0, Lcom/whoop/healthspan/domain/b$q;->y:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lcom/whoop/healthspan/domain/b$q;->w:I

    if-nez v2, :cond_d

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p1, v1, Lcom/whoop/healthspan/domain/c$a;

    if-eqz p1, :cond_1

    instance-of p1, v0, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;

    if-eqz p1, :cond_0

    move-object v1, v0

    check-cast v1, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;

    const/16 v8, 0x3d

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v1 .. v9}, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;->copy$default(Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;Lcom/whoop/healthspan/domain/models/HealthspanResponse;ZZZLjava/lang/Integer;Ljava/util/Map;ILjava/lang/Object;)Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of p1, v0, Lcom/whoop/healthspan/domain/HealthspanDomainResult$OnboardingStepCompleted;

    if-eqz p1, :cond_4

    move-object v1, v0

    check-cast v1, Lcom/whoop/healthspan/domain/HealthspanDomainResult$OnboardingStepCompleted;

    const/4 v5, 0x5

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lcom/whoop/healthspan/domain/HealthspanDomainResult$OnboardingStepCompleted;->copy$default(Lcom/whoop/healthspan/domain/HealthspanDomainResult$OnboardingStepCompleted;IZZILjava/lang/Object;)Lcom/whoop/healthspan/domain/HealthspanDomainResult$OnboardingStepCompleted;

    move-result-object p1

    return-object p1

    :cond_1
    instance-of p1, v1, Lcom/whoop/healthspan/domain/c$b;

    if-eqz p1, :cond_3

    instance-of p1, v0, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;

    if-eqz p1, :cond_2

    move-object v1, v0

    check-cast v1, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;

    const/16 v8, 0x3b

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v1 .. v9}, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;->copy$default(Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;Lcom/whoop/healthspan/domain/models/HealthspanResponse;ZZZLjava/lang/Integer;Ljava/util/Map;ILjava/lang/Object;)Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;

    move-result-object p1

    return-object p1

    :cond_2
    instance-of p1, v0, Lcom/whoop/healthspan/domain/HealthspanDomainResult$OnboardingStepCompleted;

    if-eqz p1, :cond_4

    move-object v1, v0

    check-cast v1, Lcom/whoop/healthspan/domain/HealthspanDomainResult$OnboardingStepCompleted;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-static/range {v1 .. v6}, Lcom/whoop/healthspan/domain/HealthspanDomainResult$OnboardingStepCompleted;->copy$default(Lcom/whoop/healthspan/domain/HealthspanDomainResult$OnboardingStepCompleted;IZZILjava/lang/Object;)Lcom/whoop/healthspan/domain/HealthspanDomainResult$OnboardingStepCompleted;

    move-result-object p1

    return-object p1

    :cond_3
    instance-of p1, v1, Lcom/whoop/healthspan/domain/c$c;

    if-eqz p1, :cond_5

    instance-of p1, v0, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;

    if-eqz p1, :cond_4

    move-object v2, v0

    check-cast v2, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;

    invoke-virtual {v2}, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;->getDrawerExpandedStates()Ljava/util/Map;

    move-result-object p1

    invoke-static {p1}, Lm83/g0;->l0(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v8

    check-cast v1, Lcom/whoop/healthspan/domain/c$c;

    invoke-virtual {v1}, Lcom/whoop/healthspan/domain/c$c;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1}, Lcom/whoop/healthspan/domain/c$c;->b()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-interface {v8, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v9, 0x1f

    const/4 v10, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v2 .. v10}, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;->copy$default(Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;Lcom/whoop/healthspan/domain/models/HealthspanResponse;ZZZLjava/lang/Integer;Ljava/util/Map;ILjava/lang/Object;)Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;

    move-result-object p1

    return-object p1

    :cond_4
    return-object v0

    :cond_5
    instance-of p1, v0, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;

    if-eqz p1, :cond_c

    instance-of p1, v1, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;

    if-eqz p1, :cond_c

    move-object v2, v1

    check-cast v2, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;

    invoke-virtual {v2}, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;->isFromDateChange()Z

    move-result p1

    if-eqz p1, :cond_b

    check-cast v0, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;

    invoke-virtual {v0}, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;->getResponse()Lcom/whoop/healthspan/domain/models/HealthspanResponse;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/healthspan/domain/models/HealthspanResponse;->getUnlockedContent()Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_a

    invoke-virtual {p1}, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->getItems()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_a

    check-cast p1, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_6
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Lcom/whoop/design/models/items/PaceOfAgingMeterModel;

    if-eqz v4, :cond_6

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_7
    invoke-static {v1}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/design/models/items/PaceOfAgingMeterModel;

    if-eqz p1, :cond_a

    invoke-virtual {p1}, Lcom/whoop/design/models/items/PaceOfAgingMeterModel;->getTicks()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_a

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v1, 0x0

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, -0x1

    if-eqz v3, :cond_9

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/design/models/items/PaceOfAgingMeterTickModel;

    invoke-virtual {v3}, Lcom/whoop/design/models/items/PaceOfAgingMeterTickModel;->isCurrentValue()Z

    move-result v3

    if-eqz v3, :cond_8

    goto :goto_2

    :cond_8
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_9
    move v1, v4

    :goto_2
    new-instance p1, Ljava/lang/Integer;

    invoke-direct {p1, v1}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result v1

    if-eq v1, v4, :cond_a

    move-object v7, p1

    goto :goto_3

    :cond_a
    move-object v7, v0

    :goto_3
    const/16 v9, 0x2f

    const/4 v10, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    invoke-static/range {v2 .. v10}, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;->copy$default(Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;Lcom/whoop/healthspan/domain/models/HealthspanResponse;ZZZLjava/lang/Integer;Ljava/util/Map;ILjava/lang/Object;)Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;

    move-result-object p1

    return-object p1

    :cond_b
    return-object v2

    :cond_c
    const-string p1, "null cannot be cast to non-null type com.whoop.healthspan.domain.HealthspanDomainResult"

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lcom/whoop/healthspan/domain/HealthspanDomainResult;

    return-object v1

    :cond_d
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
