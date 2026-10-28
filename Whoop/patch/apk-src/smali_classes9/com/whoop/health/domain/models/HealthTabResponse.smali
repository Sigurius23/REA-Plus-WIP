.class public final Lcom/whoop/health/domain/models/HealthTabResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/health/domain/models/HealthTabResponse$$serializer;,
        Lcom/whoop/health/domain/models/HealthTabResponse$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001e\u0008\u0087\u0008\u0018\u0000 32\u00020\u0001:\u000243B9\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cBI\u0008\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\u0008\u000b\u0010\u0011J\'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0016\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"JD\u0010#\u001a\u00020\u00002\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u00c6\u0001\u00a2\u0006\u0004\u0008#\u0010$J\u0010\u0010%\u001a\u00020\u0007H\u00d6\u0001\u00a2\u0006\u0004\u0008%\u0010 J\u0010\u0010&\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008&\u0010\'J\u001a\u0010)\u001a\u00020\t2\u0008\u0010(\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008)\u0010*R\u001d\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010+\u001a\u0004\u0008,\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010-\u001a\u0004\u0008.\u0010\u001eR\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010/\u001a\u0004\u00080\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00101\u001a\u0004\u00082\u0010\"\u00a8\u00065"
    }
    d2 = {
        "Lcom/whoop/health/domain/models/HealthTabResponse;",
        "",
        "",
        "Lcom/whoop/health/domain/models/HealthTabSectionModel;",
        "sections",
        "Lcom/whoop/health/domain/models/AnalyticsData;",
        "analytics",
        "",
        "scrollBackgroundStyle",
        "",
        "showLiveHr",
        "<init>",
        "(Ljava/util/List;Lcom/whoop/health/domain/models/AnalyticsData;Ljava/lang/String;Ljava/lang/Boolean;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/util/List;Lcom/whoop/health/domain/models/AnalyticsData;Ljava/lang/String;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$health_release",
        "(Lcom/whoop/health/domain/models/HealthTabResponse;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/util/List;",
        "component2",
        "()Lcom/whoop/health/domain/models/AnalyticsData;",
        "component3",
        "()Ljava/lang/String;",
        "component4",
        "()Ljava/lang/Boolean;",
        "copy",
        "(Ljava/util/List;Lcom/whoop/health/domain/models/AnalyticsData;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/whoop/health/domain/models/HealthTabResponse;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/util/List;",
        "getSections",
        "Lcom/whoop/health/domain/models/AnalyticsData;",
        "getAnalytics",
        "Ljava/lang/String;",
        "getScrollBackgroundStyle",
        "Ljava/lang/Boolean;",
        "getShowLiveHr",
        "Companion",
        "$serializer",
        "health_release"
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

.field public static final Companion:Lcom/whoop/health/domain/models/HealthTabResponse$Companion;


# instance fields
.field private final analytics:Lcom/whoop/health/domain/models/AnalyticsData;

.field private final scrollBackgroundStyle:Ljava/lang/String;

.field private final sections:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/health/domain/models/HealthTabSectionModel;",
            ">;"
        }
    .end annotation
.end field

.field private final showLiveHr:Ljava/lang/Boolean;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/health/domain/models/HealthTabResponse$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/health/domain/models/HealthTabResponse$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/health/domain/models/HealthTabResponse;->Companion:Lcom/whoop/health/domain/models/HealthTabResponse$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/health/domain/models/HealthTabResponse;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lsh2/d;

    const/4 v3, 0x5

    invoke-direct {v2, v3}, Lsh2/d;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v2, 0x4

    new-array v2, v2, [Ll83/h;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    aput-object v1, v2, v0

    const/4 v0, 0x2

    aput-object v1, v2, v0

    const/4 v0, 0x3

    aput-object v1, v2, v0

    sput-object v2, Lcom/whoop/health/domain/models/HealthTabResponse;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/util/List;Lcom/whoop/health/domain/models/AnalyticsData;Ljava/lang/String;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p1, 0x1

    const/4 v0, 0x1

    if-eq v0, p6, :cond_0

    .line 1
    sget-object p6, Lcom/whoop/health/domain/models/HealthTabResponse$$serializer;->INSTANCE:Lcom/whoop/health/domain/models/HealthTabResponse$$serializer;

    invoke-virtual {p6}, Lcom/whoop/health/domain/models/HealthTabResponse$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p6

    invoke-static {p1, v0, p6}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/health/domain/models/HealthTabResponse;->sections:Ljava/util/List;

    and-int/lit8 p2, p1, 0x2

    const/4 p6, 0x0

    if-nez p2, :cond_1

    iput-object p6, p0, Lcom/whoop/health/domain/models/HealthTabResponse;->analytics:Lcom/whoop/health/domain/models/AnalyticsData;

    goto :goto_0

    :cond_1
    iput-object p3, p0, Lcom/whoop/health/domain/models/HealthTabResponse;->analytics:Lcom/whoop/health/domain/models/AnalyticsData;

    :goto_0
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    iput-object p6, p0, Lcom/whoop/health/domain/models/HealthTabResponse;->scrollBackgroundStyle:Ljava/lang/String;

    goto :goto_1

    :cond_2
    iput-object p4, p0, Lcom/whoop/health/domain/models/HealthTabResponse;->scrollBackgroundStyle:Ljava/lang/String;

    :goto_1
    and-int/lit8 p1, p1, 0x8

    if-nez p1, :cond_3

    iput-object p6, p0, Lcom/whoop/health/domain/models/HealthTabResponse;->showLiveHr:Ljava/lang/Boolean;

    return-void

    :cond_3
    iput-object p5, p0, Lcom/whoop/health/domain/models/HealthTabResponse;->showLiveHr:Ljava/lang/Boolean;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Lcom/whoop/health/domain/models/AnalyticsData;Ljava/lang/String;Ljava/lang/Boolean;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/health/domain/models/HealthTabSectionModel;",
            ">;",
            "Lcom/whoop/health/domain/models/AnalyticsData;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ")V"
        }
    .end annotation

    const-string v0, "sections"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/health/domain/models/HealthTabResponse;->sections:Ljava/util/List;

    .line 4
    iput-object p2, p0, Lcom/whoop/health/domain/models/HealthTabResponse;->analytics:Lcom/whoop/health/domain/models/AnalyticsData;

    .line 5
    iput-object p3, p0, Lcom/whoop/health/domain/models/HealthTabResponse;->scrollBackgroundStyle:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/health/domain/models/HealthTabResponse;->showLiveHr:Ljava/lang/Boolean;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Lcom/whoop/health/domain/models/AnalyticsData;Ljava/lang/String;Ljava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p5, 0x2

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_1

    move-object p3, v0

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    move-object p4, v0

    .line 7
    :cond_2
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/whoop/health/domain/models/HealthTabResponse;-><init>(Ljava/util/List;Lcom/whoop/health/domain/models/AnalyticsData;Ljava/lang/String;Ljava/lang/Boolean;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/health/domain/models/HealthTabSectionModel$$serializer;->INSTANCE:Lcom/whoop/health/domain/models/HealthTabSectionModel$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/health/domain/models/HealthTabResponse;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/health/domain/models/HealthTabResponse;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/health/domain/models/HealthTabResponse;Ljava/util/List;Lcom/whoop/health/domain/models/AnalyticsData;Ljava/lang/String;Ljava/lang/Boolean;ILjava/lang/Object;)Lcom/whoop/health/domain/models/HealthTabResponse;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/whoop/health/domain/models/HealthTabResponse;->sections:Ljava/util/List;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lcom/whoop/health/domain/models/HealthTabResponse;->analytics:Lcom/whoop/health/domain/models/AnalyticsData;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lcom/whoop/health/domain/models/HealthTabResponse;->scrollBackgroundStyle:Ljava/lang/String;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lcom/whoop/health/domain/models/HealthTabResponse;->showLiveHr:Ljava/lang/Boolean;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/whoop/health/domain/models/HealthTabResponse;->copy(Ljava/util/List;Lcom/whoop/health/domain/models/AnalyticsData;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/whoop/health/domain/models/HealthTabResponse;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$health_release(Lcom/whoop/health/domain/models/HealthTabResponse;Lzc3/c;Lyc3/g;)V
    .locals 3

    sget-object v0, Lcom/whoop/health/domain/models/HealthTabResponse;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/health/domain/models/HealthTabResponse;->sections:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x1

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/whoop/health/domain/models/HealthTabResponse;->analytics:Lcom/whoop/health/domain/models/AnalyticsData;

    if-eqz v1, :cond_1

    :goto_0
    sget-object v1, Lcom/whoop/health/domain/models/AnalyticsData$$serializer;->INSTANCE:Lcom/whoop/health/domain/models/AnalyticsData$$serializer;

    iget-object v2, p0, Lcom/whoop/health/domain/models/HealthTabResponse;->analytics:Lcom/whoop/health/domain/models/AnalyticsData;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v0, 0x2

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lcom/whoop/health/domain/models/HealthTabResponse;->scrollBackgroundStyle:Ljava/lang/String;

    if-eqz v1, :cond_3

    :goto_1
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/health/domain/models/HealthTabResponse;->scrollBackgroundStyle:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v0, 0x3

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_2

    :cond_4
    iget-object v1, p0, Lcom/whoop/health/domain/models/HealthTabResponse;->showLiveHr:Ljava/lang/Boolean;

    if-eqz v1, :cond_5

    :goto_2
    sget-object v1, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    iget-object p0, p0, Lcom/whoop/health/domain/models/HealthTabResponse;->showLiveHr:Ljava/lang/Boolean;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    return-void
.end method


# virtual methods
.method public final component1()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/health/domain/models/HealthTabSectionModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/health/domain/models/HealthTabResponse;->sections:Ljava/util/List;

    return-object v0
.end method

.method public final component2()Lcom/whoop/health/domain/models/AnalyticsData;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/domain/models/HealthTabResponse;->analytics:Lcom/whoop/health/domain/models/AnalyticsData;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/domain/models/HealthTabResponse;->scrollBackgroundStyle:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/domain/models/HealthTabResponse;->showLiveHr:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final copy(Ljava/util/List;Lcom/whoop/health/domain/models/AnalyticsData;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/whoop/health/domain/models/HealthTabResponse;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/health/domain/models/HealthTabSectionModel;",
            ">;",
            "Lcom/whoop/health/domain/models/AnalyticsData;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ")",
            "Lcom/whoop/health/domain/models/HealthTabResponse;"
        }
    .end annotation

    const-string v0, "sections"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/health/domain/models/HealthTabResponse;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/whoop/health/domain/models/HealthTabResponse;-><init>(Ljava/util/List;Lcom/whoop/health/domain/models/AnalyticsData;Ljava/lang/String;Ljava/lang/Boolean;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/health/domain/models/HealthTabResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/health/domain/models/HealthTabResponse;

    iget-object v1, p0, Lcom/whoop/health/domain/models/HealthTabResponse;->sections:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/health/domain/models/HealthTabResponse;->sections:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/health/domain/models/HealthTabResponse;->analytics:Lcom/whoop/health/domain/models/AnalyticsData;

    iget-object v3, p1, Lcom/whoop/health/domain/models/HealthTabResponse;->analytics:Lcom/whoop/health/domain/models/AnalyticsData;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/health/domain/models/HealthTabResponse;->scrollBackgroundStyle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/health/domain/models/HealthTabResponse;->scrollBackgroundStyle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/health/domain/models/HealthTabResponse;->showLiveHr:Ljava/lang/Boolean;

    iget-object p1, p1, Lcom/whoop/health/domain/models/HealthTabResponse;->showLiveHr:Ljava/lang/Boolean;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getAnalytics()Lcom/whoop/health/domain/models/AnalyticsData;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/domain/models/HealthTabResponse;->analytics:Lcom/whoop/health/domain/models/AnalyticsData;

    return-object v0
.end method

.method public final getScrollBackgroundStyle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/domain/models/HealthTabResponse;->scrollBackgroundStyle:Ljava/lang/String;

    return-object v0
.end method

.method public final getSections()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/health/domain/models/HealthTabSectionModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/health/domain/models/HealthTabResponse;->sections:Ljava/util/List;

    return-object v0
.end method

.method public final getShowLiveHr()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/domain/models/HealthTabResponse;->showLiveHr:Ljava/lang/Boolean;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/health/domain/models/HealthTabResponse;->sections:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/health/domain/models/HealthTabResponse;->analytics:Lcom/whoop/health/domain/models/AnalyticsData;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/whoop/health/domain/models/AnalyticsData;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/health/domain/models/HealthTabResponse;->scrollBackgroundStyle:Ljava/lang/String;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/health/domain/models/HealthTabResponse;->showLiveHr:Ljava/lang/Boolean;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lcom/whoop/health/domain/models/HealthTabResponse;->sections:Ljava/util/List;

    iget-object v1, p0, Lcom/whoop/health/domain/models/HealthTabResponse;->analytics:Lcom/whoop/health/domain/models/AnalyticsData;

    iget-object v2, p0, Lcom/whoop/health/domain/models/HealthTabResponse;->scrollBackgroundStyle:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/health/domain/models/HealthTabResponse;->showLiveHr:Ljava/lang/Boolean;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "HealthTabResponse(sections="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", analytics="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", scrollBackgroundStyle="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", showLiveHr="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
