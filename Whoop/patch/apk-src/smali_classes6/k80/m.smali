.class public abstract Lk80/m;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\'\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/whoop/design/util/TextResource;",
        "buttonText",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onClick",
        "d",
        "(Lcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(ILcom/whoop/design/util/TextResource;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 1

    move-object v0, p2

    move p2, p0

    move-object p0, p1

    move-object p1, v0

    invoke-static/range {p0 .. p5}, Lk80/m;->g(Lcom/whoop/design/util/TextResource;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b()Ll83/a0;
    .locals 1

    invoke-static {}, Lk80/m;->e()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lk80/m;->f(Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 29
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/util/TextResource;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    const-string v0, "buttonText"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p2

    check-cast v0, Lp1/q;

    const v2, 0x483171a

    invoke-virtual {v0, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, p3, 0x6

    const/4 v3, 0x4

    const/4 v4, 0x2

    if-nez v2, :cond_2

    and-int/lit8 v2, p3, 0x8

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    :goto_0
    if-eqz v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    move v2, v4

    :goto_1
    or-int v2, p3, v2

    goto :goto_2

    :cond_2
    move/from16 v2, p3

    :goto_2
    and-int/lit8 v5, p4, 0x2

    const/16 v6, 0x20

    if-eqz v5, :cond_4

    or-int/lit8 v2, v2, 0x30

    :cond_3
    move-object/from16 v7, p1

    goto :goto_4

    :cond_4
    and-int/lit8 v7, p3, 0x30

    if-nez v7, :cond_3

    move-object/from16 v7, p1

    invoke-virtual {v0, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_5

    move v8, v6

    goto :goto_3

    :cond_5
    const/16 v8, 0x10

    :goto_3
    or-int/2addr v2, v8

    :goto_4
    and-int/lit8 v8, v2, 0x13

    const/16 v9, 0x12

    const/4 v10, 0x0

    const/4 v11, 0x1

    if-eq v8, v9, :cond_6

    move v8, v11

    goto :goto_5

    :cond_6
    move v8, v10

    :goto_5
    and-int/lit8 v12, v2, 0x1

    invoke-virtual {v0, v12, v8}, Lp1/q;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_f

    sget-object v8, Lp1/l;->a:Lp1/v0;

    if-eqz v5, :cond_8

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v8, :cond_7

    new-instance v5, Ljx2/b;

    const/16 v7, 0xb

    invoke-direct {v5, v7}, Ljx2/b;-><init>(I)V

    invoke-virtual {v0, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v5, Lc93/a;

    goto :goto_6

    :cond_8
    move-object v5, v7

    :goto_6
    sget-object v7, Lb2/t;->w:Lb2/t;

    const/high16 v12, 0x3f800000    # 1.0f

    invoke-static {v12, v7}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    and-int/lit8 v7, v2, 0x70

    if-ne v7, v6, :cond_9

    move v6, v11

    goto :goto_7

    :cond_9
    move v6, v10

    :goto_7
    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v6, :cond_a

    if-ne v7, v8, :cond_b

    :cond_a
    new-instance v7, Liy0/a;

    const/4 v6, 0x7

    invoke-direct {v7, v5, v6}, Liy0/a;-><init>(Lc93/a;I)V

    invoke-virtual {v0, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    move-object/from16 v17, v7

    check-cast v17, Lc93/a;

    const/16 v18, 0xf

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-static/range {v13 .. v18}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v6

    int-to-float v7, v11

    int-to-float v3, v3

    mul-float/2addr v3, v3

    invoke-static {v3}, Lt0/j;->e(F)Lt0/i;

    move-result-object v3

    sget-object v8, Lx81/d;->a:Lx81/d;

    sget v12, Lx81/d;->b:I

    invoke-virtual {v8, v0, v12}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v13

    invoke-virtual {v13}, Ly81/i;->c1()J

    move-result-wide v13

    invoke-static {v6, v7, v13, v14, v3}, Lge3/g;->h(Landroidx/compose/ui/Modifier;FJLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    int-to-float v6, v10

    int-to-float v4, v4

    const/16 v7, 0x8

    int-to-float v7, v7

    mul-float/2addr v4, v7

    invoke-static {v3, v6, v4}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v4, Ll0/m;->e:Ll0/h;

    sget-object v6, Lb2/e;->J:Lb2/l;

    const/4 v7, 0x6

    invoke-static {v4, v6, v0, v7}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v4

    iget-wide v6, v0, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v0, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v10, La3/l;->a:La3/k;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v13, v0, Lp1/q;->S:Z

    if-eqz v13, :cond_c

    invoke-virtual {v0, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_c
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_8
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v0, v10, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v0, v4, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v7, v0, Lp1/q;->S:Z

    if-nez v7, :cond_d

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v7, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_e

    :cond_d
    invoke-static {v6, v0, v6, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_e
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v0, v4, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget v3, Lcom/whoop/design/util/TextResource;->$stable:I

    and-int/lit8 v2, v2, 0xe

    or-int/2addr v2, v3

    invoke-static {v1, v0, v2}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v8, v0, v12}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->r()Lb91/a;

    move-result-object v22

    invoke-virtual {v8, v0, v12}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->y()J

    move-result-wide v3

    sget v6, Lb91/a;->d:I

    shl-int/lit8 v26, v6, 0x12

    const v27, 0x2fffa

    move-object v7, v5

    move-wide v4, v3

    const/4 v3, 0x0

    move-object v8, v7

    const-wide/16 v6, 0x0

    move-object v9, v8

    const/4 v8, 0x0

    move-object v10, v9

    const/4 v9, 0x0

    move-object v12, v10

    const/4 v10, 0x0

    move v14, v11

    move-object v13, v12

    const-wide/16 v11, 0x0

    move-object v15, v13

    const/4 v13, 0x0

    move/from16 v16, v14

    const/4 v14, 0x0

    move-object/from16 v17, v15

    move/from16 v18, v16

    const-wide/16 v15, 0x0

    move-object/from16 v19, v17

    const/16 v17, 0x0

    move/from16 v20, v18

    const/16 v18, 0x0

    move-object/from16 v21, v19

    const/16 v19, 0x0

    move/from16 v23, v20

    const/16 v20, 0x0

    move-object/from16 v24, v21

    const/16 v21, 0x0

    move/from16 v25, v23

    const/16 v23, 0x0

    move/from16 v28, v25

    const/16 v25, 0x0

    move-object/from16 p1, v24

    move-object/from16 v24, v0

    move/from16 v0, v28

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v2, v24

    invoke-virtual {v2, v0}, Lp1/q;->q(Z)V

    move-object/from16 v7, p1

    goto :goto_9

    :cond_f
    move-object v2, v0

    invoke-virtual {v2}, Lp1/q;->X()V

    :goto_9
    invoke-virtual {v2}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_10

    new-instance v0, Lk80/l;

    const/4 v5, 0x0

    move/from16 v3, p3

    move/from16 v4, p4

    move-object v2, v7

    invoke-direct/range {v0 .. v5}, Lk80/l;-><init>(Lcom/whoop/design/util/TextResource;Lc93/a;III)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_10
    return-void
.end method

.method private static final e()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final f(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lcom/whoop/design/util/TextResource;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lk80/m;->d(Lcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
