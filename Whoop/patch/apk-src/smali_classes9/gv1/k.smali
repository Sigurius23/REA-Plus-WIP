.class public abstract Lgv1/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a?\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\u0002H\u0007\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "",
        "urlInput",
        "Lkotlin/Function1;",
        "Ll83/a0;",
        "onUrlInputChange",
        "Lgv1/l;",
        "onConfirm",
        "d",
        "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "lottie-tester_release"
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
.method public static synthetic a(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lgv1/l;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lgv1/k;->e(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lgv1/l;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b()Ll83/a0;
    .locals 1

    invoke-static {}, Lgv1/k;->f()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lgv1/k;->g(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    const-string v4, "urlInput"

    invoke-static {p0, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "onUrlInputChange"

    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "onConfirm"

    invoke-static {p2, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v7, p3

    check-cast v7, Lp1/q;

    const v4, -0x2ebdfc93

    invoke-virtual {v7, v4}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v4, p4, 0x6

    if-nez v4, :cond_1

    invoke-virtual {v7, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, p4

    goto :goto_1

    :cond_1
    move v4, p4

    :goto_1
    and-int/lit8 v5, p4, 0x30

    if-nez v5, :cond_3

    invoke-virtual {v7, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v4, v5

    :cond_3
    and-int/lit16 v5, p4, 0x180

    if-nez v5, :cond_5

    invoke-virtual {v7, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x100

    goto :goto_3

    :cond_4
    const/16 v5, 0x80

    :goto_3
    or-int/2addr v4, v5

    :cond_5
    and-int/lit16 v5, v4, 0x93

    const/16 v6, 0x92

    const/4 v8, 0x1

    if-eq v5, v6, :cond_6

    move v5, v8

    goto :goto_4

    :cond_6
    const/4 v5, 0x0

    :goto_4
    and-int/lit8 v6, v4, 0x1

    invoke-virtual {v7, v6, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_7

    invoke-static {p0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v5

    xor-int/2addr v5, v8

    new-instance v6, Lgv1/i;

    invoke-direct {v6, p0, p1}, Lgv1/i;-><init>(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    const v8, 0x43941366

    invoke-static {v8, v7, v6}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v6

    and-int/lit16 v4, v4, 0x380

    or-int/lit16 v8, v4, 0xc06

    const-string v3, "Please, enter the URL you want to override"

    move v4, v5

    move-object v5, p2

    invoke-static/range {v3 .. v8}, Lgv1/n;->e(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V

    goto :goto_5

    :cond_7
    invoke-virtual {v7}, Lp1/q;->X()V

    :goto_5
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_8

    new-instance v0, Lcy1/b;

    const/16 v5, 0x1d

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p4

    invoke-direct/range {v0 .. v5}, Lcy1/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_8
    return-void
.end method

.method private static final e(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lgv1/l;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 42

    const-string v0, "$unused$var$"

    move-object/from16 v1, p2

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v0, p4, 0x11

    const/16 v1, 0x10

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p4, 0x1

    move-object/from16 v2, p3

    check-cast v2, Lp1/q;

    invoke-virtual {v2, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Lb2/t;->w:Lb2/t;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static/range {p0 .. p0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v10

    const/4 v1, 0x4

    int-to-float v1, v1

    mul-float/2addr v1, v1

    invoke-static {v1}, Lt0/j;->e(F)Lt0/i;

    move-result-object v28

    sget-object v1, Lgv1/b;->a:Lgv1/b;

    invoke-virtual {v1}, Lgv1/b;->b()Lc93/m;

    move-result-object v8

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-ne v1, v4, :cond_1

    new-instance v1, Lgp1/a;

    const/16 v4, 0x11

    invoke-direct {v1, v4}, Lgp1/a;-><init>(I)V

    invoke-virtual {v2, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    move-object/from16 v33, v1

    check-cast v33, Lc93/a;

    sget v1, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v4, v1, 0x3

    const v5, 0x180006

    or-int/2addr v4, v5

    shl-int/lit8 v1, v1, 0x18

    or-int v36, v4, v1

    const v40, 0x3dffbebc

    const/16 v41, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x5

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v37, 0x6000

    const/16 v38, 0x0

    const/16 v39, 0x6

    move-object/from16 v34, p1

    move-object/from16 v35, v2

    move-object v2, v0

    invoke-static/range {v2 .. v41}, Lqz0/k;->l(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lb91/a;Lcom/whoop/design/util/TextResource;Lb91/a;Lc93/m;Lc93/m;Lqz0/c;Lcom/whoop/design/util/TextResource;ZZLb91/a;JZIIIZLq3/g0;ZZIZLj0/i;Ljava/lang/String;Li2/a1;Lg1/e8;Ll0/k1;Ll0/k1;Lu0/q0;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;IIIIII)V

    goto :goto_1

    :cond_2
    move-object/from16 v35, v2

    invoke-virtual/range {v35 .. v35}, Lp1/q;->X()V

    :goto_1
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final f()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final g(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Lgv1/k;->d(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
