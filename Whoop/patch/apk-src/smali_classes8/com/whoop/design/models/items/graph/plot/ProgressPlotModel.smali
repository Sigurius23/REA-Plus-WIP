.class public final Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;
.super Lcom/whoop/design/models/items/graph/plot/GraphPlot;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel$$serializer;,
        Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0017\n\u0002\u0010\u0000\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0016\u0008\u0087\u0008\u0018\u0000 I2\u00020\u0001:\u0002JIBq\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c\u0012\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0008\u0012\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\u0010\u0010\u0011Bu\u0008\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\u0004\u0008\u0010\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u001aJ\u0010\u0010!\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\u001aJ\u0010\u0010\"\u001a\u00020\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010%Jz\u0010\'\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\n\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00042\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0008H\u00c6\u0001\u00a2\u0006\u0004\u0008\'\u0010(J\u0010\u0010)\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u0008)\u0010#J\u0010\u0010*\u001a\u00020\u0012H\u00d6\u0001\u00a2\u0006\u0004\u0008*\u0010+J\u001a\u0010.\u001a\u00020\u00082\u0008\u0010-\u001a\u0004\u0018\u00010,H\u00d6\u0003\u00a2\u0006\u0004\u0008.\u0010/J\'\u00108\u001a\u0002052\u0006\u00100\u001a\u00020\u00002\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u000203H\u0001\u00a2\u0006\u0004\u00086\u00107R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00109\u001a\u0004\u0008:\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010;\u001a\u0004\u0008<\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010;\u001a\u0004\u0008=\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010>\u001a\u0004\u0008?\u0010\u001dR\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010@\u001a\u0004\u0008A\u0010\u001fR\u0017\u0010\n\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010;\u001a\u0004\u0008B\u0010\u001aR\u0017\u0010\u000b\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010;\u001a\u0004\u0008C\u0010\u001aR\u0017\u0010\r\u001a\u00020\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010D\u001a\u0004\u0008E\u0010#R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00088\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010F\u001a\u0004\u0008G\u0010%R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00088\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010F\u001a\u0004\u0008H\u0010%\u00a8\u0006K"
    }
    d2 = {
        "Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;",
        "Lcom/whoop/design/models/items/graph/plot/GraphPlot;",
        "Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;",
        "style",
        "",
        "rangeMin",
        "rangeMax",
        "currentValue",
        "",
        "showAnnotation",
        "height",
        "yposition",
        "",
        "id",
        "hideWhileScrubbing",
        "skipScrubbing",
        "<init>",
        "(Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;DDLjava/lang/Double;ZDDLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;DDLjava/lang/Double;ZDDLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;",
        "component2",
        "()D",
        "component3",
        "component4",
        "()Ljava/lang/Double;",
        "component5",
        "()Z",
        "component6",
        "component7",
        "component8",
        "()Ljava/lang/String;",
        "component9",
        "()Ljava/lang/Boolean;",
        "component10",
        "copy",
        "(Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;DDLjava/lang/Double;ZDDLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;",
        "toString",
        "hashCode",
        "()I",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$design_models_release",
        "(Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;",
        "getStyle",
        "D",
        "getRangeMin",
        "getRangeMax",
        "Ljava/lang/Double;",
        "getCurrentValue",
        "Z",
        "getShowAnnotation",
        "getHeight",
        "getYposition",
        "Ljava/lang/String;",
        "getId",
        "Ljava/lang/Boolean;",
        "getHideWhileScrubbing",
        "getSkipScrubbing",
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

.field public static final Companion:Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel$Companion;


# instance fields
.field private final currentValue:Ljava/lang/Double;

.field private final height:D

.field private final hideWhileScrubbing:Ljava/lang/Boolean;

.field private final id:Ljava/lang/String;

.field private final rangeMax:D

.field private final rangeMin:D

.field private final showAnnotation:Z

.field private final skipScrubbing:Ljava/lang/Boolean;

.field private final style:Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;

.field private final yposition:D


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->Companion:Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel$Companion;

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lna1/a;

    const/16 v3, 0xa

    invoke-direct {v2, v3}, Lna1/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    new-array v2, v3, [Ll83/h;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    aput-object v1, v2, v0

    const/4 v0, 0x2

    aput-object v1, v2, v0

    const/4 v0, 0x3

    aput-object v1, v2, v0

    const/4 v0, 0x4

    aput-object v1, v2, v0

    const/4 v0, 0x5

    aput-object v1, v2, v0

    const/4 v0, 0x6

    aput-object v1, v2, v0

    const/4 v0, 0x7

    aput-object v1, v2, v0

    const/16 v0, 0x8

    aput-object v1, v2, v0

    const/16 v0, 0x9

    aput-object v1, v2, v0

    sput-object v2, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public constructor <init>()V
    .locals 17

    .line 1
    const/16 v15, 0x3ff

    const/16 v16, 0x0

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const-wide/16 v8, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v0, p0

    invoke-direct/range {v0 .. v16}, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;-><init>(Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;DDLjava/lang/Double;ZDDLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;DDLjava/lang/Double;ZDDLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 3

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lcom/whoop/design/models/items/graph/plot/GraphPlot;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    and-int/lit8 v1, p1, 0x1

    if-nez v1, :cond_0

    .line 3
    sget-object p2, Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;->PREGNANCY_NONE:Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;

    .line 4
    :cond_0
    iput-object p2, p0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->style:Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;

    and-int/lit8 p2, p1, 0x2

    const-wide/16 v1, 0x0

    if-nez p2, :cond_1

    iput-wide v1, p0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->rangeMin:D

    goto :goto_0

    :cond_1
    iput-wide p3, p0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->rangeMin:D

    :goto_0
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    const-wide/high16 p2, 0x3ff0000000000000L    # 1.0

    iput-wide p2, p0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->rangeMax:D

    goto :goto_1

    :cond_2
    iput-wide p5, p0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->rangeMax:D

    :goto_1
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_3

    iput-object v0, p0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->currentValue:Ljava/lang/Double;

    goto :goto_2

    :cond_3
    iput-object p7, p0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->currentValue:Ljava/lang/Double;

    :goto_2
    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_4

    const/4 p2, 0x0

    iput-boolean p2, p0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->showAnnotation:Z

    goto :goto_3

    :cond_4
    iput-boolean p8, p0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->showAnnotation:Z

    :goto_3
    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_5

    const-wide p2, 0x3f947ae147ae147bL    # 0.02

    iput-wide p2, p0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->height:D

    goto :goto_4

    :cond_5
    iput-wide p9, p0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->height:D

    :goto_4
    and-int/lit8 p2, p1, 0x40

    if-nez p2, :cond_6

    iput-wide v1, p0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->yposition:D

    goto :goto_5

    :cond_6
    iput-wide p11, p0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->yposition:D

    :goto_5
    and-int/lit16 p2, p1, 0x80

    if-nez p2, :cond_7

    .line 5
    const-string p2, "ProgressPlot"

    .line 6
    :goto_6
    iput-object p2, p0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->id:Ljava/lang/String;

    goto :goto_7

    :cond_7
    move-object/from16 p2, p13

    goto :goto_6

    :goto_7
    and-int/lit16 p2, p1, 0x100

    if-nez p2, :cond_8

    .line 7
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 8
    :goto_8
    iput-object p2, p0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->hideWhileScrubbing:Ljava/lang/Boolean;

    goto :goto_9

    :cond_8
    move-object/from16 p2, p14

    goto :goto_8

    :goto_9
    and-int/lit16 p1, p1, 0x200

    if-nez p1, :cond_9

    iput-object v0, p0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->skipScrubbing:Ljava/lang/Boolean;

    return-void

    :cond_9
    move-object/from16 p1, p15

    iput-object p1, p0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->skipScrubbing:Ljava/lang/Boolean;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;DDLjava/lang/Double;ZDDLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V
    .locals 1

    const-string v0, "style"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "id"

    invoke-static {p12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 9
    invoke-direct {p0, v0}, Lcom/whoop/design/models/items/graph/plot/GraphPlot;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 10
    iput-object p1, p0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->style:Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;

    .line 11
    iput-wide p2, p0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->rangeMin:D

    .line 12
    iput-wide p4, p0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->rangeMax:D

    .line 13
    iput-object p6, p0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->currentValue:Ljava/lang/Double;

    .line 14
    iput-boolean p7, p0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->showAnnotation:Z

    .line 15
    iput-wide p8, p0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->height:D

    .line 16
    iput-wide p10, p0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->yposition:D

    .line 17
    iput-object p12, p0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->id:Ljava/lang/String;

    .line 18
    iput-object p13, p0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->hideWhileScrubbing:Ljava/lang/Boolean;

    .line 19
    iput-object p14, p0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->skipScrubbing:Ljava/lang/Boolean;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;DDLjava/lang/Double;ZDDLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 15

    move/from16 v0, p15

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    .line 20
    sget-object v1, Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;->PREGNANCY_NONE:Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;

    goto :goto_0

    :cond_0
    move-object/from16 v1, p1

    :goto_0
    and-int/lit8 v2, v0, 0x2

    const-wide/16 v3, 0x0

    if-eqz v2, :cond_1

    move-wide v5, v3

    goto :goto_1

    :cond_1
    move-wide/from16 v5, p2

    :goto_1
    and-int/lit8 v2, v0, 0x4

    if-eqz v2, :cond_2

    const-wide/high16 v7, 0x3ff0000000000000L    # 1.0

    goto :goto_2

    :cond_2
    move-wide/from16 v7, p4

    :goto_2
    and-int/lit8 v2, v0, 0x8

    const/4 v9, 0x0

    if-eqz v2, :cond_3

    move-object v2, v9

    goto :goto_3

    :cond_3
    move-object/from16 v2, p6

    :goto_3
    and-int/lit8 v10, v0, 0x10

    if-eqz v10, :cond_4

    const/4 v10, 0x0

    goto :goto_4

    :cond_4
    move/from16 v10, p7

    :goto_4
    and-int/lit8 v11, v0, 0x20

    if-eqz v11, :cond_5

    const-wide v11, 0x3f947ae147ae147bL    # 0.02

    goto :goto_5

    :cond_5
    move-wide/from16 v11, p8

    :goto_5
    and-int/lit8 v13, v0, 0x40

    if-eqz v13, :cond_6

    goto :goto_6

    :cond_6
    move-wide/from16 v3, p10

    :goto_6
    and-int/lit16 v13, v0, 0x80

    if-eqz v13, :cond_7

    .line 21
    const-string v13, "ProgressPlot"

    goto :goto_7

    :cond_7
    move-object/from16 v13, p12

    :goto_7
    and-int/lit16 v14, v0, 0x100

    if-eqz v14, :cond_8

    .line 22
    sget-object v14, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_8

    :cond_8
    move-object/from16 v14, p13

    :goto_8
    and-int/lit16 v0, v0, 0x200

    if-eqz v0, :cond_9

    move-object/from16 p15, v9

    :goto_9
    move-object/from16 p1, p0

    move-object/from16 p2, v1

    move-object/from16 p7, v2

    move-wide/from16 p11, v3

    move-wide/from16 p3, v5

    move-wide/from16 p5, v7

    move/from16 p8, v10

    move-wide/from16 p9, v11

    move-object/from16 p13, v13

    move-object/from16 p14, v14

    goto :goto_a

    :cond_9
    move-object/from16 p15, p14

    goto :goto_9

    .line 23
    :goto_a
    invoke-direct/range {p1 .. p15}, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;-><init>(Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;DDLjava/lang/Double;ZDDLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.models.items.graph.plot.progress.ProgressPlotStyle"

    invoke-static {}, Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;->values()[Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;DDLjava/lang/Double;ZDDLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;ILjava/lang/Object;)Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;
    .locals 14

    move/from16 v0, p15

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->style:Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;

    goto :goto_0

    :cond_0
    move-object v1, p1

    :goto_0
    and-int/lit8 v2, v0, 0x2

    if-eqz v2, :cond_1

    iget-wide v2, p0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->rangeMin:D

    goto :goto_1

    :cond_1
    move-wide/from16 v2, p2

    :goto_1
    and-int/lit8 v4, v0, 0x4

    if-eqz v4, :cond_2

    iget-wide v4, p0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->rangeMax:D

    goto :goto_2

    :cond_2
    move-wide/from16 v4, p4

    :goto_2
    and-int/lit8 v6, v0, 0x8

    if-eqz v6, :cond_3

    iget-object v6, p0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->currentValue:Ljava/lang/Double;

    goto :goto_3

    :cond_3
    move-object/from16 v6, p6

    :goto_3
    and-int/lit8 v7, v0, 0x10

    if-eqz v7, :cond_4

    iget-boolean v7, p0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->showAnnotation:Z

    goto :goto_4

    :cond_4
    move/from16 v7, p7

    :goto_4
    and-int/lit8 v8, v0, 0x20

    if-eqz v8, :cond_5

    iget-wide v8, p0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->height:D

    goto :goto_5

    :cond_5
    move-wide/from16 v8, p8

    :goto_5
    and-int/lit8 v10, v0, 0x40

    if-eqz v10, :cond_6

    iget-wide v10, p0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->yposition:D

    goto :goto_6

    :cond_6
    move-wide/from16 v10, p10

    :goto_6
    and-int/lit16 v12, v0, 0x80

    if-eqz v12, :cond_7

    iget-object v12, p0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->id:Ljava/lang/String;

    goto :goto_7

    :cond_7
    move-object/from16 v12, p12

    :goto_7
    and-int/lit16 v13, v0, 0x100

    if-eqz v13, :cond_8

    iget-object v13, p0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->hideWhileScrubbing:Ljava/lang/Boolean;

    goto :goto_8

    :cond_8
    move-object/from16 v13, p13

    :goto_8
    and-int/lit16 v0, v0, 0x200

    if-eqz v0, :cond_9

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->skipScrubbing:Ljava/lang/Boolean;

    move-object/from16 p15, v0

    :goto_9
    move-object p1, p0

    move-object/from16 p2, v1

    move-wide/from16 p3, v2

    move-wide/from16 p5, v4

    move-object/from16 p7, v6

    move/from16 p8, v7

    move-wide/from16 p9, v8

    move-wide/from16 p11, v10

    move-object/from16 p13, v12

    move-object/from16 p14, v13

    goto :goto_a

    :cond_9
    move-object/from16 p15, p14

    goto :goto_9

    :goto_a
    invoke-virtual/range {p1 .. p15}, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->copy(Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;DDLjava/lang/Double;ZDDLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;Lzc3/c;Lyc3/g;)V
    .locals 8

    sget-object v0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->style:Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;

    sget-object v3, Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;->PREGNANCY_NONE:Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;

    if-eq v2, v3, :cond_1

    :goto_0
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->style:Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v0, 0x1

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    const-wide/16 v2, 0x0

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    iget-wide v4, p0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->rangeMin:D

    invoke-static {v4, v5, v2, v3}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_3

    :goto_1
    iget-wide v4, p0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->rangeMin:D

    invoke-interface {p1, p2, v0, v4, v5}, Lzc3/c;->encodeDoubleElement(Lyc3/g;ID)V

    :cond_3
    const/4 v0, 0x2

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_2

    :cond_4
    iget-wide v4, p0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->rangeMax:D

    const-wide/high16 v6, 0x3ff0000000000000L    # 1.0

    invoke-static {v4, v5, v6, v7}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_5

    :goto_2
    iget-wide v4, p0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->rangeMax:D

    invoke-interface {p1, p2, v0, v4, v5}, Lzc3/c;->encodeDoubleElement(Lyc3/g;ID)V

    :cond_5
    const/4 v0, 0x3

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_3

    :cond_6
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->currentValue:Ljava/lang/Double;

    if-eqz v1, :cond_7

    :goto_3
    sget-object v1, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    iget-object v4, p0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->currentValue:Ljava/lang/Double;

    invoke-interface {p1, p2, v0, v1, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/4 v0, 0x4

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_8

    goto :goto_4

    :cond_8
    iget-boolean v1, p0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->showAnnotation:Z

    if-eqz v1, :cond_9

    :goto_4
    iget-boolean v1, p0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->showAnnotation:Z

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    :cond_9
    const/4 v0, 0x5

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_a

    goto :goto_5

    :cond_a
    iget-wide v4, p0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->height:D

    const-wide v6, 0x3f947ae147ae147bL    # 0.02

    invoke-static {v4, v5, v6, v7}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_b

    :goto_5
    iget-wide v4, p0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->height:D

    invoke-interface {p1, p2, v0, v4, v5}, Lzc3/c;->encodeDoubleElement(Lyc3/g;ID)V

    :cond_b
    const/4 v0, 0x6

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_c

    goto :goto_6

    :cond_c
    iget-wide v4, p0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->yposition:D

    invoke-static {v4, v5, v2, v3}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_d

    :goto_6
    iget-wide v1, p0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->yposition:D

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeDoubleElement(Lyc3/g;ID)V

    :cond_d
    const/4 v0, 0x7

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_e

    goto :goto_7

    :cond_e
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->id:Ljava/lang/String;

    const-string v2, "ProgressPlot"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    :goto_7
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->id:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_f
    const/16 v0, 0x8

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_10

    goto :goto_8

    :cond_10
    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->getHideWhileScrubbing()Ljava/lang/Boolean;

    move-result-object v1

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    :goto_8
    sget-object v1, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->getHideWhileScrubbing()Ljava/lang/Boolean;

    move-result-object v2

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_11
    const/16 v0, 0x9

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_12

    goto :goto_9

    :cond_12
    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->getSkipScrubbing()Ljava/lang/Boolean;

    move-result-object v1

    if-eqz v1, :cond_13

    :goto_9
    sget-object v1, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->getSkipScrubbing()Ljava/lang/Boolean;

    move-result-object p0

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_13
    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->style:Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;

    return-object v0
.end method

.method public final component10()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->skipScrubbing:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component2()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->rangeMin:D

    return-wide v0
.end method

.method public final component3()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->rangeMax:D

    return-wide v0
.end method

.method public final component4()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->currentValue:Ljava/lang/Double;

    return-object v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->showAnnotation:Z

    return v0
.end method

.method public final component6()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->height:D

    return-wide v0
.end method

.method public final component7()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->yposition:D

    return-wide v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->hideWhileScrubbing:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final copy(Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;DDLjava/lang/Double;ZDDLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;
    .locals 16

    const-string v0, "style"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "id"

    move-object/from16 v13, p12

    invoke-static {v13, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;

    move-wide/from16 v3, p2

    move-wide/from16 v5, p4

    move-object/from16 v7, p6

    move/from16 v8, p7

    move-wide/from16 v9, p8

    move-wide/from16 v11, p10

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    invoke-direct/range {v1 .. v15}, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;-><init>(Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;DDLjava/lang/Double;ZDDLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;

    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->style:Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->style:Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->rangeMin:D

    iget-wide v5, p1, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->rangeMin:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->rangeMax:D

    iget-wide v5, p1, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->rangeMax:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->currentValue:Ljava/lang/Double;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->currentValue:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->showAnnotation:Z

    iget-boolean v3, p1, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->showAnnotation:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-wide v3, p0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->height:D

    iget-wide v5, p1, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->height:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_7

    return v2

    :cond_7
    iget-wide v3, p0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->yposition:D

    iget-wide v5, p1, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->yposition:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->hideWhileScrubbing:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->hideWhileScrubbing:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->skipScrubbing:Ljava/lang/Boolean;

    iget-object p1, p1, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->skipScrubbing:Ljava/lang/Boolean;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    return v2

    :cond_b
    return v0
.end method

.method public final getCurrentValue()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->currentValue:Ljava/lang/Double;

    return-object v0
.end method

.method public final getHeight()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->height:D

    return-wide v0
.end method

.method public getHideWhileScrubbing()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->hideWhileScrubbing:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getRangeMax()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->rangeMax:D

    return-wide v0
.end method

.method public final getRangeMin()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->rangeMin:D

    return-wide v0
.end method

.method public final getShowAnnotation()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->showAnnotation:Z

    return v0
.end method

.method public getSkipScrubbing()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->skipScrubbing:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getStyle()Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->style:Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;

    return-object v0
.end method

.method public final getYposition()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->yposition:D

    return-wide v0
.end method

.method public hashCode()I
    .locals 6

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->style:Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-wide v2, p0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->rangeMin:D

    invoke-static {v0, v1, v2, v3}, Lhc3/i;->a(IID)I

    move-result v0

    iget-wide v2, p0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->rangeMax:D

    invoke-static {v0, v1, v2, v3}, Lhc3/i;->a(IID)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->currentValue:Ljava/lang/Double;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->showAnnotation:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-wide v4, p0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->height:D

    invoke-static {v0, v1, v4, v5}, Lhc3/i;->a(IID)I

    move-result v0

    iget-wide v4, p0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->yposition:D

    invoke-static {v0, v1, v4, v5}, Lhc3/i;->a(IID)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->id:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->hideWhileScrubbing:Ljava/lang/Boolean;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->skipScrubbing:Ljava/lang/Boolean;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 16

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->style:Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;

    iget-wide v2, v0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->rangeMin:D

    iget-wide v4, v0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->rangeMax:D

    iget-object v6, v0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->currentValue:Ljava/lang/Double;

    iget-boolean v7, v0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->showAnnotation:Z

    iget-wide v8, v0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->height:D

    iget-wide v10, v0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->yposition:D

    iget-object v12, v0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->id:Ljava/lang/String;

    iget-object v13, v0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->hideWhileScrubbing:Ljava/lang/Boolean;

    iget-object v14, v0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->skipScrubbing:Ljava/lang/Boolean;

    new-instance v15, Ljava/lang/StringBuilder;

    const-string v0, "ProgressPlotModel(style="

    invoke-direct {v15, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v15, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", rangeMin="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, ", rangeMax="

    const-string v1, ", currentValue="

    invoke-static {v15, v0, v4, v5, v1}, Lr80/c;->B(Ljava/lang/StringBuilder;Ljava/lang/String;DLjava/lang/String;)V

    invoke-virtual {v15, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", showAnnotation="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", height="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v8, v9}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, ", yposition="

    const-string v1, ", id="

    invoke-static {v15, v0, v10, v11, v1}, Lr80/c;->B(Ljava/lang/StringBuilder;Ljava/lang/String;DLjava/lang/String;)V

    const-string v0, ", hideWhileScrubbing="

    const-string v1, ", skipScrubbing="

    invoke-static {v13, v12, v0, v1, v15}, Lvl/b;->t(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    const-string v0, ")"

    invoke-static {v15, v14, v0}, Ld13/a;->j(Ljava/lang/StringBuilder;Ljava/lang/Boolean;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
