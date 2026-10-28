.class public abstract Lc41/w5;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u000b\"\u001d\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0002\u0010\u0003\u001a\u0004\u0008\u0002\u0010\u0004\"\u001d\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0003\u001a\u0004\u0008\u0007\u0010\u0004\"\u001d\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\u0003\u001a\u0004\u0008\n\u0010\u0004\u00a8\u0006\u000c"
    }
    d2 = {
        "",
        "Lc41/x5;",
        "a",
        "Ljava/util/List;",
        "()Ljava/util/List;",
        "trendTileStates",
        "b",
        "getStyleTrendTileStates",
        "styleTrendTileStates",
        "c",
        "getAiAccentTrendTileStates",
        "aiAccentTrendTileStates",
        "design_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lc41/x5;",
            ">;"
        }
    .end annotation
.end field

.field private static final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lc41/x5;",
            ">;"
        }
    .end annotation
.end field

.field private static final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lc41/x5;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 35

    new-instance v0, Lc41/x5;

    new-instance v2, Ly71/g;

    sget-object v14, Lx81/d;->a:Lx81/d;

    invoke-virtual {v14}, Lx81/d;->d()Lgz0/o0;

    move-result-object v1

    invoke-virtual {v1}, Lgz0/o0;->k()Lgz0/a0;

    move-result-object v1

    invoke-virtual {v1}, Lgz0/a0;->d()I

    move-result v1

    const/4 v15, 0x0

    const/4 v3, 0x2

    invoke-direct {v2, v1, v15, v3, v15}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v16, "TITLE"

    invoke-static/range {v16 .. v16}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    const-string v4, "87%"

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    const-string v17, "84%"

    invoke-static/range {v17 .. v17}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    new-instance v6, Ly71/g;

    invoke-virtual {v14}, Lx81/d;->d()Lgz0/o0;

    move-result-object v7

    invoke-virtual {v7}, Lgz0/o0;->p()Lgz0/k0;

    move-result-object v7

    invoke-virtual {v7}, Lgz0/k0;->e()I

    move-result v7

    invoke-direct {v6, v7, v15, v3, v15}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v7, Ly81/f;->BRAND_WHITE:Ly81/f;

    sget-object v18, Lc41/x0;->a:Lc41/x0;

    invoke-virtual/range {v18 .. v18}, Lc41/x0;->c()Lc93/m;

    move-result-object v11

    const/16 v12, 0x381

    const/4 v13, 0x0

    move v8, v3

    move-object v3, v1

    const/4 v1, 0x0

    move v9, v8

    const/4 v8, 0x0

    move v10, v9

    const/4 v9, 0x0

    move/from16 v19, v10

    const/4 v10, 0x0

    move-object/from16 v20, v14

    move/from16 v14, v19

    invoke-direct/range {v0 .. v13}, Lc41/x5;-><init>(Landroidx/compose/ui/Modifier;Ly71/g;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly71/g;Ly81/f;ZLcom/whoop/util/TrendKey;Lrz0/f;Lc93/m;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v21, Lc41/x5;

    new-instance v1, Ly71/g;

    invoke-static/range {v20 .. v20}, Lm4/a;->b(Lx81/d;)I

    move-result v2

    invoke-direct {v1, v2, v15, v14, v15}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static/range {v16 .. v16}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v24

    const-string v2, "76%"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v25

    invoke-static/range {v17 .. v17}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v26

    new-instance v2, Ly71/g;

    invoke-virtual/range {v20 .. v20}, Lx81/d;->d()Lgz0/o0;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/o0;->p()Lgz0/k0;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/k0;->d()I

    move-result v3

    invoke-direct {v2, v3, v15, v14, v15}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v28, Ly81/f;->RECOVERY_HIGH_RECOVERY:Ly81/f;

    const/16 v33, 0x781

    const/16 v34, 0x0

    const/16 v22, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    move-object/from16 v23, v1

    move-object/from16 v27, v2

    invoke-direct/range {v21 .. v34}, Lc41/x5;-><init>(Landroidx/compose/ui/Modifier;Ly71/g;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly71/g;Ly81/f;ZLcom/whoop/util/TrendKey;Lrz0/f;Lc93/m;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v1, v21

    new-instance v21, Lc41/x5;

    new-instance v2, Ly71/g;

    invoke-virtual/range {v20 .. v20}, Lx81/d;->d()Lgz0/o0;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/o0;->k()Lgz0/a0;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/a0;->d()I

    move-result v3

    invoke-direct {v2, v3, v15, v14, v15}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v3, "Very Very Very Very Very Long Title to Test Wrapping"

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v24

    const-string v3, "68%"

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v25

    const-string v3, "63%"

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v26

    new-instance v3, Ly71/g;

    invoke-virtual/range {v20 .. v20}, Lx81/d;->d()Lgz0/o0;

    move-result-object v4

    invoke-virtual {v4}, Lgz0/o0;->p()Lgz0/k0;

    move-result-object v4

    invoke-virtual {v4}, Lgz0/k0;->e()I

    move-result v4

    invoke-direct {v3, v4, v15, v14, v15}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v28, Ly81/f;->ACCENT_ALERT:Ly81/f;

    invoke-virtual/range {v18 .. v18}, Lc41/x0;->d()Lc93/m;

    move-result-object v32

    const/16 v33, 0x381

    move-object/from16 v23, v2

    move-object/from16 v27, v3

    invoke-direct/range {v21 .. v34}, Lc41/x5;-><init>(Landroidx/compose/ui/Modifier;Ly71/g;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly71/g;Ly81/f;ZLcom/whoop/util/TrendKey;Lrz0/f;Lc93/m;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v2, v21

    new-instance v21, Lc41/x5;

    new-instance v3, Ly71/g;

    invoke-virtual/range {v20 .. v20}, Lx81/d;->d()Lgz0/o0;

    move-result-object v4

    invoke-virtual {v4}, Lgz0/o0;->k()Lgz0/a0;

    move-result-object v4

    invoke-virtual {v4}, Lgz0/a0;->d()I

    move-result v4

    invoke-direct {v3, v4, v15, v14, v15}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static/range {v16 .. v16}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v24

    const-string v4, "92%"

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v25

    const/16 v33, 0x7f1

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v32, 0x0

    move-object/from16 v23, v3

    invoke-direct/range {v21 .. v34}, Lc41/x5;-><init>(Landroidx/compose/ui/Modifier;Ly71/g;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly71/g;Ly81/f;ZLcom/whoop/util/TrendKey;Lrz0/f;Lc93/m;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v3, v21

    new-instance v21, Lc41/x5;

    new-instance v5, Ly71/g;

    invoke-virtual/range {v20 .. v20}, Lx81/d;->d()Lgz0/o0;

    move-result-object v6

    invoke-virtual {v6}, Lgz0/o0;->k()Lgz0/a0;

    move-result-object v6

    invoke-virtual {v6}, Lgz0/a0;->d()I

    move-result v6

    invoke-direct {v5, v6, v15, v14, v15}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static/range {v16 .. v16}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v24

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v25

    sget-object v30, Lcom/whoop/util/TrendKey;->DISTURBANCES:Lcom/whoop/util/TrendKey;

    const/16 v33, 0x671

    const/16 v29, 0x1

    move-object/from16 v23, v5

    invoke-direct/range {v21 .. v34}, Lc41/x5;-><init>(Landroidx/compose/ui/Modifier;Ly71/g;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly71/g;Ly81/f;ZLcom/whoop/util/TrendKey;Lrz0/f;Lc93/m;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v4, v21

    filled-new-array {v0, v1, v2, v3, v4}, [Lc41/x5;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lc41/w5;->a:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lc41/x5;

    sget-object v14, Lrz0/f;->ONBOARDING_GRADIENT_FILL:Lrz0/f;

    const/16 v16, 0x5ff

    const/16 v17, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    invoke-static/range {v4 .. v17}, Lc41/x5;->b(Lc41/x5;Landroidx/compose/ui/Modifier;Ly71/g;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly71/g;Ly81/f;ZLcom/whoop/util/TrendKey;Lrz0/f;Lc93/m;ILjava/lang/Object;)Lc41/x5;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    sput-object v1, Lc41/w5;->b:Ljava/util/List;

    sget-object v0, Lc41/w5;->a:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lc41/x5;

    sget-object v13, Lrz0/f;->AI_ACCENT:Lrz0/f;

    const/16 v15, 0x5ff

    const/16 v16, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    invoke-static/range {v3 .. v16}, Lc41/x5;->b(Lc41/x5;Landroidx/compose/ui/Modifier;Ly71/g;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly71/g;Ly81/f;ZLcom/whoop/util/TrendKey;Lrz0/f;Lc93/m;ILjava/lang/Object;)Lc41/x5;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    sput-object v1, Lc41/w5;->c:Ljava/util/List;

    return-void
.end method

.method public static final a()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lc41/x5;",
            ">;"
        }
    .end annotation

    sget-object v0, Lc41/w5;->a:Ljava/util/List;

    return-object v0
.end method
