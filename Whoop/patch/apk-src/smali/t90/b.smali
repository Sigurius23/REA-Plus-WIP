.class public abstract Lt90/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a+\u0010\u0004\u001a\u00020\u00012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\u0001\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "primaryCtaClick",
        "secondaryCtaClick",
        "c",
        "(Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V",
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
.method public static synthetic a(Lk2/c;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lt90/b;->d(Lk2/c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lc93/a;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lt90/b;->e(Lc93/a;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 39
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v5, p0

    move-object/from16 v9, p1

    move/from16 v10, p3

    const-string v0, "primaryCtaClick"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "secondaryCtaClick"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v6, p2

    check-cast v6, Lp1/q;

    const v0, 0xe557854

    invoke-virtual {v6, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v10, 0x6

    const/4 v1, 0x4

    if-nez v0, :cond_1

    invoke-virtual {v6, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v10

    goto :goto_1

    :cond_1
    move v0, v10

    :goto_1
    and-int/lit8 v2, v10, 0x30

    if-nez v2, :cond_3

    invoke-virtual {v6, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v0, v2

    :cond_3
    move/from16 v22, v0

    and-int/lit8 v0, v22, 0x13

    const/16 v12, 0x12

    const/4 v2, 0x0

    if-eq v0, v12, :cond_4

    const/4 v0, 0x1

    goto :goto_3

    :cond_4
    move v0, v2

    :goto_3
    and-int/lit8 v3, v22, 0x1

    invoke-virtual {v6, v3, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v0, v3, :cond_5

    new-instance v0, Lqc1/a;

    invoke-direct {v0, v12}, Lqc1/a;-><init>(I)V

    invoke-virtual {v6, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v0, Lkotlin/jvm/functions/Function1;

    sget-object v14, Lb2/t;->w:Lb2/t;

    invoke-static {v14, v0}, Landroidx/compose/ui/draw/a;->c(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v3, Lb2/e;->w:Lb2/m;

    invoke-static {v3, v2}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v2

    iget-wide v3, v6, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v6, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v8, v6, Lp1/q;->S:Z

    if-eqz v8, :cond_6

    invoke-virtual {v6, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_6
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_4
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v6, v8, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v6, v2, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v15, v6, Lp1/q;->S:Z

    if-nez v15, :cond_7

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v15, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_8

    :cond_7
    invoke-static {v3, v6, v3, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_8
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v6, v3, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    int-to-float v11, v1

    const/16 v0, 0x8

    int-to-float v15, v0

    mul-float v0, v11, v15

    const/4 v1, 0x5

    int-to-float v1, v1

    mul-float/2addr v1, v15

    const-wide/high16 v12, 0x4004000000000000L    # 2.5

    double-to-float v12, v12

    mul-float/2addr v12, v15

    invoke-static {v14, v12, v0, v12, v1}, Landroidx/compose/foundation/layout/a;->s(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v1, Lb2/e;->N:Lb2/k;

    sget-object v12, Ll0/m;->c:Ll0/g;

    const/16 v13, 0x30

    invoke-static {v12, v1, v6, v13}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    iget-wide v12, v6, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v6, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v5, v6, Lp1/q;->S:Z

    if-eqz v5, :cond_9

    invoke-virtual {v6, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_9
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_5
    invoke-static {v6, v8, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v6, v2, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v6, Lp1/q;->S:Z

    if-nez v1, :cond_a

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    :cond_a
    invoke-static {v12, v6, v12, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    invoke-static {v6, v3, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget v0, Lx60/b;->c0:I

    invoke-static {v6, v0}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    sget v0, Lcom/whoop/design/util/TextResource;->$stable:I

    const/4 v12, 0x3

    shl-int/lit8 v23, v0, 0x3

    shl-int/lit8 v0, v22, 0xf

    const/high16 v24, 0x70000

    and-int v0, v0, v24

    or-int v7, v23, v0

    const/16 v8, 0x1d

    const/4 v0, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object/from16 v5, p0

    invoke-static/range {v0 .. v8}, Lk80/i;->d(ZLcom/whoop/design/util/TextResource;Lg1/u0;Li2/a1;Lf0/t;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    const-wide/high16 v0, 0x3ff8000000000000L    # 1.5

    double-to-float v0, v0

    invoke-static {v0, v15, v14, v6}, Ld;->w(FFLb2/t;Lp1/q;)V

    sget v0, Lx60/b;->b0:I

    invoke-static {v6, v0}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    sget-object v0, Lg1/v0;->a:Ll0/l1;

    move v0, v11

    move v2, v12

    sget-wide v11, Li2/x;->m:J

    sget-object v3, Lx81/d;->a:Lx81/d;

    sget v4, Lx81/d;->b:I

    invoke-virtual {v3, v6, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->y()J

    move-result-wide v7

    invoke-virtual {v3, v6, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->X0()J

    move-result-wide v18

    invoke-virtual {v3, v6, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->W0()J

    move-result-wide v20

    move v5, v15

    move-wide/from16 v15, v20

    const/16 v13, 0x12

    const/16 v20, 0x6

    const/16 v21, 0x0

    move/from16 v25, v13

    move-wide/from16 v17, v18

    move-object/from16 v19, v6

    move v6, v2

    const/16 v2, 0x10

    move-wide/from16 v37, v7

    move-object v8, v14

    move-wide/from16 v13, v37

    const/4 v7, 0x1

    invoke-static/range {v11 .. v21}, Lg1/v0;->a(JJJJLandroidx/compose/runtime/Composer;II)Lg1/m1;

    move-result-object v11

    move-object/from16 v12, v19

    const-wide/high16 v13, 0x3fe0000000000000L    # 0.5

    double-to-float v13, v13

    mul-float/2addr v13, v0

    invoke-virtual {v3, v12, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->X0()J

    move-result-wide v14

    invoke-static {v13, v14, v15}, Lhg3/i;->a(FJ)Lf0/t;

    move-result-object v0

    shl-int/lit8 v13, v22, 0xc

    and-int v13, v13, v24

    or-int v13, v23, v13

    move-object v14, v8

    const/16 v8, 0x9

    move v15, v4

    move-object v4, v0

    const/4 v0, 0x0

    move-object/from16 v16, v3

    const/4 v3, 0x0

    move-object v2, v11

    move v11, v5

    move-object v5, v9

    move v9, v7

    move v7, v13

    move-object v13, v14

    move v14, v6

    move-object v6, v12

    move-object/from16 v12, v16

    invoke-static/range {v0 .. v8}, Lk80/i;->d(ZLcom/whoop/design/util/TextResource;Lg1/u0;Li2/a1;Lf0/t;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    int-to-float v0, v14

    invoke-static {v0, v11, v13, v6}, Ld;->w(FFLb2/t;Lp1/q;)V

    sget v0, Lx60/b;->a0:I

    invoke-static {v6, v0}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v12, v6, v15}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->b()Lb91/a;

    move-result-object v31

    invoke-virtual {v12, v6, v15}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->c1()J

    move-result-wide v0

    new-instance v2, Lw3/k;

    invoke-direct {v2, v14}, Lw3/k;-><init>(I)V

    sget v3, Lb91/a;->d:I

    shl-int/lit8 v35, v3, 0x12

    const v36, 0x2fdfa

    const/4 v12, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const-wide/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v32, 0x0

    const/16 v34, 0x0

    move-wide v13, v0

    move-object/from16 v23, v2

    move-object/from16 v33, v6

    const/16 v2, 0x10

    invoke-static/range {v11 .. v36}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    invoke-virtual {v6, v9}, Lp1/q;->q(Z)V

    invoke-virtual {v6, v9}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_c
    move-object v5, v9

    const/16 v2, 0x10

    invoke-virtual {v6}, Lp1/q;->X()V

    :goto_6
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_d

    new-instance v1, La11/j;

    move-object/from16 v3, p0

    invoke-direct {v1, v3, v5, v10, v2}, La11/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_d
    return-void
.end method

.method private static final d(Lk2/c;)Ll83/a0;
    .locals 10

    const-string v1, "$this$drawWithContent"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Li2/t;->b:Li2/s;

    const v1, 0x12171a

    invoke-static {v1}, Li2/w0;->c(I)J

    move-result-wide v3

    new-instance v1, Li2/x;

    invoke-direct {v1, v3, v4}, Li2/x;-><init>(J)V

    const-wide v3, 0xff101518L

    invoke-static {v3, v4}, Li2/w0;->e(J)J

    move-result-wide v5

    new-instance v7, Li2/x;

    invoke-direct {v7, v5, v6}, Li2/x;-><init>(J)V

    invoke-static {v3, v4}, Li2/w0;->e(J)J

    move-result-wide v3

    new-instance v5, Li2/x;

    invoke-direct {v5, v3, v4}, Li2/x;-><init>(J)V

    filled-new-array {v1, v7, v5}, [Li2/x;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v4, v1

    const/high16 v1, 0x7f800000    # Float.POSITIVE_INFINITY

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v6, v1

    const/16 v1, 0x20

    shl-long/2addr v4, v1

    const-wide v8, 0xffffffffL

    and-long/2addr v6, v8

    or-long/2addr v6, v4

    const/16 v8, 0xa

    const-wide/16 v4, 0x0

    invoke-static/range {v2 .. v8}, Li2/s;->d(Li2/s;Ljava/util/List;JJI)Li2/k0;

    move-result-object v1

    const/4 v8, 0x0

    const/16 v9, 0x7e

    const-wide/16 v2, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v9}, Lk2/e;->u(Lk2/e;Li2/t;JJFLk2/f;II)V

    move-object v0, p0

    check-cast v0, La3/p0;

    invoke-virtual {v0}, La3/p0;->a()V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final e(Lc93/a;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lt90/b;->c(Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
