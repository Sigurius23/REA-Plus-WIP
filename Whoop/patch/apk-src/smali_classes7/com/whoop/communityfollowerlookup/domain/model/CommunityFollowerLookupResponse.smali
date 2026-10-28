.class public final Lcom/whoop/communityfollowerlookup/domain/model/CommunityFollowerLookupResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/communityfollowerlookup/domain/model/CommunityFollowerLookupResponse$$serializer;,
        Lcom/whoop/communityfollowerlookup/domain/model/CommunityFollowerLookupResponse$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0010\u000b\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0087\u0008\u0018\u0000 72\u00020\u0001:\u000287B9\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0008\u0002\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cBG\u0008\u0010\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0008\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0004\u0008\u000b\u0010\u0010J\'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0016\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!JB\u0010\"\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\u0008\u0002\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H\u00c6\u0001\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010$\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008$\u0010\u001dJ\u0010\u0010%\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008%\u0010\u001bJ\u001a\u0010(\u001a\u00020\'2\u0008\u0010&\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010*\u001a\u0004\u0008+\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010,\u001a\u0004\u0008-\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010.\u001a\u0004\u0008/\u0010\u001fR\u001d\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00100\u001a\u0004\u00081\u0010!R\u0017\u00104\u001a\u0008\u0012\u0004\u0012\u0002020\u00088F\u00a2\u0006\u0006\u001a\u0004\u00083\u0010!R\u0017\u00106\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00088F\u00a2\u0006\u0006\u001a\u0004\u00085\u0010!\u00a8\u00069"
    }
    d2 = {
        "Lcom/whoop/communityfollowerlookup/domain/model/CommunityFollowerLookupResponse;",
        "",
        "",
        "totalRequest",
        "",
        "title",
        "Lcom/whoop/analytics/AnalyticEventModel;",
        "analyticEvent",
        "",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "items",
        "<init>",
        "(ILjava/lang/String;Lcom/whoop/analytics/AnalyticEventModel;Ljava/util/List;)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(IILjava/lang/String;Lcom/whoop/analytics/AnalyticEventModel;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$community_follower_lookup_arch_mini_release",
        "(Lcom/whoop/communityfollowerlookup/domain/model/CommunityFollowerLookupResponse;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()I",
        "component2",
        "()Ljava/lang/String;",
        "component3",
        "()Lcom/whoop/analytics/AnalyticEventModel;",
        "component4",
        "()Ljava/util/List;",
        "copy",
        "(ILjava/lang/String;Lcom/whoop/analytics/AnalyticEventModel;Ljava/util/List;)Lcom/whoop/communityfollowerlookup/domain/model/CommunityFollowerLookupResponse;",
        "toString",
        "hashCode",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "I",
        "getTotalRequest",
        "Ljava/lang/String;",
        "getTitle",
        "Lcom/whoop/analytics/AnalyticEventModel;",
        "getAnalyticEvent",
        "Ljava/util/List;",
        "getItems",
        "Lcom/whoop/design/models/items/FollowerRequestModel;",
        "getFollowerRequestItems",
        "followerRequestItems",
        "getContentItems",
        "contentItems",
        "Companion",
        "$serializer",
        "community-follower-lookup-arch-mini_release"
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

.field public static final Companion:Lcom/whoop/communityfollowerlookup/domain/model/CommunityFollowerLookupResponse$Companion;


# instance fields
.field private final analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

.field private final items:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation
.end field

.field private final title:Ljava/lang/String;

.field private final totalRequest:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/communityfollowerlookup/domain/model/CommunityFollowerLookupResponse$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/communityfollowerlookup/domain/model/CommunityFollowerLookupResponse$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/communityfollowerlookup/domain/model/CommunityFollowerLookupResponse;->Companion:Lcom/whoop/communityfollowerlookup/domain/model/CommunityFollowerLookupResponse$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/communityfollowerlookup/domain/model/CommunityFollowerLookupResponse;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lhb1/l;

    const/16 v3, 0xd

    invoke-direct {v2, v3}, Lhb1/l;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v2, 0x4

    new-array v2, v2, [Ll83/h;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const/4 v3, 0x1

    aput-object v1, v2, v3

    const/4 v3, 0x2

    aput-object v1, v2, v3

    const/4 v1, 0x3

    aput-object v0, v2, v1

    sput-object v2, Lcom/whoop/communityfollowerlookup/domain/model/CommunityFollowerLookupResponse;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public constructor <init>()V
    .locals 7

    .line 1
    const/16 v5, 0xf

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lcom/whoop/communityfollowerlookup/domain/model/CommunityFollowerLookupResponse;-><init>(ILjava/lang/String;Lcom/whoop/analytics/AnalyticEventModel;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(IILjava/lang/String;Lcom/whoop/analytics/AnalyticEventModel;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p6, p1, 0x1

    if-nez p6, :cond_0

    const/4 p2, 0x0

    :cond_0
    iput p2, p0, Lcom/whoop/communityfollowerlookup/domain/model/CommunityFollowerLookupResponse;->totalRequest:I

    and-int/lit8 p2, p1, 0x2

    const/4 p6, 0x0

    if-nez p2, :cond_1

    iput-object p6, p0, Lcom/whoop/communityfollowerlookup/domain/model/CommunityFollowerLookupResponse;->title:Ljava/lang/String;

    goto :goto_0

    :cond_1
    iput-object p3, p0, Lcom/whoop/communityfollowerlookup/domain/model/CommunityFollowerLookupResponse;->title:Ljava/lang/String;

    :goto_0
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    iput-object p6, p0, Lcom/whoop/communityfollowerlookup/domain/model/CommunityFollowerLookupResponse;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    goto :goto_1

    :cond_2
    iput-object p4, p0, Lcom/whoop/communityfollowerlookup/domain/model/CommunityFollowerLookupResponse;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    :goto_1
    and-int/lit8 p1, p1, 0x8

    if-nez p1, :cond_3

    .line 3
    sget-object p1, Lm83/y;->w:Lm83/y;

    .line 4
    iput-object p1, p0, Lcom/whoop/communityfollowerlookup/domain/model/CommunityFollowerLookupResponse;->items:Ljava/util/List;

    return-void

    :cond_3
    iput-object p5, p0, Lcom/whoop/communityfollowerlookup/domain/model/CommunityFollowerLookupResponse;->items:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Lcom/whoop/analytics/AnalyticEventModel;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Lcom/whoop/analytics/AnalyticEventModel;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;)V"
        }
    .end annotation

    const-string v0, "items"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput p1, p0, Lcom/whoop/communityfollowerlookup/domain/model/CommunityFollowerLookupResponse;->totalRequest:I

    .line 7
    iput-object p2, p0, Lcom/whoop/communityfollowerlookup/domain/model/CommunityFollowerLookupResponse;->title:Ljava/lang/String;

    .line 8
    iput-object p3, p0, Lcom/whoop/communityfollowerlookup/domain/model/CommunityFollowerLookupResponse;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    .line 9
    iput-object p4, p0, Lcom/whoop/communityfollowerlookup/domain/model/CommunityFollowerLookupResponse;->items:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Lcom/whoop/analytics/AnalyticEventModel;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p6, p5, 0x2

    const/4 v0, 0x0

    if-eqz p6, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    move-object p3, v0

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    .line 10
    sget-object p4, Lm83/y;->w:Lm83/y;

    .line 11
    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/whoop/communityfollowerlookup/domain/model/CommunityFollowerLookupResponse;-><init>(ILjava/lang/String;Lcom/whoop/analytics/AnalyticEventModel;Ljava/util/List;)V

    return-void
.end method

.method private static final _childSerializers$_anonymous_()Lwc3/c;
    .locals 7

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    new-instance v1, Lwc3/a;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v3, Lcom/whoop/design/models/DesignSystemModel;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    new-instance v5, Lwc3/e;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const/4 v3, 0x0

    new-array v6, v3, [Ljava/lang/annotation/Annotation;

    invoke-direct {v5, v2, v6}, Lwc3/e;-><init>(Lj93/d;[Ljava/lang/annotation/Annotation;)V

    new-array v2, v3, [Lwc3/c;

    invoke-direct {v1, v4, v5, v2}, Lwc3/a;-><init>(Lj93/d;Lwc3/c;[Lwc3/c;)V

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/communityfollowerlookup/domain/model/CommunityFollowerLookupResponse;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/communityfollowerlookup/domain/model/CommunityFollowerLookupResponse;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/communityfollowerlookup/domain/model/CommunityFollowerLookupResponse;ILjava/lang/String;Lcom/whoop/analytics/AnalyticEventModel;Ljava/util/List;ILjava/lang/Object;)Lcom/whoop/communityfollowerlookup/domain/model/CommunityFollowerLookupResponse;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget p1, p0, Lcom/whoop/communityfollowerlookup/domain/model/CommunityFollowerLookupResponse;->totalRequest:I

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lcom/whoop/communityfollowerlookup/domain/model/CommunityFollowerLookupResponse;->title:Ljava/lang/String;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lcom/whoop/communityfollowerlookup/domain/model/CommunityFollowerLookupResponse;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lcom/whoop/communityfollowerlookup/domain/model/CommunityFollowerLookupResponse;->items:Ljava/util/List;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/whoop/communityfollowerlookup/domain/model/CommunityFollowerLookupResponse;->copy(ILjava/lang/String;Lcom/whoop/analytics/AnalyticEventModel;Ljava/util/List;)Lcom/whoop/communityfollowerlookup/domain/model/CommunityFollowerLookupResponse;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$community_follower_lookup_arch_mini_release(Lcom/whoop/communityfollowerlookup/domain/model/CommunityFollowerLookupResponse;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/communityfollowerlookup/domain/model/CommunityFollowerLookupResponse;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget v2, p0, Lcom/whoop/communityfollowerlookup/domain/model/CommunityFollowerLookupResponse;->totalRequest:I

    if-eqz v2, :cond_1

    :goto_0
    iget v2, p0, Lcom/whoop/communityfollowerlookup/domain/model/CommunityFollowerLookupResponse;->totalRequest:I

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    :cond_1
    const/4 v1, 0x1

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/communityfollowerlookup/domain/model/CommunityFollowerLookupResponse;->title:Ljava/lang/String;

    if-eqz v2, :cond_3

    :goto_1
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/communityfollowerlookup/domain/model/CommunityFollowerLookupResponse;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v1, 0x2

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/whoop/communityfollowerlookup/domain/model/CommunityFollowerLookupResponse;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    if-eqz v2, :cond_5

    :goto_2
    sget-object v2, Lcom/whoop/analytics/AnalyticEventModel$$serializer;->INSTANCE:Lcom/whoop/analytics/AnalyticEventModel$$serializer;

    iget-object v3, p0, Lcom/whoop/communityfollowerlookup/domain/model/CommunityFollowerLookupResponse;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v1, 0x3

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    iget-object v2, p0, Lcom/whoop/communityfollowerlookup/domain/model/CommunityFollowerLookupResponse;->items:Ljava/util/List;

    sget-object v3, Lm83/y;->w:Lm83/y;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    :goto_3
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/communityfollowerlookup/domain/model/CommunityFollowerLookupResponse;->items:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    return-void
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/whoop/communityfollowerlookup/domain/model/CommunityFollowerLookupResponse;->totalRequest:I

    return v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communityfollowerlookup/domain/model/CommunityFollowerLookupResponse;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Lcom/whoop/analytics/AnalyticEventModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communityfollowerlookup/domain/model/CommunityFollowerLookupResponse;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    return-object v0
.end method

.method public final component4()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/communityfollowerlookup/domain/model/CommunityFollowerLookupResponse;->items:Ljava/util/List;

    return-object v0
.end method

.method public final copy(ILjava/lang/String;Lcom/whoop/analytics/AnalyticEventModel;Ljava/util/List;)Lcom/whoop/communityfollowerlookup/domain/model/CommunityFollowerLookupResponse;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Lcom/whoop/analytics/AnalyticEventModel;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;)",
            "Lcom/whoop/communityfollowerlookup/domain/model/CommunityFollowerLookupResponse;"
        }
    .end annotation

    const-string v0, "items"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/communityfollowerlookup/domain/model/CommunityFollowerLookupResponse;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/whoop/communityfollowerlookup/domain/model/CommunityFollowerLookupResponse;-><init>(ILjava/lang/String;Lcom/whoop/analytics/AnalyticEventModel;Ljava/util/List;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/communityfollowerlookup/domain/model/CommunityFollowerLookupResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/communityfollowerlookup/domain/model/CommunityFollowerLookupResponse;

    iget v1, p0, Lcom/whoop/communityfollowerlookup/domain/model/CommunityFollowerLookupResponse;->totalRequest:I

    iget v3, p1, Lcom/whoop/communityfollowerlookup/domain/model/CommunityFollowerLookupResponse;->totalRequest:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/communityfollowerlookup/domain/model/CommunityFollowerLookupResponse;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/communityfollowerlookup/domain/model/CommunityFollowerLookupResponse;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/communityfollowerlookup/domain/model/CommunityFollowerLookupResponse;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    iget-object v3, p1, Lcom/whoop/communityfollowerlookup/domain/model/CommunityFollowerLookupResponse;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/communityfollowerlookup/domain/model/CommunityFollowerLookupResponse;->items:Ljava/util/List;

    iget-object p1, p1, Lcom/whoop/communityfollowerlookup/domain/model/CommunityFollowerLookupResponse;->items:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getAnalyticEvent()Lcom/whoop/analytics/AnalyticEventModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communityfollowerlookup/domain/model/CommunityFollowerLookupResponse;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    return-object v0
.end method

.method public final getContentItems()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/communityfollowerlookup/domain/model/CommunityFollowerLookupResponse;->items:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lcom/whoop/design/models/DesignSystemModel;

    invoke-static {v3}, Lcom/whoop/design/models/DesignSystemModelKt;->unwrap(Lcom/whoop/design/models/DesignSystemModel;)Lcom/whoop/design/models/DesignSystemModel;

    move-result-object v3

    instance-of v3, v3, Lcom/whoop/design/models/items/FollowerRequestModel;

    if-eqz v3, :cond_0

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v1
.end method

.method public final getFollowerRequestItems()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/FollowerRequestModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/communityfollowerlookup/domain/model/CommunityFollowerLookupResponse;->items:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/design/models/DesignSystemModel;

    invoke-static {v2}, Lcom/whoop/design/models/DesignSystemModelKt;->unwrap(Lcom/whoop/design/models/DesignSystemModel;)Lcom/whoop/design/models/DesignSystemModel;

    move-result-object v2

    instance-of v3, v2, Lcom/whoop/design/models/items/FollowerRequestModel;

    if-eqz v3, :cond_1

    check-cast v2, Lcom/whoop/design/models/items/FollowerRequestModel;

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    if-eqz v2, :cond_0

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v1
.end method

.method public final getItems()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/communityfollowerlookup/domain/model/CommunityFollowerLookupResponse;->items:Ljava/util/List;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communityfollowerlookup/domain/model/CommunityFollowerLookupResponse;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final getTotalRequest()I
    .locals 1

    iget v0, p0, Lcom/whoop/communityfollowerlookup/domain/model/CommunityFollowerLookupResponse;->totalRequest:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lcom/whoop/communityfollowerlookup/domain/model/CommunityFollowerLookupResponse;->totalRequest:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/communityfollowerlookup/domain/model/CommunityFollowerLookupResponse;->title:Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/communityfollowerlookup/domain/model/CommunityFollowerLookupResponse;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lcom/whoop/analytics/AnalyticEventModel;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/communityfollowerlookup/domain/model/CommunityFollowerLookupResponse;->items:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget v0, p0, Lcom/whoop/communityfollowerlookup/domain/model/CommunityFollowerLookupResponse;->totalRequest:I

    iget-object v1, p0, Lcom/whoop/communityfollowerlookup/domain/model/CommunityFollowerLookupResponse;->title:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/communityfollowerlookup/domain/model/CommunityFollowerLookupResponse;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    iget-object v3, p0, Lcom/whoop/communityfollowerlookup/domain/model/CommunityFollowerLookupResponse;->items:Ljava/util/List;

    const-string v4, ", title="

    const-string v5, ", analyticEvent="

    const-string v6, "CommunityFollowerLookupResponse(totalRequest="

    invoke-static {v0, v6, v4, v1, v5}, Lih0/d0;->n(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", items="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
