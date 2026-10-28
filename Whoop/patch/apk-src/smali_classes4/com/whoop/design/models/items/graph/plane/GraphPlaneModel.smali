.class public final Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel$$serializer;,
        Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0015\u0008\u0087\u0008\u0018\u0000 B2\u00020\u0001:\u0002CBBa\u0012\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0004\u0008\u000e\u0010\u000fBm\u0008\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0004\u0008\u000e\u0010\u0014J\u0016\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0016\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001bJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001bJj\u0010\u001f\u001a\u00020\u00002\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00022\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\tH\u00c6\u0001\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0010\u0010\"\u001a\u00020!H\u00d6\u0001\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010$\u001a\u00020\u0010H\u00d6\u0001\u00a2\u0006\u0004\u0008$\u0010%J\u001a\u0010(\u001a\u00020\'2\u0008\u0010&\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008(\u0010)J\'\u00102\u001a\u00020/2\u0006\u0010*\u001a\u00020\u00002\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-H\u0001\u00a2\u0006\u0004\u00080\u00101R\u001d\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u00103\u001a\u0004\u00084\u0010\u0016R\u001d\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00103\u001a\u0004\u00085\u0010\u0016R\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00106\u001a\u0004\u00087\u0010\u0019R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\n\u00108\u0012\u0004\u0008:\u0010;\u001a\u0004\u00089\u0010\u001bR\"\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000b\u00108\u0012\u0004\u0008=\u0010;\u001a\u0004\u0008<\u0010\u001bR\"\u0010\u000c\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000c\u00108\u0012\u0004\u0008?\u0010;\u001a\u0004\u0008>\u0010\u001bR\"\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\r\u00108\u0012\u0004\u0008A\u0010;\u001a\u0004\u0008@\u0010\u001b\u00a8\u0006D"
    }
    d2 = {
        "Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;",
        "",
        "",
        "Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;",
        "lines",
        "Lcom/whoop/design/models/items/graph/plane/annotations/GraphAnnotationModel;",
        "annotations",
        "Lcom/whoop/design/models/items/graph/plane/GraphAccessibilityModel;",
        "accessibilityInfo",
        "Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;",
        "startYAxis",
        "endYAxis",
        "bottomXAxis",
        "topXAxis",
        "<init>",
        "(Ljava/util/List;Ljava/util/List;Lcom/whoop/design/models/items/graph/plane/GraphAccessibilityModel;Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/util/List;Ljava/util/List;Lcom/whoop/design/models/items/graph/plane/GraphAccessibilityModel;Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Ljava/util/List;",
        "component2",
        "component3",
        "()Lcom/whoop/design/models/items/graph/plane/GraphAccessibilityModel;",
        "component4",
        "()Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;",
        "component5",
        "component6",
        "component7",
        "copy",
        "(Ljava/util/List;Ljava/util/List;Lcom/whoop/design/models/items/graph/plane/GraphAccessibilityModel;Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;)Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$design_models_release",
        "(Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/util/List;",
        "getLines",
        "getAnnotations",
        "Lcom/whoop/design/models/items/graph/plane/GraphAccessibilityModel;",
        "getAccessibilityInfo",
        "Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;",
        "getStartYAxis",
        "getStartYAxis$annotations",
        "()V",
        "getEndYAxis",
        "getEndYAxis$annotations",
        "getBottomXAxis",
        "getBottomXAxis$annotations",
        "getTopXAxis",
        "getTopXAxis$annotations",
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

.field public static final Companion:Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel$Companion;


# instance fields
.field private final accessibilityInfo:Lcom/whoop/design/models/items/graph/plane/GraphAccessibilityModel;

.field private final annotations:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/graph/plane/annotations/GraphAnnotationModel;",
            ">;"
        }
    .end annotation
.end field

.field private final bottomXAxis:Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "bottom_xaxis"
    .end annotation
.end field

.field private final endYAxis:Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "end_yaxis"
    .end annotation
.end field

.field private final lines:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;",
            ">;"
        }
    .end annotation
.end field

.field private final startYAxis:Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "start_yaxis"
    .end annotation
.end field

.field private final topXAxis:Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "top_xaxis"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->Companion:Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lga1/b;

    const/16 v3, 0x9

    invoke-direct {v2, v3}, Lga1/b;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-instance v3, Lga1/b;

    const/16 v4, 0xa

    invoke-direct {v3, v4}, Lga1/b;-><init>(I)V

    invoke-static {v0, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v3, 0x7

    new-array v3, v3, [Ll83/h;

    const/4 v4, 0x0

    aput-object v2, v3, v4

    const/4 v2, 0x1

    aput-object v0, v3, v2

    const/4 v0, 0x2

    aput-object v1, v3, v0

    const/4 v0, 0x3

    aput-object v1, v3, v0

    const/4 v0, 0x4

    aput-object v1, v3, v0

    const/4 v0, 0x5

    aput-object v1, v3, v0

    const/4 v0, 0x6

    aput-object v1, v3, v0

    sput-object v3, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->$childSerializers:[Ll83/h;

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

    invoke-direct/range {v0 .. v9}, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;-><init>(Ljava/util/List;Ljava/util/List;Lcom/whoop/design/models/items/graph/plane/GraphAccessibilityModel;Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/util/List;Ljava/util/List;Lcom/whoop/design/models/items/graph/plane/GraphAccessibilityModel;Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p9, p1, 0x1

    sget-object v0, Lm83/y;->w:Lm83/y;

    if-nez p9, :cond_0

    iput-object v0, p0, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->lines:Ljava/util/List;

    goto :goto_0

    :cond_0
    iput-object p2, p0, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->lines:Ljava/util/List;

    :goto_0
    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_1

    iput-object v0, p0, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->annotations:Ljava/util/List;

    goto :goto_1

    :cond_1
    iput-object p3, p0, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->annotations:Ljava/util/List;

    :goto_1
    and-int/lit8 p2, p1, 0x4

    const/4 p3, 0x0

    if-nez p2, :cond_2

    .line 3
    new-instance p2, Lcom/whoop/design/models/items/graph/plane/GraphAccessibilityModel;

    const/4 p4, 0x1

    invoke-direct {p2, p3, p4, p3}, Lcom/whoop/design/models/items/graph/plane/GraphAccessibilityModel;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 4
    iput-object p2, p0, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->accessibilityInfo:Lcom/whoop/design/models/items/graph/plane/GraphAccessibilityModel;

    goto :goto_2

    :cond_2
    iput-object p4, p0, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->accessibilityInfo:Lcom/whoop/design/models/items/graph/plane/GraphAccessibilityModel;

    :goto_2
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_3

    iput-object p3, p0, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->startYAxis:Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;

    goto :goto_3

    :cond_3
    iput-object p5, p0, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->startYAxis:Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;

    :goto_3
    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_4

    iput-object p3, p0, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->endYAxis:Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;

    goto :goto_4

    :cond_4
    iput-object p6, p0, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->endYAxis:Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;

    :goto_4
    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_5

    iput-object p3, p0, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->bottomXAxis:Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;

    goto :goto_5

    :cond_5
    iput-object p7, p0, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->bottomXAxis:Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;

    :goto_5
    and-int/lit8 p1, p1, 0x40

    if-nez p1, :cond_6

    iput-object p3, p0, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->topXAxis:Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;

    return-void

    :cond_6
    iput-object p8, p0, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->topXAxis:Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Ljava/util/List;Lcom/whoop/design/models/items/graph/plane/GraphAccessibilityModel;Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;",
            ">;",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/graph/plane/annotations/GraphAnnotationModel;",
            ">;",
            "Lcom/whoop/design/models/items/graph/plane/GraphAccessibilityModel;",
            "Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;",
            "Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;",
            "Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;",
            "Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;",
            ")V"
        }
    .end annotation

    const-string v0, "lines"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "annotations"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "accessibilityInfo"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->lines:Ljava/util/List;

    .line 7
    iput-object p2, p0, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->annotations:Ljava/util/List;

    .line 8
    iput-object p3, p0, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->accessibilityInfo:Lcom/whoop/design/models/items/graph/plane/GraphAccessibilityModel;

    .line 9
    iput-object p4, p0, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->startYAxis:Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;

    .line 10
    iput-object p5, p0, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->endYAxis:Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;

    .line 11
    iput-object p6, p0, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->bottomXAxis:Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;

    .line 12
    iput-object p7, p0, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->topXAxis:Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Ljava/util/List;Lcom/whoop/design/models/items/graph/plane/GraphAccessibilityModel;Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p8, 0x1

    .line 13
    sget-object v0, Lm83/y;->w:Lm83/y;

    if-eqz p9, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p9, p8, 0x4

    const/4 v0, 0x0

    if-eqz p9, :cond_2

    .line 14
    new-instance p3, Lcom/whoop/design/models/items/graph/plane/GraphAccessibilityModel;

    const/4 p9, 0x1

    invoke-direct {p3, v0, p9, v0}, Lcom/whoop/design/models/items/graph/plane/GraphAccessibilityModel;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    move-object p4, v0

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    move-object p5, v0

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    move-object p6, v0

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    move-object p8, v0

    :goto_0
    move-object p7, p6

    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_6
    move-object p8, p7

    goto :goto_0

    .line 15
    :goto_1
    invoke-direct/range {p1 .. p8}, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;-><init>(Ljava/util/List;Ljava/util/List;Lcom/whoop/design/models/items/graph/plane/GraphAccessibilityModel;Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/design/models/items/graph/plane/annotations/GraphAnnotationModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/graph/plane/annotations/GraphAnnotationModel$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/models/items/graph/plane/GraphAccessibilityModel;Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;ILjava/lang/Object;)Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->lines:Ljava/util/List;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->annotations:Ljava/util/List;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-object p3, p0, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->accessibilityInfo:Lcom/whoop/design/models/items/graph/plane/GraphAccessibilityModel;

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-object p4, p0, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->startYAxis:Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-object p5, p0, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->endYAxis:Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget-object p6, p0, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->bottomXAxis:Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget-object p7, p0, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->topXAxis:Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;

    :cond_6
    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->copy(Ljava/util/List;Ljava/util/List;Lcom/whoop/design/models/items/graph/plane/GraphAccessibilityModel;Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;)Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getBottomXAxis$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "bottom_xaxis"
    .end annotation

    return-void
.end method

.method public static synthetic getEndYAxis$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "end_yaxis"
    .end annotation

    return-void
.end method

.method public static synthetic getStartYAxis$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "start_yaxis"
    .end annotation

    return-void
.end method

.method public static synthetic getTopXAxis$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "top_xaxis"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;Lzc3/c;Lyc3/g;)V
    .locals 5

    sget-object v0, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    sget-object v3, Lm83/y;->w:Lm83/y;

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->lines:Ljava/util/List;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    :goto_0
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v4, p0, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->lines:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v4}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v1, 0x1

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->annotations:Ljava/util/List;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    :goto_1
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->annotations:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v0, 0x2

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->accessibilityInfo:Lcom/whoop/design/models/items/graph/plane/GraphAccessibilityModel;

    new-instance v3, Lcom/whoop/design/models/items/graph/plane/GraphAccessibilityModel;

    const/4 v4, 0x0

    invoke-direct {v3, v4, v1, v4}, Lcom/whoop/design/models/items/graph/plane/GraphAccessibilityModel;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    :goto_2
    sget-object v1, Lcom/whoop/design/models/items/graph/plane/GraphAccessibilityModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/graph/plane/GraphAccessibilityModel$$serializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->accessibilityInfo:Lcom/whoop/design/models/items/graph/plane/GraphAccessibilityModel;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v0, 0x3

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_3

    :cond_6
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->startYAxis:Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;

    if-eqz v1, :cond_7

    :goto_3
    sget-object v1, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel$$serializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->startYAxis:Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/4 v0, 0x4

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_8

    goto :goto_4

    :cond_8
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->endYAxis:Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;

    if-eqz v1, :cond_9

    :goto_4
    sget-object v1, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel$$serializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->endYAxis:Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    const/4 v0, 0x5

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_a

    goto :goto_5

    :cond_a
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->bottomXAxis:Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;

    if-eqz v1, :cond_b

    :goto_5
    sget-object v1, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel$$serializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->bottomXAxis:Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_b
    const/4 v0, 0x6

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_c

    goto :goto_6

    :cond_c
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->topXAxis:Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;

    if-eqz v1, :cond_d

    :goto_6
    sget-object v1, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel$$serializer;

    iget-object p0, p0, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->topXAxis:Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;

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
            "Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->lines:Ljava/util/List;

    return-object v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/graph/plane/annotations/GraphAnnotationModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->annotations:Ljava/util/List;

    return-object v0
.end method

.method public final component3()Lcom/whoop/design/models/items/graph/plane/GraphAccessibilityModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->accessibilityInfo:Lcom/whoop/design/models/items/graph/plane/GraphAccessibilityModel;

    return-object v0
.end method

.method public final component4()Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->startYAxis:Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;

    return-object v0
.end method

.method public final component5()Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->endYAxis:Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;

    return-object v0
.end method

.method public final component6()Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->bottomXAxis:Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;

    return-object v0
.end method

.method public final component7()Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->topXAxis:Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;

    return-object v0
.end method

.method public final copy(Ljava/util/List;Ljava/util/List;Lcom/whoop/design/models/items/graph/plane/GraphAccessibilityModel;Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;)Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;",
            ">;",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/graph/plane/annotations/GraphAnnotationModel;",
            ">;",
            "Lcom/whoop/design/models/items/graph/plane/GraphAccessibilityModel;",
            "Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;",
            "Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;",
            "Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;",
            "Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;",
            ")",
            "Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;"
        }
    .end annotation

    const-string v0, "lines"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "annotations"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "accessibilityInfo"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v1 .. v8}, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;-><init>(Ljava/util/List;Ljava/util/List;Lcom/whoop/design/models/items/graph/plane/GraphAccessibilityModel;Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;

    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->lines:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->lines:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->annotations:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->annotations:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->accessibilityInfo:Lcom/whoop/design/models/items/graph/plane/GraphAccessibilityModel;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->accessibilityInfo:Lcom/whoop/design/models/items/graph/plane/GraphAccessibilityModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->startYAxis:Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->startYAxis:Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->endYAxis:Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->endYAxis:Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->bottomXAxis:Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->bottomXAxis:Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->topXAxis:Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;

    iget-object p1, p1, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->topXAxis:Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getAccessibilityInfo()Lcom/whoop/design/models/items/graph/plane/GraphAccessibilityModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->accessibilityInfo:Lcom/whoop/design/models/items/graph/plane/GraphAccessibilityModel;

    return-object v0
.end method

.method public final getAnnotations()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/graph/plane/annotations/GraphAnnotationModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->annotations:Ljava/util/List;

    return-object v0
.end method

.method public final getBottomXAxis()Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->bottomXAxis:Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;

    return-object v0
.end method

.method public final getEndYAxis()Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->endYAxis:Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;

    return-object v0
.end method

.method public final getLines()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->lines:Ljava/util/List;

    return-object v0
.end method

.method public final getStartYAxis()Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->startYAxis:Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;

    return-object v0
.end method

.method public final getTopXAxis()Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->topXAxis:Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->lines:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->annotations:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->accessibilityInfo:Lcom/whoop/design/models/items/graph/plane/GraphAccessibilityModel;

    invoke-virtual {v2}, Lcom/whoop/design/models/items/graph/plane/GraphAccessibilityModel;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->startYAxis:Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;

    const/4 v3, 0x0

    if-nez v0, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->hashCode()I

    move-result v0

    :goto_0
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->endYAxis:Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;

    if-nez v0, :cond_1

    move v0, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->hashCode()I

    move-result v0

    :goto_1
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->bottomXAxis:Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;

    if-nez v0, :cond_2

    move v0, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v0}, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->hashCode()I

    move-result v0

    :goto_2
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->topXAxis:Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;

    if-nez v0, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v0}, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v2, v3

    return v2
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->lines:Ljava/util/List;

    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->annotations:Ljava/util/List;

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->accessibilityInfo:Lcom/whoop/design/models/items/graph/plane/GraphAccessibilityModel;

    iget-object v3, p0, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->startYAxis:Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;

    iget-object v4, p0, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->endYAxis:Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;

    iget-object v5, p0, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->bottomXAxis:Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;

    iget-object v6, p0, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->topXAxis:Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;

    const-string v7, ", annotations="

    const-string v8, ", accessibilityInfo="

    const-string v9, "GraphPlaneModel(lines="

    invoke-static {v9, v7, v0, v8, v1}, Ly00/t7;->j(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", startYAxis="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", endYAxis="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", bottomXAxis="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", topXAxis="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
