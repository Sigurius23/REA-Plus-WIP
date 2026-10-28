.class public final Luf/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lyf/e;


# instance fields
.field public final a:Lyf/e;

.field public final b:La30/w0;


# direct methods
.method public constructor <init>(Lyf/e;La30/w0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Luf/s;->a:Lyf/e;

    iput-object p2, p0, Luf/s;->b:La30/w0;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;Ls83/c;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Luf/u;

    invoke-virtual {p0, p1, p2}, Luf/s;->b(Luf/u;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final b(Luf/u;Lq83/d;)Ljava/lang/Object;
    .locals 22

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v0, p2

    iget-object v3, v1, Luf/s;->b:La30/w0;

    iget-object v4, v3, La30/w0;->y:Ljava/lang/Object;

    check-cast v4, Ljava/util/List;

    instance-of v5, v0, Luf/r;

    if-eqz v5, :cond_0

    move-object v5, v0

    check-cast v5, Luf/r;

    iget v6, v5, Luf/r;->E:I

    const/high16 v7, -0x80000000

    and-int v8, v6, v7

    if-eqz v8, :cond_0

    sub-int/2addr v6, v7

    iput v6, v5, Luf/r;->E:I

    goto :goto_0

    :cond_0
    new-instance v5, Luf/r;

    check-cast v0, Ls83/c;

    invoke-direct {v5, v1, v0}, Luf/r;-><init>(Luf/s;Ls83/c;)V

    :goto_0
    iget-object v0, v5, Luf/r;->y:Ljava/lang/Object;

    sget-object v6, Lr83/a;->w:Lr83/a;

    iget v7, v5, Luf/r;->E:I

    sget-object v8, Luf/f0;->a:Luf/f0;

    sget-object v9, Ll83/a0;->a:Ll83/a0;

    const/4 v10, 0x3

    const/4 v11, 0x2

    const/4 v12, 0x1

    const-string v13, "log<T> cannot be used on an anonymous object"

    const-class v14, Luf/s;

    const/4 v15, 0x0

    if-eqz v7, :cond_5

    if-eq v7, v12, :cond_4

    if-eq v7, v11, :cond_3

    if-ne v7, v10, :cond_2

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v0, Ll83/n;

    iget-object v0, v0, Ll83/n;->w:Ljava/lang/Object;

    :cond_1
    move-object/from16 v18, v0

    goto/16 :goto_9

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    iget-object v2, v5, Luf/r;->x:Lkotlin/time/Duration;

    iget-object v7, v5, Luf/r;->w:Luf/f0;

    :try_start_0
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Lkotlinx/coroutines/TimeoutCancellationException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_4

    :catchall_0
    move-exception v0

    goto/16 :goto_6

    :catch_0
    move-exception v0

    goto/16 :goto_5

    :cond_4
    :try_start_1
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto/16 :goto_4

    :cond_5
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-interface {v5}, Lq83/d;->getContext()Lq83/j;

    move-result-object v0

    new-instance v7, Lu91/a;

    const/4 v10, 0x7

    invoke-direct {v7, v10}, Lu91/a;-><init>(I)V

    sget-object v10, Log/b;->E:Log/b;

    sget-object v11, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v11, v14}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v11

    invoke-interface {v11}, Lj93/d;->getQualifiedName()Ljava/lang/String;

    move-result-object v11

    if-eqz v11, :cond_18

    invoke-static {v0, v10, v11, v15, v7}, Lvd/f;->A(Lq83/j;Log/b;Ljava/lang/String;Ljava/lang/Throwable;Lc93/a;)V

    iget-object v0, v2, Luf/u;->b:Ljava/lang/Object;

    iput-object v0, v3, La30/w0;->E:Ljava/lang/Object;

    new-instance v7, Lsf/c;

    const-string v10, "null cannot be cast to non-null type kotlin.Any"

    invoke-static {v0, v10}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v10, v3, La30/w0;->x:Ljava/lang/Object;

    check-cast v10, Ldg/a;

    invoke-direct {v7, v10, v0}, Lsf/c;-><init>(Ldg/a;Ljava/lang/Object;)V

    move-object v0, v4

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    move-object v11, v9

    :goto_1
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcf/a;

    :try_start_2
    invoke-interface {v0, v7}, Lcf/a;->f(Lsf/c;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    move-object v0, v9

    goto :goto_2

    :catchall_1
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
    const/4 v12, 0x1

    goto :goto_1

    :cond_8
    instance-of v0, v11, Ll83/m;

    if-nez v0, :cond_c

    :try_start_3
    check-cast v11, Ll83/a0;

    iget-object v0, v2, Luf/u;->a:Ldg/a;

    sget-object v7, Luf/i;->b:Lgf/a;

    invoke-virtual {v0, v7}, Ldg/a;->b(Lgf/a;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lkotlin/time/Duration;

    if-nez v7, :cond_9

    iget-object v0, v1, Luf/s;->a:Lyf/e;

    iput-object v15, v5, Luf/r;->w:Luf/f0;

    iput-object v15, v5, Luf/r;->x:Lkotlin/time/Duration;

    const/4 v7, 0x1

    iput v7, v5, Luf/r;->E:I

    invoke-interface {v0, v2, v5}, Lyf/e;->a(Ljava/lang/Object;Ls83/c;)Ljava/lang/Object;

    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-ne v0, v6, :cond_a

    goto :goto_8

    :cond_9
    :try_start_4
    invoke-virtual {v7}, Lkotlin/time/Duration;->unbox-impl()J

    move-result-wide v10

    new-instance v0, Ls40/c0;

    const/16 v12, 0xf

    invoke-direct {v0, v15, v1, v2, v12}, Ls40/c0;-><init>(Lq83/d;Lyf/e;Luf/u;I)V

    iput-object v8, v5, Luf/r;->w:Luf/f0;

    iput-object v7, v5, Luf/r;->x:Lkotlin/time/Duration;

    const/4 v2, 0x2

    iput v2, v5, Luf/r;->E:I

    invoke-static {v10, v11, v0, v5}, Lbc3/k2;->c(JLc93/m;Ls83/c;)Ljava/lang/Object;

    move-result-object v0
    :try_end_4
    .catch Lkotlinx/coroutines/TimeoutCancellationException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-ne v0, v6, :cond_a

    goto :goto_8

    :cond_a
    :goto_4
    move-object v11, v0

    goto :goto_7

    :catch_1
    move-exception v0

    move-object v2, v7

    move-object v7, v8

    :goto_5
    :try_start_5
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {v7}, Luf/g0;->getDescription()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v11, " exceeded configured timeout of "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v7, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_b

    sget-object v7, Luf/i0;->w:Luf/i0;

    invoke-interface {v7, v2, v0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Throwable;

    throw v0

    :cond_b
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :goto_6
    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    goto :goto_4

    :cond_c
    :goto_7
    iput-object v15, v5, Luf/r;->w:Luf/f0;

    iput-object v15, v5, Luf/r;->x:Lkotlin/time/Duration;

    const/4 v2, 0x3

    iput v2, v5, Luf/r;->E:I

    invoke-virtual {v3, v11, v5}, La30/w0;->x(Ljava/lang/Object;Ls83/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v6, :cond_1

    :goto_8
    return-object v6

    :goto_9
    iget-object v0, v3, La30/w0;->E:Ljava/lang/Object;

    if-eqz v0, :cond_17

    new-instance v16, Lsf/b;

    iget-object v2, v3, La30/w0;->F:Ljava/lang/Object;

    move-object/from16 v19, v2

    check-cast v19, Lvf/g;

    iget-object v2, v3, La30/w0;->G:Ljava/lang/Object;

    move-object/from16 v20, v2

    check-cast v20, Lwf/a;

    iget-object v2, v3, La30/w0;->x:Ljava/lang/Object;

    move-object/from16 v21, v2

    check-cast v21, Ldg/a;

    move-object/from16 v17, v0

    invoke-direct/range {v16 .. v21}, Lsf/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lvf/g;Lwf/a;Ldg/a;)V

    move-object/from16 v2, v16

    check-cast v4, Ljava/lang/Iterable;

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    move-object v6, v9

    :goto_a
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcf/a;

    :try_start_6
    invoke-interface {v0, v2}, Lcf/a;->l(Lsf/b;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    move-object v0, v9

    goto :goto_b

    :catchall_2
    move-exception v0

    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    :goto_b
    invoke-static {v0}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v7

    if-nez v7, :cond_d

    check-cast v0, Ll83/a0;

    goto :goto_a

    :cond_d
    invoke-static {v6}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_e

    invoke-static {v7, v0}, Lpf/c;->g(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :cond_e
    invoke-static {v7}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v6

    goto :goto_a

    :cond_f
    invoke-static {v6}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_10

    check-cast v6, Ll83/a0;

    iget-object v0, v2, Lsf/b;->b:Ljava/lang/Object;

    iget-object v2, v3, La30/w0;->z:Ljava/lang/Object;

    check-cast v2, Luf/v;

    iget-object v2, v2, Luf/v;->b:Lj93/d;

    instance-of v3, v0, Ll83/m;

    if-nez v3, :cond_12

    const-string v3, "readAfterExecution"

    invoke-static {v3, v2, v0}, La30/w0;->n(Ljava/lang/String;Lj93/d;Ljava/lang/Object;)V

    goto :goto_c

    :cond_10
    invoke-static/range {v18 .. v18}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_11

    invoke-static {v0, v2}, Lpf/c;->g(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :cond_11
    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    :cond_12
    :goto_c
    instance-of v2, v0, Ll83/m;

    if-nez v2, :cond_14

    invoke-interface {v5}, Lq83/d;->getContext()Lq83/j;

    move-result-object v2

    new-instance v3, Lu91/a;

    const/16 v4, 0x8

    invoke-direct {v3, v4}, Lu91/a;-><init>(I)V

    sget-object v4, Log/b;->E:Log/b;

    sget-object v5, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v5, v14}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-interface {v5}, Lj93/d;->getQualifiedName()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_13

    invoke-static {v2, v4, v5, v15, v3}, Lvd/f;->A(Lq83/j;Log/b;Ljava/lang/String;Ljava/lang/Throwable;Lc93/a;)V

    goto :goto_d

    :cond_13
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, v13}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_14
    if-eqz v2, :cond_16

    invoke-interface {v5}, Lq83/d;->getContext()Lq83/j;

    move-result-object v2

    invoke-static {v0}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v3

    new-instance v4, Lu91/a;

    const/16 v5, 0x9

    invoke-direct {v4, v5}, Lu91/a;-><init>(I)V

    sget-object v5, Log/b;->E:Log/b;

    sget-object v6, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v6, v14}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-interface {v6}, Lj93/d;->getQualifiedName()Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_15

    invoke-static {v2, v5, v6, v3, v4}, Lvd/f;->A(Lq83/j;Log/b;Ljava/lang/String;Ljava/lang/Throwable;Lc93/a;)V

    goto :goto_d

    :cond_15
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, v13}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_16
    :goto_d
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v0

    :cond_17
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Required value was null."

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_18
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, v13}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
