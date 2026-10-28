.class public abstract Lno0/p;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a5\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a5\u0010\n\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003\u00a2\u0006\u0004\u0008\n\u0010\t\u00a8\u0006\u000b"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Llo0/f;",
        "viewState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onEvent",
        "h",
        "(Landroidx/compose/ui/Modifier;Llo0/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "k",
        "clinician-in-the-loop_release"
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
.method public static synthetic a(Llo0/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lno0/p;->i(Llo0/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/Modifier;Llo0/f;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lno0/p;->j(Landroidx/compose/ui/Modifier;Llo0/f;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/compose/ui/Modifier;Llo0/f;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lno0/p;->p(Landroidx/compose/ui/Modifier;Llo0/f;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;Lcom/whoop/design/models/modal/AnyModal;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lno0/p;->n(Lkotlin/jvm/functions/Function1;Lcom/whoop/design/models/modal/AnyModal;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p0}, Lno0/p;->o(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lkotlin/jvm/functions/Function1;Lhy0/h0;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lno0/p;->l(Lkotlin/jvm/functions/Function1;Lhy0/h0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lcom/whoop/design/models/modal/AnyModal;)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p0, p1, p2}, Lno0/p;->m(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lcom/whoop/design/models/modal/AnyModal;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static final h(Landroidx/compose/ui/Modifier;Llo0/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Llo0/f;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v6, p4

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onEvent"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v3, p3

    check-cast v3, Lp1/q;

    const v0, 0x321e43b8

    invoke-virtual {v3, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p5, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v4, v6, 0x6

    move v5, v4

    move-object/from16 v4, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v4, v6, 0x6

    if-nez v4, :cond_2

    move-object/from16 v4, p0

    invoke-virtual {v3, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    const/4 v5, 0x4

    goto :goto_0

    :cond_1
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v6

    goto :goto_1

    :cond_2
    move-object/from16 v4, p0

    move v5, v6

    :goto_1
    and-int/lit8 v7, v6, 0x30

    if-nez v7, :cond_5

    and-int/lit8 v7, v6, 0x40

    if-nez v7, :cond_3

    invoke-virtual {v3, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    goto :goto_2

    :cond_3
    invoke-virtual {v3, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    :goto_2
    if-eqz v7, :cond_4

    const/16 v7, 0x20

    goto :goto_3

    :cond_4
    const/16 v7, 0x10

    :goto_3
    or-int/2addr v5, v7

    :cond_5
    and-int/lit16 v7, v6, 0x180

    if-nez v7, :cond_7

    invoke-virtual {v3, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6

    const/16 v7, 0x100

    goto :goto_4

    :cond_6
    const/16 v7, 0x80

    :goto_4
    or-int/2addr v5, v7

    :cond_7
    and-int/lit16 v7, v5, 0x93

    const/16 v8, 0x92

    const/4 v9, 0x0

    if-eq v7, v8, :cond_8

    const/4 v7, 0x1

    goto :goto_5

    :cond_8
    move v7, v9

    :goto_5
    and-int/lit8 v8, v5, 0x1

    invoke-virtual {v3, v8, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_b

    if-eqz v0, :cond_9

    sget-object v0, Lb2/t;->w:Lb2/t;

    goto :goto_6

    :cond_9
    move-object v0, v4

    :goto_6
    invoke-virtual {v1}, Llo0/f;->f()Z

    move-result v4

    if-eqz v4, :cond_a

    const v4, 0x4fed2979

    invoke-virtual {v3, v4}, Lp1/q;->e0(I)V

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v4, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v4, Lx81/d;->a:Lx81/d;

    sget v5, Lx81/d;->b:I

    invoke-virtual {v4, v3, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->a1()J

    move-result-wide v4

    new-instance v8, Lno0/n;

    const/4 v10, 0x0

    invoke-direct {v8, v1, v2, v10}, Lno0/n;-><init>(Ljava/lang/Object;Ll83/e;I)V

    const v10, -0x66a77653

    invoke-static {v10, v3, v8}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v15

    const/high16 v17, 0xc00000

    const/16 v18, 0x7a

    const/4 v8, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v16, v3

    move v3, v9

    move-wide v9, v4

    invoke-static/range {v7 .. v18}, Lrz0/e;->j(Landroidx/compose/ui/Modifier;Lrz0/f;JLt0/i;Lf0/t;Lrz0/a;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v4, v16

    invoke-virtual {v4, v3}, Lp1/q;->q(Z)V

    move-object v3, v4

    goto :goto_7

    :cond_a
    move-object v4, v3

    move v3, v9

    const v7, 0x4ff24397    # 8.1290317E9f

    invoke-virtual {v4, v7}, Lp1/q;->e0(I)V

    and-int/lit8 v7, v5, 0xe

    sget v8, Lcom/whoop/design/util/TextResource;->$stable:I

    sget v9, Lhy0/h0;->h:I

    or-int/2addr v8, v9

    sget v9, Lhy0/h1;->w:I

    or-int/2addr v8, v9

    sget v9, Lcom/whoop/design/models/modal/AnyModal;->$stable:I

    or-int/2addr v8, v9

    shl-int/lit8 v8, v8, 0x3

    or-int/2addr v7, v8

    and-int/lit8 v8, v5, 0x70

    or-int/2addr v7, v8

    and-int/lit16 v5, v5, 0x380

    or-int/2addr v5, v7

    move-object/from16 v16, v4

    move v4, v5

    const/4 v5, 0x0

    move v7, v3

    move-object/from16 v3, v16

    invoke-static/range {v0 .. v5}, Lno0/p;->k(Landroidx/compose/ui/Modifier;Llo0/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v3, v7}, Lp1/q;->q(Z)V

    :goto_7
    move-object v1, v0

    goto :goto_8

    :cond_b
    invoke-virtual {v3}, Lp1/q;->X()V

    move-object v1, v4

    :goto_8
    invoke-virtual {v3}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_c

    new-instance v0, Lno0/o;

    const/4 v6, 0x0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lno0/o;-><init>(Landroidx/compose/ui/Modifier;Llo0/f;Lkotlin/jvm/functions/Function1;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_c
    return-void
.end method

.method private static final i(Llo0/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 9

    and-int/lit8 v0, p3, 0x3

    const/4 v1, 0x1

    const/4 v2, 0x2

    if-eq v0, v2, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/2addr p3, v1

    move-object v6, p2

    check-cast v6, Lp1/q;

    invoke-virtual {v6, p3, v0}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_1

    int-to-float p2, v2

    const/16 p3, 0x8

    int-to-float p3, p3

    mul-float/2addr p2, p3

    sget-object p3, Lb2/t;->w:Lb2/t;

    invoke-static {p2, p3}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget p2, Lcom/whoop/design/util/TextResource;->$stable:I

    sget p3, Lhy0/h0;->h:I

    or-int/2addr p2, p3

    sget p3, Lhy0/h1;->w:I

    or-int/2addr p2, p3

    sget p3, Lcom/whoop/design/models/modal/AnyModal;->$stable:I

    or-int/2addr p2, p3

    shl-int/lit8 p2, p2, 0x3

    or-int/lit8 v7, p2, 0x6

    const/4 v8, 0x0

    move-object v4, p0

    move-object v5, p1

    invoke-static/range {v3 .. v8}, Lno0/p;->k(Landroidx/compose/ui/Modifier;Llo0/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_1
    invoke-virtual {v6}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Landroidx/compose/ui/Modifier;Llo0/f;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lno0/p;->h(Landroidx/compose/ui/Modifier;Llo0/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Landroidx/compose/ui/Modifier;Llo0/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 42
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Llo0/f;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    const/16 v0, 0x38

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    move-object/from16 v15, p3

    check-cast v15, Lp1/q;

    const v1, 0x55f70679

    invoke-virtual {v15, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p5, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v6, v4, 0x6

    move v7, v6

    move-object/from16 v6, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v6, v4, 0x6

    if-nez v6, :cond_2

    move-object/from16 v6, p0

    invoke-virtual {v15, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    const/4 v7, 0x4

    goto :goto_0

    :cond_1
    const/4 v7, 0x2

    :goto_0
    or-int/2addr v7, v4

    goto :goto_1

    :cond_2
    move-object/from16 v6, p0

    move v7, v4

    :goto_1
    and-int/lit8 v8, v4, 0x30

    if-nez v8, :cond_5

    and-int/lit8 v8, v4, 0x40

    if-nez v8, :cond_3

    invoke-virtual {v15, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    goto :goto_2

    :cond_3
    invoke-virtual {v15, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    :goto_2
    if-eqz v8, :cond_4

    const/16 v8, 0x20

    goto :goto_3

    :cond_4
    const/16 v8, 0x10

    :goto_3
    or-int/2addr v7, v8

    :cond_5
    and-int/lit16 v8, v4, 0x180

    if-nez v8, :cond_7

    invoke-virtual {v15, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_6

    const/16 v8, 0x100

    goto :goto_4

    :cond_6
    const/16 v8, 0x80

    :goto_4
    or-int/2addr v7, v8

    :cond_7
    and-int/lit16 v8, v7, 0x93

    const/16 v11, 0x92

    if-eq v8, v11, :cond_8

    const/4 v8, 0x1

    goto :goto_5

    :cond_8
    const/4 v8, 0x0

    :goto_5
    and-int/lit8 v11, v7, 0x1

    invoke-virtual {v15, v11, v8}, Lp1/q;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_20

    sget-object v8, Lb2/t;->w:Lb2/t;

    if-eqz v1, :cond_9

    move-object v1, v8

    goto :goto_6

    :cond_9
    move-object v1, v6

    :goto_6
    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {v6, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v14, Lb2/e;->K:Lb2/l;

    const/16 v5, 0xc

    int-to-float v5, v5

    invoke-static {v5}, Ll0/m;->i(F)Ll0/k;

    move-result-object v5

    const/16 v13, 0x36

    invoke-static {v5, v14, v15, v13}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v5

    iget-wide v13, v15, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v15}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v15, v11}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v17, La3/l;->a:La3/k;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v15}, Lp1/q;->i0()V

    iget-boolean v10, v15, Lp1/q;->S:Z

    if-eqz v10, :cond_a

    invoke-virtual {v15, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_a
    invoke-virtual {v15}, Lp1/q;->s0()V

    :goto_7
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v15, v10, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v15, v5, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v14, La3/k;->j:La3/i;

    iget-boolean v0, v15, Lp1/q;->S:Z

    if-nez v0, :cond_b

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v0, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    :cond_b
    invoke-static {v13, v15, v13, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v15, v0, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v2}, Llo0/f;->a()Lhy0/h0;

    move-result-object v11

    sget-object v12, Lp1/l;->a:Lp1/v0;

    if-nez v11, :cond_d

    const v9, -0x168fcb12

    invoke-virtual {v15, v9}, Lp1/q;->e0(I)V

    const/4 v9, 0x0

    invoke-virtual {v15, v9}, Lp1/q;->q(Z)V

    move-object/from16 v36, v1

    move-object/from16 v38, v5

    move-object v4, v6

    move v3, v7

    move-object/from16 v40, v8

    move-object/from16 v37, v10

    move-object/from16 v41, v12

    move-object/from16 v39, v14

    const/16 p3, 0x6

    const/4 v1, 0x1

    :goto_8
    const/high16 v2, 0x3f800000    # 1.0f

    goto/16 :goto_b

    :cond_d
    const v13, -0x168fcb11

    invoke-virtual {v15, v13}, Lp1/q;->e0(I)V

    const/16 v13, 0x38

    int-to-float v13, v13

    invoke-static {v13, v8}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    move-object/from16 v36, v1

    sget-object v1, Lt0/j;->a:Lt0/i;

    invoke-static {v13, v1}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v21

    and-int/lit16 v1, v7, 0x380

    const/16 v13, 0x100

    if-ne v1, v13, :cond_e

    const/4 v1, 0x1

    goto :goto_9

    :cond_e
    const/4 v1, 0x0

    :goto_9
    invoke-virtual {v15, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v17

    or-int v1, v1, v17

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v1, :cond_f

    if-ne v13, v12, :cond_10

    :cond_f
    new-instance v13, Lno0/o0;

    const/4 v1, 0x2

    invoke-direct {v13, v1, v3, v11}, Lno0/o0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v15, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    move-object/from16 v25, v13

    check-cast v25, Lc93/a;

    const/16 v26, 0xf

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    invoke-static/range {v21 .. v26}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v13, Lb2/e;->w:Lb2/m;

    const/4 v2, 0x0

    invoke-static {v13, v2}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v13

    iget-wide v2, v15, Lp1/q;->T:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v15}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    invoke-static {v15, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v15}, Lp1/q;->i0()V

    iget-boolean v4, v15, Lp1/q;->S:Z

    if-eqz v4, :cond_11

    invoke-virtual {v15, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_11
    invoke-virtual {v15}, Lp1/q;->s0()V

    :goto_a
    invoke-static {v15, v10, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v15, v5, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v15, Lp1/q;->S:Z

    if-nez v3, :cond_12

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_13

    :cond_12
    invoke-static {v2, v15, v2, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_13
    invoke-static {v15, v0, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v1, v8}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    move-object v3, v5

    move-object v5, v11

    sget-object v11, Lhy0/g0;->CIRCLE:Lhy0/g0;

    const/16 v13, 0x47

    move-object v4, v14

    const/4 v14, 0x0

    move-object/from16 v18, v6

    const/4 v6, 0x0

    move/from16 v21, v7

    const/4 v7, 0x0

    move-object/from16 v22, v8

    const/4 v8, 0x0

    move-object/from16 v23, v12

    const/4 v12, 0x0

    move-object/from16 v24, v10

    move-object v10, v9

    move-object/from16 v38, v3

    move-object/from16 v39, v4

    move-object/from16 v4, v18

    move/from16 v3, v21

    move-object/from16 v40, v22

    move-object/from16 v41, v23

    move-object/from16 v37, v24

    const/16 p3, 0x6

    const/4 v1, 0x1

    invoke-static/range {v5 .. v14}, Lhy0/h0;->b(Lhy0/h0;Lkd1/o;Ljava/lang/String;Lhy0/c0;Ljava/lang/Integer;Ljava/lang/Integer;Lhy0/g0;ZILjava/lang/Object;)Lhy0/h0;

    move-result-object v5

    sget v6, Lhy0/h0;->h:I

    shl-int/lit8 v6, v6, 0x3

    or-int/lit8 v6, v6, 0x6

    invoke-static {v2, v5, v15, v6}, Lhy0/f0;->j(Landroidx/compose/ui/Modifier;Lhy0/h0;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v15, v1}, Lp1/q;->q(Z)V

    const/4 v2, 0x0

    invoke-virtual {v15, v2}, Lp1/q;->q(Z)V

    goto/16 :goto_8

    :goto_b
    float-to-double v5, v2

    const-wide/16 v7, 0x0

    cmpl-double v5, v5, v7

    if-lez v5, :cond_14

    move v12, v1

    goto :goto_c

    :cond_14
    const/4 v12, 0x0

    :goto_c
    if-nez v12, :cond_15

    const-string v5, "invalid weight; must be greater than zero"

    invoke-static {v5}, Lm0/a;->a(Ljava/lang/String;)V

    :cond_15
    new-instance v5, Landroidx/compose/foundation/layout/LayoutWeightElement;

    invoke-direct {v5, v2, v1}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    const/4 v2, 0x4

    int-to-float v2, v2

    invoke-static {v2}, Ll0/m;->i(F)Ll0/k;

    move-result-object v2

    sget-object v6, Lb2/e;->M:Lb2/k;

    move/from16 v7, p3

    invoke-static {v2, v6, v15, v7}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    iget-wide v6, v15, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v15}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v15, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v15}, Lp1/q;->i0()V

    iget-boolean v8, v15, Lp1/q;->S:Z

    if-eqz v8, :cond_16

    invoke-virtual {v15, v4}, Lp1/q;->l(Lc93/a;)V

    :goto_d
    move-object/from16 v4, v37

    goto :goto_e

    :cond_16
    invoke-virtual {v15}, Lp1/q;->s0()V

    goto :goto_d

    :goto_e
    invoke-static {v15, v4, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v2, v38

    invoke-static {v15, v2, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v15, Lp1/q;->S:Z

    if-nez v2, :cond_17

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_18

    :cond_17
    move-object/from16 v4, v39

    invoke-static {v6, v15, v6, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_18
    invoke-static {v15, v0, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Llo0/f;->c()Lhy0/h1;

    move-result-object v10

    if-nez v10, :cond_19

    const v0, -0x4535636

    invoke-virtual {v15, v0}, Lp1/q;->e0(I)V

    const/4 v2, 0x0

    invoke-virtual {v15, v2}, Lp1/q;->q(Z)V

    move-object v13, v15

    goto :goto_f

    :cond_19
    const/4 v2, 0x0

    const v0, -0x4535635

    invoke-virtual {v15, v0}, Lp1/q;->e0(I)V

    sget v14, Lhy0/h1;->w:I

    move-object/from16 v32, v15

    const/4 v15, 0x6

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object/from16 v13, v32

    invoke-static/range {v10 .. v15}, Lhy0/g1;->h(Lhy0/h1;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v13, v2}, Lp1/q;->q(Z)V

    :goto_f
    invoke-virtual/range {p1 .. p1}, Llo0/f;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    sget v2, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v0, v13, v2}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v10

    sget-object v0, Lx81/d;->a:Lx81/d;

    sget v4, Lx81/d;->b:I

    invoke-virtual {v0, v13, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v5

    invoke-virtual {v5}, Lb91/d;->a()Lb91/a;

    move-result-object v30

    invoke-virtual {v0, v13, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->y()J

    move-result-wide v5

    sget v7, Lb91/a;->d:I

    shl-int/lit8 v34, v7, 0x12

    const v35, 0x2fffa

    const/4 v11, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const-wide/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v31, 0x0

    const/16 v33, 0x0

    move-object/from16 v32, v13

    move-wide v12, v5

    invoke-static/range {v10 .. v35}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v32

    invoke-virtual/range {p1 .. p1}, Llo0/f;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    if-nez v5, :cond_1a

    const v2, -0x44e4edd

    invoke-virtual {v13, v2}, Lp1/q;->e0(I)V

    const/4 v2, 0x0

    invoke-virtual {v13, v2}, Lp1/q;->q(Z)V

    goto :goto_10

    :cond_1a
    const v6, -0x44e4edc

    invoke-virtual {v13, v6}, Lp1/q;->e0(I)V

    invoke-static {v5, v13, v2}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v0, v13, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v2

    invoke-virtual {v2}, Lb91/d;->b()Lb91/a;

    move-result-object v30

    invoke-virtual {v0, v13, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->b1()J

    move-result-wide v5

    const/16 v33, 0x0

    const v35, 0x2fffa

    const/4 v11, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const-wide/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v31, 0x0

    move-object/from16 v32, v13

    move-wide v12, v5

    invoke-static/range {v10 .. v35}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v32

    const/4 v2, 0x0

    invoke-virtual {v13, v2}, Lp1/q;->q(Z)V

    :goto_10
    invoke-virtual {v13, v1}, Lp1/q;->q(Z)V

    invoke-virtual/range {p1 .. p1}, Llo0/f;->b()Llo0/p0;

    move-result-object v5

    if-nez v5, :cond_1b

    const v0, -0x167c23de

    invoke-virtual {v13, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v2}, Lp1/q;->q(Z)V

    move-object/from16 v8, p2

    goto/16 :goto_14

    :cond_1b
    const v2, -0x167c23dd

    invoke-virtual {v13, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v5}, Llo0/p0;->b()Lgz0/m0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/m0;->toWhoopIcon()I

    move-result v2

    const/4 v7, 0x6

    invoke-static {v2, v13, v7}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v10

    invoke-virtual {v5}, Llo0/p0;->a()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v0, v13, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->c1()J

    move-result-wide v6

    const/16 v0, 0x18

    int-to-float v0, v0

    move-object/from16 v2, v40

    invoke-static {v0, v2}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v5}, Llo0/p0;->c()Lcom/whoop/design/models/modal/AnyModal;

    move-result-object v2

    and-int/lit16 v3, v3, 0x380

    const/16 v4, 0x100

    if-ne v3, v4, :cond_1c

    move v12, v1

    goto :goto_11

    :cond_1c
    const/4 v12, 0x0

    :goto_11
    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v4, v41

    if-nez v12, :cond_1e

    if-ne v3, v4, :cond_1d

    goto :goto_12

    :cond_1d
    move-object/from16 v8, p2

    goto :goto_13

    :cond_1e
    :goto_12
    new-instance v3, Lcom/whoop/profile/view/h;

    const/4 v5, 0x3

    move-object/from16 v8, p2

    invoke-direct {v3, v8, v5}, Lcom/whoop/profile/view/h;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v13, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_13
    check-cast v3, Lc93/m;

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v4, :cond_1f

    new-instance v5, Ln72/b;

    const/16 v4, 0xc

    invoke-direct {v5, v4}, Ln72/b;-><init>(I)V

    invoke-virtual {v13, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1f
    check-cast v5, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v2, v3, v5}, Lgb1/d;->c(Landroidx/compose/ui/Modifier;Ljava/lang/Object;Lc93/m;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object v15, v13

    move-wide v13, v6

    invoke-static/range {v10 .. v17}, Ll1/r1;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    move-object v13, v15

    const/4 v2, 0x0

    invoke-virtual {v13, v2}, Lp1/q;->q(Z)V

    :goto_14
    invoke-virtual {v13, v1}, Lp1/q;->q(Z)V

    move-object/from16 v1, v36

    goto :goto_15

    :cond_20
    move-object v8, v3

    move-object v13, v15

    invoke-virtual {v13}, Lp1/q;->X()V

    move-object v1, v6

    :goto_15
    invoke-virtual {v13}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_21

    new-instance v0, Lno0/o;

    const/4 v6, 0x1

    move-object/from16 v2, p1

    move/from16 v4, p4

    move/from16 v5, p5

    move-object v3, v8

    invoke-direct/range {v0 .. v6}, Lno0/o;-><init>(Landroidx/compose/ui/Modifier;Llo0/f;Lkotlin/jvm/functions/Function1;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_21
    return-void
.end method

.method private static final l(Lkotlin/jvm/functions/Function1;Lhy0/h0;)Ll83/a0;
    .locals 2

    new-instance v0, Llo0/z$e;

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    invoke-direct {v0, v1, p1}, Llo0/z$e;-><init>(Ljava/lang/Object;Lm91/u;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v1
.end method

.method private static final m(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lcom/whoop/design/models/modal/AnyModal;)Landroidx/compose/ui/Modifier;
    .locals 6

    const-string v0, "$this$applyIfNotNullElse"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "modal"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Lno0/o0;

    const/4 p1, 0x3

    invoke-direct {v4, p1, p0, p2}, Lno0/o0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const/16 v5, 0xf

    sget-object v0, Lb2/t;->w:Lb2/t;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method private static final n(Lkotlin/jvm/functions/Function1;Lcom/whoop/design/models/modal/AnyModal;)Ll83/a0;
    .locals 0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final o(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 1

    const-string v0, "$this$applyIfNotNullElse"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Lb2/t;->w:Lb2/t;

    return-object p0
.end method

.method private static final p(Landroidx/compose/ui/Modifier;Llo0/f;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lno0/p;->k(Landroidx/compose/ui/Modifier;Llo0/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
