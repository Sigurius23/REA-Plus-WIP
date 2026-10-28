.class public final Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse$$serializer;,
        Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0012\n\u0002\u0010\u000b\n\u0002\u0008\u000e\u0008\u0087\u0008\u0018\u0000 72\u00020\u0001:\u000287BG\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0008\u0002\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\u0004\u0008\u000c\u0010\rBS\u0008\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0004\u0008\u000c\u0010\u0012J\'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u001dJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0016\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$JP\u0010%\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00072\u000e\u0008\u0002\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0001\u00a2\u0006\u0004\u0008%\u0010&J\u0010\u0010\'\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\'\u0010\u001dJ\u0010\u0010(\u001a\u00020\u000eH\u00d6\u0001\u00a2\u0006\u0004\u0008(\u0010)J\u001a\u0010,\u001a\u00020+2\u0008\u0010*\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008,\u0010-R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010.\u001a\u0004\u0008/\u0010\u001dR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00100\u001a\u0004\u00081\u0010\u001fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010.\u001a\u0004\u00082\u0010\u001dR\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00103\u001a\u0004\u00084\u0010\"R\u001d\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u00105\u001a\u0004\u00086\u0010$\u00a8\u00069"
    }
    d2 = {
        "Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;",
        "",
        "",
        "searchPlaceHolderText",
        "",
        "searchDebounceMs",
        "loadingHintText",
        "Lcom/whoop/analytics/AnalyticEventModel;",
        "analyticEvent",
        "",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "items",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lcom/whoop/analytics/AnalyticEventModel;Ljava/util/List;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lcom/whoop/analytics/AnalyticEventModel;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$search_arch_mini_release",
        "(Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()Ljava/lang/Long;",
        "component3",
        "component4",
        "()Lcom/whoop/analytics/AnalyticEventModel;",
        "component5",
        "()Ljava/util/List;",
        "copy",
        "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lcom/whoop/analytics/AnalyticEventModel;Ljava/util/List;)Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getSearchPlaceHolderText",
        "Ljava/lang/Long;",
        "getSearchDebounceMs",
        "getLoadingHintText",
        "Lcom/whoop/analytics/AnalyticEventModel;",
        "getAnalyticEvent",
        "Ljava/util/List;",
        "getItems",
        "Companion",
        "$serializer",
        "search-arch-mini_release"
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

.field public static final Companion:Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse$Companion;


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

.field private final loadingHintText:Ljava/lang/String;

.field private final searchDebounceMs:Ljava/lang/Long;

.field private final searchPlaceHolderText:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;->Companion:Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lj02/y0;

    invoke-direct {v3, v0}, Lj02/y0;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v2, 0x5

    new-array v2, v2, [Ll83/h;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const/4 v3, 0x1

    aput-object v1, v2, v3

    const/4 v3, 0x2

    aput-object v1, v2, v3

    const/4 v3, 0x3

    aput-object v1, v2, v3

    const/4 v1, 0x4

    aput-object v0, v2, v1

    sput-object v2, Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public constructor <init>()V
    .locals 8

    .line 1
    const/16 v6, 0x1f

    const/4 v7, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v7}, Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;-><init>(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lcom/whoop/analytics/AnalyticEventModel;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lcom/whoop/analytics/AnalyticEventModel;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p7, p1, 0x1

    const/4 v0, 0x0

    if-nez p7, :cond_0

    iput-object v0, p0, Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;->searchPlaceHolderText:Ljava/lang/String;

    goto :goto_0

    :cond_0
    iput-object p2, p0, Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;->searchPlaceHolderText:Ljava/lang/String;

    :goto_0
    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_1

    iput-object v0, p0, Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;->searchDebounceMs:Ljava/lang/Long;

    goto :goto_1

    :cond_1
    iput-object p3, p0, Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;->searchDebounceMs:Ljava/lang/Long;

    :goto_1
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    iput-object v0, p0, Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;->loadingHintText:Ljava/lang/String;

    goto :goto_2

    :cond_2
    iput-object p4, p0, Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;->loadingHintText:Ljava/lang/String;

    :goto_2
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_3

    iput-object v0, p0, Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    goto :goto_3

    :cond_3
    iput-object p5, p0, Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    :goto_3
    and-int/lit8 p1, p1, 0x10

    if-nez p1, :cond_4

    .line 3
    sget-object p1, Lm83/y;->w:Lm83/y;

    .line 4
    iput-object p1, p0, Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;->items:Ljava/util/List;

    return-void

    :cond_4
    iput-object p6, p0, Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;->items:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lcom/whoop/analytics/AnalyticEventModel;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            "Ljava/lang/String;",
            "Lcom/whoop/analytics/AnalyticEventModel;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;)V"
        }
    .end annotation

    const-string v0, "items"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;->searchPlaceHolderText:Ljava/lang/String;

    .line 7
    iput-object p2, p0, Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;->searchDebounceMs:Ljava/lang/Long;

    .line 8
    iput-object p3, p0, Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;->loadingHintText:Ljava/lang/String;

    .line 9
    iput-object p4, p0, Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    .line 10
    iput-object p5, p0, Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;->items:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lcom/whoop/analytics/AnalyticEventModel;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p6, 0x1

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    move-object p3, v0

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    move-object p4, v0

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    .line 11
    sget-object p5, Lm83/y;->w:Lm83/y;

    :cond_4
    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    .line 12
    invoke-direct/range {p1 .. p6}, Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;-><init>(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lcom/whoop/analytics/AnalyticEventModel;Ljava/util/List;)V

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

    invoke-static {}, Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lcom/whoop/analytics/AnalyticEventModel;Ljava/util/List;ILjava/lang/Object;)Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;->searchPlaceHolderText:Ljava/lang/String;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;->searchDebounceMs:Ljava/lang/Long;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;->loadingHintText:Ljava/lang/String;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;->items:Ljava/util/List;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;->copy(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lcom/whoop/analytics/AnalyticEventModel;Ljava/util/List;)Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$search_arch_mini_release(Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;->searchPlaceHolderText:Ljava/lang/String;

    if-eqz v2, :cond_1

    :goto_0
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;->searchPlaceHolderText:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v1, 0x1

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;->searchDebounceMs:Ljava/lang/Long;

    if-eqz v2, :cond_3

    :goto_1
    sget-object v2, Lkotlinx/serialization/internal/LongSerializer;->INSTANCE:Lkotlinx/serialization/internal/LongSerializer;

    iget-object v3, p0, Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;->searchDebounceMs:Ljava/lang/Long;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v1, 0x2

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;->loadingHintText:Ljava/lang/String;

    if-eqz v2, :cond_5

    :goto_2
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;->loadingHintText:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v1, 0x3

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    iget-object v2, p0, Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    if-eqz v2, :cond_7

    :goto_3
    sget-object v2, Lcom/whoop/analytics/AnalyticEventModel$$serializer;->INSTANCE:Lcom/whoop/analytics/AnalyticEventModel$$serializer;

    iget-object v3, p0, Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/4 v1, 0x4

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_8

    goto :goto_4

    :cond_8
    iget-object v2, p0, Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;->items:Ljava/util/List;

    sget-object v3, Lm83/y;->w:Lm83/y;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_9

    :goto_4
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;->items:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;->searchPlaceHolderText:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;->searchDebounceMs:Ljava/lang/Long;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;->loadingHintText:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Lcom/whoop/analytics/AnalyticEventModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    return-object v0
.end method

.method public final component5()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;->items:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lcom/whoop/analytics/AnalyticEventModel;Ljava/util/List;)Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            "Ljava/lang/String;",
            "Lcom/whoop/analytics/AnalyticEventModel;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;)",
            "Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;"
        }
    .end annotation

    const-string v0, "items"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;-><init>(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lcom/whoop/analytics/AnalyticEventModel;Ljava/util/List;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;

    iget-object v1, p0, Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;->searchPlaceHolderText:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;->searchPlaceHolderText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;->searchDebounceMs:Ljava/lang/Long;

    iget-object v3, p1, Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;->searchDebounceMs:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;->loadingHintText:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;->loadingHintText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    iget-object v3, p1, Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;->items:Ljava/util/List;

    iget-object p1, p1, Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;->items:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getAnalyticEvent()Lcom/whoop/analytics/AnalyticEventModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    return-object v0
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

    iget-object v0, p0, Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;->items:Ljava/util/List;

    return-object v0
.end method

.method public final getLoadingHintText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;->loadingHintText:Ljava/lang/String;

    return-object v0
.end method

.method public final getSearchDebounceMs()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;->searchDebounceMs:Ljava/lang/Long;

    return-object v0
.end method

.method public final getSearchPlaceHolderText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;->searchPlaceHolderText:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;->searchPlaceHolderText:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;->searchDebounceMs:Ljava/lang/Long;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;->loadingHintText:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    if-nez v2, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Lcom/whoop/analytics/AnalyticEventModel;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;->items:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;->searchPlaceHolderText:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;->searchDebounceMs:Ljava/lang/Long;

    iget-object v2, p0, Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;->loadingHintText:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    iget-object v4, p0, Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;->items:Ljava/util/List;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "SearchArchMiniResponse(searchPlaceHolderText="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", searchDebounceMs="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", loadingHintText="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", analyticEvent="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", items="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v5, v4, v0}, Lc13/a;->m(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
