.class public abstract Lny0/d1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001aw\u0010\u0012\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\n\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b2\u000e\u0008\u0002\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u000e0\u0010H\u0007\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lcom/whoop/design/util/TextResource;",
        "text",
        "Lny0/e0;",
        "type",
        "Li2/x;",
        "backgroundColor",
        "",
        "isToggled",
        "enabled",
        "Lny0/d0;",
        "buttonStyle",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "content",
        "Lkotlin/Function1;",
        "onToggle",
        "e",
        "(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lny0/e0;JZZLny0/d0;Lc93/m;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(Lcom/whoop/design/util/TextResource;Lny0/e0;ZLny0/d0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lny0/d1;->f(Lcom/whoop/design/util/TextResource;Lny0/e0;ZLny0/d0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lny0/d1;->g(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(ZLny0/d0;JLk2/e;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lny0/d1;->h(ZLny0/d0;JLk2/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lny0/e0;JZZLny0/d0;Lc93/m;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p13}, Lny0/d1;->i(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lny0/e0;JZZLny0/d0;Lc93/m;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lny0/e0;JZZLny0/d0;Lc93/m;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 28
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lcom/whoop/design/util/TextResource;",
            "Lny0/e0;",
            "JZZ",
            "Lny0/d0;",
            "Lc93/m;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v10, p9

    move/from16 v11, p11

    move/from16 v12, p12

    const-string v0, "type"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onToggle"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p10

    check-cast v0, Lp1/q;

    const v1, 0x1eec9c78

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v12, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v4, v11, 0x6

    move v5, v4

    move-object/from16 v4, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v4, v11, 0x6

    if-nez v4, :cond_2

    move-object/from16 v4, p0

    invoke-virtual {v0, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    const/4 v5, 0x4

    goto :goto_0

    :cond_1
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v11

    goto :goto_1

    :cond_2
    move-object/from16 v4, p0

    move v5, v11

    :goto_1
    and-int/lit8 v6, v11, 0x30

    if-nez v6, :cond_5

    and-int/lit8 v6, v12, 0x2

    if-nez v6, :cond_3

    move-object/from16 v6, p1

    invoke-virtual {v0, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x20

    goto :goto_2

    :cond_3
    move-object/from16 v6, p1

    :cond_4
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v5, v7

    goto :goto_3

    :cond_5
    move-object/from16 v6, p1

    :goto_3
    and-int/lit16 v7, v11, 0x180

    if-nez v7, :cond_7

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    invoke-virtual {v0, v7}, Lp1/q;->e(I)Z

    move-result v7

    if-eqz v7, :cond_6

    const/16 v7, 0x100

    goto :goto_4

    :cond_6
    const/16 v7, 0x80

    :goto_4
    or-int/2addr v5, v7

    :cond_7
    and-int/lit16 v7, v11, 0xc00

    if-nez v7, :cond_9

    and-int/lit8 v7, v12, 0x8

    move-wide/from16 v13, p3

    if-nez v7, :cond_8

    invoke-virtual {v0, v13, v14}, Lp1/q;->f(J)Z

    move-result v7

    if-eqz v7, :cond_8

    const/16 v7, 0x800

    goto :goto_5

    :cond_8
    const/16 v7, 0x400

    :goto_5
    or-int/2addr v5, v7

    goto :goto_6

    :cond_9
    move-wide/from16 v13, p3

    :goto_6
    and-int/lit8 v7, v12, 0x10

    if-eqz v7, :cond_b

    or-int/lit16 v5, v5, 0x6000

    :cond_a
    move/from16 v15, p5

    goto :goto_8

    :cond_b
    and-int/lit16 v15, v11, 0x6000

    if-nez v15, :cond_a

    move/from16 v15, p5

    invoke-virtual {v0, v15}, Lp1/q;->h(Z)Z

    move-result v16

    if-eqz v16, :cond_c

    const/16 v16, 0x4000

    goto :goto_7

    :cond_c
    const/16 v16, 0x2000

    :goto_7
    or-int v5, v5, v16

    :goto_8
    and-int/lit8 v16, v12, 0x20

    const/high16 v17, 0x30000

    if-eqz v16, :cond_d

    or-int v5, v5, v17

    move/from16 v8, p6

    goto :goto_a

    :cond_d
    and-int v17, v11, v17

    move/from16 v8, p6

    if-nez v17, :cond_f

    invoke-virtual {v0, v8}, Lp1/q;->h(Z)Z

    move-result v17

    if-eqz v17, :cond_e

    const/high16 v17, 0x20000

    goto :goto_9

    :cond_e
    const/high16 v17, 0x10000

    :goto_9
    or-int v5, v5, v17

    :cond_f
    :goto_a
    and-int/lit8 v17, v12, 0x40

    const/high16 v18, 0x180000

    if-eqz v17, :cond_10

    or-int v5, v5, v18

    goto :goto_e

    :cond_10
    and-int v18, v11, v18

    if-nez v18, :cond_13

    if-nez p7, :cond_11

    const/16 v18, -0x1

    :goto_b
    move/from16 v2, v18

    goto :goto_c

    :cond_11
    invoke-virtual/range {p7 .. p7}, Ljava/lang/Enum;->ordinal()I

    move-result v18

    goto :goto_b

    :goto_c
    invoke-virtual {v0, v2}, Lp1/q;->e(I)Z

    move-result v2

    if-eqz v2, :cond_12

    const/high16 v2, 0x100000

    goto :goto_d

    :cond_12
    const/high16 v2, 0x80000

    :goto_d
    or-int/2addr v5, v2

    :cond_13
    :goto_e
    and-int/lit16 v2, v12, 0x80

    const/high16 v18, 0xc00000

    if-eqz v2, :cond_14

    or-int v5, v5, v18

    move-object/from16 v9, p8

    goto :goto_10

    :cond_14
    and-int v18, v11, v18

    move-object/from16 v9, p8

    if-nez v18, :cond_16

    invoke-virtual {v0, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_15

    const/high16 v19, 0x800000

    goto :goto_f

    :cond_15
    const/high16 v19, 0x400000

    :goto_f
    or-int v5, v5, v19

    :cond_16
    :goto_10
    const/high16 v19, 0x6000000

    and-int v19, v11, v19

    move/from16 v20, v1

    if-nez v19, :cond_18

    invoke-virtual {v0, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_17

    const/high16 v19, 0x4000000

    goto :goto_11

    :cond_17
    const/high16 v19, 0x2000000

    :goto_11
    or-int v5, v5, v19

    :cond_18
    const v19, 0x2492493

    and-int v1, v5, v19

    move/from16 v19, v2

    const v2, 0x2492492

    if-eq v1, v2, :cond_19

    const/4 v1, 0x1

    goto :goto_12

    :cond_19
    const/4 v1, 0x0

    :goto_12
    and-int/lit8 v2, v5, 0x1

    invoke-virtual {v0, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_38

    invoke-virtual {v0}, Lp1/q;->Z()V

    and-int/lit8 v1, v11, 0x1

    sget-object v2, Lb2/t;->w:Lb2/t;

    const/4 v3, 0x6

    if-eqz v1, :cond_1d

    invoke-virtual {v0}, Lp1/q;->C()Z

    move-result v1

    if-eqz v1, :cond_1a

    goto :goto_13

    :cond_1a
    invoke-virtual {v0}, Lp1/q;->X()V

    and-int/lit8 v1, v12, 0x2

    if-eqz v1, :cond_1b

    and-int/lit8 v5, v5, -0x71

    :cond_1b
    and-int/lit8 v1, v12, 0x8

    if-eqz v1, :cond_1c

    and-int/lit16 v5, v5, -0x1c01

    :cond_1c
    move-object/from16 v1, p7

    goto :goto_15

    :cond_1d
    :goto_13
    if-eqz v20, :cond_1e

    move-object v4, v2

    :cond_1e
    and-int/lit8 v1, v12, 0x2

    if-eqz v1, :cond_1f

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    and-int/lit8 v5, v5, -0x71

    move-object v6, v1

    :cond_1f
    and-int/lit8 v1, v12, 0x8

    if-eqz v1, :cond_20

    sget-object v1, Lx81/d;->a:Lx81/d;

    invoke-virtual {v1, v0, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->y()J

    move-result-wide v13

    and-int/lit16 v1, v5, -0x1c01

    move v5, v1

    :cond_20
    if-eqz v7, :cond_21

    const/4 v15, 0x1

    :cond_21
    if-eqz v16, :cond_22

    const/4 v8, 0x1

    :cond_22
    if-eqz v17, :cond_23

    sget-object v1, Lny0/d0;->DEFAULT:Lny0/d0;

    goto :goto_14

    :cond_23
    move-object/from16 v1, p7

    :goto_14
    if-eqz v19, :cond_24

    new-instance v7, Lay/a0;

    const/4 v9, 0x6

    move-object/from16 p5, p2

    move-object/from16 p7, v1

    move-object/from16 p4, v6

    move-object/from16 p3, v7

    move/from16 p8, v9

    move/from16 p6, v15

    invoke-direct/range {p3 .. p8}, Lay/a0;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;I)V

    const v9, 0x6802f625

    invoke-static {v9, v0, v7}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v7

    move-object v9, v7

    :cond_24
    :goto_15
    invoke-virtual {v0}, Lp1/q;->r()V

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v7, v3, :cond_25

    invoke-static {v0}, Ld;->g(Lp1/q;)Lj0/j;

    move-result-object v7

    :cond_25
    move-object/from16 v22, v7

    check-cast v22, Lj0/i;

    invoke-virtual {v1}, Lny0/d0;->getPadding()F

    move-result v7

    move-object/from16 p0, v6

    const/16 v6, 0x8

    int-to-float v6, v6

    mul-float/2addr v7, v6

    invoke-static {v7, v4}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v6, v8}, Lgb1/h;->a(Landroidx/compose/ui/Modifier;Z)Landroidx/compose/ui/Modifier;

    move-result-object v21

    new-instance v6, Li3/i;

    const/4 v7, 0x3

    invoke-direct {v6, v7}, Li3/i;-><init>(I)V

    const/high16 v7, 0xe000000

    and-int/2addr v7, v5

    move-object/from16 v17, v4

    const/high16 v4, 0x4000000

    if-ne v7, v4, :cond_26

    const/4 v4, 0x1

    goto :goto_16

    :cond_26
    const/4 v4, 0x0

    :goto_16
    const v7, 0xe000

    and-int/2addr v7, v5

    move/from16 p1, v4

    const/16 v4, 0x4000

    if-ne v7, v4, :cond_27

    const/4 v4, 0x1

    goto :goto_17

    :cond_27
    const/4 v4, 0x0

    :goto_17
    or-int v4, p1, v4

    move/from16 p1, v4

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez p1, :cond_29

    if-ne v4, v3, :cond_28

    goto :goto_18

    :cond_28
    move-object/from16 v25, v6

    goto :goto_19

    :cond_29
    :goto_18
    new-instance v4, Lbv2/b;

    move-object/from16 v25, v6

    const/4 v6, 0x5

    invoke-direct {v4, v10, v15, v6}, Lbv2/b;-><init>(Lkotlin/jvm/functions/Function1;ZI)V

    invoke-virtual {v0, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_19
    move-object/from16 v26, v4

    check-cast v26, Lc93/a;

    const/16 v27, 0x8

    const/16 v23, 0x0

    move/from16 v24, v8

    invoke-static/range {v21 .. v27}, Landroidx/compose/foundation/a;->e(Landroidx/compose/ui/Modifier;Lj0/i;Lf0/v0;ZLi3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v6, Lb2/e;->K:Lb2/l;

    sget-object v8, Ll0/m;->a:Ll0/e;

    const/16 v10, 0x30

    invoke-static {v8, v6, v0, v10}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v6

    iget-wide v10, v0, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v0, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v11, La3/l;->a:La3/k;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v12, v0, Lp1/q;->S:Z

    if-eqz v12, :cond_2a

    invoke-virtual {v0, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1a

    :cond_2a
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_1a
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v0, v12, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v0, v6, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, La3/k;->j:La3/i;

    move-object/from16 v19, v9

    iget-boolean v9, v0, Lp1/q;->S:Z

    if-nez v9, :cond_2b

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    move-object/from16 p1, v1

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v9, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2c

    goto :goto_1b

    :cond_2b
    move-object/from16 p1, v1

    :goto_1b
    invoke-static {v8, v0, v8, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_2c
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v0, v1, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, Lb2/e;->E:Lb2/m;

    const/4 v8, 0x0

    invoke-static {v4, v8}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v4

    iget-wide v8, v0, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    move/from16 v20, v15

    invoke-static {v0, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v15

    invoke-virtual {v0}, Lp1/q;->i0()V

    move-object/from16 p3, v3

    iget-boolean v3, v0, Lp1/q;->S:Z

    if-eqz v3, :cond_2d

    invoke-virtual {v0, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1c

    :cond_2d
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_1c
    invoke-static {v0, v12, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v0, v6, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v0, Lp1/q;->S:Z

    if-nez v3, :cond_2e

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2f

    :cond_2e
    invoke-static {v8, v0, v8, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_2f
    invoke-static {v0, v1, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lny0/d0;->getCanvasSize()F

    move-result v1

    const/4 v3, 0x4

    int-to-float v3, v3

    mul-float/2addr v1, v3

    invoke-static {v1, v2}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/16 v4, 0x4000

    if-ne v7, v4, :cond_30

    const/4 v4, 0x1

    goto :goto_1d

    :cond_30
    const/4 v4, 0x0

    :goto_1d
    const/high16 v6, 0x380000

    and-int/2addr v6, v5

    const/high16 v7, 0x100000

    if-ne v6, v7, :cond_31

    const/4 v6, 0x1

    goto :goto_1e

    :cond_31
    const/4 v6, 0x0

    :goto_1e
    or-int/2addr v4, v6

    and-int/lit16 v6, v5, 0x1c00

    xor-int/lit16 v6, v6, 0xc00

    const/16 v7, 0x800

    if-le v6, v7, :cond_32

    invoke-virtual {v0, v13, v14}, Lp1/q;->f(J)Z

    move-result v6

    if-nez v6, :cond_33

    :cond_32
    and-int/lit16 v6, v5, 0xc00

    if-ne v6, v7, :cond_34

    :cond_33
    const/4 v6, 0x1

    goto :goto_1f

    :cond_34
    const/4 v6, 0x0

    :goto_1f
    or-int/2addr v4, v6

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v4, :cond_36

    move-object/from16 v4, p3

    if-ne v6, v4, :cond_35

    goto :goto_20

    :cond_35
    move-object/from16 v4, p1

    move/from16 v15, v20

    goto :goto_21

    :cond_36
    :goto_20
    new-instance v6, Lf1/e;

    move-object/from16 v4, p1

    move/from16 v15, v20

    invoke-direct {v6, v15, v4, v13, v14}, Lf1/e;-><init>(ZLny0/d0;J)V

    invoke-virtual {v0, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_21
    check-cast v6, Lkotlin/jvm/functions/Function1;

    const/4 v8, 0x0

    invoke-static {v1, v6, v0, v8}, Lj93/l0;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    if-eqz v15, :cond_37

    const v1, -0x2b5cbb88

    invoke-virtual {v0, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v4}, Lny0/d0;->getToggleSize()F

    move-result v1

    mul-float/2addr v1, v3

    invoke-static {v1, v2}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v6, Lt0/j;->a:Lt0/i;

    invoke-static {v1, v6}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v6, Lx81/d;->a:Lx81/d;

    const/4 v7, 0x6

    invoke-virtual {v6, v0, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->w()J

    move-result-wide v6

    sget-object v8, Li2/w0;->a:Li2/v0;

    invoke-static {v1, v6, v7, v8}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/4 v8, 0x0

    invoke-static {v1, v0, v8}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v0, v8}, Lp1/q;->q(Z)V

    :goto_22
    const/4 v1, 0x1

    goto :goto_23

    :cond_37
    const/4 v8, 0x0

    const v1, -0x2b58dc80

    invoke-virtual {v0, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v8}, Lp1/q;->q(Z)V

    goto :goto_22

    :goto_23
    invoke-virtual {v0, v1}, Lp1/q;->q(Z)V

    invoke-virtual {v4}, Lny0/d0;->getTextSpacing()F

    move-result v6

    mul-float/2addr v6, v3

    invoke-static {v6, v2}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v0, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    shr-int/lit8 v2, v5, 0x15

    and-int/lit8 v2, v2, 0xe

    move-object/from16 v9, v19

    invoke-static {v2, v9, v0, v1}, Ldc/b;->z(ILc93/m;Lp1/q;Z)V

    move-object/from16 v2, p0

    move-object v8, v4

    move-object/from16 v1, v17

    move/from16 v7, v24

    :goto_24
    move-wide v4, v13

    move v6, v15

    goto :goto_25

    :cond_38
    invoke-virtual {v0}, Lp1/q;->X()V

    move-object v1, v4

    move-object v2, v6

    move v7, v8

    move-object/from16 v8, p7

    goto :goto_24

    :goto_25
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v13

    if-eqz v13, :cond_39

    new-instance v0, Lny0/c1;

    move-object/from16 v3, p2

    move-object/from16 v10, p9

    move/from16 v11, p11

    move/from16 v12, p12

    invoke-direct/range {v0 .. v12}, Lny0/c1;-><init>(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lny0/e0;JZZLny0/d0;Lc93/m;Lkotlin/jvm/functions/Function1;II)V

    iput-object v0, v13, Lp1/v1;->d:Lc93/m;

    :cond_39
    return-void
.end method

.method private static final f(Lcom/whoop/design/util/TextResource;Lny0/e0;ZLny0/d0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 30

    and-int/lit8 v0, p5, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    and-int/lit8 v1, p5, 0x1

    move-object/from16 v2, p4

    check-cast v2, Lp1/q;

    invoke-virtual {v2, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_2

    move-object/from16 v0, p0

    invoke-static {v0, v2, v3}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    const-string v0, "toUpperCase(...)"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x731e0be9

    invoke-virtual {v2, v0}, Lp1/q;->e0(I)V

    sget-object v0, Lx81/d;->a:Lx81/d;

    const/4 v1, 0x6

    invoke-virtual {v0, v2, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    if-eqz p2, :cond_1

    const v1, -0x2ad2fd85

    invoke-virtual {v2, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v2, v3}, Lp1/q;->q(Z)V

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v0

    :goto_1
    move-wide v6, v0

    goto :goto_2

    :cond_1
    const v0, -0x2ad2f8bc

    invoke-virtual {v2, v0}, Lp1/q;->e0(I)V

    invoke-virtual/range {p3 .. p3}, Lny0/d0;->getTextColor()Ly81/f;

    move-result-object v0

    invoke-virtual {v0, v2, v3}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v0

    invoke-virtual {v2, v3}, Lp1/q;->q(Z)V

    goto :goto_1

    :goto_2
    invoke-virtual {v2, v3}, Lp1/q;->q(Z)V

    invoke-virtual/range {p1 .. p1}, Lny0/e0;->getStyle()Lb91/a;

    move-result-object v24

    const/16 v28, 0x0

    const v29, 0x2fffa

    const/4 v5, 0x0

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

    move-object/from16 v26, v2

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    goto :goto_3

    :cond_2
    move-object/from16 v26, v2

    invoke-virtual/range {v26 .. v26}, Lp1/q;->X()V

    :goto_3
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final g(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;
    .locals 0

    xor-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(ZLny0/d0;JLk2/e;)Ll83/a0;
    .locals 10

    const-string v0, "$this$Canvas"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p0, :cond_0

    sget-object p0, Lk2/h;->a:Lk2/h;

    move-object v8, p0

    goto :goto_0

    :cond_0
    new-instance v0, Lk2/i;

    invoke-virtual {p1}, Lny0/d0;->getBorderStroke()Lf0/t;

    move-result-object p0

    iget v1, p0, Lf0/t;->a:F

    const/4 v5, 0x0

    const/16 v6, 0x1e

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v0 .. v6}, Lk2/i;-><init>(FFIILi2/t0;I)V

    move-object v8, v0

    :goto_0
    const/4 v7, 0x0

    const/16 v9, 0x6e

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    move-wide v2, p2

    move-object v1, p4

    invoke-static/range {v1 .. v9}, Lk2/e;->M(Lk2/e;JFJFLk2/f;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lny0/e0;JZZLny0/d0;Lc93/m;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 14

    or-int/lit8 v0, p10, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v12

    move-object v1, p0

    move-object v2, p1

    move-object/from16 v3, p2

    move-wide/from16 v4, p3

    move/from16 v6, p5

    move/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move/from16 v13, p11

    move-object/from16 v11, p12

    invoke-static/range {v1 .. v13}, Lny0/d1;->e(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lny0/e0;JZZLny0/d0;Lc93/m;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
