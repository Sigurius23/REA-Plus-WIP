.class public final Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/contentsearch/domain/models/ContentSearchScreen$$serializer;,
        Lcom/whoop/contentsearch/domain/models/ContentSearchScreen$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0010\u000b\n\u0002\u0008\u0017\u0008\u0087\u0008\u0018\u0000 D2\u00020\u0001:\u0002EDBC\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fBc\u0008\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u0002\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0004\u0008\u000e\u0010\u0014J\'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0016\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0010\u0010\"\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010$\u001a\u00020\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010%J\u0010\u0010&\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\'J\u0016\u0010(\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010\u001fJX\u0010)\u001a\u00020\u00002\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00032\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\u000e\u0008\u0002\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008)\u0010*J\u0010\u0010+\u001a\u00020\u0003H\u00d6\u0001\u00a2\u0006\u0004\u0008+\u0010#J\u0010\u0010,\u001a\u00020\u0010H\u00d6\u0001\u00a2\u0006\u0004\u0008,\u0010-J\u001a\u00100\u001a\u00020/2\u0008\u0010.\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u00080\u00101R&\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0004\u00102\u0012\u0004\u00084\u00105\u001a\u0004\u00083\u0010\u001fR \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0006\u00106\u0012\u0004\u00088\u00105\u001a\u0004\u00087\u0010!R \u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0007\u00109\u0012\u0004\u0008;\u00105\u001a\u0004\u0008:\u0010#R \u0010\t\u001a\u00020\u00088\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\t\u0010<\u0012\u0004\u0008>\u00105\u001a\u0004\u0008=\u0010%R \u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000b\u0010?\u0012\u0004\u0008A\u00105\u001a\u0004\u0008@\u0010\'R&\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\r\u00102\u0012\u0004\u0008C\u00105\u001a\u0004\u0008B\u0010\u001f\u00a8\u0006F"
    }
    d2 = {
        "Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;",
        "",
        "",
        "",
        "filterTypes",
        "Lcom/whoop/contentsearch/domain/models/NavBar;",
        "navBar",
        "searchTextPlaceholder",
        "Lcom/whoop/contentsearch/domain/models/SearchLanding;",
        "searchLanding",
        "Lcom/whoop/contentsearch/domain/models/PaginationDetails;",
        "paginationDetails",
        "Lcom/whoop/design/models/items/ListItemTileModel;",
        "tiles",
        "<init>",
        "(Ljava/util/List;Lcom/whoop/contentsearch/domain/models/NavBar;Ljava/lang/String;Lcom/whoop/contentsearch/domain/models/SearchLanding;Lcom/whoop/contentsearch/domain/models/PaginationDetails;Ljava/util/List;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/util/List;Lcom/whoop/contentsearch/domain/models/NavBar;Ljava/lang/String;Lcom/whoop/contentsearch/domain/models/SearchLanding;Lcom/whoop/contentsearch/domain/models/PaginationDetails;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$content_search_release",
        "(Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/util/List;",
        "component2",
        "()Lcom/whoop/contentsearch/domain/models/NavBar;",
        "component3",
        "()Ljava/lang/String;",
        "component4",
        "()Lcom/whoop/contentsearch/domain/models/SearchLanding;",
        "component5",
        "()Lcom/whoop/contentsearch/domain/models/PaginationDetails;",
        "component6",
        "copy",
        "(Ljava/util/List;Lcom/whoop/contentsearch/domain/models/NavBar;Ljava/lang/String;Lcom/whoop/contentsearch/domain/models/SearchLanding;Lcom/whoop/contentsearch/domain/models/PaginationDetails;Ljava/util/List;)Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/util/List;",
        "getFilterTypes",
        "getFilterTypes$annotations",
        "()V",
        "Lcom/whoop/contentsearch/domain/models/NavBar;",
        "getNavBar",
        "getNavBar$annotations",
        "Ljava/lang/String;",
        "getSearchTextPlaceholder",
        "getSearchTextPlaceholder$annotations",
        "Lcom/whoop/contentsearch/domain/models/SearchLanding;",
        "getSearchLanding",
        "getSearchLanding$annotations",
        "Lcom/whoop/contentsearch/domain/models/PaginationDetails;",
        "getPaginationDetails",
        "getPaginationDetails$annotations",
        "getTiles",
        "getTiles$annotations",
        "Companion",
        "$serializer",
        "content-search_release"
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

.field public static final Companion:Lcom/whoop/contentsearch/domain/models/ContentSearchScreen$Companion;


# instance fields
.field private final filterTypes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final navBar:Lcom/whoop/contentsearch/domain/models/NavBar;

.field private final paginationDetails:Lcom/whoop/contentsearch/domain/models/PaginationDetails;

.field private final searchLanding:Lcom/whoop/contentsearch/domain/models/SearchLanding;

.field private final searchTextPlaceholder:Ljava/lang/String;

.field private final tiles:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/ListItemTileModel;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lcom/whoop/contentsearch/domain/models/ContentSearchScreen$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/contentsearch/domain/models/ContentSearchScreen$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;->Companion:Lcom/whoop/contentsearch/domain/models/ContentSearchScreen$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lou1/a;

    const/4 v3, 0x3

    invoke-direct {v2, v3}, Lou1/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-instance v4, Lou1/a;

    const/4 v5, 0x4

    invoke-direct {v4, v5}, Lou1/a;-><init>(I)V

    invoke-static {v0, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v4, 0x6

    new-array v4, v4, [Ll83/h;

    const/4 v6, 0x0

    aput-object v2, v4, v6

    const/4 v2, 0x1

    aput-object v1, v4, v2

    const/4 v2, 0x2

    aput-object v1, v4, v2

    aput-object v1, v4, v3

    aput-object v1, v4, v5

    const/4 v1, 0x5

    aput-object v0, v4, v1

    sput-object v4, Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/util/List;Lcom/whoop/contentsearch/domain/models/NavBar;Ljava/lang/String;Lcom/whoop/contentsearch/domain/models/SearchLanding;Lcom/whoop/contentsearch/domain/models/PaginationDetails;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p8, p1, 0x3f

    const/16 v0, 0x3f

    if-eq v0, p8, :cond_0

    .line 1
    sget-object p8, Lcom/whoop/contentsearch/domain/models/ContentSearchScreen$$serializer;->INSTANCE:Lcom/whoop/contentsearch/domain/models/ContentSearchScreen$$serializer;

    invoke-virtual {p8}, Lcom/whoop/contentsearch/domain/models/ContentSearchScreen$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p8

    invoke-static {p1, v0, p8}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;->filterTypes:Ljava/util/List;

    iput-object p3, p0, Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;->navBar:Lcom/whoop/contentsearch/domain/models/NavBar;

    iput-object p4, p0, Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;->searchTextPlaceholder:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;->searchLanding:Lcom/whoop/contentsearch/domain/models/SearchLanding;

    iput-object p6, p0, Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;->paginationDetails:Lcom/whoop/contentsearch/domain/models/PaginationDetails;

    iput-object p7, p0, Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;->tiles:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Lcom/whoop/contentsearch/domain/models/NavBar;Ljava/lang/String;Lcom/whoop/contentsearch/domain/models/SearchLanding;Lcom/whoop/contentsearch/domain/models/PaginationDetails;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/whoop/contentsearch/domain/models/NavBar;",
            "Ljava/lang/String;",
            "Lcom/whoop/contentsearch/domain/models/SearchLanding;",
            "Lcom/whoop/contentsearch/domain/models/PaginationDetails;",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/ListItemTileModel;",
            ">;)V"
        }
    .end annotation

    const-string v0, "filterTypes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navBar"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "searchTextPlaceholder"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "searchLanding"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paginationDetails"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tiles"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;->filterTypes:Ljava/util/List;

    .line 4
    iput-object p2, p0, Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;->navBar:Lcom/whoop/contentsearch/domain/models/NavBar;

    .line 5
    iput-object p3, p0, Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;->searchTextPlaceholder:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;->searchLanding:Lcom/whoop/contentsearch/domain/models/SearchLanding;

    .line 7
    iput-object p5, p0, Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;->paginationDetails:Lcom/whoop/contentsearch/domain/models/PaginationDetails;

    .line 8
    iput-object p6, p0, Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;->tiles:Ljava/util/List;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/design/models/items/ListItemTileModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/ListItemTileModel$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;Ljava/util/List;Lcom/whoop/contentsearch/domain/models/NavBar;Ljava/lang/String;Lcom/whoop/contentsearch/domain/models/SearchLanding;Lcom/whoop/contentsearch/domain/models/PaginationDetails;Ljava/util/List;ILjava/lang/Object;)Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;->filterTypes:Ljava/util/List;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;->navBar:Lcom/whoop/contentsearch/domain/models/NavBar;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-object p3, p0, Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;->searchTextPlaceholder:Ljava/lang/String;

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-object p4, p0, Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;->searchLanding:Lcom/whoop/contentsearch/domain/models/SearchLanding;

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget-object p5, p0, Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;->paginationDetails:Lcom/whoop/contentsearch/domain/models/PaginationDetails;

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget-object p6, p0, Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;->tiles:Ljava/util/List;

    :cond_5
    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;->copy(Ljava/util/List;Lcom/whoop/contentsearch/domain/models/NavBar;Ljava/lang/String;Lcom/whoop/contentsearch/domain/models/SearchLanding;Lcom/whoop/contentsearch/domain/models/PaginationDetails;Ljava/util/List;)Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getFilterTypes$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "filter_types"
    .end annotation

    return-void
.end method

.method public static synthetic getNavBar$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "nav_bar"
    .end annotation

    return-void
.end method

.method public static synthetic getPaginationDetails$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "pagination_details"
    .end annotation

    return-void
.end method

.method public static synthetic getSearchLanding$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "search_landing"
    .end annotation

    return-void
.end method

.method public static synthetic getSearchTextPlaceholder$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "search_text_placeholder"
    .end annotation

    return-void
.end method

.method public static synthetic getTiles$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "tiles"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$content_search_release(Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;->filterTypes:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/contentsearch/domain/models/NavBar$$serializer;->INSTANCE:Lcom/whoop/contentsearch/domain/models/NavBar$$serializer;

    iget-object v2, p0, Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;->navBar:Lcom/whoop/contentsearch/domain/models/NavBar;

    const/4 v3, 0x1

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;->searchTextPlaceholder:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v1, Lcom/whoop/contentsearch/domain/models/SearchLanding$$serializer;->INSTANCE:Lcom/whoop/contentsearch/domain/models/SearchLanding$$serializer;

    iget-object v2, p0, Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;->searchLanding:Lcom/whoop/contentsearch/domain/models/SearchLanding;

    const/4 v3, 0x3

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/contentsearch/domain/models/PaginationDetails$$serializer;->INSTANCE:Lcom/whoop/contentsearch/domain/models/PaginationDetails$$serializer;

    iget-object v2, p0, Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;->paginationDetails:Lcom/whoop/contentsearch/domain/models/PaginationDetails;

    const/4 v3, 0x4

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x5

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;->tiles:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;->filterTypes:Ljava/util/List;

    return-object v0
.end method

.method public final component2()Lcom/whoop/contentsearch/domain/models/NavBar;
    .locals 1

    iget-object v0, p0, Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;->navBar:Lcom/whoop/contentsearch/domain/models/NavBar;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;->searchTextPlaceholder:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Lcom/whoop/contentsearch/domain/models/SearchLanding;
    .locals 1

    iget-object v0, p0, Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;->searchLanding:Lcom/whoop/contentsearch/domain/models/SearchLanding;

    return-object v0
.end method

.method public final component5()Lcom/whoop/contentsearch/domain/models/PaginationDetails;
    .locals 1

    iget-object v0, p0, Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;->paginationDetails:Lcom/whoop/contentsearch/domain/models/PaginationDetails;

    return-object v0
.end method

.method public final component6()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/ListItemTileModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;->tiles:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Ljava/util/List;Lcom/whoop/contentsearch/domain/models/NavBar;Ljava/lang/String;Lcom/whoop/contentsearch/domain/models/SearchLanding;Lcom/whoop/contentsearch/domain/models/PaginationDetails;Ljava/util/List;)Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/whoop/contentsearch/domain/models/NavBar;",
            "Ljava/lang/String;",
            "Lcom/whoop/contentsearch/domain/models/SearchLanding;",
            "Lcom/whoop/contentsearch/domain/models/PaginationDetails;",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/ListItemTileModel;",
            ">;)",
            "Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;"
        }
    .end annotation

    const-string v0, "filterTypes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navBar"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "searchTextPlaceholder"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "searchLanding"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paginationDetails"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tiles"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;-><init>(Ljava/util/List;Lcom/whoop/contentsearch/domain/models/NavBar;Ljava/lang/String;Lcom/whoop/contentsearch/domain/models/SearchLanding;Lcom/whoop/contentsearch/domain/models/PaginationDetails;Ljava/util/List;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;

    iget-object v1, p0, Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;->filterTypes:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;->filterTypes:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;->navBar:Lcom/whoop/contentsearch/domain/models/NavBar;

    iget-object v3, p1, Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;->navBar:Lcom/whoop/contentsearch/domain/models/NavBar;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;->searchTextPlaceholder:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;->searchTextPlaceholder:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;->searchLanding:Lcom/whoop/contentsearch/domain/models/SearchLanding;

    iget-object v3, p1, Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;->searchLanding:Lcom/whoop/contentsearch/domain/models/SearchLanding;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;->paginationDetails:Lcom/whoop/contentsearch/domain/models/PaginationDetails;

    iget-object v3, p1, Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;->paginationDetails:Lcom/whoop/contentsearch/domain/models/PaginationDetails;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;->tiles:Ljava/util/List;

    iget-object p1, p1, Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;->tiles:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getFilterTypes()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;->filterTypes:Ljava/util/List;

    return-object v0
.end method

.method public final getNavBar()Lcom/whoop/contentsearch/domain/models/NavBar;
    .locals 1

    iget-object v0, p0, Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;->navBar:Lcom/whoop/contentsearch/domain/models/NavBar;

    return-object v0
.end method

.method public final getPaginationDetails()Lcom/whoop/contentsearch/domain/models/PaginationDetails;
    .locals 1

    iget-object v0, p0, Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;->paginationDetails:Lcom/whoop/contentsearch/domain/models/PaginationDetails;

    return-object v0
.end method

.method public final getSearchLanding()Lcom/whoop/contentsearch/domain/models/SearchLanding;
    .locals 1

    iget-object v0, p0, Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;->searchLanding:Lcom/whoop/contentsearch/domain/models/SearchLanding;

    return-object v0
.end method

.method public final getSearchTextPlaceholder()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;->searchTextPlaceholder:Ljava/lang/String;

    return-object v0
.end method

.method public final getTiles()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/ListItemTileModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;->tiles:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;->filterTypes:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;->navBar:Lcom/whoop/contentsearch/domain/models/NavBar;

    invoke-virtual {v2}, Lcom/whoop/contentsearch/domain/models/NavBar;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;->searchTextPlaceholder:Ljava/lang/String;

    invoke-static {v2, v1, v0}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;->searchLanding:Lcom/whoop/contentsearch/domain/models/SearchLanding;

    invoke-virtual {v2}, Lcom/whoop/contentsearch/domain/models/SearchLanding;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;->paginationDetails:Lcom/whoop/contentsearch/domain/models/PaginationDetails;

    invoke-virtual {v0}, Lcom/whoop/contentsearch/domain/models/PaginationDetails;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;->tiles:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;->filterTypes:Ljava/util/List;

    iget-object v1, p0, Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;->navBar:Lcom/whoop/contentsearch/domain/models/NavBar;

    iget-object v2, p0, Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;->searchTextPlaceholder:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;->searchLanding:Lcom/whoop/contentsearch/domain/models/SearchLanding;

    iget-object v4, p0, Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;->paginationDetails:Lcom/whoop/contentsearch/domain/models/PaginationDetails;

    iget-object v5, p0, Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;->tiles:Ljava/util/List;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "ContentSearchScreen(filterTypes="

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", navBar="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", searchTextPlaceholder="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", searchLanding="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", paginationDetails="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", tiles="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
