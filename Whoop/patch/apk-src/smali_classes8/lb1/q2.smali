.class public abstract Llb1/q2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llb1/q2$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\'\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "",
        "legendStyle",
        "legendText",
        "",
        "isCapitalized",
        "Ln21/e;",
        "d",
        "(Ljava/lang/String;Ljava/lang/String;Z)Ln21/e;",
        "design-models_release"
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
.method public static synthetic a(Ly81/i;)Li2/t;
    .locals 0

    invoke-static {p0}, Llb1/q2;->f(Ly81/i;)Li2/t;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ly81/i;)Li2/t;
    .locals 0

    invoke-static {p0}, Llb1/q2;->h(Ly81/i;)Li2/t;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ly81/i;)Li2/t;
    .locals 0

    invoke-static {p0}, Llb1/q2;->g(Ly81/i;)Li2/t;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Ljava/lang/String;Ljava/lang/String;Z)Ln21/e;
    .locals 22

    move-object/from16 v0, p0

    const-string v1, "legendStyle"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "legendText"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lcom/whoop/design/models/LegendStyle;->STRIPES:Lcom/whoop/design/models/LegendStyle;

    invoke-static {}, Lcom/whoop/design/models/LegendStyle;->values()[Lcom/whoop/design/models/LegendStyle;

    move-result-object v3

    array-length v4, v3

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_1

    aget-object v6, v3, v5

    invoke-virtual {v6}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    const/4 v6, 0x0

    :goto_1
    if-nez v6, :cond_2

    goto :goto_2

    :cond_2
    move-object v1, v6

    :goto_2
    sget-object v0, Llb1/q2$a;->a:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :pswitch_0
    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    sget-object v0, Llb1/q2$b;->w:Llb1/q2$b;

    invoke-static {v0}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v3

    sget-object v7, Ly81/f;->WHITE_70:Ly81/f;

    sget-object v5, Ln21/i;->SQUARE_WITH_CORNERS:Ln21/i;

    if-eqz p2, :cond_3

    sget-object v0, Lb91/c;->H5:Lb91/c;

    :goto_3
    move-object v9, v0

    goto :goto_4

    :cond_3
    sget-object v0, Lb91/c;->B2:Lb91/c;

    goto :goto_3

    :goto_4
    new-instance v1, Ln21/e;

    const/16 v10, 0x51

    const/4 v11, 0x0

    const/4 v2, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v1 .. v11}, Ln21/e;-><init>(Landroidx/compose/ui/Modifier;Li91/a;Lcom/whoop/design/util/TextResource;Ln21/i;Lgz0/m0;Ly81/f;Lkotlin/jvm/functions/Function1;Lb91/c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :pswitch_1
    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    new-instance v0, Llb1/m;

    const/16 v1, 0x1c

    invoke-direct {v0, v1}, Llb1/m;-><init>(I)V

    invoke-static {v0}, Li91/c;->j(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v4

    sget-object v6, Ln21/i;->SQUARE_WITH_CORNERS:Ln21/i;

    sget-object v8, Ly81/f;->BRAND_WHITE:Ly81/f;

    if-eqz p2, :cond_4

    sget-object v0, Lb91/c;->H5:Lb91/c;

    :goto_5
    move-object v10, v0

    goto :goto_6

    :cond_4
    sget-object v0, Lb91/c;->B2:Lb91/c;

    goto :goto_5

    :goto_6
    new-instance v2, Ln21/e;

    const/16 v11, 0x51

    const/4 v12, 0x0

    const/4 v3, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v2 .. v12}, Ln21/e;-><init>(Landroidx/compose/ui/Modifier;Li91/a;Lcom/whoop/design/util/TextResource;Ln21/i;Lgz0/m0;Ly81/f;Lkotlin/jvm/functions/Function1;Lb91/c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    :pswitch_2
    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    new-instance v0, Llb1/m;

    const/16 v1, 0x1b

    invoke-direct {v0, v1}, Llb1/m;-><init>(I)V

    invoke-static {v0}, Li91/c;->j(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v5

    sget-object v7, Ln21/i;->DASHED_LINE:Ln21/i;

    sget-object v9, Ly81/f;->WHITE_70:Ly81/f;

    if-eqz p2, :cond_5

    sget-object v0, Lb91/c;->H5:Lb91/c;

    :goto_7
    move-object v11, v0

    goto :goto_8

    :cond_5
    sget-object v0, Lb91/c;->B3:Lb91/c;

    goto :goto_7

    :goto_8
    new-instance v3, Ln21/e;

    const/16 v12, 0x51

    const/4 v13, 0x0

    const/4 v4, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v3 .. v13}, Ln21/e;-><init>(Landroidx/compose/ui/Modifier;Li91/a;Lcom/whoop/design/util/TextResource;Ln21/i;Lgz0/m0;Ly81/f;Lkotlin/jvm/functions/Function1;Lb91/c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3

    :pswitch_3
    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    new-instance v0, Llb1/m;

    const/16 v1, 0x1a

    invoke-direct {v0, v1}, Llb1/m;-><init>(I)V

    invoke-static {v0}, Li91/c;->j(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v6

    sget-object v8, Ln21/i;->SQUARE_WITH_CORNERS:Ln21/i;

    sget-object v10, Ly81/f;->BRAND_WHITE:Ly81/f;

    new-instance v4, Ln21/e;

    const/16 v13, 0xd1

    const/4 v14, 0x0

    const/4 v5, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v4 .. v14}, Ln21/e;-><init>(Landroidx/compose/ui/Modifier;Li91/a;Lcom/whoop/design/util/TextResource;Ln21/i;Lgz0/m0;Ly81/f;Lkotlin/jvm/functions/Function1;Lb91/c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v4

    :pswitch_4
    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    sget-object v0, Llb1/q2$j;->w:Llb1/q2$j;

    invoke-static {v0}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v7

    sget-object v9, Ln21/i;->SQUARE_WITH_CORNERS:Ln21/i;

    sget-object v11, Ly81/f;->BRAND_WHITE:Ly81/f;

    if-eqz p2, :cond_6

    sget-object v0, Lb91/c;->H5:Lb91/c;

    :goto_9
    move-object v13, v0

    goto :goto_a

    :cond_6
    sget-object v0, Lb91/c;->B2:Lb91/c;

    goto :goto_9

    :goto_a
    new-instance v5, Ln21/e;

    const/16 v14, 0x51

    const/4 v15, 0x0

    const/4 v6, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v5 .. v15}, Ln21/e;-><init>(Landroidx/compose/ui/Modifier;Li91/a;Lcom/whoop/design/util/TextResource;Ln21/i;Lgz0/m0;Ly81/f;Lkotlin/jvm/functions/Function1;Lb91/c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v5

    :pswitch_5
    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    sget-object v0, Llb1/q2$i;->w:Llb1/q2$i;

    invoke-static {v0}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v8

    sget-object v10, Ln21/i;->CAPSULE:Ln21/i;

    sget-object v14, Lb91/c;->B3:Lb91/c;

    new-instance v6, Ln21/e;

    const/16 v15, 0x71

    const/16 v16, 0x0

    const/4 v7, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v6 .. v16}, Ln21/e;-><init>(Landroidx/compose/ui/Modifier;Li91/a;Lcom/whoop/design/util/TextResource;Ln21/i;Lgz0/m0;Ly81/f;Lkotlin/jvm/functions/Function1;Lb91/c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v6

    :pswitch_6
    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v10

    sget-object v0, Llb1/q2$h;->w:Llb1/q2$h;

    invoke-static {v0}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v9

    sget-object v11, Ln21/i;->CAPSULE:Ln21/i;

    sget-object v15, Lb91/c;->B3:Lb91/c;

    new-instance v7, Ln21/e;

    const/16 v16, 0x71

    const/16 v17, 0x0

    const/4 v8, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v7 .. v17}, Ln21/e;-><init>(Landroidx/compose/ui/Modifier;Li91/a;Lcom/whoop/design/util/TextResource;Ln21/i;Lgz0/m0;Ly81/f;Lkotlin/jvm/functions/Function1;Lb91/c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v7

    :pswitch_7
    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v11

    sget-object v0, Llb1/q2$g;->w:Llb1/q2$g;

    invoke-static {v0}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v10

    sget-object v12, Ln21/i;->CAPSULE:Ln21/i;

    sget-object v16, Lb91/c;->B3:Lb91/c;

    new-instance v8, Ln21/e;

    const/16 v17, 0x71

    const/16 v18, 0x0

    const/4 v9, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v8 .. v18}, Ln21/e;-><init>(Landroidx/compose/ui/Modifier;Li91/a;Lcom/whoop/design/util/TextResource;Ln21/i;Lgz0/m0;Ly81/f;Lkotlin/jvm/functions/Function1;Lb91/c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v8

    :pswitch_8
    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v12

    sget-object v0, Llb1/q2$f;->w:Llb1/q2$f;

    invoke-static {v0}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v11

    sget-object v13, Ln21/i;->CAPSULE:Ln21/i;

    sget-object v17, Lb91/c;->B3:Lb91/c;

    new-instance v9, Ln21/e;

    const/16 v18, 0x71

    const/16 v19, 0x0

    const/4 v10, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v9 .. v19}, Ln21/e;-><init>(Landroidx/compose/ui/Modifier;Li91/a;Lcom/whoop/design/util/TextResource;Ln21/i;Lgz0/m0;Ly81/f;Lkotlin/jvm/functions/Function1;Lb91/c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v9

    :pswitch_9
    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    sget-object v0, Llb1/q2$e;->w:Llb1/q2$e;

    invoke-static {v0}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v12

    sget-object v16, Ly81/f;->WHITE_70:Ly81/f;

    sget-object v14, Ln21/i;->SQUARE_WITH_CORNERS:Ln21/i;

    if-eqz p2, :cond_7

    sget-object v0, Lb91/c;->H5:Lb91/c;

    :goto_b
    move-object/from16 v18, v0

    goto :goto_c

    :cond_7
    sget-object v0, Lb91/c;->B2:Lb91/c;

    goto :goto_b

    :goto_c
    new-instance v10, Ln21/e;

    const/16 v19, 0x51

    const/16 v20, 0x0

    const/4 v11, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v10 .. v20}, Ln21/e;-><init>(Landroidx/compose/ui/Modifier;Li91/a;Lcom/whoop/design/util/TextResource;Ln21/i;Lgz0/m0;Ly81/f;Lkotlin/jvm/functions/Function1;Lb91/c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v10

    :pswitch_a
    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v14

    sget-object v0, Llb1/q2$d;->w:Llb1/q2$d;

    invoke-static {v0}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v13

    sget-object v15, Ln21/i;->SQUARE_WITH_CORNERS:Ln21/i;

    sget-object v17, Ly81/f;->BRAND_WHITE:Ly81/f;

    if-eqz p2, :cond_8

    sget-object v0, Lb91/c;->H5:Lb91/c;

    :goto_d
    move-object/from16 v19, v0

    goto :goto_e

    :cond_8
    sget-object v0, Lb91/c;->B2:Lb91/c;

    goto :goto_d

    :goto_e
    new-instance v11, Ln21/e;

    const/16 v20, 0x51

    const/16 v21, 0x0

    const/4 v12, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    invoke-direct/range {v11 .. v21}, Ln21/e;-><init>(Landroidx/compose/ui/Modifier;Li91/a;Lcom/whoop/design/util/TextResource;Ln21/i;Lgz0/m0;Ly81/f;Lkotlin/jvm/functions/Function1;Lb91/c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v11

    :pswitch_b
    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    sget-object v0, Llb1/q2$c;->w:Llb1/q2$c;

    invoke-static {v0}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v2

    sget-object v4, Ln21/i;->SQUARE:Ln21/i;

    new-instance v0, Ln21/e;

    const/16 v9, 0xf1

    const/4 v10, 0x0

    const/4 v1, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v0 .. v10}, Ln21/e;-><init>(Landroidx/compose/ui/Modifier;Li91/a;Lcom/whoop/design/util/TextResource;Ln21/i;Lgz0/m0;Ly81/f;Lkotlin/jvm/functions/Function1;Lb91/c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static synthetic e(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ln21/e;
    .locals 0

    and-int/lit8 p3, p3, 0x4

    if-eqz p3, :cond_0

    const/4 p2, 0x1

    :cond_0
    invoke-static {p0, p1, p2}, Llb1/q2;->d(Ljava/lang/String;Ljava/lang/String;Z)Ln21/e;

    move-result-object p0

    return-object p0
.end method

.method private static final f(Ly81/i;)Li2/t;
    .locals 8

    const-string v0, "$this$brushBackground"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Li2/t;->b:Li2/s;

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {p0}, Ly81/i;->h0()J

    move-result-wide v2

    new-instance v4, Li2/x;

    invoke-direct {v4, v2, v3}, Li2/x;-><init>(J)V

    new-instance v2, Ll83/k;

    invoke-direct {v2, v0, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v0, 0x3f000000    # 0.5f

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {p0}, Ly81/i;->h0()J

    move-result-wide v3

    new-instance v5, Li2/x;

    invoke-direct {v5, v3, v4}, Li2/x;-><init>(J)V

    new-instance v3, Ll83/k;

    invoke-direct {v3, v0, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0}, Ly81/i;->j0()J

    move-result-wide v4

    new-instance v6, Li2/x;

    invoke-direct {v6, v4, v5}, Li2/x;-><init>(J)V

    new-instance v4, Ll83/k;

    invoke-direct {v4, v0, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {p0}, Ly81/i;->j0()J

    move-result-wide v5

    new-instance p0, Li2/x;

    invoke-direct {p0, v5, v6}, Li2/x;-><init>(J)V

    new-instance v5, Ll83/k;

    invoke-direct {v5, v0, p0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v2, v3, v4, v5}, [Ll83/k;

    move-result-object v2

    const/16 v6, 0xa

    const/4 v7, 0x0

    const/4 v3, 0x0

    const v4, 0x439d8000    # 315.0f

    const/4 v5, 0x0

    invoke-static/range {v1 .. v7}, Lgb1/u;->d(Li2/s;[Ll83/k;IFZILjava/lang/Object;)Li2/t;

    move-result-object p0

    return-object p0
.end method

.method private static final g(Ly81/i;)Li2/t;
    .locals 8

    const-string v0, "$this$brushBackground"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Li2/t;->b:Li2/s;

    const-wide v2, 0xffb9bfa9L

    invoke-static {v2, v3}, Li2/w0;->e(J)J

    move-result-wide v2

    const/high16 p0, 0x3f000000    # 0.5f

    invoke-static {p0, v2, v3}, Li2/x;->c(FJ)J

    move-result-wide v2

    new-instance v0, Li2/x;

    invoke-direct {v0, v2, v3}, Li2/x;-><init>(J)V

    const-wide v2, 0xffc6e3dfL

    invoke-static {v2, v3}, Li2/w0;->e(J)J

    move-result-wide v2

    invoke-static {p0, v2, v3}, Li2/x;->c(FJ)J

    move-result-wide v2

    new-instance v4, Li2/x;

    invoke-direct {v4, v2, v3}, Li2/x;-><init>(J)V

    const-wide v2, 0xffd9c6b6L

    invoke-static {v2, v3}, Li2/w0;->e(J)J

    move-result-wide v2

    invoke-static {p0, v2, v3}, Li2/x;->c(FJ)J

    move-result-wide v2

    new-instance v5, Li2/x;

    invoke-direct {v5, v2, v3}, Li2/x;-><init>(J)V

    const-wide v2, 0xffb3a8c0L

    invoke-static {v2, v3}, Li2/w0;->e(J)J

    move-result-wide v2

    invoke-static {p0, v2, v3}, Li2/x;->c(FJ)J

    move-result-wide v2

    new-instance p0, Li2/x;

    invoke-direct {p0, v2, v3}, Li2/x;-><init>(J)V

    filled-new-array {v0, v4, v5, p0}, [Li2/x;

    move-result-object p0

    invoke-static {p0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const-wide/16 v5, 0x0

    const/16 v7, 0xe

    const-wide/16 v3, 0x0

    invoke-static/range {v1 .. v7}, Li2/s;->d(Li2/s;Ljava/util/List;JJI)Li2/k0;

    move-result-object p0

    return-object p0
.end method

.method private static final h(Ly81/i;)Li2/t;
    .locals 13

    const-string v0, "$this$brushBackground"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Li2/t;->b:Li2/s;

    invoke-virtual {p0}, Ly81/i;->W0()J

    move-result-wide v1

    new-instance v3, Li2/x;

    invoke-direct {v3, v1, v2}, Li2/x;-><init>(J)V

    invoke-virtual {p0}, Ly81/i;->V0()J

    move-result-wide v1

    new-instance p0, Li2/x;

    invoke-direct {p0, v1, v2}, Li2/x;-><init>(J)V

    filled-new-array {v3, p0}, [Li2/x;

    move-result-object p0

    invoke-static {p0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const/4 p0, 0x0

    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v3, v1

    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p0

    int-to-long v5, p0

    const/16 p0, 0x20

    shl-long/2addr v3, p0

    const-wide v7, 0xffffffffL

    and-long/2addr v5, v7

    or-long v4, v3, v5

    const/high16 v1, 0x40a00000    # 5.0f

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v3

    int-to-long v9, v3

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v11, v1

    shl-long/2addr v9, p0

    and-long v6, v11, v7

    or-long/2addr v6, v9

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Li2/k0;

    const/4 v3, 0x0

    const/4 v8, 0x1

    invoke-direct/range {v1 .. v8}, Li2/k0;-><init>(Ljava/util/List;Ljava/util/ArrayList;JJI)V

    return-object v1
.end method
