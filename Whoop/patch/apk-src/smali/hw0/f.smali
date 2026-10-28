.class public final Lhw0/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhw0/f$a;,
        Lhw0/f$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0015B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\'\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\u0006*\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\'\u0010\u0011\u001a\u00020\u00102\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0015\u0010\u0016JA\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00062\u000c\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00062\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000e2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0015\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001c\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0013\u0010\"\u001a\u0004\u0018\u00010!*\u00020\u001c\u00a2\u0006\u0004\u0008\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010$\u001a\u0004\u0008%\u0010&\u00a8\u0006\'"
    }
    d2 = {
        "Lhw0/f;",
        "",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "<init>",
        "(Lcom/whoop/data/repositories/FeatureFlagChecker;)V",
        "",
        "Lcom/whoop/design/models/items/HeartRateZone;",
        "Lcom/whoop/design/models/items/graph/LayoutDirection;",
        "timeSpliceLayoutDirection",
        "Ly11/l;",
        "f",
        "(Ljava/util/List;Lcom/whoop/design/models/items/graph/LayoutDirection;)Ljava/util/List;",
        "heartRateZones",
        "Lmc1/b;",
        "heartZoneType",
        "Lcom/whoop/design/models/items/HeartRateTileStyle;",
        "b",
        "(Ljava/util/List;Lmc1/b;)Lcom/whoop/design/models/items/HeartRateTileStyle;",
        "zoneStyle",
        "Ly11/a;",
        "a",
        "(Lcom/whoop/design/models/items/HeartRateTileStyle;)Ly11/a;",
        "horizontalBarGraphTileStates",
        "selectedHeartZoneType",
        "currentHeartZoneTypeState",
        "d",
        "(Ljava/util/List;Lmc1/b;Lmc1/b;Ljava/util/List;)Ljava/util/List;",
        "Lcom/whoop/design/models/items/BarGraphContainerModel;",
        "barGraphContainerModel",
        "Lk71/n;",
        "c",
        "(Lcom/whoop/design/models/items/BarGraphContainerModel;)Lk71/n;",
        "Lk71/o;",
        "e",
        "(Lcom/whoop/design/models/items/BarGraphContainerModel;)Lk71/o;",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "getFeatureFlagChecker",
        "()Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "core-details_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final b:Lhw0/f$a;

.field public static final c:I


# instance fields
.field private final a:Lcom/whoop/data/repositories/FeatureFlagChecker;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lhw0/f$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lhw0/f$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lhw0/f;->b:Lhw0/f$a;

    const/16 v0, 0x8

    sput v0, Lhw0/f;->c:I

    return-void
.end method

.method public constructor <init>(Lcom/whoop/data/repositories/FeatureFlagChecker;)V
    .locals 1

    const-string v0, "featureFlagChecker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhw0/f;->a:Lcom/whoop/data/repositories/FeatureFlagChecker;

    return-void
.end method

.method private final b(Ljava/util/List;Lmc1/b;)Lcom/whoop/design/models/items/HeartRateTileStyle;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/HeartRateZone;",
            ">;",
            "Lmc1/b;",
            ")",
            "Lcom/whoop/design/models/items/HeartRateTileStyle;"
        }
    .end annotation

    if-eqz p1, :cond_4

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/whoop/design/models/items/HeartRateZone;

    invoke-virtual {v2}, Lcom/whoop/design/models/items/HeartRateZone;->getId()Lcom/whoop/design/models/items/HeartRateTileId;

    move-result-object v2

    sget-object v3, Lhw0/f;->b:Lhw0/f$a;

    invoke-static {v3, p2}, Lhw0/f$a;->a(Lhw0/f$a;Lmc1/b;)Lcom/whoop/design/models/items/HeartRateTileId;

    move-result-object v3

    if-ne v2, v3, :cond_0

    goto :goto_0

    :cond_1
    move-object v0, v1

    :goto_0
    check-cast v0, Lcom/whoop/design/models/items/HeartRateZone;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/whoop/design/models/items/HeartRateZone;->getTileStyle()Lcom/whoop/design/models/items/HeartRateTileStyle;

    move-result-object v1

    :cond_2
    if-nez v1, :cond_3

    goto :goto_1

    :cond_3
    return-object v1

    :cond_4
    :goto_1
    sget-object p1, Lcom/whoop/design/models/items/HeartRateTileStyle;->NONE:Lcom/whoop/design/models/items/HeartRateTileStyle;

    return-object p1
.end method

.method private final f(Ljava/util/List;Lcom/whoop/design/models/items/graph/LayoutDirection;)Ljava/util/List;
    .locals 26
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/HeartRateZone;",
            ">;",
            "Lcom/whoop/design/models/items/graph/LayoutDirection;",
            ")",
            "Ljava/util/List<",
            "Ly11/l;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p1

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

    if-eqz v3, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/design/models/items/HeartRateZone;

    sget-object v4, Lhw0/f;->b:Lhw0/f$a;

    invoke-virtual {v3}, Lcom/whoop/design/models/items/HeartRateZone;->getId()Lcom/whoop/design/models/items/HeartRateTileId;

    move-result-object v5

    invoke-virtual {v4, v5}, Lhw0/f$a;->c(Lcom/whoop/design/models/items/HeartRateTileId;)Lmc1/b;

    move-result-object v7

    invoke-virtual {v3}, Lcom/whoop/design/models/items/HeartRateZone;->getBarGraphTileTitleDisplay()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-virtual {v3}, Lcom/whoop/design/models/items/HeartRateZone;->getBarGraphTileSubtitleDisplay()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-virtual {v3}, Lcom/whoop/design/models/items/HeartRateZone;->getBarGraphTilePercentageDisplay()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v10

    invoke-virtual {v3}, Lcom/whoop/design/models/items/HeartRateZone;->getBarGraphTileTimeDisplay()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v11

    invoke-virtual {v3}, Lcom/whoop/design/models/items/HeartRateZone;->getBarGraphTileTimeSuffixDisplay()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v12

    invoke-virtual {v3}, Lcom/whoop/design/models/items/HeartRateZone;->getTileStyle()Lcom/whoop/design/models/items/HeartRateTileStyle;

    move-result-object v4

    move-object/from16 v5, p0

    invoke-virtual {v5, v4}, Lhw0/f;->a(Lcom/whoop/design/models/items/HeartRateTileStyle;)Ly11/a;

    move-result-object v13

    invoke-virtual {v3}, Lcom/whoop/design/models/items/HeartRateZone;->getBarGraph()Lcom/whoop/design/models/items/BarGraph;

    move-result-object v4

    const/16 v6, 0x64

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Lcom/whoop/design/models/items/BarGraph;->getTimeBoundRanges()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    new-instance v14, Ljava/util/ArrayList;

    invoke-static {v4, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v15

    invoke-direct {v14, v15}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lcom/whoop/design/models/items/RangeModal;

    new-instance v2, Ll83/k;

    invoke-virtual {v15}, Lcom/whoop/design/models/items/RangeModal;->getLowerEndpoint()F

    move-result v16

    move-object/from16 v25, v0

    int-to-float v0, v6

    mul-float v16, v16, v0

    invoke-static/range {v16 .. v16}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    invoke-virtual {v15}, Lcom/whoop/design/models/items/RangeModal;->getUpperEndpoint()F

    move-result v15

    mul-float/2addr v15, v0

    invoke-static {v15}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-direct {v2, v6, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v14, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v0, v25

    const/16 v2, 0xa

    const/16 v6, 0x64

    goto :goto_1

    :cond_0
    move-object/from16 v25, v0

    invoke-static {v14}, Lb21/f;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_2

    goto :goto_2

    :cond_1
    move-object/from16 v25, v0

    :goto_2
    sget-object v0, Lm83/y;->w:Lm83/y;

    :cond_2
    invoke-virtual {v3}, Lcom/whoop/design/models/items/HeartRateZone;->getBarGraph()Lcom/whoop/design/models/items/BarGraph;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Lcom/whoop/design/models/items/BarGraph;->getGraphRangeEndpoints()Lcom/whoop/design/models/items/RangeModal;

    move-result-object v2

    if-eqz v2, :cond_3

    new-instance v3, Ll83/k;

    invoke-virtual {v2}, Lcom/whoop/design/models/items/RangeModal;->getLowerEndpoint()F

    move-result v4

    const/16 v6, 0x64

    int-to-float v6, v6

    mul-float/2addr v4, v6

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    invoke-virtual {v2}, Lcom/whoop/design/models/items/RangeModal;->getUpperEndpoint()F

    move-result v2

    mul-float/2addr v2, v6

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-direct {v3, v4, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_3
    move-object/from16 v19, v3

    goto :goto_4

    :cond_3
    const/4 v3, 0x0

    goto :goto_3

    :goto_4
    new-instance v6, Ly11/l;

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x6b80

    const/16 v24, 0x0

    move-object/from16 v22, p2

    move-object/from16 v17, v0

    invoke-direct/range {v6 .. v24}, Ly11/l;-><init>(Ljava/lang/Object;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly11/a;Landroidx/compose/ui/Modifier;ZZLjava/util/List;ZLl83/k;ZZLcom/whoop/design/models/items/graph/LayoutDirection;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v1, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v0, v25

    const/16 v2, 0xa

    goto/16 :goto_0

    :cond_4
    move-object/from16 v5, p0

    return-object v1
.end method


# virtual methods
.method public final a(Lcom/whoop/design/models/items/HeartRateTileStyle;)Ly11/a;
    .locals 1

    const-string v0, "zoneStyle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lhw0/f$b;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    packed-switch p1, :pswitch_data_0

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_0
    sget-object p1, Ly11/a;->MEDIUM_STRESS:Ly11/a;

    return-object p1

    :pswitch_1
    sget-object p1, Ly11/a;->LOW_STRESS:Ly11/a;

    return-object p1

    :pswitch_2
    sget-object p1, Ly11/a;->HIGH_STRESS:Ly11/a;

    return-object p1

    :pswitch_3
    sget-object p1, Ly11/a;->AWAKE_SLEEP:Ly11/a;

    return-object p1

    :pswitch_4
    sget-object p1, Ly11/a;->SWS_SLEEP:Ly11/a;

    return-object p1

    :pswitch_5
    sget-object p1, Ly11/a;->REM:Ly11/a;

    return-object p1

    :pswitch_6
    sget-object p1, Ly11/a;->LIGHT_SLEEP:Ly11/a;

    return-object p1

    :pswitch_7
    sget-object p1, Ly11/a;->VERY_LIGHT:Ly11/a;

    return-object p1

    :pswitch_8
    sget-object p1, Ly11/a;->SLEEP_HEART_RATE:Ly11/a;

    return-object p1

    :pswitch_9
    sget-object p1, Ly11/a;->RESTORATIVE:Ly11/a;

    return-object p1

    :pswitch_a
    sget-object p1, Ly11/a;->VERY_LIGHT:Ly11/a;

    return-object p1

    :pswitch_b
    sget-object p1, Ly11/a;->LIGHT:Ly11/a;

    return-object p1

    :pswitch_c
    sget-object p1, Ly11/a;->MODERATE:Ly11/a;

    return-object p1

    :pswitch_d
    sget-object p1, Ly11/a;->HARD:Ly11/a;

    return-object p1

    :pswitch_e
    sget-object p1, Ly11/a;->MAX:Ly11/a;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_e
        :pswitch_d
        :pswitch_c
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

.method public final c(Lcom/whoop/design/models/items/BarGraphContainerModel;)Lk71/n;
    .locals 3

    const-string v0, "barGraphContainerModel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lk71/n;

    invoke-virtual {p0, p1}, Lhw0/f;->e(Lcom/whoop/design/models/items/BarGraphContainerModel;)Lk71/o;

    move-result-object v1

    invoke-virtual {p1}, Lcom/whoop/design/models/items/BarGraphContainerModel;->getHeartRateZones()Ljava/util/List;

    move-result-object v2

    invoke-virtual {p1}, Lcom/whoop/design/models/items/BarGraphContainerModel;->getTimeSpliceLayoutDirection()Lcom/whoop/design/models/items/graph/LayoutDirection;

    move-result-object p1

    invoke-direct {p0, v2, p1}, Lhw0/f;->f(Ljava/util/List;Lcom/whoop/design/models/items/graph/LayoutDirection;)Ljava/util/List;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lk71/n;-><init>(Lk71/o;Ljava/util/List;)V

    return-object v0
.end method

.method public final d(Ljava/util/List;Lmc1/b;Lmc1/b;Ljava/util/List;)Ljava/util/List;
    .locals 37
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ly11/l;",
            ">;",
            "Lmc1/b;",
            "Lmc1/b;",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/HeartRateZone;",
            ">;)",
            "Ljava/util/List<",
            "Ly11/l;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    const-string v5, "horizontalBarGraphTileStates"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "selectedHeartZoneType"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "currentHeartZoneTypeState"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v5, Lmc1/b;->NONE:Lmc1/b;

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eq v3, v5, :cond_0

    if-ne v3, v2, :cond_0

    move/from16 v17, v7

    goto :goto_0

    :cond_0
    move/from16 v17, v6

    :goto_0
    check-cast v1, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    const/16 v8, 0xa

    invoke-static {v1, v8}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-direct {v5, v8}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    move-object/from16 v18, v8

    check-cast v18, Ly11/l;

    invoke-virtual/range {v18 .. v18}, Ly11/l;->getEvent()Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v3, :cond_2

    invoke-virtual/range {v18 .. v18}, Ly11/l;->getEvent()Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v2, :cond_1

    move/from16 v28, v7

    goto :goto_2

    :cond_1
    move/from16 v28, v6

    :goto_2
    invoke-direct {v0, v4, v3}, Lhw0/f;->b(Ljava/util/List;Lmc1/b;)Lcom/whoop/design/models/items/HeartRateTileStyle;

    move-result-object v8

    invoke-virtual {v0, v8}, Lhw0/f;->a(Lcom/whoop/design/models/items/HeartRateTileStyle;)Ly11/a;

    move-result-object v25

    const v35, 0xfdbf

    const/16 v36, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    invoke-static/range {v18 .. v36}, Ly11/l;->b(Ly11/l;Ljava/lang/Object;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly11/a;Landroidx/compose/ui/Modifier;ZZLjava/util/List;ZLl83/k;ZZLcom/whoop/design/models/items/graph/LayoutDirection;ILjava/lang/Object;)Ly11/l;

    move-result-object v8

    goto :goto_5

    :cond_2
    if-eqz v17, :cond_3

    sget-object v8, Ly11/a;->AWAKE_SLEEP:Ly11/a;

    :goto_3
    move-object v15, v8

    goto :goto_4

    :cond_3
    invoke-virtual/range {v18 .. v18}, Ly11/l;->getEvent()Ljava/lang/Object;

    move-result-object v8

    const-string v9, "null cannot be cast to non-null type com.whoop.design.reducer.mapper.hrgraph.HeartRateZoneType"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v8, Lmc1/b;

    invoke-direct {v0, v4, v8}, Lhw0/f;->b(Ljava/util/List;Lmc1/b;)Lcom/whoop/design/models/items/HeartRateTileStyle;

    move-result-object v8

    invoke-virtual {v0, v8}, Lhw0/f;->a(Lcom/whoop/design/models/items/HeartRateTileStyle;)Ly11/a;

    move-result-object v8

    goto :goto_3

    :goto_4
    const v25, 0xfebf

    const/16 v26, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    move-object/from16 v8, v18

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    invoke-static/range {v8 .. v26}, Ly11/l;->b(Ly11/l;Ljava/lang/Object;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly11/a;Landroidx/compose/ui/Modifier;ZZLjava/util/List;ZLl83/k;ZZLcom/whoop/design/models/items/graph/LayoutDirection;ILjava/lang/Object;)Ly11/l;

    move-result-object v8

    :goto_5
    invoke-interface {v5, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    :cond_4
    return-object v5
.end method

.method public final e(Lcom/whoop/design/models/items/BarGraphContainerModel;)Lk71/o;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/whoop/design/models/items/BarGraphContainerModel;->getTypicalRangeTitleDisplay()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/whoop/design/models/items/BarGraphContainerModel;->getDurationTitleDisplay()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lcom/whoop/design/models/items/BarGraphContainerModel;->getDurationDisplay()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_2

    :goto_0
    new-instance v0, Lk71/o;

    invoke-virtual {p1}, Lcom/whoop/design/models/items/BarGraphContainerModel;->getTypicalRangeTitleDisplay()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-virtual {p1}, Lcom/whoop/design/models/items/BarGraphContainerModel;->getDurationTitleDisplay()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {p1}, Lcom/whoop/design/models/items/BarGraphContainerModel;->getDurationDisplay()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object p1

    invoke-direct {v0, v1, v2, p1}, Lk71/o;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    return-object v0

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method
