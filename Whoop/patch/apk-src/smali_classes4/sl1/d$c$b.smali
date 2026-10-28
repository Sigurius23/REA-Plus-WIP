.class public final Lsl1/d$c$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsl1/d$c;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
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
        "\u0000\u0016\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\u0008\u0000\u0010\u0000\"\u0006\u0008\u0001\u0010\u0001\u0018\u0001*\u0008\u0012\u0004\u0012\u00028\u00000\u00022\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u0003H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "R",
        "T",
        "Lec3/m;",
        "",
        "it",
        "Ll83/a0;",
        "<anonymous>",
        "(Lec3/m;Lkotlin/Array;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.home.domain.connectivity.strap.StrapDomainInteractor$interact$$inlined$combine$1$3"
    f = "StrapDomainInteractor.kt"
    l = {
        0xea
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field private synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lsl1/d;


# direct methods
.method public constructor <init>(Lq83/d;Lsl1/d;)V
    .locals 0

    iput-object p2, p0, Lsl1/d$c$b;->z:Lsl1/d;

    const/4 p2, 0x3

    invoke-direct {p0, p2, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Lec3/m;[Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "[",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lsl1/d$c$b;

    iget-object v1, p0, Lsl1/d$c$b;->z:Lsl1/d;

    invoke-direct {v0, p3, v1}, Lsl1/d$c$b;-><init>(Lq83/d;Lsl1/d;)V

    iput-object p1, v0, Lsl1/d$c$b;->x:Ljava/lang/Object;

    iput-object p2, v0, Lsl1/d$c$b;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lsl1/d$c$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, [Ljava/lang/Object;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lsl1/d$c$b;->invoke(Lec3/m;[Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    move-object/from16 v0, p0

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lsl1/d$c$b;->w:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v1, v0, Lsl1/d$c$b;->y:Ljava/lang/Object;

    check-cast v1, [Ljava/lang/Object;

    iget-object v1, v0, Lsl1/d$c$b;->x:Ljava/lang/Object;

    check-cast v1, Lec3/m;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_e

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v0, Lsl1/d$c$b;->x:Ljava/lang/Object;

    check-cast v2, Lec3/m;

    iget-object v4, v0, Lsl1/d$c$b;->y:Ljava/lang/Object;

    check-cast v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aget-object v6, v4, v5

    aget-object v7, v4, v3

    const/4 v8, 0x2

    aget-object v8, v4, v8

    const/4 v9, 0x3

    aget-object v9, v4, v9

    const/4 v10, 0x4

    aget-object v10, v4, v10

    const/4 v11, 0x5

    aget-object v11, v4, v11

    const/4 v12, 0x6

    aget-object v12, v4, v12

    const/4 v13, 0x7

    aget-object v4, v4, v13

    check-cast v4, Lql1/d;

    check-cast v12, Lgt0/h;

    check-cast v11, Ljk0/a;

    check-cast v10, Los0/b;

    check-cast v9, Lca2/a;

    check-cast v8, Li92/h;

    check-cast v7, Llm0/c;

    check-cast v6, Ltd1/f;

    sget-object v13, Llm0/c;->OFF:Llm0/c;

    if-ne v7, v13, :cond_2

    move v7, v3

    goto :goto_0

    :cond_2
    move v7, v5

    :goto_0
    sget-object v13, Ltd1/f;->PAIR_DEVICE:Ltd1/f;

    if-ne v6, v13, :cond_3

    move v13, v3

    goto :goto_1

    :cond_3
    move v13, v5

    :goto_1
    sget-object v14, Li92/h$b;->a:Li92/h$b;

    invoke-static {v8, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    sget-object v14, Ltd1/f;->CONNECTING:Ltd1/f;

    if-ne v6, v14, :cond_4

    move v14, v3

    goto :goto_2

    :cond_4
    move v14, v5

    :goto_2
    sget-object v15, Ltd1/f;->CONNECTED:Ltd1/f;

    if-ne v6, v15, :cond_5

    move v15, v3

    goto :goto_3

    :cond_5
    move v15, v5

    :goto_3
    sget-object v5, Ltd1/f;->CONNECTION_FAILED:Ltd1/f;

    if-ne v6, v5, :cond_6

    move v5, v3

    goto :goto_4

    :cond_6
    const/4 v5, 0x0

    :goto_4
    invoke-virtual {v9}, Lca2/a;->c()Lca2/c;

    move-result-object v6

    sget-object v3, Lca2/c;->CATCHING_UP:Lca2/c;

    if-ne v6, v3, :cond_7

    const/4 v3, 0x1

    goto :goto_5

    :cond_7
    const/4 v3, 0x0

    :goto_5
    invoke-virtual {v9}, Lca2/a;->c()Lca2/c;

    move-result-object v6

    move/from16 v16, v3

    sget-object v3, Lca2/c;->CAUGHT_UP:Lca2/c;

    if-eq v6, v3, :cond_9

    invoke-virtual {v9}, Lca2/a;->c()Lca2/c;

    move-result-object v3

    sget-object v6, Lca2/c;->STANDBY:Lca2/c;

    if-ne v3, v6, :cond_8

    goto :goto_6

    :cond_8
    const/4 v3, 0x0

    goto :goto_7

    :cond_9
    :goto_6
    const/4 v3, 0x1

    :goto_7
    iget-object v6, v0, Lsl1/d$c$b;->z:Lsl1/d;

    invoke-static {v6}, Lsl1/d;->g(Lsl1/d;)Lor2/b1;

    move-result-object v6

    move/from16 v17, v3

    invoke-virtual {v9}, Lca2/a;->a()Lorg/joda/time/DateTime;

    move-result-object v3

    invoke-virtual {v6, v3}, Lor2/b1;->a(Lorg/joda/time/DateTime;)Ljava/lang/String;

    move-result-object v3

    sget-object v6, Los0/b$c;->a:Los0/b$c;

    invoke-static {v10, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v16, :cond_a

    if-eqz v6, :cond_a

    const/4 v10, 0x1

    goto :goto_8

    :cond_a
    const/4 v10, 0x0

    :goto_8
    if-eqz v17, :cond_b

    if-eqz v6, :cond_b

    const/4 v6, 0x1

    :goto_9
    move-object/from16 v16, v3

    goto :goto_a

    :cond_b
    const/4 v6, 0x0

    goto :goto_9

    :goto_a
    sget-object v3, Ljk0/a;->STRAP_OFF_BODY:Ljk0/a;

    if-ne v11, v3, :cond_c

    const/4 v3, 0x1

    goto :goto_b

    :cond_c
    const/4 v3, 0x0

    :goto_b
    sget-object v11, Lgt0/h;->a:Lgt0/h$a;

    invoke-virtual {v11, v12}, Lgt0/h$a;->d(Lgt0/h;)Z

    move-result v17

    invoke-virtual {v11, v12}, Lgt0/h$a;->e(Lgt0/h;)Z

    move-result v18

    invoke-virtual {v11, v12}, Lgt0/h$a;->a(Lgt0/h;)Z

    move-result v19

    invoke-virtual {v11, v12}, Lgt0/h$a;->c(Lgt0/h;)Z

    move-result v20

    invoke-virtual {v11, v12}, Lgt0/h$a;->f(Lgt0/h;)Z

    move-result v21

    if-eqz v21, :cond_d

    move/from16 v21, v3

    iget-object v3, v0, Lsl1/d$c$b;->z:Lsl1/d;

    invoke-static {v3}, Lsl1/d;->i(Lsl1/d;)Ltd1/b;

    move-result-object v3

    invoke-interface {v3}, Ltd1/b;->b()Lkk0/a;

    move-result-object v3

    invoke-virtual {v3}, Lkk0/a;->h()Z

    move-result v3

    if-nez v3, :cond_e

    iget-object v3, v0, Lsl1/d$c$b;->z:Lsl1/d;

    invoke-static {v3}, Lsl1/d;->i(Lsl1/d;)Ltd1/b;

    move-result-object v3

    invoke-interface {v3}, Ltd1/b;->A()Ltd1/e;

    move-result-object v3

    invoke-virtual {v3}, Ltd1/e;->isReady()Z

    move-result v3

    if-eqz v3, :cond_e

    const/4 v3, 0x1

    goto :goto_c

    :cond_d
    move/from16 v21, v3

    :cond_e
    const/4 v3, 0x0

    :goto_c
    invoke-virtual {v11, v12}, Lgt0/h$a;->b(Lgt0/h;)Z

    move-result v11

    iget-object v12, v0, Lsl1/d$c$b;->z:Lsl1/d;

    invoke-static {v12}, Lsl1/d;->h(Lsl1/d;)Lod1/u;

    move-result-object v12

    invoke-virtual {v12}, Lod1/u;->e()Z

    move-result v12

    if-nez v12, :cond_f

    sget-object v3, Lsl1/b$f;->o:Lsl1/b$f;

    goto/16 :goto_d

    :cond_f
    if-eqz v7, :cond_10

    sget-object v3, Lsl1/b$a;->o:Lsl1/b$a;

    goto/16 :goto_d

    :cond_10
    if-eqz v13, :cond_11

    sget-object v3, Lsl1/b$q;->o:Lsl1/b$q;

    goto/16 :goto_d

    :cond_11
    if-eqz v8, :cond_12

    sget-object v3, Lsl1/b$p;->o:Lsl1/b$p;

    goto/16 :goto_d

    :cond_12
    if-eqz v17, :cond_13

    sget-object v3, Lsl1/b$m;->o:Lsl1/b$m;

    goto/16 :goto_d

    :cond_13
    if-eqz v18, :cond_14

    sget-object v3, Lsl1/b$l;->o:Lsl1/b$l;

    goto/16 :goto_d

    :cond_14
    if-eqz v19, :cond_15

    sget-object v3, Lsl1/b$j;->o:Lsl1/b$j;

    goto/16 :goto_d

    :cond_15
    if-eqz v20, :cond_16

    sget-object v3, Lsl1/b$i;->o:Lsl1/b$i;

    goto :goto_d

    :cond_16
    if-eqz v3, :cond_17

    sget-object v3, Lsl1/b$h;->o:Lsl1/b$h;

    goto :goto_d

    :cond_17
    if-eqz v11, :cond_18

    sget-object v3, Lsl1/b$n;->o:Lsl1/b$n;

    goto :goto_d

    :cond_18
    if-eqz v14, :cond_19

    sget-object v3, Lsl1/b$b;->o:Lsl1/b$b;

    goto :goto_d

    :cond_19
    if-eqz v15, :cond_1b

    new-instance v3, Lsl1/b$g;

    iget-object v4, v0, Lsl1/d$c$b;->z:Lsl1/d;

    invoke-static {v4}, Lsl1/d;->i(Lsl1/d;)Ltd1/b;

    move-result-object v4

    invoke-interface {v4}, Ltd1/b;->y()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_1a

    const-string v4, ""

    :cond_1a
    invoke-direct {v3, v4}, Lsl1/b$g;-><init>(Ljava/lang/String;)V

    goto :goto_d

    :cond_1b
    if-eqz v5, :cond_1c

    sget-object v3, Lsl1/b$c;->o:Lsl1/b$c;

    goto :goto_d

    :cond_1c
    if-eqz v21, :cond_1d

    sget-object v3, Lsl1/b$r;->o:Lsl1/b$r;

    goto :goto_d

    :cond_1d
    if-eqz v10, :cond_1e

    new-instance v3, Lsl1/b$d;

    invoke-static/range {v16 .. v16}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {v9}, Lca2/a;->b()I

    move-result v5

    invoke-direct {v3, v4, v5}, Lsl1/b$d;-><init>(Lcom/whoop/design/util/TextResource;I)V

    goto :goto_d

    :cond_1e
    if-eqz v6, :cond_1f

    new-instance v3, Lsl1/b$e;

    invoke-static/range {v16 .. v16}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-direct {v3, v4}, Lsl1/b$e;-><init>(Lcom/whoop/design/util/TextResource;)V

    goto :goto_d

    :cond_1f
    invoke-virtual {v4}, Lql1/d;->b()Z

    move-result v3

    if-eqz v3, :cond_20

    new-instance v3, Lsl1/b$o;

    invoke-virtual {v4}, Lql1/d;->a()I

    move-result v4

    invoke-direct {v3, v4}, Lsl1/b$o;-><init>(I)V

    goto :goto_d

    :cond_20
    sget-object v3, Lsl1/b$f;->o:Lsl1/b$f;

    :goto_d
    const/4 v4, 0x0

    iput-object v4, v0, Lsl1/d$c$b;->x:Ljava/lang/Object;

    iput-object v4, v0, Lsl1/d$c$b;->y:Ljava/lang/Object;

    const/4 v4, 0x1

    iput v4, v0, Lsl1/d$c$b;->w:I

    invoke-interface {v2, v3, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_21

    return-object v1

    :cond_21
    :goto_e
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
