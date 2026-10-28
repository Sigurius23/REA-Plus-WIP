.class public final Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel$$serializer;,
        Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001b\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0019\u0008\u0087\u0008\u0018\u0000 U2\u00020\u0001:\u0002VUB\u008f\u0001\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0010\u0008\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u00a2\u0006\u0004\u0008\u0016\u0010\u0017B\u008f\u0001\u0008\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u0012\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u00a2\u0006\u0004\u0008\u0016\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010\u001eJ\u0012\u0010$\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010\u001eJ\u0012\u0010%\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010&J\u0012\u0010\'\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010\u001eJ\u0012\u0010(\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0004\u0008*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003\u00a2\u0006\u0004\u0008,\u0010-J\u0018\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013H\u00c6\u0003\u00a2\u0006\u0004\u0008.\u0010/J\u0098\u0001\u00100\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0010\u0008\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013H\u00c6\u0001\u00a2\u0006\u0004\u00080\u00101J\u0010\u00102\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u00082\u0010\u001eJ\u0010\u00103\u001a\u00020\u0018H\u00d6\u0001\u00a2\u0006\u0004\u00083\u00104J\u001a\u00107\u001a\u0002062\u0008\u00105\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u00087\u00108J\'\u0010A\u001a\u00020>2\u0006\u00109\u001a\u00020\u00002\u0006\u0010;\u001a\u00020:2\u0006\u0010=\u001a\u00020<H\u0001\u00a2\u0006\u0004\u0008?\u0010@R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010B\u001a\u0004\u0008C\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010D\u001a\u0004\u0008E\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010F\u001a\u0004\u0008G\u0010\"R\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010B\u001a\u0004\u0008H\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010B\u001a\u0004\u0008I\u0010\u001eR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010J\u001a\u0004\u0008K\u0010&R\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010B\u001a\u0004\u0008L\u0010\u001eR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010M\u001a\u0004\u0008N\u0010)R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010O\u001a\u0004\u0008P\u0010+R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010Q\u001a\u0004\u0008R\u0010-R\u001f\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010S\u001a\u0004\u0008T\u0010/\u00a8\u0006W"
    }
    d2 = {
        "Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;",
        "",
        "",
        "primaryContextualDisplay",
        "",
        "value",
        "Lcom/whoop/design/util/TextResource;",
        "valueDisplay",
        "unitDisplay",
        "secondaryContextualDisplay",
        "La71/d;",
        "scrubberStyle",
        "dataContext",
        "Lcom/whoop/design/models/items/graph/plot/scrubber/PhaseLabel;",
        "phaseLabel",
        "Lcom/whoop/design/models/items/graph/plot/scrubber/SupplementalDataScrubberDetails;",
        "supplementalDataScrubberDetails",
        "Lcom/whoop/design/models/InfoCalloutTileModel;",
        "callout",
        "",
        "Lcom/whoop/design/models/items/graph/GraphLegendModel;",
        "graphLegends",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/Double;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;La71/d;Ljava/lang/String;Lcom/whoop/design/models/items/graph/plot/scrubber/PhaseLabel;Lcom/whoop/design/models/items/graph/plot/scrubber/SupplementalDataScrubberDetails;Lcom/whoop/design/models/InfoCalloutTileModel;Ljava/util/List;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/Double;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;La71/d;Ljava/lang/String;Lcom/whoop/design/models/items/graph/plot/scrubber/PhaseLabel;Lcom/whoop/design/models/items/graph/plot/scrubber/SupplementalDataScrubberDetails;Lcom/whoop/design/models/InfoCalloutTileModel;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()Ljava/lang/Double;",
        "component3",
        "()Lcom/whoop/design/util/TextResource;",
        "component4",
        "component5",
        "component6",
        "()La71/d;",
        "component7",
        "component8",
        "()Lcom/whoop/design/models/items/graph/plot/scrubber/PhaseLabel;",
        "component9",
        "()Lcom/whoop/design/models/items/graph/plot/scrubber/SupplementalDataScrubberDetails;",
        "component10",
        "()Lcom/whoop/design/models/InfoCalloutTileModel;",
        "component11",
        "()Ljava/util/List;",
        "copy",
        "(Ljava/lang/String;Ljava/lang/Double;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;La71/d;Ljava/lang/String;Lcom/whoop/design/models/items/graph/plot/scrubber/PhaseLabel;Lcom/whoop/design/models/items/graph/plot/scrubber/SupplementalDataScrubberDetails;Lcom/whoop/design/models/InfoCalloutTileModel;Ljava/util/List;)Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;",
        "toString",
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
        "(Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getPrimaryContextualDisplay",
        "Ljava/lang/Double;",
        "getValue",
        "Lcom/whoop/design/util/TextResource;",
        "getValueDisplay",
        "getUnitDisplay",
        "getSecondaryContextualDisplay",
        "La71/d;",
        "getScrubberStyle",
        "getDataContext",
        "Lcom/whoop/design/models/items/graph/plot/scrubber/PhaseLabel;",
        "getPhaseLabel",
        "Lcom/whoop/design/models/items/graph/plot/scrubber/SupplementalDataScrubberDetails;",
        "getSupplementalDataScrubberDetails",
        "Lcom/whoop/design/models/InfoCalloutTileModel;",
        "getCallout",
        "Ljava/util/List;",
        "getGraphLegends",
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

.field public static final Companion:Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel$Companion;


# instance fields
.field private final callout:Lcom/whoop/design/models/InfoCalloutTileModel;

.field private final dataContext:Ljava/lang/String;

.field private final graphLegends:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/graph/GraphLegendModel;",
            ">;"
        }
    .end annotation
.end field

.field private final phaseLabel:Lcom/whoop/design/models/items/graph/plot/scrubber/PhaseLabel;

.field private final primaryContextualDisplay:Ljava/lang/String;

.field private final scrubberStyle:La71/d;

.field private final secondaryContextualDisplay:Ljava/lang/String;

.field private final supplementalDataScrubberDetails:Lcom/whoop/design/models/items/graph/plot/scrubber/SupplementalDataScrubberDetails;

.field private final unitDisplay:Ljava/lang/String;

.field private final value:Ljava/lang/Double;

.field private final valueDisplay:Lcom/whoop/design/util/TextResource;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->Companion:Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Ls51/p;

    const/16 v4, 0xf

    invoke-direct {v3, v4}, Ls51/p;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v4, Ls51/p;

    const/16 v5, 0x10

    invoke-direct {v4, v5}, Ls51/p;-><init>(I)V

    invoke-static {v2, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v4, 0xb

    new-array v4, v4, [Ll83/h;

    const/4 v5, 0x0

    aput-object v1, v4, v5

    const/4 v5, 0x1

    aput-object v1, v4, v5

    const/4 v5, 0x2

    aput-object v1, v4, v5

    const/4 v5, 0x3

    aput-object v1, v4, v5

    const/4 v5, 0x4

    aput-object v1, v4, v5

    const/4 v5, 0x5

    aput-object v3, v4, v5

    const/4 v3, 0x6

    aput-object v1, v4, v3

    const/4 v3, 0x7

    aput-object v1, v4, v3

    aput-object v1, v4, v0

    const/16 v0, 0x9

    aput-object v1, v4, v0

    const/16 v0, 0xa

    aput-object v2, v4, v0

    sput-object v4, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public constructor <init>()V
    .locals 14

    .line 1
    const/16 v12, 0x7ff

    const/4 v13, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v13}, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;-><init>(Ljava/lang/String;Ljava/lang/Double;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;La71/d;Ljava/lang/String;Lcom/whoop/design/models/items/graph/plot/scrubber/PhaseLabel;Lcom/whoop/design/models/items/graph/plot/scrubber/SupplementalDataScrubberDetails;Lcom/whoop/design/models/InfoCalloutTileModel;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/Double;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;La71/d;Ljava/lang/String;Lcom/whoop/design/models/items/graph/plot/scrubber/PhaseLabel;Lcom/whoop/design/models/items/graph/plot/scrubber/SupplementalDataScrubberDetails;Lcom/whoop/design/models/InfoCalloutTileModel;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p13, p1, 0x1

    const/4 v0, 0x0

    if-nez p13, :cond_0

    iput-object v0, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->primaryContextualDisplay:Ljava/lang/String;

    goto :goto_0

    :cond_0
    iput-object p2, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->primaryContextualDisplay:Ljava/lang/String;

    :goto_0
    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_1

    iput-object v0, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->value:Ljava/lang/Double;

    goto :goto_1

    :cond_1
    iput-object p3, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->value:Ljava/lang/Double;

    :goto_1
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    .line 3
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object p2

    .line 4
    iput-object p2, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->valueDisplay:Lcom/whoop/design/util/TextResource;

    goto :goto_2

    :cond_2
    iput-object p4, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->valueDisplay:Lcom/whoop/design/util/TextResource;

    :goto_2
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_3

    iput-object v0, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->unitDisplay:Ljava/lang/String;

    goto :goto_3

    :cond_3
    iput-object p5, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->unitDisplay:Ljava/lang/String;

    :goto_3
    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_4

    iput-object v0, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->secondaryContextualDisplay:Ljava/lang/String;

    goto :goto_4

    :cond_4
    iput-object p6, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->secondaryContextualDisplay:Ljava/lang/String;

    :goto_4
    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_5

    iput-object v0, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->scrubberStyle:La71/d;

    goto :goto_5

    :cond_5
    iput-object p7, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->scrubberStyle:La71/d;

    :goto_5
    and-int/lit8 p2, p1, 0x40

    if-nez p2, :cond_6

    iput-object v0, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->dataContext:Ljava/lang/String;

    goto :goto_6

    :cond_6
    iput-object p8, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->dataContext:Ljava/lang/String;

    :goto_6
    and-int/lit16 p2, p1, 0x80

    if-nez p2, :cond_7

    iput-object v0, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->phaseLabel:Lcom/whoop/design/models/items/graph/plot/scrubber/PhaseLabel;

    goto :goto_7

    :cond_7
    iput-object p9, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->phaseLabel:Lcom/whoop/design/models/items/graph/plot/scrubber/PhaseLabel;

    :goto_7
    and-int/lit16 p2, p1, 0x100

    if-nez p2, :cond_8

    iput-object v0, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->supplementalDataScrubberDetails:Lcom/whoop/design/models/items/graph/plot/scrubber/SupplementalDataScrubberDetails;

    goto :goto_8

    :cond_8
    iput-object p10, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->supplementalDataScrubberDetails:Lcom/whoop/design/models/items/graph/plot/scrubber/SupplementalDataScrubberDetails;

    :goto_8
    and-int/lit16 p2, p1, 0x200

    if-nez p2, :cond_9

    iput-object v0, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->callout:Lcom/whoop/design/models/InfoCalloutTileModel;

    goto :goto_9

    :cond_9
    iput-object p11, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->callout:Lcom/whoop/design/models/InfoCalloutTileModel;

    :goto_9
    and-int/lit16 p1, p1, 0x400

    if-nez p1, :cond_a

    iput-object v0, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->graphLegends:Ljava/util/List;

    return-void

    :cond_a
    iput-object p12, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->graphLegends:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Double;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;La71/d;Ljava/lang/String;Lcom/whoop/design/models/items/graph/plot/scrubber/PhaseLabel;Lcom/whoop/design/models/items/graph/plot/scrubber/SupplementalDataScrubberDetails;Lcom/whoop/design/models/InfoCalloutTileModel;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Double;",
            "Lcom/whoop/design/util/TextResource;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "La71/d;",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/items/graph/plot/scrubber/PhaseLabel;",
            "Lcom/whoop/design/models/items/graph/plot/scrubber/SupplementalDataScrubberDetails;",
            "Lcom/whoop/design/models/InfoCalloutTileModel;",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/graph/GraphLegendModel;",
            ">;)V"
        }
    .end annotation

    const-string v0, "valueDisplay"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->primaryContextualDisplay:Ljava/lang/String;

    .line 7
    iput-object p2, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->value:Ljava/lang/Double;

    .line 8
    iput-object p3, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->valueDisplay:Lcom/whoop/design/util/TextResource;

    .line 9
    iput-object p4, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->unitDisplay:Ljava/lang/String;

    .line 10
    iput-object p5, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->secondaryContextualDisplay:Ljava/lang/String;

    .line 11
    iput-object p6, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->scrubberStyle:La71/d;

    .line 12
    iput-object p7, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->dataContext:Ljava/lang/String;

    .line 13
    iput-object p8, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->phaseLabel:Lcom/whoop/design/models/items/graph/plot/scrubber/PhaseLabel;

    .line 14
    iput-object p9, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->supplementalDataScrubberDetails:Lcom/whoop/design/models/items/graph/plot/scrubber/SupplementalDataScrubberDetails;

    .line 15
    iput-object p10, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->callout:Lcom/whoop/design/models/InfoCalloutTileModel;

    .line 16
    iput-object p11, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->graphLegends:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/Double;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;La71/d;Ljava/lang/String;Lcom/whoop/design/models/items/graph/plot/scrubber/PhaseLabel;Lcom/whoop/design/models/items/graph/plot/scrubber/SupplementalDataScrubberDetails;Lcom/whoop/design/models/InfoCalloutTileModel;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p13, p12, 0x1

    const/4 v0, 0x0

    if-eqz p13, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p13, p12, 0x2

    if-eqz p13, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p13, p12, 0x4

    if-eqz p13, :cond_2

    .line 17
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object p3

    :cond_2
    and-int/lit8 p13, p12, 0x8

    if-eqz p13, :cond_3

    move-object p4, v0

    :cond_3
    and-int/lit8 p13, p12, 0x10

    if-eqz p13, :cond_4

    move-object p5, v0

    :cond_4
    and-int/lit8 p13, p12, 0x20

    if-eqz p13, :cond_5

    move-object p6, v0

    :cond_5
    and-int/lit8 p13, p12, 0x40

    if-eqz p13, :cond_6

    move-object p7, v0

    :cond_6
    and-int/lit16 p13, p12, 0x80

    if-eqz p13, :cond_7

    move-object p8, v0

    :cond_7
    and-int/lit16 p13, p12, 0x100

    if-eqz p13, :cond_8

    move-object p9, v0

    :cond_8
    and-int/lit16 p13, p12, 0x200

    if-eqz p13, :cond_9

    move-object p10, v0

    :cond_9
    and-int/lit16 p12, p12, 0x400

    if-eqz p12, :cond_a

    move-object p12, v0

    :goto_0
    move-object p11, p10

    move-object p10, p9

    move-object p9, p8

    move-object p8, p7

    move-object p7, p6

    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_a
    move-object p12, p11

    goto :goto_0

    .line 18
    :goto_1
    invoke-direct/range {p1 .. p12}, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;-><init>(Ljava/lang/String;Ljava/lang/Double;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;La71/d;Ljava/lang/String;Lcom/whoop/design/models/items/graph/plot/scrubber/PhaseLabel;Lcom/whoop/design/models/items/graph/plot/scrubber/SupplementalDataScrubberDetails;Lcom/whoop/design/models/InfoCalloutTileModel;Ljava/util/List;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.atomic.organism.graph.plot.scrubber.ScrubberStyle"

    invoke-static {}, La71/d;->values()[La71/d;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/design/models/items/graph/GraphLegendModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/graph/GraphLegendModel$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;Ljava/lang/String;Ljava/lang/Double;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;La71/d;Ljava/lang/String;Lcom/whoop/design/models/items/graph/plot/scrubber/PhaseLabel;Lcom/whoop/design/models/items/graph/plot/scrubber/SupplementalDataScrubberDetails;Lcom/whoop/design/models/InfoCalloutTileModel;Ljava/util/List;ILjava/lang/Object;)Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;
    .locals 0

    and-int/lit8 p13, p12, 0x1

    if-eqz p13, :cond_0

    iget-object p1, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->primaryContextualDisplay:Ljava/lang/String;

    :cond_0
    and-int/lit8 p13, p12, 0x2

    if-eqz p13, :cond_1

    iget-object p2, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->value:Ljava/lang/Double;

    :cond_1
    and-int/lit8 p13, p12, 0x4

    if-eqz p13, :cond_2

    iget-object p3, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->valueDisplay:Lcom/whoop/design/util/TextResource;

    :cond_2
    and-int/lit8 p13, p12, 0x8

    if-eqz p13, :cond_3

    iget-object p4, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->unitDisplay:Ljava/lang/String;

    :cond_3
    and-int/lit8 p13, p12, 0x10

    if-eqz p13, :cond_4

    iget-object p5, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->secondaryContextualDisplay:Ljava/lang/String;

    :cond_4
    and-int/lit8 p13, p12, 0x20

    if-eqz p13, :cond_5

    iget-object p6, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->scrubberStyle:La71/d;

    :cond_5
    and-int/lit8 p13, p12, 0x40

    if-eqz p13, :cond_6

    iget-object p7, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->dataContext:Ljava/lang/String;

    :cond_6
    and-int/lit16 p13, p12, 0x80

    if-eqz p13, :cond_7

    iget-object p8, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->phaseLabel:Lcom/whoop/design/models/items/graph/plot/scrubber/PhaseLabel;

    :cond_7
    and-int/lit16 p13, p12, 0x100

    if-eqz p13, :cond_8

    iget-object p9, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->supplementalDataScrubberDetails:Lcom/whoop/design/models/items/graph/plot/scrubber/SupplementalDataScrubberDetails;

    :cond_8
    and-int/lit16 p13, p12, 0x200

    if-eqz p13, :cond_9

    iget-object p10, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->callout:Lcom/whoop/design/models/InfoCalloutTileModel;

    :cond_9
    and-int/lit16 p12, p12, 0x400

    if-eqz p12, :cond_a

    iget-object p11, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->graphLegends:Ljava/util/List;

    :cond_a
    move-object p12, p10

    move-object p13, p11

    move-object p10, p8

    move-object p11, p9

    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p13}, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->copy(Ljava/lang/String;Ljava/lang/Double;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;La71/d;Ljava/lang/String;Lcom/whoop/design/models/items/graph/plot/scrubber/PhaseLabel;Lcom/whoop/design/models/items/graph/plot/scrubber/SupplementalDataScrubberDetails;Lcom/whoop/design/models/InfoCalloutTileModel;Ljava/util/List;)Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->primaryContextualDisplay:Ljava/lang/String;

    if-eqz v2, :cond_1

    :goto_0
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->primaryContextualDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v1, 0x1

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->value:Ljava/lang/Double;

    if-eqz v2, :cond_3

    :goto_1
    sget-object v2, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->value:Ljava/lang/Double;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v1, 0x2

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->valueDisplay:Lcom/whoop/design/util/TextResource;

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    :goto_2
    sget-object v2, Lmd1/a;->a:Lmd1/a;

    iget-object v3, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->valueDisplay:Lcom/whoop/design/util/TextResource;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v1, 0x3

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->unitDisplay:Ljava/lang/String;

    if-eqz v2, :cond_7

    :goto_3
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->unitDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/4 v1, 0x4

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_8

    goto :goto_4

    :cond_8
    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->secondaryContextualDisplay:Ljava/lang/String;

    if-eqz v2, :cond_9

    :goto_4
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->secondaryContextualDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    const/4 v1, 0x5

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_a

    goto :goto_5

    :cond_a
    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->scrubberStyle:La71/d;

    if-eqz v2, :cond_b

    :goto_5
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->scrubberStyle:La71/d;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_b
    const/4 v1, 0x6

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_c

    goto :goto_6

    :cond_c
    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->dataContext:Ljava/lang/String;

    if-eqz v2, :cond_d

    :goto_6
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->dataContext:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_d
    const/4 v1, 0x7

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_e

    goto :goto_7

    :cond_e
    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->phaseLabel:Lcom/whoop/design/models/items/graph/plot/scrubber/PhaseLabel;

    if-eqz v2, :cond_f

    :goto_7
    sget-object v2, Lcom/whoop/design/models/items/graph/plot/scrubber/PhaseLabel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/graph/plot/scrubber/PhaseLabel$$serializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->phaseLabel:Lcom/whoop/design/models/items/graph/plot/scrubber/PhaseLabel;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_f
    const/16 v1, 0x8

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_10

    goto :goto_8

    :cond_10
    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->supplementalDataScrubberDetails:Lcom/whoop/design/models/items/graph/plot/scrubber/SupplementalDataScrubberDetails;

    if-eqz v2, :cond_11

    :goto_8
    sget-object v2, Lcom/whoop/design/models/items/graph/plot/scrubber/SupplementalDataScrubberDetails$$serializer;->INSTANCE:Lcom/whoop/design/models/items/graph/plot/scrubber/SupplementalDataScrubberDetails$$serializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->supplementalDataScrubberDetails:Lcom/whoop/design/models/items/graph/plot/scrubber/SupplementalDataScrubberDetails;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_11
    const/16 v1, 0x9

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_12

    goto :goto_9

    :cond_12
    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->callout:Lcom/whoop/design/models/InfoCalloutTileModel;

    if-eqz v2, :cond_13

    :goto_9
    sget-object v2, Lcom/whoop/design/models/InfoCalloutTileModel$$serializer;->INSTANCE:Lcom/whoop/design/models/InfoCalloutTileModel$$serializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->callout:Lcom/whoop/design/models/InfoCalloutTileModel;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_13
    const/16 v1, 0xa

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_14

    goto :goto_a

    :cond_14
    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->graphLegends:Ljava/util/List;

    if-eqz v2, :cond_15

    :goto_a
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->graphLegends:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_15
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->primaryContextualDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Lcom/whoop/design/models/InfoCalloutTileModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->callout:Lcom/whoop/design/models/InfoCalloutTileModel;

    return-object v0
.end method

.method public final component11()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/graph/GraphLegendModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->graphLegends:Ljava/util/List;

    return-object v0
.end method

.method public final component2()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->value:Ljava/lang/Double;

    return-object v0
.end method

.method public final component3()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->valueDisplay:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->unitDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->secondaryContextualDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()La71/d;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->scrubberStyle:La71/d;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->dataContext:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Lcom/whoop/design/models/items/graph/plot/scrubber/PhaseLabel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->phaseLabel:Lcom/whoop/design/models/items/graph/plot/scrubber/PhaseLabel;

    return-object v0
.end method

.method public final component9()Lcom/whoop/design/models/items/graph/plot/scrubber/SupplementalDataScrubberDetails;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->supplementalDataScrubberDetails:Lcom/whoop/design/models/items/graph/plot/scrubber/SupplementalDataScrubberDetails;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/Double;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;La71/d;Ljava/lang/String;Lcom/whoop/design/models/items/graph/plot/scrubber/PhaseLabel;Lcom/whoop/design/models/items/graph/plot/scrubber/SupplementalDataScrubberDetails;Lcom/whoop/design/models/InfoCalloutTileModel;Ljava/util/List;)Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Double;",
            "Lcom/whoop/design/util/TextResource;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "La71/d;",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/items/graph/plot/scrubber/PhaseLabel;",
            "Lcom/whoop/design/models/items/graph/plot/scrubber/SupplementalDataScrubberDetails;",
            "Lcom/whoop/design/models/InfoCalloutTileModel;",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/graph/GraphLegendModel;",
            ">;)",
            "Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;"
        }
    .end annotation

    const-string v0, "valueDisplay"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;

    move-object v2, p1

    move-object v3, p2

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    invoke-direct/range {v1 .. v12}, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;-><init>(Ljava/lang/String;Ljava/lang/Double;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;La71/d;Ljava/lang/String;Lcom/whoop/design/models/items/graph/plot/scrubber/PhaseLabel;Lcom/whoop/design/models/items/graph/plot/scrubber/SupplementalDataScrubberDetails;Lcom/whoop/design/models/InfoCalloutTileModel;Ljava/util/List;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;

    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->primaryContextualDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->primaryContextualDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->value:Ljava/lang/Double;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->value:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->valueDisplay:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->valueDisplay:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->unitDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->unitDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->secondaryContextualDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->secondaryContextualDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->scrubberStyle:La71/d;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->scrubberStyle:La71/d;

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->dataContext:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->dataContext:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->phaseLabel:Lcom/whoop/design/models/items/graph/plot/scrubber/PhaseLabel;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->phaseLabel:Lcom/whoop/design/models/items/graph/plot/scrubber/PhaseLabel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->supplementalDataScrubberDetails:Lcom/whoop/design/models/items/graph/plot/scrubber/SupplementalDataScrubberDetails;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->supplementalDataScrubberDetails:Lcom/whoop/design/models/items/graph/plot/scrubber/SupplementalDataScrubberDetails;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->callout:Lcom/whoop/design/models/InfoCalloutTileModel;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->callout:Lcom/whoop/design/models/InfoCalloutTileModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->graphLegends:Ljava/util/List;

    iget-object p1, p1, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->graphLegends:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_c

    return v2

    :cond_c
    return v0
.end method

.method public final getCallout()Lcom/whoop/design/models/InfoCalloutTileModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->callout:Lcom/whoop/design/models/InfoCalloutTileModel;

    return-object v0
.end method

.method public final getDataContext()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->dataContext:Ljava/lang/String;

    return-object v0
.end method

.method public final getGraphLegends()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/graph/GraphLegendModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->graphLegends:Ljava/util/List;

    return-object v0
.end method

.method public final getPhaseLabel()Lcom/whoop/design/models/items/graph/plot/scrubber/PhaseLabel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->phaseLabel:Lcom/whoop/design/models/items/graph/plot/scrubber/PhaseLabel;

    return-object v0
.end method

.method public final getPrimaryContextualDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->primaryContextualDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getScrubberStyle()La71/d;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->scrubberStyle:La71/d;

    return-object v0
.end method

.method public final getSecondaryContextualDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->secondaryContextualDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getSupplementalDataScrubberDetails()Lcom/whoop/design/models/items/graph/plot/scrubber/SupplementalDataScrubberDetails;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->supplementalDataScrubberDetails:Lcom/whoop/design/models/items/graph/plot/scrubber/SupplementalDataScrubberDetails;

    return-object v0
.end method

.method public final getUnitDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->unitDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getValue()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->value:Ljava/lang/Double;

    return-object v0
.end method

.method public final getValueDisplay()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->valueDisplay:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->primaryContextualDisplay:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->value:Ljava/lang/Double;

    if-nez v3, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->valueDisplay:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v3, v2}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->unitDisplay:Ljava/lang/String;

    if-nez v3, :cond_2

    move v3, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->secondaryContextualDisplay:Ljava/lang/String;

    if-nez v3, :cond_3

    move v3, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->scrubberStyle:La71/d;

    if-nez v3, :cond_4

    move v3, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_4
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->dataContext:Ljava/lang/String;

    if-nez v3, :cond_5

    move v3, v1

    goto :goto_5

    :cond_5
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_5
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->phaseLabel:Lcom/whoop/design/models/items/graph/plot/scrubber/PhaseLabel;

    if-nez v3, :cond_6

    move v3, v1

    goto :goto_6

    :cond_6
    invoke-virtual {v3}, Lcom/whoop/design/models/items/graph/plot/scrubber/PhaseLabel;->hashCode()I

    move-result v3

    :goto_6
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->supplementalDataScrubberDetails:Lcom/whoop/design/models/items/graph/plot/scrubber/SupplementalDataScrubberDetails;

    if-nez v3, :cond_7

    move v3, v1

    goto :goto_7

    :cond_7
    invoke-virtual {v3}, Lcom/whoop/design/models/items/graph/plot/scrubber/SupplementalDataScrubberDetails;->hashCode()I

    move-result v3

    :goto_7
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->callout:Lcom/whoop/design/models/InfoCalloutTileModel;

    if-nez v3, :cond_8

    move v3, v1

    goto :goto_8

    :cond_8
    invoke-virtual {v3}, Lcom/whoop/design/models/InfoCalloutTileModel;->hashCode()I

    move-result v3

    :goto_8
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->graphLegends:Ljava/util/List;

    if-nez v2, :cond_9

    goto :goto_9

    :cond_9
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_9
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 13

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->primaryContextualDisplay:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->value:Ljava/lang/Double;

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->valueDisplay:Lcom/whoop/design/util/TextResource;

    iget-object v3, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->unitDisplay:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->secondaryContextualDisplay:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->scrubberStyle:La71/d;

    iget-object v6, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->dataContext:Ljava/lang/String;

    iget-object v7, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->phaseLabel:Lcom/whoop/design/models/items/graph/plot/scrubber/PhaseLabel;

    iget-object v8, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->supplementalDataScrubberDetails:Lcom/whoop/design/models/items/graph/plot/scrubber/SupplementalDataScrubberDetails;

    iget-object v9, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->callout:Lcom/whoop/design/models/InfoCalloutTileModel;

    iget-object v10, p0, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->graphLegends:Ljava/util/List;

    new-instance v11, Ljava/lang/StringBuilder;

    const-string v12, "DataScrubberDetailsModel(primaryContextualDisplay="

    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", value="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", valueDisplay="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", unitDisplay="

    const-string v1, ", secondaryContextualDisplay="

    invoke-static {v11, v2, v0, v3, v1}, Lq63/c;->z(Ljava/lang/StringBuilder;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", scrubberStyle="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", dataContext="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", phaseLabel="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", supplementalDataScrubberDetails="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", callout="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", graphLegends="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v11, v10, v0}, Lc13/a;->m(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
