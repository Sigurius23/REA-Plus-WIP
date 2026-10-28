.class public abstract Lzt2/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a7\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lzt2/e;",
        "viewState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "e",
        "(Landroidx/compose/ui/Modifier;Lzt2/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "weekly-plan_release"
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
.method public static synthetic a(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzt2/d;->f(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Lzt2/e;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzt2/d;->g(Lkotlin/jvm/functions/Function1;Lzt2/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/compose/ui/Modifier;Lzt2/e;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lzt2/d;->i(Landroidx/compose/ui/Modifier;Lzt2/e;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lzt2/e;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lzt2/d;->h(Lzt2/e;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Landroidx/compose/ui/Modifier;Lzt2/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lzt2/e;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move/from16 v4, p4

    const-string v0, "viewState"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v12, p3

    check-cast v12, Lp1/q;

    const v0, 0x20b6df17

    invoke-virtual {v12, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p5, 0x1

    const/4 v1, 0x4

    if-eqz v0, :cond_0

    or-int/lit8 v3, v4, 0x6

    move v5, v3

    move-object/from16 v3, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v4, 0x6

    if-nez v3, :cond_2

    move-object/from16 v3, p0

    invoke-virtual {v12, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    move v5, v1

    goto :goto_0

    :cond_1
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v4

    goto :goto_1

    :cond_2
    move-object/from16 v3, p0

    move v5, v4

    :goto_1
    and-int/lit8 v6, v4, 0x30

    const/16 v7, 0x20

    if-nez v6, :cond_5

    and-int/lit8 v6, v4, 0x40

    if-nez v6, :cond_3

    invoke-virtual {v12, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    goto :goto_2

    :cond_3
    invoke-virtual {v12, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    :goto_2
    if-eqz v6, :cond_4

    move v6, v7

    goto :goto_3

    :cond_4
    const/16 v6, 0x10

    :goto_3
    or-int/2addr v5, v6

    :cond_5
    and-int/lit8 v6, p5, 0x4

    const/16 v8, 0x100

    if-eqz v6, :cond_7

    or-int/lit16 v5, v5, 0x180

    :cond_6
    move-object/from16 v9, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v9, v4, 0x180

    if-nez v9, :cond_6

    move-object/from16 v9, p2

    invoke-virtual {v12, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_8

    move v10, v8

    goto :goto_4

    :cond_8
    const/16 v10, 0x80

    :goto_4
    or-int/2addr v5, v10

    :goto_5
    and-int/lit16 v10, v5, 0x93

    const/16 v11, 0x92

    const/4 v13, 0x0

    const/4 v14, 0x1

    if-eq v10, v11, :cond_9

    move v10, v14

    goto :goto_6

    :cond_9
    move v10, v13

    :goto_6
    and-int/lit8 v11, v5, 0x1

    invoke-virtual {v12, v11, v10}, Lp1/q;->U(IZ)Z

    move-result v10

    if-eqz v10, :cond_12

    sget-object v10, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_a

    move-object v3, v10

    :cond_a
    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-eqz v6, :cond_c

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v0, :cond_b

    new-instance v6, Lzm1/d;

    const/16 v9, 0xe

    invoke-direct {v6, v9}, Lzm1/d;-><init>(I)V

    invoke-virtual {v12, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v6, Lkotlin/jvm/functions/Function1;

    move-object v15, v6

    goto :goto_7

    :cond_c
    move-object v15, v9

    :goto_7
    const-string v6, "BannerCardTag"

    invoke-static {v10, v6}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/high16 v9, 0x3f800000    # 1.0f

    invoke-static {v9, v6}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-interface {v6, v3}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v16

    and-int/lit16 v6, v5, 0x380

    if-ne v6, v8, :cond_d

    move v6, v14

    goto :goto_8

    :cond_d
    move v6, v13

    :goto_8
    and-int/lit8 v8, v5, 0x70

    if-eq v8, v7, :cond_f

    and-int/lit8 v5, v5, 0x40

    if-eqz v5, :cond_e

    invoke-virtual {v12, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_e

    goto :goto_9

    :cond_e
    move v14, v13

    :cond_f
    :goto_9
    or-int v5, v6, v14

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_10

    if-ne v6, v0, :cond_11

    :cond_10
    new-instance v6, Lyo1/b;

    const/16 v0, 0x19

    invoke-direct {v6, v0, v15, v2}, Lyo1/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v12, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    move-object/from16 v20, v6

    check-cast v20, Lc93/a;

    const/16 v21, 0xf

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v0, Lkd1/w;->a:Lkd1/w;

    invoke-virtual {v0}, Lkd1/w;->a()Lk91/a;

    move-result-object v0

    invoke-virtual {v0}, Lk91/a;->c()Lt0/i;

    move-result-object v6

    sget-object v0, Lx81/d;->a:Lx81/d;

    sget v7, Lx81/d;->b:I

    invoke-virtual {v0, v12, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->Y()J

    move-result-wide v7

    int-to-float v0, v13

    int-to-float v1, v1

    mul-float v10, v0, v1

    new-instance v0, Lw20/q;

    const/16 v1, 0x1b

    invoke-direct {v0, v2, v1}, Lw20/q;-><init>(Ljava/lang/Object;I)V

    const v1, -0x266add6c

    invoke-static {v1, v12, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v11

    const/high16 v13, 0x1b0000

    const/16 v14, 0x18

    const/4 v9, 0x0

    invoke-static/range {v5 .. v14}, Le93/b;->b(Landroidx/compose/ui/Modifier;Li2/a1;JLf0/t;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    move-object v1, v3

    move-object v3, v15

    goto :goto_a

    :cond_12
    invoke-virtual {v12}, Lp1/q;->X()V

    move-object v1, v3

    move-object v3, v9

    :goto_a
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_13

    new-instance v0, Lz51/n;

    const/16 v6, 0xe

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lz51/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_13
    return-void
.end method

.method private static final f(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lkotlin/jvm/functions/Function1;Lzt2/e;)Ll83/a0;
    .locals 0

    invoke-virtual {p1}, Lzt2/e;->a()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lzt2/e;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 31

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x2

    if-eq v0, v3, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    and-int/lit8 v4, p2, 0x1

    move-object/from16 v8, p1

    check-cast v8, Lp1/q;

    invoke-virtual {v8, v4, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_7

    int-to-float v0, v2

    const/16 v4, 0x8

    int-to-float v4, v4

    mul-float/2addr v0, v4

    int-to-float v3, v3

    mul-float/2addr v4, v3

    sget-object v13, Lb2/t;->w:Lb2/t;

    invoke-static {v13, v4, v0}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v4, Ll0/m;->c:Ll0/g;

    sget-object v5, Lb2/e;->M:Lb2/k;

    invoke-static {v4, v5, v8, v1}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    iget-wide v4, v8, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v8, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v7, v8, Lp1/q;->S:Z

    if-eqz v7, :cond_1

    invoke-virtual {v8, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_1
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v8, v7, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v8, v1, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v9, v8, Lp1/q;->S:Z

    if-nez v9, :cond_2

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_3

    :cond_2
    invoke-static {v4, v8, v4, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v8, v4, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, Lb2/e;->K:Lb2/l;

    sget-object v9, Ll0/m;->a:Ll0/e;

    const/16 v10, 0x30

    invoke-static {v9, v0, v8, v10}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v0

    iget-wide v9, v8, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v8, v13}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v12, v8, Lp1/q;->S:Z

    if-eqz v12, :cond_4

    invoke-virtual {v8, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_4
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_2
    invoke-static {v8, v7, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v8, v1, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v8, Lp1/q;->S:Z

    if-nez v0, :cond_5

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    :cond_5
    invoke-static {v9, v8, v9, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    invoke-static {v8, v4, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lzt2/e;->c()F

    move-result v0

    invoke-static {v0, v13}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Lzt2/e;->b()Ly71/g;

    move-result-object v1

    invoke-static {v1}, Ly71/p;->a(Ly71/g;)Lkd1/o$a;

    move-result-object v5

    sget v9, Lkd1/o$a;->c:I

    const/4 v10, 0x3

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v5 .. v10}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v5

    sget-object v1, Lx81/d;->a:Lx81/d;

    sget v4, Lx81/d;->b:I

    invoke-virtual {v1, v8, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->X()J

    move-result-wide v6

    const/16 v11, 0x30

    const/4 v12, 0x0

    move-object v10, v8

    move-wide v8, v6

    const/4 v6, 0x0

    move-object v7, v0

    invoke-static/range {v5 .. v12}, Lg1/f3;->a(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    move-object v8, v10

    const/4 v0, 0x4

    int-to-float v0, v0

    mul-float/2addr v3, v0

    invoke-static {v3, v13}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v8, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p0 .. p0}, Lzt2/e;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    sget v3, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v0, v8, v3}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v8, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->X()J

    move-result-wide v6

    new-instance v0, Lw3/k;

    invoke-direct {v0, v2}, Lw3/k;-><init>(I)V

    invoke-virtual {v1, v8, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v1

    invoke-virtual {v1}, Lb91/d;->b()Lb91/a;

    move-result-object v25

    sget v1, Lb91/a;->d:I

    shl-int/lit8 v29, v1, 0x12

    const v30, 0x2fdfa

    move-wide v7, v6

    const/4 v6, 0x0

    move-object/from16 v27, v10

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    move-object/from16 v17, v0

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v8, v27

    invoke-virtual {v8, v2}, Lp1/q;->q(Z)V

    invoke-virtual {v8, v2}, Lp1/q;->q(Z)V

    goto :goto_3

    :cond_7
    invoke-virtual {v8}, Lp1/q;->X()V

    :goto_3
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final i(Landroidx/compose/ui/Modifier;Lzt2/e;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lzt2/d;->e(Landroidx/compose/ui/Modifier;Lzt2/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
