.class public abstract Lk90/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lk90/b$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\u0008H\u0003\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lk90/c;",
        "viewState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "c",
        "(Lk90/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Lk90/d;",
        "Lb91/a;",
        "f",
        "(Lk90/d;Landroidx/compose/runtime/Composer;I)Lb91/a;",
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
.method public static synthetic a(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lk90/b;->d(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lk90/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lk90/b;->e(Lk90/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lk90/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 37
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lk90/c;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v5, p2

    check-cast v5, Lp1/q;

    const v0, -0x558f5931

    invoke-virtual {v5, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    const/4 v2, 0x2

    if-nez v0, :cond_2

    and-int/lit8 v0, p3, 0x8

    if-nez v0, :cond_0

    invoke-virtual {v5, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v5, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    const/4 v0, 0x4

    goto :goto_1

    :cond_1
    move v0, v2

    :goto_1
    or-int v0, p3, v0

    goto :goto_2

    :cond_2
    move/from16 v0, p3

    :goto_2
    and-int/lit8 v3, v0, 0x3

    const/4 v13, 0x0

    const/4 v14, 0x1

    if-eq v3, v2, :cond_3

    move v3, v14

    goto :goto_3

    :cond_3
    move v3, v13

    :goto_3
    and-int/2addr v0, v14

    invoke-virtual {v5, v0, v3}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_d

    and-int/lit8 v0, p4, 0x2

    if-eqz v0, :cond_5

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v0, v3, :cond_4

    new-instance v0, Ljp2/f;

    const/16 v3, 0x16

    invoke-direct {v0, v3}, Ljp2/f;-><init>(I)V

    invoke-virtual {v5, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v0, Lkotlin/jvm/functions/Function1;

    goto :goto_4

    :cond_5
    move-object/from16 v0, p1

    :goto_4
    const/high16 v3, 0x3f800000    # 1.0f

    sget-object v15, Lb2/t;->w:Lb2/t;

    invoke-static {v3, v15}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v4}, Lgb1/b0;->b0(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    int-to-float v8, v2

    const/16 v2, 0x8

    int-to-float v2, v2

    mul-float/2addr v2, v8

    invoke-static {v2, v4}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v4, Lb2/e;->E:Lb2/m;

    invoke-static {v4, v13}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v4

    iget-wide v6, v5, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v5, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v10, v5, Lp1/q;->S:Z

    if-eqz v10, :cond_6

    invoke-virtual {v5, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_6
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_5
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v5, v10, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v5, v4, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v11, v5, Lp1/q;->S:Z

    if-nez v11, :cond_7

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v11, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_8

    :cond_7
    invoke-static {v6, v5, v6, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_8
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v5, v6, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v3, v15}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v3, Ll0/m;->e:Ll0/h;

    sget-object v11, Lb2/e;->N:Lb2/k;

    const/16 v14, 0x36

    invoke-static {v3, v11, v5, v14}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v12, v5, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v5, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v13, v5, Lp1/q;->S:Z

    if-eqz v13, :cond_9

    invoke-virtual {v5, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_9
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_6
    invoke-static {v5, v10, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v5, v4, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v5, Lp1/q;->S:Z

    if-nez v3, :cond_a

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_b

    :cond_a
    invoke-static {v11, v5, v11, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    invoke-static {v5, v6, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lk90/c;->a()Lkd1/o;

    move-result-object v2

    if-nez v2, :cond_c

    const v2, -0x4b736ce4

    invoke-virtual {v5, v2}, Lp1/q;->e0(I)V

    const/4 v2, 0x0

    invoke-virtual {v5, v2}, Lp1/q;->q(Z)V

    move/from16 v28, v8

    const/4 v14, 0x4

    goto :goto_7

    :cond_c
    const v3, -0x4b736ce3

    invoke-virtual {v5, v3}, Lp1/q;->e0(I)V

    const/16 v3, 0x2c

    int-to-float v3, v3

    const/4 v14, 0x4

    int-to-float v12, v14

    mul-float/2addr v3, v12

    invoke-static {v3, v15}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget v6, Lkd1/o;->a:I

    const/4 v7, 0x3

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v2

    move-object/from16 v24, v5

    const/16 v10, 0x1b0

    const/16 v11, 0x78

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move v4, v8

    const/4 v8, 0x0

    move/from16 v28, v4

    move-object v4, v9

    move-object/from16 v9, v24

    invoke-static/range {v2 .. v11}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object v5, v9

    const/16 v2, 0xc

    int-to-float v2, v2

    const/4 v3, 0x0

    invoke-static {v2, v12, v15, v5, v3}, Lm4/a;->u(FFLb2/t;Lp1/q;Z)V

    :goto_7
    invoke-virtual {v1}, Lk90/c;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    sget v3, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v2, v5, v3}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    sget-object v4, Lx81/d;->a:Lx81/d;

    sget v6, Lx81/d;->b:I

    invoke-virtual {v4, v5, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->c1()J

    move-result-wide v7

    move v9, v14

    new-instance v14, Lw3/k;

    const/4 v10, 0x3

    invoke-direct {v14, v10}, Lw3/k;-><init>(I)V

    invoke-virtual {v1}, Lk90/c;->e()Lk90/d;

    move-result-object v11

    const/4 v12, 0x0

    invoke-static {v11, v5, v12}, Lk90/b;->f(Lk90/d;Landroidx/compose/runtime/Composer;I)Lb91/a;

    move-result-object v22

    sget v11, Lb91/a;->d:I

    shl-int/lit8 v26, v11, 0x12

    const v27, 0x2fdfa

    move v11, v3

    const/4 v3, 0x0

    move-object v13, v4

    move-object/from16 v24, v5

    move-wide v4, v7

    move v8, v6

    const-wide/16 v6, 0x0

    move/from16 v16, v8

    const/4 v8, 0x0

    move/from16 v17, v9

    const/4 v9, 0x0

    move/from16 v18, v10

    const/4 v10, 0x0

    move/from16 v19, v11

    move/from16 v20, v12

    const-wide/16 v11, 0x0

    move-object/from16 v21, v13

    const/4 v13, 0x0

    move-object/from16 v25, v15

    move/from16 v23, v16

    const-wide/16 v15, 0x0

    move/from16 v29, v17

    const/16 v17, 0x0

    move/from16 v30, v18

    const/16 v18, 0x0

    move/from16 v31, v19

    const/16 v19, 0x0

    move/from16 v32, v20

    const/16 v20, 0x0

    move-object/from16 v33, v21

    const/16 v21, 0x0

    move/from16 v34, v23

    const/16 v23, 0x0

    move-object/from16 v35, v25

    const/16 v25, 0x0

    move-object/from16 p1, v0

    move/from16 v1, v29

    move/from16 v36, v34

    move-object/from16 v0, v35

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v24

    int-to-float v1, v1

    mul-float v8, v28, v1

    invoke-static {v8, v0}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v5, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p0 .. p0}, Lk90/c;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    move/from16 v11, v31

    invoke-static {v0, v5, v11}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v13, v33

    move/from16 v8, v36

    invoke-virtual {v13, v5, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v0

    new-instance v14, Lw3/k;

    const/4 v3, 0x3

    invoke-direct {v14, v3}, Lw3/k;-><init>(I)V

    invoke-virtual/range {p0 .. p0}, Lk90/c;->b()Lk90/d;

    move-result-object v3

    const/4 v12, 0x0

    invoke-static {v3, v5, v12}, Lk90/b;->f(Lk90/d;Landroidx/compose/runtime/Composer;I)Lb91/a;

    move-result-object v22

    const/4 v3, 0x0

    const/4 v8, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    move-wide v4, v0

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v24

    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v5, v0}, Lp1/q;->q(Z)V

    :goto_8
    move-object/from16 v3, p1

    goto :goto_9

    :cond_d
    invoke-virtual {v5}, Lp1/q;->X()V

    goto :goto_8

    :goto_9
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_e

    new-instance v0, Lio2/k0;

    const/16 v5, 0xa

    move-object/from16 v1, p0

    move/from16 v2, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lio2/k0;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_e
    return-void
.end method

.method private static final d(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Lk90/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lk90/b;->c(Lk90/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Lk90/d;Landroidx/compose/runtime/Composer;I)Lb91/a;
    .locals 1

    sget-object p2, Lk90/b$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, p2, p0

    const/4 p2, 0x1

    const/4 v0, 0x0

    if-eq p0, p2, :cond_1

    const/4 p2, 0x2

    if-ne p0, p2, :cond_0

    check-cast p1, Lp1/q;

    const p0, -0x47c85281

    invoke-virtual {p1, p0}, Lp1/q;->e0(I)V

    sget-object p0, Lx81/d;->a:Lx81/d;

    sget p2, Lx81/d;->b:I

    invoke-virtual {p0, p1, p2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object p0

    invoke-virtual {p0}, Lb91/d;->O()Lb91/a;

    move-result-object p0

    invoke-virtual {p1, v0}, Lp1/q;->q(Z)V

    goto :goto_0

    :cond_0
    const p0, -0x47c86145

    check-cast p1, Lp1/q;

    invoke-static {p0, p1, v0}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object p0

    throw p0

    :cond_1
    check-cast p1, Lp1/q;

    const p0, -0x47c85981

    invoke-virtual {p1, p0}, Lp1/q;->e0(I)V

    sget-object p0, Lx81/d;->a:Lx81/d;

    sget p2, Lx81/d;->b:I

    invoke-virtual {p0, p1, p2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object p0

    invoke-virtual {p0}, Lb91/d;->a()Lb91/a;

    move-result-object p0

    invoke-virtual {p1, v0}, Lp1/q;->q(Z)V

    :goto_0
    return-object p0
.end method
