.class public abstract Lwi0/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u001a\u0085\u0001\u0010\u000e\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u000e\u0008\u0002\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u00042\u001a\u0008\u0002\u0010\u0008\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00062\u0014\u0008\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\t2\u000e\u0008\u0002\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u000b2\u000e\u0008\u0002\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u000bH\u0007\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u001a]\u0010\u0015\u001a\u00020\u00072\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u00042\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\t2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\t2\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u000b2\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u0013H\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0016\u001a3\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00002\u000c\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u000b2\u000c\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u000bH\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001e\u00b2\u0006\u000e\u0010\u001c\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u0003\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002\u00b2\u0006\u0014\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u00048\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "",
        "initialEndpoint",
        "",
        "isCacheEnabled",
        "",
        "recentEndpoints",
        "Lkotlin/Function2;",
        "Ll83/a0;",
        "onNavigateToGeneric",
        "Lkotlin/Function1;",
        "onDeleteRecentEndpoint",
        "Lkotlin/Function0;",
        "onClearRecentEndpoints",
        "onNavigateBack",
        "p",
        "(Ljava/lang/String;ZLjava/util/List;Lc93/m;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V",
        "onEndpointClicked",
        "onDeleteClicked",
        "onClearClicked",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "K",
        "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V",
        "endpoint",
        "onClick",
        "onDeleteClick",
        "I",
        "(Ljava/lang/String;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V",
        "endpointPath",
        "recentPaths",
        "arch-v2_release"
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
.method private static final A(Lc93/m;Lp1/c1;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p1}, Lwi0/e;->E(Lp1/c1;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p2}, Lwi0/e;->G(Lp1/c1;)Z

    move-result p2

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-interface {p0, p1, p2}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final B(Ljava/lang/String;ZLjava/util/List;Lc93/m;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 11

    or-int/lit8 v0, p7, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v9

    move-object v1, p0

    move v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v10, p8

    move-object/from16 v8, p9

    invoke-static/range {v1 .. v10}, Lwi0/e;->p(Ljava/lang/String;ZLjava/util/List;Lc93/m;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final C()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final D()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final E(Lp1/c1;)Ljava/lang/String;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method

.method private static final F(Lp1/c1;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final G(Lp1/c1;)Z
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

.method private static final H(Lp1/c1;Z)V
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

.method private static final I(Ljava/lang/String;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 30
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lc93/a;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move/from16 v1, p4

    move-object/from16 v5, p3

    check-cast v5, Lp1/q;

    const v2, -0x33fa0e76    # -3.511249E7f

    invoke-virtual {v5, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v1, 0x6

    if-nez v2, :cond_1

    invoke-virtual {v5, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v1

    goto :goto_1

    :cond_1
    move v2, v1

    :goto_1
    and-int/lit8 v3, v1, 0x30

    move-object/from16 v10, p1

    if-nez v3, :cond_3

    invoke-virtual {v5, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v2, v3

    :cond_3
    and-int/lit16 v3, v1, 0x180

    if-nez v3, :cond_5

    move-object/from16 v3, p2

    invoke-virtual {v5, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x100

    goto :goto_3

    :cond_4
    const/16 v4, 0x80

    :goto_3
    or-int/2addr v2, v4

    goto :goto_4

    :cond_5
    move-object/from16 v3, p2

    :goto_4
    and-int/lit16 v4, v2, 0x93

    const/16 v6, 0x92

    const/4 v12, 0x1

    if-eq v4, v6, :cond_6

    move v4, v12

    goto :goto_5

    :cond_6
    const/4 v4, 0x0

    :goto_5
    and-int/lit8 v6, v2, 0x1

    invoke-virtual {v5, v6, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_b

    sget-object v4, Lb2/t;->w:Lb2/t;

    const/high16 v13, 0x3f800000    # 1.0f

    invoke-static {v13, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-wide v6, Li2/x;->m:J

    sget-object v8, Li2/w0;->a:Li2/v0;

    invoke-static {v4, v6, v7, v8}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/4 v9, 0x0

    const/16 v11, 0xf

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v6 .. v11}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v4

    int-to-float v6, v12

    const/16 v7, 0x8

    int-to-float v7, v7

    mul-float/2addr v6, v7

    const/4 v7, 0x0

    invoke-static {v4, v7, v6, v12}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v6, Lb2/e;->K:Lb2/l;

    sget-object v7, Ll0/m;->a:Ll0/e;

    const/16 v8, 0x30

    invoke-static {v7, v6, v5, v8}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v6

    iget-wide v7, v5, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v5, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v10, v5, Lp1/q;->S:Z

    if-eqz v10, :cond_7

    invoke-virtual {v5, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_7
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_6
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v5, v9, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v5, v6, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v8, v5, Lp1/q;->S:Z

    if-nez v8, :cond_8

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_9

    :cond_8
    invoke-static {v7, v5, v7, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v5, v6, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    float-to-double v6, v13

    const-wide/16 v8, 0x0

    cmpl-double v4, v6, v8

    if-lez v4, :cond_a

    goto :goto_7

    :cond_a
    const-string v4, "invalid weight; must be greater than zero"

    invoke-static {v4}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_7
    new-instance v1, Landroidx/compose/foundation/layout/LayoutWeightElement;

    invoke-direct {v1, v13, v12}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    sget-object v4, Lx81/d;->a:Lx81/d;

    sget v6, Lx81/d;->b:I

    invoke-virtual {v4, v5, v6}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v7

    invoke-virtual {v7}, Lb91/d;->b()Lb91/a;

    move-result-object v20

    invoke-virtual {v4, v5, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->y()J

    move-result-wide v6

    and-int/lit8 v23, v2, 0xe

    sget v4, Lb91/a;->d:I

    shl-int/lit8 v24, v4, 0x12

    const v25, 0x2fff8

    move-object/from16 v22, v5

    const-wide/16 v4, 0x0

    move-wide/from16 v28, v6

    move v7, v2

    move-wide/from16 v2, v28

    const/4 v6, 0x0

    move v8, v7

    const/4 v7, 0x0

    move v9, v8

    const/4 v8, 0x0

    move v11, v9

    const-wide/16 v9, 0x0

    move v13, v11

    const/4 v11, 0x0

    move v14, v12

    const/4 v12, 0x0

    move v15, v13

    move/from16 v16, v14

    const-wide/16 v13, 0x0

    move/from16 v17, v15

    const/4 v15, 0x0

    move/from16 v18, v16

    const/16 v16, 0x0

    move/from16 v19, v17

    const/16 v17, 0x0

    move/from16 v21, v18

    const/16 v18, 0x0

    move/from16 v26, v19

    const/16 v19, 0x0

    move/from16 v27, v21

    const/16 v21, 0x0

    invoke-static/range {v0 .. v25}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object v8, v0

    new-instance v0, Lny0/o;

    sget-object v10, Lny0/q$c;->f:Lny0/q$c;

    sget-object v1, Lgz0/m0;->DELETE:Lgz0/m0;

    invoke-virtual {v1}, Lgz0/m0;->toWhoopIcon()I

    move-result v11

    sget-object v12, Ly81/f;->WHITE_50:Ly81/f;

    const/16 v20, 0x3f8

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object v9, v0

    invoke-direct/range {v9 .. v21}, Lny0/o;-><init>(Lny0/q;ILy81/e;Ly81/e;Ly81/e;ZZZFZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v1, "Remove "

    const-string v2, " from recents"

    invoke-static {v1, v8, v2}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sget v2, Lny0/o;->k:I

    const v3, 0xe000

    shl-int/lit8 v4, v26, 0x6

    and-int/2addr v3, v4

    or-int v6, v2, v3

    const/16 v7, 0xc

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object/from16 v4, p2

    move-object/from16 v5, v22

    invoke-static/range {v0 .. v7}, Lny0/b1;->d(Lny0/o;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    const/4 v14, 0x1

    invoke-virtual {v5, v14}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_b
    move-object v8, v0

    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_8
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_c

    new-instance v0, Lt20/o;

    const/4 v5, 0x1

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    move-object v1, v8

    invoke-direct/range {v0 .. v5}, Lt20/o;-><init>(Ljava/lang/String;Lc93/a;Lc93/a;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_c
    return-void
.end method

.method private static final J(Ljava/lang/String;Lc93/a;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Lwi0/e;->I(Ljava/lang/String;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final K(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 39
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Lc93/a;",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v6, p6

    move-object/from16 v0, p5

    check-cast v0, Lp1/q;

    const v4, 0x17ed0113

    invoke-virtual {v0, v4}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v4, v6, 0x6

    if-nez v4, :cond_1

    invoke-virtual {v0, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v6

    goto :goto_1

    :cond_1
    move v4, v6

    :goto_1
    and-int/lit8 v5, v6, 0x30

    if-nez v5, :cond_3

    invoke-virtual {v0, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v4, v5

    :cond_3
    and-int/lit16 v5, v6, 0x180

    if-nez v5, :cond_5

    invoke-virtual {v0, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x100

    goto :goto_3

    :cond_4
    const/16 v5, 0x80

    :goto_3
    or-int/2addr v4, v5

    :cond_5
    and-int/lit16 v5, v6, 0xc00

    if-nez v5, :cond_7

    move-object/from16 v5, p3

    invoke-virtual {v0, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_6

    const/16 v9, 0x800

    goto :goto_4

    :cond_6
    const/16 v9, 0x400

    :goto_4
    or-int/2addr v4, v9

    goto :goto_5

    :cond_7
    move-object/from16 v5, p3

    :goto_5
    and-int/lit8 v9, p7, 0x10

    if-eqz v9, :cond_9

    or-int/lit16 v4, v4, 0x6000

    :cond_8
    move-object/from16 v10, p4

    goto :goto_7

    :cond_9
    and-int/lit16 v10, v6, 0x6000

    if-nez v10, :cond_8

    move-object/from16 v10, p4

    invoke-virtual {v0, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_a

    const/16 v11, 0x4000

    goto :goto_6

    :cond_a
    const/16 v11, 0x2000

    :goto_6
    or-int/2addr v4, v11

    :goto_7
    and-int/lit16 v11, v4, 0x2493

    const/16 v12, 0x2492

    const/4 v13, 0x0

    if-eq v11, v12, :cond_b

    const/4 v11, 0x1

    goto :goto_8

    :cond_b
    move v11, v13

    :goto_8
    and-int/lit8 v12, v4, 0x1

    invoke-virtual {v0, v12, v11}, Lp1/q;->U(IZ)Z

    move-result v11

    if-eqz v11, :cond_18

    sget-object v11, Lb2/t;->w:Lb2/t;

    if-eqz v9, :cond_c

    move-object v9, v11

    goto :goto_9

    :cond_c
    move-object v9, v10

    :goto_9
    const/high16 v10, 0x3f800000    # 1.0f

    invoke-static {v10, v9}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    sget-object v15, Ll0/m;->c:Ll0/g;

    sget-object v7, Lb2/e;->M:Lb2/k;

    invoke-static {v15, v7, v0, v13}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v7

    move-object/from16 v16, v9

    iget-wide v8, v0, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v0, v12}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    sget-object v17, La3/l;->a:La3/k;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v14, v0, Lp1/q;->S:Z

    if-eqz v14, :cond_d

    invoke-virtual {v0, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_d
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_a
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v0, v14, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->f:La3/i;

    invoke-static {v0, v7, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->j:La3/i;

    iget-boolean v15, v0, Lp1/q;->S:Z

    if-nez v15, :cond_e

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v15, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_f

    :cond_e
    invoke-static {v8, v0, v8, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_f
    sget-object v8, La3/k;->d:La3/i;

    invoke-static {v0, v8, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v10, 0x3f800000    # 1.0f

    invoke-static {v10, v11}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    sget-object v15, Lb2/e;->K:Lb2/l;

    sget-object v10, Ll0/m;->a:Ll0/e;

    const/16 v5, 0x30

    invoke-static {v10, v15, v0, v5}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v5

    move-object v15, v11

    iget-wide v10, v0, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v0, v12}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v6, v0, Lp1/q;->S:Z

    if-eqz v6, :cond_10

    invoke-virtual {v0, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_b

    :cond_10
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_b
    invoke-static {v0, v14, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v0, v7, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v5, v0, Lp1/q;->S:Z

    if-nez v5, :cond_11

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_12

    :cond_11
    invoke-static {v10, v0, v10, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_12
    invoke-static {v0, v8, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, Lx81/d;->a:Lx81/d;

    sget v6, Lx81/d;->b:I

    invoke-virtual {v5, v0, v6}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v7

    invoke-virtual {v7}, Lb91/d;->M()Lb91/a;

    move-result-object v27

    invoke-virtual {v5, v0, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->b1()J

    move-result-wide v9

    sget v33, Lb91/a;->d:I

    shl-int/lit8 v31, v33, 0x12

    const v32, 0x2fffa

    const-string v7, "Recents"

    const/4 v8, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v20, v15

    const/4 v15, 0x0

    move-object/from16 v21, v16

    const/16 v22, 0x0

    const-wide/16 v16, 0x0

    const/16 v23, 0x1

    const/16 v18, 0x0

    const/high16 v24, 0x3f800000    # 1.0f

    const/16 v19, 0x0

    move-object/from16 v26, v20

    move-object/from16 v25, v21

    const-wide/16 v20, 0x0

    move/from16 v28, v22

    const/16 v22, 0x0

    move/from16 v29, v23

    const/16 v23, 0x0

    move/from16 v30, v24

    const/16 v24, 0x0

    move-object/from16 v34, v25

    const/16 v25, 0x0

    move-object/from16 v35, v26

    const/16 v26, 0x0

    move/from16 v36, v28

    const/16 v28, 0x0

    move/from16 v37, v30

    const/16 v30, 0x6

    move/from16 v2, v29

    move-object/from16 v38, v35

    move-object/from16 v29, v0

    move/from16 v0, v37

    invoke-static/range {v7 .. v32}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v29

    float-to-double v8, v0

    const-wide/16 v10, 0x0

    cmpl-double v8, v8, v10

    if-lez v8, :cond_13

    goto :goto_c

    :cond_13
    const-string v8, "invalid weight; must be greater than zero"

    invoke-static {v8}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_c
    new-instance v8, Landroidx/compose/foundation/layout/LayoutWeightElement;

    invoke-direct {v8, v0, v2}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static {v7, v8}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const-string v8, "Clear"

    invoke-static {v8}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-virtual {v5, v7, v6}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v5

    invoke-virtual {v5}, Lb91/d;->M()Lb91/a;

    move-result-object v10

    const/4 v5, 0x0

    int-to-float v6, v5

    const/16 v8, 0x8

    int-to-float v8, v8

    mul-float/2addr v6, v8

    new-instance v11, Ll0/l1;

    invoke-direct {v11, v6, v6, v6, v6}, Ll0/l1;-><init>(FFFF)V

    move-object v6, v1

    check-cast v6, Ljava/util/Collection;

    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    move-result v6

    xor-int/2addr v6, v2

    sget v12, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v12, v12, 0x6

    const/high16 v13, 0x36030000

    or-int/2addr v12, v13

    shl-int/lit8 v13, v33, 0x9

    or-int v19, v12, v13

    shr-int/lit8 v12, v4, 0x9

    and-int/lit8 v20, v12, 0xe

    const/16 v21, 0xd1

    move-object/from16 v29, v7

    const/4 v7, 0x0

    move-object/from16 v16, v11

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move/from16 v17, v8

    move v8, v6

    move/from16 v6, v17

    move-object/from16 v17, p3

    move-object/from16 v18, v29

    invoke-static/range {v7 .. v21}, Lny0/o0;->b(Landroidx/compose/ui/Modifier;ZLcom/whoop/design/util/TextResource;Lb91/a;Lg1/u0;Lf0/t;Ljava/lang/Integer;Landroidx/compose/ui/Modifier;ZLl0/k1;Lc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v18

    invoke-virtual {v7, v2}, Lp1/q;->q(Z)V

    move-object/from16 v15, v38

    invoke-static {v0, v15}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    int-to-float v8, v2

    mul-float/2addr v8, v6

    invoke-static {v8}, Ll0/m;->i(F)Ll0/k;

    move-result-object v10

    invoke-virtual {v7, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    and-int/lit8 v8, v4, 0x70

    const/16 v9, 0x20

    if-ne v8, v9, :cond_14

    move v13, v2

    goto :goto_d

    :cond_14
    move v13, v5

    :goto_d
    or-int/2addr v6, v13

    and-int/lit16 v4, v4, 0x380

    const/16 v15, 0x100

    if-ne v4, v15, :cond_15

    move v13, v2

    goto :goto_e

    :cond_15
    move v13, v5

    :goto_e
    or-int v4, v6, v13

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_17

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-ne v5, v4, :cond_16

    goto :goto_f

    :cond_16
    move-object/from16 v6, p1

    goto :goto_10

    :cond_17
    :goto_f
    new-instance v5, Lwc/e1;

    const/4 v4, 0x1

    move-object/from16 v6, p1

    invoke-direct {v5, v1, v6, v3, v4}, Lwc/e1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v7, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_10
    move-object v15, v5

    check-cast v15, Lkotlin/jvm/functions/Function1;

    const/16 v17, 0x6006

    const/16 v18, 0x1ee

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v16, v7

    move-object v7, v0

    invoke-static/range {v7 .. v18}, Lkotlin/jvm/internal/j;->c(Landroidx/compose/ui/Modifier;Ln0/u;Ll0/k1;Ll0/l;Lb2/f;Lh0/o1;ZLf0/k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v7, v16

    invoke-virtual {v7, v2}, Lp1/q;->q(Z)V

    move-object/from16 v5, v34

    goto :goto_11

    :cond_18
    move-object v7, v0

    move-object v6, v2

    invoke-virtual {v7}, Lp1/q;->X()V

    move-object v5, v10

    :goto_11
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_19

    new-instance v0, Lv71/g;

    move-object/from16 v4, p3

    move/from16 v7, p7

    move-object v2, v6

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Lv71/g;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/ui/Modifier;II)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_19
    return-void
.end method

.method private static final L(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ln0/q;)Ll83/a0;
    .locals 3

    const-string v0, "$this$LazyColumn"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lwi0/e$c;->w:Lwi0/e$c;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    new-instance v2, Lwi0/e$d;

    invoke-direct {v2, v0, p0}, Lwi0/e$d;-><init>(Lkotlin/jvm/functions/Function1;Ljava/util/List;)V

    new-instance v0, Lwi0/e$e;

    invoke-direct {v0, p0, p1, p2}, Lwi0/e$e;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    new-instance p0, Lx1/b;

    const/4 p1, 0x1

    const p2, 0x2fd4df92

    invoke-direct {p0, v0, p1, p2}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    check-cast p3, Ln0/f;

    const/4 p1, 0x0

    invoke-virtual {p3, v1, p1, v2, p0}, Ln0/f;->r(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/n;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final M(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, Lp1/x;->L(I)I

    move-result v6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move v7, p6

    move-object v5, p7

    invoke-static/range {v0 .. v7}, Lwi0/e;->K(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final synthetic N(Ljava/lang/String;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lwi0/e;->I(Ljava/lang/String;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public static synthetic a(Lc93/a;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lwi0/e;->y(Lc93/a;Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lwi0/e;->r(Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c()Ll83/a0;
    .locals 1

    invoke-static {}, Lwi0/e;->D()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic d(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p2, p0}, Lwi0/e;->x(Lkotlin/jvm/functions/Function1;Lp1/c1;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ln0/q;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lwi0/e;->L(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ln0/q;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lp1/c1;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lwi0/e;->z(Lp1/c1;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lp1/c1;Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lwi0/e;->v(Lp1/c1;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h()Ll83/a0;
    .locals 1

    invoke-static {}, Lwi0/e;->u()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic i(Ljava/lang/String;Lc93/a;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lwi0/e;->J(Ljava/lang/String;Lc93/a;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lc93/m;Lp1/c1;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lwi0/e;->A(Lc93/m;Lp1/c1;Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k()Ll83/a0;
    .locals 1

    invoke-static {}, Lwi0/e;->C()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic l(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Lwi0/e;->M(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Ljava/lang/String;ZLjava/util/List;Lc93/m;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p10}, Lwi0/e;->B(Ljava/lang/String;ZLjava/util/List;Lc93/m;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Lc93/m;Lp1/c1;Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lwi0/e;->w(Lc93/m;Lp1/c1;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o(Ljava/lang/String;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lwi0/e;->q(Ljava/lang/String;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final p(Ljava/lang/String;ZLjava/util/List;Lc93/m;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 57
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lc93/m;",
            "Lkotlin/jvm/functions/Function1;",
            "Lc93/a;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move/from16 v8, p8

    move-object/from16 v15, p7

    check-cast v15, Lp1/q;

    const v0, -0x2417297e

    invoke-virtual {v15, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p9, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v2, v8, 0x6

    move v3, v2

    move-object/from16 v2, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v2, v8, 0x6

    if-nez v2, :cond_2

    move-object/from16 v2, p0

    invoke-virtual {v15, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v8

    goto :goto_1

    :cond_2
    move-object/from16 v2, p0

    move v3, v8

    :goto_1
    and-int/lit8 v4, p9, 0x2

    if-eqz v4, :cond_4

    or-int/lit8 v3, v3, 0x30

    :cond_3
    move/from16 v5, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v5, v8, 0x30

    if-nez v5, :cond_3

    move/from16 v5, p1

    invoke-virtual {v15, v5}, Lp1/q;->h(Z)Z

    move-result v6

    if-eqz v6, :cond_5

    const/16 v6, 0x20

    goto :goto_2

    :cond_5
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v3, v6

    :goto_3
    and-int/lit8 v6, p9, 0x4

    if-eqz v6, :cond_7

    or-int/lit16 v3, v3, 0x180

    :cond_6
    move-object/from16 v7, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v7, v8, 0x180

    if-nez v7, :cond_6

    move-object/from16 v7, p2

    invoke-virtual {v15, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_8

    const/16 v9, 0x100

    goto :goto_4

    :cond_8
    const/16 v9, 0x80

    :goto_4
    or-int/2addr v3, v9

    :goto_5
    and-int/lit8 v9, p9, 0x8

    if-eqz v9, :cond_a

    or-int/lit16 v3, v3, 0xc00

    :cond_9
    move-object/from16 v11, p3

    goto :goto_7

    :cond_a
    and-int/lit16 v11, v8, 0xc00

    if-nez v11, :cond_9

    move-object/from16 v11, p3

    invoke-virtual {v15, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_b

    const/16 v12, 0x800

    goto :goto_6

    :cond_b
    const/16 v12, 0x400

    :goto_6
    or-int/2addr v3, v12

    :goto_7
    and-int/lit8 v12, p9, 0x10

    if-eqz v12, :cond_d

    or-int/lit16 v3, v3, 0x6000

    :cond_c
    move-object/from16 v14, p4

    goto :goto_9

    :cond_d
    and-int/lit16 v14, v8, 0x6000

    if-nez v14, :cond_c

    move-object/from16 v14, p4

    invoke-virtual {v15, v14}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_e

    const/16 v16, 0x4000

    goto :goto_8

    :cond_e
    const/16 v16, 0x2000

    :goto_8
    or-int v3, v3, v16

    :goto_9
    and-int/lit8 v16, p9, 0x20

    move/from16 p7, v9

    const/high16 v17, 0x30000

    if-eqz v16, :cond_f

    or-int v3, v3, v17

    move-object/from16 v9, p5

    goto :goto_b

    :cond_f
    and-int v17, v8, v17

    move-object/from16 v9, p5

    if-nez v17, :cond_11

    invoke-virtual {v15, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_10

    const/high16 v18, 0x20000

    goto :goto_a

    :cond_10
    const/high16 v18, 0x10000

    :goto_a
    or-int v3, v3, v18

    :cond_11
    :goto_b
    and-int/lit8 v18, p9, 0x40

    const/high16 v19, 0x180000

    if-eqz v18, :cond_12

    or-int v3, v3, v19

    move-object/from16 v10, p6

    goto :goto_d

    :cond_12
    and-int v19, v8, v19

    move-object/from16 v10, p6

    if-nez v19, :cond_14

    invoke-virtual {v15, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_13

    const/high16 v20, 0x100000

    goto :goto_c

    :cond_13
    const/high16 v20, 0x80000

    :goto_c
    or-int v3, v3, v20

    :cond_14
    :goto_d
    const v20, 0x92493

    and-int v13, v3, v20

    const v1, 0x92492

    if-eq v13, v1, :cond_15

    const/4 v1, 0x1

    goto :goto_e

    :cond_15
    const/4 v1, 0x0

    :goto_e
    and-int/lit8 v13, v3, 0x1

    invoke-virtual {v15, v13, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_3a

    const-string v1, ""

    if-eqz v0, :cond_16

    move-object v2, v1

    :cond_16
    if-eqz v4, :cond_17

    const/4 v5, 0x1

    :cond_17
    if-eqz v6, :cond_18

    sget-object v0, Lm83/y;->w:Lm83/y;

    move-object v7, v0

    :cond_18
    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-eqz p7, :cond_1a

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v0, :cond_19

    new-instance v4, Lv6/q;

    const/16 v6, 0x10

    const/4 v13, 0x0

    invoke-direct {v4, v6, v13}, Lv6/q;-><init>(IB)V

    invoke-virtual {v15, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_19
    check-cast v4, Lc93/m;

    goto :goto_f

    :cond_1a
    move-object/from16 v4, p3

    :goto_f
    if-eqz v12, :cond_1c

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v0, :cond_1b

    new-instance v6, Lwd3/b;

    const/16 v12, 0xd

    invoke-direct {v6, v12}, Lwd3/b;-><init>(I)V

    invoke-virtual {v15, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1b
    check-cast v6, Lkotlin/jvm/functions/Function1;

    goto :goto_10

    :cond_1c
    move-object v6, v14

    :goto_10
    if-eqz v16, :cond_1e

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-ne v12, v0, :cond_1d

    new-instance v12, Lwi0/d;

    const/4 v13, 0x0

    invoke-direct {v12, v13}, Lwi0/d;-><init>(I)V

    invoke-virtual {v15, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1d
    check-cast v12, Lc93/a;

    goto :goto_11

    :cond_1e
    move-object/from16 v12, p5

    :goto_11
    if-eqz v18, :cond_20

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v0, :cond_1f

    new-instance v10, Lwi0/d;

    const/4 v13, 0x1

    invoke-direct {v10, v13}, Lwi0/d;-><init>(I)V

    invoke-virtual {v15, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1f
    check-cast v10, Lc93/a;

    :cond_20
    move-object/from16 v56, v12

    move-object v12, v10

    move-object/from16 v10, v56

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-ne v13, v0, :cond_21

    invoke-static {v2}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v13

    invoke-virtual {v15, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_21
    check-cast v13, Lp1/c1;

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    if-ne v14, v0, :cond_22

    invoke-static {v5, v15}, Lr80/c;->w(ZLp1/q;)Lp1/k1;

    move-result-object v14

    :cond_22
    check-cast v14, Lp1/c1;

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-ne v11, v0, :cond_23

    invoke-static {v7}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v11

    invoke-virtual {v15, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_23
    check-cast v11, Lp1/c1;

    move-object/from16 p0, v11

    const/high16 v11, 0x3f800000    # 1.0f

    move-object/from16 p1, v13

    sget-object v13, Lb2/t;->w:Lb2/t;

    invoke-static {v11, v13}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v11, Lx81/d;->a:Lx81/d;

    move-object/from16 v18, v1

    sget v1, Lx81/d;->b:I

    invoke-virtual {v11, v15, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    move-object/from16 v42, v2

    invoke-virtual {v1}, Ly81/i;->o()J

    move-result-wide v1

    sget-object v11, Li2/w0;->a:Li2/v0;

    invoke-static {v9, v1, v2, v11}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/4 v2, 0x2

    int-to-float v2, v2

    const/16 v9, 0x8

    int-to-float v9, v9

    mul-float/2addr v2, v9

    invoke-static {v2, v1}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v9, Ll0/m;->c:Ll0/g;

    sget-object v11, Lb2/e;->M:Lb2/k;

    move/from16 v43, v5

    const/4 v5, 0x0

    invoke-static {v9, v11, v15, v5}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v9

    move-object/from16 v44, v6

    iget-wide v5, v15, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v15}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v15, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v11, La3/l;->a:La3/k;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, La3/k;->b:La3/j;

    invoke-virtual {v15}, Lp1/q;->i0()V

    move-object/from16 v45, v7

    iget-boolean v7, v15, Lp1/q;->S:Z

    if-eqz v7, :cond_24

    invoke-virtual {v15, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_12

    :cond_24
    invoke-virtual {v15}, Lp1/q;->s0()V

    :goto_12
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v15, v7, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->f:La3/i;

    invoke-static {v15, v9, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v8, v15, Lp1/q;->S:Z

    if-nez v8, :cond_25

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    move-object/from16 p3, v9

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_26

    goto :goto_13

    :cond_25
    move-object/from16 p3, v9

    :goto_13
    invoke-static {v5, v15, v5, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_26
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v15, v5, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/design/atomic/organism/toolbar/d;->a:Lcom/whoop/design/atomic/organism/toolbar/d$b;

    const-string v8, "Arch V2 Playground"

    invoke-static {v8}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-virtual {v1, v8}, Lcom/whoop/design/atomic/organism/toolbar/d$b;->a(Lcom/whoop/design/util/TextResource;)Lcom/whoop/design/atomic/organism/toolbar/d$a;

    move-result-object v1

    sget v8, Lcom/whoop/design/atomic/organism/toolbar/d$a;->r:I

    const/4 v9, 0x3

    shl-int/2addr v8, v9

    shr-int/lit8 v9, v3, 0x9

    and-int/lit16 v9, v9, 0x1c00

    or-int/2addr v8, v9

    const/high16 v9, 0x20000

    const/16 v17, 0x35

    move/from16 v20, v9

    const/4 v9, 0x0

    move-object/from16 v22, v11

    const/4 v11, 0x0

    move-object/from16 v23, v13

    const/4 v13, 0x0

    move-object/from16 v24, v14

    const/4 v14, 0x0

    move-object/from16 v46, p1

    move-object/from16 v50, p3

    move-object/from16 v48, v5

    move-object/from16 v49, v6

    move-object/from16 v51, v7

    move/from16 v16, v8

    move-object v8, v10

    move-object/from16 v5, v22

    move-object/from16 v7, v23

    const/high16 v6, 0x3f800000    # 1.0f

    move-object v10, v1

    move-object/from16 v1, v24

    invoke-static/range {v9 .. v17}, Lcom/whoop/design/atomic/organism/toolbar/b;->d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v52, v12

    invoke-static {v6, v7}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-static/range {v46 .. v46}, Lwi0/e;->E(Lp1/c1;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v10

    invoke-static/range {v18 .. v18}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    invoke-static/range {v18 .. v18}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v18

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-ne v11, v0, :cond_27

    new-instance v11, Lwi0/d;

    const/4 v12, 0x2

    invoke-direct {v11, v12}, Lwi0/d;-><init>(I)V

    invoke-virtual {v15, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_27
    move-object/from16 v35, v11

    check-cast v35, Lc93/a;

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-ne v11, v0, :cond_28

    new-instance v11, Lq12/c;

    const/16 v12, 0x19

    move-object/from16 v14, v46

    invoke-direct {v11, v12, v14}, Lq12/c;-><init>(ILp1/c1;)V

    invoke-virtual {v15, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    goto :goto_14

    :cond_28
    move-object/from16 v14, v46

    :goto_14
    move-object/from16 v36, v11

    check-cast v36, Lkotlin/jvm/functions/Function1;

    sget v46, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v11, v46, 0x3

    const/4 v12, 0x6

    or-int/2addr v11, v12

    shl-int/lit8 v16, v46, 0xc

    or-int v11, v11, v16

    shl-int/lit8 v16, v46, 0x18

    or-int v38, v11, v16

    const/high16 v40, 0x1b0000

    const v41, 0x1ffdeec

    const/4 v11, 0x0

    move/from16 v16, v12

    const/4 v12, 0x0

    move-object/from16 v17, v14

    const/4 v14, 0x0

    move-object/from16 v22, v15

    const/4 v15, 0x0

    move/from16 v20, v16

    move-object/from16 v19, v17

    const-wide/16 v16, 0x0

    move-object/from16 v21, v19

    const/16 v19, 0x0

    move/from16 v23, v20

    const/16 v20, 0x0

    move-object/from16 v24, v21

    const/16 v21, 0x0

    move-object/from16 v37, v22

    const/16 v22, 0x0

    move/from16 v25, v23

    const/16 v23, 0x1

    move-object/from16 v26, v24

    const/16 v24, 0x0

    move/from16 v27, v25

    const/16 v25, 0x0

    move-object/from16 v28, v26

    const/16 v26, 0x0

    move/from16 v29, v27

    const/16 v27, 0x0

    move-object/from16 v30, v28

    const/16 v28, 0x0

    move/from16 v31, v29

    const/16 v29, 0x0

    move-object/from16 v32, v30

    const/16 v30, 0x0

    move/from16 v33, v31

    const/16 v31, 0x0

    move-object/from16 v34, v32

    const/16 v32, 0x0

    move/from16 v39, v33

    const/16 v33, 0x0

    move-object/from16 v53, v34

    const/16 v34, 0x0

    move/from16 v54, v39

    const/16 v39, 0xc00

    move-object/from16 v55, v53

    invoke-static/range {v9 .. v41}, Lqz0/k;->m(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lb91/a;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lc93/m;Lqz0/c;JLcom/whoop/design/util/TextResource;ZZLb91/a;ZIIIZLq3/g0;ZZLj0/i;Li2/a1;Lg1/e8;Ll0/k1;Lu0/q0;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;IIII)V

    move-object/from16 v15, v37

    invoke-static {v2, v7}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-static {v15, v9}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    float-to-double v9, v6

    const-wide/16 v11, 0x0

    cmpl-double v9, v9, v11

    if-lez v9, :cond_29

    goto :goto_15

    :cond_29
    const-string v9, "invalid weight; must be greater than zero"

    invoke-static {v9}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_15
    new-instance v9, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const/4 v10, 0x1

    invoke-direct {v9, v6, v10}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static/range {p0 .. p0}, Lwi0/e;->s(Lp1/c1;)Ljava/util/List;

    move-result-object v10

    and-int/lit16 v11, v3, 0x1c00

    const/16 v12, 0x800

    if-ne v11, v12, :cond_2a

    const/4 v12, 0x1

    goto :goto_16

    :cond_2a
    const/4 v12, 0x0

    :goto_16
    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v12, :cond_2b

    if-ne v13, v0, :cond_2c

    :cond_2b
    new-instance v13, Lcom/whoop/profile/view/edit/p;

    const/4 v12, 0x1

    invoke-direct {v13, v4, v1, v12}, Lcom/whoop/profile/view/edit/p;-><init>(Lc93/m;Lp1/c1;I)V

    invoke-virtual {v15, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2c
    check-cast v13, Lkotlin/jvm/functions/Function1;

    const v12, 0xe000

    and-int/2addr v12, v3

    const/16 v14, 0x4000

    if-ne v12, v14, :cond_2d

    const/4 v12, 0x1

    goto :goto_17

    :cond_2d
    const/4 v12, 0x0

    :goto_17
    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    if-nez v12, :cond_2f

    if-ne v14, v0, :cond_2e

    goto :goto_18

    :cond_2e
    move-object/from16 v6, p0

    move-object/from16 p2, v13

    move-object/from16 v13, v44

    goto :goto_19

    :cond_2f
    :goto_18
    new-instance v14, Lp40/b;

    const/16 v12, 0x11

    move-object/from16 v6, p0

    move-object/from16 p2, v13

    move-object/from16 v13, v44

    invoke-direct {v14, v13, v6, v12}, Lp40/b;-><init>(Lkotlin/jvm/functions/Function1;Lp1/c1;I)V

    invoke-virtual {v15, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_19
    check-cast v14, Lkotlin/jvm/functions/Function1;

    const/high16 v12, 0x70000

    and-int/2addr v3, v12

    const/high16 v12, 0x20000

    if-ne v3, v12, :cond_30

    const/4 v3, 0x1

    goto :goto_1a

    :cond_30
    const/4 v3, 0x0

    :goto_1a
    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-nez v3, :cond_31

    if-ne v12, v0, :cond_32

    :cond_31
    new-instance v12, Lcp0/t0;

    const/4 v3, 0x6

    invoke-direct {v12, v8, v6, v3}, Lcp0/t0;-><init>(Lc93/a;Lp1/c1;I)V

    invoke-virtual {v15, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_32
    check-cast v12, Lc93/a;

    const/4 v3, 0x0

    const/4 v6, 0x0

    move-object/from16 p1, p2

    move/from16 p6, v3

    move/from16 p7, v6

    move-object/from16 p4, v9

    move-object/from16 p0, v10

    move-object/from16 p3, v12

    move-object/from16 p2, v14

    move-object/from16 p5, v15

    invoke-static/range {p0 .. p7}, Lwi0/e;->K(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {v7, v2, v15, v7, v6}, Lq63/c;->e(Lb2/t;FLp1/q;Lb2/t;F)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v6, Ll0/m;->e:Ll0/h;

    sget-object v9, Lb2/e;->J:Lb2/l;

    const/4 v10, 0x6

    invoke-static {v6, v9, v15, v10}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v6

    move v9, v11

    iget-wide v10, v15, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v15}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v15, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v15}, Lp1/q;->i0()V

    iget-boolean v12, v15, Lp1/q;->S:Z

    if-eqz v12, :cond_33

    invoke-virtual {v15, v5}, Lp1/q;->l(Lc93/a;)V

    :goto_1b
    move-object/from16 v5, v51

    goto :goto_1c

    :cond_33
    invoke-virtual {v15}, Lp1/q;->s0()V

    goto :goto_1b

    :goto_1c
    invoke-static {v15, v5, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v5, v50

    invoke-static {v15, v5, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v5, v15, Lp1/q;->S:Z

    if-nez v5, :cond_34

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_35

    :cond_34
    move-object/from16 v5, v49

    goto :goto_1e

    :cond_35
    :goto_1d
    move-object/from16 v5, v48

    goto :goto_1f

    :goto_1e
    invoke-static {v10, v15, v10, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_1d

    :goto_1f
    invoke-static {v15, v5, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v10, Lsy0/k$g;

    const/4 v3, 0x0

    const/4 v5, 0x3

    invoke-direct {v10, v3, v3, v5, v3}, Lsy0/k$g;-><init>(Lb91/a;Lb2/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v1}, Lwi0/e;->G(Lp1/c1;)Z

    move-result v11

    const-string v3, "Enable Caching"

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v0, :cond_36

    new-instance v6, Lq12/c;

    const/16 v12, 0x18

    invoke-direct {v6, v12, v1}, Lq12/c;-><init>(ILp1/c1;)V

    invoke-virtual {v15, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_36
    move-object/from16 v21, v6

    check-cast v21, Lkotlin/jvm/functions/Function1;

    sget v6, Lsy0/k$g;->d:I

    shl-int/lit8 v5, v6, 0x3

    or-int v23, v46, v5

    const/16 v24, 0x6

    const/16 v25, 0x3f8

    const/4 v12, 0x0

    move-object/from16 v44, v13

    const/4 v13, 0x0

    move-object/from16 v22, v15

    const-wide/16 v14, 0x0

    const/16 v39, 0x6

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    move/from16 v56, v9

    move-object v9, v3

    move/from16 v3, v56

    invoke-static/range {v9 .. v25}, Lsy0/j;->f(Lcom/whoop/design/util/TextResource;Lsy0/k;ZZIJLandroidx/compose/ui/Modifier;Ll0/k1;ZJLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v15, v22

    const/4 v10, 0x1

    invoke-static {v15, v10, v7, v2, v15}, Lih0/d0;->B(Lp1/q;ZLb2/t;FLp1/q;)V

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {v6, v7}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    const-string v2, "Let\'s Go!"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-static/range {v55 .. v55}, Lwi0/e;->E(Lp1/c1;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v5

    xor-int/2addr v5, v10

    const/16 v12, 0x800

    if-ne v3, v12, :cond_37

    const/16 v47, 0x1

    goto :goto_20

    :cond_37
    const/16 v47, 0x0

    :goto_20
    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v47, :cond_38

    if-ne v3, v0, :cond_39

    :cond_38
    new-instance v3, Ll41/a;

    const/4 v0, 0x2

    move-object/from16 v14, v55

    invoke-direct {v3, v4, v14, v1, v0}, Ll41/a;-><init>(Lc93/m;Lp1/c1;Lp1/c1;I)V

    invoke-virtual {v15, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_39
    move-object/from16 v22, v3

    check-cast v22, Lc93/a;

    shl-int/lit8 v0, v46, 0x12

    or-int/lit8 v24, v0, 0x6

    const/16 v25, 0x0

    const/16 v26, 0x1fbc

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    move v10, v5

    move-object/from16 v23, v15

    move-object v15, v2

    invoke-static/range {v9 .. v26}, Lny0/z;->j(Landroidx/compose/ui/Modifier;ZZLjava/lang/Integer;Landroidx/compose/ui/Modifier;Lv41/r0;Lcom/whoop/design/util/TextResource;Lg1/u0;Li2/t;Lf0/t;FLl0/k1;Lb91/a;Lc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v15, v23

    const/4 v10, 0x1

    invoke-virtual {v15, v10}, Lp1/q;->q(Z)V

    move-object v6, v8

    move-object/from16 v1, v42

    move/from16 v2, v43

    move-object/from16 v5, v44

    move-object/from16 v3, v45

    move-object/from16 v7, v52

    goto :goto_21

    :cond_3a
    invoke-virtual {v15}, Lp1/q;->X()V

    move-object/from16 v4, p3

    move-object/from16 v6, p5

    move-object v1, v2

    move v2, v5

    move-object v3, v7

    move-object v7, v10

    move-object v5, v14

    :goto_21
    invoke-virtual {v15}, Lp1/q;->u()Lp1/v1;

    move-result-object v10

    if-eqz v10, :cond_3b

    new-instance v0, Lc31/f;

    move/from16 v8, p8

    move/from16 v9, p9

    invoke-direct/range {v0 .. v9}, Lc31/f;-><init>(Ljava/lang/String;ZLjava/util/List;Lc93/m;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;II)V

    iput-object v0, v10, Lp1/v1;->d:Lc93/m;

    :cond_3b
    return-void
.end method

.method private static final q(Ljava/lang/String;Z)Ll83/a0;
    .locals 0

    const-string p1, "<unused var>"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final r(Ljava/lang/String;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final s(Lp1/c1;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    return-object p0
.end method

.method private static final t(Lp1/c1;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final u()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final v(Lp1/c1;Ljava/lang/String;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lwi0/e;->F(Lp1/c1;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final w(Lc93/m;Lp1/c1;Ljava/lang/String;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lwi0/e;->G(Lp1/c1;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p2, p1}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final x(Lkotlin/jvm/functions/Function1;Lp1/c1;Ljava/lang/String;)Ll83/a0;
    .locals 4

    const-string v0, "path"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lwi0/e;->s(Lp1/c1;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/lang/String;

    invoke-static {v3, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-static {p1, v1}, Lwi0/e;->t(Lp1/c1;Ljava/util/List;)V

    invoke-interface {p0, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final y(Lc93/a;Lp1/c1;)Ll83/a0;
    .locals 1

    sget-object v0, Lm83/y;->w:Lm83/y;

    invoke-static {p1, v0}, Lwi0/e;->t(Lp1/c1;Ljava/util/List;)V

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final z(Lp1/c1;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lwi0/e;->H(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
