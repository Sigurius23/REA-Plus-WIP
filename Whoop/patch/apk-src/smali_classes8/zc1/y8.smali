.class public abstract Lzc1/y8;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u001a\u001d\u0010\u0006\u001a\u00020\u00002\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H\u0003\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Ll83/a0;",
        "c",
        "(Landroidx/compose/runtime/Composer;I)V",
        "",
        "Li91/a;",
        "backgrounds",
        "e",
        "(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V",
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
.method public static synthetic a(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lzc1/y8;->d(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/util/List;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lzc1/y8;->f(Ljava/util/List;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Landroidx/compose/runtime/Composer;I)V
    .locals 16

    move/from16 v0, p1

    move-object/from16 v1, p0

    check-cast v1, Lp1/q;

    const v2, -0x4d8a5bce

    invoke-virtual {v1, v2}, Lp1/q;->g0(I)Lp1/q;

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    move v4, v2

    :goto_0
    and-int/lit8 v5, v0, 0x1

    invoke-virtual {v1, v5, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_6

    sget-object v4, Lx81/d;->a:Lx81/d;

    sget v5, Lx81/d;->b:I

    invoke-virtual {v4, v1, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->b0()J

    move-result-wide v6

    new-instance v8, Li2/x;

    invoke-direct {v8, v6, v7}, Li2/x;-><init>(J)V

    invoke-virtual {v4, v1, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->c0()J

    move-result-wide v6

    new-instance v9, Li2/x;

    invoke-direct {v9, v6, v7}, Li2/x;-><init>(J)V

    invoke-virtual {v4, v1, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->Z()J

    move-result-wide v4

    new-instance v6, Li2/x;

    invoke-direct {v6, v4, v5}, Li2/x;-><init>(J)V

    filled-new-array {v8, v9, v6}, [Li2/x;

    move-result-object v4

    invoke-static {v4}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    const/16 v6, 0xa

    invoke-static {v4, v6}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v5, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Li2/x;

    iget-wide v7, v7, Li2/x;->a:J

    invoke-static {v7, v8}, Li91/c;->o(J)Li91/a;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    sget-object v4, Li2/t;->b:Li2/s;

    sget-object v7, Lx81/d;->a:Lx81/d;

    sget v8, Lx81/d;->b:I

    invoke-virtual {v7, v1, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->l0()J

    move-result-wide v9

    new-instance v11, Li2/x;

    invoke-direct {v11, v9, v10}, Li2/x;-><init>(J)V

    invoke-virtual {v7, v1, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->m0()J

    move-result-wide v9

    new-instance v12, Li2/x;

    invoke-direct {v12, v9, v10}, Li2/x;-><init>(J)V

    filled-new-array {v11, v12}, [Li2/x;

    move-result-object v9

    invoke-static {v9}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v9

    const/4 v10, 0x0

    const/16 v11, 0xe

    invoke-static {v4, v9, v10, v10, v11}, Li2/s;->k(Li2/s;Ljava/util/List;FFI)Li2/k0;

    move-result-object v9

    invoke-virtual {v7, v1, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v12

    invoke-virtual {v12}, Ly81/i;->m0()J

    move-result-wide v12

    new-instance v14, Li2/x;

    invoke-direct {v14, v12, v13}, Li2/x;-><init>(J)V

    invoke-virtual {v7, v1, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v12

    invoke-virtual {v12}, Ly81/i;->n0()J

    move-result-wide v12

    new-instance v15, Li2/x;

    invoke-direct {v15, v12, v13}, Li2/x;-><init>(J)V

    filled-new-array {v14, v15}, [Li2/x;

    move-result-object v12

    invoke-static {v12}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v12

    invoke-static {v4, v12, v10, v10, v11}, Li2/s;->k(Li2/s;Ljava/util/List;FFI)Li2/k0;

    move-result-object v12

    invoke-virtual {v7, v1, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v13

    invoke-virtual {v13}, Ly81/i;->o0()J

    move-result-wide v13

    new-instance v15, Li2/x;

    invoke-direct {v15, v13, v14}, Li2/x;-><init>(J)V

    invoke-virtual {v7, v1, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v13

    invoke-virtual {v13}, Ly81/i;->p0()J

    move-result-wide v13

    const/16 p0, 0x1

    new-instance v3, Li2/x;

    invoke-direct {v3, v13, v14}, Li2/x;-><init>(J)V

    filled-new-array {v15, v3}, [Li2/x;

    move-result-object v3

    invoke-static {v3}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-static {v4, v3, v10, v10, v11}, Li2/s;->k(Li2/s;Ljava/util/List;FFI)Li2/k0;

    move-result-object v3

    invoke-virtual {v7, v1, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v13

    invoke-virtual {v13}, Ly81/i;->p0()J

    move-result-wide v13

    new-instance v15, Li2/x;

    invoke-direct {v15, v13, v14}, Li2/x;-><init>(J)V

    invoke-virtual {v7, v1, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->l0()J

    move-result-wide v7

    new-instance v13, Li2/x;

    invoke-direct {v13, v7, v8}, Li2/x;-><init>(J)V

    filled-new-array {v15, v13}, [Li2/x;

    move-result-object v7

    invoke-static {v7}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    invoke-static {v4, v7, v10, v10, v11}, Li2/s;->k(Li2/s;Ljava/util/List;FFI)Li2/k0;

    move-result-object v4

    const/4 v7, 0x4

    new-array v8, v7, [Li2/t;

    aput-object v9, v8, v2

    aput-object v12, v8, p0

    const/4 v9, 0x2

    aput-object v3, v8, v9

    const/4 v3, 0x3

    aput-object v4, v8, v3

    invoke-static {v8}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-static {v3, v6}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Li2/t;

    invoke-static {v6}, Li91/c;->h(Li2/t;)Li91/a;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_2
    int-to-float v3, v7

    const/16 v6, 0x8

    int-to-float v6, v6

    mul-float/2addr v6, v3

    sget-object v7, Lb2/t;->w:Lb2/t;

    invoke-static {v6, v7}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v8, Lb2/e;->N:Lb2/k;

    sget-object v9, Ll0/m;->c:Ll0/g;

    const/16 v10, 0x30

    invoke-static {v9, v8, v1, v10}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v8

    iget-wide v9, v1, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v1}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v1, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v11, La3/l;->a:La3/k;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, La3/k;->b:La3/j;

    invoke-virtual {v1}, Lp1/q;->i0()V

    iget-boolean v12, v1, Lp1/q;->S:Z

    if-eqz v12, :cond_3

    invoke-virtual {v1, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Lp1/q;->s0()V

    :goto_3
    sget-object v11, La3/k;->g:La3/i;

    invoke-static {v1, v11, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->f:La3/i;

    invoke-static {v1, v8, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->j:La3/i;

    iget-boolean v10, v1, Lp1/q;->S:Z

    if-nez v10, :cond_4

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_5

    :cond_4
    invoke-static {v9, v1, v9, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_5
    sget-object v8, La3/k;->d:La3/i;

    invoke-static {v1, v8, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-string v6, "Solid Colors"

    const/4 v8, 0x6

    invoke-static {v6, v1, v8}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v5, v1, v2}, Lzc1/y8;->e(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v3, v3, v7, v1}, Lih0/d0;->u(FFLb2/t;Lp1/q;)V

    const-string v3, "Gradients"

    invoke-static {v3, v1, v8}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v4, v1, v2}, Lzc1/y8;->e(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V

    move/from16 v2, p0

    invoke-virtual {v1, v2}, Lp1/q;->q(Z)V

    goto :goto_4

    :cond_6
    const/4 v2, 0x1

    invoke-virtual {v1}, Lp1/q;->X()V

    :goto_4
    invoke-virtual {v1}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_7

    new-instance v3, Lzc1/w8;

    invoke-direct {v3, v0, v2}, Lzc1/w8;-><init>(II)V

    iput-object v3, v1, Lp1/v1;->d:Lc93/m;

    :cond_7
    return-void
.end method

.method private static final d(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lzc1/y8;->c(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V
    .locals 26
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Li91/a;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move/from16 v1, p2

    const/high16 v2, 0x3f000000    # 0.5f

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    move-object/from16 v13, p1

    check-cast v13, Lp1/q;

    const v3, -0x39195f14

    invoke-virtual {v13, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v1, 0x6

    const/4 v14, 0x4

    const/4 v15, 0x2

    if-nez v3, :cond_1

    invoke-virtual {v13, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    move v3, v14

    goto :goto_0

    :cond_0
    move v3, v15

    :goto_0
    or-int/2addr v3, v1

    goto :goto_1

    :cond_1
    move v3, v1

    :goto_1
    and-int/lit8 v4, v3, 0x3

    const/4 v5, 0x0

    const/4 v7, 0x1

    if-eq v4, v15, :cond_2

    move v4, v7

    goto :goto_2

    :cond_2
    move v4, v5

    :goto_2
    and-int/2addr v3, v7

    invoke-virtual {v13, v3, v4}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_8

    const/high16 v3, 0x3e800000    # 0.25f

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    const v4, 0x3ecccccd    # 0.4f

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    const v16, 0x3dcccccd    # 0.1f

    move v8, v5

    invoke-static/range {v16 .. v16}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    const/high16 v9, 0x3f400000    # 0.75f

    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v9

    const/high16 v10, 0x3f800000    # 1.0f

    move v11, v8

    invoke-static {v10}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v8

    const v12, 0x3e99999a    # 0.3f

    invoke-static {v12}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v12

    const v17, 0x3f19999a    # 0.6f

    invoke-static/range {v17 .. v17}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v17

    const v18, 0x3f666666    # 0.9f

    invoke-static/range {v18 .. v18}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v18

    move/from16 v19, v7

    move-object v7, v9

    move-object v9, v6

    move/from16 v20, v2

    move v15, v10

    move-object v10, v12

    move-object/from16 v11, v17

    move-object/from16 v12, v18

    move/from16 v2, v19

    filled-new-array/range {v3 .. v12}, [Ljava/lang/Float;

    move-result-object v3

    invoke-static {v3}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    const/16 v4, 0x8

    int-to-float v4, v4

    mul-float v5, v4, v20

    int-to-float v6, v2

    mul-float/2addr v6, v4

    sget-object v4, Lb2/t;->w:Lb2/t;

    invoke-static {v4, v5, v6}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static {v15, v5}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const/16 v6, 0xf0

    int-to-float v6, v6

    invoke-static {v6, v5}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v6, Lk91/a;->e:Lk91/a$a;

    int-to-float v7, v14

    mul-float v14, v7, v15

    invoke-virtual {v6, v14}, Lk91/a$a;->a(F)Lk91/a;

    move-result-object v6

    invoke-virtual {v6}, Lk91/a;->c()Lt0/i;

    move-result-object v6

    invoke-static {v5, v6}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v6, Lx81/d;->a:Lx81/d;

    sget v7, Lx81/d;->b:I

    invoke-virtual {v6, v13, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->X0()J

    move-result-wide v6

    invoke-static {v6, v7}, Li91/c;->o(J)Li91/a;

    move-result-object v6

    invoke-static {v5, v6}, Li91/c;->c(Landroidx/compose/ui/Modifier;Li91/a;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v6, Lb2/e;->G:Lb2/m;

    const/4 v8, 0x0

    invoke-static {v6, v8}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v6

    iget-wide v7, v13, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v13, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v10, v13, Lp1/q;->S:Z

    if-eqz v10, :cond_3

    invoke-virtual {v13, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_3
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_3
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v13, v9, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v13, v6, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v8, v13, Lp1/q;->S:Z

    if-nez v8, :cond_4

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_5

    :cond_4
    invoke-static {v7, v13, v7, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_5
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v13, v6, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v5, -0x498fa9a1

    invoke-virtual {v13, v5}, Lp1/q;->e0(I)V

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/4 v5, 0x0

    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_7

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    add-int/lit8 v15, v5, 0x1

    const/4 v7, 0x0

    if-ltz v5, :cond_6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->floatValue()F

    move-result v22

    int-to-float v6, v5

    mul-float v19, v6, v16

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v6

    rem-int/2addr v5, v6

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    move-object v8, v5

    check-cast v8, Li91/a;

    const/16 v24, 0x12

    const/16 v25, 0x0

    const/16 v20, 0x0

    const v21, 0x3dcccccd    # 0.1f

    const/16 v23, 0x0

    move-object/from16 v18, v4

    invoke-static/range {v18 .. v25}, Lp91/e;->f(Landroidx/compose/ui/Modifier;FFFFLp91/a;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v5, Lk91/a;->e:Lk91/a$a;

    const/4 v6, 0x0

    const/4 v9, 0x2

    invoke-static {v5, v14, v6, v9, v7}, Lk91/a$a;->d(Lk91/a$a;FFILjava/lang/Object;)Lk91/a;

    move-result-object v5

    sget v6, Li91/a;->a:I

    shl-int/lit8 v6, v6, 0x3

    sget v7, Lk91/a;->f:I

    shl-int/lit8 v7, v7, 0x6

    or-int v11, v6, v7

    const/4 v12, 0x0

    move-object v7, v4

    move v4, v9

    move-object v10, v13

    move-object v9, v5

    invoke-static/range {v7 .. v12}, Laz0/b;->b(Landroidx/compose/ui/Modifier;Li91/a;Lk91/a;Landroidx/compose/runtime/Composer;II)V

    move v5, v15

    move-object/from16 v4, v18

    goto :goto_4

    :cond_6
    invoke-static {}, Lwb3/f;->d0()V

    throw v7

    :cond_7
    move-object v10, v13

    const/4 v8, 0x0

    invoke-virtual {v10, v8}, Lp1/q;->q(Z)V

    invoke-virtual {v10, v2}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_8
    move-object v10, v13

    invoke-virtual {v10}, Lp1/q;->X()V

    :goto_5
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v2

    if-eqz v2, :cond_9

    new-instance v3, Lbm0/o;

    const/16 v4, 0x1c

    invoke-direct {v3, v0, v1, v4}, Lbm0/o;-><init>(Ljava/util/List;II)V

    iput-object v3, v2, Lp1/v1;->d:Lc93/m;

    :cond_9
    return-void
.end method

.method private static final f(Ljava/util/List;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lzc1/y8;->e(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
