.class public abstract Lim1/c1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\'\u0010\u0005\u001a\u00020\u00012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onClick",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "b",
        "(Lc93/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(Landroidx/compose/ui/Modifier;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 1

    move-object v0, p1

    move-object p1, p0

    move-object p0, v0

    invoke-static/range {p0 .. p5}, Lim1/c1;->c(Lc93/a;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lc93/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v13, p0

    const-string v0, "onClick"

    invoke-static {v13, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v14, p2

    check-cast v14, Lp1/q;

    const v0, -0x5e918fa1

    invoke-virtual {v14, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    const/4 v1, 0x4

    const/4 v2, 0x2

    if-nez v0, :cond_1

    invoke-virtual {v14, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    or-int v0, p3, v0

    goto :goto_1

    :cond_1
    move/from16 v0, p3

    :goto_1
    and-int/lit8 v3, p4, 0x2

    const/16 v4, 0x10

    if-eqz v3, :cond_3

    or-int/lit8 v0, v0, 0x30

    :cond_2
    move-object/from16 v5, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v5, p3, 0x30

    if-nez v5, :cond_2

    move-object/from16 v5, p1

    invoke-virtual {v14, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x20

    goto :goto_2

    :cond_4
    move v6, v4

    :goto_2
    or-int/2addr v0, v6

    :goto_3
    and-int/lit8 v6, v0, 0x13

    const/16 v12, 0x12

    const/4 v7, 0x0

    const/4 v15, 0x1

    if-eq v6, v12, :cond_5

    move v6, v15

    goto :goto_4

    :cond_5
    move v6, v7

    :goto_4
    and-int/lit8 v8, v0, 0x1

    invoke-virtual {v14, v8, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_a

    sget-object v16, Lb2/t;->w:Lb2/t;

    if-eqz v3, :cond_6

    move-object/from16 v3, v16

    goto :goto_5

    :cond_6
    move-object v3, v5

    :goto_5
    const/high16 v5, 0x3f800000    # 1.0f

    invoke-static {v5, v3}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static {v5}, Ll0/f;->k(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v6, Lb2/e;->H:Lb2/m;

    invoke-static {v6, v7}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v6

    iget-wide v7, v14, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v14, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v14}, Lp1/q;->i0()V

    iget-boolean v10, v14, Lp1/q;->S:Z

    if-eqz v10, :cond_7

    invoke-virtual {v14, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_7
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_6
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v14, v9, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v14, v6, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v8, v14, Lp1/q;->S:Z

    if-nez v8, :cond_8

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_9

    :cond_8
    invoke-static {v7, v14, v7, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v14, v6, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/16 v5, 0xc

    int-to-float v5, v5

    const/16 v6, 0x8

    int-to-float v6, v6

    mul-float v20, v5, v6

    const/16 v21, 0x7

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const-string v7, "TiltGraphEntryButton"

    invoke-static {v5, v7}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v16

    sget v5, Lfl1/b;->F:I

    invoke-static {v14, v5}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    sget-object v7, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    const-string v8, "toUpperCase(...)"

    invoke-static {v7, v5, v8}, Ld13/a;->e(Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v17

    sget-object v5, Lx81/d;->a:Lx81/d;

    sget v7, Lx81/d;->b:I

    invoke-virtual {v5, v14, v7}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v8

    invoke-virtual {v8}, Lb91/d;->j()Lb91/a;

    move-result-object v18

    int-to-float v2, v2

    mul-float v8, v2, v6

    const-wide/high16 v9, 0x3ff8000000000000L    # 1.5

    double-to-float v9, v9

    mul-float/2addr v9, v6

    new-instance v6, Ll0/l1;

    invoke-direct {v6, v8, v9, v8, v9}, Ll0/l1;-><init>(FFFF)V

    int-to-float v4, v4

    int-to-float v1, v1

    mul-float v19, v4, v1

    invoke-virtual {v5, v14, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->y()J

    move-result-wide v8

    invoke-static {v2, v8, v9}, Lhg3/i;->a(FJ)Lf0/t;

    move-result-object v20

    sget-object v1, Lg1/v0;->a:Ll0/l1;

    invoke-virtual {v5, v14, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->V0()J

    move-result-wide v1

    invoke-virtual {v5, v14, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->y()J

    move-result-wide v8

    invoke-virtual {v5, v14, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->X0()J

    move-result-wide v10

    invoke-virtual {v5, v14, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->V0()J

    move-result-wide v4

    move-wide/from16 v21, v4

    move-object v5, v3

    move-wide v3, v8

    move-wide v7, v10

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v9, v14

    move-object v14, v6

    move-wide/from16 v23, v21

    move-object/from16 v21, v5

    move-wide/from16 v5, v23

    invoke-static/range {v1 .. v11}, Lg1/v0;->a(JJJJLandroidx/compose/runtime/Composer;II)Lg1/m1;

    move-result-object v7

    sget v1, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/2addr v1, v12

    or-int/lit16 v1, v1, 0x186

    sget v2, Lb91/a;->d:I

    shl-int/lit8 v2, v2, 0x6

    or-int/lit8 v2, v2, 0x36

    shl-int/lit8 v0, v0, 0x9

    and-int/lit16 v0, v0, 0x1c00

    or-int/2addr v0, v2

    move-object/from16 v6, v17

    const/16 v17, 0x13a

    move v2, v15

    move v15, v1

    const/4 v1, 0x0

    move v3, v2

    const/4 v2, 0x0

    move v4, v3

    const/4 v3, 0x0

    move v5, v4

    const/4 v4, 0x0

    move v8, v5

    const/4 v5, 0x0

    move v10, v8

    const/4 v8, 0x0

    move-object/from16 v10, v16

    move/from16 v16, v0

    move-object v0, v10

    move-object v11, v14

    move-object/from16 v12, v18

    move/from16 v10, v19

    move-object v14, v9

    move-object/from16 v9, v20

    invoke-static/range {v0 .. v17}, Lny0/z;->j(Landroidx/compose/ui/Modifier;ZZLjava/lang/Integer;Landroidx/compose/ui/Modifier;Lv41/r0;Lcom/whoop/design/util/TextResource;Lg1/u0;Li2/t;Lf0/t;FLl0/k1;Lb91/a;Lc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object v9, v14

    const/4 v2, 0x1

    invoke-virtual {v9, v2}, Lp1/q;->q(Z)V

    move-object/from16 v2, v21

    goto :goto_7

    :cond_a
    move-object v9, v14

    invoke-virtual {v9}, Lp1/q;->X()V

    move-object v2, v5

    :goto_7
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_b

    new-instance v0, Lau1/d;

    const/4 v5, 0x7

    move-object/from16 v1, p0

    move/from16 v3, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lau1/d;-><init>(Lc93/a;Landroidx/compose/ui/Modifier;III)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_b
    return-void
.end method

.method private static final c(Lc93/a;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lim1/c1;->b(Lc93/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
