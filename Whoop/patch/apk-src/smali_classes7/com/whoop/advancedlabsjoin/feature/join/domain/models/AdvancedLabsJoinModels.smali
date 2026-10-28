.class public final Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels$$serializer;,
        Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0010\u000b\n\u0002\u0008\r\u0008\u0087\u0008\u0018\u0000 62\u00020\u0001:\u000276BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\u0008\u0012\u0014\u0010\u000c\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\r\u0010\u000eBk\u0008\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\u0008\u0012\u0014\u0010\u000c\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0008\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0004\u0008\r\u0010\u0013J\'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001eJ\u0016\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u001e\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#J\u001e\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010#Jd\u0010%\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u000e\u0008\u0002\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u0016\u0008\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\u00082\u0016\u0008\u0002\u0010\u000c\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0008H\u00c6\u0001\u00a2\u0006\u0004\u0008%\u0010&J\u0010\u0010\'\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\'\u0010\u001eJ\u0010\u0010(\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u0008(\u0010)J\u001a\u0010,\u001a\u00020+2\u0008\u0010*\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010.\u001a\u0004\u0008/\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010.\u001a\u0004\u00080\u0010\u001eR\u001d\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00101\u001a\u0004\u00082\u0010!R%\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00103\u001a\u0004\u00084\u0010#R%\u0010\u000c\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u00103\u001a\u0004\u00085\u0010#\u00a8\u00068"
    }
    d2 = {
        "Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;",
        "",
        "",
        "toolBarTitle",
        "initiallySelectedSegmentId",
        "",
        "Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinSectionModel;",
        "sections",
        "",
        "Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvanceLabsJoinStickyModel;",
        "bottomStickyItems",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "featuresBySegment",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$advanced_labs_join_release",
        "(Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "()Ljava/util/List;",
        "component4",
        "()Ljava/util/Map;",
        "component5",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getToolBarTitle",
        "getInitiallySelectedSegmentId",
        "Ljava/util/List;",
        "getSections",
        "Ljava/util/Map;",
        "getBottomStickyItems",
        "getFeaturesBySegment",
        "Companion",
        "$serializer",
        "advanced-labs-join_release"
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

.field public static final Companion:Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels$Companion;


# instance fields
.field private final bottomStickyItems:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvanceLabsJoinStickyModel;",
            ">;"
        }
    .end annotation
.end field

.field private final featuresBySegment:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation
.end field

.field private final initiallySelectedSegmentId:Ljava/lang/String;

.field private final sections:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinSectionModel;",
            ">;"
        }
    .end annotation
.end field

.field private final toolBarTitle:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;->Companion:Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lqa1/a;

    const/16 v3, 0x12

    invoke-direct {v2, v3}, Lqa1/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-instance v3, Lqa1/a;

    const/16 v4, 0x13

    invoke-direct {v3, v4}, Lqa1/a;-><init>(I)V

    invoke-static {v0, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v4, Lqa1/a;

    const/16 v5, 0x14

    invoke-direct {v4, v5}, Lqa1/a;-><init>(I)V

    invoke-static {v0, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v4, 0x5

    new-array v4, v4, [Ll83/h;

    const/4 v5, 0x0

    aput-object v1, v4, v5

    const/4 v5, 0x1

    aput-object v1, v4, v5

    const/4 v1, 0x2

    aput-object v2, v4, v1

    const/4 v1, 0x3

    aput-object v3, v4, v1

    const/4 v1, 0x4

    aput-object v0, v4, v1

    sput-object v4, Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p1, 0x1f

    const/16 v0, 0x1f

    if-eq v0, p7, :cond_0

    .line 1
    sget-object p7, Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels$$serializer;->INSTANCE:Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels$$serializer;

    invoke-virtual {p7}, Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p7

    invoke-static {p1, v0, p7}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;->toolBarTitle:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;->initiallySelectedSegmentId:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;->sections:Ljava/util/List;

    iput-object p5, p0, Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;->bottomStickyItems:Ljava/util/Map;

    iput-object p6, p0, Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;->featuresBySegment:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinSectionModel;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvanceLabsJoinStickyModel;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;)V"
        }
    .end annotation

    const-string v0, "toolBarTitle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "initiallySelectedSegmentId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sections"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;->toolBarTitle:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;->initiallySelectedSegmentId:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;->sections:Ljava/util/List;

    .line 6
    iput-object p4, p0, Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;->bottomStickyItems:Ljava/util/Map;

    .line 7
    iput-object p5, p0, Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;->featuresBySegment:Ljava/util/Map;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinSectionModel$$serializer;->INSTANCE:Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinSectionModel$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 3

    new-instance v0, Lkotlinx/serialization/internal/LinkedHashMapSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    sget-object v2, Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvanceLabsJoinStickyModel$$serializer;->INSTANCE:Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvanceLabsJoinStickyModel$$serializer;

    invoke-direct {v0, v1, v2}, Lkotlinx/serialization/internal/LinkedHashMapSerializer;-><init>(Lwc3/c;Lwc3/c;)V

    return-object v0
.end method

.method private static final _childSerializers$_anonymous_$1()Lwc3/c;
    .locals 8

    new-instance v0, Lkotlinx/serialization/internal/LinkedHashMapSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    new-instance v2, Lwc3/a;

    sget-object v3, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v4, Lcom/whoop/design/models/DesignSystemModel;

    invoke-virtual {v3, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    new-instance v6, Lwc3/e;

    invoke-virtual {v3, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    const/4 v4, 0x0

    new-array v7, v4, [Ljava/lang/annotation/Annotation;

    invoke-direct {v6, v3, v7}, Lwc3/e;-><init>(Lj93/d;[Ljava/lang/annotation/Annotation;)V

    new-array v3, v4, [Lwc3/c;

    invoke-direct {v2, v5, v6, v3}, Lwc3/a;-><init>(Lj93/d;Lwc3/c;[Lwc3/c;)V

    invoke-direct {v0, v1, v2}, Lkotlinx/serialization/internal/LinkedHashMapSerializer;-><init>(Lwc3/c;Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;->_childSerializers$_anonymous_$1()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Object;)Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;->toolBarTitle:Ljava/lang/String;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;->initiallySelectedSegmentId:Ljava/lang/String;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;->sections:Ljava/util/List;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;->bottomStickyItems:Ljava/util/Map;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;->featuresBySegment:Ljava/util/Map;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$advanced_labs_join_release(Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;->toolBarTitle:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;->initiallySelectedSegmentId:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x2

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;->sections:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x3

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;->bottomStickyItems:Ljava/util/Map;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x4

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;->featuresBySegment:Ljava/util/Map;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;->toolBarTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;->initiallySelectedSegmentId:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinSectionModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;->sections:Ljava/util/List;

    return-object v0
.end method

.method public final component4()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvanceLabsJoinStickyModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;->bottomStickyItems:Ljava/util/Map;

    return-object v0
.end method

.method public final component5()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;->featuresBySegment:Ljava/util/Map;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinSectionModel;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvanceLabsJoinStickyModel;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;)",
            "Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;"
        }
    .end annotation

    const-string v0, "toolBarTitle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "initiallySelectedSegmentId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sections"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;

    iget-object v1, p0, Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;->toolBarTitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;->toolBarTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;->initiallySelectedSegmentId:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;->initiallySelectedSegmentId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;->sections:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;->sections:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;->bottomStickyItems:Ljava/util/Map;

    iget-object v3, p1, Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;->bottomStickyItems:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;->featuresBySegment:Ljava/util/Map;

    iget-object p1, p1, Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;->featuresBySegment:Ljava/util/Map;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getBottomStickyItems()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvanceLabsJoinStickyModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;->bottomStickyItems:Ljava/util/Map;

    return-object v0
.end method

.method public final getFeaturesBySegment()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;->featuresBySegment:Ljava/util/Map;

    return-object v0
.end method

.method public final getInitiallySelectedSegmentId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;->initiallySelectedSegmentId:Ljava/lang/String;

    return-object v0
.end method

.method public final getSections()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinSectionModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;->sections:Ljava/util/List;

    return-object v0
.end method

.method public final getToolBarTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;->toolBarTitle:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;->toolBarTitle:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;->initiallySelectedSegmentId:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;->sections:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;->bottomStickyItems:Ljava/util/Map;

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

    iget-object v1, p0, Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;->featuresBySegment:Ljava/util/Map;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;->toolBarTitle:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;->initiallySelectedSegmentId:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;->sections:Ljava/util/List;

    iget-object v3, p0, Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;->bottomStickyItems:Ljava/util/Map;

    iget-object v4, p0, Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;->featuresBySegment:Ljava/util/Map;

    const-string v5, ", initiallySelectedSegmentId="

    const-string v6, ", sections="

    const-string v7, "AdvancedLabsJoinModels(toolBarTitle="

    invoke-static {v7, v0, v5, v1, v6}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", bottomStickyItems="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", featuresBySegment="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-static {v0, v4, v1}, Lev/n;->l(Ljava/lang/StringBuilder;Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
