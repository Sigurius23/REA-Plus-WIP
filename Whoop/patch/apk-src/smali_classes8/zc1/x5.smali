.class public abstract Lzc1/x5;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u00a8\u0006\u0005\u00b2\u0006\u000e\u0010\u0004\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Ll83/a0;",
        "c",
        "(Landroidx/compose/runtime/Composer;I)V",
        "",
        "currentPage",
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
.method public static synthetic a(ILp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lzc1/x5;->f(Lp1/c1;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lzc1/x5;->g(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Landroidx/compose/runtime/Composer;I)V
    .locals 22

    move/from16 v0, p1

    move-object/from16 v7, p0

    check-cast v7, Lp1/q;

    const v1, -0x615227a4

    invoke-virtual {v7, v1}, Lp1/q;->g0(I)Lp1/q;

    const/4 v11, 0x0

    const/4 v12, 0x1

    if-eqz v0, :cond_0

    move v1, v12

    goto :goto_0

    :cond_0
    move v1, v11

    :goto_0
    and-int/lit8 v2, v0, 0x1

    invoke-virtual {v7, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_7

    int-to-float v1, v12

    const/16 v2, 0x8

    int-to-float v13, v2

    mul-float/2addr v1, v13

    invoke-static {v1}, Ll0/m;->i(F)Ll0/k;

    move-result-object v1

    sget-object v2, Lb2/e;->N:Lb2/k;

    const/16 v3, 0x36

    invoke-static {v1, v2, v7, v3}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    iget-wide v2, v7, Lp1/q;->T:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    sget-object v14, Lb2/t;->w:Lb2/t;

    invoke-static {v7, v14}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v5, La3/l;->a:La3/k;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v6, v7, Lp1/q;->S:Z

    if-eqz v6, :cond_1

    invoke-virtual {v7, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_1
    sget-object v5, La3/k;->g:La3/i;

    invoke-static {v7, v5, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v7, v1, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v3, v7, Lp1/q;->S:Z

    if-nez v3, :cond_2

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    :cond_2
    invoke-static {v2, v7, v2, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v7, v1, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v1, -0x18c69635

    invoke-virtual {v7, v1}, Lp1/q;->e0(I)V

    move v1, v11

    :goto_2
    const/16 v2, 0xa

    if-ge v1, v2, :cond_6

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v2, v3, :cond_4

    invoke-static {v11, v7}, Ldc/b;->x(ILp1/q;)Lp1/k1;

    move-result-object v2

    :cond_4
    move-object v10, v2

    check-cast v10, Lp1/c1;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "Pagination Control - "

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, " Item(s)"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v7, v11}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v10}, Lzc1/x5;->d(Lp1/c1;)I

    move-result v2

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_5

    new-instance v4, Lzc1/n5;

    const/4 v3, 0x5

    invoke-direct {v4, v3, v10}, Lzc1/n5;-><init>(ILp1/c1;)V

    invoke-virtual {v7, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v4, Lkotlin/jvm/functions/Function1;

    sget-object v3, Lzc1/e1;->a:Lzc1/e1;

    invoke-virtual {v3}, Lzc1/e1;->b()Lkotlin/jvm/functions/Function3;

    move-result-object v6

    const v8, 0x30c00

    const/16 v9, 0x11

    move v3, v2

    move v2, v1

    const/4 v1, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v9}, Lw81/c;->i(Landroidx/compose/ui/Modifier;IILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v10}, Lzc1/x5;->d(Lp1/c1;)I

    move-result v1

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3, v14}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v15

    const/4 v3, 0x6

    int-to-float v3, v3

    mul-float v19, v3, v13

    const/16 v20, 0x7

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-static/range {v15 .. v20}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/16 v9, 0x180

    const/16 v10, 0x18

    const-wide/16 v4, 0x0

    move-object v8, v7

    const-wide/16 v6, 0x0

    move/from16 v21, v2

    move v2, v1

    move/from16 v1, v21

    invoke-static/range {v1 .. v10}, Ljz0/c;->d(IILandroidx/compose/ui/Modifier;JJLandroidx/compose/runtime/Composer;II)V

    move v2, v1

    move-object v7, v8

    goto :goto_2

    :cond_6
    invoke-virtual {v7, v11}, Lp1/q;->q(Z)V

    invoke-virtual {v7, v12}, Lp1/q;->q(Z)V

    goto :goto_3

    :cond_7
    invoke-virtual {v7}, Lp1/q;->X()V

    :goto_3
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_8

    new-instance v2, Lzc1/a5;

    const/16 v3, 0x18

    invoke-direct {v2, v0, v3}, Lzc1/a5;-><init>(II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_8
    return-void
.end method

.method private static final d(Lp1/c1;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")I"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    return p0
.end method

.method private static final e(Lp1/c1;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "I)V"
        }
    .end annotation

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final f(Lp1/c1;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzc1/x5;->e(Lp1/c1;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lzc1/x5;->c(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
