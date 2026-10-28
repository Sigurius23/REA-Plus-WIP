.class public abstract Lez0/c;
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
        "design_release"
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

    invoke-static {p0, p1, p2}, Lez0/c;->c(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/runtime/Composer;I)V
    .locals 18

    move/from16 v0, p1

    move-object/from16 v6, p0

    check-cast v6, Lp1/q;

    const v1, -0x7d70863e

    invoke-virtual {v6, v1}, Lp1/q;->g0(I)Lp1/q;

    const/4 v1, 0x0

    const/4 v9, 0x1

    if-eqz v0, :cond_0

    move v2, v9

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    and-int/lit8 v3, v0, 0x1

    invoke-virtual {v6, v3, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_4

    const/16 v2, 0x190

    int-to-float v2, v2

    sget-object v10, Lb2/t;->w:Lb2/t;

    invoke-static {v2, v10}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v3, Lx81/d;->a:Lx81/d;

    const/4 v4, 0x6

    invoke-virtual {v3, v6, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->o()J

    move-result-wide v7

    sget-object v5, Li2/w0;->a:Li2/v0;

    invoke-static {v2, v7, v8, v5}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v5, Lb2/e;->w:Lb2/m;

    invoke-static {v5, v1}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v1

    iget-wide v7, v6, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v6, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v11, v6, Lp1/q;->S:Z

    if-eqz v11, :cond_1

    invoke-virtual {v6, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_1
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v6, v8, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v6, v1, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v7, v6, Lp1/q;->S:Z

    if-nez v7, :cond_2

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_3

    :cond_2
    invoke-static {v5, v6, v5, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v6, v1, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/16 v16, 0x10

    const/16 v17, 0x0

    const v11, 0x3e4ccccd    # 0.2f

    const v12, 0x3e4ccccd    # 0.2f

    const v13, 0x3e4ccccd    # 0.2f

    const v14, 0x3f4ccccd    # 0.8f

    const/4 v15, 0x0

    invoke-static/range {v10 .. v17}, Lp91/e;->f(Landroidx/compose/ui/Modifier;FFFFLp91/a;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v3, v6, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->m0()J

    move-result-wide v2

    invoke-static {v2, v3}, Li91/c;->o(J)Li91/a;

    move-result-object v2

    const/4 v7, 0x0

    const/16 v8, 0x1c

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v8}, Lez0/b;->d(Landroidx/compose/ui/Modifier;Li91/a;Lk91/a;ZFLandroidx/compose/runtime/Composer;II)V

    const v11, 0x3f19999a    # 0.6f

    invoke-static/range {v10 .. v17}, Lp91/e;->f(Landroidx/compose/ui/Modifier;FFFFLp91/a;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/16 v8, 0x1e

    const/4 v2, 0x0

    invoke-static/range {v1 .. v8}, Lez0/b;->d(Landroidx/compose/ui/Modifier;Li91/a;Lk91/a;ZFLandroidx/compose/runtime/Composer;II)V

    const/16 v8, 0x1f

    const/4 v1, 0x0

    invoke-static/range {v1 .. v8}, Lez0/b;->d(Landroidx/compose/ui/Modifier;Li91/a;Lk91/a;ZFLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v6, v9}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_4
    invoke-virtual {v6}, Lp1/q;->X()V

    :goto_2
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_5

    new-instance v2, Lcom/whoop/profile/view/edit/preview/a;

    const/16 v3, 0x14

    invoke-direct {v2, v0, v3}, Lcom/whoop/profile/view/edit/preview/a;-><init>(II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_5
    return-void
.end method

.method private static final c(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lez0/c;->b(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
