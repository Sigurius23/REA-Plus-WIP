.class public abstract Lh02/o0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0002\u001a5\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a!\u0010\u000c\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\u0003\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u0012\u00b2\u0006\u000e\u0010\u000f\u001a\u00020\u000e8\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000c\u0010\u0011\u001a\u00020\u00108\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lh02/p0;",
        "state",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "h",
        "(Landroidx/compose/ui/Modifier;Lh02/p0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Lh02/k;",
        "item",
        "f",
        "(Lh02/k;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V",
        "",
        "isCollapsed",
        "",
        "caretRotation",
        "native-store_release"
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
.method public static synthetic a(Lh02/k;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lh02/o0;->g(Lh02/k;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lh02/p0;)Lp1/c1;
    .locals 0

    invoke-static {p0}, Lh02/o0;->i(Lh02/p0;)Lp1/c1;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lh02/p0;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lh02/o0;->n(Lh02/p0;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lh02/o0;->m(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Landroidx/compose/ui/Modifier;Lh02/p0;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lh02/o0;->o(Landroidx/compose/ui/Modifier;Lh02/p0;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final f(Lh02/k;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 34

    move-object/from16 v0, p2

    check-cast v0, Lp1/q;

    const v1, -0x407b812e

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p3, 0x6

    if-nez v1, :cond_1

    move-object/from16 v1, p0

    invoke-virtual {v0, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int v2, p3, v2

    goto :goto_1

    :cond_1
    move-object/from16 v1, p0

    move/from16 v2, p3

    :goto_1
    and-int/lit8 v3, p4, 0x2

    if-eqz v3, :cond_3

    or-int/lit8 v2, v2, 0x30

    :cond_2
    move-object/from16 v4, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v4, p3, 0x30

    if-nez v4, :cond_2

    move-object/from16 v4, p1

    invoke-virtual {v0, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x20

    goto :goto_2

    :cond_4
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v2, v5

    :goto_3
    and-int/lit8 v5, v2, 0x13

    const/16 v6, 0x12

    const/4 v7, 0x1

    if-eq v5, v6, :cond_5

    move v5, v7

    goto :goto_4

    :cond_5
    const/4 v5, 0x0

    :goto_4
    and-int/2addr v2, v7

    invoke-virtual {v0, v2, v5}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_b

    if-eqz v3, :cond_6

    sget-object v2, Lb2/t;->w:Lb2/t;

    goto :goto_5

    :cond_6
    move-object v2, v4

    :goto_5
    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v5, Lb2/e;->K:Lb2/l;

    sget-object v8, Ll0/m;->a:Ll0/e;

    const/16 v9, 0x30

    invoke-static {v8, v5, v0, v9}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v5

    iget-wide v8, v0, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v0, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v10, La3/l;->a:La3/k;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v11, v0, Lp1/q;->S:Z

    if-eqz v11, :cond_7

    invoke-virtual {v0, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_7
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_6
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v0, v10, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v0, v5, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v9, v0, Lp1/q;->S:Z

    if-nez v9, :cond_8

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_9

    :cond_8
    invoke-static {v8, v0, v8, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v0, v5, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lh02/k;->e()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    sget v5, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v4, v0, v5}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    sget-object v8, Lx81/d;->a:Lx81/d;

    sget v9, Lx81/d;->b:I

    invoke-virtual {v8, v0, v9}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v10

    invoke-virtual {v10}, Lb91/d;->b()Lb91/a;

    move-result-object v20

    invoke-virtual {v8, v0, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->F()J

    move-result-wide v10

    float-to-double v12, v3

    const-wide/16 v14, 0x0

    cmpl-double v12, v12, v14

    if-lez v12, :cond_a

    goto :goto_7

    :cond_a
    const-string v12, "invalid weight; must be greater than zero"

    invoke-static {v12}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_7
    new-instance v1, Landroidx/compose/foundation/layout/LayoutWeightElement;

    invoke-direct {v1, v3, v7}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    sget v3, Lb91/a;->d:I

    shl-int/lit8 v24, v3, 0x12

    const v25, 0x2fff8

    move-object/from16 v22, v0

    move-object v0, v4

    move v3, v5

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    move v12, v7

    const/4 v7, 0x0

    move-object v13, v8

    const/4 v8, 0x0

    move-object v14, v2

    move v15, v3

    move-wide v2, v10

    move v11, v9

    const-wide/16 v9, 0x0

    move/from16 v16, v11

    const/4 v11, 0x0

    move/from16 v17, v12

    const/4 v12, 0x0

    move-object/from16 v19, v13

    move-object/from16 v18, v14

    const-wide/16 v13, 0x0

    move/from16 v21, v15

    const/4 v15, 0x0

    move/from16 v23, v16

    const/16 v16, 0x0

    move/from16 v26, v17

    const/16 v17, 0x0

    move-object/from16 v27, v18

    const/16 v18, 0x0

    move-object/from16 v28, v19

    const/16 v19, 0x0

    move/from16 v29, v21

    const/16 v21, 0x0

    move/from16 v30, v23

    const/16 v23, 0x0

    move-object/from16 v32, v28

    move/from16 v31, v29

    move/from16 v33, v30

    invoke-static/range {v0 .. v25}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v0, v22

    invoke-virtual/range {p0 .. p0}, Lh02/k;->c()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    move/from16 v15, v31

    invoke-static {v1, v0, v15}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v13, v32

    move/from16 v11, v33

    invoke-virtual {v13, v0, v11}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v2

    invoke-virtual {v2}, Lb91/d;->b()Lb91/a;

    move-result-object v20

    invoke-virtual {v13, v0, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->w()J

    move-result-wide v2

    const v25, 0x2fffa

    move-object v0, v1

    const/4 v1, 0x0

    const/4 v11, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    invoke-static/range {v0 .. v25}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v0, v22

    const/4 v12, 0x1

    invoke-virtual {v0, v12}, Lp1/q;->q(Z)V

    move-object/from16 v5, v27

    goto :goto_8

    :cond_b
    invoke-virtual {v0}, Lp1/q;->X()V

    move-object v5, v4

    :goto_8
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_c

    new-instance v2, Lfc0/e;

    const/16 v7, 0xc

    move-object/from16 v3, p0

    move/from16 v4, p3

    move/from16 v6, p4

    invoke-direct/range {v2 .. v7}, Lfc0/e;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v2, v0, Lp1/v1;->d:Lc93/m;

    :cond_c
    return-void
.end method

.method private static final g(Lh02/k;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lh02/o0;->f(Lh02/k;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final h(Landroidx/compose/ui/Modifier;Lh02/p0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 38
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lh02/p0;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v6, p1

    move-object/from16 v5, p2

    move/from16 v1, p4

    const-string v0, "state"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v11, p3

    check-cast v11, Lp1/q;

    const v0, 0x5c7abeaa

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p5, 0x1

    const/4 v2, 0x4

    const/4 v3, 0x2

    if-eqz v0, :cond_0

    or-int/lit8 v4, v1, 0x6

    move v7, v4

    move-object/from16 v4, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v4, v1, 0x6

    if-nez v4, :cond_2

    move-object/from16 v4, p0

    invoke-virtual {v11, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    move v7, v2

    goto :goto_0

    :cond_1
    move v7, v3

    :goto_0
    or-int/2addr v7, v1

    goto :goto_1

    :cond_2
    move-object/from16 v4, p0

    move v7, v1

    :goto_1
    and-int/lit8 v8, v1, 0x30

    if-nez v8, :cond_4

    invoke-virtual {v11, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_3

    const/16 v8, 0x20

    goto :goto_2

    :cond_3
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v7, v8

    :cond_4
    and-int/lit16 v8, v1, 0x180

    const/16 v14, 0x100

    if-nez v8, :cond_6

    invoke-virtual {v11, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_5

    move v8, v14

    goto :goto_3

    :cond_5
    const/16 v8, 0x80

    :goto_3
    or-int/2addr v7, v8

    :cond_6
    move v15, v7

    and-int/lit16 v7, v15, 0x93

    const/16 v8, 0x92

    const/4 v9, 0x0

    const/4 v10, 0x1

    if-eq v7, v8, :cond_7

    move v7, v10

    goto :goto_4

    :cond_7
    move v7, v9

    :goto_4
    and-int/lit8 v8, v15, 0x1

    invoke-virtual {v11, v8, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_17

    sget-object v7, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_8

    move-object v4, v7

    :cond_8
    new-array v0, v9, [Ljava/lang/Object;

    invoke-virtual {v11, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    sget-object v13, Lp1/l;->a:Lp1/v0;

    if-nez v8, :cond_9

    if-ne v12, v13, :cond_a

    :cond_9
    new-instance v12, Lh02/n0;

    const/4 v8, 0x0

    invoke-direct {v12, v6, v8}, Lh02/n0;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v11, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v12, Lc93/a;

    invoke-static {v0, v12, v11, v9}, Ly1/k;->c([Ljava/lang/Object;Lc93/a;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lp1/c1;

    invoke-static {v0}, Lh02/o0;->j(Lp1/c1;)Z

    move-result v8

    if-eqz v8, :cond_b

    const/4 v8, 0x0

    goto :goto_5

    :cond_b
    const/high16 v8, 0x43340000    # 180.0f

    :goto_5
    const/16 v12, 0xc00

    move-object/from16 v16, v13

    const/16 v13, 0x16

    move-object/from16 v17, v7

    move v7, v8

    const/4 v8, 0x0

    move/from16 v18, v9

    const-string v9, "caret"

    move/from16 v19, v10

    const/4 v10, 0x0

    move-object/from16 v34, v16

    move-object/from16 v33, v17

    invoke-static/range {v7 .. v13}, Ld0/g;->b(FLd0/l;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Lp1/t2;

    move-result-object v35

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-static {v7, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    int-to-float v3, v3

    int-to-float v2, v2

    invoke-static {v8, v3, v2}, Lih0/d0;->e(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v9, Lx81/d;->a:Lx81/d;

    sget v10, Lx81/d;->b:I

    invoke-virtual {v9, v11, v10}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v12

    invoke-virtual {v12}, Ly81/i;->K()J

    move-result-wide v12

    sget-object v7, Li2/w0;->a:Li2/v0;

    invoke-static {v8, v12, v13, v7}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v16

    invoke-virtual {v11, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    and-int/lit16 v8, v15, 0x380

    if-ne v8, v14, :cond_c

    const/4 v8, 0x1

    goto :goto_6

    :cond_c
    const/4 v8, 0x0

    :goto_6
    or-int/2addr v7, v8

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v7, :cond_d

    move-object/from16 v7, v34

    if-ne v8, v7, :cond_e

    :cond_d
    new-instance v8, Lbs1/i;

    const/16 v7, 0x12

    invoke-direct {v8, v5, v0, v7}, Lbs1/i;-><init>(Lkotlin/jvm/functions/Function1;Lp1/c1;I)V

    invoke-virtual {v11, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    move-object/from16 v20, v8

    check-cast v20, Lc93/a;

    const/16 v21, 0xf

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/16 v8, 0x8

    int-to-float v8, v8

    const/high16 v12, 0x40200000    # 2.5f

    mul-float/2addr v12, v8

    mul-float/2addr v3, v8

    invoke-static {v7, v12, v3}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/4 v7, 0x1

    int-to-float v12, v7

    mul-float/2addr v12, v8

    invoke-static {v12}, Ll0/m;->i(F)Ll0/k;

    move-result-object v8

    sget-object v12, Lb2/e;->M:Lb2/k;

    const/4 v13, 0x6

    invoke-static {v8, v12, v11, v13}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v8

    iget-wide v12, v11, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v11, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v14, La3/l;->a:La3/k;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v15, v11, Lp1/q;->S:Z

    if-eqz v15, :cond_f

    invoke-virtual {v11, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_f
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_7
    sget-object v15, La3/k;->g:La3/i;

    invoke-static {v11, v15, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->f:La3/i;

    invoke-static {v11, v8, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v13, La3/k;->j:La3/i;

    iget-boolean v7, v11, Lp1/q;->S:Z

    if-nez v7, :cond_10

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    move-object/from16 p3, v0

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_11

    goto :goto_8

    :cond_10
    move-object/from16 p3, v0

    :goto_8
    invoke-static {v12, v11, v12, v13}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_11
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v11, v0, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v3, v33

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-static {v7, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    sget-object v7, Lb2/e;->K:Lb2/l;

    sget-object v1, Ll0/m;->a:Ll0/e;

    move/from16 v33, v2

    const/16 v2, 0x30

    invoke-static {v1, v7, v11, v2}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v1

    move-object v2, v4

    iget-wide v4, v11, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v11, v12}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v12, v11, Lp1/q;->S:Z

    if-eqz v12, :cond_12

    invoke-virtual {v11, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_12
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_9
    invoke-static {v11, v15, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v11, v8, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v11, Lp1/q;->S:Z

    if-nez v1, :cond_13

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_14

    :cond_13
    invoke-static {v4, v11, v4, v13}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_14
    invoke-static {v11, v0, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v6}, Lh02/p0;->e()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    sget v1, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v0, v11, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v9, v11, v10}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->L()Lb91/a;

    move-result-object v27

    invoke-virtual {v9, v11, v10}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->w()J

    move-result-wide v0

    const/high16 v4, 0x3f800000    # 1.0f

    float-to-double v12, v4

    const-wide/16 v14, 0x0

    cmpl-double v5, v12, v14

    if-lez v5, :cond_15

    goto :goto_a

    :cond_15
    const-string v5, "invalid weight; must be greater than zero"

    invoke-static {v5}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_a
    new-instance v8, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const/4 v5, 0x1

    invoke-direct {v8, v4, v5}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    sget v4, Lb91/a;->d:I

    shl-int/lit8 v31, v4, 0x12

    const v32, 0x2fff8

    move-object/from16 v29, v11

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    const/16 v30, 0x0

    move-wide/from16 v36, v0

    move-object v0, v9

    move v1, v10

    move-wide/from16 v9, v36

    invoke-static/range {v7 .. v32}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v29

    mul-float v4, v33, v33

    invoke-static {v4, v3}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static/range {v35 .. v35}, Lh02/o0;->l(Lp1/t2;)F

    move-result v4

    invoke-static {v4, v3}, Landroidx/room/c1;->L(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v3, Lgz0/m0;->CARET_DOWN:Lgz0/m0;

    invoke-virtual {v3}, Lgz0/m0;->toWhoopIcon()I

    move-result v3

    const/4 v4, 0x0

    invoke-static {v3, v11, v4}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v7

    invoke-static/range {p3 .. p3}, Lh02/o0;->j(Lp1/c1;)Z

    move-result v3

    if-eqz v3, :cond_16

    const v3, 0x6d709b73

    invoke-virtual {v11, v3}, Lp1/q;->e0(I)V

    sget v3, Lgy0/f;->r0:I

    invoke-static {v11, v3}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v11, v4}, Lp1/q;->q(Z)V

    :goto_b
    move-object v8, v3

    goto :goto_c

    :cond_16
    const v3, 0x6d725191

    invoke-virtual {v11, v3}, Lp1/q;->e0(I)V

    sget v3, Lgy0/f;->q0:I

    invoke-static {v11, v3}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v11, v4}, Lp1/q;->q(Z)V

    goto :goto_b

    :goto_c
    invoke-virtual {v0, v11, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->w()J

    move-result-wide v0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object v12, v11

    move-wide v10, v0

    invoke-static/range {v7 .. v14}, Lg1/f3;->a(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    move-object v11, v12

    invoke-virtual {v11, v5}, Lp1/q;->q(Z)V

    invoke-static/range {p3 .. p3}, Lh02/o0;->j(Lp1/c1;)Z

    move-result v0

    xor-int/lit8 v8, v0, 0x1

    new-instance v0, Lb30/a1;

    const/16 v1, 0x12

    invoke-direct {v0, v6, v1}, Lb30/a1;-><init>(Ljava/lang/Object;I)V

    const v1, -0x36c09a88    # -783959.5f

    invoke-static {v1, v11, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v13

    const v15, 0x180006

    const/16 v16, 0x1e

    sget-object v7, Ll0/z;->a:Ll0/z;

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object/from16 v29, v11

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object/from16 v14, v29

    invoke-static/range {v7 .. v16}, Landroidx/compose/animation/b;->e(Ll0/y;ZLandroidx/compose/ui/Modifier;Lc0/c1;Lc0/e1;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    move-object v11, v14

    invoke-virtual {v11, v5}, Lp1/q;->q(Z)V

    move-object v4, v2

    goto :goto_d

    :cond_17
    invoke-virtual {v11}, Lp1/q;->X()V

    :goto_d
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_18

    new-instance v0, Lf02/c;

    const/16 v3, 0x17

    move-object/from16 v5, p2

    move/from16 v1, p4

    move/from16 v2, p5

    invoke-direct/range {v0 .. v6}, Lf02/c;-><init>(IIILandroidx/compose/ui/Modifier;Ll83/e;Lm91/u;)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_18
    return-void
.end method

.method private static final i(Lh02/p0;)Lp1/c1;
    .locals 0

    invoke-virtual {p0}, Lh02/p0;->f()Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    invoke-static {p0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p0

    return-object p0
.end method

.method private static final j(Lp1/c1;)Z
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

.method private static final k(Lp1/c1;Z)V
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

.method private static final l(Lp1/t2;)F
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")F"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    move-result p0

    return p0
.end method

.method private static final m(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;
    .locals 1

    invoke-static {p1}, Lh02/o0;->j(Lp1/c1;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-static {p1, v0}, Lh02/o0;->k(Lp1/c1;Z)V

    new-instance v0, Lh02/q0;

    invoke-static {p1}, Lh02/o0;->j(Lp1/c1;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    invoke-direct {v0, p1}, Lh02/q0;-><init>(Z)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final n(Lh02/p0;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 9

    const-string p3, "$this$AnimatedVisibility"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Ll0/m;->c:Ll0/g;

    sget-object p3, Lb2/e;->M:Lb2/k;

    const/4 v0, 0x0

    invoke-static {p1, p3, p2, v0}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object p1

    move-object p3, p2

    check-cast p3, Lp1/q;

    iget-wide v1, p3, Lp1/q;->T:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    invoke-virtual {p3}, Lp1/q;->m()Lp1/p1;

    move-result-object v2

    sget-object v3, Lb2/t;->w:Lb2/t;

    invoke-static {p2, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v5, La3/l;->a:La3/k;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, La3/k;->b:La3/j;

    iget-object v6, p3, Lp1/q;->a:Lhb3/a0;

    invoke-virtual {p3}, Lp1/q;->i0()V

    iget-boolean v6, p3, Lp1/q;->S:Z

    if-eqz v6, :cond_0

    invoke-virtual {p3, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p3}, Lp1/q;->s0()V

    :goto_0
    sget-object v5, La3/k;->g:La3/i;

    invoke-static {p2, v5, p1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p1, La3/k;->f:La3/i;

    invoke-static {p2, p1, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p1, La3/k;->j:La3/i;

    iget-boolean v2, p3, Lp1/q;->S:Z

    if-nez v2, :cond_1

    invoke-virtual {p3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    :cond_1
    invoke-static {v1, p3, v1, p1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_2
    sget-object p1, La3/k;->d:La3/i;

    invoke-static {p2, p1, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const p1, -0x3f579dcc

    invoke-virtual {p3, p1}, Lp1/q;->e0(I)V

    invoke-virtual {p0}, Lh02/p0;->c()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    const/4 v1, 0x1

    if-eqz p1, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lh02/k;

    int-to-float v1, v1

    const/16 v2, 0x8

    int-to-float v2, v2

    mul-float v5, v1, v2

    const/4 v7, 0x0

    const/16 v8, 0xd

    const/4 v4, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/16 v2, 0x30

    invoke-static {p1, v1, p2, v2, v0}, Lh02/o0;->f(Lh02/k;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_3
    invoke-virtual {p3, v0}, Lp1/q;->q(Z)V

    invoke-virtual {p3, v1}, Lp1/q;->q(Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final o(Landroidx/compose/ui/Modifier;Lh02/p0;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lh02/o0;->h(Landroidx/compose/ui/Modifier;Lh02/p0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
