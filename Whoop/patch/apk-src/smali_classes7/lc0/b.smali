.class public abstract Llc0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a9\u0010\t\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u0007\u00a2\u0006\u0004\u0008\t\u0010\n\u001a1\u0010\u000b\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u0003\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Ljc0/d$b;",
        "bottomSheetData",
        "Ll1/w3;",
        "sheetState",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onDismissRequest",
        "g",
        "(Landroidx/compose/ui/Modifier;Ljc0/d$b;Ll1/w3;Lc93/a;Landroidx/compose/runtime/Composer;II)V",
        "k",
        "(Landroidx/compose/ui/Modifier;Ljc0/d$b;Lc93/a;Landroidx/compose/runtime/Composer;II)V",
        "advanced-labs_release"
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
.method public static synthetic a()Ll83/a0;
    .locals 1

    invoke-static {}, Llc0/b;->h()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic b(Ljc0/d$b;Lc93/a;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Llc0/b;->i(Ljc0/d$b;Lc93/a;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c()Ll83/a0;
    .locals 1

    invoke-static {}, Llc0/b;->l()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic d(Landroidx/compose/ui/Modifier;Ljc0/d$b;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Llc0/b;->n(Landroidx/compose/ui/Modifier;Ljc0/d$b;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Landroidx/compose/ui/Modifier;Ljc0/d$b;Ll1/w3;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Llc0/b;->j(Landroidx/compose/ui/Modifier;Ljc0/d$b;Ll1/w3;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llc0/b;->m(Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final g(Landroidx/compose/ui/Modifier;Ljc0/d$b;Ll1/w3;Lc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Ljc0/d$b;",
            "Ll1/w3;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v0, p5

    const-string v1, "bottomSheetData"

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "sheetState"

    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v1, p4

    check-cast v1, Lp1/q;

    const v4, 0x277cc122

    invoke-virtual {v1, v4}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v4, p6, 0x1

    if-eqz v4, :cond_0

    or-int/lit8 v5, v0, 0x6

    move v6, v5

    move-object/from16 v5, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v5, v0, 0x6

    if-nez v5, :cond_2

    move-object/from16 v5, p0

    invoke-virtual {v1, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    const/4 v6, 0x4

    goto :goto_0

    :cond_1
    const/4 v6, 0x2

    :goto_0
    or-int/2addr v6, v0

    goto :goto_1

    :cond_2
    move-object/from16 v5, p0

    move v6, v0

    :goto_1
    and-int/lit8 v7, v0, 0x30

    if-nez v7, :cond_5

    and-int/lit8 v7, v0, 0x40

    if-nez v7, :cond_3

    invoke-virtual {v1, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    goto :goto_2

    :cond_3
    invoke-virtual {v1, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    :goto_2
    if-eqz v7, :cond_4

    const/16 v7, 0x20

    goto :goto_3

    :cond_4
    const/16 v7, 0x10

    :goto_3
    or-int/2addr v6, v7

    :cond_5
    and-int/lit16 v7, v0, 0x180

    if-nez v7, :cond_7

    invoke-virtual {v1, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6

    const/16 v7, 0x100

    goto :goto_4

    :cond_6
    const/16 v7, 0x80

    :goto_4
    or-int/2addr v6, v7

    :cond_7
    and-int/lit8 v7, p6, 0x8

    if-eqz v7, :cond_9

    or-int/lit16 v6, v6, 0xc00

    :cond_8
    move-object/from16 v8, p3

    goto :goto_6

    :cond_9
    and-int/lit16 v8, v0, 0xc00

    if-nez v8, :cond_8

    move-object/from16 v8, p3

    invoke-virtual {v1, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_a

    const/16 v9, 0x800

    goto :goto_5

    :cond_a
    const/16 v9, 0x400

    :goto_5
    or-int/2addr v6, v9

    :goto_6
    and-int/lit16 v9, v6, 0x493

    const/16 v10, 0x492

    if-eq v9, v10, :cond_b

    const/4 v9, 0x1

    goto :goto_7

    :cond_b
    const/4 v9, 0x0

    :goto_7
    and-int/lit8 v10, v6, 0x1

    invoke-virtual {v1, v10, v9}, Lp1/q;->U(IZ)Z

    move-result v9

    if-eqz v9, :cond_f

    if-eqz v4, :cond_c

    sget-object v4, Lb2/t;->w:Lb2/t;

    move-object v3, v4

    goto :goto_8

    :cond_c
    move-object v3, v5

    :goto_8
    if-eqz v7, :cond_e

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-ne v4, v5, :cond_d

    new-instance v4, Ll72/f;

    const/16 v5, 0xa

    invoke-direct {v4, v5}, Ll72/f;-><init>(I)V

    invoke-virtual {v1, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v4, Lc93/a;

    move-object v9, v4

    goto :goto_9

    :cond_e
    move-object v9, v8

    :goto_9
    invoke-static {}, Lgb1/b0;->c0()Li2/t;

    move-result-object v13

    new-instance v4, Lih1/f;

    const/16 v5, 0xd

    invoke-direct {v4, v5, v2, v9}, Lih1/f;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v5, -0x23295f8

    invoke-static {v5, v1, v4}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v15

    and-int/lit8 v4, v6, 0xe

    shr-int/lit8 v5, v6, 0x3

    and-int/lit8 v5, v5, 0x70

    or-int/2addr v4, v5

    shl-int/lit8 v5, v6, 0x9

    const/high16 v6, 0x380000

    and-int/2addr v5, v6

    or-int v17, v4, v5

    const/16 v18, 0x180

    const/16 v19, 0xbbc

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    move-object/from16 v4, p2

    move-object/from16 v16, v1

    invoke-static/range {v3 .. v19}, Lv41/e;->g(Landroidx/compose/ui/Modifier;Ll1/w3;Lv41/g;Ly81/e;Lc93/a;Lc93/a;Lc93/a;Li2/a1;ZLny0/q;Li2/t;ZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V

    move-object v1, v3

    move-object v4, v9

    goto :goto_a

    :cond_f
    move-object/from16 v16, v1

    invoke-virtual/range {v16 .. v16}, Lp1/q;->X()V

    move-object v1, v5

    move-object v4, v8

    :goto_a
    invoke-virtual/range {v16 .. v16}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_10

    new-instance v0, Lkw1/c;

    const/4 v7, 0x4

    move-object/from16 v3, p2

    move/from16 v5, p5

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Lkw1/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_10
    return-void
.end method

.method private static final h()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final i(Ljc0/d$b;Lc93/a;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    const-string v0, "$this$BottomSheetM3"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p2, p4, 0x11

    const/16 v0, 0x10

    const/4 v1, 0x1

    if-eq p2, v0, :cond_0

    move p2, v1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    and-int/2addr p4, v1

    move-object v3, p3

    check-cast v3, Lp1/q;

    invoke-virtual {v3, p4, p2}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_1

    sget p2, Lny0/h;->z:I

    shl-int/lit8 v4, p2, 0x3

    const/4 v5, 0x1

    const/4 v0, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v0 .. v5}, Llc0/b;->k(Landroidx/compose/ui/Modifier;Ljc0/d$b;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Landroidx/compose/ui/Modifier;Ljc0/d$b;Ll1/w3;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v6, p5

    move-object v4, p6

    invoke-static/range {v0 .. v6}, Llc0/b;->g(Landroidx/compose/ui/Modifier;Ljc0/d$b;Ll1/w3;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Landroidx/compose/ui/Modifier;Ljc0/d$b;Lc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 41
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Ljc0/d$b;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v5, p1

    move/from16 v1, p4

    move-object/from16 v0, p3

    check-cast v0, Lp1/q;

    const v2, 0x4307aab9

    invoke-virtual {v0, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, p5, 0x1

    if-eqz v2, :cond_0

    or-int/lit8 v4, v1, 0x6

    move v6, v4

    move-object/from16 v4, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v4, v1, 0x6

    if-nez v4, :cond_2

    move-object/from16 v4, p0

    invoke-virtual {v0, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    const/4 v6, 0x4

    goto :goto_0

    :cond_1
    const/4 v6, 0x2

    :goto_0
    or-int/2addr v6, v1

    goto :goto_1

    :cond_2
    move-object/from16 v4, p0

    move v6, v1

    :goto_1
    and-int/lit8 v7, v1, 0x30

    if-nez v7, :cond_5

    and-int/lit8 v7, v1, 0x40

    if-nez v7, :cond_3

    invoke-virtual {v0, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    goto :goto_2

    :cond_3
    invoke-virtual {v0, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    :goto_2
    if-eqz v7, :cond_4

    const/16 v7, 0x20

    goto :goto_3

    :cond_4
    const/16 v7, 0x10

    :goto_3
    or-int/2addr v6, v7

    :cond_5
    and-int/lit8 v7, p5, 0x4

    if-eqz v7, :cond_7

    or-int/lit16 v6, v6, 0x180

    :cond_6
    move-object/from16 v9, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v9, v1, 0x180

    if-nez v9, :cond_6

    move-object/from16 v9, p2

    invoke-virtual {v0, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_8

    const/16 v10, 0x100

    goto :goto_4

    :cond_8
    const/16 v10, 0x80

    :goto_4
    or-int/2addr v6, v10

    :goto_5
    and-int/lit16 v10, v6, 0x93

    const/16 v11, 0x92

    const/16 v32, 0x0

    const/4 v12, 0x1

    if-eq v10, v11, :cond_9

    move v10, v12

    goto :goto_6

    :cond_9
    move/from16 v10, v32

    :goto_6
    and-int/lit8 v11, v6, 0x1

    invoke-virtual {v0, v11, v10}, Lp1/q;->U(IZ)Z

    move-result v10

    if-eqz v10, :cond_13

    sget-object v10, Lb2/t;->w:Lb2/t;

    if-eqz v2, :cond_a

    move-object v4, v10

    :cond_a
    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-eqz v7, :cond_c

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v2, :cond_b

    new-instance v7, Ll72/f;

    const/16 v9, 0xb

    invoke-direct {v7, v9}, Ll72/f;-><init>(I)V

    invoke-virtual {v0, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v7, Lc93/a;

    goto :goto_7

    :cond_c
    move-object v7, v9

    :goto_7
    const/high16 v9, 0x3f800000    # 1.0f

    invoke-static {v9, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    int-to-float v13, v12

    const/16 v14, 0x8

    int-to-float v14, v14

    mul-float/2addr v13, v14

    invoke-static {v13}, Ll0/m;->i(F)Ll0/k;

    move-result-object v13

    sget-object v15, Lb2/e;->M:Lb2/k;

    const/4 v3, 0x6

    invoke-static {v13, v15, v0, v3}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v13

    move/from16 p2, v3

    move-object/from16 p0, v4

    iget-wide v3, v0, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v0, v11}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v15, La3/l;->a:La3/k;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v8, v0, Lp1/q;->S:Z

    if-eqz v8, :cond_d

    invoke-virtual {v0, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_d
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_8
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v0, v8, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->f:La3/i;

    invoke-static {v0, v8, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v8, v0, Lp1/q;->S:Z

    if-nez v8, :cond_e

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v8, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_f

    :cond_e
    invoke-static {v3, v0, v3, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_f
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v0, v3, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object v3, v7

    invoke-static {v9, v10}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    move v4, v6

    invoke-virtual {v5}, Ljc0/d$b;->c()Ljava/lang/String;

    move-result-object v6

    sget-object v8, Lx81/d;->a:Lx81/d;

    sget v11, Lx81/d;->b:I

    invoke-virtual {v8, v0, v11}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v13

    invoke-virtual {v13}, Lb91/d;->P()Lb91/a;

    move-result-object v26

    invoke-virtual {v8, v0, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v13

    invoke-virtual {v13}, Ly81/i;->y()J

    move-result-wide v17

    sget v13, Lb91/a;->d:I

    shl-int/lit8 v30, v13, 0x12

    const v31, 0x2fff8

    move-object v15, v10

    move v13, v11

    const-wide/16 v10, 0x0

    move/from16 v19, v12

    const/4 v12, 0x0

    move/from16 v20, v13

    const/4 v13, 0x0

    move/from16 v21, v14

    const/4 v14, 0x0

    move-object/from16 v22, v15

    const/16 v23, 0x100

    const-wide/16 v15, 0x0

    move/from16 v24, v9

    move-wide/from16 v39, v17

    move-object/from16 v18, v8

    move-wide/from16 v8, v39

    const/16 v17, 0x0

    move-object/from16 v25, v18

    const/16 v18, 0x0

    move/from16 v28, v19

    move/from16 v27, v20

    const-wide/16 v19, 0x0

    move/from16 v29, v21

    const/16 v21, 0x0

    move-object/from16 v33, v22

    const/16 v22, 0x0

    move/from16 v34, v23

    const/16 v23, 0x0

    move/from16 v35, v24

    const/16 v24, 0x0

    move-object/from16 v36, v25

    const/16 v25, 0x0

    move/from16 v37, v27

    const/16 v27, 0x0

    move/from16 v38, v29

    const/16 v29, 0x30

    move/from16 v1, v34

    move-object/from16 v34, v2

    move v2, v1

    move-object/from16 v28, v0

    move-object/from16 v5, v33

    move-object/from16 v0, v36

    move/from16 v1, v37

    move-object/from16 v33, v3

    move/from16 v3, v35

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v6, v28

    invoke-static {v3, v5}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual/range {p1 .. p1}, Ljc0/d$b;->a()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0, v6, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v9

    invoke-virtual {v9}, Lb91/d;->a()Lb91/a;

    move-result-object v26

    invoke-virtual {v0, v6, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->c1()J

    move-result-wide v0

    move-object v6, v8

    move-wide v8, v0

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v6, v28

    invoke-static {v3, v5}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/4 v0, 0x2

    int-to-float v0, v0

    mul-float v9, v0, v38

    const/4 v11, 0x0

    const/16 v12, 0xd

    const/4 v8, 0x0

    const/4 v10, 0x0

    invoke-static/range {v7 .. v12}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, Ljc0/d$b;->b()Lny0/h;

    move-result-object v1

    invoke-virtual {v1}, Lny0/h;->x()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    and-int/lit16 v1, v4, 0x380

    if-ne v1, v2, :cond_10

    const/16 v32, 0x1

    :cond_10
    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v32, :cond_12

    move-object/from16 v2, v34

    if-ne v1, v2, :cond_11

    goto :goto_9

    :cond_11
    move-object/from16 v3, v33

    goto :goto_a

    :cond_12
    :goto_9
    new-instance v1, Liy0/a;

    const/16 v2, 0x19

    move-object/from16 v3, v33

    invoke-direct {v1, v3, v2}, Liy0/a;-><init>(Lc93/a;I)V

    invoke-virtual {v6, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_a
    move-object/from16 v16, v1

    check-cast v16, Lc93/a;

    sget v1, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v1, v1, 0x6

    or-int/lit8 v18, v1, 0x6

    const/16 v19, 0x0

    const/16 v20, 0x3fa

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object/from16 v17, v6

    move-object v6, v0

    invoke-static/range {v6 .. v20}, Lny0/o0;->b(Landroidx/compose/ui/Modifier;ZLcom/whoop/design/util/TextResource;Lb91/a;Lg1/u0;Lf0/t;Ljava/lang/Integer;Landroidx/compose/ui/Modifier;ZLl0/k1;Lc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v6, v17

    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lp1/q;->q(Z)V

    move-object/from16 v4, p0

    move-object/from16 v28, v6

    move-object v6, v3

    goto :goto_b

    :cond_13
    move-object v6, v0

    invoke-virtual {v6}, Lp1/q;->X()V

    move-object/from16 v28, v6

    move-object v6, v9

    :goto_b
    invoke-virtual/range {v28 .. v28}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_14

    new-instance v0, Ll72/h;

    const/4 v3, 0x3

    move-object/from16 v5, p1

    move/from16 v1, p4

    move/from16 v2, p5

    invoke-direct/range {v0 .. v6}, Ll72/h;-><init>(IIILjava/lang/Object;Ljava/lang/Object;Ll83/e;)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_14
    return-void
.end method

.method private static final l()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final m(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final n(Landroidx/compose/ui/Modifier;Ljc0/d$b;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Llc0/b;->k(Landroidx/compose/ui/Modifier;Ljc0/d$b;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
