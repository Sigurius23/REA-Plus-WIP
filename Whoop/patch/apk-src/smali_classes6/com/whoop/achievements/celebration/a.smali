.class public abstract Lcom/whoop/achievements/celebration/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\u001a7\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\u000b\u00b2\u0006\u000e\u0010\n\u001a\u00020\u00068\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Lcom/whoop/achievements/celebration/d;",
        "viewState",
        "Lkotlin/Function1;",
        "Lcom/whoop/achievements/celebration/b;",
        "Ll83/a0;",
        "onEvent",
        "",
        "skipAnimations",
        "e",
        "(Lcom/whoop/achievements/celebration/d;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)V",
        "isVisible",
        "achievements_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic a(Lcom/whoop/achievements/celebration/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/achievements/celebration/a;->f(Lcom/whoop/achievements/celebration/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/achievements/celebration/d;Lkotlin/jvm/functions/Function1;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lcom/whoop/achievements/celebration/a;->k(Lcom/whoop/achievements/celebration/d;Lkotlin/jvm/functions/Function1;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Lcom/whoop/achievements/celebration/d;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/achievements/celebration/a;->j(Lkotlin/jvm/functions/Function1;Lcom/whoop/achievements/celebration/d;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lcom/whoop/achievements/celebration/d;Lkotlin/jvm/functions/Function1;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/whoop/achievements/celebration/a;->i(Lcom/whoop/achievements/celebration/d;Lkotlin/jvm/functions/Function1;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Lcom/whoop/achievements/celebration/d;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/achievements/celebration/d;",
            "Lkotlin/jvm/functions/Function1;",
            "Z",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move/from16 v4, p4

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v11, p3

    check-cast v11, Lp1/q;

    const v0, -0x1552f6c4

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v4, 0x6

    const/4 v2, 0x4

    const/4 v3, 0x2

    if-nez v0, :cond_1

    invoke-virtual {v11, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    or-int/2addr v0, v4

    goto :goto_1

    :cond_1
    move v0, v4

    :goto_1
    and-int/lit8 v5, p5, 0x2

    const/16 v6, 0x20

    if-eqz v5, :cond_3

    or-int/lit8 v0, v0, 0x30

    :cond_2
    move-object/from16 v7, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v7, v4, 0x30

    if-nez v7, :cond_2

    move-object/from16 v7, p1

    invoke-virtual {v11, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    move v8, v6

    goto :goto_2

    :cond_4
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v0, v8

    :goto_3
    and-int/lit8 v8, p5, 0x4

    const/16 v9, 0x100

    if-eqz v8, :cond_6

    or-int/lit16 v0, v0, 0x180

    :cond_5
    move/from16 v10, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v10, v4, 0x180

    if-nez v10, :cond_5

    move/from16 v10, p2

    invoke-virtual {v11, v10}, Lp1/q;->h(Z)Z

    move-result v12

    if-eqz v12, :cond_7

    move v12, v9

    goto :goto_4

    :cond_7
    const/16 v12, 0x80

    :goto_4
    or-int/2addr v0, v12

    :goto_5
    and-int/lit16 v12, v0, 0x93

    const/16 v13, 0x92

    const/4 v15, 0x0

    if-eq v12, v13, :cond_8

    const/4 v12, 0x1

    goto :goto_6

    :cond_8
    move v12, v15

    :goto_6
    and-int/lit8 v13, v0, 0x1

    invoke-virtual {v11, v13, v12}, Lp1/q;->U(IZ)Z

    move-result v12

    if-eqz v12, :cond_1b

    sget-object v12, Lp1/l;->a:Lp1/v0;

    if-eqz v5, :cond_a

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v12, :cond_9

    new-instance v5, Ll60/a;

    const/4 v7, 0x0

    invoke-direct {v5, v7}, Ll60/a;-><init>(I)V

    invoke-virtual {v11, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v5, Lkotlin/jvm/functions/Function1;

    goto :goto_7

    :cond_a
    move-object v5, v7

    :goto_7
    if-eqz v8, :cond_b

    move v7, v15

    goto :goto_8

    :cond_b
    move v7, v10

    :goto_8
    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v12, :cond_c

    invoke-static {v7, v11}, Lr80/c;->w(ZLp1/q;)Lp1/k1;

    move-result-object v8

    :cond_c
    check-cast v8, Lp1/c1;

    and-int/lit16 v10, v0, 0x380

    if-ne v10, v9, :cond_d

    const/4 v9, 0x1

    goto :goto_9

    :cond_d
    move v9, v15

    :goto_9
    and-int/lit8 v10, v0, 0xe

    if-ne v10, v2, :cond_e

    const/4 v13, 0x1

    goto :goto_a

    :cond_e
    move v13, v15

    :goto_a
    or-int/2addr v9, v13

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    const/4 v14, 0x0

    if-nez v9, :cond_f

    if-ne v13, v12, :cond_10

    :cond_f
    new-instance v13, Lcom/whoop/achievements/celebration/a$a;

    invoke-direct {v13, v7, v1, v8, v14}, Lcom/whoop/achievements/celebration/a$a;-><init>(ZLcom/whoop/achievements/celebration/d;Lp1/c1;Lq83/d;)V

    invoke-virtual {v11, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    check-cast v13, Lc93/m;

    invoke-static {v11, v13, v1}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    instance-of v9, v1, Lcom/whoop/achievements/celebration/d$b;

    if-eqz v9, :cond_11

    const v0, 0x7e6daf03

    invoke-virtual {v11, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v15}, Lp1/q;->q(Z)V

    move-object v2, v5

    move v3, v7

    goto/16 :goto_e

    :cond_11
    instance-of v9, v1, Lcom/whoop/achievements/celebration/d$c;

    if-eqz v9, :cond_16

    const v9, 0x7e6f540e

    invoke-virtual {v11, v9}, Lp1/q;->e0(I)V

    and-int/lit8 v0, v0, 0x70

    if-ne v0, v6, :cond_12

    const/4 v0, 0x1

    goto :goto_b

    :cond_12
    move v0, v15

    :goto_b
    if-ne v10, v2, :cond_13

    const/4 v2, 0x1

    goto :goto_c

    :cond_13
    move v2, v15

    :goto_c
    or-int/2addr v0, v2

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_14

    if-ne v2, v12, :cond_15

    :cond_14
    new-instance v2, Lcom/whoop/achievements/celebration/a$b;

    invoke-direct {v2, v5, v1, v14}, Lcom/whoop/achievements/celebration/a$b;-><init>(Lkotlin/jvm/functions/Function1;Lcom/whoop/achievements/celebration/d;Lq83/d;)V

    invoke-virtual {v11, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_15
    check-cast v2, Lc93/m;

    invoke-static {v11, v2, v1}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v8}, Lcom/whoop/achievements/celebration/a;->g(Lp1/c1;)Z

    move-result v0

    const/16 v2, 0x2bc

    sget-object v6, Ld0/b0;->a:Ld0/v;

    invoke-static {v2, v15, v6, v3}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v2

    invoke-static {v2, v3}, Lc0/w0;->e(Ld0/c0;I)Lc0/d1;

    move-result-object v2

    new-instance v3, Lih1/f;

    const/16 v6, 0xc

    invoke-direct {v3, v6, v1, v5}, Lih1/f;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v6, 0x18159475

    invoke-static {v6, v11, v3}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v10

    const/high16 v12, 0x30000

    const/16 v13, 0x1a

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move v3, v7

    move-object v7, v2

    move-object v2, v5

    move v5, v0

    invoke-static/range {v5 .. v13}, Landroidx/compose/animation/b;->f(ZLandroidx/compose/ui/Modifier;Lc0/c1;Lc0/e1;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v11, v15}, Lp1/q;->q(Z)V

    goto :goto_e

    :cond_16
    move-object v2, v5

    move v3, v7

    instance-of v5, v1, Lcom/whoop/achievements/celebration/d$a;

    if-eqz v5, :cond_1a

    const v5, 0x7e880716

    invoke-virtual {v11, v5}, Lp1/q;->e0(I)V

    and-int/lit8 v0, v0, 0x70

    if-ne v0, v6, :cond_17

    const/4 v0, 0x1

    goto :goto_d

    :cond_17
    move v0, v15

    :goto_d
    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v0, :cond_18

    if-ne v5, v12, :cond_19

    :cond_18
    new-instance v5, Lcom/whoop/achievements/celebration/a$c;

    invoke-direct {v5, v2, v14}, Lcom/whoop/achievements/celebration/a$c;-><init>(Lkotlin/jvm/functions/Function1;Lq83/d;)V

    invoke-virtual {v11, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_19
    check-cast v5, Lc93/m;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-static {v11, v5, v0}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v11, v15}, Lp1/q;->q(Z)V

    goto :goto_e

    :cond_1a
    const v0, -0xc70149d

    invoke-static {v0, v11, v15}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0

    :cond_1b
    invoke-virtual {v11}, Lp1/q;->X()V

    move-object v2, v7

    move v3, v10

    :goto_e
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_1c

    new-instance v0, Lbg0/h;

    const/16 v6, 0x11

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lbg0/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZIII)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_1c
    return-void
.end method

.method private static final f(Lcom/whoop/achievements/celebration/b;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lp1/c1;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")Z"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final h(Lp1/c1;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Z)V"
        }
    .end annotation

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final i(Lcom/whoop/achievements/celebration/d;Lkotlin/jvm/functions/Function1;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    const-string p4, "$this$AnimatedVisibility"

    invoke-static {p2, p4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/high16 p2, 0x3f800000    # 1.0f

    sget-object p4, Lb2/t;->w:Lb2/t;

    invoke-static {p2, p4}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p2

    sget-object p4, Li2/t;->b:Li2/s;

    sget-wide v0, Li2/x;->m:J

    new-instance v2, Li2/x;

    invoke-direct {v2, v0, v1}, Li2/x;-><init>(J)V

    sget-object v0, Lx81/d;->a:Lx81/d;

    sget v1, Lx81/d;->b:I

    invoke-virtual {v0, p3, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->t()J

    move-result-wide v3

    new-instance v5, Li2/x;

    invoke-direct {v5, v3, v4}, Li2/x;-><init>(J)V

    invoke-virtual {v0, p3, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->v()J

    move-result-wide v3

    new-instance v6, Li2/x;

    invoke-direct {v6, v3, v4}, Li2/x;-><init>(J)V

    invoke-virtual {v0, p3, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->v()J

    move-result-wide v0

    new-instance v3, Li2/x;

    invoke-direct {v3, v0, v1}, Li2/x;-><init>(J)V

    filled-new-array {v2, v5, v6, v3}, [Li2/x;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    const/16 v1, 0xe

    const/4 v2, 0x0

    invoke-static {p4, v0, v2, v2, v1}, Li2/s;->k(Li2/s;Ljava/util/List;FFI)Li2/k0;

    move-result-object p4

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-static {p2, p4, v0, v2, v1}, Landroidx/compose/foundation/a;->b(Landroidx/compose/ui/Modifier;Li2/t;Li2/a1;FI)Landroidx/compose/ui/Modifier;

    move-result-object p2

    sget-object p4, Lb2/e;->w:Lb2/m;

    const/4 v0, 0x0

    invoke-static {p4, v0}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object p4

    move-object v0, p3

    check-cast v0, Lp1/q;

    iget-wide v1, v0, Lp1/q;->T:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v2

    invoke-static {p3, p2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p2

    sget-object v3, La3/l;->a:La3/k;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v3, La3/k;->b:La3/j;

    iget-object v4, v0, Lp1/q;->a:Lhb3/a0;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v4, v0, Lp1/q;->S:Z

    if-eqz v4, :cond_0

    invoke-virtual {v0, v3}, Lp1/q;->l(Lc93/a;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_0
    sget-object v3, La3/k;->g:La3/i;

    invoke-static {p3, v3, p4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p4, La3/k;->f:La3/i;

    invoke-static {p3, p4, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p4, La3/k;->j:La3/i;

    iget-boolean v2, v0, Lp1/q;->S:Z

    if-nez v2, :cond_1

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    :cond_1
    invoke-static {v1, v0, v1, p4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_2
    sget-object p4, La3/k;->d:La3/i;

    invoke-static {p3, p4, p2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object p2, p0

    check-cast p2, Lcom/whoop/achievements/celebration/d$c;

    invoke-virtual {p2}, Lcom/whoop/achievements/celebration/d$c;->a()Li51/o;

    move-result-object v2

    invoke-virtual {v0, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p2

    invoke-virtual {v0, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p4

    or-int/2addr p2, p4

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p4

    if-nez p2, :cond_3

    sget-object p2, Lp1/l;->a:Lp1/v0;

    if-ne p4, p2, :cond_4

    :cond_3
    new-instance p4, Ljp1/c;

    const/16 p2, 0x14

    invoke-direct {p4, p2, p1, p0}, Ljp1/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, p4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    move-object v3, p4

    check-cast v3, Lkotlin/jvm/functions/Function1;

    sget p0, Li51/o;->k:I

    shl-int/lit8 v5, p0, 0x3

    const/4 v6, 0x1

    const/4 v1, 0x0

    move-object v4, p3

    invoke-static/range {v1 .. v6}, Lm01/d;->p(Landroidx/compose/ui/Modifier;Li51/o;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    const/4 p0, 0x1

    invoke-virtual {v0, p0}, Lp1/q;->q(Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Lkotlin/jvm/functions/Function1;Lcom/whoop/achievements/celebration/d;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "event"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/achievements/celebration/b$b;

    check-cast p1, Lcom/whoop/achievements/celebration/d$c;

    invoke-virtual {p1}, Lcom/whoop/achievements/celebration/d$c;->a()Li51/o;

    move-result-object p1

    invoke-direct {v0, p2, p1}, Lcom/whoop/achievements/celebration/b$b;-><init>(Ljava/lang/Object;Li51/o;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Lcom/whoop/achievements/celebration/d;Lkotlin/jvm/functions/Function1;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lcom/whoop/achievements/celebration/a;->e(Lcom/whoop/achievements/celebration/d;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final synthetic l(Lp1/c1;Z)V
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/achievements/celebration/a;->h(Lp1/c1;Z)V

    return-void
.end method
