.class public final Lwz/y;
.super Landroidx/lifecycle/w1;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/DefaultLifecycleObserver;


# instance fields
.field public final E:Lwz/g0;

.field public final F:Lv00/c0;

.field public final G:Lzz/a;

.field public final H:Landroidx/lifecycle/k1;

.field public final I:Lwz/h0;

.field public final J:Ln40/g;

.field public final K:Lwz/n0;

.field public final L:Li20/y0;

.field public final M:Lq00/g;

.field public final N:Le10/r0;

.field public final O:La00/g;

.field public final P:Lec3/h2;

.field public final Q:Lec3/r1;

.field public final R:Lec3/w1;

.field public final S:Lec3/q1;

.field public final T:Lec3/q1;

.field public final U:Lec3/h2;

.field public final V:Lec3/h2;

.field public W:Landroidx/room/v0;

.field public final w:Lc00/a;

.field public final x:Lxz/x;

.field public final y:Lxz/f0;

.field public final z:Lk20/a;


# direct methods
.method public constructor <init>(Lc00/a;Le10/n0;La00/i;Lxz/x;Lxz/f0;Lk20/a;Lwz/g0;Lv00/c0;Lzz/a;Landroidx/lifecycle/k1;Lwz/h0;Ln40/g;Lwz/n0;Li20/y0;Lq00/g;)V
    .locals 16

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    move-object/from16 v11, p11

    move-object/from16 v12, p12

    move-object/from16 v13, p13

    move-object/from16 v14, p14

    move-object/from16 v15, p15

    const-string v0, "activityRetainedComponent"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "confirmationHandlerFactory"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkConfirmationHandlerFactory"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkAccountManager"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkAccountHolder"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventReporter"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkConfiguration"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentMethodMetadata"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkAttestationCheck"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "savedStateHandle"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkExpressMode"

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigationManager"

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkLaunchMode"

    invoke-static {v13, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "autocompleteLauncher"

    invoke-static {v14, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "addPaymentMethodOptionsFactory"

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct/range {p0 .. p0}, Landroidx/lifecycle/w1;-><init>()V

    move-object/from16 v0, p0

    iput-object v1, v0, Lwz/y;->w:Lc00/a;

    iput-object v4, v0, Lwz/y;->x:Lxz/x;

    iput-object v5, v0, Lwz/y;->y:Lxz/f0;

    iput-object v6, v0, Lwz/y;->z:Lk20/a;

    iput-object v7, v0, Lwz/y;->E:Lwz/g0;

    iput-object v8, v0, Lwz/y;->F:Lv00/c0;

    iput-object v9, v0, Lwz/y;->G:Lzz/a;

    iput-object v10, v0, Lwz/y;->H:Landroidx/lifecycle/k1;

    iput-object v11, v0, Lwz/y;->I:Lwz/h0;

    iput-object v12, v0, Lwz/y;->J:Ln40/g;

    iput-object v13, v0, Lwz/y;->K:Lwz/n0;

    iput-object v14, v0, Lwz/y;->L:Li20/y0;

    iput-object v15, v0, Lwz/y;->M:Lq00/g;

    invoke-static {v0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v1

    invoke-virtual {v2, v1}, Le10/n0;->a(Lbc3/c0;)Le10/r0;

    move-result-object v1

    iput-object v1, v0, Lwz/y;->N:Le10/r0;

    invoke-virtual {v3, v1}, La00/i;->a(Le10/r0;)La00/g;

    move-result-object v1

    iput-object v1, v0, Lwz/y;->O:La00/g;

    new-instance v1, Lh00/j;

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {v1, v2, v3, v4, v3}, Lh00/j;-><init>(ZZLzy/c;Z)V

    invoke-static {v1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v1

    iput-object v1, v0, Lwz/y;->P:Lec3/h2;

    invoke-static {v1}, Lec3/v;->h(Lec3/p1;)Lec3/r1;

    move-result-object v1

    iput-object v1, v0, Lwz/y;->Q:Lec3/r1;

    const/4 v1, 0x4

    invoke-static {v2, v2, v4, v1}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object v1

    iput-object v1, v0, Lwz/y;->R:Lec3/w1;

    invoke-static {v1}, Lec3/v;->g(Lec3/o1;)Lec3/q1;

    move-result-object v1

    iput-object v1, v0, Lwz/y;->S:Lec3/q1;

    iget-object v1, v12, Ln40/g;->b:Lec3/q1;

    iput-object v1, v0, Lwz/y;->T:Lec3/q1;

    sget-object v1, Lwz/p1;->a:Lwz/p1;

    invoke-static {v1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v1

    iput-object v1, v0, Lwz/y;->U:Lec3/h2;

    iput-object v1, v0, Lwz/y;->V:Lec3/h2;

    return-void
.end method

.method public static final g(Lwz/y;Lwz/u0;Ls83/c;)Ljava/lang/Object;
    .locals 8

    iget-object v1, p0, Lwz/y;->O:La00/g;

    instance-of v0, p2, Lwz/t;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lwz/t;

    iget v2, v0, Lwz/t;->z:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v0, Lwz/t;->z:I

    :goto_0
    move-object p2, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lwz/t;

    invoke-direct {v0, p0, p2}, Lwz/t;-><init>(Lwz/y;Ls83/c;)V

    goto :goto_0

    :goto_1
    iget-object v0, p2, Lwz/t;->x:Ljava/lang/Object;

    sget-object v7, Lr83/a;->w:Lr83/a;

    iget v2, p2, Lwz/t;->z:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, p2, Lwz/t;->w:Lwz/y;

    :try_start_0
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_8

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto/16 :goto_9

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    iget-object p0, p2, Lwz/t;->w:Lwz/y;

    :try_start_1
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto/16 :goto_6

    :cond_3
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_2
    invoke-virtual {p1}, Lwz/u0;->h()Ly00/c0;

    move-result-object v0

    instance-of v2, v0, Ly00/x;

    if-eqz v2, :cond_4

    :goto_2
    move v0, v3

    goto :goto_5

    :cond_4
    instance-of v2, v0, Ly00/a0;

    if-eqz v2, :cond_8

    check-cast v0, Ly00/a0;

    iget-object v2, v0, Ly00/a0;->M:Ly00/v0;

    invoke-virtual {v2}, Ly00/v0;->a()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-virtual {p1}, Lwz/u0;->f()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_5

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_5

    goto :goto_3

    :cond_5
    const/4 v2, 0x0

    goto :goto_4

    :cond_6
    :goto_3
    move v2, v4

    :goto_4
    invoke-virtual {v0}, Ly00/a0;->k()Z

    move-result v0

    if-nez v0, :cond_7

    if-eqz v2, :cond_7

    goto :goto_2

    :cond_7
    const-string p1, "LinkPaymentMethod must be ready for confirmation"

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_8
    instance-of v0, v0, Ly00/b0;

    if-eqz v0, :cond_e

    goto :goto_2

    :goto_5
    invoke-virtual {p0}, Lwz/y;->n()Ld00/l;

    move-result-object v3

    if-eqz v3, :cond_d

    instance-of v2, p1, Lwz/s0;

    if-eqz v2, :cond_a

    move-object v0, p1

    check-cast v0, Lwz/s0;

    iget-object v2, v0, Lwz/s0;->x:Ly00/c0;

    move-object v0, p1

    check-cast v0, Lwz/s0;

    iget-object v0, v0, Lwz/s0;->y:Ljava/lang/String;

    check-cast p1, Lwz/s0;

    iget-object v5, p1, Lwz/s0;->z:Ljava/lang/String;

    iput-object p0, p2, Lwz/t;->w:Lwz/y;

    iput v4, p2, Lwz/t;->z:I

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object v4, v0

    new-instance v0, La00/h;

    const/4 v6, 0x1

    invoke-direct/range {v0 .. v6}, La00/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v1, v0, p2}, La00/g;->j(Lc93/a;Ls83/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_9

    goto :goto_7

    :cond_9
    :goto_6
    check-cast v0, La00/o;

    goto :goto_a

    :cond_a
    instance-of v2, p1, Lwz/t0;

    if-eqz v2, :cond_c

    move-object v2, p1

    check-cast v2, Lwz/t0;

    iget-object v2, v2, Lwz/t0;->x:Lwz/q0;

    move-object v4, p1

    check-cast v4, Lwz/t0;

    iget-object v4, v4, Lwz/t0;->y:Ljava/lang/String;

    check-cast p1, Lwz/t0;

    iget-object v5, p1, Lwz/t0;->z:Ljava/lang/String;

    iput-object p0, p2, Lwz/t;->w:Lwz/y;

    iput v0, p2, Lwz/t;->z:I

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, La00/h;

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v6}, La00/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v1, v0, p2}, La00/g;->j(Lc93/a;Ls83/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_b

    :goto_7
    return-object v7

    :cond_b
    :goto_8
    check-cast v0, La00/o;

    goto :goto_a

    :cond_c
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_d
    const-string p1, "LinkAccount must not be null for confirmation"

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_e
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_9
    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    :goto_a
    instance-of p1, v0, Ll83/m;

    sget-object p2, Lwz/b;->w:Lwz/b;

    if-nez p1, :cond_12

    move-object p1, v0

    check-cast p1, La00/o;

    sget-object v1, La00/l;->a:La00/l;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_f

    new-instance p1, Lwz/m;

    sget-object v1, Lwz/l;->w:Lwz/l;

    invoke-direct {p1, v1, p2}, Lwz/m;-><init>(Lwz/l;Lwz/e;)V

    goto :goto_c

    :cond_f
    instance-of v1, p1, La00/m;

    if-eqz v1, :cond_10

    new-instance v1, Lwz/o;

    new-instance v2, Ljava/lang/IllegalStateException;

    check-cast p1, La00/m;

    iget-object p1, p1, La00/m;->a:Lzy/c;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Failed to confirm Link payment: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-direct {v1, v2, p2}, Lwz/o;-><init>(Ljava/lang/Throwable;Lwz/e;)V

    :goto_b
    move-object p1, v1

    goto :goto_c

    :cond_10
    sget-object v1, La00/n;->a:La00/n;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_11

    new-instance v1, Lwz/n;

    new-instance v2, Lwz/d;

    const/4 p1, 0x0

    sget-object v3, Lwz/c;->x:Lwz/c;

    invoke-direct {v2, p1, v3}, Lwz/d;-><init>(Ld00/l;Lwz/c;)V

    const/4 v5, 0x0

    const/16 v6, 0xe

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lwz/n;-><init>(Lwz/e;Lwz/u0;Ly00/j0;Ljava/lang/Boolean;I)V

    goto :goto_b

    :goto_c
    invoke-virtual {p0, p1}, Lwz/y;->l(Lwz/q;)V

    goto :goto_d

    :cond_11
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_12
    :goto_d
    invoke-static {v0}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_13

    new-instance v1, Lwz/o;

    invoke-direct {v1, p1, p2}, Lwz/o;-><init>(Ljava/lang/Throwable;Lwz/e;)V

    invoke-virtual {p0, v1}, Lwz/y;->l(Lwz/q;)V

    :cond_13
    return-object v0
.end method

.method public static final j(Lwz/y;Ls83/c;)Ljava/lang/Object;
    .locals 12

    instance-of v0, p1, Lwz/w;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lwz/w;

    iget v1, v0, Lwz/w;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lwz/w;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lwz/w;

    invoke-direct {v0, p0, p1}, Lwz/w;-><init>(Lwz/y;Ls83/c;)V

    :goto_0
    iget-object p1, v0, Lwz/w;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lwz/w;->z:I

    sget-object v3, Lzz/e;->a:Lzz/e;

    const/4 v4, 0x4

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v7, 0x2

    const/4 v8, 0x1

    sget-object v9, Ll83/a0;->a:Ll83/a0;

    if-eqz v2, :cond_5

    if-eq v2, v8, :cond_4

    if-eq v2, v7, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v9

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v9

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v9

    :cond_4
    iget-object p0, v0, Lwz/w;->w:Lwz/y;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_5
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lwz/y;->G:Lzz/a;

    iput-object p0, v0, Lwz/w;->w:Lwz/y;

    iput v8, v0, Lwz/w;->z:I

    iget-object v2, p1, Lzz/a;->a:Lb00/a;

    invoke-virtual {v2}, Lb00/a;->a()Z

    move-result v2

    if-nez v2, :cond_6

    move-object p1, v3

    goto :goto_1

    :cond_6
    iget-object v2, p1, Lzz/a;->f:Lq83/j;

    new-instance v10, Ls40/c0;

    const/16 v11, 0x1d

    invoke-direct {v10, p1, v6, v11}, Ls40/c0;-><init>(Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v2, v10, v0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    :goto_1
    if-ne p1, v1, :cond_7

    goto :goto_4

    :cond_7
    :goto_2
    check-cast p1, Lzz/f;

    instance-of v2, p1, Lzz/c;

    const/4 v10, 0x6

    if-eqz v2, :cond_a

    iget-object v2, p0, Lwz/y;->I:Lwz/h0;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    if-eqz v2, :cond_9

    if-eq v2, v8, :cond_9

    if-ne v2, v7, :cond_8

    iput-object v6, v0, Lwz/w;->w:Lwz/y;

    iput v7, v0, Lwz/w;->z:I

    invoke-static {p0, v8, v6, v0, v10}, Lwz/y;->t(Lwz/y;ZLcom/stripe/android/model/ConsumerSessionRefresh;Ls83/c;I)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_e

    goto :goto_4

    :cond_8
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_9
    check-cast p1, Lzz/c;

    iget-object p1, p1, Lzz/c;->a:Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lwz/y;->p(Ljava/lang/Throwable;)V

    return-object v9

    :cond_a
    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_b

    iput-object v6, v0, Lwz/w;->w:Lwz/y;

    iput v5, v0, Lwz/w;->z:I

    invoke-static {p0, v8, v6, v0, v10}, Lwz/y;->t(Lwz/y;ZLcom/stripe/android/model/ConsumerSessionRefresh;Ls83/c;I)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_e

    goto :goto_4

    :cond_b
    instance-of v2, p1, Lzz/d;

    if-nez v2, :cond_d

    instance-of p1, p1, Lzz/b;

    if-eqz p1, :cond_c

    goto :goto_3

    :cond_c
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_d
    :goto_3
    iput-object v6, v0, Lwz/w;->w:Lwz/y;

    iput v4, v0, Lwz/w;->z:I

    invoke-virtual {p0, v0}, Lwz/y;->o(Ls83/c;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_e

    :goto_4
    return-object v1

    :cond_e
    return-object v9
.end method

.method public static q(Lwz/y;Lwz/e1;Z)V
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "screen"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lwz/y;->J:Ln40/g;

    invoke-virtual {p1}, Lwz/e1;->a()Ljava/lang/String;

    move-result-object p1

    if-eqz p2, :cond_0

    sget-object p2, Ln40/i;->a:Ln40/i;

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "route"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Ln40/g;->a:Lec3/w1;

    new-instance v0, Ln40/e;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, v1}, Ln40/e;-><init>(Ljava/lang/String;Ln40/i;Z)V

    invoke-virtual {p0, v0}, Lec3/w1;->a(Ljava/lang/Object;)Z

    return-void
.end method

.method public static synthetic t(Lwz/y;ZLcom/stripe/android/model/ConsumerSessionRefresh;Ls83/c;I)Ljava/lang/Object;
    .locals 1

    and-int/lit8 v0, p4, 0x2

    if-eqz v0, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p4, 0x0

    goto :goto_0

    :cond_1
    const/4 p4, 0x1

    :goto_0
    invoke-virtual {p0, p1, p2, p4, p3}, Lwz/y;->r(ZLcom/stripe/android/model/ConsumerSessionRefresh;ZLs83/c;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final l(Lwz/q;)V
    .locals 4

    invoke-static {p0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v0

    new-instance v1, Ls40/c0;

    const/16 v2, 0x17

    const/4 v3, 0x0

    invoke-direct {v1, p0, p1, v3, v2}, Ls40/c0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    const/4 p1, 0x3

    invoke-static {v0, v3, v3, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public final n()Ld00/l;
    .locals 1

    iget-object v0, p0, Lwz/y;->x:Lxz/x;

    iget-object v0, v0, Lxz/x;->a:Lxz/f0;

    iget-object v0, v0, Lxz/f0;->b:Lec3/r1;

    iget-object v0, v0, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwz/d;

    iget-object v0, v0, Lwz/d;->w:Ld00/l;

    return-object v0
.end method

.method public final o(Ls83/c;)Ljava/lang/Object;
    .locals 8

    instance-of v0, p1, Lwz/u;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lwz/u;

    iget v1, v0, Lwz/u;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lwz/u;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lwz/u;

    invoke-direct {v0, p0, p1}, Lwz/u;-><init>(Lwz/y;Ls83/c;)V

    :goto_0
    iget-object p1, v0, Lwz/u;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lwz/u;->z:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v2, v0, Lwz/u;->w:Lwz/y;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p1, Ll83/n;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iput-object p0, v0, Lwz/u;->w:Lwz/y;

    iput v4, v0, Lwz/u;->z:I

    iget-object p1, p0, Lwz/y;->x:Lxz/x;

    invoke-virtual {p1, v0}, Lxz/x;->i(Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_2

    :cond_4
    move-object v2, p0

    :goto_1
    iget-object p1, v2, Lwz/y;->y:Lxz/f0;

    new-instance v5, Lwz/d;

    sget-object v6, Lwz/c;->w:Lwz/c;

    const/4 v7, 0x0

    invoke-direct {v5, v7, v6}, Lwz/d;-><init>(Ld00/l;Lwz/c;)V

    invoke-virtual {p1, v5}, Lxz/f0;->a(Lwz/d;)V

    iput-object v7, v0, Lwz/u;->w:Lwz/y;

    iput v3, v0, Lwz/u;->z:I

    const/4 p1, 0x6

    invoke-static {v2, v4, v7, v0, p1}, Lwz/y;->t(Lwz/y;ZLcom/stripe/android/model/ConsumerSessionRefresh;Ls83/c;I)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final onCreate(Landroidx/lifecycle/g0;)V
    .locals 3

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onCreate(Landroidx/lifecycle/g0;)V

    invoke-static {p0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object p1

    new-instance v0, Lwz/v;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, p0, v2, v1}, Lwz/v;-><init>(Lwz/y;Lq83/d;I)V

    const/4 v1, 0x3

    invoke-static {p1, v2, v2, v0, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public final p(Ljava/lang/Throwable;)V
    .locals 8

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lwz/y;->K:Lwz/n0;

    instance-of v1, v0, Lwz/i0;

    sget-object v3, Lwz/b;->w:Lwz/b;

    if-eqz v1, :cond_0

    new-instance v0, Lwz/o;

    invoke-direct {v0, p1, v3}, Lwz/o;-><init>(Ljava/lang/Throwable;Lwz/e;)V

    invoke-virtual {p0, v0}, Lwz/y;->l(Lwz/q;)V

    return-void

    :cond_0
    instance-of p1, v0, Lwz/j0;

    if-eqz p1, :cond_1

    new-instance p1, Lwz/o;

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Authorization mode is not supported in web"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, v0, v3}, Lwz/o;-><init>(Ljava/lang/Throwable;Lwz/e;)V

    invoke-virtual {p0, p1}, Lwz/y;->l(Lwz/q;)V

    return-void

    :cond_1
    instance-of p1, v0, Lwz/m0;

    if-eqz p1, :cond_2

    new-instance v2, Lwz/n;

    const/4 v6, 0x0

    const/16 v7, 0x8

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v7}, Lwz/n;-><init>(Lwz/e;Lwz/u0;Ly00/j0;Ljava/lang/Boolean;I)V

    invoke-virtual {p0, v2}, Lwz/y;->l(Lwz/q;)V

    return-void

    :cond_2
    instance-of p1, v0, Lwz/k0;

    if-nez p1, :cond_4

    sget-object p1, Lwz/l0;->w:Lwz/l0;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_0

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_4
    :goto_0
    iget-object p1, p0, Lwz/y;->W:Landroidx/room/v0;

    if-eqz p1, :cond_5

    sget-object v0, Lwz/w0;->d:Lwz/w0;

    const/4 v1, 0x1

    invoke-static {p0, v0, v1}, Lwz/y;->q(Lwz/y;Lwz/e1;Z)V

    iget-object v0, p0, Lwz/y;->E:Lwz/g0;

    iget-object v1, p0, Lwz/y;->F:Lv00/c0;

    invoke-virtual {p1, v0, v1}, Landroidx/room/v0;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    return-void
.end method

.method public final r(ZLcom/stripe/android/model/ConsumerSessionRefresh;ZLs83/c;)Ljava/lang/Object;
    .locals 25

    move-object/from16 v0, p0

    move-object/from16 v1, p4

    instance-of v2, v1, Lwz/x;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lwz/x;

    iget v3, v2, Lwz/x;->G:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lwz/x;->G:I

    goto :goto_0

    :cond_0
    new-instance v2, Lwz/x;

    invoke-direct {v2, v0, v1}, Lwz/x;-><init>(Lwz/y;Ls83/c;)V

    :goto_0
    iget-object v1, v2, Lwz/x;->E:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lwz/x;->G:I

    sget-object v5, Ll83/a0;->a:Ll83/a0;

    const/4 v6, 0x2

    const/4 v7, 0x1

    if-eqz v4, :cond_3

    if-eq v4, v7, :cond_2

    if-ne v4, v6, :cond_1

    iget-boolean v3, v2, Lwz/x;->y:Z

    iget-object v4, v2, Lwz/x;->x:Ljava/lang/Object;

    check-cast v4, Lwz/r1;

    iget-object v2, v2, Lwz/x;->w:Lwz/y;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_13

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-boolean v4, v2, Lwz/x;->z:Z

    iget-boolean v8, v2, Lwz/x;->y:Z

    iget-object v9, v2, Lwz/x;->x:Ljava/lang/Object;

    check-cast v9, Lcom/stripe/android/model/ConsumerSessionRefresh;

    iget-object v10, v2, Lwz/x;->w:Lwz/y;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v24, v9

    move v9, v4

    move-object/from16 v4, v24

    goto :goto_1

    :cond_3
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v0, Lwz/y;->x:Lxz/x;

    iget-object v1, v1, Lxz/x;->m:Landroidx/room/y;

    iput-object v0, v2, Lwz/x;->w:Lwz/y;

    move-object/from16 v4, p2

    iput-object v4, v2, Lwz/x;->x:Ljava/lang/Object;

    move/from16 v8, p1

    iput-boolean v8, v2, Lwz/x;->y:Z

    move/from16 v9, p3

    iput-boolean v9, v2, Lwz/x;->z:Z

    iput v7, v2, Lwz/x;->G:I

    invoke-static {v1, v2}, Lec3/v;->A(Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_4

    goto/16 :goto_12

    :cond_4
    move-object v10, v0

    :goto_1
    check-cast v1, Ld00/f;

    invoke-virtual {v10}, Lwz/y;->n()Ld00/l;

    move-result-object v11

    iget-object v12, v10, Lwz/y;->I:Lwz/h0;

    iget-object v13, v10, Lwz/y;->K:Lwz/n0;

    instance-of v14, v13, Lwz/j0;

    iget-object v15, v10, Lwz/y;->E:Lwz/g0;

    iget-boolean v15, v15, Lwz/g0;->X:Z

    instance-of v6, v13, Lwz/i0;

    const/16 v16, 0x0

    if-eqz v6, :cond_5

    move-object/from16 v17, v13

    check-cast v17, Lwz/i0;

    move-object/from16 v7, v17

    goto :goto_2

    :cond_5
    move-object/from16 v7, v16

    :goto_2
    const/16 v18, 0x0

    if-eqz v7, :cond_6

    iget-boolean v7, v7, Lwz/i0;->w:Z

    const/4 v0, 0x1

    if-ne v7, v0, :cond_6

    const/16 v18, 0x1

    :cond_6
    instance-of v0, v1, Ld00/a;

    if-nez v0, :cond_27

    sget-object v7, Ld00/c;->a:Ld00/c;

    invoke-static {v1, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    goto/16 :goto_10

    :cond_7
    instance-of v0, v1, Ld00/b;

    if-eqz v0, :cond_9

    if-eqz v11, :cond_8

    sget-object v0, Lwz/h0;->w:Lwz/h0;

    if-eq v12, v0, :cond_8

    new-instance v0, Lwz/q1;

    invoke-direct {v0, v11}, Lwz/q1;-><init>(Ld00/l;)V

    goto :goto_3

    :cond_8
    new-instance v0, Lwz/o1;

    sget-object v1, Lwz/c1;->d:Lwz/c1;

    invoke-direct {v0, v1}, Lwz/o1;-><init>(Lwz/e1;)V

    :goto_3
    move-object v4, v0

    goto/16 :goto_11

    :cond_9
    sget-object v0, Ld00/d;->a:Ld00/d;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    if-eqz v11, :cond_a

    sget-object v0, Lwz/h0;->w:Lwz/h0;

    if-eq v12, v0, :cond_a

    new-instance v0, Lwz/q1;

    invoke-direct {v0, v11}, Lwz/q1;-><init>(Ld00/l;)V

    goto :goto_3

    :cond_a
    new-instance v0, Lwz/o1;

    sget-object v1, Lwz/c1;->d:Lwz/c1;

    invoke-direct {v0, v1}, Lwz/o1;-><init>(Lwz/e1;)V

    goto :goto_3

    :cond_b
    instance-of v0, v1, Ld00/e;

    if-eqz v0, :cond_26

    check-cast v1, Ld00/e;

    iget-object v0, v1, Ld00/e;->b:Ld00/k;

    invoke-static {v11}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v7, v10, Lwz/y;->x:Lxz/x;

    if-eqz v6, :cond_e

    iget-boolean v0, v1, Ld00/e;->a:Z

    if-eqz v0, :cond_c

    new-instance v18, Lwz/n;

    invoke-static {v7}, Ls3/d;->j(Lxz/x;)Lwz/e;

    move-result-object v19

    const/16 v22, 0x0

    const/16 v23, 0xe

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-direct/range {v18 .. v23}, Lwz/n;-><init>(Lwz/e;Lwz/u0;Ly00/j0;Ljava/lang/Boolean;I)V

    move-object/from16 v0, v18

    invoke-virtual {v10, v0}, Lwz/y;->l(Lwz/q;)V

    goto/16 :goto_f

    :cond_c
    new-instance v0, Lwz/q1;

    invoke-direct {v0, v11}, Lwz/q1;-><init>(Ld00/l;)V

    :cond_d
    :goto_4
    move-object/from16 v16, v0

    goto/16 :goto_f

    :cond_e
    if-eqz v14, :cond_19

    if-nez v4, :cond_10

    instance-of v0, v0, Ld00/h;

    if-nez v0, :cond_f

    new-instance v18, Lwz/n;

    invoke-static {v7}, Ls3/d;->j(Lxz/x;)Lwz/e;

    move-result-object v19

    const/16 v22, 0x0

    const/16 v23, 0xe

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-direct/range {v18 .. v23}, Lwz/n;-><init>(Lwz/e;Lwz/u0;Ly00/j0;Ljava/lang/Boolean;I)V

    move-object/from16 v0, v18

    invoke-virtual {v10, v0}, Lwz/y;->l(Lwz/q;)V

    goto/16 :goto_f

    :cond_f
    new-instance v0, Lwz/o1;

    sget-object v1, Lwz/x0;->d:Lwz/x0;

    invoke-direct {v0, v1}, Lwz/o1;-><init>(Lwz/e1;)V

    goto :goto_4

    :cond_10
    invoke-virtual {v4}, Lcom/stripe/android/model/ConsumerSessionRefresh;->getLinkAuthIntent()Lcom/stripe/android/model/LinkAuthIntent;

    move-result-object v1

    if-eqz v1, :cond_11

    invoke-virtual {v1}, Lcom/stripe/android/model/LinkAuthIntent;->getStatus()Ly00/l2;

    move-result-object v1

    goto :goto_5

    :cond_11
    move-object/from16 v1, v16

    :goto_5
    const/4 v4, -0x1

    if-nez v1, :cond_12

    move v6, v4

    goto :goto_6

    :cond_12
    sget-object v6, Lwz/s;->a:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v11

    aget v6, v6, v11

    :goto_6
    if-eq v6, v4, :cond_17

    const/4 v4, 0x1

    if-eq v6, v4, :cond_16

    const/4 v4, 0x2

    if-eq v6, v4, :cond_15

    const/4 v4, 0x3

    if-eq v6, v4, :cond_14

    const/4 v4, 0x4

    if-eq v6, v4, :cond_14

    const/4 v1, 0x5

    if-ne v6, v1, :cond_13

    goto :goto_8

    :cond_13
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_14
    invoke-static {v7}, Ls3/d;->j(Lxz/x;)Lwz/e;

    move-result-object v0

    new-instance v4, Ljava/lang/IllegalStateException;

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    const-string v6, "Unexpected LAI status when account is verified: "

    invoke-static {v6, v1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v4, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    new-instance v1, Lwz/o;

    invoke-direct {v1, v4, v0}, Lwz/o;-><init>(Ljava/lang/Throwable;Lwz/e;)V

    invoke-virtual {v10, v1}, Lwz/y;->l(Lwz/q;)V

    :goto_7
    move-object/from16 v0, v16

    goto :goto_9

    :cond_15
    new-instance v18, Lwz/n;

    invoke-static {v7}, Ls3/d;->j(Lxz/x;)Lwz/e;

    move-result-object v19

    sget-object v22, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/16 v23, 0x6

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-direct/range {v18 .. v23}, Lwz/n;-><init>(Lwz/e;Lwz/u0;Ly00/j0;Ljava/lang/Boolean;I)V

    move-object/from16 v0, v18

    invoke-virtual {v10, v0}, Lwz/y;->l(Lwz/q;)V

    goto :goto_7

    :cond_16
    new-instance v18, Lwz/n;

    invoke-static {v7}, Ls3/d;->j(Lxz/x;)Lwz/e;

    move-result-object v19

    sget-object v22, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const/16 v23, 0x6

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-direct/range {v18 .. v23}, Lwz/n;-><init>(Lwz/e;Lwz/u0;Ly00/j0;Ljava/lang/Boolean;I)V

    move-object/from16 v0, v18

    invoke-virtual {v10, v0}, Lwz/y;->l(Lwz/q;)V

    goto :goto_7

    :cond_17
    :goto_8
    instance-of v0, v0, Ld00/h;

    if-nez v0, :cond_18

    new-instance v18, Lwz/n;

    invoke-static {v7}, Ls3/d;->j(Lxz/x;)Lwz/e;

    move-result-object v19

    const/16 v22, 0x0

    const/16 v23, 0xe

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-direct/range {v18 .. v23}, Lwz/n;-><init>(Lwz/e;Lwz/u0;Ly00/j0;Ljava/lang/Boolean;I)V

    move-object/from16 v0, v18

    invoke-virtual {v10, v0}, Lwz/y;->l(Lwz/q;)V

    goto :goto_7

    :cond_18
    new-instance v0, Lwz/o1;

    sget-object v1, Lwz/x0;->d:Lwz/x0;

    invoke-direct {v0, v1}, Lwz/o1;-><init>(Lwz/e1;)V

    :goto_9
    if-nez v0, :cond_d

    goto/16 :goto_f

    :cond_19
    instance-of v0, v13, Lwz/k0;

    if-nez v0, :cond_1b

    sget-object v0, Lwz/l0;->w:Lwz/l0;

    invoke-static {v13, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1b

    instance-of v0, v13, Lwz/m0;

    if-eqz v0, :cond_1a

    goto :goto_a

    :cond_1a
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_1b
    :goto_a
    iget-boolean v0, v11, Ld00/l;->K:Z

    if-eqz v0, :cond_24

    invoke-interface {v13}, Lwz/n0;->n0()Ly00/c0;

    move-result-object v0

    if-nez v0, :cond_24

    iget-object v0, v10, Lwz/y;->M:Lq00/g;

    iget-object v0, v0, Lq00/g;->a:Lxl/a;

    iget-object v1, v0, Lxl/a;->x:Ljava/lang/Object;

    check-cast v1, Lv03/h;

    invoke-interface {v1}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lwz/g0;

    iget-object v0, v0, Lxl/a;->y:Ljava/lang/Object;

    check-cast v0, Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwz/n0;

    const-string v4, "configuration"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, v1, Lwz/g0;->M:Lf20/b;

    const-string v6, "linkLaunchMode"

    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v1, Lwz/g0;->w:Ly00/c8;

    invoke-static {v1, v11}, Ld00/n;->a(Ly00/c8;Ld00/l;)Ljava/util/Set;

    move-result-object v1

    instance-of v6, v0, Lwz/m0;

    if-eqz v6, :cond_1c

    check-cast v0, Lwz/m0;

    goto :goto_b

    :cond_1c
    move-object/from16 v0, v16

    :goto_b
    if-eqz v0, :cond_1d

    iget-object v0, v0, Lwz/m0;->x:Lwz/v0;

    goto :goto_c

    :cond_1d
    move-object/from16 v0, v16

    :goto_c
    invoke-static {}, Lwb3/f;->x()Ln83/c;

    move-result-object v6

    iget-object v7, v11, Ld00/l;->x:Ljava/lang/String;

    if-eqz v7, :cond_1f

    if-eqz v4, :cond_1f

    const-string v7, "bank_account"

    invoke-interface {v1, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1f

    if-eqz v0, :cond_1e

    sget-object v7, Lwz/v0;->x:Lwz/v0;

    if-ne v0, v7, :cond_1f

    :cond_1e
    new-instance v7, Lq00/d;

    invoke-direct {v7, v4}, Lq00/d;-><init>(Lf20/b;)V

    invoke-virtual {v6, v7}, Ln83/c;->add(Ljava/lang/Object;)Z

    :cond_1f
    const-string v4, "card"

    invoke-interface {v1, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_21

    if-eqz v0, :cond_20

    sget-object v1, Lwz/v0;->w:Lwz/v0;

    if-ne v0, v1, :cond_21

    :cond_20
    sget-object v0, Lq00/e;->c:Lq00/e;

    invoke-virtual {v6, v0}, Ln83/c;->add(Ljava/lang/Object;)Z

    :cond_21
    invoke-static {v6}, Lwb3/f;->k(Ln83/c;)Ln83/c;

    move-result-object v0

    invoke-virtual {v0}, Ln83/c;->a()I

    move-result v1

    const/4 v4, 0x1

    if-le v1, v4, :cond_22

    sget-object v0, Lq00/e;->c:Lq00/e;

    goto :goto_d

    :cond_22
    invoke-static {v0}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq00/f;

    :goto_d
    instance-of v0, v0, Lq00/d;

    if-eqz v0, :cond_23

    sget-object v0, Lwz/d1;->d:Lwz/d1;

    goto :goto_e

    :cond_23
    sget-object v0, Lwz/y0;->d:Lwz/y0;

    goto :goto_e

    :cond_24
    sget-object v0, Lwz/d1;->d:Lwz/d1;

    :goto_e
    new-instance v1, Lwz/o1;

    invoke-direct {v1, v0}, Lwz/o1;-><init>(Lwz/e1;)V

    move-object/from16 v16, v1

    :goto_f
    if-nez v16, :cond_25

    return-object v5

    :cond_25
    move-object/from16 v4, v16

    goto :goto_11

    :cond_26
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_27
    :goto_10
    if-eqz v15, :cond_2c

    if-nez v18, :cond_2c

    if-eqz v14, :cond_28

    goto :goto_14

    :cond_28
    new-instance v0, Lwz/o1;

    sget-object v1, Lwz/z0;->d:Lwz/z0;

    invoke-direct {v0, v1}, Lwz/o1;-><init>(Lwz/e1;)V

    goto/16 :goto_3

    :goto_11
    instance-of v0, v4, Lwz/o1;

    if-eqz v0, :cond_2a

    if-eqz v8, :cond_2a

    iput-object v10, v2, Lwz/x;->w:Lwz/y;

    iput-object v4, v2, Lwz/x;->x:Ljava/lang/Object;

    iput-boolean v9, v2, Lwz/x;->y:Z

    const/4 v0, 0x2

    iput v0, v2, Lwz/x;->G:I

    const-wide/16 v0, 0x28a

    invoke-static {v0, v1, v2}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_29

    :goto_12
    return-object v3

    :cond_29
    move v3, v9

    move-object v2, v10

    :goto_13
    move-object v10, v2

    move v9, v3

    :cond_2a
    if-eqz v9, :cond_2b

    instance-of v0, v4, Lwz/o1;

    if-eqz v0, :cond_2b

    check-cast v4, Lwz/o1;

    iget-object v0, v4, Lwz/o1;->a:Lwz/e1;

    const/4 v4, 0x1

    invoke-static {v10, v0, v4}, Lwz/y;->q(Lwz/y;Lwz/e1;Z)V

    return-object v5

    :cond_2b
    iget-object v0, v10, Lwz/y;->U:Lec3/h2;

    invoke-virtual {v0, v4}, Lec3/h2;->j(Ljava/lang/Object;)V

    return-object v5

    :cond_2c
    :goto_14
    if-eqz v0, :cond_2d

    check-cast v1, Ld00/a;

    goto :goto_15

    :cond_2d
    move-object/from16 v1, v16

    :goto_15
    if-eqz v1, :cond_2e

    iget-object v0, v1, Ld00/a;->a:Ljava/lang/Throwable;

    move-object/from16 v16, v0

    :cond_2e
    new-instance v0, Lwz/o;

    if-nez v16, :cond_2f

    new-instance v16, Lcom/stripe/android/link/NoLinkAccountFoundException;

    invoke-direct/range {v16 .. v16}, Lcom/stripe/android/link/NoLinkAccountFoundException;-><init>()V

    :cond_2f
    move-object/from16 v1, v16

    sget-object v2, Lwz/b;->w:Lwz/b;

    invoke-direct {v0, v1, v2}, Lwz/o;-><init>(Ljava/lang/Throwable;Lwz/e;)V

    invoke-virtual {v10, v0}, Lwz/y;->l(Lwz/q;)V

    return-object v5
.end method
