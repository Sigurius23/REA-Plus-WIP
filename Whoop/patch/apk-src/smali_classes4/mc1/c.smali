.class public abstract Lmc1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lmc1/c$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\'\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0000*\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a%\u0010\u000f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000c2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0000\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u001a\u0015\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\t\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\u001a\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0015*\u00020\u0014\u00a2\u0006\u0004\u0008\u0016\u0010\u0017\"\u0017\u0010\u001d\u001a\u00020\u00188\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001c\u00a8\u0006\u001e"
    }
    d2 = {
        "",
        "Lcom/whoop/design/models/items/HeartRateZone;",
        "Lcom/whoop/design/models/items/graph/LayoutDirection;",
        "timeSpliceLayoutDirection",
        "Ly11/l;",
        "j",
        "(Ljava/util/List;Lcom/whoop/design/models/items/graph/LayoutDirection;)Ljava/util/List;",
        "Lcom/whoop/design/models/items/HeartRateTileStyle;",
        "zoneStyle",
        "Ly11/a;",
        "c",
        "(Lcom/whoop/design/models/items/HeartRateTileStyle;)Ly11/a;",
        "Lmc1/b;",
        "heartZoneType",
        "horizontalBarGraphTileStates",
        "e",
        "(Lmc1/b;Ljava/util/List;)Lcom/whoop/design/models/items/HeartRateTileStyle;",
        "fillColor",
        "d",
        "(Ly11/a;)Lcom/whoop/design/models/items/HeartRateTileStyle;",
        "Lcom/whoop/design/models/items/BarGraphContainerModel;",
        "Lk71/o;",
        "i",
        "(Lcom/whoop/design/models/items/BarGraphContainerModel;)Lk71/o;",
        "Llb1/y0;",
        "a",
        "Llb1/y0;",
        "f",
        "()Llb1/y0;",
        "horizontalBarGraphMapper",
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

    new-instance v0, Llb1/z4;

    const/16 v1, 0x1c

    invoke-direct {v0, v1}, Llb1/z4;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Lmc1/c;->a:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lmc1/c;->g(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/design/models/items/BarGraphContainerModel;)Lk71/n;
    .locals 0

    invoke-static {p0}, Lmc1/c;->h(Lcom/whoop/design/models/items/BarGraphContainerModel;)Lk71/n;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lcom/whoop/design/models/items/HeartRateTileStyle;)Ly11/a;
    .locals 1

    const-string v0, "zoneStyle"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lmc1/c$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    packed-switch p0, :pswitch_data_0

    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :pswitch_0
    sget-object p0, Ly11/a;->MEDIUM_STRESS:Ly11/a;

    return-object p0

    :pswitch_1
    sget-object p0, Ly11/a;->LOW_STRESS:Ly11/a;

    return-object p0

    :pswitch_2
    sget-object p0, Ly11/a;->HIGH_STRESS:Ly11/a;

    return-object p0

    :pswitch_3
    sget-object p0, Ly11/a;->AWAKE_SLEEP:Ly11/a;

    return-object p0

    :pswitch_4
    sget-object p0, Ly11/a;->SWS_SLEEP:Ly11/a;

    return-object p0

    :pswitch_5
    sget-object p0, Ly11/a;->REM:Ly11/a;

    return-object p0

    :pswitch_6
    sget-object p0, Ly11/a;->LIGHT_SLEEP:Ly11/a;

    return-object p0

    :pswitch_7
    sget-object p0, Ly11/a;->VERY_LIGHT:Ly11/a;

    return-object p0

    :pswitch_8
    sget-object p0, Ly11/a;->SLEEP_HEART_RATE:Ly11/a;

    return-object p0

    :pswitch_9
    sget-object p0, Ly11/a;->RESTORATIVE:Ly11/a;

    return-object p0

    :pswitch_a
    sget-object p0, Ly11/a;->VERY_LIGHT:Ly11/a;

    return-object p0

    :pswitch_b
    sget-object p0, Ly11/a;->LIGHT:Ly11/a;

    return-object p0

    :pswitch_c
    sget-object p0, Ly11/a;->MODERATE:Ly11/a;

    return-object p0

    :pswitch_d
    sget-object p0, Ly11/a;->HARD:Ly11/a;

    return-object p0

    :pswitch_e
    sget-object p0, Ly11/a;->MAX:Ly11/a;

    return-object p0

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

.method public static final d(Ly11/a;)Lcom/whoop/design/models/items/HeartRateTileStyle;
    .locals 1

    const-string v0, "fillColor"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lmc1/c$a;->b:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    packed-switch p0, :pswitch_data_0

    sget-object p0, Lcom/whoop/design/models/items/HeartRateTileStyle;->NONE:Lcom/whoop/design/models/items/HeartRateTileStyle;

    return-object p0

    :pswitch_0
    sget-object p0, Lcom/whoop/design/models/items/HeartRateTileStyle;->MEDIUM_STRESS:Lcom/whoop/design/models/items/HeartRateTileStyle;

    return-object p0

    :pswitch_1
    sget-object p0, Lcom/whoop/design/models/items/HeartRateTileStyle;->LOW_STRESS:Lcom/whoop/design/models/items/HeartRateTileStyle;

    return-object p0

    :pswitch_2
    sget-object p0, Lcom/whoop/design/models/items/HeartRateTileStyle;->HIGH_STRESS:Lcom/whoop/design/models/items/HeartRateTileStyle;

    return-object p0

    :pswitch_3
    sget-object p0, Lcom/whoop/design/models/items/HeartRateTileStyle;->AWAKE:Lcom/whoop/design/models/items/HeartRateTileStyle;

    return-object p0

    :pswitch_4
    sget-object p0, Lcom/whoop/design/models/items/HeartRateTileStyle;->SWS_SLEEP:Lcom/whoop/design/models/items/HeartRateTileStyle;

    return-object p0

    :pswitch_5
    sget-object p0, Lcom/whoop/design/models/items/HeartRateTileStyle;->REM_SLEEP:Lcom/whoop/design/models/items/HeartRateTileStyle;

    return-object p0

    :pswitch_6
    sget-object p0, Lcom/whoop/design/models/items/HeartRateTileStyle;->LIGHT_SLEEP:Lcom/whoop/design/models/items/HeartRateTileStyle;

    return-object p0

    :pswitch_7
    sget-object p0, Lcom/whoop/design/models/items/HeartRateTileStyle;->SLEEP_HEART_RATE_ZONE:Lcom/whoop/design/models/items/HeartRateTileStyle;

    return-object p0

    :pswitch_8
    sget-object p0, Lcom/whoop/design/models/items/HeartRateTileStyle;->RESTORATIVE_HR_ZONE:Lcom/whoop/design/models/items/HeartRateTileStyle;

    return-object p0

    :pswitch_9
    sget-object p0, Lcom/whoop/design/models/items/HeartRateTileStyle;->VERY_LIGHT_HR_ZONE:Lcom/whoop/design/models/items/HeartRateTileStyle;

    return-object p0

    :pswitch_a
    sget-object p0, Lcom/whoop/design/models/items/HeartRateTileStyle;->LIGHT_HR_ZONE:Lcom/whoop/design/models/items/HeartRateTileStyle;

    return-object p0

    :pswitch_b
    sget-object p0, Lcom/whoop/design/models/items/HeartRateTileStyle;->MODERATE_HR_ZONE:Lcom/whoop/design/models/items/HeartRateTileStyle;

    return-object p0

    :pswitch_c
    sget-object p0, Lcom/whoop/design/models/items/HeartRateTileStyle;->HARD_HR_ZONE:Lcom/whoop/design/models/items/HeartRateTileStyle;

    return-object p0

    :pswitch_d
    sget-object p0, Lcom/whoop/design/models/items/HeartRateTileStyle;->MAX_HR_ZONE:Lcom/whoop/design/models/items/HeartRateTileStyle;

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x1
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

.method public static final e(Lmc1/b;Ljava/util/List;)Lcom/whoop/design/models/items/HeartRateTileStyle;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmc1/b;",
            "Ljava/util/List<",
            "Ly11/l;",
            ">;)",
            "Lcom/whoop/design/models/items/HeartRateTileStyle;"
        }
    .end annotation

    const-string v0, "heartZoneType"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_2

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ly11/l;

    invoke-virtual {v1}, Ly11/l;->getEvent()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, p0, :cond_0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    check-cast v0, Ly11/l;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ly11/l;->e()Ly11/a;

    move-result-object p0

    if-nez p0, :cond_3

    :cond_2
    sget-object p0, Ly11/a;->VERY_LIGHT:Ly11/a;

    :cond_3
    invoke-static {p0}, Lmc1/c;->d(Ly11/a;)Lcom/whoop/design/models/items/HeartRateTileStyle;

    move-result-object p0

    return-object p0
.end method

.method public static final f()Llb1/y0;
    .locals 1

    sget-object v0, Lmc1/c;->a:Llb1/y0;

    return-object v0
.end method

.method private static final g(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/z4;

    const/16 v1, 0x1d

    invoke-direct {v0, v1}, Llb1/z4;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/items/BarGraphContainerModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Lmc1/c$b;

    invoke-direct {v2, v0}, Lmc1/c$b;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lcom/whoop/design/models/items/BarGraphContainerModel;)Lk71/n;
    .locals 3

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lk71/n;

    invoke-static {p0}, Lmc1/c;->i(Lcom/whoop/design/models/items/BarGraphContainerModel;)Lk71/o;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whoop/design/models/items/BarGraphContainerModel;->getHeartRateZones()Ljava/util/List;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/design/models/items/BarGraphContainerModel;->getTimeSpliceLayoutDirection()Lcom/whoop/design/models/items/graph/LayoutDirection;

    move-result-object p0

    invoke-static {v2, p0}, Lmc1/c;->j(Ljava/util/List;Lcom/whoop/design/models/items/graph/LayoutDirection;)Ljava/util/List;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lk71/n;-><init>(Lk71/o;Ljava/util/List;)V

    return-object v0
.end method

.method public static final i(Lcom/whoop/design/models/items/BarGraphContainerModel;)Lk71/o;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/items/BarGraphContainerModel;->getTypicalRangeTitleDisplay()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/whoop/design/models/items/BarGraphContainerModel;->getDurationTitleDisplay()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lcom/whoop/design/models/items/BarGraphContainerModel;->getDurationDisplay()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_2

    :goto_0
    new-instance v0, Lk71/o;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/BarGraphContainerModel;->getTypicalRangeTitleDisplay()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whoop/design/models/items/BarGraphContainerModel;->getDurationTitleDisplay()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/design/models/items/BarGraphContainerModel;->getDurationDisplay()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object p0

    invoke-direct {v0, v1, v2, p0}, Lk71/o;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    return-object v0

    :cond_2
    const/4 p0, 0x0

    return-object p0
.end method

.method private static final j(Ljava/util/List;Lcom/whoop/design/models/items/graph/LayoutDirection;)Ljava/util/List;
    .locals 25
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

    move-object/from16 v0, p0

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

    if-eqz v3, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/design/models/items/HeartRateZone;

    sget-object v4, Lmc1/d;->a:Lmc1/d$a;

    invoke-virtual {v3}, Lcom/whoop/design/models/items/HeartRateZone;->getId()Lcom/whoop/design/models/items/HeartRateTileId;

    move-result-object v5

    invoke-virtual {v4, v5}, Lmc1/d$a;->b(Lcom/whoop/design/models/items/HeartRateTileId;)Lmc1/b;

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

    invoke-static {v4}, Lmc1/c;->c(Lcom/whoop/design/models/items/HeartRateTileStyle;)Ly11/a;

    move-result-object v13

    invoke-virtual {v3}, Lcom/whoop/design/models/items/HeartRateZone;->getBarGraph()Lcom/whoop/design/models/items/BarGraph;

    move-result-object v4

    const/16 v5, 0x64

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Lcom/whoop/design/models/items/BarGraph;->getTimeBoundRanges()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    invoke-static {v4, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v14

    invoke-direct {v6, v14}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lcom/whoop/design/models/items/RangeModal;

    new-instance v15, Ll83/k;

    invoke-virtual {v14}, Lcom/whoop/design/models/items/RangeModal;->getLowerEndpoint()F

    move-result v16

    int-to-float v2, v5

    mul-float v16, v16, v2

    invoke-static/range {v16 .. v16}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    invoke-virtual {v14}, Lcom/whoop/design/models/items/RangeModal;->getUpperEndpoint()F

    move-result v14

    mul-float/2addr v14, v2

    invoke-static {v14}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-direct {v15, v5, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v6, v15}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    const/16 v2, 0xa

    const/16 v5, 0x64

    goto :goto_1

    :cond_0
    invoke-static {v6}, Lb21/f;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    if-nez v2, :cond_2

    :cond_1
    sget-object v2, Lm83/y;->w:Lm83/y;

    :cond_2
    invoke-virtual {v3}, Lcom/whoop/design/models/items/HeartRateZone;->getBarGraph()Lcom/whoop/design/models/items/BarGraph;

    move-result-object v4

    if-eqz v4, :cond_3

    invoke-virtual {v4}, Lcom/whoop/design/models/items/BarGraph;->getGraphRangeEndpoints()Lcom/whoop/design/models/items/RangeModal;

    move-result-object v4

    if-eqz v4, :cond_3

    new-instance v5, Ll83/k;

    invoke-virtual {v4}, Lcom/whoop/design/models/items/RangeModal;->getLowerEndpoint()F

    move-result v6

    const/16 v14, 0x64

    int-to-float v14, v14

    mul-float/2addr v6, v14

    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    invoke-virtual {v4}, Lcom/whoop/design/models/items/RangeModal;->getUpperEndpoint()F

    move-result v4

    mul-float/2addr v4, v14

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    invoke-direct {v5, v6, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_2
    move-object/from16 v19, v5

    goto :goto_3

    :cond_3
    const/4 v5, 0x0

    goto :goto_2

    :goto_3
    invoke-virtual {v3}, Lcom/whoop/design/models/items/HeartRateZone;->getShowRadioToggle()Ljava/lang/Boolean;

    move-result-object v4

    if-eqz v4, :cond_4

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    :goto_4
    move/from16 v20, v4

    goto :goto_5

    :cond_4
    const/4 v4, 0x0

    goto :goto_4

    :goto_5
    invoke-virtual {v3}, Lcom/whoop/design/models/items/HeartRateZone;->getHideBackground()Ljava/lang/Boolean;

    move-result-object v3

    if-eqz v3, :cond_5

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    :goto_6
    move/from16 v21, v3

    goto :goto_7

    :cond_5
    const/4 v3, 0x1

    goto :goto_6

    :goto_7
    new-instance v6, Ly11/l;

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v23, 0xb80

    const/16 v24, 0x0

    move-object/from16 v22, p1

    move-object/from16 v17, v2

    invoke-direct/range {v6 .. v24}, Ly11/l;-><init>(Ljava/lang/Object;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly11/a;Landroidx/compose/ui/Modifier;ZZLjava/util/List;ZLl83/k;ZZLcom/whoop/design/models/items/graph/LayoutDirection;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v1, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    const/16 v2, 0xa

    goto/16 :goto_0

    :cond_6
    return-object v1
.end method
