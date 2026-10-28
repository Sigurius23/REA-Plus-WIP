.class public final Ls41/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm91/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lm91/f<",
        "Ls41/b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J3\u0010\u000c\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0008H\u0017\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u0010\u00b2\u0006\u000e\u0010\u000f\u001a\u00020\u000e8\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Ls41/a;",
        "Lm91/f;",
        "Ls41/b;",
        "<init>",
        "()V",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "itemState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "c",
        "(Landroidx/compose/ui/Modifier;Ls41/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "",
        "currentWeightInPounds",
        "design_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Ls41/a;Landroidx/compose/ui/Modifier;Ls41/b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Ls41/a;->g(Ls41/a;Landroidx/compose/ui/Modifier;Ls41/b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ls41/b;Lp1/c1;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Ls41/a;->f(Lkotlin/jvm/functions/Function1;Ls41/b;Lp1/c1;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Lp1/c1;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")I"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    return p0
.end method

.method private static final e(Lp1/c1;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "I)V"
        }
    .end annotation

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final f(Lkotlin/jvm/functions/Function1;Ls41/b;Lp1/c1;I)Ll83/a0;
    .locals 1

    invoke-static {p2, p3}, Ls41/a;->e(Lp1/c1;I)V

    new-instance p2, Lcom/whoop/design/item/DesignItemInteraction;

    invoke-virtual {p1}, Ls41/b;->f()Lc93/m;

    move-result-object v0

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-virtual {p1}, Ls41/b;->i()Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Lcom/whoop/domain/model/UnitSystem;->IMPERIAL:Lcom/whoop/domain/model/UnitSystem;

    goto :goto_0

    :cond_0
    sget-object p1, Lcom/whoop/domain/model/UnitSystem;->METRIC:Lcom/whoop/domain/model/UnitSystem;

    :goto_0
    invoke-interface {v0, p3, p1}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const/4 p3, 0x0

    invoke-direct {p2, p1, p3}, Lcom/whoop/design/item/DesignItemInteraction;-><init>(Ljava/lang/Object;Lcom/whoop/analytics/AnalyticEventModel;)V

    invoke-interface {p0, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Ls41/a;Landroidx/compose/ui/Modifier;Ls41/b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    invoke-virtual/range {v0 .. v5}, Ls41/a;->c(Landroidx/compose/ui/Modifier;Ls41/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic Compose(Landroidx/compose/ui/Modifier;Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    check-cast p2, Ls41/b;

    invoke-virtual/range {p0 .. p5}, Ls41/a;->c(Landroidx/compose/ui/Modifier;Ls41/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public c(Landroidx/compose/ui/Modifier;Ls41/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Ls41/b;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move-object/from16 v9, p2

    move-object/from16 v10, p3

    move/from16 v11, p5

    const-string v0, "modifier"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "itemState"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v6, p4

    check-cast v6, Lp1/q;

    const v0, 0x101c73fa

    invoke-virtual {v6, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v11, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v6, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v11

    goto :goto_1

    :cond_1
    move v0, v11

    :goto_1
    and-int/lit8 v1, v11, 0x30

    if-nez v1, :cond_3

    invoke-virtual {v6, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v1, 0x20

    goto :goto_2

    :cond_2
    const/16 v1, 0x10

    :goto_2
    or-int/2addr v0, v1

    :cond_3
    and-int/lit16 v1, v11, 0x180

    const/16 v3, 0x100

    if-nez v1, :cond_5

    invoke-virtual {v6, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    move v1, v3

    goto :goto_3

    :cond_4
    const/16 v1, 0x80

    :goto_3
    or-int/2addr v0, v1

    :cond_5
    and-int/lit16 v1, v0, 0x93

    const/16 v4, 0x92

    const/4 v5, 0x0

    const/4 v7, 0x1

    if-eq v1, v4, :cond_6

    move v1, v7

    goto :goto_4

    :cond_6
    move v1, v5

    :goto_4
    and-int/lit8 v4, v0, 0x1

    invoke-virtual {v6, v4, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_d

    invoke-virtual {v9}, Ls41/b;->h()I

    move-result v1

    invoke-virtual {v6, v1}, Lp1/q;->e(I)Z

    move-result v1

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    sget-object v8, Lp1/l;->a:Lp1/v0;

    if-nez v1, :cond_7

    if-ne v4, v8, :cond_8

    :cond_7
    invoke-virtual {v9}, Ls41/b;->h()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v4

    invoke-virtual {v6, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v4, Lp1/c1;

    new-instance v12, Ls41/d;

    invoke-virtual {v9}, Ls41/b;->i()Z

    move-result v1

    if-eqz v1, :cond_9

    sget-object v1, Lcom/whoop/domain/model/UnitSystem;->IMPERIAL:Lcom/whoop/domain/model/UnitSystem;

    :goto_5
    move-object v13, v1

    goto :goto_6

    :cond_9
    sget-object v1, Lcom/whoop/domain/model/UnitSystem;->METRIC:Lcom/whoop/domain/model/UnitSystem;

    goto :goto_5

    :goto_6
    invoke-static {v4}, Ls41/a;->d(Lp1/c1;)I

    move-result v14

    invoke-virtual {v9}, Ls41/b;->e()Li93/j;

    move-result-object v15

    invoke-virtual {v9}, Ls41/b;->b()Li93/j;

    move-result-object v16

    invoke-virtual {v9}, Ls41/b;->c()Ljava/lang/String;

    move-result-object v17

    invoke-virtual {v9}, Ls41/b;->a()Ljava/lang/String;

    move-result-object v18

    invoke-direct/range {v12 .. v18}, Ls41/d;-><init>(Lcom/whoop/domain/model/UnitSystem;ILi93/j;Li93/j;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v6, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    and-int/lit16 v13, v0, 0x380

    if-ne v13, v3, :cond_a

    move v5, v7

    :cond_a
    or-int/2addr v1, v5

    invoke-virtual {v6, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v1, v3

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v1, :cond_b

    if-ne v3, v8, :cond_c

    :cond_b
    new-instance v3, Lno0/j0;

    const/16 v1, 0x1d

    invoke-direct {v3, v10, v9, v4, v1}, Lno0/j0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v6, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    move-object v1, v3

    check-cast v1, Lkotlin/jvm/functions/Function1;

    shl-int/lit8 v0, v0, 0x6

    and-int/lit16 v7, v0, 0x380

    const/16 v8, 0x38

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, v12

    invoke-static/range {v0 .. v8}, Ls41/c;->d(Ls41/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;FLb91/a;ZLandroidx/compose/runtime/Composer;II)V

    goto :goto_7

    :cond_d
    invoke-virtual {v6}, Lp1/q;->X()V

    :goto_7
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_e

    new-instance v0, Lr90/b;

    const/16 v6, 0xe

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object v3, v9

    move-object v4, v10

    move v5, v11

    invoke-direct/range {v0 .. v6}, Lr90/b;-><init>(Lm91/f;Landroidx/compose/ui/Modifier;Lm91/u;Lkotlin/jvm/functions/Function1;II)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_e
    return-void
.end method
