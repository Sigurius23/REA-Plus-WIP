.class public abstract Lcom/whoop/design/models/items/graph/plot/GraphPlot;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/graph/plot/GraphPlot$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u0000 \n2\u00020\u0001:\u0001\nB\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0006\u0010\u0007R\u0014\u0010\u0008\u001a\u0004\u0018\u00010\u0005X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\t\u0010\u0007\u0082\u0001\u000f\u000b\u000c\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/whoop/design/models/items/graph/plot/GraphPlot;",
        "",
        "<init>",
        "()V",
        "hideWhileScrubbing",
        "",
        "getHideWhileScrubbing",
        "()Ljava/lang/Boolean;",
        "skipScrubbing",
        "getSkipScrubbing",
        "Companion",
        "Lcom/whoop/design/models/items/graph/plot/BandPlotModel;",
        "Lcom/whoop/design/models/items/graph/plot/BarPlotModel;",
        "Lcom/whoop/design/models/items/graph/plot/CalibratingPlotModel;",
        "Lcom/whoop/design/models/items/graph/plot/CenterScrubBandPlotModel;",
        "Lcom/whoop/design/models/items/graph/plot/EmptyPlotModel;",
        "Lcom/whoop/design/models/items/graph/plot/FinalMarkerPlotModel;",
        "Lcom/whoop/design/models/items/graph/plot/GridLinePlotModel;",
        "Lcom/whoop/design/models/items/graph/plot/IconPlotModel;",
        "Lcom/whoop/design/models/items/graph/plot/LinePlotModel;",
        "Lcom/whoop/design/models/items/graph/plot/OverlayPlotModel;",
        "Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;",
        "Lcom/whoop/design/models/items/graph/plot/TrendPlotModel;",
        "Lcom/whoop/design/models/items/graph/plot/UnknownPlotModel;",
        "Lcom/whoop/design/models/items/graph/plot/VerticalMarkerPlotModel;",
        "Lcom/whoop/design/models/items/graph/plot/XLabelPlotModel;",
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

.annotation runtime Lwc3/i;
    with = Lo91/e;
.end annotation


# static fields
.field public static final $stable:I

.field public static final Companion:Lcom/whoop/design/models/items/graph/plot/GraphPlot$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/design/models/items/graph/plot/GraphPlot$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/graph/plot/GraphPlot$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/graph/plot/GraphPlot;->Companion:Lcom/whoop/design/models/items/graph/plot/GraphPlot$Companion;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/whoop/design/models/items/graph/plot/GraphPlot;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract getHideWhileScrubbing()Ljava/lang/Boolean;
.end method

.method public abstract getSkipScrubbing()Ljava/lang/Boolean;
.end method
