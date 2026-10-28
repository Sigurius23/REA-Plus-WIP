.class public final Ljt2/k$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljt2/k;->interact(Lec3/l;)Lec3/l;
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
        "\u0000\u0010\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\u0008\u0000\u0010\u0000\"\u0004\u0008\u0001\u0010\u0001*\u0008\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"
    }
    d2 = {
        "R",
        "T",
        "Lec3/m;",
        "it",
        "Ll83/a0;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.weeklyplan.hubandspoke.domain.HubAndSpokeCombiner$interact$$inlined$flatMapLatest$1"
    f = "HubAndSpokeCombiner.kt"
    l = {
        0xbd
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field private synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Ljt2/k;


# direct methods
.method public constructor <init>(Lq83/d;Ljt2/k;)V
    .locals 0

    iput-object p2, p0, Ljt2/k$a;->z:Ljt2/k;

    const/4 p2, 0x3

    invoke-direct {p0, p2, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Lec3/m;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Ljt2/l;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljt2/k$a;

    iget-object v1, p0, Ljt2/k$a;->z:Ljt2/k;

    invoke-direct {v0, p3, v1}, Ljt2/k$a;-><init>(Lq83/d;Ljt2/k;)V

    iput-object p1, v0, Ljt2/k$a;->x:Ljava/lang/Object;

    iput-object p2, v0, Ljt2/k$a;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Ljt2/k$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Ljt2/k$a;->invoke(Lec3/m;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Ljt2/k$a;->w:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v1, v0, Ljt2/k$a;->x:Ljava/lang/Object;

    check-cast v1, Lec3/m;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v0, Ljt2/k$a;->x:Ljava/lang/Object;

    check-cast v2, Lec3/m;

    iget-object v4, v0, Ljt2/k$a;->y:Ljava/lang/Object;

    check-cast v4, Ljt2/l;

    instance-of v5, v4, Ljt2/l$d;

    if-eqz v5, :cond_2

    iget-object v5, v0, Ljt2/k$a;->z:Ljt2/k;

    invoke-static {v5}, Ljt2/k;->c(Ljt2/k;)Ljt2/f;

    move-result-object v5

    new-instance v6, La6/u;

    const/4 v7, 0x1

    invoke-direct {v6, v4, v7}, La6/u;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v5, v6}, Ljt2/f;->interact(Lec3/l;)Lec3/l;

    move-result-object v4

    goto/16 :goto_1

    :cond_2
    instance-of v5, v4, Ljt2/l$g;

    if-eqz v5, :cond_3

    iget-object v5, v0, Ljt2/k$a;->z:Ljt2/k;

    invoke-static {v5}, Ljt2/k;->c(Ljt2/k;)Ljt2/f;

    move-result-object v5

    new-instance v6, Ljt2/l$g;

    check-cast v4, Ljt2/l$g;

    invoke-virtual {v4}, Ljt2/l$g;->d()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4}, Ljt2/l$g;->e()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v4}, Ljt2/l$g;->j()Z

    move-result v9

    invoke-virtual {v4}, Ljt2/l$g;->c()Z

    move-result v10

    invoke-virtual {v4}, Ljt2/l$g;->g()Ljava/util/List;

    move-result-object v11

    invoke-virtual {v4}, Ljt2/l$g;->b()Ljava/util/List;

    move-result-object v12

    invoke-virtual {v4}, Ljt2/l$g;->a()Ljava/util/List;

    move-result-object v13

    invoke-virtual {v4}, Ljt2/l$g;->h()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v4}, Ljt2/l$g;->f()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v4}, Ljt2/l$g;->i()Ljava/lang/String;

    move-result-object v16

    invoke-direct/range {v6 .. v16}, Ljt2/l$g;-><init>(Ljava/lang/String;Ljava/lang/String;ZZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-instance v4, La6/u;

    const/4 v7, 0x1

    invoke-direct {v4, v6, v7}, La6/u;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v5, v4}, Ljt2/f;->interact(Lec3/l;)Lec3/l;

    move-result-object v4

    goto/16 :goto_1

    :cond_3
    instance-of v5, v4, Ljt2/l$f;

    if-eqz v5, :cond_4

    new-instance v5, Ljt2/p$i;

    check-cast v4, Ljt2/l$f;

    invoke-virtual {v4}, Ljt2/l$f;->a()Z

    move-result v4

    invoke-direct {v5, v4}, Ljt2/p$i;-><init>(Z)V

    new-instance v4, La6/u;

    const/4 v6, 0x1

    invoke-direct {v4, v5, v6}, La6/u;-><init>(Ljava/lang/Object;I)V

    goto/16 :goto_1

    :cond_4
    instance-of v5, v4, Ljt2/l$a;

    if-eqz v5, :cond_5

    new-instance v5, Ljt2/p$a;

    check-cast v4, Ljt2/l$a;

    invoke-virtual {v4}, Ljt2/l$a;->a()I

    move-result v4

    invoke-direct {v5, v4}, Ljt2/p$a;-><init>(I)V

    new-instance v4, La6/u;

    const/4 v6, 0x1

    invoke-direct {v4, v5, v6}, La6/u;-><init>(Ljava/lang/Object;I)V

    goto/16 :goto_1

    :cond_5
    instance-of v5, v4, Ljt2/l$m;

    if-eqz v5, :cond_6

    new-instance v5, Ljt2/p$r;

    check-cast v4, Ljt2/l$m;

    invoke-virtual {v4}, Ljt2/l$m;->a()I

    move-result v4

    invoke-direct {v5, v4}, Ljt2/p$r;-><init>(I)V

    new-instance v4, La6/u;

    const/4 v6, 0x1

    invoke-direct {v4, v5, v6}, La6/u;-><init>(Ljava/lang/Object;I)V

    goto/16 :goto_1

    :cond_6
    sget-object v5, Ljt2/l$k;->a:Ljt2/l$k;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_7

    sget-object v4, Ljt2/p$n;->a:Ljt2/p$n;

    new-instance v5, La6/u;

    const/4 v6, 0x1

    invoke-direct {v5, v4, v6}, La6/u;-><init>(Ljava/lang/Object;I)V

    :goto_0
    move-object v4, v5

    goto/16 :goto_1

    :cond_7
    instance-of v5, v4, Ljt2/l$q;

    if-eqz v5, :cond_8

    new-instance v5, Ljt2/p$w;

    check-cast v4, Ljt2/l$q;

    invoke-virtual {v4}, Ljt2/l$q;->a()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    move-result-object v4

    invoke-direct {v5, v4}, Ljt2/p$w;-><init>(Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;)V

    new-instance v4, La6/u;

    const/4 v6, 0x1

    invoke-direct {v4, v5, v6}, La6/u;-><init>(Ljava/lang/Object;I)V

    goto/16 :goto_1

    :cond_8
    instance-of v5, v4, Ljt2/l$s;

    if-eqz v5, :cond_9

    new-instance v5, Ljt2/p$y;

    check-cast v4, Ljt2/l$s;

    invoke-virtual {v4}, Ljt2/l$s;->a()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    move-result-object v6

    invoke-virtual {v4}, Ljt2/l$s;->b()D

    move-result-wide v7

    invoke-direct {v5, v6, v7, v8}, Ljt2/p$y;-><init>(Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;D)V

    new-instance v4, La6/u;

    const/4 v6, 0x1

    invoke-direct {v4, v5, v6}, La6/u;-><init>(Ljava/lang/Object;I)V

    goto/16 :goto_1

    :cond_9
    instance-of v5, v4, Ljt2/l$l;

    if-eqz v5, :cond_a

    new-instance v5, Ljt2/p$o;

    check-cast v4, Ljt2/l$l;

    invoke-virtual {v4}, Ljt2/l$l;->a()D

    move-result-wide v6

    invoke-virtual {v4}, Ljt2/l$l;->b()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    move-result-object v4

    invoke-direct {v5, v6, v7, v4}, Ljt2/p$o;-><init>(DLcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;)V

    new-instance v4, La6/u;

    const/4 v6, 0x1

    invoke-direct {v4, v5, v6}, La6/u;-><init>(Ljava/lang/Object;I)V

    goto/16 :goto_1

    :cond_a
    instance-of v5, v4, Ljt2/l$o;

    if-eqz v5, :cond_b

    new-instance v5, Ljt2/p$u;

    check-cast v4, Ljt2/l$o;

    invoke-virtual {v4}, Ljt2/l$o;->a()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4}, Ljt2/l$o;->c()Z

    move-result v7

    invoke-virtual {v4}, Ljt2/l$o;->b()I

    move-result v4

    invoke-direct {v5, v6, v7, v4}, Ljt2/p$u;-><init>(Ljava/lang/String;ZI)V

    new-instance v4, La6/u;

    const/4 v6, 0x1

    invoke-direct {v4, v5, v6}, La6/u;-><init>(Ljava/lang/Object;I)V

    goto/16 :goto_1

    :cond_b
    instance-of v5, v4, Ljt2/l$p;

    if-eqz v5, :cond_c

    new-instance v5, Ljt2/p$v;

    check-cast v4, Ljt2/l$p;

    invoke-virtual {v4}, Ljt2/l$p;->a()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4}, Ljt2/l$p;->d()Z

    move-result v7

    invoke-virtual {v4}, Ljt2/l$p;->c()Z

    move-result v8

    invoke-virtual {v4}, Ljt2/l$p;->b()I

    move-result v4

    invoke-direct {v5, v6, v7, v8, v4}, Ljt2/p$v;-><init>(Ljava/lang/String;ZZI)V

    new-instance v4, La6/u;

    const/4 v6, 0x1

    invoke-direct {v4, v5, v6}, La6/u;-><init>(Ljava/lang/Object;I)V

    goto/16 :goto_1

    :cond_c
    instance-of v5, v4, Ljt2/l$e;

    if-eqz v5, :cond_d

    new-instance v5, Ljt2/p$h;

    check-cast v4, Ljt2/l$e;

    invoke-virtual {v4}, Ljt2/l$e;->a()Ljt2/c;

    move-result-object v4

    invoke-direct {v5, v4}, Ljt2/p$h;-><init>(Ljt2/c;)V

    new-instance v4, La6/u;

    const/4 v6, 0x1

    invoke-direct {v4, v5, v6}, La6/u;-><init>(Ljava/lang/Object;I)V

    goto/16 :goto_1

    :cond_d
    instance-of v5, v4, Ljt2/l$c;

    if-eqz v5, :cond_e

    new-instance v5, Ljt2/p$e;

    check-cast v4, Ljt2/l$c;

    invoke-virtual {v4}, Ljt2/l$c;->a()Ljt2/c;

    move-result-object v6

    invoke-virtual {v4}, Ljt2/l$c;->b()I

    move-result v4

    invoke-direct {v5, v6, v4}, Ljt2/p$e;-><init>(Ljt2/c;I)V

    new-instance v4, La6/u;

    const/4 v6, 0x1

    invoke-direct {v4, v5, v6}, La6/u;-><init>(Ljava/lang/Object;I)V

    goto/16 :goto_1

    :cond_e
    instance-of v5, v4, Ljt2/l$j;

    if-eqz v5, :cond_f

    new-instance v5, Ljt2/p$l;

    check-cast v4, Ljt2/l$j;

    invoke-virtual {v4}, Ljt2/l$j;->a()Ljt2/c;

    move-result-object v4

    invoke-direct {v5, v4}, Ljt2/p$l;-><init>(Ljt2/c;)V

    new-instance v4, La6/u;

    const/4 v6, 0x1

    invoke-direct {v4, v5, v6}, La6/u;-><init>(Ljava/lang/Object;I)V

    goto/16 :goto_1

    :cond_f
    instance-of v5, v4, Ljt2/l$n;

    if-eqz v5, :cond_10

    new-instance v5, Ljt2/p$t;

    check-cast v4, Ljt2/l$n;

    invoke-virtual {v4}, Ljt2/l$n;->a()Ljt2/c;

    move-result-object v6

    invoke-virtual {v4}, Ljt2/l$n;->b()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v5, v6, v4}, Ljt2/p$t;-><init>(Ljt2/c;Ljava/lang/String;)V

    new-instance v4, La6/u;

    const/4 v6, 0x1

    invoke-direct {v4, v5, v6}, La6/u;-><init>(Ljava/lang/Object;I)V

    goto :goto_1

    :cond_10
    instance-of v5, v4, Ljt2/l$r;

    if-eqz v5, :cond_11

    new-instance v5, Ljt2/p$x;

    check-cast v4, Ljt2/l$r;

    invoke-virtual {v4}, Ljt2/l$r;->a()Ljt2/c;

    move-result-object v6

    invoke-virtual {v4}, Ljt2/l$r;->b()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v5, v6, v4}, Ljt2/p$x;-><init>(Ljt2/c;Ljava/lang/String;)V

    new-instance v4, La6/u;

    const/4 v6, 0x1

    invoke-direct {v4, v5, v6}, La6/u;-><init>(Ljava/lang/Object;I)V

    goto :goto_1

    :cond_11
    sget-object v5, Ljt2/l$h;->a:Ljt2/l$h;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_12

    sget-object v4, Ljt2/p$j;->a:Ljt2/p$j;

    new-instance v5, La6/u;

    const/4 v6, 0x1

    invoke-direct {v5, v4, v6}, La6/u;-><init>(Ljava/lang/Object;I)V

    goto/16 :goto_0

    :cond_12
    sget-object v5, Ljt2/l$i;->a:Ljt2/l$i;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_13

    sget-object v4, Ljt2/p$k;->a:Ljt2/p$k;

    new-instance v5, La6/u;

    const/4 v6, 0x1

    invoke-direct {v5, v4, v6}, La6/u;-><init>(Ljava/lang/Object;I)V

    goto/16 :goto_0

    :cond_13
    instance-of v5, v4, Ljt2/l$b;

    if-eqz v5, :cond_15

    iget-object v5, v0, Ljt2/k$a;->z:Ljt2/k;

    invoke-static {v5}, Ljt2/k;->c(Ljt2/k;)Ljt2/f;

    move-result-object v5

    new-instance v6, Ljt2/l$b;

    check-cast v4, Ljt2/l$b;

    invoke-virtual {v4}, Ljt2/l$b;->a()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v6, v4}, Ljt2/l$b;-><init>(Ljava/lang/String;)V

    new-instance v4, La6/u;

    const/4 v7, 0x1

    invoke-direct {v4, v6, v7}, La6/u;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v5, v4}, Ljt2/f;->interact(Lec3/l;)Lec3/l;

    move-result-object v4

    :goto_1
    const/4 v5, 0x0

    iput-object v5, v0, Ljt2/k$a;->x:Ljava/lang/Object;

    iput-object v5, v0, Ljt2/k$a;->y:Ljava/lang/Object;

    iput v3, v0, Ljt2/k$a;->w:I

    invoke-static {v2, v4, v0}, Lec3/v;->w(Lec3/m;Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_14

    return-object v1

    :cond_14
    :goto_2
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :cond_15
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method
