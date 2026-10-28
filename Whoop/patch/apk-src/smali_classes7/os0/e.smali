.class public abstract Los0/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0005\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a\u001f\u0010\u0008\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0003\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Lyg2/f;",
        "state",
        "Ll83/a0;",
        "e",
        "(Lyg2/f;Landroidx/compose/runtime/Composer;I)V",
        "",
        "chargePercent",
        "color",
        "c",
        "(IILandroidx/compose/runtime/Composer;I)V",
        "connectivity-common-ui_release"
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
.method public static synthetic a(IIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Los0/e;->d(IIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lyg2/f;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Los0/e;->f(Lyg2/f;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final c(IILandroidx/compose/runtime/Composer;I)V
    .locals 11

    move-object v7, p2

    check-cast v7, Lp1/q;

    const p2, -0x6041da95

    invoke-virtual {v7, p2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p2, p3, 0x6

    const/4 v0, 0x4

    const/4 v1, 0x2

    if-nez p2, :cond_1

    invoke-virtual {v7, p0}, Lp1/q;->e(I)Z

    move-result p2

    if-eqz p2, :cond_0

    move p2, v0

    goto :goto_0

    :cond_0
    move p2, v1

    :goto_0
    or-int/2addr p2, p3

    goto :goto_1

    :cond_1
    move p2, p3

    :goto_1
    and-int/lit8 v2, p3, 0x30

    if-nez v2, :cond_3

    invoke-virtual {v7, p1}, Lp1/q;->e(I)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr p2, v2

    :cond_3
    and-int/lit8 v2, p2, 0x13

    const/16 v3, 0x12

    const/4 v4, 0x0

    const/4 v10, 0x1

    if-eq v2, v3, :cond_4

    move v2, v10

    goto :goto_3

    :cond_4
    move v2, v4

    :goto_3
    and-int/2addr p2, v10

    invoke-virtual {v7, p2, v2}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_8

    int-to-float p2, v0

    mul-float v0, p2, p2

    sget-object v2, Lb2/t;->w:Lb2/t;

    invoke-static {v0, v2}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v3, Lb2/e;->w:Lb2/m;

    invoke-static {v3, v4}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v3

    iget-wide v5, v7, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v7, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v9, v7, Lp1/q;->S:Z

    if-eqz v9, :cond_5

    invoke-virtual {v7, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_5
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_4
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v7, v8, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v7, v3, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v6, v7, Lp1/q;->S:Z

    if-nez v6, :cond_6

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_7

    :cond_6
    invoke-static {v5, v7, v5, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_7
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v7, v3, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    int-to-float v0, v10

    mul-float/2addr v0, p2

    const/4 v3, 0x0

    invoke-static {v2, v3, v0, v10}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-static {v5, v0}, Landroidx/compose/foundation/layout/d;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    int-to-float v6, p0

    const/high16 v8, 0x42c80000    # 100.0f

    div-float/2addr v6, v8

    invoke-static {v6, v3, v5}, Le93/b;->m(FFF)F

    move-result v5

    const-wide v8, 0x4007333333333333L    # 2.9

    double-to-float v6, v8

    mul-float/2addr v6, p2

    mul-float/2addr v6, v5

    invoke-static {v6, v0}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const-wide v5, 0x3fd999999999999aL    # 0.4

    double-to-float v5, v5

    mul-float/2addr v5, p2

    invoke-static {v0, v5, v3, v1}, Landroidx/compose/foundation/layout/a;->n(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object p2

    invoke-static {v7, p1}, Lug/m;->q(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v0

    const/high16 v3, 0x3f000000    # 0.5f

    invoke-static {v3, v0, v1}, Li2/x;->c(FJ)J

    move-result-wide v0

    sget-object v3, Li2/w0;->a:Li2/v0;

    invoke-static {p2, v0, v1, v3}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object p2

    invoke-static {p2, v7, v4}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v7, p1}, Lug/m;->q(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v0

    new-instance v6, Li2/p;

    const/4 p2, 0x5

    invoke-direct {v6, v0, v1, p2}, Li2/p;-><init>(JI)V

    sget p2, Los0/f;->d:I

    invoke-static {p2, v7, v4}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v0

    const/16 v8, 0x1b0

    const/16 v9, 0x38

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v9}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v7, v10}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_8
    invoke-virtual {v7}, Lp1/q;->X()V

    :goto_5
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_9

    new-instance v0, Lid2/q;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p1, p3, v1}, Lid2/q;-><init>(IIII)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_9
    return-void
.end method

.method private static final d(IIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Los0/e;->c(IILandroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final e(Lyg2/f;Landroidx/compose/runtime/Composer;I)V
    .locals 37

    move-object/from16 v0, p0

    const-string v2, "state"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p1

    check-cast v10, Lp1/q;

    const v2, -0x1a81ea4b

    invoke-virtual {v10, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, p2, 0x6

    const/4 v3, 0x2

    if-nez v2, :cond_1

    invoke-virtual {v10, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    or-int v2, p2, v2

    goto :goto_1

    :cond_1
    move/from16 v2, p2

    :goto_1
    and-int/lit8 v5, v2, 0x3

    const/4 v7, 0x1

    if-eq v5, v3, :cond_2

    move v3, v7

    goto :goto_2

    :cond_2
    const/4 v3, 0x0

    :goto_2
    and-int/2addr v2, v7

    invoke-virtual {v10, v2, v3}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_d

    sget-object v2, Lb2/e;->K:Lb2/l;

    sget-object v3, Ll0/m;->a:Ll0/e;

    const/16 v5, 0x30

    invoke-static {v3, v2, v10, v5}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v8

    iget-wide v11, v10, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    sget-object v12, Lb2/t;->w:Lb2/t;

    invoke-static {v10, v12}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    sget-object v14, La3/l;->a:La3/k;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v15, v10, Lp1/q;->S:Z

    if-eqz v15, :cond_3

    invoke-virtual {v10, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_3
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_3
    sget-object v15, La3/k;->g:La3/i;

    invoke-static {v10, v15, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->f:La3/i;

    invoke-static {v10, v8, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->j:La3/i;

    iget-boolean v4, v10, Lp1/q;->S:Z

    if-nez v4, :cond_4

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v4, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_5

    :cond_4
    invoke-static {v9, v10, v9, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_5
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v10, v4, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, Lb2/e;->O:Lb2/k;

    sget-object v9, Ll0/m;->c:Ll0/g;

    invoke-static {v9, v7, v10, v5}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v7

    iget-wide v5, v10, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v10, v12}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v13, v10, Lp1/q;->S:Z

    if-eqz v13, :cond_6

    invoke-virtual {v10, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_6
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_4
    invoke-static {v10, v15, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v10, v8, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v6, v10, Lp1/q;->S:Z

    if-nez v6, :cond_7

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_8

    :cond_7
    invoke-static {v5, v10, v5, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_8
    invoke-static {v10, v4, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lyg2/f;->d()Z

    move-result v5

    if-eqz v5, :cond_c

    const v5, -0x674edfd0

    invoke-virtual {v10, v5}, Lp1/q;->e0(I)V

    const/16 v13, 0x30

    invoke-static {v3, v2, v10, v13}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v2

    iget-wide v5, v10, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v10, v12}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v7, v10, Lp1/q;->S:Z

    if-eqz v7, :cond_9

    invoke-virtual {v10, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_9
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_5
    invoke-static {v10, v15, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v10, v8, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v10, Lp1/q;->S:Z

    if-nez v2, :cond_a

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_b

    :cond_a
    invoke-static {v3, v10, v3, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    invoke-static {v10, v4, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lyg2/f;->a()I

    move-result v2

    invoke-virtual {v0}, Lyg2/f;->c()I

    move-result v3

    const/4 v9, 0x0

    invoke-static {v2, v3, v10, v9}, Los0/e;->c(IILandroidx/compose/runtime/Composer;I)V

    const/4 v2, 0x1

    int-to-float v3, v2

    const/4 v4, 0x4

    int-to-float v5, v4

    mul-float/2addr v3, v5

    invoke-static {v3, v12}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v10, v3}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v0}, Lyg2/f;->b()Ljava/lang/String;

    move-result-object v3

    sget-object v6, Lx81/d;->a:Lx81/d;

    sget v7, Lx81/d;->b:I

    invoke-virtual {v6, v10, v7}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v8

    invoke-virtual {v8}, Lb91/d;->F()Lb91/a;

    move-result-object v23

    invoke-virtual {v6, v10, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->y()J

    move-result-wide v13

    sget v8, Lb91/a;->d:I

    shl-int/lit8 v27, v8, 0x12

    const v28, 0x2fffa

    move v8, v4

    const/4 v4, 0x0

    move v11, v7

    move v15, v8

    const-wide/16 v7, 0x0

    move/from16 v17, v9

    const/4 v9, 0x0

    move-object/from16 v25, v10

    const/4 v10, 0x0

    move/from16 v16, v11

    const/4 v11, 0x0

    move-object/from16 v18, v6

    move-object/from16 v19, v12

    move-wide/from16 v35, v13

    move v14, v5

    move-wide/from16 v5, v35

    const-wide/16 v12, 0x0

    move/from16 v20, v14

    const/4 v14, 0x0

    move/from16 v21, v15

    const/4 v15, 0x0

    move/from16 v22, v16

    move/from16 v24, v17

    const-wide/16 v16, 0x0

    move-object/from16 v26, v18

    const/16 v18, 0x0

    move-object/from16 v29, v19

    const/16 v19, 0x0

    move/from16 v30, v20

    const/16 v20, 0x0

    move/from16 v31, v21

    const/16 v21, 0x0

    move/from16 v32, v22

    const/16 v22, 0x0

    move/from16 v33, v24

    const/16 v24, 0x0

    move-object/from16 v34, v26

    const/16 v26, 0x0

    move v1, v2

    move-object/from16 v0, v29

    move-object/from16 v2, v34

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v25

    move/from16 v3, v27

    invoke-virtual {v10, v1}, Lp1/q;->q(Z)V

    const/16 v4, 0x15

    int-to-float v4, v4

    mul-float v4, v4, v30

    invoke-static {v4, v0}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget v5, Los0/h;->j:I

    invoke-static {v10, v5}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    move/from16 v11, v32

    invoke-virtual {v2, v10, v11}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v6

    invoke-virtual {v6}, Lb91/d;->t()Lb91/a;

    move-result-object v23

    invoke-virtual {v2, v10, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->c1()J

    move-result-wide v6

    new-instance v15, Lw3/k;

    const/4 v2, 0x6

    invoke-direct {v15, v2}, Lw3/k;-><init>(I)V

    or-int/lit16 v2, v3, 0x180

    const v28, 0x2edf8

    move-object v3, v5

    move-wide v5, v6

    const-wide/16 v7, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/16 v19, 0x1

    const/16 v26, 0x30

    move/from16 v27, v2

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v25

    const/4 v9, 0x0

    invoke-virtual {v10, v9}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_c
    move-object v0, v12

    const/4 v1, 0x1

    const/4 v9, 0x0

    const v2, -0x6742292d

    invoke-virtual {v10, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v9}, Lp1/q;->q(Z)V

    :goto_6
    invoke-virtual {v10, v1}, Lp1/q;->q(Z)V

    const/16 v2, 0xc

    int-to-float v2, v2

    const/4 v15, 0x4

    int-to-float v3, v15

    mul-float/2addr v2, v3

    invoke-static {v2, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget v0, Los0/f;->c:I

    invoke-static {v0, v10, v9}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v3

    const/16 v11, 0x1b0

    const/16 v12, 0x78

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v3 .. v12}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v10, v1}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_d
    invoke-virtual {v10}, Lp1/q;->X()V

    :goto_7
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_e

    new-instance v1, Los0/d;

    const/4 v2, 0x0

    move-object/from16 v3, p0

    move/from16 v4, p2

    invoke-direct {v1, v3, v4, v2}, Los0/d;-><init>(Ljava/lang/Object;II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_e
    return-void
.end method

.method private static final f(Lyg2/f;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Los0/e;->e(Lyg2/f;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
