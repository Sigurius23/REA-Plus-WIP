.class public abstract Lzc1/x3;
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

    invoke-static {p0}, Lzc1/x3;->h(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/x3;->f(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lzc1/x3;->i(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/x3;->g(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Landroidx/compose/runtime/Composer;I)V
    .locals 37

    move/from16 v0, p1

    const v1, 0x3f1c28f6    # 0.61f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    move-object/from16 v2, p0

    check-cast v2, Lp1/q;

    const v3, 0x69b34454

    invoke-virtual {v2, v3}, Lp1/q;->g0(I)Lp1/q;

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v0, :cond_0

    move v5, v4

    goto :goto_0

    :cond_0
    move v5, v3

    :goto_0
    and-int/lit8 v6, v0, 0x1

    invoke-virtual {v2, v6, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_7

    const/high16 v5, 0x3f800000    # 1.0f

    sget-object v6, Lb2/t;->w:Lb2/t;

    invoke-static {v5, v6}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    int-to-float v7, v4

    const/16 v8, 0x8

    int-to-float v8, v8

    mul-float/2addr v8, v7

    invoke-static {v8, v5}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v8, Ll0/m;->c:Ll0/g;

    sget-object v9, Lb2/e;->M:Lb2/k;

    invoke-static {v8, v9, v2, v3}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v8, v2, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v2}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v2, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v10, La3/l;->a:La3/k;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v2}, Lp1/q;->i0()V

    iget-boolean v11, v2, Lp1/q;->S:Z

    if-eqz v11, :cond_1

    invoke-virtual {v2, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lp1/q;->s0()V

    :goto_1
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v2, v10, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v2, v3, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v9, v2, Lp1/q;->S:Z

    if-nez v9, :cond_2

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_3

    :cond_2
    invoke-static {v8, v2, v8, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v2, v3, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-string v3, "Impact Activity Card Lock State"

    const/4 v5, 0x6

    invoke-static {v3, v2, v5}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    const/4 v3, 0x4

    int-to-float v3, v3

    mul-float/2addr v7, v3

    invoke-static {v7, v6}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-static {v2, v8}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    new-instance v8, Lt71/r;

    invoke-direct {v8}, Lt71/r;-><init>()V

    const-string v9, "IMPACT ON RECOVERY"

    invoke-static {v9}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v11

    const-string v19, "VIEW MORE IMPACTS"

    invoke-static/range {v19 .. v19}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v16

    const-string v10, "Log your Recovery activity at least 5 times across different days to unlock analysis."

    invoke-static {v10}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    new-instance v15, Lt71/g$a;

    const-string v10, "--"

    invoke-static {v10}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v10

    sget-object v12, Ly81/f;->WHITE_30:Ly81/f;

    new-instance v20, Lc41/s4;

    sget v23, Lgy0/a;->N:I

    sget-object v24, Ly81/f;->RECOVERY:Ly81/f;

    sget-object v25, Ly81/f;->NEUTRAL_15:Ly81/f;

    const/16 v28, 0x40

    const/16 v29, 0x0

    const/16 v21, 0x3

    const/16 v22, 0x5

    const/16 v26, 0x1

    const/16 v27, 0x0

    invoke-direct/range {v20 .. v29}, Lc41/s4;-><init>(IIILy81/f;Ly81/f;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v14, v20

    new-instance v20, Lc41/s4;

    sget v23, Lgy0/a;->g4:I

    sget-object v24, Ly81/f;->BRAND_WHITE:Ly81/f;

    sget-object v25, Ly81/f;->WHITE_10:Ly81/f;

    const/16 v21, 0x4

    invoke-direct/range {v20 .. v29}, Lc41/s4;-><init>(IIILy81/f;Ly81/f;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v4, v20

    filled-new-array {v14, v4}, [Lc41/s4;

    move-result-object v4

    invoke-static {v4}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    invoke-direct {v15, v10, v12, v4}, Lt71/g$a;-><init>(Lcom/whoop/design/util/TextResource;Ly81/f;Ljava/util/List;)V

    new-instance v10, Lt71/f;

    const/16 v17, 0xa

    const/16 v18, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v10 .. v18}, Lt71/f;-><init>(Lcom/whoop/design/util/TextResource;Ly81/f;Lcom/whoop/design/util/TextResource;Ly81/f;Lt71/g;Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    sget-object v11, Lp1/l;->a:Lp1/v0;

    if-ne v4, v11, :cond_4

    new-instance v4, Lzc1/w1;

    const/4 v12, 0x7

    invoke-direct {v4, v12}, Lzc1/w1;-><init>(I)V

    invoke-virtual {v2, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v4, Lkotlin/jvm/functions/Function1;

    sget v12, Lt71/f;->g:I

    or-int/lit8 v12, v12, 0x30

    sget v13, Lt71/r;->a:I

    shl-int/2addr v13, v5

    or-int/2addr v12, v13

    invoke-virtual {v8, v10, v4, v2, v12}, Lt71/r;->Compose(Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    const/4 v4, 0x2

    int-to-float v4, v4

    invoke-static {v4, v3, v6, v2}, Lih0/d0;->u(FFLb2/t;Lp1/q;)V

    const-string v3, "Impact Activity Card Unlock State Positive"

    invoke-static {v3, v2, v5}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v7, v6}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v2, v3}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    new-instance v3, Lt71/r;

    invoke-direct {v3}, Lt71/r;-><init>()V

    invoke-static {v9}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v21

    const-string v4, "After accounting for other influences, Meditation has a -11% impact on your Recovery."

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v23

    invoke-static/range {v19 .. v19}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v26

    const-string v8, "+21"

    invoke-static {v8}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    new-instance v27, Ly11/r;

    sget-object v32, Ly81/f;->ACCENT_POSITIVE_TREND:Ly81/f;

    new-instance v10, Ly11/t;

    const-string v13, "+8%"

    invoke-static {v13}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v14

    const-string v15, "WHOOP Average"

    invoke-static {v15}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-direct {v10, v1, v14, v5}, Ly11/t;-><init>(Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    const/16 v35, 0x23

    const/16 v36, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/high16 v30, 0x3f000000    # 0.5f

    const v31, 0x3f4a3d71    # 0.79f

    const/16 v33, 0x0

    move-object/from16 v34, v10

    invoke-direct/range {v27 .. v36}, Ly11/r;-><init>(FLy81/f;FFLy81/f;Lcom/whoop/design/util/TextResource;Ly11/t;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v5, v27

    move-object/from16 v10, v32

    new-instance v14, Lt71/g$b;

    invoke-direct {v14, v8, v10, v5}, Lt71/g$b;-><init>(Lcom/whoop/design/util/TextResource;Ly81/f;Ly11/r;)V

    new-instance v20, Lt71/f;

    const/16 v27, 0xa

    const/16 v28, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    move-object/from16 v25, v14

    invoke-direct/range {v20 .. v28}, Lt71/f;-><init>(Lcom/whoop/design/util/TextResource;Ly81/f;Lcom/whoop/design/util/TextResource;Ly81/f;Lt71/g;Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v5, v20

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v11, :cond_5

    new-instance v8, Lzc1/w1;

    const/16 v10, 0x8

    invoke-direct {v8, v10}, Lzc1/w1;-><init>(I)V

    invoke-virtual {v2, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v8, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v3, v5, v8, v2, v12}, Lt71/r;->Compose(Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    const-string v3, "Impact Activity Card Unlock State Negative"

    const/4 v5, 0x6

    invoke-static {v3, v2, v5}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v7, v6}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v2, v3}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    new-instance v3, Lt71/r;

    invoke-direct {v3}, Lt71/r;-><init>()V

    invoke-static {v9}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v21

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v23

    invoke-static/range {v19 .. v19}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v26

    const-string v4, "-15"

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    new-instance v27, Ly11/r;

    sget-object v32, Ly81/f;->ACCENT_NEGATIVE_TREND:Ly81/f;

    new-instance v5, Ly11/t;

    invoke-static {v13}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-static {v15}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-direct {v5, v1, v6, v7}, Ly11/t;-><init>(Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    const/16 v35, 0x23

    const/16 v36, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const v30, 0x3eb33333    # 0.35f

    const/high16 v31, 0x3f000000    # 0.5f

    const/16 v33, 0x0

    move-object/from16 v34, v5

    invoke-direct/range {v27 .. v36}, Ly11/r;-><init>(FLy81/f;FFLy81/f;Lcom/whoop/design/util/TextResource;Ly11/t;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v1, v27

    move-object/from16 v5, v32

    new-instance v6, Lt71/g$b;

    invoke-direct {v6, v4, v5, v1}, Lt71/g$b;-><init>(Lcom/whoop/design/util/TextResource;Ly81/f;Ly11/r;)V

    new-instance v20, Lt71/f;

    const/16 v27, 0xa

    const/16 v28, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    move-object/from16 v25, v6

    invoke-direct/range {v20 .. v28}, Lt71/f;-><init>(Lcom/whoop/design/util/TextResource;Ly81/f;Lcom/whoop/design/util/TextResource;Ly81/f;Lt71/g;Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v1, v20

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v11, :cond_6

    new-instance v4, Lzc1/w1;

    const/16 v5, 0x9

    invoke-direct {v4, v5}, Lzc1/w1;-><init>(I)V

    invoke-virtual {v2, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v3, v1, v4, v2, v12}, Lt71/r;->Compose(Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    const/4 v1, 0x1

    invoke-virtual {v2, v1}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_7
    invoke-virtual {v2}, Lp1/q;->X()V

    :goto_2
    invoke-virtual {v2}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_8

    new-instance v2, Lzc1/s3;

    const/4 v3, 0x5

    invoke-direct {v2, v0, v3}, Lzc1/s3;-><init>(II)V

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

    invoke-static {p1, p0}, Lzc1/x3;->e(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
