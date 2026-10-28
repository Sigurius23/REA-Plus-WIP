.class public abstract Lf51/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lf51/h;",
        "viewState",
        "Ll83/a0;",
        "b",
        "(Landroidx/compose/ui/Modifier;Lf51/h;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(Landroidx/compose/ui/Modifier;Lf51/h;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lf51/g;->c(Landroidx/compose/ui/Modifier;Lf51/h;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/Modifier;Lf51/h;Landroidx/compose/runtime/Composer;II)V
    .locals 30

    move-object/from16 v3, p1

    const-string v0, "viewState"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p2

    check-cast v0, Lp1/q;

    const v1, 0x1254d40e

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p4, 0x1

    const/4 v2, 0x2

    const/4 v4, 0x4

    if-eqz v1, :cond_0

    or-int/lit8 v5, p3, 0x6

    move v6, v5

    move-object/from16 v5, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v5, p3, 0x6

    if-nez v5, :cond_2

    move-object/from16 v5, p0

    invoke-virtual {v0, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    move v6, v4

    goto :goto_0

    :cond_1
    move v6, v2

    :goto_0
    or-int v6, p3, v6

    goto :goto_1

    :cond_2
    move-object/from16 v5, p0

    move/from16 v6, p3

    :goto_1
    and-int/lit8 v7, p3, 0x30

    if-nez v7, :cond_4

    invoke-virtual {v0, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    const/16 v7, 0x20

    goto :goto_2

    :cond_3
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v6, v7

    :cond_4
    and-int/lit8 v7, v6, 0x13

    const/16 v8, 0x12

    const/4 v9, 0x0

    const/4 v10, 0x1

    if-eq v7, v8, :cond_5

    move v7, v10

    goto :goto_3

    :cond_5
    move v7, v9

    :goto_3
    and-int/2addr v6, v10

    invoke-virtual {v0, v6, v7}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_a

    if-eqz v1, :cond_6

    sget-object v1, Lb2/t;->w:Lb2/t;

    goto :goto_4

    :cond_6
    move-object v1, v5

    :goto_4
    const/high16 v5, 0x3f800000    # 1.0f

    invoke-static {v5, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const/4 v6, 0x3

    int-to-float v6, v6

    int-to-float v4, v4

    invoke-static {v5, v6, v4}, Lih0/d0;->e(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v3}, Lf51/h;->a()Ly81/f;

    move-result-object v5

    invoke-virtual {v5, v0, v9}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v5

    invoke-static {v5, v6}, Li91/c;->o(J)Li91/a;

    move-result-object v5

    invoke-static {v4, v5}, Li91/c;->c(Landroidx/compose/ui/Modifier;Li91/a;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    int-to-float v2, v2

    const/16 v5, 0x8

    int-to-float v5, v5

    mul-float/2addr v2, v5

    invoke-static {v2, v4}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v4, Lb2/e;->J:Lb2/l;

    sget-object v5, Ll0/m;->a:Ll0/e;

    const/16 v6, 0x30

    invoke-static {v5, v4, v0, v6}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v4

    iget-wide v5, v0, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v0, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v8, v0, Lp1/q;->S:Z

    if-eqz v8, :cond_7

    invoke-virtual {v0, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_7
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_5
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v0, v7, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v0, v4, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v6, v0, Lp1/q;->S:Z

    if-nez v6, :cond_8

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_9

    :cond_8
    invoke-static {v5, v0, v5, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v0, v4, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v3}, Lf51/h;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-static {v2, v0, v9}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    sget-object v2, Lx81/d;->a:Lx81/d;

    const/4 v5, 0x6

    invoke-virtual {v2, v0, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v2

    invoke-virtual {v2}, Lb91/d;->b()Lb91/a;

    move-result-object v24

    invoke-virtual {v3}, Lf51/h;->c()Ly81/f;

    move-result-object v2

    invoke-virtual {v2, v0, v9}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v6

    const/16 v28, 0x0

    const v29, 0x2fffa

    const/4 v5, 0x0

    const-wide/16 v8, 0x0

    move v2, v10

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x0

    move-object/from16 v26, v0

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    invoke-virtual {v0, v2}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_a
    invoke-virtual {v0}, Lp1/q;->X()V

    move-object v1, v5

    :goto_6
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_b

    new-instance v0, Ld62/b;

    const/16 v5, 0x1a

    move/from16 v2, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Ld62/b;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_b
    return-void
.end method

.method private static final c(Landroidx/compose/ui/Modifier;Lf51/h;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lf51/g;->b(Landroidx/compose/ui/Modifier;Lf51/h;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
