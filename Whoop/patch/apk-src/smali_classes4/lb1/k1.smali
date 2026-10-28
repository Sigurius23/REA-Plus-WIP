.class public abstract Llb1/k1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\"\u001a\u0010\t\u001a\u00020\u00048\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/whoop/design/models/items/ExerciseBreakdownModel;",
        "Lm11/d;",
        "f",
        "(Lcom/whoop/design/models/items/ExerciseBreakdownModel;)Lm11/d;",
        "Llb1/y0;",
        "a",
        "Llb1/y0;",
        "e",
        "()Llb1/y0;",
        "exerciseBreakdownMapper",
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


# static fields
.field private static final a:Llb1/y0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Llb1/e1;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Llb1/e1;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Llb1/k1;->a:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Lcom/whoop/design/models/items/ExerciseBreakdownModel;)Lm11/d;
    .locals 0

    invoke-static {p0}, Llb1/k1;->d(Lcom/whoop/design/models/items/ExerciseBreakdownModel;)Lm11/d;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/k1;->c(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/e1;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Llb1/e1;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/items/ExerciseBreakdownModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Llb1/k1$a;

    invoke-direct {v2, v0}, Llb1/k1$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final d(Lcom/whoop/design/models/items/ExerciseBreakdownModel;)Lm11/d;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Llb1/k1;->f(Lcom/whoop/design/models/items/ExerciseBreakdownModel;)Lm11/d;

    move-result-object p0

    return-object p0
.end method

.method public static final e()Llb1/y0;
    .locals 1

    sget-object v0, Llb1/k1;->a:Llb1/y0;

    return-object v0
.end method

.method private static final f(Lcom/whoop/design/models/items/ExerciseBreakdownModel;)Lm11/d;
    .locals 17

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/ExerciseBreakdownModel;->getNumberOfColumns()I

    move-result v0

    if-gez v0, :cond_0

    const/4 v0, 0x0

    :cond_0
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/ExerciseBreakdownModel;->getTableTitles()Ljava/util/List;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/ExerciseBreakdownModel;->getRows()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v3, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_7

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/design/models/items/ExerciseBreakdownRow;

    invoke-virtual {v6}, Lcom/whoop/design/models/items/ExerciseBreakdownRow;->getItems()Ljava/util/List;

    move-result-object v6

    check-cast v6, Ljava/lang/Iterable;

    invoke-static {v6, v0}, Lm83/s;->w1(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v6

    check-cast v6, Ljava/lang/Iterable;

    new-instance v7, Ljava/util/ArrayList;

    invoke-static {v6, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_6

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/whoop/design/models/items/ExerciseBreakdownCell;

    invoke-virtual {v8}, Lcom/whoop/design/models/items/ExerciseBreakdownCell;->getValue()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8}, Lcom/whoop/design/models/items/ExerciseBreakdownCell;->getUnits()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v8}, Lcom/whoop/design/models/items/ExerciseBreakdownCell;->getAchievementIcon()Ljava/lang/String;

    move-result-object v11

    const/4 v12, 0x0

    if-eqz v11, :cond_3

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v13

    array-length v14, v13

    const/4 v15, 0x0

    :goto_2
    if-ge v15, v14, :cond_2

    aget-object v16, v13, v15

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_3

    :cond_1
    add-int/lit8 v15, v15, 0x1

    goto :goto_2

    :cond_2
    move-object/from16 v16, v12

    :goto_3
    if-eqz v16, :cond_3

    invoke-virtual/range {v16 .. v16}, Lgz0/m0;->toWhoopIcon()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto :goto_4

    :cond_3
    move-object v1, v12

    :goto_4
    invoke-virtual {v8}, Lcom/whoop/design/models/items/ExerciseBreakdownCell;->getValueStyle()Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_5

    invoke-static {}, Ly81/f;->values()[Ly81/f;

    move-result-object v11

    array-length v13, v11

    const/4 v14, 0x0

    :goto_5
    if-ge v14, v13, :cond_5

    aget-object v15, v11, v14

    invoke-virtual {v15}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    move-object v12, v15

    goto :goto_6

    :cond_4
    add-int/lit8 v14, v14, 0x1

    const/16 v5, 0xa

    goto :goto_5

    :cond_5
    :goto_6
    new-instance v5, Lm11/a;

    invoke-direct {v5, v9, v10, v1, v12}, Lm11/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ly81/f;)V

    invoke-interface {v7, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    const/16 v5, 0xa

    goto :goto_1

    :cond_6
    invoke-interface {v4, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    const/16 v5, 0xa

    goto/16 :goto_0

    :cond_7
    new-instance v1, Lm11/d;

    invoke-direct {v1, v0, v2, v4}, Lm11/d;-><init>(ILjava/util/List;Ljava/util/List;)V

    return-object v1
.end method
