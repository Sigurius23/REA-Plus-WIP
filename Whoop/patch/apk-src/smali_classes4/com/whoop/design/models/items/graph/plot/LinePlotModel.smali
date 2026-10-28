.class public final Lcom/whoop/design/models/items/graph/plot/LinePlotModel;
.super Lcom/whoop/design/models/items/graph/plot/GraphPlot;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/graph/plot/LinePlotModel$$serializer;,
        Lcom/whoop/design/models/items/graph/plot/LinePlotModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0015\n\u0002\u0010\u0000\n\u0002\u0008\u0013\u0008\u0087\u0008\u0018\u0000 C2\u00020\u0001:\u0002DCB[\u0012\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\t\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0004\u0008\u0010\u0010\u0011Bg\u0008\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\u0004\u0008\u0010\u0010\u0016J\'\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0016\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0010\u0010\"\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010%J\u0010\u0010&\u001a\u00020\tH\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\'J\u0012\u0010(\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008*\u0010)J\u0012\u0010+\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0004\u0008+\u0010,Jd\u0010-\u001a\u00020\u00002\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00072\u0008\u0008\u0002\u0010\n\u001a\u00020\t2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u00c6\u0001\u00a2\u0006\u0004\u0008-\u0010.J\u0010\u0010/\u001a\u00020\tH\u00d6\u0001\u00a2\u0006\u0004\u0008/\u0010\'J\u0010\u00100\u001a\u00020\u0012H\u00d6\u0001\u00a2\u0006\u0004\u00080\u00101J\u001a\u00104\u001a\u00020\u000b2\u0008\u00103\u001a\u0004\u0018\u000102H\u00d6\u0003\u00a2\u0006\u0004\u00084\u00105R\u001d\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u00106\u001a\u0004\u00087\u0010!R\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00108\u001a\u0004\u00089\u0010#R\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010:\u001a\u0004\u0008;\u0010%R\u0017\u0010\n\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010<\u001a\u0004\u0008=\u0010\'R\u001c\u0010\u000c\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010>\u001a\u0004\u0008?\u0010)R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\r\u0010>\u001a\u0004\u0008@\u0010)R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010A\u001a\u0004\u0008B\u0010,\u00a8\u0006E"
    }
    d2 = {
        "Lcom/whoop/design/models/items/graph/plot/LinePlotModel;",
        "Lcom/whoop/design/models/items/graph/plot/GraphPlot;",
        "",
        "Lcom/whoop/design/models/items/graph/plot/line/LineSegmentModel;",
        "segments",
        "Lcom/whoop/design/models/items/graph/plot/line/LinePlotStyle;",
        "style",
        "Lcom/whoop/design/models/items/graph/plot/DiagonalPoints;",
        "diagonalPoints",
        "",
        "id",
        "",
        "hideWhileScrubbing",
        "skipScrubbing",
        "Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;",
        "theme",
        "<init>",
        "(Ljava/util/List;Lcom/whoop/design/models/items/graph/plot/line/LinePlotStyle;Lcom/whoop/design/models/items/graph/plot/DiagonalPoints;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/util/List;Lcom/whoop/design/models/items/graph/plot/line/LinePlotStyle;Lcom/whoop/design/models/items/graph/plot/DiagonalPoints;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$design_models_release",
        "(Lcom/whoop/design/models/items/graph/plot/LinePlotModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/util/List;",
        "component2",
        "()Lcom/whoop/design/models/items/graph/plot/line/LinePlotStyle;",
        "component3",
        "()Lcom/whoop/design/models/items/graph/plot/DiagonalPoints;",
        "component4",
        "()Ljava/lang/String;",
        "component5",
        "()Ljava/lang/Boolean;",
        "component6",
        "component7",
        "()Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;",
        "copy",
        "(Ljava/util/List;Lcom/whoop/design/models/items/graph/plot/line/LinePlotStyle;Lcom/whoop/design/models/items/graph/plot/DiagonalPoints;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;)Lcom/whoop/design/models/items/graph/plot/LinePlotModel;",
        "toString",
        "hashCode",
        "()I",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/util/List;",
        "getSegments",
        "Lcom/whoop/design/models/items/graph/plot/line/LinePlotStyle;",
        "getStyle",
        "Lcom/whoop/design/models/items/graph/plot/DiagonalPoints;",
        "getDiagonalPoints",
        "Ljava/lang/String;",
        "getId",
        "Ljava/lang/Boolean;",
        "getHideWhileScrubbing",
        "getSkipScrubbing",
        "Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;",
        "getTheme",
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

.field public static final Companion:Lcom/whoop/design/models/items/graph/plot/LinePlotModel$Companion;


# instance fields
.field private final diagonalPoints:Lcom/whoop/design/models/items/graph/plot/DiagonalPoints;

.field private final hideWhileScrubbing:Ljava/lang/Boolean;

.field private final id:Ljava/lang/String;

.field private final segments:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/graph/plot/line/LineSegmentModel;",
            ">;"
        }
    .end annotation
.end field

.field private final skipScrubbing:Ljava/lang/Boolean;

.field private final style:Lcom/whoop/design/models/items/graph/plot/line/LinePlotStyle;

.field private final theme:Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lcom/whoop/design/models/items/graph/plot/LinePlotModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/graph/plot/LinePlotModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;->Companion:Lcom/whoop/design/models/items/graph/plot/LinePlotModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lma1/a;

    const/4 v3, 0x4

    invoke-direct {v2, v3}, Lma1/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-instance v4, Lma1/a;

    const/4 v5, 0x5

    invoke-direct {v4, v5}, Lma1/a;-><init>(I)V

    invoke-static {v0, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v4, 0x7

    new-array v4, v4, [Ll83/h;

    const/4 v6, 0x0

    aput-object v2, v4, v6

    const/4 v2, 0x1

    aput-object v0, v4, v2

    const/4 v0, 0x2

    aput-object v1, v4, v0

    const/4 v0, 0x3

    aput-object v1, v4, v0

    aput-object v1, v4, v3

    aput-object v1, v4, v5

    const/4 v0, 0x6

    aput-object v1, v4, v0

    sput-object v4, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public constructor <init>()V
    .locals 10

    .line 1
    const/16 v8, 0x7f

    const/4 v9, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v9}, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;-><init>(Ljava/util/List;Lcom/whoop/design/models/items/graph/plot/line/LinePlotStyle;Lcom/whoop/design/models/items/graph/plot/DiagonalPoints;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/util/List;Lcom/whoop/design/models/items/graph/plot/line/LinePlotStyle;Lcom/whoop/design/models/items/graph/plot/DiagonalPoints;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    const/4 p9, 0x0

    .line 2
    invoke-direct {p0, p9}, Lcom/whoop/design/models/items/graph/plot/GraphPlot;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    and-int/lit8 v0, p1, 0x1

    if-nez v0, :cond_0

    .line 3
    sget-object p2, Lm83/y;->w:Lm83/y;

    .line 4
    :cond_0
    iput-object p2, p0, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;->segments:Ljava/util/List;

    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_1

    .line 5
    sget-object p2, Lcom/whoop/design/models/items/graph/plot/line/LinePlotStyle;->NONE:Lcom/whoop/design/models/items/graph/plot/line/LinePlotStyle;

    .line 6
    iput-object p2, p0, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;->style:Lcom/whoop/design/models/items/graph/plot/line/LinePlotStyle;

    goto :goto_0

    :cond_1
    iput-object p3, p0, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;->style:Lcom/whoop/design/models/items/graph/plot/line/LinePlotStyle;

    :goto_0
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    iput-object p9, p0, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;->diagonalPoints:Lcom/whoop/design/models/items/graph/plot/DiagonalPoints;

    goto :goto_1

    :cond_2
    iput-object p4, p0, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;->diagonalPoints:Lcom/whoop/design/models/items/graph/plot/DiagonalPoints;

    :goto_1
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_3

    .line 7
    const-string p2, "line"

    .line 8
    iput-object p2, p0, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;->id:Ljava/lang/String;

    goto :goto_2

    :cond_3
    iput-object p5, p0, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;->id:Ljava/lang/String;

    :goto_2
    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_4

    .line 9
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 10
    iput-object p2, p0, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;->hideWhileScrubbing:Ljava/lang/Boolean;

    goto :goto_3

    :cond_4
    iput-object p6, p0, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;->hideWhileScrubbing:Ljava/lang/Boolean;

    :goto_3
    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_5

    iput-object p9, p0, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;->skipScrubbing:Ljava/lang/Boolean;

    goto :goto_4

    :cond_5
    iput-object p7, p0, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;->skipScrubbing:Ljava/lang/Boolean;

    :goto_4
    and-int/lit8 p1, p1, 0x40

    if-nez p1, :cond_6

    iput-object p9, p0, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;->theme:Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;

    return-void

    :cond_6
    iput-object p8, p0, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;->theme:Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Lcom/whoop/design/models/items/graph/plot/line/LinePlotStyle;Lcom/whoop/design/models/items/graph/plot/DiagonalPoints;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/graph/plot/line/LineSegmentModel;",
            ">;",
            "Lcom/whoop/design/models/items/graph/plot/line/LinePlotStyle;",
            "Lcom/whoop/design/models/items/graph/plot/DiagonalPoints;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            "Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;",
            ")V"
        }
    .end annotation

    const-string v0, "segments"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "style"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "id"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 11
    invoke-direct {p0, v0}, Lcom/whoop/design/models/items/graph/plot/GraphPlot;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 12
    iput-object p1, p0, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;->segments:Ljava/util/List;

    .line 13
    iput-object p2, p0, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;->style:Lcom/whoop/design/models/items/graph/plot/line/LinePlotStyle;

    .line 14
    iput-object p3, p0, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;->diagonalPoints:Lcom/whoop/design/models/items/graph/plot/DiagonalPoints;

    .line 15
    iput-object p4, p0, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;->id:Ljava/lang/String;

    .line 16
    iput-object p5, p0, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;->hideWhileScrubbing:Ljava/lang/Boolean;

    .line 17
    iput-object p6, p0, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;->skipScrubbing:Ljava/lang/Boolean;

    .line 18
    iput-object p7, p0, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;->theme:Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Lcom/whoop/design/models/items/graph/plot/line/LinePlotStyle;Lcom/whoop/design/models/items/graph/plot/DiagonalPoints;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    .line 19
    sget-object p1, Lm83/y;->w:Lm83/y;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    .line 20
    sget-object p2, Lcom/whoop/design/models/items/graph/plot/line/LinePlotStyle;->NONE:Lcom/whoop/design/models/items/graph/plot/line/LinePlotStyle;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    const/4 v0, 0x0

    if-eqz p9, :cond_2

    move-object p3, v0

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    .line 21
    const-string p4, "line"

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    .line 22
    sget-object p5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    move-object p6, v0

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    move-object p9, v0

    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    goto :goto_0

    :cond_6
    move-object p9, p7

    move-object p8, p6

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    .line 23
    :goto_0
    invoke-direct/range {p2 .. p9}, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;-><init>(Ljava/util/List;Lcom/whoop/design/models/items/graph/plot/line/LinePlotStyle;Lcom/whoop/design/models/items/graph/plot/DiagonalPoints;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/design/models/items/graph/plot/line/LineSegmentModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/graph/plot/line/LineSegmentModel$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.models.items.graph.plot.line.LinePlotStyle"

    invoke-static {}, Lcom/whoop/design/models/items/graph/plot/line/LinePlotStyle;->values()[Lcom/whoop/design/models/items/graph/plot/line/LinePlotStyle;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/graph/plot/LinePlotModel;Ljava/util/List;Lcom/whoop/design/models/items/graph/plot/line/LinePlotStyle;Lcom/whoop/design/models/items/graph/plot/DiagonalPoints;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;ILjava/lang/Object;)Lcom/whoop/design/models/items/graph/plot/LinePlotModel;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;->segments:Ljava/util/List;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;->style:Lcom/whoop/design/models/items/graph/plot/line/LinePlotStyle;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-object p3, p0, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;->diagonalPoints:Lcom/whoop/design/models/items/graph/plot/DiagonalPoints;

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-object p4, p0, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;->id:Ljava/lang/String;

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-object p5, p0, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;->hideWhileScrubbing:Ljava/lang/Boolean;

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget-object p6, p0, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;->skipScrubbing:Ljava/lang/Boolean;

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget-object p7, p0, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;->theme:Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;

    :cond_6
    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;->copy(Ljava/util/List;Lcom/whoop/design/models/items/graph/plot/line/LinePlotStyle;Lcom/whoop/design/models/items/graph/plot/DiagonalPoints;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;)Lcom/whoop/design/models/items/graph/plot/LinePlotModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/graph/plot/LinePlotModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;->segments:Ljava/util/List;

    sget-object v3, Lm83/y;->w:Lm83/y;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    :goto_0
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;->segments:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v1, 0x1

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;->style:Lcom/whoop/design/models/items/graph/plot/line/LinePlotStyle;

    sget-object v3, Lcom/whoop/design/models/items/graph/plot/line/LinePlotStyle;->NONE:Lcom/whoop/design/models/items/graph/plot/line/LinePlotStyle;

    if-eq v2, v3, :cond_3

    :goto_1
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;->style:Lcom/whoop/design/models/items/graph/plot/line/LinePlotStyle;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v0, 0x2

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;->diagonalPoints:Lcom/whoop/design/models/items/graph/plot/DiagonalPoints;

    if-eqz v1, :cond_5

    :goto_2
    sget-object v1, Lcom/whoop/design/models/items/graph/plot/DiagonalPoints$$serializer;->INSTANCE:Lcom/whoop/design/models/items/graph/plot/DiagonalPoints$$serializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;->diagonalPoints:Lcom/whoop/design/models/items/graph/plot/DiagonalPoints;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v0, 0x3

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_3

    :cond_6
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;->id:Ljava/lang/String;

    const-string v2, "line"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    :goto_3
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;->id:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_7
    const/4 v0, 0x4

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_8

    goto :goto_4

    :cond_8
    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;->getHideWhileScrubbing()Ljava/lang/Boolean;

    move-result-object v1

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    :goto_4
    sget-object v1, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;->getHideWhileScrubbing()Ljava/lang/Boolean;

    move-result-object v2

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    const/4 v0, 0x5

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_a

    goto :goto_5

    :cond_a
    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;->getSkipScrubbing()Ljava/lang/Boolean;

    move-result-object v1

    if-eqz v1, :cond_b

    :goto_5
    sget-object v1, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;->getSkipScrubbing()Ljava/lang/Boolean;

    move-result-object v2

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_b
    const/4 v0, 0x6

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_c

    goto :goto_6

    :cond_c
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;->theme:Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;

    if-eqz v1, :cond_d

    :goto_6
    sget-object v1, Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme$$serializer;->INSTANCE:Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme$$serializer;

    iget-object p0, p0, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;->theme:Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_d
    return-void
.end method


# virtual methods
.method public final component1()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/graph/plot/line/LineSegmentModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;->segments:Ljava/util/List;

    return-object v0
.end method

.method public final component2()Lcom/whoop/design/models/items/graph/plot/line/LinePlotStyle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;->style:Lcom/whoop/design/models/items/graph/plot/line/LinePlotStyle;

    return-object v0
.end method

.method public final component3()Lcom/whoop/design/models/items/graph/plot/DiagonalPoints;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;->diagonalPoints:Lcom/whoop/design/models/items/graph/plot/DiagonalPoints;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;->hideWhileScrubbing:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component6()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;->skipScrubbing:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component7()Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;->theme:Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;

    return-object v0
.end method

.method public final copy(Ljava/util/List;Lcom/whoop/design/models/items/graph/plot/line/LinePlotStyle;Lcom/whoop/design/models/items/graph/plot/DiagonalPoints;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;)Lcom/whoop/design/models/items/graph/plot/LinePlotModel;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/graph/plot/line/LineSegmentModel;",
            ">;",
            "Lcom/whoop/design/models/items/graph/plot/line/LinePlotStyle;",
            "Lcom/whoop/design/models/items/graph/plot/DiagonalPoints;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            "Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;",
            ")",
            "Lcom/whoop/design/models/items/graph/plot/LinePlotModel;"
        }
    .end annotation

    const-string v0, "segments"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "style"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "id"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v1 .. v8}, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;-><init>(Ljava/util/List;Lcom/whoop/design/models/items/graph/plot/line/LinePlotStyle;Lcom/whoop/design/models/items/graph/plot/DiagonalPoints;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;

    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;->segments:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;->segments:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;->style:Lcom/whoop/design/models/items/graph/plot/line/LinePlotStyle;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;->style:Lcom/whoop/design/models/items/graph/plot/line/LinePlotStyle;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;->diagonalPoints:Lcom/whoop/design/models/items/graph/plot/DiagonalPoints;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;->diagonalPoints:Lcom/whoop/design/models/items/graph/plot/DiagonalPoints;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;->hideWhileScrubbing:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;->hideWhileScrubbing:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;->skipScrubbing:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;->skipScrubbing:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;->theme:Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;

    iget-object p1, p1, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;->theme:Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getDiagonalPoints()Lcom/whoop/design/models/items/graph/plot/DiagonalPoints;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;->diagonalPoints:Lcom/whoop/design/models/items/graph/plot/DiagonalPoints;

    return-object v0
.end method

.method public getHideWhileScrubbing()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;->hideWhileScrubbing:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getSegments()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/graph/plot/line/LineSegmentModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;->segments:Ljava/util/List;

    return-object v0
.end method

.method public getSkipScrubbing()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;->skipScrubbing:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getStyle()Lcom/whoop/design/models/items/graph/plot/line/LinePlotStyle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;->style:Lcom/whoop/design/models/items/graph/plot/line/LinePlotStyle;

    return-object v0
.end method

.method public final getTheme()Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;->theme:Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;->segments:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;->style:Lcom/whoop/design/models/items/graph/plot/line/LinePlotStyle;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;->diagonalPoints:Lcom/whoop/design/models/items/graph/plot/DiagonalPoints;

    const/4 v3, 0x0

    if-nez v0, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/whoop/design/models/items/graph/plot/DiagonalPoints;->hashCode()I

    move-result v0

    :goto_0
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;->id:Ljava/lang/String;

    invoke-static {v2, v1, v0}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;->hideWhileScrubbing:Ljava/lang/Boolean;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;->skipScrubbing:Ljava/lang/Boolean;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;->theme:Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;

    if-nez v1, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;->segments:Ljava/util/List;

    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;->style:Lcom/whoop/design/models/items/graph/plot/line/LinePlotStyle;

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;->diagonalPoints:Lcom/whoop/design/models/items/graph/plot/DiagonalPoints;

    iget-object v3, p0, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;->id:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;->hideWhileScrubbing:Ljava/lang/Boolean;

    iget-object v5, p0, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;->skipScrubbing:Ljava/lang/Boolean;

    iget-object v6, p0, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;->theme:Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "LinePlotModel(segments="

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", style="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", diagonalPoints="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", id="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", hideWhileScrubbing="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", skipScrubbing="

    const-string v1, ", theme="

    invoke-static {v7, v4, v0, v5, v1}, Lc13/a;->w(Ljava/lang/StringBuilder;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
