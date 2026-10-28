.class final Ljk1/c$d;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljk1/c;->o(Lec3/l;)Lec3/l;
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
        "Ljk1/d;",
        "accumulation",
        "Lcom/whoop/healthspan/domain/HealthspanDomainResult;",
        "domainResult",
        "<anonymous>",
        "(Ljk1/d;Lcom/whoop/healthspan/domain/HealthspanDomainResult;)Ljk1/d;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.healthspan.presentation.reducers.HealthspanViewStateReducer$reduce$1"
    f = "HealthspanViewStateReducer.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Ljk1/c;


# direct methods
.method public constructor <init>(Ljk1/c;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljk1/c;",
            "Lq83/d<",
            "-",
            "Ljk1/c$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ljk1/c$d;->z:Ljk1/c;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Ljk1/d;Lcom/whoop/healthspan/domain/HealthspanDomainResult;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljk1/d;",
            "Lcom/whoop/healthspan/domain/HealthspanDomainResult;",
            "Lq83/d<",
            "-",
            "Ljk1/d;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Ljk1/c$d;

    iget-object v1, p0, Ljk1/c$d;->z:Ljk1/c;

    invoke-direct {v0, v1, p3}, Ljk1/c$d;-><init>(Ljk1/c;Lq83/d;)V

    iput-object p1, v0, Ljk1/c$d;->x:Ljava/lang/Object;

    iput-object p2, v0, Ljk1/c$d;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Ljk1/c$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljk1/d;

    check-cast p2, Lcom/whoop/healthspan/domain/HealthspanDomainResult;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Ljk1/c$d;->f(Ljk1/d;Lcom/whoop/healthspan/domain/HealthspanDomainResult;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    move-object/from16 v0, p0

    iget-object v1, v0, Ljk1/c$d;->x:Ljava/lang/Object;

    check-cast v1, Ljk1/d;

    iget-object v2, v0, Ljk1/c$d;->y:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/healthspan/domain/HealthspanDomainResult;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v3, v0, Ljk1/c$d;->w:I

    if-nez v3, :cond_e

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of v3, v2, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;

    if-eqz v3, :cond_1

    invoke-virtual {v1}, Ljk1/d;->b()Lik1/h;

    move-result-object v3

    instance-of v3, v3, Lik1/h$c;

    if-eqz v3, :cond_0

    iget-object v3, v0, Ljk1/c$d;->z:Ljk1/c;

    check-cast v2, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;

    invoke-virtual {v1}, Ljk1/d;->b()Lik1/h;

    move-result-object v4

    check-cast v4, Lik1/h$c;

    invoke-static {v3, v2, v4}, Ljk1/c;->e(Ljk1/c;Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;Lik1/h$c;)Lik1/h$c;

    move-result-object v6

    new-instance v5, Ljk1/d;

    invoke-virtual {v1}, Ljk1/d;->a()Z

    move-result v7

    const/4 v9, 0x4

    const/4 v10, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v5 .. v10}, Ljk1/d;-><init>(Lik1/h;ZLc51/s;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v5

    :cond_0
    iget-object v3, v0, Ljk1/c$d;->z:Ljk1/c;

    check-cast v2, Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;

    invoke-static {v3, v2, v1}, Ljk1/c;->d(Ljk1/c;Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;Ljk1/d;)Ljk1/d;

    move-result-object v1

    return-object v1

    :cond_1
    instance-of v3, v2, Lcom/whoop/healthspan/domain/HealthspanDomainResult$c;

    if-eqz v3, :cond_2

    new-instance v4, Ljk1/d;

    sget-object v5, Lik1/h$b;->b:Lik1/h$b;

    invoke-virtual {v1}, Ljk1/d;->a()Z

    move-result v6

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v4 .. v9}, Ljk1/d;-><init>(Lik1/h;ZLc51/s;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v4

    :cond_2
    instance-of v3, v2, Lcom/whoop/healthspan/domain/HealthspanDomainResult$a;

    if-eqz v3, :cond_3

    new-instance v4, Ljk1/d;

    sget-object v5, Lik1/h$a;->b:Lik1/h$a;

    invoke-virtual {v1}, Ljk1/d;->a()Z

    move-result v6

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v4 .. v9}, Ljk1/d;-><init>(Lik1/h;ZLc51/s;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v4

    :cond_3
    instance-of v3, v2, Lcom/whoop/healthspan/domain/HealthspanDomainResult$b;

    if-eqz v3, :cond_5

    invoke-virtual {v1}, Ljk1/d;->b()Lik1/h;

    move-result-object v2

    instance-of v3, v2, Lik1/h$c;

    if-eqz v3, :cond_4

    new-instance v4, Ljk1/d;

    move-object v5, v2

    check-cast v5, Lik1/h$c;

    const/16 v11, 0x17

    const/4 v12, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x1

    const/4 v10, 0x0

    invoke-static/range {v5 .. v12}, Lik1/h$c;->c(Lik1/h$c;Lik1/i;Lik1/d;Lcom/whoop/healthspan/domain/models/LockedContentViewState;ZLep0/j;ILjava/lang/Object;)Lik1/h$c;

    move-result-object v5

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v6, 0x1

    invoke-direct/range {v4 .. v9}, Ljk1/d;-><init>(Lik1/h;ZLc51/s;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v4

    :cond_4
    new-instance v5, Ljk1/d;

    invoke-virtual {v1}, Ljk1/d;->b()Lik1/h;

    move-result-object v6

    const/4 v9, 0x4

    const/4 v10, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x0

    invoke-direct/range {v5 .. v10}, Ljk1/d;-><init>(Lik1/h;ZLc51/s;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v5

    :cond_5
    instance-of v3, v2, Lcom/whoop/healthspan/domain/HealthspanDomainResult$OnboardingStepCompleted;

    if-eqz v3, :cond_d

    invoke-virtual {v1}, Ljk1/d;->b()Lik1/h;

    move-result-object v3

    instance-of v4, v3, Lik1/h$c;

    if-eqz v4, :cond_c

    move-object v5, v3

    check-cast v5, Lik1/h$c;

    invoke-virtual {v5}, Lik1/h$c;->d()Lik1/d;

    move-result-object v3

    const/4 v4, 0x0

    if-eqz v3, :cond_6

    invoke-virtual {v3}, Lik1/d;->e()Lik1/c;

    move-result-object v3

    if-eqz v3, :cond_6

    invoke-virtual {v3}, Lik1/c;->e()Ljava/util/List;

    move-result-object v3

    if-eqz v3, :cond_6

    move-object v6, v2

    check-cast v6, Lcom/whoop/healthspan/domain/HealthspanDomainResult$OnboardingStepCompleted;

    invoke-virtual {v6}, Lcom/whoop/healthspan/domain/HealthspanDomainResult$OnboardingStepCompleted;->getStep()I

    move-result v6

    invoke-static {v6, v3}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lik1/b;

    goto :goto_0

    :cond_6
    move-object v3, v4

    :goto_0
    if-eqz v3, :cond_a

    check-cast v2, Lcom/whoop/healthspan/domain/HealthspanDomainResult$OnboardingStepCompleted;

    invoke-virtual {v2}, Lcom/whoop/healthspan/domain/HealthspanDomainResult$OnboardingStepCompleted;->getStep()I

    move-result v6

    add-int/lit8 v6, v6, 0x1

    invoke-virtual {v5}, Lik1/h$c;->d()Lik1/d;

    move-result-object v7

    invoke-virtual {v7}, Lik1/d;->e()Lik1/c;

    move-result-object v7

    invoke-virtual {v7}, Lik1/c;->e()Ljava/util/List;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v7

    if-ge v6, v7, :cond_9

    invoke-virtual {v3}, Lik1/b;->b()Z

    move-result v3

    if-eqz v3, :cond_8

    iget-object v3, v0, Ljk1/c$d;->z:Ljk1/c;

    invoke-virtual {v3}, Ljk1/c;->m()Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer;

    move-result-object v3

    iget-object v6, v0, Ljk1/c$d;->z:Ljk1/c;

    invoke-virtual {v6}, Ljk1/c;->m()Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer;

    move-result-object v6

    invoke-virtual {v5}, Lik1/h$c;->d()Lik1/d;

    move-result-object v7

    invoke-virtual {v7}, Lik1/d;->c()Lc51/s;

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer;->toWhoopAgeAmoeba(Lc51/s;)Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;

    move-result-object v6

    invoke-virtual {v5}, Lik1/h$c;->d()Lik1/d;

    move-result-object v7

    invoke-virtual {v7}, Lik1/d;->e()Lik1/c;

    move-result-object v7

    if-eqz v7, :cond_7

    invoke-virtual {v7}, Lik1/c;->c()Lc51/s;

    move-result-object v7

    if-eqz v7, :cond_7

    iget-object v4, v0, Ljk1/c$d;->z:Ljk1/c;

    invoke-virtual {v4}, Ljk1/c;->m()Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer;

    move-result-object v4

    invoke-virtual {v4, v7}, Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer;->toWhoopAgeAmoeba(Lc51/s;)Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;

    move-result-object v4

    :cond_7
    sget-object v7, Lc51/p;->FADE_IN:Lc51/p;

    new-instance v8, Lcom/whoop/design/models/items/amoeba/AmoebaDomainResult$Result;

    const/4 v9, 0x0

    invoke-direct {v8, v6, v7, v4, v9}, Lcom/whoop/design/models/items/amoeba/AmoebaDomainResult$Result;-><init>(Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;Lc51/p;Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;Z)V

    invoke-virtual {v3, v8}, Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer;->reduce(Lcom/whoop/design/models/items/amoeba/AmoebaDomainResult;)Lc51/s;

    move-result-object v3

    :goto_1
    move-object v7, v3

    goto :goto_2

    :cond_8
    invoke-virtual {v5}, Lik1/h$c;->d()Lik1/d;

    move-result-object v3

    invoke-virtual {v3}, Lik1/d;->e()Lik1/c;

    move-result-object v3

    invoke-virtual {v3}, Lik1/c;->c()Lc51/s;

    move-result-object v3

    goto :goto_1

    :goto_2
    invoke-virtual {v5}, Lik1/h$c;->d()Lik1/d;

    move-result-object v3

    invoke-virtual {v3}, Lik1/d;->e()Lik1/c;

    move-result-object v6

    invoke-virtual {v2}, Lcom/whoop/healthspan/domain/HealthspanDomainResult$OnboardingStepCompleted;->getStep()I

    move-result v3

    add-int/lit8 v8, v3, 0x1

    const/4 v10, 0x4

    const/4 v11, 0x0

    const/4 v9, 0x0

    invoke-static/range {v6 .. v11}, Lik1/c;->b(Lik1/c;Lc51/s;ILjava/util/List;ILjava/lang/Object;)Lik1/c;

    move-result-object v4

    :cond_9
    move-object v15, v4

    new-instance v3, Ljk1/d;

    invoke-virtual {v5}, Lik1/h$c;->d()Lik1/d;

    move-result-object v6

    iget-object v4, v0, Ljk1/c$d;->z:Ljk1/c;

    invoke-virtual {v5}, Lik1/h$c;->d()Lik1/d;

    move-result-object v7

    invoke-static {v4, v7, v2}, Ljk1/c;->c(Ljk1/c;Lik1/d;Lcom/whoop/healthspan/domain/HealthspanDomainResult$OnboardingStepCompleted;)Ljava/util/List;

    move-result-object v11

    const/16 v17, 0x2ef

    const/16 v18, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    invoke-static/range {v6 .. v18}, Lik1/d;->b(Lik1/d;Lcom/whoop/design/models/items/DateSelectorModel;ZLc51/s;Lik1/a;Ljava/util/List;Ljava/util/List;ZZLik1/c;ZILjava/lang/Object;)Lik1/d;

    move-result-object v7

    const/16 v11, 0x1d

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v5 .. v12}, Lik1/h$c;->c(Lik1/h$c;Lik1/i;Lik1/d;Lcom/whoop/healthspan/domain/models/LockedContentViewState;ZLep0/j;ILjava/lang/Object;)Lik1/h$c;

    move-result-object v7

    invoke-virtual {v1}, Ljk1/d;->a()Z

    move-result v8

    const/4 v10, 0x4

    const/4 v11, 0x0

    const/4 v9, 0x0

    move-object v6, v3

    invoke-direct/range {v6 .. v11}, Ljk1/d;-><init>(Lik1/h;ZLc51/s;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v6

    :cond_a
    invoke-virtual {v1}, Ljk1/d;->b()Lik1/h;

    move-result-object v3

    instance-of v3, v3, Lik1/h$c;

    if-eqz v3, :cond_c

    new-instance v5, Ljk1/d;

    invoke-virtual {v1}, Ljk1/d;->b()Lik1/h;

    move-result-object v3

    move-object v6, v3

    check-cast v6, Lik1/h$c;

    invoke-virtual {v1}, Ljk1/d;->b()Lik1/h;

    move-result-object v3

    check-cast v3, Lik1/h$c;

    invoke-virtual {v3}, Lik1/h$c;->d()Lik1/d;

    move-result-object v7

    if-eqz v7, :cond_b

    iget-object v3, v0, Ljk1/c$d;->z:Ljk1/c;

    invoke-virtual {v1}, Ljk1/d;->b()Lik1/h;

    move-result-object v4

    check-cast v4, Lik1/h$c;

    invoke-virtual {v4}, Lik1/h$c;->d()Lik1/d;

    move-result-object v4

    check-cast v2, Lcom/whoop/healthspan/domain/HealthspanDomainResult$OnboardingStepCompleted;

    invoke-static {v3, v4, v2}, Ljk1/c;->c(Ljk1/c;Lik1/d;Lcom/whoop/healthspan/domain/HealthspanDomainResult$OnboardingStepCompleted;)Ljava/util/List;

    move-result-object v12

    const/16 v18, 0x3ef

    const/16 v19, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v7 .. v19}, Lik1/d;->b(Lik1/d;Lcom/whoop/design/models/items/DateSelectorModel;ZLc51/s;Lik1/a;Ljava/util/List;Ljava/util/List;ZZLik1/c;ZILjava/lang/Object;)Lik1/d;

    move-result-object v4

    :cond_b
    move-object v8, v4

    const/16 v12, 0x1d

    const/4 v13, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v6 .. v13}, Lik1/h$c;->c(Lik1/h$c;Lik1/i;Lik1/d;Lcom/whoop/healthspan/domain/models/LockedContentViewState;ZLep0/j;ILjava/lang/Object;)Lik1/h$c;

    move-result-object v6

    invoke-virtual {v1}, Ljk1/d;->a()Z

    move-result v7

    const/4 v9, 0x4

    const/4 v10, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v5 .. v10}, Ljk1/d;-><init>(Lik1/h;ZLc51/s;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v5

    :cond_c
    return-object v1

    :cond_d
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_e
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
