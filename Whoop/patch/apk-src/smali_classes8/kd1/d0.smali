.class public abstract Lkd1/d0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a9\u0010\t\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u0007\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "",
        "isVisible",
        "Lc0/c1;",
        "enterAnimation",
        "Lc0/e1;",
        "exitAnimation",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "content",
        "c",
        "(ZLc0/c1;Lc0/e1;Lc93/m;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(Lc93/m;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lkd1/d0;->d(Lc93/m;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(ZLc0/c1;Lc0/e1;Lc93/m;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lkd1/d0;->e(ZLc0/c1;Lc0/e1;Lc93/m;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(ZLc0/c1;Lc0/e1;Lc93/m;Landroidx/compose/runtime/Composer;II)V
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lc0/c1;",
            "Lc0/e1;",
            "Lc93/m;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v4, p3

    move/from16 v5, p5

    const-string v0, "content"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v12, p4

    check-cast v12, Lp1/q;

    const v0, 0x46f32a61

    invoke-virtual {v12, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v5, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v12, p0}, Lp1/q;->h(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v5

    goto :goto_1

    :cond_1
    move v0, v5

    :goto_1
    and-int/lit8 v1, p6, 0x2

    if-eqz v1, :cond_3

    or-int/lit8 v0, v0, 0x30

    :cond_2
    move-object/from16 v2, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v2, v5, 0x30

    if-nez v2, :cond_2

    move-object/from16 v2, p1

    invoke-virtual {v12, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    const/16 v3, 0x20

    goto :goto_2

    :cond_4
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v0, v3

    :goto_3
    and-int/lit8 v3, p6, 0x4

    if-eqz v3, :cond_6

    or-int/lit16 v0, v0, 0x180

    :cond_5
    move-object/from16 v6, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v6, v5, 0x180

    if-nez v6, :cond_5

    move-object/from16 v6, p2

    invoke-virtual {v12, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    const/16 v7, 0x100

    goto :goto_4

    :cond_7
    const/16 v7, 0x80

    :goto_4
    or-int/2addr v0, v7

    :goto_5
    and-int/lit16 v7, v5, 0xc00

    if-nez v7, :cond_9

    invoke-virtual {v12, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_8

    const/16 v7, 0x800

    goto :goto_6

    :cond_8
    const/16 v7, 0x400

    :goto_6
    or-int/2addr v0, v7

    :cond_9
    and-int/lit16 v7, v0, 0x493

    const/16 v8, 0x492

    if-eq v7, v8, :cond_a

    const/4 v7, 0x1

    goto :goto_7

    :cond_a
    const/4 v7, 0x0

    :goto_7
    and-int/lit8 v8, v0, 0x1

    invoke-virtual {v12, v8, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_d

    const/4 v7, 0x3

    const/4 v8, 0x0

    if-eqz v1, :cond_b

    invoke-static {v8, v7}, Lc0/w0;->e(Ld0/c0;I)Lc0/d1;

    move-result-object v1

    goto :goto_8

    :cond_b
    move-object v1, v2

    :goto_8
    if-eqz v3, :cond_c

    invoke-static {v8, v7}, Lc0/w0;->f(Ld0/c0;I)Lc0/f1;

    move-result-object v2

    move-object v9, v2

    goto :goto_9

    :cond_c
    move-object v9, v6

    :goto_9
    new-instance v2, Lkd1/c0;

    const/4 v3, 0x0

    invoke-direct {v2, v3, v4}, Lkd1/c0;-><init>(ILc93/m;)V

    const v3, 0x16857339

    invoke-static {v3, v12, v2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v11

    and-int/lit8 v2, v0, 0xe

    const/high16 v3, 0x30000

    or-int/2addr v2, v3

    shl-int/2addr v0, v7

    and-int/lit16 v3, v0, 0x380

    or-int/2addr v2, v3

    and-int/lit16 v0, v0, 0x1c00

    or-int v13, v2, v0

    const/16 v14, 0x12

    const/4 v7, 0x0

    const/4 v10, 0x0

    move v6, p0

    move-object v8, v1

    invoke-static/range {v6 .. v14}, Landroidx/compose/animation/b;->f(ZLandroidx/compose/ui/Modifier;Lc0/c1;Lc0/e1;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    move-object v2, v8

    move-object v3, v9

    goto :goto_a

    :cond_d
    invoke-virtual {v12}, Lp1/q;->X()V

    move-object v3, v6

    :goto_a
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_e

    new-instance v0, Law0/h;

    move v1, p0

    move/from16 v6, p6

    invoke-direct/range {v0 .. v6}, Law0/h;-><init>(ZLc0/c1;Lc0/e1;Lc93/m;II)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_e
    return-void
.end method

.method private static final d(Lc93/m;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    const-string p3, "$this$AnimatedVisibility"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p0, p2, p1}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(ZLc0/c1;Lc0/e1;Lc93/m;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
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

    invoke-static/range {v0 .. v6}, Lkd1/d0;->c(ZLc0/c1;Lc0/e1;Lc93/m;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
