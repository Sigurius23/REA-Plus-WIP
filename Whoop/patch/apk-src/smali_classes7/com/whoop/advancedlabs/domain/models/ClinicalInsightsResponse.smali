.class public final Lcom/whoop/advancedlabs/domain/models/ClinicalInsightsResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/advancedlabs/domain/models/ClinicalInsightsResponse$$serializer;,
        Lcom/whoop/advancedlabs/domain/models/ClinicalInsightsResponse$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\r\u0008\u0087\u0008\u0018\u0000 62\u00020\u0001:\u000276B1\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cBI\u0008\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\u0008\u000b\u0010\u0011J\'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0016\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"JB\u0010#\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u00c6\u0001\u00a2\u0006\u0004\u0008#\u0010$J\u0010\u0010&\u001a\u00020%H\u00d6\u0001\u00a2\u0006\u0004\u0008&\u0010\'J\u0010\u0010(\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008(\u0010)J\u001a\u0010,\u001a\u00020+2\u0008\u0010*\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008,\u0010-R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010.\u001a\u0004\u0008/\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00100\u001a\u0004\u00081\u0010\u001eR\u001d\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00102\u001a\u0004\u00083\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00104\u001a\u0004\u00085\u0010\"\u00a8\u00068"
    }
    d2 = {
        "Lcom/whoop/advancedlabs/domain/models/ClinicalInsightsResponse;",
        "",
        "Lcom/whoop/advancedlabs/domain/models/MetaData;",
        "metadata",
        "Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;",
        "navigationBar",
        "",
        "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsSectionModel;",
        "sections",
        "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;",
        "analytics",
        "<init>",
        "(Lcom/whoop/advancedlabs/domain/models/MetaData;Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;Ljava/util/List;Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/advancedlabs/domain/models/MetaData;Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;Ljava/util/List;Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$advanced_labs_release",
        "(Lcom/whoop/advancedlabs/domain/models/ClinicalInsightsResponse;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Lcom/whoop/advancedlabs/domain/models/MetaData;",
        "component2",
        "()Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;",
        "component3",
        "()Ljava/util/List;",
        "component4",
        "()Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;",
        "copy",
        "(Lcom/whoop/advancedlabs/domain/models/MetaData;Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;Ljava/util/List;Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;)Lcom/whoop/advancedlabs/domain/models/ClinicalInsightsResponse;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/advancedlabs/domain/models/MetaData;",
        "getMetadata",
        "Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;",
        "getNavigationBar",
        "Ljava/util/List;",
        "getSections",
        "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;",
        "getAnalytics",
        "Companion",
        "$serializer",
        "advanced-labs_release"
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

.field public static final Companion:Lcom/whoop/advancedlabs/domain/models/ClinicalInsightsResponse$Companion;


# instance fields
.field private final analytics:Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;

.field private final metadata:Lcom/whoop/advancedlabs/domain/models/MetaData;

.field private final navigationBar:Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;

.field private final sections:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsSectionModel;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/advancedlabs/domain/models/ClinicalInsightsResponse$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/advancedlabs/domain/models/ClinicalInsightsResponse$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/advancedlabs/domain/models/ClinicalInsightsResponse;->Companion:Lcom/whoop/advancedlabs/domain/models/ClinicalInsightsResponse$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/advancedlabs/domain/models/ClinicalInsightsResponse;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lt91/a;

    const/16 v3, 0x1b

    invoke-direct {v2, v3}, Lt91/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v2, 0x4

    new-array v2, v2, [Ll83/h;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const/4 v3, 0x1

    aput-object v1, v2, v3

    const/4 v3, 0x2

    aput-object v0, v2, v3

    const/4 v0, 0x3

    aput-object v1, v2, v0

    sput-object v2, Lcom/whoop/advancedlabs/domain/models/ClinicalInsightsResponse;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/advancedlabs/domain/models/MetaData;Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;Ljava/util/List;Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p1, 0xf

    const/16 v0, 0xf

    if-eq v0, p6, :cond_0

    .line 1
    sget-object p6, Lcom/whoop/advancedlabs/domain/models/ClinicalInsightsResponse$$serializer;->INSTANCE:Lcom/whoop/advancedlabs/domain/models/ClinicalInsightsResponse$$serializer;

    invoke-virtual {p6}, Lcom/whoop/advancedlabs/domain/models/ClinicalInsightsResponse$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p6

    invoke-static {p1, v0, p6}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/advancedlabs/domain/models/ClinicalInsightsResponse;->metadata:Lcom/whoop/advancedlabs/domain/models/MetaData;

    iput-object p3, p0, Lcom/whoop/advancedlabs/domain/models/ClinicalInsightsResponse;->navigationBar:Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;

    iput-object p4, p0, Lcom/whoop/advancedlabs/domain/models/ClinicalInsightsResponse;->sections:Ljava/util/List;

    iput-object p5, p0, Lcom/whoop/advancedlabs/domain/models/ClinicalInsightsResponse;->analytics:Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/advancedlabs/domain/models/MetaData;Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;Ljava/util/List;Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/advancedlabs/domain/models/MetaData;",
            "Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;",
            "Ljava/util/List<",
            "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsSectionModel;",
            ">;",
            "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;",
            ")V"
        }
    .end annotation

    const-string v0, "navigationBar"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sections"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/advancedlabs/domain/models/ClinicalInsightsResponse;->metadata:Lcom/whoop/advancedlabs/domain/models/MetaData;

    .line 4
    iput-object p2, p0, Lcom/whoop/advancedlabs/domain/models/ClinicalInsightsResponse;->navigationBar:Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;

    .line 5
    iput-object p3, p0, Lcom/whoop/advancedlabs/domain/models/ClinicalInsightsResponse;->sections:Ljava/util/List;

    .line 6
    iput-object p4, p0, Lcom/whoop/advancedlabs/domain/models/ClinicalInsightsResponse;->analytics:Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsSectionModel$$serializer;->INSTANCE:Lcom/whoop/advancedlabs/domain/models/AdvancedLabsSectionModel$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/advancedlabs/domain/models/ClinicalInsightsResponse;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/advancedlabs/domain/models/ClinicalInsightsResponse;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/advancedlabs/domain/models/ClinicalInsightsResponse;Lcom/whoop/advancedlabs/domain/models/MetaData;Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;Ljava/util/List;Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;ILjava/lang/Object;)Lcom/whoop/advancedlabs/domain/models/ClinicalInsightsResponse;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/whoop/advancedlabs/domain/models/ClinicalInsightsResponse;->metadata:Lcom/whoop/advancedlabs/domain/models/MetaData;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lcom/whoop/advancedlabs/domain/models/ClinicalInsightsResponse;->navigationBar:Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lcom/whoop/advancedlabs/domain/models/ClinicalInsightsResponse;->sections:Ljava/util/List;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lcom/whoop/advancedlabs/domain/models/ClinicalInsightsResponse;->analytics:Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/whoop/advancedlabs/domain/models/ClinicalInsightsResponse;->copy(Lcom/whoop/advancedlabs/domain/models/MetaData;Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;Ljava/util/List;Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;)Lcom/whoop/advancedlabs/domain/models/ClinicalInsightsResponse;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$advanced_labs_release(Lcom/whoop/advancedlabs/domain/models/ClinicalInsightsResponse;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/advancedlabs/domain/models/ClinicalInsightsResponse;->$childSerializers:[Ll83/h;

    sget-object v1, Lcom/whoop/advancedlabs/domain/models/MetaData$$serializer;->INSTANCE:Lcom/whoop/advancedlabs/domain/models/MetaData$$serializer;

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/ClinicalInsightsResponse;->metadata:Lcom/whoop/advancedlabs/domain/models/MetaData;

    const/4 v3, 0x0

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/advancedlabs/domain/models/NavigationBarModel$$serializer;->INSTANCE:Lcom/whoop/advancedlabs/domain/models/NavigationBarModel$$serializer;

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/ClinicalInsightsResponse;->navigationBar:Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;

    const/4 v3, 0x1

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x2

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/ClinicalInsightsResponse;->sections:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel$$serializer;->INSTANCE:Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel$$serializer;

    iget-object p0, p0, Lcom/whoop/advancedlabs/domain/models/ClinicalInsightsResponse;->analytics:Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;

    const/4 v1, 0x3

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/advancedlabs/domain/models/MetaData;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/ClinicalInsightsResponse;->metadata:Lcom/whoop/advancedlabs/domain/models/MetaData;

    return-object v0
.end method

.method public final component2()Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/ClinicalInsightsResponse;->navigationBar:Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;

    return-object v0
.end method

.method public final component3()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsSectionModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/ClinicalInsightsResponse;->sections:Ljava/util/List;

    return-object v0
.end method

.method public final component4()Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/ClinicalInsightsResponse;->analytics:Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;

    return-object v0
.end method

.method public final copy(Lcom/whoop/advancedlabs/domain/models/MetaData;Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;Ljava/util/List;Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;)Lcom/whoop/advancedlabs/domain/models/ClinicalInsightsResponse;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/advancedlabs/domain/models/MetaData;",
            "Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;",
            "Ljava/util/List<",
            "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsSectionModel;",
            ">;",
            "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;",
            ")",
            "Lcom/whoop/advancedlabs/domain/models/ClinicalInsightsResponse;"
        }
    .end annotation

    const-string v0, "navigationBar"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sections"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/advancedlabs/domain/models/ClinicalInsightsResponse;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/whoop/advancedlabs/domain/models/ClinicalInsightsResponse;-><init>(Lcom/whoop/advancedlabs/domain/models/MetaData;Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;Ljava/util/List;Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/advancedlabs/domain/models/ClinicalInsightsResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/advancedlabs/domain/models/ClinicalInsightsResponse;

    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/ClinicalInsightsResponse;->metadata:Lcom/whoop/advancedlabs/domain/models/MetaData;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/ClinicalInsightsResponse;->metadata:Lcom/whoop/advancedlabs/domain/models/MetaData;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/ClinicalInsightsResponse;->navigationBar:Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/ClinicalInsightsResponse;->navigationBar:Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/ClinicalInsightsResponse;->sections:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/ClinicalInsightsResponse;->sections:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/ClinicalInsightsResponse;->analytics:Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;

    iget-object p1, p1, Lcom/whoop/advancedlabs/domain/models/ClinicalInsightsResponse;->analytics:Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getAnalytics()Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/ClinicalInsightsResponse;->analytics:Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;

    return-object v0
.end method

.method public final getMetadata()Lcom/whoop/advancedlabs/domain/models/MetaData;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/ClinicalInsightsResponse;->metadata:Lcom/whoop/advancedlabs/domain/models/MetaData;

    return-object v0
.end method

.method public final getNavigationBar()Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/ClinicalInsightsResponse;->navigationBar:Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;

    return-object v0
.end method

.method public final getSections()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsSectionModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/ClinicalInsightsResponse;->sections:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/ClinicalInsightsResponse;->metadata:Lcom/whoop/advancedlabs/domain/models/MetaData;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/whoop/advancedlabs/domain/models/MetaData;->hashCode()I

    move-result v0

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/advancedlabs/domain/models/ClinicalInsightsResponse;->navigationBar:Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;

    invoke-virtual {v3}, Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;->hashCode()I

    move-result v3

    add-int/2addr v3, v0

    mul-int/2addr v3, v2

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/ClinicalInsightsResponse;->sections:Ljava/util/List;

    invoke-static {v3, v2, v0}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/ClinicalInsightsResponse;->analytics:Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/ClinicalInsightsResponse;->metadata:Lcom/whoop/advancedlabs/domain/models/MetaData;

    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/ClinicalInsightsResponse;->navigationBar:Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/ClinicalInsightsResponse;->sections:Ljava/util/List;

    iget-object v3, p0, Lcom/whoop/advancedlabs/domain/models/ClinicalInsightsResponse;->analytics:Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "ClinicalInsightsResponse(metadata="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", navigationBar="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", sections="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", analytics="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
