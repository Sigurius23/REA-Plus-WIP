.class public abstract Lrq2/n0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lrq2/k0;",
        "step",
        "",
        "isCurrentStep",
        "Ll83/a0;",
        "c",
        "(Lrq2/k0;ZLandroidx/compose/runtime/Composer;I)V",
        "user-journey_release"
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
.method public static synthetic a(Lrq2/k0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lrq2/n0;->d(Lrq2/k0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lrq2/k0;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lrq2/n0;->e(Lrq2/k0;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lrq2/k0;ZLandroidx/compose/runtime/Composer;I)V
    .locals 9

    const-string v0, "step"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v4, p2

    check-cast v4, Lp1/q;

    const p2, 0x77a98b61

    invoke-virtual {v4, p2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p2, p3, 0x6

    if-nez p2, :cond_2

    and-int/lit8 p2, p3, 0x8

    if-nez p2, :cond_0

    invoke-virtual {v4, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p2

    goto :goto_0

    :cond_0
    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p2

    :goto_0
    if-eqz p2, :cond_1

    const/4 p2, 0x4

    goto :goto_1

    :cond_1
    const/4 p2, 0x2

    :goto_1
    or-int/2addr p2, p3

    goto :goto_2

    :cond_2
    move p2, p3

    :goto_2
    and-int/lit8 v0, p3, 0x30

    if-nez v0, :cond_4

    invoke-virtual {v4, p1}, Lp1/q;->h(Z)Z

    move-result v0

    if-eqz v0, :cond_3

    const/16 v0, 0x20

    goto :goto_3

    :cond_3
    const/16 v0, 0x10

    :goto_3
    or-int/2addr p2, v0

    :cond_4
    and-int/lit8 v0, p2, 0x13

    const/16 v1, 0x12

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-eq v0, v1, :cond_5

    move v0, v8

    goto :goto_4

    :cond_5
    move v0, v7

    :goto_4
    and-int/2addr p2, v8

    invoke-virtual {v4, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_b

    if-eqz p1, :cond_a

    const p2, 0x3b14c49a

    invoke-virtual {v4, p2}, Lp1/q;->e0(I)V

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne p2, v0, :cond_6

    new-instance p2, Ld0/q0;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {p2, v0}, Ld0/q0;-><init>(Ljava/lang/Object;)V

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p2, v0}, Ld0/q0;->I0(Ljava/lang/Boolean;)V

    invoke-virtual {v4, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    move-object v1, p2

    check-cast v1, Ld0/q0;

    sget-object p2, Lb2/t;->w:Lb2/t;

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0, p2}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p2

    const-wide/high16 v2, 0x4004000000000000L    # 2.5

    double-to-float v0, v2

    const/16 v2, 0x8

    int-to-float v2, v2

    mul-float/2addr v0, v2

    const-wide/high16 v5, 0x4011000000000000L    # 4.25

    double-to-float v3, v5

    mul-float/2addr v3, v2

    invoke-static {p2, v0, v3}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object p2

    sget-object v0, Ll0/m;->d:Ll0/g;

    sget-object v2, Lb2/e;->M:Lb2/k;

    const/4 v3, 0x6

    invoke-static {v0, v2, v4, v3}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v0

    iget-wide v2, v4, Lp1/q;->T:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    invoke-static {v4, p2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p2

    sget-object v5, La3/l;->a:La3/k;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, La3/k;->b:La3/j;

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v6, v4, Lp1/q;->S:Z

    if-eqz v6, :cond_7

    invoke-virtual {v4, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_7
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_5
    sget-object v5, La3/k;->g:La3/i;

    invoke-static {v4, v5, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {v4, v0, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->j:La3/i;

    iget-boolean v3, v4, Lp1/q;->S:Z

    if-nez v3, :cond_8

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_9

    :cond_8
    invoke-static {v2, v4, v2, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v4, v0, p2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance p2, Lr12/a;

    const/16 v0, 0x9

    invoke-direct {p2, p0, v0}, Lr12/a;-><init>(Ljava/lang/Object;I)V

    const v0, 0x51bc2ba0

    invoke-static {v0, v4, p2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v3

    const/16 v5, 0x180

    const/4 v6, 0x2

    const/4 v2, 0x0

    invoke-static/range {v1 .. v6}, Lkr2/b;->k(Ld0/q0;Landroidx/compose/ui/Modifier;Lc93/m;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v4, v8}, Lp1/q;->q(Z)V

    invoke-virtual {v4, v7}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_a
    const p2, 0x3b227a81

    invoke-virtual {v4, p2}, Lp1/q;->e0(I)V

    invoke-virtual {v4, v7}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_b
    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_6
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_c

    new-instance v0, Lrq2/l0;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p1, p3, v1}, Lrq2/l0;-><init>(Lrq2/k0;ZII)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_c
    return-void
.end method

.method private static final d(Lrq2/k0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 28

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p2, 0x1

    move-object/from16 v2, p1

    check-cast v2, Lp1/q;

    invoke-virtual {v2, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lb2/t;->w:Lb2/t;

    invoke-static {}, Ljr2/a;->e()Li2/t;

    move-result-object v1

    invoke-static {v0, v1}, Lny0/u;->o(Landroidx/compose/ui/Modifier;Li2/t;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const-string v1, "ShortTextV2Text"

    invoke-static {v0, v1}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, Lrq2/k0;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    sget v1, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v0, v2, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Ljr2/c;->e()Lb91/a;

    move-result-object v22

    sget-object v1, Lx81/d;->a:Lx81/d;

    sget v4, Lx81/d;->b:I

    invoke-virtual {v1, v2, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->y()J

    move-result-wide v4

    sget v1, Lb91/a;->d:I

    shl-int/lit8 v26, v1, 0x12

    const v27, 0x2fff8

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    move-object/from16 v24, v2

    move-object v2, v0

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    goto :goto_1

    :cond_1
    move-object/from16 v24, v2

    invoke-virtual/range {v24 .. v24}, Lp1/q;->X()V

    :goto_1
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final e(Lrq2/k0;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lrq2/n0;->c(Lrq2/k0;ZLandroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
