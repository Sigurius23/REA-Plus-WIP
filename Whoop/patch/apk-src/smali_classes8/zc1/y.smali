.class public abstract Lzc1/y;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Ll83/a0;",
        "b",
        "(Landroidx/compose/runtime/Composer;I)V",
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

    invoke-static {p0, p1, p2}, Lzc1/y;->c(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/runtime/Composer;I)V
    .locals 16

    move/from16 v0, p1

    sget-object v1, Lb2/e;->w:Lb2/m;

    move-object/from16 v2, p0

    check-cast v2, Lp1/q;

    const v3, 0x417d1b3c

    invoke-virtual {v2, v3}, Lp1/q;->g0(I)Lp1/q;

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v0, :cond_0

    move v5, v4

    goto :goto_0

    :cond_0
    move v5, v3

    :goto_0
    and-int/lit8 v6, v0, 0x1

    invoke-virtual {v2, v6, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_c

    sget-object v5, Lb2/e;->N:Lb2/k;

    sget-object v6, Ll0/m;->c:Ll0/g;

    const/16 v7, 0x30

    invoke-static {v6, v5, v2, v7}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v5

    iget-wide v6, v2, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v2}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    sget-object v8, Lb2/t;->w:Lb2/t;

    invoke-static {v2, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v10, La3/l;->a:La3/k;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v2}, Lp1/q;->i0()V

    iget-boolean v11, v2, Lp1/q;->S:Z

    if-eqz v11, :cond_1

    invoke-virtual {v2, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lp1/q;->s0()V

    :goto_1
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v2, v10, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v2, v5, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v7, v2, Lp1/q;->S:Z

    if-nez v7, :cond_2

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v7, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_3

    :cond_2
    invoke-static {v6, v2, v6, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v2, v5, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-string v5, "Bar Graph Track"

    const/4 v6, 0x6

    invoke-static {v5, v2, v6}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    const v5, 0x410ee105

    invoke-virtual {v2, v5}, Lp1/q;->e0(I)V

    move v5, v4

    :goto_2
    const/4 v7, 0x3

    const/4 v9, 0x4

    const/16 v10, 0xa

    const/4 v11, 0x0

    if-ge v5, v9, :cond_7

    mul-int/lit8 v12, v5, 0xa

    mul-int/lit8 v13, v5, 0x28

    new-instance v14, Ljava/lang/StringBuilder;

    const-string v15, "Width "

    invoke-direct {v14, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v14, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v13, "dp"

    invoke-virtual {v14, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13, v2, v3}, Lkd1/k;->e(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    int-to-float v10, v10

    invoke-static {v10, v8}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    invoke-static {v2, v13}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    int-to-float v12, v12

    int-to-float v9, v9

    mul-float/2addr v12, v9

    invoke-static {v12, v8}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-static {v1, v3}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v12

    iget-wide v13, v2, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v2}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v2, v9}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v15, La3/l;->a:La3/k;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v2}, Lp1/q;->i0()V

    iget-boolean v6, v2, Lp1/q;->S:Z

    if-eqz v6, :cond_4

    invoke-virtual {v2, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_4
    invoke-virtual {v2}, Lp1/q;->s0()V

    :goto_3
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v2, v6, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v2, v6, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v12, v2, Lp1/q;->S:Z

    if-nez v12, :cond_5

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v12, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_6

    :cond_5
    invoke-static {v13, v2, v13, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v2, v6, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v11, v11, v2, v3, v7}, Lzy0/f;->c(Landroidx/compose/ui/Modifier;Li2/a1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v2, v4}, Lp1/q;->q(Z)V

    invoke-static {v10, v8}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v2, v6}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    add-int/lit8 v5, v5, 0x1

    const/4 v6, 0x6

    goto/16 :goto_2

    :cond_7
    invoke-virtual {v2, v3}, Lp1/q;->q(Z)V

    const-string v5, "Full screen width / performance test"

    const/4 v6, 0x6

    invoke-static {v5, v2, v6}, Lkd1/k;->e(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    const v5, 0x410f1eff

    invoke-virtual {v2, v5}, Lp1/q;->e0(I)V

    move v5, v4

    :goto_4
    const/16 v6, 0x15

    if-ge v5, v6, :cond_b

    int-to-float v6, v10

    invoke-static {v6, v8}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-static {v2, v9}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const/high16 v9, 0x3f800000    # 1.0f

    invoke-static {v9, v8}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-static {v1, v3}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v12

    iget-wide v13, v2, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v2}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v2, v9}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v15, La3/l;->a:La3/k;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v2}, Lp1/q;->i0()V

    iget-boolean v10, v2, Lp1/q;->S:Z

    if-eqz v10, :cond_8

    invoke-virtual {v2, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_8
    invoke-virtual {v2}, Lp1/q;->s0()V

    :goto_5
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v2, v10, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, La3/k;->f:La3/i;

    invoke-static {v2, v10, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, La3/k;->j:La3/i;

    iget-boolean v12, v2, Lp1/q;->S:Z

    if-nez v12, :cond_9

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v12, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_a

    :cond_9
    invoke-static {v13, v2, v13, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_a
    sget-object v10, La3/k;->d:La3/i;

    invoke-static {v2, v10, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v11, v11, v2, v3, v7}, Lzy0/f;->c(Landroidx/compose/ui/Modifier;Li2/a1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v2, v4}, Lp1/q;->q(Z)V

    invoke-static {v6, v8}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v2, v6}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    add-int/lit8 v5, v5, 0x1

    const/16 v10, 0xa

    goto :goto_4

    :cond_b
    invoke-virtual {v2, v3}, Lp1/q;->q(Z)V

    invoke-virtual {v2, v4}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_c
    invoke-virtual {v2}, Lp1/q;->X()V

    :goto_6
    invoke-virtual {v2}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_d

    new-instance v2, Lzc1/j;

    const/16 v3, 0xb

    invoke-direct {v2, v0, v3}, Lzc1/j;-><init>(II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_d
    return-void
.end method

.method private static final c(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lzc1/y;->b(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
