.class public abstract Lau1/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lcom/whoop/design/util/TextResource;",
        "text",
        "Ll83/a0;",
        "b",
        "(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V",
        "labrador_release"
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
.method public static synthetic a(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lau1/i;->c(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V
    .locals 37

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v3, "modifier"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "text"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v3, p2

    check-cast v3, Lp1/q;

    const v4, -0xb5c1a0e

    invoke-virtual {v3, v4}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v4, p3, 0x6

    const/4 v5, 0x4

    const/4 v6, 0x2

    if-nez v4, :cond_1

    invoke-virtual {v3, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    move v4, v5

    goto :goto_0

    :cond_0
    move v4, v6

    :goto_0
    or-int v4, p3, v4

    goto :goto_1

    :cond_1
    move/from16 v4, p3

    :goto_1
    and-int/lit8 v7, p3, 0x30

    if-nez v7, :cond_4

    and-int/lit8 v7, p3, 0x40

    if-nez v7, :cond_2

    invoke-virtual {v3, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    goto :goto_2

    :cond_2
    invoke-virtual {v3, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    :goto_2
    if-eqz v7, :cond_3

    const/16 v7, 0x20

    goto :goto_3

    :cond_3
    const/16 v7, 0x10

    :goto_3
    or-int/2addr v4, v7

    :cond_4
    and-int/lit8 v7, v4, 0x13

    const/16 v8, 0x12

    const/4 v9, 0x0

    const/4 v10, 0x1

    if-eq v7, v8, :cond_5

    move v7, v10

    goto :goto_4

    :cond_5
    move v7, v9

    :goto_4
    and-int/lit8 v11, v4, 0x1

    invoke-virtual {v3, v11, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_b

    const/high16 v7, 0x3f800000    # 1.0f

    sget-object v11, Lb2/t;->w:Lb2/t;

    invoke-static {v7, v11}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    invoke-interface {v12, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    int-to-float v6, v6

    int-to-float v5, v5

    mul-float/2addr v6, v5

    invoke-static {v6}, Ll0/m;->i(F)Ll0/k;

    move-result-object v5

    sget-object v6, Lb2/e;->K:Lb2/l;

    const/16 v13, 0x36

    invoke-static {v5, v6, v3, v13}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v5

    iget-wide v13, v3, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v3}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v3, v12}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    sget-object v14, La3/l;->a:La3/k;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v3}, Lp1/q;->i0()V

    iget-boolean v15, v3, Lp1/q;->S:Z

    if-eqz v15, :cond_6

    invoke-virtual {v3, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_6
    invoke-virtual {v3}, Lp1/q;->s0()V

    :goto_5
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v3, v14, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v3, v5, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v13, v3, Lp1/q;->S:Z

    if-nez v13, :cond_7

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v13, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_8

    :cond_7
    invoke-static {v6, v3, v6, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_8
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v3, v5, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget v5, Lcom/whoop/design/util/TextResource;->$stable:I

    shr-int/lit8 v4, v4, 0x3

    and-int/lit8 v4, v4, 0xe

    or-int/2addr v4, v5

    invoke-static {v1, v3, v4}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    sget-object v5, Lx81/d;->a:Lx81/d;

    sget v6, Lx81/d;->b:I

    invoke-virtual {v5, v3, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v12

    invoke-virtual {v12}, Ly81/i;->b1()J

    move-result-wide v12

    invoke-virtual {v5, v3, v6}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v14

    invoke-virtual {v14}, Lb91/d;->s()Lb91/a;

    move-result-object v24

    sget v14, Lb91/a;->d:I

    shl-int/lit8 v28, v14, 0x12

    const v29, 0x2fffa

    move-object v8, v5

    const/4 v5, 0x0

    move-object v14, v8

    move v15, v9

    const-wide/16 v8, 0x0

    move/from16 v16, v10

    const/4 v10, 0x0

    move-object/from16 v17, v11

    const/4 v11, 0x0

    move/from16 v18, v7

    move-wide/from16 v35, v12

    move v13, v6

    move-wide/from16 v6, v35

    const/4 v12, 0x0

    move/from16 v20, v13

    move-object/from16 v19, v14

    const-wide/16 v13, 0x0

    move/from16 v21, v15

    const/4 v15, 0x0

    move/from16 v22, v16

    const/16 v16, 0x0

    move-object/from16 v25, v17

    move/from16 v23, v18

    const-wide/16 v17, 0x0

    move-object/from16 v26, v19

    const/16 v19, 0x0

    move/from16 v27, v20

    const/16 v20, 0x0

    move/from16 v30, v21

    const/16 v21, 0x0

    move/from16 v31, v22

    const/16 v22, 0x0

    move/from16 v32, v23

    const/16 v23, 0x0

    move-object/from16 v33, v25

    const/16 v25, 0x0

    move/from16 v34, v27

    const/16 v27, 0x0

    move-object/from16 v0, v26

    move-object/from16 v26, v3

    move-object v3, v0

    move/from16 v1, v31

    move-object/from16 v2, v33

    move/from16 v0, v34

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v4, v26

    int-to-float v5, v1

    invoke-static {v5, v2}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/high16 v5, 0x3f800000    # 1.0f

    float-to-double v6, v5

    const-wide/16 v8, 0x0

    cmpl-double v6, v6, v8

    if-lez v6, :cond_9

    move v9, v1

    goto :goto_6

    :cond_9
    const/4 v9, 0x0

    :goto_6
    if-nez v9, :cond_a

    const-string v6, "invalid weight; must be greater than zero"

    invoke-static {v6}, Lm0/a;->a(Ljava/lang/String;)V

    :cond_a
    invoke-static {v2, v1, v5}, Ldc/b;->g(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v3, v4, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->W0()J

    move-result-wide v5

    sget-object v0, Li2/w0;->a:Li2/v0;

    invoke-static {v2, v5, v6, v0}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v15, 0x0

    invoke-static {v0, v4, v15}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v4, v1}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_b
    move-object v4, v3

    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_7
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_c

    new-instance v1, Lk;

    move-object/from16 v2, p0

    move-object/from16 v3, p1

    move/from16 v4, p3

    invoke-direct {v1, v2, v3, v4}, Lk;-><init>(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;I)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_c
    return-void
.end method

.method private static final c(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lau1/i;->b(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
