.class final Lur1/h$i;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lur1/h;->interact(Lec3/l;)Lec3/l;
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
        "Lsr1/e;",
        "currentState",
        "Lur1/n;",
        "internalAction",
        "<anonymous>",
        "(Lsr1/e;Lur1/n;)Lsr1/e;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.journal.interactors.v2.JournalDomainCombiner$interact$1"
    f = "JournalDomainCombiner.kt"
    l = {
        0x9c,
        0xcd
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lur1/h;


# direct methods
.method public constructor <init>(Lur1/h;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lur1/h;",
            "Lq83/d<",
            "-",
            "Lur1/h$i;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lur1/h$i;->z:Lur1/h;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lsr1/e;Lur1/n;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsr1/e;",
            "Lur1/n;",
            "Lq83/d<",
            "-",
            "Lsr1/e;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lur1/h$i;

    iget-object v1, p0, Lur1/h$i;->z:Lur1/h;

    invoke-direct {v0, v1, p3}, Lur1/h$i;-><init>(Lur1/h;Lq83/d;)V

    iput-object p1, v0, Lur1/h$i;->x:Ljava/lang/Object;

    iput-object p2, v0, Lur1/h$i;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lur1/h$i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lsr1/e;

    check-cast p2, Lur1/n;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lur1/h$i;->f(Lsr1/e;Lur1/n;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 46

    move-object/from16 v0, p0

    iget-object v1, v0, Lur1/h$i;->x:Ljava/lang/Object;

    check-cast v1, Lsr1/e;

    iget-object v2, v0, Lur1/h$i;->y:Ljava/lang/Object;

    check-cast v2, Lur1/n;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v0, Lur1/h$i;->w:I

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eqz v4, :cond_2

    if-eq v4, v6, :cond_1

    if-ne v4, v5, :cond_0

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_9

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v1, p1

    goto/16 :goto_6

    :cond_2
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v4, Lur1/n$s;->a:Lur1/n$s;

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    const/4 v7, 0x0

    if-eqz v4, :cond_3

    new-instance v1, Lsr1/e$b;

    invoke-direct {v1, v7, v6, v7}, Lsr1/e$b;-><init>(Lwr1/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_3
    instance-of v4, v2, Lur1/n$q;

    if-eqz v4, :cond_4

    new-instance v8, Lsr1/e$a;

    check-cast v2, Lur1/n$q;

    invoke-virtual {v2}, Lur1/n$q;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-virtual {v2}, Lur1/n$q;->b()Lsr1/f;

    move-result-object v10

    const/4 v12, 0x4

    const/4 v13, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v8 .. v13}, Lsr1/e$a;-><init>(Lcom/whoop/design/util/TextResource;Lsr1/f;Lwr1/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v8

    :cond_4
    instance-of v4, v2, Lur1/n$r;

    const/4 v8, 0x0

    if-eqz v4, :cond_f

    instance-of v3, v1, Lsr1/e$b;

    if-eqz v3, :cond_5

    move-object v3, v1

    check-cast v3, Lsr1/e$b;

    invoke-virtual {v3}, Lsr1/e$b;->b()Lwr1/d;

    move-result-object v3

    goto :goto_0

    :cond_5
    instance-of v3, v1, Lsr1/e$a;

    if-eqz v3, :cond_6

    move-object v3, v1

    check-cast v3, Lsr1/e$a;

    invoke-virtual {v3}, Lsr1/e$a;->c()Lwr1/d;

    move-result-object v3

    goto :goto_0

    :cond_6
    instance-of v3, v1, Lsr1/e$e;

    if-eqz v3, :cond_7

    move-object v3, v1

    check-cast v3, Lsr1/e$e;

    invoke-virtual {v3}, Lsr1/e$e;->i()Lwr1/d;

    move-result-object v3

    goto :goto_0

    :cond_7
    move-object v3, v7

    :goto_0
    instance-of v4, v1, Lsr1/e$e;

    if-eqz v4, :cond_8

    move-object v4, v1

    check-cast v4, Lsr1/e$e;

    goto :goto_1

    :cond_8
    move-object v4, v7

    :goto_1
    check-cast v2, Lur1/n$r;

    invoke-virtual {v2}, Lur1/n$r;->m()Lsr1/i;

    move-result-object v5

    if-eqz v5, :cond_9

    invoke-virtual {v5}, Lsr1/i;->b()Z

    move-result v5

    goto :goto_2

    :cond_9
    move v5, v8

    :goto_2
    iget-object v9, v0, Lur1/h$i;->z:Lur1/h;

    invoke-virtual {v2}, Lur1/n$r;->d()Lsr1/c;

    move-result-object v10

    invoke-virtual {v9, v1, v10, v5}, Lur1/h;->w(Lsr1/e;Lsr1/c;Z)Z

    move-result v23

    invoke-virtual {v2}, Lur1/n$r;->a()Ljava/util/List;

    move-result-object v10

    invoke-virtual {v2}, Lur1/n$r;->a()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v2}, Lur1/n$r;->h()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2}, Lur1/n$r;->d()Lsr1/c;

    move-result-object v11

    const/4 v15, 0x5

    const/16 v16, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    move/from16 v13, v23

    invoke-static/range {v11 .. v16}, Lsr1/c;->b(Lsr1/c;ZZLjava/util/List;ILjava/lang/Object;)Lsr1/c;

    move-result-object v14

    invoke-virtual {v2}, Lur1/n$r;->j()Z

    move-result v16

    invoke-virtual {v2}, Lur1/n$r;->k()Z

    move-result v17

    invoke-virtual {v2}, Lur1/n$r;->e()Ljava/lang/String;

    move-result-object v18

    invoke-virtual {v2}, Lur1/n$r;->f()Lcom/whoop/data/remote/domain/dto/JournalBounds;

    move-result-object v19

    invoke-virtual {v2}, Lur1/n$r;->i()Ljava/lang/String;

    move-result-object v20

    invoke-virtual {v2}, Lur1/n$r;->b()J

    move-result-wide v21

    invoke-virtual {v2}, Lur1/n$r;->l()Lcom/whoop/data/remote/domain/dto/SubtitleCallout;

    move-result-object v24

    invoke-virtual {v2}, Lur1/n$r;->c()Lur1/d;

    move-result-object v25

    invoke-virtual {v2}, Lur1/n$r;->g()Lsr1/g;

    move-result-object v27

    instance-of v9, v3, Lwr1/d$c;

    if-eqz v9, :cond_a

    invoke-virtual {v2}, Lur1/n$r;->i()Ljava/lang/String;

    move-result-object v9

    move-object v11, v3

    check-cast v11, Lwr1/d$c;

    invoke-virtual {v11}, Lwr1/d$c;->a()Lwr1/a;

    move-result-object v11

    invoke-virtual {v11}, Lwr1/a;->e()Ljava/lang/String;

    move-result-object v11

    invoke-static {v9, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_a

    move/from16 v30, v6

    goto :goto_3

    :cond_a
    move/from16 v30, v8

    :goto_3
    invoke-virtual {v2}, Lur1/n$r;->m()Lsr1/i;

    move-result-object v32

    if-eqz v4, :cond_b

    invoke-virtual {v4}, Lsr1/e$e;->d()Lsr1/h;

    move-result-object v7

    :cond_b
    move-object v13, v7

    if-eqz v4, :cond_d

    invoke-virtual {v4}, Lsr1/e$e;->f()Lsr1/b;

    move-result-object v2

    if-nez v2, :cond_c

    goto :goto_4

    :cond_c
    move-object/from16 v28, v2

    goto :goto_5

    :cond_d
    :goto_4
    new-instance v33, Lsr1/b;

    const/16 v38, 0xf

    const/16 v39, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    invoke-direct/range {v33 .. v39}, Lsr1/b;-><init>(ZZLjava/lang/String;Lsw0/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v28, v33

    :goto_5
    new-instance v9, Lsr1/e$e;

    const v34, 0x408020

    const/16 v35, 0x0

    const/4 v15, 0x0

    const/16 v26, 0x0

    const/16 v31, 0x0

    const/16 v33, 0x0

    move-object v11, v1

    move-object/from16 v29, v3

    move-object v12, v5

    invoke-direct/range {v9 .. v35}, Lsr1/e$e;-><init>(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lsr1/h;Lsr1/c;Lsr1/d;ZZLjava/lang/String;Lcom/whoop/data/remote/domain/dto/JournalBounds;Ljava/lang/String;JZLcom/whoop/data/remote/domain/dto/SubtitleCallout;Lur1/d;Lh91/b;Lsr1/g;Lsr1/b;Lwr1/d;ZZLsr1/i;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    if-eqz v23, :cond_e

    iget-object v1, v0, Lur1/h$i;->z:Lur1/h;

    invoke-static {v1}, Lur1/h;->e(Lur1/h;)Lur1/j;

    move-result-object v1

    invoke-virtual {v1, v9, v6}, Lur1/j;->h(Lsr1/e$e;Z)Lsr1/e$e;

    move-result-object v1

    return-object v1

    :cond_e
    return-object v9

    :cond_f
    sget-object v4, Lur1/n$n;->a:Lur1/n$n;

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_10

    goto/16 :goto_e

    :cond_10
    instance-of v4, v2, Lur1/n$w;

    if-eqz v4, :cond_11

    instance-of v3, v1, Lsr1/e$e;

    if-eqz v3, :cond_34

    iget-object v3, v0, Lur1/h$i;->z:Lur1/h;

    check-cast v2, Lur1/n$w;

    check-cast v1, Lsr1/e$e;

    invoke-static {v3, v2, v1}, Lur1/h;->i(Lur1/h;Lur1/n$w;Lsr1/e$e;)Lsr1/e;

    move-result-object v1

    return-object v1

    :cond_11
    instance-of v4, v2, Lur1/n$j;

    if-eqz v4, :cond_12

    instance-of v3, v1, Lsr1/e$e;

    if-eqz v3, :cond_34

    iget-object v3, v0, Lur1/h$i;->z:Lur1/h;

    check-cast v2, Lur1/n$j;

    check-cast v1, Lsr1/e$e;

    invoke-static {v3, v2, v1}, Lur1/h;->h(Lur1/h;Lur1/n$j;Lsr1/e$e;)Lsr1/e;

    move-result-object v1

    return-object v1

    :cond_12
    instance-of v4, v2, Lur1/n$t;

    if-eqz v4, :cond_13

    instance-of v2, v1, Lsr1/e$e;

    if-eqz v2, :cond_34

    iget-object v2, v0, Lur1/h$i;->z:Lur1/h;

    check-cast v1, Lsr1/e$e;

    invoke-static {v2, v1}, Lur1/h;->j(Lur1/h;Lsr1/e$e;)Lsr1/e$d;

    move-result-object v1

    return-object v1

    :cond_13
    instance-of v4, v2, Lur1/n$v;

    if-eqz v4, :cond_15

    instance-of v2, v1, Lsr1/e$d;

    if-eqz v2, :cond_34

    iget-object v2, v0, Lur1/h$i;->z:Lur1/h;

    invoke-static {v2}, Lur1/h;->f(Lur1/h;)Lur1/m;

    move-result-object v2

    check-cast v1, Lsr1/e$d;

    iput-object v7, v0, Lur1/h$i;->x:Ljava/lang/Object;

    iput-object v7, v0, Lur1/h$i;->y:Ljava/lang/Object;

    iput v6, v0, Lur1/h$i;->w:I

    invoke-virtual {v2, v1, v0}, Lur1/m;->C(Lsr1/e$d;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_14

    goto/16 :goto_8

    :cond_14
    :goto_6
    check-cast v1, Lsr1/e;

    return-object v1

    :cond_15
    instance-of v4, v2, Lur1/n$p;

    if-eqz v4, :cond_17

    instance-of v3, v1, Lsr1/e$e;

    if-eqz v3, :cond_34

    check-cast v2, Lur1/n$p;

    invoke-virtual {v2}, Lur1/n$p;->a()Lsr1/d;

    move-result-object v3

    invoke-virtual {v3}, Lsr1/d;->d()Z

    move-result v3

    if-eqz v3, :cond_16

    move-object v3, v1

    check-cast v3, Lsr1/e$e;

    invoke-virtual {v3}, Lsr1/e$e;->k()Z

    move-result v3

    if-eqz v3, :cond_16

    move v3, v6

    goto :goto_7

    :cond_16
    move v3, v8

    :goto_7
    invoke-virtual {v2}, Lur1/n$p;->a()Lsr1/d;

    move-result-object v2

    invoke-static {v2, v3, v8, v5, v7}, Lsr1/d;->b(Lsr1/d;ZZILjava/lang/Object;)Lsr1/d;

    move-result-object v15

    move-object v9, v1

    check-cast v9, Lsr1/e$e;

    xor-int/lit8 v16, v3, 0x1

    const v34, 0x7fff9f

    const/16 v35, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const-wide/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    invoke-static/range {v9 .. v35}, Lsr1/e$e;->b(Lsr1/e$e;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lsr1/h;Lsr1/c;Lsr1/d;ZZLjava/lang/String;Lcom/whoop/data/remote/domain/dto/JournalBounds;Ljava/lang/String;JZLcom/whoop/data/remote/domain/dto/SubtitleCallout;Lur1/d;Lh91/b;Lsr1/g;Lsr1/b;Lwr1/d;ZZLsr1/i;Lcom/whoop/navigation/e;ILjava/lang/Object;)Lsr1/e$e;

    move-result-object v1

    return-object v1

    :cond_17
    sget-object v4, Lur1/n$f;->a:Lur1/n$f;

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_18

    instance-of v2, v1, Lsr1/e$e;

    if-eqz v2, :cond_34

    move-object v9, v1

    check-cast v9, Lsr1/e$e;

    invoke-virtual {v9}, Lsr1/e$e;->u()Lsr1/d;

    move-result-object v1

    invoke-static {v1, v8, v8, v5, v7}, Lsr1/d;->b(Lsr1/d;ZZILjava/lang/Object;)Lsr1/d;

    move-result-object v15

    const v34, 0x7fffdf

    const/16 v35, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const-wide/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    invoke-static/range {v9 .. v35}, Lsr1/e$e;->b(Lsr1/e$e;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lsr1/h;Lsr1/c;Lsr1/d;ZZLjava/lang/String;Lcom/whoop/data/remote/domain/dto/JournalBounds;Ljava/lang/String;JZLcom/whoop/data/remote/domain/dto/SubtitleCallout;Lur1/d;Lh91/b;Lsr1/g;Lsr1/b;Lwr1/d;ZZLsr1/i;Lcom/whoop/navigation/e;ILjava/lang/Object;)Lsr1/e$e;

    move-result-object v1

    return-object v1

    :cond_18
    sget-object v4, Lur1/n$d;->a:Lur1/n$d;

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_19

    instance-of v2, v1, Lsr1/e$e;

    if-eqz v2, :cond_34

    move-object v3, v1

    check-cast v3, Lsr1/e$e;

    invoke-virtual {v3}, Lsr1/e$e;->k()Z

    move-result v2

    if-eqz v2, :cond_34

    iget-object v1, v0, Lur1/h$i;->z:Lur1/h;

    invoke-static {v1}, Lur1/h;->f(Lur1/h;)Lur1/m;

    move-result-object v1

    iget-object v2, v0, Lur1/h$i;->z:Lur1/h;

    invoke-static {v2, v3}, Lur1/h;->j(Lur1/h;Lsr1/e$e;)Lsr1/e$d;

    move-result-object v2

    invoke-virtual {v1, v2}, Lur1/m;->u(Lsr1/e$d;)V

    iget-object v1, v0, Lur1/h$i;->z:Lur1/h;

    invoke-virtual {v3}, Lsr1/e$e;->i()Lwr1/d;

    move-result-object v2

    invoke-virtual {v3}, Lsr1/e$e;->r()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v2, v4}, Lur1/h;->u(Lwr1/d;Ljava/lang/String;)Lwr1/d;

    move-result-object v23

    const v28, 0x7bffff

    const/16 v29, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    invoke-static/range {v3 .. v29}, Lsr1/e$e;->b(Lsr1/e$e;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lsr1/h;Lsr1/c;Lsr1/d;ZZLjava/lang/String;Lcom/whoop/data/remote/domain/dto/JournalBounds;Ljava/lang/String;JZLcom/whoop/data/remote/domain/dto/SubtitleCallout;Lur1/d;Lh91/b;Lsr1/g;Lsr1/b;Lwr1/d;ZZLsr1/i;Lcom/whoop/navigation/e;ILjava/lang/Object;)Lsr1/e$e;

    move-result-object v1

    return-object v1

    :cond_19
    sget-object v4, Lur1/n$e;->a:Lur1/n$e;

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1a

    instance-of v2, v1, Lsr1/e$e;

    if-eqz v2, :cond_34

    move-object v2, v1

    check-cast v2, Lsr1/e$e;

    invoke-virtual {v2}, Lsr1/e$e;->k()Z

    move-result v3

    if-eqz v3, :cond_34

    iget-object v3, v0, Lur1/h$i;->z:Lur1/h;

    invoke-static {v3}, Lur1/h;->f(Lur1/h;)Lur1/m;

    move-result-object v3

    iget-object v4, v0, Lur1/h$i;->z:Lur1/h;

    invoke-static {v4, v2}, Lur1/h;->j(Lur1/h;Lsr1/e$e;)Lsr1/e$d;

    move-result-object v2

    invoke-virtual {v3, v2}, Lur1/m;->w(Lsr1/e$d;)V

    return-object v1

    :cond_1a
    instance-of v4, v2, Lur1/n$z;

    if-eqz v4, :cond_1c

    instance-of v4, v1, Lsr1/e$e;

    if-eqz v4, :cond_34

    iget-object v4, v0, Lur1/h$i;->z:Lur1/h;

    invoke-static {v4}, Lur1/h;->f(Lur1/h;)Lur1/m;

    move-result-object v4

    move-object v6, v2

    check-cast v6, Lur1/n$z;

    invoke-virtual {v6}, Lur1/n$z;->a()Z

    move-result v6

    iput-object v1, v0, Lur1/h$i;->x:Ljava/lang/Object;

    iput-object v2, v0, Lur1/h$i;->y:Ljava/lang/Object;

    iput v5, v0, Lur1/h$i;->w:I

    invoke-virtual {v4, v6, v0}, Lur1/m;->E(ZLq83/d;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_1b

    :goto_8
    return-object v3

    :cond_1b
    :goto_9
    iget-object v3, v0, Lur1/h$i;->z:Lur1/h;

    invoke-static {v3}, Lur1/h;->e(Lur1/h;)Lur1/j;

    move-result-object v3

    check-cast v1, Lsr1/e$e;

    check-cast v2, Lur1/n$z;

    invoke-virtual {v2}, Lur1/n$z;->a()Z

    move-result v4

    invoke-virtual {v3, v1, v4}, Lur1/j;->h(Lsr1/e$e;Z)Lsr1/e$e;

    move-result-object v5

    invoke-virtual {v5}, Lsr1/e$e;->j()Lsr1/c;

    move-result-object v6

    invoke-virtual {v2}, Lur1/n$z;->a()Z

    move-result v8

    const/4 v10, 0x5

    const/4 v11, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    invoke-static/range {v6 .. v11}, Lsr1/c;->b(Lsr1/c;ZZLjava/util/List;ILjava/lang/Object;)Lsr1/c;

    move-result-object v10

    const v30, 0x7fffef

    const/16 v31, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    invoke-static/range {v5 .. v31}, Lsr1/e$e;->b(Lsr1/e$e;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lsr1/h;Lsr1/c;Lsr1/d;ZZLjava/lang/String;Lcom/whoop/data/remote/domain/dto/JournalBounds;Ljava/lang/String;JZLcom/whoop/data/remote/domain/dto/SubtitleCallout;Lur1/d;Lh91/b;Lsr1/g;Lsr1/b;Lwr1/d;ZZLsr1/i;Lcom/whoop/navigation/e;ILjava/lang/Object;)Lsr1/e$e;

    move-result-object v1

    return-object v1

    :cond_1c
    sget-object v3, Lur1/n$o;->a:Lur1/n$o;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1e

    instance-of v2, v1, Lsr1/e$e;

    if-eqz v2, :cond_34

    move-object v8, v1

    check-cast v8, Lsr1/e$e;

    invoke-virtual {v8}, Lsr1/e$e;->h()Lur1/d;

    move-result-object v9

    if-eqz v9, :cond_1d

    const/4 v14, 0x7

    const/4 v15, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x1

    invoke-static/range {v9 .. v15}, Lur1/d;->b(Lur1/d;Ljava/lang/String;Lcom/whoop/data/remote/domain/dto/JournalDayInfo;Lcom/whoop/data/remote/domain/dto/JournalDayInfo;ZILjava/lang/Object;)Lur1/d;

    move-result-object v7

    :cond_1d
    move-object/from16 v24, v7

    const v33, 0x7fbfff

    const/16 v34, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    invoke-static/range {v8 .. v34}, Lsr1/e$e;->b(Lsr1/e$e;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lsr1/h;Lsr1/c;Lsr1/d;ZZLjava/lang/String;Lcom/whoop/data/remote/domain/dto/JournalBounds;Ljava/lang/String;JZLcom/whoop/data/remote/domain/dto/SubtitleCallout;Lur1/d;Lh91/b;Lsr1/g;Lsr1/b;Lwr1/d;ZZLsr1/i;Lcom/whoop/navigation/e;ILjava/lang/Object;)Lsr1/e$e;

    move-result-object v1

    return-object v1

    :cond_1e
    instance-of v3, v2, Lur1/n$x;

    if-eqz v3, :cond_1f

    instance-of v3, v1, Lsr1/e$e;

    if-eqz v3, :cond_34

    move-object v4, v1

    check-cast v4, Lsr1/e$e;

    check-cast v2, Lur1/n$x;

    invoke-virtual {v2}, Lur1/n$x;->a()Lh91/b;

    move-result-object v21

    const v29, 0x7f7fff

    const/16 v30, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    invoke-static/range {v4 .. v30}, Lsr1/e$e;->b(Lsr1/e$e;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lsr1/h;Lsr1/c;Lsr1/d;ZZLjava/lang/String;Lcom/whoop/data/remote/domain/dto/JournalBounds;Ljava/lang/String;JZLcom/whoop/data/remote/domain/dto/SubtitleCallout;Lur1/d;Lh91/b;Lsr1/g;Lsr1/b;Lwr1/d;ZZLsr1/i;Lcom/whoop/navigation/e;ILjava/lang/Object;)Lsr1/e$e;

    move-result-object v1

    return-object v1

    :cond_1f
    sget-object v3, Lur1/n$l;->a:Lur1/n$l;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_20

    instance-of v2, v1, Lsr1/e$e;

    if-eqz v2, :cond_34

    move-object v3, v1

    check-cast v3, Lsr1/e$e;

    sget-object v8, Lsr1/a$a;->a:Lsr1/a$a;

    new-instance v4, Lsr1/h;

    const/4 v9, 0x5

    const/4 v10, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v4 .. v10}, Lsr1/h;-><init>(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lsr1/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v3}, Lsr1/e$e;->f()Lsr1/b;

    move-result-object v5

    const/16 v10, 0x8

    const/4 v11, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v5 .. v11}, Lsr1/b;->b(Lsr1/b;ZZLjava/lang/String;Lsw0/g;ILjava/lang/Object;)Lsr1/b;

    move-result-object v22

    const v28, 0x7dfff7

    const/16 v29, 0x0

    move-object v7, v4

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    invoke-static/range {v3 .. v29}, Lsr1/e$e;->b(Lsr1/e$e;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lsr1/h;Lsr1/c;Lsr1/d;ZZLjava/lang/String;Lcom/whoop/data/remote/domain/dto/JournalBounds;Ljava/lang/String;JZLcom/whoop/data/remote/domain/dto/SubtitleCallout;Lur1/d;Lh91/b;Lsr1/g;Lsr1/b;Lwr1/d;ZZLsr1/i;Lcom/whoop/navigation/e;ILjava/lang/Object;)Lsr1/e$e;

    move-result-object v1

    return-object v1

    :cond_20
    instance-of v3, v2, Lur1/n$m;

    sget-object v18, Lm83/y;->w:Lm83/y;

    if-eqz v3, :cond_26

    check-cast v2, Lur1/n$m;

    invoke-virtual {v2}, Lur1/n$m;->a()Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->getGroupedTogglesModels()Ljava/util/List;

    move-result-object v3

    if-nez v3, :cond_21

    move-object/from16 v3, v18

    :cond_21
    check-cast v3, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_a
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_22

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/whoop/design/models/items/GroupedTogglesModel;

    invoke-virtual {v5}, Lcom/whoop/design/models/items/GroupedTogglesModel;->getToggles()Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    invoke-static {v4, v5}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    goto :goto_a

    :cond_22
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_23
    :goto_b
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_24

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lcom/whoop/design/models/items/TogglesModel;

    invoke-virtual {v6}, Lcom/whoop/design/models/items/TogglesModel;->getSelected()Ljava/lang/Boolean;

    move-result-object v6

    sget-object v9, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v6, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_23

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_b

    :cond_24
    new-instance v12, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v3, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v12, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_c
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_25

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/design/models/items/TogglesModel;

    invoke-virtual {v4}, Lcom/whoop/design/models/items/TogglesModel;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v12, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_c

    :cond_25
    instance-of v3, v1, Lsr1/e$e;

    if-eqz v3, :cond_34

    check-cast v1, Lsr1/e$e;

    sget-object v23, Lsr1/a$a;->a:Lsr1/a$a;

    invoke-virtual {v2}, Lur1/n$m;->a()Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->getTitle()Ljava/lang/String;

    move-result-object v21

    new-instance v19, Lsr1/h;

    const/16 v24, 0x5

    const/16 v25, 0x0

    const/16 v20, 0x0

    const/16 v22, 0x0

    invoke-direct/range {v19 .. v25}, Lsr1/h;-><init>(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lsr1/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v3, v19

    invoke-virtual {v1}, Lsr1/e$e;->f()Lsr1/b;

    move-result-object v4

    invoke-virtual {v2}, Lur1/n$m;->a()Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;

    move-result-object v9

    const/4 v13, 0x3

    const/4 v14, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v9 .. v14}, Lsw0/h;->c(Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;Ljava/lang/String;ZLjava/util/List;ILjava/lang/Object;)Lsw0/g;

    move-result-object v9

    move-object/from16 v17, v12

    const/16 v22, 0xe7f

    const/16 v23, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    invoke-static/range {v9 .. v23}, Lsw0/g;->b(Lsw0/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lsw0/b;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;ILjava/lang/Object;)Lsw0/g;

    move-result-object v2

    invoke-virtual {v4, v8, v8, v7, v2}, Lsr1/b;->a(ZZLjava/lang/String;Lsw0/g;)Lsr1/b;

    move-result-object v38

    const v44, 0x7dfff7

    const/16 v45, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const-wide/16 v31, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    move-object/from16 v19, v1

    move-object/from16 v23, v3

    invoke-static/range {v19 .. v45}, Lsr1/e$e;->b(Lsr1/e$e;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lsr1/h;Lsr1/c;Lsr1/d;ZZLjava/lang/String;Lcom/whoop/data/remote/domain/dto/JournalBounds;Ljava/lang/String;JZLcom/whoop/data/remote/domain/dto/SubtitleCallout;Lur1/d;Lh91/b;Lsr1/g;Lsr1/b;Lwr1/d;ZZLsr1/i;Lcom/whoop/navigation/e;ILjava/lang/Object;)Lsr1/e$e;

    move-result-object v1

    return-object v1

    :cond_26
    sget-object v3, Lur1/n$k;->a:Lur1/n$k;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_28

    instance-of v2, v1, Lsr1/e$e;

    if-eqz v2, :cond_34

    check-cast v1, Lsr1/e$e;

    sget-object v13, Lsr1/a$a;->a:Lsr1/a$a;

    new-instance v23, Lsr1/h;

    const/4 v14, 0x5

    const/4 v15, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object/from16 v9, v23

    invoke-direct/range {v9 .. v15}, Lsr1/h;-><init>(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lsr1/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v2, v9

    invoke-virtual {v1}, Lsr1/e$e;->f()Lsr1/b;

    move-result-object v3

    invoke-virtual {v1}, Lsr1/e$e;->f()Lsr1/b;

    move-result-object v4

    invoke-virtual {v4}, Lsr1/b;->c()Lsw0/g;

    move-result-object v9

    if-eqz v9, :cond_27

    const/16 v22, 0xeff

    const/16 v23, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-static/range {v9 .. v23}, Lsw0/g;->b(Lsw0/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lsw0/b;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;ILjava/lang/Object;)Lsw0/g;

    move-result-object v4

    goto :goto_d

    :cond_27
    move-object v4, v7

    :goto_d
    invoke-virtual {v3, v8, v6, v7, v4}, Lsr1/b;->a(ZZLjava/lang/String;Lsw0/g;)Lsr1/b;

    move-result-object v38

    const v44, 0x7dfff7

    const/16 v45, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const-wide/16 v31, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    move-object/from16 v19, v1

    move-object/from16 v23, v2

    invoke-static/range {v19 .. v45}, Lsr1/e$e;->b(Lsr1/e$e;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lsr1/h;Lsr1/c;Lsr1/d;ZZLjava/lang/String;Lcom/whoop/data/remote/domain/dto/JournalBounds;Ljava/lang/String;JZLcom/whoop/data/remote/domain/dto/SubtitleCallout;Lur1/d;Lh91/b;Lsr1/g;Lsr1/b;Lwr1/d;ZZLsr1/i;Lcom/whoop/navigation/e;ILjava/lang/Object;)Lsr1/e$e;

    move-result-object v1

    return-object v1

    :cond_28
    instance-of v3, v2, Lur1/n$b;

    if-eqz v3, :cond_29

    instance-of v3, v1, Lsr1/e$e;

    if-eqz v3, :cond_34

    iget-object v3, v0, Lur1/h$i;->z:Lur1/h;

    invoke-static {v3}, Lur1/h;->c(Lur1/h;)Lur1/c;

    move-result-object v3

    check-cast v1, Lsr1/e$e;

    check-cast v2, Lur1/n$b;

    invoke-virtual {v2}, Lur1/n$b;->a()I

    move-result v2

    invoke-virtual {v3, v1, v2}, Lur1/c;->c(Lsr1/e$e;I)Lsr1/e;

    move-result-object v1

    return-object v1

    :cond_29
    instance-of v3, v2, Lur1/n$u;

    if-eqz v3, :cond_2a

    instance-of v3, v1, Lsr1/e$e;

    if-eqz v3, :cond_34

    iget-object v3, v0, Lur1/h$i;->z:Lur1/h;

    invoke-static {v3}, Lur1/h;->c(Lur1/h;)Lur1/c;

    move-result-object v3

    check-cast v1, Lsr1/e$e;

    check-cast v2, Lur1/n$u;

    invoke-virtual {v2}, Lur1/n$u;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v1, v2}, Lur1/c;->d(Lsr1/e$e;Ljava/lang/String;)Lsr1/e;

    move-result-object v1

    return-object v1

    :cond_2a
    instance-of v3, v2, Lur1/n$a0;

    if-eqz v3, :cond_2b

    instance-of v3, v1, Lsr1/e$e;

    if-eqz v3, :cond_34

    iget-object v3, v0, Lur1/h$i;->z:Lur1/h;

    invoke-static {v3}, Lur1/h;->c(Lur1/h;)Lur1/c;

    move-result-object v3

    check-cast v1, Lsr1/e$e;

    check-cast v2, Lur1/n$a0;

    invoke-virtual {v2}, Lur1/n$a0;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v1, v2}, Lur1/c;->f(Lsr1/e$e;Ljava/lang/String;)Lsr1/e;

    move-result-object v1

    return-object v1

    :cond_2b
    instance-of v3, v2, Lur1/n$y;

    if-eqz v3, :cond_2e

    instance-of v3, v1, Lsr1/e$b;

    if-eqz v3, :cond_2c

    check-cast v1, Lsr1/e$b;

    check-cast v2, Lur1/n$y;

    invoke-virtual {v2}, Lur1/n$y;->a()Lwr1/d;

    move-result-object v2

    invoke-virtual {v1, v2}, Lsr1/e$b;->a(Lwr1/d;)Lsr1/e$b;

    move-result-object v1

    return-object v1

    :cond_2c
    instance-of v3, v1, Lsr1/e$a;

    if-eqz v3, :cond_2d

    move-object v4, v1

    check-cast v4, Lsr1/e$a;

    check-cast v2, Lur1/n$y;

    invoke-virtual {v2}, Lur1/n$y;->a()Lwr1/d;

    move-result-object v7

    const/4 v8, 0x3

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v4 .. v9}, Lsr1/e$a;->b(Lsr1/e$a;Lcom/whoop/design/util/TextResource;Lsr1/f;Lwr1/d;ILjava/lang/Object;)Lsr1/e$a;

    move-result-object v1

    return-object v1

    :cond_2d
    instance-of v3, v1, Lsr1/e$e;

    if-eqz v3, :cond_34

    move-object v4, v1

    check-cast v4, Lsr1/e$e;

    check-cast v2, Lur1/n$y;

    invoke-virtual {v2}, Lur1/n$y;->a()Lwr1/d;

    move-result-object v24

    const v29, 0x73ffff

    const/16 v30, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    invoke-static/range {v4 .. v30}, Lsr1/e$e;->b(Lsr1/e$e;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lsr1/h;Lsr1/c;Lsr1/d;ZZLjava/lang/String;Lcom/whoop/data/remote/domain/dto/JournalBounds;Ljava/lang/String;JZLcom/whoop/data/remote/domain/dto/SubtitleCallout;Lur1/d;Lh91/b;Lsr1/g;Lsr1/b;Lwr1/d;ZZLsr1/i;Lcom/whoop/navigation/e;ILjava/lang/Object;)Lsr1/e$e;

    move-result-object v1

    return-object v1

    :cond_2e
    instance-of v3, v2, Lur1/n$i;

    if-eqz v3, :cond_2f

    instance-of v3, v1, Lsr1/e$e;

    if-eqz v3, :cond_34

    iget-object v3, v0, Lur1/h$i;->z:Lur1/h;

    invoke-static {v3}, Lur1/h;->c(Lur1/h;)Lur1/c;

    move-result-object v3

    move-object v4, v1

    check-cast v4, Lsr1/e$e;

    invoke-virtual {v3, v4}, Lur1/c;->e(Lsr1/e$e;)V

    check-cast v2, Lur1/n$i;

    invoke-virtual {v2}, Lur1/n$i;->a()Lcom/whoop/navigation/e;

    move-result-object v28

    const v29, 0x2fffff

    const/16 v30, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x1

    const/16 v27, 0x0

    invoke-static/range {v4 .. v30}, Lsr1/e$e;->b(Lsr1/e$e;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lsr1/h;Lsr1/c;Lsr1/d;ZZLjava/lang/String;Lcom/whoop/data/remote/domain/dto/JournalBounds;Ljava/lang/String;JZLcom/whoop/data/remote/domain/dto/SubtitleCallout;Lur1/d;Lh91/b;Lsr1/g;Lsr1/b;Lwr1/d;ZZLsr1/i;Lcom/whoop/navigation/e;ILjava/lang/Object;)Lsr1/e$e;

    move-result-object v1

    return-object v1

    :cond_2f
    sget-object v3, Lur1/n$h;->a:Lur1/n$h;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_30

    goto/16 :goto_e

    :cond_30
    sget-object v3, Lur1/n$g;->a:Lur1/n$g;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_31

    goto/16 :goto_e

    :cond_31
    instance-of v3, v2, Lur1/n$a;

    if-eqz v3, :cond_33

    instance-of v3, v1, Lsr1/e$e;

    if-eqz v3, :cond_34

    move-object v8, v1

    check-cast v8, Lsr1/e$e;

    invoke-virtual {v8}, Lsr1/e$e;->f()Lsr1/b;

    move-result-object v9

    invoke-virtual {v8}, Lsr1/e$e;->f()Lsr1/b;

    move-result-object v1

    invoke-virtual {v1}, Lsr1/b;->c()Lsw0/g;

    move-result-object v10

    if-eqz v10, :cond_32

    check-cast v2, Lur1/n$a;

    invoke-virtual {v2}, Lur1/n$a;->a()Ljava/util/List;

    move-result-object v19

    const/16 v23, 0xeff

    const/16 v24, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    invoke-static/range {v10 .. v24}, Lsw0/g;->b(Lsw0/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lsw0/b;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;ILjava/lang/Object;)Lsw0/g;

    move-result-object v7

    :cond_32
    move-object v13, v7

    const/4 v14, 0x3

    const/4 v15, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v9 .. v15}, Lsr1/b;->b(Lsr1/b;ZZLjava/lang/String;Lsw0/g;ILjava/lang/Object;)Lsr1/b;

    move-result-object v27

    const v33, 0x7dffff

    const/16 v34, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    invoke-static/range {v8 .. v34}, Lsr1/e$e;->b(Lsr1/e$e;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lsr1/h;Lsr1/c;Lsr1/d;ZZLjava/lang/String;Lcom/whoop/data/remote/domain/dto/JournalBounds;Ljava/lang/String;JZLcom/whoop/data/remote/domain/dto/SubtitleCallout;Lur1/d;Lh91/b;Lsr1/g;Lsr1/b;Lwr1/d;ZZLsr1/i;Lcom/whoop/navigation/e;ILjava/lang/Object;)Lsr1/e$e;

    move-result-object v1

    return-object v1

    :cond_33
    instance-of v2, v2, Lur1/n$c;

    if-eqz v2, :cond_35

    instance-of v2, v1, Lsr1/e$e;

    if-eqz v2, :cond_34

    move-object v3, v1

    check-cast v3, Lsr1/e$e;

    const v28, 0x3fffff

    const/16 v29, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    invoke-static/range {v3 .. v29}, Lsr1/e$e;->b(Lsr1/e$e;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lsr1/h;Lsr1/c;Lsr1/d;ZZLjava/lang/String;Lcom/whoop/data/remote/domain/dto/JournalBounds;Ljava/lang/String;JZLcom/whoop/data/remote/domain/dto/SubtitleCallout;Lur1/d;Lh91/b;Lsr1/g;Lsr1/b;Lwr1/d;ZZLsr1/i;Lcom/whoop/navigation/e;ILjava/lang/Object;)Lsr1/e$e;

    move-result-object v1

    :cond_34
    :goto_e
    return-object v1

    :cond_35
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method
