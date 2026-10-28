.class public abstract Lzc1/o4;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u001a\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Ll83/a0;",
        "e",
        "(Landroidx/compose/runtime/Composer;I)V",
        "",
        "currentHr",
        "maxHr",
        "Ln71/r;",
        "j",
        "(II)Ln71/r;",
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
.method public static synthetic a(Lp1/g1;F)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzc1/o4;->h(Lp1/z0;F)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lp1/g1;F)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzc1/o4;->g(Lp1/z0;F)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lp1/g1;F)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzc1/o4;->f(Lp1/z0;F)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lzc1/o4;->i(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Landroidx/compose/runtime/Composer;I)V
    .locals 25

    move/from16 v0, p1

    move-object/from16 v8, p0

    check-cast v8, Lp1/q;

    const v1, 0x2c76be4a

    invoke-virtual {v8, v1}, Lp1/q;->g0(I)Lp1/q;

    const/4 v11, 0x0

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    move v1, v11

    :goto_0
    and-int/lit8 v2, v0, 0x1

    invoke-virtual {v8, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_d

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v13, Lp1/l;->a:Lp1/v0;

    if-ne v1, v13, :cond_1

    const/high16 v1, 0x433e0000    # 190.0f

    invoke-static {v1, v8}, Ld;->v(FLp1/q;)Lp1/g1;

    move-result-object v1

    :cond_1
    move-object v14, v1

    check-cast v14, Lp1/z0;

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v13, :cond_2

    const/high16 v1, 0x427c0000    # 63.0f

    invoke-static {v1, v8}, Ld;->v(FLp1/q;)Lp1/g1;

    move-result-object v1

    :cond_2
    check-cast v1, Lp1/z0;

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v13, :cond_3

    const/16 v2, 0x64

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Integer;

    move-result-object v2

    new-instance v3, Lz1/p;

    invoke-direct {v3}, Lz1/p;-><init>()V

    invoke-static {v2}, Lm83/n;->W0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    invoke-virtual {v3, v2}, Lz1/p;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {v8, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v2, v3

    :cond_3
    move-object v15, v2

    check-cast v15, Lz1/p;

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    const/high16 v3, 0x41f00000    # 30.0f

    if-ne v2, v13, :cond_4

    invoke-static {v3, v8}, Ld;->v(FLp1/q;)Lp1/g1;

    move-result-object v2

    :cond_4
    check-cast v2, Lp1/z0;

    check-cast v1, Lp1/g1;

    invoke-virtual {v1}, Lp1/g1;->x()F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    const/4 v6, 0x0

    if-ne v5, v13, :cond_5

    new-instance v5, Lzc1/o4$a;

    invoke-direct {v5, v1, v15, v2, v6}, Lzc1/o4$a;-><init>(Lp1/z0;Lz1/p;Lp1/z0;Lq83/d;)V

    invoke-virtual {v8, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v5, Lc93/m;

    invoke-static {v8, v5, v4}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, Lb2/t;->w:Lb2/t;

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-static {v5, v4}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v4}, Lgb1/b0;->b0(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v5, Lb2/e;->N:Lb2/k;

    const/4 v7, 0x4

    int-to-float v7, v7

    const/16 v9, 0x36

    invoke-static {v7, v7, v5, v8, v9}, Lm4/a;->n(FFLb2/k;Lp1/q;I)Ll0/x;

    move-result-object v5

    iget-wide v9, v8, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v8, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v10, La3/l;->a:La3/k;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v6, v8, Lp1/q;->S:Z

    if-eqz v6, :cond_6

    invoke-virtual {v8, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_6
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_1
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v8, v6, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v8, v5, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v6, v8, Lp1/q;->S:Z

    if-nez v6, :cond_7

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v6, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_8

    :cond_7
    invoke-static {v7, v8, v7, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_8
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v8, v5, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    check-cast v2, Lp1/g1;

    invoke-virtual {v2}, Lp1/g1;->x()F

    move-result v4

    invoke-static {v4}, Le93/b;->X(F)I

    move-result v4

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Max Visible Hr Points: "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v8, v11}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v2}, Lp1/g1;->x()F

    move-result v4

    move v5, v4

    new-instance v4, Li93/e;

    const/4 v6, 0x0

    invoke-direct {v4, v6, v3}, Li93/e;-><init>(FF)V

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v13, :cond_9

    new-instance v3, Lp1/j2;

    const/4 v7, 0x1

    invoke-direct {v3, v2, v7}, Lp1/j2;-><init>(Lp1/g1;I)V

    invoke-virtual {v8, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    move-object v7, v3

    check-cast v7, Lkotlin/jvm/functions/Function1;

    const/high16 v9, 0x180000

    const/16 v10, 0x33

    move-object v2, v1

    const/4 v1, 0x0

    move-object v3, v2

    const/4 v2, 0x0

    move-object/from16 v16, v3

    move v3, v5

    const/4 v5, 0x0

    move/from16 v17, v6

    const/4 v6, 0x0

    move-object/from16 v18, v16

    move/from16 v12, v17

    invoke-static/range {v1 .. v10}, Lhy0/k2;->d(Landroidx/compose/ui/Modifier;ZFLi93/f;ILc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    check-cast v14, Lp1/g1;

    invoke-virtual {v14}, Lp1/g1;->x()F

    move-result v1

    invoke-static {v1}, Le93/b;->X(F)I

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Max Heart Rate: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v8, v11}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v14}, Lp1/g1;->x()F

    move-result v3

    new-instance v4, Li93/e;

    const/high16 v1, 0x43160000    # 150.0f

    const/high16 v2, 0x437a0000    # 250.0f

    invoke-direct {v4, v1, v2}, Li93/e;-><init>(FF)V

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v13, :cond_a

    new-instance v1, Lp1/j2;

    const/4 v2, 0x2

    invoke-direct {v1, v14, v2}, Lp1/j2;-><init>(Lp1/g1;I)V

    invoke-virtual {v8, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    move-object v7, v1

    check-cast v7, Lkotlin/jvm/functions/Function1;

    const/high16 v9, 0x180000

    const/16 v10, 0x33

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v1 .. v10}, Lhy0/k2;->d(Landroidx/compose/ui/Modifier;ZFLi93/f;ILc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual/range {v18 .. v18}, Lp1/g1;->x()F

    move-result v1

    invoke-static {v1}, Le93/b;->X(F)I

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Current Heart Rate: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v8, v11}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual/range {v18 .. v18}, Lp1/g1;->x()F

    move-result v3

    new-instance v4, Li93/e;

    const/high16 v1, 0x435c0000    # 220.0f

    invoke-direct {v4, v12, v1}, Li93/e;-><init>(FF)V

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v13, :cond_b

    new-instance v1, Lp1/j2;

    const/4 v2, 0x3

    move-object/from16 v12, v18

    invoke-direct {v1, v12, v2}, Lp1/j2;-><init>(Lp1/g1;I)V

    invoke-virtual {v8, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    goto :goto_2

    :cond_b
    move-object/from16 v12, v18

    :goto_2
    move-object v7, v1

    check-cast v7, Lkotlin/jvm/functions/Function1;

    const/high16 v9, 0x180000

    const/16 v10, 0x33

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v1 .. v10}, Lhy0/k2;->d(Landroidx/compose/ui/Modifier;ZFLi93/f;ILc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    const-string v1, "Live HR Monitor Interactive"

    const/4 v2, 0x6

    invoke-static {v1, v8, v2}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    sget-object v1, Ln71/p;->a:Ln71/p;

    invoke-virtual {v1}, Ln71/p;->a()Ljava/util/List;

    move-result-object v3

    invoke-static {v3}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v19, v3

    check-cast v19, Ln71/q;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v15}, Lz1/q;->e(Lz1/p;)Lz1/w;

    move-result-object v3

    iget-object v3, v3, Lz1/w;->c:Lt1/c;

    invoke-virtual {v12}, Lp1/g1;->x()F

    move-result v4

    invoke-static {v4}, Le93/b;->X(F)I

    move-result v4

    invoke-virtual {v14}, Lp1/g1;->x()F

    move-result v5

    invoke-static {v5}, Le93/b;->X(F)I

    move-result v5

    invoke-static {v4, v5}, Lzc1/o4;->j(II)Ln71/r;

    move-result-object v21

    const/16 v23, 0x4

    const/16 v24, 0x0

    const/16 v22, 0x0

    move-object/from16 v20, v3

    invoke-static/range {v19 .. v24}, Ln71/q;->b(Ln71/q;Ljava/util/List;Ln71/r;IILjava/lang/Object;)Ln71/q;

    move-result-object v3

    sget v4, Ln71/q;->d:I

    shl-int/lit8 v4, v4, 0x3

    const/4 v5, 0x0

    const/4 v6, 0x1

    invoke-static {v5, v3, v8, v4, v6}, Ln71/o;->H(Landroidx/compose/ui/Modifier;Ln71/q;Landroidx/compose/runtime/Composer;II)V

    const-string v3, "Live HR Monitor Samples"

    invoke-static {v3, v8, v2}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    const v2, -0x29cfb53

    invoke-virtual {v8, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Ln71/p;->a()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_c

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ln71/q;

    sget v3, Ln71/q;->d:I

    shl-int/lit8 v3, v3, 0x3

    const/4 v6, 0x1

    invoke-static {v5, v2, v8, v3, v6}, Ln71/o;->H(Landroidx/compose/ui/Modifier;Ln71/q;Landroidx/compose/runtime/Composer;II)V

    goto :goto_3

    :cond_c
    const/4 v6, 0x1

    invoke-virtual {v8, v11}, Lp1/q;->q(Z)V

    invoke-virtual {v8, v6}, Lp1/q;->q(Z)V

    goto :goto_4

    :cond_d
    invoke-virtual {v8}, Lp1/q;->X()V

    :goto_4
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_e

    new-instance v2, Lzc1/s3;

    const/16 v3, 0x12

    invoke-direct {v2, v0, v3}, Lzc1/s3;-><init>(II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_e
    return-void
.end method

.method private static final f(Lp1/z0;F)Ll83/a0;
    .locals 0

    check-cast p0, Lp1/g1;

    invoke-virtual {p0, p1}, Lp1/g1;->y(F)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lp1/z0;F)Ll83/a0;
    .locals 0

    check-cast p0, Lp1/g1;

    invoke-virtual {p0, p1}, Lp1/g1;->y(F)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lp1/z0;F)Ll83/a0;
    .locals 0

    check-cast p0, Lp1/g1;

    invoke-virtual {p0, p1}, Lp1/g1;->y(F)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lzc1/o4;->e(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(II)Ln71/r;
    .locals 11

    sget-object v0, Ln71/r;->ZONE_0:Ln71/r;

    new-instance v1, Li93/j;

    const/16 v2, 0x32

    const/4 v3, 0x1

    invoke-direct {v1, v3, v2, v3}, Li93/h;-><init>(III)V

    new-instance v4, Ll83/k;

    invoke-direct {v4, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Ln71/r;->ZONE_1:Ln71/r;

    new-instance v1, Li93/j;

    const/16 v2, 0x33

    const/16 v5, 0x3c

    invoke-direct {v1, v2, v5, v3}, Li93/h;-><init>(III)V

    new-instance v5, Ll83/k;

    invoke-direct {v5, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Ln71/r;->ZONE_2:Ln71/r;

    new-instance v1, Li93/j;

    const/16 v2, 0x3d

    const/16 v6, 0x46

    invoke-direct {v1, v2, v6, v3}, Li93/h;-><init>(III)V

    new-instance v6, Ll83/k;

    invoke-direct {v6, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Ln71/r;->ZONE_3:Ln71/r;

    new-instance v1, Li93/j;

    const/16 v2, 0x47

    const/16 v7, 0x50

    invoke-direct {v1, v2, v7, v3}, Li93/h;-><init>(III)V

    new-instance v7, Ll83/k;

    invoke-direct {v7, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Ln71/r;->ZONE_4:Ln71/r;

    new-instance v1, Li93/j;

    const/16 v2, 0x51

    const/16 v8, 0x5a

    invoke-direct {v1, v2, v8, v3}, Li93/h;-><init>(III)V

    new-instance v8, Ll83/k;

    invoke-direct {v8, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Ln71/r;->ZONE_5:Ln71/r;

    new-instance v1, Li93/j;

    const/16 v2, 0x5b

    const/16 v10, 0x64

    invoke-direct {v1, v2, v10, v3}, Li93/h;-><init>(III)V

    new-instance v9, Ll83/k;

    invoke-direct {v9, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array/range {v4 .. v9}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v0

    mul-int/2addr p0, v10

    int-to-float p0, p0

    int-to-float p1, p1

    div-float/2addr p0, p1

    invoke-static {p0}, Le93/b;->X(F)I

    move-result p0

    new-instance p1, Li93/j;

    invoke-direct {p1, v3, v10, v3}, Li93/h;-><init>(III)V

    invoke-static {p0, p1}, Le93/b;->o(ILi93/g;)I

    move-result p0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li93/j;

    iget v2, v1, Li93/h;->w:I

    iget v1, v1, Li93/h;->x:I

    if-gt p0, v1, :cond_0

    if-gt v2, p0, :cond_0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    check-cast v0, Ljava/util/Map$Entry;

    if-eqz v0, :cond_3

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ln71/r;

    if-nez p0, :cond_2

    goto :goto_1

    :cond_2
    return-object p0

    :cond_3
    :goto_1
    sget-object p0, Ln71/r;->ZONE_0:Ln71/r;

    return-object p0
.end method
