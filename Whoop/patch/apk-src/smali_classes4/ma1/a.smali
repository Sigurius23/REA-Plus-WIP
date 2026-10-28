.class public final synthetic Lma1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lma1/a;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lma1/a;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-static {}, Lcom/whoop/homenotificationscenter/domain/models/HomeNotificationsCenterResponse;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_0
    invoke-static {}, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;->b()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_1
    invoke-static {}, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_2
    invoke-static {}, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;->c()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_3
    invoke-static {}, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayGroupModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_4
    invoke-static {}, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBar;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_5
    invoke-static {}, Lqc1/b;->a()Ljb1/a;

    move-result-object v0

    return-object v0

    :pswitch_6
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "CompositionLocal LocalSavedStateRegistryOwner not present"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_7
    invoke-static {}, Lcom/whoop/design/models/items/graph/plot/line/LineSegmentModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_8
    invoke-static {}, Lcom/whoop/design/models/items/graph/plot/line/LineSegmentModel;->b()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_9
    invoke-static {}, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_a
    invoke-static {}, Lcom/whoop/service/rearchitect/c$c;->d()Lg83/b;

    move-result-object v0

    return-object v0

    :pswitch_b
    invoke-static {}, Lq82/a;->d()Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_c
    invoke-static {}, Lpl0/c;->n()Ljb1/a;

    move-result-object v0

    return-object v0

    :pswitch_d
    invoke-static {}, Lpc1/c;->b()Ljb1/a;

    move-result-object v0

    return-object v0

    :pswitch_e
    const-string v0, "Unexpected call to default provider"

    invoke-static {v0}, Lp1/r;->d(Ljava/lang/String;)Ljava/lang/Void;

    new-instance v0, Lkotlin/KotlinNothingValueException;

    invoke-direct {v0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v0

    :pswitch_f
    invoke-static {}, Lcom/whoop/util/TrendKey;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_10
    invoke-static {}, Lor2/i0;->a()Lcom/google/gson/Gson;

    move-result-object v0

    return-object v0

    :pswitch_11
    invoke-static {}, Lcom/whoop/cache/api/prefetch/PrefetchList;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_12
    invoke-static {}, Lcom/whoop/cache/api/prefetch/PrefetchEntry;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_13
    invoke-static {}, Lny0/u;->e()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_14
    invoke-static {}, Lnd1/i;->y()Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_15
    invoke-static {}, Lcom/whoop/design/models/items/graph/plot/UnknownPlotModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_16
    invoke-static {}, Lcom/whoop/design/models/items/graph/plot/OverlayPlotModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_17
    invoke-static {}, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;->b()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_18
    invoke-static {}, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_19
    invoke-static {}, Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_1a
    new-instance v0, Lbe/g;

    invoke-direct {v0}, Lbe/g;-><init>()V

    return-object v0

    :pswitch_1b
    invoke-static {}, Lmd0/c;->u()Llb1/y0;

    move-result-object v0

    return-object v0

    :pswitch_1c
    invoke-static {}, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
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
