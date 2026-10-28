.class public final Lcom/whoop/design/models/items/graph/ZoomableGraphModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/graph/ZoomableGraphModel$$serializer;,
        Lcom/whoop/design/models/items/graph/ZoomableGraphModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0011\u0008\u0087\u0008\u0018\u0000 A2\u00020\u0001:\u0002BABI\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\t\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b\u0012\u0008\u0008\u0002\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u000f\u0010\u0010B[\u0008\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0004\u0008\u000f\u0010\u0015J\'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0016\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u0010\u0010%\u001a\u00020\tH\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010&J\u0010\u0010\'\u001a\u00020\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010(J\u0010\u0010)\u001a\u00020\rH\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010*JR\u0010+\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0008\u0008\u0002\u0010\n\u001a\u00020\t2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\rH\u00c6\u0001\u00a2\u0006\u0004\u0008+\u0010,J\u0010\u0010-\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008-\u0010 J\u0010\u0010.\u001a\u00020\u0011H\u00d6\u0001\u00a2\u0006\u0004\u0008.\u0010/J\u001a\u00103\u001a\u0002022\u0008\u00101\u001a\u0004\u0018\u000100H\u00d6\u0003\u00a2\u0006\u0004\u00083\u00104R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00105\u001a\u0004\u00086\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00107\u001a\u0004\u00088\u0010\"R\u001d\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00109\u001a\u0004\u0008:\u0010$R\u0017\u0010\n\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010;\u001a\u0004\u0008<\u0010&R\u0017\u0010\u000c\u001a\u00020\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010=\u001a\u0004\u0008>\u0010(R\u0017\u0010\u000e\u001a\u00020\r8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010?\u001a\u0004\u0008@\u0010*\u00a8\u0006C"
    }
    d2 = {
        "Lcom/whoop/design/models/items/graph/ZoomableGraphModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "id",
        "Lcom/whoop/design/models/items/graph/ScrollableGraphPlaneModel;",
        "plane",
        "",
        "Lcom/whoop/design/models/items/graph/plot/GraphPlot;",
        "plots",
        "",
        "scrollWidthMultiplier",
        "Lcom/whoop/design/models/items/graph/ZoomableGraphZoomLevelModel;",
        "zoomLevel",
        "Lcom/whoop/design/models/items/graph/ZoomToggleModel;",
        "zoomToggle",
        "<init>",
        "(Ljava/lang/String;Lcom/whoop/design/models/items/graph/ScrollableGraphPlaneModel;Ljava/util/List;DLcom/whoop/design/models/items/graph/ZoomableGraphZoomLevelModel;Lcom/whoop/design/models/items/graph/ZoomToggleModel;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Lcom/whoop/design/models/items/graph/ScrollableGraphPlaneModel;Ljava/util/List;DLcom/whoop/design/models/items/graph/ZoomableGraphZoomLevelModel;Lcom/whoop/design/models/items/graph/ZoomToggleModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$design_models_release",
        "(Lcom/whoop/design/models/items/graph/ZoomableGraphModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()Lcom/whoop/design/models/items/graph/ScrollableGraphPlaneModel;",
        "component3",
        "()Ljava/util/List;",
        "component4",
        "()D",
        "component5",
        "()Lcom/whoop/design/models/items/graph/ZoomableGraphZoomLevelModel;",
        "component6",
        "()Lcom/whoop/design/models/items/graph/ZoomToggleModel;",
        "copy",
        "(Ljava/lang/String;Lcom/whoop/design/models/items/graph/ScrollableGraphPlaneModel;Ljava/util/List;DLcom/whoop/design/models/items/graph/ZoomableGraphZoomLevelModel;Lcom/whoop/design/models/items/graph/ZoomToggleModel;)Lcom/whoop/design/models/items/graph/ZoomableGraphModel;",
        "toString",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getId",
        "Lcom/whoop/design/models/items/graph/ScrollableGraphPlaneModel;",
        "getPlane",
        "Ljava/util/List;",
        "getPlots",
        "D",
        "getScrollWidthMultiplier",
        "Lcom/whoop/design/models/items/graph/ZoomableGraphZoomLevelModel;",
        "getZoomLevel",
        "Lcom/whoop/design/models/items/graph/ZoomToggleModel;",
        "getZoomToggle",
        "Companion",
        "$serializer",
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
.end annotation


# static fields
.field private static final $childSerializers:[Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ll83/h;"
        }
    .end annotation
.end field

.field public static final $stable:I

.field public static final Companion:Lcom/whoop/design/models/items/graph/ZoomableGraphModel$Companion;


# instance fields
.field private final id:Ljava/lang/String;

.field private final plane:Lcom/whoop/design/models/items/graph/ScrollableGraphPlaneModel;

.field private final plots:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/graph/plot/GraphPlot;",
            ">;"
        }
    .end annotation
.end field

.field private final scrollWidthMultiplier:D

.field private final zoomLevel:Lcom/whoop/design/models/items/graph/ZoomableGraphZoomLevelModel;

.field private final zoomToggle:Lcom/whoop/design/models/items/graph/ZoomToggleModel;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/design/models/items/graph/ZoomableGraphModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/graph/ZoomableGraphModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/graph/ZoomableGraphModel;->Companion:Lcom/whoop/design/models/items/graph/ZoomableGraphModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/design/models/items/graph/ZoomableGraphModel;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lga1/a;

    const/4 v3, 0x2

    invoke-direct {v2, v3}, Lga1/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v2, 0x6

    new-array v2, v2, [Ll83/h;

    const/4 v4, 0x0

    aput-object v1, v2, v4

    const/4 v4, 0x1

    aput-object v1, v2, v4

    aput-object v0, v2, v3

    const/4 v0, 0x3

    aput-object v1, v2, v0

    const/4 v0, 0x4

    aput-object v1, v2, v0

    const/4 v0, 0x5

    aput-object v1, v2, v0

    sput-object v2, Lcom/whoop/design/models/items/graph/ZoomableGraphModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public constructor <init>()V
    .locals 10

    .line 1
    const/16 v8, 0x3f

    const/4 v9, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v9}, Lcom/whoop/design/models/items/graph/ZoomableGraphModel;-><init>(Ljava/lang/String;Lcom/whoop/design/models/items/graph/ScrollableGraphPlaneModel;Ljava/util/List;DLcom/whoop/design/models/items/graph/ZoomableGraphZoomLevelModel;Lcom/whoop/design/models/items/graph/ZoomToggleModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Lcom/whoop/design/models/items/graph/ScrollableGraphPlaneModel;Ljava/util/List;DLcom/whoop/design/models/items/graph/ZoomableGraphZoomLevelModel;Lcom/whoop/design/models/items/graph/ZoomToggleModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 6

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p9, p1, 0x1

    if-nez p9, :cond_0

    .line 3
    const-string p2, "zoomablegraph"

    .line 4
    :cond_0
    iput-object p2, p0, Lcom/whoop/design/models/items/graph/ZoomableGraphModel;->id:Ljava/lang/String;

    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_1

    .line 5
    new-instance v0, Lcom/whoop/design/models/items/graph/ScrollableGraphPlaneModel;

    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/whoop/design/models/items/graph/ScrollableGraphPlaneModel;-><init>(Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;Lcom/whoop/design/models/items/graph/plane/GraphAccessibilityModel;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 6
    iput-object v0, p0, Lcom/whoop/design/models/items/graph/ZoomableGraphModel;->plane:Lcom/whoop/design/models/items/graph/ScrollableGraphPlaneModel;

    goto :goto_0

    :cond_1
    iput-object p3, p0, Lcom/whoop/design/models/items/graph/ZoomableGraphModel;->plane:Lcom/whoop/design/models/items/graph/ScrollableGraphPlaneModel;

    :goto_0
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    .line 7
    sget-object p2, Lm83/y;->w:Lm83/y;

    .line 8
    iput-object p2, p0, Lcom/whoop/design/models/items/graph/ZoomableGraphModel;->plots:Ljava/util/List;

    goto :goto_1

    :cond_2
    iput-object p4, p0, Lcom/whoop/design/models/items/graph/ZoomableGraphModel;->plots:Ljava/util/List;

    :goto_1
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_3

    const-wide/high16 p2, 0x3ff0000000000000L    # 1.0

    iput-wide p2, p0, Lcom/whoop/design/models/items/graph/ZoomableGraphModel;->scrollWidthMultiplier:D

    goto :goto_2

    :cond_3
    iput-wide p5, p0, Lcom/whoop/design/models/items/graph/ZoomableGraphModel;->scrollWidthMultiplier:D

    :goto_2
    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_4

    .line 9
    new-instance v0, Lcom/whoop/design/models/items/graph/ZoomableGraphZoomLevelModel;

    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/whoop/design/models/items/graph/ZoomableGraphZoomLevelModel;-><init>(FFFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 10
    iput-object v0, p0, Lcom/whoop/design/models/items/graph/ZoomableGraphModel;->zoomLevel:Lcom/whoop/design/models/items/graph/ZoomableGraphZoomLevelModel;

    goto :goto_3

    :cond_4
    iput-object p7, p0, Lcom/whoop/design/models/items/graph/ZoomableGraphModel;->zoomLevel:Lcom/whoop/design/models/items/graph/ZoomableGraphZoomLevelModel;

    :goto_3
    and-int/lit8 p1, p1, 0x20

    if-nez p1, :cond_5

    .line 11
    new-instance p1, Lcom/whoop/design/models/items/graph/ZoomToggleModel;

    const/4 p2, 0x3

    const/4 p3, 0x0

    const/4 p4, 0x0

    invoke-direct {p1, p4, p4, p2, p3}, Lcom/whoop/design/models/items/graph/ZoomToggleModel;-><init>(FFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 12
    iput-object p1, p0, Lcom/whoop/design/models/items/graph/ZoomableGraphModel;->zoomToggle:Lcom/whoop/design/models/items/graph/ZoomToggleModel;

    return-void

    :cond_5
    iput-object p8, p0, Lcom/whoop/design/models/items/graph/ZoomableGraphModel;->zoomToggle:Lcom/whoop/design/models/items/graph/ZoomToggleModel;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/whoop/design/models/items/graph/ScrollableGraphPlaneModel;Ljava/util/List;DLcom/whoop/design/models/items/graph/ZoomableGraphZoomLevelModel;Lcom/whoop/design/models/items/graph/ZoomToggleModel;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/items/graph/ScrollableGraphPlaneModel;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/items/graph/plot/GraphPlot;",
            ">;D",
            "Lcom/whoop/design/models/items/graph/ZoomableGraphZoomLevelModel;",
            "Lcom/whoop/design/models/items/graph/ZoomToggleModel;",
            ")V"
        }
    .end annotation

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "plane"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "plots"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "zoomLevel"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "zoomToggle"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput-object p1, p0, Lcom/whoop/design/models/items/graph/ZoomableGraphModel;->id:Ljava/lang/String;

    .line 15
    iput-object p2, p0, Lcom/whoop/design/models/items/graph/ZoomableGraphModel;->plane:Lcom/whoop/design/models/items/graph/ScrollableGraphPlaneModel;

    .line 16
    iput-object p3, p0, Lcom/whoop/design/models/items/graph/ZoomableGraphModel;->plots:Ljava/util/List;

    .line 17
    iput-wide p4, p0, Lcom/whoop/design/models/items/graph/ZoomableGraphModel;->scrollWidthMultiplier:D

    .line 18
    iput-object p6, p0, Lcom/whoop/design/models/items/graph/ZoomableGraphModel;->zoomLevel:Lcom/whoop/design/models/items/graph/ZoomableGraphZoomLevelModel;

    .line 19
    iput-object p7, p0, Lcom/whoop/design/models/items/graph/ZoomableGraphModel;->zoomToggle:Lcom/whoop/design/models/items/graph/ZoomToggleModel;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lcom/whoop/design/models/items/graph/ScrollableGraphPlaneModel;Ljava/util/List;DLcom/whoop/design/models/items/graph/ZoomableGraphZoomLevelModel;Lcom/whoop/design/models/items/graph/ZoomToggleModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    .line 20
    const-string p1, "zoomablegraph"

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    .line 21
    new-instance v0, Lcom/whoop/design/models/items/graph/ScrollableGraphPlaneModel;

    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/whoop/design/models/items/graph/ScrollableGraphPlaneModel;-><init>(Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;Lcom/whoop/design/models/items/graph/plane/GraphAccessibilityModel;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object p2, v0

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    .line 22
    sget-object p3, Lm83/y;->w:Lm83/y;

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    const-wide/high16 p4, 0x3ff0000000000000L    # 1.0

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    .line 23
    new-instance v0, Lcom/whoop/design/models/items/graph/ZoomableGraphZoomLevelModel;

    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/whoop/design/models/items/graph/ZoomableGraphZoomLevelModel;-><init>(FFFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object p6, v0

    :cond_4
    and-int/lit8 p8, p8, 0x20

    if-eqz p8, :cond_5

    .line 24
    new-instance p7, Lcom/whoop/design/models/items/graph/ZoomToggleModel;

    const/4 p8, 0x3

    const/4 p9, 0x0

    const/4 v0, 0x0

    invoke-direct {p7, v0, v0, p8, p9}, Lcom/whoop/design/models/items/graph/ZoomToggleModel;-><init>(FFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_5
    move-object p8, p6

    move-object p9, p7

    move-wide p6, p4

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    .line 25
    invoke-direct/range {p2 .. p9}, Lcom/whoop/design/models/items/graph/ZoomableGraphModel;-><init>(Ljava/lang/String;Lcom/whoop/design/models/items/graph/ScrollableGraphPlaneModel;Ljava/util/List;DLcom/whoop/design/models/items/graph/ZoomableGraphZoomLevelModel;Lcom/whoop/design/models/items/graph/ZoomToggleModel;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lo91/e;->a:Lo91/e;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/graph/ZoomableGraphModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/graph/ZoomableGraphModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/graph/ZoomableGraphModel;Ljava/lang/String;Lcom/whoop/design/models/items/graph/ScrollableGraphPlaneModel;Ljava/util/List;DLcom/whoop/design/models/items/graph/ZoomableGraphZoomLevelModel;Lcom/whoop/design/models/items/graph/ZoomToggleModel;ILjava/lang/Object;)Lcom/whoop/design/models/items/graph/ZoomableGraphModel;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lcom/whoop/design/models/items/graph/ZoomableGraphModel;->id:Ljava/lang/String;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lcom/whoop/design/models/items/graph/ZoomableGraphModel;->plane:Lcom/whoop/design/models/items/graph/ScrollableGraphPlaneModel;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-object p3, p0, Lcom/whoop/design/models/items/graph/ZoomableGraphModel;->plots:Ljava/util/List;

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-wide p4, p0, Lcom/whoop/design/models/items/graph/ZoomableGraphModel;->scrollWidthMultiplier:D

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-object p6, p0, Lcom/whoop/design/models/items/graph/ZoomableGraphModel;->zoomLevel:Lcom/whoop/design/models/items/graph/ZoomableGraphZoomLevelModel;

    :cond_4
    and-int/lit8 p8, p8, 0x20

    if-eqz p8, :cond_5

    iget-object p7, p0, Lcom/whoop/design/models/items/graph/ZoomableGraphModel;->zoomToggle:Lcom/whoop/design/models/items/graph/ZoomToggleModel;

    :cond_5
    move-object p8, p6

    move-object p9, p7

    move-wide p6, p4

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/whoop/design/models/items/graph/ZoomableGraphModel;->copy(Ljava/lang/String;Lcom/whoop/design/models/items/graph/ScrollableGraphPlaneModel;Ljava/util/List;DLcom/whoop/design/models/items/graph/ZoomableGraphZoomLevelModel;Lcom/whoop/design/models/items/graph/ZoomToggleModel;)Lcom/whoop/design/models/items/graph/ZoomableGraphModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/graph/ZoomableGraphModel;Lzc3/c;Lyc3/g;)V
    .locals 9

    sget-object v0, Lcom/whoop/design/models/items/graph/ZoomableGraphModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/design/models/items/graph/ZoomableGraphModel;->id:Ljava/lang/String;

    const-string v3, "zoomablegraph"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    :goto_0
    iget-object v2, p0, Lcom/whoop/design/models/items/graph/ZoomableGraphModel;->id:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_1
    const/4 v1, 0x1

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/design/models/items/graph/ZoomableGraphModel;->plane:Lcom/whoop/design/models/items/graph/ScrollableGraphPlaneModel;

    new-instance v3, Lcom/whoop/design/models/items/graph/ScrollableGraphPlaneModel;

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v3 .. v8}, Lcom/whoop/design/models/items/graph/ScrollableGraphPlaneModel;-><init>(Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;Lcom/whoop/design/models/items/graph/plane/GraphAccessibilityModel;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    :goto_1
    sget-object v2, Lcom/whoop/design/models/items/graph/ScrollableGraphPlaneModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/graph/ScrollableGraphPlaneModel$$serializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/graph/ZoomableGraphModel;->plane:Lcom/whoop/design/models/items/graph/ScrollableGraphPlaneModel;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v1, 0x2

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/whoop/design/models/items/graph/ZoomableGraphModel;->plots:Ljava/util/List;

    sget-object v3, Lm83/y;->w:Lm83/y;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    :goto_2
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/ZoomableGraphModel;->plots:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v0, 0x3

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_3

    :cond_6
    iget-wide v1, p0, Lcom/whoop/design/models/items/graph/ZoomableGraphModel;->scrollWidthMultiplier:D

    const-wide/high16 v3, 0x3ff0000000000000L    # 1.0

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_7

    :goto_3
    iget-wide v1, p0, Lcom/whoop/design/models/items/graph/ZoomableGraphModel;->scrollWidthMultiplier:D

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeDoubleElement(Lyc3/g;ID)V

    :cond_7
    const/4 v1, 0x4

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_8

    goto :goto_4

    :cond_8
    iget-object v2, p0, Lcom/whoop/design/models/items/graph/ZoomableGraphModel;->zoomLevel:Lcom/whoop/design/models/items/graph/ZoomableGraphZoomLevelModel;

    new-instance v3, Lcom/whoop/design/models/items/graph/ZoomableGraphZoomLevelModel;

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v3 .. v8}, Lcom/whoop/design/models/items/graph/ZoomableGraphZoomLevelModel;-><init>(FFFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_9

    :goto_4
    sget-object v2, Lcom/whoop/design/models/items/graph/ZoomableGraphZoomLevelModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/graph/ZoomableGraphZoomLevelModel$$serializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/graph/ZoomableGraphModel;->zoomLevel:Lcom/whoop/design/models/items/graph/ZoomableGraphZoomLevelModel;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    const/4 v1, 0x5

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_a

    goto :goto_5

    :cond_a
    iget-object v2, p0, Lcom/whoop/design/models/items/graph/ZoomableGraphModel;->zoomToggle:Lcom/whoop/design/models/items/graph/ZoomToggleModel;

    new-instance v3, Lcom/whoop/design/models/items/graph/ZoomToggleModel;

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct {v3, v5, v5, v0, v4}, Lcom/whoop/design/models/items/graph/ZoomToggleModel;-><init>(FFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    :goto_5
    sget-object v0, Lcom/whoop/design/models/items/graph/ZoomToggleModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/graph/ZoomToggleModel$$serializer;

    iget-object p0, p0, Lcom/whoop/design/models/items/graph/ZoomableGraphModel;->zoomToggle:Lcom/whoop/design/models/items/graph/ZoomToggleModel;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_b
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/ZoomableGraphModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Lcom/whoop/design/models/items/graph/ScrollableGraphPlaneModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/ZoomableGraphModel;->plane:Lcom/whoop/design/models/items/graph/ScrollableGraphPlaneModel;

    return-object v0
.end method

.method public final component3()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/graph/plot/GraphPlot;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/ZoomableGraphModel;->plots:Ljava/util/List;

    return-object v0
.end method

.method public final component4()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/design/models/items/graph/ZoomableGraphModel;->scrollWidthMultiplier:D

    return-wide v0
.end method

.method public final component5()Lcom/whoop/design/models/items/graph/ZoomableGraphZoomLevelModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/ZoomableGraphModel;->zoomLevel:Lcom/whoop/design/models/items/graph/ZoomableGraphZoomLevelModel;

    return-object v0
.end method

.method public final component6()Lcom/whoop/design/models/items/graph/ZoomToggleModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/ZoomableGraphModel;->zoomToggle:Lcom/whoop/design/models/items/graph/ZoomToggleModel;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Lcom/whoop/design/models/items/graph/ScrollableGraphPlaneModel;Ljava/util/List;DLcom/whoop/design/models/items/graph/ZoomableGraphZoomLevelModel;Lcom/whoop/design/models/items/graph/ZoomToggleModel;)Lcom/whoop/design/models/items/graph/ZoomableGraphModel;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/items/graph/ScrollableGraphPlaneModel;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/items/graph/plot/GraphPlot;",
            ">;D",
            "Lcom/whoop/design/models/items/graph/ZoomableGraphZoomLevelModel;",
            "Lcom/whoop/design/models/items/graph/ZoomToggleModel;",
            ")",
            "Lcom/whoop/design/models/items/graph/ZoomableGraphModel;"
        }
    .end annotation

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "plane"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "plots"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "zoomLevel"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "zoomToggle"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/items/graph/ZoomableGraphModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-wide v5, p4

    move-object v7, p6

    invoke-direct/range {v1 .. v8}, Lcom/whoop/design/models/items/graph/ZoomableGraphModel;-><init>(Ljava/lang/String;Lcom/whoop/design/models/items/graph/ScrollableGraphPlaneModel;Ljava/util/List;DLcom/whoop/design/models/items/graph/ZoomableGraphZoomLevelModel;Lcom/whoop/design/models/items/graph/ZoomToggleModel;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/graph/ZoomableGraphModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/graph/ZoomableGraphModel;

    iget-object v1, p0, Lcom/whoop/design/models/items/graph/ZoomableGraphModel;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/ZoomableGraphModel;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/ZoomableGraphModel;->plane:Lcom/whoop/design/models/items/graph/ScrollableGraphPlaneModel;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/ZoomableGraphModel;->plane:Lcom/whoop/design/models/items/graph/ScrollableGraphPlaneModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/ZoomableGraphModel;->plots:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/ZoomableGraphModel;->plots:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Lcom/whoop/design/models/items/graph/ZoomableGraphModel;->scrollWidthMultiplier:D

    iget-wide v5, p1, Lcom/whoop/design/models/items/graph/ZoomableGraphModel;->scrollWidthMultiplier:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/ZoomableGraphModel;->zoomLevel:Lcom/whoop/design/models/items/graph/ZoomableGraphZoomLevelModel;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/ZoomableGraphModel;->zoomLevel:Lcom/whoop/design/models/items/graph/ZoomableGraphZoomLevelModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/ZoomableGraphModel;->zoomToggle:Lcom/whoop/design/models/items/graph/ZoomToggleModel;

    iget-object p1, p1, Lcom/whoop/design/models/items/graph/ZoomableGraphModel;->zoomToggle:Lcom/whoop/design/models/items/graph/ZoomToggleModel;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/ZoomableGraphModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getPlane()Lcom/whoop/design/models/items/graph/ScrollableGraphPlaneModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/ZoomableGraphModel;->plane:Lcom/whoop/design/models/items/graph/ScrollableGraphPlaneModel;

    return-object v0
.end method

.method public final getPlots()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/graph/plot/GraphPlot;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/ZoomableGraphModel;->plots:Ljava/util/List;

    return-object v0
.end method

.method public final getScrollWidthMultiplier()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/design/models/items/graph/ZoomableGraphModel;->scrollWidthMultiplier:D

    return-wide v0
.end method

.method public final getZoomLevel()Lcom/whoop/design/models/items/graph/ZoomableGraphZoomLevelModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/ZoomableGraphModel;->zoomLevel:Lcom/whoop/design/models/items/graph/ZoomableGraphZoomLevelModel;

    return-object v0
.end method

.method public final getZoomToggle()Lcom/whoop/design/models/items/graph/ZoomToggleModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/ZoomableGraphModel;->zoomToggle:Lcom/whoop/design/models/items/graph/ZoomToggleModel;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/ZoomableGraphModel;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/ZoomableGraphModel;->plane:Lcom/whoop/design/models/items/graph/ScrollableGraphPlaneModel;

    invoke-virtual {v2}, Lcom/whoop/design/models/items/graph/ScrollableGraphPlaneModel;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/ZoomableGraphModel;->plots:Ljava/util/List;

    invoke-static {v2, v1, v0}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-wide v2, p0, Lcom/whoop/design/models/items/graph/ZoomableGraphModel;->scrollWidthMultiplier:D

    invoke-static {v0, v1, v2, v3}, Lhc3/i;->a(IID)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/ZoomableGraphModel;->zoomLevel:Lcom/whoop/design/models/items/graph/ZoomableGraphZoomLevelModel;

    invoke-virtual {v2}, Lcom/whoop/design/models/items/graph/ZoomableGraphZoomLevelModel;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/ZoomableGraphModel;->zoomToggle:Lcom/whoop/design/models/items/graph/ZoomToggleModel;

    invoke-virtual {v0}, Lcom/whoop/design/models/items/graph/ZoomToggleModel;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/ZoomableGraphModel;->id:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/design/models/items/graph/ZoomableGraphModel;->plane:Lcom/whoop/design/models/items/graph/ScrollableGraphPlaneModel;

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/ZoomableGraphModel;->plots:Ljava/util/List;

    iget-wide v3, p0, Lcom/whoop/design/models/items/graph/ZoomableGraphModel;->scrollWidthMultiplier:D

    iget-object v5, p0, Lcom/whoop/design/models/items/graph/ZoomableGraphModel;->zoomLevel:Lcom/whoop/design/models/items/graph/ZoomableGraphZoomLevelModel;

    iget-object v6, p0, Lcom/whoop/design/models/items/graph/ZoomableGraphModel;->zoomToggle:Lcom/whoop/design/models/items/graph/ZoomToggleModel;

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "ZoomableGraphModel(id="

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", plane="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", plots="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", scrollWidthMultiplier="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, ", zoomLevel="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", zoomToggle="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
