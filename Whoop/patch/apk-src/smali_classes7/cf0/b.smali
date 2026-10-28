.class public abstract Lcf0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a!\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a!\u0010\t\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0008\u001a\u00020\u0007H\u0003\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lcf0/c;",
        "state",
        "Ll83/a0;",
        "d",
        "(Landroidx/compose/ui/Modifier;Lcf0/c;Landroidx/compose/runtime/Composer;II)V",
        "Lcf0/c$a;",
        "viewState",
        "g",
        "(Landroidx/compose/ui/Modifier;Lcf0/c$a;Landroidx/compose/runtime/Composer;II)V",
        "advanced-labs_release"
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
.method public static synthetic a(Landroidx/compose/ui/Modifier;Lcf0/c;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lcf0/b;->f(Landroidx/compose/ui/Modifier;Lcf0/c;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcf0/c;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcf0/b;->e(Lcf0/c;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/compose/ui/Modifier;Lcf0/c$a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lcf0/b;->h(Landroidx/compose/ui/Modifier;Lcf0/c$a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Landroidx/compose/ui/Modifier;Lcf0/c;Landroidx/compose/runtime/Composer;II)V
    .locals 15

    move-object/from16 v2, p1

    const-string v0, "state"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v12, p2

    check-cast v12, Lp1/q;

    const v0, -0x44c9d452

    invoke-virtual {v12, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p4, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v1, p3, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v1, p3, 0x6

    if-nez v1, :cond_2

    invoke-virtual {v12, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x4

    goto :goto_0

    :cond_1
    const/4 v1, 0x2

    :goto_0
    or-int v1, p3, v1

    goto :goto_1

    :cond_2
    move/from16 v1, p3

    :goto_1
    and-int/lit8 v3, p3, 0x30

    if-nez v3, :cond_4

    invoke-virtual {v12, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    const/16 v3, 0x20

    goto :goto_2

    :cond_3
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v1, v3

    :cond_4
    and-int/lit8 v3, v1, 0x13

    const/16 v4, 0x12

    const/4 v5, 0x1

    if-eq v3, v4, :cond_5

    move v3, v5

    goto :goto_3

    :cond_5
    const/4 v3, 0x0

    :goto_3
    and-int/2addr v1, v5

    invoke-virtual {v12, v1, v3}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_7

    if-eqz v0, :cond_6

    sget-object p0, Lb2/t;->w:Lb2/t;

    :cond_6
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0, p0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-wide v0, Li2/x;->m:J

    sget-object v4, Lkd1/w;->a:Lkd1/w;

    invoke-virtual {v4}, Lkd1/w;->a()Lk91/a;

    move-result-object v4

    invoke-virtual {v4}, Lk91/a;->c()Lt0/i;

    move-result-object v7

    new-instance v8, Lf0/t;

    int-to-float v4, v5

    invoke-static {}, Lgb1/b0;->L0()Li2/t;

    move-result-object v5

    invoke-direct {v8, v4, v5}, Lf0/t;-><init>(FLi2/t;)V

    new-instance v4, La80/c;

    const/16 v5, 0x1d

    invoke-direct {v4, v2, v5}, La80/c;-><init>(Ljava/lang/Object;I)V

    const v5, 0x3c0cf73e

    invoke-static {v5, v12, v4}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v11

    const v13, 0xc00180

    const/16 v14, 0x62

    const/4 v4, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-wide v5, v0

    invoke-static/range {v3 .. v14}, Lrz0/e;->j(Landroidx/compose/ui/Modifier;Lrz0/f;JLt0/i;Lf0/t;Lrz0/a;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    :goto_4
    move-object v1, p0

    goto :goto_5

    :cond_7
    invoke-virtual {v12}, Lp1/q;->X()V

    goto :goto_4

    :goto_5
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_8

    new-instance v0, La01/i;

    const/16 v5, 0x17

    move/from16 v3, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, La01/i;-><init>(Landroidx/compose/ui/Modifier;Ljava/lang/Object;III)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_8
    return-void
.end method

.method private static final e(Lcf0/c;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 19

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

    move-object/from16 v15, p1

    check-cast v15, Lp1/q;

    invoke-virtual {v15, v4, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-static {}, Lgb1/b0;->K0()Li2/t;

    move-result-object v0

    sget-object v4, Lkd1/w;->a:Lkd1/w;

    invoke-virtual {v4}, Lkd1/w;->a()Lk91/a;

    move-result-object v4

    invoke-virtual {v4}, Lk91/a;->c()Lt0/i;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v6, 0x4

    sget-object v7, Lb2/t;->w:Lb2/t;

    invoke-static {v7, v0, v4, v5, v6}, Landroidx/compose/foundation/a;->b(Landroidx/compose/ui/Modifier;Li2/t;Li2/a1;FI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    int-to-float v3, v3

    const/16 v4, 0x8

    int-to-float v4, v4

    mul-float/2addr v3, v4

    invoke-static {v3, v0}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const-wide/high16 v5, 0x4004000000000000L    # 2.5

    double-to-float v3, v5

    mul-float/2addr v3, v4

    invoke-static {v3}, Ll0/m;->i(F)Ll0/k;

    move-result-object v3

    sget-object v4, Lb2/e;->M:Lb2/k;

    const/4 v5, 0x6

    invoke-static {v3, v4, v15, v5}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v4, v15, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v15}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v15, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v15}, Lp1/q;->i0()V

    iget-boolean v7, v15, Lp1/q;->S:Z

    if-eqz v7, :cond_1

    invoke-virtual {v15, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v15}, Lp1/q;->s0()V

    :goto_1
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v15, v6, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v15, v3, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v5, v15, Lp1/q;->S:Z

    if-nez v5, :cond_2

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    :cond_2
    invoke-static {v4, v15, v4, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v15, v3, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v0, 0x5c9cc9eb

    invoke-virtual {v15, v0}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lcf0/c;->a()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move v3, v1

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    add-int/lit8 v18, v3, 0x1

    const/4 v5, 0x0

    if-ltz v3, :cond_5

    check-cast v4, Lcf0/c$a;

    invoke-static {v5, v4, v15, v1, v2}, Lcf0/b;->g(Landroidx/compose/ui/Modifier;Lcf0/c$a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual/range {p0 .. p0}, Lcf0/c;->a()Ljava/util/List;

    move-result-object v4

    invoke-static {v4}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v4

    if-ge v3, v4, :cond_4

    const v3, -0x2df8d04c

    invoke-virtual {v15, v3}, Lp1/q;->e0(I)V

    const/16 v16, 0x0

    const/16 v17, 0xff

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    invoke-static/range {v5 .. v17}, Lhy0/i2;->j(Landroidx/compose/ui/Modifier;Lhy0/g;Lhy0/f;Lcom/whoop/design/util/TextResource;Ljava/lang/Float;JJLb91/c;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v15, v1}, Lp1/q;->q(Z)V

    goto :goto_3

    :cond_4
    const v3, -0x2df80596

    invoke-virtual {v15, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v15, v1}, Lp1/q;->q(Z)V

    :goto_3
    move/from16 v3, v18

    goto :goto_2

    :cond_5
    invoke-static {}, Lwb3/f;->d0()V

    throw v5

    :cond_6
    invoke-virtual {v15, v1}, Lp1/q;->q(Z)V

    invoke-virtual {v15, v2}, Lp1/q;->q(Z)V

    goto :goto_4

    :cond_7
    invoke-virtual {v15}, Lp1/q;->X()V

    :goto_4
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final f(Landroidx/compose/ui/Modifier;Lcf0/c;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lcf0/b;->d(Landroidx/compose/ui/Modifier;Lcf0/c;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Landroidx/compose/ui/Modifier;Lcf0/c$a;Landroidx/compose/runtime/Composer;II)V
    .locals 28

    move-object/from16 v5, p2

    check-cast v5, Lp1/q;

    const v0, -0x2ca37595

    invoke-virtual {v5, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p4, 0x1

    const/4 v1, 0x4

    const/4 v8, 0x2

    if-eqz v0, :cond_0

    or-int/lit8 v2, p3, 0x6

    move v3, v2

    move-object/from16 v2, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v2, p3, 0x6

    if-nez v2, :cond_2

    move-object/from16 v2, p0

    invoke-virtual {v5, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    move v3, v1

    goto :goto_0

    :cond_1
    move v3, v8

    :goto_0
    or-int v3, p3, v3

    goto :goto_1

    :cond_2
    move-object/from16 v2, p0

    move/from16 v3, p3

    :goto_1
    and-int/lit8 v4, p3, 0x30

    move-object/from16 v9, p1

    if-nez v4, :cond_4

    invoke-virtual {v5, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    const/16 v4, 0x20

    goto :goto_2

    :cond_3
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v3, v4

    :cond_4
    and-int/lit8 v4, v3, 0x13

    const/16 v10, 0x12

    const/4 v11, 0x1

    if-eq v4, v10, :cond_5

    move v4, v11

    goto :goto_3

    :cond_5
    const/4 v4, 0x0

    :goto_3
    and-int/2addr v3, v11

    invoke-virtual {v5, v3, v4}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_b

    sget-object v12, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_6

    move-object v13, v12

    goto :goto_4

    :cond_6
    move-object v13, v2

    :goto_4
    const/high16 v14, 0x3f800000    # 1.0f

    invoke-static {v14, v13}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v2, Lb2/e;->K:Lb2/l;

    sget-object v3, Ll0/m;->a:Ll0/e;

    const/16 v4, 0x30

    invoke-static {v3, v2, v5, v4}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

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

    if-eqz v7, :cond_7

    invoke-virtual {v5, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_7
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_5
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v5, v6, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v5, v2, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v4, v5, Lp1/q;->S:Z

    if-nez v4, :cond_8

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_9

    :cond_8
    invoke-static {v3, v5, v3, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v5, v2, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v9}, Lcf0/c$a;->a()Lgz0/m0;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/m0;->toWhoopIcon()I

    move-result v0

    const/4 v2, 0x6

    invoke-static {v0, v5, v2}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v0

    sget-object v3, Ly81/f;->RECOVERY:Ly81/f;

    invoke-virtual {v3, v5, v2}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v3

    const/4 v2, 0x5

    int-to-float v2, v2

    int-to-float v1, v1

    mul-float/2addr v2, v1

    invoke-static {v2, v12}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/16 v6, 0x1b0

    const/4 v7, 0x0

    const/4 v1, 0x0

    invoke-static/range {v0 .. v7}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v9}, Lcf0/c$a;->b()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lx81/d;->a:Lx81/d;

    sget v2, Lx81/d;->b:I

    invoke-virtual {v1, v5, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->a()Lb91/a;

    move-result-object v20

    invoke-virtual {v1, v5, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->y()J

    move-result-wide v2

    int-to-float v1, v8

    const/16 v4, 0x8

    int-to-float v4, v4

    mul-float/2addr v1, v4

    const/16 v16, 0x0

    const/16 v17, 0xe

    move v4, v14

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object/from16 v26, v13

    move v13, v1

    invoke-static/range {v12 .. v17}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    float-to-double v6, v4

    const-wide/16 v12, 0x0

    cmpl-double v6, v6, v12

    if-lez v6, :cond_a

    goto :goto_6

    :cond_a
    const-string v6, "invalid weight; must be greater than zero"

    invoke-static {v6}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_6
    invoke-static {v1, v11, v4}, Ldc/b;->g(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget v4, Lb91/a;->d:I

    shl-int/lit8 v24, v4, 0x12

    const v25, 0x2fff8

    move-object/from16 v22, v5

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    move v12, v11

    const/4 v11, 0x0

    move v13, v12

    const/4 v12, 0x0

    move v15, v13

    const-wide/16 v13, 0x0

    move/from16 v16, v15

    const/4 v15, 0x0

    move/from16 v17, v16

    const/16 v16, 0x0

    move/from16 v18, v17

    const/16 v17, 0x0

    move/from16 v19, v18

    const/16 v18, 0x0

    move/from16 v21, v19

    const/16 v19, 0x0

    move/from16 v23, v21

    const/16 v21, 0x0

    move/from16 v27, v23

    const/16 v23, 0x0

    invoke-static/range {v0 .. v25}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v22

    const/4 v12, 0x1

    invoke-virtual {v5, v12}, Lp1/q;->q(Z)V

    move-object/from16 v10, v26

    goto :goto_7

    :cond_b
    invoke-virtual {v5}, Lp1/q;->X()V

    move-object v10, v2

    :goto_7
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_c

    new-instance v9, La01/i;

    const/16 v14, 0x18

    move-object/from16 v11, p1

    move/from16 v12, p3

    move/from16 v13, p4

    invoke-direct/range {v9 .. v14}, La01/i;-><init>(Landroidx/compose/ui/Modifier;Ljava/lang/Object;III)V

    iput-object v9, v0, Lp1/v1;->d:Lc93/m;

    :cond_c
    return-void
.end method

.method private static final h(Landroidx/compose/ui/Modifier;Lcf0/c$a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lcf0/b;->g(Landroidx/compose/ui/Modifier;Lcf0/c$a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
