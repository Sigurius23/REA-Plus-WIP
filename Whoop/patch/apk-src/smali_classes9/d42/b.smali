.class public abstract Ld42/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a3\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lc42/c;",
        "exitDialogViewState",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onSharingExperience",
        "onSkippingSharing",
        "d",
        "(Lc42/c;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V",
        "pregnancy_release"
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
.method public static synthetic a(Lc42/c;Lc93/a;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Ld42/b;->g(Lc42/c;Lc93/a;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ld42/b;->e(Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lc93/a;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Ld42/b;->f(Lc93/a;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lc42/c;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 44
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc42/c;",
            "Lc93/a;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    const-string v0, "exitDialogViewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onSharingExperience"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onSkippingSharing"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v14, p3

    check-cast v14, Lp1/q;

    const v0, -0x2bd1edb8

    invoke-virtual {v14, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v4, 0x6

    const/4 v6, 0x4

    if-nez v0, :cond_2

    and-int/lit8 v0, v4, 0x8

    if-nez v0, :cond_0

    invoke-virtual {v14, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v14, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    move v0, v6

    goto :goto_1

    :cond_1
    const/4 v0, 0x2

    :goto_1
    or-int/2addr v0, v4

    goto :goto_2

    :cond_2
    move v0, v4

    :goto_2
    and-int/lit8 v7, v4, 0x30

    if-nez v7, :cond_4

    invoke-virtual {v14, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    const/16 v7, 0x20

    goto :goto_3

    :cond_3
    const/16 v7, 0x10

    :goto_3
    or-int/2addr v0, v7

    :cond_4
    and-int/lit16 v7, v4, 0x180

    if-nez v7, :cond_6

    invoke-virtual {v14, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    const/16 v7, 0x100

    goto :goto_4

    :cond_5
    const/16 v7, 0x80

    :goto_4
    or-int/2addr v0, v7

    :cond_6
    and-int/lit16 v7, v0, 0x93

    const/16 v8, 0x92

    const/4 v9, 0x0

    if-eq v7, v8, :cond_7

    const/4 v7, 0x1

    goto :goto_5

    :cond_7
    move v7, v9

    :goto_5
    and-int/lit8 v8, v0, 0x1

    invoke-virtual {v14, v8, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_17

    const/high16 v7, 0x3f800000    # 1.0f

    sget-object v8, Lb2/t;->w:Lb2/t;

    invoke-static {v7, v8}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    int-to-float v6, v6

    const/16 v12, 0x8

    int-to-float v12, v12

    mul-float v7, v6, v12

    invoke-static {v7, v11}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v11, Lb2/e;->w:Lb2/m;

    invoke-static {v11, v9}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v11

    iget-wide v9, v14, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v14, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v18, La3/l;->a:La3/k;

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v14}, Lp1/q;->i0()V

    iget-boolean v15, v14, Lp1/q;->S:Z

    if-eqz v15, :cond_8

    invoke-virtual {v14, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_8
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_6
    sget-object v15, La3/k;->g:La3/i;

    invoke-static {v14, v15, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->f:La3/i;

    invoke-static {v14, v11, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, La3/k;->j:La3/i;

    iget-boolean v5, v14, Lp1/q;->S:Z

    if-nez v5, :cond_9

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v5, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    :cond_9
    invoke-static {v9, v14, v9, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_a
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v14, v1, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, Lb2/e;->E:Lb2/m;

    sget-object v7, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    invoke-virtual {v7, v8, v5}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const/4 v9, 0x2

    int-to-float v9, v9

    mul-float/2addr v12, v9

    invoke-static {v12}, Ll0/m;->i(F)Ll0/k;

    move-result-object v12

    sget-object v4, Lb2/e;->M:Lb2/k;

    const/4 v3, 0x6

    invoke-static {v12, v4, v14, v3}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v4

    move-object v12, v4

    iget-wide v3, v14, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v14, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v14}, Lp1/q;->i0()V

    move/from16 v20, v6

    iget-boolean v6, v14, Lp1/q;->S:Z

    if-eqz v6, :cond_b

    invoke-virtual {v14, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_b
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_7
    invoke-static {v14, v15, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v14, v11, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v14, Lp1/q;->S:Z

    if-nez v4, :cond_c

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_d

    :cond_c
    invoke-static {v3, v14, v3, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_d
    invoke-static {v14, v1, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, Lx81/d;->a:Lx81/d;

    invoke-virtual {v3}, Lx81/d;->d()Lgz0/o0;

    move-result-object v4

    invoke-virtual {v4}, Lgz0/o0;->a()Lgz0/a;

    move-result-object v4

    invoke-virtual {v4}, Lgz0/a;->b()I

    move-result v4

    const/4 v5, 0x6

    invoke-static {v4, v14, v5}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v4

    int-to-float v6, v5

    mul-float v6, v6, v20

    invoke-static {v6, v8}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget v6, Lx81/d;->b:I

    invoke-virtual {v3, v14, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v12

    invoke-virtual {v12}, Ly81/i;->a()J

    move-result-wide v21

    move-object v12, v11

    const/16 v11, 0x1b0

    move-object/from16 v23, v12

    const/4 v12, 0x0

    move/from16 v24, v6

    const-string v6, ""

    move-object/from16 v16, v14

    move-object v14, v10

    move-object/from16 v10, v16

    move-object/from16 v33, v7

    move-object/from16 v32, v8

    move-object/from16 v16, v13

    move/from16 v13, v24

    move-object v7, v5

    move-object v5, v4

    move v4, v9

    move-wide/from16 v8, v21

    invoke-static/range {v5 .. v12}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-virtual/range {p0 .. p0}, Lc42/c;->f()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    sget v6, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v5, v10, v6}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v10, v13}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->b1()J

    move-result-wide v7

    invoke-virtual {v3, v10, v13}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v9

    invoke-virtual {v9}, Lb91/d;->r()Lb91/a;

    move-result-object v25

    sget v9, Lb91/a;->d:I

    shl-int/lit8 v29, v9, 0x12

    const v30, 0x2fffa

    move v9, v6

    const/4 v6, 0x0

    move v11, v9

    move-object/from16 v27, v10

    const-wide/16 v9, 0x0

    move v12, v11

    const/4 v11, 0x0

    move/from16 v17, v12

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object/from16 v22, v14

    move-object/from16 v21, v15

    const-wide/16 v14, 0x0

    move-object/from16 v26, v16

    const/16 v16, 0x0

    move/from16 v28, v17

    const/16 v17, 0x0

    const/16 v34, 0x100

    const/16 v35, 0x20

    const-wide/16 v18, 0x0

    move/from16 v36, v20

    const/16 v20, 0x0

    move-object/from16 v37, v21

    const/16 v21, 0x0

    move-object/from16 v38, v22

    const/16 v22, 0x0

    move-object/from16 v39, v23

    const/16 v23, 0x0

    move/from16 v40, v24

    const/16 v24, 0x0

    move-object/from16 v41, v26

    const/16 v26, 0x0

    move/from16 v42, v28

    const/16 v28, 0x0

    move/from16 v43, v0

    move-object/from16 v35, v1

    move/from16 v34, v4

    move-object/from16 v4, v37

    move/from16 v1, v40

    move-object/from16 v0, v41

    move/from16 v2, v42

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v27

    invoke-virtual/range {p0 .. p0}, Lc42/c;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-static {v5, v10, v2}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v10, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->y()J

    move-result-wide v7

    invoke-virtual {v3, v10, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v6

    invoke-virtual {v6}, Lb91/d;->O()Lb91/a;

    move-result-object v25

    const/4 v6, 0x0

    const-wide/16 v9, 0x0

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v27

    invoke-virtual/range {p0 .. p0}, Lc42/c;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-static {v5, v10, v2}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v10, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->b1()J

    move-result-wide v7

    invoke-virtual {v3, v10, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v6

    invoke-virtual {v6}, Lb91/d;->a()Lb91/a;

    move-result-object v25

    const/4 v6, 0x0

    const-wide/16 v9, 0x0

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v27

    invoke-virtual/range {p0 .. p0}, Lc42/c;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-static {v5, v10, v2}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v10, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->b1()J

    move-result-wide v7

    invoke-virtual {v3, v10, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v6

    invoke-virtual {v6}, Lb91/d;->a()Lb91/a;

    move-result-object v25

    const/4 v6, 0x0

    const-wide/16 v9, 0x0

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v27

    const/4 v5, 0x1

    invoke-virtual {v10, v5}, Lp1/q;->q(Z)V

    sget-object v6, Lb2/e;->H:Lb2/m;

    move-object/from16 v7, v32

    move-object/from16 v8, v33

    invoke-virtual {v8, v7, v6}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v8, Lb2/e;->N:Lb2/k;

    sget-object v9, Ll0/m;->c:Ll0/g;

    const/16 v11, 0x30

    invoke-static {v9, v8, v10, v11}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v8

    iget-wide v11, v10, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v10, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v12, v10, Lp1/q;->S:Z

    if-eqz v12, :cond_e

    invoke-virtual {v10, v0}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_e
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_8
    invoke-static {v10, v4, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v12, v39

    invoke-static {v10, v12, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v10, Lp1/q;->S:Z

    if-nez v0, :cond_f

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_10

    :cond_f
    move-object/from16 v14, v38

    goto :goto_a

    :cond_10
    :goto_9
    move-object/from16 v0, v35

    goto :goto_b

    :goto_a
    invoke-static {v9, v10, v9, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_9

    :goto_b
    invoke-static {v10, v0, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0, v7}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v6, Lny0/v;->TextLarge:Lny0/v;

    invoke-virtual/range {p0 .. p0}, Lc42/c;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-static {v4, v10, v2}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v10, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->a()J

    move-result-wide v8

    and-int/lit8 v1, v43, 0x70

    const/16 v3, 0x20

    if-ne v1, v3, :cond_11

    move v1, v5

    goto :goto_c

    :cond_11
    const/4 v1, 0x0

    :goto_c
    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    sget-object v11, Lp1/l;->a:Lp1/v0;

    if-nez v1, :cond_13

    if-ne v3, v11, :cond_12

    goto :goto_d

    :cond_12
    move-object/from16 v12, p1

    goto :goto_e

    :cond_13
    :goto_d
    new-instance v3, La31/e;

    const/16 v1, 0x12

    move-object/from16 v12, p1

    invoke-direct {v3, v12, v1}, La31/e;-><init>(Lc93/a;I)V

    invoke-virtual {v10, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_e
    move-object v13, v3

    check-cast v13, Lc93/a;

    const/16 v15, 0x36

    const/16 v16, 0x68

    move-object/from16 v27, v10

    move-wide v9, v8

    const/4 v8, 0x0

    move-object v1, v11

    const/4 v11, 0x0

    const/4 v12, 0x0

    move v3, v5

    move-object v5, v0

    move v0, v3

    move-object v3, v7

    move-object/from16 v14, v27

    move-object v7, v4

    invoke-static/range {v5 .. v16}, Lny0/u;->h(Landroidx/compose/ui/Modifier;Lny0/v;Ljava/lang/String;ZJLi2/t;ZLc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object v10, v14

    move/from16 v5, v34

    move/from16 v4, v36

    invoke-static {v5, v4, v3, v10}, Lih0/d0;->u(FFLb2/t;Lp1/q;)V

    sget-object v6, Lny0/n0;->TextSmall:Lny0/n0;

    invoke-virtual/range {p0 .. p0}, Lc42/c;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    move/from16 v3, v43

    and-int/lit16 v3, v3, 0x380

    const/16 v4, 0x100

    if-ne v3, v4, :cond_14

    move v9, v0

    goto :goto_f

    :cond_14
    const/4 v9, 0x0

    :goto_f
    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v9, :cond_16

    if-ne v3, v1, :cond_15

    goto :goto_10

    :cond_15
    move-object/from16 v4, p2

    goto :goto_11

    :cond_16
    :goto_10
    new-instance v3, Laz1/b;

    const/16 v1, 0xe

    move-object/from16 v4, p2

    invoke-direct {v3, v4, v1}, Laz1/b;-><init>(Lc93/a;I)V

    invoke-virtual {v10, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_11
    move-object/from16 v17, v3

    check-cast v17, Lkotlin/jvm/functions/Function1;

    const/16 v31, 0x6

    shl-int/lit8 v1, v2, 0x6

    or-int/lit8 v19, v1, 0x30

    const/16 v20, 0x0

    const/16 v21, 0xff9

    const/4 v5, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object/from16 v27, v10

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object/from16 v18, v27

    invoke-static/range {v5 .. v21}, Lny0/l0;->i(Landroidx/compose/ui/Modifier;Lny0/n0;Lcom/whoop/design/util/TextResource;Ly71/g;Ly71/g;ZLy81/e;Lj91/b;ZZLjava/lang/Float;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v18

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    goto :goto_12

    :cond_17
    move-object v4, v3

    move-object v10, v14

    invoke-virtual {v10}, Lp1/q;->X()V

    :goto_12
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_18

    new-instance v0, Lcy1/b;

    const/4 v5, 0x2

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object v3, v4

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lcy1/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_18
    return-void
.end method

.method private static final e(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Lc93/a;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lc42/c;Lc93/a;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Ld42/b;->d(Lc42/c;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
