.class public abstract Ljk2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u001aK\u0010\t\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007H\u0007\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lik2/b;",
        "homeToolbarViewState",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "startArrowClick",
        "endArrowClick",
        "calendarClick",
        "",
        "isUpdating",
        "b",
        "(Lik2/b;Lc93/a;Lc93/a;Lc93/a;ZLandroidx/compose/runtime/Composer;II)V",
        "home_release"
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
.method public static synthetic a(Lik2/b;Lc93/a;Lc93/a;Lc93/a;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Ljk2/a;->c(Lik2/b;Lc93/a;Lc93/a;Lc93/a;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lik2/b;Lc93/a;Lc93/a;Lc93/a;ZLandroidx/compose/runtime/Composer;II)V
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lik2/b;",
            "Lc93/a;",
            "Lc93/a;",
            "Lc93/a;",
            "Z",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v6, p6

    const-string v0, "homeToolbarViewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "startArrowClick"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "endArrowClick"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "calendarClick"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p5

    check-cast v0, Lp1/q;

    const v5, -0x55ce7aec

    invoke-virtual {v0, v5}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v5, v6, 0x6

    const/4 v7, 0x4

    if-nez v5, :cond_2

    and-int/lit8 v5, v6, 0x8

    if-nez v5, :cond_0

    invoke-virtual {v0, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    :goto_0
    if-eqz v5, :cond_1

    move v5, v7

    goto :goto_1

    :cond_1
    const/4 v5, 0x2

    :goto_1
    or-int/2addr v5, v6

    goto :goto_2

    :cond_2
    move v5, v6

    :goto_2
    and-int/lit8 v9, v6, 0x30

    if-nez v9, :cond_4

    invoke-virtual {v0, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_3

    const/16 v9, 0x20

    goto :goto_3

    :cond_3
    const/16 v9, 0x10

    :goto_3
    or-int/2addr v5, v9

    :cond_4
    and-int/lit16 v9, v6, 0x180

    if-nez v9, :cond_6

    invoke-virtual {v0, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_5

    const/16 v9, 0x100

    goto :goto_4

    :cond_5
    const/16 v9, 0x80

    :goto_4
    or-int/2addr v5, v9

    :cond_6
    and-int/lit16 v9, v6, 0xc00

    if-nez v9, :cond_8

    invoke-virtual {v0, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    const/16 v9, 0x800

    goto :goto_5

    :cond_7
    const/16 v9, 0x400

    :goto_5
    or-int/2addr v5, v9

    :cond_8
    and-int/lit8 v9, p7, 0x10

    if-eqz v9, :cond_a

    or-int/lit16 v5, v5, 0x6000

    :cond_9
    move/from16 v10, p4

    goto :goto_7

    :cond_a
    and-int/lit16 v10, v6, 0x6000

    if-nez v10, :cond_9

    move/from16 v10, p4

    invoke-virtual {v0, v10}, Lp1/q;->h(Z)Z

    move-result v11

    if-eqz v11, :cond_b

    const/16 v11, 0x4000

    goto :goto_6

    :cond_b
    const/16 v11, 0x2000

    :goto_6
    or-int/2addr v5, v11

    :goto_7
    and-int/lit16 v11, v5, 0x2493

    const/16 v12, 0x2492

    if-eq v11, v12, :cond_c

    const/4 v11, 0x1

    goto :goto_8

    :cond_c
    const/4 v11, 0x0

    :goto_8
    and-int/lit8 v12, v5, 0x1

    invoke-virtual {v0, v12, v11}, Lp1/q;->U(IZ)Z

    move-result v11

    if-eqz v11, :cond_18

    if-eqz v9, :cond_d

    const/4 v10, 0x0

    :cond_d
    const/16 v9, 0x8

    int-to-float v9, v9

    int-to-float v7, v7

    mul-float v11, v9, v7

    sget-object v12, Lb2/t;->w:Lb2/t;

    invoke-static {v11, v12}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v15, Lx81/d;->a:Lx81/d;

    sget v14, Lx81/d;->b:I

    invoke-virtual {v15, v0, v14}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v16

    move/from16 p4, v14

    invoke-virtual/range {v16 .. v16}, Ly81/i;->a1()J

    move-result-wide v13

    const/4 v8, 0x3

    move/from16 v17, v5

    int-to-float v5, v8

    mul-float/2addr v5, v7

    move/from16 v18, v8

    invoke-static {v5}, Lt0/j;->e(F)Lt0/i;

    move-result-object v8

    invoke-static {v11, v13, v14, v8}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    const-wide/high16 v13, 0x3fe0000000000000L    # 0.5

    double-to-float v11, v13

    mul-float/2addr v11, v9

    const/4 v13, 0x0

    const/4 v14, 0x2

    invoke-static {v8, v11, v13, v14}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v14, Lb2/e;->E:Lb2/m;

    move/from16 v19, v5

    const/4 v13, 0x0

    invoke-static {v14, v13}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v5

    move v13, v7

    iget-wide v6, v0, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v0, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v20, La3/l;->a:La3/k;

    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move/from16 v20, v9

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    move/from16 v21, v10

    iget-boolean v10, v0, Lp1/q;->S:Z

    if-eqz v10, :cond_e

    invoke-virtual {v0, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_e
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_9
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v0, v10, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v0, v5, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    move/from16 v22, v13

    iget-boolean v13, v0, Lp1/q;->S:Z

    if-nez v13, :cond_f

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v13, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_10

    :cond_f
    invoke-static {v6, v0, v6, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_10
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v0, v3, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {v6, v12}, Landroidx/compose/foundation/layout/d;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    const/4 v6, 0x2

    const/4 v13, 0x0

    invoke-static {v8, v11, v13, v6}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v6, Lb2/e;->K:Lb2/l;

    invoke-static/range {v22 .. v22}, Ll0/m;->i(F)Ll0/k;

    move-result-object v11

    const/16 v13, 0x36

    invoke-static {v11, v6, v0, v13}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v6

    move-object v11, v14

    iget-wide v13, v0, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v0, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v0}, Lp1/q;->i0()V

    move-object/from16 v23, v11

    iget-boolean v11, v0, Lp1/q;->S:Z

    if-eqz v11, :cond_11

    invoke-virtual {v0, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_11
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_a
    invoke-static {v0, v10, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v0, v5, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v6, v0, Lp1/q;->S:Z

    if-nez v6, :cond_12

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v6, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_13

    :cond_12
    invoke-static {v13, v0, v13, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_13
    invoke-static {v0, v3, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget v6, Lcom/whoop/design/util/TextResource;->$stable:I

    sget v8, Lkd1/o;->a:I

    or-int/2addr v6, v8

    sget v8, Lb11/h;->e:I

    or-int/2addr v6, v8

    and-int/lit8 v8, v17, 0xe

    or-int/2addr v8, v6

    and-int/lit8 v11, v17, 0x70

    or-int/2addr v11, v8

    invoke-static {v1, v2, v0, v11}, Ljk2/c;->l(Lik2/b;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    const/high16 v11, 0x3f800000    # 1.0f

    invoke-static {v11, v12}, Landroidx/compose/foundation/layout/d;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    move/from16 v12, p4

    invoke-virtual {v15, v0, v12}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v13

    invoke-virtual {v13}, Ly81/i;->W0()J

    move-result-wide v13

    invoke-static/range {v19 .. v19}, Lt0/j;->e(F)Lt0/i;

    move-result-object v2

    invoke-static {v11, v13, v14, v2}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/4 v14, 0x2

    int-to-float v11, v14

    mul-float v11, v11, v20

    const/4 v13, 0x0

    invoke-static {v2, v11, v13, v14}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    move-object/from16 v11, v23

    const/4 v13, 0x0

    invoke-static {v11, v13}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v11

    iget-wide v13, v0, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v0, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v0}, Lp1/q;->i0()V

    move/from16 p4, v6

    iget-boolean v6, v0, Lp1/q;->S:Z

    if-eqz v6, :cond_14

    invoke-virtual {v0, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_b

    :cond_14
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_b
    invoke-static {v0, v10, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v0, v5, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v5, v0, Lp1/q;->S:Z

    if-nez v5, :cond_15

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_16

    :cond_15
    invoke-static {v13, v0, v13, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_16
    invoke-static {v0, v3, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v2, 0x6

    if-eqz v21, :cond_17

    const v3, 0x54e340da

    invoke-virtual {v0, v3}, Lp1/q;->e0(I)V

    const/4 v3, 0x5

    int-to-float v3, v3

    mul-float v3, v3, v22

    invoke-static {v3, v0, v2}, Ljk2/c;->p(FLandroidx/compose/runtime/Composer;I)V

    const/4 v13, 0x0

    invoke-virtual {v0, v13}, Lp1/q;->q(Z)V

    :goto_c
    const/4 v2, 0x1

    goto :goto_d

    :cond_17
    const v3, 0x54e4650d

    invoke-virtual {v0, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v15, v0, v12}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->s()Lb91/a;

    move-result-object v3

    shr-int/lit8 v5, v17, 0x9

    and-int/lit8 v5, v5, 0xe

    shl-int/lit8 v6, p4, 0x3

    or-int/2addr v5, v6

    shl-int/lit8 v6, v17, 0x3

    and-int/lit8 v6, v6, 0x70

    or-int/2addr v5, v6

    sget v6, Lb91/a;->d:I

    shl-int/lit8 v2, v6, 0x6

    or-int/2addr v2, v5

    invoke-static {v4, v1, v3, v0, v2}, Ljk2/c;->j(Lc93/a;Lik2/b;Lb91/a;Landroidx/compose/runtime/Composer;I)V

    const/4 v13, 0x0

    invoke-virtual {v0, v13}, Lp1/q;->q(Z)V

    goto :goto_c

    :goto_d
    invoke-virtual {v0, v2}, Lp1/q;->q(Z)V

    shr-int/lit8 v3, v17, 0x3

    and-int/lit8 v3, v3, 0x70

    or-int/2addr v3, v8

    move-object/from16 v5, p2

    invoke-static {v1, v5, v0, v3}, Ljk2/c;->n(Lik2/b;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v0, v2}, Lp1/q;->q(Z)V

    invoke-virtual {v0, v2}, Lp1/q;->q(Z)V

    move/from16 v10, v21

    goto :goto_e

    :cond_18
    move-object v5, v3

    invoke-virtual {v0}, Lp1/q;->X()V

    :goto_e
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_19

    new-instance v0, Lh01/k;

    move-object/from16 v2, p1

    move/from16 v6, p6

    move/from16 v7, p7

    move-object v3, v5

    move v5, v10

    invoke-direct/range {v0 .. v7}, Lh01/k;-><init>(Lik2/b;Lc93/a;Lc93/a;Lc93/a;ZII)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_19
    return-void
.end method

.method private static final c(Lik2/b;Lc93/a;Lc93/a;Lc93/a;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, Lp1/x;->L(I)I

    move-result v6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move v7, p6

    move-object v5, p7

    invoke-static/range {v0 .. v7}, Ljk2/a;->b(Lik2/b;Lc93/a;Lc93/a;Lc93/a;ZLandroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
