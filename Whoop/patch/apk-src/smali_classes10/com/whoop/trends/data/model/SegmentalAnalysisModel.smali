.class public final Lcom/whoop/trends/data/model/SegmentalAnalysisModel;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/trends/data/model/SegmentalAnalysisModel$$serializer;,
        Lcom/whoop/trends/data/model/SegmentalAnalysisModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0010\u000b\n\u0002\u0008\u0017\u0008\u0087\u0008\u0018\u0000 D2\u00020\u0001:\u0002EDBC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u000b\u00a2\u0006\u0004\u0008\u000e\u0010\u000fB]\u0008\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u000b\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0004\u0008\u000e\u0010\u0014J\'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0010\u0010\"\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010!J\u0012\u0010#\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010&J\u0018\u0010\'\u001a\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010(JX\u0010)\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00042\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0010\u0008\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u000bH\u00c6\u0001\u00a2\u0006\u0004\u0008)\u0010*J\u0010\u0010+\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008+\u0010!J\u0010\u0010,\u001a\u00020\u0010H\u00d6\u0001\u00a2\u0006\u0004\u0008,\u0010-J\u001a\u00100\u001a\u00020/2\u0008\u0010.\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u00080\u00101R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0003\u00102\u0012\u0004\u00084\u00105\u001a\u0004\u00083\u0010\u001fR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0005\u00106\u0012\u0004\u00088\u00105\u001a\u0004\u00087\u0010!R \u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0006\u00106\u0012\u0004\u0008:\u00105\u001a\u0004\u00089\u0010!R\"\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0008\u0010;\u0012\u0004\u0008=\u00105\u001a\u0004\u0008<\u0010$R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\n\u0010>\u0012\u0004\u0008@\u00105\u001a\u0004\u0008?\u0010&R(\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\r\u0010A\u0012\u0004\u0008C\u00105\u001a\u0004\u0008B\u0010(\u00a8\u0006F"
    }
    d2 = {
        "Lcom/whoop/trends/data/model/SegmentalAnalysisModel;",
        "",
        "Lcom/whoop/trends/data/model/SegmentalAnalysisHeaderModel;",
        "header",
        "",
        "primarySectionLabel",
        "secondarySectionLabel",
        "Lcom/whoop/trends/data/model/SegmentalAnalysisEmptyStateModel;",
        "emptyState",
        "Lcom/whoop/trends/data/model/TimeSegmentLastUpdated;",
        "lastUpdated",
        "",
        "Lcom/whoop/trends/data/model/SegmentalAnalysisSegmentModel;",
        "segments",
        "<init>",
        "(Lcom/whoop/trends/data/model/SegmentalAnalysisHeaderModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/SegmentalAnalysisEmptyStateModel;Lcom/whoop/trends/data/model/TimeSegmentLastUpdated;Ljava/util/List;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/trends/data/model/SegmentalAnalysisHeaderModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/SegmentalAnalysisEmptyStateModel;Lcom/whoop/trends/data/model/TimeSegmentLastUpdated;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$trends_release",
        "(Lcom/whoop/trends/data/model/SegmentalAnalysisModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Lcom/whoop/trends/data/model/SegmentalAnalysisHeaderModel;",
        "component2",
        "()Ljava/lang/String;",
        "component3",
        "component4",
        "()Lcom/whoop/trends/data/model/SegmentalAnalysisEmptyStateModel;",
        "component5",
        "()Lcom/whoop/trends/data/model/TimeSegmentLastUpdated;",
        "component6",
        "()Ljava/util/List;",
        "copy",
        "(Lcom/whoop/trends/data/model/SegmentalAnalysisHeaderModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/SegmentalAnalysisEmptyStateModel;Lcom/whoop/trends/data/model/TimeSegmentLastUpdated;Ljava/util/List;)Lcom/whoop/trends/data/model/SegmentalAnalysisModel;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/trends/data/model/SegmentalAnalysisHeaderModel;",
        "getHeader",
        "getHeader$annotations",
        "()V",
        "Ljava/lang/String;",
        "getPrimarySectionLabel",
        "getPrimarySectionLabel$annotations",
        "getSecondarySectionLabel",
        "getSecondarySectionLabel$annotations",
        "Lcom/whoop/trends/data/model/SegmentalAnalysisEmptyStateModel;",
        "getEmptyState",
        "getEmptyState$annotations",
        "Lcom/whoop/trends/data/model/TimeSegmentLastUpdated;",
        "getLastUpdated",
        "getLastUpdated$annotations",
        "Ljava/util/List;",
        "getSegments",
        "getSegments$annotations",
        "Companion",
        "$serializer",
        "trends_release"
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

.field public static final Companion:Lcom/whoop/trends/data/model/SegmentalAnalysisModel$Companion;


# instance fields
.field private final emptyState:Lcom/whoop/trends/data/model/SegmentalAnalysisEmptyStateModel;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "empty_state"
    .end annotation
.end field

.field private final header:Lcom/whoop/trends/data/model/SegmentalAnalysisHeaderModel;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "header"
    .end annotation
.end field

.field private final lastUpdated:Lcom/whoop/trends/data/model/TimeSegmentLastUpdated;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "last_updated"
    .end annotation
.end field

.field private final primarySectionLabel:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "primary_section_label"
    .end annotation
.end field

.field private final secondarySectionLabel:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "secondary_section_label"
    .end annotation
.end field

.field private final segments:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "segments"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/trends/data/model/SegmentalAnalysisSegmentModel;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/trends/data/model/SegmentalAnalysisModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/trends/data/model/SegmentalAnalysisModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/trends/data/model/SegmentalAnalysisModel;->Companion:Lcom/whoop/trends/data/model/SegmentalAnalysisModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/trends/data/model/SegmentalAnalysisModel;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lwl2/a;

    const/4 v3, 0x4

    invoke-direct {v2, v3}, Lwl2/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v2, 0x6

    new-array v2, v2, [Ll83/h;

    const/4 v4, 0x0

    aput-object v1, v2, v4

    const/4 v4, 0x1

    aput-object v1, v2, v4

    const/4 v4, 0x2

    aput-object v1, v2, v4

    const/4 v4, 0x3

    aput-object v1, v2, v4

    aput-object v1, v2, v3

    const/4 v1, 0x5

    aput-object v0, v2, v1

    sput-object v2, Lcom/whoop/trends/data/model/SegmentalAnalysisModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/trends/data/model/SegmentalAnalysisHeaderModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/SegmentalAnalysisEmptyStateModel;Lcom/whoop/trends/data/model/TimeSegmentLastUpdated;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p8, p1, 0x3f

    const/16 v0, 0x3f

    if-eq v0, p8, :cond_0

    .line 1
    sget-object p8, Lcom/whoop/trends/data/model/SegmentalAnalysisModel$$serializer;->INSTANCE:Lcom/whoop/trends/data/model/SegmentalAnalysisModel$$serializer;

    invoke-virtual {p8}, Lcom/whoop/trends/data/model/SegmentalAnalysisModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p8

    invoke-static {p1, v0, p8}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/trends/data/model/SegmentalAnalysisModel;->header:Lcom/whoop/trends/data/model/SegmentalAnalysisHeaderModel;

    iput-object p3, p0, Lcom/whoop/trends/data/model/SegmentalAnalysisModel;->primarySectionLabel:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/trends/data/model/SegmentalAnalysisModel;->secondarySectionLabel:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/trends/data/model/SegmentalAnalysisModel;->emptyState:Lcom/whoop/trends/data/model/SegmentalAnalysisEmptyStateModel;

    iput-object p6, p0, Lcom/whoop/trends/data/model/SegmentalAnalysisModel;->lastUpdated:Lcom/whoop/trends/data/model/TimeSegmentLastUpdated;

    iput-object p7, p0, Lcom/whoop/trends/data/model/SegmentalAnalysisModel;->segments:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/trends/data/model/SegmentalAnalysisHeaderModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/SegmentalAnalysisEmptyStateModel;Lcom/whoop/trends/data/model/TimeSegmentLastUpdated;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/trends/data/model/SegmentalAnalysisHeaderModel;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/trends/data/model/SegmentalAnalysisEmptyStateModel;",
            "Lcom/whoop/trends/data/model/TimeSegmentLastUpdated;",
            "Ljava/util/List<",
            "Lcom/whoop/trends/data/model/SegmentalAnalysisSegmentModel;",
            ">;)V"
        }
    .end annotation

    const-string v0, "header"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "primarySectionLabel"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "secondarySectionLabel"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/trends/data/model/SegmentalAnalysisModel;->header:Lcom/whoop/trends/data/model/SegmentalAnalysisHeaderModel;

    .line 4
    iput-object p2, p0, Lcom/whoop/trends/data/model/SegmentalAnalysisModel;->primarySectionLabel:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/trends/data/model/SegmentalAnalysisModel;->secondarySectionLabel:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/trends/data/model/SegmentalAnalysisModel;->emptyState:Lcom/whoop/trends/data/model/SegmentalAnalysisEmptyStateModel;

    .line 7
    iput-object p5, p0, Lcom/whoop/trends/data/model/SegmentalAnalysisModel;->lastUpdated:Lcom/whoop/trends/data/model/TimeSegmentLastUpdated;

    .line 8
    iput-object p6, p0, Lcom/whoop/trends/data/model/SegmentalAnalysisModel;->segments:Ljava/util/List;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/trends/data/model/SegmentalAnalysisSegmentModel$$serializer;->INSTANCE:Lcom/whoop/trends/data/model/SegmentalAnalysisSegmentModel$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/trends/data/model/SegmentalAnalysisModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/trends/data/model/SegmentalAnalysisModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/trends/data/model/SegmentalAnalysisModel;Lcom/whoop/trends/data/model/SegmentalAnalysisHeaderModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/SegmentalAnalysisEmptyStateModel;Lcom/whoop/trends/data/model/TimeSegmentLastUpdated;Ljava/util/List;ILjava/lang/Object;)Lcom/whoop/trends/data/model/SegmentalAnalysisModel;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lcom/whoop/trends/data/model/SegmentalAnalysisModel;->header:Lcom/whoop/trends/data/model/SegmentalAnalysisHeaderModel;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lcom/whoop/trends/data/model/SegmentalAnalysisModel;->primarySectionLabel:Ljava/lang/String;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-object p3, p0, Lcom/whoop/trends/data/model/SegmentalAnalysisModel;->secondarySectionLabel:Ljava/lang/String;

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-object p4, p0, Lcom/whoop/trends/data/model/SegmentalAnalysisModel;->emptyState:Lcom/whoop/trends/data/model/SegmentalAnalysisEmptyStateModel;

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget-object p5, p0, Lcom/whoop/trends/data/model/SegmentalAnalysisModel;->lastUpdated:Lcom/whoop/trends/data/model/TimeSegmentLastUpdated;

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget-object p6, p0, Lcom/whoop/trends/data/model/SegmentalAnalysisModel;->segments:Ljava/util/List;

    :cond_5
    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lcom/whoop/trends/data/model/SegmentalAnalysisModel;->copy(Lcom/whoop/trends/data/model/SegmentalAnalysisHeaderModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/SegmentalAnalysisEmptyStateModel;Lcom/whoop/trends/data/model/TimeSegmentLastUpdated;Ljava/util/List;)Lcom/whoop/trends/data/model/SegmentalAnalysisModel;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getEmptyState$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "empty_state"
    .end annotation

    return-void
.end method

.method public static synthetic getHeader$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "header"
    .end annotation

    return-void
.end method

.method public static synthetic getLastUpdated$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "last_updated"
    .end annotation

    return-void
.end method

.method public static synthetic getPrimarySectionLabel$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "primary_section_label"
    .end annotation

    return-void
.end method

.method public static synthetic getSecondarySectionLabel$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "secondary_section_label"
    .end annotation

    return-void
.end method

.method public static synthetic getSegments$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "segments"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$trends_release(Lcom/whoop/trends/data/model/SegmentalAnalysisModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/trends/data/model/SegmentalAnalysisModel;->$childSerializers:[Ll83/h;

    sget-object v1, Lcom/whoop/trends/data/model/SegmentalAnalysisHeaderModel$$serializer;->INSTANCE:Lcom/whoop/trends/data/model/SegmentalAnalysisHeaderModel$$serializer;

    iget-object v2, p0, Lcom/whoop/trends/data/model/SegmentalAnalysisModel;->header:Lcom/whoop/trends/data/model/SegmentalAnalysisHeaderModel;

    const/4 v3, 0x0

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/whoop/trends/data/model/SegmentalAnalysisModel;->primarySectionLabel:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/whoop/trends/data/model/SegmentalAnalysisModel;->secondarySectionLabel:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v1, Lcom/whoop/trends/data/model/SegmentalAnalysisEmptyStateModel$$serializer;->INSTANCE:Lcom/whoop/trends/data/model/SegmentalAnalysisEmptyStateModel$$serializer;

    iget-object v2, p0, Lcom/whoop/trends/data/model/SegmentalAnalysisModel;->emptyState:Lcom/whoop/trends/data/model/SegmentalAnalysisEmptyStateModel;

    const/4 v3, 0x3

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/trends/data/model/TimeSegmentLastUpdated$$serializer;->INSTANCE:Lcom/whoop/trends/data/model/TimeSegmentLastUpdated$$serializer;

    iget-object v2, p0, Lcom/whoop/trends/data/model/SegmentalAnalysisModel;->lastUpdated:Lcom/whoop/trends/data/model/TimeSegmentLastUpdated;

    const/4 v3, 0x4

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x5

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/trends/data/model/SegmentalAnalysisModel;->segments:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/trends/data/model/SegmentalAnalysisHeaderModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/SegmentalAnalysisModel;->header:Lcom/whoop/trends/data/model/SegmentalAnalysisHeaderModel;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/SegmentalAnalysisModel;->primarySectionLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/SegmentalAnalysisModel;->secondarySectionLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Lcom/whoop/trends/data/model/SegmentalAnalysisEmptyStateModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/SegmentalAnalysisModel;->emptyState:Lcom/whoop/trends/data/model/SegmentalAnalysisEmptyStateModel;

    return-object v0
.end method

.method public final component5()Lcom/whoop/trends/data/model/TimeSegmentLastUpdated;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/SegmentalAnalysisModel;->lastUpdated:Lcom/whoop/trends/data/model/TimeSegmentLastUpdated;

    return-object v0
.end method

.method public final component6()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/trends/data/model/SegmentalAnalysisSegmentModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/trends/data/model/SegmentalAnalysisModel;->segments:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Lcom/whoop/trends/data/model/SegmentalAnalysisHeaderModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/SegmentalAnalysisEmptyStateModel;Lcom/whoop/trends/data/model/TimeSegmentLastUpdated;Ljava/util/List;)Lcom/whoop/trends/data/model/SegmentalAnalysisModel;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/trends/data/model/SegmentalAnalysisHeaderModel;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/trends/data/model/SegmentalAnalysisEmptyStateModel;",
            "Lcom/whoop/trends/data/model/TimeSegmentLastUpdated;",
            "Ljava/util/List<",
            "Lcom/whoop/trends/data/model/SegmentalAnalysisSegmentModel;",
            ">;)",
            "Lcom/whoop/trends/data/model/SegmentalAnalysisModel;"
        }
    .end annotation

    const-string v0, "header"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "primarySectionLabel"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "secondarySectionLabel"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/trends/data/model/SegmentalAnalysisModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/whoop/trends/data/model/SegmentalAnalysisModel;-><init>(Lcom/whoop/trends/data/model/SegmentalAnalysisHeaderModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/SegmentalAnalysisEmptyStateModel;Lcom/whoop/trends/data/model/TimeSegmentLastUpdated;Ljava/util/List;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/trends/data/model/SegmentalAnalysisModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/trends/data/model/SegmentalAnalysisModel;

    iget-object v1, p0, Lcom/whoop/trends/data/model/SegmentalAnalysisModel;->header:Lcom/whoop/trends/data/model/SegmentalAnalysisHeaderModel;

    iget-object v3, p1, Lcom/whoop/trends/data/model/SegmentalAnalysisModel;->header:Lcom/whoop/trends/data/model/SegmentalAnalysisHeaderModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/trends/data/model/SegmentalAnalysisModel;->primarySectionLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/trends/data/model/SegmentalAnalysisModel;->primarySectionLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/trends/data/model/SegmentalAnalysisModel;->secondarySectionLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/trends/data/model/SegmentalAnalysisModel;->secondarySectionLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/trends/data/model/SegmentalAnalysisModel;->emptyState:Lcom/whoop/trends/data/model/SegmentalAnalysisEmptyStateModel;

    iget-object v3, p1, Lcom/whoop/trends/data/model/SegmentalAnalysisModel;->emptyState:Lcom/whoop/trends/data/model/SegmentalAnalysisEmptyStateModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/trends/data/model/SegmentalAnalysisModel;->lastUpdated:Lcom/whoop/trends/data/model/TimeSegmentLastUpdated;

    iget-object v3, p1, Lcom/whoop/trends/data/model/SegmentalAnalysisModel;->lastUpdated:Lcom/whoop/trends/data/model/TimeSegmentLastUpdated;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/trends/data/model/SegmentalAnalysisModel;->segments:Ljava/util/List;

    iget-object p1, p1, Lcom/whoop/trends/data/model/SegmentalAnalysisModel;->segments:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getEmptyState()Lcom/whoop/trends/data/model/SegmentalAnalysisEmptyStateModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/SegmentalAnalysisModel;->emptyState:Lcom/whoop/trends/data/model/SegmentalAnalysisEmptyStateModel;

    return-object v0
.end method

.method public final getHeader()Lcom/whoop/trends/data/model/SegmentalAnalysisHeaderModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/SegmentalAnalysisModel;->header:Lcom/whoop/trends/data/model/SegmentalAnalysisHeaderModel;

    return-object v0
.end method

.method public final getLastUpdated()Lcom/whoop/trends/data/model/TimeSegmentLastUpdated;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/SegmentalAnalysisModel;->lastUpdated:Lcom/whoop/trends/data/model/TimeSegmentLastUpdated;

    return-object v0
.end method

.method public final getPrimarySectionLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/SegmentalAnalysisModel;->primarySectionLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getSecondarySectionLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/SegmentalAnalysisModel;->secondarySectionLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getSegments()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/trends/data/model/SegmentalAnalysisSegmentModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/trends/data/model/SegmentalAnalysisModel;->segments:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/trends/data/model/SegmentalAnalysisModel;->header:Lcom/whoop/trends/data/model/SegmentalAnalysisHeaderModel;

    invoke-virtual {v0}, Lcom/whoop/trends/data/model/SegmentalAnalysisHeaderModel;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/trends/data/model/SegmentalAnalysisModel;->primarySectionLabel:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/trends/data/model/SegmentalAnalysisModel;->secondarySectionLabel:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/trends/data/model/SegmentalAnalysisModel;->emptyState:Lcom/whoop/trends/data/model/SegmentalAnalysisEmptyStateModel;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lcom/whoop/trends/data/model/SegmentalAnalysisEmptyStateModel;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/trends/data/model/SegmentalAnalysisModel;->lastUpdated:Lcom/whoop/trends/data/model/TimeSegmentLastUpdated;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lcom/whoop/trends/data/model/TimeSegmentLastUpdated;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/trends/data/model/SegmentalAnalysisModel;->segments:Ljava/util/List;

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
    .locals 8

    iget-object v0, p0, Lcom/whoop/trends/data/model/SegmentalAnalysisModel;->header:Lcom/whoop/trends/data/model/SegmentalAnalysisHeaderModel;

    iget-object v1, p0, Lcom/whoop/trends/data/model/SegmentalAnalysisModel;->primarySectionLabel:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/trends/data/model/SegmentalAnalysisModel;->secondarySectionLabel:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/trends/data/model/SegmentalAnalysisModel;->emptyState:Lcom/whoop/trends/data/model/SegmentalAnalysisEmptyStateModel;

    iget-object v4, p0, Lcom/whoop/trends/data/model/SegmentalAnalysisModel;->lastUpdated:Lcom/whoop/trends/data/model/TimeSegmentLastUpdated;

    iget-object v5, p0, Lcom/whoop/trends/data/model/SegmentalAnalysisModel;->segments:Ljava/util/List;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "SegmentalAnalysisModel(header="

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", primarySectionLabel="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", secondarySectionLabel="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", emptyState="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", lastUpdated="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", segments="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
