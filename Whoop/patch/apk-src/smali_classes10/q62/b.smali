.class public abstract Lq62/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u001a\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u000b\u00b2\u0006\u000e\u0010\n\u001a\u00020\t8\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "",
        "currentProgress",
        "totalSteps",
        "Ll83/a0;",
        "b",
        "(IILandroidx/compose/runtime/Composer;I)V",
        "",
        "g",
        "(II)F",
        "",
        "isReady",
        "refer-a-friend_release"
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
.method public static synthetic a(IIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lq62/b;->e(IIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(IILandroidx/compose/runtime/Composer;I)V
    .locals 16

    move/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p3

    move-object/from16 v3, p2

    check-cast v3, Lp1/q;

    const v4, -0x4c044312

    invoke-virtual {v3, v4}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v4, v2, 0x6

    const/4 v5, 0x4

    if-nez v4, :cond_1

    invoke-virtual {v3, v0}, Lp1/q;->e(I)Z

    move-result v4

    if-eqz v4, :cond_0

    move v4, v5

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v2

    goto :goto_1

    :cond_1
    move v4, v2

    :goto_1
    and-int/lit8 v6, v2, 0x30

    if-nez v6, :cond_3

    invoke-virtual {v3, v1}, Lp1/q;->e(I)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x20

    goto :goto_2

    :cond_2
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v4, v6

    :cond_3
    and-int/lit8 v6, v4, 0x13

    const/16 v7, 0x12

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-eq v6, v7, :cond_4

    move v6, v9

    goto :goto_3

    :cond_4
    move v6, v8

    :goto_3
    and-int/2addr v4, v9

    invoke-virtual {v3, v4, v6}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_b

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    sget-object v6, Lp1/l;->a:Lp1/v0;

    if-ne v4, v6, :cond_5

    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v4}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v4

    invoke-virtual {v3, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v4, Lp1/c1;

    invoke-static/range {p0 .. p1}, Lq62/b;->g(II)F

    move-result v7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    const/4 v12, 0x0

    if-ne v11, v6, :cond_6

    new-instance v11, Lq62/b$a;

    invoke-direct {v11, v4, v12}, Lq62/b$a;-><init>(Lp1/c1;Lq83/d;)V

    invoke-virtual {v3, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v11, Lc93/m;

    invoke-static {v3, v11, v10}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-wide/high16 v10, 0x4004000000000000L    # 2.5

    double-to-float v6, v10

    int-to-float v5, v5

    mul-float/2addr v6, v5

    sget-object v10, Lb2/t;->w:Lb2/t;

    invoke-static {v6, v10}, Landroidx/compose/foundation/layout/d;->k(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    const/high16 v13, 0x3f800000    # 1.0f

    invoke-static {v13, v11}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-static {v6}, Lt0/j;->e(F)Lt0/i;

    move-result-object v14

    invoke-static {v11, v14}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    const-wide/high16 v14, 0x3fc0000000000000L    # 0.125

    double-to-float v14, v14

    mul-float/2addr v14, v5

    sget-object v15, Lx81/d;->a:Lx81/d;

    sget v9, Lx81/d;->b:I

    invoke-virtual {v15, v3, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->X0()J

    move-result-wide v12

    invoke-static {v6}, Lt0/j;->e(F)Lt0/i;

    move-result-object v6

    invoke-static {v11, v14, v12, v13, v6}, Lge3/g;->h(Landroidx/compose/ui/Modifier;FJLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const-wide/high16 v11, 0x3fe0000000000000L    # 0.5

    double-to-float v9, v11

    mul-float/2addr v9, v5

    invoke-static {v6, v9, v9}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v9, Lb2/e;->w:Lb2/m;

    invoke-static {v9, v8}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v9

    iget-wide v11, v3, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v3}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v3, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v13, La3/l;->a:La3/k;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v3}, Lp1/q;->i0()V

    iget-boolean v14, v3, Lp1/q;->S:Z

    if-eqz v14, :cond_7

    invoke-virtual {v3, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_7
    invoke-virtual {v3}, Lp1/q;->s0()V

    :goto_4
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v3, v13, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->f:La3/i;

    invoke-static {v3, v9, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->j:La3/i;

    iget-boolean v12, v3, Lp1/q;->S:Z

    if-nez v12, :cond_8

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v12, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_9

    :cond_8
    invoke-static {v11, v3, v11, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    sget-object v9, La3/k;->d:La3/i;

    invoke-static {v3, v9, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v6, 0x3

    const/4 v15, 0x0

    invoke-static {v10, v15, v6}, Landroidx/compose/animation/c;->a(Landroidx/compose/ui/Modifier;Ld0/e2;I)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/high16 v9, 0x3f800000    # 1.0f

    invoke-static {v9, v6}, Landroidx/compose/foundation/layout/d;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v4}, Lq62/b;->c(Lp1/c1;)Z

    move-result v4

    const/4 v9, 0x0

    if-eqz v4, :cond_a

    goto :goto_5

    :cond_a
    move v7, v9

    :goto_5
    invoke-static {v7, v6}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/4 v6, 0x1

    int-to-float v7, v6

    invoke-static {v4, v7, v5}, Lih0/d0;->e(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {}, Lgb1/b0;->E0()Li2/t;

    move-result-object v5

    const/4 v7, 0x6

    const/4 v15, 0x0

    invoke-static {v4, v5, v15, v9, v7}, Landroidx/compose/foundation/a;->b(Landroidx/compose/ui/Modifier;Li2/t;Li2/a1;FI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v4, v3, v8}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v3, v6}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_b
    invoke-virtual {v3}, Lp1/q;->X()V

    :goto_6
    invoke-virtual {v3}, Lp1/q;->u()Lp1/v1;

    move-result-object v3

    if-eqz v3, :cond_c

    new-instance v4, Lid2/q;

    const/4 v5, 0x2

    invoke-direct {v4, v0, v1, v2, v5}, Lid2/q;-><init>(IIII)V

    iput-object v4, v3, Lp1/v1;->d:Lc93/m;

    :cond_c
    return-void
.end method

.method private static final c(Lp1/c1;)Z
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

.method private static final d(Lp1/c1;Z)V
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

.method private static final e(IIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lq62/b;->b(IILandroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final synthetic f(Lp1/c1;Z)V
    .locals 0

    invoke-static {p0, p1}, Lq62/b;->d(Lp1/c1;Z)V

    return-void
.end method

.method public static final g(II)F
    .locals 2

    int-to-float p0, p0

    const/4 v0, 0x1

    if-ge p1, v0, :cond_0

    move p1, v0

    :cond_0
    int-to-float p1, p1

    div-float/2addr p0, p1

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    new-instance p1, Li93/e;

    const/4 v0, 0x0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-direct {p1, v0, v1}, Li93/e;-><init>(FF)V

    invoke-static {p0, p1}, Le93/b;->r(Ljava/lang/Comparable;Li93/f;)Ljava/lang/Comparable;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    move-result p0

    return p0
.end method
