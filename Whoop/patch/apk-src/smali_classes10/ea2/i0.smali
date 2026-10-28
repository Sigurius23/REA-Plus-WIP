.class public abstract Lea2/i0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0006\u001a\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a1\u0010\n\u001a\u00020\u00062\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u0008H\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a-\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000e\u001a\u00020\u000c2\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H\u0003\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/whoop/navigation/DrawerPresentation;",
        "preset",
        "Lep0/j;",
        "o",
        "(Lcom/whoop/navigation/DrawerPresentation;)Lep0/j;",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onBackClick",
        "Lkotlin/Function1;",
        "onPresetSelected",
        "j",
        "(Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "",
        "title",
        "subtitle",
        "onClick",
        "g",
        "(Ljava/lang/String;Ljava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;I)V",
        "app_prodStandardRelease"
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
.method public static synthetic a(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lea2/i0;->k(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lc93/a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lea2/i0;->n(Lc93/a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljava/lang/String;Ljava/lang/String;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lea2/i0;->i(Ljava/lang/String;Ljava/lang/String;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lea2/i0;->h(Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lea2/i0;->m(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lea2/i0;->l(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final g(Ljava/lang/String;Ljava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 30
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v3, p2

    move/from16 v4, p4

    move-object/from16 v0, p3

    check-cast v0, Lp1/q;

    const v1, -0x47da65af

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v4, 0x6

    const/4 v2, 0x4

    if-nez v1, :cond_1

    move-object/from16 v1, p0

    invoke-virtual {v0, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    move v5, v2

    goto :goto_0

    :cond_0
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v4

    goto :goto_1

    :cond_1
    move-object/from16 v1, p0

    move v5, v4

    :goto_1
    and-int/lit8 v6, v4, 0x30

    const/16 v7, 0x10

    if-nez v6, :cond_3

    move-object/from16 v6, p1

    invoke-virtual {v0, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2

    const/16 v8, 0x20

    goto :goto_2

    :cond_2
    move v8, v7

    :goto_2
    or-int/2addr v5, v8

    goto :goto_3

    :cond_3
    move-object/from16 v6, p1

    :goto_3
    and-int/lit16 v8, v4, 0x180

    const/16 v9, 0x100

    if-nez v8, :cond_5

    invoke-virtual {v0, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    move v8, v9

    goto :goto_4

    :cond_4
    const/16 v8, 0x80

    :goto_4
    or-int/2addr v5, v8

    :cond_5
    and-int/lit16 v8, v5, 0x93

    const/16 v10, 0x92

    const/4 v12, 0x1

    if-eq v8, v10, :cond_6

    move v8, v12

    goto :goto_5

    :cond_6
    const/4 v8, 0x0

    :goto_5
    and-int/lit8 v10, v5, 0x1

    invoke-virtual {v0, v10, v8}, Lp1/q;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_d

    sget-object v8, Lb2/t;->w:Lb2/t;

    const/high16 v10, 0x3f800000    # 1.0f

    invoke-static {v10, v8}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    const/16 v10, 0xc

    int-to-float v13, v10

    invoke-static {v13}, Lt0/j;->e(F)Lt0/i;

    move-result-object v13

    invoke-static {v8, v13}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-wide v13, Li2/x;->f:J

    const v15, 0x3da3d70a    # 0.08f

    invoke-static {v15, v13, v14}, Li2/x;->c(FJ)J

    move-result-wide v10

    sget-object v15, Li2/w0;->a:Li2/v0;

    invoke-static {v8, v10, v11, v15}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v17

    and-int/lit16 v8, v5, 0x380

    if-ne v8, v9, :cond_7

    move v11, v12

    goto :goto_6

    :cond_7
    const/4 v11, 0x0

    :goto_6
    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v11, :cond_8

    sget-object v9, Lp1/l;->a:Lp1/v0;

    if-ne v8, v9, :cond_9

    :cond_8
    new-instance v8, Ld42/o;

    const/16 v9, 0xc

    invoke-direct {v8, v3, v9}, Ld42/o;-><init>(Lc93/a;I)V

    invoke-virtual {v0, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    move-object/from16 v21, v8

    check-cast v21, Lc93/a;

    const/16 v22, 0xf

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-static/range {v17 .. v22}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v8

    int-to-float v9, v7

    const/16 v10, 0xe

    int-to-float v11, v10

    new-instance v15, Ll0/l1;

    invoke-direct {v15, v9, v11, v9, v11}, Ll0/l1;-><init>(FFFF)V

    invoke-static {v15, v8}, Landroidx/compose/foundation/layout/a;->o(Ll0/k1;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    int-to-float v2, v2

    invoke-static {v2}, Ll0/m;->i(F)Ll0/k;

    move-result-object v2

    sget-object v9, Lb2/e;->M:Lb2/k;

    const/4 v11, 0x6

    invoke-static {v2, v9, v0, v11}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    iget-wide v10, v0, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v0, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v11, La3/l;->a:La3/k;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v15, v0, Lp1/q;->S:Z

    if-eqz v15, :cond_a

    invoke-virtual {v0, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_a
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_7
    sget-object v11, La3/k;->g:La3/i;

    invoke-static {v0, v11, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v0, v2, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v10, v0, Lp1/q;->S:Z

    if-nez v10, :cond_b

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_c

    :cond_b
    invoke-static {v9, v0, v9, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v0, v2, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v7}, Lv63/c;->h(I)J

    move-result-wide v9

    move v2, v12

    sget-object v12, Lp3/r;->H:Lp3/r;

    and-int/lit8 v7, v5, 0xe

    const v8, 0x30d80

    or-int v27, v7, v8

    const/16 v28, 0x0

    const v29, 0x1ffd2

    const/4 v6, 0x0

    const/4 v11, 0x0

    move-wide v7, v13

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v17, 0xc

    const/16 v16, 0x0

    move/from16 v18, v17

    const/16 v17, 0x0

    move/from16 v20, v18

    const-wide/16 v18, 0x0

    move/from16 v21, v20

    const/16 v20, 0x0

    move/from16 v22, v21

    const/16 v21, 0x0

    move/from16 v23, v22

    const/16 v22, 0x0

    move/from16 v24, v23

    const/16 v23, 0x0

    move/from16 v25, v24

    const/16 v24, 0x0

    move/from16 v26, v25

    const/16 v25, 0x0

    move/from16 p3, v26

    move-object/from16 v26, v0

    move v0, v5

    move-object v5, v1

    move v1, v2

    const/16 v2, 0xe

    invoke-static/range {v5 .. v29}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    const v5, 0x3f19999a    # 0.6f

    invoke-static {v5, v7, v8}, Li2/x;->c(FJ)J

    move-result-wide v7

    invoke-static/range {p3 .. p3}, Lv63/c;->h(I)J

    move-result-wide v9

    shr-int/lit8 v0, v0, 0x3

    and-int/2addr v0, v2

    or-int/lit16 v0, v0, 0xd80

    const v29, 0x1fff2

    const/4 v12, 0x0

    move-object/from16 v5, p1

    move/from16 v27, v0

    invoke-static/range {v5 .. v29}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v0, v26

    invoke-virtual {v0, v1}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_d
    invoke-virtual {v0}, Lp1/q;->X()V

    :goto_8
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_e

    new-instance v0, Lea2/h0;

    const/4 v5, 0x0

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    invoke-direct/range {v0 .. v5}, Lea2/h0;-><init>(Ljava/lang/String;Ljava/lang/String;Lc93/a;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_e
    return-void
.end method

.method private static final h(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Ljava/lang/String;Ljava/lang/String;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Lea2/i0;->g(Ljava/lang/String;Ljava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final j(Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 58
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v3, p0

    move-object/from16 v9, p1

    const-string v0, "onBackClick"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onPresetSelected"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v6, p2

    check-cast v6, Lp1/q;

    const v0, 0x2573957d

    invoke-virtual {v6, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v6, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int v0, p3, v0

    goto :goto_1

    :cond_1
    move/from16 v0, p3

    :goto_1
    and-int/lit8 v1, p3, 0x30

    if-nez v1, :cond_3

    invoke-virtual {v6, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v1, 0x20

    goto :goto_2

    :cond_2
    const/16 v1, 0x10

    :goto_2
    or-int/2addr v0, v1

    :cond_3
    move/from16 v36, v0

    and-int/lit8 v0, v36, 0x13

    const/16 v1, 0x12

    const/4 v14, 0x0

    if-eq v0, v1, :cond_4

    const/4 v0, 0x1

    goto :goto_3

    :cond_4
    move v0, v14

    :goto_3
    and-int/lit8 v1, v36, 0x1

    invoke-virtual {v6, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_14

    const/high16 v0, 0x3f800000    # 1.0f

    sget-object v1, Lb2/t;->w:Lb2/t;

    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v2}, Lgb1/b0;->b0(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v4, Ll0/m;->c:Ll0/g;

    sget-object v5, Lb2/e;->M:Lb2/k;

    invoke-static {v4, v5, v6, v14}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v4

    iget-wide v7, v6, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v6, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, La3/k;->b:La3/j;

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v0, v6, Lp1/q;->S:Z

    if-eqz v0, :cond_5

    invoke-virtual {v6, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_5
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_4
    sget-object v0, La3/k;->g:La3/i;

    invoke-static {v6, v0, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v6, v4, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->j:La3/i;

    iget-boolean v13, v6, Lp1/q;->S:Z

    if-nez v13, :cond_6

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v13, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_7

    :cond_6
    invoke-static {v7, v6, v7, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_7
    sget-object v13, La3/k;->d:La3/i;

    invoke-static {v6, v13, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v37, Lcom/whoop/design/atomic/organism/toolbar/d$a;

    const-string v2, "AUTO-POP HEIGHT TESTER"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v38

    invoke-static {}, Lgz0/p0;->a()Lgz0/o0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/o0;->i()Lgz0/w;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/w;->a()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v40

    const v54, 0xfffa

    const/16 v55, 0x0

    const/16 v39, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    invoke-direct/range {v37 .. v55}, Lcom/whoop/design/atomic/organism/toolbar/d$a;-><init>(Lcom/whoop/design/util/TextResource;Lo81/a;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lny0/q;Lny0/q;ZLc93/m;Ly81/f;Ly81/f;Ly81/f;Ly81/f;Lhy0/h1;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v2, Lcom/whoop/design/atomic/organism/toolbar/d$a;->r:I

    shl-int/lit8 v2, v2, 0x3

    shl-int/lit8 v7, v36, 0x9

    and-int/lit16 v7, v7, 0x1c00

    or-int/2addr v7, v2

    move-object v2, v8

    const/16 v8, 0x35

    move-object v14, v0

    const/4 v0, 0x0

    move-object/from16 v19, v2

    const/4 v2, 0x0

    move-object/from16 v20, v4

    const/4 v4, 0x0

    move-object/from16 v21, v5

    const/4 v5, 0x0

    move-object v10, v1

    move-object v15, v14

    move-object/from16 v57, v19

    move-object/from16 v56, v20

    move-object/from16 v14, v21

    move-object/from16 v1, v37

    const/high16 v12, 0x3f800000    # 1.0f

    invoke-static/range {v0 .. v8}, Lcom/whoop/design/atomic/organism/toolbar/b;->d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v12, v10}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/16 v1, 0x14

    int-to-float v1, v1

    const/16 v2, 0x18

    int-to-float v2, v2

    new-instance v4, Ll0/l1;

    invoke-direct {v4, v1, v2, v1, v2}, Ll0/l1;-><init>(FFFF)V

    invoke-static {v4, v0}, Landroidx/compose/foundation/layout/a;->o(Ll0/k1;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/16 v1, 0x10

    int-to-float v1, v1

    invoke-static {v1}, Ll0/m;->i(F)Ll0/k;

    move-result-object v1

    const/4 v2, 0x6

    invoke-static {v1, v14, v6, v2}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    iget-wide v4, v6, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v6, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v5, v6, Lp1/q;->S:Z

    if-eqz v5, :cond_8

    invoke-virtual {v6, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_8
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_5
    invoke-static {v6, v15, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v1, v56

    invoke-static {v6, v1, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v6, Lp1/q;->S:Z

    if-nez v1, :cond_9

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    :cond_9
    move-object/from16 v1, v57

    invoke-static {v2, v6, v2, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_a
    invoke-static {v6, v13, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-wide v0, Li2/x;->f:J

    const v2, 0x3f3851ec    # 0.72f

    invoke-static {v2, v0, v1}, Li2/x;->c(FJ)J

    move-result-wide v13

    const/16 v0, 0xd

    invoke-static {v0}, Lv63/c;->h(I)J

    move-result-wide v0

    const/16 v34, 0x0

    const v35, 0x1fff2

    const-string v11, "Fires an auto-pop with each drawer_presentation preset."

    const/4 v12, 0x0

    const/16 v2, 0x20

    const/16 v17, 0x0

    const/4 v4, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const-wide/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v33, 0xd86

    move-wide v15, v0

    move-object/from16 v32, v6

    const/4 v0, 0x4

    const/4 v1, 0x1

    invoke-static/range {v11 .. v35}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    int-to-float v0, v0

    invoke-static {v0, v10}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v6, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    and-int/lit8 v0, v36, 0x70

    if-ne v0, v2, :cond_b

    move v14, v1

    goto :goto_6

    :cond_b
    move v14, v4

    :goto_6
    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    sget-object v7, Lp1/l;->a:Lp1/v0;

    if-nez v14, :cond_c

    if-ne v5, v7, :cond_d

    :cond_c
    new-instance v5, Lcom/whoop/profile/view/i;

    const/16 v8, 0xe

    invoke-direct {v5, v9, v8}, Lcom/whoop/profile/view/i;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v6, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v5, Lc93/a;

    const-string v8, "HALF_SCREEN"

    const-string v10, "0.45 \u00b7 existing half drawer"

    const/16 v11, 0x36

    invoke-static {v8, v10, v5, v6, v11}, Lea2/i0;->g(Ljava/lang/String;Ljava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    if-ne v0, v2, :cond_e

    move v14, v1

    goto :goto_7

    :cond_e
    move v14, v4

    :goto_7
    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v14, :cond_f

    if-ne v5, v7, :cond_10

    :cond_f
    new-instance v5, Lcom/whoop/profile/view/i;

    const/16 v8, 0xf

    invoke-direct {v5, v9, v8}, Lcom/whoop/profile/view/i;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v6, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    check-cast v5, Lc93/a;

    const-string v8, "HOME_GAUGE_LEVEL"

    const-string v10, "0.60 \u00b7 just below the home gauges (Wake Up)"

    invoke-static {v8, v10, v5, v6, v11}, Lea2/i0;->g(Ljava/lang/String;Ljava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    if-ne v0, v2, :cond_11

    move v14, v1

    goto :goto_8

    :cond_11
    move v14, v4

    :goto_8
    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v14, :cond_12

    if-ne v0, v7, :cond_13

    :cond_12
    new-instance v0, Lcom/whoop/profile/view/i;

    const/16 v2, 0x10

    invoke-direct {v0, v9, v2}, Lcom/whoop/profile/view/i;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v6, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_13
    check-cast v0, Lc93/a;

    const-string v2, "FULL_SCREEN"

    const-string v4, "routes via shouldOpenFullSize"

    invoke-static {v2, v4, v0, v6, v11}, Lea2/i0;->g(Ljava/lang/String;Ljava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v6, v1}, Lp1/q;->q(Z)V

    invoke-virtual {v6, v1}, Lp1/q;->q(Z)V

    goto :goto_9

    :cond_14
    invoke-virtual {v6}, Lp1/q;->X()V

    :goto_9
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_15

    new-instance v1, Lea2/g0;

    const/4 v2, 0x0

    move/from16 v10, p3

    invoke-direct {v1, v3, v9, v10, v2}, Lea2/g0;-><init>(Lc93/a;Lkotlin/jvm/functions/Function1;II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_15
    return-void
.end method

.method private static final k(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lcom/whoop/navigation/DrawerPresentation;->HALF_SCREEN:Lcom/whoop/navigation/DrawerPresentation;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lcom/whoop/navigation/DrawerPresentation;->HOME_GAUGE_LEVEL:Lcom/whoop/navigation/DrawerPresentation;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lcom/whoop/navigation/DrawerPresentation;->FULL_SCREEN:Lcom/whoop/navigation/DrawerPresentation;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final n(Lc93/a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lea2/i0;->j(Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final o(Lcom/whoop/navigation/DrawerPresentation;)Lep0/j;
    .locals 21

    const-string v0, "preset"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v7, Lcom/whoop/navigation/AiAction;

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v3, "toLowerCase(...)"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "wake-up-debug-"

    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "Debug: auto-pop dispatched at "

    const-string v3, "."

    invoke-static {v2, v0, v3}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    const v19, 0xe200

    const/16 v20, 0x0

    const-string v2, "AUTOPOP"

    const/4 v3, 0x0

    const-string v4, "CHAT_WITH_AGENT"

    const-string v5, "wake-up-debug"

    const-string v6, "daily-outlook"

    move-object v1, v7

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object/from16 v18, p0

    invoke-direct/range {v1 .. v20}, Lcom/whoop/navigation/AiAction;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/ChatEntrypointExperience;Ljava/util/Map;Lcom/whoop/navigation/DrawerPresentation;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v0, Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;

    const/16 v9, 0x5f

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    move-object v7, v1

    move-object v1, v0

    invoke-direct/range {v1 .. v10}, Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;-><init>(ZLjava/lang/Boolean;Lcom/whoop/navigation/e;Lcom/whoop/coacheverywherecommon/models/CoachEducationType;Ljava/lang/String;Lcom/whoop/navigation/AiAction;Lcom/whoop/coacheverywherecommon/models/CoachEntry;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v1}, Lcom/whoop/coacheverywherecommon/models/a;->a(Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;)Lep0/j;

    move-result-object v0

    return-object v0
.end method
