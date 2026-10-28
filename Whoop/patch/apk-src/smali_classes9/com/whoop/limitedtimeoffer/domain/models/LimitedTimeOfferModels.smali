.class public final Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels$$serializer;,
        Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0012\n\u0002\u0010\u000b\n\u0002\u0008\u000e\u0008\u0087\u0008\u0018\u0000 82\u00020\u0001:\u000298BW\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eBi\u0008\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0004\u0008\r\u0010\u0013J\'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u001eJ\u0016\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u001e\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010\u001eJh\u0010&\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0016\u0008\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008&\u0010\'J\u0010\u0010(\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008(\u0010\u001eJ\u0010\u0010)\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u0008)\u0010*J\u001a\u0010-\u001a\u00020,2\u0008\u0010+\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008-\u0010.R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010/\u001a\u0004\u00080\u0010\u001eR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010/\u001a\u0004\u00081\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010/\u001a\u0004\u00082\u0010\u001eR\u001d\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00103\u001a\u0004\u00084\u0010\"R%\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u00105\u001a\u0004\u00086\u0010$R\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010/\u001a\u0004\u00087\u0010\u001e\u00a8\u0006:"
    }
    d2 = {
        "Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;",
        "",
        "",
        "toolBarTitle",
        "imageUrl",
        "backgroundImageUrl",
        "",
        "Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferSectionModel;",
        "sections",
        "",
        "Lcom/whoop/limitedtimeoffer/domain/models/LtoStickyModel;",
        "bottomStickyItems",
        "preSelectedId",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/lang/String;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$limited_time_offer_release",
        "(Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "()Ljava/util/List;",
        "component5",
        "()Ljava/util/Map;",
        "component6",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/lang/String;)Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getToolBarTitle",
        "getImageUrl",
        "getBackgroundImageUrl",
        "Ljava/util/List;",
        "getSections",
        "Ljava/util/Map;",
        "getBottomStickyItems",
        "getPreSelectedId",
        "Companion",
        "$serializer",
        "limited-time-offer_release"
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

.field public static final Companion:Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels$Companion;


# instance fields
.field private final backgroundImageUrl:Ljava/lang/String;

.field private final bottomStickyItems:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/limitedtimeoffer/domain/models/LtoStickyModel;",
            ">;"
        }
    .end annotation
.end field

.field private final imageUrl:Ljava/lang/String;

.field private final preSelectedId:Ljava/lang/String;

.field private final sections:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferSectionModel;",
            ">;"
        }
    .end annotation
.end field

.field private final toolBarTitle:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;->Companion:Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lat2/k;

    const/4 v3, 0x3

    invoke-direct {v2, v3}, Lat2/k;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-instance v4, Lat2/k;

    const/4 v5, 0x4

    invoke-direct {v4, v5}, Lat2/k;-><init>(I)V

    invoke-static {v0, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v4, 0x6

    new-array v4, v4, [Ll83/h;

    const/4 v6, 0x0

    aput-object v1, v4, v6

    const/4 v6, 0x1

    aput-object v1, v4, v6

    const/4 v6, 0x2

    aput-object v1, v4, v6

    aput-object v2, v4, v3

    aput-object v0, v4, v5

    const/4 v0, 0x5

    aput-object v1, v4, v0

    sput-object v4, Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p8, p1, 0x39

    const/16 v0, 0x39

    if-eq v0, p8, :cond_0

    .line 1
    sget-object p8, Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels$$serializer;->INSTANCE:Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels$$serializer;

    invoke-virtual {p8}, Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p8

    invoke-static {p1, v0, p8}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;->toolBarTitle:Ljava/lang/String;

    and-int/lit8 p2, p1, 0x2

    const/4 p8, 0x0

    if-nez p2, :cond_1

    iput-object p8, p0, Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;->imageUrl:Ljava/lang/String;

    goto :goto_0

    :cond_1
    iput-object p3, p0, Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;->imageUrl:Ljava/lang/String;

    :goto_0
    and-int/lit8 p1, p1, 0x4

    if-nez p1, :cond_2

    iput-object p8, p0, Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;->backgroundImageUrl:Ljava/lang/String;

    goto :goto_1

    :cond_2
    iput-object p4, p0, Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;->backgroundImageUrl:Ljava/lang/String;

    :goto_1
    iput-object p5, p0, Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;->sections:Ljava/util/List;

    iput-object p6, p0, Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;->bottomStickyItems:Ljava/util/Map;

    iput-object p7, p0, Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;->preSelectedId:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferSectionModel;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/limitedtimeoffer/domain/models/LtoStickyModel;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string v0, "sections"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;->toolBarTitle:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;->imageUrl:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;->backgroundImageUrl:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;->sections:Ljava/util/List;

    .line 7
    iput-object p5, p0, Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;->bottomStickyItems:Ljava/util/Map;

    .line 8
    iput-object p6, p0, Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;->preSelectedId:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p8, p7, 0x2

    const/4 v0, 0x0

    if-eqz p8, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p7, p7, 0x4

    if-eqz p7, :cond_1

    move-object p7, p6

    move-object p6, p5

    move-object p5, p4

    move-object p4, v0

    :goto_0
    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_1
    move-object p7, p6

    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    goto :goto_0

    .line 9
    :goto_1
    invoke-direct/range {p1 .. p7}, Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/lang/String;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferSectionModel$$serializer;->INSTANCE:Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferSectionModel$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 3

    new-instance v0, Lkotlinx/serialization/internal/LinkedHashMapSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    sget-object v2, Lcom/whoop/limitedtimeoffer/domain/models/LtoStickyModel$$serializer;->INSTANCE:Lcom/whoop/limitedtimeoffer/domain/models/LtoStickyModel$$serializer;

    invoke-direct {v0, v1, v2}, Lkotlinx/serialization/internal/LinkedHashMapSerializer;-><init>(Lwc3/c;Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;->toolBarTitle:Ljava/lang/String;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;->imageUrl:Ljava/lang/String;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-object p3, p0, Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;->backgroundImageUrl:Ljava/lang/String;

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-object p4, p0, Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;->sections:Ljava/util/List;

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget-object p5, p0, Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;->bottomStickyItems:Ljava/util/Map;

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget-object p6, p0, Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;->preSelectedId:Ljava/lang/String;

    :cond_5
    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/lang/String;)Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$limited_time_offer_release(Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;Lzc3/c;Lyc3/g;)V
    .locals 5

    sget-object v0, Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;->$childSerializers:[Ll83/h;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;->toolBarTitle:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x1

    invoke-interface {p1, p2, v2}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    iget-object v3, p0, Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;->imageUrl:Ljava/lang/String;

    if-eqz v3, :cond_1

    :goto_0
    iget-object v3, p0, Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;->imageUrl:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v2, 0x2

    invoke-interface {p1, p2, v2}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_1

    :cond_2
    iget-object v3, p0, Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;->backgroundImageUrl:Ljava/lang/String;

    if-eqz v3, :cond_3

    :goto_1
    iget-object v3, p0, Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;->backgroundImageUrl:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v2, 0x3

    aget-object v3, v0, v2

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwc3/j;

    iget-object v4, p0, Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;->sections:Ljava/util/List;

    invoke-interface {p1, p2, v2, v3, v4}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x4

    aget-object v0, v0, v2

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;->bottomStickyItems:Ljava/util/Map;

    invoke-interface {p1, p2, v2, v0, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x5

    iget-object p0, p0, Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;->preSelectedId:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;->toolBarTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;->imageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;->backgroundImageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferSectionModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;->sections:Ljava/util/List;

    return-object v0
.end method

.method public final component5()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/limitedtimeoffer/domain/models/LtoStickyModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;->bottomStickyItems:Ljava/util/Map;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;->preSelectedId:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/lang/String;)Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferSectionModel;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/limitedtimeoffer/domain/models/LtoStickyModel;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;"
        }
    .end annotation

    const-string v0, "sections"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;

    iget-object v1, p0, Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;->toolBarTitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;->toolBarTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;->imageUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;->imageUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;->backgroundImageUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;->backgroundImageUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;->sections:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;->sections:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;->bottomStickyItems:Ljava/util/Map;

    iget-object v3, p1, Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;->bottomStickyItems:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;->preSelectedId:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;->preSelectedId:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getBackgroundImageUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;->backgroundImageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getBottomStickyItems()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/limitedtimeoffer/domain/models/LtoStickyModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;->bottomStickyItems:Ljava/util/Map;

    return-object v0
.end method

.method public final getImageUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;->imageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getPreSelectedId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;->preSelectedId:Ljava/lang/String;

    return-object v0
.end method

.method public final getSections()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferSectionModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;->sections:Ljava/util/List;

    return-object v0
.end method

.method public final getToolBarTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;->toolBarTitle:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;->toolBarTitle:Ljava/lang/String;

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

    iget-object v3, p0, Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;->imageUrl:Ljava/lang/String;

    if-nez v3, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;->backgroundImageUrl:Ljava/lang/String;

    if-nez v3, :cond_2

    move v3, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;->sections:Ljava/util/List;

    invoke-static {v0, v2, v3}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;->bottomStickyItems:Ljava/util/Map;

    if-nez v3, :cond_3

    move v3, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v2, p0, Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;->preSelectedId:Ljava/lang/String;

    if-nez v2, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_4
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;->toolBarTitle:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;->imageUrl:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;->backgroundImageUrl:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;->sections:Ljava/util/List;

    iget-object v4, p0, Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;->bottomStickyItems:Ljava/util/Map;

    iget-object v5, p0, Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;->preSelectedId:Ljava/lang/String;

    const-string v6, ", imageUrl="

    const-string v7, ", backgroundImageUrl="

    const-string v8, "LimitedTimeOfferModels(toolBarTitle="

    invoke-static {v8, v0, v6, v1, v7}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", sections="

    const-string v6, ", bottomStickyItems="

    invoke-static {v2, v1, v6, v0, v3}, Lvl/b;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", preSelectedId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
