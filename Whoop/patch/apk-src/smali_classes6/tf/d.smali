.class public final Ltf/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lag/b;


# instance fields
.field public final a:Leg/o;

.field public final b:Lgg/g;

.field public final c:La30/w0;


# direct methods
.method public constructor <init>(Leg/o;Lgg/g;La30/w0;)V
    .locals 1

    const-string v0, "strategy"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "policy"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltf/d;->a:Leg/o;

    iput-object p2, p0, Ltf/d;->b:Lgg/g;

    iput-object p3, p0, Ltf/d;->c:La30/w0;

    return-void
.end method

.method public static final b(Ltf/d;Luf/u;Lyf/e;ILs83/c;)Ljava/lang/Object;
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p3

    move-object/from16 v4, p4

    iget-object v5, v0, Ltf/d;->c:La30/w0;

    iget-object v6, v5, La30/w0;->y:Ljava/lang/Object;

    check-cast v6, Ljava/util/List;

    instance-of v7, v4, Ltf/c;

    if-eqz v7, :cond_0

    move-object v7, v4

    check-cast v7, Ltf/c;

    iget v8, v7, Ltf/c;->G:I

    const/high16 v9, -0x80000000

    and-int v10, v8, v9

    if-eqz v10, :cond_0

    sub-int/2addr v8, v9

    iput v8, v7, Ltf/c;->G:I

    goto :goto_0

    :cond_0
    new-instance v7, Ltf/c;

    invoke-direct {v7, v0, v4}, Ltf/c;-><init>(Ltf/d;Ls83/c;)V

    :goto_0
    iget-object v0, v7, Ltf/c;->E:Ljava/lang/Object;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v8, v7, Ltf/c;->G:I

    const-string v9, "Required value was null."

    sget-object v10, Ll83/a0;->a:Ll83/a0;

    const/4 v11, 0x3

    const/4 v12, 0x2

    const/4 v13, 0x1

    const/4 v14, 0x0

    if-eqz v8, :cond_5

    if-eq v8, v13, :cond_4

    if-eq v8, v12, :cond_3

    if-ne v8, v11, :cond_2

    iget-object v1, v7, Ltf/c;->y:Ljava/lang/Object;

    check-cast v1, Lvf/a;

    iget-object v2, v7, Ltf/c;->x:Ljava/lang/Object;

    check-cast v2, Lrf/l;

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v0, Ll83/n;

    iget-object v0, v0, Ll83/n;->w:Ljava/lang/Object;

    :cond_1
    move-object/from16 v17, v0

    goto/16 :goto_a

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    iget v1, v7, Ltf/c;->z:I

    iget-object v2, v7, Ltf/c;->y:Ljava/lang/Object;

    check-cast v2, Lkotlin/time/Duration;

    iget-object v3, v7, Ltf/c;->x:Ljava/lang/Object;

    check-cast v3, Luf/g0;

    iget-object v8, v7, Ltf/c;->w:Luf/u;

    :try_start_0
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Lkotlinx/coroutines/TimeoutCancellationException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move v3, v1

    move-object v1, v8

    goto/16 :goto_4

    :catchall_0
    move-exception v0

    move v3, v1

    move-object v1, v8

    goto/16 :goto_7

    :catch_0
    move-exception v0

    move-object v11, v3

    move v3, v1

    move-object v1, v8

    goto/16 :goto_5

    :cond_4
    iget v1, v7, Ltf/c;->z:I

    iget-object v2, v7, Ltf/c;->y:Ljava/lang/Object;

    check-cast v2, Lkotlin/time/Duration;

    iget-object v2, v7, Ltf/c;->x:Ljava/lang/Object;

    check-cast v2, Luf/g0;

    iget-object v2, v7, Ltf/c;->w:Luf/u;

    :try_start_1
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move v3, v1

    move-object v1, v2

    goto/16 :goto_4

    :catchall_1
    move-exception v0

    move v3, v1

    move-object v1, v2

    goto/16 :goto_7

    :cond_5
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v1, Luf/u;->b:Ljava/lang/Object;

    check-cast v0, Lvf/b;

    invoke-static {v0}, Ls93/h;->s(Lvf/b;)Lvf/g;

    move-result-object v0

    iput-object v14, v5, La30/w0;->G:Ljava/lang/Object;

    iget-object v8, v5, La30/w0;->E:Ljava/lang/Object;

    if-eqz v8, :cond_15

    new-instance v15, Lsf/e;

    iget-object v11, v5, La30/w0;->x:Ljava/lang/Object;

    check-cast v11, Ldg/a;

    invoke-direct {v15, v8, v0, v11}, Lsf/e;-><init>(Ljava/lang/Object;Lvf/a;Ldg/a;)V

    move-object v0, v6

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    move-object v11, v10

    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcf/a;

    :try_start_2
    invoke-interface {v0, v15}, Lcf/a;->b(Lsf/e;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    move-object v0, v10

    goto :goto_2

    :catchall_2
    move-exception v0

    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    :goto_2
    invoke-static {v0}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v12

    if-nez v12, :cond_6

    check-cast v0, Ll83/a0;

    goto :goto_3

    :cond_6
    invoke-static {v11}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-static {v12, v0}, Lpf/c;->g(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :cond_7
    invoke-static {v12}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v11

    :goto_3
    const/4 v12, 0x2

    goto :goto_1

    :cond_8
    instance-of v0, v11, Ll83/m;

    if-nez v0, :cond_d

    :try_start_3
    check-cast v11, Ll83/a0;

    iget-object v0, v1, Luf/u;->a:Ldg/a;

    sget-object v8, Luf/i;->a:Lgf/a;

    invoke-virtual {v0, v8}, Ldg/a;->b(Lgf/a;)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lkotlin/time/Duration;

    new-instance v11, Luf/e0;

    invoke-direct {v11, v3}, Luf/e0;-><init>(I)V

    if-nez v8, :cond_9

    iput-object v1, v7, Ltf/c;->w:Luf/u;

    iput-object v14, v7, Ltf/c;->x:Ljava/lang/Object;

    iput-object v14, v7, Ltf/c;->y:Ljava/lang/Object;

    iput v3, v7, Ltf/c;->z:I

    iput v13, v7, Ltf/c;->G:I

    invoke-interface {v2, v1, v7}, Lyf/e;->a(Ljava/lang/Object;Ls83/c;)Ljava/lang/Object;

    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    if-ne v0, v4, :cond_a

    goto/16 :goto_d

    :catchall_3
    move-exception v0

    goto :goto_7

    :cond_9
    :try_start_4
    invoke-virtual {v8}, Lkotlin/time/Duration;->unbox-impl()J

    move-result-wide v12

    new-instance v0, Ls40/c0;

    const/16 v15, 0xb

    invoke-direct {v0, v14, v2, v1, v15}, Ls40/c0;-><init>(Lq83/d;Lyf/e;Luf/u;I)V

    iput-object v1, v7, Ltf/c;->w:Luf/u;

    iput-object v11, v7, Ltf/c;->x:Ljava/lang/Object;

    iput-object v8, v7, Ltf/c;->y:Ljava/lang/Object;

    iput v3, v7, Ltf/c;->z:I

    const/4 v2, 0x2

    iput v2, v7, Ltf/c;->G:I

    invoke-static {v12, v13, v0, v7}, Lbc3/k2;->c(JLc93/m;Ls83/c;)Ljava/lang/Object;

    move-result-object v0
    :try_end_4
    .catch Lkotlinx/coroutines/TimeoutCancellationException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    if-ne v0, v4, :cond_a

    goto/16 :goto_d

    :cond_a
    :goto_4
    move-object v11, v0

    goto :goto_8

    :catch_1
    move-exception v0

    move-object v2, v8

    :goto_5
    :try_start_5
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {v11}, Luf/g0;->getDescription()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v8, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v12, " exceeded configured timeout of "

    invoke-virtual {v8, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    instance-of v8, v11, Luf/e0;

    if-nez v8, :cond_c

    sget-object v8, Luf/f0;->a:Luf/f0;

    invoke-virtual {v11, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_b

    sget-object v8, Luf/i0;->w:Luf/i0;

    goto :goto_6

    :cond_b
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_c
    sget-object v8, Luf/h0;->w:Luf/h0;

    :goto_6
    invoke-interface {v8, v2, v0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Throwable;

    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    :goto_7
    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    goto :goto_4

    :cond_d
    :goto_8
    iget-object v0, v1, Luf/u;->a:Ldg/a;

    sget-object v2, Luf/i;->d:Lgf/a;

    invoke-virtual {v0, v2}, Ldg/a;->b(Lgf/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-nez v0, :cond_e

    sget-object v0, Lm83/y;->w:Lm83/y;

    :cond_e
    add-int/lit8 v2, v3, -0x1

    invoke-static {v2, v0}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lrf/l;

    iget-object v0, v1, Luf/u;->b:Ljava/lang/Object;

    check-cast v0, Lvf/b;

    invoke-static {v0}, Ls93/h;->s(Lvf/b;)Lvf/g;

    move-result-object v1

    if-eqz v2, :cond_f

    iget-object v0, v2, Lrf/l;->x:Lwf/a;

    goto :goto_9

    :cond_f
    move-object v0, v14

    :goto_9
    iput-object v14, v7, Ltf/c;->w:Luf/u;

    iput-object v2, v7, Ltf/c;->x:Ljava/lang/Object;

    iput-object v1, v7, Ltf/c;->y:Ljava/lang/Object;

    iput v3, v7, Ltf/c;->z:I

    const/4 v3, 0x3

    iput v3, v7, Ltf/c;->G:I

    invoke-virtual {v5, v11, v1, v0, v7}, La30/w0;->v(Ljava/lang/Object;Lvf/g;Lwf/a;Ls83/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v4, :cond_1

    goto :goto_d

    :goto_a
    if-eqz v2, :cond_10

    iget-object v14, v2, Lrf/l;->x:Lwf/a;

    :cond_10
    const-string v0, "httpRequest"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v5, La30/w0;->E:Ljava/lang/Object;

    if-eqz v0, :cond_14

    iput-object v14, v5, La30/w0;->G:Ljava/lang/Object;

    new-instance v15, Lsf/a;

    iget-object v2, v5, La30/w0;->x:Ljava/lang/Object;

    move-object/from16 v20, v2

    check-cast v20, Ldg/a;

    move-object/from16 v16, v0

    move-object/from16 v18, v1

    move-object/from16 v19, v14

    invoke-direct/range {v15 .. v20}, Lsf/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lvf/a;Lwf/a;Ldg/a;)V

    check-cast v6, Ljava/lang/Iterable;

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    move-object v2, v10

    :goto_b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_13

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcf/a;

    :try_start_6
    invoke-interface {v0, v15}, Lcf/a;->k(Lsf/a;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    move-object v0, v10

    goto :goto_c

    :catchall_4
    move-exception v0

    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    :goto_c
    invoke-static {v0}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v3

    if-nez v3, :cond_11

    check-cast v0, Ll83/a0;

    goto :goto_b

    :cond_11
    invoke-static {v2}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_12

    invoke-static {v3, v0}, Lpf/c;->g(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :cond_12
    invoke-static {v3}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v2

    goto :goto_b

    :cond_13
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v4, v17

    :goto_d
    return-object v4

    :cond_14
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v9}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_15
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v9}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;Lyf/e;Ls83/c;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Luf/u;

    invoke-virtual {p0, p1, p2, p3}, Ltf/d;->c(Luf/u;Lyf/e;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final c(Luf/u;Lyf/e;Lq83/d;)Ljava/lang/Object;
    .locals 13

    move-object/from16 v1, p3

    instance-of v3, v1, Ltf/b;

    if-eqz v3, :cond_0

    move-object v3, v1

    check-cast v3, Ltf/b;

    iget v4, v3, Ltf/b;->F:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Ltf/b;->F:I

    :goto_0
    move-object v7, v3

    goto :goto_1

    :cond_0
    new-instance v3, Ltf/b;

    check-cast v1, Ls83/c;

    invoke-direct {v3, p0, v1}, Ltf/b;-><init>(Ltf/d;Ls83/c;)V

    goto :goto_0

    :goto_1
    iget-object v1, v7, Ltf/b;->z:Ljava/lang/Object;

    sget-object v8, Lr83/a;->w:Lr83/a;

    iget v3, v7, Ltf/b;->F:I

    const-string v9, "<this>"

    const/4 v10, 0x3

    const/4 v11, 0x2

    const/4 v4, 0x1

    if-eqz v3, :cond_4

    if-eq v3, v4, :cond_3

    if-eq v3, v11, :cond_2

    if-ne v3, v10, :cond_1

    iget-object v3, v7, Ltf/b;->y:Lrg/f;

    :try_start_0
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_7

    :catchall_0
    move-exception v0

    goto/16 :goto_b

    :catch_0
    move-exception v0

    goto/16 :goto_9

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_3
    iget-object v0, v7, Ltf/b;->x:Lyf/e;

    iget-object v3, v7, Ltf/b;->w:Luf/u;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v5, v0

    move-object v0, v3

    goto :goto_2

    :cond_4
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, p1, Luf/u;->b:Ljava/lang/Object;

    check-cast v1, Lvf/b;

    invoke-static {v1, v9}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lvf/g;

    invoke-direct {v3, v1, v4}, Lvf/g;-><init>(Lvf/b;Z)V

    iput-object p1, v7, Ltf/b;->w:Luf/u;

    iput-object p2, v7, Ltf/b;->x:Lyf/e;

    iput v4, v7, Ltf/b;->F:I

    iget-object v5, p0, Ltf/d;->c:La30/w0;

    invoke-virtual {v5, v3, v7}, La30/w0;->z(Lvf/g;Ls83/c;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v8, :cond_5

    goto/16 :goto_6

    :cond_5
    move-object v0, p1

    move-object v5, p2

    move-object v1, v3

    :goto_2
    check-cast v1, Lvf/a;

    invoke-static {v1}, Ls93/k;->i(Lvf/a;)Lvf/b;

    move-result-object v1

    invoke-static {v0, v1}, Luf/u;->a(Luf/u;Ljava/lang/Object;)Luf/u;

    move-result-object v3

    new-instance v1, Lkotlin/jvm/internal/e0;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput v4, v1, Lkotlin/jvm/internal/e0;->w:I

    iget-object v0, v3, Luf/u;->b:Ljava/lang/Object;

    check-cast v0, Lvf/b;

    iget-object v0, v0, Lvf/b;->z:Lmf/l;

    invoke-virtual {v0}, Lmf/l;->c()Z

    move-result v0

    const/4 v12, 0x0

    if-nez v0, :cond_9

    new-instance v10, Lpg3/p;

    iget-object v0, p0, Ltf/d;->b:Lgg/g;

    invoke-interface {v7}, Lq83/d;->getContext()Lq83/j;

    move-result-object v4

    invoke-direct {v10, v0, v4}, Lpg3/p;-><init>(Lgg/g;Lq83/j;)V

    new-instance v0, Lt23/u3;

    move-object v4, v5

    const/4 v5, 0x0

    const/4 v6, 0x1

    move-object v2, p0

    invoke-direct/range {v0 .. v6}, Lt23/u3;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput-object v12, v7, Ltf/b;->w:Luf/u;

    iput-object v12, v7, Ltf/b;->x:Lyf/e;

    iput v11, v7, Ltf/b;->F:I

    iget-object v1, p0, Ltf/d;->a:Leg/o;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v10, v0, v7}, Leg/o;->g(Leg/o;Lpg3/p;Lt23/u3;Ls83/c;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v8, :cond_6

    goto/16 :goto_6

    :cond_6
    :goto_3
    check-cast v1, Leg/i;

    invoke-static {v1, v9}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, v1, Leg/h;

    if-eqz v0, :cond_7

    check-cast v1, Leg/h;

    iget-object v0, v1, Leg/h;->b:Ljava/lang/Object;

    goto/16 :goto_8

    :cond_7
    instance-of v0, v1, Leg/g;

    if-eqz v0, :cond_8

    check-cast v1, Leg/g;

    iget-object v0, v1, Leg/g;->b:Ljava/lang/Throwable;

    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    goto/16 :goto_8

    :cond_8
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_9
    move-object v4, v5

    sget-object v0, Lrg/d;->w:Lrg/d;

    const-class v0, Ltf/d;

    sget-object v5, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v5, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-interface {v0}, Lj93/d;->getQualifiedName()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_f

    invoke-interface {v7}, Lq83/d;->getContext()Lq83/j;

    move-result-object v0

    invoke-static {v0}, Lbp/b;->w(Lq83/j;)Lmg/h;

    move-result-object v0

    invoke-interface {v0}, Lmg/h;->d()Lrg/n;

    move-result-object v0

    check-cast v0, Lrg/l;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v7}, Lq83/d;->getContext()Lq83/j;

    move-result-object v0

    invoke-static {v0}, Lds/q;->z(Lq83/j;)Lng/f;

    sget-object v0, Lrg/h;->s:Lrg/g;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object v6, v1

    sget-object v1, Lrg/g;->b:Lrg/f;

    :try_start_1
    invoke-interface {v7}, Lq83/d;->getContext()Lq83/j;

    move-result-object v0

    sget-object v5, Lmg/i;->x:Lg73/d;

    invoke-interface {v0, v5}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object v0

    check-cast v0, Lmg/i;

    if-eqz v0, :cond_a

    iget-object v0, v0, Lmg/i;->w:Lmg/h;

    if-eqz v0, :cond_a

    invoke-interface {v0}, Lmg/h;->b()Lng/d;

    move-result-object v0

    if-eqz v0, :cond_a

    sget-object v0, Lng/a;->a:Lng/f;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_4

    :catchall_1
    move-exception v0

    move-object v3, v1

    goto/16 :goto_b

    :catch_1
    move-exception v0

    move-object v3, v1

    goto :goto_9

    :cond_a
    move-object v0, v12

    :goto_4
    sget-object v5, Lq83/k;->w:Lq83/k;

    if-eqz v0, :cond_b

    :try_start_2
    new-instance v9, Lng/h;

    invoke-direct {v9, v0}, Lng/h;-><init>(Lng/f;)V

    goto :goto_5

    :cond_b
    invoke-interface {v7}, Lq83/d;->getContext()Lq83/j;

    move-result-object v0

    sget-object v9, Lng/h;->x:Lng/f;

    invoke-interface {v0, v9}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lng/h;

    if-eqz v9, :cond_c

    goto :goto_5

    :cond_c
    move-object v9, v5

    :goto_5
    new-instance v0, Lrg/i;

    invoke-direct {v0, v1}, Lrg/i;-><init>(Lrg/h;)V

    invoke-interface {v0, v9}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object v0

    invoke-interface {v0, v5}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object v9

    new-instance v0, Ltf/a;

    const/4 v2, 0x0

    move-object v5, v4

    move-object v4, v3

    move-object v3, p0

    invoke-direct/range {v0 .. v6}, Ltf/a;-><init>(Lrg/h;Lq83/d;Ltf/d;Luf/u;Lyf/e;Lkotlin/jvm/internal/e0;)V

    iput-object v12, v7, Ltf/b;->w:Luf/u;

    iput-object v12, v7, Ltf/b;->x:Lyf/e;

    iput-object v1, v7, Ltf/b;->y:Lrg/f;

    iput v10, v7, Ltf/b;->F:I

    invoke-static {v9, v0, v7}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-ne v0, v8, :cond_d

    :goto_6
    return-object v8

    :cond_d
    move-object v3, v1

    move-object v1, v0

    :goto_7
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast v1, Ll83/n;

    iget-object v0, v1, Ll83/n;->w:Ljava/lang/Object;

    :goto_8
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v0

    :goto_9
    :try_start_3
    instance-of v1, v0, Ljava/util/concurrent/CancellationException;

    if-eqz v1, :cond_e

    const-string v1, "cancelled"

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v3, v1, v2}, Lrg/j;->n(Lrg/h;Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_a

    :cond_e
    sget-object v1, Lrg/e;->w:[Lrg/e;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v3, v0}, Lrg/j;->m(Lrg/h;Ljava/lang/Exception;)V

    :goto_a
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_b
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    throw v0

    :cond_f
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "withSpan<T> cannot be used on an anonymous object"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
