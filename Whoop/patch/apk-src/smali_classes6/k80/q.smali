.class public abstract Lk80/q;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lkd1/o;",
        "image",
        "Lcom/whoop/design/util/TextResource;",
        "title",
        "",
        "subtitle",
        "Ll83/a0;",
        "b",
        "(Lkd1/o;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V",
        "activation_release"
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
.method public static synthetic a(Lkd1/o;Lcom/whoop/design/util/TextResource;Ljava/lang/String;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lk80/q;->c(Lkd1/o;Lcom/whoop/design/util/TextResource;Ljava/lang/String;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lkd1/o;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V
    .locals 35

    move-object/from16 v0, p0

    move-object/from16 v6, p1

    move/from16 v7, p4

    const-string v1, "image"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "title"

    invoke-static {v6, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v15, p3

    check-cast v15, Lp1/q;

    const v1, -0x78181e17

    invoke-virtual {v15, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v7, 0x6

    const/4 v2, 0x4

    if-nez v1, :cond_2

    and-int/lit8 v1, v7, 0x8

    if-nez v1, :cond_0

    invoke-virtual {v15, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    goto :goto_0

    :cond_0
    invoke-virtual {v15, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    :goto_0
    if-eqz v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    const/4 v1, 0x2

    :goto_1
    or-int/2addr v1, v7

    goto :goto_2

    :cond_2
    move v1, v7

    :goto_2
    and-int/lit8 v3, v7, 0x30

    if-nez v3, :cond_5

    and-int/lit8 v3, v7, 0x40

    if-nez v3, :cond_3

    invoke-virtual {v15, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    goto :goto_3

    :cond_3
    invoke-virtual {v15, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    :goto_3
    if-eqz v3, :cond_4

    const/16 v3, 0x20

    goto :goto_4

    :cond_4
    const/16 v3, 0x10

    :goto_4
    or-int/2addr v1, v3

    :cond_5
    and-int/lit8 v3, p5, 0x4

    if-eqz v3, :cond_7

    or-int/lit16 v1, v1, 0x180

    :cond_6
    move-object/from16 v4, p2

    :goto_5
    move v8, v1

    goto :goto_7

    :cond_7
    and-int/lit16 v4, v7, 0x180

    if-nez v4, :cond_6

    move-object/from16 v4, p2

    invoke-virtual {v15, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_8

    const/16 v5, 0x100

    goto :goto_6

    :cond_8
    const/16 v5, 0x80

    :goto_6
    or-int/2addr v1, v5

    goto :goto_5

    :goto_7
    and-int/lit16 v1, v8, 0x93

    const/16 v5, 0x92

    const/4 v9, 0x0

    const/4 v10, 0x1

    if-eq v1, v5, :cond_9

    move v1, v10

    goto :goto_8

    :cond_9
    move v1, v9

    :goto_8
    and-int/lit8 v5, v8, 0x1

    invoke-virtual {v15, v5, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_f

    if-eqz v3, :cond_a

    const/4 v1, 0x0

    move-object/from16 v34, v1

    goto :goto_9

    :cond_a
    move-object/from16 v34, v4

    :goto_9
    const/high16 v1, 0x3f800000    # 1.0f

    sget-object v11, Lb2/t;->w:Lb2/t;

    invoke-static {v1, v11}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v3, Ll0/m;->c:Ll0/g;

    sget-object v4, Lb2/e;->M:Lb2/k;

    invoke-static {v3, v4, v15, v9}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v4, v15, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v15}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v15, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v15}, Lp1/q;->i0()V

    iget-boolean v13, v15, Lp1/q;->S:Z

    if-eqz v13, :cond_b

    invoke-virtual {v15, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_b
    invoke-virtual {v15}, Lp1/q;->s0()V

    :goto_a
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v15, v12, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v15, v3, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v5, v15, Lp1/q;->S:Z

    if-nez v5, :cond_c

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v5, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_d

    :cond_c
    invoke-static {v4, v15, v4, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_d
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v15, v3, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/16 v1, 0x19

    int-to-float v1, v1

    int-to-float v12, v2

    mul-float/2addr v1, v12

    invoke-static {v1, v11}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    sget v1, Lkd1/o;->a:I

    and-int/lit8 v2, v8, 0xe

    or-int v4, v1, v2

    const/4 v5, 0x3

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v3, v15

    invoke-static/range {v0 .. v5}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v1

    move-object/from16 v30, v3

    const/16 v16, 0x61b0

    const/16 v17, 0x68

    move v0, v9

    const/4 v9, 0x0

    move-object v2, v11

    const/4 v11, 0x0

    move v3, v12

    sget-object v12, Ly2/j;->b:Ly2/b1;

    move v4, v10

    move-object v10, v13

    const/4 v13, 0x0

    const/4 v14, 0x0

    move v15, v8

    move-object v8, v1

    move v1, v15

    move-object/from16 v15, v30

    invoke-static/range {v8 .. v17}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    const/16 v5, 0x8

    int-to-float v5, v5

    mul-float v18, v3, v5

    const/16 v20, 0x0

    const/16 v21, 0xd

    const/16 v17, 0x0

    const/16 v19, 0x0

    move-object/from16 v16, v2

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget v3, Lcom/whoop/design/util/TextResource;->$stable:I

    shr-int/lit8 v1, v1, 0x3

    and-int/lit8 v1, v1, 0xe

    or-int/2addr v1, v3

    invoke-static {v6, v15, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v8

    sget-object v1, Lx81/d;->a:Lx81/d;

    sget v3, Lx81/d;->b:I

    invoke-virtual {v1, v15, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v10

    invoke-virtual {v10}, Lb91/d;->O()Lb91/a;

    move-result-object v28

    invoke-virtual {v1, v15, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->y()J

    move-result-wide v10

    sget v12, Lb91/a;->d:I

    shl-int/lit8 v32, v12, 0x12

    const v33, 0x2fff8

    const-wide/16 v12, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const-wide/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v29, 0x0

    const/16 v31, 0x30

    invoke-static/range {v8 .. v33}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v15, v30

    if-nez v34, :cond_e

    const v1, 0x7c9e7ab9

    invoke-virtual {v15, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v15, v0}, Lp1/q;->q(Z)V

    move-object/from16 v8, v34

    goto :goto_b

    :cond_e
    const v8, 0x7c9e7aba

    invoke-virtual {v15, v8}, Lp1/q;->e0(I)V

    const-wide/high16 v8, 0x3fe0000000000000L    # 0.5

    double-to-float v8, v8

    mul-float v18, v8, v5

    const/16 v20, 0x0

    const/16 v21, 0xd

    const/16 v17, 0x0

    const/16 v19, 0x0

    move-object/from16 v16, v2

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v8, Liz0/l;->a:Liz0/l;

    invoke-virtual {v1, v15, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->y()J

    move-result-wide v17

    invoke-virtual {v1, v15, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->c1()J

    move-result-wide v10

    invoke-virtual {v1, v15, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->y()J

    move-result-wide v12

    sget v1, Liz0/l;->b:I

    shl-int/lit8 v32, v1, 0xf

    const/16 v33, 0x7fd9

    const/4 v9, 0x0

    move-object/from16 v30, v15

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const-wide/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v31, 0x0

    invoke-virtual/range {v8 .. v33}, Liz0/l;->a(Ll3/v0;JJJLp3/r;JIJLiz0/a;JFFZZFLandroidx/compose/runtime/Composer;III)Liz0/m;

    move-result-object v11

    sget v1, Liz0/m;->p:I

    shl-int/lit8 v1, v1, 0x9

    or-int/lit8 v18, v1, 0x30

    const/16 v19, 0x1f4

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object v9, v2

    move-object/from16 v17, v30

    move-object/from16 v8, v34

    invoke-static/range {v8 .. v19}, Liz0/g;->M(Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLiz0/m;Lkotlin/jvm/functions/Function1;IIIZLandroidx/compose/runtime/Composer;II)V

    move-object/from16 v15, v17

    invoke-virtual {v15, v0}, Lp1/q;->q(Z)V

    :goto_b
    invoke-virtual {v15, v4}, Lp1/q;->q(Z)V

    move-object v3, v8

    goto :goto_c

    :cond_f
    invoke-virtual {v15}, Lp1/q;->X()V

    move-object v3, v4

    :goto_c
    invoke-virtual {v15}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_10

    new-instance v0, Ljp1/d;

    const/16 v6, 0xa

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v5, p5

    move v4, v7

    invoke-direct/range {v0 .. v6}, Ljp1/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_10
    return-void
.end method

.method private static final c(Lkd1/o;Lcom/whoop/design/util/TextResource;Ljava/lang/String;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lk80/q;->b(Lkd1/o;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
