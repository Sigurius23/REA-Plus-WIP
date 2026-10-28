.class public abstract Lw61/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Ly61/a;",
        "group",
        "Lkotlin/Function1;",
        "Lv61/a;",
        "Ll83/a0;",
        "onCtaClicked",
        "d",
        "(Ly61/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(Lv61/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lw61/b;->e(Lv61/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ly61/a;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lw61/b;->f(Ly61/a;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ly61/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lw61/b;->g(Ly61/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Ly61/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly61/a;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    const-string v0, "group"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v5, p2

    check-cast v5, Lp1/q;

    const v0, -0x23092c9e

    invoke-virtual {v5, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    const/4 v8, 0x4

    if-nez v0, :cond_1

    invoke-virtual {v5, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v8

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int v0, p3, v0

    goto :goto_1

    :cond_1
    move/from16 v0, p3

    :goto_1
    and-int/lit8 v2, p4, 0x2

    const/16 v3, 0x20

    if-eqz v2, :cond_3

    or-int/lit8 v0, v0, 0x30

    :cond_2
    move-object/from16 v4, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v4, p3, 0x30

    if-nez v4, :cond_2

    move-object/from16 v4, p1

    invoke-virtual {v5, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    move v6, v3

    goto :goto_2

    :cond_4
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v0, v6

    :goto_3
    and-int/lit8 v6, v0, 0x13

    const/16 v7, 0x12

    const/4 v12, 0x1

    const/4 v13, 0x0

    if-eq v6, v7, :cond_5

    move v6, v12

    goto :goto_4

    :cond_5
    move v6, v13

    :goto_4
    and-int/lit8 v7, v0, 0x1

    invoke-virtual {v5, v7, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_f

    sget-object v6, Lp1/l;->a:Lp1/v0;

    if-eqz v2, :cond_7

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v6, :cond_6

    new-instance v2, Lvb1/a;

    const/16 v4, 0xb

    invoke-direct {v2, v4}, Lvb1/a;-><init>(I)V

    invoke-virtual {v5, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v14, v2

    goto :goto_5

    :cond_7
    move-object v14, v4

    :goto_5
    invoke-virtual {v1}, Ly61/a;->i()Lkd1/o;

    move-result-object v2

    if-nez v2, :cond_8

    const v0, -0x289cafbb

    invoke-virtual {v5, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v5, v13}, Lp1/q;->q(Z)V

    goto/16 :goto_8

    :cond_8
    const v2, -0x289cafba

    invoke-virtual {v5, v2}, Lp1/q;->e0(I)V

    const-string v2, "GraphOverlayIcon"

    invoke-virtual {v1}, Ly61/a;->f()Ljava/lang/String;

    move-result-object v4

    filled-new-array {v2, v4}, [Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lm83/n;->r0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    const/16 v19, 0x0

    const/16 v20, 0x3e

    const-string v16, "_"

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-static/range {v15 .. v20}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v2

    sget-object v9, Lb2/t;->w:Lb2/t;

    invoke-static {v9, v2}, Lgb1/d;->d(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v15

    invoke-virtual {v5, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    and-int/lit8 v0, v0, 0x70

    if-ne v0, v3, :cond_9

    move v0, v12

    goto :goto_6

    :cond_9
    move v0, v13

    :goto_6
    or-int/2addr v0, v2

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_a

    if-ne v2, v6, :cond_b

    :cond_a
    new-instance v2, Lk80/d;

    const/16 v0, 0xc

    invoke-direct {v2, v0, v1, v14}, Lk80/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v5, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    move-object/from16 v19, v2

    check-cast v19, Lc93/a;

    const/16 v20, 0xf

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-static/range {v15 .. v20}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v2, Lb2/e;->w:Lb2/m;

    invoke-static {v2, v13}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v2

    iget-wide v3, v5, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v5, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v7, v5, Lp1/q;->S:Z

    if-eqz v7, :cond_c

    invoke-virtual {v5, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_c
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_7
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v5, v6, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v5, v2, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v4, v5, Lp1/q;->S:Z

    if-nez v4, :cond_d

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_e

    :cond_d
    invoke-static {v3, v5, v3, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_e
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v5, v2, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1}, Ly61/a;->i()Lkd1/o;

    move-result-object v2

    const/4 v6, 0x0

    const/4 v7, 0x3

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v2

    const/4 v0, 0x5

    int-to-float v3, v0

    int-to-float v4, v8

    mul-float/2addr v3, v4

    invoke-static {v3, v9}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v1}, Ly61/a;->j()Ly81/f;

    move-result-object v3

    invoke-virtual {v3, v5, v13}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v6

    new-instance v8, Li2/p;

    invoke-direct {v8, v6, v7, v0}, Li2/p;-><init>(JI)V

    const/16 v10, 0x1b0

    const/16 v11, 0x38

    const/4 v3, 0x0

    move-object v9, v5

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v2 .. v11}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object v5, v9

    invoke-virtual {v5, v12}, Lp1/q;->q(Z)V

    invoke-virtual {v5, v13}, Lp1/q;->q(Z)V

    :goto_8
    move-object v2, v14

    goto :goto_9

    :cond_f
    invoke-virtual {v5}, Lp1/q;->X()V

    move-object v2, v4

    :goto_9
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_10

    new-instance v0, Lv61/b;

    const/4 v5, 0x1

    move/from16 v3, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lv61/b;-><init>(Ly61/a;Lkotlin/jvm/functions/Function1;III)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_10
    return-void
.end method

.method private static final e(Lv61/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Ly61/a;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 3

    invoke-virtual {p0}, Ly61/a;->f()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Lv61/a;

    invoke-virtual {p0}, Ly61/a;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Ly61/a;->g()Ljava/util/List;

    move-result-object p0

    invoke-direct {v1, v0, v2, p0}, Lv61/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    invoke-interface {p1, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Ly61/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lw61/b;->d(Ly61/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
