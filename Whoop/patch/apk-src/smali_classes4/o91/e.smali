.class public final Lo91/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwc3/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo91/e$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwc3/c;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u001f\u0010\r\u001a\u00020\u000c2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u000f8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0014"
    }
    d2 = {
        "Lo91/e;",
        "Lwc3/c;",
        "Lcom/whoop/design/models/items/graph/plot/GraphPlot;",
        "<init>",
        "()V",
        "Lzc3/d;",
        "decoder",
        "b",
        "(Lzc3/d;)Lcom/whoop/design/models/items/graph/plot/GraphPlot;",
        "Lzc3/e;",
        "encoder",
        "value",
        "Ll83/a0;",
        "c",
        "(Lzc3/e;Lcom/whoop/design/models/items/graph/plot/GraphPlot;)V",
        "Lyc3/g;",
        "Lyc3/g;",
        "getDescriptor",
        "()Lyc3/g;",
        "descriptor",
        "design-models_release"
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
.field public static final a:Lo91/e;

.field private static final b:Lyc3/g;

.field public static final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lo91/e;

    invoke-direct {v0}, Lo91/e;-><init>()V

    sput-object v0, Lo91/e;->a:Lo91/e;

    const/4 v0, 0x0

    new-array v0, v0, [Lyc3/g;

    const-string v2, "GraphPlot"

    invoke-static {v2}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    new-instance v6, Lyc3/a;

    invoke-direct {v6, v2}, Lyc3/a;-><init>(Ljava/lang/String;)V

    invoke-static {v6}, Lo91/e;->a(Lyc3/a;)Ll83/a0;

    new-instance v1, Lyc3/h;

    sget-object v3, Lyc3/l;->a:Lyc3/l;

    iget-object v4, v6, Lyc3/a;->c:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    invoke-static {v0}, Lm83/n;->W0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    invoke-direct/range {v1 .. v6}, Lyc3/h;-><init>(Ljava/lang/String;Lyc3/k;ILjava/util/List;Lyc3/a;)V

    sput-object v1, Lo91/e;->b:Lyc3/g;

    const/16 v0, 0x8

    sput v0, Lo91/e;->c:I

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Blank serial names are prohibited"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final a(Lyc3/a;)Ll83/a0;
    .locals 3

    const-string v0, "$this$buildClassSerialDescriptor"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-interface {v0}, Lwc3/j;->getDescriptor()Lyc3/g;

    move-result-object v0

    const-string v1, "type"

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v0, v2}, Lyc3/a;->a(Ljava/lang/String;Lyc3/g;Z)V

    sget-object v0, Lkotlinx/serialization/json/JsonElement;->Companion:Lad3/l;

    invoke-virtual {v0}, Lad3/l;->serializer()Lwc3/c;

    move-result-object v0

    invoke-interface {v0}, Lwc3/j;->getDescriptor()Lyc3/g;

    move-result-object v0

    const-string v1, "plot"

    invoke-virtual {p0, v1, v0, v2}, Lyc3/a;->a(Ljava/lang/String;Lyc3/g;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public b(Lzc3/d;)Lcom/whoop/design/models/items/graph/plot/GraphPlot;
    .locals 3

    const-string v0, "decoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lad3/k;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Lad3/k;

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    if-eqz p1, :cond_3

    invoke-interface {p1}, Lad3/k;->b()Lkotlinx/serialization/json/JsonElement;

    move-result-object v0

    invoke-static {v0}, Lad3/m;->i(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonObject;

    move-result-object v0

    const-string v2, "type"

    invoke-virtual {v0, v2}, Lkotlinx/serialization/json/JsonObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkotlinx/serialization/json/JsonElement;

    if-eqz v2, :cond_1

    invoke-static {v2}, Lad3/m;->j(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v1

    invoke-static {v1}, Lad3/m;->f(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/String;

    move-result-object v1

    :cond_1
    const-string v2, "plot"

    invoke-virtual {v0, v2}, Lkotlinx/serialization/json/JsonObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlinx/serialization/json/JsonElement;

    if-eqz v0, :cond_2

    sget-object v2, Lcom/whoop/design/models/items/graph/plot/PlotModelType;->Companion:Lcom/whoop/design/models/items/graph/plot/PlotModelType$Companion;

    invoke-virtual {v2, v1}, Lcom/whoop/design/models/items/graph/plot/PlotModelType$Companion;->fromType(Ljava/lang/String;)Lcom/whoop/design/models/items/graph/plot/PlotModelType;

    move-result-object v1

    sget-object v2, Lo91/e$a;->a:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v2, v1

    packed-switch v1, :pswitch_data_0

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_0
    invoke-interface {p1}, Lad3/k;->a()Lad3/c;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Lcom/whoop/design/models/items/graph/plot/XLabelPlotModel;->Companion:Lcom/whoop/design/models/items/graph/plot/XLabelPlotModel$Companion;

    invoke-virtual {v1}, Lcom/whoop/design/models/items/graph/plot/XLabelPlotModel$Companion;->serializer()Lwc3/c;

    move-result-object v1

    check-cast v1, Lwc3/b;

    invoke-virtual {p1, v1, v0}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/design/models/items/graph/plot/GraphPlot;

    return-object p1

    :pswitch_1
    invoke-interface {p1}, Lad3/k;->a()Lad3/c;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Lcom/whoop/design/models/items/graph/plot/VerticalMarkerPlotModel;->Companion:Lcom/whoop/design/models/items/graph/plot/VerticalMarkerPlotModel$Companion;

    invoke-virtual {v1}, Lcom/whoop/design/models/items/graph/plot/VerticalMarkerPlotModel$Companion;->serializer()Lwc3/c;

    move-result-object v1

    check-cast v1, Lwc3/b;

    invoke-virtual {p1, v1, v0}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/design/models/items/graph/plot/GraphPlot;

    return-object p1

    :pswitch_2
    sget-object p1, Lcom/whoop/design/models/items/graph/plot/UnknownPlotModel;->INSTANCE:Lcom/whoop/design/models/items/graph/plot/UnknownPlotModel;

    return-object p1

    :pswitch_3
    invoke-interface {p1}, Lad3/k;->a()Lad3/c;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Lcom/whoop/design/models/items/graph/plot/TrendPlotModel;->Companion:Lcom/whoop/design/models/items/graph/plot/TrendPlotModel$Companion;

    invoke-virtual {v1}, Lcom/whoop/design/models/items/graph/plot/TrendPlotModel$Companion;->serializer()Lwc3/c;

    move-result-object v1

    check-cast v1, Lwc3/b;

    invoke-virtual {p1, v1, v0}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/design/models/items/graph/plot/GraphPlot;

    return-object p1

    :pswitch_4
    invoke-interface {p1}, Lad3/k;->a()Lad3/c;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->Companion:Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel$Companion;

    invoke-virtual {v1}, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel$Companion;->serializer()Lwc3/c;

    move-result-object v1

    check-cast v1, Lwc3/b;

    invoke-virtual {p1, v1, v0}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/design/models/items/graph/plot/GraphPlot;

    return-object p1

    :pswitch_5
    invoke-interface {p1}, Lad3/k;->a()Lad3/c;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Lcom/whoop/design/models/items/graph/plot/OverlayPlotModel;->Companion:Lcom/whoop/design/models/items/graph/plot/OverlayPlotModel$Companion;

    invoke-virtual {v1}, Lcom/whoop/design/models/items/graph/plot/OverlayPlotModel$Companion;->serializer()Lwc3/c;

    move-result-object v1

    check-cast v1, Lwc3/b;

    invoke-virtual {p1, v1, v0}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/design/models/items/graph/plot/GraphPlot;

    return-object p1

    :pswitch_6
    invoke-interface {p1}, Lad3/k;->a()Lad3/c;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;->Companion:Lcom/whoop/design/models/items/graph/plot/LinePlotModel$Companion;

    invoke-virtual {v1}, Lcom/whoop/design/models/items/graph/plot/LinePlotModel$Companion;->serializer()Lwc3/c;

    move-result-object v1

    check-cast v1, Lwc3/b;

    invoke-virtual {p1, v1, v0}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/design/models/items/graph/plot/GraphPlot;

    return-object p1

    :pswitch_7
    invoke-interface {p1}, Lad3/k;->a()Lad3/c;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Lcom/whoop/design/models/items/graph/plot/IconPlotModel;->Companion:Lcom/whoop/design/models/items/graph/plot/IconPlotModel$Companion;

    invoke-virtual {v1}, Lcom/whoop/design/models/items/graph/plot/IconPlotModel$Companion;->serializer()Lwc3/c;

    move-result-object v1

    check-cast v1, Lwc3/b;

    invoke-virtual {p1, v1, v0}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/design/models/items/graph/plot/GraphPlot;

    return-object p1

    :pswitch_8
    invoke-interface {p1}, Lad3/k;->a()Lad3/c;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Lcom/whoop/design/models/items/graph/plot/FinalMarkerPlotModel;->Companion:Lcom/whoop/design/models/items/graph/plot/FinalMarkerPlotModel$Companion;

    invoke-virtual {v1}, Lcom/whoop/design/models/items/graph/plot/FinalMarkerPlotModel$Companion;->serializer()Lwc3/c;

    move-result-object v1

    check-cast v1, Lwc3/b;

    invoke-virtual {p1, v1, v0}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/design/models/items/graph/plot/GraphPlot;

    return-object p1

    :pswitch_9
    invoke-interface {p1}, Lad3/k;->a()Lad3/c;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Lcom/whoop/design/models/items/graph/plot/GridLinePlotModel;->Companion:Lcom/whoop/design/models/items/graph/plot/GridLinePlotModel$Companion;

    invoke-virtual {v1}, Lcom/whoop/design/models/items/graph/plot/GridLinePlotModel$Companion;->serializer()Lwc3/c;

    move-result-object v1

    check-cast v1, Lwc3/b;

    invoke-virtual {p1, v1, v0}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/design/models/items/graph/plot/GraphPlot;

    return-object p1

    :pswitch_a
    invoke-interface {p1}, Lad3/k;->a()Lad3/c;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Lcom/whoop/design/models/items/graph/plot/EmptyPlotModel;->Companion:Lcom/whoop/design/models/items/graph/plot/EmptyPlotModel$Companion;

    invoke-virtual {v1}, Lcom/whoop/design/models/items/graph/plot/EmptyPlotModel$Companion;->serializer()Lwc3/c;

    move-result-object v1

    check-cast v1, Lwc3/b;

    invoke-virtual {p1, v1, v0}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/design/models/items/graph/plot/GraphPlot;

    return-object p1

    :pswitch_b
    invoke-interface {p1}, Lad3/k;->a()Lad3/c;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Lcom/whoop/design/models/items/graph/plot/CenterScrubBandPlotModel;->Companion:Lcom/whoop/design/models/items/graph/plot/CenterScrubBandPlotModel$Companion;

    invoke-virtual {v1}, Lcom/whoop/design/models/items/graph/plot/CenterScrubBandPlotModel$Companion;->serializer()Lwc3/c;

    move-result-object v1

    check-cast v1, Lwc3/b;

    invoke-virtual {p1, v1, v0}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/design/models/items/graph/plot/GraphPlot;

    return-object p1

    :pswitch_c
    invoke-interface {p1}, Lad3/k;->a()Lad3/c;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Lcom/whoop/design/models/items/graph/plot/CalibratingPlotModel;->Companion:Lcom/whoop/design/models/items/graph/plot/CalibratingPlotModel$Companion;

    invoke-virtual {v1}, Lcom/whoop/design/models/items/graph/plot/CalibratingPlotModel$Companion;->serializer()Lwc3/c;

    move-result-object v1

    check-cast v1, Lwc3/b;

    invoke-virtual {p1, v1, v0}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/design/models/items/graph/plot/GraphPlot;

    return-object p1

    :pswitch_d
    invoke-interface {p1}, Lad3/k;->a()Lad3/c;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Lcom/whoop/design/models/items/graph/plot/BarPlotModel;->Companion:Lcom/whoop/design/models/items/graph/plot/BarPlotModel$Companion;

    invoke-virtual {v1}, Lcom/whoop/design/models/items/graph/plot/BarPlotModel$Companion;->serializer()Lwc3/c;

    move-result-object v1

    check-cast v1, Lwc3/b;

    invoke-virtual {p1, v1, v0}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/design/models/items/graph/plot/GraphPlot;

    return-object p1

    :pswitch_e
    invoke-interface {p1}, Lad3/k;->a()Lad3/c;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Lcom/whoop/design/models/items/graph/plot/BandPlotModel;->Companion:Lcom/whoop/design/models/items/graph/plot/BandPlotModel$Companion;

    invoke-virtual {v1}, Lcom/whoop/design/models/items/graph/plot/BandPlotModel$Companion;->serializer()Lwc3/c;

    move-result-object v1

    check-cast v1, Lwc3/b;

    invoke-virtual {p1, v1, v0}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/design/models/items/graph/plot/GraphPlot;

    return-object p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Missing plot element"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "GraphPlotSerializer can only be used with JSON"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

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

.method public c(Lzc3/e;Lcom/whoop/design/models/items/graph/plot/GraphPlot;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "value"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "Serialization of GraphPlot is not supported. Avoid calling this method."

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic deserialize(Lzc3/d;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lo91/e;->b(Lzc3/d;)Lcom/whoop/design/models/items/graph/plot/GraphPlot;

    move-result-object p1

    return-object p1
.end method

.method public getDescriptor()Lyc3/g;
    .locals 1

    sget-object v0, Lo91/e;->b:Lyc3/g;

    return-object v0
.end method

.method public bridge synthetic serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lcom/whoop/design/models/items/graph/plot/GraphPlot;

    invoke-virtual {p0, p1, p2}, Lo91/e;->c(Lzc3/e;Lcom/whoop/design/models/items/graph/plot/GraphPlot;)V

    return-void
.end method
