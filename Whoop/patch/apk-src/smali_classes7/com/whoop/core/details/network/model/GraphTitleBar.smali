.class public final Lcom/whoop/core/details/network/model/GraphTitleBar;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/core/details/network/model/GraphTitleBar$$serializer;,
        Lcom/whoop/core/details/network/model/GraphTitleBar$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0010\u000b\n\u0002\u0008\u0012\u0008\u0087\u0008\u0018\u0000 82\u00020\u0001:\u000298B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\u0008\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\n\u0010\u000bBW\u0008\u0010\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0004\u0008\n\u0010\u0010J\'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001bJ\u0010\u0010 \u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u001bJ\u0010\u0010!\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\u001eJL\u0010\"\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00022\u0008\u0008\u0002\u0010\t\u001a\u00020\u0005H\u00c6\u0001\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010$\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008$\u0010\u001bJ\u0010\u0010%\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u0008%\u0010&J\u001a\u0010)\u001a\u00020(2\u0008\u0010\'\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008)\u0010*R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0003\u0010+\u0012\u0004\u0008-\u0010.\u001a\u0004\u0008,\u0010\u001bR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0004\u0010+\u0012\u0004\u00080\u0010.\u001a\u0004\u0008/\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00101\u001a\u0004\u00082\u0010\u001eR \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0007\u0010+\u0012\u0004\u00084\u0010.\u001a\u0004\u00083\u0010\u001bR \u0010\u0008\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0008\u0010+\u0012\u0004\u00086\u0010.\u001a\u0004\u00085\u0010\u001bR\u0017\u0010\t\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00101\u001a\u0004\u00087\u0010\u001e\u00a8\u0006:"
    }
    d2 = {
        "Lcom/whoop/core/details/network/model/GraphTitleBar;",
        "",
        "",
        "leadingTitle",
        "leadingSubtitle",
        "Lcom/whoop/design/models/items/graph/stress/StressState;",
        "leadingState",
        "trailingTitle",
        "trailingSubtitle",
        "trailingState",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/graph/stress/StressState;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/graph/stress/StressState;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/graph/stress/StressState;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/graph/stress/StressState;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$core_details_release",
        "(Lcom/whoop/core/details/network/model/GraphTitleBar;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "()Lcom/whoop/design/models/items/graph/stress/StressState;",
        "component4",
        "component5",
        "component6",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/graph/stress/StressState;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/graph/stress/StressState;)Lcom/whoop/core/details/network/model/GraphTitleBar;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getLeadingTitle",
        "getLeadingTitle$annotations",
        "()V",
        "getLeadingSubtitle",
        "getLeadingSubtitle$annotations",
        "Lcom/whoop/design/models/items/graph/stress/StressState;",
        "getLeadingState",
        "getTrailingTitle",
        "getTrailingTitle$annotations",
        "getTrailingSubtitle",
        "getTrailingSubtitle$annotations",
        "getTrailingState",
        "Companion",
        "$serializer",
        "core-details_release"
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

.field public static final Companion:Lcom/whoop/core/details/network/model/GraphTitleBar$Companion;


# instance fields
.field private final leadingState:Lcom/whoop/design/models/items/graph/stress/StressState;

.field private final leadingSubtitle:Ljava/lang/String;

.field private final leadingTitle:Ljava/lang/String;

.field private final trailingState:Lcom/whoop/design/models/items/graph/stress/StressState;

.field private final trailingSubtitle:Ljava/lang/String;

.field private final trailingTitle:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/core/details/network/model/GraphTitleBar$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/core/details/network/model/GraphTitleBar$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/core/details/network/model/GraphTitleBar;->Companion:Lcom/whoop/core/details/network/model/GraphTitleBar$Companion;

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lcom/whoop/core/details/network/model/a;

    const/16 v3, 0xb

    invoke-direct {v2, v3}, Lcom/whoop/core/details/network/model/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-instance v3, Lcom/whoop/core/details/network/model/a;

    const/16 v4, 0xc

    invoke-direct {v3, v4}, Lcom/whoop/core/details/network/model/a;-><init>(I)V

    invoke-static {v0, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v3, 0x6

    new-array v3, v3, [Ll83/h;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const/4 v4, 0x1

    aput-object v1, v3, v4

    const/4 v4, 0x2

    aput-object v2, v3, v4

    const/4 v2, 0x3

    aput-object v1, v3, v2

    const/4 v2, 0x4

    aput-object v1, v3, v2

    const/4 v1, 0x5

    aput-object v0, v3, v1

    sput-object v3, Lcom/whoop/core/details/network/model/GraphTitleBar;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/graph/stress/StressState;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/graph/stress/StressState;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p8, p1, 0x3f

    const/16 v0, 0x3f

    if-eq v0, p8, :cond_0

    .line 1
    sget-object p8, Lcom/whoop/core/details/network/model/GraphTitleBar$$serializer;->INSTANCE:Lcom/whoop/core/details/network/model/GraphTitleBar$$serializer;

    invoke-virtual {p8}, Lcom/whoop/core/details/network/model/GraphTitleBar$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p8

    invoke-static {p1, v0, p8}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/core/details/network/model/GraphTitleBar;->leadingTitle:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/core/details/network/model/GraphTitleBar;->leadingSubtitle:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/core/details/network/model/GraphTitleBar;->leadingState:Lcom/whoop/design/models/items/graph/stress/StressState;

    iput-object p5, p0, Lcom/whoop/core/details/network/model/GraphTitleBar;->trailingTitle:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/core/details/network/model/GraphTitleBar;->trailingSubtitle:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/core/details/network/model/GraphTitleBar;->trailingState:Lcom/whoop/design/models/items/graph/stress/StressState;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/graph/stress/StressState;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/graph/stress/StressState;)V
    .locals 1

    const-string v0, "leadingTitle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "leadingSubtitle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "leadingState"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "trailingTitle"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "trailingSubtitle"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "trailingState"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/core/details/network/model/GraphTitleBar;->leadingTitle:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/core/details/network/model/GraphTitleBar;->leadingSubtitle:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/core/details/network/model/GraphTitleBar;->leadingState:Lcom/whoop/design/models/items/graph/stress/StressState;

    .line 6
    iput-object p4, p0, Lcom/whoop/core/details/network/model/GraphTitleBar;->trailingTitle:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/core/details/network/model/GraphTitleBar;->trailingSubtitle:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/whoop/core/details/network/model/GraphTitleBar;->trailingState:Lcom/whoop/design/models/items/graph/stress/StressState;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.models.items.graph.stress.StressState"

    invoke-static {}, Lcom/whoop/design/models/items/graph/stress/StressState;->values()[Lcom/whoop/design/models/items/graph/stress/StressState;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.models.items.graph.stress.StressState"

    invoke-static {}, Lcom/whoop/design/models/items/graph/stress/StressState;->values()[Lcom/whoop/design/models/items/graph/stress/StressState;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/core/details/network/model/GraphTitleBar;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/core/details/network/model/GraphTitleBar;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/core/details/network/model/GraphTitleBar;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/core/details/network/model/GraphTitleBar;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/graph/stress/StressState;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/graph/stress/StressState;ILjava/lang/Object;)Lcom/whoop/core/details/network/model/GraphTitleBar;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lcom/whoop/core/details/network/model/GraphTitleBar;->leadingTitle:Ljava/lang/String;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lcom/whoop/core/details/network/model/GraphTitleBar;->leadingSubtitle:Ljava/lang/String;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-object p3, p0, Lcom/whoop/core/details/network/model/GraphTitleBar;->leadingState:Lcom/whoop/design/models/items/graph/stress/StressState;

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-object p4, p0, Lcom/whoop/core/details/network/model/GraphTitleBar;->trailingTitle:Ljava/lang/String;

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget-object p5, p0, Lcom/whoop/core/details/network/model/GraphTitleBar;->trailingSubtitle:Ljava/lang/String;

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget-object p6, p0, Lcom/whoop/core/details/network/model/GraphTitleBar;->trailingState:Lcom/whoop/design/models/items/graph/stress/StressState;

    :cond_5
    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lcom/whoop/core/details/network/model/GraphTitleBar;->copy(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/graph/stress/StressState;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/graph/stress/StressState;)Lcom/whoop/core/details/network/model/GraphTitleBar;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getLeadingSubtitle$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "leading_subtitle_display"
    .end annotation

    return-void
.end method

.method public static synthetic getLeadingTitle$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "leading_title_display"
    .end annotation

    return-void
.end method

.method public static synthetic getTrailingSubtitle$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "trailing_subtitle_display"
    .end annotation

    return-void
.end method

.method public static synthetic getTrailingTitle$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "trailing_title_display"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$core_details_release(Lcom/whoop/core/details/network/model/GraphTitleBar;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/core/details/network/model/GraphTitleBar;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/core/details/network/model/GraphTitleBar;->leadingTitle:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/whoop/core/details/network/model/GraphTitleBar;->leadingSubtitle:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x2

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/core/details/network/model/GraphTitleBar;->leadingState:Lcom/whoop/design/models/items/graph/stress/StressState;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/whoop/core/details/network/model/GraphTitleBar;->trailingTitle:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x4

    iget-object v2, p0, Lcom/whoop/core/details/network/model/GraphTitleBar;->trailingSubtitle:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x5

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/core/details/network/model/GraphTitleBar;->trailingState:Lcom/whoop/design/models/items/graph/stress/StressState;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/GraphTitleBar;->leadingTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/GraphTitleBar;->leadingSubtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Lcom/whoop/design/models/items/graph/stress/StressState;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/GraphTitleBar;->leadingState:Lcom/whoop/design/models/items/graph/stress/StressState;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/GraphTitleBar;->trailingTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/GraphTitleBar;->trailingSubtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Lcom/whoop/design/models/items/graph/stress/StressState;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/GraphTitleBar;->trailingState:Lcom/whoop/design/models/items/graph/stress/StressState;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/graph/stress/StressState;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/graph/stress/StressState;)Lcom/whoop/core/details/network/model/GraphTitleBar;
    .locals 8

    const-string v0, "leadingTitle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "leadingSubtitle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "leadingState"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "trailingTitle"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "trailingSubtitle"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "trailingState"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/core/details/network/model/GraphTitleBar;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/whoop/core/details/network/model/GraphTitleBar;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/graph/stress/StressState;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/graph/stress/StressState;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/core/details/network/model/GraphTitleBar;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/core/details/network/model/GraphTitleBar;

    iget-object v1, p0, Lcom/whoop/core/details/network/model/GraphTitleBar;->leadingTitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/GraphTitleBar;->leadingTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/core/details/network/model/GraphTitleBar;->leadingSubtitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/GraphTitleBar;->leadingSubtitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/core/details/network/model/GraphTitleBar;->leadingState:Lcom/whoop/design/models/items/graph/stress/StressState;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/GraphTitleBar;->leadingState:Lcom/whoop/design/models/items/graph/stress/StressState;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/core/details/network/model/GraphTitleBar;->trailingTitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/GraphTitleBar;->trailingTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/core/details/network/model/GraphTitleBar;->trailingSubtitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/GraphTitleBar;->trailingSubtitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/core/details/network/model/GraphTitleBar;->trailingState:Lcom/whoop/design/models/items/graph/stress/StressState;

    iget-object p1, p1, Lcom/whoop/core/details/network/model/GraphTitleBar;->trailingState:Lcom/whoop/design/models/items/graph/stress/StressState;

    if-eq v1, p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getLeadingState()Lcom/whoop/design/models/items/graph/stress/StressState;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/GraphTitleBar;->leadingState:Lcom/whoop/design/models/items/graph/stress/StressState;

    return-object v0
.end method

.method public final getLeadingSubtitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/GraphTitleBar;->leadingSubtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getLeadingTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/GraphTitleBar;->leadingTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getTrailingState()Lcom/whoop/design/models/items/graph/stress/StressState;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/GraphTitleBar;->trailingState:Lcom/whoop/design/models/items/graph/stress/StressState;

    return-object v0
.end method

.method public final getTrailingSubtitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/GraphTitleBar;->trailingSubtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getTrailingTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/GraphTitleBar;->trailingTitle:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/core/details/network/model/GraphTitleBar;->leadingTitle:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/core/details/network/model/GraphTitleBar;->leadingSubtitle:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/core/details/network/model/GraphTitleBar;->leadingState:Lcom/whoop/design/models/items/graph/stress/StressState;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/GraphTitleBar;->trailingTitle:Ljava/lang/String;

    invoke-static {v2, v1, v0}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/core/details/network/model/GraphTitleBar;->trailingSubtitle:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/core/details/network/model/GraphTitleBar;->trailingState:Lcom/whoop/design/models/items/graph/stress/StressState;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lcom/whoop/core/details/network/model/GraphTitleBar;->leadingTitle:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/core/details/network/model/GraphTitleBar;->leadingSubtitle:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/core/details/network/model/GraphTitleBar;->leadingState:Lcom/whoop/design/models/items/graph/stress/StressState;

    iget-object v3, p0, Lcom/whoop/core/details/network/model/GraphTitleBar;->trailingTitle:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/core/details/network/model/GraphTitleBar;->trailingSubtitle:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/core/details/network/model/GraphTitleBar;->trailingState:Lcom/whoop/design/models/items/graph/stress/StressState;

    const-string v6, ", leadingSubtitle="

    const-string v7, ", leadingState="

    const-string v8, "GraphTitleBar(leadingTitle="

    invoke-static {v8, v0, v6, v1, v7}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", trailingTitle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", trailingSubtitle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", trailingState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
