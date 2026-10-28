.class public abstract Lzc1/k3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u00a8\u0006\u0003"
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

    invoke-static {p0, p1, p2}, Lzc1/k3;->c(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/runtime/Composer;I)V
    .locals 17

    move/from16 v0, p1

    move-object/from16 v1, p0

    check-cast v1, Lp1/q;

    const v2, -0x558b322

    invoke-virtual {v1, v2}, Lp1/q;->g0(I)Lp1/q;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v0, :cond_0

    move v4, v3

    goto :goto_0

    :cond_0
    move v4, v2

    :goto_0
    and-int/lit8 v5, v0, 0x1

    invoke-virtual {v1, v5, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_a

    const-string v4, "Variations"

    const/4 v5, 0x6

    invoke-static {v4, v1, v5}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    const/4 v4, 0x2

    int-to-float v4, v4

    const/16 v6, 0x8

    int-to-float v6, v6

    mul-float/2addr v4, v6

    sget-object v6, Lb2/t;->w:Lb2/t;

    invoke-static {v4, v6}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v8, Ll0/m;->c:Ll0/g;

    sget-object v9, Lb2/e;->M:Lb2/k;

    invoke-static {v8, v9, v1, v2}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v10

    iget-wide v11, v1, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v1}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v1, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v13, La3/l;->a:La3/k;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v1}, Lp1/q;->i0()V

    iget-boolean v14, v1, Lp1/q;->S:Z

    if-eqz v14, :cond_1

    invoke-virtual {v1, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lp1/q;->s0()V

    :goto_1
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v1, v14, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, La3/k;->f:La3/i;

    invoke-static {v1, v10, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v12, La3/k;->j:La3/i;

    iget-boolean v15, v1, Lp1/q;->S:Z

    if-nez v15, :cond_2

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v15, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    :cond_2
    invoke-static {v11, v1, v11, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v1, v2, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {}, La21/a;->d()Ly11/q;

    move-result-object v7

    sget v11, Ly11/q;->d:I

    shl-int/lit8 v11, v11, 0x3

    const/4 v15, 0x0

    invoke-static {v15, v7, v1, v11, v3}, Ly11/p;->b(Landroidx/compose/ui/Modifier;Ly11/q;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, La21/a;->f()Ly11/q;

    move-result-object v7

    invoke-static {v15, v7, v1, v11, v3}, Ly11/p;->b(Landroidx/compose/ui/Modifier;Ly11/q;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, La21/a;->b()Ly11/q;

    move-result-object v7

    invoke-static {v15, v7, v1, v11, v3}, Ly11/p;->b(Landroidx/compose/ui/Modifier;Ly11/q;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v1, v3}, Lp1/q;->q(Z)V

    const-string v7, "Percentage Labels"

    invoke-static {v7, v1, v5}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v4, v6}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/4 v5, 0x0

    invoke-static {v8, v9, v1, v5}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    move-object v5, v8

    move-object/from16 v16, v9

    iget-wide v8, v1, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v1}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v1, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v1}, Lp1/q;->i0()V

    iget-boolean v15, v1, Lp1/q;->S:Z

    if-eqz v15, :cond_4

    invoke-virtual {v1, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_4
    invoke-virtual {v1}, Lp1/q;->s0()V

    :goto_2
    invoke-static {v1, v14, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v1, v10, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v1, Lp1/q;->S:Z

    if-nez v3, :cond_5

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v3, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6

    :cond_5
    invoke-static {v8, v1, v8, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    invoke-static {v1, v2, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {}, La21/a;->e()Ly11/q;

    move-result-object v3

    const/4 v7, 0x0

    const/4 v8, 0x1

    invoke-static {v7, v3, v1, v11, v8}, Ly11/p;->b(Landroidx/compose/ui/Modifier;Ly11/q;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, La21/a;->g()Ly11/q;

    move-result-object v3

    invoke-static {v7, v3, v1, v11, v8}, Ly11/p;->b(Landroidx/compose/ui/Modifier;Ly11/q;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, La21/a;->c()Ly11/q;

    move-result-object v3

    invoke-static {v7, v3, v1, v11, v8}, Ly11/p;->b(Landroidx/compose/ui/Modifier;Ly11/q;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v1, v8}, Lp1/q;->q(Z)V

    const-string v3, "Label Only"

    const/4 v7, 0x6

    invoke-static {v3, v1, v7}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v4, v6}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    move-object/from16 v4, v16

    const/4 v6, 0x0

    invoke-static {v5, v4, v1, v6}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v4

    iget-wide v5, v1, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v1}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v1, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v1}, Lp1/q;->i0()V

    iget-boolean v7, v1, Lp1/q;->S:Z

    if-eqz v7, :cond_7

    invoke-virtual {v1, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_7
    invoke-virtual {v1}, Lp1/q;->s0()V

    :goto_3
    invoke-static {v1, v14, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v1, v10, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v1, Lp1/q;->S:Z

    if-nez v4, :cond_8

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_9

    :cond_8
    invoke-static {v5, v1, v5, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    invoke-static {v1, v2, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {}, La21/a;->a()Ly11/q;

    move-result-object v2

    const/4 v7, 0x0

    const/4 v8, 0x1

    invoke-static {v7, v2, v1, v11, v8}, Ly11/p;->b(Landroidx/compose/ui/Modifier;Ly11/q;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v1, v8}, Lp1/q;->q(Z)V

    goto :goto_4

    :cond_a
    invoke-virtual {v1}, Lp1/q;->X()V

    :goto_4
    invoke-virtual {v1}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_b

    new-instance v2, Lzc1/l2;

    const/16 v3, 0x16

    invoke-direct {v2, v0, v3}, Lzc1/l2;-><init>(II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_b
    return-void
.end method

.method private static final c(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lzc1/k3;->b(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
