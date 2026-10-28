.class public abstract Lep1/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001aC\u0010\u000b\u001a\u00020\t2\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H\u0007\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u001a\u001b\u0010\u000e\u001a\u00020\r*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcp1/c;",
        "progress",
        "Lcom/whoop/design/util/TextResource;",
        "buttonText",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "",
        "enabled",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onClick",
        "c",
        "(Lcp1/c;Lcom/whoop/design/util/TextResource;Landroidx/compose/ui/Modifier;ZLc93/a;Landroidx/compose/runtime/Composer;II)V",
        "Lc31/k;",
        "f",
        "(Lcp1/c;Z)Lc31/k;",
        "hormonal-insights_release"
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
.method public static synthetic a(Lc93/a;Lc31/c;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lep1/e;->d(Lc93/a;Lc31/c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcp1/c;Lcom/whoop/design/util/TextResource;Landroidx/compose/ui/Modifier;ZLc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Lep1/e;->e(Lcp1/c;Lcom/whoop/design/util/TextResource;Landroidx/compose/ui/Modifier;ZLc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lcp1/c;Lcom/whoop/design/util/TextResource;Landroidx/compose/ui/Modifier;ZLc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcp1/c;",
            "Lcom/whoop/design/util/TextResource;",
            "Landroidx/compose/ui/Modifier;",
            "Z",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v11, p4

    move/from16 v0, p6

    const-string v3, "buttonText"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "onClick"

    invoke-static {v11, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v12, p5

    check-cast v12, Lp1/q;

    const v3, 0x31cf11cd

    invoke-virtual {v12, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v0, 0x6

    if-nez v3, :cond_2

    and-int/lit8 v3, v0, 0x8

    if-nez v3, :cond_0

    invoke-virtual {v12, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    goto :goto_0

    :cond_0
    invoke-virtual {v12, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    :goto_0
    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_1

    :cond_1
    const/4 v3, 0x2

    :goto_1
    or-int/2addr v3, v0

    goto :goto_2

    :cond_2
    move v3, v0

    :goto_2
    and-int/lit8 v4, v0, 0x30

    if-nez v4, :cond_5

    and-int/lit8 v4, v0, 0x40

    if-nez v4, :cond_3

    invoke-virtual {v12, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    goto :goto_3

    :cond_3
    invoke-virtual {v12, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    :goto_3
    if-eqz v4, :cond_4

    const/16 v4, 0x20

    goto :goto_4

    :cond_4
    const/16 v4, 0x10

    :goto_4
    or-int/2addr v3, v4

    :cond_5
    and-int/lit8 v4, p7, 0x4

    if-eqz v4, :cond_7

    or-int/lit16 v3, v3, 0x180

    :cond_6
    move-object/from16 v5, p2

    goto :goto_6

    :cond_7
    and-int/lit16 v5, v0, 0x180

    if-nez v5, :cond_6

    move-object/from16 v5, p2

    invoke-virtual {v12, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_8

    const/16 v6, 0x100

    goto :goto_5

    :cond_8
    const/16 v6, 0x80

    :goto_5
    or-int/2addr v3, v6

    :goto_6
    and-int/lit8 v6, p7, 0x8

    if-eqz v6, :cond_a

    or-int/lit16 v3, v3, 0xc00

    :cond_9
    move/from16 v7, p3

    goto :goto_8

    :cond_a
    and-int/lit16 v7, v0, 0xc00

    if-nez v7, :cond_9

    move/from16 v7, p3

    invoke-virtual {v12, v7}, Lp1/q;->h(Z)Z

    move-result v8

    if-eqz v8, :cond_b

    const/16 v8, 0x800

    goto :goto_7

    :cond_b
    const/16 v8, 0x400

    :goto_7
    or-int/2addr v3, v8

    :goto_8
    and-int/lit16 v8, v0, 0x6000

    const/16 v9, 0x4000

    if-nez v8, :cond_d

    invoke-virtual {v12, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_c

    move v8, v9

    goto :goto_9

    :cond_c
    const/16 v8, 0x2000

    :goto_9
    or-int/2addr v3, v8

    :cond_d
    and-int/lit16 v8, v3, 0x2493

    const/16 v10, 0x2492

    const/4 v15, 0x0

    if-eq v8, v10, :cond_e

    const/4 v8, 0x1

    goto :goto_a

    :cond_e
    move v8, v15

    :goto_a
    and-int/lit8 v10, v3, 0x1

    invoke-virtual {v12, v10, v8}, Lp1/q;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_18

    if-eqz v4, :cond_f

    sget-object v4, Lb2/t;->w:Lb2/t;

    goto :goto_b

    :cond_f
    move-object v4, v5

    :goto_b
    if-eqz v6, :cond_10

    const/4 v6, 0x1

    goto :goto_c

    :cond_10
    move v6, v7

    :goto_c
    if-eqz v1, :cond_17

    const v5, 0x4feba363

    invoke-virtual {v12, v5}, Lp1/q;->e0(I)V

    sget-object v5, Lb2/e;->w:Lb2/m;

    invoke-static {v5, v15}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v5

    iget-wide v7, v12, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v12, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v14, La3/l;->a:La3/k;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v13, v12, Lp1/q;->S:Z

    if-eqz v13, :cond_11

    invoke-virtual {v12, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_d

    :cond_11
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_d
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v12, v13, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v12, v5, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v8, v12, Lp1/q;->S:Z

    if-nez v8, :cond_12

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v8, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_13

    :cond_12
    invoke-static {v7, v12, v7, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_13
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v12, v5, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v1, v6}, Lep1/e;->f(Lcp1/c;Z)Lc31/k;

    move-result-object v5

    const v7, 0xe000

    and-int/2addr v3, v7

    if-ne v3, v9, :cond_14

    const/4 v3, 0x1

    goto :goto_e

    :cond_14
    move v3, v15

    :goto_e
    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v3, :cond_15

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v7, v3, :cond_16

    :cond_15
    new-instance v7, Laz1/b;

    const/16 v3, 0x13

    invoke-direct {v7, v11, v3}, Laz1/b;-><init>(Lc93/a;I)V

    invoke-virtual {v12, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_16
    check-cast v7, Lkotlin/jvm/functions/Function1;

    sget v3, Lc31/k;->r:I

    invoke-static {v5, v7, v12, v3, v15}, Lc31/j;->e(Lc31/k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    const/4 v3, 0x1

    invoke-virtual {v12, v3}, Lp1/q;->q(Z)V

    invoke-virtual {v12, v15}, Lp1/q;->q(Z)V

    move-object v3, v4

    goto :goto_f

    :cond_17
    const v5, 0x4fee2684

    invoke-virtual {v12, v5}, Lp1/q;->e0(I)V

    move-object v5, v4

    sget-object v4, Lny0/v;->TextLarge:Lny0/v;

    sget v7, Lcom/whoop/design/util/TextResource;->$stable:I

    shr-int/lit8 v8, v3, 0x3

    and-int/lit8 v8, v8, 0xe

    or-int/2addr v7, v8

    invoke-static {v2, v12, v7}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    sget-object v8, Lx81/d;->a:Lx81/d;

    sget v9, Lx81/d;->b:I

    invoke-virtual {v8, v12, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->i0()J

    move-result-wide v8

    shr-int/lit8 v10, v3, 0x6

    and-int/lit8 v10, v10, 0xe

    or-int/lit8 v10, v10, 0x30

    and-int/lit16 v13, v3, 0x1c00

    or-int/2addr v10, v13

    shl-int/lit8 v3, v3, 0x9

    const/high16 v13, 0x1c00000

    and-int/2addr v3, v13

    or-int v13, v10, v3

    const/16 v14, 0x60

    move-object v3, v5

    move-object v5, v7

    move-wide v7, v8

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v3 .. v14}, Lny0/u;->h(Landroidx/compose/ui/Modifier;Lny0/v;Ljava/lang/String;ZJLi2/t;ZLc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v12, v15}, Lp1/q;->q(Z)V

    :goto_f
    move v4, v6

    goto :goto_10

    :cond_18
    invoke-virtual {v12}, Lp1/q;->X()V

    move-object v3, v5

    move v4, v7

    :goto_10
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_19

    new-instance v0, Lbf0/g;

    const/4 v8, 0x6

    move-object/from16 v5, p4

    move/from16 v6, p6

    move/from16 v7, p7

    invoke-direct/range {v0 .. v8}, Lbf0/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZLl83/e;III)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_19
    return-void
.end method

.method private static final d(Lc93/a;Lc31/c;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Lcp1/c;Lcom/whoop/design/util/TextResource;Landroidx/compose/ui/Modifier;ZLc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, Lp1/x;->L(I)I

    move-result v6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-object v4, p4

    move v7, p6

    move-object v5, p7

    invoke-static/range {v0 .. v7}, Lep1/e;->c(Lcp1/c;Lcom/whoop/design/util/TextResource;Landroidx/compose/ui/Modifier;ZLc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Lcp1/c;Z)Lc31/k;
    .locals 22

    invoke-virtual/range {p0 .. p0}, Lcp1/c;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v2, Lc31/d;->FILLED:Lc31/d;

    invoke-virtual/range {p0 .. p0}, Lcp1/c;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    sget-object v13, Ly81/f;->ACCENT_POSITIVE_TREND:Ly81/f;

    sget-object v7, Lgz0/m0;->CHECKMARK:Lgz0/m0;

    sget-object v15, Ly81/f;->BRAND_BLACK:Ly81/f;

    new-instance v1, Lc31/k;

    const v19, 0x1d5dc

    const/16 v20, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move/from16 v11, p1

    invoke-direct/range {v1 .. v20}, Lc31/k;-><init>(Lc31/d;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lgz0/m0;IILjava/lang/Float;ZZLy81/e;Li2/t;Ly81/e;Ly81/e;Lcom/whoop/navigation/models/GenericInteraction;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_0
    sget-object v3, Lc31/d;->PROGRESS:Lc31/d;

    invoke-virtual/range {p0 .. p0}, Lcp1/c;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, Lcp1/c;->a()I

    move-result v9

    invoke-virtual/range {p0 .. p0}, Lcp1/c;->b()I

    move-result v10

    invoke-static {}, Lgb1/b0;->G0()Li2/t;

    move-result-object v15

    new-instance v2, Lc31/k;

    const v20, 0x1ed3c

    const/16 v21, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move/from16 v12, p1

    invoke-direct/range {v2 .. v21}, Lc31/k;-><init>(Lc31/d;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lgz0/m0;IILjava/lang/Float;ZZLy81/e;Li2/t;Ly81/e;Ly81/e;Lcom/whoop/navigation/models/GenericInteraction;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2
.end method
