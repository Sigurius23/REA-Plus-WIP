.class public final Lz20/l;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lb10/c1;

.field public final b:Lk83/a;

.field public final c:Lq83/j;

.field public final d:Lb10/c;

.field public final e:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lb10/c1;Lk83/a;Lq83/j;Lb10/c;Ljava/lang/String;)V
    .locals 1

    const-string v0, "stripeRepository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lazyPaymentConfig"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workContext"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appId"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz20/l;->a:Lb10/c1;

    iput-object p2, p0, Lz20/l;->b:Lk83/a;

    iput-object p3, p0, Lz20/l;->c:Lq83/j;

    iput-object p4, p0, Lz20/l;->d:Lb10/c;

    iput-object p5, p0, Lz20/l;->e:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a(Ly00/b2;Ljava/lang/Throwable;Ls83/c;)Ljava/lang/Object;
    .locals 10

    instance-of v0, p3, Lz20/j;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lz20/j;

    iget v1, v0, Lz20/j;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lz20/j;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lz20/j;

    invoke-direct {v0, p0, p3}, Lz20/j;-><init>(Lz20/l;Ls83/c;)V

    :goto_0
    iget-object p3, v0, Lz20/j;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lz20/j;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v6, p0

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance v4, Lx30/k0;

    const/4 v8, 0x0

    const/4 v9, 0x5

    move-object v6, p0

    move-object v5, p1

    move-object v7, p2

    invoke-direct/range {v4 .. v9}, Lx30/k0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput v3, v0, Lz20/j;->y:I

    iget-object p1, v6, Lz20/l;->c:Lq83/j;

    invoke-static {p1, v4, v0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p3, Ll83/n;

    iget-object p1, p3, Ll83/n;->w:Ljava/lang/Object;

    return-object p1
.end method

.method public final b(La30/t0;Lh20/c2;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Ls83/c;)Ljava/lang/Object;
    .locals 24

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p7

    move-object/from16 v5, p8

    instance-of v6, v5, Lz20/k;

    if-eqz v6, :cond_0

    move-object v6, v5

    check-cast v6, Lz20/k;

    iget v7, v6, Lz20/k;->E:I

    const/high16 v8, -0x80000000

    and-int v9, v7, v8

    if-eqz v9, :cond_0

    sub-int/2addr v7, v8

    iput v7, v6, Lz20/k;->E:I

    goto :goto_0

    :cond_0
    new-instance v6, Lz20/k;

    invoke-direct {v6, v0, v5}, Lz20/k;-><init>(Lz20/l;Ls83/c;)V

    :goto_0
    iget-object v5, v6, Lz20/k;->y:Ljava/lang/Object;

    sget-object v7, Lr83/a;->w:Lr83/a;

    iget v8, v6, Lz20/k;->E:I

    const/4 v9, 0x2

    const/4 v10, 0x1

    const/4 v11, 0x0

    if-eqz v8, :cond_3

    if-eq v8, v10, :cond_2

    if-ne v8, v9, :cond_1

    invoke-static {v5}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v5, Ll83/n;

    iget-object v1, v5, Ll83/n;->w:Ljava/lang/Object;

    return-object v1

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-object v1, v6, Lz20/k;->x:Ly00/b2;

    iget-object v2, v6, Lz20/k;->w:Lz20/l;

    invoke-static {v5}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v5, Ll83/n;

    iget-object v3, v5, Ll83/n;->w:Ljava/lang/Object;

    goto/16 :goto_8

    :cond_3
    invoke-static {v5}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v5, v0, Lz20/l;->d:Lb10/c;

    invoke-virtual {v5}, Lb10/c;->get()Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v18, v5

    check-cast v18, Ljava/lang/String;

    const-string v5, "<this>"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "customPaymentMethods"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "externalPaymentMethods"

    move-object/from16 v15, p4

    invoke-static {v15, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "appId"

    iget-object v8, v0, Lz20/l;->e:Ljava/lang/String;

    invoke-static {v8, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "linkDisallowedFundingSourceCreation"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz v2, :cond_6

    iget-object v5, v2, Lh20/c2;->y:Lh20/b2;

    instance-of v12, v5, Lh20/z1;

    if-eqz v12, :cond_4

    check-cast v5, Lh20/z1;

    iget-object v5, v5, Lh20/z1;->w:Ljava/lang/String;

    goto :goto_1

    :cond_4
    instance-of v5, v5, Lh20/a2;

    if-eqz v5, :cond_5

    move-object v5, v11

    :goto_1
    move-object/from16 v17, v5

    goto :goto_2

    :cond_5
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_6
    move-object/from16 v17, v11

    :goto_2
    if-eqz v2, :cond_9

    iget-object v2, v2, Lh20/c2;->y:Lh20/b2;

    instance-of v5, v2, Lh20/z1;

    if-eqz v5, :cond_7

    move-object v2, v11

    goto :goto_3

    :cond_7
    instance-of v5, v2, Lh20/a2;

    if-eqz v5, :cond_8

    check-cast v2, Lh20/a2;

    iget-object v2, v2, Lh20/a2;->w:Ljava/lang/String;

    :goto_3
    move-object/from16 v16, v2

    goto :goto_4

    :cond_8
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_9
    move-object/from16 v16, v11

    :goto_4
    move-object v2, v3

    check-cast v2, Ljava/lang/Iterable;

    new-instance v14, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v2, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v14, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_a

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lh20/y1;

    iget-object v3, v3, Lh20/y1;->w:Ljava/lang/String;

    invoke-virtual {v14, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_a
    new-instance v2, Ly00/x1;

    invoke-direct {v2, v4}, Ly00/x1;-><init>(Ljava/util/Set;)V

    instance-of v3, v1, La30/r0;

    if-eqz v3, :cond_b

    check-cast v1, La30/r0;

    iget-object v13, v1, La30/r0;->w:Ljava/lang/String;

    new-instance v12, Ly00/y1;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/Locale;->toLanguageTag()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v23, p6

    move-object/from16 v22, v2

    move-object/from16 v21, v8

    move-object/from16 v19, v14

    move-object/from16 v20, v15

    move-object/from16 v15, v17

    move-object/from16 v17, p5

    move-object v14, v1

    invoke-direct/range {v12 .. v23}, Ly00/y1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/List;Ljava/lang/String;Ly00/x1;Ljava/lang/String;)V

    :goto_6
    move-object v1, v12

    goto/16 :goto_7

    :cond_b
    move-object/from16 v22, v2

    move-object/from16 v20, v8

    move-object/from16 v15, v17

    instance-of v2, v1, La30/s0;

    if-eqz v2, :cond_c

    check-cast v1, La30/s0;

    iget-object v13, v1, La30/s0;->w:Ljava/lang/String;

    new-instance v12, Ly00/a2;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/Locale;->toLanguageTag()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v17, p5

    move-object/from16 v23, p6

    move-object/from16 v19, v14

    move-object/from16 v21, v20

    move-object/from16 v20, p4

    move-object v14, v1

    invoke-direct/range {v12 .. v23}, Ly00/a2;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/List;Ljava/lang/String;Ly00/x1;Ljava/lang/String;)V

    goto :goto_6

    :cond_c
    instance-of v2, v1, La30/q0;

    if-eqz v2, :cond_d

    check-cast v1, La30/q0;

    iget-object v1, v1, La30/q0;->w:Lh20/u2;

    invoke-static {v1}, Lse/a;->g0(Lh20/u2;)Ly00/a1;

    move-result-object v13

    invoke-static {v1}, Lsc3/l;->l(Lh20/u2;)Ly00/z1;

    move-result-object v21

    new-instance v12, Ly00/w1;

    move-object/from16 v23, p6

    move-object/from16 v17, v15

    move-object/from16 v19, v18

    move-object/from16 v15, p4

    move-object/from16 v18, v16

    move-object/from16 v16, p5

    invoke-direct/range {v12 .. v23}, Ly00/w1;-><init>(Ly00/a1;Ljava/util/ArrayList;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ly00/z1;Ly00/x1;Ljava/lang/String;)V

    goto :goto_6

    :cond_d
    instance-of v2, v1, La30/p0;

    if-eqz v2, :cond_12

    new-instance v1, Lh20/u2;

    new-instance v2, Lh20/q2;

    sget-object v3, Lh20/t2;->x:Lh20/t2;

    invoke-direct {v2, v11, v3}, Lh20/q2;-><init>(Ljava/lang/String;Lh20/t2;)V

    const/16 v3, 0x1e

    invoke-direct {v1, v2, v11, v11, v3}, Lh20/u2;-><init>(Lh20/r2;Ljava/util/List;Ljava/lang/String;I)V

    invoke-static {v1}, Lse/a;->g0(Lh20/u2;)Ly00/a1;

    move-result-object v13

    invoke-static {v1}, Lsc3/l;->l(Lh20/u2;)Ly00/z1;

    move-result-object v21

    new-instance v12, Ly00/w1;

    move-object/from16 v23, p6

    move-object/from16 v17, v15

    move-object/from16 v19, v18

    move-object/from16 v15, p4

    move-object/from16 v18, v16

    move-object/from16 v16, p5

    invoke-direct/range {v12 .. v23}, Ly00/w1;-><init>(Ly00/a1;Ljava/util/ArrayList;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ly00/z1;Ly00/x1;Ljava/lang/String;)V

    goto :goto_6

    :goto_7
    invoke-virtual {v0}, Lz20/l;->c()Lyy/f;

    move-result-object v2

    iput-object v0, v6, Lz20/k;->w:Lz20/l;

    iput-object v1, v6, Lz20/k;->x:Ly00/b2;

    iput v10, v6, Lz20/k;->E:I

    iget-object v3, v0, Lz20/l;->a:Lb10/c1;

    check-cast v3, Lb10/z0;

    invoke-virtual {v3, v1, v2, v6}, Lb10/z0;->O(Ly00/b2;Lyy/f;Ls83/c;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v7, :cond_e

    goto :goto_a

    :cond_e
    move-object v2, v0

    :goto_8
    invoke-static {v3}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v4

    if-eqz v4, :cond_11

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v3}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v5

    instance-of v8, v5, Lcom/stripe/android/core/exception/StripeException;

    if-eqz v8, :cond_f

    check-cast v5, Lcom/stripe/android/core/exception/StripeException;

    goto :goto_9

    :cond_f
    move-object v5, v11

    :goto_9
    if-eqz v5, :cond_11

    iget v5, v5, Lcom/stripe/android/core/exception/StripeException;->y:I

    const/16 v8, 0x1f4

    if-lt v5, v8, :cond_11

    iput-object v11, v6, Lz20/k;->w:Lz20/l;

    iput-object v11, v6, Lz20/k;->x:Ly00/b2;

    iput v9, v6, Lz20/k;->E:I

    invoke-virtual {v2, v1, v4, v6}, Lz20/l;->a(Ly00/b2;Ljava/lang/Throwable;Ls83/c;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v7, :cond_10

    :goto_a
    return-object v7

    :cond_10
    return-object v1

    :cond_11
    return-object v3

    :cond_12
    instance-of v1, v1, La30/o0;

    if-eqz v1, :cond_13

    new-instance v1, Ll83/j;

    const-string v2, "An operation is not implemented: CheckoutSession elements session not yet supported."

    invoke-direct {v1, v2}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_13
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method

.method public final c()Lyy/f;
    .locals 4

    new-instance v0, Lyy/f;

    iget-object v1, p0, Lz20/l;->b:Lk83/a;

    invoke-interface {v1}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lux/y;

    iget-object v2, v2, Lux/y;->w:Ljava/lang/String;

    invoke-interface {v1}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lux/y;

    iget-object v1, v1, Lux/y;->x:Ljava/lang/String;

    const/4 v3, 0x4

    invoke-direct {v0, v2, v1, v3}, Lyy/f;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    return-object v0
.end method
