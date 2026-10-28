.class public final Lz20/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lb10/c1;

.field public final b:Lk83/a;

.field public final c:Lqy/d;

.field public final d:Lb20/f;

.field public final e:Lq83/j;

.field public final f:Ljava/util/Set;


# direct methods
.method public constructor <init>(Lb10/c1;Lk83/a;Lqy/d;Lb20/f;Lq83/j;Ljava/util/Set;)V
    .locals 1

    const-string v0, "stripeRepository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lazyPaymentConfig"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorReporter"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workContext"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "productUsageTokens"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz20/g;->a:Lb10/c1;

    iput-object p2, p0, Lz20/g;->b:Lk83/a;

    iput-object p3, p0, Lz20/g;->c:Lqy/d;

    iput-object p4, p0, Lz20/g;->d:Lb20/f;

    iput-object p5, p0, Lz20/g;->e:Lq83/j;

    iput-object p6, p0, Lz20/g;->f:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public final a(Lz20/h;Ljava/lang/String;ZLs83/c;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p4, Lz20/a;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lz20/a;

    iget v1, v0, Lz20/a;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lz20/a;->E:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lz20/a;

    invoke-direct {v0, p0, p4}, Lz20/a;-><init>(Lz20/g;Ls83/c;)V

    goto :goto_0

    :goto_1
    iget-object p4, v6, Lz20/a;->y:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Lz20/a;->E:I

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v4, :cond_1

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_2

    :cond_1
    iget-object p2, v6, Lz20/a;->x:Ljava/lang/String;

    iget-object p1, v6, Lz20/a;->w:Lz20/g;

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p4, Ll83/n;

    iget-object p3, p4, Ll83/n;->w:Ljava/lang/Object;

    goto :goto_4

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    if-eqz p3, :cond_5

    iput-object p0, v6, Lz20/a;->w:Lz20/g;

    iput-object p2, v6, Lz20/a;->x:Ljava/lang/String;

    iput v4, v6, Lz20/a;->E:I

    invoke-virtual {p0, p0, p1, p2, v6}, Lz20/g;->b(Lz20/g;Lz20/h;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    goto :goto_2

    :cond_4
    move-object p3, p1

    goto :goto_3

    :cond_5
    move p3, v2

    iget-object v2, p1, Lz20/h;->c:Ljava/lang/String;

    iget-object p1, p1, Lz20/h;->b:Ljava/lang/String;

    const/4 p4, 0x4

    iget-object v1, p0, Lz20/g;->b:Lk83/a;

    iget-object v4, p0, Lz20/g;->a:Lb10/c1;

    if-eqz v2, :cond_6

    new-instance v5, Lyy/f;

    invoke-interface {v1}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lux/y;

    iget-object p3, p3, Lux/y;->x:Ljava/lang/String;

    invoke-direct {v5, p1, p3, p4}, Lyy/f;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    iput-object p0, v6, Lz20/a;->w:Lz20/g;

    iput-object p2, v6, Lz20/a;->x:Ljava/lang/String;

    iput v3, v6, Lz20/a;->E:I

    move-object v1, v4

    check-cast v1, Lb10/z0;

    iget-object v3, p0, Lz20/g;->f:Ljava/util/Set;

    move-object v4, p2

    invoke-virtual/range {v1 .. v6}, Lb10/z0;->v(Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;Lyy/f;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    goto :goto_2

    :cond_6
    new-instance v2, Lyy/f;

    invoke-interface {v1}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lux/y;

    iget-object v1, v1, Lux/y;->x:Ljava/lang/String;

    invoke-direct {v2, p1, v1, p4}, Lyy/f;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    iput-object p0, v6, Lz20/a;->w:Lz20/g;

    iput-object p2, v6, Lz20/a;->x:Ljava/lang/String;

    iput p3, v6, Lz20/a;->E:I

    check-cast v4, Lb10/z0;

    iget-object p1, p0, Lz20/g;->f:Ljava/util/Set;

    invoke-virtual {v4, p2, p1, v6, v2}, Lb10/z0;->u(Ljava/lang/String;Ljava/util/Set;Ls83/c;Lyy/f;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v0, :cond_7

    :goto_2
    return-object v0

    :cond_7
    :goto_3
    move-object p1, p0

    :goto_4
    invoke-static {p3}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p4

    if-eqz p4, :cond_8

    iget-object p1, p1, Lz20/g;->c:Lqy/d;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Failed to detach payment method "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "."

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2, p4}, Lqy/d;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_8
    return-object p3
.end method

.method public final b(Lz20/g;Lz20/h;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p4

    instance-of v4, v3, Lz20/b;

    if-eqz v4, :cond_0

    move-object v4, v3

    check-cast v4, Lz20/b;

    iget v5, v4, Lz20/b;->G:I

    const/high16 v6, -0x80000000

    and-int v7, v5, v6

    if-eqz v7, :cond_0

    sub-int/2addr v5, v6

    iput v5, v4, Lz20/b;->G:I

    goto :goto_0

    :cond_0
    new-instance v4, Lz20/b;

    invoke-direct {v4, v0, v3}, Lz20/b;-><init>(Lz20/g;Ls83/c;)V

    :goto_0
    iget-object v3, v4, Lz20/b;->E:Ljava/lang/Object;

    sget-object v5, Lr83/a;->w:Lr83/a;

    iget v6, v4, Lz20/b;->G:I

    const/4 v7, 0x4

    const/4 v8, 0x3

    const/4 v9, 0x2

    const/4 v10, 0x1

    const/4 v11, 0x0

    const/4 v12, 0x0

    if-eqz v6, :cond_5

    if-eq v6, v10, :cond_4

    if-eq v6, v9, :cond_3

    if-eq v6, v8, :cond_2

    if-ne v6, v7, :cond_1

    invoke-static {v3}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v3, Ll83/n;

    iget-object v1, v3, Ll83/n;->w:Ljava/lang/Object;

    return-object v1

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-object v1, v4, Lz20/b;->z:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    iget-object v2, v4, Lz20/b;->y:Ljava/lang/String;

    iget-object v6, v4, Lz20/b;->x:Lz20/h;

    iget-object v8, v4, Lz20/b;->w:Lz20/g;

    invoke-static {v3}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_7

    :cond_3
    invoke-static {v3}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v3, Ll83/n;

    iget-object v1, v3, Ll83/n;->w:Ljava/lang/Object;

    return-object v1

    :cond_4
    iget-object v1, v4, Lz20/b;->z:Ljava/lang/Object;

    check-cast v1, Lbc3/c0;

    iget-object v2, v4, Lz20/b;->y:Ljava/lang/String;

    iget-object v6, v4, Lz20/b;->x:Lz20/h;

    iget-object v10, v4, Lz20/b;->w:Lz20/g;

    invoke-static {v3}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v3, Ll83/n;

    iget-object v3, v3, Ll83/n;->w:Ljava/lang/Object;

    move-object v15, v3

    move-object v3, v1

    move-object v1, v2

    move-object v2, v6

    move-object v6, v15

    move-object v15, v10

    goto :goto_1

    :cond_5
    invoke-static {v3}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v3, v0, Lz20/g;->e:Lq83/j;

    invoke-static {v3}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object v3

    sget-object v6, Ly00/f4;->I:Ly00/f4;

    invoke-static {v6}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    iput-object v1, v4, Lz20/b;->w:Lz20/g;

    iput-object v2, v4, Lz20/b;->x:Lz20/h;

    move-object/from16 v13, p3

    iput-object v13, v4, Lz20/b;->y:Ljava/lang/String;

    iput-object v3, v4, Lz20/b;->z:Ljava/lang/Object;

    iput v10, v4, Lz20/b;->G:I

    invoke-virtual {v1, v2, v6, v11, v4}, Lz20/g;->c(Lz20/h;Ljava/util/List;ZLs83/c;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v5, :cond_6

    goto/16 :goto_8

    :cond_6
    move-object v15, v1

    move-object v1, v13

    :goto_1
    invoke-static {v6}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v10

    if-nez v10, :cond_13

    check-cast v6, Ljava/util/List;

    check-cast v6, Ljava/lang/Iterable;

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :cond_7
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_8

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    move-object v14, v13

    check-cast v14, Ly00/o4;

    iget-object v14, v14, Ly00/o4;->w:Ljava/lang/String;

    invoke-static {v14, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_7

    goto :goto_2

    :cond_8
    move-object v13, v12

    :goto_2
    check-cast v13, Ly00/o4;

    if-nez v13, :cond_a

    iput-object v12, v4, Lz20/b;->w:Lz20/g;

    iput-object v12, v4, Lz20/b;->x:Lz20/h;

    iput-object v12, v4, Lz20/b;->y:Ljava/lang/String;

    iput-object v12, v4, Lz20/b;->z:Ljava/lang/Object;

    iput v9, v4, Lz20/b;->G:I

    invoke-virtual {v15, v2, v1, v11, v4}, Lz20/g;->a(Lz20/h;Ljava/lang/String;ZLs83/c;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v5, :cond_9

    goto/16 :goto_8

    :cond_9
    return-object v1

    :cond_a
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_e

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    move-object v14, v10

    check-cast v14, Ly00/o4;

    iget-object v11, v14, Ly00/o4;->E:Ly00/f4;

    sget-object v7, Ly00/f4;->I:Ly00/f4;

    if-ne v11, v7, :cond_d

    iget-object v7, v14, Ly00/o4;->H:Ly00/z3;

    if-eqz v7, :cond_b

    iget-object v7, v7, Ly00/z3;->F:Ljava/lang/String;

    goto :goto_4

    :cond_b
    move-object v7, v12

    :goto_4
    iget-object v11, v13, Ly00/o4;->H:Ly00/z3;

    if-eqz v11, :cond_c

    iget-object v11, v11, Ly00/z3;->F:Ljava/lang/String;

    goto :goto_5

    :cond_c
    move-object v11, v12

    :goto_5
    invoke-static {v7, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_d

    iget-object v7, v14, Ly00/o4;->w:Ljava/lang/String;

    invoke-static {v7, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_d

    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_d
    const/4 v7, 0x4

    const/4 v11, 0x0

    goto :goto_3

    :cond_e
    new-instance v17, Ljava/util/ArrayList;

    invoke-direct/range {v17 .. v17}, Ljava/util/ArrayList;-><init>()V

    new-instance v6, Ljava/util/ArrayList;

    const/16 v7, 0xa

    invoke-static {v9, v7}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_6
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_f

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    move-object v14, v9

    check-cast v14, Ly00/o4;

    new-instance v13, La30/s;

    const/16 v18, 0x0

    const/16 v19, 0x7

    move-object/from16 v16, v2

    invoke-direct/range {v13 .. v19}, La30/s;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    move-object/from16 v9, v16

    move-object/from16 v2, v17

    invoke-static {v3, v12, v13, v8}, Lbc3/f0;->e(Lbc3/c0;Lq83/j;Lc93/m;I)Lbc3/j0;

    move-result-object v10

    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object v2, v9

    goto :goto_6

    :cond_f
    move-object v9, v2

    move-object/from16 v2, v17

    iput-object v15, v4, Lz20/b;->w:Lz20/g;

    iput-object v9, v4, Lz20/b;->x:Lz20/h;

    iput-object v1, v4, Lz20/b;->y:Ljava/lang/String;

    iput-object v2, v4, Lz20/b;->z:Ljava/lang/Object;

    iput v8, v4, Lz20/b;->G:I

    invoke-static {v6, v4}, Lbc3/f0;->f(Ljava/util/ArrayList;Lq83/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v5, :cond_10

    goto :goto_8

    :cond_10
    move-object v6, v2

    move-object v2, v1

    move-object v1, v6

    move-object v6, v9

    move-object v8, v15

    :goto_7
    move-object v3, v1

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_11

    new-instance v2, Lcom/stripe/android/paymentsheet/repositories/DuplicatePaymentMethodDetachFailureException;

    invoke-direct {v2, v1}, Lcom/stripe/android/paymentsheet/repositories/DuplicatePaymentMethodDetachFailureException;-><init>(Ljava/util/List;)V

    invoke-static {v2}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v1

    return-object v1

    :cond_11
    iput-object v12, v4, Lz20/b;->w:Lz20/g;

    iput-object v12, v4, Lz20/b;->x:Lz20/h;

    iput-object v12, v4, Lz20/b;->y:Ljava/lang/String;

    iput-object v12, v4, Lz20/b;->z:Ljava/lang/Object;

    const/4 v1, 0x4

    iput v1, v4, Lz20/b;->G:I

    const/4 v1, 0x0

    invoke-virtual {v8, v6, v2, v1, v4}, Lz20/g;->a(Lz20/h;Ljava/lang/String;ZLs83/c;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v5, :cond_12

    :goto_8
    return-object v5

    :cond_12
    return-object v1

    :cond_13
    invoke-static {v10}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v1

    return-object v1
.end method

.method public final c(Lz20/h;Ljava/util/List;ZLs83/c;)Ljava/lang/Object;
    .locals 10

    instance-of v0, p4, Lz20/c;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lz20/c;

    iget v1, v0, Lz20/c;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lz20/c;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lz20/c;

    invoke-direct {v0, p0, p4}, Lz20/c;-><init>(Lz20/g;Ls83/c;)V

    :goto_0
    iget-object p4, v0, Lz20/c;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lz20/c;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v6, p0

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance v4, Ld33/t0;

    const/4 v9, 0x0

    move-object v6, p0

    move-object v7, p1

    move-object v5, p2

    move v8, p3

    invoke-direct/range {v4 .. v9}, Ld33/t0;-><init>(Ljava/util/List;Lz20/g;Lz20/h;ZLq83/d;)V

    iput v3, v0, Lz20/c;->y:I

    iget-object p1, v6, Lz20/g;->e:Lq83/j;

    invoke-static {p1, v4, v0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p4, Ll83/n;

    iget-object p1, p4, Ll83/n;->w:Ljava/lang/Object;

    return-object p1
.end method

.method public final d(Lz20/h;Ls83/c;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p2, Lz20/d;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lz20/d;

    iget v1, v0, Lz20/d;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lz20/d;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lz20/d;

    invoke-direct {v0, p0, p2}, Lz20/d;-><init>(Lz20/g;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Lz20/d;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lz20/d;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p2, Ll83/n;

    iget-object p1, p2, Ll83/n;->w:Ljava/lang/Object;

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p1, Lz20/h;->a:Ljava/lang/String;

    new-instance v2, Lyy/f;

    iget-object p1, p1, Lz20/h;->b:Ljava/lang/String;

    iget-object v4, p0, Lz20/g;->b:Lk83/a;

    invoke-interface {v4}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lux/y;

    iget-object v4, v4, Lux/y;->x:Ljava/lang/String;

    const/4 v5, 0x4

    invoke-direct {v2, p1, v4, v5}, Lyy/f;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    iput v3, v0, Lz20/d;->y:I

    iget-object p1, p0, Lz20/g;->a:Lb10/c1;

    check-cast p1, Lb10/z0;

    iget-object v3, p0, Lz20/g;->f:Ljava/util/Set;

    invoke-virtual {p1, p2, v3, v0, v2}, Lb10/z0;->N(Ljava/lang/String;Ljava/util/Set;Ls83/c;Lyy/f;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    instance-of p2, p1, Ll83/m;

    if-eqz p2, :cond_4

    const/4 p1, 0x0

    :cond_4
    return-object p1
.end method

.method public final e(Lz20/h;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p3, Lz20/e;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lz20/e;

    iget v1, v0, Lz20/e;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lz20/e;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lz20/e;

    invoke-direct {v0, p0, p3}, Lz20/e;-><init>(Lz20/g;Ls83/c;)V

    :goto_0
    iget-object p3, v0, Lz20/e;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lz20/e;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p3, Ll83/n;

    iget-object p1, p3, Ll83/n;->w:Ljava/lang/Object;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p3, p1, Lz20/h;->a:Ljava/lang/String;

    new-instance v2, Lyy/f;

    iget-object p1, p1, Lz20/h;->b:Ljava/lang/String;

    iget-object v4, p0, Lz20/g;->b:Lk83/a;

    invoke-interface {v4}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lux/y;

    iget-object v4, v4, Lux/y;->x:Ljava/lang/String;

    const/4 v5, 0x4

    invoke-direct {v2, p1, v4, v5}, Lyy/f;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    iput v3, v0, Lz20/e;->y:I

    iget-object p1, p0, Lz20/g;->a:Lb10/c1;

    check-cast p1, Lb10/z0;

    invoke-virtual {p1, p3, p2, v0, v2}, Lb10/z0;->T(Ljava/lang/String;Ljava/lang/String;Ls83/c;Lyy/f;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    return-object p1
.end method

.method public final f(Lz20/h;Ljava/lang/String;Ly00/x5;Ls83/c;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p4, Lz20/f;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lz20/f;

    iget v1, v0, Lz20/f;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lz20/f;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lz20/f;

    invoke-direct {v0, p0, p4}, Lz20/f;-><init>(Lz20/g;Ls83/c;)V

    :goto_0
    iget-object p4, v0, Lz20/f;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lz20/f;->E:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p2, v0, Lz20/f;->x:Ljava/lang/String;

    iget-object p1, v0, Lz20/f;->w:Lz20/g;

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p4, Ll83/n;

    iget-object p3, p4, Ll83/n;->w:Ljava/lang/Object;

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p4, Lyy/f;

    iget-object p1, p1, Lz20/h;->b:Ljava/lang/String;

    iget-object v2, p0, Lz20/g;->b:Lk83/a;

    invoke-interface {v2}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lux/y;

    iget-object v2, v2, Lux/y;->x:Ljava/lang/String;

    const/4 v4, 0x4

    invoke-direct {p4, p1, v2, v4}, Lyy/f;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    iput-object p0, v0, Lz20/f;->w:Lz20/g;

    iput-object p2, v0, Lz20/f;->x:Ljava/lang/String;

    iput v3, v0, Lz20/f;->E:I

    iget-object p1, p0, Lz20/g;->a:Lb10/c1;

    check-cast p1, Lb10/z0;

    invoke-virtual {p1, p2, p3, p4, v0}, Lb10/z0;->X(Ljava/lang/String;Ly00/y5;Lyy/f;Ls83/c;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_3

    return-object v1

    :cond_3
    move-object p1, p0

    :goto_1
    invoke-static {p3}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p4

    if-eqz p4, :cond_4

    iget-object p1, p1, Lz20/g;->c:Lqy/d;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Failed to update payment method "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "."

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2, p4}, Lqy/d;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4
    return-object p3
.end method
