.class public abstract Lv61/c;
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
        "c",
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
.method public static synthetic a(Ly61/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lv61/c;->e(Ly61/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lv61/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lv61/c;->d(Lv61/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Ly61/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 16
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

    move-object/from16 v7, p2

    check-cast v7, Lp1/q;

    const v0, -0x4b346cf2

    invoke-virtual {v7, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    const/4 v2, 0x4

    if-nez v0, :cond_1

    invoke-virtual {v7, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int v0, p3, v0

    goto :goto_1

    :cond_1
    move/from16 v0, p3

    :goto_1
    and-int/lit8 v3, p4, 0x2

    if-eqz v3, :cond_3

    or-int/lit8 v0, v0, 0x30

    :cond_2
    move-object/from16 v4, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v4, p3, 0x30

    if-nez v4, :cond_2

    move-object/from16 v4, p1

    invoke-virtual {v7, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x20

    goto :goto_2

    :cond_4
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v0, v5

    :goto_3
    and-int/lit8 v5, v0, 0x13

    const/16 v6, 0x12

    const/4 v10, 0x1

    const/4 v11, 0x0

    if-eq v5, v6, :cond_5

    move v5, v10

    goto :goto_4

    :cond_5
    move v5, v11

    :goto_4
    and-int/lit8 v6, v0, 0x1

    invoke-virtual {v7, v6, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_f

    if-eqz v3, :cond_7

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-ne v3, v4, :cond_6

    new-instance v3, Lto1/h;

    const/16 v4, 0x18

    invoke-direct {v3, v4}, Lto1/h;-><init>(I)V

    invoke-virtual {v7, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object v12, v3

    goto :goto_5

    :cond_7
    move-object v12, v4

    :goto_5
    invoke-virtual {v1}, Ly61/a;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-static {v3, v7, v11}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v1}, Ly61/a;->l()F

    move-result v3

    sget-object v4, Lp91/a;->e:Lp91/a$a;

    invoke-virtual {v4}, Lp91/a$a;->b()Lp91/a;

    move-result-object v4

    sget-object v14, Lb2/t;->w:Lb2/t;

    const/high16 v5, -0x40800000    # -1.0f

    invoke-static {v14, v3, v5, v4}, Lp91/e;->j(Landroidx/compose/ui/Modifier;FFLp91/a;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v4, Lb2/e;->N:Lb2/k;

    sget-object v5, Ll0/m;->d:Ll0/g;

    const/16 v6, 0x36

    invoke-static {v5, v4, v7, v6}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v4

    iget-wide v5, v7, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v7, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v9, v7, Lp1/q;->S:Z

    if-eqz v9, :cond_8

    invoke-virtual {v7, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_8
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_6
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v7, v8, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v7, v4, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v6, v7, Lp1/q;->S:Z

    if-nez v6, :cond_9

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_a

    :cond_9
    invoke-static {v5, v7, v5, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_a
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v7, v4, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1}, Ly61/a;->i()Lkd1/o;

    move-result-object v3

    const/16 v15, 0x8

    if-nez v3, :cond_b

    const v3, -0x372f29a1

    invoke-virtual {v7, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v7, v11}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_b
    const v3, -0x372f29a0    # -427699.0f

    invoke-virtual {v7, v3}, Lp1/q;->e0(I)V

    and-int/lit8 v3, v0, 0x7e

    invoke-static {v1, v12, v7, v3, v11}, Lw61/b;->d(Ly61/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    const-wide/high16 v3, 0x3fe0000000000000L    # 0.5

    double-to-float v3, v3

    int-to-float v4, v15

    invoke-static {v3, v4, v14, v7, v11}, Lr80/c;->z(FFLb2/t;Lp1/q;Z)V

    :goto_7
    invoke-virtual {v1}, Ly61/a;->h()Lgz0/m0;

    move-result-object v3

    if-eqz v3, :cond_c

    const v0, -0x372b90b5

    invoke-virtual {v7, v0}, Lp1/q;->e0(I)V

    const/4 v0, 0x5

    int-to-float v0, v0

    int-to-float v2, v2

    mul-float/2addr v0, v2

    invoke-static {v0, v14}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v1}, Ly61/a;->h()Lgz0/m0;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/m0;->toWhoopIcon()I

    move-result v0

    const/4 v2, 0x6

    invoke-static {v0, v7, v2}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v0

    sget-object v3, Lx81/d;->a:Lx81/d;

    invoke-virtual {v3, v7, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->y()J

    move-result-wide v5

    const/16 v8, 0x1b0

    const/4 v9, 0x0

    const-string v3, ""

    move-object v2, v0

    invoke-static/range {v2 .. v9}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    int-to-float v0, v10

    int-to-float v2, v15

    invoke-static {v0, v2, v14, v7, v11}, Lr80/c;->z(FFLb2/t;Lp1/q;Z)V

    goto :goto_9

    :cond_c
    const v2, -0x3725f6d6

    invoke-virtual {v7, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Ly61/a;->k()Lu61/d;

    move-result-object v3

    if-nez v3, :cond_d

    const v0, -0x3725f6d7

    invoke-virtual {v7, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v7, v11}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_d
    invoke-virtual {v7, v2}, Lp1/q;->e0(I)V

    and-int/lit8 v0, v0, 0x7e

    invoke-static {v1, v12, v7, v0, v11}, Lw61/c;->d(Ly61/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    int-to-float v0, v10

    int-to-float v2, v15

    invoke-static {v0, v2, v14, v7, v11}, Lr80/c;->z(FFLb2/t;Lp1/q;Z)V

    :goto_8
    invoke-virtual {v7, v11}, Lp1/q;->q(Z)V

    :goto_9
    invoke-virtual {v7, v10}, Lp1/q;->q(Z)V

    invoke-virtual {v1}, Ly61/a;->d()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_e

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ly61/b;

    invoke-static {v2, v13, v7, v11}, Lw61/a;->c(Ly61/b;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    goto :goto_a

    :cond_e
    move-object v2, v12

    goto :goto_b

    :cond_f
    invoke-virtual {v7}, Lp1/q;->X()V

    move-object v2, v4

    :goto_b
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_10

    new-instance v0, Lv61/b;

    const/4 v5, 0x0

    move/from16 v3, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lv61/b;-><init>(Ly61/a;Lkotlin/jvm/functions/Function1;III)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_10
    return-void
.end method

.method private static final d(Lv61/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Ly61/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lv61/c;->c(Ly61/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
