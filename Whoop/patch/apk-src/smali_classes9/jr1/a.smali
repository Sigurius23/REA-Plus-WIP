.class public abstract Ljr1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\n\u00b2\u0006\u000c\u0010\t\u001a\u00020\u00088\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lgr1/i;",
        "integrationRow",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onClick",
        "d",
        "(Lgr1/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "",
        "isPressed",
        "integrations_release"
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
.method public static synthetic a(Lgr1/i;JLandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Ljr1/a;->g(Lgr1/i;JLandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Lgr1/i;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Ljr1/a;->f(Lkotlin/jvm/functions/Function1;Lgr1/i;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lgr1/i;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Ljr1/a;->h(Lgr1/i;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lgr1/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgr1/i;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    const-string v3, "integrationRow"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "onClick"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v11, p2

    check-cast v11, Lp1/q;

    const v3, 0x6b13c4ad

    invoke-virtual {v11, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v2, 0x6

    if-nez v3, :cond_2

    and-int/lit8 v3, v2, 0x8

    if-nez v3, :cond_0

    invoke-virtual {v11, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    goto :goto_0

    :cond_0
    invoke-virtual {v11, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    :goto_0
    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_1

    :cond_1
    const/4 v3, 0x2

    :goto_1
    or-int/2addr v3, v2

    goto :goto_2

    :cond_2
    move v3, v2

    :goto_2
    and-int/lit8 v4, v2, 0x30

    const/16 v5, 0x20

    if-nez v4, :cond_4

    invoke-virtual {v11, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    move v4, v5

    goto :goto_3

    :cond_3
    const/16 v4, 0x10

    :goto_3
    or-int/2addr v3, v4

    :cond_4
    and-int/lit8 v4, v3, 0x13

    const/16 v6, 0x12

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eq v4, v6, :cond_5

    move v4, v7

    goto :goto_4

    :cond_5
    move v4, v8

    :goto_4
    and-int/lit8 v6, v3, 0x1

    invoke-virtual {v11, v6, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_e

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    sget-object v6, Lp1/l;->a:Lp1/v0;

    if-ne v4, v6, :cond_6

    invoke-static {v11}, Ld;->g(Lp1/q;)Lj0/j;

    move-result-object v4

    :cond_6
    move-object v13, v4

    check-cast v13, Lj0/i;

    const/4 v4, 0x6

    invoke-static {v13, v11, v4}, Lge3/g;->m(Lj0/i;Lp1/q;I)Lp1/c1;

    move-result-object v4

    invoke-static {v4}, Ljr1/a;->e(Lp1/t2;)Z

    move-result v9

    if-eqz v9, :cond_8

    const v9, 0x432bd766

    invoke-virtual {v11, v9}, Lp1/q;->e0(I)V

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v6, :cond_7

    sget-object v9, Ljr1/a$a;->w:Ljr1/a$a;

    :goto_5
    invoke-virtual {v11, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v9, Lkotlin/jvm/functions/Function1;

    invoke-static {v9}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v9

    invoke-virtual {v11, v8}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_8
    const v9, 0x432bdb43

    invoke-virtual {v11, v9}, Lp1/q;->e0(I)V

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v6, :cond_7

    sget-object v9, Ljr1/a$b;->w:Ljr1/a$b;

    goto :goto_5

    :goto_6
    invoke-interface {v9, v11, v8}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v9

    invoke-static {v4}, Ljr1/a;->e(Lp1/t2;)Z

    move-result v4

    if-eqz v4, :cond_9

    const v4, 0x432be757

    invoke-virtual {v11, v4}, Lp1/q;->e0(I)V

    sget-object v4, Lx81/d;->a:Lx81/d;

    sget v12, Lx81/d;->b:I

    invoke-static {v4, v11, v12, v8}, Ldc/b;->e(Lx81/d;Lp1/q;IZ)J

    move-result-wide v14

    goto :goto_7

    :cond_9
    const v4, 0x432beca0

    invoke-virtual {v11, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v6, :cond_a

    sget-object v4, Ljr1/a$c;->w:Ljr1/a$c;

    invoke-virtual {v11, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-static {v4}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v4

    invoke-interface {v4, v11, v8}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v14

    invoke-virtual {v11, v8}, Lp1/q;->q(Z)V

    :goto_7
    new-instance v4, Li3/i;

    invoke-direct {v4, v8}, Li3/i;-><init>(I)V

    and-int/lit8 v3, v3, 0x70

    if-ne v3, v5, :cond_b

    goto :goto_8

    :cond_b
    move v7, v8

    :goto_8
    invoke-virtual {v11, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v3, v7

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v3, :cond_c

    if-ne v5, v6, :cond_d

    :cond_c
    new-instance v5, Lj11/q;

    const/16 v3, 0x9

    invoke-direct {v5, v3, v1, v0}, Lj11/q;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v11, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    move-object/from16 v17, v5

    check-cast v17, Lc93/a;

    const/16 v18, 0xc

    sget-object v12, Lb2/t;->w:Lb2/t;

    move-wide v5, v14

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object/from16 v16, v4

    invoke-static/range {v12 .. v18}, Landroidx/compose/foundation/a;->e(Landroidx/compose/ui/Modifier;Lj0/i;Lf0/v0;ZLi3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v4, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const-wide/high16 v12, 0x3ff8000000000000L    # 1.5

    double-to-float v4, v12

    invoke-static {}, Lgb1/b0;->F0()Li2/t;

    move-result-object v7

    sget-object v12, Lkd1/w;->a:Lkd1/w;

    invoke-virtual {v12}, Lkd1/w;->a()Lk91/a;

    move-result-object v13

    invoke-virtual {v13}, Lk91/a;->c()Lt0/i;

    move-result-object v13

    invoke-static {v4, v3, v7, v13}, Lge3/g;->i(FLandroidx/compose/ui/Modifier;Li2/t;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v12}, Lkd1/w;->a()Lk91/a;

    move-result-object v3

    invoke-virtual {v3}, Lk91/a;->c()Lt0/i;

    move-result-object v3

    int-to-float v7, v8

    new-instance v8, Lg40/f0;

    const/4 v12, 0x4

    invoke-direct {v8, v0, v5, v6, v12}, Lg40/f0;-><init>(Ljava/lang/Object;JI)V

    const v5, -0x55fca796

    invoke-static {v5, v11, v8}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v5

    const/high16 v12, 0x1b0000

    const/16 v13, 0x18

    const/4 v8, 0x0

    move-wide/from16 v19, v9

    move v9, v7

    move-wide/from16 v6, v19

    move-object v10, v5

    move-object v5, v3

    invoke-static/range {v4 .. v13}, Le93/b;->b(Landroidx/compose/ui/Modifier;Li2/a1;JLf0/t;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    goto :goto_9

    :cond_e
    invoke-virtual {v11}, Lp1/q;->X()V

    :goto_9
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v3

    if-eqz v3, :cond_f

    new-instance v4, Lig0/d;

    const/16 v5, 0xc

    invoke-direct {v4, v0, v1, v2, v5}, Lig0/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v4, v3, Lp1/v1;->d:Lc93/m;

    :cond_f
    return-void
.end method

.method private static final e(Lp1/t2;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")Z"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final f(Lkotlin/jvm/functions/Function1;Lgr1/i;)Ll83/a0;
    .locals 0

    invoke-virtual {p1}, Lgr1/i;->c()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lgr1/i;JLandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 36

    and-int/lit8 v0, p4, 0x3

    const/4 v2, 0x1

    const/4 v3, 0x2

    if-eq v0, v3, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v4, p4, 0x1

    move-object/from16 v8, p3

    check-cast v8, Lp1/q;

    invoke-virtual {v8, v4, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_9

    sget-object v0, Ll0/a1;->x:Ll0/a1;

    sget-object v4, Lb2/t;->w:Lb2/t;

    invoke-static {v4, v0}, Landroidx/compose/foundation/layout/a;->j(Landroidx/compose/ui/Modifier;Ll0/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    int-to-float v0, v3

    const/16 v5, 0x8

    int-to-float v5, v5

    mul-float v11, v0, v5

    const/4 v10, 0x0

    const/4 v14, 0x1

    move v12, v11

    move v13, v11

    invoke-static/range {v9 .. v14}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v5, Ll0/m;->g:Ll0/h;

    sget-object v6, Lb2/e;->K:Lb2/l;

    const/16 v7, 0x36

    invoke-static {v5, v6, v8, v7}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v5

    iget-wide v6, v8, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v8, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v9, v8, Lp1/q;->S:Z

    if-eqz v9, :cond_1

    invoke-virtual {v8, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_1
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v8, v12, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v13, La3/k;->f:La3/i;

    invoke-static {v8, v13, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v14, La3/k;->j:La3/i;

    iget-boolean v5, v8, Lp1/q;->S:Z

    if-nez v5, :cond_2

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    :cond_2
    invoke-static {v6, v8, v6, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v8, v5, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object v0, v5

    invoke-virtual/range {p0 .. p0}, Lgr1/i;->b()Lkd1/o;

    move-result-object v5

    sget v9, Lkd1/o;->a:I

    const/4 v10, 0x3

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v5 .. v10}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v5

    sget-wide v6, Li2/x;->n:J

    move-object v9, v13

    const/4 v13, 0x0

    move-object v10, v14

    const/16 v14, 0xe

    move-object/from16 v16, v10

    move v10, v11

    const/4 v11, 0x0

    move-object/from16 v17, v12

    const/4 v12, 0x0

    move-object v1, v9

    move-object/from16 v31, v16

    move-object v9, v4

    move-object/from16 v4, v17

    invoke-static/range {v9 .. v14}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v11

    move-object v14, v9

    move v13, v10

    const/4 v9, 0x6

    int-to-float v9, v9

    const/4 v10, 0x4

    int-to-float v10, v10

    mul-float/2addr v9, v10

    invoke-static {v9, v11}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    const/16 v11, 0xdb0

    const/4 v12, 0x0

    move-object v10, v8

    move-wide/from16 v34, v6

    move-object v7, v9

    move-wide/from16 v8, v34

    const/4 v6, 0x0

    invoke-static/range {v5 .. v12}, Lg1/f3;->a(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    move-wide/from16 v32, v8

    move-object v8, v10

    sget-object v5, Lb2/e;->M:Lb2/k;

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {v6, v14}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/4 v9, 0x0

    invoke-static {v7, v13, v9, v3}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    float-to-double v9, v6

    const-wide/16 v11, 0x0

    cmpl-double v7, v9, v11

    if-lez v7, :cond_4

    goto :goto_2

    :cond_4
    const-string v7, "invalid weight; must be greater than zero"

    invoke-static {v7}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_2
    invoke-static {v3, v2, v6}, Ldc/b;->g(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v6, Ll0/m;->c:Ll0/g;

    const/16 v7, 0x30

    invoke-static {v6, v5, v8, v7}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v5

    iget-wide v6, v8, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v8, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v9, v8, Lp1/q;->S:Z

    if-eqz v9, :cond_5

    invoke-virtual {v8, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_5
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_3
    invoke-static {v8, v4, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v8, v1, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v8, Lp1/q;->S:Z

    if-nez v1, :cond_6

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    :cond_6
    move-object/from16 v10, v31

    invoke-static {v6, v8, v6, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_7
    invoke-static {v8, v0, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lgr1/i;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    sget v1, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v0, v8, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    sget-object v0, Lx81/d;->a:Lx81/d;

    sget v1, Lx81/d;->b:I

    invoke-virtual {v0, v8, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->r()Lb91/a;

    move-result-object v25

    sget v0, Lb91/a;->d:I

    shl-int/lit8 v29, v0, 0x12

    const v30, 0x2fffa

    const/4 v6, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object v7, v14

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    move-object v0, v7

    move-object/from16 v27, v8

    move-wide/from16 v7, p1

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v8, v27

    invoke-virtual {v8, v2}, Lp1/q;->q(Z)V

    invoke-virtual/range {p0 .. p0}, Lgr1/i;->a()Ljava/lang/Boolean;

    move-result-object v1

    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    const v1, -0x1e3ca41d

    invoke-virtual {v8, v1}, Lp1/q;->e0(I)V

    new-instance v5, Lkd1/o$a;

    sget v1, Lzq1/a;->a:I

    invoke-direct {v5, v1}, Lkd1/o$a;-><init>(I)V

    sget v9, Lkd1/o$a;->c:I

    const/4 v10, 0x3

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v5 .. v10}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v1

    const/4 v3, 0x0

    invoke-virtual {v8, v3}, Lp1/q;->q(Z)V

    :goto_4
    move-object v5, v1

    goto :goto_5

    :cond_8
    const v1, -0x1e3ab8b7

    invoke-virtual {v8, v1}, Lp1/q;->e0(I)V

    new-instance v5, Lkd1/o$a;

    sget v1, Lzq1/a;->d:I

    invoke-direct {v5, v1}, Lkd1/o$a;-><init>(I)V

    sget v9, Lkd1/o$a;->c:I

    const/4 v10, 0x3

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v5 .. v10}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v1

    const/4 v3, 0x0

    invoke-virtual {v8, v3}, Lp1/q;->q(Z)V

    goto :goto_4

    :goto_5
    const/16 v11, 0xdb0

    const/4 v12, 0x0

    const/4 v6, 0x0

    move-object v7, v0

    move-object v10, v8

    move-wide/from16 v8, v32

    invoke-static/range {v5 .. v12}, Lg1/f3;->a(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    move-object v8, v10

    invoke-virtual {v8, v2}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_9
    invoke-virtual {v8}, Lp1/q;->X()V

    :goto_6
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final h(Lgr1/i;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Ljr1/a;->d(Lgr1/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
