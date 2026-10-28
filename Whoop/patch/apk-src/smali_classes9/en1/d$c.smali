.class final Len1/d$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Len1/d;->interact(Lec3/l;)Lec3/l;
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
        "Len1/c;",
        "currentState",
        "Len1/b;",
        "domainAction",
        "<anonymous>",
        "(Len1/c;Len1/b;)Len1/c;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.homecustomization.domain.legacy.HomeCustomizationInteractor$interact$1"
    f = "HomeCustomizationInteractor.kt"
    l = {
        0x29,
        0x5a
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Len1/d;

.field w:Ljava/lang/Object;

.field x:I

.field synthetic y:Ljava/lang/Object;

.field synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Len1/d;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Len1/d;",
            "Lq83/d<",
            "-",
            "Len1/d$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Len1/d$c;->E:Len1/d;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Len1/c;Len1/b;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Len1/c;",
            "Len1/b;",
            "Lq83/d<",
            "-",
            "Len1/c;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Len1/d$c;

    iget-object v1, p0, Len1/d$c;->E:Len1/d;

    invoke-direct {v0, v1, p3}, Len1/d$c;-><init>(Len1/d;Lq83/d;)V

    iput-object p1, v0, Len1/d$c;->y:Ljava/lang/Object;

    iput-object p2, v0, Len1/d$c;->z:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Len1/d$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Len1/c;

    check-cast p2, Len1/b;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Len1/d$c;->f(Len1/c;Len1/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    move-object/from16 v0, p0

    iget-object v1, v0, Len1/d$c;->y:Ljava/lang/Object;

    check-cast v1, Len1/c;

    iget-object v2, v0, Len1/d$c;->z:Ljava/lang/Object;

    check-cast v2, Len1/b;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v0, Len1/d$c;->x:I

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eqz v4, :cond_2

    if-eq v4, v6, :cond_1

    if-ne v4, v5, :cond_0

    iget-object v1, v0, Len1/d$c;->w:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v1, p1

    goto/16 :goto_6

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v1, p1

    goto :goto_0

    :cond_2
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of v4, v2, Len1/b$b;

    const/4 v7, 0x0

    if-eqz v4, :cond_4

    iget-object v1, v0, Len1/d$c;->E:Len1/d;

    check-cast v2, Len1/b$b;

    invoke-virtual {v2}, Len1/b$b;->a()Z

    move-result v2

    iput-object v7, v0, Len1/d$c;->y:Ljava/lang/Object;

    iput-object v7, v0, Len1/d$c;->z:Ljava/lang/Object;

    iput v6, v0, Len1/d$c;->x:I

    invoke-static {v1, v2, v0}, Len1/d;->d(Len1/d;ZLq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_3

    goto/16 :goto_5

    :cond_3
    :goto_0
    check-cast v1, Len1/c;

    return-object v1

    :cond_4
    instance-of v4, v2, Len1/b$g;

    if-eqz v4, :cond_5

    instance-of v3, v1, Len1/c$c;

    if-eqz v3, :cond_15

    iget-object v3, v0, Len1/d$c;->E:Len1/d;

    check-cast v1, Len1/c$c;

    check-cast v2, Len1/b$g;

    invoke-virtual {v2}, Len1/b$g;->a()I

    move-result v4

    invoke-virtual {v2}, Len1/b$g;->b()I

    move-result v2

    invoke-static {v3, v1, v4, v2}, Len1/d;->g(Len1/d;Len1/c$c;II)Len1/c;

    move-result-object v1

    return-object v1

    :cond_5
    instance-of v4, v2, Len1/b$a;

    if-eqz v4, :cond_6

    instance-of v3, v1, Len1/c$c;

    if-eqz v3, :cond_15

    iget-object v3, v0, Len1/d$c;->E:Len1/d;

    check-cast v1, Len1/c$c;

    check-cast v2, Len1/b$a;

    invoke-virtual {v2}, Len1/b$a;->a()I

    move-result v2

    invoke-static {v3, v1, v2}, Len1/d;->c(Len1/d;Len1/c$c;I)Len1/c;

    move-result-object v1

    return-object v1

    :cond_6
    instance-of v4, v2, Len1/b$f;

    if-eqz v4, :cond_b

    instance-of v3, v1, Len1/c$c;

    if-eqz v3, :cond_15

    move-object v8, v1

    check-cast v8, Len1/c$c;

    invoke-virtual {v8}, Len1/c$c;->i()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lcom/whoop/homecustomization/domain/legacy/models/CustomizeableKeyStatModel;

    invoke-virtual {v4}, Lcom/whoop/homecustomization/domain/legacy/models/CustomizeableKeyStatModel;->getToggledOn()Z

    move-result v4

    if-eqz v4, :cond_7

    move-object v7, v3

    :cond_8
    check-cast v7, Lcom/whoop/homecustomization/domain/legacy/models/CustomizeableKeyStatModel;

    invoke-virtual {v8}, Len1/c$c;->c()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-gt v1, v5, :cond_a

    invoke-virtual {v8}, Len1/c$c;->c()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ne v1, v5, :cond_9

    if-eqz v7, :cond_9

    goto :goto_1

    :cond_9
    const/16 v19, 0x2ff

    const/16 v20, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x1

    const/16 v18, 0x0

    invoke-static/range {v8 .. v20}, Len1/c$c;->b(Len1/c$c;Len1/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZZILjava/lang/Object;)Len1/c$c;

    move-result-object v1

    return-object v1

    :cond_a
    :goto_1
    iget-object v1, v0, Len1/d$c;->E:Len1/d;

    check-cast v2, Len1/b$f;

    invoke-virtual {v2}, Len1/b$f;->a()I

    move-result v2

    invoke-static {v1, v8, v2}, Len1/d;->f(Len1/d;Len1/c$c;I)Len1/c;

    move-result-object v1

    return-object v1

    :cond_b
    instance-of v4, v2, Len1/b$d;

    if-eqz v4, :cond_e

    instance-of v3, v1, Len1/c$c;

    if-eqz v3, :cond_15

    check-cast v2, Len1/b$d;

    invoke-virtual {v2}, Len1/b$d;->b()Z

    move-result v3

    if-eqz v3, :cond_c

    iget-object v3, v0, Len1/d$c;->E:Len1/d;

    check-cast v1, Len1/c$c;

    invoke-virtual {v2}, Len1/b$d;->a()I

    move-result v2

    invoke-static {v3, v1, v2, v6}, Len1/d;->i(Len1/d;Len1/c$c;IZ)Len1/c;

    move-result-object v1

    return-object v1

    :cond_c
    check-cast v1, Len1/c$c;

    invoke-virtual {v1}, Len1/c$c;->c()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-le v3, v6, :cond_d

    iget-object v3, v0, Len1/d$c;->E:Len1/d;

    invoke-virtual {v2}, Len1/b$d;->a()I

    move-result v2

    const/4 v4, 0x0

    invoke-static {v3, v1, v2, v4}, Len1/d;->i(Len1/d;Len1/c$c;IZ)Len1/c;

    move-result-object v1

    return-object v1

    :cond_d
    const/16 v13, 0x2ff

    const/4 v14, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x1

    const/4 v12, 0x0

    move-object v2, v1

    invoke-static/range {v2 .. v14}, Len1/c$c;->b(Len1/c$c;Len1/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZZILjava/lang/Object;)Len1/c$c;

    move-result-object v1

    return-object v1

    :cond_e
    sget-object v4, Len1/b$c;->a:Len1/b$c;

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_14

    instance-of v2, v1, Len1/c$c;

    if-eqz v2, :cond_15

    check-cast v1, Len1/c$c;

    invoke-virtual {v1}, Len1/c$c;->i()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_f
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_10

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v8, v6

    check-cast v8, Lcom/whoop/homecustomization/domain/legacy/models/CustomizeableKeyStatModel;

    invoke-virtual {v8}, Lcom/whoop/homecustomization/domain/legacy/models/CustomizeableKeyStatModel;->getToggledOn()Z

    move-result v8

    if-eqz v8, :cond_f

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_10
    new-instance v2, Ljava/util/ArrayList;

    const/16 v6, 0xa

    invoke-static {v4, v6}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-direct {v2, v8}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_11

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/whoop/homecustomization/domain/legacy/models/CustomizeableKeyStatModel;

    invoke-virtual {v8}, Lcom/whoop/homecustomization/domain/legacy/models/CustomizeableKeyStatModel;->getSupportedTrendKey()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_11
    invoke-static {v2}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v1}, Len1/c$c;->c()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-static {v1, v6}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_12

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/homecustomization/domain/legacy/models/CustomizeableKeyStatModel;

    invoke-virtual {v6}, Lcom/whoop/homecustomization/domain/legacy/models/CustomizeableKeyStatModel;->getSupportedTrendKey()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_12
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v1, v0, Len1/d$c;->E:Len1/d;

    iput-object v7, v0, Len1/d$c;->y:Ljava/lang/Object;

    iput-object v7, v0, Len1/d$c;->z:Ljava/lang/Object;

    iput-object v7, v0, Len1/d$c;->w:Ljava/lang/Object;

    iput v5, v0, Len1/d$c;->x:I

    invoke-static {v1, v2, v0}, Len1/d;->h(Len1/d;Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_13

    :goto_5
    return-object v3

    :cond_13
    :goto_6
    check-cast v1, Len1/c;

    return-object v1

    :cond_14
    sget-object v3, Len1/b$e;->a:Len1/b$e;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_16

    instance-of v2, v1, Len1/c$c;

    if-eqz v2, :cond_15

    move-object v3, v1

    check-cast v3, Len1/c$c;

    const/16 v14, 0x1ff

    const/4 v15, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x1

    invoke-static/range {v3 .. v15}, Len1/c$c;->b(Len1/c$c;Len1/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZZILjava/lang/Object;)Len1/c$c;

    move-result-object v1

    :cond_15
    return-object v1

    :cond_16
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method
