.class public abstract Lzc1/x4;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u00a8\u0006\u0005\u00b2\u0006\u000e\u0010\u0004\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Ll83/a0;",
        "e",
        "(Landroidx/compose/runtime/Composer;I)V",
        "",
        "enabled",
        "design-showcase_release"
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
.method public static synthetic a(Lp1/c1;Ll0/s1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lzc1/x4;->h(Lp1/c1;Ll0/s1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lzc1/x4;->i(Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lzc1/x4;->k(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lp1/c1;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzc1/x4;->j(Lp1/c1;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Landroidx/compose/runtime/Composer;I)V
    .locals 13

    move-object v3, p0

    check-cast v3, Lp1/q;

    const p0, -0x4b324812

    invoke-virtual {v3, p0}, Lp1/q;->g0(I)Lp1/q;

    const/4 p0, 0x0

    const/4 v6, 0x1

    if-eqz p1, :cond_0

    move v0, v6

    goto :goto_0

    :cond_0
    move v0, p0

    :goto_0
    and-int/lit8 v1, p1, 0x1

    invoke-virtual {v3, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v0, v1, :cond_1

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v0

    invoke-virtual {v3, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    move-object v7, v0

    check-cast v7, Lp1/c1;

    const/4 v0, 0x4

    int-to-float v8, v0

    const/16 v0, 0x8

    int-to-float v0, v0

    mul-float/2addr v0, v8

    sget-object v9, Lb2/t;->w:Lb2/t;

    invoke-static {v0, v9}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v1, Lb2/e;->N:Lb2/k;

    sget-object v2, Ll0/m;->c:Ll0/g;

    const/16 v4, 0x30

    invoke-static {v2, v1, v3, v4}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    iget-wide v4, v3, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v3}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v3, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v5, La3/l;->a:La3/k;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, La3/k;->b:La3/j;

    invoke-virtual {v3}, Lp1/q;->i0()V

    iget-boolean v10, v3, Lp1/q;->S:Z

    if-eqz v10, :cond_2

    invoke-virtual {v3, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_2
    invoke-virtual {v3}, Lp1/q;->s0()V

    :goto_1
    sget-object v5, La3/k;->g:La3/i;

    invoke-static {v3, v5, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v3, v1, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v4, v3, Lp1/q;->S:Z

    if-nez v4, :cond_3

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4

    :cond_3
    invoke-static {v2, v3, v2, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_4
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v3, v1, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-string v0, "Centered"

    const/4 v10, 0x6

    invoke-static {v0, v3, v10}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    const/4 v0, 0x2

    int-to-float v0, v0

    mul-float v11, v0, v8

    invoke-static {v11, v9}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v3, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const v0, 0x4ebb7523

    invoke-virtual {v3, v0}, Lp1/q;->e0(I)V

    invoke-static {}, Ly71/m;->a()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_2
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ly71/o;

    sget v0, Ly71/o;->q:I

    shl-int/lit8 v4, v0, 0x3

    const/4 v5, 0x5

    const/4 v0, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Ly71/n;->c(Landroidx/compose/ui/Modifier;Ly71/o;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    int-to-float v0, v6

    invoke-static {v0, v8, v9, v3}, Lih0/d0;->u(FFLb2/t;Lp1/q;)V

    goto :goto_2

    :cond_5
    invoke-virtual {v3, p0}, Lp1/q;->q(Z)V

    mul-float v12, v8, v8

    invoke-static {v12, v9}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v3, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const-string v0, "Left-Aligned"

    invoke-static {v0, v3, v10}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v11, v9}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v3, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const v0, 0x4ebb99a3

    invoke-virtual {v3, v0}, Lp1/q;->e0(I)V

    invoke-static {}, Ly71/m;->b()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_3
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ly71/o;

    sget v0, Ly71/o;->q:I

    shl-int/lit8 v4, v0, 0x3

    const/4 v5, 0x5

    const/4 v0, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Ly71/n;->c(Landroidx/compose/ui/Modifier;Ly71/o;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    int-to-float v0, v6

    invoke-static {v0, v8, v9, v3}, Lih0/d0;->u(FFLb2/t;Lp1/q;)V

    goto :goto_3

    :cond_6
    invoke-static {v3, p0, v9, v12, v3}, Lhc3/i;->r(Lp1/q;ZLb2/t;FLp1/q;)V

    const-string v0, "Activity Menu Item"

    invoke-static {v0, v3, v10}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    new-instance v0, Lea2/g;

    const/16 v1, 0xc

    invoke-direct {v0, v1, v7}, Lea2/g;-><init>(ILp1/c1;)V

    const v1, 0x461dd3cb

    invoke-static {v1, v3, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v0

    invoke-static {v0, v3, v10}, Lbd1/p;->c(Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v7}, Lzc1/x4;->f(Lp1/c1;)Z

    move-result v0

    invoke-static {v0, v3, p0, p0}, Ll31/a;->b(ZLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v3, v6}, Lp1/q;->q(Z)V

    goto :goto_4

    :cond_7
    invoke-virtual {v3}, Lp1/q;->X()V

    :goto_4
    invoke-virtual {v3}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_8

    new-instance v0, Lzc1/s3;

    const/16 v1, 0x1b

    invoke-direct {v0, p1, v1}, Lzc1/s3;-><init>(II)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_8
    return-void
.end method

.method private static final f(Lp1/c1;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")Z"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final g(Lp1/c1;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Z)V"
        }
    .end annotation

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final h(Lp1/c1;Ll0/s1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 28

    const-string v0, "$this$GalleryRowCard"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v0, p3, 0x11

    const/16 v1, 0x10

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p3, 0x1

    move-object/from16 v11, p2

    check-cast v11, Lp1/q;

    invoke-virtual {v11, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Lx81/d;->a:Lx81/d;

    sget v1, Lx81/d;->b:I

    invoke-virtual {v0, v11, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->a()J

    move-result-wide v4

    new-instance v2, Lcom/whoop/profile/view/edit/c;

    const/16 v3, 0xb

    move-object/from16 v14, p0

    invoke-direct {v2, v3, v14}, Lcom/whoop/profile/view/edit/c;-><init>(ILp1/c1;)V

    const v3, 0x22ae2e72

    invoke-static {v3, v11, v2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v10

    const/16 v12, 0x6000

    const/16 v13, 0xd

    const-wide/16 v2, 0x0

    const-wide/16 v6, 0x0

    const-wide/16 v8, 0x0

    invoke-static/range {v2 .. v13}, Ly81/c;->b(JJJJLc93/m;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v0, v11, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v4

    invoke-static {v14}, Lzc1/x4;->f(Lp1/c1;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "Enabled"

    :goto_1
    move-object v2, v0

    goto :goto_2

    :cond_1
    const-string v0, "Disabled"

    goto :goto_1

    :goto_2
    const/16 v26, 0x0

    const v27, 0x3fffa

    const/4 v3, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object/from16 v24, v11

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    goto :goto_3

    :cond_2
    move-object/from16 v24, v11

    invoke-virtual/range {v24 .. v24}, Lp1/q;->X()V

    :goto_3
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final i(Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 12

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/2addr p2, v2

    move-object v9, p1

    check-cast v9, Lp1/q;

    invoke-virtual {v9, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-static {p0}, Lzc1/x4;->f(Lp1/c1;)Z

    move-result v2

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lp1/l;->a:Lp1/v0;

    if-ne p1, p2, :cond_1

    new-instance p1, Lzc1/n0;

    const/16 p2, 0x17

    invoke-direct {p1, p2, p0}, Lzc1/n0;-><init>(ILp1/c1;)V

    invoke-virtual {v9, p1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    move-object v8, p1

    check-cast v8, Lkotlin/jvm/functions/Function1;

    const/high16 v10, 0x180000

    const/16 v11, 0x3d

    const/4 v1, 0x0

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v1 .. v11}, Lpz0/d;->e(Landroidx/compose/ui/Modifier;ZZJLpz0/e;Li2/t;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_2
    invoke-virtual {v9}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Lp1/c1;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzc1/x4;->g(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lzc1/x4;->e(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
