.class final Lqx0/i$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqx0/i;->o()V
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
    c = "com.whoop.debug.experiments.ExperimentsDebugViewModel$fetchExperiments$1"
    f = "ExperimentsDebugViewModel.kt"
    l = {
        0x30
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:Ljava/lang/Object;

.field G:Ljava/lang/Object;

.field H:Ljava/lang/Object;

.field I:I

.field J:I

.field K:I

.field L:I

.field final synthetic M:Lqx0/i;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lqx0/i;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lqx0/i;",
            "Lq83/d<",
            "-",
            "Lqx0/i$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lqx0/i$a;->M:Lqx0/i;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 1
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

    new-instance p1, Lqx0/i$a;

    iget-object v0, p0, Lqx0/i$a;->M:Lqx0/i;

    invoke-direct {p1, v0, p2}, Lqx0/i$a;-><init>(Lqx0/i;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lqx0/i$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lqx0/i$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lqx0/i$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lqx0/i$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v6, p0

    sget-object v9, Lr83/a;->w:Lr83/a;

    iget v0, v6, Lqx0/i$a;->L:I

    const/4 v10, 0x1

    const/4 v11, 0x0

    if-eqz v0, :cond_1

    if-ne v0, v10, :cond_0

    iget v0, v6, Lqx0/i$a;->J:I

    iget v1, v6, Lqx0/i$a;->I:I

    iget-object v2, v6, Lqx0/i$a;->H:Ljava/lang/Object;

    check-cast v2, Ljava/util/Collection;

    iget-object v3, v6, Lqx0/i$a;->G:Ljava/lang/Object;

    check-cast v3, Lhf1/a;

    iget-object v4, v6, Lqx0/i$a;->E:Ljava/lang/Object;

    check-cast v4, Ljava/util/Iterator;

    iget-object v5, v6, Lqx0/i$a;->z:Ljava/lang/Object;

    check-cast v5, Ljava/util/Collection;

    iget-object v7, v6, Lqx0/i$a;->y:Ljava/lang/Object;

    check-cast v7, Ljava/lang/Iterable;

    iget-object v7, v6, Lqx0/i$a;->x:Ljava/lang/Object;

    check-cast v7, Lqx0/i;

    iget-object v8, v6, Lqx0/i$a;->w:Ljava/lang/Object;

    check-cast v8, Ljava/lang/Iterable;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move v12, v0

    move v13, v1

    move-object v15, v4

    move-object v14, v5

    move-object/from16 v16, v7

    move-object/from16 v0, p1

    goto/16 :goto_1

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v6, Lqx0/i$a;->M:Lqx0/i;

    invoke-static {v0}, Lqx0/i;->l(Lqx0/i;)Lec3/p1;

    move-result-object v0

    sget-object v1, Lqx0/h$b;->a:Lqx0/h$b;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0, v1}, Lec3/h2;->j(Ljava/lang/Object;)V

    iget-object v0, v6, Lqx0/i$a;->M:Lqx0/i;

    invoke-static {v0}, Lqx0/i;->g(Lqx0/i;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    iget-object v1, v6, Lqx0/i$a;->M:Lqx0/i;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v0, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move-object v15, v0

    move-object v0, v1

    move-object v14, v2

    move v12, v11

    move v13, v12

    :goto_0
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lhf1/a;

    invoke-static {v0}, Lqx0/i;->j(Lqx0/i;)Lhf1/b;

    move-result-object v3

    invoke-interface {v1}, Lhf1/a;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v4}, Lqx0/i;->n(Lqx0/i;Ljava/lang/String;)Z

    move-result v4

    iput-object v2, v6, Lqx0/i$a;->w:Ljava/lang/Object;

    iput-object v0, v6, Lqx0/i$a;->x:Ljava/lang/Object;

    iput-object v2, v6, Lqx0/i$a;->y:Ljava/lang/Object;

    iput-object v14, v6, Lqx0/i$a;->z:Ljava/lang/Object;

    iput-object v15, v6, Lqx0/i$a;->E:Ljava/lang/Object;

    iput-object v2, v6, Lqx0/i$a;->F:Ljava/lang/Object;

    iput-object v1, v6, Lqx0/i$a;->G:Ljava/lang/Object;

    iput-object v14, v6, Lqx0/i$a;->H:Ljava/lang/Object;

    iput v13, v6, Lqx0/i$a;->I:I

    iput v12, v6, Lqx0/i$a;->J:I

    iput v11, v6, Lqx0/i$a;->K:I

    iput v10, v6, Lqx0/i$a;->L:I

    move-object v5, v0

    move-object v0, v3

    const-wide/16 v2, 0x0

    move-object v7, v5

    const/4 v5, 0x0

    move-object v8, v7

    const/16 v7, 0xa

    move-object/from16 v16, v8

    const/4 v8, 0x0

    invoke-static/range {v0 .. v8}, Lhf1/b;->d(Lhf1/b;Lhf1/a;JZZLq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_2

    return-object v9

    :cond_2
    move-object v3, v1

    move-object v2, v14

    :goto_1
    check-cast v0, Ljava/lang/String;

    new-instance v1, Lqx0/c;

    invoke-direct {v1, v3, v0}, Lqx0/c;-><init>(Lhf1/a;Ljava/lang/String;)V

    invoke-interface {v2, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v0, v16

    goto :goto_0

    :cond_3
    check-cast v14, Ljava/util/List;

    iget-object v0, v6, Lqx0/i$a;->M:Lqx0/i;

    invoke-static {v0}, Lqx0/i;->l(Lqx0/i;)Lec3/p1;

    move-result-object v0

    new-instance v1, Lqx0/h$c;

    invoke-direct {v1, v14}, Lqx0/h$c;-><init>(Ljava/util/List;)V

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0, v2, v1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
