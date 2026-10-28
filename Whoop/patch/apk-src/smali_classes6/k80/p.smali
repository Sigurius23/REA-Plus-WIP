.class public abstract Lk80/p;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a5\u0010\u0007\u001a\u00020\u00052\n\u0008\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\u0007\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/whoop/design/util/TextResource;",
        "buttonText",
        "",
        "testTag",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onClick",
        "d",
        "(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;II)V",
        "activation_release"
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

    invoke-static {}, Lk80/p;->e()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic b(Lcom/whoop/design/util/TextResource;Ll0/s1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lk80/p;->f(Lcom/whoop/design/util/TextResource;Ll0/s1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lk80/p;->g(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/util/TextResource;",
            "Ljava/lang/String;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move/from16 v4, p4

    move-object/from16 v13, p3

    check-cast v13, Lp1/q;

    const v1, 0x6a0903ab

    invoke-virtual {v13, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p5, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v2, v4, 0x6

    goto :goto_2

    :cond_0
    and-int/lit8 v2, v4, 0x6

    if-nez v2, :cond_3

    and-int/lit8 v2, v4, 0x8

    if-nez v2, :cond_1

    invoke-virtual {v13, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    goto :goto_0

    :cond_1
    invoke-virtual {v13, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    :goto_0
    if-eqz v2, :cond_2

    const/4 v2, 0x4

    goto :goto_1

    :cond_2
    const/4 v2, 0x2

    :goto_1
    or-int/2addr v2, v4

    goto :goto_2

    :cond_3
    move v2, v4

    :goto_2
    and-int/lit8 v3, p5, 0x2

    if-eqz v3, :cond_5

    or-int/lit8 v2, v2, 0x30

    :cond_4
    move-object/from16 v5, p1

    goto :goto_4

    :cond_5
    and-int/lit8 v5, v4, 0x30

    if-nez v5, :cond_4

    move-object/from16 v5, p1

    invoke-virtual {v13, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_6

    const/16 v6, 0x20

    goto :goto_3

    :cond_6
    const/16 v6, 0x10

    :goto_3
    or-int/2addr v2, v6

    :goto_4
    and-int/lit8 v6, p5, 0x4

    if-eqz v6, :cond_8

    or-int/lit16 v2, v2, 0x180

    :cond_7
    move-object/from16 v7, p2

    goto :goto_6

    :cond_8
    and-int/lit16 v7, v4, 0x180

    if-nez v7, :cond_7

    move-object/from16 v7, p2

    invoke-virtual {v13, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_9

    const/16 v8, 0x100

    goto :goto_5

    :cond_9
    const/16 v8, 0x80

    :goto_5
    or-int/2addr v2, v8

    :goto_6
    and-int/lit16 v8, v2, 0x93

    const/16 v9, 0x92

    if-eq v8, v9, :cond_a

    const/4 v8, 0x1

    goto :goto_7

    :cond_a
    const/4 v8, 0x0

    :goto_7
    and-int/lit8 v9, v2, 0x1

    invoke-virtual {v13, v9, v8}, Lp1/q;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_f

    if-eqz v1, :cond_b

    const/4 v0, 0x0

    :cond_b
    if-eqz v3, :cond_c

    const-string v1, "Forgot Password Button Tag"

    goto :goto_8

    :cond_c
    move-object v1, v5

    :goto_8
    if-eqz v6, :cond_e

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-ne v3, v5, :cond_d

    new-instance v3, Ljx2/b;

    const/16 v5, 0xc

    invoke-direct {v3, v5}, Ljx2/b;-><init>(I)V

    invoke-virtual {v13, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v3, Lc93/a;

    move-object v5, v3

    goto :goto_9

    :cond_e
    move-object v5, v7

    :goto_9
    sget-object v3, Lb2/t;->w:Lb2/t;

    invoke-static {v3, v1}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/4 v3, 0x3

    const/4 v7, 0x0

    invoke-static {v7, v7, v3}, Landroidx/compose/foundation/layout/a;->a(FFI)Ll0/l1;

    move-result-object v11

    new-instance v3, Lby1/c;

    const/4 v7, 0x3

    invoke-direct {v3, v0, v7}, Lby1/c;-><init>(Lcom/whoop/design/util/TextResource;I)V

    const v7, -0x57776df2

    invoke-static {v7, v13, v3}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v12

    shr-int/lit8 v2, v2, 0x6

    and-int/lit8 v2, v2, 0xe

    const/high16 v3, 0x36000000

    or-int v14, v2, v3

    const/16 v15, 0xfc

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v5 .. v15}, Ldt/b;->d(Lc93/a;Landroidx/compose/ui/Modifier;ZLi2/a1;Lf0/t;Lg1/m1;Ll0/l1;Lx1/b;Landroidx/compose/runtime/Composer;II)V

    move-object v2, v1

    move-object v3, v5

    :goto_a
    move-object v1, v0

    goto :goto_b

    :cond_f
    invoke-virtual {v13}, Lp1/q;->X()V

    move-object v2, v5

    move-object v3, v7

    goto :goto_a

    :goto_b
    invoke-virtual {v13}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_10

    new-instance v0, Ljp1/d;

    const/16 v6, 0x9

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Ljp1/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_10
    return-void
.end method

.method private static final e()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final f(Lcom/whoop/design/util/TextResource;Ll0/s1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 30

    move-object/from16 v0, p0

    const-string v1, "$this$TextButton"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v1, p3, 0x11

    const/16 v2, 0x10

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eq v1, v2, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    move v1, v4

    :goto_0
    and-int/lit8 v2, p3, 0x1

    move-object/from16 v3, p2

    check-cast v3, Lp1/q;

    invoke-virtual {v3, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_3

    if-nez v0, :cond_1

    const v0, 0x6cdd4533    # 2.1399951E27f

    invoke-virtual {v3, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v3, v4}, Lp1/q;->q(Z)V

    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    const v1, 0x6cdd4534    # 2.1399953E27f

    invoke-virtual {v3, v1}, Lp1/q;->e0(I)V

    sget v1, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v0, v3, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v4}, Lp1/q;->q(Z)V

    :goto_1
    if-nez v0, :cond_2

    const v0, -0x5753aed9

    invoke-virtual {v3, v0}, Lp1/q;->e0(I)V

    sget v0, Lx60/b;->x:I

    invoke-static {v0, v3, v4}, Lcom/whoop/design/util/b;->g(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    :goto_2
    invoke-virtual {v3, v4}, Lp1/q;->q(Z)V

    move-object v5, v0

    goto :goto_3

    :cond_2
    const v1, -0x5753b4a9

    invoke-virtual {v3, v1}, Lp1/q;->e0(I)V

    goto :goto_2

    :goto_3
    sget-object v0, Lx81/d;->a:Lx81/d;

    sget v1, Lx81/d;->b:I

    invoke-virtual {v0, v3, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->k()Lb91/a;

    move-result-object v0

    invoke-virtual {v0}, Lb91/a;->d()Ll3/v0;

    move-result-object v6

    sget-object v7, Li2/t;->b:Li2/s;

    const-wide v0, 0xff0093e7L

    invoke-static {v0, v1}, Li2/w0;->e(J)J

    move-result-wide v0

    new-instance v2, Li2/x;

    invoke-direct {v2, v0, v1}, Li2/x;-><init>(J)V

    const-wide v0, 0xff4c9bd9L

    invoke-static {v0, v1}, Li2/w0;->e(J)J

    move-result-wide v0

    new-instance v4, Li2/x;

    invoke-direct {v4, v0, v1}, Li2/x;-><init>(J)V

    const-wide v0, 0xff66bcffL

    invoke-static {v0, v1}, Li2/w0;->e(J)J

    move-result-wide v0

    new-instance v8, Li2/x;

    invoke-direct {v8, v0, v1}, Li2/x;-><init>(J)V

    filled-new-array {v2, v4, v8}, [Li2/x;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    const-wide/16 v11, 0x0

    const/16 v13, 0xe

    const-wide/16 v9, 0x0

    invoke-static/range {v7 .. v13}, Li2/s;->d(Li2/s;Ljava/util/List;JJI)Li2/k0;

    move-result-object v7

    const-wide/16 v12, 0x0

    const v14, 0x1fffffe

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v6 .. v14}, Ll3/v0;->a(Ll3/v0;Li2/t;JLp3/r;Lp3/i;JI)Ll3/v0;

    move-result-object v25

    const/16 v28, 0x0

    const v29, 0xfffe

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    const-wide/16 v9, 0x0

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

    const/16 v27, 0x0

    move-object/from16 v26, v3

    invoke-static/range {v5 .. v29}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    goto :goto_4

    :cond_3
    move-object/from16 v26, v3

    invoke-virtual/range {v26 .. v26}, Lp1/q;->X()V

    :goto_4
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final g(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lk80/p;->d(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
