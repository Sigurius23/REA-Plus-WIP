.class public abstract Lid2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a5\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005H\u0007\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "",
        "enabled",
        "Lkotlin/Function1;",
        "Ll83/a0;",
        "onToggle",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "b",
        "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V",
        "share_release"
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
.method public static synthetic a(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lid2/b;->c(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 38
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p1

    move/from16 v8, p4

    const-string v0, "onToggle"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v5, p3

    check-cast v5, Lp1/q;

    const v0, 0x47fd7ba0    # 129783.25f

    invoke-virtual {v5, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v8, 0x6

    if-nez v0, :cond_1

    move/from16 v0, p0

    invoke-virtual {v5, v0}, Lp1/q;->h(Z)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v8

    goto :goto_1

    :cond_1
    move/from16 v0, p0

    move v2, v8

    :goto_1
    and-int/lit8 v3, v8, 0x30

    if-nez v3, :cond_3

    invoke-virtual {v5, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v2, v3

    :cond_3
    and-int/lit8 v3, p5, 0x4

    if-eqz v3, :cond_5

    or-int/lit16 v2, v2, 0x180

    :cond_4
    move-object/from16 v4, p2

    goto :goto_4

    :cond_5
    and-int/lit16 v4, v8, 0x180

    if-nez v4, :cond_4

    move-object/from16 v4, p2

    invoke-virtual {v5, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_6

    const/16 v6, 0x100

    goto :goto_3

    :cond_6
    const/16 v6, 0x80

    :goto_3
    or-int/2addr v2, v6

    :goto_4
    and-int/lit16 v6, v2, 0x93

    const/16 v7, 0x92

    const/4 v9, 0x0

    const/4 v10, 0x1

    if-eq v6, v7, :cond_7

    move v6, v10

    goto :goto_5

    :cond_7
    move v6, v9

    :goto_5
    and-int/lit8 v7, v2, 0x1

    invoke-virtual {v5, v7, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_c

    sget-object v6, Lb2/t;->w:Lb2/t;

    if-eqz v3, :cond_8

    move-object v3, v6

    goto :goto_6

    :cond_8
    move-object v3, v4

    :goto_6
    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v4, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    int-to-float v11, v10

    const/16 v12, 0x8

    int-to-float v12, v12

    mul-float/2addr v11, v12

    invoke-static {v7, v11, v11}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v12, Ll0/m;->a:Ll0/e;

    sget-object v13, Lb2/e;->K:Lb2/l;

    const/16 v14, 0x36

    invoke-static {v12, v13, v5, v14}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v12

    iget-wide v13, v5, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v5, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v15, La3/l;->a:La3/k;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v4, v5, Lp1/q;->S:Z

    if-eqz v4, :cond_9

    invoke-virtual {v5, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_9
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_7
    sget-object v4, La3/k;->g:La3/i;

    invoke-static {v5, v4, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v5, v4, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v12, v5, Lp1/q;->S:Z

    if-nez v12, :cond_a

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v12, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_b

    :cond_a
    invoke-static {v13, v5, v13, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v5, v4, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v4, 0x3f99999a    # 1.2f

    invoke-static {v4, v6}, Ldt/b;->N(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v7, Lx81/d;->a:Lx81/d;

    sget v12, Lx81/d;->b:I

    invoke-virtual {v7, v5, v12}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v13

    invoke-virtual {v13}, Ly81/i;->y()J

    move-result-wide v13

    invoke-virtual {v7, v5, v12}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v15

    invoke-virtual {v15}, Ly81/i;->X()J

    move-result-wide v15

    invoke-virtual {v7, v5, v12}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, Ly81/i;->y()J

    move-result-wide v17

    invoke-virtual {v7, v5, v12}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v19

    invoke-virtual/range {v19 .. v19}, Ly81/i;->W0()J

    move-result-wide v19

    const-wide/16 v25, 0x0

    const/16 v28, 0x3e4

    move/from16 v21, v10

    move-wide/from16 v36, v13

    move v14, v9

    move-wide/from16 v9, v36

    const/4 v13, 0x0

    move/from16 v22, v14

    move-wide/from16 v36, v15

    move/from16 v16, v11

    move-wide/from16 v14, v17

    move/from16 v17, v12

    move-wide/from16 v11, v36

    const/16 v18, 0x0

    move/from16 v23, v16

    move/from16 v24, v17

    move-wide/from16 v16, v19

    const-wide/16 v19, 0x0

    move/from16 v29, v21

    move/from16 v27, v22

    const-wide/16 v21, 0x0

    move/from16 v30, v23

    move/from16 v31, v24

    const-wide/16 v23, 0x0

    move/from16 v36, v27

    move-object/from16 v27, v5

    move/from16 v5, v36

    invoke-static/range {v9 .. v28}, Ltx/f;->A(JJFJJFJJJJLandroidx/compose/runtime/Composer;I)Lg1/x1;

    move-result-object v9

    and-int/lit8 v10, v2, 0xe

    or-int/lit16 v10, v10, 0x180

    and-int/lit8 v2, v2, 0x70

    or-int/2addr v2, v10

    move-object v10, v7

    const/16 v7, 0x18

    move-object v11, v3

    const/4 v3, 0x0

    move v14, v5

    move-object v13, v6

    move-object/from16 v35, v11

    move-object/from16 v5, v27

    move/from16 v11, v30

    const/high16 v12, 0x3f800000    # 1.0f

    move v6, v2

    move-object v2, v4

    move-object v4, v9

    move/from16 v9, v31

    invoke-static/range {v0 .. v7}, Lg1/r7;->a(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLg1/o7;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v11, v13}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v5, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    sget v0, Lad2/a;->h:I

    invoke-static {v0, v5, v14}, Lcom/whoop/design/util/b;->g(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v5, v9}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v1

    invoke-virtual {v1}, Lb91/d;->a()Lb91/a;

    move-result-object v29

    invoke-virtual {v10, v5, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->y()J

    move-result-wide v1

    invoke-static {v12}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v30

    sget v3, Lb91/a;->d:I

    shl-int/lit8 v3, v3, 0x12

    const/high16 v4, 0xc00000

    or-int v33, v3, v4

    const v34, 0xfffa

    const/4 v10, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const-wide/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v32, 0x0

    move-object v9, v0

    move-wide v11, v1

    move-object/from16 v31, v5

    invoke-static/range {v9 .. v34}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Lp1/q;->q(Z)V

    move-object/from16 v3, v35

    goto :goto_8

    :cond_c
    invoke-virtual {v5}, Lp1/q;->X()V

    move-object v3, v4

    :goto_8
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_d

    new-instance v0, Lid2/a;

    const/4 v6, 0x0

    move/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v5, p5

    move v4, v8

    invoke-direct/range {v0 .. v6}, Lid2/a;-><init>(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_d
    return-void
.end method

.method private static final c(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lid2/b;->b(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
