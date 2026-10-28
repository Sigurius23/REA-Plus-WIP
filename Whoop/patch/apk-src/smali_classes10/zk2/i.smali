.class public abstract Lzk2/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a!\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Ltk2/n;",
        "state",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Ll83/a0;",
        "e",
        "(Ltk2/n;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V",
        "Ltk2/c;",
        "c",
        "(Ltk2/c;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V",
        "track-activity_release"
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
.method public static synthetic a(Ltk2/c;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lzk2/i;->d(Ltk2/c;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ltk2/n;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lzk2/i;->f(Ltk2/n;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Ltk2/c;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 37

    move-object/from16 v1, p0

    const-string v0, "state"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p2

    check-cast v0, Lp1/q;

    const v2, 0x7646747d

    invoke-virtual {v0, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, p3, 0x6

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

    const/4 v2, 0x4

    goto :goto_1

    :cond_1
    const/4 v2, 0x2

    :goto_1
    or-int v2, p3, v2

    goto :goto_2

    :cond_2
    move/from16 v2, p3

    :goto_2
    and-int/lit8 v3, p4, 0x2

    if-eqz v3, :cond_4

    or-int/lit8 v2, v2, 0x30

    :cond_3
    move-object/from16 v4, p1

    goto :goto_4

    :cond_4
    and-int/lit8 v4, p3, 0x30

    if-nez v4, :cond_3

    move-object/from16 v4, p1

    invoke-virtual {v0, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    const/16 v5, 0x20

    goto :goto_3

    :cond_5
    const/16 v5, 0x10

    :goto_3
    or-int/2addr v2, v5

    :goto_4
    and-int/lit8 v5, v2, 0x13

    const/16 v6, 0x12

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-eq v5, v6, :cond_6

    move v5, v8

    goto :goto_5

    :cond_6
    move v5, v7

    :goto_5
    and-int/2addr v2, v8

    invoke-virtual {v0, v2, v5}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_f

    sget-object v2, Lb2/t;->w:Lb2/t;

    if-eqz v3, :cond_7

    move-object v3, v2

    goto :goto_6

    :cond_7
    move-object v3, v4

    :goto_6
    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v4, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v5, Lb2/e;->N:Lb2/k;

    sget-object v9, Ll0/m;->c:Ll0/g;

    const/16 v10, 0x30

    invoke-static {v9, v5, v0, v10}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v11

    iget-wide v12, v0, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v0, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v14, La3/l;->a:La3/k;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v15, v0, Lp1/q;->S:Z

    if-eqz v15, :cond_8

    invoke-virtual {v0, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_8
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_7
    sget-object v15, La3/k;->g:La3/i;

    invoke-static {v0, v15, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->f:La3/i;

    invoke-static {v0, v11, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v13, La3/k;->j:La3/i;

    iget-boolean v6, v0, Lp1/q;->S:Z

    if-nez v6, :cond_9

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_a

    :cond_9
    invoke-static {v12, v0, v12, v13}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_a
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v0, v6, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, Ll0/a1;->x:Ll0/a1;

    invoke-static {v2, v4}, Landroidx/compose/foundation/layout/a;->u(Landroidx/compose/ui/Modifier;Ll0/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v9, v5, v0, v10}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v5

    iget-wide v8, v0, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v0, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v12, v0, Lp1/q;->S:Z

    if-eqz v12, :cond_b

    invoke-virtual {v0, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_b
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_8
    invoke-static {v0, v15, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v0, v11, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v5, v0, Lp1/q;->S:Z

    if-nez v5, :cond_c

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v5, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_d

    :cond_c
    invoke-static {v8, v0, v8, v13}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_d
    invoke-static {v0, v6, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1}, Ltk2/c;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    sget v5, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v4, v0, v5}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    sget-object v6, Lx81/d;->a:Lx81/d;

    sget v8, Lx81/d;->b:I

    invoke-virtual {v6, v0, v8}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v9

    invoke-virtual {v9}, Lb91/d;->w()Lb91/a;

    move-result-object v9

    invoke-virtual {v9}, Lb91/a;->d()Ll3/v0;

    move-result-object v9

    invoke-virtual {v6, v0, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v11

    invoke-virtual {v11}, Ly81/i;->y()J

    move-result-wide v11

    invoke-static {v9, v11, v12, v0, v7}, Lb91/e;->f(Ll3/v0;JLandroidx/compose/runtime/Composer;I)Ll3/m0;

    move-result-object v9

    new-instance v11, Ll83/k;

    invoke-direct {v11, v4, v9}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1}, Ltk2/c;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-static {v4, v0, v5}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v6, v0, v8}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v9

    invoke-virtual {v9}, Lb91/d;->D()Lb91/a;

    move-result-object v9

    invoke-virtual {v9}, Lb91/a;->d()Ll3/v0;

    move-result-object v9

    invoke-virtual {v6, v0, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v12

    invoke-virtual {v12}, Ly81/i;->c1()J

    move-result-wide v12

    invoke-static {v9, v12, v13, v0, v7}, Lb91/e;->f(Ll3/v0;JLandroidx/compose/runtime/Composer;I)Ll3/m0;

    move-result-object v9

    new-instance v12, Ll83/k;

    invoke-direct {v12, v4, v9}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v11, v12}, [Ll83/k;

    move-result-object v4

    invoke-static {v4}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    invoke-virtual {v6, v0, v8}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v9

    invoke-virtual {v9}, Lb91/d;->u()Lb91/a;

    move-result-object v23

    sget v28, Lb91/a;->d:I

    shl-int/lit8 v9, v28, 0x15

    or-int/lit16 v9, v9, 0xc00

    const v27, 0x1dffe

    move-object v11, v3

    const/4 v3, 0x0

    move-object v13, v2

    move-object v2, v4

    move v12, v5

    const-wide/16 v4, 0x0

    move-object v14, v6

    move v15, v7

    const-wide/16 v6, 0x0

    move/from16 v17, v8

    const/4 v8, 0x0

    move/from16 v26, v9

    const/4 v9, 0x0

    move/from16 v18, v10

    const/4 v10, 0x0

    move-object/from16 v19, v11

    move/from16 v20, v12

    const-wide/16 v11, 0x0

    move-object/from16 v21, v13

    const/4 v13, 0x0

    move-object/from16 v22, v14

    const/4 v14, 0x0

    move/from16 v24, v15

    const/16 v25, 0x1

    const-wide/16 v15, 0x0

    move/from16 v29, v17

    const/16 v17, 0x0

    move/from16 v30, v18

    const/16 v18, 0x0

    move-object/from16 v31, v19

    const/16 v19, 0x1

    move/from16 v32, v20

    const/16 v20, 0x0

    move-object/from16 v33, v21

    const/16 v21, 0x0

    move-object/from16 v34, v22

    const/16 v22, 0x0

    move/from16 v35, v25

    const/16 v25, 0x0

    move/from16 v1, v24

    move-object/from16 v24, v0

    move v0, v1

    move/from16 v36, v29

    move-object/from16 v1, v33

    const/16 v29, 0x12

    invoke-static/range {v2 .. v27}, Lqz0/n;->e(Ljava/util/List;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILjava/util/Map;Lkotlin/jvm/functions/Function1;Lb91/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v2, v24

    invoke-virtual/range {p0 .. p0}, Ltk2/c;->c()Ltk2/n;

    move-result-object v3

    if-nez v3, :cond_e

    const v1, -0x7dc26b02

    invoke-virtual {v2, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v2, v0}, Lp1/q;->q(Z)V

    const/4 v6, 0x1

    goto :goto_9

    :cond_e
    const v4, -0x7dc26b01

    invoke-virtual {v2, v4}, Lp1/q;->e0(I)V

    const-wide/high16 v4, 0x3ff8000000000000L    # 1.5

    double-to-float v4, v4

    const/16 v5, 0x8

    int-to-float v5, v5

    mul-float/2addr v4, v5

    const/4 v5, 0x0

    const/4 v6, 0x1

    invoke-static {v1, v5, v4, v6}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const/16 v7, 0x30

    invoke-static {v3, v5, v2, v7, v0}, Lzk2/i;->e(Ltk2/n;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v1, v4, v2, v0}, Lq63/c;->u(Lb2/t;FLp1/q;Z)V

    :goto_9
    invoke-virtual/range {p0 .. p0}, Ltk2/c;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    move/from16 v12, v32

    invoke-static {v0, v2, v12}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v14, v34

    move/from16 v1, v36

    invoke-virtual {v14, v2, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->Q()Lb91/a;

    move-result-object v22

    invoke-virtual {v14, v2, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->c1()J

    move-result-wide v4

    shl-int/lit8 v26, v28, 0x12

    const v27, 0x2fffa

    const/4 v3, 0x0

    move/from16 v16, v6

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move/from16 v35, v16

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    move-object/from16 v24, v2

    move-object v2, v0

    move/from16 v0, v35

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v2, v24

    invoke-virtual {v2, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v2, v0}, Lp1/q;->q(Z)V

    move-object/from16 v3, v31

    goto :goto_a

    :cond_f
    move-object v2, v0

    invoke-virtual {v2}, Lp1/q;->X()V

    move-object v3, v4

    :goto_a
    invoke-virtual {v2}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_10

    new-instance v0, Lzi1/c0;

    const/4 v5, 0x1

    move-object/from16 v1, p0

    move/from16 v2, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lzi1/c0;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_10
    return-void
.end method

.method private static final d(Ltk2/c;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lzk2/i;->c(Ltk2/c;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final e(Ltk2/n;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 12

    const-string v0, "state"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v9, p2

    check-cast v9, Lp1/q;

    const p2, 0x54ce7cca

    invoke-virtual {v9, p2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p2, p3, 0x6

    const/4 v0, 0x4

    if-nez p2, :cond_1

    invoke-virtual {v9, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    move p2, v0

    goto :goto_0

    :cond_0
    const/4 p2, 0x2

    :goto_0
    or-int/2addr p2, p3

    goto :goto_1

    :cond_1
    move p2, p3

    :goto_1
    and-int/lit8 v1, p4, 0x2

    if-eqz v1, :cond_2

    or-int/lit8 p2, p2, 0x30

    goto :goto_3

    :cond_2
    and-int/lit8 v2, p3, 0x30

    if-nez v2, :cond_4

    invoke-virtual {v9, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    const/16 v2, 0x20

    goto :goto_2

    :cond_3
    const/16 v2, 0x10

    :goto_2
    or-int/2addr p2, v2

    :cond_4
    :goto_3
    and-int/lit8 v2, p2, 0x13

    const/16 v3, 0x12

    const/4 v4, 0x0

    if-eq v2, v3, :cond_5

    const/4 v2, 0x1

    goto :goto_4

    :cond_5
    move v2, v4

    :goto_4
    and-int/lit8 v3, p2, 0x1

    invoke-virtual {v9, v3, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_7

    if-eqz v1, :cond_6

    sget-object p1, Lb2/t;->w:Lb2/t;

    :cond_6
    move-object v1, p1

    invoke-virtual {p0}, Ltk2/n;->b()I

    move-result v2

    invoke-virtual {p0}, Ltk2/n;->e()I

    move-result v3

    new-instance p1, Li2/c1;

    invoke-virtual {p0}, Ltk2/n;->c()Ly81/f;

    move-result-object v5

    invoke-virtual {v5, v9, v4}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v5

    invoke-direct {p1, v5, v6}, Li2/c1;-><init>(J)V

    invoke-virtual {p0}, Ltk2/n;->g()Ly81/f;

    move-result-object v5

    invoke-virtual {v5, v9, v4}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v4

    invoke-virtual {p0}, Ltk2/n;->f()F

    move-result v6

    invoke-static {v6, v4, v5}, Li2/x;->c(FJ)J

    move-result-wide v5

    invoke-virtual {p0}, Ltk2/n;->a()Z

    move-result v7

    invoke-virtual {p0}, Ltk2/n;->d()I

    move-result v4

    int-to-float v4, v4

    int-to-float v0, v0

    mul-float v8, v4, v0

    shr-int/lit8 p2, p2, 0x3

    and-int/lit8 v10, p2, 0xe

    const/4 v11, 0x0

    move-object v4, p1

    invoke-static/range {v1 .. v11}, Llz0/f;->b(Landroidx/compose/ui/Modifier;IILi2/t;JZFLandroidx/compose/runtime/Composer;II)V

    move-object v5, v1

    goto :goto_5

    :cond_7
    invoke-virtual {v9}, Lp1/q;->X()V

    move-object v5, p1

    :goto_5
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_8

    new-instance v2, Lzi1/c0;

    const/4 v7, 0x2

    move-object v3, p0

    move v4, p3

    move/from16 v6, p4

    invoke-direct/range {v2 .. v7}, Lzi1/c0;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v2, p1, Lp1/v1;->d:Lc93/m;

    :cond_8
    return-void
.end method

.method private static final f(Ltk2/n;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lzk2/i;->e(Ltk2/n;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
