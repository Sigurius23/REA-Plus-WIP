.class public final Ln10/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln10/i0;


# instance fields
.field public final a:Lh20/u2;

.field public final b:Lh20/b;

.field public final c:Ly00/n;

.field public final d:Lb10/c1;

.field public final e:Lyy/f;

.field public final f:Z

.field public final g:Lb9/m1;


# direct methods
.method public constructor <init>(Lh20/u2;Lh20/b;Ly00/n;Lb10/c1;Lyy/f;Z)V
    .locals 1

    const-string v0, "intentConfiguration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createIntentCallback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clientAttributionMetadata"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stripeRepository"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "requestOptions"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln10/z;->a:Lh20/u2;

    iput-object p2, p0, Ln10/z;->b:Lh20/b;

    iput-object p3, p0, Ln10/z;->c:Ly00/n;

    iput-object p4, p0, Ln10/z;->d:Lb10/c1;

    iput-object p5, p0, Ln10/z;->e:Lyy/f;

    iput-boolean p6, p0, Ln10/z;->f:Z

    new-instance p1, Lb9/m1;

    invoke-virtual {p5}, Lyy/f;->f()Z

    move-result p2

    const/4 p3, 0x3

    invoke-direct {p1, p2, p3}, Lb9/m1;-><init>(ZI)V

    iput-object p1, p0, Ln10/z;->g:Lb9/m1;

    return-void
.end method

.method public static f(Ly00/c8;Ly00/o4;)Le10/d;
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    invoke-static {p0, p1}, Ls2/e;->j0(Ly00/c8;Ly00/o4;)V

    new-instance p1, Le10/c;

    new-instance v1, Ln10/e0;

    invoke-direct {v1, p0}, Ln10/e0;-><init>(Ly00/c8;)V

    sget-object p0, Ln10/c0;->y:Ln10/c0;

    invoke-direct {p1, v1, v0, p0}, Le10/c;-><init>(Ljava/lang/Object;ZLn10/c0;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    invoke-static {p0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    :goto_0
    invoke-static {p1}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p0

    if-nez p0, :cond_0

    goto :goto_1

    :cond_0
    new-instance p1, Le10/b;

    new-instance p0, Lcom/stripe/android/paymentelement/confirmation/intent/InvalidDeferredIntentUsageException;

    invoke-direct {p0}, Lcom/stripe/android/paymentelement/confirmation/intent/InvalidDeferredIntentUsageException;-><init>()V

    new-array v0, v0, [Ljava/lang/Object;

    sget-object v1, Lm83/y;->w:Lm83/y;

    const v2, 0x7f141080

    invoke-static {v2, v0, v1}, Ls4/i;->s(I[Ljava/lang/Object;Ljava/util/List;)Lzy/b;

    move-result-object v0

    sget-object v1, Le10/t;->a:Le10/t;

    invoke-direct {p1, p0, v0, v1}, Le10/b;-><init>(Ljava/lang/Throwable;Lzy/c;Le10/u;)V

    :goto_1
    check-cast p1, Le10/d;

    return-object p1
.end method

.method public static h(Ly00/u5;Lh20/u2;)Z
    .locals 1

    const/4 v0, 0x1

    if-eqz p0, :cond_0

    invoke-static {p0}, Ly00/g;->d(Ly00/u5;)Ly00/o;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-static {p0}, Ldc/a;->D(Ly00/o;)Z

    move-result p0

    if-ne p0, v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object p0, p1, Lh20/u2;->w:Lh20/r2;

    instance-of p1, p0, Lh20/p2;

    if-eqz p1, :cond_1

    check-cast p0, Lh20/p2;

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    if-eqz p0, :cond_2

    iget-object p0, p0, Lh20/p2;->y:Lh20/t2;

    if-eqz p0, :cond_2

    invoke-static {p0}, Lx30/s0;->I(Lh20/t2;)Ly00/o;

    move-result-object p0

    invoke-static {p0}, Ldc/a;->D(Ly00/o;)Z

    move-result p0

    if-ne p0, v0, :cond_2

    :goto_1
    return v0

    :cond_2
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final a(Ly00/c8;Le10/u0;Ly00/p;Lq83/d;)Ljava/lang/Object;
    .locals 10

    iget-object v2, p0, Ln10/z;->a:Lh20/u2;

    invoke-virtual {p2, v2}, Le10/u0;->f(Lh20/u2;)Le10/u0;

    move-result-object v3

    iget-object v4, p2, Le10/u0;->w:Ly00/o4;

    iget-object v7, p2, Le10/u0;->z:Ljava/lang/String;

    iget-object v8, p2, Le10/u0;->E:Ljava/lang/String;

    iget-object p2, v3, Le10/u0;->x:Ly00/u5;

    invoke-static {p2, v2}, Ln10/z;->h(Ly00/u5;Lh20/u2;)Z

    move-result v5

    move-object v9, p4

    check-cast v9, Ls83/c;

    move-object v0, p0

    move-object v1, p1

    move-object v6, p3

    invoke-virtual/range {v0 .. v9}, Ln10/z;->c(Ly00/c8;Lh20/u2;Le10/v0;Ly00/o4;ZLy00/p;Ljava/lang/String;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ly00/c8;Le10/t0;Ly00/p;Lq83/d;)Ljava/lang/Object;
    .locals 8

    const-string v0, "intentConfiguration"

    iget-object v2, p0, Ln10/z;->a:Lh20/u2;

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p2, Le10/t0;->w:Ly00/d5;

    invoke-static {v0, v2}, Lx30/s0;->L(Ly00/d5;Lh20/u2;)Ly00/d5;

    move-result-object v0

    iget-object v1, p2, Le10/t0;->x:Ly00/u5;

    iget-object v3, v0, Ly00/d5;->w:Ljava/lang/String;

    invoke-static {v1, v3, v2}, Lx30/s0;->K(Ly00/u5;Ljava/lang/String;Lh20/u2;)Ly00/u5;

    move-result-object v1

    const/16 v3, 0x3c

    invoke-static {p2, v0, v1, v3}, Le10/t0;->b(Le10/t0;Ly00/d5;Ly00/u5;I)Le10/t0;

    move-result-object v4

    iget-boolean v6, p2, Le10/t0;->z:Z

    move-object v7, p4

    check-cast v7, Ls83/c;

    move-object v1, p0

    move-object v3, p1

    move-object v5, p3

    invoke-virtual/range {v1 .. v7}, Ln10/z;->g(Lh20/u2;Ly00/c8;Le10/t0;Ly00/p;ZLs83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final c(Ly00/c8;Lh20/u2;Le10/v0;Ly00/o4;ZLy00/p;Ljava/lang/String;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p4

    move-object/from16 v2, p9

    instance-of v3, v2, Ln10/w;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Ln10/w;

    iget v4, v3, Ln10/w;->K:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Ln10/w;->K:I

    goto :goto_0

    :cond_0
    new-instance v3, Ln10/w;

    invoke-direct {v3, v0, v2}, Ln10/w;-><init>(Ln10/z;Ls83/c;)V

    :goto_0
    iget-object v2, v3, Ln10/w;->I:Ljava/lang/Object;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v5, v3, Ln10/w;->K:I

    const/4 v6, 0x2

    const/4 v7, 0x1

    if-eqz v5, :cond_3

    if-eq v5, v7, :cond_2

    if-ne v5, v6, :cond_1

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v2

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-object v1, v3, Ln10/w;->H:Ljava/lang/String;

    iget-object v5, v3, Ln10/w;->G:Ljava/lang/String;

    iget-object v8, v3, Ln10/w;->F:Ly00/p;

    iget-object v9, v3, Ln10/w;->E:Ly00/o4;

    iget-object v10, v3, Ln10/w;->z:Le10/v0;

    iget-object v11, v3, Ln10/w;->y:Lh20/u2;

    iget-object v12, v3, Ln10/w;->x:Ly00/c8;

    iget-object v13, v3, Ln10/w;->w:Ln10/z;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v16, v2

    move-object v2, v1

    move-object v1, v8

    move-object v8, v10

    move-object v10, v5

    move-object/from16 v5, v16

    goto :goto_1

    :cond_3
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    iput-object v0, v3, Ln10/w;->w:Ln10/z;

    move-object/from16 v2, p1

    iput-object v2, v3, Ln10/w;->x:Ly00/c8;

    move-object/from16 v5, p2

    iput-object v5, v3, Ln10/w;->y:Lh20/u2;

    move-object/from16 v8, p3

    iput-object v8, v3, Ln10/w;->z:Le10/v0;

    iput-object v1, v3, Ln10/w;->E:Ly00/o4;

    move-object/from16 v9, p6

    iput-object v9, v3, Ln10/w;->F:Ly00/p;

    move-object/from16 v10, p7

    iput-object v10, v3, Ln10/w;->G:Ljava/lang/String;

    move-object/from16 v11, p8

    iput-object v11, v3, Ln10/w;->H:Ljava/lang/String;

    iput v7, v3, Ln10/w;->K:I

    iget-object v12, v0, Ln10/z;->b:Lh20/b;

    move/from16 v13, p5

    invoke-interface {v12, v1, v13, v3}, Lh20/b;->a(Ly00/o4;ZLq83/d;)Ljava/lang/Object;

    move-result-object v12

    if-ne v12, v4, :cond_4

    goto :goto_2

    :cond_4
    move-object v13, v9

    move-object v9, v1

    move-object v1, v13

    move-object v13, v12

    move-object v12, v2

    move-object v2, v11

    move-object v11, v5

    move-object v5, v13

    move-object v13, v0

    :goto_1
    check-cast v5, Lh20/e;

    instance-of v14, v5, Lh20/d;

    if-eqz v14, :cond_7

    check-cast v5, Lh20/d;

    iget-object v14, v5, Lh20/d;->a:Ljava/lang/String;

    const-string v15, "COMPLETE_WITHOUT_CONFIRMING_INTENT"

    invoke-static {v14, v15}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_5

    new-instance v1, Le10/a;

    sget-object v2, Ln10/c0;->z:Ln10/c0;

    invoke-direct {v1, v12, v2, v7}, Le10/a;-><init>(Ly00/c8;Ln10/c0;Z)V

    return-object v1

    :cond_5
    iget-object v5, v5, Lh20/d;->a:Ljava/lang/String;

    const/4 v7, 0x0

    iput-object v7, v3, Ln10/w;->w:Ln10/z;

    iput-object v7, v3, Ln10/w;->x:Ly00/c8;

    iput-object v7, v3, Ln10/w;->y:Lh20/u2;

    iput-object v7, v3, Ln10/w;->z:Le10/v0;

    iput-object v7, v3, Ln10/w;->E:Ly00/o4;

    iput-object v7, v3, Ln10/w;->F:Ly00/p;

    iput-object v7, v3, Ln10/w;->G:Ljava/lang/String;

    iput-object v7, v3, Ln10/w;->H:Ljava/lang/String;

    iput v6, v3, Ln10/w;->K:I

    move-object/from16 p6, v1

    move-object/from16 p8, v2

    move-object/from16 p9, v3

    move-object/from16 p2, v5

    move-object/from16 p4, v8

    move-object/from16 p5, v9

    move-object/from16 p7, v10

    move-object/from16 p3, v11

    move-object/from16 p1, v13

    invoke-virtual/range {p1 .. p9}, Ln10/z;->d(Ljava/lang/String;Lh20/u2;Le10/v0;Ly00/o4;Ly00/p;Ljava/lang/String;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v4, :cond_6

    :goto_2
    return-object v4

    :cond_6
    return-object v1

    :cond_7
    instance-of v1, v5, Lh20/c;

    if-eqz v1, :cond_9

    new-instance v1, Lcom/stripe/android/paymentelement/confirmation/intent/CreateIntentCallbackFailureException;

    check-cast v5, Lh20/c;

    iget-object v2, v5, Lh20/c;->a:Ljava/lang/Exception;

    invoke-direct {v1, v2}, Lcom/stripe/android/paymentelement/confirmation/intent/CreateIntentCallbackFailureException;-><init>(Ljava/lang/Exception;)V

    new-instance v2, Le10/b;

    iget-object v3, v5, Lh20/c;->b:Ljava/lang/String;

    if-eqz v3, :cond_8

    invoke-static {v3}, Ls4/i;->i(Ljava/lang/String;)Lzy/d;

    move-result-object v3

    goto :goto_3

    :cond_8
    invoke-static {v1}, Lx30/s0;->H(Ljava/lang/Throwable;)Lzy/c;

    move-result-object v3

    :goto_3
    sget-object v4, Le10/t;->a:Le10/t;

    invoke-direct {v2, v1, v3, v4}, Le10/b;-><init>(Ljava/lang/Throwable;Lzy/c;Le10/u;)V

    return-object v2

    :cond_9
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method

.method public final d(Ljava/lang/String;Lh20/u2;Le10/v0;Ly00/o4;Ly00/p;Ljava/lang/String;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p8

    instance-of v3, v2, Ln10/x;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Ln10/x;

    iget v4, v3, Ln10/x;->K:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Ln10/x;->K:I

    goto :goto_0

    :cond_0
    new-instance v3, Ln10/x;

    invoke-direct {v3, v1, v2}, Ln10/x;-><init>(Ln10/z;Ls83/c;)V

    :goto_0
    iget-object v2, v3, Ln10/x;->I:Ljava/lang/Object;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v5, v3, Ln10/x;->K:I

    const/4 v6, 0x1

    if-eqz v5, :cond_2

    if-ne v5, v6, :cond_1

    iget-object v0, v3, Ln10/x;->H:Ljava/lang/String;

    iget-object v4, v3, Ln10/x;->G:Ljava/lang/String;

    iget-object v5, v3, Ln10/x;->F:Ly00/p;

    iget-object v7, v3, Ln10/x;->E:Ly00/o4;

    iget-object v8, v3, Ln10/x;->z:Le10/v0;

    iget-object v9, v3, Ln10/x;->y:Lh20/u2;

    iget-object v10, v3, Ln10/x;->x:Ljava/lang/String;

    iget-object v3, v3, Ln10/x;->w:Ln10/z;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v2, Ll83/n;

    iget-object v2, v2, Ll83/n;->w:Ljava/lang/Object;

    move-object v15, v0

    move-object v14, v4

    move-object v13, v5

    move-object v12, v7

    move-object v11, v8

    move-object v8, v10

    move-object v7, v3

    move-object v10, v9

    goto :goto_1

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    iput-object v1, v3, Ln10/x;->w:Ln10/z;

    iput-object v0, v3, Ln10/x;->x:Ljava/lang/String;

    move-object/from16 v2, p2

    iput-object v2, v3, Ln10/x;->y:Lh20/u2;

    move-object/from16 v5, p3

    iput-object v5, v3, Ln10/x;->z:Le10/v0;

    move-object/from16 v7, p4

    iput-object v7, v3, Ln10/x;->E:Ly00/o4;

    move-object/from16 v8, p5

    iput-object v8, v3, Ln10/x;->F:Ly00/p;

    move-object/from16 v9, p6

    iput-object v9, v3, Ln10/x;->G:Ljava/lang/String;

    move-object/from16 v10, p7

    iput-object v10, v3, Ln10/x;->H:Ljava/lang/String;

    iput v6, v3, Ln10/x;->K:I

    iget-object v11, v1, Ln10/z;->d:Lb10/c1;

    iget-object v12, v1, Ln10/z;->e:Lyy/f;

    invoke-static {v11, v0, v12, v3}, Lvd/e;->W(Lb10/c1;Ljava/lang/String;Lyy/f;Ls83/c;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v4, :cond_3

    return-object v4

    :cond_3
    move-object v11, v5

    move-object v12, v7

    move-object v13, v8

    move-object v14, v9

    move-object v15, v10

    move-object v8, v0

    move-object v7, v1

    move-object v10, v2

    move-object v2, v3

    :goto_1
    instance-of v0, v2, Ll83/m;

    if-nez v0, :cond_8

    :try_start_0
    move-object v9, v2

    check-cast v9, Ly00/c8;

    invoke-interface {v9}, Ly00/c8;->j0()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v11}, Le10/v0;->V()Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, v7, Ln10/z;->e:Lyy/f;

    invoke-virtual {v0}, Lyy/f;->f()Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_2

    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "(Test-mode only error) The default payment methods feature is not yet supported with deferred server-side confirmation. Please contact us if you\'d like to use this feature via a Github issue on stripe-android."

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    :goto_2
    new-instance v0, Le10/a;

    sget-object v2, Ln10/c0;->y:Ln10/c0;

    invoke-direct {v0, v9, v2, v6}, Le10/a;-><init>(Ly00/c8;Ln10/c0;Z)V

    goto :goto_3

    :cond_6
    invoke-interface {v9}, Ly00/c8;->z()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v9, v12}, Ln10/z;->f(Ly00/c8;Ly00/o4;)Le10/d;

    move-result-object v0

    goto :goto_3

    :cond_7
    invoke-virtual/range {v7 .. v15}, Ln10/z;->e(Ljava/lang/String;Ly00/c8;Lh20/u2;Le10/v0;Ly00/o4;Ly00/p;Ljava/lang/String;Ljava/lang/String;)Le10/d;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_3
    move-object v2, v0

    goto :goto_4

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    goto :goto_3

    :cond_8
    :goto_4
    invoke-static {v2}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_9

    goto :goto_5

    :cond_9
    new-instance v2, Le10/b;

    invoke-static {v0}, Lx30/s0;->H(Ljava/lang/Throwable;)Lzy/c;

    move-result-object v3

    sget-object v4, Le10/t;->a:Le10/t;

    invoke-direct {v2, v0, v3, v4}, Le10/b;-><init>(Ljava/lang/Throwable;Lzy/c;Le10/u;)V

    :goto_5
    return-object v2
.end method

.method public final e(Ljava/lang/String;Ly00/c8;Lh20/u2;Le10/v0;Ly00/o4;Ly00/p;Ljava/lang/String;Ljava/lang/String;)Le10/d;
    .locals 16

    move-object/from16 v6, p0

    move-object/from16 v8, p2

    move-object/from16 v1, p5

    const-string v0, "intentConfiguration"

    move-object/from16 v3, p3

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentMethod"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3}, Lse/a;->g0(Lh20/u2;)Ly00/a1;

    move-result-object v0

    iget-object v0, v0, Ly00/a1;->w:Ly00/z0;

    instance-of v2, v8, Ly00/l3;

    const-string v4, ")."

    const/4 v7, 0x1

    const/4 v9, 0x0

    if-eqz v2, :cond_1c

    instance-of v2, v0, Ly00/w0;

    if-eqz v2, :cond_0

    check-cast v0, Ly00/w0;

    goto :goto_0

    :cond_0
    move-object v0, v9

    :goto_0
    if-eqz v0, :cond_1b

    iget-object v2, v0, Ly00/w0;->x:Ljava/lang/String;

    sget-object v10, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v2, v10}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v11

    const-string v12, "toLowerCase(...)"

    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v13, v8

    check-cast v13, Ly00/l3;

    iget-object v14, v13, Ly00/l3;->R:Lcom/stripe/android/model/StripeIntent$Usage;

    iget-object v15, v13, Ly00/l3;->K:Ljava/lang/String;

    if-eqz v15, :cond_1

    invoke-virtual {v15, v10}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v12}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    move-object v5, v9

    :goto_1
    invoke-virtual {v11, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    if-eqz v15, :cond_2

    invoke-virtual {v15, v10}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v12}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_2
    invoke-virtual {v2, v10}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v12}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Your PaymentIntent currency ("

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ") does not match the PaymentSheet.IntentConfiguration currency ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0, v4, v1}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_3
    iget-object v2, v13, Ly00/l3;->H:Ly00/g3;

    sget-object v5, Ly00/g3;->z:Ly00/g3;

    if-ne v2, v5, :cond_5

    iget-boolean v5, v6, Ln10/z;->f:Z

    if-eqz v5, :cond_4

    goto :goto_2

    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Your PaymentIntent confirmationMethod ("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ") can only be used with PaymentSheet.FlowController."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_5
    :goto_2
    iget-object v2, v1, Ly00/o4;->E:Ly00/f4;

    const-string v5, "setup_future_usage"

    if-eqz v2, :cond_8

    iget-object v10, v2, Ly00/f4;->w:Ljava/lang/String;

    if-eqz v10, :cond_8

    invoke-virtual {v13}, Ly00/l3;->G()Ljava/util/Map;

    move-result-object v11

    invoke-interface {v11, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    instance-of v11, v10, Ljava/util/Map;

    if-eqz v11, :cond_6

    check-cast v10, Ljava/util/Map;

    goto :goto_3

    :cond_6
    move-object v10, v9

    :goto_3
    if-eqz v10, :cond_7

    invoke-interface {v10, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    goto :goto_4

    :cond_7
    move-object v10, v9

    :goto_4
    instance-of v11, v10, Ljava/lang/String;

    if-eqz v11, :cond_8

    check-cast v10, Ljava/lang/String;

    goto :goto_5

    :cond_8
    move-object v10, v9

    :goto_5
    iget-object v11, v0, Ly00/w0;->E:Ljava/lang/String;

    if-eqz v11, :cond_9

    new-instance v12, Lorg/json/JSONObject;

    invoke-direct {v12, v11}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-static {v12}, Ls/s;->m(Lorg/json/JSONObject;)Ljava/util/Map;

    move-result-object v11

    if-nez v11, :cond_a

    :cond_9
    sget-object v11, Lm83/z;->w:Lm83/z;

    :cond_a
    invoke-interface {v11}, Ljava/util/Map;->isEmpty()Z

    move-result v12

    if-nez v12, :cond_b

    if-nez v14, :cond_b

    if-nez v10, :cond_b

    goto/16 :goto_11

    :cond_b
    iget-object v0, v0, Ly00/w0;->y:Lcom/stripe/android/model/StripeIntent$Usage;

    if-nez v0, :cond_c

    move v12, v7

    goto :goto_6

    :cond_c
    const/4 v12, 0x0

    :goto_6
    if-nez v14, :cond_d

    move v13, v7

    goto :goto_7

    :cond_d
    const/4 v13, 0x0

    :goto_7
    if-ne v12, v13, :cond_1a

    if-eqz v2, :cond_10

    iget-object v0, v2, Ly00/f4;->w:Ljava/lang/String;

    if-eqz v0, :cond_10

    invoke-interface {v11, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_10

    instance-of v4, v0, Ljava/util/Map;

    if-eqz v4, :cond_e

    check-cast v0, Ljava/util/Map;

    goto :goto_8

    :cond_e
    move-object v0, v9

    :goto_8
    if-eqz v0, :cond_f

    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_9

    :cond_f
    move-object v0, v9

    :goto_9
    instance-of v4, v0, Ljava/lang/String;

    if-eqz v4, :cond_10

    check-cast v0, Ljava/lang/String;

    goto :goto_a

    :cond_10
    move-object v0, v9

    :goto_a
    if-eqz v10, :cond_18

    invoke-virtual {v10}, Ljava/lang/String;->hashCode()I

    move-result v4

    const v5, -0x5be017ca

    const-string v11, "on_session"

    const-string v12, "off_session"

    if-eq v4, v5, :cond_14

    const v5, -0x56f083a

    if-eq v4, v5, :cond_13

    const v5, 0x33af38

    if-eq v4, v5, :cond_11

    goto :goto_b

    :cond_11
    const-string v4, "none"

    invoke-virtual {v10, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_12

    goto :goto_b

    :cond_12
    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    goto :goto_d

    :cond_13
    invoke-virtual {v10, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_16

    goto :goto_b

    :cond_14
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_16

    :cond_15
    :goto_b
    const/4 v5, 0x0

    goto :goto_d

    :cond_16
    invoke-static {v0, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_17

    invoke-static {v0, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_15

    :cond_17
    :goto_c
    move v5, v7

    goto :goto_d

    :cond_18
    if-nez v0, :cond_15

    goto :goto_c

    :goto_d
    if-nez v5, :cond_21

    if-eqz v2, :cond_19

    iget-object v9, v2, Ly00/f4;->w:Ljava/lang/String;

    :cond_19
    const-string v1, "][setup_future_usage] value "

    const-string v2, " does not match the IntentConfiguration value "

    const-string v3, "Your PaymentIntent payment_method_options["

    invoke-static {v3, v9, v1, v10, v2}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1a
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Your PaymentIntent setupFutureUsage ("

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ") does not match the PaymentSheet.IntentConfiguration setupFutureUsage ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1b
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "You returned a PaymentIntent client secret but used a PaymentSheet.IntentConfiguration in setup mode."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1c
    instance-of v2, v8, Ly00/g6;

    if-eqz v2, :cond_24

    instance-of v2, v0, Ly00/y0;

    if-eqz v2, :cond_1d

    move-object v9, v0

    check-cast v9, Ly00/y0;

    :cond_1d
    if-eqz v9, :cond_23

    iget-object v0, v9, Ly00/y0;->x:Lcom/stripe/android/model/StripeIntent$Usage;

    if-nez v0, :cond_1e

    move v0, v7

    goto :goto_e

    :cond_1e
    const/4 v0, 0x0

    :goto_e
    move-object v2, v8

    check-cast v2, Ly00/g6;

    iget-object v2, v2, Ly00/g6;->L:Lcom/stripe/android/model/StripeIntent$Usage;

    if-nez v2, :cond_1f

    move v5, v7

    goto :goto_f

    :cond_1f
    const/4 v5, 0x0

    :goto_f
    if-ne v0, v5, :cond_20

    move v5, v7

    goto :goto_10

    :cond_20
    const/4 v5, 0x0

    :goto_10
    if-eqz v5, :cond_22

    :cond_21
    :goto_11
    new-instance v0, Lam2/b;

    const/16 v7, 0xf

    move-object/from16 v2, p4

    move-object/from16 v4, p7

    move-object/from16 v5, p8

    invoke-direct/range {v0 .. v7}, Lam2/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    iget-object v1, v6, Ln10/z;->g:Lb9/m1;

    const/4 v4, 0x1

    move-object/from16 v3, p6

    move-object v5, v0

    move-object v0, v1

    move-object v2, v8

    move-object/from16 v1, p1

    invoke-virtual/range {v0 .. v5}, Lb9/m1;->b(Ljava/lang/String;Ly00/c8;Ly00/p;ZLkotlin/jvm/functions/Function1;)Le10/d;

    move-result-object v0

    return-object v0

    :cond_22
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Your SetupIntent usage ("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ") does not match the PaymentSheet.IntentConfiguration usage ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_23
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "You returned a SetupIntent client secret but used a PaymentSheet.IntentConfiguration in payment mode."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_24
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method

.method public final g(Lh20/u2;Ly00/c8;Le10/t0;Ly00/p;ZLs83/c;)Ljava/lang/Object;
    .locals 13

    move-object/from16 v0, p3

    move-object/from16 v1, p6

    instance-of v2, v1, Ln10/y;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Ln10/y;

    iget v3, v2, Ln10/y;->I:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Ln10/y;->I:I

    :goto_0
    move-object v12, v2

    goto :goto_1

    :cond_0
    new-instance v2, Ln10/y;

    invoke-direct {v2, p0, v1}, Ln10/y;-><init>(Ln10/z;Ls83/c;)V

    goto :goto_0

    :goto_1
    iget-object v1, v12, Ln10/y;->G:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v12, Ln10/y;->I:I

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v3, :cond_3

    if-eq v3, v5, :cond_2

    if-ne v3, v4, :cond_1

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-boolean p1, v12, Ln10/y;->F:Z

    iget-object v0, v12, Ln10/y;->E:Ly00/p;

    iget-object v3, v12, Ln10/y;->z:Le10/t0;

    iget-object v6, v12, Ln10/y;->y:Ly00/c8;

    iget-object v7, v12, Ln10/y;->x:Lh20/u2;

    iget-object v8, v12, Ln10/y;->w:Ln10/z;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v1, Ll83/n;

    iget-object v1, v1, Ll83/n;->w:Ljava/lang/Object;

    move-object v9, v7

    move v7, p1

    move-object p1, v9

    move-object v9, v6

    move-object v6, v3

    move-object v3, v9

    move-object v9, v0

    goto :goto_2

    :cond_3
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v0, Le10/t0;->w:Ly00/d5;

    iput-object p0, v12, Ln10/y;->w:Ln10/z;

    iput-object p1, v12, Ln10/y;->x:Lh20/u2;

    iput-object p2, v12, Ln10/y;->y:Ly00/c8;

    iput-object v0, v12, Ln10/y;->z:Le10/t0;

    move-object/from16 v6, p4

    iput-object v6, v12, Ln10/y;->E:Ly00/p;

    move/from16 v7, p5

    iput-boolean v7, v12, Ln10/y;->F:Z

    iput v5, v12, Ln10/y;->I:I

    iget-object v8, p0, Ln10/z;->d:Lb10/c1;

    check-cast v8, Lb10/z0;

    iget-object v9, p0, Ln10/z;->e:Lyy/f;

    invoke-virtual {v8, v1, v9, v12}, Lb10/z0;->p(Ly00/d5;Lyy/f;Ls83/c;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_4

    goto :goto_4

    :cond_4
    move-object v8, p0

    move-object v3, p2

    move-object v9, v6

    move-object v6, v0

    :goto_2
    invoke-static {v1}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_8

    check-cast v1, Ly00/o4;

    if-nez v7, :cond_6

    iget-object v0, v6, Le10/t0;->x:Ly00/u5;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0, p1}, Ln10/z;->h(Ly00/u5;Lh20/u2;)Z

    move-result v0

    if-eqz v0, :cond_5

    goto :goto_3

    :cond_5
    const/4 v5, 0x0

    :cond_6
    :goto_3
    const/4 v0, 0x0

    iput-object v0, v12, Ln10/y;->w:Ln10/z;

    iput-object v0, v12, Ln10/y;->x:Lh20/u2;

    iput-object v0, v12, Ln10/y;->y:Ly00/c8;

    iput-object v0, v12, Ln10/y;->z:Le10/t0;

    iput-object v0, v12, Ln10/y;->E:Ly00/p;

    iput v4, v12, Ln10/y;->I:I

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v7, v1

    move-object v4, v3

    move-object v3, v8

    move v8, v5

    move-object v5, p1

    invoke-virtual/range {v3 .. v12}, Ln10/z;->c(Ly00/c8;Lh20/u2;Le10/v0;Ly00/o4;ZLy00/p;Ljava/lang/String;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_7

    :goto_4
    return-object v2

    :cond_7
    :goto_5
    check-cast v1, Le10/d;

    return-object v1

    :cond_8
    new-instance p1, Le10/b;

    invoke-static {v0}, Lx30/s0;->H(Ljava/lang/Throwable;)Lzy/c;

    move-result-object v1

    sget-object v2, Le10/t;->a:Le10/t;

    invoke-direct {p1, v0, v1, v2}, Le10/b;-><init>(Ljava/lang/Throwable;Lzy/c;Le10/u;)V

    return-object p1
.end method
