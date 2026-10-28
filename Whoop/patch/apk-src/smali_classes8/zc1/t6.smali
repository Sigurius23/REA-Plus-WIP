.class public abstract Lzc1/t6;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Ll83/a0;",
        "e",
        "(Landroidx/compose/runtime/Composer;I)V",
        "design-showcase_release"
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

    invoke-static {p0}, Lzc1/t6;->f(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/t6;->g(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/t6;->h(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lzc1/t6;->i(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Landroidx/compose/runtime/Composer;I)V
    .locals 27

    move/from16 v0, p1

    move-object/from16 v1, p0

    check-cast v1, Lp1/q;

    const v2, -0x48ea0eb8

    invoke-virtual {v1, v2}, Lp1/q;->g0(I)Lp1/q;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v0, :cond_0

    move v4, v3

    goto :goto_0

    :cond_0
    move v4, v2

    :goto_0
    and-int/lit8 v5, v0, 0x1

    invoke-virtual {v1, v5, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_7

    const/high16 v4, 0x3f800000    # 1.0f

    sget-object v5, Lb2/t;->w:Lb2/t;

    invoke-static {v4, v5}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    int-to-float v6, v3

    const/16 v7, 0x8

    int-to-float v7, v7

    mul-float/2addr v7, v6

    invoke-static {v7, v4}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v7, Ll0/m;->c:Ll0/g;

    sget-object v8, Lb2/e;->M:Lb2/k;

    invoke-static {v7, v8, v1, v2}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    iget-wide v7, v1, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v1}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v1, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v1}, Lp1/q;->i0()V

    iget-boolean v10, v1, Lp1/q;->S:Z

    if-eqz v10, :cond_1

    invoke-virtual {v1, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lp1/q;->s0()V

    :goto_1
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v1, v9, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v1, v2, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v8, v1, Lp1/q;->S:Z

    if-nez v8, :cond_2

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_3

    :cond_2
    invoke-static {v7, v1, v7, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v1, v2, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-string v2, "Recovery Impact Empty State with Count"

    const/4 v4, 0x6

    invoke-static {v2, v1, v4}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    const/4 v7, 0x4

    int-to-float v7, v7

    mul-float/2addr v6, v7

    invoke-static {v6, v5}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-static {v1, v8}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    new-instance v8, Lc41/t4;

    invoke-direct {v8}, Lc41/t4;-><init>()V

    new-instance v9, Lc41/s4;

    sget v12, Lgy0/a;->N:I

    sget-object v13, Ly81/f;->RECOVERY:Ly81/f;

    sget-object v14, Ly81/f;->NEUTRAL_15:Ly81/f;

    const/16 v17, 0x40

    const/16 v18, 0x0

    const/4 v10, 0x3

    const/4 v11, 0x5

    const/4 v15, 0x1

    const/16 v16, 0x0

    invoke-direct/range {v9 .. v18}, Lc41/s4;-><init>(IIILy81/f;Ly81/f;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    sget-object v11, Lp1/l;->a:Lp1/v0;

    if-ne v10, v11, :cond_4

    new-instance v10, Lzc1/t5;

    const/16 v12, 0x8

    invoke-direct {v10, v12}, Lzc1/t5;-><init>(I)V

    invoke-virtual {v1, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v10, Lkotlin/jvm/functions/Function1;

    sget v12, Lc41/s4;->h:I

    or-int/lit8 v12, v12, 0x30

    sget v13, Lc41/t4;->a:I

    shl-int/2addr v13, v4

    or-int/2addr v12, v13

    invoke-virtual {v8, v9, v10, v1, v12}, Lc41/t4;->Compose(Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    const/4 v8, 0x2

    int-to-float v8, v8

    mul-float/2addr v8, v7

    invoke-static {v8, v5}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-static {v1, v7}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-static {v2, v1, v4}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v6, v5}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v1, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    new-instance v2, Lc41/t4;

    invoke-direct {v2}, Lc41/t4;-><init>()V

    new-instance v13, Lc41/s4;

    sget v16, Lgy0/a;->g4:I

    sget-object v17, Ly81/f;->BRAND_WHITE:Ly81/f;

    sget-object v18, Ly81/f;->WHITE_10:Ly81/f;

    const/16 v21, 0x40

    const/16 v22, 0x0

    const/4 v14, 0x4

    const/4 v15, 0x5

    const/16 v19, 0x1

    const/16 v20, 0x0

    invoke-direct/range {v13 .. v22}, Lc41/s4;-><init>(IIILy81/f;Ly81/f;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v11, :cond_5

    new-instance v7, Lzc1/t5;

    const/16 v9, 0x9

    invoke-direct {v7, v9}, Lzc1/t5;-><init>(I)V

    invoke-virtual {v1, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v7, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v2, v13, v7, v1, v12}, Lc41/t4;->Compose(Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v8, v5}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v1, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const-string v2, "Recovery Impact Empty State Without Count"

    invoke-static {v2, v1, v4}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v6, v5}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v1, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    new-instance v2, Lc41/t4;

    invoke-direct {v2}, Lc41/t4;-><init>()V

    move-object/from16 v21, v17

    new-instance v17, Lc41/s4;

    sget v20, Lgy0/a;->g4:I

    const/16 v25, 0x40

    const/16 v26, 0x0

    move-object/from16 v22, v18

    const/16 v18, 0x7

    const/16 v19, 0x7

    const/16 v23, 0x0

    const/16 v24, 0x0

    invoke-direct/range {v17 .. v26}, Lc41/s4;-><init>(IIILy81/f;Ly81/f;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v4, v17

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v11, :cond_6

    new-instance v5, Lzc1/t5;

    const/16 v6, 0xa

    invoke-direct {v5, v6}, Lzc1/t5;-><init>(I)V

    invoke-virtual {v1, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v5, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v2, v4, v5, v1, v12}, Lc41/t4;->Compose(Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v1, v3}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_7
    invoke-virtual {v1}, Lp1/q;->X()V

    :goto_2
    invoke-virtual {v1}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_8

    new-instance v2, Lzc1/g6;

    const/16 v3, 0x8

    invoke-direct {v2, v0, v3}, Lzc1/g6;-><init>(II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_8
    return-void
.end method

.method private static final f(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lzc1/t6;->e(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
