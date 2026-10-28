.class public final Lzs2/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J1\u0010\u000c\u001a\u00020\u000b2\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\n\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ#\u0010\u0011\u001a\u00020\u00082\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0008H\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012JG\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00132\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00132\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00082\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u0015\u00a2\u0006\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001a"
    }
    d2 = {
        "Lzs2/g;",
        "",
        "<init>",
        "()V",
        "",
        "roundToInterval",
        "Lcom/whoop/weeklyplan/customizeplan/domain/api/RangeWithTip;",
        "it",
        "Lcom/whoop/data/remote/domain/dto/BoundType;",
        "lowerBoundType",
        "upperBoundType",
        "Lcom/whoop/data/remote/domain/dto/DoubleRange;",
        "b",
        "(Ljava/lang/Double;Lcom/whoop/weeklyplan/customizeplan/domain/api/RangeWithTip;Lcom/whoop/data/remote/domain/dto/BoundType;Lcom/whoop/data/remote/domain/dto/BoundType;)Lcom/whoop/data/remote/domain/dto/DoubleRange;",
        "",
        "boundString",
        "boundTypeOverride",
        "a",
        "(Ljava/lang/String;Lcom/whoop/data/remote/domain/dto/BoundType;)Lcom/whoop/data/remote/domain/dto/BoundType;",
        "",
        "rangeContent",
        "Ly81/f;",
        "color",
        "Lbu2/p;",
        "c",
        "(Ljava/util/List;Ljava/lang/Double;Lcom/whoop/data/remote/domain/dto/BoundType;Ly81/f;)Ljava/util/List;",
        "weekly-plan_release"
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

.method private final a(Ljava/lang/String;Lcom/whoop/data/remote/domain/dto/BoundType;)Lcom/whoop/data/remote/domain/dto/BoundType;
    .locals 0

    if-nez p2, :cond_1

    if-nez p1, :cond_0

    :try_start_0
    const-string p1, ""

    :cond_0
    invoke-static {p1}, Lcom/whoop/data/remote/domain/dto/BoundType;->valueOf(Ljava/lang/String;)Lcom/whoop/data/remote/domain/dto/BoundType;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    sget-object p1, Lcom/whoop/data/remote/domain/dto/BoundType;->CLOSED:Lcom/whoop/data/remote/domain/dto/BoundType;

    return-object p1

    :cond_1
    return-object p2
.end method

.method private final b(Ljava/lang/Double;Lcom/whoop/weeklyplan/customizeplan/domain/api/RangeWithTip;Lcom/whoop/data/remote/domain/dto/BoundType;Lcom/whoop/data/remote/domain/dto/BoundType;)Lcom/whoop/data/remote/domain/dto/DoubleRange;
    .locals 8

    if-eqz p1, :cond_0

    new-instance v0, Lcom/whoop/data/remote/domain/dto/DoubleRange;

    invoke-virtual {p2}, Lcom/whoop/weeklyplan/customizeplan/domain/api/RangeWithTip;->getRange()Lcom/whoop/weeklyplan/customizeplan/domain/api/Range;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/weeklyplan/customizeplan/domain/api/Range;->getMin()D

    move-result-wide v1

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v3

    invoke-static {v1, v2, v3, v4}, Lor2/a1;->e(DD)D

    move-result-wide v1

    invoke-virtual {p2}, Lcom/whoop/weeklyplan/customizeplan/domain/api/RangeWithTip;->getRange()Lcom/whoop/weeklyplan/customizeplan/domain/api/Range;

    move-result-object p2

    invoke-virtual {p2}, Lcom/whoop/weeklyplan/customizeplan/domain/api/Range;->getMax()D

    move-result-wide v3

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide p1

    invoke-static {v3, v4, p1, p2}, Lor2/a1;->e(DD)D

    move-result-wide v4

    move-object v3, p3

    move-object v6, p4

    invoke-direct/range {v0 .. v6}, Lcom/whoop/data/remote/domain/dto/DoubleRange;-><init>(DLcom/whoop/data/remote/domain/dto/BoundType;DLcom/whoop/data/remote/domain/dto/BoundType;)V

    return-object v0

    :cond_0
    move-object v3, p3

    move-object v6, p4

    new-instance v1, Lcom/whoop/data/remote/domain/dto/DoubleRange;

    invoke-virtual {p2}, Lcom/whoop/weeklyplan/customizeplan/domain/api/RangeWithTip;->getRange()Lcom/whoop/weeklyplan/customizeplan/domain/api/Range;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/weeklyplan/customizeplan/domain/api/Range;->getMin()D

    move-result-wide p3

    invoke-virtual {p2}, Lcom/whoop/weeklyplan/customizeplan/domain/api/RangeWithTip;->getRange()Lcom/whoop/weeklyplan/customizeplan/domain/api/Range;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/weeklyplan/customizeplan/domain/api/Range;->getMax()D

    move-result-wide p1

    move-object v4, v3

    move-object v7, v6

    move-wide v5, p1

    move-wide v2, p3

    invoke-direct/range {v1 .. v7}, Lcom/whoop/data/remote/domain/dto/DoubleRange;-><init>(DLcom/whoop/data/remote/domain/dto/BoundType;DLcom/whoop/data/remote/domain/dto/BoundType;)V

    return-object v1
.end method

.method public static synthetic d(Lzs2/g;Ljava/util/List;Ljava/lang/Double;Lcom/whoop/data/remote/domain/dto/BoundType;Ly81/f;ILjava/lang/Object;)Ljava/util/List;
    .locals 1

    and-int/lit8 p6, p5, 0x2

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_1

    move-object p3, v0

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    sget-object p4, Ly81/f;->SLEEP:Ly81/f;

    :cond_2
    invoke-virtual {p0, p1, p2, p3, p4}, Lzs2/g;->c(Ljava/util/List;Ljava/lang/Double;Lcom/whoop/data/remote/domain/dto/BoundType;Ly81/f;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final c(Ljava/util/List;Ljava/lang/Double;Lcom/whoop/data/remote/domain/dto/BoundType;Ly81/f;)Ljava/util/List;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/weeklyplan/customizeplan/domain/api/RangeWithTip;",
            ">;",
            "Ljava/lang/Double;",
            "Lcom/whoop/data/remote/domain/dto/BoundType;",
            "Ly81/f;",
            ")",
            "Ljava/util/List<",
            "Lbu2/p;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    const-string v2, "color"

    move-object/from16 v10, p4

    invoke-static {v10, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    if-eqz p1, :cond_4

    move-object/from16 v3, p1

    check-cast v3, Ljava/lang/Iterable;

    new-instance v11, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v3, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v11, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_0
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/weeklyplan/customizeplan/domain/api/RangeWithTip;

    invoke-virtual {v3}, Lcom/whoop/weeklyplan/customizeplan/domain/api/RangeWithTip;->getRange()Lcom/whoop/weeklyplan/customizeplan/domain/api/Range;

    move-result-object v4

    invoke-virtual {v4}, Lcom/whoop/weeklyplan/customizeplan/domain/api/Range;->getLowerBoundType()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v4, v1}, Lzs2/g;->a(Ljava/lang/String;Lcom/whoop/data/remote/domain/dto/BoundType;)Lcom/whoop/data/remote/domain/dto/BoundType;

    move-result-object v4

    invoke-virtual {v3}, Lcom/whoop/weeklyplan/customizeplan/domain/api/RangeWithTip;->getRange()Lcom/whoop/weeklyplan/customizeplan/domain/api/Range;

    move-result-object v5

    invoke-virtual {v5}, Lcom/whoop/weeklyplan/customizeplan/domain/api/Range;->getUpperBoundType()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v0, v5, v1}, Lzs2/g;->a(Ljava/lang/String;Lcom/whoop/data/remote/domain/dto/BoundType;)Lcom/whoop/data/remote/domain/dto/BoundType;

    move-result-object v5

    move-object/from16 v13, p2

    invoke-direct {v0, v13, v3, v4, v5}, Lzs2/g;->b(Ljava/lang/Double;Lcom/whoop/weeklyplan/customizeplan/domain/api/RangeWithTip;Lcom/whoop/data/remote/domain/dto/BoundType;Lcom/whoop/data/remote/domain/dto/BoundType;)Lcom/whoop/data/remote/domain/dto/DoubleRange;

    move-result-object v14

    invoke-virtual {v3}, Lcom/whoop/weeklyplan/customizeplan/domain/api/RangeWithTip;->getTooltip()Lcom/whoop/weeklyplan/customizeplan/domain/api/ToolTip;

    move-result-object v4

    invoke-virtual {v4}, Lcom/whoop/weeklyplan/customizeplan/domain/api/ToolTip;->getTitleDisplay()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_0

    invoke-static {v4}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_0

    goto :goto_1

    :cond_0
    move-object v4, v2

    :goto_1
    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {v3}, Lcom/whoop/weeklyplan/customizeplan/domain/api/RangeWithTip;->getTooltip()Lcom/whoop/weeklyplan/customizeplan/domain/api/ToolTip;

    move-result-object v5

    invoke-virtual {v5}, Lcom/whoop/weeklyplan/customizeplan/domain/api/ToolTip;->getSubtitleDisplay()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_1

    invoke-static {v5}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_1

    goto :goto_2

    :cond_1
    move-object v5, v2

    :goto_2
    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual {v3}, Lcom/whoop/weeklyplan/customizeplan/domain/api/RangeWithTip;->getTooltip()Lcom/whoop/weeklyplan/customizeplan/domain/api/ToolTip;

    move-result-object v6

    invoke-virtual {v6}, Lcom/whoop/weeklyplan/customizeplan/domain/api/ToolTip;->getData()Ljava/lang/Double;

    move-result-object v6

    new-instance v15, Lbu2/b0;

    invoke-direct {v15, v4, v5, v6}, Lbu2/b0;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/Double;)V

    invoke-virtual {v3}, Lcom/whoop/weeklyplan/customizeplan/domain/api/RangeWithTip;->getProgressionToolTip()Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTip;

    move-result-object v3

    if-eqz v3, :cond_2

    move-object v4, v3

    new-instance v3, Lqt2/y;

    invoke-virtual {v4}, Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTip;->getTitle()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual {v4}, Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTip;->getDescription()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    move-object v7, v4

    move-object v4, v5

    move-object v5, v6

    invoke-virtual {v7}, Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTip;->getCurrentBarCopy()Ljava/lang/String;

    move-result-object v6

    move-object v8, v7

    invoke-virtual {v8}, Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTip;->getWeeklyIncreaseCopy()Ljava/lang/String;

    move-result-object v7

    move-object v9, v8

    invoke-virtual {v9}, Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTip;->getTargetBarCopy()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v9}, Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTip;->isOptimal()Z

    move-result v9

    invoke-direct/range {v3 .. v10}, Lqt2/y;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLy81/f;)V

    goto :goto_3

    :cond_2
    move-object v3, v2

    :goto_3
    new-instance v4, Lbu2/p;

    invoke-direct {v4, v14, v15, v3}, Lbu2/p;-><init>(Lcom/whoop/data/remote/domain/dto/DoubleRange;Lbu2/b0;Lqt2/y;)V

    invoke-virtual {v11, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v10, p4

    goto/16 :goto_0

    :cond_3
    return-object v11

    :cond_4
    return-object v2
.end method
