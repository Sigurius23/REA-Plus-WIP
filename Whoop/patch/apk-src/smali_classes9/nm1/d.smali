.class public abstract Lnm1/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lnm1/e;",
        "viewState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "c",
        "(Lnm1/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "home_release"
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
.method public static synthetic a(Lnm1/e;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lnm1/d;->e(Lnm1/e;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Lnm1/e;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lnm1/d;->d(Lkotlin/jvm/functions/Function1;Lnm1/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lnm1/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnm1/e;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    const-string v3, "viewState"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "onViewEvent"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v3, p2

    check-cast v3, Lp1/q;

    const v4, -0xde26af

    invoke-virtual {v3, v4}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v4, v2, 0x6

    const/4 v5, 0x4

    if-nez v4, :cond_2

    and-int/lit8 v4, v2, 0x8

    if-nez v4, :cond_0

    invoke-virtual {v3, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    goto :goto_0

    :cond_0
    invoke-virtual {v3, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    :goto_0
    if-eqz v4, :cond_1

    move v4, v5

    goto :goto_1

    :cond_1
    const/4 v4, 0x2

    :goto_1
    or-int/2addr v4, v2

    goto :goto_2

    :cond_2
    move v4, v2

    :goto_2
    and-int/lit8 v6, v2, 0x30

    const/16 v7, 0x20

    if-nez v6, :cond_4

    invoke-virtual {v3, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    move v6, v7

    goto :goto_3

    :cond_3
    const/16 v6, 0x10

    :goto_3
    or-int/2addr v4, v6

    :cond_4
    and-int/lit8 v6, v4, 0x13

    const/16 v8, 0x12

    const/4 v9, 0x1

    const/4 v10, 0x0

    if-eq v6, v8, :cond_5

    move v6, v9

    goto :goto_4

    :cond_5
    move v6, v10

    :goto_4
    and-int/lit8 v8, v4, 0x1

    invoke-virtual {v3, v8, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_e

    const/16 v6, 0xc

    int-to-float v6, v6

    int-to-float v8, v5

    mul-float/2addr v6, v8

    sget-object v11, Lb2/t;->w:Lb2/t;

    invoke-static {v6, v11}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/high16 v11, 0x3f800000    # 1.0f

    invoke-static {v6, v10, v11}, Landroidx/compose/foundation/layout/a;->f(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v12

    and-int/lit8 v6, v4, 0x70

    if-ne v6, v7, :cond_6

    move v6, v9

    goto :goto_5

    :cond_6
    move v6, v10

    :goto_5
    and-int/lit8 v7, v4, 0xe

    if-eq v7, v5, :cond_8

    and-int/lit8 v4, v4, 0x8

    if-eqz v4, :cond_7

    invoke-virtual {v3, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_7

    goto :goto_6

    :cond_7
    move v4, v10

    goto :goto_7

    :cond_8
    :goto_6
    move v4, v9

    :goto_7
    or-int/2addr v4, v6

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_9

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-ne v5, v4, :cond_a

    :cond_9
    new-instance v5, Lmi2/o;

    const/16 v4, 0x9

    invoke-direct {v5, v4, v1, v0}, Lmi2/o;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v3, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    move-object/from16 v16, v5

    check-cast v16, Lc93/a;

    const/16 v17, 0xf

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v12 .. v17}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v5, Lx81/d;->a:Lx81/d;

    sget v6, Lx81/d;->b:I

    invoke-virtual {v5, v3, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->W0()J

    move-result-wide v5

    const/4 v7, 0x3

    int-to-float v7, v7

    invoke-static {v4, v7, v8, v5, v6}, Lr80/c;->e(Landroidx/compose/ui/Modifier;FFJ)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v5, Lb2/e;->E:Lb2/m;

    invoke-static {v5, v10}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v5

    iget-wide v6, v3, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v3}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v3, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v3}, Lp1/q;->i0()V

    iget-boolean v11, v3, Lp1/q;->S:Z

    if-eqz v11, :cond_b

    invoke-virtual {v3, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_b
    invoke-virtual {v3}, Lp1/q;->s0()V

    :goto_8
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v3, v8, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v3, v5, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v7, v3, Lp1/q;->S:Z

    if-nez v7, :cond_c

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_d

    :cond_c
    invoke-static {v6, v3, v6, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_d
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v3, v5, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lnm1/e;->b()Lgz0/m0;

    move-result-object v4

    invoke-static {v4, v3, v10, v10}, Lo01/d;->c(Lgz0/m0;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v3, v9}, Lp1/q;->q(Z)V

    goto :goto_9

    :cond_e
    invoke-virtual {v3}, Lp1/q;->X()V

    :goto_9
    invoke-virtual {v3}, Lp1/q;->u()Lp1/v1;

    move-result-object v3

    if-eqz v3, :cond_f

    new-instance v4, Lmx1/i;

    const/16 v5, 0x8

    invoke-direct {v4, v0, v1, v2, v5}, Lmx1/i;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v4, v3, Lp1/v1;->d:Lc93/m;

    :cond_f
    return-void
.end method

.method private static final d(Lkotlin/jvm/functions/Function1;Lnm1/e;)Ll83/a0;
    .locals 0

    invoke-virtual {p1}, Lnm1/e;->a()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Lnm1/e;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lnm1/d;->c(Lnm1/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
