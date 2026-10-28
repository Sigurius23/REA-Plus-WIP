.class public abstract Lkh0/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a/\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\u0001\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u000f\u00b2\u0006\u000e\u0010\n\u001a\u00020\t8\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u000c\u001a\u00020\u000b8\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u000e\u001a\u00020\r8\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Lkd1/o;",
        "imageSource",
        "",
        "contentDescription",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onDismiss",
        "f",
        "(Lkd1/o;Ljava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;I)V",
        "",
        "scale",
        "Lh2/b;",
        "offset",
        "Ly3/l;",
        "imageSize",
        "bot_release"
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
.method public static synthetic a(Lp1/c1;Ly3/l;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lkh0/e;->j(Lp1/c1;Ly3/l;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkd1/o;Ljava/lang/String;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lkh0/e;->q(Lkd1/o;Ljava/lang/String;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lkh0/e;->i(Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lkd1/o;Lc93/a;Ljava/lang/String;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lkh0/e;->g(Lkd1/o;Lc93/a;Ljava/lang/String;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lp1/c1;Lp1/c1;Lp1/c1;FLh2/b;F)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lkh0/e;->h(Lp1/c1;Lp1/c1;Lp1/c1;FLh2/b;F)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Lkd1/o;Ljava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkd1/o;",
            "Ljava/lang/String;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    const-string v0, "imageSource"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onDismiss"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, Lp1/q;

    const v0, -0x6481b93d

    invoke-virtual {p3, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p4, 0x6

    if-nez v0, :cond_2

    and-int/lit8 v0, p4, 0x8

    if-nez v0, :cond_0

    invoke-virtual {p3, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {p3, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    const/4 v0, 0x4

    goto :goto_1

    :cond_1
    const/4 v0, 0x2

    :goto_1
    or-int/2addr v0, p4

    goto :goto_2

    :cond_2
    move v0, p4

    :goto_2
    and-int/lit8 v1, p4, 0x30

    if-nez v1, :cond_4

    invoke-virtual {p3, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    const/16 v1, 0x20

    goto :goto_3

    :cond_3
    const/16 v1, 0x10

    :goto_3
    or-int/2addr v0, v1

    :cond_4
    and-int/lit16 v1, p4, 0x180

    if-nez v1, :cond_6

    invoke-virtual {p3, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    const/16 v1, 0x100

    goto :goto_4

    :cond_5
    const/16 v1, 0x80

    :goto_4
    or-int/2addr v0, v1

    :cond_6
    and-int/lit16 v1, v0, 0x93

    const/16 v2, 0x92

    if-eq v1, v2, :cond_7

    const/4 v1, 0x1

    goto :goto_5

    :cond_7
    const/4 v1, 0x0

    :goto_5
    and-int/lit8 v2, v0, 0x1

    invoke-virtual {p3, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_8

    new-instance v1, La80/f;

    const/16 v2, 0x17

    invoke-direct {v1, p0, p2, p1, v2}, La80/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const v2, 0x6f8b792a

    invoke-static {v2, p3, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v1

    shr-int/lit8 v0, v0, 0x6

    and-int/lit8 v0, v0, 0xe

    or-int/lit8 v0, v0, 0x30

    invoke-static {p2, v1, p3, v0}, Lch0/i1;->c(Lc93/a;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V

    goto :goto_6

    :cond_8
    invoke-virtual {p3}, Lp1/q;->X()V

    :goto_6
    invoke-virtual {p3}, Lp1/q;->u()Lp1/v1;

    move-result-object p3

    if-eqz p3, :cond_9

    new-instance v0, Lh02/i;

    const/16 v5, 0x17

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p4

    invoke-direct/range {v0 .. v5}, Lh02/i;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, p3, Lp1/v1;->d:Lc93/m;

    :cond_9
    return-void
.end method

.method private static final g(Lkd1/o;Lc93/a;Ljava/lang/String;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 33

    move-object/from16 v0, p1

    const-string v1, "$this$FullScreenPreviewDialog"

    move-object/from16 v2, p3

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v1, p5, 0x11

    const/16 v2, 0x10

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eq v1, v2, :cond_0

    move v1, v4

    goto :goto_0

    :cond_0
    move v1, v3

    :goto_0
    and-int/lit8 v2, p5, 0x1

    move-object/from16 v12, p4

    check-cast v12, Lp1/q;

    invoke-virtual {v12, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    if-eqz v1, :cond_14

    sget v9, Lkd1/o;->a:I

    const/4 v10, 0x3

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object/from16 v5, p0

    move-object v8, v12

    invoke-static/range {v5 .. v10}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v5

    invoke-virtual {v5}, Ln2/a;->h()J

    move-result-wide v6

    const/16 v1, 0x20

    shr-long v8, v6, v1

    long-to-int v8, v8

    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v8

    const-wide v9, 0xffffffffL

    and-long/2addr v6, v9

    long-to-int v6, v6

    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v6

    div-float/2addr v8, v6

    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    invoke-static {v8}, Ljava/lang/Math;->abs(F)F

    move-result v7

    const v11, 0x7f7fffff    # Float.MAX_VALUE

    cmpg-float v7, v7, v11

    if-gtz v7, :cond_1

    const/4 v7, 0x0

    cmpl-float v7, v8, v7

    if-lez v7, :cond_1

    goto :goto_1

    :cond_1
    const/4 v6, 0x0

    :goto_1
    const/high16 v7, 0x3f800000    # 1.0f

    if-eqz v6, :cond_2

    invoke-virtual {v6}, Ljava/lang/Float;->floatValue()F

    move-result v6

    goto :goto_2

    :cond_2
    move v6, v7

    :goto_2
    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    sget-object v11, Lp1/l;->a:Lp1/v0;

    if-ne v8, v11, :cond_3

    invoke-static {v7, v12}, Lc13/a;->o(FLp1/q;)Lp1/k1;

    move-result-object v8

    :cond_3
    check-cast v8, Lp1/c1;

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    const-wide/16 v14, 0x0

    if-ne v13, v11, :cond_4

    new-instance v13, Lh2/b;

    invoke-direct {v13, v14, v15}, Lh2/b;-><init>(J)V

    invoke-static {v13}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v13

    invoke-virtual {v12, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v13, Lp1/c1;

    move/from16 p0, v1

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v11, :cond_5

    new-instance v1, Ly3/l;

    invoke-direct {v1, v14, v15}, Ly3/l;-><init>(J)V

    invoke-static {v1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v1

    invoke-virtual {v12, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v1, Lp1/c1;

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    if-ne v14, v11, :cond_6

    invoke-static {v12}, Lp1/x;->p(Landroidx/compose/runtime/Composer;)Lbc3/c0;

    move-result-object v14

    invoke-virtual {v12, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v14, Lbc3/c0;

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    if-ne v15, v11, :cond_7

    new-instance v15, La80/f;

    move-wide/from16 p3, v9

    const/16 v9, 0x18

    invoke-direct {v15, v8, v1, v13, v9}, La80/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v12, v15}, Lp1/q;->p0(Ljava/lang/Object;)V

    goto :goto_3

    :cond_7
    move-wide/from16 p3, v9

    :goto_3
    check-cast v15, Lkotlin/jvm/functions/Function3;

    invoke-static {v15, v12}, Lh0/q3;->o(Lkotlin/jvm/functions/Function3;Lp1/q;)Lh0/a4;

    move-result-object v9

    sget-object v10, Lb2/t;->w:Lb2/t;

    invoke-static {v7, v10}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v15

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v11, :cond_8

    invoke-static {v12}, Ld;->g(Lp1/q;)Lj0/j;

    move-result-object v4

    :cond_8
    move-object/from16 v16, v4

    check-cast v16, Lj0/i;

    invoke-virtual {v12, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v4, :cond_9

    if-ne v7, v11, :cond_a

    :cond_9
    new-instance v7, Lkh0/a;

    invoke-direct {v7, v0}, Lkh0/a;-><init>(Lc93/a;)V

    invoke-virtual {v12, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    move-object/from16 v20, v7

    check-cast v20, Lc93/a;

    const/16 v21, 0x1c

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v15 .. v21}, Landroidx/compose/foundation/a;->e(Landroidx/compose/ui/Modifier;Lj0/i;Lf0/v0;ZLi3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v4, Lb2/e;->E:Lb2/m;

    invoke-static {v4, v3}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v4

    move-object/from16 p1, v4

    iget-wide v3, v12, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v12, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v15, La3/l;->a:La3/k;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v7, v12, Lp1/q;->S:Z

    if-eqz v7, :cond_b

    invoke-virtual {v12, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_b
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_4
    sget-object v7, La3/k;->g:La3/i;

    move-object/from16 v17, v5

    move-object/from16 v5, p1

    invoke-static {v12, v7, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v12, v5, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    move-object/from16 v18, v2

    iget-boolean v2, v12, Lp1/q;->S:Z

    if-nez v2, :cond_c

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v19, v8

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v2, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_d

    goto :goto_5

    :cond_c
    move-object/from16 v19, v8

    :goto_5
    invoke-static {v3, v12, v3, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_d
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v12, v2, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0, v10}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/4 v0, 0x0

    invoke-static {v3, v0, v6}, Landroidx/compose/foundation/layout/a;->f(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v6, Lb2/e;->w:Lb2/m;

    invoke-static {v6, v0}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v0

    move-object v6, v13

    move-object v8, v14

    iget-wide v13, v12, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v12, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v12}, Lp1/q;->i0()V

    move-object/from16 p1, v6

    iget-boolean v6, v12, Lp1/q;->S:Z

    if-eqz v6, :cond_e

    invoke-virtual {v12, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_e
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_6
    invoke-static {v12, v7, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v12, v5, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v12, Lp1/q;->S:Z

    if-nez v0, :cond_f

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_10

    :cond_f
    invoke-static {v13, v12, v13, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_10
    invoke-static {v12, v2, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0, v10}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v11, :cond_11

    new-instance v2, Lkh0/d;

    const/4 v3, 0x1

    invoke-direct {v2, v3, v1}, Lkh0/d;-><init>(ILp1/c1;)V

    invoke-virtual {v12, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v2}, Landroidx/compose/ui/layout/b;->b(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const-string v1, "image_preview_dialog_image"

    invoke-static {v0, v1}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v0, v9}, Landroidx/compose/foundation/gestures/c;->d(Landroidx/compose/ui/Modifier;Lh0/a4;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v12, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v12, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_13

    if-ne v2, v11, :cond_12

    goto :goto_7

    :cond_12
    move-object/from16 v6, p1

    move-object/from16 v1, v19

    goto :goto_8

    :cond_13
    :goto_7
    new-instance v2, Lkh0/e$a;

    move-object/from16 v6, p1

    move-object/from16 v1, v19

    invoke-direct {v2, v8, v1, v9, v6}, Lkh0/e$a;-><init>(Lbc3/c0;Lp1/c1;Lh0/a4;Lp1/c1;)V

    invoke-virtual {v12, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_8
    check-cast v2, Landroidx/compose/ui/input/pointer/PointerInputEventHandler;

    move-object/from16 v3, v18

    invoke-static {v0, v3, v2}, Lu2/c0;->b(Landroidx/compose/ui/Modifier;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Landroidx/compose/ui/Modifier;

    move-result-object v22

    invoke-static {v1}, Lkh0/e;->k(Lp1/c1;)F

    move-result v23

    invoke-static {v1}, Lkh0/e;->k(Lp1/c1;)F

    move-result v24

    invoke-static {v6}, Lkh0/e;->m(Lp1/c1;)J

    move-result-wide v0

    shr-long v0, v0, p0

    long-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v26

    invoke-static {v6}, Lkh0/e;->m(Lp1/c1;)J

    move-result-wide v0

    and-long v0, v0, p3

    long-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v27

    const/16 v31, 0x0

    const v32, 0x7efe4

    const/16 v25, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    invoke-static/range {v22 .. v32}, Landroidx/compose/ui/graphics/a;->c(Landroidx/compose/ui/Modifier;FFFFFFLi2/a1;Li2/r;II)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/16 v13, 0x6000

    const/16 v14, 0x68

    const/4 v8, 0x0

    sget-object v9, Ly2/j;->b:Ly2/b1;

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object/from16 v6, p2

    move-object/from16 v5, v17

    invoke-static/range {v5 .. v14}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    const/4 v0, 0x1

    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    return-object v3

    :cond_14
    move-object v3, v2

    invoke-virtual {v12}, Lp1/q;->X()V

    return-object v3
.end method

.method private static final h(Lp1/c1;Lp1/c1;Lp1/c1;FLh2/b;F)Ll83/a0;
    .locals 7

    invoke-static {p0}, Lkh0/e;->k(Lp1/c1;)F

    move-result p5

    mul-float/2addr p5, p3

    const/high16 p3, 0x3f800000    # 1.0f

    const/high16 v0, 0x40c00000    # 6.0f

    invoke-static {p5, p3, v0}, Le93/b;->m(FFF)F

    move-result p3

    invoke-static {p1}, Lkh0/e;->o(Lp1/c1;)J

    move-result-wide v0

    const/16 p5, 0x20

    shr-long/2addr v0, p5

    long-to-int v0, v0

    int-to-float v0, v0

    const/4 v1, 0x1

    int-to-float v1, v1

    sub-float v1, p3, v1

    mul-float/2addr v0, v1

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v0, v2

    invoke-static {p1}, Lkh0/e;->o(Lp1/c1;)J

    move-result-wide v3

    const-wide v5, 0xffffffffL

    and-long/2addr v3, v5

    long-to-int p1, v3

    int-to-float p1, p1

    mul-float/2addr p1, v1

    div-float/2addr p1, v2

    invoke-static {p0, p3}, Lkh0/e;->l(Lp1/c1;F)V

    invoke-static {p2}, Lkh0/e;->m(Lp1/c1;)J

    move-result-wide v1

    shr-long/2addr v1, p5

    long-to-int p0, v1

    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p0

    iget-wide v1, p4, Lh2/b;->a:J

    shr-long/2addr v1, p5

    long-to-int p3, v1

    invoke-static {p3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p3

    add-float/2addr p3, p0

    neg-float p0, v0

    invoke-static {p3, p0, v0}, Le93/b;->m(FFF)F

    move-result p0

    invoke-static {p2}, Lkh0/e;->m(Lp1/c1;)J

    move-result-wide v0

    and-long/2addr v0, v5

    long-to-int p3, v0

    invoke-static {p3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p3

    iget-wide v0, p4, Lh2/b;->a:J

    and-long/2addr v0, v5

    long-to-int p4, v0

    invoke-static {p4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p4

    add-float/2addr p4, p3

    neg-float p3, p1

    invoke-static {p4, p3, p1}, Le93/b;->m(FFF)F

    move-result p1

    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p0

    int-to-long p3, p0

    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p0

    int-to-long p0, p0

    shl-long/2addr p3, p5

    and-long/2addr p0, v5

    or-long/2addr p0, p3

    invoke-static {p2, p0, p1}, Lkh0/e;->n(Lp1/c1;J)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Lp1/c1;Ly3/l;)Ll83/a0;
    .locals 2

    iget-wide v0, p1, Ly3/l;->a:J

    invoke-static {p0, v0, v1}, Lkh0/e;->p(Lp1/c1;J)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Lp1/c1;)F
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
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

.method private static final l(Lp1/c1;F)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "F)V"
        }
    .end annotation

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final m(Lp1/c1;)J
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")J"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lh2/b;

    iget-wide v0, p0, Lh2/b;->a:J

    return-wide v0
.end method

.method private static final n(Lp1/c1;J)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "J)V"
        }
    .end annotation

    new-instance v0, Lh2/b;

    invoke-direct {v0, p1, p2}, Lh2/b;-><init>(J)V

    invoke-interface {p0, v0}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final o(Lp1/c1;)J
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")J"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ly3/l;

    iget-wide v0, p0, Ly3/l;->a:J

    return-wide v0
.end method

.method private static final p(Lp1/c1;J)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "J)V"
        }
    .end annotation

    new-instance v0, Ly3/l;

    invoke-direct {v0, p1, p2}, Ly3/l;-><init>(J)V

    invoke-interface {p0, v0}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final q(Lkd1/o;Ljava/lang/String;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Lkh0/e;->f(Lkd1/o;Ljava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final synthetic r(Lp1/c1;)F
    .locals 0

    invoke-static {p0}, Lkh0/e;->k(Lp1/c1;)F

    move-result p0

    return p0
.end method

.method public static final synthetic s(Lp1/c1;)J
    .locals 2

    invoke-static {p0}, Lkh0/e;->m(Lp1/c1;)J

    move-result-wide v0

    return-wide v0
.end method

.method public static final synthetic t(Lp1/c1;J)V
    .locals 0

    invoke-static {p0, p1, p2}, Lkh0/e;->n(Lp1/c1;J)V

    return-void
.end method
