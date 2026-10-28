.class public abstract Lyy0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u001a!\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a-\u0010\u000c\u001a\u00020\u0004*\u0008\u0012\u0004\u0012\u00020\u00020\u00072\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000b\u001a\u00020\nH\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lyy0/c;",
        "state",
        "Ll83/a0;",
        "c",
        "(Landroidx/compose/ui/Modifier;Lyy0/c;Landroidx/compose/runtime/Composer;II)V",
        "",
        "Lp91/a;",
        "anchorPoint",
        "",
        "isInverted",
        "e",
        "(Ljava/util/List;Lp91/a;ZLandroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(Ljava/util/List;Lp91/a;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lyy0/b;->f(Ljava/util/List;Lp91/a;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/Modifier;Lyy0/c;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lyy0/b;->d(Landroidx/compose/ui/Modifier;Lyy0/c;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Landroidx/compose/ui/Modifier;Lyy0/c;Landroidx/compose/runtime/Composer;II)V
    .locals 32

    move-object/from16 v3, p1

    const-string v0, "state"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v9, p2

    check-cast v9, Lp1/q;

    const v0, -0x5b4ed61a

    invoke-virtual {v9, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p4, 0x1

    const/4 v1, 0x4

    if-eqz v0, :cond_0

    or-int/lit8 v2, p3, 0x6

    move v4, v2

    move-object/from16 v2, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v2, p3, 0x6

    if-nez v2, :cond_2

    move-object/from16 v2, p0

    invoke-virtual {v9, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    move v4, v1

    goto :goto_0

    :cond_1
    const/4 v4, 0x2

    :goto_0
    or-int v4, p3, v4

    goto :goto_1

    :cond_2
    move-object/from16 v2, p0

    move/from16 v4, p3

    :goto_1
    and-int/lit8 v5, p3, 0x30

    if-nez v5, :cond_5

    and-int/lit8 v5, p3, 0x40

    if-nez v5, :cond_3

    invoke-virtual {v9, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    goto :goto_2

    :cond_3
    invoke-virtual {v9, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    :goto_2
    if-eqz v5, :cond_4

    const/16 v5, 0x20

    goto :goto_3

    :cond_4
    const/16 v5, 0x10

    :goto_3
    or-int/2addr v4, v5

    :cond_5
    and-int/lit8 v5, v4, 0x13

    const/16 v6, 0x12

    const/4 v11, 0x0

    const/4 v12, 0x1

    if-eq v5, v6, :cond_6

    move v5, v12

    goto :goto_4

    :cond_6
    move v5, v11

    :goto_4
    and-int/2addr v4, v12

    invoke-virtual {v9, v4, v5}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_f

    sget-object v4, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_7

    move-object v2, v4

    :cond_7
    invoke-virtual {v3}, Lyy0/c;->c()Ly81/e;

    move-result-object v0

    if-nez v0, :cond_8

    const v0, 0x64bc4648

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v11}, Lp1/q;->q(Z)V

    const/4 v0, 0x0

    goto :goto_5

    :cond_8
    const v5, 0x3d0e54d9

    invoke-virtual {v9, v5}, Lp1/q;->e0(I)V

    invoke-interface {v0, v9, v11}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v5

    invoke-static {v9, v11, v5, v6}, Ldc/b;->h(Lp1/q;ZJ)Li2/x;

    move-result-object v0

    :goto_5
    const/4 v5, 0x6

    if-nez v0, :cond_9

    const v0, 0x3d0e59ed

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    sget-object v0, Lx81/d;->a:Lx81/d;

    invoke-static {v0, v9, v5, v11}, Lih0/d0;->D(Lx81/d;Lp1/q;IZ)J

    move-result-wide v6

    goto :goto_6

    :cond_9
    const v6, 0x3d0e5363

    invoke-virtual {v9, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v11}, Lp1/q;->q(Z)V

    iget-wide v6, v0, Li2/x;->a:J

    :goto_6
    sget-object v0, Lb2/e;->N:Lb2/k;

    sget-object v8, Ll0/m;->c:Ll0/g;

    const/16 v10, 0x30

    invoke-static {v8, v0, v9, v10}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v0

    iget-wide v13, v9, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v9, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    sget-object v14, La3/l;->a:La3/k;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v15, v9, Lp1/q;->S:Z

    if-eqz v15, :cond_a

    invoke-virtual {v9, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_a
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_7
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v9, v14, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {v9, v0, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->j:La3/i;

    iget-boolean v10, v9, Lp1/q;->S:Z

    if-nez v10, :cond_b

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v10, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_c

    :cond_b
    invoke-static {v8, v9, v8, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v9, v0, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v3}, Lyy0/c;->d()Lgz0/m0;

    move-result-object v0

    if-eqz v0, :cond_d

    const v0, -0x5abb2821

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v3}, Lyy0/c;->d()Lgz0/m0;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/m0;->toWhoopIcon()I

    move-result v0

    invoke-static {v0, v9, v11}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v0

    const-wide/high16 v13, 0x3fd0000000000000L    # 0.25

    double-to-float v5, v13

    int-to-float v1, v1

    mul-float/2addr v5, v1

    const/4 v8, 0x0

    invoke-static {v4, v8, v5, v12}, Landroidx/compose/foundation/layout/a;->n(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/4 v5, 0x3

    int-to-float v5, v5

    mul-float/2addr v5, v1

    invoke-static {v5, v4}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/16 v10, 0x1b0

    const/4 v5, 0x0

    move-object v4, v0

    move-wide v7, v6

    move-object v6, v1

    invoke-static/range {v4 .. v10}, Ll1/r1;->a(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;I)V

    invoke-virtual {v9, v11}, Lp1/q;->q(Z)V

    move v14, v12

    goto/16 :goto_9

    :cond_d
    invoke-virtual {v3}, Lyy0/c;->f()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    if-eqz v0, :cond_e

    const v0, -0x5ab608ce

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v3}, Lyy0/c;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-static {v0, v9, v11}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    sget-object v0, Lx81/d;->a:Lx81/d;

    invoke-virtual {v0, v9, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v1

    invoke-virtual {v1}, Lb91/d;->d()Lb91/a;

    move-result-object v24

    const/16 v28, 0x0

    const v29, 0x2fffa

    move v1, v5

    const/4 v5, 0x0

    move-object/from16 v26, v9

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    move v13, v11

    const/4 v11, 0x0

    move v14, v12

    const/4 v12, 0x0

    move v15, v13

    move/from16 v16, v14

    const-wide/16 v13, 0x0

    move/from16 v17, v15

    const/4 v15, 0x0

    move/from16 v18, v16

    const/16 v16, 0x0

    move/from16 v19, v17

    move/from16 v20, v18

    const-wide/16 v17, 0x0

    move/from16 v21, v19

    const/16 v19, 0x0

    move/from16 v22, v20

    const/16 v20, 0x0

    move/from16 v23, v21

    const/16 v21, 0x0

    move/from16 v25, v22

    const/16 v22, 0x0

    move/from16 v27, v23

    const/16 v23, 0x0

    move/from16 v30, v25

    const/16 v25, 0x0

    move/from16 v31, v27

    const/16 v27, 0x0

    move/from16 v1, v31

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v26

    invoke-virtual {v3}, Lyy0/c;->f()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-static {v4, v9, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x6

    invoke-virtual {v0, v9, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->F()Lb91/a;

    move-result-object v24

    const/4 v5, 0x0

    const-wide/16 v8, 0x0

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v26

    invoke-virtual {v9, v1}, Lp1/q;->q(Z)V

    :goto_8
    const/4 v14, 0x1

    goto :goto_9

    :cond_e
    move v1, v11

    const v0, -0x5ab29a83

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v3}, Lyy0/c;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-static {v0, v9, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    sget-object v0, Lx81/d;->a:Lx81/d;

    const/4 v5, 0x6

    invoke-virtual {v0, v9, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->v()Lb91/a;

    move-result-object v24

    const/16 v28, 0x0

    const v29, 0x2fffa

    const/4 v5, 0x0

    move-object/from16 v26, v9

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x0

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v26

    invoke-virtual {v9, v1}, Lp1/q;->q(Z)V

    goto :goto_8

    :goto_9
    invoke-virtual {v9, v14}, Lp1/q;->q(Z)V

    :goto_a
    move-object v1, v2

    goto :goto_b

    :cond_f
    invoke-virtual {v9}, Lp1/q;->X()V

    goto :goto_a

    :goto_b
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_10

    new-instance v0, Lbz0/a;

    const/4 v5, 0x7

    move/from16 v2, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lbz0/a;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_10
    return-void
.end method

.method private static final d(Landroidx/compose/ui/Modifier;Lyy0/c;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lyy0/b;->c(Landroidx/compose/ui/Modifier;Lyy0/c;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final e(Ljava/util/List;Lp91/a;ZLandroidx/compose/runtime/Composer;II)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lyy0/c;",
            ">;",
            "Lp91/a;",
            "Z",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, Lp1/q;

    const v0, 0x6631c558

    invoke-virtual {p3, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p4, 0x6

    if-nez v0, :cond_1

    invoke-virtual {p3, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p4

    goto :goto_1

    :cond_1
    move v0, p4

    :goto_1
    and-int/lit8 v1, p5, 0x1

    if-eqz v1, :cond_2

    or-int/lit8 v0, v0, 0x30

    goto :goto_3

    :cond_2
    and-int/lit8 v2, p4, 0x30

    if-nez v2, :cond_4

    invoke-virtual {p3, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    const/16 v2, 0x20

    goto :goto_2

    :cond_3
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v0, v2

    :cond_4
    :goto_3
    and-int/lit8 v2, p5, 0x2

    if-eqz v2, :cond_5

    or-int/lit16 v0, v0, 0x180

    goto :goto_5

    :cond_5
    and-int/lit16 v3, p4, 0x180

    if-nez v3, :cond_7

    invoke-virtual {p3, p2}, Lp1/q;->h(Z)Z

    move-result v3

    if-eqz v3, :cond_6

    const/16 v3, 0x100

    goto :goto_4

    :cond_6
    const/16 v3, 0x80

    :goto_4
    or-int/2addr v0, v3

    :cond_7
    :goto_5
    and-int/lit16 v3, v0, 0x93

    const/16 v5, 0x92

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eq v3, v5, :cond_8

    move v3, v7

    goto :goto_6

    :cond_8
    move v3, v6

    :goto_6
    and-int/2addr v0, v7

    invoke-virtual {p3, v0, v3}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_d

    if-eqz v1, :cond_9

    sget-object p1, Lp91/a;->e:Lp91/a$a;

    invoke-virtual {p1}, Lp91/a$a;->b()Lp91/a;

    move-result-object p1

    :cond_9
    if-eqz v2, :cond_a

    move p2, v6

    :cond_a
    move-object v0, p0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_c

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lyy0/c;

    invoke-virtual {v1}, Lyy0/c;->g()F

    move-result v2

    if-eqz p2, :cond_b

    int-to-float v3, v7

    invoke-virtual {v1}, Lyy0/c;->h()F

    move-result v5

    sub-float/2addr v3, v5

    goto :goto_8

    :cond_b
    invoke-virtual {v1}, Lyy0/c;->h()F

    move-result v3

    :goto_8
    sget-object v5, Lb2/t;->w:Lb2/t;

    invoke-static {v5, v2, v3, p1}, Lp91/e;->j(Landroidx/compose/ui/Modifier;FFLp91/a;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v2, v1, p3, v6, v6}, Lyy0/b;->c(Landroidx/compose/ui/Modifier;Lyy0/c;Landroidx/compose/runtime/Composer;II)V

    goto :goto_7

    :cond_c
    :goto_9
    move-object v2, p1

    move v3, p2

    goto :goto_a

    :cond_d
    invoke-virtual {p3}, Lp1/q;->X()V

    goto :goto_9

    :goto_a
    invoke-virtual {p3}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_e

    new-instance v0, Lht2/b;

    move-object v1, p0

    move v4, p4

    move v5, p5

    invoke-direct/range {v0 .. v5}, Lht2/b;-><init>(Ljava/util/List;Lp91/a;ZII)V

    iput-object v0, p1, Lp1/v1;->d:Lc93/m;

    :cond_e
    return-void
.end method

.method private static final f(Ljava/util/List;Lp91/a;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lyy0/b;->e(Ljava/util/List;Lp91/a;ZLandroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
