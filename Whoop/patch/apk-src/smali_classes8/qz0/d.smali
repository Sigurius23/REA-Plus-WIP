.class public abstract Lqz0/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/whoop/design/util/TextResource;",
        "label",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lb91/a;",
        "labelTextStyle",
        "Ll83/a0;",
        "b",
        "(Lcom/whoop/design/util/TextResource;Landroidx/compose/ui/Modifier;Lb91/a;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(Lcom/whoop/design/util/TextResource;Landroidx/compose/ui/Modifier;Lb91/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lqz0/d;->c(Lcom/whoop/design/util/TextResource;Landroidx/compose/ui/Modifier;Lb91/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lcom/whoop/design/util/TextResource;Landroidx/compose/ui/Modifier;Lb91/a;Landroidx/compose/runtime/Composer;II)V
    .locals 31

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    move/from16 v4, p4

    const-string v2, "label"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v2, p3

    check-cast v2, Lp1/q;

    const v3, -0x3d14dad

    invoke-virtual {v2, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v4, 0x6

    const/4 v5, 0x2

    const/4 v6, 0x4

    if-nez v3, :cond_1

    invoke-virtual {v2, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    move v3, v6

    goto :goto_0

    :cond_0
    move v3, v5

    :goto_0
    or-int/2addr v3, v4

    goto :goto_1

    :cond_1
    move v3, v4

    :goto_1
    and-int/lit8 v7, p5, 0x2

    if-eqz v7, :cond_3

    or-int/lit8 v3, v3, 0x30

    :cond_2
    move-object/from16 v8, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v8, v4, 0x30

    if-nez v8, :cond_2

    move-object/from16 v8, p1

    invoke-virtual {v2, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4

    const/16 v9, 0x20

    goto :goto_2

    :cond_4
    const/16 v9, 0x10

    :goto_2
    or-int/2addr v3, v9

    :goto_3
    and-int/lit16 v9, v4, 0x180

    if-nez v9, :cond_7

    and-int/lit8 v9, p5, 0x4

    if-nez v9, :cond_6

    and-int/lit16 v9, v4, 0x200

    if-nez v9, :cond_5

    invoke-virtual {v2, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    goto :goto_4

    :cond_5
    invoke-virtual {v2, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    :goto_4
    if-eqz v9, :cond_6

    const/16 v9, 0x100

    goto :goto_5

    :cond_6
    const/16 v9, 0x80

    :goto_5
    or-int/2addr v3, v9

    :cond_7
    and-int/lit16 v9, v3, 0x93

    const/16 v10, 0x92

    const/4 v11, 0x1

    if-eq v9, v10, :cond_8

    move v9, v11

    goto :goto_6

    :cond_8
    const/4 v9, 0x0

    :goto_6
    and-int/lit8 v10, v3, 0x1

    invoke-virtual {v2, v10, v9}, Lp1/q;->U(IZ)Z

    move-result v9

    if-eqz v9, :cond_e

    invoke-virtual {v2}, Lp1/q;->Z()V

    and-int/lit8 v9, v4, 0x1

    const/4 v10, 0x6

    if-eqz v9, :cond_b

    invoke-virtual {v2}, Lp1/q;->C()Z

    move-result v9

    if-eqz v9, :cond_9

    goto :goto_7

    :cond_9
    invoke-virtual {v2}, Lp1/q;->X()V

    and-int/lit8 v7, p5, 0x4

    if-eqz v7, :cond_a

    and-int/lit16 v3, v3, -0x381

    :cond_a
    move-object/from16 v25, v0

    move-object v0, v8

    goto :goto_9

    :cond_b
    :goto_7
    if-eqz v7, :cond_c

    sget-object v7, Lb2/t;->w:Lb2/t;

    goto :goto_8

    :cond_c
    move-object v7, v8

    :goto_8
    and-int/lit8 v8, p5, 0x4

    if-eqz v8, :cond_d

    sget-object v0, Lx81/d;->a:Lx81/d;

    invoke-virtual {v0, v2, v10}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->m()Lb91/a;

    move-result-object v0

    and-int/lit16 v3, v3, -0x381

    :cond_d
    move-object/from16 v25, v0

    move-object v0, v7

    :goto_9
    invoke-virtual {v2}, Lp1/q;->r()V

    and-int/lit8 v7, v3, 0xe

    invoke-static {v1, v2, v7}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    sget-object v8, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v7, v8}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v7

    const-string v8, "toUpperCase(...)"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/high16 v8, 0x3f800000    # 1.0f

    invoke-static {v8, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    int-to-float v5, v5

    int-to-float v6, v6

    mul-float/2addr v5, v6

    int-to-float v9, v11

    mul-float/2addr v9, v6

    invoke-static {v8, v9, v5}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v5, Lx81/d;->a:Lx81/d;

    invoke-virtual {v5, v2, v10}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->c1()J

    move-result-wide v8

    shl-int/lit8 v3, v3, 0xc

    const/high16 v5, 0x380000

    and-int v29, v3, v5

    const v30, 0x2fff8

    move-object v5, v7

    move-wide v7, v8

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    move-object/from16 v27, v2

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object v2, v0

    move-object/from16 v3, v25

    goto :goto_a

    :cond_e
    move-object/from16 v27, v2

    invoke-virtual/range {v27 .. v27}, Lp1/q;->X()V

    move-object v3, v0

    move-object v2, v8

    :goto_a
    invoke-virtual/range {v27 .. v27}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_f

    new-instance v0, Lqb0/a;

    const/16 v6, 0x12

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lqb0/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_f
    return-void
.end method

.method private static final c(Lcom/whoop/design/util/TextResource;Landroidx/compose/ui/Modifier;Lb91/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lqz0/d;->b(Lcom/whoop/design/util/TextResource;Landroidx/compose/ui/Modifier;Lb91/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
