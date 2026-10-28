.class public final Lf70/i0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0001\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J/\u0010\u000c\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJD\u0010\u0014\u001a\u00020\u00132\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u001c\u0010\u0012\u001a\u0018\u0008\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00060\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0010H\u0086@\u00a2\u0006\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lf70/i0;",
        "",
        "<init>",
        "()V",
        "Lf70/e$b;",
        "prevDomainResult",
        "Lf70/e;",
        "fetchResult",
        "Lf70/q0;",
        "memberInfoAfterEmailCheck",
        "Lcom/whoop/activation/iajf/domain/SignUpSource;",
        "signUpSource",
        "b",
        "(Lf70/e$b;Lf70/e;Lf70/q0;Lcom/whoop/activation/iajf/domain/SignUpSource;)Lf70/e$b;",
        "Lec3/m;",
        "collector",
        "Lkotlin/Function1;",
        "Lq83/d;",
        "fetch",
        "Lf70/f;",
        "a",
        "(Lec3/m;Lf70/e$b;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;",
        "activation_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lec3/m;Lf70/e$b;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;
    .locals 30
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Lf70/e$b;",
            "Lkotlin/jvm/functions/Function1;",
            "Lq83/d<",
            "-",
            "Lf70/f;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p4

    instance-of v1, v0, Lf70/i0$a;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lf70/i0$a;

    iget v2, v1, Lf70/i0$a;->F:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lf70/i0$a;->F:I

    move-object/from16 v2, p0

    goto :goto_0

    :cond_0
    new-instance v1, Lf70/i0$a;

    move-object/from16 v2, p0

    invoke-direct {v1, v2, v0}, Lf70/i0$a;-><init>(Lf70/i0;Lq83/d;)V

    :goto_0
    iget-object v0, v1, Lf70/i0$a;->z:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v1, Lf70/i0$a;->F:I

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v4, :cond_3

    if-eq v4, v6, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v3, v1, Lf70/i0$a;->y:Ljava/lang/Object;

    check-cast v3, Lkotlin/jvm/functions/Function1;

    iget-object v3, v1, Lf70/i0$a;->x:Ljava/lang/Object;

    check-cast v3, Lf70/e$b;

    iget-object v1, v1, Lf70/i0$a;->w:Ljava/lang/Object;

    check-cast v1, Lec3/m;

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v8, v3

    goto :goto_3

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v4, v1, Lf70/i0$a;->y:Ljava/lang/Object;

    check-cast v4, Lkotlin/jvm/functions/Function1;

    iget-object v8, v1, Lf70/i0$a;->x:Ljava/lang/Object;

    check-cast v8, Lf70/e$b;

    iget-object v9, v1, Lf70/i0$a;->w:Ljava/lang/Object;

    check-cast v9, Lec3/m;

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v15, Lf70/b0;->LOADING:Lf70/b0;

    sget-object v24, Lcom/whoop/activation/iajf/domain/SignUpSource;->IAJF_V2:Lcom/whoop/activation/iajf/domain/SignUpSource;

    const v28, 0x1dfef

    const/16 v29, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    move-object/from16 v10, p2

    invoke-static/range {v10 .. v29}, Lf70/e$b;->b(Lf70/e$b;Ljava/util/List;Ln70/e;Ljava/util/List;Lf70/q0;Lf70/b0;ZLf70/n0;ZLcom/whoop/domain/model/AuthMaterial;ZZLcom/whoop/activation/domain/interactors/activation/SubscriptionError;Ljava/util/Map;Lcom/whoop/activation/iajf/domain/SignUpSource;Ljava/util/List;Lf70/u0;Lcom/whoop/navigation/e;ILjava/lang/Object;)Lf70/e$b;

    move-result-object v0

    iput-object v7, v1, Lf70/i0$a;->w:Ljava/lang/Object;

    iput-object v10, v1, Lf70/i0$a;->x:Ljava/lang/Object;

    move-object/from16 v4, p3

    iput-object v4, v1, Lf70/i0$a;->y:Ljava/lang/Object;

    iput v6, v1, Lf70/i0$a;->F:I

    move-object/from16 v8, p1

    invoke-interface {v8, v0, v1}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_4

    goto :goto_2

    :cond_4
    move-object v8, v10

    :goto_1
    new-instance v0, Lf70/i0$b;

    invoke-direct {v0, v4, v7}, Lf70/i0$b;-><init>(Lkotlin/jvm/functions/Function1;Lq83/d;)V

    iput-object v7, v1, Lf70/i0$a;->w:Ljava/lang/Object;

    iput-object v8, v1, Lf70/i0$a;->x:Ljava/lang/Object;

    iput-object v7, v1, Lf70/i0$a;->y:Ljava/lang/Object;

    iput v5, v1, Lf70/i0$a;->F:I

    const-wide/16 v4, 0x3e8

    invoke-static {v4, v5, v0, v1}, Lor2/p0;->a(JLc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_5

    :goto_2
    return-object v3

    :cond_5
    :goto_3
    check-cast v0, Lf70/e;

    instance-of v1, v0, Lf70/e$b;

    if-eqz v1, :cond_6

    check-cast v0, Lf70/e$b;

    move-object v9, v0

    goto :goto_4

    :cond_6
    move-object v9, v7

    :goto_4
    if-eqz v9, :cond_7

    invoke-virtual {v9}, Lf70/e$b;->m()Ljava/util/List;

    move-result-object v0

    goto :goto_5

    :cond_7
    move-object v0, v7

    :goto_5
    sget-object v1, Lm83/y;->w:Lm83/y;

    if-nez v0, :cond_8

    move-object v0, v1

    :cond_8
    const/4 v3, 0x0

    if-eqz v9, :cond_13

    invoke-virtual {v9}, Lf70/e$b;->f()Lf70/b0;

    move-result-object v4

    sget-object v5, Lf70/b0;->ERROR:Lf70/b0;

    if-eq v4, v5, :cond_13

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_9

    goto/16 :goto_9

    :cond_9
    invoke-virtual {v8}, Lf70/e$b;->m()Ljava/util/List;

    move-result-object v4

    if-nez v4, :cond_a

    goto :goto_6

    :cond_a
    move-object v1, v4

    :goto_6
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v4

    invoke-interface {v1, v4}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v4

    :cond_b
    invoke-interface {v4}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v5

    if-eqz v5, :cond_d

    invoke-interface {v4}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/whoop/activation/domain/models/ActivationFlowStepModel;

    instance-of v10, v5, Lcom/whoop/activation/domain/models/steps/CountrySelectionStepModel;

    if-nez v10, :cond_c

    instance-of v5, v5, Lcom/whoop/activation/domain/models/steps/StateSelectionStepModel;

    if-eqz v5, :cond_b

    :cond_c
    invoke-interface {v4}, Ljava/util/ListIterator;->nextIndex()I

    move-result v4

    goto :goto_7

    :cond_d
    const/4 v4, -0x1

    :goto_7
    if-ltz v4, :cond_e

    add-int/2addr v4, v6

    invoke-interface {v1, v3, v4}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v1

    :cond_e
    move-object v4, v1

    check-cast v4, Ljava/util/Collection;

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v4, v0}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v10

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    invoke-static {v10}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v1

    if-le v0, v1, :cond_f

    move v12, v1

    goto :goto_8

    :cond_f
    move v12, v0

    :goto_8
    invoke-virtual {v8}, Lf70/e$b;->h()Lf70/q0;

    move-result-object v0

    invoke-virtual {v9}, Lf70/e$b;->d()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_11

    move-object v4, v1

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_10

    move-object v7, v1

    :cond_10
    if-nez v7, :cond_12

    :cond_11
    invoke-virtual {v8}, Lf70/e$b;->d()Ljava/util/List;

    move-result-object v7

    :cond_12
    invoke-virtual {v8}, Lf70/e$b;->e()Ljava/util/Map;

    move-result-object v22

    invoke-virtual {v9}, Lf70/e$b;->l()Ln70/e;

    move-result-object v11

    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v13

    invoke-virtual {v8}, Lf70/e$b;->l()Ln70/e;

    move-result-object v1

    invoke-virtual {v1}, Ln70/e;->f()I

    move-result v14

    invoke-virtual {v8}, Lf70/e$b;->l()Ln70/e;

    move-result-object v1

    invoke-virtual {v1}, Ln70/e;->c()Lcom/whoop/activation/view/navigation/ActivationFlowDestination;

    move-result-object v15

    const/16 v17, 0x10

    const/16 v18, 0x0

    const/16 v16, 0x0

    invoke-static/range {v11 .. v18}, Ln70/e;->b(Ln70/e;IIILcom/whoop/activation/view/navigation/ActivationFlowDestination;Ln70/d;ILjava/lang/Object;)Ln70/e;

    move-result-object v11

    sget-object v14, Lf70/b0;->CONTENT:Lf70/b0;

    sget-object v23, Lcom/whoop/activation/iajf/domain/SignUpSource;->IAJF_V2:Lcom/whoop/activation/iajf/domain/SignUpSource;

    const v27, 0x1cfe0

    const/16 v28, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    move-object v13, v0

    move-object v12, v7

    invoke-static/range {v9 .. v28}, Lf70/e$b;->b(Lf70/e$b;Ljava/util/List;Ln70/e;Ljava/util/List;Lf70/q0;Lf70/b0;ZLf70/n0;ZLcom/whoop/domain/model/AuthMaterial;ZZLcom/whoop/activation/domain/interactors/activation/SubscriptionError;Ljava/util/Map;Lcom/whoop/activation/iajf/domain/SignUpSource;Ljava/util/List;Lf70/u0;Lcom/whoop/navigation/e;ILjava/lang/Object;)Lf70/e$b;

    move-result-object v0

    new-instance v1, Lf70/f;

    invoke-direct {v1, v0, v3}, Lf70/f;-><init>(Lf70/e$b;Z)V

    return-object v1

    :cond_13
    :goto_9
    new-instance v0, Lf70/f;

    sget-object v13, Lf70/b0;->ERROR:Lf70/b0;

    sget-object v22, Lcom/whoop/activation/iajf/domain/SignUpSource;->IAJF_V2:Lcom/whoop/activation/iajf/domain/SignUpSource;

    const v26, 0x1dfef

    const/16 v27, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    invoke-static/range {v8 .. v27}, Lf70/e$b;->b(Lf70/e$b;Ljava/util/List;Ln70/e;Ljava/util/List;Lf70/q0;Lf70/b0;ZLf70/n0;ZLcom/whoop/domain/model/AuthMaterial;ZZLcom/whoop/activation/domain/interactors/activation/SubscriptionError;Ljava/util/Map;Lcom/whoop/activation/iajf/domain/SignUpSource;Ljava/util/List;Lf70/u0;Lcom/whoop/navigation/e;ILjava/lang/Object;)Lf70/e$b;

    move-result-object v1

    invoke-direct {v0, v1, v3}, Lf70/f;-><init>(Lf70/e$b;Z)V

    return-object v0
.end method

.method public final b(Lf70/e$b;Lf70/e;Lf70/q0;Lcom/whoop/activation/iajf/domain/SignUpSource;)Lf70/e$b;
    .locals 22

    move-object/from16 v0, p2

    const-string v1, "prevDomainResult"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "fetchResult"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "memberInfoAfterEmailCheck"

    move-object/from16 v6, p3

    invoke-static {v6, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "signUpSource"

    move-object/from16 v3, p4

    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v1, v0, Lf70/e$b;

    const/4 v4, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Lf70/e$b;

    goto :goto_0

    :cond_0
    move-object v0, v4

    :goto_0
    invoke-virtual {v2}, Lf70/e$b;->m()Ljava/util/List;

    move-result-object v1

    sget-object v5, Lm83/y;->w:Lm83/y;

    if-nez v1, :cond_1

    move-object v1, v5

    :cond_1
    check-cast v1, Ljava/util/Collection;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lf70/e$b;->m()Ljava/util/List;

    move-result-object v7

    goto :goto_1

    :cond_2
    move-object v7, v4

    :goto_1
    if-nez v7, :cond_3

    goto :goto_2

    :cond_3
    move-object v5, v7

    :goto_2
    check-cast v5, Ljava/lang/Iterable;

    invoke-static {v1, v5}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_4

    const v20, 0x1dff7

    const/16 v21, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v16, p4

    invoke-static/range {v2 .. v21}, Lf70/e$b;->b(Lf70/e$b;Ljava/util/List;Ln70/e;Ljava/util/List;Lf70/q0;Lf70/b0;ZLf70/n0;ZLcom/whoop/domain/model/AuthMaterial;ZZLcom/whoop/activation/domain/interactors/activation/SubscriptionError;Ljava/util/Map;Lcom/whoop/activation/iajf/domain/SignUpSource;Ljava/util/List;Lf70/u0;Lcom/whoop/navigation/e;ILjava/lang/Object;)Lf70/e$b;

    move-result-object v0

    return-object v0

    :cond_4
    if-eqz v0, :cond_9

    invoke-virtual/range {p1 .. p1}, Lf70/e$b;->l()Ln70/e;

    move-result-object v2

    invoke-virtual {v2}, Ln70/e;->d()I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    invoke-static {v1}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v3

    if-le v2, v3, :cond_5

    move v6, v3

    goto :goto_3

    :cond_5
    move v6, v2

    :goto_3
    invoke-virtual {v0}, Lf70/e$b;->d()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_7

    move-object v3, v2

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_6

    move-object v4, v2

    :cond_6
    if-nez v4, :cond_8

    :cond_7
    invoke-virtual/range {p1 .. p1}, Lf70/e$b;->d()Ljava/util/List;

    move-result-object v4

    :cond_8
    invoke-virtual {v0}, Lf70/e$b;->l()Ln70/e;

    move-result-object v5

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v7

    invoke-virtual/range {p1 .. p1}, Lf70/e$b;->l()Ln70/e;

    move-result-object v2

    invoke-virtual {v2}, Ln70/e;->f()I

    move-result v8

    invoke-virtual/range {p1 .. p1}, Lf70/e$b;->l()Ln70/e;

    move-result-object v2

    invoke-virtual {v2}, Ln70/e;->c()Lcom/whoop/activation/view/navigation/ActivationFlowDestination;

    move-result-object v9

    const/16 v11, 0x10

    const/4 v12, 0x0

    const/4 v10, 0x0

    invoke-static/range {v5 .. v12}, Ln70/e;->b(Ln70/e;IIILcom/whoop/activation/view/navigation/ActivationFlowDestination;Ln70/d;ILjava/lang/Object;)Ln70/e;

    move-result-object v2

    const v20, 0x1dff0

    const/16 v21, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v6, p3

    move-object/from16 v16, p4

    move-object v3, v1

    move-object v5, v4

    move-object v4, v2

    move-object v2, v0

    invoke-static/range {v2 .. v21}, Lf70/e$b;->b(Lf70/e$b;Ljava/util/List;Ln70/e;Ljava/util/List;Lf70/q0;Lf70/b0;ZLf70/n0;ZLcom/whoop/domain/model/AuthMaterial;ZZLcom/whoop/activation/domain/interactors/activation/SubscriptionError;Ljava/util/Map;Lcom/whoop/activation/iajf/domain/SignUpSource;Ljava/util/List;Lf70/u0;Lcom/whoop/navigation/e;ILjava/lang/Object;)Lf70/e$b;

    move-result-object v0

    return-object v0

    :cond_9
    move-object v3, v1

    invoke-virtual/range {p1 .. p1}, Lf70/e$b;->l()Ln70/e;

    move-result-object v4

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v6

    const/16 v10, 0x1d

    const/4 v11, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v4 .. v11}, Ln70/e;->b(Ln70/e;IIILcom/whoop/activation/view/navigation/ActivationFlowDestination;Ln70/d;ILjava/lang/Object;)Ln70/e;

    move-result-object v4

    const v20, 0x1dff4

    const/16 v21, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v2, p1

    move-object/from16 v6, p3

    move-object/from16 v16, p4

    invoke-static/range {v2 .. v21}, Lf70/e$b;->b(Lf70/e$b;Ljava/util/List;Ln70/e;Ljava/util/List;Lf70/q0;Lf70/b0;ZLf70/n0;ZLcom/whoop/domain/model/AuthMaterial;ZZLcom/whoop/activation/domain/interactors/activation/SubscriptionError;Ljava/util/Map;Lcom/whoop/activation/iajf/domain/SignUpSource;Ljava/util/List;Lf70/u0;Lcom/whoop/navigation/e;ILjava/lang/Object;)Lf70/e$b;

    move-result-object v0

    return-object v0
.end method
