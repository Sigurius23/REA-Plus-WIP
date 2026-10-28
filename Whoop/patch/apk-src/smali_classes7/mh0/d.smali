.class public abstract Lmh0/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lmh0/d$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001ae\u0010\u0011\u001a\u00020\u000f2\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\n\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\u00082\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c2\u000e\u0008\u0002\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000eH\u0007\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lcom/whoop/design/util/TextResource;",
        "title",
        "Lgz0/m0;",
        "icon",
        "Lcom/whoop/design/models/items/ActionButtonStyle;",
        "style",
        "Ly81/e;",
        "foregroundColor",
        "iconColor",
        "backgroundColor",
        "",
        "enabled",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onClick",
        "c",
        "(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lgz0/m0;Lcom/whoop/design/models/items/ActionButtonStyle;Ly81/e;Ly81/e;Ly81/e;ZLc93/a;Landroidx/compose/runtime/Composer;II)V",
        "bot_release"
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
.method public static synthetic a(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lgz0/m0;Lcom/whoop/design/models/items/ActionButtonStyle;Ly81/e;Ly81/e;Ly81/e;ZLc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p12}, Lmh0/d;->e(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lgz0/m0;Lcom/whoop/design/models/items/ActionButtonStyle;Ly81/e;Ly81/e;Ly81/e;ZLc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b()Ll83/a0;
    .locals 1

    invoke-static {}, Lmh0/d;->d()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static final c(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lgz0/m0;Lcom/whoop/design/models/items/ActionButtonStyle;Ly81/e;Ly81/e;Ly81/e;ZLc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 38
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lcom/whoop/design/util/TextResource;",
            "Lgz0/m0;",
            "Lcom/whoop/design/models/items/ActionButtonStyle;",
            "Ly81/e;",
            "Ly81/e;",
            "Ly81/e;",
            "Z",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v10, p10

    move/from16 v11, p11

    sget-object v0, Lb2/e;->K:Lb2/l;

    const-string v1, "title"

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "style"

    move-object/from16 v4, p3

    invoke-static {v4, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "foregroundColor"

    invoke-static {v5, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "iconColor"

    invoke-static {v6, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "backgroundColor"

    invoke-static {v7, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v1, p9

    check-cast v1, Lp1/q;

    const v3, -0x7dea6731

    invoke-virtual {v1, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v11, 0x1

    if-eqz v3, :cond_0

    or-int/lit8 v12, v10, 0x6

    move v13, v12

    move-object/from16 v12, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v12, v10, 0x6

    if-nez v12, :cond_2

    move-object/from16 v12, p0

    invoke-virtual {v1, v12}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_1

    const/4 v13, 0x4

    goto :goto_0

    :cond_1
    const/4 v13, 0x2

    :goto_0
    or-int/2addr v13, v10

    goto :goto_1

    :cond_2
    move-object/from16 v12, p0

    move v13, v10

    :goto_1
    and-int/lit8 v14, v10, 0x30

    if-nez v14, :cond_5

    and-int/lit8 v14, v10, 0x40

    if-nez v14, :cond_3

    invoke-virtual {v1, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v14

    goto :goto_2

    :cond_3
    invoke-virtual {v1, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v14

    :goto_2
    if-eqz v14, :cond_4

    const/16 v14, 0x20

    goto :goto_3

    :cond_4
    const/16 v14, 0x10

    :goto_3
    or-int/2addr v13, v14

    :cond_5
    and-int/lit16 v14, v10, 0x180

    if-nez v14, :cond_8

    if-nez p2, :cond_6

    const/4 v14, -0x1

    goto :goto_4

    :cond_6
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Enum;->ordinal()I

    move-result v14

    :goto_4
    invoke-virtual {v1, v14}, Lp1/q;->e(I)Z

    move-result v14

    if-eqz v14, :cond_7

    const/16 v14, 0x100

    goto :goto_5

    :cond_7
    const/16 v14, 0x80

    :goto_5
    or-int/2addr v13, v14

    :cond_8
    and-int/lit16 v14, v10, 0xc00

    if-nez v14, :cond_a

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v14

    invoke-virtual {v1, v14}, Lp1/q;->e(I)Z

    move-result v14

    if-eqz v14, :cond_9

    const/16 v14, 0x800

    goto :goto_6

    :cond_9
    const/16 v14, 0x400

    :goto_6
    or-int/2addr v13, v14

    :cond_a
    and-int/lit16 v14, v10, 0x6000

    if-nez v14, :cond_c

    invoke-virtual {v1, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_b

    const/16 v14, 0x4000

    goto :goto_7

    :cond_b
    const/16 v14, 0x2000

    :goto_7
    or-int/2addr v13, v14

    :cond_c
    const/high16 v14, 0x30000

    and-int/2addr v14, v10

    if-nez v14, :cond_e

    invoke-virtual {v1, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_d

    const/high16 v14, 0x20000

    goto :goto_8

    :cond_d
    const/high16 v14, 0x10000

    :goto_8
    or-int/2addr v13, v14

    :cond_e
    const/high16 v14, 0x180000

    and-int/2addr v14, v10

    if-nez v14, :cond_10

    invoke-virtual {v1, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_f

    const/high16 v14, 0x100000

    goto :goto_9

    :cond_f
    const/high16 v14, 0x80000

    :goto_9
    or-int/2addr v13, v14

    :cond_10
    and-int/lit16 v14, v11, 0x80

    const/high16 v15, 0xc00000

    if-eqz v14, :cond_12

    or-int/2addr v13, v15

    :cond_11
    move/from16 v15, p7

    goto :goto_b

    :cond_12
    and-int/2addr v15, v10

    if-nez v15, :cond_11

    move/from16 v15, p7

    invoke-virtual {v1, v15}, Lp1/q;->h(Z)Z

    move-result v16

    if-eqz v16, :cond_13

    const/high16 v16, 0x800000

    goto :goto_a

    :cond_13
    const/high16 v16, 0x400000

    :goto_a
    or-int v13, v13, v16

    :goto_b
    and-int/lit16 v8, v11, 0x100

    const/high16 v16, 0x6000000

    if-eqz v8, :cond_15

    or-int v13, v13, v16

    move-object/from16 v9, p8

    :cond_14
    :goto_c
    move/from16 v20, v13

    goto :goto_e

    :cond_15
    and-int v16, v10, v16

    move-object/from16 v9, p8

    if-nez v16, :cond_14

    invoke-virtual {v1, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_16

    const/high16 v17, 0x4000000

    goto :goto_d

    :cond_16
    const/high16 v17, 0x2000000

    :goto_d
    or-int v13, v13, v17

    goto :goto_c

    :goto_e
    const v13, 0x2492493

    and-int v13, v20, v13

    move/from16 v17, v3

    const v3, 0x2492492

    if-eq v13, v3, :cond_17

    const/4 v3, 0x1

    goto :goto_f

    :cond_17
    const/4 v3, 0x0

    :goto_f
    and-int/lit8 v13, v20, 0x1

    invoke-virtual {v1, v13, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_2d

    sget-object v3, Lb2/t;->w:Lb2/t;

    if-eqz v17, :cond_18

    move-object v12, v3

    :cond_18
    if-eqz v14, :cond_19

    const/4 v15, 0x1

    :cond_19
    sget-object v13, Lp1/l;->a:Lp1/v0;

    if-eqz v8, :cond_1b

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v13, :cond_1a

    new-instance v8, Lm22/m;

    const/16 v9, 0x18

    invoke-direct {v8, v9}, Lm22/m;-><init>(I)V

    invoke-virtual {v1, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1a
    check-cast v8, Lc93/a;

    move-object/from16 v25, v8

    goto :goto_10

    :cond_1b
    move-object/from16 v25, v9

    :goto_10
    shr-int/lit8 v8, v20, 0xc

    and-int/lit8 v8, v8, 0xe

    invoke-interface {v5, v1, v8}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v8

    shr-int/lit8 v14, v20, 0xf

    and-int/lit8 v14, v14, 0xe

    invoke-interface {v6, v1, v14}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v17

    shr-int/lit8 v14, v20, 0x12

    and-int/lit8 v14, v14, 0xe

    invoke-interface {v7, v1, v14}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v4

    const/4 v14, 0x2

    int-to-float v6, v14

    const/4 v14, 0x4

    int-to-float v14, v14

    mul-float/2addr v6, v14

    invoke-static {v6}, Lt0/j;->e(F)Lt0/i;

    move-result-object v6

    if-eqz v15, :cond_1c

    const/high16 v19, 0x3f800000    # 1.0f

    :goto_11
    move/from16 v7, v19

    goto :goto_12

    :cond_1c
    const v19, 0x3ecccccd    # 0.4f

    goto :goto_11

    :goto_12
    invoke-static {v7, v3}, Lts/o;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v19, Lmh0/d$a;->a:[I

    invoke-virtual/range {p3 .. p3}, Ljava/lang/Enum;->ordinal()I

    move-result v21

    move-wide/from16 p7, v8

    aget v8, v19, v21

    const/4 v9, 0x1

    if-eq v8, v9, :cond_28

    const/4 v9, 0x0

    const/4 v10, 0x2

    if-eq v8, v10, :cond_23

    const/4 v10, 0x3

    if-ne v8, v10, :cond_22

    const v4, 0x5313c494

    invoke-virtual {v1, v4}, Lp1/q;->e0(I)V

    invoke-static {v12, v15}, Lgb1/h;->a(Landroidx/compose/ui/Modifier;Z)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {v4, v9, v5, v10}, Landroidx/compose/foundation/layout/d;->y(Landroidx/compose/ui/Modifier;Lb2/m;ZI)Landroidx/compose/ui/Modifier;

    move-result-object v21

    const-wide/16 v6, 0x0

    const/4 v4, 0x7

    const/4 v8, 0x0

    invoke-static {v6, v7, v4, v5, v8}, Lg1/z4;->a(JIZF)Landroidx/compose/material/d;

    move-result-object v23

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v13, :cond_1d

    invoke-static {v1}, Ld;->g(Lp1/q;)Lj0/j;

    move-result-object v4

    :cond_1d
    move-object/from16 v22, v4

    check-cast v22, Lj0/i;

    new-instance v4, Li3/i;

    invoke-direct {v4, v5}, Li3/i;-><init>(I)V

    const/16 v27, 0x8

    move/from16 v24, v15

    move-object/from16 v26, v25

    move-object/from16 v25, v4

    invoke-static/range {v21 .. v27}, Landroidx/compose/foundation/a;->e(Landroidx/compose/ui/Modifier;Lj0/i;Lf0/v0;ZLi3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v4

    move/from16 v8, v24

    move-object/from16 v10, v26

    const-wide/high16 v5, 0x3ff8000000000000L    # 1.5

    double-to-float v5, v5

    const/16 v6, 0x8

    int-to-float v6, v6

    mul-float/2addr v5, v6

    const/4 v9, 0x1

    int-to-float v7, v9

    mul-float/2addr v7, v6

    invoke-static {v4, v5, v7}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v7}, Ll0/m;->i(F)Ll0/k;

    move-result-object v5

    const/16 v6, 0x36

    invoke-static {v5, v0, v1, v6}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v0

    iget-wide v5, v1, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v1}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v1, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v1}, Lp1/q;->i0()V

    iget-boolean v9, v1, Lp1/q;->S:Z

    if-eqz v9, :cond_1e

    invoke-virtual {v1, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_13

    :cond_1e
    invoke-virtual {v1}, Lp1/q;->s0()V

    :goto_13
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v1, v7, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {v1, v0, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->j:La3/i;

    iget-boolean v6, v1, Lp1/q;->S:Z

    if-nez v6, :cond_1f

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_20

    :cond_1f
    invoke-static {v5, v1, v5, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_20
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v1, v0, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    if-nez p2, :cond_21

    const v0, 0x62eb33ea

    invoke-virtual {v1, v0}, Lp1/q;->e0(I)V

    const/4 v5, 0x0

    invoke-virtual {v1, v5}, Lp1/q;->q(Z)V

    move-object v0, v1

    move-object v1, v12

    goto :goto_14

    :cond_21
    const/4 v5, 0x0

    const v0, 0x62eb33eb

    invoke-static {v1, v0, v14, v14, v3}, Lih0/d0;->f(Lp1/q;IFFLb2/t;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    invoke-virtual/range {p2 .. p2}, Lgz0/m0;->toWhoopIcon()I

    move-result v0

    invoke-static {v0, v1, v5}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v0

    move-wide/from16 v15, v17

    const/16 v18, 0x1b0

    const/16 v19, 0x0

    const/4 v13, 0x0

    move-object/from16 v17, v1

    move-object v1, v12

    move-object v12, v0

    invoke-static/range {v12 .. v19}, Lg1/f3;->a(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    move-object/from16 v0, v17

    invoke-virtual {v0, v5}, Lp1/q;->q(Z)V

    :goto_14
    sget v3, Lcom/whoop/design/util/TextResource;->$stable:I

    const/4 v4, 0x3

    shr-int/lit8 v4, v20, 0x3

    and-int/lit8 v4, v4, 0xe

    or-int/2addr v3, v4

    invoke-static {v2, v0, v3}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    sget-object v4, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v3, v4}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v12

    const-string v3, "toUpperCase(...)"

    invoke-static {v12, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, Lx81/d;->a:Lx81/d;

    sget v4, Lx81/d;->b:I

    invoke-virtual {v3, v0, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->k()Lb91/a;

    move-result-object v32

    sget v3, Lb91/a;->d:I

    shl-int/lit8 v36, v3, 0x12

    const v37, 0x2fffa

    const/4 v13, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const-wide/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const-wide/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v33, 0x0

    const/16 v35, 0x0

    move-wide/from16 v14, p7

    move-object/from16 v34, v0

    invoke-static/range {v12 .. v37}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v34

    const/4 v9, 0x1

    invoke-virtual {v12, v9}, Lp1/q;->q(Z)V

    const/4 v13, 0x0

    invoke-virtual {v12, v13}, Lp1/q;->q(Z)V

    :goto_15
    move/from16 v22, v8

    move-object/from16 v25, v10

    move-object v0, v12

    goto/16 :goto_1b

    :cond_22
    move-object v12, v1

    const/4 v13, 0x0

    const v0, 0x5312f52b

    invoke-static {v0, v12, v13}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0

    :cond_23
    move-object v8, v12

    move-object v12, v1

    move-object v1, v8

    move-wide/from16 v30, p7

    move v8, v15

    move-wide/from16 v15, v17

    move-object/from16 v10, v25

    const/4 v13, 0x0

    const v9, 0x53134863

    invoke-virtual {v12, v9}, Lp1/q;->e0(I)V

    invoke-interface {v1, v7}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    move/from16 v24, v8

    const/4 v8, 0x0

    const/4 v9, 0x3

    invoke-static {v7, v8, v13, v9}, Landroidx/compose/foundation/layout/d;->y(Landroidx/compose/ui/Modifier;Lb2/m;ZI)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-static {v7, v6}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-static {v7, v4, v5, v6}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v21

    move/from16 v22, v24

    const/16 v24, 0x0

    const/16 v26, 0xe

    const/16 v23, 0x0

    invoke-static/range {v21 .. v26}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v4

    move/from16 v8, v22

    const/4 v9, 0x1

    int-to-float v5, v9

    const/16 v6, 0x8

    int-to-float v6, v6

    mul-float/2addr v5, v6

    move v9, v6

    const-wide/high16 v6, 0x3ff8000000000000L    # 1.5

    double-to-float v6, v6

    mul-float/2addr v6, v9

    invoke-static {v4, v5, v6}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v5}, Ll0/m;->i(F)Ll0/k;

    move-result-object v5

    const/16 v6, 0x36

    invoke-static {v5, v0, v12, v6}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v0

    iget-wide v5, v12, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v12, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v9, v12, Lp1/q;->S:Z

    if-eqz v9, :cond_24

    invoke-virtual {v12, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_16

    :cond_24
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_16
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v12, v7, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {v12, v0, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->j:La3/i;

    iget-boolean v6, v12, Lp1/q;->S:Z

    if-nez v6, :cond_25

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_26

    :cond_25
    invoke-static {v5, v12, v5, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_26
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v12, v0, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    if-nez p2, :cond_27

    const v0, 0x6af0c58b

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    const/4 v5, 0x0

    invoke-virtual {v12, v5}, Lp1/q;->q(Z)V

    goto :goto_17

    :cond_27
    const/4 v5, 0x0

    const v0, 0x6af0c58c

    invoke-static {v12, v0, v14, v14, v3}, Lih0/d0;->f(Lp1/q;IFFLb2/t;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    invoke-virtual/range {p2 .. p2}, Lgz0/m0;->toWhoopIcon()I

    move-result v0

    invoke-static {v0, v12, v5}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v0

    const/16 v18, 0x1b0

    const/16 v19, 0x0

    const/4 v13, 0x0

    move-object/from16 v17, v12

    move-object v12, v0

    invoke-static/range {v12 .. v19}, Lg1/f3;->a(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    move-object/from16 v12, v17

    invoke-virtual {v12, v5}, Lp1/q;->q(Z)V

    :goto_17
    sget v0, Lcom/whoop/design/util/TextResource;->$stable:I

    const/4 v4, 0x3

    shr-int/lit8 v3, v20, 0x3

    and-int/lit8 v3, v3, 0xe

    or-int/2addr v0, v3

    invoke-static {v2, v12, v0}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    sget-object v3, Lx81/d;->a:Lx81/d;

    sget v4, Lx81/d;->b:I

    invoke-virtual {v3, v12, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->s()Lb91/a;

    move-result-object v32

    sget v3, Lb91/a;->d:I

    shl-int/lit8 v36, v3, 0x12

    const v37, 0x2fffa

    const/4 v13, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const-wide/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const-wide/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    move-wide/from16 v14, v30

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v33, 0x0

    const/16 v35, 0x0

    move-object/from16 v34, v12

    move-object v12, v0

    invoke-static/range {v12 .. v37}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v34

    const/4 v9, 0x1

    invoke-virtual {v12, v9}, Lp1/q;->q(Z)V

    const/4 v5, 0x0

    invoke-virtual {v12, v5}, Lp1/q;->q(Z)V

    goto/16 :goto_15

    :cond_28
    move-object v8, v12

    move-object v12, v1

    move-object v1, v8

    move v8, v15

    move-wide/from16 v15, v17

    move-object/from16 v10, v25

    const v0, 0x5312f2cb

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    invoke-interface {v1, v7}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/16 v7, 0xa

    int-to-float v7, v7

    mul-float/2addr v7, v14

    invoke-static {v7, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v0, v6}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v0, v4, v5, v6}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v21

    const/16 v24, 0x0

    const/16 v26, 0xe

    const/16 v23, 0x0

    move/from16 v22, v8

    invoke-static/range {v21 .. v26}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v4, Lb2/e;->E:Lb2/m;

    const/4 v5, 0x0

    invoke-static {v4, v5}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v4

    iget-wide v5, v12, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v12, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v8, v12, Lp1/q;->S:Z

    if-eqz v8, :cond_29

    invoke-virtual {v12, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_18

    :cond_29
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_18
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v12, v7, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v12, v4, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v6, v12, Lp1/q;->S:Z

    if-nez v6, :cond_2a

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_2b

    :cond_2a
    invoke-static {v5, v12, v5, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_2b
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v12, v4, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    if-nez p2, :cond_2c

    const v0, 0x3bdfa515

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    const/4 v5, 0x0

    invoke-virtual {v12, v5}, Lp1/q;->q(Z)V

    move-object v0, v12

    :goto_19
    const/4 v9, 0x1

    goto :goto_1a

    :cond_2c
    const/4 v5, 0x0

    const v0, 0x3bdfa516

    invoke-static {v12, v0, v14, v14, v3}, Lih0/d0;->f(Lp1/q;IFFLb2/t;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    invoke-virtual/range {p2 .. p2}, Lgz0/m0;->toWhoopIcon()I

    move-result v0

    invoke-static {v0, v12, v5}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v0

    sget v3, Lcom/whoop/design/util/TextResource;->$stable:I

    const/4 v4, 0x3

    shr-int/lit8 v4, v20, 0x3

    and-int/lit8 v4, v4, 0xe

    or-int/2addr v3, v4

    invoke-static {v2, v12, v3}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v13

    const/16 v18, 0x180

    const/16 v19, 0x0

    move-object/from16 v17, v12

    move-object v12, v0

    invoke-static/range {v12 .. v19}, Lg1/f3;->a(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    move-object/from16 v0, v17

    invoke-virtual {v0, v5}, Lp1/q;->q(Z)V

    goto :goto_19

    :goto_1a
    invoke-virtual {v0, v9}, Lp1/q;->q(Z)V

    invoke-virtual {v0, v5}, Lp1/q;->q(Z)V

    :goto_1b
    move/from16 v8, v22

    move-object/from16 v9, v25

    goto :goto_1c

    :cond_2d
    move-object v0, v1

    invoke-virtual {v0}, Lp1/q;->X()V

    move-object v1, v12

    move v8, v15

    :goto_1c
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v12

    if-eqz v12, :cond_2e

    new-instance v0, Ll1/i;

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v10, p10

    invoke-direct/range {v0 .. v11}, Ll1/i;-><init>(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lgz0/m0;Lcom/whoop/design/models/items/ActionButtonStyle;Ly81/e;Ly81/e;Ly81/e;ZLc93/a;II)V

    iput-object v0, v12, Lp1/v1;->d:Lc93/m;

    :cond_2e
    return-void
.end method

.method private static final d()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final e(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lgz0/m0;Lcom/whoop/design/models/items/ActionButtonStyle;Ly81/e;Ly81/e;Ly81/e;ZLc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 13

    or-int/lit8 v0, p9, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v11

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v8, p7

    move-object/from16 v9, p8

    move/from16 v12, p10

    move-object/from16 v10, p11

    invoke-static/range {v1 .. v12}, Lmh0/d;->c(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lgz0/m0;Lcom/whoop/design/models/items/ActionButtonStyle;Ly81/e;Ly81/e;Ly81/e;ZLc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
