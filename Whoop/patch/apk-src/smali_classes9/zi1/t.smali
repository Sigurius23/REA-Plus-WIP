.class public abstract Lzi1/t;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a#\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002H\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lcom/whoop/design/util/TextResource;",
        "errorMessage",
        "Ll83/a0;",
        "c",
        "(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;II)V",
        "kennel_release"
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
.method public static synthetic a(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lzi1/t;->e(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(FFJLk2/e;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lzi1/t;->d(FFJLk2/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;II)V
    .locals 33

    move-object/from16 v0, p1

    move-object/from16 v5, p2

    check-cast v5, Lp1/q;

    const v1, 0x1b59d72e

    invoke-virtual {v5, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p4, 0x1

    const/4 v2, 0x4

    const/4 v8, 0x2

    if-eqz v1, :cond_0

    or-int/lit8 v3, p3, 0x6

    move v4, v3

    move-object/from16 v3, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, p3, 0x6

    if-nez v3, :cond_2

    move-object/from16 v3, p0

    invoke-virtual {v5, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    move v4, v2

    goto :goto_0

    :cond_1
    move v4, v8

    :goto_0
    or-int v4, p3, v4

    goto :goto_1

    :cond_2
    move-object/from16 v3, p0

    move/from16 v4, p3

    :goto_1
    and-int/lit8 v6, p3, 0x30

    if-nez v6, :cond_5

    and-int/lit8 v6, p4, 0x2

    if-nez v6, :cond_4

    and-int/lit8 v6, p3, 0x40

    if-nez v6, :cond_3

    invoke-virtual {v5, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    goto :goto_2

    :cond_3
    invoke-virtual {v5, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    :goto_2
    if-eqz v6, :cond_4

    const/16 v6, 0x20

    goto :goto_3

    :cond_4
    const/16 v6, 0x10

    :goto_3
    or-int/2addr v4, v6

    :cond_5
    and-int/lit8 v6, v4, 0x13

    const/16 v9, 0x12

    if-eq v6, v9, :cond_6

    const/4 v6, 0x1

    goto :goto_4

    :cond_6
    const/4 v6, 0x0

    :goto_4
    and-int/lit8 v7, v4, 0x1

    invoke-virtual {v5, v7, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_10

    invoke-virtual {v5}, Lp1/q;->Z()V

    and-int/lit8 v6, p3, 0x1

    sget-object v11, Lb2/t;->w:Lb2/t;

    if-eqz v6, :cond_9

    invoke-virtual {v5}, Lp1/q;->C()Z

    move-result v6

    if-eqz v6, :cond_7

    goto :goto_6

    :cond_7
    invoke-virtual {v5}, Lp1/q;->X()V

    and-int/lit8 v1, p4, 0x2

    if-eqz v1, :cond_8

    :goto_5
    and-int/lit8 v4, v4, -0x71

    :cond_8
    move-object v13, v0

    move-object v12, v3

    move v14, v4

    goto :goto_7

    :cond_9
    :goto_6
    if-eqz v1, :cond_a

    move-object v3, v11

    :cond_a
    and-int/lit8 v1, p4, 0x2

    if-eqz v1, :cond_8

    sget v0, Lti1/d;->h:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v0

    goto :goto_5

    :goto_7
    invoke-virtual {v5}, Lp1/q;->r()V

    sget-object v0, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {v5, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ly3/c;

    int-to-float v2, v2

    mul-float/2addr v2, v2

    invoke-interface {v1, v2}, Ly3/c;->q0(F)F

    move-result v1

    invoke-virtual {v5, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly3/c;

    const-wide/high16 v2, 0x3ff8000000000000L    # 1.5

    double-to-float v2, v2

    invoke-interface {v0, v2}, Ly3/c;->q0(F)F

    move-result v0

    sget-object v2, Lx81/d;->a:Lx81/d;

    sget v3, Lx81/d;->b:I

    invoke-virtual {v2, v5, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->W0()J

    move-result-wide v6

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v4, v12}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v5, v0}, Lp1/q;->d(F)Z

    move-result v15

    invoke-virtual {v5, v1}, Lp1/q;->d(F)Z

    move-result v16

    or-int v15, v15, v16

    invoke-virtual {v5, v6, v7}, Lp1/q;->f(J)Z

    move-result v16

    or-int v15, v15, v16

    move/from16 p2, v9

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v15, :cond_b

    sget-object v15, Lp1/l;->a:Lp1/v0;

    if-ne v9, v15, :cond_c

    :cond_b
    new-instance v15, Le61/l;

    const/16 v20, 0xb

    move/from16 v16, v0

    move/from16 v17, v1

    move-wide/from16 v18, v6

    invoke-direct/range {v15 .. v20}, Le61/l;-><init>(FFJI)V

    invoke-virtual {v5, v15}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v9, v15

    :cond_c
    check-cast v9, Lkotlin/jvm/functions/Function1;

    invoke-static {v4, v9}, Landroidx/compose/ui/draw/a;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v9, 0x3

    int-to-float v1, v9

    const/16 v4, 0x8

    int-to-float v15, v4

    mul-float/2addr v1, v15

    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v1, Lb2/e;->N:Lb2/k;

    sget-object v4, Ll0/m;->c:Ll0/g;

    const/16 v6, 0x30

    invoke-static {v4, v1, v5, v6}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    iget-wide v6, v5, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v5, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v10, v5, Lp1/q;->S:Z

    if-eqz v10, :cond_d

    invoke-virtual {v5, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_d
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_8
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v5, v7, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v5, v1, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v6, v5, Lp1/q;->S:Z

    if-nez v6, :cond_e

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_f

    :cond_e
    invoke-static {v4, v5, v4, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_f
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v5, v1, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, Lhy0/a2;->i:Lhy0/a2$a;

    const/4 v1, 0x6

    invoke-virtual {v0, v5, v1}, Lhy0/a2$a;->c(Landroidx/compose/runtime/Composer;I)Lhy0/a2;

    move-result-object v17

    invoke-virtual {v2}, Lx81/d;->d()Lgz0/o0;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/o0;->o()Lgz0/i0;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/i0;->w()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v22

    const/16 v31, 0xfb

    const/16 v32, 0x0

    const-wide/16 v18, 0x0

    const-wide/16 v20, 0x0

    const-wide/16 v23, 0x0

    const-wide/16 v25, 0x0

    const-wide/16 v27, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    invoke-static/range {v17 .. v32}, Lhy0/a2;->b(Lhy0/a2;JJLjava/lang/Integer;JJJZZILjava/lang/Object;)Lhy0/a2;

    move-result-object v0

    sget v6, Lhy0/a2;->j:I

    const/16 v7, 0x1e

    const/4 v1, 0x0

    move-object v4, v2

    const/4 v2, 0x0

    move v10, v3

    const/4 v3, 0x0

    move-object/from16 v17, v4

    const/4 v4, 0x0

    move/from16 p0, v9

    move v9, v10

    move-object/from16 v10, v17

    invoke-static/range {v0 .. v7}, Lhy0/v1;->b(Lhy0/a2;Li2/a1;FFFLandroidx/compose/runtime/Composer;II)V

    int-to-float v0, v8

    invoke-static {v0, v15, v11, v5}, Ld;->w(FFLb2/t;Lp1/q;)V

    sget v0, Lcom/whoop/design/util/TextResource;->$stable:I

    shr-int/lit8 v1, v14, 0x3

    and-int/lit8 v1, v1, 0xe

    or-int/2addr v0, v1

    invoke-static {v13, v5, v0}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v5, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->b1()J

    move-result-wide v2

    invoke-virtual {v10, v5, v9}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v1

    invoke-virtual {v1}, Lb91/d;->a()Lb91/a;

    move-result-object v20

    move-object v1, v12

    new-instance v12, Lw3/k;

    move/from16 v4, p0

    invoke-direct {v12, v4}, Lw3/k;-><init>(I)V

    sget v4, Lb91/a;->d:I

    shl-int/lit8 v24, v4, 0x12

    const v25, 0x2fdf8

    move-object/from16 v22, v5

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    move-object v14, v1

    move-object v1, v11

    const/4 v11, 0x0

    move-object/from16 v17, v13

    move-object v15, v14

    const-wide/16 v13, 0x0

    move-object/from16 v18, v15

    const/4 v15, 0x0

    const/16 v19, 0x1

    const/16 v16, 0x0

    move-object/from16 v21, v17

    const/16 v17, 0x0

    move-object/from16 v23, v18

    const/16 v18, 0x0

    move/from16 v26, v19

    const/16 v19, 0x0

    move-object/from16 v27, v21

    const/16 v21, 0x0

    move-object/from16 v28, v23

    const/16 v23, 0x30

    invoke-static/range {v0 .. v25}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v22

    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Lp1/q;->q(Z)V

    move-object/from16 v8, v27

    move-object/from16 v7, v28

    goto :goto_9

    :cond_10
    invoke-virtual {v5}, Lp1/q;->X()V

    move-object v8, v0

    move-object v7, v3

    :goto_9
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_11

    new-instance v6, Lc41/p5;

    const/4 v11, 0x2

    move/from16 v9, p3

    move/from16 v10, p4

    invoke-direct/range {v6 .. v11}, Lc41/p5;-><init>(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;III)V

    iput-object v6, v0, Lp1/v1;->d:Lc93/m;

    :cond_11
    return-void
.end method

.method private static final d(FFJLk2/e;)Ll83/a0;
    .locals 13

    const-string v0, "$this$drawBehind"

    move-object/from16 v1, p4

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lk2/i;

    const/4 v0, 0x2

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    new-instance v7, Li2/k;

    new-instance v3, Landroid/graphics/DashPathEffect;

    const/4 v4, 0x0

    invoke-direct {v3, v0, v4}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    invoke-direct {v7, v3}, Li2/k;-><init>(Landroid/graphics/PathEffect;)V

    const/16 v8, 0xe

    const/4 v5, 0x0

    const/4 v6, 0x0

    move v3, p0

    invoke-direct/range {v2 .. v8}, Lk2/i;-><init>(FFIILi2/t0;I)V

    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p0

    int-to-long v3, p0

    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p0

    int-to-long p0, p0

    const/16 v0, 0x20

    shl-long/2addr v3, v0

    const-wide v5, 0xffffffffL

    and-long/2addr p0, v5

    or-long v8, v3, p0

    const/4 v11, 0x0

    const/16 v12, 0xe6

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    move-object v10, v2

    move-wide v2, p2

    invoke-static/range {v1 .. v12}, Lk2/e;->D(Lk2/e;JJJJLk2/f;FI)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0

    :array_0
    .array-data 4
        0x41200000    # 10.0f
        0x41200000    # 10.0f
    .end array-data
.end method

.method private static final e(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lzi1/t;->c(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
