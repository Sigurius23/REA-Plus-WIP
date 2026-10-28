.class public abstract Lgz2/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a5\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006H\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a7\u0010\u000f\u001a\u00020\u00042\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000c2\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006H\u0003\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lhz2/b;",
        "section",
        "Lkotlin/Function1;",
        "Lcom/whoop/whooplabs/feature/navigation/c;",
        "Ll83/a0;",
        "onNavEvent",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "e",
        "(Lhz2/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V",
        "Lkd1/o;",
        "image",
        "Lcom/whoop/design/util/TextResource;",
        "title",
        "body",
        "c",
        "(Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V",
        "whooplabs_release"
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
.method public static synthetic a(Lhz2/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lgz2/g;->f(Lhz2/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lgz2/g;->d(Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 35

    move-object/from16 v0, p0

    move-object/from16 v6, p1

    move-object/from16 v7, p2

    move/from16 v8, p5

    move-object/from16 v3, p4

    check-cast v3, Lp1/q;

    const v1, -0x12282032

    invoke-virtual {v3, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v8, 0x6

    const/4 v2, 0x4

    if-nez v1, :cond_2

    and-int/lit8 v1, v8, 0x8

    if-nez v1, :cond_0

    invoke-virtual {v3, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    goto :goto_0

    :cond_0
    invoke-virtual {v3, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    :goto_0
    if-eqz v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    const/4 v1, 0x2

    :goto_1
    or-int/2addr v1, v8

    goto :goto_2

    :cond_2
    move v1, v8

    :goto_2
    and-int/lit8 v4, v8, 0x30

    if-nez v4, :cond_5

    and-int/lit8 v4, v8, 0x40

    if-nez v4, :cond_3

    invoke-virtual {v3, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    goto :goto_3

    :cond_3
    invoke-virtual {v3, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    :goto_3
    if-eqz v4, :cond_4

    const/16 v4, 0x20

    goto :goto_4

    :cond_4
    const/16 v4, 0x10

    :goto_4
    or-int/2addr v1, v4

    :cond_5
    and-int/lit16 v4, v8, 0x180

    if-nez v4, :cond_8

    and-int/lit16 v4, v8, 0x200

    if-nez v4, :cond_6

    invoke-virtual {v3, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    goto :goto_5

    :cond_6
    invoke-virtual {v3, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    :goto_5
    if-eqz v4, :cond_7

    const/16 v4, 0x100

    goto :goto_6

    :cond_7
    const/16 v4, 0x80

    :goto_6
    or-int/2addr v1, v4

    :cond_8
    and-int/lit8 v4, p6, 0x8

    if-eqz v4, :cond_a

    or-int/lit16 v1, v1, 0xc00

    :cond_9
    move-object/from16 v5, p3

    goto :goto_8

    :cond_a
    and-int/lit16 v5, v8, 0xc00

    if-nez v5, :cond_9

    move-object/from16 v5, p3

    invoke-virtual {v3, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_b

    const/16 v9, 0x800

    goto :goto_7

    :cond_b
    const/16 v9, 0x400

    :goto_7
    or-int/2addr v1, v9

    :goto_8
    and-int/lit16 v9, v1, 0x493

    const/16 v10, 0x492

    const/4 v11, 0x1

    if-eq v9, v10, :cond_c

    move v9, v11

    goto :goto_9

    :cond_c
    const/4 v9, 0x0

    :goto_9
    and-int/2addr v1, v11

    invoke-virtual {v3, v1, v9}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_17

    sget-object v9, Lb2/t;->w:Lb2/t;

    if-eqz v4, :cond_d

    move-object v10, v9

    goto :goto_a

    :cond_d
    move-object v10, v5

    :goto_a
    sget-object v1, Lb2/e;->N:Lb2/k;

    const/high16 v13, 0x3f800000    # 1.0f

    invoke-static {v13, v10}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const-wide/high16 v14, 0x3fe0000000000000L    # 0.5

    double-to-float v5, v14

    int-to-float v2, v2

    mul-float/2addr v5, v2

    sget-object v14, Lx81/d;->a:Lx81/d;

    sget v15, Lx81/d;->b:I

    invoke-virtual {v14, v3, v15}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v16

    move-object/from16 p4, v14

    invoke-virtual/range {v16 .. v16}, Ly81/i;->W0()J

    move-result-wide v13

    sget-object v16, Lkd1/w;->a:Lkd1/w;

    invoke-virtual/range {v16 .. v16}, Lkd1/w;->a()Lk91/a;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Lk91/a;->c()Lt0/i;

    move-result-object v11

    invoke-static {v4, v5, v13, v14, v11}, Lge3/g;->h(Landroidx/compose/ui/Modifier;FJLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const-wide/high16 v13, 0x4012000000000000L    # 4.5

    double-to-float v5, v13

    mul-float/2addr v5, v2

    invoke-static {v5, v4}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/4 v11, 0x3

    int-to-float v5, v11

    const/16 v13, 0x36

    invoke-static {v5, v2, v1, v3, v13}, Lm4/a;->n(FFLb2/k;Lp1/q;I)Ll0/x;

    move-result-object v1

    iget-wide v13, v3, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v3}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v3, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v14, La3/l;->a:La3/k;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v3}, Lp1/q;->i0()V

    iget-boolean v11, v3, Lp1/q;->S:Z

    if-eqz v11, :cond_e

    invoke-virtual {v3, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_b

    :cond_e
    invoke-virtual {v3}, Lp1/q;->s0()V

    :goto_b
    sget-object v11, La3/k;->g:La3/i;

    invoke-static {v3, v11, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v3, v1, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v13, La3/k;->j:La3/i;

    iget-boolean v12, v3, Lp1/q;->S:Z

    if-nez v12, :cond_f

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_10

    :cond_f
    invoke-static {v5, v3, v5, v13}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_10
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v3, v0, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/16 v4, 0x18

    int-to-float v4, v4

    mul-float/2addr v4, v2

    invoke-static {v4, v9}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v4, Lb2/e;->w:Lb2/m;

    const/4 v5, 0x0

    invoke-static {v4, v5}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v4

    iget-wide v7, v3, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v3}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v3, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v3}, Lp1/q;->i0()V

    iget-boolean v8, v3, Lp1/q;->S:Z

    if-eqz v8, :cond_11

    invoke-virtual {v3, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_c

    :cond_11
    invoke-virtual {v3}, Lp1/q;->s0()V

    :goto_c
    invoke-static {v3, v11, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v3, v1, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v3, Lp1/q;->S:Z

    if-nez v1, :cond_12

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    :cond_12
    invoke-static {v5, v3, v5, v13}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_13
    invoke-static {v3, v0, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    if-nez p0, :cond_14

    const v0, 0x21a94ef

    invoke-virtual {v3, v0}, Lp1/q;->e0(I)V

    const/4 v7, 0x0

    invoke-virtual {v3, v7}, Lp1/q;->q(Z)V

    move-object/from16 v0, p4

    move-object v4, v3

    move-object v5, v10

    move v2, v15

    const/4 v1, 0x3

    const/4 v3, 0x1

    goto :goto_d

    :cond_14
    const/4 v7, 0x0

    const v0, 0x21a94f0

    invoke-virtual {v3, v0}, Lp1/q;->e0(I)V

    sget v4, Lkd1/o;->a:I

    const/4 v5, 0x3

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object/from16 v0, p0

    invoke-static/range {v0 .. v5}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v1

    move-object/from16 v31, v3

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0, v9}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    const/4 v0, 0x1

    const/16 v17, 0x1b0

    const/16 v18, 0x78

    move-object v9, v10

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move v2, v15

    const/4 v15, 0x0

    move v3, v0

    move-object v5, v9

    move-object/from16 v16, v31

    move-object/from16 v0, p4

    move-object v9, v1

    const/4 v1, 0x3

    invoke-static/range {v9 .. v18}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v4, v16

    invoke-virtual {v4, v7}, Lp1/q;->q(Z)V

    :goto_d
    invoke-virtual {v4, v3}, Lp1/q;->q(Z)V

    if-nez v6, :cond_15

    const v8, -0x5cbef9c7

    invoke-virtual {v4, v8}, Lp1/q;->e0(I)V

    invoke-virtual {v4, v7}, Lp1/q;->q(Z)V

    goto :goto_e

    :cond_15
    const v8, -0x5cbef9c6

    invoke-virtual {v4, v8}, Lp1/q;->e0(I)V

    sget v8, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v6, v4, v8}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v0, v4, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->y()J

    move-result-wide v11

    invoke-virtual {v0, v4, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v8

    invoke-virtual {v8}, Lb91/d;->q()Lb91/a;

    move-result-object v29

    sget v8, Lb91/a;->d:I

    shl-int/lit8 v33, v8, 0x12

    const v34, 0x2fffa

    const/4 v10, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const-wide/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v30, 0x0

    const/16 v32, 0x0

    move-object/from16 v31, v4

    invoke-static/range {v9 .. v34}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    invoke-virtual {v4, v7}, Lp1/q;->q(Z)V

    :goto_e
    if-nez p2, :cond_16

    const v0, -0x5cbbc2f2

    invoke-virtual {v4, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v4, v7}, Lp1/q;->q(Z)V

    goto :goto_f

    :cond_16
    const v8, -0x5cbbc2f1

    invoke-virtual {v4, v8}, Lp1/q;->e0(I)V

    sget v8, Lcom/whoop/design/util/TextResource;->$stable:I

    move-object/from16 v9, p2

    invoke-static {v9, v4, v8}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0, v4, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->b1()J

    move-result-wide v11

    invoke-virtual {v0, v4, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->a()Lb91/a;

    move-result-object v29

    new-instance v0, Lw3/k;

    invoke-direct {v0, v1}, Lw3/k;-><init>(I)V

    sget v1, Lb91/a;->d:I

    shl-int/lit8 v33, v1, 0x12

    const v34, 0x2fdfa

    const/4 v10, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const-wide/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v30, 0x0

    const/16 v32, 0x0

    move-object/from16 v21, v0

    move-object/from16 v31, v4

    move-object v9, v8

    invoke-static/range {v9 .. v34}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    invoke-virtual {v4, v7}, Lp1/q;->q(Z)V

    :goto_f
    invoke-virtual {v4, v3}, Lp1/q;->q(Z)V

    goto :goto_10

    :cond_17
    move-object v4, v3

    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_10
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_18

    new-instance v0, Lg1/m3;

    const/4 v7, 0x5

    move-object/from16 v1, p0

    move-object/from16 v3, p2

    move-object v4, v5

    move-object v2, v6

    move/from16 v5, p5

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Lg1/m3;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_18
    return-void
.end method

.method private static final d(Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
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

    invoke-static/range {v0 .. v6}, Lgz2/g;->c(Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final e(Lhz2/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 36
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhz2/b;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v4, p0

    move-object/from16 v6, p1

    move/from16 v1, p4

    const-string v0, "section"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onNavEvent"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v15, p3

    check-cast v15, Lp1/q;

    const v0, -0x14b4c66f

    invoke-virtual {v15, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v1, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v15, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v1

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    and-int/lit8 v3, v1, 0x30

    if-nez v3, :cond_3

    invoke-virtual {v15, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v0, v3

    :cond_3
    and-int/lit8 v3, p5, 0x4

    if-eqz v3, :cond_5

    or-int/lit16 v0, v0, 0x180

    :cond_4
    move-object/from16 v5, p2

    goto :goto_4

    :cond_5
    and-int/lit16 v5, v1, 0x180

    if-nez v5, :cond_4

    move-object/from16 v5, p2

    invoke-virtual {v15, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6

    const/16 v7, 0x100

    goto :goto_3

    :cond_6
    const/16 v7, 0x80

    :goto_3
    or-int/2addr v0, v7

    :goto_4
    and-int/lit16 v7, v0, 0x93

    const/16 v8, 0x92

    const/4 v9, 0x1

    const/4 v10, 0x0

    if-eq v7, v8, :cond_7

    move v7, v9

    goto :goto_5

    :cond_7
    move v7, v10

    :goto_5
    and-int/lit8 v8, v0, 0x1

    invoke-virtual {v15, v8, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_10

    sget-object v33, Lb2/t;->w:Lb2/t;

    if-eqz v3, :cond_8

    move-object/from16 v3, v33

    goto :goto_6

    :cond_8
    move-object v3, v5

    :goto_6
    sget-object v5, Ll0/m;->c:Ll0/g;

    sget-object v7, Lb2/e;->M:Lb2/k;

    invoke-static {v5, v7, v15, v10}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v5

    iget-wide v7, v15, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v15}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v15, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v15}, Lp1/q;->i0()V

    iget-boolean v13, v15, Lp1/q;->S:Z

    if-eqz v13, :cond_9

    invoke-virtual {v15, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_9
    invoke-virtual {v15}, Lp1/q;->s0()V

    :goto_7
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v15, v12, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v15, v5, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v8, v15, Lp1/q;->S:Z

    if-nez v8, :cond_a

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v8, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_b

    :cond_a
    invoke-static {v7, v15, v7, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v15, v5, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v4}, Lhz2/b;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    if-nez v5, :cond_c

    const v5, 0x223da1b4

    invoke-virtual {v15, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v15, v10}, Lp1/q;->q(Z)V

    move v5, v9

    move v2, v10

    goto/16 :goto_8

    :cond_c
    const v7, 0x223da1b5

    invoke-virtual {v15, v7}, Lp1/q;->e0(I)V

    sget v7, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v5, v15, v7}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    sget-object v5, Lx81/d;->a:Lx81/d;

    sget v8, Lx81/d;->b:I

    invoke-virtual {v5, v15, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v11

    invoke-virtual {v11}, Ly81/i;->y()J

    move-result-wide v11

    invoke-virtual {v5, v15, v8}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v5

    invoke-virtual {v5}, Lb91/d;->p()Lb91/a;

    move-result-object v27

    sget v5, Lb91/a;->d:I

    shl-int/lit8 v31, v5, 0x12

    const v32, 0x2fffa

    const/4 v8, 0x0

    move v5, v9

    move v13, v10

    move-wide v9, v11

    const-wide/16 v11, 0x0

    move v14, v13

    const/4 v13, 0x0

    move/from16 v16, v14

    const/4 v14, 0x0

    move-object/from16 v29, v15

    const/4 v15, 0x0

    move/from16 v18, v16

    const-wide/16 v16, 0x0

    move/from16 v19, v18

    const/16 v18, 0x0

    move/from16 v20, v19

    const/16 v19, 0x0

    move/from16 v22, v20

    const-wide/16 v20, 0x0

    move/from16 v23, v22

    const/16 v22, 0x0

    move/from16 v24, v23

    const/16 v23, 0x0

    move/from16 v25, v24

    const/16 v24, 0x0

    move/from16 v26, v25

    const/16 v25, 0x0

    move/from16 v28, v26

    const/16 v26, 0x0

    move/from16 v30, v28

    const/16 v28, 0x0

    move/from16 v34, v30

    const/16 v30, 0x0

    move/from16 v2, v34

    invoke-static/range {v7 .. v32}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v15, v29

    invoke-virtual {v15, v2}, Lp1/q;->q(Z)V

    :goto_8
    invoke-virtual {v4}, Lhz2/b;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    const/16 v8, 0x8

    if-nez v7, :cond_d

    const v7, 0x224020b7

    invoke-virtual {v15, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v15, v2}, Lp1/q;->q(Z)V

    move/from16 v35, v0

    move v1, v8

    move-object/from16 v0, v33

    goto/16 :goto_9

    :cond_d
    const v9, 0x224020b8

    invoke-virtual {v15, v9}, Lp1/q;->e0(I)V

    sget v9, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v7, v15, v9}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    sget-object v9, Lx81/d;->a:Lx81/d;

    sget v10, Lx81/d;->b:I

    invoke-virtual {v9, v15, v10}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v11

    invoke-virtual {v11}, Ly81/i;->b1()J

    move-result-wide v11

    invoke-virtual {v9, v15, v10}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v9

    invoke-virtual {v9}, Lb91/d;->e()Lb91/a;

    move-result-object v27

    const-wide/high16 v9, 0x3fe0000000000000L    # 0.5

    double-to-float v9, v9

    int-to-float v10, v8

    mul-float v18, v9, v10

    const/16 v20, 0x0

    const/16 v21, 0xd

    const/16 v17, 0x0

    const/16 v19, 0x0

    move-object/from16 v16, v33

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget v10, Lb91/a;->d:I

    shl-int/lit8 v31, v10, 0x12

    const v32, 0x2fff8

    move v13, v8

    move-object v8, v9

    move-wide v9, v11

    const-wide/16 v11, 0x0

    move v14, v13

    const/4 v13, 0x0

    move/from16 v17, v14

    const/4 v14, 0x0

    move-object/from16 v29, v15

    const/4 v15, 0x0

    move-object/from16 v18, v16

    move/from16 v19, v17

    const-wide/16 v16, 0x0

    move-object/from16 v20, v18

    const/16 v18, 0x0

    move/from16 v21, v19

    const/16 v19, 0x0

    move-object/from16 v22, v20

    move/from16 v23, v21

    const-wide/16 v20, 0x0

    move-object/from16 v24, v22

    const/16 v22, 0x0

    move/from16 v25, v23

    const/16 v23, 0x0

    move-object/from16 v26, v24

    const/16 v24, 0x0

    move/from16 v28, v25

    const/16 v25, 0x0

    move-object/from16 v30, v26

    const/16 v26, 0x0

    move/from16 v33, v28

    const/16 v28, 0x0

    move-object/from16 v34, v30

    const/16 v30, 0x30

    move/from16 v35, v0

    move/from16 v1, v33

    move-object/from16 v0, v34

    invoke-static/range {v7 .. v32}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v15, v29

    invoke-virtual {v15, v2}, Lp1/q;->q(Z)V

    :goto_9
    const/4 v7, 0x6

    int-to-float v8, v7

    const/4 v9, 0x4

    int-to-float v9, v9

    mul-float/2addr v8, v9

    invoke-static {v8, v0}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-static {v15, v8}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v4}, Lhz2/b;->b()Ljava/util/List;

    move-result-object v8

    check-cast v8, Ljava/util/Collection;

    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    move-result v8

    if-nez v8, :cond_e

    const v7, 0x2245647e

    invoke-virtual {v15, v7}, Lp1/q;->e0(I)V

    move v7, v5

    invoke-virtual {v4}, Lhz2/b;->b()Ljava/util/List;

    move-result-object v5

    and-int/lit8 v9, v35, 0x70

    const/4 v10, 0x4

    move v8, v7

    const/4 v7, 0x0

    move v12, v8

    move-object v8, v15

    invoke-static/range {v5 .. v10}, Lgz2/c;->c(Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v15, v2}, Lp1/q;->q(Z)V

    goto :goto_c

    :cond_e
    move v12, v5

    const v5, 0x22476553

    invoke-virtual {v15, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v4}, Lhz2/b;->a()Lhz2/a;

    move-result-object v6

    if-nez v6, :cond_f

    const v5, 0x22476552

    invoke-virtual {v15, v5}, Lp1/q;->e0(I)V

    :goto_a
    invoke-virtual {v15, v2}, Lp1/q;->q(Z)V

    goto :goto_b

    :cond_f
    invoke-virtual {v15, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v6}, Lhz2/a;->b()Lkd1/o;

    move-result-object v5

    move-object v8, v6

    invoke-virtual {v8}, Lhz2/a;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual {v8}, Lhz2/a;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    sget v9, Lkd1/o;->a:I

    sget v10, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v11, v10, 0x3

    or-int/2addr v9, v11

    shl-int/lit8 v7, v10, 0x6

    or-int v10, v9, v7

    const/16 v11, 0x8

    move-object v7, v8

    const/4 v8, 0x0

    move-object v9, v15

    invoke-static/range {v5 .. v11}, Lgz2/g;->c(Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    goto :goto_a

    :goto_b
    invoke-virtual {v15, v2}, Lp1/q;->q(Z)V

    :goto_c
    const-wide/high16 v5, 0x4004000000000000L    # 2.5

    double-to-float v2, v5

    int-to-float v1, v1

    mul-float/2addr v2, v1

    const/4 v1, 0x0

    invoke-static {v0, v1, v2, v12}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v6, Lhy0/g;->SOLID:Lhy0/g;

    sget-object v0, Lx81/d;->a:Lx81/d;

    sget v1, Lx81/d;->b:I

    invoke-virtual {v0, v15, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->b1()J

    move-result-wide v10

    const/16 v16, 0x36

    const/16 v17, 0xdc

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move v0, v12

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    invoke-static/range {v5 .. v17}, Lhy0/i2;->j(Landroidx/compose/ui/Modifier;Lhy0/g;Lhy0/f;Lcom/whoop/design/util/TextResource;Ljava/lang/Float;JJLb91/c;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v15, v0}, Lp1/q;->q(Z)V

    move-object v5, v3

    goto :goto_d

    :cond_10
    invoke-virtual {v15}, Lp1/q;->X()V

    :goto_d
    invoke-virtual {v15}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_11

    new-instance v0, Lf02/c;

    const/16 v3, 0x11

    move-object/from16 v6, p1

    move/from16 v1, p4

    move/from16 v2, p5

    invoke-direct/range {v0 .. v6}, Lf02/c;-><init>(IIILjava/lang/Object;Ljava/lang/Object;Ll83/e;)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_11
    return-void
.end method

.method private static final f(Lhz2/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lgz2/g;->e(Lhz2/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
