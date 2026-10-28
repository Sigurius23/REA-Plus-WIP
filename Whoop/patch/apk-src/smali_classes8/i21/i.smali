.class public abstract Li21/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\u001a7\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a+\u0010\u0010\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Li21/j;",
        "impactCardState",
        "Lkotlin/Function1;",
        "Li21/a;",
        "Ll83/a0;",
        "onViewEvent",
        "i",
        "(Landroidx/compose/ui/Modifier;Li21/j;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Lcom/whoop/design/util/TextResource;",
        "countText",
        "Li2/x;",
        "countColor",
        "",
        "icon",
        "g",
        "(Lcom/whoop/design/util/TextResource;JILandroidx/compose/runtime/Composer;II)V",
        "design_release"
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
.method public static synthetic a(Landroidx/compose/ui/Modifier;Li21/j;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Li21/i;->n(Landroidx/compose/ui/Modifier;Li21/j;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Li21/j;Ljava/util/UUID;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Li21/i;->k(Lkotlin/jvm/functions/Function1;Li21/j;Ljava/util/UUID;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c()Ll83/a0;
    .locals 1

    invoke-static {}, Li21/i;->m()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic d(Li21/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Li21/i;->j(Li21/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lcom/whoop/design/util/TextResource;JIIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Li21/i;->h(Lcom/whoop/design/util/TextResource;JIIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lkotlin/jvm/functions/Function1;Li21/j;Ljava/util/UUID;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Li21/i;->l(Lkotlin/jvm/functions/Function1;Li21/j;Ljava/util/UUID;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final g(Lcom/whoop/design/util/TextResource;JILandroidx/compose/runtime/Composer;II)V
    .locals 32

    move/from16 v4, p3

    move/from16 v5, p5

    move-object/from16 v11, p4

    check-cast v11, Lp1/q;

    const v0, -0x6d2b74da

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v5, 0x6

    if-nez v0, :cond_2

    and-int/lit8 v0, p6, 0x1

    if-nez v0, :cond_0

    move-object/from16 v0, p0

    invoke-virtual {v11, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    move-object/from16 v0, p0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v5

    goto :goto_1

    :cond_2
    move-object/from16 v0, p0

    move v3, v5

    :goto_1
    and-int/lit8 v6, v5, 0x30

    if-nez v6, :cond_5

    and-int/lit8 v6, p6, 0x2

    if-nez v6, :cond_3

    move-wide/from16 v6, p1

    invoke-virtual {v11, v6, v7}, Lp1/q;->f(J)Z

    move-result v8

    if-eqz v8, :cond_4

    const/16 v8, 0x20

    goto :goto_2

    :cond_3
    move-wide/from16 v6, p1

    :cond_4
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v3, v8

    goto :goto_3

    :cond_5
    move-wide/from16 v6, p1

    :goto_3
    and-int/lit16 v8, v5, 0x180

    if-nez v8, :cond_7

    invoke-virtual {v11, v4}, Lp1/q;->e(I)Z

    move-result v8

    if-eqz v8, :cond_6

    const/16 v8, 0x100

    goto :goto_4

    :cond_6
    const/16 v8, 0x80

    :goto_4
    or-int/2addr v3, v8

    :cond_7
    and-int/lit16 v8, v3, 0x93

    const/16 v9, 0x92

    if-eq v8, v9, :cond_8

    const/4 v8, 0x1

    goto :goto_5

    :cond_8
    const/4 v8, 0x0

    :goto_5
    and-int/lit8 v9, v3, 0x1

    invoke-virtual {v11, v9, v8}, Lp1/q;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_14

    invoke-virtual {v11}, Lp1/q;->Z()V

    and-int/lit8 v8, v5, 0x1

    const/4 v15, 0x6

    if-eqz v8, :cond_c

    invoke-virtual {v11}, Lp1/q;->C()Z

    move-result v8

    if-eqz v8, :cond_9

    goto :goto_7

    :cond_9
    invoke-virtual {v11}, Lp1/q;->X()V

    and-int/lit8 v8, p6, 0x1

    if-eqz v8, :cond_a

    and-int/lit8 v3, v3, -0xf

    :cond_a
    and-int/lit8 v8, p6, 0x2

    if-eqz v8, :cond_b

    :goto_6
    and-int/lit8 v3, v3, -0x71

    :cond_b
    move-wide v8, v6

    goto :goto_8

    :cond_c
    :goto_7
    and-int/lit8 v8, p6, 0x1

    if-eqz v8, :cond_d

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    and-int/lit8 v3, v3, -0xf

    :cond_d
    and-int/lit8 v8, p6, 0x2

    if-eqz v8, :cond_b

    sget-object v6, Lx81/d;->a:Lx81/d;

    invoke-virtual {v6, v11, v15}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->b1()J

    move-result-wide v6

    goto :goto_6

    :goto_8
    invoke-virtual {v11}, Lp1/q;->r()V

    sget-object v6, Lb2/e;->K:Lb2/l;

    sget-object v7, Ll0/m;->a:Ll0/e;

    const/16 v12, 0x30

    invoke-static {v7, v6, v11, v12}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v6

    iget-wide v12, v11, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    sget-object v13, Lb2/t;->w:Lb2/t;

    move/from16 p4, v15

    invoke-static {v11, v13}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v15

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v10, v11, Lp1/q;->S:Z

    if-eqz v10, :cond_e

    invoke-virtual {v11, v2}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_e
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_9
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v11, v10, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v11, v6, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v12, La3/k;->j:La3/i;

    iget-boolean v14, v11, Lp1/q;->S:Z

    if-nez v14, :cond_f

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v14, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    :cond_f
    invoke-static {v7, v11, v7, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_10
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v11, v1, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v7, 0x4

    int-to-float v7, v7

    mul-float v14, v7, v7

    invoke-static {v14, v13}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    move/from16 p0, v3

    const/4 v15, 0x1

    int-to-float v3, v15

    mul-float v15, v3, v7

    invoke-static {v15}, Lt0/j;->e(F)Lt0/i;

    move-result-object v5

    invoke-static {v14, v3, v8, v9, v5}, Lge3/g;->h(Landroidx/compose/ui/Modifier;FJLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    move v5, v7

    move-wide/from16 v19, v8

    sget-wide v7, Li2/x;->m:J

    sget-object v9, Li2/w0;->a:Li2/v0;

    invoke-static {v3, v7, v8, v9}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v7, Lb2/e;->E:Lb2/m;

    const/4 v8, 0x0

    invoke-static {v7, v8}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v7

    iget-wide v8, v11, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v11, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v14, v11, Lp1/q;->S:Z

    if-eqz v14, :cond_11

    invoke-virtual {v11, v2}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_11
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_a
    invoke-static {v11, v10, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v11, v6, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v11, Lp1/q;->S:Z

    if-nez v2, :cond_12

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v2, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_13

    :cond_12
    invoke-static {v8, v11, v8, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_13
    invoke-static {v11, v1, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    shr-int/lit8 v1, p0, 0x3

    and-int/lit8 v1, v1, 0x70

    or-int/lit8 v1, v1, 0x6

    invoke-static {v4, v11, v1}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v6

    const/4 v1, 0x2

    int-to-float v1, v1

    mul-float/2addr v1, v5

    invoke-static {v1, v13}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    shl-int/lit8 v1, p0, 0x6

    and-int/lit16 v1, v1, 0x1c00

    or-int/lit16 v12, v1, 0x1b0

    move-object v1, v13

    const/4 v13, 0x0

    const-string v7, ""

    move-wide/from16 v9, v19

    invoke-static/range {v6 .. v13}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    const/4 v2, 0x1

    invoke-static {v11, v2, v1, v15, v11}, Lhc3/i;->r(Lp1/q;ZLb2/t;FLp1/q;)V

    and-int/lit8 v1, p0, 0xe

    invoke-static {v0, v11, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    sget-object v1, Lx81/d;->a:Lx81/d;

    move/from16 v3, p4

    invoke-virtual {v1, v11, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v1

    invoke-virtual {v1}, Lb91/d;->F()Lb91/a;

    move-result-object v26

    shl-int/lit8 v1, p0, 0x3

    and-int/lit16 v1, v1, 0x380

    const/16 v30, 0x0

    const v31, 0x2fffa

    const/4 v7, 0x0

    move-object/from16 v28, v11

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-wide/from16 v8, v19

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x0

    move/from16 v29, v1

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-wide v9, v8

    move-object/from16 v11, v28

    invoke-virtual {v11, v2}, Lp1/q;->q(Z)V

    move-wide v2, v9

    :goto_b
    move-object v1, v0

    goto :goto_c

    :cond_14
    invoke-virtual {v11}, Lp1/q;->X()V

    move-wide v2, v6

    goto :goto_b

    :goto_c
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_15

    new-instance v0, Li21/h;

    move/from16 v5, p5

    move/from16 v6, p6

    invoke-direct/range {v0 .. v6}, Li21/h;-><init>(Lcom/whoop/design/util/TextResource;JIII)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_15
    return-void
.end method

.method private static final h(Lcom/whoop/design/util/TextResource;JIIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-wide v1, p1

    move v3, p3

    move v6, p5

    move-object v4, p6

    invoke-static/range {v0 .. v6}, Li21/i;->g(Lcom/whoop/design/util/TextResource;JILandroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final i(Landroidx/compose/ui/Modifier;Li21/j;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Li21/j;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v5, p1

    move/from16 v1, p4

    const-string v0, "impactCardState"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v13, p3

    check-cast v13, Lp1/q;

    const v0, -0x553d94d6

    invoke-virtual {v13, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p5, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v2, v1, 0x6

    move v3, v2

    move-object/from16 v2, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v2, v1, 0x6

    if-nez v2, :cond_2

    move-object/from16 v2, p0

    invoke-virtual {v13, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v1

    goto :goto_1

    :cond_2
    move-object/from16 v2, p0

    move v3, v1

    :goto_1
    and-int/lit8 v4, v1, 0x30

    const/16 v6, 0x20

    if-nez v4, :cond_5

    and-int/lit8 v4, v1, 0x40

    if-nez v4, :cond_3

    invoke-virtual {v13, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    goto :goto_2

    :cond_3
    invoke-virtual {v13, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    :goto_2
    if-eqz v4, :cond_4

    move v4, v6

    goto :goto_3

    :cond_4
    const/16 v4, 0x10

    :goto_3
    or-int/2addr v3, v4

    :cond_5
    and-int/lit8 v4, p5, 0x4

    const/16 v7, 0x100

    if-eqz v4, :cond_7

    or-int/lit16 v3, v3, 0x180

    :cond_6
    move-object/from16 v8, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v8, v1, 0x180

    if-nez v8, :cond_6

    move-object/from16 v8, p2

    invoke-virtual {v13, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_8

    move v9, v7

    goto :goto_4

    :cond_8
    const/16 v9, 0x80

    :goto_4
    or-int/2addr v3, v9

    :goto_5
    and-int/lit16 v9, v3, 0x93

    const/16 v10, 0x92

    const/4 v11, 0x0

    if-eq v9, v10, :cond_9

    const/4 v9, 0x1

    goto :goto_6

    :cond_9
    move v9, v11

    :goto_6
    and-int/lit8 v10, v3, 0x1

    invoke-virtual {v13, v10, v9}, Lp1/q;->U(IZ)Z

    move-result v9

    if-eqz v9, :cond_20

    sget-object v9, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_a

    move-object v2, v9

    :cond_a
    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-eqz v4, :cond_c

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v0, :cond_b

    new-instance v4, Lhu1/g;

    const/16 v8, 0x10

    invoke-direct {v4, v8}, Lhu1/g;-><init>(I)V

    invoke-virtual {v13, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v4, Lkotlin/jvm/functions/Function1;

    goto :goto_7

    :cond_c
    move-object v4, v8

    :goto_7
    invoke-virtual {v5}, Li21/j;->b()Li21/l;

    move-result-object v8

    instance-of v10, v8, Li21/l$a;

    if-eqz v10, :cond_12

    const v8, 0x76b87848

    invoke-virtual {v13, v8}, Lp1/q;->e0(I)V

    invoke-virtual {v5}, Li21/j;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-virtual {v5}, Li21/j;->e()Ly81/f;

    move-result-object v9

    invoke-virtual {v9, v13, v11}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v9

    move-object v14, v8

    move-wide v8, v9

    invoke-virtual {v5}, Li21/j;->a()Ly11/r;

    move-result-object v10

    invoke-virtual {v5}, Li21/j;->b()Li21/l;

    move-result-object v15

    check-cast v15, Li21/l$a;

    and-int/lit16 v11, v3, 0x380

    if-ne v11, v7, :cond_d

    const/4 v7, 0x1

    goto :goto_8

    :cond_d
    const/4 v7, 0x0

    :goto_8
    and-int/lit8 v11, v3, 0x70

    if-eq v11, v6, :cond_f

    and-int/lit8 v6, v3, 0x40

    if-eqz v6, :cond_e

    invoke-virtual {v13, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_e

    goto :goto_9

    :cond_e
    const/4 v12, 0x0

    goto :goto_a

    :cond_f
    :goto_9
    const/4 v12, 0x1

    :goto_a
    or-int v6, v7, v12

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v6, :cond_10

    if-ne v7, v0, :cond_11

    :cond_10
    new-instance v7, Li21/g;

    const/4 v0, 0x0

    invoke-direct {v7, v4, v5, v0}, Li21/g;-><init>(Lkotlin/jvm/functions/Function1;Li21/j;I)V

    invoke-virtual {v13, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    move-object v12, v7

    check-cast v12, Lkotlin/jvm/functions/Function1;

    move-object v7, v14

    and-int/lit8 v14, v3, 0xe

    move-object v11, v15

    const/4 v15, 0x0

    move-object v6, v2

    const/4 v2, 0x0

    invoke-static/range {v6 .. v15}, Li21/c;->g(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;JLy11/r;Li21/l$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v10, v6

    invoke-virtual {v13, v2}, Lp1/q;->q(Z)V

    move-object v2, v10

    goto/16 :goto_f

    :cond_12
    move-object v10, v2

    move v2, v11

    instance-of v11, v8, Li21/l$d;

    const/16 v14, 0x8

    const-wide/high16 v6, 0x3ff8000000000000L    # 1.5

    if-eqz v11, :cond_18

    const v8, 0x76c4084c

    invoke-virtual {v13, v8}, Lp1/q;->e0(I)V

    double-to-float v6, v6

    int-to-float v7, v14

    mul-float/2addr v6, v7

    invoke-static {v6, v9}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-interface {v6, v10}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v5}, Li21/j;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-virtual {v5}, Li21/j;->e()Ly81/f;

    move-result-object v8

    invoke-virtual {v8, v13, v2}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v8

    move-object v11, v10

    invoke-virtual {v5}, Li21/j;->a()Ly11/r;

    move-result-object v10

    invoke-virtual {v5}, Li21/j;->b()Li21/l;

    move-result-object v14

    check-cast v14, Li21/l$d;

    and-int/lit16 v15, v3, 0x380

    const/16 v12, 0x100

    if-ne v15, v12, :cond_13

    const/4 v12, 0x1

    goto :goto_b

    :cond_13
    move v12, v2

    :goto_b
    and-int/lit8 v15, v3, 0x70

    const/16 v2, 0x20

    if-eq v15, v2, :cond_15

    and-int/lit8 v2, v3, 0x40

    if-eqz v2, :cond_14

    invoke-virtual {v13, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_14

    goto :goto_c

    :cond_14
    const/16 v16, 0x0

    goto :goto_d

    :cond_15
    :goto_c
    const/16 v16, 0x1

    :goto_d
    or-int v2, v12, v16

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_16

    if-ne v3, v0, :cond_17

    :cond_16
    new-instance v3, Li21/g;

    const/4 v0, 0x1

    invoke-direct {v3, v4, v5, v0}, Li21/g;-><init>(Lkotlin/jvm/functions/Function1;Li21/j;I)V

    invoke-virtual {v13, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_17
    move-object v12, v3

    check-cast v12, Lkotlin/jvm/functions/Function1;

    move-object v2, v11

    move-object v11, v14

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v6 .. v15}, Li21/n;->j(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;JLy11/r;Li21/l$d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    const/4 v0, 0x0

    invoke-virtual {v13, v0}, Lp1/q;->q(Z)V

    goto/16 :goto_f

    :cond_18
    move-object v2, v10

    instance-of v3, v8, Li21/l$e;

    if-eqz v3, :cond_19

    const v0, 0x76cfca72

    invoke-virtual {v13, v0}, Lp1/q;->e0(I)V

    double-to-float v0, v6

    int-to-float v3, v14

    mul-float/2addr v0, v3

    invoke-static {v0, v9}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-interface {v0, v2}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v5}, Li21/j;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-virtual {v5}, Li21/j;->e()Ly81/f;

    move-result-object v0

    const/4 v3, 0x0

    invoke-virtual {v0, v13, v3}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v8

    invoke-virtual {v5}, Li21/j;->a()Ly11/r;

    move-result-object v10

    invoke-virtual {v5}, Li21/j;->b()Li21/l;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Li21/l$e;

    const/4 v14, 0x0

    const/16 v15, 0x20

    const/4 v12, 0x0

    invoke-static/range {v6 .. v15}, Li21/o;->e(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;JLy11/r;Li21/l$e;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v13, v3}, Lp1/q;->q(Z)V

    goto/16 :goto_f

    :cond_19
    instance-of v3, v8, Li21/l$c;

    if-eqz v3, :cond_1b

    const v3, 0x76d73551

    invoke-virtual {v13, v3}, Lp1/q;->e0(I)V

    double-to-float v3, v6

    int-to-float v6, v14

    mul-float/2addr v3, v6

    invoke-static {v3, v9}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-interface {v3, v2}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v5}, Li21/j;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-virtual {v5}, Li21/j;->e()Ly81/f;

    move-result-object v3

    const/4 v8, 0x0

    invoke-virtual {v3, v13, v8}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v9

    move-wide v8, v9

    invoke-virtual {v5}, Li21/j;->a()Ly11/r;

    move-result-object v10

    invoke-virtual {v5}, Li21/j;->b()Li21/l;

    move-result-object v3

    move-object v11, v3

    check-cast v11, Li21/l$c;

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v0, :cond_1a

    new-instance v3, Lhb1/l;

    const/16 v0, 0x1c

    invoke-direct {v3, v0}, Lhb1/l;-><init>(I)V

    invoke-virtual {v13, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1a
    move-object v12, v3

    check-cast v12, Lc93/a;

    const/high16 v14, 0x30000

    const/4 v15, 0x0

    invoke-static/range {v6 .. v15}, Li21/e;->e(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;JLy11/r;Li21/l$c;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    const/4 v0, 0x0

    invoke-virtual {v13, v0}, Lp1/q;->q(Z)V

    goto :goto_f

    :cond_1b
    const/4 v0, 0x0

    instance-of v3, v8, Li21/l$b;

    if-eqz v3, :cond_1f

    const v3, 0x76de9afb

    invoke-virtual {v13, v3}, Lp1/q;->e0(I)V

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3, v9}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-interface {v3, v2}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v6, Lb2/e;->w:Lb2/m;

    invoke-static {v6, v0}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v6

    iget-wide v7, v13, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v13, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v9, v13, Lp1/q;->S:Z

    if-eqz v9, :cond_1c

    invoke-virtual {v13, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_e

    :cond_1c
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_e
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v13, v8, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v13, v6, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v7, v13, Lp1/q;->S:Z

    if-nez v7, :cond_1d

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_1e

    :cond_1d
    invoke-static {v0, v13, v0, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1e
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v13, v0, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v5}, Li21/j;->a()Ly11/r;

    move-result-object v0

    const/4 v3, 0x0

    const/4 v6, 0x1

    const/4 v8, 0x0

    invoke-static {v3, v0, v13, v8, v6}, Ly11/n;->f(Landroidx/compose/ui/Modifier;Ly11/r;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v13, v6}, Lp1/q;->q(Z)V

    invoke-virtual {v13, v8}, Lp1/q;->q(Z)V

    :goto_f
    move-object v6, v4

    :goto_10
    move-object v4, v2

    goto :goto_11

    :cond_1f
    move v8, v0

    const v0, 0x3d465fe

    invoke-static {v0, v13, v8}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0

    :cond_20
    invoke-virtual {v13}, Lp1/q;->X()V

    move-object v6, v8

    goto :goto_10

    :goto_11
    invoke-virtual {v13}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_21

    new-instance v0, Lhy0/v;

    const/4 v3, 0x4

    move/from16 v2, p5

    invoke-direct/range {v0 .. v6}, Lhy0/v;-><init>(IIILandroidx/compose/ui/Modifier;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_21
    return-void
.end method

.method private static final j(Li21/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Lkotlin/jvm/functions/Function1;Li21/j;Ljava/util/UUID;)Ll83/a0;
    .locals 2

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Li21/a;

    invoke-virtual {p1}, Li21/j;->b()Li21/l;

    move-result-object v0

    check-cast v0, Li21/l$a;

    invoke-virtual {v0}, Li21/l$a;->i()Li21/u;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Li21/u;->d()Li21/v;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sget-object v1, Li21/v;->NEW:Li21/v;

    if-ne v0, v1, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {p1}, Li21/j;->b()Li21/l;

    move-result-object p1

    check-cast p1, Li21/l$a;

    invoke-virtual {p1}, Li21/l$a;->d()Ljava/util/UUID;

    move-result-object p1

    invoke-direct {p2, v0, p1}, Li21/a;-><init>(ZLjava/util/UUID;)V

    invoke-interface {p0, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Lkotlin/jvm/functions/Function1;Li21/j;Ljava/util/UUID;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Li21/a;

    invoke-virtual {p1}, Li21/j;->b()Li21/l;

    move-result-object p1

    check-cast p1, Li21/l$d;

    invoke-virtual {p1}, Li21/l$d;->e()Ljava/util/UUID;

    move-result-object p1

    const/4 v0, 0x0

    invoke-direct {p2, v0, p1}, Li21/a;-><init>(ZLjava/util/UUID;)V

    invoke-interface {p0, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final n(Landroidx/compose/ui/Modifier;Li21/j;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Li21/i;->i(Landroidx/compose/ui/Modifier;Li21/j;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
