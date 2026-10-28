.class public abstract Lp31/q;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001aC\u0010\n\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00030\u0007H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "",
        "expanded",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onDismissRequest",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lkotlin/Function1;",
        "Ll0/y;",
        "content",
        "c",
        "(ZLc93/a;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(ZLc93/a;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lp31/q;->e(ZLc93/a;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(ZLc93/a;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lp31/q;->d(ZLc93/a;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(ZLc93/a;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lc93/a;",
            "Landroidx/compose/ui/Modifier;",
            "Lkotlin/jvm/functions/Function3;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move-object/from16 v4, p3

    move/from16 v6, p5

    const-string v0, "onDismissRequest"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "content"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v11, p4

    check-cast v11, Lp1/q;

    const v0, 0x1622e2f0

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v6, 0x6

    const/4 v1, 0x4

    if-nez v0, :cond_1

    move/from16 v0, p0

    invoke-virtual {v11, v0}, Lp1/q;->h(Z)Z

    move-result v3

    if-eqz v3, :cond_0

    move v3, v1

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v6

    goto :goto_1

    :cond_1
    move/from16 v0, p0

    move v3, v6

    :goto_1
    and-int/lit8 v5, v6, 0x30

    if-nez v5, :cond_3

    invoke-virtual {v11, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v3, v5

    :cond_3
    and-int/lit8 v5, p6, 0x4

    if-eqz v5, :cond_5

    or-int/lit16 v3, v3, 0x180

    :cond_4
    move-object/from16 v7, p2

    goto :goto_4

    :cond_5
    and-int/lit16 v7, v6, 0x180

    if-nez v7, :cond_4

    move-object/from16 v7, p2

    invoke-virtual {v11, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_6

    const/16 v8, 0x100

    goto :goto_3

    :cond_6
    const/16 v8, 0x80

    :goto_3
    or-int/2addr v3, v8

    :goto_4
    and-int/lit16 v8, v6, 0xc00

    if-nez v8, :cond_8

    invoke-virtual {v11, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_7

    const/16 v8, 0x800

    goto :goto_5

    :cond_7
    const/16 v8, 0x400

    :goto_5
    or-int/2addr v3, v8

    :cond_8
    and-int/lit16 v8, v3, 0x493

    const/16 v9, 0x492

    const/4 v10, 0x1

    if-eq v8, v9, :cond_9

    move v8, v10

    goto :goto_6

    :cond_9
    const/4 v8, 0x0

    :goto_6
    and-int/2addr v3, v10

    invoke-virtual {v11, v3, v8}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_b

    if-eqz v5, :cond_a

    sget-object v3, Lb2/t;->w:Lb2/t;

    goto :goto_7

    :cond_a
    move-object v3, v7

    :goto_7
    sget-object v5, Lg1/d1;->a:Lp1/u2;

    invoke-virtual {v11, v5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v5

    move-object v12, v5

    check-cast v12, Lg1/c1;

    sget-object v5, Lx81/d;->a:Lx81/d;

    const/4 v7, 0x6

    invoke-virtual {v5, v11, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->V0()J

    move-result-wide v15

    const-wide/16 v17, 0x0

    const/16 v19, 0x1fdf

    const-wide/16 v13, 0x0

    invoke-static/range {v12 .. v19}, Lg1/c1;->a(Lg1/c1;JJJI)Lg1/c1;

    move-result-object v7

    sget-object v5, Lg1/m5;->a:Lp1/u2;

    invoke-virtual {v11, v5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lg1/l5;

    const/4 v8, 0x5

    int-to-float v9, v8

    int-to-float v1, v1

    mul-float/2addr v9, v1

    invoke-static {v9}, Lt0/j;->e(F)Lt0/i;

    move-result-object v1

    const/4 v9, 0x0

    invoke-static {v5, v9, v1, v8}, Lg1/l5;->a(Lg1/l5;Lt0/i;Lt0/i;I)Lg1/l5;

    move-result-object v9

    new-instance v0, Lay/a0;

    const/16 v5, 0x8

    move/from16 v1, p0

    invoke-direct/range {v0 .. v5}, Lay/a0;-><init>(ZLc93/a;Ljava/lang/Object;Ll83/e;I)V

    const v1, 0x2bd8b89c

    invoke-static {v1, v11, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v10

    const/16 v12, 0xc00

    const/4 v13, 0x2

    const/4 v8, 0x0

    invoke-static/range {v7 .. v13}, Lio/sentry/config/a;->g(Lg1/c1;Lg1/h9;Lg1/l5;Lx1/b;Landroidx/compose/runtime/Composer;II)V

    goto :goto_8

    :cond_b
    invoke-virtual {v11}, Lp1/q;->X()V

    move-object v3, v7

    :goto_8
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_c

    new-instance v0, Law0/h;

    move/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v4, p3

    move v5, v6

    move/from16 v6, p6

    invoke-direct/range {v0 .. v6}, Law0/h;-><init>(ZLc93/a;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;II)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_c
    return-void
.end method

.method private static final d(ZLc93/a;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 14

    and-int/lit8 v0, p5, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p5, 0x1

    move-object/from16 v11, p4

    check-cast v11, Lp1/q;

    invoke-virtual {v11, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lp31/f;->H()Landroidx/compose/ui/Modifier;

    move-result-object v0

    move-object/from16 v1, p2

    invoke-interface {v0, v1}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    int-to-float v1, v2

    const/16 v2, 0x8

    int-to-float v2, v2

    mul-float/2addr v1, v2

    invoke-static {v0, v1, v1}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const/4 v12, 0x0

    const/16 v13, 0x38

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move v3, p0

    move-object v4, p1

    move-object/from16 v10, p3

    invoke-static/range {v3 .. v13}, Lg1/f0;->a(ZLc93/a;Landroidx/compose/ui/Modifier;JLf0/r1;Lc4/j0;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_1
    invoke-virtual {v11}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(ZLc93/a;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v6, p5

    move-object v4, p6

    invoke-static/range {v0 .. v6}, Lp31/q;->c(ZLc93/a;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
