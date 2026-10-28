.class public abstract Loq1/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a5\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a=\u0010\r\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u000c\u001a\u00020\u000b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003\u00a2\u0006\u0004\u0008\r\u0010\u000e\u001a!\u0010\u0010\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u000fH\u0003\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u001a!\u0010\u0013\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0012H\u0003\u00a2\u0006\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Llq1/c;",
        "state",
        "Lkotlin/Function1;",
        "Lkq1/a;",
        "Ll83/a0;",
        "onNavigationEvent",
        "o",
        "(Landroidx/compose/ui/Modifier;Llq1/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Llq1/b;",
        "Lhq1/f;",
        "metadata",
        "A",
        "(Landroidx/compose/ui/Modifier;Llq1/b;Lhq1/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Llq1/e;",
        "D",
        "(Landroidx/compose/ui/Modifier;Llq1/e;Landroidx/compose/runtime/Composer;II)V",
        "Llq1/a;",
        "w",
        "(Landroidx/compose/ui/Modifier;Llq1/a;Landroidx/compose/runtime/Composer;II)V",
        "behavior-impact_release"
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
.method private static final A(Landroidx/compose/ui/Modifier;Llq1/b;Lhq1/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 33
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Llq1/b;",
            "Lhq1/f;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p5

    move-object/from16 v12, p4

    check-cast v12, Lp1/q;

    const v0, 0x547057eb

    invoke-virtual {v12, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p6, 0x1

    const/4 v2, 0x4

    if-eqz v0, :cond_0

    or-int/lit8 v6, v5, 0x6

    move v7, v6

    move-object/from16 v6, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v6, v5, 0x6

    if-nez v6, :cond_2

    move-object/from16 v6, p0

    invoke-virtual {v12, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    move v7, v2

    goto :goto_0

    :cond_1
    const/4 v7, 0x2

    :goto_0
    or-int/2addr v7, v5

    goto :goto_1

    :cond_2
    move-object/from16 v6, p0

    move v7, v5

    :goto_1
    and-int/lit8 v8, v5, 0x30

    move-object/from16 v15, p1

    if-nez v8, :cond_4

    invoke-virtual {v12, v15}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_3

    const/16 v8, 0x20

    goto :goto_2

    :cond_3
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v7, v8

    :cond_4
    and-int/lit16 v8, v5, 0x180

    const/16 v9, 0x100

    if-nez v8, :cond_6

    invoke-virtual {v12, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_5

    move v8, v9

    goto :goto_3

    :cond_5
    const/16 v8, 0x80

    :goto_3
    or-int/2addr v7, v8

    :cond_6
    and-int/lit16 v8, v5, 0xc00

    const/16 v10, 0x800

    if-nez v8, :cond_8

    invoke-virtual {v12, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_7

    move v8, v10

    goto :goto_4

    :cond_7
    const/16 v8, 0x400

    :goto_4
    or-int/2addr v7, v8

    :cond_8
    and-int/lit16 v8, v7, 0x493

    const/16 v11, 0x492

    const/4 v14, 0x1

    if-eq v8, v11, :cond_9

    move v8, v14

    goto :goto_5

    :cond_9
    const/4 v8, 0x0

    :goto_5
    and-int/lit8 v11, v7, 0x1

    invoke-virtual {v12, v11, v8}, Lp1/q;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_13

    sget-object v8, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_a

    move-object v0, v8

    goto :goto_6

    :cond_a
    move-object v0, v6

    :goto_6
    invoke-static {v8}, Ll0/f;->m(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v15}, Llq1/b;->d()Lcom/whoop/design/atomic/organism/toolbar/d$a;

    move-result-object v11

    and-int/lit16 v13, v7, 0x1c00

    if-ne v13, v10, :cond_b

    move v10, v14

    goto :goto_7

    :cond_b
    const/4 v10, 0x0

    :goto_7
    and-int/lit16 v7, v7, 0x380

    if-ne v7, v9, :cond_c

    move v7, v14

    goto :goto_8

    :cond_c
    const/4 v7, 0x0

    :goto_8
    or-int/2addr v7, v10

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v7, :cond_d

    sget-object v7, Lp1/l;->a:Lp1/v0;

    if-ne v9, v7, :cond_e

    :cond_d
    new-instance v9, Lmi2/o;

    const/16 v7, 0x1c

    invoke-direct {v9, v7, v4, v3}, Lmi2/o;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v12, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast v9, Lc93/a;

    sget v7, Lcom/whoop/design/atomic/organism/toolbar/d$a;->r:I

    shl-int/lit8 v13, v7, 0x3

    move v7, v14

    const/16 v14, 0x34

    move-object v10, v8

    const/4 v8, 0x0

    move-object/from16 v16, v10

    const/4 v10, 0x0

    move/from16 v17, v7

    move-object v7, v11

    const/4 v11, 0x0

    move-object/from16 v1, v16

    const/4 v15, 0x0

    invoke-static/range {v6 .. v14}, Lcom/whoop/design/atomic/organism/toolbar/b;->d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object v6, Ll0/m;->c:Ll0/g;

    sget-object v7, Lb2/e;->M:Lb2/k;

    invoke-static {v6, v7, v12, v15}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    iget-wide v7, v12, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v12, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v10, La3/l;->a:La3/k;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v11, v12, Lp1/q;->S:Z

    if-eqz v11, :cond_f

    invoke-virtual {v12, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_f
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_9
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v12, v10, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v12, v6, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v8, v12, Lp1/q;->S:Z

    if-nez v8, :cond_10

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v8, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_11

    :cond_10
    invoke-static {v7, v12, v7, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_11
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v12, v6, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    int-to-float v2, v2

    const/16 v6, 0x8

    int-to-float v6, v6

    mul-float/2addr v2, v6

    invoke-static {v2, v1}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v12, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p1 .. p1}, Llq1/b;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    sget v7, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v2, v12, v7}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    sget-object v7, Lx81/d;->a:Lx81/d;

    sget v8, Lx81/d;->b:I

    invoke-virtual {v7, v12, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->y()J

    move-result-wide v9

    invoke-virtual {v7, v12, v8}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v7

    invoke-virtual {v7}, Lb91/d;->O()Lb91/a;

    move-result-object v26

    sget v7, Lb91/a;->d:I

    shl-int/lit8 v30, v7, 0x12

    const v31, 0x2fff8

    move-wide v8, v9

    const-wide/16 v10, 0x0

    move-object/from16 v28, v12

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move v7, v15

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v29, 0x30

    move/from16 v32, v7

    move-object v7, v1

    move v1, v6

    move-object v6, v2

    move/from16 v2, v32

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object v10, v7

    move-object/from16 v12, v28

    invoke-virtual/range {p1 .. p1}, Llq1/b;->c()Llq1/e;

    move-result-object v6

    if-nez v6, :cond_12

    const v6, -0x4e40dbf2

    invoke-virtual {v12, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v2}, Lp1/q;->q(Z)V

    const/4 v7, 0x1

    :goto_a
    const/4 v2, 0x2

    goto :goto_b

    :cond_12
    const v7, -0x4e40dbf1

    invoke-virtual {v12, v7}, Lp1/q;->e0(I)V

    const/4 v7, 0x1

    int-to-float v8, v7

    invoke-static {v8, v1, v10, v12}, Lih0/d0;->u(FFLb2/t;Lp1/q;)V

    const/4 v8, 0x0

    invoke-static {v8, v6, v12, v2, v7}, Loq1/d;->D(Landroidx/compose/ui/Modifier;Llq1/e;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v12, v2}, Lp1/q;->q(Z)V

    goto :goto_a

    :goto_b
    int-to-float v2, v2

    invoke-static {v2, v1, v10, v12, v7}, Lr80/c;->z(FFLb2/t;Lp1/q;Z)V

    move-object v1, v0

    goto :goto_c

    :cond_13
    invoke-virtual {v12}, Lp1/q;->X()V

    move-object v1, v6

    :goto_c
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_14

    new-instance v0, Lo72/a;

    const/4 v7, 0x2

    move-object/from16 v2, p1

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Lo72/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_14
    return-void
.end method

.method private static final B(Lkotlin/jvm/functions/Function1;Lhq1/f;)Ll83/a0;
    .locals 1

    new-instance v0, Lkq1/a$a;

    invoke-direct {v0, p1}, Lkq1/a$a;-><init>(Lhq1/f;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final C(Landroidx/compose/ui/Modifier;Llq1/b;Lhq1/f;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v6, p5

    move-object v4, p6

    invoke-static/range {v0 .. v6}, Loq1/d;->A(Landroidx/compose/ui/Modifier;Llq1/b;Lhq1/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final D(Landroidx/compose/ui/Modifier;Llq1/e;Landroidx/compose/runtime/Composer;II)V
    .locals 10

    move-object v7, p2

    check-cast v7, Lp1/q;

    const p2, 0x61be3d9f

    invoke-virtual {v7, p2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p2, p4, 0x1

    if-eqz p2, :cond_0

    or-int/lit8 v0, p3, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v0, p3, 0x6

    if-nez v0, :cond_2

    invoke-virtual {v7, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x4

    goto :goto_0

    :cond_1
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p3

    goto :goto_1

    :cond_2
    move v0, p3

    :goto_1
    and-int/lit8 v1, p3, 0x30

    if-nez v1, :cond_4

    invoke-virtual {v7, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    const/16 v1, 0x20

    goto :goto_2

    :cond_3
    const/16 v1, 0x10

    :goto_2
    or-int/2addr v0, v1

    :cond_4
    and-int/lit8 v1, v0, 0x13

    const/16 v2, 0x12

    const/4 v3, 0x1

    if-eq v1, v2, :cond_5

    move v1, v3

    goto :goto_3

    :cond_5
    const/4 v1, 0x0

    :goto_3
    and-int/lit8 v2, v0, 0x1

    invoke-virtual {v7, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_7

    if-eqz p2, :cond_6

    sget-object p0, Lb2/t;->w:Lb2/t;

    :cond_6
    int-to-float p2, v3

    const/16 v1, 0x8

    int-to-float v1, v1

    mul-float/2addr p2, v1

    invoke-static {p2}, Ll0/m;->i(F)Ll0/k;

    move-result-object v1

    invoke-static {p2}, Ll0/m;->i(F)Ll0/k;

    move-result-object v2

    sget-object v3, Lb2/e;->K:Lb2/l;

    new-instance p2, Llz1/a;

    const/16 v4, 0x9

    invoke-direct {p2, p1, v4}, Llz1/a;-><init>(Ljava/lang/Object;I)V

    const v4, -0xe078a26

    invoke-static {v4, v7, p2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v6

    and-int/lit8 p2, v0, 0xe

    const v0, 0x180db0

    or-int v8, p2, v0

    const/16 v9, 0x30

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v9}, Ll0/g2;->a(Landroidx/compose/ui/Modifier;Ll0/i;Ll0/l;Lb2/g;IILkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    move-object v2, v0

    goto :goto_4

    :cond_7
    invoke-virtual {v7}, Lp1/q;->X()V

    move-object v2, p0

    :goto_4
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_8

    new-instance v1, Lno0/y0;

    const/4 v6, 0x7

    move-object v3, p1

    move v4, p3

    move v5, p4

    invoke-direct/range {v1 .. v6}, Lno0/y0;-><init>(Landroidx/compose/ui/Modifier;Ljava/lang/Object;III)V

    iput-object v1, p0, Lp1/v1;->d:Lc93/m;

    :cond_8
    return-void
.end method

.method private static final E(Llq1/e;Ll0/s0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 30

    const-string v0, "$this$FlowRow"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v0, p3, 0x11

    const/16 v1, 0x10

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    and-int/lit8 v1, p3, 0x1

    move-object/from16 v7, p2

    check-cast v7, Lp1/q;

    invoke-virtual {v7, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_7

    const v0, 0x55b26a34

    invoke-virtual {v7, v0}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Llq1/e;->b()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Lhy0/h1;

    sget v8, Lhy0/h1;->w:I

    const/4 v9, 0x6

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v4 .. v9}, Lhy0/g1;->h(Lhy0/h1;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_1
    invoke-virtual {v7, v3}, Lp1/q;->q(Z)V

    invoke-virtual/range {p0 .. p0}, Llq1/e;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    if-nez v0, :cond_2

    const v0, 0x609c793b

    invoke-virtual {v7, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v7, v3}, Lp1/q;->q(Z)V

    goto/16 :goto_4

    :cond_2
    const v1, 0x609c793c

    invoke-virtual {v7, v1}, Lp1/q;->e0(I)V

    sget-object v1, Lb2/e;->K:Lb2/l;

    int-to-float v4, v2

    const/16 v5, 0x8

    int-to-float v5, v5

    mul-float/2addr v4, v5

    invoke-static {v4}, Ll0/m;->i(F)Ll0/k;

    move-result-object v4

    const/16 v5, 0x36

    invoke-static {v4, v1, v7, v5}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v1

    iget-wide v4, v7, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    sget-object v6, Lb2/t;->w:Lb2/t;

    invoke-static {v7, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v9, v7, Lp1/q;->S:Z

    if-eqz v9, :cond_3

    invoke-virtual {v7, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_3
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_2
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v7, v8, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v7, v1, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v5, v7, Lp1/q;->S:Z

    if-nez v5, :cond_4

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v5, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_5

    :cond_4
    invoke-static {v4, v7, v4, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_5
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v7, v1, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Llq1/e;->b()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_6

    const v1, 0x53b20438

    invoke-virtual {v7, v1}, Lp1/q;->e0(I)V

    sget-object v1, Lkd1/z;->BULLET:Lkd1/z;

    invoke-virtual {v1}, Lkd1/z;->getSymbol()Ljava/lang/String;

    move-result-object v4

    sget-object v1, Lx81/d;->a:Lx81/d;

    sget v5, Lx81/d;->b:I

    invoke-virtual {v1, v7, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->c1()J

    move-result-wide v8

    invoke-virtual {v1, v7, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v1

    invoke-virtual {v1}, Lb91/d;->b()Lb91/a;

    move-result-object v24

    sget v1, Lb91/a;->d:I

    shl-int/lit8 v28, v1, 0x12

    const v29, 0x2fffa

    const/4 v5, 0x0

    move-object/from16 v26, v7

    move-wide v6, v8

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x0

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v26

    invoke-virtual {v7, v3}, Lp1/q;->q(Z)V

    goto :goto_3

    :cond_6
    const v1, 0x53b5a730

    invoke-virtual {v7, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v7, v3}, Lp1/q;->q(Z)V

    :goto_3
    sget v1, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v0, v7, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    sget-object v0, Lx81/d;->a:Lx81/d;

    sget v1, Lx81/d;->b:I

    invoke-virtual {v0, v7, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->c1()J

    move-result-wide v5

    invoke-virtual {v0, v7, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->b()Lb91/a;

    move-result-object v24

    sget v0, Lb91/a;->d:I

    shl-int/lit8 v28, v0, 0x12

    const v29, 0x2fffa

    move-object/from16 v26, v7

    move-wide v6, v5

    const/4 v5, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x0

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v26

    invoke-virtual {v7, v2}, Lp1/q;->q(Z)V

    invoke-virtual {v7, v3}, Lp1/q;->q(Z)V

    goto :goto_4

    :cond_7
    invoke-virtual {v7}, Lp1/q;->X()V

    :goto_4
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final F(Landroidx/compose/ui/Modifier;Llq1/e;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Loq1/d;->D(Landroidx/compose/ui/Modifier;Llq1/e;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic a(Landroidx/compose/ui/Modifier;Llq1/b;Lhq1/f;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Loq1/d;->C(Landroidx/compose/ui/Modifier;Llq1/b;Lhq1/f;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Llq1/e;Ll0/s0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Loq1/d;->E(Llq1/e;Ll0/s0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p0, p1, p2}, Loq1/d;->x(Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Landroidx/compose/ui/Modifier;Llq1/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Loq1/d;->v(Landroidx/compose/ui/Modifier;Llq1/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Llq1/c;Lkotlin/jvm/functions/Function1;Ln0/q;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Loq1/d;->p(Llq1/c;Lkotlin/jvm/functions/Function1;Ln0/q;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lf2/d;)Lf2/g;
    .locals 0

    invoke-static {p0}, Loq1/d;->r(Lf2/d;)Lf2/g;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Li2/k0;Lk2/c;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Loq1/d;->s(Li2/t;Lk2/c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Llq1/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Loq1/d;->q(Llq1/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Loq1/d;->y(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Landroidx/compose/ui/Modifier;Llq1/e;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Loq1/d;->F(Landroidx/compose/ui/Modifier;Llq1/e;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Landroidx/compose/ui/Modifier;Llq1/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Loq1/d;->z(Landroidx/compose/ui/Modifier;Llq1/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p0, p1, p2}, Loq1/d;->t(Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Loq1/d;->u(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Lkotlin/jvm/functions/Function1;Lhq1/f;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Loq1/d;->B(Lkotlin/jvm/functions/Function1;Lhq1/f;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final o(Landroidx/compose/ui/Modifier;Llq1/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Llq1/c;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    const-string v0, "state"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onNavigationEvent"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v8, p3

    check-cast v8, Lp1/q;

    const v0, -0x7f7020d3

    invoke-virtual {v8, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p5, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v1, v4, 0x6

    move v5, v1

    move-object/from16 v1, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v4, 0x6

    if-nez v1, :cond_2

    move-object/from16 v1, p0

    invoke-virtual {v8, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    const/4 v5, 0x4

    goto :goto_0

    :cond_1
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v4

    goto :goto_1

    :cond_2
    move-object/from16 v1, p0

    move v5, v4

    :goto_1
    and-int/lit8 v6, v4, 0x30

    if-nez v6, :cond_4

    invoke-virtual {v8, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    const/16 v6, 0x20

    goto :goto_2

    :cond_3
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v5, v6

    :cond_4
    and-int/lit16 v6, v4, 0x180

    const/16 v11, 0x100

    if-nez v6, :cond_6

    invoke-virtual {v8, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    move v6, v11

    goto :goto_3

    :cond_5
    const/16 v6, 0x80

    :goto_3
    or-int/2addr v5, v6

    :cond_6
    move v12, v5

    and-int/lit16 v5, v12, 0x93

    const/16 v6, 0x92

    const/4 v13, 0x0

    const/4 v14, 0x1

    if-eq v5, v6, :cond_7

    move v5, v14

    goto :goto_4

    :cond_7
    move v5, v13

    :goto_4
    and-int/lit8 v6, v12, 0x1

    invoke-virtual {v8, v6, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_c

    if-eqz v0, :cond_8

    sget-object v0, Lb2/t;->w:Lb2/t;

    goto :goto_5

    :cond_8
    move-object v0, v1

    :goto_5
    sget-object v1, Lx81/d;->a:Lx81/d;

    sget v5, Lx81/d;->b:I

    invoke-virtual {v1, v8, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->o()J

    move-result-wide v5

    sget-object v1, Li2/w0;->a:Li2/v0;

    invoke-static {v0, v5, v6, v1}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v1}, Ll0/f;->k(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v2}, Llq1/c;->d()Lep0/j;

    move-result-object v6

    sget v1, Lep0/j;->x:I

    shl-int/lit8 v9, v1, 0x3

    const/4 v10, 0x2

    const/4 v7, 0x0

    invoke-static/range {v5 .. v10}, Ldp0/f;->b(Landroidx/compose/ui/Modifier;Lep0/j;ZLandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/Modifier;

    move-result-object v15

    invoke-virtual {v2}, Llq1/c;->d()Lep0/j;

    move-result-object v5

    const/4 v10, 0x6

    const/4 v6, 0x0

    move v9, v1

    invoke-static/range {v5 .. v10}, Ldp0/d;->f(Lep0/j;Ll0/k1;ZLandroidx/compose/runtime/Composer;II)Ll0/k1;

    move-result-object v7

    invoke-virtual {v8, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    and-int/lit16 v5, v12, 0x380

    if-ne v5, v11, :cond_9

    move v13, v14

    :cond_9
    or-int/2addr v1, v13

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v1, :cond_a

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v5, v1, :cond_b

    :cond_a
    new-instance v5, Lnq0/m;

    const/16 v1, 0x9

    invoke-direct {v5, v2, v3, v1}, Lnq0/m;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v8, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    move-object v13, v5

    check-cast v13, Lkotlin/jvm/functions/Function1;

    move-object v5, v15

    const/4 v15, 0x0

    const/16 v16, 0x1fa

    const/4 v6, 0x0

    move-object v14, v8

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v5 .. v16}, Lkotlin/jvm/internal/j;->c(Landroidx/compose/ui/Modifier;Ln0/u;Ll0/k1;Ll0/l;Lb2/f;Lh0/o1;ZLf0/k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v8, v14

    move-object v1, v0

    goto :goto_6

    :cond_c
    invoke-virtual {v8}, Lp1/q;->X()V

    :goto_6
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_d

    new-instance v0, Lm31/h;

    const/16 v6, 0x1d

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lm31/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_d
    return-void
.end method

.method private static final p(Llq1/c;Lkotlin/jvm/functions/Function1;Ln0/q;)Ll83/a0;
    .locals 2

    const-string v0, "$this$LazyColumn"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Loq1/c;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0, p1}, Loq1/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    new-instance p0, Lx1/b;

    const/4 p1, 0x1

    const v1, -0x7d5abe

    invoke-direct {p0, v0, p1, v1}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    const/4 p1, 0x3

    const/4 v0, 0x0

    invoke-static {p2, v0, p0, p1}, Ln0/q;->b(Ln0/q;Ljava/lang/String;Lkotlin/jvm/functions/Function3;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final q(Llq1/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 25

    const-string v0, "$this$item"

    move-object/from16 v1, p2

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v0, p4, 0x11

    const/16 v1, 0x10

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    and-int/lit8 v1, p4, 0x1

    move-object/from16 v8, p3

    check-cast v8, Lp1/q;

    invoke-virtual {v8, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_c

    sget-object v0, Lb2/e;->w:Lb2/m;

    invoke-static {v0, v3}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v0

    iget-wide v4, v8, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    sget-object v14, Lb2/t;->w:Lb2/t;

    invoke-static {v8, v14}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v6, v8, Lp1/q;->S:Z

    if-eqz v6, :cond_1

    invoke-virtual {v8, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_1
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v8, v10, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {v8, v0, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->j:La3/i;

    iget-boolean v4, v8, Lp1/q;->S:Z

    if-nez v4, :cond_2

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    :cond_2
    invoke-static {v1, v8, v1, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v8, v1, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Llq1/c;->b()Llq1/b;

    move-result-object v4

    invoke-virtual {v4}, Llq1/b;->a()Lkd1/o;

    move-result-object v4

    move-object v7, v8

    sget v8, Lkd1/o;->a:I

    const/4 v9, 0x3

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v4 .. v9}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v4

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-static {v5, v14}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const/16 v6, 0x4c

    int-to-float v6, v6

    const/4 v8, 0x4

    int-to-float v8, v8

    mul-float/2addr v6, v8

    const/4 v9, 0x0

    const/4 v12, 0x2

    invoke-static {v5, v6, v9, v12}, Landroidx/compose/foundation/layout/d;->j(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const v6, 0x3f333333    # 0.7f

    invoke-static {v6, v5}, Lts/o;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    sget-object v13, Lp1/l;->a:Lp1/v0;

    if-ne v6, v13, :cond_4

    new-instance v6, Lo72/e;

    const/16 v9, 0x16

    invoke-direct {v6, v9}, Lo72/e;-><init>(I)V

    invoke-virtual {v7, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v6, Lkotlin/jvm/functions/Function1;

    invoke-static {v5, v6}, Landroidx/compose/ui/draw/a;->b(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    move v5, v12

    const/16 v12, 0x6030

    move-object v9, v13

    const/16 v13, 0x68

    move/from16 v16, v5

    const/4 v5, 0x0

    move-object/from16 v17, v11

    move-object v11, v7

    const/4 v7, 0x0

    move/from16 v18, v8

    sget-object v8, Ly2/j;->a:Ly2/b1;

    move-object/from16 v19, v9

    const/4 v9, 0x0

    move-object/from16 v20, v10

    const/4 v10, 0x0

    move-object/from16 v21, v17

    move/from16 v22, v18

    move-object/from16 v23, v19

    move-object/from16 v2, v20

    invoke-static/range {v4 .. v13}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object v7, v11

    sget-object v4, Ll0/m;->c:Ll0/g;

    sget-object v5, Lb2/e;->M:Lb2/k;

    invoke-static {v4, v5, v7, v3}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v4

    iget-wide v5, v7, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v7, v14}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v9, v7, Lp1/q;->S:Z

    if-eqz v9, :cond_5

    invoke-virtual {v7, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_5
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_2
    invoke-static {v7, v2, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v7, v0, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v7, Lp1/q;->S:Z

    if-nez v0, :cond_6

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    :cond_6
    move-object/from16 v0, v21

    invoke-static {v5, v7, v5, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_7
    invoke-static {v7, v1, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v0, 0x2

    int-to-float v1, v0

    const/16 v2, 0x8

    int-to-float v2, v2

    mul-float/2addr v1, v2

    const/4 v11, 0x0

    invoke-static {v14, v1, v11, v0}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, Llq1/c;->b()Llq1/b;

    move-result-object v5

    invoke-virtual/range {p0 .. p0}, Llq1/c;->c()Lhq1/f;

    move-result-object v6

    const/4 v9, 0x6

    const/4 v10, 0x0

    move-object v8, v7

    move-object/from16 v7, p1

    invoke-static/range {v4 .. v10}, Loq1/d;->A(Landroidx/compose/ui/Modifier;Llq1/b;Lhq1/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v7, v8

    const v4, 0x683e3bae

    invoke-virtual {v7, v4}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Llq1/c;->e()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_3
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_a

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Llq1/d;

    const v5, 0x683e42bd

    invoke-virtual {v7, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v4}, Llq1/d;->a()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_4
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_9

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lm91/u;

    invoke-static {}, Loq1/b;->c()Lm91/p;

    move-result-object v5

    new-instance v6, Lno0/r0;

    const/16 v8, 0x9

    invoke-direct {v6, v8}, Lno0/r0;-><init>(I)V

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    move-object/from16 v15, v23

    if-ne v8, v15, :cond_8

    new-instance v8, Lo72/e;

    const/16 v9, 0x17

    invoke-direct {v8, v9}, Lo72/e;-><init>(I)V

    invoke-virtual {v7, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v8, Lkotlin/jvm/functions/Function1;

    sget v9, Lm91/p;->b:I

    shl-int/lit8 v9, v9, 0x3

    or-int/lit16 v9, v9, 0xc00

    const/4 v10, 0x0

    move-object/from16 v24, v8

    move-object v8, v7

    move-object/from16 v7, v24

    invoke-static/range {v4 .. v10}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v7, v8

    move/from16 v4, v22

    invoke-static {v4, v2, v14, v7}, Lih0/d0;->u(FFLb2/t;Lp1/q;)V

    move-object/from16 v23, v15

    goto :goto_4

    :cond_9
    move/from16 v4, v22

    move-object/from16 v15, v23

    invoke-virtual {v7, v3}, Lp1/q;->q(Z)V

    goto :goto_3

    :cond_a
    invoke-virtual {v7, v3}, Lp1/q;->q(Z)V

    invoke-virtual/range {p0 .. p0}, Llq1/c;->a()Llq1/a;

    move-result-object v2

    if-nez v2, :cond_b

    const v0, -0x606e4f8f

    invoke-virtual {v7, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v7, v3}, Lp1/q;->q(Z)V

    :goto_5
    const/4 v0, 0x1

    goto :goto_6

    :cond_b
    const v4, -0x606e4f8e

    invoke-virtual {v7, v4}, Lp1/q;->e0(I)V

    invoke-static {v14, v1, v11, v0}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v1, 0x6

    invoke-static {v0, v2, v7, v1, v3}, Loq1/d;->w(Landroidx/compose/ui/Modifier;Llq1/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v7, v3}, Lp1/q;->q(Z)V

    goto :goto_5

    :goto_6
    invoke-virtual {v7, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v7, v0}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_c
    move-object v7, v8

    invoke-virtual {v7}, Lp1/q;->X()V

    :goto_7
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final r(Lf2/d;)Lf2/g;
    .locals 5

    const-string v0, "$this$drawWithCache"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Li2/t;->b:Li2/s;

    const v1, 0xffffff

    invoke-static {v1}, Li2/w0;->c(I)J

    move-result-wide v1

    new-instance v3, Li2/x;

    invoke-direct {v3, v1, v2}, Li2/x;-><init>(J)V

    const-wide v1, 0xff101518L

    invoke-static {v1, v2}, Li2/w0;->e(J)J

    move-result-wide v1

    new-instance v4, Li2/x;

    invoke-direct {v4, v1, v2}, Li2/x;-><init>(J)V

    filled-new-array {v3, v4}, [Li2/x;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    const/16 v3, 0xe

    invoke-static {v0, v1, v2, v2, v3}, Li2/s;->k(Li2/s;Ljava/util/List;FFI)Li2/k0;

    move-result-object v0

    new-instance v1, Lnq2/c;

    const/4 v2, 0x1

    invoke-direct {v1, v0, v2}, Lnq2/c;-><init>(Li2/k0;I)V

    invoke-virtual {p0, v1}, Lf2/d;->a(Lkotlin/jvm/functions/Function1;)Lf2/g;

    move-result-object p0

    return-object p0
.end method

.method private static final s(Li2/t;Lk2/c;)Ll83/a0;
    .locals 11

    const-string v0, "$this$onDrawWithContent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p1

    check-cast v0, La3/p0;

    invoke-virtual {v0}, La3/p0;->a()V

    const/4 v9, 0x0

    const/16 v10, 0x7e

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v2, p0

    move-object v1, p1

    invoke-static/range {v1 .. v10}, Lk2/e;->u(Lk2/e;Li2/t;JJFLk2/f;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final t(Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 2

    const-string p2, "it"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lp1/q;

    const p0, 0x27f8a9b0

    invoke-virtual {p1, p0}, Lp1/q;->e0(I)V

    const/4 p0, 0x2

    int-to-float p2, p0

    const/16 v0, 0x8

    int-to-float v0, v0

    mul-float/2addr p2, v0

    const/4 v0, 0x0

    sget-object v1, Lb2/t;->w:Lb2/t;

    invoke-static {v1, p2, v0, p0}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object p0

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lp1/q;->q(Z)V

    return-object p0
.end method

.method private static final u(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final v(Landroidx/compose/ui/Modifier;Llq1/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Loq1/d;->o(Landroidx/compose/ui/Modifier;Llq1/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final w(Landroidx/compose/ui/Modifier;Llq1/a;Landroidx/compose/runtime/Composer;II)V
    .locals 38

    move-object/from16 v4, p2

    check-cast v4, Lp1/q;

    const v0, 0xba2bf90

    invoke-virtual {v4, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p4, 0x1

    const/4 v1, 0x2

    if-eqz v0, :cond_0

    or-int/lit8 v2, p3, 0x6

    move v3, v2

    move-object/from16 v2, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v2, p3, 0x6

    if-nez v2, :cond_2

    move-object/from16 v2, p0

    invoke-virtual {v4, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    move v3, v1

    :goto_0
    or-int v3, p3, v3

    goto :goto_1

    :cond_2
    move-object/from16 v2, p0

    move/from16 v3, p3

    :goto_1
    and-int/lit8 v5, p3, 0x30

    if-nez v5, :cond_4

    move-object/from16 v5, p1

    invoke-virtual {v4, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    const/16 v6, 0x20

    goto :goto_2

    :cond_3
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v3, v6

    goto :goto_3

    :cond_4
    move-object/from16 v5, p1

    :goto_3
    and-int/lit8 v6, v3, 0x13

    const/16 v7, 0x12

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-eq v6, v7, :cond_5

    move v6, v9

    goto :goto_4

    :cond_5
    move v6, v8

    :goto_4
    and-int/2addr v3, v9

    invoke-virtual {v4, v3, v6}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_e

    sget-object v3, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_6

    move-object v0, v3

    goto :goto_5

    :cond_6
    move-object v0, v2

    :goto_5
    sget-object v2, Ll0/m;->c:Ll0/g;

    sget-object v6, Lb2/e;->M:Lb2/k;

    invoke-static {v2, v6, v4, v8}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    iget-wide v10, v4, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v4, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v13, v4, Lp1/q;->S:Z

    if-eqz v13, :cond_7

    invoke-virtual {v4, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_7
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_6
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v4, v12, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v4, v2, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v10, v4, Lp1/q;->S:Z

    if-nez v10, :cond_8

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v10, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_9

    :cond_8
    invoke-static {v6, v4, v6, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v4, v2, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object v2, v0

    invoke-virtual {v5}, Llq1/a;->c()Ljava/lang/String;

    move-result-object v0

    const/16 v6, 0x8

    if-nez v0, :cond_a

    const v0, 0x584d8d0b

    invoke-virtual {v4, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v4, v8}, Lp1/q;->q(Z)V

    move-object/from16 v29, v2

    move-object v5, v3

    move v2, v6

    move/from16 v32, v7

    move v6, v8

    move/from16 v28, v9

    goto/16 :goto_7

    :cond_a
    const v10, 0x584d8d0c

    invoke-virtual {v4, v10}, Lp1/q;->e0(I)V

    sget-object v10, Lx81/d;->a:Lx81/d;

    sget v11, Lx81/d;->b:I

    invoke-virtual {v10, v4, v11}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v12

    invoke-virtual {v12}, Lb91/d;->P()Lb91/a;

    move-result-object v20

    invoke-virtual {v10, v4, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->y()J

    move-result-wide v10

    sget v12, Lb91/a;->d:I

    shl-int/lit8 v24, v12, 0x12

    const v25, 0x2fffa

    move v12, v1

    const/4 v1, 0x0

    move-object/from16 v22, v4

    const-wide/16 v4, 0x0

    move v13, v6

    const/4 v6, 0x0

    move v14, v7

    const/4 v7, 0x0

    move v15, v8

    const/4 v8, 0x0

    move-object/from16 v16, v3

    move/from16 v17, v9

    move-wide/from16 v36, v10

    move-object v11, v2

    move-wide/from16 v2, v36

    const-wide/16 v9, 0x0

    move-object/from16 v18, v11

    const/4 v11, 0x0

    move/from16 v19, v12

    const/4 v12, 0x0

    move/from16 v21, v13

    move/from16 v23, v14

    const-wide/16 v13, 0x0

    move/from16 v26, v15

    const/4 v15, 0x0

    move-object/from16 v27, v16

    const/16 v16, 0x0

    move/from16 v28, v17

    const/16 v17, 0x0

    move-object/from16 v29, v18

    const/16 v18, 0x0

    move/from16 v30, v19

    const/16 v19, 0x0

    move/from16 v31, v21

    const/16 v21, 0x0

    move/from16 v32, v23

    const/16 v23, 0x0

    move-object/from16 v33, v27

    invoke-static/range {v0 .. v25}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v4, v22

    const/4 v0, 0x1

    int-to-float v1, v0

    const/16 v2, 0x8

    int-to-float v3, v2

    move-object/from16 v5, v33

    const/4 v6, 0x0

    invoke-static {v1, v3, v5, v4, v6}, Lr80/c;->z(FFLb2/t;Lp1/q;Z)V

    move/from16 v28, v0

    :goto_7
    invoke-virtual/range {p1 .. p1}, Llq1/a;->a()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_b

    const v0, 0x5851cb22

    invoke-virtual {v4, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v4, v6}, Lp1/q;->q(Z)V

    move v13, v2

    move-object v7, v5

    move v15, v6

    goto :goto_8

    :cond_b
    const v1, 0x5851cb23

    invoke-virtual {v4, v1}, Lp1/q;->e0(I)V

    sget-object v1, Lx81/d;->a:Lx81/d;

    sget v3, Lx81/d;->b:I

    invoke-virtual {v1, v4, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v7

    invoke-virtual {v7}, Lb91/d;->b()Lb91/a;

    move-result-object v20

    invoke-virtual {v1, v4, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->c1()J

    move-result-wide v7

    sget v1, Lb91/a;->d:I

    shl-int/lit8 v24, v1, 0x12

    const v25, 0x2fffa

    const/4 v1, 0x0

    move-object/from16 v22, v4

    move-object/from16 v27, v5

    const-wide/16 v4, 0x0

    move v15, v6

    const/4 v6, 0x0

    move v13, v2

    move-wide v2, v7

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move/from16 v31, v13

    const-wide/16 v13, 0x0

    move/from16 v34, v15

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    move-object/from16 v35, v27

    invoke-static/range {v0 .. v25}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v4, v22

    const/4 v0, 0x3

    int-to-float v0, v0

    const/16 v13, 0x8

    int-to-float v1, v13

    move-object/from16 v7, v35

    const/4 v15, 0x0

    invoke-static {v0, v1, v7, v4, v15}, Lr80/c;->z(FFLb2/t;Lp1/q;Z)V

    :goto_8
    const v0, 0x3ca7efe3

    invoke-virtual {v4, v0}, Lp1/q;->e0(I)V

    invoke-virtual/range {p1 .. p1}, Llq1/a;->b()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_9
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm91/u;

    new-instance v2, Lno0/r0;

    const/16 v1, 0xa

    invoke-direct {v2, v1}, Lno0/r0;-><init>(I)V

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v1, v3, :cond_c

    new-instance v1, Lo72/e;

    const/16 v3, 0x15

    invoke-direct {v1, v3}, Lo72/e;-><init>(I)V

    invoke-virtual {v4, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    move-object v3, v1

    check-cast v3, Lkotlin/jvm/functions/Function1;

    const/16 v5, 0xc00

    const/4 v6, 0x2

    const/4 v1, 0x0

    invoke-static/range {v0 .. v6}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    const/4 v12, 0x2

    int-to-float v0, v12

    int-to-float v1, v13

    invoke-static {v0, v1, v7, v4}, Lih0/d0;->u(FFLb2/t;Lp1/q;)V

    goto :goto_9

    :cond_d
    invoke-virtual {v4, v15}, Lp1/q;->q(Z)V

    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lp1/q;->q(Z)V

    move-object/from16 v7, v29

    goto :goto_a

    :cond_e
    invoke-virtual {v4}, Lp1/q;->X()V

    move-object v7, v2

    :goto_a
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_f

    new-instance v6, Lno0/y0;

    const/4 v11, 0x6

    move-object/from16 v8, p1

    move/from16 v9, p3

    move/from16 v10, p4

    invoke-direct/range {v6 .. v11}, Lno0/y0;-><init>(Landroidx/compose/ui/Modifier;Ljava/lang/Object;III)V

    iput-object v6, v0, Lp1/v1;->d:Lc93/m;

    :cond_f
    return-void
.end method

.method private static final x(Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    const-string p2, "it"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lp1/q;

    const p0, 0x75b72208

    invoke-virtual {p1, p0}, Lp1/q;->e0(I)V

    const/4 p0, 0x0

    invoke-virtual {p1, p0}, Lp1/q;->q(Z)V

    sget-object p0, Lb2/t;->w:Lb2/t;

    return-object p0
.end method

.method private static final y(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final z(Landroidx/compose/ui/Modifier;Llq1/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Loq1/d;->w(Landroidx/compose/ui/Modifier;Llq1/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
