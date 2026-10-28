.class public abstract Lqz0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a}\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\n\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u0012H\u0007\u00a2\u0006\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/whoop/design/util/TextResource;",
        "label",
        "value",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onClick",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "",
        "fieldName",
        "errorMessage",
        "",
        "isError",
        "isEnabled",
        "Ly3/f;",
        "height",
        "Li2/x;",
        "backgroundColor",
        "Lb91/a;",
        "labelTextStyle",
        "b",
        "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZZFJLb91/a;Landroidx/compose/runtime/Composer;III)V",
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
.method public static synthetic a(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZZFJLb91/a;IIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p16}, Lqz0/b;->c(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZZFJLb91/a;IIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZZFJLb91/a;Landroidx/compose/runtime/Composer;III)V
    .locals 53
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/util/TextResource;",
            "Lc93/a;",
            "Landroidx/compose/ui/Modifier;",
            "Ljava/lang/String;",
            "Lcom/whoop/design/util/TextResource;",
            "ZZFJ",
            "Lb91/a;",
            "Landroidx/compose/runtime/Composer;",
            "III)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v0, p11

    move/from16 v13, p13

    move/from16 v15, p15

    const-string v4, "label"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "value"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "onClick"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v4, p12

    check-cast v4, Lp1/q;

    const v5, -0x3377aa63    # -7.1478504E7f

    invoke-virtual {v4, v5}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v5, v13, 0x6

    if-nez v5, :cond_1

    invoke-virtual {v4, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 v5, 0x4

    goto :goto_0

    :cond_0
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v13

    goto :goto_1

    :cond_1
    move v5, v13

    :goto_1
    and-int/lit8 v8, v13, 0x30

    if-nez v8, :cond_3

    invoke-virtual {v4, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2

    const/16 v8, 0x20

    goto :goto_2

    :cond_2
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v5, v8

    :cond_3
    and-int/lit16 v8, v13, 0x180

    if-nez v8, :cond_5

    invoke-virtual {v4, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    const/16 v8, 0x100

    goto :goto_3

    :cond_4
    const/16 v8, 0x80

    :goto_3
    or-int/2addr v5, v8

    :cond_5
    and-int/lit8 v8, v15, 0x8

    if-eqz v8, :cond_7

    or-int/lit16 v5, v5, 0xc00

    :cond_6
    move-object/from16 v10, p3

    goto :goto_5

    :cond_7
    and-int/lit16 v10, v13, 0xc00

    if-nez v10, :cond_6

    move-object/from16 v10, p3

    invoke-virtual {v4, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_8

    const/16 v11, 0x800

    goto :goto_4

    :cond_8
    const/16 v11, 0x400

    :goto_4
    or-int/2addr v5, v11

    :goto_5
    and-int/lit8 v11, v15, 0x10

    if-eqz v11, :cond_a

    or-int/lit16 v5, v5, 0x6000

    :cond_9
    move-object/from16 v12, p4

    goto :goto_7

    :cond_a
    and-int/lit16 v12, v13, 0x6000

    if-nez v12, :cond_9

    move-object/from16 v12, p4

    invoke-virtual {v4, v12}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_b

    const/16 v14, 0x4000

    goto :goto_6

    :cond_b
    const/16 v14, 0x2000

    :goto_6
    or-int/2addr v5, v14

    :goto_7
    const/high16 v14, 0x30000

    and-int/2addr v14, v13

    if-nez v14, :cond_e

    and-int/lit8 v14, v15, 0x20

    if-nez v14, :cond_c

    move-object/from16 v14, p5

    invoke-virtual {v4, v14}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_d

    const/high16 v16, 0x20000

    goto :goto_8

    :cond_c
    move-object/from16 v14, p5

    :cond_d
    const/high16 v16, 0x10000

    :goto_8
    or-int v5, v5, v16

    goto :goto_9

    :cond_e
    move-object/from16 v14, p5

    :goto_9
    and-int/lit8 v16, v15, 0x40

    const/high16 v17, 0x180000

    if-eqz v16, :cond_f

    or-int v5, v5, v17

    move/from16 v9, p6

    goto :goto_b

    :cond_f
    and-int v17, v13, v17

    move/from16 v9, p6

    if-nez v17, :cond_11

    invoke-virtual {v4, v9}, Lp1/q;->h(Z)Z

    move-result v17

    if-eqz v17, :cond_10

    const/high16 v17, 0x100000

    goto :goto_a

    :cond_10
    const/high16 v17, 0x80000

    :goto_a
    or-int v5, v5, v17

    :cond_11
    :goto_b
    and-int/lit16 v6, v15, 0x80

    const/high16 v17, 0xc00000

    if-eqz v6, :cond_12

    or-int v5, v5, v17

    move/from16 v7, p7

    goto :goto_d

    :cond_12
    and-int v17, v13, v17

    move/from16 v7, p7

    if-nez v17, :cond_14

    invoke-virtual {v4, v7}, Lp1/q;->h(Z)Z

    move-result v17

    if-eqz v17, :cond_13

    const/high16 v17, 0x800000

    goto :goto_c

    :cond_13
    const/high16 v17, 0x400000

    :goto_c
    or-int v5, v5, v17

    :cond_14
    :goto_d
    and-int/lit16 v1, v15, 0x100

    const/high16 v17, 0x6000000

    if-eqz v1, :cond_16

    or-int v5, v5, v17

    :cond_15
    move/from16 v17, v1

    move/from16 v1, p8

    goto :goto_f

    :cond_16
    and-int v17, v13, v17

    if-nez v17, :cond_15

    move/from16 v17, v1

    move/from16 v1, p8

    invoke-virtual {v4, v1}, Lp1/q;->d(F)Z

    move-result v18

    if-eqz v18, :cond_17

    const/high16 v18, 0x4000000

    goto :goto_e

    :cond_17
    const/high16 v18, 0x2000000

    :goto_e
    or-int v5, v5, v18

    :goto_f
    const/high16 v18, 0x30000000

    and-int v18, v13, v18

    if-nez v18, :cond_1a

    and-int/lit16 v1, v15, 0x200

    move/from16 v18, v5

    if-nez v1, :cond_18

    move v1, v6

    move-wide/from16 v5, p9

    invoke-virtual {v4, v5, v6}, Lp1/q;->f(J)Z

    move-result v19

    if-eqz v19, :cond_19

    const/high16 v19, 0x20000000

    goto :goto_10

    :cond_18
    move v1, v6

    move-wide/from16 v5, p9

    :cond_19
    const/high16 v19, 0x10000000

    :goto_10
    or-int v18, v18, v19

    goto :goto_11

    :cond_1a
    move/from16 v18, v5

    move v1, v6

    move-wide/from16 v5, p9

    :goto_11
    and-int/lit8 v19, p14, 0x6

    if-nez v19, :cond_1d

    move/from16 v19, v1

    and-int/lit16 v1, v15, 0x400

    if-nez v1, :cond_1c

    and-int/lit8 v1, p14, 0x8

    if-nez v1, :cond_1b

    invoke-virtual {v4, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    goto :goto_12

    :cond_1b
    invoke-virtual {v4, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    :goto_12
    if-eqz v1, :cond_1c

    const/4 v1, 0x4

    goto :goto_13

    :cond_1c
    const/4 v1, 0x2

    :goto_13
    or-int v1, p14, v1

    goto :goto_14

    :cond_1d
    move/from16 v19, v1

    move/from16 v1, p14

    :goto_14
    const v20, 0x12492493

    and-int v0, v18, v20

    move/from16 v20, v1

    const v1, 0x12492492

    if-ne v0, v1, :cond_1f

    and-int/lit8 v0, v20, 0x3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1e

    goto :goto_15

    :cond_1e
    const/4 v0, 0x0

    goto :goto_16

    :cond_1f
    :goto_15
    const/4 v0, 0x1

    :goto_16
    and-int/lit8 v1, v18, 0x1

    invoke-virtual {v4, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_38

    invoke-virtual {v4}, Lp1/q;->Z()V

    and-int/lit8 v0, v13, 0x1

    sget-object v1, Lb2/t;->w:Lb2/t;

    const v21, -0x70000001

    const v22, -0x70001

    const/4 v3, 0x6

    if-eqz v0, :cond_24

    invoke-virtual {v4}, Lp1/q;->C()Z

    move-result v0

    if-eqz v0, :cond_20

    goto :goto_18

    :cond_20
    invoke-virtual {v4}, Lp1/q;->X()V

    and-int/lit8 v0, v15, 0x20

    if-eqz v0, :cond_21

    and-int v18, v18, v22

    :cond_21
    and-int/lit16 v0, v15, 0x200

    if-eqz v0, :cond_22

    and-int v18, v18, v21

    :cond_22
    and-int/lit16 v0, v15, 0x400

    if-eqz v0, :cond_23

    and-int/lit8 v0, v20, -0xf

    move/from16 v11, p8

    move-object v8, v14

    move/from16 v45, v18

    move v14, v0

    move-object v0, v12

    :goto_17
    move-object/from16 v12, p11

    goto :goto_1c

    :cond_23
    move/from16 v11, p8

    move-object v0, v12

    move-object v8, v14

    move/from16 v45, v18

    move/from16 v14, v20

    goto :goto_17

    :cond_24
    :goto_18
    if-eqz v8, :cond_25

    move-object v10, v1

    :cond_25
    if-eqz v11, :cond_26

    const-string v0, "ProfileField"

    goto :goto_19

    :cond_26
    move-object v0, v12

    :goto_19
    and-int/lit8 v8, v15, 0x20

    if-eqz v8, :cond_27

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    and-int v18, v18, v22

    goto :goto_1a

    :cond_27
    move-object v8, v14

    :goto_1a
    if-eqz v16, :cond_28

    const/4 v9, 0x0

    :cond_28
    if-eqz v19, :cond_29

    const/4 v7, 0x1

    :cond_29
    if-eqz v17, :cond_2a

    const/16 v11, 0x38

    int-to-float v11, v11

    goto :goto_1b

    :cond_2a
    move/from16 v11, p8

    :goto_1b
    and-int/lit16 v12, v15, 0x200

    if-eqz v12, :cond_2b

    sget-object v5, Lx81/d;->a:Lx81/d;

    invoke-virtual {v5, v4, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->r()J

    move-result-wide v5

    and-int v12, v18, v21

    move/from16 v18, v12

    :cond_2b
    and-int/lit16 v12, v15, 0x400

    if-eqz v12, :cond_2c

    sget-object v12, Lx81/d;->a:Lx81/d;

    invoke-virtual {v12, v4, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v12

    invoke-virtual {v12}, Lb91/d;->m()Lb91/a;

    move-result-object v12

    and-int/lit8 v14, v20, -0xf

    move/from16 v45, v18

    goto :goto_1c

    :cond_2c
    move-object/from16 v12, p11

    move/from16 v45, v18

    move/from16 v14, v20

    :goto_1c
    invoke-virtual {v4}, Lp1/q;->r()V

    sget-object v16, Lg1/i8;->a:Lg1/i8;

    move-wide/from16 p9, v5

    sget-object v5, Lx81/d;->a:Lx81/d;

    invoke-virtual {v5, v4, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->y()J

    move-result-wide v16

    if-eqz v9, :cond_2d

    const v6, -0x34365291    # -2.643427E7f

    invoke-virtual {v4, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v5, v4, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->c()J

    move-result-wide v18

    const/4 v6, 0x0

    invoke-virtual {v4, v6}, Lp1/q;->q(Z)V

    move-wide/from16 v20, v18

    goto :goto_1d

    :cond_2d
    const/4 v6, 0x0

    const v3, -0x34364f94    # -2.64358E7f

    invoke-virtual {v4, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v4, v6}, Lp1/q;->q(Z)V

    move-wide/from16 v20, p9

    const/4 v3, 0x6

    :goto_1d
    invoke-virtual {v5, v4, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v18

    invoke-virtual/range {v18 .. v18}, Ly81/i;->y()J

    move-result-wide v22

    invoke-virtual {v5, v4, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v18

    invoke-virtual/range {v18 .. v18}, Ly81/i;->y()J

    move-result-wide v24

    if-eqz v9, :cond_2e

    const v6, -0x343637f8    # -2.6447888E7f

    invoke-virtual {v4, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v5, v4, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->b()J

    move-result-wide v18

    const/4 v6, 0x0

    invoke-virtual {v4, v6}, Lp1/q;->q(Z)V

    move/from16 p11, v7

    :goto_1e
    move-wide/from16 v26, v18

    goto :goto_1f

    :cond_2e
    move/from16 p11, v7

    const v7, -0x3436339c    # -2.645012E7f

    invoke-static {v4, v7, v5, v4, v3}, Lr80/c;->c(Lp1/q;ILx81/d;Lp1/q;I)J

    move-result-wide v18

    invoke-virtual {v4, v6}, Lp1/q;->q(Z)V

    goto :goto_1e

    :goto_1f
    if-eqz v9, :cond_2f

    const v7, -0x34362a58    # -2.6454864E7f

    invoke-virtual {v4, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v5, v4, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->b()J

    move-result-wide v18

    :goto_20
    invoke-virtual {v4, v6}, Lp1/q;->q(Z)V

    move-wide/from16 v28, v18

    goto :goto_21

    :cond_2f
    const v7, -0x343625fc

    invoke-virtual {v4, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v5, v4, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->W0()J

    move-result-wide v18

    goto :goto_20

    :goto_21
    invoke-virtual {v5, v4, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->b()J

    move-result-wide v32

    const-wide/16 v40, 0x0

    const v43, 0x1ffe82

    const-wide/16 v18, 0x0

    const-wide/16 v30, 0x0

    const-wide/16 v34, 0x0

    const-wide/16 v36, 0x0

    const-wide/16 v38, 0x0

    move-object/from16 v42, v4

    invoke-static/range {v16 .. v43}, Lg1/i8;->h(JJJJJJJJJJJJJLandroidx/compose/runtime/Composer;I)Lg1/y1;

    move-result-object v3

    if-eqz v9, :cond_30

    const v6, -0x343615d8    # -2.646536E7f

    invoke-virtual {v4, v6}, Lp1/q;->e0(I)V

    const/4 v6, 0x6

    invoke-virtual {v5, v4, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->b()J

    move-result-wide v16

    const/4 v7, 0x0

    invoke-virtual {v4, v7}, Lp1/q;->q(Z)V

    move v6, v7

    :goto_22
    move-wide/from16 v47, v16

    goto :goto_23

    :cond_30
    const/4 v6, 0x6

    const v7, -0x3436117c    # -2.6467592E7f

    invoke-virtual {v4, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v5, v4, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->W0()J

    move-result-wide v16

    const/4 v6, 0x0

    invoke-virtual {v4, v6}, Lp1/q;->q(Z)V

    goto :goto_22

    :goto_23
    sget-object v7, Ll0/m;->c:Ll0/g;

    move/from16 v42, v9

    sget-object v9, Lb2/e;->M:Lb2/k;

    invoke-static {v7, v9, v4, v6}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v7

    move-object/from16 p5, v12

    iget-wide v12, v4, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v4, v10}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    sget-object v13, La3/l;->a:La3/k;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v4}, Lp1/q;->i0()V

    move-object/from16 v43, v10

    iget-boolean v10, v4, Lp1/q;->S:Z

    if-eqz v10, :cond_31

    invoke-virtual {v4, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_24

    :cond_31
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_24
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v4, v10, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->f:La3/i;

    invoke-static {v4, v7, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->j:La3/i;

    move/from16 p3, v14

    iget-boolean v14, v4, Lp1/q;->S:Z

    if-nez v14, :cond_32

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v14, v15}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_33

    :cond_32
    invoke-static {v6, v4, v6, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_33
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v4, v6, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    and-int/lit8 v12, v45, 0xe

    const/16 v46, 0x6

    shl-int/lit8 v14, p3, 0x6

    and-int/lit16 v14, v14, 0x380

    or-int/2addr v12, v14

    const/4 v14, 0x2

    const/4 v15, 0x0

    move-object/from16 p3, p0

    move-object/from16 p6, v4

    move/from16 p7, v12

    move/from16 p8, v14

    move-object/from16 p4, v15

    invoke-static/range {p3 .. p8}, Lqz0/d;->b(Lcom/whoop/design/util/TextResource;Landroidx/compose/ui/Modifier;Lb91/a;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v12, p5

    new-instance v14, Ljava/lang/StringBuilder;

    const-string v15, "CLICKABLE_FORM_FIELD_"

    invoke-direct {v14, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-static {v1, v14}, Lgb1/d;->d(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    move-object/from16 v49, v12

    const/high16 v12, 0x3f800000    # 1.0f

    invoke-static {v12, v14}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    invoke-static {v11, v14}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    const/4 v12, 0x3

    int-to-float v12, v12

    move/from16 v50, v11

    const/4 v11, 0x4

    int-to-float v11, v11

    mul-float/2addr v12, v11

    move/from16 v44, v11

    invoke-static {v12}, Lt0/j;->e(F)Lt0/i;

    move-result-object v11

    invoke-static {v14, v11}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-virtual {v3, v4}, Lg1/y1;->a(Lp1/q;)Lp1/c1;

    move-result-object v14

    invoke-interface {v14}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Li2/x;

    move-object/from16 v16, v15

    iget-wide v14, v14, Li2/x;->a:J

    move/from16 p3, v12

    sget-object v12, Li2/w0;->a:Li2/v0;

    invoke-static {v11, v14, v15, v12}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    const/4 v12, 0x1

    int-to-float v14, v12

    invoke-static/range {p3 .. p3}, Lt0/j;->e(F)Lt0/i;

    move-result-object v12

    move-object/from16 v51, v0

    move-object v15, v1

    move-wide/from16 v0, v47

    invoke-static {v11, v14, v0, v1, v12}, Lge3/g;->h(Landroidx/compose/ui/Modifier;FJLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    new-instance v1, Li3/i;

    const/4 v11, 0x0

    invoke-direct {v1, v11}, Li3/i;-><init>(I)V

    const/16 v12, 0xa

    const/16 v17, 0x0

    move-object/from16 p7, p2

    move/from16 p4, p11

    move-object/from16 p3, v0

    move-object/from16 p6, v1

    move/from16 p8, v12

    move-object/from16 p5, v17

    invoke-static/range {p3 .. p8}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v0

    move/from16 v1, p4

    const/16 v12, 0x10

    int-to-float v12, v12

    const/4 v11, 0x0

    move/from16 v47, v14

    const/4 v14, 0x2

    invoke-static {v0, v12, v11, v14}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v11, Lb2/e;->z:Lb2/m;

    const/4 v12, 0x0

    invoke-static {v11, v12}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v11

    move-object/from16 p3, v15

    iget-wide v14, v4, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v4, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v15, v4, Lp1/q;->S:Z

    if-eqz v15, :cond_34

    invoke-virtual {v4, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_25

    :cond_34
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_25
    invoke-static {v4, v10, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v4, v7, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v7, v4, Lp1/q;->S:Z

    if-nez v7, :cond_35

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v7, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_36

    :cond_35
    invoke-static {v12, v4, v12, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_36
    invoke-static {v4, v6, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    shr-int/lit8 v0, v45, 0x3

    and-int/lit8 v0, v0, 0xe

    invoke-static {v2, v4, v0}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    const/4 v6, 0x6

    invoke-virtual {v5, v4, v6}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v7

    invoke-virtual {v7}, Lb91/d;->a()Lb91/a;

    move-result-object v36

    invoke-virtual {v3, v1, v4}, Lg1/y1;->e(ZLandroidx/compose/runtime/Composer;)Lp1/c1;

    move-result-object v3

    invoke-interface {v3}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Li2/x;

    iget-wide v6, v3, Li2/x;->a:J

    move-object/from16 v15, p3

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3, v15}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    new-instance v3, Ljava/lang/StringBuilder;

    move-object/from16 v10, v16

    invoke-direct {v3, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v12, v51

    invoke-virtual {v3, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v10, "_value"

    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v9, v3}, Lgb1/d;->d(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v17

    const/16 v40, 0x0

    const v41, 0x2fff8

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const-wide/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const-wide/16 v29, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v37, 0x0

    const/16 v39, 0x0

    move-object/from16 v16, v0

    move-object/from16 v38, v4

    move-wide/from16 v18, v6

    invoke-static/range {v16 .. v41}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lp1/q;->q(Z)V

    if-eqz v42, :cond_37

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_37

    const v0, -0x3ffda4a5

    invoke-virtual {v4, v0}, Lp1/q;->e0(I)V

    shr-int/lit8 v0, v45, 0xf

    and-int/lit8 v0, v0, 0xe

    invoke-static {v8, v4, v0}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v16

    const/4 v6, 0x6

    invoke-virtual {v5, v4, v6}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->e()Lb91/a;

    move-result-object v36

    invoke-virtual {v5, v4, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->b()J

    move-result-wide v18

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3, v15}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    mul-float v14, v47, v44

    const/4 v3, 0x0

    const/16 v5, 0x8

    move v6, v14

    move-object/from16 p3, v0

    move/from16 p7, v3

    move/from16 p8, v5

    move/from16 p6, v6

    move/from16 p4, v14

    move/from16 p5, v44

    invoke-static/range {p3 .. p8}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v17

    new-instance v0, Lw3/k;

    const/4 v3, 0x5

    invoke-direct {v0, v3}, Lw3/k;-><init>(I)V

    const/16 v40, 0x0

    const v41, 0x2fdf8

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const-wide/16 v25, 0x0

    const/16 v27, 0x0

    const-wide/16 v29, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v37, 0x0

    const/16 v39, 0x0

    move-object/from16 v28, v0

    move-object/from16 v38, v4

    invoke-static/range {v16 .. v41}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    const/4 v6, 0x0

    invoke-virtual {v4, v6}, Lp1/q;->q(Z)V

    :goto_26
    const/4 v0, 0x1

    goto :goto_27

    :cond_37
    const/4 v6, 0x0

    const v0, -0x3ff80971

    invoke-virtual {v4, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v4, v6}, Lp1/q;->q(Z)V

    goto :goto_26

    :goto_27
    invoke-virtual {v4, v0}, Lp1/q;->q(Z)V

    move-object v6, v8

    move-object v5, v12

    move/from16 v7, v42

    move-object/from16 v10, v43

    move-object/from16 v12, v49

    move/from16 v9, v50

    move v8, v1

    move-wide/from16 v0, p9

    goto :goto_28

    :cond_38
    invoke-virtual {v4}, Lp1/q;->X()V

    move-wide v0, v5

    move v8, v7

    move v7, v9

    move-object v5, v12

    move-object v6, v14

    move/from16 v9, p8

    move-object/from16 v12, p11

    :goto_28
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object v3

    if-eqz v3, :cond_39

    move-object v4, v10

    move-wide v10, v0

    new-instance v0, Lqz0/a;

    move-object/from16 v1, p0

    move/from16 v13, p13

    move/from16 v14, p14

    move/from16 v15, p15

    move-object/from16 v52, v3

    move-object/from16 v3, p2

    invoke-direct/range {v0 .. v15}, Lqz0/a;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZZFJLb91/a;III)V

    move-object v1, v0

    move-object/from16 v0, v52

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_39
    return-void
.end method

.method private static final c(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZZFJLb91/a;IIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 17

    or-int/lit8 v0, p12, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v14

    invoke-static/range {p13 .. p13}, Lp1/x;->L(I)I

    move-result v15

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    move-wide/from16 v10, p9

    move-object/from16 v12, p11

    move/from16 v16, p14

    move-object/from16 v13, p15

    invoke-static/range {v1 .. v16}, Lqz0/b;->b(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZZFJLb91/a;Landroidx/compose/runtime/Composer;III)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
